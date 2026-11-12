package com.google.android.exoplayer2.ui;

import android.view.View;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f53106b;

    public /* synthetic */ b(View view2, int i14) {
        this.f53105a = i14;
        this.f53106b = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53105a) {
            case 0:
                ((DefaultTimeBar) this.f53106b).lambda$new$0();
                break;
            default:
                ((StyledPlayerControlView) this.f53106b).updateProgress();
                break;
        }
    }
}
