package h5;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f82010a;

        static {
            int[] iArr = new int[e0.e.values().length];
            try {
                iArr[e0.e.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e0.e.LookaheadLayingOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e0.e.Measuring.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e0.e.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e0.e.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f82010a = iArr;
        }
    }

    public static final ArrayList a(f5.x xVar) {
        xVar.getClass();
        e0 f81711p = ((u0) xVar).getF81711p();
        boolean zB = b(f81711p);
        q3.c.a aVar = (q3.c.a) f81711p.E();
        q3.c<T> cVar = aVar.f142359a;
        ArrayList arrayList = new ArrayList(cVar.f142358c);
        int i14 = cVar.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            e0 e0Var = (e0) aVar.get(i15);
            arrayList.add(zB ? e0Var.x() : e0Var.C());
        }
        return arrayList;
    }

    public static final boolean b(e0 e0Var) {
        int i14 = a.f82010a[e0Var.T.f81841d.ordinal()];
        if (i14 == 1 || i14 == 2) {
            return true;
        }
        if (i14 == 3 || i14 == 4) {
            return false;
        }
        if (i14 != 5) {
            lc.u0.r();
            return false;
        }
        e0 e0VarK = e0Var.K();
        if (e0VarK != null) {
            return b(e0VarK);
        }
        vb.h.s("no parent for idle node");
        return false;
    }
}
