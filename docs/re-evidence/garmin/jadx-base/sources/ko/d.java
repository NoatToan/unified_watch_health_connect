package ko;

import com.garmin.android.apps.connectmobile.activities.newmodel.g0;
import d53.w;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p005kotlin.jvm.internal.s;
import ps.p;
import ps.x0;
import ps.x1;
import qs.n;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105707a;

        static {
            int[] iArr = new int[g0.values().length];
            try {
                iArr[g0.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g0.WARMUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g0.RECOVERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g0.REST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[g0.COOLDOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[g0.OTHER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f105707a = iArr;
        }
    }

    public static final n a(x0 x0Var) {
        Object next;
        String strR = w.R(x0Var.getIntensityType(), "_WALK");
        w13.c cVar = n.f147127k;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        do {
            if (!bVarN.hasNext()) {
                next = null;
                break;
            }
            next = bVarN.next();
        } while (!s.g(((n) next).name(), strR));
        n nVar = (n) next;
        return nVar == null ? n.ACTIVE : nVar;
    }

    public static final LinkedHashMap b(p pVar) {
        List<x1> listI;
        List<Integer> listP0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (pVar != null && (listI = pVar.i()) != null) {
            for (x1 x1Var : listI) {
                g0.a aVar = g0.f29436c;
                String strO0 = x1Var.o0();
                aVar.getClass();
                boolean zB = g0.a.b(strO0);
                n nVar = null;
                if (zB) {
                    switch (a.f105707a[g0.a.a(x1Var.o0()).ordinal()]) {
                        case 1:
                            nVar = n.ACTIVE;
                            break;
                        case 2:
                            nVar = n.WARMUP;
                            break;
                        case 3:
                            nVar = n.RECOVERY;
                            break;
                        case 4:
                            nVar = n.REST;
                            break;
                        case 5:
                            nVar = n.COOLDOWN;
                            break;
                        case 6:
                            nVar = n.OTHER;
                            break;
                    }
                }
                if (nVar != null && (listP0 = x1Var.p0()) != null) {
                    Iterator<T> it = listP0.iterator();
                    while (it.hasNext()) {
                        linkedHashMap.put(Integer.valueOf(((Number) it.next()).intValue()), nVar);
                    }
                }
            }
        }
        return linkedHashMap;
    }
}
