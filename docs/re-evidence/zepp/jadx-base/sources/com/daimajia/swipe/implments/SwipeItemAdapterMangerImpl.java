package com.daimajia.swipe.implments;

import android.view.View;
import android.widget.BaseAdapter;
import com.daimajia.swipe.SwipeLayout;

/* JADX INFO: loaded from: classes2.dex */
public class SwipeItemAdapterMangerImpl extends SwipeItemMangerImpl {
    public BaseAdapter mAdapter;

    public SwipeItemAdapterMangerImpl(BaseAdapter baseAdapter) {
        super(baseAdapter);
        this.mAdapter = baseAdapter;
    }

    @Override // com.daimajia.swipe.implments.SwipeItemMangerImpl
    public void bindView(View view, int i) {
    }

    @Override // com.daimajia.swipe.implments.SwipeItemMangerImpl
    public void initialize(View view, int i) {
        int swipeLayoutId = getSwipeLayoutId(i);
        SwipeItemMangerImpl.a aVar = new SwipeItemMangerImpl.a(i);
        SwipeLayout swipeLayout = (SwipeLayout) view.findViewById(swipeLayoutId);
        if (swipeLayout == null) {
            throw new IllegalStateException("can not find SwipeLayout in target view");
        }
        SwipeItemMangerImpl.b bVar = new SwipeItemMangerImpl.b(i);
        swipeLayout.addSwipeListener(bVar);
        swipeLayout.addOnLayoutListener(aVar);
        swipeLayout.setTag(swipeLayoutId, new SwipeItemMangerImpl.c(i, bVar, aVar));
        this.mShownLayouts.add(swipeLayout);
    }

    @Override // com.daimajia.swipe.implments.SwipeItemMangerImpl
    public void updateConvertView(View view, int i) {
        int swipeLayoutId = getSwipeLayoutId(i);
        SwipeLayout swipeLayout = (SwipeLayout) view.findViewById(swipeLayoutId);
        if (swipeLayout == null) {
            throw new IllegalStateException("can not find SwipeLayout in target view");
        }
        SwipeItemMangerImpl.c cVar = (SwipeItemMangerImpl.c) swipeLayout.getTag(swipeLayoutId);
        cVar.b.a(i);
        cVar.a.a(i);
        cVar.c = i;
    }
}
