package com.google.android.exoplayer2.ui;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StyledPlayerControlViewLayoutManager f53119b;

    public /* synthetic */ i(StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager, int i14) {
        this.f53118a = i14;
        this.f53119b = styledPlayerControlViewLayoutManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53118a) {
            case 0:
                this.f53119b.showAllBars();
                break;
            case 1:
                this.f53119b.updateLayoutForSizeChange();
                break;
            case 2:
                this.f53119b.onLayoutWidthChanged();
                break;
            case 3:
                this.f53119b.hideAllBars();
                break;
            case 4:
                this.f53119b.hideProgressBar();
                break;
            case 5:
                this.f53119b.hideMainBar();
                break;
            default:
                this.f53119b.hideController();
                break;
        }
    }
}
