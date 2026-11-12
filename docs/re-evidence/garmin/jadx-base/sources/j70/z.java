package j70;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class z {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97677a;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.f97624g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.f97625h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r.f97626i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[r.f97627j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[r.f97628k.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[r.f97630m.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[r.f97631n.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[r.f97632o.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[r.f97633p.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f97677a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean a(List<y> list) {
        if (list == null || !(!list.isEmpty())) {
            return false;
        }
        ArrayList arrayListC = c(list);
        if (arrayListC.isEmpty()) {
            return false;
        }
        Iterator it = arrayListC.iterator();
        while (it.hasNext()) {
            if (((r) ((o13.p) it.next()).f128594a).f97640e) {
                return true;
            }
        }
        return false;
    }

    public static final r b(r rVar) {
        int i14 = rVar == null ? -1 : a.f97677a[rVar.ordinal()];
        if (i14 == 1) {
            return r.f97630m;
        }
        if (i14 == 2) {
            return r.f97631n;
        }
        if (i14 == 3) {
            return r.f97632o;
        }
        if (i14 != 4 && i14 != 5) {
            return r.f97630m;
        }
        return r.f97633p;
    }

    public static final ArrayList c(List list) {
        ArrayList arrayListL = androidx.core.view.j.l(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y yVar = (y) it.next();
            r.a aVar = r.f97623f;
            String userFocus = yVar.getUserFocus();
            aVar.getClass();
            r rVarA = r.a.a(userFocus);
            o13.p pVar = rVarA != null ? new o13.p(rVarA, yVar.getRecommended()) : null;
            if (pVar != null) {
                arrayListL.add(pVar);
            }
        }
        return arrayListL;
    }

    public static final ArrayList d(List list) {
        r rVarA;
        ArrayList arrayListL = androidx.core.view.j.l(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y yVar = (y) it.next();
            if (p005kotlin.jvm.internal.s.g(yVar.getRecommended(), Boolean.TRUE)) {
                r.a aVar = r.f97623f;
                String userFocus = yVar.getUserFocus();
                aVar.getClass();
                rVarA = r.a.a(userFocus);
            } else {
                rVarA = null;
            }
            if (rVarA != null) {
                arrayListL.add(rVarA);
            }
        }
        return arrayListL;
    }
}
