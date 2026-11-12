package mq;

import am.x0;
import java.util.ArrayList;
import java.util.List;
import p13.h0;
import p13.j0;
import p13.x;
import qs.p;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f120190a;

        static {
            int[] iArr = new int[x0.values().length];
            try {
                iArr[x0.W1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x0.X1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x0.V1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f120190a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    public static final List a(x0 x0Var, List list) {
        List listK;
        if (x0Var == null) {
            listK = j0.f134944a;
        } else {
            int i14 = a.f120190a[x0Var.ordinal()];
            listK = (i14 == 1 || i14 == 2 || i14 == 3) ? x.k(p.ASCENT, p.TRANSITION, p.DESCENT) : j0.f134944a;
            if (listK == null) {
                listK = j0.f134944a;
            }
        }
        if (listK.isEmpty()) {
            return list == null ? j0.f134944a : list;
        }
        if (list == null) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (h0.R(listK, ((ps.x0) obj).S0())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
