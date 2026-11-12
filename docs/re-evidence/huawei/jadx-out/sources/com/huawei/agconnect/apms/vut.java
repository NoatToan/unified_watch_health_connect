package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.collect.model.event.network.HttpEvent;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* JADX INFO: loaded from: classes22.dex */
public final class vut implements Callback {
    public b abc;
    public Callback bcd;

    public vut(Callback callback, b bVar) {
        this.abc = bVar;
        this.bcd = callback;
    }

    public final void abc(Exception exc) {
        b bVar = this.abc;
        c.abc(bVar, exc);
        if (bVar.b() || bVar.fed()) {
            return;
        }
        bVar.k();
        a aVarN = bVar.n();
        if (aVarN != null) {
            HttpEvent httpEvent = new HttpEvent(aVarN, v0.abc());
            bVar.l();
            pon.cde.add(httpEvent);
        }
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        try {
            abc(iOException);
        } catch (Throwable th) {
            this.abc.klm(v0.abc());
            abc(new Exception(th));
        }
        this.bcd.onFailure(call, iOException);
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) throws IOException {
        try {
            if (!this.abc.b()) {
                response = u.abc(this.abc, response);
            }
        } catch (Throwable th) {
            this.abc.klm(v0.abc());
            abc(new Exception(th));
        }
        this.bcd.onResponse(call, response.newBuilder().body(new d0(response.body(), this.abc)).build());
    }
}
