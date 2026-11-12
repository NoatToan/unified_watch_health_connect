package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes34.dex */
public final class f9 implements n7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14779a;

    @Override // com.huawei.hms.network.embedded.n7
    public v7 intercept(n7.a aVar) throws IOException {
        boolean z;
        v7.a aVarD;
        w7 w7VarA;
        k9 k9Var = (k9) aVar;
        v8 v8VarE = k9Var.e();
        t7 t7VarRequest = k9Var.request();
        long jCurrentTimeMillis = System.currentTimeMillis();
        v8VarE.a(t7VarRequest);
        v7.a aVarA = null;
        if (!j9.b(t7VarRequest.h()) || t7VarRequest.b() == null) {
            v8VarE.i();
            z = false;
        } else {
            if ("100-continue".equalsIgnoreCase(t7VarRequest.a("Expect"))) {
                v8VarE.e();
                v8VarE.j();
                aVarA = v8VarE.a(true);
                z = true;
            } else {
                z = false;
            }
            if (aVarA != null) {
                v8VarE.i();
                if (!v8VarE.b().g()) {
                    v8VarE.h();
                }
            } else if (t7VarRequest.b().isDuplex()) {
                v8VarE.e();
                t7VarRequest.b().writeTo(ob.a(v8VarE.a(t7VarRequest, true)));
            } else {
                cb cbVarA = ob.a(v8VarE.a(t7VarRequest, false));
                t7VarRequest.b().writeTo(cbVarA);
                cbVarA.close();
            }
        }
        if (t7VarRequest.b() == null || !t7VarRequest.b().isDuplex()) {
            v8VarE.d();
        }
        if (!z) {
            v8VarE.j();
        }
        if (aVarA == null) {
            aVarA = v8VarE.a(false);
        }
        v7 v7VarA = aVarA.a(t7VarRequest).a(v8VarE.b().a()).b(jCurrentTimeMillis).a(System.currentTimeMillis()).a();
        int iW = v7VarA.w();
        if (iW == 100) {
            v7VarA = v8VarE.a(false).a(t7VarRequest).a(v8VarE.b().a()).b(jCurrentTimeMillis).a(System.currentTimeMillis()).a();
            iW = v7VarA.w();
        }
        v8VarE.b(v7VarA);
        if (this.f14779a && iW == 101) {
            aVarD = v7VarA.D();
            w7VarA = f8.d;
        } else {
            aVarD = v7VarA.D();
            w7VarA = v8VarE.a(v7VarA);
        }
        v7 v7VarA2 = aVarD.a(w7VarA).a();
        if ("close".equalsIgnoreCase(v7VarA2.H().a("Connection")) || "close".equalsIgnoreCase(v7VarA2.b("Connection"))) {
            v8VarE.h();
        }
        if ((iW != 204 && iW != 205) || v7VarA2.s().v() <= 0) {
            return v7VarA2;
        }
        throw new ProtocolException("HTTP " + iW + " had non-zero Content-Length: " + v7VarA2.s().v());
    }

    public f9(boolean z) {
        this.f14779a = z;
    }
}
