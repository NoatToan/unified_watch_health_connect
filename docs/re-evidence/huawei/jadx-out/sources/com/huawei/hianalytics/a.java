package com.huawei.hianalytics;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f11447a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Looper looper) {
        super(looper);
        this.f11447a = bVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 1) {
            this.f11447a.getClass();
            for (a0 a0Var : b.e.values()) {
                if (a0Var != null) {
                    a0Var.onReport(0);
                    a0Var.onReport(1);
                }
            }
        }
    }
}
