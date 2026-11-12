package com.huawei.agconnect.apms;

import com.squareup.okhttp.Request;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements Runnable {
    public final /* synthetic */ Request abc;
    public final /* synthetic */ b bcd;

    public q(b bVar, Request request) {
        this.abc = request;
        this.bcd = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c.abc(this.abc.url().getHost(), this.bcd);
        this.bcd.m();
    }
}
