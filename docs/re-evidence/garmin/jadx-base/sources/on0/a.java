package on0;

import b63.b;
import b63.l;
import b63.n;
import b63.o;
import b63.q;
import b63.u;
import b63.v;
import b63.z;
import c63.p;
import c63.t;
import e63.d;
import in0.c;
import in0.h;
import in0.i;
import in0.k;
import in0.m;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import oe2.g;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.y;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: on0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2524a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((h) t7).f94446a, ((h) t14).f94446a);
        }
    }

    public static final c a(o oVar, boolean z14) {
        oVar.getClass();
        w13.c cVar = m.f94504i;
        ArrayList arrayList = new ArrayList(y.r(cVar, 10));
        p13.c.b bVar = new p13.c.b();
        while (bVar.hasNext()) {
            arrayList.add(new h((m) bVar.next(), null, null, false, 4, null));
        }
        return new c(oVar, null, null, null, i53.a.e(b(arrayList, z14)), null, 32, null);
    }

    public static final ArrayList b(ArrayList arrayList, boolean z14) {
        m mVar = z14 ? m.SKIN_TEMP_F : m.SKIN_TEMP_C;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((h) obj).f94446a != mVar) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final l c(String str) {
        if (str == null) {
            return null;
        }
        c63.m.f25013b.getClass();
        p.a aVar = new p.a(new d());
        t.a(aVar, new e23.l[]{new g(13)}, new g(14));
        Unit unit = Unit.INSTANCE;
        p pVar = new p(aVar.build());
        try {
            try {
                l.INSTANCE.getClass();
                return l.Companion.b(str, pVar);
            } catch (Exception unused) {
                u uVarA = q.a(o.Companion.b(o.INSTANCE, str), new v(0, 0, 0, 0, 12, null));
                z.INSTANCE.getClass();
                return n.a(b.c(uVarA, z.f16226b));
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public static final c d(in0.d dVar, boolean z14) {
        o oVarB;
        dVar.getClass();
        String str = dVar.f94427a;
        i53.c cVarE = null;
        if (str == null || (oVarB = o.Companion.b(o.INSTANCE, str)) == null) {
            return null;
        }
        Integer num = dVar.f94428b;
        l lVarC = c(dVar.f94429c);
        l lVarC2 = c(dVar.f94430d);
        List<i> list = dVar.f94431e;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                h hVarE = e((i) it.next());
                if (hVarE != null) {
                    arrayList.add(hVarE);
                }
            }
            List listN0 = h0.N0(b(arrayList, z14), new C2524a());
            if (listN0 != null) {
                cVarE = i53.a.e(listN0);
            }
        }
        return new c(oVarB, num, lVarC, lVarC2, cVarE, null, 32, null);
    }

    public static final h e(i iVar) {
        Object obj;
        Object next;
        h.a aVar;
        Object next2;
        Double d14;
        iVar.getClass();
        String str = iVar.f94467e;
        w13.c cVar = m.f94504i;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        do {
            obj = null;
            if (!bVarN.hasNext()) {
                next = null;
                break;
            }
            next = bVarN.next();
        } while (!s.g(((m) next).f94505a, iVar.f94463a));
        m mVar = (m) next;
        if (mVar != null) {
            boolean zG = s.g(str, "ONBOARDING");
            w13.c cVar2 = h.a.C1802a.EnumC1803a.f94460f;
            ArrayList arrayList = new ArrayList(y.r(cVar2, 10));
            p13.c.b bVar = new p13.c.b();
            while (bVar.hasNext()) {
                arrayList.add(((h.a.C1802a.EnumC1803a) bVar.next()).f94461a);
            }
            if (h0.R(arrayList, str)) {
                Double d15 = iVar.f94464b;
                if (d15 != null) {
                    double dDoubleValue = d15.doubleValue();
                    Double d16 = iVar.f94465c;
                    if (d16 != null) {
                        double dDoubleValue2 = d16.doubleValue();
                        Double d17 = iVar.f94466d;
                        j23.d dVar = d17 != null ? new j23.d(d17.doubleValue(), dDoubleValue2) : null;
                        if (dVar != null) {
                            w13.c cVar3 = h.a.C1802a.EnumC1803a.f94460f;
                            p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar3, cVar3);
                            do {
                                if (!bVarN2.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = bVarN2.next();
                            } while (!s.g(((h.a.C1802a.EnumC1803a) next2).f94461a, str));
                            h.a.C1802a.EnumC1803a enumC1803a = (h.a.C1802a.EnumC1803a) next2;
                            if (enumC1803a != null && (d14 = iVar.f94468f) != null) {
                                h.a.C1802a c1802a = new h.a.C1802a(dVar, enumC1803a, d14.doubleValue());
                                w13.c cVar4 = k.f94495v;
                                p13.c.b bVarN3 = com.airbnb.lottie.animation.keyframe.a.n(cVar4, cVar4);
                                while (bVarN3.hasNext()) {
                                    Object next3 = bVarN3.next();
                                    if (s.g(((k) next3).f94496a, iVar.f94469g)) {
                                        obj = next3;
                                        break;
                                    }
                                }
                                aVar = new h.a(dDoubleValue, c1802a, (k) obj);
                            }
                        }
                    }
                }
            } else {
                aVar = null;
            }
            return new h(mVar, aVar, null, zG, 4, null);
        }
        return null;
    }
}
