package com.oubowu.stickyitemdecoration;

import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: loaded from: classes18.dex */
public class FullSpanUtil {

    public class a extends GridLayoutManager.SpanSizeLookup {
        public final /* synthetic */ RecyclerView.Adapter a;
        public final /* synthetic */ int b;
        public final /* synthetic */ GridLayoutManager c;
        public final /* synthetic */ GridLayoutManager.SpanSizeLookup d;

        public a(RecyclerView.Adapter adapter, int i, GridLayoutManager gridLayoutManager, GridLayoutManager.SpanSizeLookup spanSizeLookup) {
            this.a = adapter;
            this.b = i;
            this.c = gridLayoutManager;
            this.d = spanSizeLookup;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i) {
            if (this.a.getItemViewType(i) == this.b) {
                return this.c.getSpanCount();
            }
            GridLayoutManager.SpanSizeLookup spanSizeLookup = this.d;
            if (spanSizeLookup != null) {
                return spanSizeLookup.getSpanSize(i);
            }
            return 1;
        }
    }

    public static void onAttachedToRecyclerView(RecyclerView recyclerView, RecyclerView.Adapter adapter, int i) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new a(adapter, i, gridLayoutManager, gridLayoutManager.getSpanSizeLookup()));
        }
    }

    public static void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder, RecyclerView.Adapter adapter, int i) {
        ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(adapter.getItemViewType(viewHolder.getLayoutPosition()) == i);
        }
    }
}
