package zx0;

import am.x0;
import am.z0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import c22.c3;
import c22.r0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.k1;
import gs1.t;
import gs1.v;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
public final class m {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f207369a;

        static {
            int[] iArr = new int[x0.values().length];
            try {
                iArr[x0.E.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x0.f4355z1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x0.A1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x0.f4351y1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f207369a = iArr;
        }
    }

    public static final List a(ArrayList arrayList, List list) {
        if (list == null || list.isEmpty()) {
            return arrayList;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            v vVar = (v) obj;
            Integer num = vVar.f78885c;
            Object obj2 = null;
            if (num != null) {
                int iIntValue = num.intValue();
                int i14 = vVar.f78884b;
                for (Object obj3 : list) {
                    v vVar2 = (v) obj3;
                    Integer num2 = vVar2.f78885c;
                    if (num2 != null && i14 < num2.intValue() && iIntValue > vVar2.f78884b) {
                        obj2 = obj3;
                        break;
                    }
                }
                obj2 = (v) obj2;
            }
            if (obj2 == null) {
                arrayList2.add(obj);
            }
        }
        return h0.C0(arrayList2, list);
    }

    public static final String b(Context context, x0 x0Var, String str, String str2, Integer num) {
        c3 c3VarB;
        mn.a aVar = new mn.a(new l22.a(context));
        if (num.intValue() != 1) {
            return num.intValue() == 0 ? aVar.a(str2) : aVar.a(str2);
        }
        if (i(str)) {
            c3VarB = x0.f4290i1.f4360c;
        } else if (x0Var == null || (c3VarB = x0Var.f4360c) == null) {
            c3VarB = c22.i.b(R.string.txt_untitle);
        }
        return dh.b.A(context, c3VarB);
    }

    public static final Drawable c(Context context, v.a aVar) {
        context.getClass();
        aVar.getClass();
        boolean z14 = aVar instanceof v.a.C1589a;
        if (!z14 && !(aVar instanceof v.a.c)) {
            if (aVar instanceof v.a.d) {
                return f(context);
            }
            if (aVar instanceof v.a.f) {
                Resources resources = context.getResources();
                resources.getClass();
                return r0.a(context, R.drawable.health_snapshot, R.color.gcm_health_snapshot_color, R.color.gcm_icon_on_color, (int) xy2.b.n(resources, 1.0f), R.color.gcm_icon_stroke, r0.a.DEFAULT);
            }
            if (aVar instanceof v.a.b) {
                return a7.b.getDrawable(context, R.drawable.ecg_timeline_icon);
            }
            if (aVar.equals(v.a.e.d.f78891b) || aVar.equals(v.a.e.c.f78890b)) {
                return ql1.d.a(R.drawable.sleep, context);
            }
            if (aVar.equals(v.a.e.C1590a.f78888b) || aVar.equals(v.a.e.b.f78889b)) {
                return ql1.d.a(R.drawable.alarms, context);
            }
            u0.r();
            return null;
        }
        Object obj = aVar.f78887a;
        obj.getClass();
        x0 x0Var = (x0) obj;
        int i14 = a.f207369a[x0Var.ordinal()];
        if (i14 == 1 || i14 == 2 || i14 == 3 || i14 == 4) {
            int i15 = x0Var.f4361d;
            Resources resources2 = context.getResources();
            resources2.getClass();
            return r0.a(context, i15, R.color.gds_data_viz_red_primary, R.color.gcm_icon_on_color, (int) xy2.b.n(resources2, 1.0f), R.color.gcm_icon_stroke, r0.a.DEFAULT);
        }
        bv.b.f21239a.getClass();
        bv.b.a();
        boolean zL0 = k1.f37122a.l0();
        if (z14) {
            int iU = x0Var.u(zL0);
            Resources resources3 = context.getResources();
            resources3.getClass();
            return r0.a(context, iU, R.color.gcm_activity_color, R.color.gcm_icon_on_color, (int) xy2.b.n(resources3, 1.0f), R.color.gcm_icon_stroke, r0.a.DEFAULT);
        }
        int iU2 = x0Var.u(zL0);
        Resources resources4 = context.getResources();
        resources4.getClass();
        return r0.a(context, iU2, R.color.gcm_icon_secondary, R.color.gcm_icon_on_color, (int) xy2.b.n(resources4, 1.0f), R.color.gcm_icon_stroke, r0.a.DEFAULT);
    }

    public static final LayerDrawable d(Context context, x0 x0Var, String str, Integer num) {
        context.getClass();
        int i14 = x0Var == null ? -1 : a.f207369a[x0Var.ordinal()];
        if (i14 == 1 || i14 == 2 || i14 == 3 || i14 == 4) {
            return r0.b(context, x0Var.f4361d, R.color.gds_data_viz_red_primary, R.color.gcm_icon_on_color, null, 112);
        }
        bv.b.f21239a.getClass();
        bv.b.a();
        boolean zL0 = k1.f37122a.l0();
        if (num.intValue() == 0) {
            if (i(str)) {
                return r0.b(context, x0.f4290i1.f4361d, R.color.gcm_activity_color, R.color.gcm_icon_on_color, null, 112);
            }
            if (x0Var != null) {
                return r0.b(context, x0Var.u(zL0), R.color.gcm_activity_color, R.color.gcm_icon_on_color, null, 112);
            }
            return null;
        }
        if (i(str)) {
            return r0.b(context, x0.f4290i1.f4361d, R.color.gcm_icon_secondary, R.color.gcm_icon_on_color, null, 112);
        }
        if (x0Var != null) {
            return r0.b(context, x0Var.u(zL0), R.color.gcm_icon_secondary, R.color.gcm_icon_on_color, null, 112);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static final List e(ArrayList arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        ?? arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6 = null;
        if (arrayList != null) {
            arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((v) obj).f78883a instanceof v.a.C1589a) {
                    arrayList2.add(obj);
                }
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList != null) {
            arrayList3 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((v) obj2).f78883a instanceof v.a.c) {
                    arrayList3.add(obj2);
                }
            }
        } else {
            arrayList3 = null;
        }
        if (arrayList != null) {
            arrayList4 = new ArrayList();
            for (Object obj3 : arrayList) {
                v.a aVar = ((v) obj3).f78883a;
                if ((aVar instanceof v.a.f) || (aVar instanceof v.a.b)) {
                    arrayList4.add(obj3);
                }
            }
        } else {
            arrayList4 = j0.f134944a;
        }
        if (arrayList != null) {
            arrayList5 = new ArrayList();
            for (Object obj4 : arrayList) {
                if (((v) obj4).f78883a instanceof v.a.e) {
                    arrayList5.add(obj4);
                }
            }
        } else {
            arrayList5 = null;
        }
        if (arrayList != null) {
            arrayList6 = new ArrayList();
            for (Object obj5 : arrayList) {
                if (((v) obj5).f78883a instanceof v.a.d) {
                    arrayList6.add(obj5);
                }
            }
        }
        if (arrayList5 == null) {
            return j0.f134944a;
        }
        Iterable iterableA = a(arrayList3, arrayList2);
        if (iterableA == null) {
            iterableA = j0.f134944a;
        }
        ArrayList arrayListC0 = h0.C0(arrayList5, iterableA);
        Iterable iterableA2 = a(arrayList6, arrayList4);
        if (iterableA2 == null) {
            iterableA2 = j0.f134944a;
        }
        return h0.C0(arrayListC0, iterableA2);
    }

