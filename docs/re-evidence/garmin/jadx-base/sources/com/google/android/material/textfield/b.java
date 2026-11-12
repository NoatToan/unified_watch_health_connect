package com.google.android.material.textfield;

import android.view.View;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class b implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EndIconDelegate f53254b;

    public /* synthetic */ b(EndIconDelegate endIconDelegate, int i14) {
        this.f53253a = i14;
        this.f53254b = endIconDelegate;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view2, boolean z14) {
        switch (this.f53253a) {
            case 0:
                ((ClearTextEndIconDelegate) this.f53254b).lambda$new$1(view2, z14);
                break;
            default:
                ((DropdownMenuEndIconDelegate) this.f53254b).lambda$new$1(view2, z14);
                break;
        }
    }
}
