package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.collect.model.event.network.HttpEvent;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.io.IOException;

/* JADX INFO: loaded from: classes22.dex */
public final class wvu extends Call {
    public b abc;
    public Request bcd;
    public Call cde;

    public wvu(OkHttpClient okHttpClient, Request request, b bVar) {
        super(okHttpClient, request);
        abc(okHttpClient, request, bVar);
        this.bcd = request;
        this.cde = okHttpClient.newCall(request);
        this.abc = bVar;
    }

    public static void abc(OkHttpClient okHttpClient, Request request, b bVar) {
        t tVar = new t();
        if (tVar.abc != 2 || tVar.bcd < 6) {
            s.abc(bVar, request);
        } else {
            p.abc(okHttpClient, bVar);
        }
    }

    public final void cancel() {
        this.cde.cancel();
    }

    public final void enqueue(Callback callback) {
        if (this.abc == null) {
            this.abc = new b();
        }
        s.bcd(this.abc, this.bcd);
        this.abc.abc(this.cde);
        this.cde.enqueue(new uts(callback, this.abc));
    }

    public final Response execute() throws IOException {
        if (this.abc == null) {
            this.abc = new b();
        }
        s.bcd(this.abc, this.bcd);
        this.abc.abc(this.cde);
        try {
            Response responseExecute = this.cde.execute();
            if (this.abc == null) {
                this.abc = new b();
            }
            s.bcd(this.abc, this.bcd);
            if (!this.abc.b()) {
                if (this.abc == null) {
                    this.abc = new b();
                }
                s.bcd(this.abc, this.bcd);
                s.abc(this.abc, responseExecute);
            }
            return responseExecute.newBuilder().body(new e0(responseExecute.body(), this.abc)).build();
        } catch (IOException e) {
            if (this.abc == null) {
                this.abc = new b();
            }
            s.bcd(this.abc, this.bcd);
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

    public final boolean isCanceled() {
        return this.cde.isCanceled();
    }

    public final boolean isExecuted() {
        boolean zIsExecuted;
        synchronized (this) {
            zIsExecuted = this.cde.isExecuted();
        }
        return zIsExecuted;
    }
}
