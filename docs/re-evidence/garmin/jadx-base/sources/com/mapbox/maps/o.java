package com.mapbox.maps;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o implements StyleDataLoadedCallback, StyleLoadedCallback, StyleImageMissingCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeakReference f54522a;

    public /* synthetic */ o(WeakReference weakReference) {
        this.f54522a = weakReference;
    }

    @Override // com.mapbox.maps.StyleDataLoadedCallback
    public void run(StyleDataLoaded styleDataLoaded) {
        Snapshotter._init_$lambda$5(this.f54522a, styleDataLoaded);
    }

    @Override // com.mapbox.maps.StyleImageMissingCallback
    public void run(StyleImageMissing styleImageMissing) {
        Snapshotter._init_$lambda$11(this.f54522a, styleImageMissing);
    }

    @Override // com.mapbox.maps.StyleLoadedCallback
    public void run(StyleLoaded styleLoaded) {
        Snapshotter._init_$lambda$9(this.f54522a, styleLoaded);
    }
}
