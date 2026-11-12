package com.xiaomi.hm.health.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes19.dex */
public abstract class HeaderAdapter<T> extends BaseRecyclerAdapter<T> {
    private static final int e = 0;
    private static final int f = 1;
    private static final int g = 2;
    private View c;
    private FrameLayout d;

    public HeaderAdapter(int i) {
        super(i);
    }

    private void a(View view) {
        boolean z;
        if (this.d == null) {
            this.d = new FrameLayout(view.getContext());
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams.width = layoutParams2.width;
                layoutParams.height = layoutParams2.height;
            }
            this.d.setLayoutParams(layoutParams);
            z = true;
        } else {
            z = false;
        }
        this.d.removeAllViews();
        this.d.addView(view);
        if (z) {
            notifyItemInserted(this.c == null ? 0 : 1);
        }
    }

    private boolean b() {
        return this.d != null;
    }

    private boolean c() {
        return this.a.size() == 0;
    }

    public View getHeaderView() {
        return this.c;
    }

    @Override // com.xiaomi.hm.health.adapter.BaseRecyclerAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (b() && c()) {
            return this.c == null ? this.a.size() + 1 : this.a.size() + 2;
        }
        return this.c == null ? this.a.size() : this.a.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (!b()) {
            return (this.c != null && i == 0) ? 0 : 1;
        }
        if (!(this.c != null)) {
            return 1;
        }
        if (c()) {
            return i != 0 ? 2 : 0;
        }
        return i != 0 ? 1 : 0;
    }

    public int getRealPosition(RecyclerView.ViewHolder viewHolder) {
        int layoutPosition = viewHolder.getLayoutPosition();
        return this.c == null ? layoutPosition : layoutPosition - 1;
    }

    public void setEmptyView(View view) {
        a(view);
    }

    public void setHeaderView(View view) {
        this.c = view;
        notifyItemInserted(0);
    }

    @Override // com.xiaomi.hm.health.adapter.BaseRecyclerAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(MyViewHolder myViewHolder, int i) {
        if (getItemViewType(i) == 0 || getItemViewType(i) == 2) {
            return;
        }
        super.onBindViewHolder(myViewHolder, getRealPosition(myViewHolder));
    }

    @Override // com.xiaomi.hm.health.adapter.BaseRecyclerAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (this.c == null || i != 0) {
            return (b() && i == 2) ? new MyViewHolder(this.d) : super.onCreateViewHolder(viewGroup, i);
        }
        return new MyViewHolder(this.c);
    }

    public void setEmptyView(Context context, @LayoutRes int i) {
        a(View.inflate(context, i, null));
    }
}
