package bi;

import lc.u0;
import vh.g0;
import vh.n0;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18001a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.CacheOnly.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.NetworkOnly.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.CacheFirst.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.NetworkFirst.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[g.CacheAndNetwork.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f18001a = iArr;
        }
    }

    public static final Object a(uh.a aVar, g gVar) {
        ki.a aVar2;
        gVar.getClass();
        int i14 = a.f18001a[gVar.ordinal()];
        if (i14 == 1) {
            aVar2 = j.f17968a;
        } else if (i14 == 2) {
            aVar2 = j.f17969b;
        } else if (i14 == 3) {
            aVar2 = j.f17970c;
        } else if (i14 == 4) {
            aVar2 = j.f17971d;
        } else {
            if (i14 != 5) {
                u0.r();
                return null;
            }
            aVar2 = j.f17972e;
        }
        g0 g0VarC = aVar.f171098c.c(new h(aVar2));
        g0VarC.getClass();
        aVar.f171098c = g0VarC;
        return aVar;
    }

    public static final <D extends n0.a> c b(vh.f<D> fVar) {
        fVar.getClass();
        return (c) fVar.f178312f.b(c.f17923h);
    }
}
