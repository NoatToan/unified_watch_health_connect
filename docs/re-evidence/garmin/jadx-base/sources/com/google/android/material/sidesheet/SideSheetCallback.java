package com.google.android.material.sidesheet;

import android.view.View;

/* JADX INFO: loaded from: classes14.dex */
public abstract class SideSheetCallback implements SheetCallback {
    public void onLayout(View view2) {
    }

    @Override // com.google.android.material.sidesheet.SheetCallback
    public abstract void onSlide(View view2, float f14);

    @Override // com.google.android.material.sidesheet.SheetCallback
    public abstract void onStateChanged(View view2, int i14);
}
