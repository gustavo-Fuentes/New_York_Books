package com.example.nyboooks.presentation.books

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nyboooks.R
import com.example.nyboooks.data.model.Book
import kotlinx.android.synthetic.main.book_item.view.*

class BooksAdapter(
        private val books:List<Book>,
        val onItemClickListener: ((book:Book) -> Unit)
        ): RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, view: Int): BooksViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.book_item, parent, false)
        return BooksViewHolder(itemView, onItemClickListener)
    }

    override fun getItemCount() = books.count()

    override fun onBindViewHolder(viewHolder: BooksViewHolder, position: Int) {
        viewHolder.bindView(books[position])
    }

    class BooksViewHolder(
        itemView: View,
        private val onItemClickListener: ((book:Book) -> Unit)
    ) : RecyclerView.ViewHolder(itemView){

        private val title = itemView.textTitle
        private val author = itemView.textAuthor

        fun bindView(book: Book){
            title.text = book.title
            author.text = book.author

            itemView.setOnClickListener{
                onItemClickListener.invoke(book)
            }
        }
    }
}