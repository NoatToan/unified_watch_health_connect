package com.facebook.react.bridge;

import defpackage.v07;

/* JADX INFO: loaded from: classes4.dex */
@v07
interface ReactCallback {
    @v07
    void decrementPendingJSCalls();

    @v07
    void incrementPendingJSCalls();

    @v07
    void onBatchComplete();
}
