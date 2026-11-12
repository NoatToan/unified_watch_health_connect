package com.daimajia.swipe.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.daimajia.swipe.SwipeLayout;
import com.daimajia.swipe.implments.SwipeItemAdapterMangerImpl;
import com.daimajia.swipe.interfaces.SwipeAdapterInterface;
import com.daimajia.swipe.interfaces.SwipeItemMangerInterface;
import com.daimajia.swipe.util.Attributes;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ArraySwipeAdapter<T> extends ArrayAdapter implements SwipeItemMangerInterface, SwipeAdapterInterface {
    private SwipeItemAdapterMangerImpl a;

    public ArraySwipeAdapter(Context context, int i) {
        super(context, i);
        this.a = new SwipeItemAdapterMangerImpl(this);
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public void closeAllExcept(SwipeLayout swipeLayout) {
        this.a.closeAllExcept(swipeLayout);
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public void closeAllItems() {
        this.a.closeAllItems();
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public void closeItem(int i) {
        this.a.closeItem(i);
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public Attributes.Mode getMode() {
        return this.a.getMode();
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public List<Integer> getOpenItems() {
        return this.a.getOpenItems();
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public List<SwipeLayout> getOpenLayouts() {
        return this.a.getOpenLayouts();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = view == null;
        View view2 = super.getView(i, view, viewGroup);
        if (z) {
            this.a.initialize(view2, i);
        } else {
            this.a.updateConvertView(view2, i);
        }
        return view2;
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public boolean isOpen(int i) {
        return this.a.isOpen(i);
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public void openItem(int i) {
        this.a.openItem(i);
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public void removeShownLayouts(SwipeLayout swipeLayout) {
        this.a.removeShownLayouts(swipeLayout);
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public void setMode(Attributes.Mode mode) {
        this.a.setMode(mode);
    }

    public ArraySwipeAdapter(Context context, int i, int i2) {
        super(context, i, i2);
        this.a = new SwipeItemAdapterMangerImpl(this);
    }

    public ArraySwipeAdapter(Context context, int i, T[] tArr) {
        super(context, i, tArr);
        this.a = new SwipeItemAdapterMangerImpl(this);
    }

    public ArraySwipeAdapter(Context context, int i, int i2, T[] tArr) {
        super(context, i, i2, tArr);
        this.a = new SwipeItemAdapterMangerImpl(this);
    }

    public ArraySwipeAdapter(Context context, int i, List<T> list) {
        super(context, i, list);
        this.a = new SwipeItemAdapterMangerImpl(this);
    }

    public ArraySwipeAdapter(Context context, int i, int i2, List<T> list) {
        super(context, i, i2, list);
        this.a = new SwipeItemAdapterMangerImpl(this);
    }
}
