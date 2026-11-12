package com.daimajia.swipe.implments;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.daimajia.swipe.SwipeLayout;

/* JADX INFO: loaded from: classes2.dex */
public class SwipeItemRecyclerMangerImpl extends SwipeItemMangerImpl {
    public RecyclerView.Adapter mAdapter;

    public SwipeItemRecyclerMangerImpl(RecyclerView.Adapter adapter) {
        super(adapter);
        this.mAdapter = adapter;
    }

    @Override // com.daimajia.swipe.implments.SwipeItemMangerImpl
    public void bindView(View view, int i) {
        int swipeLayoutId = getSwipeLayoutId(i);
        SwipeItemMangerImpl.a aVar = new SwipeItemMangerImpl.a(i);
        SwipeLayout swipeLayout = (SwipeLayout) view.findViewById(swipeLayoutId);
        if (swipeLayout == null) {
            throw new IllegalStateException("can not find SwipeLayout in target view");
        }
        if (swipeLayout.getTag(swipeLayoutId) != null) {
            SwipeItemMangerImpl.c cVar = (SwipeItemMangerImpl.c) swipeLayout.getTag(swipeLayoutId);
            cVar.b.a(i);
            cVar.a.a(i);
            cVar.c = i;
            return;
        }
        SwipeItemMangerImpl.b bVar = new SwipeItemMangerImpl.b(i);
        swipeLayout.addSwipeListener(bVar);
        swipeLayout.addOnLayoutListener(aVar);
        swipeLayout.setTag(swipeLayoutId, new SwipeItemMangerImpl.c(i, bVar, aVar));
        this.mShownLayouts.add(swipeLayout);
    }

    @Override // com.daimajia.swipe.implments.SwipeItemMangerImpl
    public void initialize(View view, int i) {
    }

    @Override // com.daimajia.swipe.implments.SwipeItemMangerImpl
    public void updateConvertView(View view, int i) {
    }
}
