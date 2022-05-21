package com.example.custom_list

import android.app.Activity
import android.content.Context
import android.icu.text.LocaleDisplayNames
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
//
//class CListAdapter(private val getContext: Context, private val customListItem: ArrayList<CList>) : ArrayAdapter<CList>(getContext, 0, customListItem) {
//    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//        var listLayout = convertView
//        val holder: RecyclerView.ViewHolder
//
//        if (listLayout == null) {
//            val inflateList = (getContext as Activity).layoutInflater
//            listLayout = inflateList!!.inflate(R.layout.custom_list, parent, false)
//            holder = ViewHolder()
//
//            holder.mTextViewOne = listLayout!!.findViewById(R.id.text1) as TextView
//
//            holder.mTextViewTwo = listLayout!!.findViewById(R.id.text2)
//
//            holder.mImageListView = listLayout!!.findViewById(R.id.image)
//
//            holder.mTextViewOne
//            listLayout.setTag(holder)
//        } else {
//            holder = listLayout.getTag() as RecyclerView.ViewHolder
//        }
//        val listItem = customListItem[position]
//        val mTextViewOne = null
////        holder.mTextViewOne!!.setText(listItem.mCListTextOne)
////
////        holder.mTextViewTwo!!.setText(listItem.mCListTextTwo)
////
////        holder.mImageListView!!.setImageResource(listItem.mCListImage)
//
//        return listLayout
//
//    }
//
//    class ViewHolder {
//        internal var mTextViewOne: TextView? = null
//        internal var mTextViewTwo: TextView? = null
//        internal var mImageListView: ImageView? = null
//    }
//}



import android.annotation.SuppressLint
import android.view.LayoutInflater

class CListAdapter(var CListList: List<CList>): RecyclerView.Adapter<CListAdapter.CListViewHolder>(){
    private var selectedItemPosition: Int = 0
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CListViewHolder {
        return CListViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.custom_list,parent,false))
    }

    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: CListViewHolder, @SuppressLint("RecyclerView") position: Int) {
        holder.bind(CListList[position])
        val  data = CListList[position]
        holder.CListList = data
    }

    override fun getItemCount(): Int {
        return CListList.size
    }

    class CListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        lateinit var CListList: CList
//        private var sessionManager: SessionManager? = null
        fun bind(CList: CList){
            val txt1 = itemView.findViewById<TextView>(R.id.text1)
            val txt2 = itemView.findViewById<TextView>(R.id.text2)
//            val txt3 = itemView.findViewById<TextView>(R.id.te)

            txt1.text = CList.mCListTextOne
            txt2.text = CList.mCListTextTwo
        }
    }
}