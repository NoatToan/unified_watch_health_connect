package com.google.android.material.search;

import android.view.View;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f53228b;

    public /* synthetic */ g(SearchView searchView, int i14) {
        this.f53227a = i14;
        this.f53228b = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        switch (this.f53227a) {
            case 0:
                this.f53228b.lambda$setUpBackButton$1(view2);
                break;
            case 1:
                this.f53228b.lambda$setUpClearButton$2(view2);
                break;
            default:
                this.f53228b.lambda$setupWithSearchBar$7(view2);
                break;
        }
    }
}
