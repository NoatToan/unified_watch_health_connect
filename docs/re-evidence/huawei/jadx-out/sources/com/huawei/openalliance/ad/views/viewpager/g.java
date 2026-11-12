package com.huawei.openalliance.ad.views.viewpager;

import android.database.DataSetObserver;

/* JADX INFO: loaded from: classes12.dex */
class g extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f21382a;

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        this.f21382a.a();
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        this.f21382a.a();
    }

    g(e eVar) {
        this.f21382a = eVar;
    }
}
