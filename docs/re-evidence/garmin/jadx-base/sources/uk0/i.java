package uk0;

import am.r1;
import am.x0;
import android.content.Context;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import d53.w;
import gg1.o0;
import gl1.y;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p13.h0;
import p3.l0;
import p3.p0;
import p3.p1;
import p3.s3;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luk0/i;", "", "<init>", "()V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f171830a = new i();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f171831a;

        static {
            int[] iArr = new int[o0.values().length];
            try {
                iArr[o0.STATUTE_US.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o0.STATUTE_UK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o0.METRIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f171831a = iArr;
        }
    }

    private i() {
    }

    public static String a(i53.c cVar, p3.m mVar) {
        Object obj;
        cVar.getClass();
        x1 x1Var = p3.n.f135158a;
        mVar.C(2048661718);
        Iterator<E> it = cVar.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = y.P(R.string.item_comma_item, new Object[]{(String) next, (String) it.next()}, mVar);
            }
            obj = next;
        } else {
            obj = null;
        }
        String str = (String) obj;
        mVar.f();
        x1 x1Var2 = p3.n.f135158a;
        return str;
    }

    public static String b(i53.c cVar, p3.m mVar, int i14) {
        cVar.getClass();
        mVar.C(159286598);
        x1 x1Var = p3.n.f135158a;
        mVar.C(-1544397232);
        List listS0 = h0.S0(cVar, 5);
        ArrayList arrayList = new ArrayList(p13.y.r(listS0, 10));
        Iterator it = listS0.iterator();
        while (it.hasNext()) {
            arrayList.add(gl1.d.T(((x0) it.next()).f4360c, mVar, 0));
        }
        mVar.f();
        String strA = a(i53.a.e(arrayList), mVar);
        if (strA == null) {
            x1 x1Var2 = p3.n.f135158a;
            mVar.f();
            return null;
        }
        if (cVar.size() == 6) {
            mVar.C(-631532884);
            strA = a(i53.a.a(strA, y.Q(mVar, R.string.and_one_other)), mVar);
            mVar.f();
        } else if (cVar.size() > 5) {
            mVar.C(-631385572);
            String str = NumberFormat.getIntegerInstance().format(Integer.valueOf(cVar.size() - 5));
            str.getClass();
            strA = a(i53.a.a(strA, y.P(R.string.and_x_others, new Object[]{str}, mVar)), mVar);
            mVar.f();
        } else {
            mVar.C(-631163209);
            mVar.f();
        }
        x1 x1Var3 = p3.n.f135158a;
        mVar.f();
        return strA;
    }

    public static String c(Context context, String str, String str2) {
        context.getClass();
        str.getClass();
        if (w.J(str)) {
            str = null;
        }
        if (str2 == null || w.J(str2)) {
            str2 = null;
        }
        if (str != null && str2 != null) {
            String string = context.getString(R.string.brand_model_format, str, str2);
            string.getClass();
            return string;
        }
        if (str != null) {
            return str;
        }
        if (str2 != null) {
            return str2;
        }
        String string2 = context.getString(R.string.no_value);
        string2.getClass();
        return string2;
    }

    public static String d(double d14, o0 o0Var, NumberFormat numberFormat) {
        o0Var.getClass();
        x1 x1Var = p3.n.f135158a;
        int i14 = a.f171831a[o0Var.ordinal()];
        if (i14 == 1 || i14 == 2) {
            l3.f23124b.getClass();
            String str = numberFormat.format(d14 / 1609.344d);
            str.getClass();
            return str;
        }
        if (i14 != 3) {
            u0.r();
            return null;
        }
        l3.f23124b.getClass();
        String str2 = numberFormat.format(d14 / 1000.0d);
        str2.getClass();
        return str2;
    }

    public static String e(double d14, o0 o0Var, NumberFormat numberFormat, p3.m mVar, int i14) {
        int i15;
        int i16;
        String strH;
        int i17;
        int i18;
        o0Var.getClass();
        x1 x1Var = p3.n.f135158a;
        String strD = d(d14, o0Var, numberFormat);
        int i19 = a.f171831a[o0Var.ordinal()];
        if (i19 == 1 || i19 == 2) {
            mVar.C(638350777);
            if (p005kotlin.jvm.internal.s.c(d53.s.f(strD), 1.0d)) {
                i15 = 638401462;
                i16 = R.string.common_mile;
            } else {
                i15 = 638482961;
                i16 = R.string.common_lbl_miles;
            }
            strH = sn.a.h(mVar, i15, i16, mVar);
            mVar.f();
        } else {
            if (i19 != 3) {
                throw n23.j.m(mVar, 574779554);
            }
            mVar.C(638606124);
            if (p005kotlin.jvm.internal.s.c(d53.s.f(strD), 1.0d)) {
                i17 = 638656654;
                i18 = R.string.lbl_kilometer_lower;
            } else {
                i17 = 638745996;
                i18 = R.string.common_lbl_kilometers;
            }
            strH = sn.a.h(mVar, i17, i18, mVar);
            mVar.f();
        }
        return y.P(R.string.value_unit, new Object[]{strD, strH}, mVar);
    }

    public static String f(p3.m mVar, int i14) {
        x1 x1Var = p3.n.f135158a;
        if (i14 == 1) {
            return sn.a.h(mVar, -1004005883, R.string.lbl_filter_single_result, mVar);
        }
        mVar.C(-1003924725);
        String str = NumberFormat.getIntegerInstance().format(Integer.valueOf(i14));
        str.getClass();
        String strP = y.P(R.string.lbl_filter_results, new Object[]{str}, mVar);
        mVar.f();
        return strP;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0029  */
    public static p1 g(p3.m mVar) {
        e53.c.a aVar = e53.c.f63094b;
        long jE = e53.e.e(1, e53.f.MINUTES);
        x1 x1Var = p3.n.f135158a;
        b63.o oVarD = g22.l.d(b63.o.INSTANCE);
        e53.c cVarC = e53.c.c(jE);
        boolean zL = mVar.l(jE);
        Object objQ = mVar.q();
        p3.m.a aVar2 = p3.m.f135153a;
        if (zL) {
            objQ = new j(jE, null);
            mVar.K(objQ);
        } else {
            aVar2.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new j(jE, null);
                mVar.K(objQ);
            }
        }
        e23.p pVar = (e23.p) objQ;
        Object objQ2 = mVar.q();
        aVar2.getClass();
        Object obj = p3.m.a.f135155b;
        if (objQ2 == obj) {
            objQ2 = p0.n(oVarD);
            mVar.K(objQ2);
        }
        p1 p1Var = (p1) objQ2;
        boolean zR = mVar.r(pVar);
        Object objQ3 = mVar.q();
        if (zR || objQ3 == obj) {
            objQ3 = new s3(pVar, p1Var, null);
            mVar.K(objQ3);
        }
        l0.e((e23.p) objQ3, cVarC, mVar);
        return p1Var;
    }

    public static String h(String str, p3.m mVar) {
        str.getClass();
        x1 x1Var = p3.n.f135158a;
        return y.P(R.string.value_asterisk, new Object[]{str}, mVar);
    }

    public static List i(Context context, List list) {
        list.getClass();
        context.getClass();
        return h0.N0(list, new a61.c(new u91.i(10, r1.n(), Comparator.comparing(new a73.k(context, 1))), 27));
    }
}
