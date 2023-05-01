package khan.uz.fragment

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val context: Context) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    var imageColor = arrayOf(
        intArrayOf(android.R.color.holo_green_dark, R.drawable.ic_launcher_foreground),
        intArrayOf(android.R.color.holo_blue_bright, R.drawable.ic_launcher_foreground),
        intArrayOf(android.R.color.darker_gray, R.drawable.ic_launcher_foreground)
    )


    class MyViewHolder(item: View) : RecyclerView.ViewHolder(item) {

         var image: ImageView = itemView.findViewById<ImageView>(R.id.item_image)
         var container: ConstraintLayout = itemView.findViewById(R.id.container)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_page, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.image.setImageResource(imageColor[position][1])
        holder.container.setBackgroundResource(imageColor[position][0])

    }

    override fun getItemCount(): Int {
        return imageColor.size
    }
}