    public static final LayerDrawable f(Context context) {
        context.getClass();
        Resources resources = context.getResources();
        resources.getClass();
        return r0.a(context, R.drawable.sleep, R.color.gds_data_viz_blue_primary, R.color.gcm_icon_on_color, (int) xy2.b.n(resources, 1.0f), R.color.gcm_icon_on_color, r0.a.DEFAULT);
    }

    public static final ArrayList g(Context context, t tVar, e23.l lVar) {
        ArrayList arrayList;
        context.getClass();
        if (tVar != null) {
            ArrayList arrayListC = fs1.b.c(tVar);
            arrayList = new ArrayList();
            for (Object obj : arrayListC) {
                if (((Boolean) lVar.invoke(((v) obj).f78883a)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        List<v> listE = e(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (v vVar : listE) {
            int iH = h(vVar);
            long j8 = iH;
            xz.h hVar = (0 > j8 || j8 >= 1441) ? null : new xz.h(iH, c(context, vVar.f78883a), null, 4, null);
            if (hVar != null) {
                arrayList2.add(hVar);
            }
        }
        return arrayList2;
    }

    public static final int h(v vVar) {
        vVar.getClass();
        int i14 = vVar.f78884b;
        v.a aVar = vVar.f78883a;
        return ((aVar instanceof v.a.C1589a) || (aVar instanceof v.a.f) || (aVar instanceof v.a.b) || (aVar instanceof v.a.c)) ? (vVar.f78886d / 2) + i14 : i14;
    }

    public static final boolean i(String str) {
        return z0.m(str) == x0.f4290i1;
    }
}
