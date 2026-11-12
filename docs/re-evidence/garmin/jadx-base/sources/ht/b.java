package ht;

import c80.s0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p13.t0;
import p13.u0;
import p13.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lht/b;", "Lht/p;", "<init>", "()V", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements p {
    @Override // ht.p
    public final void a(q qVar, String str, s0 s0Var) {
        qVar.getClass();
        str.getClass();
        s0Var.getClass();
        zk.c cVar = zk.c.f205034a;
        List listC = w.c("GCS");
        cVar.getClass();
        zk.d dVar = new zk.d(cVar, null, listC);
        Map mapB = t0.b(new o13.p("userAcquisitionEvent", u0.e(new o13.p("pageType", "Promotion"), new o13.p("eventType", qVar.f85507a), new o13.p("promotionId", str), new o13.p("pageName", s0Var.f25584a))));
        ArrayList arrayList = new ArrayList(mapB.size());
        for (Map.Entry entry : mapB.entrySet()) {
            arrayList.add(new zk.e((String) entry.getKey(), entry.getValue()));
        }
        dVar.a(new zk.a("USER_ACQUISITION", arrayList, false, 0L, 12, null));
    }
}
