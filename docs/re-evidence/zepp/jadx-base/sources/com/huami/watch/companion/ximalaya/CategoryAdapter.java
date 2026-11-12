package com.huami.watch.companion.ximalaya;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.huami.watch.companion.R;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.util.Analytics;
import com.ximalaya.ting.android.opensdk.model.category.Category;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class CategoryAdapter extends RecyclerView.Adapter<b> {
    private Context a;
    private List<Category> b;
    private LayoutInflater c;

    public class a implements View.OnClickListener {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Analytics.event(CategoryAdapter.this.a, AnalyticsEvents.EVENT_CLICK_MAIN_CATEGORY, ((Category) CategoryAdapter.this.b.get(this.a)).getCategoryName());
            Log.d("CategoryAdapter", "" + this.a);
            Intent intent = new Intent(CategoryAdapter.this.a, (Class<?>) XimaCategoryDetailActivity.class);
            intent.putExtra("catory_id", ((Category) CategoryAdapter.this.b.get(this.a)).getId());
            intent.putExtra("catory_name", ((Category) CategoryAdapter.this.b.get(this.a)).getCategoryName());
            CategoryAdapter.this.a.startActivity(intent);
        }
    }

    public class b extends RecyclerView.ViewHolder {
        public TextView a;
        public ImageView b;

        public b(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.categories_recycleview_item_tx);
            this.b = (ImageView) view.findViewById(R.id.categories_recycleview_item_ig);
        }
    }

    public CategoryAdapter(Context context, List<Category> list) {
        this.a = context;
        this.b = list;
        this.c = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(b bVar, int i) {
        bVar.a.setText(this.b.get(i).getCategoryName());
        Glide.with(this.a).load(this.b.get(i).getCoverUrlSmall()).into(bVar.b);
        bVar.a.setOnClickListener(new a(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(this.c.inflate(R.layout.recyclerview_item_category, viewGroup, false));
    }
}
