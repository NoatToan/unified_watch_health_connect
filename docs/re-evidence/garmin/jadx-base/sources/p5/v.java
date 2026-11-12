package p5;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.m2;
import kotlin.v3;
import p005kotlin.Unit;
import p13.t0;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f136092a = new AtomicInteger(0);

    public static final void a(m2 m2Var, q qVar) {
        v3 v3Var = m2Var.f91343c;
        int iA = t0.a(p13.y.r(qVar, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Map.Entry<? extends j0<?>, ? extends Object> entry : qVar) {
            o13.p pVar = new o13.p(entry.getKey().f136022a, entry.getValue());
            linkedHashMap.put(pVar.f128594a, pVar.f128595b);
        }
        v3Var.c(linkedHashMap, "properties");
    }

    public static final h4.r b(h4.r rVar, e23.l<? super k0, Unit> lVar) {
        return rVar.then(new c(lVar));
    }

    public static final h4.r c(e23.l lVar, h4.r rVar, boolean z14) {
        return rVar.then(new b(z14, lVar));
    }
}
