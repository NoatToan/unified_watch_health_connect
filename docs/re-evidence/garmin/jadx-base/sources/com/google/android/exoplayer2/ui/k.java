package com.google.android.exoplayer2.ui;

import android.view.View;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class k implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53123b;

    public /* synthetic */ k(Object obj, int i14) {
        this.f53122a = i14;
        this.f53123b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view2, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
        switch (this.f53122a) {
            case 0:
                ((StyledPlayerControlViewLayoutManager) this.f53123b).onLayoutChange(view2, i14, i15, i16, i17, i18, i19, i24, i25);
                break;
            default:
                ((StyledPlayerControlView) this.f53123b).onLayoutChange(view2, i14, i15, i16, i17, i18, i19, i24, i25);
                break;
        }
    }
}
