package h33;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p13.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<c> f81491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<c> f81492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f81493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f81494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final LinkedHashMap f81495e;

    static {
        c cVar = c.FIELD;
        c cVar2 = c.METHOD_RETURN_TYPE;
        c cVar3 = c.VALUE_PARAMETER;
        List<c> listK = p13.x.k(cVar, cVar2, cVar3, c.TYPE_PARAMETER_BOUNDS, c.TYPE_USE);
        f81491a = listK;
        List<c> listC = p13.w.c(cVar3);
        f81492b = listC;
        x33.c cVar4 = d0.f81436a;
        p33.m mVar = p33.m.NOT_NULL;
        Map mapE = u0.e(new o13.p(cVar4, new q(new p33.n(mVar, false, 2, null), listK, false, true, true)), new o13.p(d0.f81437b, new q(new p33.n(mVar, false, 2, null), listK, false, true, true)), new o13.p(d0.f81438c, new q(new p33.n(p33.m.FORCE_FLEXIBILITY, false, 2, null), listK, false, true, true, 4, null)));
        f81493c = mapE;
        Map mapE2 = u0.e(new o13.p(d0.f81443h, new q(new p33.n(mVar, false, 2, null), listC, false, false, false, 28, null)), new o13.p(d0.f81444i, new q(new p33.n(p33.m.NULLABLE, false, 2, null), listC, false, false, false, 28, null)));
        f81494d = mapE2;
        f81495e = u0.h(mapE, mapE2);
    }
}
