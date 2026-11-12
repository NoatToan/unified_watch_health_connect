package com.google.android.material.search;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f53230b;

    public /* synthetic */ h(SearchView searchView, int i14) {
        this.f53229a = i14;
        this.f53230b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53229a) {
            case 0:
                this.f53230b.lambda$clearFocusAndHideKeyboard$9();
                break;
            case 1:
                this.f53230b.lambda$requestFocusAndShowKeyboard$8();
                break;
            case 2:
                this.f53230b.show();
                break;
            default:
                this.f53230b.requestFocusAndShowKeyboardIfNeeded();
                break;
        }
    }
}
