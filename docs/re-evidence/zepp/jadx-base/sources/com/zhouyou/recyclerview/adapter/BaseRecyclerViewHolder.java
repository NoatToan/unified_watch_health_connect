package com.zhouyou.recyclerview.adapter;

import android.util.SparseArray;
import android.view.View;

/* JADX INFO: loaded from: classes22.dex */
public class BaseRecyclerViewHolder extends BH {
    private SparseArray<View> a;
    private View b;
    private int c;

    public BaseRecyclerViewHolder(View view, int i) {
        super(view);
        this.a = new SparseArray<>();
        this.c = i;
        this.b = view;
        view.setTag(-1211707988, this);
    }

    public View getItemView() {
        return this.b;
    }

    public int getLayoutId() {
        return this.c;
    }

    public <R extends View> R getView(int i) {
        R r = (R) this.a.get(i);
        if (r != null) {
            return r;
        }
        R r2 = (R) this.b.findViewById(i);
        this.a.put(i, r2);
        return r2;
    }
}
