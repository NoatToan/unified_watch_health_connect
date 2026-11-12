package com.huawei.hms.network.embedded;

import com.huawei.openalliance.ad.constant.Constants;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class e9 implements n7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c7 f14736a;

    @Override // com.huawei.hms.network.embedded.n7
    public v7 intercept(n7.a aVar) throws IOException {
        t7 t7VarRequest = aVar.request();
        t7.a aVarI = t7VarRequest.i();
        u7 u7VarB = t7VarRequest.b();
        if (u7VarB != null) {
            o7 o7VarContentType = u7VarB.contentType();
            if (o7VarContentType != null) {
                aVarI.b("Content-Type", o7VarContentType.toString());
            }
            long jContentLength = u7VarB.contentLength();
            if (jContentLength != -1) {
                aVarI.b("Content-Length", Long.toString(jContentLength));
                aVarI.b("Transfer-Encoding");
            } else {
                aVarI.b("Transfer-Encoding", "chunked");
                aVarI.b("Content-Length");
            }
        }
        boolean z = false;
        if (t7VarRequest.a("Host") == null) {
            aVarI.b("Host", f8.a(t7VarRequest.k(), false));
        }
        if (t7VarRequest.a("Connection") == null) {
            aVarI.b("Connection", "Keep-Alive");
        }
        if (t7VarRequest.a(j2.v) == null && t7VarRequest.a("Range") == null) {
            aVarI.b(j2.v, Constants.GZIP);
            z = true;
        }
        List<b7> listA = this.f14736a.a(t7VarRequest.k());
        if (!listA.isEmpty()) {
            aVarI.b("Cookie", a(listA));
        }
        if (t7VarRequest.a("User-Agent") == null) {
            aVarI.b("User-Agent", g8.a());
        }
        v7 v7VarA = aVar.a(aVarI.a());
        i9.a(this.f14736a, t7VarRequest.k(), v7VarA.y());
        v7.a aVarA = v7VarA.D().a(t7VarRequest);
        if (z && Constants.GZIP.equalsIgnoreCase(v7VarA.b("Content-Encoding")) && i9.b(v7VarA)) {
            kb kbVar = new kb(v7VarA.s().x());
            aVarA.a(v7VarA.y().c().d("Content-Encoding").d("Content-Length").a());
            aVarA.a(new l9(v7VarA.b("Content-Type"), -1L, ob.a(kbVar)));
        }
        return aVarA.a();
    }

    private String a(List<b7> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            b7 b7Var = list.get(i);
            sb.append(b7Var.e());
            sb.append('=');
            sb.append(b7Var.i());
        }
        return sb.toString();
    }

    public e9(c7 c7Var) {
        this.f14736a = c7Var;
    }
}
