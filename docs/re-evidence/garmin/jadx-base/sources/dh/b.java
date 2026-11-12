package dh;

import am.f2;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.s0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import androidx.room.b0;
import androidx.room.c0;
import androidx.room.d0;
import androidx.room.f0;
import c22.c2;
import c22.c3;
import c22.g2;
import c22.h2;
import c22.i;
import c22.j;
import c22.r1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.repcounting.model.ExerciseSetsDTO;
import com.garmin.android.apps.connectmobile.u2;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.firebase.messaging.l;
import d53.w;
import g6.h;
import h4.r;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.zip.Adler32;
import l72.c1;
import l72.y2;
import lc.u0;
import o13.p;
import o13.u;
import o4.h1;
import o4.u1;
import o53.k;
import org.joda.time.DateTime;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.reflect.jvm.internal.impl.km.InconsistentKotlinMetadataException;
import p13.j0;
import p13.x;
import p13.y;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import p43.i0;
import p43.t1;
import p43.v1;
import p43.w1;
import ps.f1;
import ps.r0;
import t23.d1;
import u13.f;
import u62.f3;
import u62.i3;
import u62.z;
import v62.e1;
import w2.a0;
import wr.g;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f59530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f59531b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static List f59532c;

    public static final String A(Context context, c3 c3Var) {
        String strD;
        context.getClass();
        c3Var.getClass();
        if (c3Var instanceof i) {
            int i14 = ((i) c3Var).f23085a;
            Parcelable.Creator<i> creator = i.CREATOR;
            String string = context.getString(i14);
            string.getClass();
            return string;
        }
        if (c3Var instanceof g2) {
            String str = ((g2) c3Var).f23059a;
            str.getClass();
            return g2.f(str);
        }
        if (c3Var instanceof j) {
            String str2 = ((j) c3Var).f23098a;
            str2.getClass();
            Integer numD = j.d(context, str2);
            strD = numD != null ? context.getString(numD.intValue()) : null;
            return strD == null ? "" : strD;
        }
        if (!(c3Var instanceof h2)) {
            u0.r();
            return null;
        }
        String str3 = ((h2) c3Var).f23081a;
        str3.getClass();
        Parcelable.Creator<h2> creator2 = h2.CREATOR;
        c2.f23014a.getClass();
        c2 c2VarA = c2.a.a();
        strD = c2VarA != null ? c2VarA.d(str3) : null;
        return strD == null ? "" : strD;
    }

    public static final String B(Fragment fragment, c3 c3Var) {
        String strD;
        fragment.getClass();
        c3Var.getClass();
        if (c3Var instanceof i) {
            int i14 = ((i) c3Var).f23085a;
            Context contextRequireContext = fragment.requireContext();
            contextRequireContext.getClass();
            Parcelable.Creator<i> creator = i.CREATOR;
            String string = contextRequireContext.getString(i14);
            string.getClass();
            return string;
        }
        if (c3Var instanceof g2) {
            String str = ((g2) c3Var).f23059a;
            str.getClass();
            return g2.f(str);
        }
        if (c3Var instanceof j) {
            String str2 = ((j) c3Var).f23098a;
            str2.getClass();
            Context contextRequireContext2 = fragment.requireContext();
            contextRequireContext2.getClass();
            Integer numD = j.d(contextRequireContext2, str2);
            strD = numD != null ? contextRequireContext2.getString(numD.intValue()) : null;
            return strD == null ? "" : strD;
        }
        if (!(c3Var instanceof h2)) {
            u0.r();
            return null;
        }
        String str3 = ((h2) c3Var).f23081a;
        str3.getClass();
        c2.f23014a.getClass();
        c2 c2VarA = c2.a.a();
        strD = c2VarA != null ? c2VarA.d(str3) : null;
        return strD == null ? "" : strD;
    }

    public static final String C(Context context, String str, Object... objArr) {
        String strC;
        context.getClass();
        str.getClass();
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Parcelable.Creator<g2> creator = g2.CREATOR;
        try {
            c2.f23014a.getClass();
            c2 c2VarA = c2.a.a();
            return (c2VarA == null || (strC = c2VarA.c(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length))) == null) ? "" : strC;
        } catch (Exception e4) {
            int i14 = gt2.c.f79010a;
            gt2.b.f79005a.h("OnDemandStringHandle").error("getString with *formatArgs: OnDemandResources is not initialized yet", (Throwable) e4);
            return "";
        }
    }

    public static final String D(Context context, String str) {
        context.getClass();
        str.getClass();
        return g2.f(str);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v6 com.garmin.android.apps.connectmobile.activities.newmodel.h0, still in use, count: 2, list:
          (r9v6 com.garmin.android.apps.connectmobile.activities.newmodel.h0) from 0x0080: IF  (r9v6 com.garmin.android.apps.connectmobile.activities.newmodel.h0) == (null com.garmin.android.apps.connectmobile.activities.newmodel.h0)  -> B:93:? A[HIDDEN]
          (r9v6 com.garmin.android.apps.connectmobile.activities.newmodel.h0) from 0x0084: PHI (r9 I:??) = 
          (r9v0 com.garmin.android.apps.connectmobile.activities.newmodel.h0)
          (r9v6 com.garmin.android.apps.connectmobile.activities.newmodel.h0)
         binds: [B:31:0x0083, B:92:0x0084] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static final com.garmin.android.apps.connectmobile.repcounting.model.ExerciseSetsDTO E(com.garmin.android.apps.connectmobile.repcounting.model.ExerciseSetsDTO r10, java.util.List r11) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dh.b.E(com.garmin.android.apps.connectmobile.repcounting.model.ExerciseSetsDTO, java.util.List):com.garmin.android.apps.connectmobile.repcounting.model.ExerciseSetsDTO");
    }

    public static final boolean F(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (s.g(((iu0.a) it.next()).getAlert(), "ACTIVITY_START")) {
                    if (!list.isEmpty()) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            if (s.g(((iu0.a) it3.next()).getAlert(), "ACTIVITY_STOP")) {
                                if (!list.isEmpty()) {
                                    Iterator it4 = list.iterator();
                                    while (it4.hasNext()) {
                                        if (s.g(((iu0.a) it4.next()).getAlert(), "ACTIVITY_DISTANCE")) {
                                            return true;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                        }
                        break;
                    }
                    break;
                }
            }
        }
        if (!list.isEmpty()) {
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                if (s.g(((iu0.a) it5.next()).getAlert(), "ACTIVITY_TIME")) {
                    return true;
                }
            }
        }
        if (!list.isEmpty()) {
            Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                if (s.g(((iu0.a) it6.next()).getAlert(), "ACTIVITY_AUTO_LAP")) {
                    return true;
                }
            }
        }
        if (!list.isEmpty()) {
            Iterator it7 = list.iterator();
            while (it7.hasNext()) {
                if (s.g(((iu0.a) it7.next()).getAlert(), "ACTIVITY_MANUAL_LAP")) {
                    return true;
                }
            }
        }
        if (list.isEmpty()) {
            return false;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (s.g(((iu0.a) it8.next()).getAlert(), "ACTIVITY_TRANSITION")) {
                return true;
            }
        }
        return false;
    }

    public static final boolean G(char c14) {
        return '0' <= c14 && c14 < ':';
    }

    public static final boolean H(Integer num) {
        return num != null && num.intValue() == 200;
    }

    public static final void I(y0 y0Var, n0 n0Var, z0 z0Var) {
        y0Var.getClass();
        n0Var.getClass();
        y0Var.f(n0Var, new r1(z0Var, y0Var));
    }

    public static final float J(int i14, int i15) {
        return (i14 * 100.0f) / i15;
    }

    public static final Integer K(Integer num, Integer num2) {
        if (num == null || num2 == null) {
            return num == null ? num2 : num;
        }
        return g.m(num.intValue(), num2);
    }

    public static final void L(s0 s0Var, n0 n0Var, z0 z0Var) {
        s0Var.getClass();
        n0Var.getClass();
        z0Var.getClass();
        s0Var.l(n0Var);
        s0Var.f(n0Var, z0Var);
    }

    public static final byte[] M(InputStream inputStream) throws IOException {
        inputStream.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        p(inputStream, byteArrayOutputStream, 8192);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public static final String N(int i14, String str) {
        int iG;
        if (str.length() >= i14 + 12) {
            int i15 = 0;
            if (w.A("+-", str.charAt(0)) && (iG = w.G('-', 1, 4, str)) >= 12) {
                while (true) {
                    int i16 = i15 + 1;
                    if (str.charAt(i16) != '0') {
                        break;
                    }
                    i15 = i16;
                }
                if (iG - i15 < 12) {
                    return w.P(1, iG - 10, str).toString();
                }
            }
        }
        return str;
    }

    public static final String[] O(Metadata metadata) {
        String[] strArrD1 = metadata.d1();
        if (strArrD1.length == 0) {
            strArrD1 = null;
        }
        if (strArrD1 != null) {
            return strArrD1;
        }
        throw new InconsistentKotlinMetadataException("Metadata is missing: kotlin.Metadata.data1 must not be an empty array", null, 2, null);
    }

    public static final e33.c P(Collection collection, e33.d dVar) {
        Iterator it = collection.iterator();
        e33.c cVar = null;
        while (it.hasNext()) {
            e33.c cVar2 = (e33.c) it.next();
            if (s.g(cVar2.getType(), dVar)) {
                if (cVar != null) {
                    l.n(dVar, "Multiple extensions handle the same extension type: ");
                    return null;
                }
                cVar = cVar2;
            }
        }
        if (cVar != null) {
            return cVar;
        }
        l.n(dVar, "No extensions handle the extension type: ");
        return null;
    }

    public static final ExerciseSetsDTO Q(ps.s0 s0Var) {
        s0Var.getClass();
        ExerciseSetsDTO exerciseSetsDTO = new ExerciseSetsDTO();
        exerciseSetsDTO.k(new JSONObject(GsonUtil.a(s0Var)));
        List<r0> listD = s0Var.d();
        if (listD != null) {
            int i14 = 0;
            for (Object obj : listD) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    x.q();
                    throw null;
                }
                r0 r0Var = (r0) obj;
                com.garmin.android.apps.connectmobile.repcounting.model.e eVar = exerciseSetsDTO.f41089a[i14];
                if (eVar != null) {
                    eVar.f41117g = r0Var.f140205l;
                    eVar.f41124n = r0Var.f140203j;
                    eVar.f41125o = r0Var.f140204k;
                    if (s.g(r0Var.f140206m, Boolean.TRUE)) {
                        Long lK = r0Var.getWeight();
                        if ((lK != null ? lK.longValue() : 0L) <= 0) {
                            eVar.n0(-1L);
                        }
                    }
                }
                i14 = i15;
            }
        }
        return exerciseSetsDTO;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023 A[PHI: r2
      0x0023: PHI (r2v5 java.lang.Double) = (r2v1 java.lang.Double), (r2v6 java.lang.Double) binds: [B:16:0x0037, B:10:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    public static final w01.d R(w01.c cVar) {
        Double dR;
        Double d14;
        cVar.getClass();
        w01.b bVar = cVar.f181028a;
        j23.d dVar = null;
        if (bVar == null) {
            return null;
        }
        if (cVar.f181030c == q22.b.MILLILITER) {
            dR = bVar.getMetricHydrationTotalValueInML();
            if (!zf.b.D(dR) || dR.doubleValue() <= 0.0d) {
                d14 = null;
            } else {
                d14 = dR;
            }
        } else {
            dR = bVar.getStatuteHydrationTotalValueInOz();
            if (!zf.b.D(dR) || dR.doubleValue() <= 0.0d) {
                d14 = null;
            } else {
                d14 = dR;
            }
        }
        if (cVar.f181029b == w01.e.GRAMS) {
            Double dO = bVar.getMetricNutritionTotalValueLowInGrams();
            Double dM = bVar.getMetricNutritionTotalValueHighInGrams();
            if (zf.b.D(dO) && dO.doubleValue() > 0.0d && zf.b.D(dM) && dM.doubleValue() > 0.0d) {
                dVar = new j23.d(dO.doubleValue(), dM.doubleValue());
            }
        } else {
            Double dZ = bVar.getStatuteNutritionTotalValueLowInGrams();
            Double dY = bVar.getStatuteNutritionTotalValueHighInGrams();
            if (zf.b.D(dZ) && dZ.doubleValue() > 0.0d && zf.b.D(dY) && dY.doubleValue() > 0.0d) {
                double d15 = 4;
                dVar = new j23.d(dZ.doubleValue() * d15, dY.doubleValue() * d15);
            }
        }
        return new w01.d(d14, cVar.f181030c, dVar, cVar.f181029b, cVar.f181036i, Double.valueOf(bVar.getHeatIndexTemperatureCelsius()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final long S(u uVar) {
        return ((Number) uVar.f128607c).longValue() + (((long) (((Number) uVar.f128605a).intValue() * 60)) * 60) + ((long) (((Number) uVar.f128606b).intValue() * 60));
    }

    public static final Object T(b0 b0Var, e23.l lVar, t13.d dVar) {
        d0 d0Var = new d0(lVar, null);
        androidx.room.r0 r0Var = (androidx.room.r0) dVar.getF157466b().get(androidx.room.r0.f10943b);
        t13.e eVar = r0Var != null ? r0Var.f10944a : null;
        if (eVar != null) {
            return ge1.b.e0(eVar, d0Var, dVar);
        }
        k kVar = new k(f.b(dVar), 1);
        kVar.q();
        try {
            b0Var.getTransactionExecutor().execute(new c0(kVar, b0Var, d0Var));
        } catch (RejectedExecutionException e4) {
            kVar.u(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e4));
        }
        Object objP = kVar.p();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objP;
    }

    public static w1 U(w1 w1Var) {
        if (!(w1Var instanceof i0)) {
            return new c43.e(w1Var, true);
        }
        i0 i0Var = (i0) w1Var;
        d1[] d1VarArr = i0Var.f135856b;
        ArrayList<p> arrayListN0 = p13.u.n0(i0Var.f135857c, d1VarArr);
        ArrayList arrayList = new ArrayList(y.r(arrayListN0, 10));
        for (p pVar : arrayListN0) {
            arrayList.add(q((t1) pVar.f128594a, (d1) pVar.f128595b));
        }
        return new i0(d1VarArr, (t1[]) arrayList.toArray(new t1[0]), true);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:37:0x0094  */
    public static final void a(e23.a aVar, e23.a aVar2, m mVar, int i14) {
        o0 o0Var;
        int i15;
        o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, 833959429);
        int i16 = (o0VarP.r(aVar) ? 4 : 2) | i14 | (o0VarP.r(aVar2) ? 32 : 16);
        int i17 = 0;
        if (o0VarP.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            c1 c1Var = c1.f110940a;
            String strQ = gl1.y.Q(o0VarP, R.string.trail_customize_dialog_title);
            String strQ2 = gl1.y.Q(o0VarP, R.string.trail_customize_dialog_message);
            String strQ3 = gl1.y.Q(o0VarP, R.string.lbl_common_continue);
            int i18 = i16 & 112;
            boolean z14 = ((i16 & 14) == 4) | (i18 == 32);
            Object objQ = o0VarP.q();
            m.a aVar3 = m.f135153a;
            if (z14) {
                objQ = new at1.e(aVar2, aVar, i17);
                o0VarP.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new at1.e(aVar2, aVar, i17);
                    o0VarP.K(objQ);
                }
            }
            e23.a<Unit> aVar4 = (e23.a) objQ;
            String strQ4 = gl1.y.Q(o0VarP, R.string.lbl_cancel);
            boolean z15 = i18 == 32;
            Object objQ2 = o0VarP.q();
            if (z15) {
                objQ2 = new as.n(aVar2, 8);
                o0VarP.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new as.n(aVar2, 8);
                    o0VarP.K(objQ2);
                }
            }
            o0Var = o0VarP;
            i15 = 0;
            c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar4, strQ4, (e23.a) objQ2, o0Var, 0, 0, 217);
        } else {
            o0Var = o0VarP;
            i15 = 0;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.f(aVar, aVar2, i14, i15);
        }
    }

    public static final void b(int i14, int i15, e23.a aVar, r rVar, m mVar) {
        String strP;
        rVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(1968558914);
        int i16 = (o0VarE.B(rVar) ? 4 : 2) | i15 | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            if (i14 > 0) {
                o0VarE.C(1855312901);
                l72.p2 p2Var = l72.p2.f111205a;
                if (i14 == 1) {
                    strP = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1855377753, R.string.lbl_view_climb, o0VarE, false);
                } else {
                    o0VarE.C(1855455036);
                    strP = gl1.y.P(R.string.lbl_view_climbs_list, new Object[]{String.valueOf(i14)}, o0VarE);
                    o0VarE.g0(false);
                }
                f40.a.f68846a.getClass();
                p2Var.g(strP, rVar, null, f40.a.f68847b, null, false, false, aVar, o0VarE, ((i16 << 3) & 112) | 3072 | ((i16 << 18) & 234881024), 244);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1855929088);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.g(rVar, i14, aVar, i15);
        }
    }

    public static final void c(String str, String str2, e23.a aVar, e23.a aVar2, m mVar, int i14) {
        int i15;
        String str3;
        String strQ;
        int i16;
        o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, 2124246719);
        if ((i14 & 6) == 0) {
            i15 = (o0VarP.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i17 = i15 | 16;
        if ((i14 & 384) == 0) {
            i17 |= o0VarP.r(aVar) ? 256 : 128;
        }
        if (o0VarP.n(i17 & 1, (i17 & 1171) != 1170)) {
            o0VarP.G0();
            if ((i14 & 1) == 0 || o0VarP.o0()) {
                strQ = gl1.y.Q(o0VarP, R.string.msg_delete_activity);
                i16 = i17 & (-113);
            } else {
                o0VarP.e();
                i16 = i17 & (-113);
                strQ = str2;
            }
            o0VarP.h0();
            x1 x1Var = n.f135158a;
            String str4 = strQ;
            c1.f110940a.a(false, str, str4, null, null, gl1.y.Q(o0VarP, R.string.lbl_delete), false, false, aVar, gl1.y.Q(o0VarP, R.string.lbl_cancel), aVar2, o0VarP, ((i16 << 3) & 1008) | ((i16 << 18) & 234881024), 6, 217);
            str3 = str4;
        } else {
            o0VarP.e();
            str3 = str2;
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new com.google.maps.android.compose.u(str, str3, aVar, aVar2, i14, 28);
        }
    }

    public static final void d(t41.g gVar, e23.a aVar, e23.a aVar2, m mVar, int i14) {
        gVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-302758972);
        int i15 = i14 | (o0VarE.k(gVar.ordinal()) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            c1.f110940a.a(false, gl1.y.Q(o0VarE, gVar.f162300a), gl1.y.Q(o0VarE, R.string.pacepro_previous_changes_alert_message), null, null, gl1.y.Q(o0VarE, R.string.lbl_common_continue), false, false, aVar, gl1.y.Q(o0VarE, R.string.lbl_cancel), aVar2, o0VarE, ((i15 << 21) & 234881024) | 6, (i15 >> 6) & 14, 216);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a3.e(gVar, aVar, aVar2, i14, 3);
        }
    }

    public static final long e(float f14, float f15) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f15)) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32);
        h.a aVar = h.f76000b;
        return jFloatToRawIntBits;
    }

    public static final long f(int i14) {
        if (!(i14 > 0)) {
            b2.e.a("The span value should be higher than 0");
        }
        return i14;
    }

    public static final void g(y2 y2Var, boolean z14, m mVar, int i14, int i15) {
        int i16;
        boolean z15;
        y2Var.getClass();
        o0 o0VarE = mVar.E(-651787435);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 48;
        } else if ((i14 & 48) == 0) {
            i16 = (o0VarE.h(z14) ? 32 : 16) | i14;
        } else {
            i16 = i14;
        }
        if (o0VarE.n(i16 & 1, (i16 & 17) != 16)) {
            boolean z16 = i17 != 0 ? true : z14;
            x1 x1Var = n.f135158a;
            int i18 = i16;
            y2 y2Var2 = y2.f111386a;
            s62.a.f157643a.getClass();
            y2Var2.g(z16, e1.a(t62.b.f162798a), o0VarE, (i18 >> 3) & 14, 0);
            z15 = z16;
        } else {
            o0VarE.e();
            z15 = z14;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.e1(y2Var, z15, i14, i15, 0);
        }
    }

    public static final void h(y2 y2Var, boolean z14, m mVar, int i14) {
        boolean z15;
        y2Var.getClass();
        o0 o0VarE = mVar.E(756234554);
        if (o0VarE.n(i14 & 1, (i14 & 17) != 16)) {
            x1 x1Var = n.f135158a;
            y2 y2Var2 = y2.f111386a;
            s62.a.f157643a.getClass();
            z15 = z14;
            y2Var2.g(z15, f3.a(t62.a.f162797a), o0VarE, 6, 0);
        } else {
            z15 = z14;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ap2.f(y2Var, z15, i14, 2);
        }
    }

    public static final void i(y2 y2Var, boolean z14, m mVar, int i14, int i15) {
        int i16;
        boolean z15;
        y2Var.getClass();
        o0 o0VarE = mVar.E(-1469052102);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 48;
        } else if ((i14 & 48) == 0) {
            i16 = (o0VarE.h(z14) ? 32 : 16) | i14;
        } else {
            i16 = i14;
        }
        if (o0VarE.n(i16 & 1, (i16 & 17) != 16)) {
            boolean z16 = i17 != 0 ? true : z14;
            x1 x1Var = n.f135158a;
            int i18 = i16;
            y2 y2Var2 = y2.f111386a;
            s62.a.f157643a.getClass();
            y2Var2.g(z16, i3.a(t62.a.f162797a), o0VarE, (i18 >> 3) & 14, 0);
            z15 = z16;
        } else {
            o0VarE.e();
            z15 = z14;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.e1(y2Var, z15, i14, i15, 1);
        }
    }

    public static final void j(List list, o82.a aVar, m mVar, int i14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(416994755);
        int i15 = (o0VarE.r(list) ? 4 : 2) | i14 | (o0VarE.B(aVar) ? 32 : 16);
        int i16 = 10;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r61.a aVar2 = (r61.a) it.next();
                ed1.b.f63874a.getClass();
                arrayList.add(ed1.b.a(aVar2));
            }
            i53.c cVarE = i53.a.e(arrayList);
            ed1.b bVar = ed1.b.f63874a;
            boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
            bVar.getClass();
            dd1.f.a(ed1.b.b(cVarE, context, aVar, zY), i53.a.e(ad1.b.f2763k), gl1.y.Q(o0VarE, R.string.lbl_race_predictor), false, null, o0VarE, 3072, 16);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c42.c0(list, aVar, i14, i16);
        }
    }

    public static final void k(int i14, e23.a aVar, String str, m mVar) {
        int i15;
        o0 o0VarL = vb.h.l(-1876929842, aVar, str, mVar);
        if ((i14 & 6) == 0) {
            i15 = (o0VarL.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarL.r(aVar) ? 32 : 16;
        }
        if (o0VarL.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            int i16 = i15;
            c1.f110940a.a(false, gl1.y.Q(o0VarL, R.string.rate_limit_dialog_title), str, null, null, gl1.y.Q(o0VarL, R.string.lbl_ok), false, false, aVar, null, null, o0VarL, ((i16 << 6) & 896) | 6 | ((i16 << 21) & 234881024), 0, 1752);
        } else {
            o0VarL.e();
        }
        p2 p2VarI0 = o0VarL.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.j(str, aVar, i14, 0);
        }
    }

    public static a l(Context context) {
        String strA;
        if (context == null) {
            return null;
        }
        synchronized (f59531b) {
            try {
                if (c.f59534h == null) {
                    synchronized (c.f59533g) {
                        try {
                            if (c.f59534h == null) {
                                c cVar = new c(context);
                                c.f59534h = cVar;
                                cVar.e();
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
                c cVar2 = c.f59534h;
                synchronized (cVar2) {
                    strA = cVar2.f59536a;
                    if (strA == null) {
                        strA = cVar2.a();
                    }
                }
                if (zg.c.b(strA)) {
                    return null;
                }
                if (strA.endsWith("\n")) {
                    strA = strA.substring(0, strA.length() - 1);
                }
                a aVar = new a();
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strD = a0.d();
                aVar.f59527b = strD;
                aVar.f59526a = strD;
                aVar.f59529d = jCurrentTimeMillis;
                aVar.f59528c = strA;
                m(aVar);
                return aVar;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public static void m(a aVar) {
        String str = aVar.f59528c + aVar.f59527b + aVar.f59529d + "" + aVar.f59526a;
        if (zg.c.b(str)) {
            return;
        }
        Adler32 adler32 = new Adler32();
        adler32.reset();
        adler32.update(str.getBytes());
        adler32.getValue();
    }

    public static final String n(dk2.h hVar) {
        hVar.getClass();
        dk2.d dVar = hVar instanceof dk2.d ? (dk2.d) hVar : null;
        if (dVar != null) {
            return dVar.f60247k;
        }
        return null;
    }

    public static final Object o(b0 b0Var, e23.l lVar, t13.d dVar) {
        if ((!b0Var.inCompatibilityMode() || !b0Var.isOpenInternal$room_runtime() || !b0Var.inTransaction()) && dVar.getF157466b().get(f0.f10827a) != null) {
            return T(b0Var, lVar, dVar);
        }
        return lVar.invoke(dVar);
    }

    public static final long p(InputStream inputStream, OutputStream outputStream, int i14) throws IOException {
        inputStream.getClass();
        byte[] bArr = new byte[i14];
        int i15 = inputStream.read(bArr);
        long j8 = 0;
        while (i15 >= 0) {
            outputStream.write(bArr, 0, i15);
            j8 += (long) i15;
            i15 = inputStream.read(bArr);
        }
        return j8;
    }

    public static final t1 q(t1 t1Var, d1 d1Var) {
        if (d1Var == null || t1Var.a() == p43.g2.INVARIANT) {
            return t1Var;
        }
        if (d1Var.m() != t1Var.a()) {
            return new v1(new c43.a(t1Var, null, false, null, 14, null));
        }
        if (!t1Var.b()) {
            return new v1(t1Var.getType());
        }
        o43.e.a aVar = o43.e.f129095e;
        aVar.getClass();
        return new v1(new p43.s0(aVar, new c43.d(t1Var)));
    }

    public static final List r(f72.f0 f0Var) {
        f0Var.getClass();
        List list = f59532c;
        if (list != null) {
            return list;
        }
        u4.d dVarC = g72.f.f76204a;
        p005kotlin.jvm.internal.j jVar = null;
        if (dVarC == null) {
            float f14 = (float) 24.0d;
            g6.f.a aVar = g6.f.f75994b;
            u4.d.a aVar2 = new u4.d.a("DiveProfessional", f14, f14, 24.0f, 24.0f, 0L, 0, true, 96, null);
            o4.t1 t1Var = new o4.t1(o4.f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            u4.e eVarL = b71.i.l(h1.f128863b, 12.7304f, 4.3966f, 11.9435f, 2.0f);
            eVarL.i(11.1566f, 4.3966f);
            eVarL.g(8.6102f);
            eVarL.i(10.6703f, 5.8778f);
            eVarL.i(9.8834f, 8.2745f);
            eVarL.i(11.9435f, 6.7933f);
            eVarL.i(14.0036f, 8.2745f);
            eVarL.i(13.2167f, 5.8778f);
            tn.k.s(eVarL, 15.2768f, 4.3966f, 12.7304f);
            u4.d.a.b(aVar2, eVarL.f168407a, 0, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var2 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarM = com.nimbusds.jose.shaded.gson.internal.a.m(7.3983f, 6.3857f, 6.9402f, 4.976f);
            eVarM.i(6.4822f, 6.3857f);
            eVarM.g(5.0f);
            eVarM.i(6.1992f, 7.2569f);
            eVarM.i(5.7411f, 8.6666f);
            eVarM.i(6.9402f, 7.7954f);
            eVarM.i(8.1394f, 8.6666f);
            eVarM.i(7.6814f, 7.2569f);
            tn.k.s(eVarM, 8.8805f, 6.3857f, 7.3983f);
            u4.d.a.b(aVar2, eVarM.f168407a, 0, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var3 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarJ = sn.a.j(16.9468f, 4.9761f, 17.4048f, 6.3857f, 18.887f);
            eVarJ.i(17.6879f, 7.257f);
            eVarJ.i(18.1459f, 8.6666f);
            eVarJ.i(16.9468f, 7.7954f);
            eVarJ.i(15.7476f, 8.6666f);
            eVarJ.i(16.2056f, 7.257f);
            eVarJ.i(15.0065f, 6.3857f);
            tn.k.q(eVarJ, 16.4888f, 16.9468f, 4.9761f);
            u4.d.a.b(aVar2, eVarJ.f168407a, 0, t1Var3, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var4 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarL2 = com.nimbusds.jose.shaded.gson.internal.a.l(11.9435f, 9.8432f);
            eVarL2.d(10.2102f, 9.8432f, 8.8063f, 11.2471f, 8.8063f, 12.9804f);
            eVarL2.d(8.8063f, 14.7138f, 10.2102f, 16.1177f, 11.9435f, 16.1177f);
            eVarL2.d(13.6769f, 16.1177f, 15.0807f, 14.7138f, 15.0807f, 12.9804f);
            eVarL2.d(15.0807f, 11.2471f, 13.6769f, 9.8432f, 11.9435f, 9.8432f);
            eVarL2.c();
            u4.d.a.b(aVar2, eVarL2.f168407a, 0, t1Var4, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var5 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarL3 = com.nimbusds.jose.shaded.gson.internal.a.l(16.1827f, 18.3922f);
            eVarL3.d(16.1082f, 18.2314f, 15.92f, 18.0471f, 15.8023f, 17.9569f);
            eVarL3.d(15.6219f, 17.8157f, 14.7867f, 17.2079f, 14.6572f, 17.1255f);
            eVarL3.d(14.469f, 17.0f, 14.1122f, 16.9098f, 13.967f, 16.9098f);
            eVarL3.g(9.8887f);
            eVarL3.d(9.7435f, 16.9098f, 9.3906f, 17.004f, 9.1985f, 17.1255f);
            eVarL3.d(9.069f, 17.2118f, 8.2337f, 17.8157f, 8.0534f, 17.9569f);
            eVarL3.d(7.9396f, 18.0471f, 7.7475f, 18.2314f, 7.673f, 18.3922f);
            eVarL3.d(7.5945f, 18.5647f, 6.4534f, 22.0f, 6.4534f, 22.0f);
            eVarL3.g(17.4651f);
            eVarL3.d(17.4651f, 22.0f, 16.2611f, 18.5647f, 16.1827f, 18.3922f);
            eVarL3.c();
            u4.d.a.b(aVar2, eVarL3.f168407a, 0, t1Var5, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC = aVar2.c();
            g72.f.f76204a = dVarC;
        }
        u4.d dVar = dVarC;
        u4.d dVarC2 = g72.i.f76207a;
        if (dVarC2 == null) {
            float f15 = (float) 24.0d;
            g6.f.a aVar3 = g6.f.f75994b;
            u4.d.a aVar4 = new u4.d.a("DiveSurface", f15, f15, 24.0f, 24.0f, 0L, 0, true, 96, null);
            o4.t1 t1Var6 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            u4.e eVarK = b71.i.k(h1.f128863b, 11.9673f, 5.7137f);
            eVarK.d(13.0f, 5.8844f, 13.9586f, 4.9941f, 13.7121f, 3.9148f);
            eVarK.d(13.5253f, 3.1149f, 12.7109f, 2.6098f, 11.9175f, 2.7901f);
            eVarK.d(11.1127f, 2.975f, 10.6079f, 3.7848f, 10.7928f, 4.5896f);
            eVarK.d(10.9199f, 5.1533f, 11.3938f, 5.619f, 11.9673f, 5.7137f);
            eVarK.c();
            u4.d.a.b(aVar4, eVarK.f168407a, 0, t1Var6, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var7 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarM2 = com.nimbusds.jose.shaded.gson.internal.a.m(2.0f, 9.6383f, 2.005f, 8.4986f);
            eVarM2.i(4.5044f, 7.4839f);
            eVarM2.i(5.814f, 8.4186f);
            eVarM2.i(5.4891f, 9.4034f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM2, 4.5044f, 8.6086f, 2.0f, 9.6383f);
            u4.d.a.b(aVar4, eVarM2.f168407a, 0, t1Var7, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var8 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarM3 = com.nimbusds.jose.shaded.gson.internal.a.m(17.4811f, 8.5286f, 20.0005f, 7.4989f);
            eVarM3.i(22.0f, 8.5136f);
            eVarM3.o(9.6533f);
            eVarM3.i(20.0105f, 8.6236f);
            eVarM3.i(17.5011f, 9.6233f);
            eVarM3.i(16.4014f, 9.1884f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM3, 16.7913f, 8.2837f, 17.4811f, 8.5286f);
            u4.d.a.b(aVar4, eVarM3.f168407a, 0, t1Var8, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var9 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarM4 = com.nimbusds.jose.shaded.gson.internal.a.m(5.814f, 12.0777f, 7.1487f, 6.779f);
            eVarM4.i(9.2681f, 6.2492f);
            tn.k.s(eVarM4, 7.6535f, 12.0777f, 5.814f);
            u4.d.a.b(aVar4, eVarM4.f168407a, 0, t1Var9, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var10 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarM5 = com.nimbusds.jose.shaded.gson.internal.a.m(16.8712f, 16.0817f, 15.2516f, 12.4476f);
            eVarM5.i(13.5171f, 10.873f);
            eVarM5.i(13.0972f, 11.9328f);
            eVarM5.i(13.4171f, 13.2874f);
            eVarM5.i(14.4568f, 13.9472f);
            eVarM5.i(16.6813f, 17.3864f);
            eVarM5.i(16.6863f, 17.3714f);
            eVarM5.o(17.3764f);
            eVarM5.i(21.4551f, 16.3166f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM5, 19.4756f, 15.2169f, 16.8712f, 16.0817f);
            u4.d.a.b(aVar4, eVarM5.f168407a, 0, t1Var10, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var11 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarM6 = com.nimbusds.jose.shaded.gson.internal.a.m(17.2462f, 4.1897f, 15.1667f, 9.3384f);
            eVarM6.i(12.9472f, 8.7535f);
            eVarM6.i(11.9075f, 11.4629f);
            eVarM6.i(12.5223f, 14.1022f);
            eVarM6.i(9.5231f, 18.3911f);
            eVarM6.i(11.9175f, 19.5858f);
            eVarM6.i(12.1674f, 21.9502f);
            eVarM6.i(8.2584f, 19.001f);
            eVarM6.i(8.2634f, 18.986f);
            eVarM6.i(8.2384f, 18.991f);
            eVarM6.i(10.4029f, 13.5723f);
            eVarM6.i(9.1982f, 12.0177f);
            eVarM6.d(9.0432f, 11.6278f, 9.0182f, 11.2029f, 9.1282f, 10.798f);
            eVarM6.i(10.4629f, 6.5691f);
            eVarM6.i(12.6473f, 6.779f);
            eVarM6.i(14.3019f, 7.6338f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM6, 16.1914f, 4.4346f, 17.2462f, 4.1897f);
            u4.d.a.b(aVar4, eVarM6.f168407a, 0, t1Var11, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC2 = aVar4.c();
            g72.i.f76207a = dVarC2;
        }
        u4.d dVarC3 = g72.g.f76205a;
        if (dVarC3 == null) {
            float f16 = (float) 24.0d;
            g6.f.a aVar5 = g6.f.f75994b;
            u4.d.a aVar6 = new u4.d.a("DiveReadiness", f16, f16, 24.0f, 24.0f, 0L, 0, false, 96, null);
            o4.t1 t1Var12 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            u4.e eVarL4 = b71.i.l(h1.f128863b, 19.2216f, 4.5f, 16.85f, 7.3f);
            eVarL4.i(15.4f, 5.95f);
            eVarL4.i(14.85f, 6.7f);
            eVarL4.i(16.9f, 8.7f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarL4, 19.8216f, 5.2f, 19.2216f, 4.5f);
            u4.d.a.b(aVar6, eVarL4.f168407a, 0, t1Var12, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var13 = new o4.t1(o4.f0.d(4278190080L), jVar);
            int i14 = h1.f128864c;
            u4.e eVarL5 = com.nimbusds.jose.shaded.gson.internal.a.l(13.0f, 6.5f);
            eVarL5.d(13.0f, 4.0f, 15.0f, 2.0f, 17.5f, 2.0f);
            eVarL5.d(20.0f, 2.0f, 22.0f, 4.0f, 22.0f, 6.5f);
            eVarL5.d(22.0f, 9.0f, 20.0f, 11.0f, 17.5f, 11.0f);
            eVarL5.d(15.0f, 11.0f, 13.0f, 9.0f, 13.0f, 6.5f);
            eVarL5.c();
            eVarL5.k(14.0f, 6.5f);
            eVarL5.d(14.0f, 8.45f, 15.55f, 10.0f, 17.5f, 10.0f);
            eVarL5.d(19.45f, 10.0f, 21.0f, 8.45f, 21.0f, 6.5f);
            eVarL5.d(21.0f, 4.55f, 19.45f, 3.0f, 17.5f, 3.0f);
            eVarL5.d(15.55f, 3.0f, 14.0f, 4.55f, 14.0f, 6.5f);
            eVarL5.c();
            u4.d.a.b(aVar6, eVarL5.f168407a, i14, t1Var13, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var14 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarL6 = com.nimbusds.jose.shaded.gson.internal.a.l(9.25f, 11.9f);
            eVarL6.d(9.25f, 11.9f, 11.55f, 14.25f, 12.0f, 14.4f);
            eVarL6.i(15.0f, 15.75f);
            eVarL6.i(16.2f, 18.15f);
            eVarL6.i(18.0f, 19.9f);
            eVarL6.i(21.95f, 21.15f);
            eVarL6.i(21.85f, 22.0f);
            eVarL6.i(16.9f, 21.1f);
            eVarL6.i(14.25f, 18.85f);
            eVarL6.i(11.8f, 17.95f);
            eVarL6.d(10.5934f, 17.4947f, 9.573f, 16.6502f, 8.9f, 15.55f);
            eVarL6.i(7.5f, 13.25f);
            eVarL6.i(6.4f, 6.25f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarL6, 7.4f, 5.5f, 9.25f, 11.9f);
            u4.d.a.b(aVar6, eVarL6.f168407a, 0, t1Var14, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var15 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarM7 = com.nimbusds.jose.shaded.gson.internal.a.m(2.0f, 10.55f, 4.5f, 14.25f);
            eVarM7.i(8.5f, 16.75f);
            eVarM7.i(7.5f, 15.25f);
            eVarM7.i(6.5f, 13.3f);
            eVarM7.i(5.5f, 12.75f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM7, 2.7f, 9.85f, 2.0f, 10.55f);
            u4.d.a.b(aVar6, eVarM7.f168407a, 0, t1Var15, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var16 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarM8 = com.nimbusds.jose.shaded.gson.internal.a.m(18.45f, 18.65f, 16.9f, 17.15f);
            eVarM8.i(16.25f, 15.9f);
            eVarM8.d(16.5337f, 15.5414f, 16.9465f, 15.3081f, 17.4f, 15.25f);
            eVarM8.d(17.6367f, 15.2148f, 17.878f, 15.2271f, 18.1099f, 15.2863f);
            eVarM8.d(18.3418f, 15.3455f, 18.5595f, 15.4503f, 18.7504f, 15.5946f);
            eVarM8.d(18.9413f, 15.7389f, 19.1015f, 15.9199f, 19.2216f, 16.1269f);
            eVarM8.d(19.3417f, 16.3338f, 19.4194f, 16.5627f, 19.45f, 16.8f);
            eVarM8.d(19.4645f, 16.9329f, 19.4645f, 17.0671f, 19.45f, 17.2f);
            eVarM8.d(19.4215f, 17.5071f, 19.3146f, 17.8018f, 19.1395f, 18.0557f);
            eVarM8.d(18.9644f, 18.3096f, 18.7269f, 18.5142f, 18.45f, 18.65f);
            eVarM8.c();
            u4.d.a.b(aVar6, eVarM8.f168407a, 0, t1Var16, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var17 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarM9 = com.nimbusds.jose.shaded.gson.internal.a.m(16.0f, 14.75f, 16.5f, 12.75f);
            eVarM9.i(11.5f, 10.25f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM9, 11.0f, 12.25f, 16.0f, 14.75f);
            u4.d.a.b(aVar6, eVarM9.f168407a, 0, t1Var17, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC3 = aVar6.c();
            g72.g.f76205a = dVarC3;
        }
        u4.d dVarC4 = g72.j.f76208a;
        if (dVarC4 == null) {
            float f17 = (float) 24.0d;
            g6.f.a aVar7 = g6.f.f75994b;
            u4.d.a aVar8 = new u4.d.a("GarminDive", f17, f17, 24.0f, 24.0f, 0L, 0, false, 96, null);
            o4.t1 t1Var18 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            h1.f128863b.getClass();
            int i15 = h1.f128864c;
            u4.e eVarL7 = com.nimbusds.jose.shaded.gson.internal.a.l(7.0725f, 19.0177f);
            eVarL7.d(6.2664f, 18.0086f, 6.1783f, 17.1753f, 6.1921f, 17.1753f);
            eVarL7.o(3.8259f);
            eVarL7.i(6.1987f, 3.7167f);
            eVarL7.d(6.2512f, 3.2875f, 6.6094f, 2.9553f, 7.0434f, 2.9553f);
            eVarL7.d(7.5135f, 2.9553f, 7.8946f, 3.3451f, 7.8946f, 3.8259f);
            eVarL7.i(7.8947f, 16.5141f);
            eVarL7.i(7.8989f, 16.5125f);
            eVarL7.i(7.8946f, 16.6668f);
            eVarL7.i(7.8941f, 16.7383f);
            eVarL7.d(7.9004f, 17.3175f, 8.0567f, 17.741f, 8.363f, 18.0086f);
            eVarL7.d(8.6611f, 18.269f, 9.0038f, 18.4427f, 9.3912f, 18.5297f);
            eVarL7.i(10.4093f, 18.5288f);
            eVarL7.d(10.6816f, 17.9023f, 11.2954f, 17.4655f, 12.009f, 17.4655f);
            eVarL7.d(12.9754f, 17.4655f, 13.7588f, 18.2667f, 13.7588f, 19.2551f);
            eVarL7.d(13.7588f, 20.2434f, 12.9754f, 21.0446f, 12.009f, 21.0446f);
            eVarL7.d(11.4117f, 21.0446f, 10.8842f, 20.7385f, 10.5685f, 20.2712f);
            eVarL7.i(9.0296f, 20.2708f);
            eVarL7.d(8.2623f, 20.1081f, 7.6099f, 19.6904f, 7.0725f, 19.0177f);
            eVarL7.c();
            u4.d.a.b(aVar8, eVarL7.f168407a, i15, t1Var18, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var19 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarL8 = com.nimbusds.jose.shaded.gson.internal.a.l(16.4531f, 8.5659f);
            eVarL8.d(18.4121f, 8.5659f, 20.0001f, 10.19f, 20.0001f, 12.1934f);
            eVarL8.d(20.0001f, 14.1969f, 18.4121f, 15.821f, 16.4531f, 15.821f);
            eVarL8.d(14.9123f, 15.821f, 13.601f, 14.8161f, 13.1114f, 13.4123f);
            eVarL8.d(12.707f, 13.169f, 12.3628f, 13.0487f, 12.0781f, 13.0487f);
            eVarL8.d(11.5609f, 13.0487f, 11.1703f, 13.3805f, 10.8517f, 13.7658f);
            eVarL8.d(10.2805f, 14.9823f, 9.0644f, 15.821f, 7.6568f, 15.821f);
            eVarL8.d(5.6979f, 15.821f, 4.1099f, 14.1969f, 4.1099f, 12.1934f);
            eVarL8.d(4.1099f, 10.19f, 5.6979f, 8.5659f, 7.6568f, 8.5659f);
            eVarL8.g(16.4531f);
            eVarL8.c();
            u4.d.a.b(aVar8, eVarL8.f168407a, i15, t1Var19, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC4 = aVar8.c();
            g72.j.f76208a = dVarC4;
        }
        u4.d dVar2 = dVarC4;
        u4.d dVarA = g72.e.a(f0Var);
        u4.d dVarA2 = g72.h.a(f0Var);
        u4.d dVarA3 = g72.d.a(f0Var);
        f0Var.getClass();
        u4.d dVarC5 = g72.c.f76201a;
        if (dVarC5 == null) {
            float f18 = (float) 24.0d;
            g6.f.a aVar9 = g6.f.f75994b;
            u4.d.a aVar10 = new u4.d.a("DiveAutodive", f18, f18, 24.0f, 24.0f, 0L, 0, false, 96, null);
            o4.t1 t1Var20 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            u4.e eVarK2 = b71.i.k(h1.f128863b, 9.25f, 11.9f);
            eVarK2.d(9.25f, 11.9f, 11.55f, 14.25f, 12.0f, 14.4f);
            eVarK2.i(15.0f, 15.75f);
            eVarK2.i(16.2f, 18.15f);
            eVarK2.i(18.0f, 19.9f);
            eVarK2.i(21.95f, 21.15f);
            eVarK2.i(21.85f, 22.0f);
            eVarK2.i(16.9f, 21.1f);
            eVarK2.i(14.25f, 18.85f);
            eVarK2.i(11.8f, 17.95f);
            eVarK2.d(10.5934f, 17.4947f, 9.573f, 16.6502f, 8.9f, 15.55f);
            eVarK2.i(7.5f, 13.25f);
            eVarK2.i(6.4f, 6.25f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarK2, 7.4f, 5.5f, 9.25f, 11.9f);
            u4.d.a.b(aVar10, eVarK2.f168407a, 0, t1Var20, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var21 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarM10 = com.nimbusds.jose.shaded.gson.internal.a.m(2.0f, 10.55f, 4.5f, 14.25f);
            eVarM10.i(8.5f, 16.75f);
            eVarM10.i(7.5f, 15.25f);
            eVarM10.i(6.5f, 13.3f);
            eVarM10.i(5.5f, 12.75f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM10, 2.7f, 9.85f, 2.0f, 10.55f);
            u4.d.a.b(aVar10, eVarM10.f168407a, 0, t1Var21, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var22 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarM11 = com.nimbusds.jose.shaded.gson.internal.a.m(18.45f, 18.65f, 16.9f, 17.15f);
            eVarM11.i(16.25f, 15.9f);
            eVarM11.d(16.5337f, 15.5414f, 16.9465f, 15.3081f, 17.4f, 15.25f);
            eVarM11.d(17.6367f, 15.2148f, 17.878f, 15.2271f, 18.1099f, 15.2863f);
            eVarM11.d(18.3418f, 15.3455f, 18.5595f, 15.4503f, 18.7504f, 15.5946f);
            eVarM11.d(18.9413f, 15.7389f, 19.1015f, 15.9199f, 19.2216f, 16.1269f);
            eVarM11.d(19.3417f, 16.3338f, 19.4194f, 16.5627f, 19.45f, 16.8f);
            eVarM11.d(19.4645f, 16.9329f, 19.4645f, 17.0671f, 19.45f, 17.2f);
            eVarM11.d(19.4215f, 17.5071f, 19.3146f, 17.8018f, 19.1395f, 18.0557f);
            eVarM11.d(18.9644f, 18.3096f, 18.727f, 18.5142f, 18.45f, 18.65f);
            eVarM11.c();
            u4.d.a.b(aVar10, eVarM11.f168407a, 0, t1Var22, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var23 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarM12 = com.nimbusds.jose.shaded.gson.internal.a.m(16.0f, 14.75f, 16.5f, 12.75f);
            eVarM12.i(11.5f, 10.25f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM12, 11.0f, 12.25f, 16.0f, 14.75f);
            u4.d.a.b(aVar10, eVarM12.f168407a, 0, t1Var23, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var24 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarD = z.d(19.8443f, 8.3626f, 17.6392f, 17.2102f, 10.0f);
            tn.k.u(eVarD, 15.5f, 18.0021f, 2.0f, 19.4814f);
            eVarD.i(22.0f, 10.0f);
            tn.k.q(eVarD, 20.2733f, 19.8443f, 8.3626f);
            eVarD.k(17.9911f, 7.0165f);
            eVarD.g(19.4869f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarD, 18.739f, 4.1648f, 17.9911f, 7.0165f);
            u4.d.a.b(aVar10, eVarD.f168407a, 0, t1Var24, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC5 = aVar10.c();
            g72.c.f76201a = dVarC5;
        }
        u4.d dVar3 = dVarC5;
        u4.d dVarC6 = g72.a.f76199a;
        if (dVarC6 == null) {
            float f19 = (float) 24.0d;
            g6.f.a aVar11 = g6.f.f75994b;
            u4.d.a aVar12 = new u4.d.a("BreatheLeft", f19, f19, 24.0f, 24.0f, 0L, 0, true, 96, null);
            o4.t1 t1Var25 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            u4.e eVarK3 = b71.i.k(h1.f128863b, 6.8468f, 4.4795f);
            eVarK3.d(4.9138f, 4.4795f, 3.3468f, 5.8246f, 3.3468f, 7.4834f);
            eVarK3.o(19.998f);
            eVarK3.d(3.347f, 21.1036f, 4.3914f, 21.9998f, 5.6798f, 22.0f);
            eVarK3.g(8.0138f);
            eVarK3.d(9.3022f, 21.9998f, 10.3466f, 21.1036f, 10.3468f, 19.998f);
            eVarK3.o(7.4834f);
            eVarK3.d(10.3468f, 5.8246f, 8.7798f, 4.4795f, 6.8468f, 4.4795f);
            eVarK3.c();
            u4.d.a.b(aVar12, eVarK3.f168407a, 0, t1Var25, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var26 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarL9 = com.nimbusds.jose.shaded.gson.internal.a.l(6.8468f, 2.0f);
            eVarL9.d(6.0184f, 2.0f, 5.3468f, 2.6716f, 5.3468f, 3.5f);
            eVarL9.g(8.3468f);
            eVarL9.d(8.3468f, 2.6716f, 7.6752f, 2.0f, 6.8468f, 2.0f);
            eVarL9.c();
            u4.d.a.b(aVar12, eVarL9.f168407a, 0, t1Var26, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var27 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarM13 = com.nimbusds.jose.shaded.gson.internal.a.m(20.6532f, 17.8657f, 14.0543f, 12.0f);
            sn.a.w(eVarM13, 20.6532f, 6.1343f, 17.8657f);
            u4.d.a.b(aVar12, eVarM13.f168407a, 0, t1Var27, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC6 = aVar12.c();
            g72.a.f76199a = dVarC6;
        }
        u4.d dVar4 = dVarC6;
        f0Var.getClass();
        u4.d dVarC7 = g72.b.f76200a;
        if (dVarC7 == null) {
            float f22 = (float) 24.0d;
            g6.f.a aVar13 = g6.f.f75994b;
            u4.d.a aVar14 = new u4.d.a("BreatheRight", f22, f22, 24.0f, 24.0f, 0L, 0, true, 96, null);
            o4.t1 t1Var28 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            u4.e eVarK4 = b71.i.k(h1.f128863b, 17.1532f, 4.4795f);
            eVarK4.d(19.0862f, 4.4795f, 20.6532f, 5.8246f, 20.6532f, 7.4834f);
            eVarK4.o(19.998f);
            eVarK4.d(20.653f, 21.1036f, 19.6086f, 21.9998f, 18.3202f, 22.0f);
            eVarK4.g(15.9862f);
            eVarK4.d(14.6979f, 21.9998f, 13.6535f, 21.1036f, 13.6532f, 19.998f);
            eVarK4.o(7.4834f);
            eVarK4.d(13.6532f, 5.8246f, 15.2202f, 4.4795f, 17.1532f, 4.4795f);
            eVarK4.c();
            u4.d.a.b(aVar14, eVarK4.f168407a, 0, t1Var28, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var29 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarL10 = com.nimbusds.jose.shaded.gson.internal.a.l(17.1532f, 2.0f);
            eVarL10.d(17.9817f, 2.0f, 18.6532f, 2.6716f, 18.6532f, 3.5f);
            eVarL10.g(15.6532f);
            eVarL10.d(15.6532f, 2.6716f, 16.3248f, 2.0f, 17.1532f, 2.0f);
            eVarL10.c();
            u4.d.a.b(aVar14, eVarL10.f168407a, 0, t1Var29, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var30 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarM14 = com.nimbusds.jose.shaded.gson.internal.a.m(3.3468f, 17.8657f, 9.9457f, 12.0f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM14, 3.3468f, 6.1343f, 3.3468f, 17.8657f);
            u4.d.a.b(aVar14, eVarM14.f168407a, 0, t1Var30, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC7 = aVar14.c();
            g72.b.f76200a = dVarC7;
        }
        List listK = x.k(dVar, dVarC2, dVarC3, dVar2, dVarA, dVarA2, dVarA3, dVar3, dVar4, dVarC7);
        f59532c = listK;
        listK.getClass();
        return listK;
    }

    public static final k23.d s(Annotation annotation) {
        annotation.getClass();
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        clsAnnotationType.getClass();
        return p005kotlin.jvm.internal.s0.f105811a.b(clsAnnotationType);
    }

    public static final float t(eq.e eVar, m mVar) {
        float f14 = eVar.f65037b;
        x1 x1Var = n.f135158a;
        if (eVar != eq.e.f65029d) {
            mVar.C(-615034881);
            mVar.f();
            return f14;
        }
        mVar.C(-615153146);
        float fW = w02.b0.w(c22.b.c((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b), w02.b0.g(f14, mVar), 1.3f), mVar);
        mVar.f();
        return fW;
    }

    public static final Class u(k23.d dVar) {
        dVar.getClass();
        Class<?> clsJ = ((p005kotlin.jvm.internal.g) dVar).j();
        clsJ.getClass();
        return clsJ;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class v(k23.d dVar) {
        dVar.getClass();
        Class<?> clsJ = ((p005kotlin.jvm.internal.g) dVar).j();
        if (clsJ.isPrimitive()) {
            String name = clsJ.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsJ;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class w(k23.d dVar) {
        dVar.getClass();
        Class<?> clsJ = ((p005kotlin.jvm.internal.g) dVar).j();
        if (clsJ.isPrimitive()) {
            return clsJ;
        }
        String name = clsJ.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final k23.d x(Class cls) {
        cls.getClass();
        return p005kotlin.jvm.internal.s0.f105811a.b(cls);
    }

    public static final ArrayList y(Context context, ps.c1 c1Var, List list) {
        Context context2;
        Iterable iterableB;
        if (c1Var == null || list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ps.c1 c1VarA = f2.a((ps.x1) it.next(), c1Var);
            if (c1VarA != null) {
                context2 = context;
                iterableB = new f1(context2, c1VarA, null, 4, null).b(true, null, null);
            } else {
                context2 = context;
                iterableB = j0.f134944a;
            }
            p13.d0.v(arrayList, iterableB);
            context = context2;
        }
        return arrayList;
    }

    public static final Intent z(Class cls, Context context, DateTime dateTime, boolean z14) {
        u2 u2Var = new u2();
        u2Var.f46492a = dateTime;
        if (z14) {
            u2Var.b(o82.g.f130851d);
        }
        return u2Var.a(context, cls);
    }
}
