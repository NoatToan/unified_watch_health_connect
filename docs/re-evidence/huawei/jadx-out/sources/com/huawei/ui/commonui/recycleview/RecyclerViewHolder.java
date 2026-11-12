package com.huawei.ui.commonui.recycleview;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes16.dex */
public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    private final SparseArray<View> e;

    public RecyclerViewHolder(View view) {
        super(view);
        this.e = new SparseArray<>();
    }

    public <T extends View> T a(int i) {
        T t = (T) this.e.get(i);
        if (t != null) {
            return t;
        }
        T t2 = (T) this.itemView.findViewById(i);
        this.e.put(i, t2);
        return t2;
    }
}
