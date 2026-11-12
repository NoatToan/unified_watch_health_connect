package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.collect.model.event.network.HttpEvent;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.internal.Internal;
import com.squareup.okhttp.internal.http.StreamAllocation;
import java.io.IOException;

/* JADX INFO: loaded from: classes22.dex */
public final class uts implements Callback {
    public b abc;
    public Callback bcd;

    public uts(Callback callback, b bVar) {
        this.bcd = callback;
        this.abc = bVar;
    }

    public final void abc() {
        if (t.abc() && this.abc.def() != null && (this.abc.def() instanceof Call)) {
            StreamAllocation streamAllocationCallEngineGetStreamAllocation = Internal.instance.callEngineGetStreamAllocation((Call) this.abc.def());
            if (streamAllocationCallEngineGetStreamAllocation.connection() == null || streamAllocationCallEngineGetStreamAllocation.connection().socket == null || streamAllocationCallEngineGetStreamAllocation.connection().socket.getInetAddress() == null) {
                return;
            }
            this.abc.fgh(streamAllocationCallEngineGetStreamAllocation.connection().socket.getInetAddress().getHostAddress());
        }
    }

    public final void onFailure(Request request, IOException iOException) {
        try {
            abc(iOException);
        } catch (Throwable th) {
            this.abc.klm(v0.abc());
            abc(new Exception(th));
        }
        this.bcd.onFailure(request, iOException);
    }

    public final void onResponse(Response response) throws IOException {
        try {
            abc();
            if (!this.abc.b()) {
                response = s.abc(this.abc, response);
            }
        } catch (Throwable th) {
            this.abc.klm(v0.abc());
            abc(new Exception(th));
        }
        this.bcd.onResponse(response.newBuilder().body(new e0(response.body(), this.abc)).build());
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
}
