package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.collect.model.event.network.HttpEvent;
import java.io.IOException;
import java.lang.reflect.Method;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.StreamAllocation;

/* JADX INFO: loaded from: classes22.dex */
public final class xwv implements Call {
    public b abc;
    public Request bcd;
    public Call cde;

    public xwv(Request request, Call call, b bVar) {
        this.bcd = request;
        this.cde = call;
        this.abc = bVar;
    }

    @Override // okhttp3.Call
    public final void cancel() {
        this.cde.cancel();
    }

    public final Object clone() throws CloneNotSupportedException {
        return this.cde.clone();
    }

    @Override // okhttp3.Call
    public final void enqueue(Callback callback) {
        if (this.abc == null) {
            this.abc = new b();
        }
        u.abc(this.abc, this.bcd);
        this.abc.cde(System.currentTimeMillis());
        this.cde.enqueue(new vut(callback, this.abc));
    }

    @Override // okhttp3.Call
    public final Response execute() throws IOException {
        if (this.abc == null) {
            this.abc = new b();
        }
        u.abc(this.abc, this.bcd);
        this.abc.cde(System.currentTimeMillis());
        try {
            Response responseExecute = this.cde.execute();
            if (this.abc == null) {
                this.abc = new b();
            }
            u.abc(this.abc, this.bcd);
            if (!this.abc.b()) {
                if (this.abc == null) {
                    this.abc = new b();
                }
                u.abc(this.abc, this.bcd);
                u.abc(this.abc, responseExecute);
            }
            return responseExecute.newBuilder().body(new d0(responseExecute.body(), this.abc)).build();
        } catch (IOException e) {
            if (this.abc == null) {
                this.abc = new b();
            }
            u.abc(this.abc, this.bcd);
            b bVar = this.abc;
            c.abc(bVar, e);
            if (!bVar.b() && !bVar.fed()) {
                bVar.k();
                a aVarN = bVar.n();
                if (aVarN != null) {
                    bVar.l();
                    pon.cde.add(new HttpEvent(aVarN, v0.abc()));
                }
            }
            throw e;
        }
    }

    @Override // okhttp3.Call
    /* JADX INFO: renamed from: isCanceled */
    public final boolean getCanceled() {
        return this.cde.getCanceled();
    }

    @Override // okhttp3.Call
    public final boolean isExecuted() {
        return this.cde.isExecuted();
    }

    @Override // okhttp3.Call
    public final Request request() {
        return this.cde.request();
    }

    public StreamAllocation streamAllocation() throws Throwable {
        Method declaredMethod = this.cde.getClass().getDeclaredMethod("streamAllocation", new Class[0]);
        if (!declaredMethod.isAccessible()) {
            declaredMethod.setAccessible(true);
        }
        return (StreamAllocation) declaredMethod.invoke(this.cde, new Object[0]);
    }

    @Override // okhttp3.Call
    public final Call clone() {
        return this.cde.clone();
    }
}
