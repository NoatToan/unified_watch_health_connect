package com.huawei.health.h5pro.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.h5pro.core.R;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public class FloatingBarAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<FloatingBarItem> f7008b;

    public static class ItemViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TextView f7009a;
        private ImageView e;

        public ItemViewHolder(View view) {
            super(view);
            this.f7009a = (TextView) view.findViewById(R.id.share_tv);
            this.e = (ImageView) view.findViewById(R.id.share_img);
        }
    }

    public FloatingBarAdapter(List<FloatingBarItem> list) {
        this.f7008b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f7008b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ItemViewHolder itemViewHolder, int i) {
        FloatingBarItem floatingBarItem = this.f7008b.get(i);
        itemViewHolder.f7009a.setText(floatingBarItem.getDistName());
        itemViewHolder.e.setImageDrawable(floatingBarItem.getDistIcon());
        itemViewHolder.e.setOnClickListener(floatingBarItem.getClickCallback());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.share_dist_entry, viewGroup, false));
    }
}
