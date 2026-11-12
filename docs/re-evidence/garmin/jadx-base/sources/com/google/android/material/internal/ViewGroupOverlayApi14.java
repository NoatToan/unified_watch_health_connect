package com.google.android.material.internal;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes14.dex */
class ViewGroupOverlayApi14 extends ViewOverlayApi14 implements ViewGroupOverlayImpl {
    public ViewGroupOverlayApi14(Context context, ViewGroup viewGroup, View view2) {
        super(context, viewGroup, view2);
    }

    public static ViewGroupOverlayApi14 createFrom(ViewGroup viewGroup) {
        return (ViewGroupOverlayApi14) ViewOverlayApi14.createFrom(viewGroup);
    }

    @Override // com.google.android.material.internal.ViewGroupOverlayImpl
    public void add(View view2) {
        this.overlayViewGroup.add(view2);
    }

    @Override // com.google.android.material.internal.ViewGroupOverlayImpl
    public void remove(View view2) {
        this.overlayViewGroup.remove(view2);
    }
}
