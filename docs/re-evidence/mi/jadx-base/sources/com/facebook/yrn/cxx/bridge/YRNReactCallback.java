package com.facebook.yrn.cxx.bridge;

import defpackage.v07;

/* JADX INFO: loaded from: classes4.dex */
@v07
interface YRNReactCallback {
    @v07
    void decrementPendingJSCalls();

    @v07
    void incrementPendingJSCalls();

    @v07
    void onBatchComplete();
}
