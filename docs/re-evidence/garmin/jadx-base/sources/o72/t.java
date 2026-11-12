package o72;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.ColorFilter;
import androidx.fragment.app.Fragment;
import bs2.q4;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.SimpleColorFilter;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieValueCallback;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import com.garmin.samd.repository.UnexpectedResponseCodeException;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.common.net.HttpHeaders;
import com.google.common.primitives.UnsignedBytes;
import e23.l;
import e23.p;
import i3.s4;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTimeConstants;
import org.json.JSONObject;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.y0;
import r1.l0;
import r1.n;
import v62.u7;

/* JADX INFO: loaded from: classes9.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f130587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f130588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ArrayList f130589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static List f130590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static List f130591e;

    public static final List A(u7 u7Var) {
        long j8;
        u7Var.getClass();
        List list = f130591e;
        if (list != null) {
            return list;
        }
        u4.d dVarC = c72.b.f25254a;
        p005kotlin.jvm.internal.j jVar = null;
        if (dVarC != null) {
            j8 = 4278190080L;
        } else {
            float f14 = (float) 24.0d;
            g6.f.a aVar = g6.f.f75994b;
            u4.d.a aVar2 = new u4.d.a("VbtSensorOff", f14, f14, 24.0f, 24.0f, 0L, 0, true, 96, null);
            o4.t1 t1Var = new o4.t1(o4.f0.d(4278190080L), jVar);
            o4.u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            o4.h1.f128863b.getClass();
            int i14 = o4.h1.f128864c;
            u4.e eVarM = com.nimbusds.jose.shaded.gson.internal.a.m(22.0f, 4.5693f, 20.5348f, 5.8438f);
            eVarM.i(21.999f, 7.0606f);
            j8 = 4278190080L;
            u62.z.p(eVarM, 16.6934f, 19.8076f, 18.7695f, 7.2047f);
            eVarM.i(6.3955f, 18.1475f);
            eVarM.i(2.8024f, 21.2754f);
            eVarM.i(2.0f, 20.3535f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM, 21.1976f, 3.6465f, 22.0f, 4.5693f);
            eVarM.k(17.8358f, 8.1914f);
            eVarM.i(18.8285f, 9.0176f);
            u62.z.p(eVarM, 14.7959f, 17.6982f, 15.8682f, 9.0164f);
            eVarM.i(7.6635f, 17.0439f);
            eVarM.i(7.8861f, 17.2207f);
            sn.a.x(eVarM, 18.3444f, 20.3318f, 15.335f, 8.4268f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM, 18.9183f, 7.25f, 17.8358f, 8.1914f);
            u4.d.a.b(aVar2, eVarM.f168407a, i14, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var2 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarD = u62.z.d(15.7703f, 6.749f, 5.6996f, 3.6838f, 8.4268f);
            eVarD.o(13.8809f);
            eVarD.i(5.7171f, 15.4971f);
            eVarD.i(4.4179f, 16.6279f);
            eVarD.i(2.0078f, 14.7764f);
            u62.z.p(eVarD, 7.0606f, 4.1992f, 5.2402f, 17.5049f);
            eVarD.i(15.7703f, 6.749f);
            eVarD.c();
            u4.d.a.b(aVar2, eVarD.f168407a, 0, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var3 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarK = tn.k.k(6.8045f, 14.5498f, 5.1871f, 13.1953f, 9.0176f);
            eVarK.i(6.2881f, 8.1016f);
            tn.k.q(eVarK, 14.2163f, 6.8045f, 14.5498f);
            u4.d.a.b(aVar2, eVarK.f168407a, 0, t1Var3, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC = aVar2.c();
            c72.b.f25254a = dVarC;
        }
        u4.d dVarC2 = c72.a.f25253a;
        if (dVarC2 == null) {
            float f15 = (float) 24.0d;
            g6.f.a aVar3 = g6.f.f75994b;
            u4.d.a aVar4 = new u4.d.a("VbtSensorConnected", f15, f15, 24.0f, 24.0f, 0L, 0, true, 96, null);
            o4.t1 t1Var4 = new o4.t1(o4.f0.d(j8), jVar);
            o4.u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            u4.e eVarL = b71.i.l(o4.h1.f128863b, 5.1806f, 9.0181f, 6.2823f, 8.1014f);
            eVarL.i(17.7262f, 8.1014f);
            eVarL.i(18.8281f, 9.0181f);
            eVarL.i(18.8281f, 14.7959f);
            eVarL.i(17.6974f, 15.8684f);
            eVarL.i(8.3733f, 15.8684f);
            sn.a.w(eVarL, 5.1806f, 13.1957f, 9.0181f);
            u4.d.a.b(aVar4, eVarL.f168407a, 0, t1Var4, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var5 = new o4.t1(o4.f0.d(j8), jVar);
            int i15 = o4.h1.f128864c;
            u4.e eVarM2 = com.nimbusds.jose.shaded.gson.internal.a.m(19.8077f, 5.24f, 4.192f, 5.24f);
            eVarM2.i(2.0f, 7.0609f);
            eVarM2.o(14.7768f);
            eVarM2.i(7.1992f, 18.7694f);
            eVarM2.i(19.8078f, 18.7694f);
            eVarM2.i(22.0f, 16.6932f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM2, 22.0f, 7.0609f, 19.8077f, 5.24f);
            eVarM2.k(18.3148f, 6.7487f);
            eVarM2.i(5.6936f, 6.7487f);
            eVarM2.i(3.677f, 8.4266f);
            eVarM2.o(13.8806f);
            eVarM2.i(7.8806f, 17.2211f);
            eVarM2.i(18.3437f, 17.2211f);
            eVarM2.i(20.3316f, 15.3353f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM2, 20.3316f, 8.4265f, 18.3148f, 6.7487f);
            u4.d.a.b(aVar4, eVarM2.f168407a, i15, t1Var5, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC2 = aVar4.c();
            c72.a.f25253a = dVarC2;
        }
        List listK = p13.x.k(dVarC, dVarC2);
        f130591e = listK;
        listK.getClass();
        return listK;
    }

    public static final t62.b B(s62.a aVar) {
        aVar.getClass();
        return t62.b.f162798a;
    }

    public static final double C(ActivityDetailChartDTO activityDetailChartDTO) {
        ArrayList arrayListI = activityDetailChartDTO != null ? I(activityDetailChartDTO, "DIRECTSPEED") : null;
        if (arrayListI == null || arrayListI.isEmpty()) {
            return Double.NaN;
        }
        return arrayListI.stream().filter(new s52.e(new sk0.r1(4), 2)).mapToDouble(new ss.b(new sk0.r1(5), 1)).average().orElse(Double.NaN);
    }

    public static final p005kotlin.reflect.jvm.internal.impl.builtins.d D(p43.n0 n0Var) {
        n0Var.getClass();
        p005kotlin.reflect.jvm.internal.impl.builtins.d dVarE = n0Var.F0().e();
        dVarE.getClass();
        return dVarE;
    }

    public static final c83.a0 E(ru1.a aVar, boolean z14) {
        aVar.getClass();
        if (z14) {
            c83.a0<String> a0VarExecute = aVar.a().execute();
            a0VarExecute.getClass();
            return a0VarExecute;
        }
        c83.a0<String> a0VarExecute2 = aVar.i().execute();
        a0VarExecute2.getClass();
        return a0VarExecute2;
    }

    public static final hn2.c F(Fragment fragment) {
        androidx.fragment.app.m activity = fragment.getActivity();
        if (activity instanceof hn2.c) {
            return (hn2.c) activity;
        }
        return null;
    }

    public static final double G(ActivityDetailChartDTO activityDetailChartDTO) {
        ArrayList arrayListI = activityDetailChartDTO != null ? I(activityDetailChartDTO, "DIRECTSPEED") : null;
        if (arrayListI == null || arrayListI.isEmpty()) {
            return Double.NaN;
        }
        return arrayListI.stream().filter(new s52.e(new sk0.r1(2), 1)).mapToDouble(new ss.b(new sk0.r1(3), 0)).max().orElse(Double.NaN);
    }

    public static final double H(ActivityDetailChartDTO activityDetailChartDTO, fz.c cVar) {
        List<com.garmin.android.apps.connectmobile.activities.newmodel.b> listC;
        cVar.getClass();
        List<com.garmin.android.apps.connectmobile.activities.newmodel.y> listG = activityDetailChartDTO != null ? activityDetailChartDTO.G() : null;
        int i14 = new int[]{ss.a.a(cVar == fz.c.TIME ? "SUMDURATION" : "SUMDISTANCE", listG), ss.a.a("directGradeAdjustedSpeed", listG)}[1];
        double dDoubleValue = 0.0d;
        if (i14 == -1) {
            return 0.0d;
        }
        if (activityDetailChartDTO == null || (listC = activityDetailChartDTO.C()) == null) {
            listC = p13.j0.f134944a;
        }
        Iterator<com.garmin.android.apps.connectmobile.activities.newmodel.b> it = listC.iterator();
        while (it.hasNext()) {
            Double d14 = it.next().C().get(i14);
            if (dDoubleValue < d14.doubleValue()) {
                dDoubleValue = d14.doubleValue();
            }
        }
        return dDoubleValue;
    }

    public static final ArrayList I(ActivityDetailChartDTO activityDetailChartDTO, String str) {
        int iH;
        activityDetailChartDTO.getClass();
        if (activityDetailChartDTO.G() == null || activityDetailChartDTO.G().size() <= 0 || (iH = activityDetailChartDTO.H(str)) == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<com.garmin.android.apps.connectmobile.activities.newmodel.b> it = activityDetailChartDTO.C().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().C().get(iH));
        }
        return arrayList;
    }

    public static final c83.a0 J(ru1.a aVar, boolean z14) {
        aVar.getClass();
        if (z14) {
            c83.a0<String> a0VarExecute = aVar.d().execute();
            a0VarExecute.getClass();
            return a0VarExecute;
        }
        c83.a0<String> a0VarExecute2 = aVar.e().execute();
        a0VarExecute2.getClass();
        return a0VarExecute2;
    }

    public static final c83.a0 K(ru1.a aVar, boolean z14) {
        aVar.getClass();
        if (z14) {
            c83.a0<String> a0VarExecute = aVar.h().execute();
            a0VarExecute.getClass();
            return a0VarExecute;
        }
        c83.a0<String> a0VarExecute2 = aVar.l().execute();
        a0VarExecute2.getClass();
        return a0VarExecute2;
    }

    public static final int L(String str, List list) {
        list.getClass();
        str.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (d53.u.q(((PowerZonesDTO) obj).f43986a, str, false)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((PowerZonesDTO) it.next()).f43987b));
        }
        Integer num = (Integer) p13.h0.d0(arrayList2);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public static final p43.n0 M(t23.d1 d1Var) {
        Object obj;
        d1Var.getClass();
        List<p43.n0> upperBounds = d1Var.getUpperBounds();
        upperBounds.getClass();
        upperBounds.isEmpty();
        List<p43.n0> upperBounds2 = d1Var.getUpperBounds();
        upperBounds2.getClass();
        Iterator<T> it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            t23.h hVarT = ((p43.n0) next).F0().t();
            t23.e eVar = hVarT instanceof t23.e ? (t23.e) hVarT : null;
            if (eVar != null && eVar.getKind() != t23.f.INTERFACE && eVar.getKind() != t23.f.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        p43.n0 n0Var = (p43.n0) obj;
        if (n0Var != null) {
            return n0Var;
        }
        List<p43.n0> upperBounds3 = d1Var.getUpperBounds();
        upperBounds3.getClass();
        Object objB0 = p13.h0.b0(upperBounds3);
        objB0.getClass();
        return (p43.n0) objB0;
    }

    public static final tm1.b N(km1.c cVar) {
        cVar.getClass();
        int iN0 = cVar.n0();
        int iI0 = cVar.i0();
        int iJ0 = cVar.j0();
        int iK0 = cVar.k0();
        int iH0 = cVar.h0();
        km1.v vVarJ = cVar.getDailySleep();
        return new tm1.b(iI0, iJ0, iK0, iH0, iN0, vVarJ != null ? ql1.c.e(vVarJ) : false);
    }

    public static final c83.a0 O(ru1.a aVar, boolean z14) {
        aVar.getClass();
        if (z14) {
            c83.a0<String> a0VarExecute = aVar.k().execute();
            a0VarExecute.getClass();
            return a0VarExecute;
        }
        c83.a0<String> a0VarExecute2 = aVar.f().execute();
        a0VarExecute2.getClass();
        return a0VarExecute2;
    }

    public static final boolean P(pv0.v vVar) {
        vVar.getClass();
        List<pv0.c> list = vVar.f141429b;
        return !(list == null || list.isEmpty());
    }

    public static final boolean Q(t23.d1 d1Var, p43.m1 m1Var, Set set) {
        d1Var.getClass();
        List<p43.n0> upperBounds = d1Var.getUpperBounds();
        upperBounds.getClass();
        if (upperBounds.isEmpty()) {
            return false;
        }
        for (p43.n0 n0Var : upperBounds) {
            n0Var.getClass();
            if (p(n0Var, d1Var.p().F0(), set) && (m1Var == null || p005kotlin.jvm.internal.s.g(n0Var.F0(), m1Var))) {
                return true;
            }
        }
        return false;
    }

    public static final boolean R(p43.n0 n0Var) {
        n0Var.getClass();
        p43.f2 f2VarI0 = n0Var.I0();
        if (f2VarI0 instanceof r43.i) {
            return true;
        }
        return (f2VarI0 instanceof p43.f0) && (((p43.f0) f2VarI0).M0() instanceof r43.i);
    }

    public static final p43.f2 S(p43.n0 n0Var) {
        n0Var.getClass();
        p43.f2 f2VarI = p43.d2.i(n0Var, true);
        f2VarI.getClass();
        return f2VarI;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x0331  */
    /* JADX WARN: Code duplicated, block: B:133:0x0342  */
    /* JADX WARN: Code duplicated, block: B:155:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:? A[LOOP:1: B:62:0x01f0->B:157:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0114  */
    /* JADX WARN: Code duplicated, block: B:48:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:51:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:54:0x01da  */
    /* JADX WARN: Code duplicated, block: B:56:0x01de  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:66:0x0204  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object T(p43.n0 n0Var, q33.t tVar, q33.g0 g0Var, q33.f0 f0Var, e23.q qVar) throws Throwable {
        Throwable th3;
        q23.h hVarU;
        Object objS;
        boolean z14;
        x33.d dVar;
        s23.c cVar;
        x33.b bVarF;
        List<s23.c.a> list;
        Iterator<T> it;
        boolean z15;
        t23.e eVar;
        q33.s.c cVarB;
        q33.g0 g0Var2;
        Object objT;
        int i14;
        n0Var.getClass();
        tVar.getClass();
        g0Var.getClass();
        boolean z16 = g0Var.f142471c;
        f0Var.getClass();
        qVar.getClass();
        f0Var.getClass();
        n0Var.getClass();
        Object objB = null;
        if (p005kotlin.reflect.jvm.internal.impl.builtins.c.i(n0Var)) {
            w23.j0 j0Var = q23.j.f142337a;
            p005kotlin.reflect.jvm.internal.impl.builtins.c.i(n0Var);
            p005kotlin.reflect.jvm.internal.impl.builtins.d dVarD = D(n0Var);
            u23.h annotations = n0Var.getAnnotations();
            p43.n0 n0VarF = p005kotlin.reflect.jvm.internal.impl.builtins.c.f(n0Var);
            List<p43.n0> listD = p005kotlin.reflect.jvm.internal.impl.builtins.c.d(n0Var);
            List<p43.t1> listG = p005kotlin.reflect.jvm.internal.impl.builtins.c.g(n0Var);
            ArrayList arrayList = new ArrayList(p13.y.r(listG, 10));
            Iterator<T> it3 = listG.iterator();
            while (it3.hasNext()) {
                arrayList.add(((p43.t1) it3.next()).getType());
            }
            p43.k1.f135863b.getClass();
            p43.k1 k1Var = p43.k1.f135864c;
            p43.m1 m1VarH = q23.j.f142337a.h();
            p005kotlin.reflect.jvm.internal.impl.builtins.c.h(n0Var);
            p43.n0 type = ((p43.t1) p13.h0.m0(n0Var.D0())).getType();
            type.getClass();
            return T(p005kotlin.reflect.jvm.internal.impl.builtins.c.b(dVarD, annotations, n0VarF, listD, p13.h0.D0(arrayList, p43.q0.e(k1Var, m1VarH, p13.w.c(new p43.v1(type)), false, null)), D(n0Var).p(), false).J0(n0Var.G0()), tVar, g0Var, f0Var, qVar);
        }
        q43.s sVar = q43.s.f142813a;
        sVar.getClass();
        t43.m mVarG = sVar.G(n0Var);
        if (q43.b.a.D(mVarG)) {
            mVarG.getClass();
            if (mVarG instanceof p43.m1) {
                t23.h hVarT = ((p43.m1) mVarG).t();
                hVarT.getClass();
                hVarU = p005kotlin.reflect.jvm.internal.impl.builtins.d.u((t23.e) hVarT);
                th3 = null;
            } else {
                th3 = null;
                vb.h.x(p6.b.h(p005kotlin.jvm.internal.s0.f105811a, mVarG.getClass(), p6.b.j("ClassicTypeSystemContext couldn't handle: ", mVarG, ", ")));
                hVarU = null;
            }
            if (hVarU != null) {
                objB = tVar.c(hVarU);
                if (q43.b.a.M(n0Var)) {
                    z15 = true;
                } else {
                    x33.c cVar2 = h33.c0.f81434p;
                    cVar2.getClass();
                    if (sVar.G0(n0Var, cVar2)) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                }
                objB.getClass();
                if (z15) {
                    objB = tVar.e(objB);
                }
            } else {
                mVarG.getClass();
                if (mVarG instanceof p43.m1) {
                    t23.h hVarT2 = ((p43.m1) mVarG).t();
                    hVarT2.getClass();
                    objS = p005kotlin.reflect.jvm.internal.impl.builtins.d.s((t23.e) hVarT2);
                } else {
                    vb.h.x(p6.b.h(p005kotlin.jvm.internal.s0.f105811a, mVarG.getClass(), p6.b.j("ClassicTypeSystemContext couldn't handle: ", mVarG, ", ")));
                    objS = th3;
                }
                if (objS != null) {
                    StringBuilder sb3 = new StringBuilder("[");
                    g43.d dVar2 = (g43.d) g43.d.f75861n.get(objS);
                    if (dVar2 == null) {
                        g43.d.a(6);
                        throw th3;
                    }
                    sb3.append(dVar2.c());
                    objB = tVar.a(sb3.toString());
                } else {
                    mVarG.getClass();
                    if (mVarG instanceof p43.m1) {
                        t23.h hVarT3 = ((p43.m1) mVarG).t();
                        if (hVarT3 != null && p005kotlin.reflect.jvm.internal.impl.builtins.d.K(hVarT3)) {
                            z14 = true;
                        }
                        if (z14) {
                            mVarG.getClass();
                            if (mVarG instanceof p43.m1) {
                                t23.h hVarT4 = ((p43.m1) mVarG).t();
                                hVarT4.getClass();
                                int i15 = f43.e.f68881a;
                                x33.d dVarF = b43.i.f((t23.e) hVarT4);
                                dVarF.getClass();
                                dVar = dVarF;
                            } else {
                                vb.h.x(p6.b.h(p005kotlin.jvm.internal.s0.f105811a, mVarG.getClass(), p6.b.j("ClassicTypeSystemContext couldn't handle: ", mVarG, ", ")));
                                dVar = th3;
                            }
                            cVar = s23.c.f156232a;
                            cVar.getClass();
                            bVarF = s23.c.f(dVar);
                            if (bVarF == null) {
                                objB = th3;
                            } else {
                                if (!g0Var.f142475g) {
                                    cVar.getClass();
                                    list = s23.c.f156247p;
                                    if (list != null || !list.isEmpty()) {
                                        it = list.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                if (((s23.c.a) it.next()).f156248a.equals(bVarF)) {
                                                    objB = th3;
                                                }
                                            }
                                        }
                                    }
                                }
                                String strF = g43.c.f(bVarF);
                                strF.getClass();
                                objB = tVar.b(strF);
                            }
                        } else {
                            objB = th3;
                        }
                    } else {
                        vb.h.x(p6.b.h(p005kotlin.jvm.internal.s0.f105811a, mVarG.getClass(), p6.b.j("ClassicTypeSystemContext couldn't handle: ", mVarG, ", ")));
                    }
                    z14 = false;
                    if (z14) {
                        mVarG.getClass();
                        if (mVarG instanceof p43.m1) {
                            t23.h hVarT5 = ((p43.m1) mVarG).t();
                            hVarT5.getClass();
                            int i16 = f43.e.f68881a;
                            x33.d dVarF2 = b43.i.f((t23.e) hVarT5);
                            dVarF2.getClass();
                            dVar = dVarF2;
                        } else {
                            vb.h.x(p6.b.h(p005kotlin.jvm.internal.s0.f105811a, mVarG.getClass(), p6.b.j("ClassicTypeSystemContext couldn't handle: ", mVarG, ", ")));
                            dVar = th3;
                        }
                        cVar = s23.c.f156232a;
                        cVar.getClass();
                        bVarF = s23.c.f(dVar);
                        if (bVarF == null) {
                            objB = th3;
                        } else {
                            if (!g0Var.f142475g) {
                                cVar.getClass();
                                list = s23.c.f156247p;
                                if (list != null) {
                                    it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (((s23.c.a) it.next()).f156248a.equals(bVarF)) {
                                                objB = th3;
                                            }
                                        }
                                    }
                                } else {
                                    it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (((s23.c.a) it.next()).f156248a.equals(bVarF)) {
                                                objB = th3;
                                            }
                                        }
                                    }
                                }
                            }
                            String strF2 = g43.c.f(bVarF);
                            strF2.getClass();
                            objB = tVar.b(strF2);
                        }
                    } else {
                        objB = th3;
                    }
                }
            }
        } else {
            th3 = null;
        }
        if (objB != null) {
            if (g0Var.f142469a) {
                objB = tVar.e(objB);
            }
            qVar.invoke(n0Var, objB, g0Var);
            return objB;
        }
        p43.m1 m1VarF0 = n0Var.F0();
        if (m1VarF0 instanceof p43.m0) {
            p43.m0 m0Var = (p43.m0) m1VarF0;
            p43.n0 n0Var2 = m0Var.f135885a;
            if (n0Var2 != null) {
                return T(Y(n0Var2), tVar, g0Var, f0Var, qVar);
            }
            LinkedHashSet<p43.n0> linkedHashSet = m0Var.f135886b;
            linkedHashSet.getClass();
            throw new AssertionError("There should be no intersection type in existing descriptors, but found: ".concat(p13.h0.k0(linkedHashSet, null, null, null, null, 63)));
        }
        t23.h hVarT6 = m1VarF0.t();
        if (hVarT6 == null) {
            j20.x.k(n0Var, "no descriptor for type constructor of ");
            return th3;
        }
        if (r43.l.f(hVarT6)) {
            return tVar.b("error/NonExistentClass");
        }
        boolean z17 = hVarT6 instanceof t23.e;
        if (z17 && p005kotlin.reflect.jvm.internal.impl.builtins.d.z(n0Var)) {
            if (n0Var.D0().size() != 1) {
                org.apache.commons.lang3.e.w("arrays must have one type argument");
                return th3;
            }
            p43.t1 t1Var = n0Var.D0().get(0);
            p43.n0 type2 = t1Var.getType();
            type2.getClass();
            if (t1Var.a() == p43.g2.IN_VARIANCE) {
                objT = tVar.b("java/lang/Object");
            } else {
                p43.g2 g2VarA = t1Var.a();
                g2VarA.getClass();
                if (z16 || ((i14 = q33.g0.b.f142480a[g2VarA.ordinal()]) == 1 ? (g0Var2 = g0Var.f142476h) == null : !(i14 == 2 ? (g0Var2 = g0Var.f142477i) != null : (g0Var2 = g0Var.f142474f) != null))) {
                    g0Var2 = g0Var;
                }
                objT = T(type2, tVar, g0Var2, f0Var, qVar);
            }
            return tVar.a("[".concat(tVar.f(objT)));
        }
        if (!z17) {
            if (hVarT6 instanceof t23.d1) {
                p43.n0 n0VarM = M((t23.d1) hVarT6);
                if (n0Var.G0()) {
                    n0VarM = S(n0VarM);
                }
                return T(n0VarM, tVar, g0Var, f0Var, z43.h.f202422b);
            }
            if ((hVarT6 instanceof t23.c1) && g0Var.f142478j) {
                return T(((t23.c1) hVarT6).E(), tVar, g0Var, f0Var, qVar);
            }
            j20.x.k(n0Var, "Unknown type ");
            return th3;
        }
        if (b43.j.b(hVarT6) && !g0Var.f142470b) {
            q43.s sVar2 = q43.s.f142813a;
            sVar2.getClass();
            p43.n0 n0Var3 = (p43.n0) p43.e0.b(sVar2, n0Var, new HashSet());
            if (n0Var3 != null) {
                return T(n0Var3, tVar, new q33.g0(g0Var.f142469a, true, g0Var.f142471c, g0Var.f142472d, g0Var.f142473e, g0Var.f142474f, g0Var.f142475g, g0Var.f142476h, g0Var.f142477i, g0Var.f142478j, g0Var.f142479k), f0Var, qVar);
            }
        }
        if (z16) {
            x33.f fVar = p005kotlin.reflect.jvm.internal.impl.builtins.d.f105832e;
            if (p005kotlin.reflect.jvm.internal.impl.builtins.d.b((t23.e) hVarT6, kotlin.reflect.jvm.internal.impl.builtins.f.a.R)) {
                cVarB = tVar.d();
            } else {
                eVar = (t23.e) hVarT6;
                eVar.a().getClass();
                if (eVar.getKind() == t23.f.ENUM_ENTRY) {
                    t23.l lVarD = eVar.d();
                    lVarD.getClass();
                    eVar = (t23.e) lVarD;
                }
                t23.e eVarA = eVar.a();
                eVarA.getClass();
                cVarB = tVar.b(o(eVarA, f0Var));
            }
        } else {
            eVar = (t23.e) hVarT6;
            eVar.a().getClass();
            if (eVar.getKind() == t23.f.ENUM_ENTRY) {
                t23.l lVarD2 = eVar.d();
                lVarD2.getClass();
                eVar = (t23.e) lVarD2;
            }
            t23.e eVarA2 = eVar.a();
            eVarA2.getClass();
            cVarB = tVar.b(o(eVarA2, f0Var));
        }
        qVar.invoke(n0Var, cVarB, g0Var);
        return cVarB;
    }

    public static final int U(int i14, byte[] bArr) {
        return ((bArr[i14 + 1] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[i14] & UnsignedBytes.MAX_VALUE);
    }

    public static final long V(int i14, byte[] bArr) {
        bArr.getClass();
        return ((((long) bArr[i14 + 3]) << 24) & 4278190080L) | (((long) bArr[i14]) & 255) | ((((long) bArr[i14 + 1]) << 8) & 65280) | ((((long) bArr[i14 + 2]) << 16) & 16711680);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0019  */
    public static final sc.k W(p3.m mVar) {
        d4.d dVarA = d4.e.a(mVar);
        p3.x1 x1Var = p3.n.f135158a;
        boolean zB = mVar.B(dVarA);
        Object objQ = mVar.q();
        if (zB) {
            objQ = new sc.k(dVarA);
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new sc.k(dVarA);
                mVar.K(objQ);
            }
        }
        return (sc.k) objQ;
    }

    public static final p43.n0 X(p43.n0 n0Var, u23.h hVar) {
        hVar.getClass();
        return (n0Var.getAnnotations().isEmpty() && hVar.isEmpty()) ? n0Var : n0Var.I0().L0(oe2.f.R(n0Var.E0(), hVar));
    }

    public static final p43.f2 Y(p43.n0 n0Var) {
        p43.v0 v0Var;
        p43.f2 f2VarD;
        n0Var.getClass();
        p43.f2 f2VarI0 = n0Var.I0();
        if (f2VarI0 instanceof p43.f0) {
            p43.f0 f0Var = (p43.f0) f2VarI0;
            p43.v0 v0VarD = f0Var.f135829b;
            if (!v0VarD.F0().getParameters().isEmpty() && v0VarD.F0().t() != null) {
                List<t23.d1> parameters = v0VarD.F0().getParameters();
                parameters.getClass();
                ArrayList arrayList = new ArrayList(p13.y.r(parameters, 10));
                Iterator<T> it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(new p43.c1((t23.d1) it.next()));
                }
                v0VarD = p43.y1.d(v0VarD, arrayList, null, 2);
            }
            p43.v0 v0VarD2 = f0Var.f135830c;
            if (!v0VarD2.F0().getParameters().isEmpty() && v0VarD2.F0().t() != null) {
                List<t23.d1> parameters2 = v0VarD2.F0().getParameters();
                parameters2.getClass();
                ArrayList arrayList2 = new ArrayList(p13.y.r(parameters2, 10));
                Iterator<T> it3 = parameters2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(new p43.c1((t23.d1) it3.next()));
                }
                v0VarD2 = p43.y1.d(v0VarD2, arrayList2, null, 2);
            }
            f2VarD = p43.q0.b(v0VarD, v0VarD2);
        } else {
            if (!(f2VarI0 instanceof p43.v0)) {
                lc.u0.r();
                return null;
            }
            v0Var = (p43.v0) f2VarI0;
            if (!v0Var.F0().getParameters().isEmpty() && v0Var.F0().t() != null) {
                f2VarD = v0Var;
                f2VarD = v0Var;
                List<t23.d1> parameters3 = v0Var.F0().getParameters();
                parameters3.getClass();
                ArrayList arrayList3 = new ArrayList(p13.y.r(parameters3, 10));
                Iterator<T> it4 = parameters3.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(new p43.c1((t23.d1) it4.next()));
                }
                f2VarD = p43.y1.d(v0Var, arrayList3, null, 2);
            }
        }
        f2VarD = v0Var;
        f2VarD = v0Var;
        f2VarD = v0Var;
        return og.a.P(f2VarD, f2VarI0);
    }

    public static final s21.n Z(l01.g gVar) {
        gVar.getClass();
        boolean z14 = gVar.f107860e;
        String str = gVar.f107857b;
        String str2 = gVar.f107858c;
        String str3 = gVar.f107856a;
        Double d14 = gVar.f107859d;
        Integer num = gVar.f107861f;
        return new s21.n(z14, str, str3, d14, str2, num != null ? num.intValue() : Integer.MAX_VALUE);
    }

    public static final void a(e23.a aVar, p3.m mVar, int i14) {
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(194682466);
        if (o0VarE.n(i14 & 1, (i14 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            l72.c1 c1Var = l72.c1.f110940a;
            String strQ = gl1.y.Q(o0VarE, R.string.pregnancy_something_went_wrong);
            String strQ2 = gl1.y.Q(o0VarE, R.string.unable_to_grant_account_access);
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_ok);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            aVar2.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new pf0.j(aVar, 26);
                o0VarE.K(objQ);
            }
            e23.a<Unit> aVar3 = (e23.a) objQ;
            Object objQ2 = o0VarE.q();
            aVar2.getClass();
            if (objQ2 == c2565a) {
                objQ2 = new pf0.j(aVar, 27);
                o0VarE.K(objQ2);
            }
            c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar3, null, (e23.a) objQ2, o0VarE, 6, 0, 728);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p40.r(aVar, i14, 13);
        }
    }

    public static final s21.o a0(l01.h hVar) {
        hVar.getClass();
        Boolean bool = hVar.f107864a;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Iterable iterable = hVar.f107865b;
        if (iterable == null) {
            iterable = p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(p13.y.r(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Z((l01.g) it.next()));
        }
        return new s21.o(zBooleanValue, arrayList);
    }

    public static final void b(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(1892666037);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            e0.f130362a.getClass();
            b82.c.c(e0.f130365d, e0.f130366e, o0VarE, 54);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(i14, 16);
        }
    }

    public static final List b0(s21.o oVar) {
        oVar.getClass();
        s21.o oVarC0 = c0(oVar);
        if (!oVarC0.f156159a) {
            oVarC0 = null;
        }
        List<s21.n> list = oVarC0 != null ? oVarC0.f156160b : null;
        return list == null ? p13.j0.f134944a : list;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    public static final void c(b63.o oVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(1662724667);
        int i15 = (o0VarE.r(oVar) ? 4 : 2) | i14;
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            c.p.f22335a.getClass();
            b.w wVarA = c.p.a(o0VarE);
            b.u onBackPressedDispatcher = wVarA != null ? wVarA.getOnBackPressedDispatcher() : null;
            lc.m0 m0VarI = gl1.y.I(new lc.v0[0], o0VarE);
            boolean zR = o0VarE.r(m0VarI) | o0VarE.r(onBackPressedDispatcher);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new ad0.c(m0VarI, onBackPressedDispatcher, 3);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ad0.c(m0VarI, onBackPressedDispatcher, 3);
                    o0VarE.K(objQ);
                }
            }
            z02.b.a(false, null, null, null, false, z3.f.c(2039923441, new pp.g(m0VarI, 7, oVar, (e23.a) objQ), o0VarE), o0VarE, 196608, 31);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new qn0.b(oVar, i14, i16);
        }
    }

    public static final s21.o c0(s21.o oVar) {
        oVar.getClass();
        boolean z14 = oVar.f156159a;
        List<s21.n> list = oVar.f156160b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((s21.n) obj).f156151a) {
                arrayList.add(obj);
            }
        }
        return new s21.o(z14, p13.h0.N0(arrayList, new s21.r()));
    }

    public static final void d(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-821723279);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            t11.b.f161714a.getClass();
            h82.e.a(t11.b.f161715b, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sv0.b(i14, 24);
        }
    }

    public static final void d0(ByteArrayOutputStream byteArrayOutputStream, int i14) {
        byteArrayOutputStream.getClass();
        byteArrayOutputStream.write(i14 & 255);
        byteArrayOutputStream.write((i14 >> 8) & 255);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(ArrayList arrayList, h4.r rVar, h4.d dVar, uc.j jVar, e23.l lVar, e23.l lVar2, e23.p pVar, e23.a aVar, p3.m mVar, int i14) {
        int i15;
        h4.d dVar2;
        e23.l lVar3;
        p3.o0 o0Var;
        Object obj;
        p3.o0 o0VarE = mVar.E(-1483975592);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(arrayList) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(rVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            dVar2 = dVar;
            i15 |= o0VarE.B(dVar2) ? 256 : 128;
        } else {
            dVar2 = dVar;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(jVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(null) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            lVar3 = lVar;
            i15 |= o0VarE.r(lVar3) ? 131072 : 65536;
        } else {
            lVar3 = lVar;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(lVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(pVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i15 |= o0VarE.r(aVar) ? 67108864 : 33554432;
        }
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (38347923 & i15) != 38347922)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            if (arrayList.isEmpty()) {
                vb.h.s("NavDisplay entries cannot be empty");
                return;
            }
            int i17 = (i15 & 14) | ((i15 >> 6) & 112) | ((i15 >> 18) & 896);
            o0VarE.C(-193177615);
            new uc.h(aVar);
            p3.j0 j0Var = uc.f.f169925a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                obj = objQ;
                Object eVar = new uc.e(null, 1, null);
                o0VarE.K(eVar);
                obj = eVar;
            }
            obj = objQ;
            int i18 = i15;
            ArrayList arrayListC = og2.k.C(arrayList, p13.x.k((uc.e) obj, new sc.i(null, z3.f.c(1077673004, new eb0.a(p3.p0.q(arrayList, o0VarE), 17), o0VarE), 1, false ? 1 : 0)), o0VarE, i17 & 14);
            ArrayList arrayListM = p13.x.m(jVar.a(arrayListC));
            while (true) {
                Object objM0 = p13.h0.m0(arrayListM);
                uc.b bVar = objM0 instanceof uc.b ? (uc.b) objM0 : null;
                List listB = bVar != null ? bVar.b() : null;
                if (listB != null) {
                    if (listB.isEmpty()) {
                        androidx.core.view.j.s("Overlaid entries from ", bVar, " must not be empty");
                        return;
                    }
                    arrayListM.add(jVar.a(listB));
                }
                if (listB == null) {
                    List listV = p13.h0.V(1, arrayListM);
                    ArrayList arrayList2 = new ArrayList(listV.size());
                    int size = listV.size();
                    int i19 = i16;
                    while (i19 < size) {
                        uc.c cVar = (uc.c) listV.get(i19);
                        cVar.getClass();
                        arrayList2.add((uc.b) cVar);
                        i19++;
                        arrayListM = arrayListM;
                    }
                    ArrayList arrayList3 = arrayListM;
                    uc.c cVar2 = (uc.c) p13.h0.m0(arrayList3);
                    uc.c[] cVarArr = new uc.c[1];
                    cVarArr[i16] = p13.h0.b0(arrayList3);
                    ArrayList arrayListM2 = p13.x.m(cVarArr);
                    while (true) {
                        uc.c cVar3 = (uc.c) p13.h0.d0(arrayListM2);
                        List listA = cVar3 != null ? cVar3.a() : null;
                        if (listA != null && !listA.isEmpty()) {
                            arrayListM2.add(i16, jVar.a(listA));
                        }
                        if (listA == null || listA.isEmpty()) {
                            break;
                        } else {
                            i16 = 0;
                        }
                    }
                    arrayListM2.remove(cVar2);
                    uc.g gVar = new uc.g(arrayListC, arrayList2, cVar2, arrayListM2);
                    p3.x1 x1Var2 = p3.n.f135158a;
                    o0VarE.g0(false);
                    uc.c<T> cVar4 = gVar.f169928c;
                    uc.d dVar3 = new uc.d(cVar4);
                    Collection collection = gVar.f169929d;
                    ArrayList arrayList4 = new ArrayList(p13.y.r(collection, 10));
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(new uc.d((uc.c) it.next()));
                    }
                    p13.j0 j0Var2 = p13.j0.f134944a;
                    p3.x1 x1Var3 = p3.n.f135158a;
                    Object objQ2 = o0VarE.q();
                    Object obj2 = p3.m.a.f135155b;
                    Object obj3 = objQ2;
                    if (objQ2 == obj2) {
                        Object eVar2 = new xc.e(dVar3, arrayList4, j0Var2);
                        o0VarE.K(eVar2);
                        obj3 = eVar2;
                    }
                    xc.e eVar3 = (xc.e) obj3;
                    boolean zR = o0VarE.r(dVar3) | o0VarE.r(arrayList4) | o0VarE.r(j0Var2);
                    Object objQ3 = o0VarE.q();
                    if (zR || objQ3 == obj2) {
                        objQ3 = new ug2.k(eVar3, dVar3, arrayList4, j0Var2, 20);
                        o0VarE.K(objQ3);
                    }
                    p3.l0.i((e23.a) objQ3, o0VarE);
                    boolean z14 = !cVar4.a().isEmpty();
                    boolean zR2 = o0VarE.r(arrayList) | o0VarE.B(cVar4) | ((i18 & 234881024) == 67108864);
                    Object objQ4 = o0VarE.q();
                    Object obj4 = objQ4;
                    if (zR2 || objQ4 == obj2) {
                        Object b0Var = new ug2.b0(arrayList, 2, cVar4, aVar);
                        o0VarE.K(b0Var);
                        obj4 = b0Var;
                    }
                    w52.u0.c(eVar3, z14, null, (e23.a) obj4, o0VarE, 0);
                    g(gVar, eVar3, rVar, dVar2, lVar3, lVar2, pVar, o0VarE, ((i18 << 3) & 8064) | (i18 & 57344) | (i18 & 458752) | (i18 & 3670016) | (i18 & 29360128));
                    o0Var = o0VarE;
                    break;
                }
                dVar2 = dVar;
                lVar3 = lVar;
                i16 = 0;
            }
        } else {
            o0VarE.e();
            o0Var = o0VarE;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bt1.o(arrayList, rVar, dVar, jVar, lVar, lVar2, pVar, aVar, i14);
        }
    }

    public static final void e0(ByteArrayOutputStream byteArrayOutputStream, long j8) {
        byteArrayOutputStream.getClass();
        byteArrayOutputStream.write((int) (j8 & 255));
        byteArrayOutputStream.write((int) ((j8 >> 8) & 255));
        byteArrayOutputStream.write((int) ((j8 >> 16) & 255));
        byteArrayOutputStream.write((int) ((j8 >> 24) & 255));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01cf A[LOOP:1: B:100:0x01c9->B:102:0x01cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x0214  */
    /* JADX WARN: Code duplicated, block: B:108:0x021a  */
    /* JADX WARN: Code duplicated, block: B:111:0x022c  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Code duplicated, block: B:21:0x004f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    /* JADX WARN: Code duplicated, block: B:33:0x006f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x007a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0086  */
    /* JADX WARN: Code duplicated, block: B:44:0x0090  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:73:0x0103  */
    /* JADX WARN: Code duplicated, block: B:75:0x010a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0126  */
    /* JADX WARN: Code duplicated, block: B:82:0x0132  */
    /* JADX WARN: Code duplicated, block: B:85:0x0142  */
    /* JADX WARN: Code duplicated, block: B:86:0x015a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0174  */
    /* JADX WARN: Code duplicated, block: B:91:0x018e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0195  */
    /* JADX WARN: Code duplicated, block: B:95:0x0199  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a8 A[LOOP:0: B:96:0x01a6->B:97:0x01a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x01ba  */
    public static final void f(List list, h4.r rVar, h4.d dVar, e23.a aVar, List list2, uc.j jVar, e23.l lVar, e23.l lVar2, e23.p pVar, s70.b0 b0Var, p3.m mVar, int i14, int i15) {
        e23.a aVar2;
        int i16;
        e23.l dVar2;
        e23.l dVar3;
        e23.p pVar2;
        int i17;
        int i18;
        boolean z14;
        p3.o0 o0Var;
        h4.r rVar2;
        h4.d dVar4;
        e23.a aVar3;
        uc.j jVar2;
        p3.p2 p2VarI0;
        int i19;
        p3.m.a aVar4;
        h4.r.a aVar5;
        h4.g gVar;
        uc.j jVar3;
        int i24;
        e23.a aVar6;
        e23.l lVar3;
        e23.p aVar7;
        h4.d dVar5;
        uc.j jVar4;
        int i25;
        h4.r rVar3;
        int i26;
        e23.l lVar4;
        boolean zR;
        Object objQ;
        boolean zB;
        Object objQ2;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        int size;
        p3.o0 o0VarE = mVar.E(807086421);
        int i27 = i14 | (o0VarE.r(list) ? 4 : 2) | 432;
        if ((i15 & 8) == 0) {
            aVar2 = aVar;
            int i28 = o0VarE.r(aVar2) ? 2048 : 1024;
            int i29 = i27 | i28;
            if (o0VarE.r(list2)) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            int i30 = i29 | i16 | 1638400;
            if ((i15 & 128) == 0) {
                dVar2 = lVar;
                int i34 = o0VarE.r(dVar2) ? 8388608 : 4194304;
                int i35 = i30 | i34;
                if ((i15 & 256) == 0) {
                    dVar3 = lVar2;
                    int i36 = o0VarE.r(dVar3) ? 67108864 : 33554432;
                    int i37 = i35 | i36;
                    if ((i15 & 512) == 0) {
                        pVar2 = pVar;
                        int i38 = o0VarE.r(pVar2) ? 536870912 : 268435456;
                        i17 = i37 | i38;
                        i18 = o0VarE.r(b0Var) ? 4 : 2;
                        if ((306783379 & i17) == 306783378 || (i18 & 3) != 2) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (o0VarE.n(i17 & 1, z14)) {
                            o0VarE.G0();
                            i19 = i14 & 1;
                            aVar4 = p3.m.f135153a;
                            if (i19 != 0 || o0VarE.o0()) {
                                aVar5 = h4.r.S;
                                h4.d.f81522a.getClass();
                                gVar = h4.d.a.f81524b;
                                if ((i15 & 8) != 0) {
                                    zR = o0VarE.r(list);
                                    objQ = o0VarE.q();
                                    if (zR) {
                                        objQ = new ad.b(list, 11);
                                        o0VarE.K(objQ);
                                    } else {
                                        aVar4.getClass();
                                        if (objQ == p3.m.a.f135155b) {
                                            objQ = new ad.b(list, 11);
                                            o0VarE.K(objQ);
                                        }
                                    }
                                    aVar2 = (e23.a) objQ;
                                    i17 &= -7169;
                                }
                                jVar3 = new uc.j();
                                i24 = i17 & (-458753);
                                if ((i15 & 128) != 0) {
                                    dVar2 = new vb1.d(7);
                                    i24 = i17 & (-29818881);
                                }
                                if ((i15 & 256) != 0) {
                                    i24 &= -234881025;
                                    dVar3 = new vb1.d(8);
                                }
                                if ((i15 & 512) != 0) {
                                    int i39 = i24 & (-1879048193);
                                    aVar7 = new uj1.a(28);
                                    aVar6 = aVar2;
                                    lVar4 = dVar2;
                                    lVar3 = dVar3;
                                    dVar5 = gVar;
                                    jVar4 = jVar3;
                                    i25 = 0;
                                    rVar3 = aVar5;
                                    i26 = i39;
                                } else {
                                    aVar6 = aVar2;
                                    lVar3 = dVar3;
                                    aVar7 = pVar2;
                                    dVar5 = gVar;
                                    jVar4 = jVar3;
                                    i25 = 0;
                                    rVar3 = aVar5;
                                    i26 = i24;
                                    lVar4 = dVar2;
                                }
                            } else {
                                o0VarE.e();
                                if ((i15 & 8) != 0) {
                                    i17 &= -7169;
                                }
                                i26 = i17 & (-458753);
                                if ((i15 & 128) != 0) {
                                    i26 = i17 & (-29818881);
                                }
                                if ((i15 & 256) != 0) {
                                    i26 &= -234881025;
                                }
                                if ((i15 & 512) != 0) {
                                    i26 &= -1879048193;
                                }
                                rVar3 = rVar;
                                dVar5 = dVar;
                                jVar4 = jVar;
                                aVar6 = aVar2;
                                lVar4 = dVar2;
                                lVar3 = dVar3;
                                aVar7 = pVar2;
                                i25 = 0;
                            }
                            o0VarE.h0();
                            p3.x1 x1Var = p3.n.f135158a;
                            if (!list.isEmpty()) {
                                vb.h.s("NavDisplay backstack cannot be empty");
                                return;
                            }
                            int i44 = ((i18 << 6) & 896) | (i26 & 14) | ((i26 >> 9) & 112);
                            zB = o0VarE.B(p13.h0.b1(list));
                            objQ2 = o0VarE.q();
                            if (zB) {
                                if (list instanceof RandomAccess) {
                                    arrayList2 = new ArrayList(list.size());
                                    size = list.size();
                                    while (i25 < size) {
                                        arrayList2.add((sc.h) b0Var.invoke(list.get(i25)));
                                        i25++;
                                    }
                                    objQ2 = arrayList2;
                                } else {
                                    arrayList = new ArrayList(p13.y.r(list, 10));
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add((sc.h) b0Var.invoke(it.next()));
                                    }
                                    objQ2 = arrayList;
                                }
                                o0VarE.K(objQ2);
                            } else {
                                aVar4.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    if (list instanceof RandomAccess) {
                                        arrayList2 = new ArrayList(list.size());
                                        size = list.size();
                                        while (i25 < size) {
                                            arrayList2.add((sc.h) b0Var.invoke(list.get(i25)));
                                            i25++;
                                        }
                                        objQ2 = arrayList2;
                                    } else {
                                        arrayList = new ArrayList(p13.y.r(list, 10));
                                        it = list.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add((sc.h) b0Var.invoke(it.next()));
                                        }
                                        objQ2 = arrayList;
                                    }
                                    o0VarE.K(objQ2);
                                }
                            }
                            ArrayList arrayListC = og2.k.C((List) objQ2, list2, o0VarE, i44 & 112);
                            p3.x1 x1Var2 = p3.n.f135158a;
                            int i45 = i26 >> 6;
                            o0Var = o0VarE;
                            e(arrayListC, rVar3, dVar5, jVar4, lVar4, lVar3, aVar7, aVar6, o0Var, (i45 & 29360128) | (458752 & i45) | 25008 | (3670016 & i45) | ((i26 << 15) & 234881024));
                            rVar2 = rVar3;
                            dVar4 = dVar5;
                            jVar2 = jVar4;
                            dVar2 = lVar4;
                            dVar3 = lVar3;
                            pVar2 = aVar7;
                            aVar3 = aVar6;
                        } else {
                            o0Var = o0VarE;
                            o0Var.e();
                            rVar2 = rVar;
                            dVar4 = dVar;
                            aVar3 = aVar2;
                            jVar2 = jVar;
                        }
                        p2VarI0 = o0Var.i0();
                        if (p2VarI0 != null) {
                            p2VarI0.f135219d = new s4(list, rVar2, dVar4, aVar3, list2, jVar2, dVar2, dVar3, pVar2, b0Var, i14, i15);
                        }
                    }
                    pVar2 = pVar;
                    i17 = i37 | i38;
                    if (o0VarE.r(b0Var)) {
                    }
                    if ((306783379 & i17) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (o0VarE.n(i17 & 1, z14)) {
                        o0VarE.G0();
                        i19 = i14 & 1;
                        aVar4 = p3.m.f135153a;
                        if (i19 != 0) {
                            aVar5 = h4.r.S;
                            h4.d.f81522a.getClass();
                            gVar = h4.d.a.f81524b;
                            if ((i15 & 8) != 0) {
                                zR = o0VarE.r(list);
                                objQ = o0VarE.q();
                                if (zR) {
                                    aVar4.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new ad.b(list, 11);
                                        o0VarE.K(objQ);
                                    }
                                } else {
                                    objQ = new ad.b(list, 11);
                                    o0VarE.K(objQ);
                                }
                                aVar2 = (e23.a) objQ;
                                i17 &= -7169;
                            }
                            jVar3 = new uc.j();
                            i24 = i17 & (-458753);
                            if ((i15 & 128) != 0) {
                                dVar2 = new vb1.d(7);
                                i24 = i17 & (-29818881);
                            }
                            if ((i15 & 256) != 0) {
                                i24 &= -234881025;
                                dVar3 = new vb1.d(8);
                            }
                            if ((i15 & 512) != 0) {
                                int i310 = i24 & (-1879048193);
                                aVar7 = new uj1.a(28);
                                aVar6 = aVar2;
                                lVar4 = dVar2;
                                lVar3 = dVar3;
                                dVar5 = gVar;
                                jVar4 = jVar3;
                                i25 = 0;
                                rVar3 = aVar5;
                                i26 = i310;
                            } else {
                                aVar6 = aVar2;
                                lVar3 = dVar3;
                                aVar7 = pVar2;
                                dVar5 = gVar;
                                jVar4 = jVar3;
                                i25 = 0;
                                rVar3 = aVar5;
                                i26 = i24;
                                lVar4 = dVar2;
                            }
                        } else {
                            aVar5 = h4.r.S;
                            h4.d.f81522a.getClass();
                            gVar = h4.d.a.f81524b;
                            if ((i15 & 8) != 0) {
                                zR = o0VarE.r(list);
                                objQ = o0VarE.q();
                                if (zR) {
                                    aVar4.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new ad.b(list, 11);
                                        o0VarE.K(objQ);
                                    }
                                } else {
                                    objQ = new ad.b(list, 11);
                                    o0VarE.K(objQ);
                                }
                                aVar2 = (e23.a) objQ;
                                i17 &= -7169;
                            }
                            jVar3 = new uc.j();
                            i24 = i17 & (-458753);
                            if ((i15 & 128) != 0) {
                                dVar2 = new vb1.d(7);
                                i24 = i17 & (-29818881);
                            }
                            if ((i15 & 256) != 0) {
                                i24 &= -234881025;
                                dVar3 = new vb1.d(8);
                            }
                            if ((i15 & 512) != 0) {
                                int i311 = i24 & (-1879048193);
                                aVar7 = new uj1.a(28);
                                aVar6 = aVar2;
                                lVar4 = dVar2;
                                lVar3 = dVar3;
                                dVar5 = gVar;
                                jVar4 = jVar3;
                                i25 = 0;
                                rVar3 = aVar5;
                                i26 = i311;
                            } else {
                                aVar6 = aVar2;
                                lVar3 = dVar3;
                                aVar7 = pVar2;
                                dVar5 = gVar;
                                jVar4 = jVar3;
                                i25 = 0;
                                rVar3 = aVar5;
                                i26 = i24;
                                lVar4 = dVar2;
                            }
                        }
                        o0VarE.h0();
                        p3.x1 x1Var3 = p3.n.f135158a;
                        if (!list.isEmpty()) {
                            vb.h.s("NavDisplay backstack cannot be empty");
                            return;
                        }
                        int i46 = ((i18 << 6) & 896) | (i26 & 14) | ((i26 >> 9) & 112);
                        zB = o0VarE.B(p13.h0.b1(list));
                        objQ2 = o0VarE.q();
                        if (zB) {
                            aVar4.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                if (list instanceof RandomAccess) {
                                    arrayList2 = new ArrayList(list.size());
                                    size = list.size();
                                    while (i25 < size) {
                                        arrayList2.add((sc.h) b0Var.invoke(list.get(i25)));
                                        i25++;
                                    }
                                    objQ2 = arrayList2;
                                } else {
                                    arrayList = new ArrayList(p13.y.r(list, 10));
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add((sc.h) b0Var.invoke(it.next()));
                                    }
                                    objQ2 = arrayList;
                                }
                                o0VarE.K(objQ2);
                            }
                        } else {
                            if (list instanceof RandomAccess) {
                                arrayList2 = new ArrayList(list.size());
                                size = list.size();
                                while (i25 < size) {
                                    arrayList2.add((sc.h) b0Var.invoke(list.get(i25)));
                                    i25++;
                                }
                                objQ2 = arrayList2;
                            } else {
                                arrayList = new ArrayList(p13.y.r(list, 10));
                                it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add((sc.h) b0Var.invoke(it.next()));
                                }
                                objQ2 = arrayList;
                            }
                            o0VarE.K(objQ2);
                        }
                        ArrayList arrayListC2 = og2.k.C((List) objQ2, list2, o0VarE, i46 & 112);
                        p3.x1 x1Var4 = p3.n.f135158a;
                        int i47 = i26 >> 6;
                        o0Var = o0VarE;
                        e(arrayListC2, rVar3, dVar5, jVar4, lVar4, lVar3, aVar7, aVar6, o0Var, (i47 & 29360128) | (458752 & i47) | 25008 | (3670016 & i47) | ((i26 << 15) & 234881024));
                        rVar2 = rVar3;
                        dVar4 = dVar5;
                        jVar2 = jVar4;
                        dVar2 = lVar4;
                        dVar3 = lVar3;
                        pVar2 = aVar7;
                        aVar3 = aVar6;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        rVar2 = rVar;
                        dVar4 = dVar;
                        aVar3 = aVar2;
                        jVar2 = jVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new s4(list, rVar2, dVar4, aVar3, list2, jVar2, dVar2, dVar3, pVar2, b0Var, i14, i15);
                    }
                }
                dVar3 = lVar2;
                int i312 = i35 | i36;
                if ((i15 & 512) == 0) {
                    pVar2 = pVar;
                    if (o0VarE.r(pVar2)) {
                    }
                    i17 = i312 | i38;
                    if (o0VarE.r(b0Var)) {
                    }
                    if ((306783379 & i17) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (o0VarE.n(i17 & 1, z14)) {
                        o0VarE.G0();
                        i19 = i14 & 1;
                        aVar4 = p3.m.f135153a;
                        if (i19 != 0) {
                            aVar5 = h4.r.S;
                            h4.d.f81522a.getClass();
                            gVar = h4.d.a.f81524b;
                            if ((i15 & 8) != 0) {
                                zR = o0VarE.r(list);
                                objQ = o0VarE.q();
                                if (zR) {
                                    aVar4.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new ad.b(list, 11);
                                        o0VarE.K(objQ);
                                    }
                                } else {
                                    objQ = new ad.b(list, 11);
                                    o0VarE.K(objQ);
                                }
                                aVar2 = (e23.a) objQ;
                                i17 &= -7169;
                            }
                            jVar3 = new uc.j();
                            i24 = i17 & (-458753);
                            if ((i15 & 128) != 0) {
                                dVar2 = new vb1.d(7);
                                i24 = i17 & (-29818881);
                            }
                            if ((i15 & 256) != 0) {
                                i24 &= -234881025;
                                dVar3 = new vb1.d(8);
                            }
                            if ((i15 & 512) != 0) {
                                int i313 = i24 & (-1879048193);
                                aVar7 = new uj1.a(28);
                                aVar6 = aVar2;
                                lVar4 = dVar2;
                                lVar3 = dVar3;
                                dVar5 = gVar;
                                jVar4 = jVar3;
                                i25 = 0;
                                rVar3 = aVar5;
                                i26 = i313;
                            } else {
                                aVar6 = aVar2;
                                lVar3 = dVar3;
                                aVar7 = pVar2;
                                dVar5 = gVar;
                                jVar4 = jVar3;
                                i25 = 0;
                                rVar3 = aVar5;
                                i26 = i24;
                                lVar4 = dVar2;
                            }
                        } else {
                            aVar5 = h4.r.S;
                            h4.d.f81522a.getClass();
                            gVar = h4.d.a.f81524b;
                            if ((i15 & 8) != 0) {
                                zR = o0VarE.r(list);
                                objQ = o0VarE.q();
                                if (zR) {
                                    aVar4.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new ad.b(list, 11);
                                        o0VarE.K(objQ);
                                    }
                                } else {
                                    objQ = new ad.b(list, 11);
                                    o0VarE.K(objQ);
                                }
                                aVar2 = (e23.a) objQ;
                                i17 &= -7169;
                            }
                            jVar3 = new uc.j();
                            i24 = i17 & (-458753);
                            if ((i15 & 128) != 0) {
                                dVar2 = new vb1.d(7);
                                i24 = i17 & (-29818881);
                            }
                            if ((i15 & 256) != 0) {
                                i24 &= -234881025;
                                dVar3 = new vb1.d(8);
                            }
                            if ((i15 & 512) != 0) {
                                int i314 = i24 & (-1879048193);
                                aVar7 = new uj1.a(28);
                                aVar6 = aVar2;
                                lVar4 = dVar2;
                                lVar3 = dVar3;
                                dVar5 = gVar;
                                jVar4 = jVar3;
                                i25 = 0;
                                rVar3 = aVar5;
                                i26 = i314;
                            } else {
                                aVar6 = aVar2;
                                lVar3 = dVar3;
                                aVar7 = pVar2;
                                dVar5 = gVar;
                                jVar4 = jVar3;
                                i25 = 0;
                                rVar3 = aVar5;
                                i26 = i24;
                                lVar4 = dVar2;
                            }
                        }
                        o0VarE.h0();
                        p3.x1 x1Var5 = p3.n.f135158a;
                        if (!list.isEmpty()) {
                            vb.h.s("NavDisplay backstack cannot be empty");
                            return;
                        }
                        int i48 = ((i18 << 6) & 896) | (i26 & 14) | ((i26 >> 9) & 112);
                        zB = o0VarE.B(p13.h0.b1(list));
                        objQ2 = o0VarE.q();
                        if (zB) {
                            aVar4.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                if (list instanceof RandomAccess) {
                                    arrayList2 = new ArrayList(list.size());
                                    size = list.size();
                                    while (i25 < size) {
                                        arrayList2.add((sc.h) b0Var.invoke(list.get(i25)));
                                        i25++;
                                    }
                                    objQ2 = arrayList2;
                                } else {
                                    arrayList = new ArrayList(p13.y.r(list, 10));
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add((sc.h) b0Var.invoke(it.next()));
                                    }
                                    objQ2 = arrayList;
                                }
                                o0VarE.K(objQ2);
                            }
                        } else {
                            if (list instanceof RandomAccess) {
                                arrayList2 = new ArrayList(list.size());
                                size = list.size();
                                while (i25 < size) {
                                    arrayList2.add((sc.h) b0Var.invoke(list.get(i25)));
                                    i25++;
                                }
                                objQ2 = arrayList2;
                            } else {
                                arrayList = new ArrayList(p13.y.r(list, 10));
                                it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add((sc.h) b0Var.invoke(it.next()));
                                }
                                objQ2 = arrayList;
                            }
                            o0VarE.K(objQ2);
                        }
                        ArrayList arrayListC3 = og2.k.C((List) objQ2, list2, o0VarE, i48 & 112);
                        p3.x1 x1Var6 = p3.n.f135158a;
                        int i49 = i26 >> 6;
                        o0Var = o0VarE;
                        e(arrayListC3, rVar3, dVar5, jVar4, lVar4, lVar3, aVar7, aVar6, o0Var, (i49 & 29360128) | (458752 & i49) | 25008 | (3670016 & i49) | ((i26 << 15) & 234881024));
                        rVar2 = rVar3;
                        dVar4 = dVar5;
                        jVar2 = jVar4;
                        dVar2 = lVar4;
                        dVar3 = lVar3;
                        pVar2 = aVar7;
                        aVar3 = aVar6;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        rVar2 = rVar;
                        dVar4 = dVar;
                        aVar3 = aVar2;
                        jVar2 = jVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new s4(list, rVar2, dVar4, aVar3, list2, jVar2, dVar2, dVar3, pVar2, b0Var, i14, i15);
                    }
                }
                pVar2 = pVar;
                i17 = i312 | i38;
                if (o0VarE.r(b0Var)) {
                }
                if ((306783379 & i17) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (o0VarE.n(i17 & 1, z14)) {
                    o0VarE.G0();
                    i19 = i14 & 1;
                    aVar4 = p3.m.f135153a;
                    if (i19 != 0) {
                        aVar5 = h4.r.S;
                        h4.d.f81522a.getClass();
                        gVar = h4.d.a.f81524b;
                        if ((i15 & 8) != 0) {
                            zR = o0VarE.r(list);
                            objQ = o0VarE.q();
                            if (zR) {
                                aVar4.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new ad.b(list, 11);
                                    o0VarE.K(objQ);
                                }
                            } else {
                                objQ = new ad.b(list, 11);
                                o0VarE.K(objQ);
                            }
                            aVar2 = (e23.a) objQ;
                            i17 &= -7169;
                        }
                        jVar3 = new uc.j();
                        i24 = i17 & (-458753);
                        if ((i15 & 128) != 0) {
                            dVar2 = new vb1.d(7);
                            i24 = i17 & (-29818881);
                        }
                        if ((i15 & 256) != 0) {
                            i24 &= -234881025;
                            dVar3 = new vb1.d(8);
                        }
                        if ((i15 & 512) != 0) {
                            int i315 = i24 & (-1879048193);
                            aVar7 = new uj1.a(28);
                            aVar6 = aVar2;
                            lVar4 = dVar2;
                            lVar3 = dVar3;
                            dVar5 = gVar;
                            jVar4 = jVar3;
                            i25 = 0;
                            rVar3 = aVar5;
                            i26 = i315;
                        } else {
                            aVar6 = aVar2;
                            lVar3 = dVar3;
                            aVar7 = pVar2;
                            dVar5 = gVar;
                            jVar4 = jVar3;
                            i25 = 0;
                            rVar3 = aVar5;
                            i26 = i24;
                            lVar4 = dVar2;
                        }
                    } else {
                        aVar5 = h4.r.S;
                        h4.d.f81522a.getClass();
                        gVar = h4.d.a.f81524b;
                        if ((i15 & 8) != 0) {
                            zR = o0VarE.r(list);
                            objQ = o0VarE.q();
                            if (zR) {
                                aVar4.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new ad.b(list, 11);
                                    o0VarE.K(objQ);
                                }
                            } else {
                                objQ = new ad.b(list, 11);
                                o0VarE.K(objQ);
                            }
                            aVar2 = (e23.a) objQ;
                            i17 &= -7169;
                        }
                        jVar3 = new uc.j();
                        i24 = i17 & (-458753);
                        if ((i15 & 128) != 0) {
                            dVar2 = new vb1.d(7);
                            i24 = i17 & (-29818881);
                        }
                        if ((i15 & 256) != 0) {
                            i24 &= -234881025;
                            dVar3 = new vb1.d(8);
                        }
                        if ((i15 & 512) != 0) {
                            int i316 = i24 & (-1879048193);
                            aVar7 = new uj1.a(28);
                            aVar6 = aVar2;
                            lVar4 = dVar2;
                            lVar3 = dVar3;
                            dVar5 = gVar;
                            jVar4 = jVar3;
                            i25 = 0;
                            rVar3 = aVar5;
                            i26 = i316;
                        } else {
                            aVar6 = aVar2;
                            lVar3 = dVar3;
                            aVar7 = pVar2;
                            dVar5 = gVar;
                            jVar4 = jVar3;
                            i25 = 0;
                            rVar3 = aVar5;
                            i26 = i24;
                            lVar4 = dVar2;
                        }
                    }
                    o0VarE.h0();
                    p3.x1 x1Var7 = p3.n.f135158a;
                    if (!list.isEmpty()) {
                        vb.h.s("NavDisplay backstack cannot be empty");
                        return;
                    }
                    int i410 = ((i18 << 6) & 896) | (i26 & 14) | ((i26 >> 9) & 112);
                    zB = o0VarE.B(p13.h0.b1(list));
                    objQ2 = o0VarE.q();
                    if (zB) {
                        aVar4.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            if (list instanceof RandomAccess) {
                                arrayList2 = new ArrayList(list.size());
                                size = list.size();
                                while (i25 < size) {
                                    arrayList2.add((sc.h) b0Var.invoke(list.get(i25)));
                                    i25++;
                                }
                                objQ2 = arrayList2;
                            } else {
                                arrayList = new ArrayList(p13.y.r(list, 10));
                                it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add((sc.h) b0Var.invoke(it.next()));
                                }
                                objQ2 = arrayList;
                            }
                            o0VarE.K(objQ2);
                        }
                    } else {
                        if (list instanceof RandomAccess) {
                            arrayList2 = new ArrayList(list.size());
                            size = list.size();
                            while (i25 < size) {
                                arrayList2.add((sc.h) b0Var.invoke(list.get(i25)));
                                i25++;
                            }
                            objQ2 = arrayList2;
                        } else {
                            arrayList = new ArrayList(p13.y.r(list, 10));
                            it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add((sc.h) b0Var.invoke(it.next()));
                            }
                            objQ2 = arrayList;
                        }
                        o0VarE.K(objQ2);
                    }
                    ArrayList arrayListC4 = og2.k.C((List) objQ2, list2, o0VarE, i410 & 112);
                    p3.x1 x1Var8 = p3.n.f135158a;
                    int i411 = i26 >> 6;
                    o0Var = o0VarE;
                    e(arrayListC4, rVar3, dVar5, jVar4, lVar4, lVar3, aVar7, aVar6, o0Var, (i411 & 29360128) | (458752 & i411) | 25008 | (3670016 & i411) | ((i26 << 15) & 234881024));
                    rVar2 = rVar3;
                    dVar4 = dVar5;
                    jVar2 = jVar4;
                    dVar2 = lVar4;
                    dVar3 = lVar3;
                    pVar2 = aVar7;
                    aVar3 = aVar6;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    rVar2 = rVar;
                    dVar4 = dVar;
                    aVar3 = aVar2;
                    jVar2 = jVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new s4(list, rVar2, dVar4, aVar3, list2, jVar2, dVar2, dVar3, pVar2, b0Var, i14, i15);
                }
            }
            dVar2 = lVar;
            int i317 = i30 | i34;
            if ((i15 & 256) == 0) {
                dVar3 = lVar2;
                if (o0VarE.r(dVar3)) {
                }
                int i318 = i317 | i36;
                if ((i15 & 512) == 0) {
                    pVar2 = pVar;
                    if (o0VarE.r(pVar2)) {
                    }
                    i17 = i318 | i38;
                    if (o0VarE.r(b0Var)) {
                    }
                    if ((306783379 & i17) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (o0VarE.n(i17 & 1, z14)) {
                        o0VarE.G0();
                        i19 = i14 & 1;
                        aVar4 = p3.m.f135153a;
                        if (i19 != 0) {
                            aVar5 = h4.r.S;
                            h4.d.f81522a.getClass();
                            gVar = h4.d.a.f81524b;
                            if ((i15 & 8) != 0) {
                                zR = o0VarE.r(list);
                                objQ = o0VarE.q();
                                if (zR) {
                                    aVar4.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new ad.b(list, 11);
                                        o0VarE.K(objQ);
                                    }
                                } else {
                                    objQ = new ad.b(list, 11);
                                    o0VarE.K(objQ);
                                }
                                aVar2 = (e23.a) objQ;
                                i17 &= -7169;
                            }
                            jVar3 = new uc.j();
                            i24 = i17 & (-458753);
                            if ((i15 & 128) != 0) {
                                dVar2 = new vb1.d(7);
                                i24 = i17 & (-29818881);
                            }
                            if ((i15 & 256) != 0) {
                                i24 &= -234881025;
                                dVar3 = new vb1.d(8);
                            }
                            if ((i15 & 512) != 0) {
                                int i319 = i24 & (-1879048193);
                                aVar7 = new uj1.a(28);
                                aVar6 = aVar2;
                                lVar4 = dVar2;
                                lVar3 = dVar3;
                                dVar5 = gVar;
                                jVar4 = jVar3;
                                i25 = 0;
                                rVar3 = aVar5;
                                i26 = i319;
                            } else {
                                aVar6 = aVar2;
                                lVar3 = dVar3;
                                aVar7 = pVar2;
                                dVar5 = gVar;
                                jVar4 = jVar3;
                                i25 = 0;
                                rVar3 = aVar5;
                                i26 = i24;
                                lVar4 = dVar2;
                            }
                        } else {
                            aVar5 = h4.r.S;
                            h4.d.f81522a.getClass();
                            gVar = h4.d.a.f81524b;
                            if ((i15 & 8) != 0) {
                                zR = o0VarE.r(list);
                                objQ = o0VarE.q();
                                if (zR) {
                                    aVar4.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new ad.b(list, 11);
                                        o0VarE.K(objQ);
                                    }
                                } else {
                                    objQ = new ad.b(list, 11);
                                    o0VarE.K(objQ);
                                }
                                aVar2 = (e23.a) objQ;
                                i17 &= -7169;
                            }
                            jVar3 = new uc.j();
                            i24 = i17 & (-458753);
                            if ((i15 & 128) != 0) {
                                dVar2 = new vb1.d(7);
                                i24 = i17 & (-29818881);
                            }
                            if ((i15 & 256) != 0) {
                                i24 &= -234881025;
                                dVar3 = new vb1.d(8);
                            }
                            if ((i15 & 512) != 0) {
                                int i3110 = i24 & (-1879048193);
                                aVar7 = new uj1.a(28);
                                aVar6 = aVar2;
                                lVar4 = dVar2;
                                lVar3 = dVar3;
                                dVar5 = gVar;
                                jVar4 = jVar3;
                                i25 = 0;
                                rVar3 = aVar5;
                                i26 = i3110;
                            } else {
                                aVar6 = aVar2;
                                lVar3 = dVar3;
                                aVar7 = pVar2;
                                dVar5 = gVar;
                                jVar4 = jVar3;
                                i25 = 0;
                                rVar3 = aVar5;
                                i26 = i24;
                                lVar4 = dVar2;
                            }
                        }
                        o0VarE.h0();
                        p3.x1 x1Var9 = p3.n.f135158a;
                        if (!list.isEmpty()) {
                            vb.h.s("NavDisplay backstack cannot be empty");
                            return;
                        }
                        int i412 = ((i18 << 6) & 896) | (i26 & 14) | ((i26 >> 9) & 112);
                        zB = o0VarE.B(p13.h0.b1(list));
                        objQ2 = o0VarE.q();
                        if (zB) {
                            aVar4.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                if (list instanceof RandomAccess) {
                                    arrayList2 = new ArrayList(list.size());
                                    size = list.size();
                                    while (i25 < size) {
                                        arrayList2.add((sc.h) b0Var.invoke(list.get(i25)));
                                        i25++;
                                    }
                                    objQ2 = arrayList2;
                                } else {
                                    arrayList = new ArrayList(p13.y.r(list, 10));
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add((sc.h) b0Var.invoke(it.next()));
                                    }
                                    objQ2 = arrayList;
                                }
                                o0VarE.K(objQ2);
                            }
                        } else {
                            if (list instanceof RandomAccess) {
                                arrayList2 = new ArrayList(list.size());
                                size = list.size();
                                while (i25 < size) {
                                    arrayList2.add((sc.h) b0Var.invoke(list.get(i25)));
                                    i25++;
                                }
                                objQ2 = arrayList2;
                            } else {
                                arrayList = new ArrayList(p13.y.r(list, 10));
                                it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add((sc.h) b0Var.invoke(it.next()));
                                }
                                objQ2 = arrayList;
                            }
                            o0VarE.K(objQ2);
                        }
                        ArrayList arrayListC5 = og2.k.C((List) objQ2, list2, o0VarE, i412 & 112);
                        p3.x1 x1Var10 = p3.n.f135158a;
                        int i413 = i26 >> 6;
                        o0Var = o0VarE;
                        e(arrayListC5, rVar3, dVar5, jVar4, lVar4, lVar3, aVar7, aVar6, o0Var, (i413 & 29360128) | (458752 & i413) | 25008 | (3670016 & i413) | ((i26 << 15) & 234881024));
                        rVar2 = rVar3;
                        dVar4 = dVar5;
                        jVar2 = jVar4;
                        dVar2 = lVar4;
                        dVar3 = lVar3;
                        pVar2 = aVar7;
                        aVar3 = aVar6;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        rVar2 = rVar;
                        dVar4 = dVar;
                        aVar3 = aVar2;
                        jVar2 = jVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new s4(list, rVar2, dVar4, aVar3, list2, jVar2, dVar2, dVar3, pVar2, b0Var, i14, i15);
                    }
                }
                pVar2 = pVar;
                i17 = i318 | i38;
                if (o0VarE.r(b0Var)) {
                }
                if ((306783379 & i17) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (o0VarE.n(i17 & 1, z14)) {
                    o0VarE.G0();
                    i19 = i14 & 1;
                    aVar4 = p3.m.f135153a;
                    if (i19 != 0) {
                        aVar5 = h4.r.S;
                        h4.d.f81522a.getClass();
                        gVar = h4.d.a.f81524b;
                        if ((i15 & 8) != 0) {
                            zR = o0VarE.r(list);
                            objQ = o0VarE.q();
                            if (zR) {
                                aVar4.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new ad.b(list, 11);
                                    o0VarE.K(objQ);
                                }
                            } else {
                                objQ = new ad.b(list, 11);
                                o0VarE.K(objQ);
                            }
                            aVar2 = (e23.a) objQ;
                            i17 &= -7169;
                        }
                        jVar3 = new uc.j();
                        i24 = i17 & (-458753);
                        if ((i15 & 128) != 0) {
                            dVar2 = new vb1.d(7);
                            i24 = i17 & (-29818881);
                        }
                        if ((i15 & 256) != 0) {
                            i24 &= -234881025;
                            dVar3 = new vb1.d(8);
                        }
                        if ((i15 & 512) != 0) {
                            int i3111 = i24 & (-1879048193);
                            aVar7 = new uj1.a(28);
                            aVar6 = aVar2;
                            lVar4 = dVar2;
                            lVar3 = dVar3;
                            dVar5 = gVar;
                            jVar4 = jVar3;
                            i25 = 0;
                            rVar3 = aVar5;
                            i26 = i3111;
                        } else {
                            aVar6 = aVar2;
                            lVar3 = dVar3;
                            aVar7 = pVar2;
                            dVar5 = gVar;
                            jVar4 = jVar3;
                            i25 = 0;
                            rVar3 = aVar5;
                            i26 = i24;
                            lVar4 = dVar2;
                        }
                    } else {
                        aVar5 = h4.r.S;
                        h4.d.f81522a.getClass();
                        gVar = h4.d.a.f81524b;
                        if ((i15 & 8) != 0) {
                            zR = o0VarE.r(list);
                            objQ = o0VarE.q();
                            if (zR) {
                                aVar4.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new ad.b(list, 11);
                                    o0VarE.K(objQ);
                                }
                            } else {
                                objQ = new ad.b(list, 11);
                                o0VarE.K(objQ);
                            }
                            aVar2 = (e23.a) objQ;
                            i17 &= -7169;
                        }
                        jVar3 = new uc.j();
                        i24 = i17 & (-458753);
                        if ((i15 & 128) != 0) {
                            dVar2 = new vb1.d(7);
                            i24 = i17 & (-29818881);
                        }
                        if ((i15 & 256) != 0) {
                            i24 &= -234881025;
                            dVar3 = new vb1.d(8);
                        }
                        if ((i15 & 512) != 0) {
                            int i3112 = i24 & (-1879048193);
                            aVar7 = new uj1.a(28);
                            aVar6 = aVar2;
                            lVar4 = dVar2;
                            lVar3 = dVar3;
                            dVar5 = gVar;
                            jVar4 = jVar3;
                            i25 = 0;
                            rVar3 = aVar5;
                            i26 = i3112;
                        } else {
                            aVar6 = aVar2;
                            lVar3 = dVar3;
                            aVar7 = pVar2;
                            dVar5 = gVar;
                            jVar4 = jVar3;
                            i25 = 0;
                            rVar3 = aVar5;
                            i26 = i24;
                            lVar4 = dVar2;
                        }
                    }
                    o0VarE.h0();
                    p3.x1 x1Var11 = p3.n.f135158a;
                    if (!list.isEmpty()) {
                        vb.h.s("NavDisplay backstack cannot be empty");
                        return;
                    }
                    int i414 = ((i18 << 6) & 896) | (i26 & 14) | ((i26 >> 9) & 112);
                    zB = o0VarE.B(p13.h0.b1(list));
                    objQ2 = o0VarE.q();
                    if (zB) {
                        aVar4.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            if (list instanceof RandomAccess) {
                                arrayList2 = new ArrayList(list.size());
                                size = list.size();
                                while (i25 < size) {
                                    arrayList2.add((sc.h) b0Var.invoke(list.get(i25)));
                                    i25++;
                                }
                                objQ2 = arrayList2;
                            } else {
                                arrayList = new ArrayList(p13.y.r(list, 10));
                                it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add((sc.h) b0Var.invoke(it.next()));
                                }
                                objQ2 = arrayList;
                            }
                            o0VarE.K(objQ2);
                        }
                    } else {
                        if (list instanceof RandomAccess) {
                            arrayList2 = new ArrayList(list.size());
                            size = list.size();
                            while (i25 < size) {
                                arrayList2.add((sc.h) b0Var.invoke(list.get(i25)));
                                i25++;
                            }
                            objQ2 = arrayList2;
                        } else {
                            arrayList = new ArrayList(p13.y.r(list, 10));
                            it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add((sc.h) b0Var.invoke(it.next()));
                            }
                            objQ2 = arrayList;
                        }
                        o0VarE.K(objQ2);
                    }
                    ArrayList arrayListC6 = og2.k.C((List) objQ2, list2, o0VarE, i414 & 112);
                    p3.x1 x1Var12 = p3.n.f135158a;
                    int i415 = i26 >> 6;
                    o0Var = o0VarE;
                    e(arrayListC6, rVar3, dVar5, jVar4, lVar4, lVar3, aVar7, aVar6, o0Var, (i415 & 29360128) | (458752 & i415) | 25008 | (3670016 & i415) | ((i26 << 15) & 234881024));
                    rVar2 = rVar3;
                    dVar4 = dVar5;
                    jVar2 = jVar4;
                    dVar2 = lVar4;
                    dVar3 = lVar3;
                    pVar2 = aVar7;
                    aVar3 = aVar6;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    rVar2 = rVar;
                    dVar4 = dVar;
                    aVar3 = aVar2;
                    jVar2 = jVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new s4(list, rVar2, dVar4, aVar3, list2, jVar2, dVar2, dVar3, pVar2, b0Var, i14, i15);
                }
            }
            dVar3 = lVar2;
            int i3113 = i317 | i36;
            if ((i15 & 512) == 0) {
                pVar2 = pVar;
                if (o0VarE.r(pVar2)) {
                }
                i17 = i3113 | i38;
                if (o0VarE.r(b0Var)) {
                }
                if ((306783379 & i17) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (o0VarE.n(i17 & 1, z14)) {
                    o0VarE.G0();
                    i19 = i14 & 1;
                    aVar4 = p3.m.f135153a;
                    if (i19 != 0) {
                        aVar5 = h4.r.S;
                        h4.d.f81522a.getClass();
                        gVar = h4.d.a.f81524b;
                        if ((i15 & 8) != 0) {
                            zR = o0VarE.r(list);
                            objQ = o0VarE.q();
                            if (zR) {
                                aVar4.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new ad.b(list, 11);
                                    o0VarE.K(objQ);
                                }
                            } else {
                                objQ = new ad.b(list, 11);
                                o0VarE.K(objQ);
                            }
                            aVar2 = (e23.a) objQ;
                            i17 &= -7169;
                        }
                        jVar3 = new uc.j();
                        i24 = i17 & (-458753);
                        if ((i15 & 128) != 0) {
                            dVar2 = new vb1.d(7);
                            i24 = i17 & (-29818881);
                        }
                        if ((i15 & 256) != 0) {
                            i24 &= -234881025;
                            dVar3 = new vb1.d(8);
                        }
                        if ((i15 & 512) != 0) {
                            int i3114 = i24 & (-1879048193);
                            aVar7 = new uj1.a(28);
                            aVar6 = aVar2;
                            lVar4 = dVar2;
                            lVar3 = dVar3;
                            dVar5 = gVar;
                            jVar4 = jVar3;
                            i25 = 0;
                            rVar3 = aVar5;
                            i26 = i3114;
                        } else {
                            aVar6 = aVar2;
                            lVar3 = dVar3;
                            aVar7 = pVar2;
                            dVar5 = gVar;
                            jVar4 = jVar3;
                            i25 = 0;
                            rVar3 = aVar5;
                            i26 = i24;
                            lVar4 = dVar2;
                        }
                    } else {
                        aVar5 = h4.r.S;
                        h4.d.f81522a.getClass();
                        gVar = h4.d.a.f81524b;
                        if ((i15 & 8) != 0) {
                            zR = o0VarE.r(list);
                            objQ = o0VarE.q();
                            if (zR) {
                                aVar4.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new ad.b(list, 11);
                                    o0VarE.K(objQ);
                                }
                            } else {
                                objQ = new ad.b(list, 11);
                                o0VarE.K(objQ);
                            }
                            aVar2 = (e23.a) objQ;
                            i17 &= -7169;
                        }
                        jVar3 = new uc.j();
                        i24 = i17 & (-458753);
                        if ((i15 & 128) != 0) {
                            dVar2 = new vb1.d(7);
                            i24 = i17 & (-29818881);
                        }
                        if ((i15 & 256) != 0) {
                            i24 &= -234881025;
                            dVar3 = new vb1.d(8);
                        }
                        if ((i15 & 512) != 0) {
                            int i3115 = i24 & (-1879048193);
                            aVar7 = new uj1.a(28);
                            aVar6 = aVar2;
                            lVar4 = dVar2;
                            lVar3 = dVar3;
                            dVar5 = gVar;
                            jVar4 = jVar3;
                            i25 = 0;
                            rVar3 = aVar5;
                            i26 = i3115;
                        } else {
                            aVar6 = aVar2;
                            lVar3 = dVar3;
                            aVar7 = pVar2;
                            dVar5 = gVar;
                            jVar4 = jVar3;
                            i25 = 0;
                            rVar3 = aVar5;
                            i26 = i24;
                            lVar4 = dVar2;
                        }
                    }
                    o0VarE.h0();
                    p3.x1 x1Var13 = p3.n.f135158a;
                    if (!list.isEmpty()) {
                        vb.h.s("NavDisplay backstack cannot be empty");
                        return;
                    }
                    int i416 = ((i18 << 6) & 896) | (i26 & 14) | ((i26 >> 9) & 112);
                    zB = o0VarE.B(p13.h0.b1(list));
                    objQ2 = o0VarE.q();
                    if (zB) {
                        aVar4.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            if (list instanceof RandomAccess) {
                                arrayList2 = new ArrayList(list.size());
                                size = list.size();
                                while (i25 < size) {
                                    arrayList2.add((sc.h) b0Var.invoke(list.get(i25)));
                                    i25++;
                                }
                                objQ2 = arrayList2;
                            } else {
                                arrayList = new ArrayList(p13.y.r(list, 10));
                                it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add((sc.h) b0Var.invoke(it.next()));
                                }
                                objQ2 = arrayList;
                            }
                            o0VarE.K(objQ2);
                        }
                    } else {
                        if (list instanceof RandomAccess) {
                            arrayList2 = new ArrayList(list.size());
                            size = list.size();
                            while (i25 < size) {
                                arrayList2.add((sc.h) b0Var.invoke(list.get(i25)));
                                i25++;
                            }
                            objQ2 = arrayList2;
                        } else {
                            arrayList = new ArrayList(p13.y.r(list, 10));
                            it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add((sc.h) b0Var.invoke(it.next()));
                            }
                            objQ2 = arrayList;
                        }
                        o0VarE.K(objQ2);
                    }
                    ArrayList arrayListC7 = og2.k.C((List) objQ2, list2, o0VarE, i416 & 112);
                    p3.x1 x1Var14 = p3.n.f135158a;
                    int i417 = i26 >> 6;
                    o0Var = o0VarE;
                    e(arrayListC7, rVar3, dVar5, jVar4, lVar4, lVar3, aVar7, aVar6, o0Var, (i417 & 29360128) | (458752 & i417) | 25008 | (3670016 & i417) | ((i26 << 15) & 234881024));
                    rVar2 = rVar3;
                    dVar4 = dVar5;
                    jVar2 = jVar4;
                    dVar2 = lVar4;
                    dVar3 = lVar3;
                    pVar2 = aVar7;
                    aVar3 = aVar6;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    rVar2 = rVar;
                    dVar4 = dVar;
                    aVar3 = aVar2;
                    jVar2 = jVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new s4(list, rVar2, dVar4, aVar3, list2, jVar2, dVar2, dVar3, pVar2, b0Var, i14, i15);
                }
            }
            pVar2 = pVar;
            i17 = i3113 | i38;
            if (o0VarE.r(b0Var)) {
            }
            if ((306783379 & i17) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (o0VarE.n(i17 & 1, z14)) {
                o0VarE.G0();
                i19 = i14 & 1;
                aVar4 = p3.m.f135153a;
                if (i19 != 0) {
                    aVar5 = h4.r.S;
                    h4.d.f81522a.getClass();
                    gVar = h4.d.a.f81524b;
                    if ((i15 & 8) != 0) {
                        zR = o0VarE.r(list);
                        objQ = o0VarE.q();
                        if (zR) {
                            aVar4.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new ad.b(list, 11);
                                o0VarE.K(objQ);
                            }
                        } else {
                            objQ = new ad.b(list, 11);
                            o0VarE.K(objQ);
                        }
                        aVar2 = (e23.a) objQ;
                        i17 &= -7169;
                    }
                    jVar3 = new uc.j();
                    i24 = i17 & (-458753);
                    if ((i15 & 128) != 0) {
                        dVar2 = new vb1.d(7);
                        i24 = i17 & (-29818881);
                    }
                    if ((i15 & 256) != 0) {
                        i24 &= -234881025;
                        dVar3 = new vb1.d(8);
                    }
                    if ((i15 & 512) != 0) {
                        int i3116 = i24 & (-1879048193);
                        aVar7 = new uj1.a(28);
                        aVar6 = aVar2;
                        lVar4 = dVar2;
                        lVar3 = dVar3;
                        dVar5 = gVar;
                        jVar4 = jVar3;
                        i25 = 0;
                        rVar3 = aVar5;
                        i26 = i3116;
                    } else {
                        aVar6 = aVar2;
                        lVar3 = dVar3;
                        aVar7 = pVar2;
                        dVar5 = gVar;
                        jVar4 = jVar3;
                        i25 = 0;
                        rVar3 = aVar5;
                        i26 = i24;
                        lVar4 = dVar2;
                    }
                } else {
                    aVar5 = h4.r.S;
                    h4.d.f81522a.getClass();
                    gVar = h4.d.a.f81524b;
                    if ((i15 & 8) != 0) {
                        zR = o0VarE.r(list);
                        objQ = o0VarE.q();
                        if (zR) {
                            aVar4.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new ad.b(list, 11);
                                o0VarE.K(objQ);
                            }
                        } else {
                            objQ = new ad.b(list, 11);
                            o0VarE.K(objQ);
                        }
                        aVar2 = (e23.a) objQ;
                        i17 &= -7169;
                    }
                    jVar3 = new uc.j();
                    i24 = i17 & (-458753);
                    if ((i15 & 128) != 0) {
                        dVar2 = new vb1.d(7);
                        i24 = i17 & (-29818881);
                    }
                    if ((i15 & 256) != 0) {
                        i24 &= -234881025;
                        dVar3 = new vb1.d(8);
                    }
                    if ((i15 & 512) != 0) {
                        int i3117 = i24 & (-1879048193);
                        aVar7 = new uj1.a(28);
                        aVar6 = aVar2;
                        lVar4 = dVar2;
                        lVar3 = dVar3;
                        dVar5 = gVar;
                        jVar4 = jVar3;
                        i25 = 0;
                        rVar3 = aVar5;
                        i26 = i3117;
                    } else {
                        aVar6 = aVar2;
                        lVar3 = dVar3;
                        aVar7 = pVar2;
                        dVar5 = gVar;
                        jVar4 = jVar3;
                        i25 = 0;
                        rVar3 = aVar5;
                        i26 = i24;
                        lVar4 = dVar2;
                    }
                }
                o0VarE.h0();
                p3.x1 x1Var15 = p3.n.f135158a;
                if (!list.isEmpty()) {
                    vb.h.s("NavDisplay backstack cannot be empty");
                    return;
                }
                int i418 = ((i18 << 6) & 896) | (i26 & 14) | ((i26 >> 9) & 112);
                zB = o0VarE.B(p13.h0.b1(list));
                objQ2 = o0VarE.q();
                if (zB) {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        if (list instanceof RandomAccess) {
                            arrayList2 = new ArrayList(list.size());
                            size = list.size();
                            while (i25 < size) {
                                arrayList2.add((sc.h) b0Var.invoke(list.get(i25)));
                                i25++;
                            }
                            objQ2 = arrayList2;
                        } else {
                            arrayList = new ArrayList(p13.y.r(list, 10));
                            it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add((sc.h) b0Var.invoke(it.next()));
                            }
                            objQ2 = arrayList;
                        }
                        o0VarE.K(objQ2);
                    }
                } else {
                    if (list instanceof RandomAccess) {
                        arrayList2 = new ArrayList(list.size());
                        size = list.size();
                        while (i25 < size) {
                            arrayList2.add((sc.h) b0Var.invoke(list.get(i25)));
                            i25++;
                        }
                        objQ2 = arrayList2;
                    } else {
                        arrayList = new ArrayList(p13.y.r(list, 10));
                        it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add((sc.h) b0Var.invoke(it.next()));
                        }
                        objQ2 = arrayList;
                    }
                    o0VarE.K(objQ2);
                }
                ArrayList arrayListC8 = og2.k.C((List) objQ2, list2, o0VarE, i418 & 112);
                p3.x1 x1Var16 = p3.n.f135158a;
                int i419 = i26 >> 6;
                o0Var = o0VarE;
                e(arrayListC8, rVar3, dVar5, jVar4, lVar4, lVar3, aVar7, aVar6, o0Var, (i419 & 29360128) | (458752 & i419) | 25008 | (3670016 & i419) | ((i26 << 15) & 234881024));
                rVar2 = rVar3;
                dVar4 = dVar5;
                jVar2 = jVar4;
                dVar2 = lVar4;
                dVar3 = lVar3;
                pVar2 = aVar7;
                aVar3 = aVar6;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar2 = rVar;
                dVar4 = dVar;
                aVar3 = aVar2;
                jVar2 = jVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new s4(list, rVar2, dVar4, aVar3, list2, jVar2, dVar2, dVar3, pVar2, b0Var, i14, i15);
            }
        }
        aVar2 = aVar;
        int i210 = i27 | i28;
        if (o0VarE.r(list2)) {
            i16 = 16384;
        } else {
            i16 = 8192;
        }
        int i320 = i210 | i16 | 1638400;
        if ((i15 & 128) == 0) {
            dVar2 = lVar;
            if (o0VarE.r(dVar2)) {
            }
            int i3118 = i320 | i34;
            if ((i15 & 256) == 0) {
                dVar3 = lVar2;
                if (o0VarE.r(dVar3)) {
                }
                int i3119 = i3118 | i36;
                if ((i15 & 512) == 0) {
                    pVar2 = pVar;
                    if (o0VarE.r(pVar2)) {
                    }
                    i17 = i3119 | i38;
                    if (o0VarE.r(b0Var)) {
                    }
                    if ((306783379 & i17) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (o0VarE.n(i17 & 1, z14)) {
                        o0VarE.G0();
                        i19 = i14 & 1;
                        aVar4 = p3.m.f135153a;
                        if (i19 != 0) {
                            aVar5 = h4.r.S;
                            h4.d.f81522a.getClass();
                            gVar = h4.d.a.f81524b;
                            if ((i15 & 8) != 0) {
                                zR = o0VarE.r(list);
                                objQ = o0VarE.q();
                                if (zR) {
                                    aVar4.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new ad.b(list, 11);
                                        o0VarE.K(objQ);
                                    }
                                } else {
                                    objQ = new ad.b(list, 11);
                                    o0VarE.K(objQ);
                                }
                                aVar2 = (e23.a) objQ;
                                i17 &= -7169;
                            }
                            jVar3 = new uc.j();
                            i24 = i17 & (-458753);
                            if ((i15 & 128) != 0) {
                                dVar2 = new vb1.d(7);
                                i24 = i17 & (-29818881);
                            }
                            if ((i15 & 256) != 0) {
                                i24 &= -234881025;
                                dVar3 = new vb1.d(8);
                            }
                            if ((i15 & 512) != 0) {
                                int i31110 = i24 & (-1879048193);
                                aVar7 = new uj1.a(28);
                                aVar6 = aVar2;
                                lVar4 = dVar2;
                                lVar3 = dVar3;
                                dVar5 = gVar;
                                jVar4 = jVar3;
                                i25 = 0;
                                rVar3 = aVar5;
                                i26 = i31110;
                            } else {
                                aVar6 = aVar2;
                                lVar3 = dVar3;
                                aVar7 = pVar2;
                                dVar5 = gVar;
                                jVar4 = jVar3;
                                i25 = 0;
                                rVar3 = aVar5;
                                i26 = i24;
                                lVar4 = dVar2;
                            }
                        } else {
                            aVar5 = h4.r.S;
                            h4.d.f81522a.getClass();
                            gVar = h4.d.a.f81524b;
                            if ((i15 & 8) != 0) {
                                zR = o0VarE.r(list);
                                objQ = o0VarE.q();
                                if (zR) {
                                    aVar4.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new ad.b(list, 11);
                                        o0VarE.K(objQ);
                                    }
                                } else {
                                    objQ = new ad.b(list, 11);
                                    o0VarE.K(objQ);
                                }
                                aVar2 = (e23.a) objQ;
                                i17 &= -7169;
                            }
                            jVar3 = new uc.j();
                            i24 = i17 & (-458753);
                            if ((i15 & 128) != 0) {
                                dVar2 = new vb1.d(7);
                                i24 = i17 & (-29818881);
                            }
                            if ((i15 & 256) != 0) {
                                i24 &= -234881025;
                                dVar3 = new vb1.d(8);
                            }
                            if ((i15 & 512) != 0) {
                                int i31111 = i24 & (-1879048193);
                                aVar7 = new uj1.a(28);
                                aVar6 = aVar2;
                                lVar4 = dVar2;
                                lVar3 = dVar3;
                                dVar5 = gVar;
                                jVar4 = jVar3;
                                i25 = 0;
                                rVar3 = aVar5;
                                i26 = i31111;
                            } else {
                                aVar6 = aVar2;
                                lVar3 = dVar3;
                                aVar7 = pVar2;
                                dVar5 = gVar;
                                jVar4 = jVar3;
                                i25 = 0;
                                rVar3 = aVar5;
                                i26 = i24;
                                lVar4 = dVar2;
                            }
                        }
                        o0VarE.h0();
                        p3.x1 x1Var17 = p3.n.f135158a;
                        if (!list.isEmpty()) {
                            vb.h.s("NavDisplay backstack cannot be empty");
                            return;
                        }
                        int i4110 = ((i18 << 6) & 896) | (i26 & 14) | ((i26 >> 9) & 112);
                        zB = o0VarE.B(p13.h0.b1(list));
                        objQ2 = o0VarE.q();
                        if (zB) {
                            aVar4.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                if (list instanceof RandomAccess) {
                                    arrayList2 = new ArrayList(list.size());
                                    size = list.size();
                                    while (i25 < size) {
                                        arrayList2.add((sc.h) b0Var.invoke(list.get(i25)));
                                        i25++;
                                    }
                                    objQ2 = arrayList2;
                                } else {
                                    arrayList = new ArrayList(p13.y.r(list, 10));
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add((sc.h) b0Var.invoke(it.next()));
                                    }
                                    objQ2 = arrayList;
                                }
                                o0VarE.K(objQ2);
                            }
                        } else {
                            if (list instanceof RandomAccess) {
                                arrayList2 = new ArrayList(list.size());
                                size = list.size();
                                while (i25 < size) {
                                    arrayList2.add((sc.h) b0Var.invoke(list.get(i25)));
                                    i25++;
                                }
                                objQ2 = arrayList2;
                            } else {
                                arrayList = new ArrayList(p13.y.r(list, 10));
                                it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add((sc.h) b0Var.invoke(it.next()));
                                }
                                objQ2 = arrayList;
                            }
                            o0VarE.K(objQ2);
                        }
                        ArrayList arrayListC9 = og2.k.C((List) objQ2, list2, o0VarE, i4110 & 112);
                        p3.x1 x1Var18 = p3.n.f135158a;
                        int i4111 = i26 >> 6;
                        o0Var = o0VarE;
                        e(arrayListC9, rVar3, dVar5, jVar4, lVar4, lVar3, aVar7, aVar6, o0Var, (i4111 & 29360128) | (458752 & i4111) | 25008 | (3670016 & i4111) | ((i26 << 15) & 234881024));
                        rVar2 = rVar3;
                        dVar4 = dVar5;
                        jVar2 = jVar4;
                        dVar2 = lVar4;
                        dVar3 = lVar3;
                        pVar2 = aVar7;
                        aVar3 = aVar6;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        rVar2 = rVar;
                        dVar4 = dVar;
                        aVar3 = aVar2;
                        jVar2 = jVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new s4(list, rVar2, dVar4, aVar3, list2, jVar2, dVar2, dVar3, pVar2, b0Var, i14, i15);
                    }
                }
                pVar2 = pVar;
                i17 = i3119 | i38;
                if (o0VarE.r(b0Var)) {
                }
                if ((306783379 & i17) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (o0VarE.n(i17 & 1, z14)) {
                    o0VarE.G0();
                    i19 = i14 & 1;
                    aVar4 = p3.m.f135153a;
                    if (i19 != 0) {
                        aVar5 = h4.r.S;
                        h4.d.f81522a.getClass();
                        gVar = h4.d.a.f81524b;
                        if ((i15 & 8) != 0) {
                            zR = o0VarE.r(list);
                            objQ = o0VarE.q();
                            if (zR) {
                                aVar4.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new ad.b(list, 11);
                                    o0VarE.K(objQ);
                                }
                            } else {
                                objQ = new ad.b(list, 11);
                                o0VarE.K(objQ);
                            }
                            aVar2 = (e23.a) objQ;
                            i17 &= -7169;
                        }
                        jVar3 = new uc.j();
                        i24 = i17 & (-458753);
                        if ((i15 & 128) != 0) {
                            dVar2 = new vb1.d(7);
                            i24 = i17 & (-29818881);
                        }
                        if ((i15 & 256) != 0) {
                            i24 &= -234881025;
                            dVar3 = new vb1.d(8);
                        }
                        if ((i15 & 512) != 0) {
                            int i31112 = i24 & (-1879048193);
                            aVar7 = new uj1.a(28);
                            aVar6 = aVar2;
                            lVar4 = dVar2;
                            lVar3 = dVar3;
                            dVar5 = gVar;
                            jVar4 = jVar3;
                            i25 = 0;
                            rVar3 = aVar5;
                            i26 = i31112;
                        } else {
                            aVar6 = aVar2;
                            lVar3 = dVar3;
                            aVar7 = pVar2;
                            dVar5 = gVar;
                            jVar4 = jVar3;
                            i25 = 0;
                            rVar3 = aVar5;
                            i26 = i24;
                            lVar4 = dVar2;
                        }
                    } else {
                        aVar5 = h4.r.S;
                        h4.d.f81522a.getClass();
                        gVar = h4.d.a.f81524b;
                        if ((i15 & 8) != 0) {
                            zR = o0VarE.r(list);
                            objQ = o0VarE.q();
                            if (zR) {
                                aVar4.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new ad.b(list, 11);
                                    o0VarE.K(objQ);
                                }
                            } else {
                                objQ = new ad.b(list, 11);
                                o0VarE.K(objQ);
                            }
                            aVar2 = (e23.a) objQ;
                            i17 &= -7169;
                        }
                        jVar3 = new uc.j();
                        i24 = i17 & (-458753);
                        if ((i15 & 128) != 0) {
                            dVar2 = new vb1.d(7);
                            i24 = i17 & (-29818881);
                        }
                        if ((i15 & 256) != 0) {
                            i24 &= -234881025;
                            dVar3 = new vb1.d(8);
                        }
                        if ((i15 & 512) != 0) {
                            int i31113 = i24 & (-1879048193);
                            aVar7 = new uj1.a(28);
                            aVar6 = aVar2;
                            lVar4 = dVar2;
                            lVar3 = dVar3;
                            dVar5 = gVar;
                            jVar4 = jVar3;
                            i25 = 0;
                            rVar3 = aVar5;
                            i26 = i31113;
                        } else {
                            aVar6 = aVar2;
                            lVar3 = dVar3;
                            aVar7 = pVar2;
                            dVar5 = gVar;
                            jVar4 = jVar3;
                            i25 = 0;
                            rVar3 = aVar5;
                            i26 = i24;
                            lVar4 = dVar2;
                        }
                    }
                    o0VarE.h0();
                    p3.x1 x1Var19 = p3.n.f135158a;
                    if (!list.isEmpty()) {
                        vb.h.s("NavDisplay backstack cannot be empty");
                        return;
                    }
                    int i4112 = ((i18 << 6) & 896) | (i26 & 14) | ((i26 >> 9) & 112);
                    zB = o0VarE.B(p13.h0.b1(list));
                    objQ2 = o0VarE.q();
                    if (zB) {
                        aVar4.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            if (list instanceof RandomAccess) {
                                arrayList2 = new ArrayList(list.size());
                                size = list.size();
                                while (i25 < size) {
                                    arrayList2.add((sc.h) b0Var.invoke(list.get(i25)));
                                    i25++;
                                }
                                objQ2 = arrayList2;
                            } else {
                                arrayList = new ArrayList(p13.y.r(list, 10));
                                it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add((sc.h) b0Var.invoke(it.next()));
                                }
                                objQ2 = arrayList;
                            }
                            o0VarE.K(objQ2);
                        }
                    } else {
                        if (list instanceof RandomAccess) {
                            arrayList2 = new ArrayList(list.size());
                            size = list.size();
                            while (i25 < size) {
                                arrayList2.add((sc.h) b0Var.invoke(list.get(i25)));
                                i25++;
                            }
                            objQ2 = arrayList2;
                        } else {
                            arrayList = new ArrayList(p13.y.r(list, 10));
                            it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add((sc.h) b0Var.invoke(it.next()));
                            }
                            objQ2 = arrayList;
                        }
                        o0VarE.K(objQ2);
                    }
                    ArrayList arrayListC10 = og2.k.C((List) objQ2, list2, o0VarE, i4112 & 112);
                    p3.x1 x1Var110 = p3.n.f135158a;
                    int i4113 = i26 >> 6;
                    o0Var = o0VarE;
                    e(arrayListC10, rVar3, dVar5, jVar4, lVar4, lVar3, aVar7, aVar6, o0Var, (i4113 & 29360128) | (458752 & i4113) | 25008 | (3670016 & i4113) | ((i26 << 15) & 234881024));
                    rVar2 = rVar3;
                    dVar4 = dVar5;
                    jVar2 = jVar4;
                    dVar2 = lVar4;
                    dVar3 = lVar3;
                    pVar2 = aVar7;
                    aVar3 = aVar6;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    rVar2 = rVar;
                    dVar4 = dVar;
                    aVar3 = aVar2;
                    jVar2 = jVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new s4(list, rVar2, dVar4, aVar3, list2, jVar2, dVar2, dVar3, pVar2, b0Var, i14, i15);
                }
            }
            dVar3 = lVar2;
            int i31114 = i3118 | i36;
            if ((i15 & 512) == 0) {
                pVar2 = pVar;
                if (o0VarE.r(pVar2)) {
                }
                i17 = i31114 | i38;
                if (o0VarE.r(b0Var)) {
                }
                if ((306783379 & i17) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (o0VarE.n(i17 & 1, z14)) {
                    o0VarE.G0();
                    i19 = i14 & 1;
                    aVar4 = p3.m.f135153a;
                    if (i19 != 0) {
                        aVar5 = h4.r.S;
                        h4.d.f81522a.getClass();
                        gVar = h4.d.a.f81524b;
                        if ((i15 & 8) != 0) {
                            zR = o0VarE.r(list);
                            objQ = o0VarE.q();
                            if (zR) {
                                aVar4.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new ad.b(list, 11);
                                    o0VarE.K(objQ);
                                }
                            } else {
                                objQ = new ad.b(list, 11);
                                o0VarE.K(objQ);
                            }
                            aVar2 = (e23.a) objQ;
                            i17 &= -7169;
                        }
                        jVar3 = new uc.j();
                        i24 = i17 & (-458753);
                        if ((i15 & 128) != 0) {
                            dVar2 = new vb1.d(7);
                            i24 = i17 & (-29818881);
                        }
                        if ((i15 & 256) != 0) {
                            i24 &= -234881025;
                            dVar3 = new vb1.d(8);
                        }
                        if ((i15 & 512) != 0) {
                            int i31115 = i24 & (-1879048193);
                            aVar7 = new uj1.a(28);
                            aVar6 = aVar2;
                            lVar4 = dVar2;
                            lVar3 = dVar3;
                            dVar5 = gVar;
                            jVar4 = jVar3;
                            i25 = 0;
                            rVar3 = aVar5;
                            i26 = i31115;
                        } else {
                            aVar6 = aVar2;
                            lVar3 = dVar3;
                            aVar7 = pVar2;
                            dVar5 = gVar;
                            jVar4 = jVar3;
                            i25 = 0;
                            rVar3 = aVar5;
                            i26 = i24;
                            lVar4 = dVar2;
                        }
                    } else {
                        aVar5 = h4.r.S;
                        h4.d.f81522a.getClass();
                        gVar = h4.d.a.f81524b;
                        if ((i15 & 8) != 0) {
                            zR = o0VarE.r(list);
                            objQ = o0VarE.q();
                            if (zR) {
                                aVar4.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new ad.b(list, 11);
                                    o0VarE.K(objQ);
                                }
                            } else {
                                objQ = new ad.b(list, 11);
                                o0VarE.K(objQ);
                            }
                            aVar2 = (e23.a) objQ;
                            i17 &= -7169;
                        }
                        jVar3 = new uc.j();
                        i24 = i17 & (-458753);
                        if ((i15 & 128) != 0) {
                            dVar2 = new vb1.d(7);
                            i24 = i17 & (-29818881);
                        }
                        if ((i15 & 256) != 0) {
                            i24 &= -234881025;
                            dVar3 = new vb1.d(8);
                        }
                        if ((i15 & 512) != 0) {
                            int i31116 = i24 & (-1879048193);
                            aVar7 = new uj1.a(28);
                            aVar6 = aVar2;
                            lVar4 = dVar2;
                            lVar3 = dVar3;
                            dVar5 = gVar;
                            jVar4 = jVar3;
                            i25 = 0;
                            rVar3 = aVar5;
                            i26 = i31116;
                        } else {
                            aVar6 = aVar2;
                            lVar3 = dVar3;
                            aVar7 = pVar2;
                            dVar5 = gVar;
                            jVar4 = jVar3;
                            i25 = 0;
                            rVar3 = aVar5;
                            i26 = i24;
                            lVar4 = dVar2;
                        }
                    }
                    o0VarE.h0();
                    p3.x1 x1Var111 = p3.n.f135158a;
                    if (!list.isEmpty()) {
                        vb.h.s("NavDisplay backstack cannot be empty");
                        return;
                    }
                    int i4114 = ((i18 << 6) & 896) | (i26 & 14) | ((i26 >> 9) & 112);
                    zB = o0VarE.B(p13.h0.b1(list));
                    objQ2 = o0VarE.q();
                    if (zB) {
                        aVar4.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            if (list instanceof RandomAccess) {
                                arrayList2 = new ArrayList(list.size());
                                size = list.size();
                                while (i25 < size) {
                                    arrayList2.add((sc.h) b0Var.invoke(list.get(i25)));
                                    i25++;
                                }
                                objQ2 = arrayList2;
                            } else {
                                arrayList = new ArrayList(p13.y.r(list, 10));
                                it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add((sc.h) b0Var.invoke(it.next()));
                                }
                                objQ2 = arrayList;
                            }
                            o0VarE.K(objQ2);
                        }
                    } else {
                        if (list instanceof RandomAccess) {
                            arrayList2 = new ArrayList(list.size());
                            size = list.size();
                            while (i25 < size) {
                                arrayList2.add((sc.h) b0Var.invoke(list.get(i25)));
                                i25++;
                            }
                            objQ2 = arrayList2;
                        } else {
                            arrayList = new ArrayList(p13.y.r(list, 10));
                            it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add((sc.h) b0Var.invoke(it.next()));
                            }
                            objQ2 = arrayList;
                        }
                        o0VarE.K(objQ2);
                    }
                    ArrayList arrayListC11 = og2.k.C((List) objQ2, list2, o0VarE, i4114 & 112);
                    p3.x1 x1Var112 = p3.n.f135158a;
                    int i4115 = i26 >> 6;
                    o0Var = o0VarE;
                    e(arrayListC11, rVar3, dVar5, jVar4, lVar4, lVar3, aVar7, aVar6, o0Var, (i4115 & 29360128) | (458752 & i4115) | 25008 | (3670016 & i4115) | ((i26 << 15) & 234881024));
                    rVar2 = rVar3;
                    dVar4 = dVar5;
                    jVar2 = jVar4;
                    dVar2 = lVar4;
                    dVar3 = lVar3;
                    pVar2 = aVar7;
                    aVar3 = aVar6;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    rVar2 = rVar;
                    dVar4 = dVar;
                    aVar3 = aVar2;
                    jVar2 = jVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new s4(list, rVar2, dVar4, aVar3, list2, jVar2, dVar2, dVar3, pVar2, b0Var, i14, i15);
                }
            }
            pVar2 = pVar;
            i17 = i31114 | i38;
            if (o0VarE.r(b0Var)) {
            }
            if ((306783379 & i17) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (o0VarE.n(i17 & 1, z14)) {
                o0VarE.G0();
                i19 = i14 & 1;
                aVar4 = p3.m.f135153a;
                if (i19 != 0) {
                    aVar5 = h4.r.S;
                    h4.d.f81522a.getClass();
                    gVar = h4.d.a.f81524b;
                    if ((i15 & 8) != 0) {
                        zR = o0VarE.r(list);
                        objQ = o0VarE.q();
                        if (zR) {
                            aVar4.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new ad.b(list, 11);
                                o0VarE.K(objQ);
                            }
                        } else {
                            objQ = new ad.b(list, 11);
                            o0VarE.K(objQ);
                        }
                        aVar2 = (e23.a) objQ;
                        i17 &= -7169;
                    }
                    jVar3 = new uc.j();
                    i24 = i17 & (-458753);
                    if ((i15 & 128) != 0) {
                        dVar2 = new vb1.d(7);
                        i24 = i17 & (-29818881);
                    }
                    if ((i15 & 256) != 0) {
                        i24 &= -234881025;
                        dVar3 = new vb1.d(8);
                    }
                    if ((i15 & 512) != 0) {
                        int i31117 = i24 & (-1879048193);
                        aVar7 = new uj1.a(28);
                        aVar6 = aVar2;
                        lVar4 = dVar2;
                        lVar3 = dVar3;
                        dVar5 = gVar;
                        jVar4 = jVar3;
                        i25 = 0;
                        rVar3 = aVar5;
                        i26 = i31117;
                    } else {
                        aVar6 = aVar2;
                        lVar3 = dVar3;
                        aVar7 = pVar2;
                        dVar5 = gVar;
                        jVar4 = jVar3;
                        i25 = 0;
                        rVar3 = aVar5;
                        i26 = i24;
                        lVar4 = dVar2;
                    }
                } else {
                    aVar5 = h4.r.S;
                    h4.d.f81522a.getClass();
                    gVar = h4.d.a.f81524b;
                    if ((i15 & 8) != 0) {
                        zR = o0VarE.r(list);
                        objQ = o0VarE.q();
                        if (zR) {
                            aVar4.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new ad.b(list, 11);
                                o0VarE.K(objQ);
                            }
                        } else {
                            objQ = new ad.b(list, 11);
                            o0VarE.K(objQ);
                        }
                        aVar2 = (e23.a) objQ;
                        i17 &= -7169;
                    }
                    jVar3 = new uc.j();
                    i24 = i17 & (-458753);
                    if ((i15 & 128) != 0) {
                        dVar2 = new vb1.d(7);
                        i24 = i17 & (-29818881);
                    }
                    if ((i15 & 256) != 0) {
                        i24 &= -234881025;
                        dVar3 = new vb1.d(8);
                    }
                    if ((i15 & 512) != 0) {
                        int i31118 = i24 & (-1879048193);
                        aVar7 = new uj1.a(28);
                        aVar6 = aVar2;
                        lVar4 = dVar2;
                        lVar3 = dVar3;
                        dVar5 = gVar;
                        jVar4 = jVar3;
                        i25 = 0;
                        rVar3 = aVar5;
                        i26 = i31118;
                    } else {
                        aVar6 = aVar2;
                        lVar3 = dVar3;
                        aVar7 = pVar2;
                        dVar5 = gVar;
                        jVar4 = jVar3;
                        i25 = 0;
                        rVar3 = aVar5;
                        i26 = i24;
                        lVar4 = dVar2;
                    }
                }
                o0VarE.h0();
                p3.x1 x1Var113 = p3.n.f135158a;
                if (!list.isEmpty()) {
                    vb.h.s("NavDisplay backstack cannot be empty");
                    return;
                }
                int i4116 = ((i18 << 6) & 896) | (i26 & 14) | ((i26 >> 9) & 112);
                zB = o0VarE.B(p13.h0.b1(list));
                objQ2 = o0VarE.q();
                if (zB) {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        if (list instanceof RandomAccess) {
                            arrayList2 = new ArrayList(list.size());
                            size = list.size();
                            while (i25 < size) {
                                arrayList2.add((sc.h) b0Var.invoke(list.get(i25)));
                                i25++;
                            }
                            objQ2 = arrayList2;
                        } else {
                            arrayList = new ArrayList(p13.y.r(list, 10));
                            it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add((sc.h) b0Var.invoke(it.next()));
                            }
                            objQ2 = arrayList;
                        }
                        o0VarE.K(objQ2);
                    }
                } else {
                    if (list instanceof RandomAccess) {
                        arrayList2 = new ArrayList(list.size());
                        size = list.size();
                        while (i25 < size) {
                            arrayList2.add((sc.h) b0Var.invoke(list.get(i25)));
                            i25++;
                        }
                        objQ2 = arrayList2;
                    } else {
                        arrayList = new ArrayList(p13.y.r(list, 10));
                        it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add((sc.h) b0Var.invoke(it.next()));
                        }
                        objQ2 = arrayList;
                    }
                    o0VarE.K(objQ2);
                }
                ArrayList arrayListC12 = og2.k.C((List) objQ2, list2, o0VarE, i4116 & 112);
                p3.x1 x1Var114 = p3.n.f135158a;
                int i4117 = i26 >> 6;
                o0Var = o0VarE;
                e(arrayListC12, rVar3, dVar5, jVar4, lVar4, lVar3, aVar7, aVar6, o0Var, (i4117 & 29360128) | (458752 & i4117) | 25008 | (3670016 & i4117) | ((i26 << 15) & 234881024));
                rVar2 = rVar3;
                dVar4 = dVar5;
                jVar2 = jVar4;
                dVar2 = lVar4;
                dVar3 = lVar3;
                pVar2 = aVar7;
                aVar3 = aVar6;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar2 = rVar;
                dVar4 = dVar;
                aVar3 = aVar2;
                jVar2 = jVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new s4(list, rVar2, dVar4, aVar3, list2, jVar2, dVar2, dVar3, pVar2, b0Var, i14, i15);
            }
        }
        dVar2 = lVar;
        int i31119 = i320 | i34;
        if ((i15 & 256) == 0) {
            dVar3 = lVar2;
            if (o0VarE.r(dVar3)) {
            }
            int i311110 = i31119 | i36;
            if ((i15 & 512) == 0) {
                pVar2 = pVar;
                if (o0VarE.r(pVar2)) {
                }
                i17 = i311110 | i38;
                if (o0VarE.r(b0Var)) {
                }
                if ((306783379 & i17) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (o0VarE.n(i17 & 1, z14)) {
                    o0VarE.G0();
                    i19 = i14 & 1;
                    aVar4 = p3.m.f135153a;
                    if (i19 != 0) {
                        aVar5 = h4.r.S;
                        h4.d.f81522a.getClass();
                        gVar = h4.d.a.f81524b;
                        if ((i15 & 8) != 0) {
                            zR = o0VarE.r(list);
                            objQ = o0VarE.q();
                            if (zR) {
                                aVar4.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new ad.b(list, 11);
                                    o0VarE.K(objQ);
                                }
                            } else {
                                objQ = new ad.b(list, 11);
                                o0VarE.K(objQ);
                            }
                            aVar2 = (e23.a) objQ;
                            i17 &= -7169;
                        }
                        jVar3 = new uc.j();
                        i24 = i17 & (-458753);
                        if ((i15 & 128) != 0) {
                            dVar2 = new vb1.d(7);
                            i24 = i17 & (-29818881);
                        }
                        if ((i15 & 256) != 0) {
                            i24 &= -234881025;
                            dVar3 = new vb1.d(8);
                        }
                        if ((i15 & 512) != 0) {
                            int i311111 = i24 & (-1879048193);
                            aVar7 = new uj1.a(28);
                            aVar6 = aVar2;
                            lVar4 = dVar2;
                            lVar3 = dVar3;
                            dVar5 = gVar;
                            jVar4 = jVar3;
                            i25 = 0;
                            rVar3 = aVar5;
                            i26 = i311111;
                        } else {
                            aVar6 = aVar2;
                            lVar3 = dVar3;
                            aVar7 = pVar2;
                            dVar5 = gVar;
                            jVar4 = jVar3;
                            i25 = 0;
                            rVar3 = aVar5;
                            i26 = i24;
                            lVar4 = dVar2;
                        }
                    } else {
                        aVar5 = h4.r.S;
                        h4.d.f81522a.getClass();
                        gVar = h4.d.a.f81524b;
                        if ((i15 & 8) != 0) {
                            zR = o0VarE.r(list);
                            objQ = o0VarE.q();
                            if (zR) {
                                aVar4.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new ad.b(list, 11);
                                    o0VarE.K(objQ);
                                }
                            } else {
                                objQ = new ad.b(list, 11);
                                o0VarE.K(objQ);
                            }
                            aVar2 = (e23.a) objQ;
                            i17 &= -7169;
                        }
                        jVar3 = new uc.j();
                        i24 = i17 & (-458753);
                        if ((i15 & 128) != 0) {
                            dVar2 = new vb1.d(7);
                            i24 = i17 & (-29818881);
                        }
                        if ((i15 & 256) != 0) {
                            i24 &= -234881025;
                            dVar3 = new vb1.d(8);
                        }
                        if ((i15 & 512) != 0) {
                            int i311112 = i24 & (-1879048193);
                            aVar7 = new uj1.a(28);
                            aVar6 = aVar2;
                            lVar4 = dVar2;
                            lVar3 = dVar3;
                            dVar5 = gVar;
                            jVar4 = jVar3;
                            i25 = 0;
                            rVar3 = aVar5;
                            i26 = i311112;
                        } else {
                            aVar6 = aVar2;
                            lVar3 = dVar3;
                            aVar7 = pVar2;
                            dVar5 = gVar;
                            jVar4 = jVar3;
                            i25 = 0;
                            rVar3 = aVar5;
                            i26 = i24;
                            lVar4 = dVar2;
                        }
                    }
                    o0VarE.h0();
                    p3.x1 x1Var115 = p3.n.f135158a;
                    if (!list.isEmpty()) {
                        vb.h.s("NavDisplay backstack cannot be empty");
                        return;
                    }
                    int i4118 = ((i18 << 6) & 896) | (i26 & 14) | ((i26 >> 9) & 112);
                    zB = o0VarE.B(p13.h0.b1(list));
                    objQ2 = o0VarE.q();
                    if (zB) {
                        aVar4.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            if (list instanceof RandomAccess) {
                                arrayList2 = new ArrayList(list.size());
                                size = list.size();
                                while (i25 < size) {
                                    arrayList2.add((sc.h) b0Var.invoke(list.get(i25)));
                                    i25++;
                                }
                                objQ2 = arrayList2;
                            } else {
                                arrayList = new ArrayList(p13.y.r(list, 10));
                                it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add((sc.h) b0Var.invoke(it.next()));
                                }
                                objQ2 = arrayList;
                            }
                            o0VarE.K(objQ2);
                        }
                    } else {
                        if (list instanceof RandomAccess) {
                            arrayList2 = new ArrayList(list.size());
                            size = list.size();
                            while (i25 < size) {
                                arrayList2.add((sc.h) b0Var.invoke(list.get(i25)));
                                i25++;
                            }
                            objQ2 = arrayList2;
                        } else {
                            arrayList = new ArrayList(p13.y.r(list, 10));
                            it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add((sc.h) b0Var.invoke(it.next()));
                            }
                            objQ2 = arrayList;
                        }
                        o0VarE.K(objQ2);
                    }
                    ArrayList arrayListC13 = og2.k.C((List) objQ2, list2, o0VarE, i4118 & 112);
                    p3.x1 x1Var116 = p3.n.f135158a;
                    int i4119 = i26 >> 6;
                    o0Var = o0VarE;
                    e(arrayListC13, rVar3, dVar5, jVar4, lVar4, lVar3, aVar7, aVar6, o0Var, (i4119 & 29360128) | (458752 & i4119) | 25008 | (3670016 & i4119) | ((i26 << 15) & 234881024));
                    rVar2 = rVar3;
                    dVar4 = dVar5;
                    jVar2 = jVar4;
                    dVar2 = lVar4;
                    dVar3 = lVar3;
                    pVar2 = aVar7;
                    aVar3 = aVar6;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    rVar2 = rVar;
                    dVar4 = dVar;
                    aVar3 = aVar2;
                    jVar2 = jVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new s4(list, rVar2, dVar4, aVar3, list2, jVar2, dVar2, dVar3, pVar2, b0Var, i14, i15);
                }
            }
            pVar2 = pVar;
            i17 = i311110 | i38;
            if (o0VarE.r(b0Var)) {
            }
            if ((306783379 & i17) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (o0VarE.n(i17 & 1, z14)) {
                o0VarE.G0();
                i19 = i14 & 1;
                aVar4 = p3.m.f135153a;
                if (i19 != 0) {
                    aVar5 = h4.r.S;
                    h4.d.f81522a.getClass();
                    gVar = h4.d.a.f81524b;
                    if ((i15 & 8) != 0) {
                        zR = o0VarE.r(list);
                        objQ = o0VarE.q();
                        if (zR) {
                            aVar4.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new ad.b(list, 11);
                                o0VarE.K(objQ);
                            }
                        } else {
                            objQ = new ad.b(list, 11);
                            o0VarE.K(objQ);
                        }
                        aVar2 = (e23.a) objQ;
                        i17 &= -7169;
                    }
                    jVar3 = new uc.j();
                    i24 = i17 & (-458753);
                    if ((i15 & 128) != 0) {
                        dVar2 = new vb1.d(7);
                        i24 = i17 & (-29818881);
                    }
                    if ((i15 & 256) != 0) {
                        i24 &= -234881025;
                        dVar3 = new vb1.d(8);
                    }
                    if ((i15 & 512) != 0) {
                        int i311113 = i24 & (-1879048193);
                        aVar7 = new uj1.a(28);
                        aVar6 = aVar2;
                        lVar4 = dVar2;
                        lVar3 = dVar3;
                        dVar5 = gVar;
                        jVar4 = jVar3;
                        i25 = 0;
                        rVar3 = aVar5;
                        i26 = i311113;
                    } else {
                        aVar6 = aVar2;
                        lVar3 = dVar3;
                        aVar7 = pVar2;
                        dVar5 = gVar;
                        jVar4 = jVar3;
                        i25 = 0;
                        rVar3 = aVar5;
                        i26 = i24;
                        lVar4 = dVar2;
                    }
                } else {
                    aVar5 = h4.r.S;
                    h4.d.f81522a.getClass();
                    gVar = h4.d.a.f81524b;
                    if ((i15 & 8) != 0) {
                        zR = o0VarE.r(list);
                        objQ = o0VarE.q();
                        if (zR) {
                            aVar4.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new ad.b(list, 11);
                                o0VarE.K(objQ);
                            }
                        } else {
                            objQ = new ad.b(list, 11);
                            o0VarE.K(objQ);
                        }
                        aVar2 = (e23.a) objQ;
                        i17 &= -7169;
                    }
                    jVar3 = new uc.j();
                    i24 = i17 & (-458753);
                    if ((i15 & 128) != 0) {
                        dVar2 = new vb1.d(7);
                        i24 = i17 & (-29818881);
                    }
                    if ((i15 & 256) != 0) {
                        i24 &= -234881025;
                        dVar3 = new vb1.d(8);
                    }
                    if ((i15 & 512) != 0) {
                        int i311114 = i24 & (-1879048193);
                        aVar7 = new uj1.a(28);
                        aVar6 = aVar2;
                        lVar4 = dVar2;
                        lVar3 = dVar3;
                        dVar5 = gVar;
                        jVar4 = jVar3;
                        i25 = 0;
                        rVar3 = aVar5;
                        i26 = i311114;
                    } else {
                        aVar6 = aVar2;
                        lVar3 = dVar3;
                        aVar7 = pVar2;
                        dVar5 = gVar;
                        jVar4 = jVar3;
                        i25 = 0;
                        rVar3 = aVar5;
                        i26 = i24;
                        lVar4 = dVar2;
                    }
                }
                o0VarE.h0();
                p3.x1 x1Var117 = p3.n.f135158a;
                if (!list.isEmpty()) {
                    vb.h.s("NavDisplay backstack cannot be empty");
                    return;
                }
                int i41110 = ((i18 << 6) & 896) | (i26 & 14) | ((i26 >> 9) & 112);
                zB = o0VarE.B(p13.h0.b1(list));
                objQ2 = o0VarE.q();
                if (zB) {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        if (list instanceof RandomAccess) {
                            arrayList2 = new ArrayList(list.size());
                            size = list.size();
                            while (i25 < size) {
                                arrayList2.add((sc.h) b0Var.invoke(list.get(i25)));
                                i25++;
                            }
                            objQ2 = arrayList2;
                        } else {
                            arrayList = new ArrayList(p13.y.r(list, 10));
                            it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add((sc.h) b0Var.invoke(it.next()));
                            }
                            objQ2 = arrayList;
                        }
                        o0VarE.K(objQ2);
                    }
                } else {
                    if (list instanceof RandomAccess) {
                        arrayList2 = new ArrayList(list.size());
                        size = list.size();
                        while (i25 < size) {
                            arrayList2.add((sc.h) b0Var.invoke(list.get(i25)));
                            i25++;
                        }
                        objQ2 = arrayList2;
                    } else {
                        arrayList = new ArrayList(p13.y.r(list, 10));
                        it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add((sc.h) b0Var.invoke(it.next()));
                        }
                        objQ2 = arrayList;
                    }
                    o0VarE.K(objQ2);
                }
                ArrayList arrayListC14 = og2.k.C((List) objQ2, list2, o0VarE, i41110 & 112);
                p3.x1 x1Var118 = p3.n.f135158a;
                int i41111 = i26 >> 6;
                o0Var = o0VarE;
                e(arrayListC14, rVar3, dVar5, jVar4, lVar4, lVar3, aVar7, aVar6, o0Var, (i41111 & 29360128) | (458752 & i41111) | 25008 | (3670016 & i41111) | ((i26 << 15) & 234881024));
                rVar2 = rVar3;
                dVar4 = dVar5;
                jVar2 = jVar4;
                dVar2 = lVar4;
                dVar3 = lVar3;
                pVar2 = aVar7;
                aVar3 = aVar6;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar2 = rVar;
                dVar4 = dVar;
                aVar3 = aVar2;
                jVar2 = jVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new s4(list, rVar2, dVar4, aVar3, list2, jVar2, dVar2, dVar3, pVar2, b0Var, i14, i15);
            }
        }
        dVar3 = lVar2;
        int i311115 = i31119 | i36;
        if ((i15 & 512) == 0) {
            pVar2 = pVar;
            if (o0VarE.r(pVar2)) {
            }
            i17 = i311115 | i38;
            if (o0VarE.r(b0Var)) {
            }
            if ((306783379 & i17) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (o0VarE.n(i17 & 1, z14)) {
                o0VarE.G0();
                i19 = i14 & 1;
                aVar4 = p3.m.f135153a;
                if (i19 != 0) {
                    aVar5 = h4.r.S;
                    h4.d.f81522a.getClass();
                    gVar = h4.d.a.f81524b;
                    if ((i15 & 8) != 0) {
                        zR = o0VarE.r(list);
                        objQ = o0VarE.q();
                        if (zR) {
                            aVar4.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new ad.b(list, 11);
                                o0VarE.K(objQ);
                            }
                        } else {
                            objQ = new ad.b(list, 11);
                            o0VarE.K(objQ);
                        }
                        aVar2 = (e23.a) objQ;
                        i17 &= -7169;
                    }
                    jVar3 = new uc.j();
                    i24 = i17 & (-458753);
                    if ((i15 & 128) != 0) {
                        dVar2 = new vb1.d(7);
                        i24 = i17 & (-29818881);
                    }
                    if ((i15 & 256) != 0) {
                        i24 &= -234881025;
                        dVar3 = new vb1.d(8);
                    }
                    if ((i15 & 512) != 0) {
                        int i311116 = i24 & (-1879048193);
                        aVar7 = new uj1.a(28);
                        aVar6 = aVar2;
                        lVar4 = dVar2;
                        lVar3 = dVar3;
                        dVar5 = gVar;
                        jVar4 = jVar3;
                        i25 = 0;
                        rVar3 = aVar5;
                        i26 = i311116;
                    } else {
                        aVar6 = aVar2;
                        lVar3 = dVar3;
                        aVar7 = pVar2;
                        dVar5 = gVar;
                        jVar4 = jVar3;
                        i25 = 0;
                        rVar3 = aVar5;
                        i26 = i24;
                        lVar4 = dVar2;
                    }
                } else {
                    aVar5 = h4.r.S;
                    h4.d.f81522a.getClass();
                    gVar = h4.d.a.f81524b;
                    if ((i15 & 8) != 0) {
                        zR = o0VarE.r(list);
                        objQ = o0VarE.q();
                        if (zR) {
                            aVar4.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new ad.b(list, 11);
                                o0VarE.K(objQ);
                            }
                        } else {
                            objQ = new ad.b(list, 11);
                            o0VarE.K(objQ);
                        }
                        aVar2 = (e23.a) objQ;
                        i17 &= -7169;
                    }
                    jVar3 = new uc.j();
                    i24 = i17 & (-458753);
                    if ((i15 & 128) != 0) {
                        dVar2 = new vb1.d(7);
                        i24 = i17 & (-29818881);
                    }
                    if ((i15 & 256) != 0) {
                        i24 &= -234881025;
                        dVar3 = new vb1.d(8);
                    }
                    if ((i15 & 512) != 0) {
                        int i311117 = i24 & (-1879048193);
                        aVar7 = new uj1.a(28);
                        aVar6 = aVar2;
                        lVar4 = dVar2;
                        lVar3 = dVar3;
                        dVar5 = gVar;
                        jVar4 = jVar3;
                        i25 = 0;
                        rVar3 = aVar5;
                        i26 = i311117;
                    } else {
                        aVar6 = aVar2;
                        lVar3 = dVar3;
                        aVar7 = pVar2;
                        dVar5 = gVar;
                        jVar4 = jVar3;
                        i25 = 0;
                        rVar3 = aVar5;
                        i26 = i24;
                        lVar4 = dVar2;
                    }
                }
                o0VarE.h0();
                p3.x1 x1Var119 = p3.n.f135158a;
                if (!list.isEmpty()) {
                    vb.h.s("NavDisplay backstack cannot be empty");
                    return;
                }
                int i41112 = ((i18 << 6) & 896) | (i26 & 14) | ((i26 >> 9) & 112);
                zB = o0VarE.B(p13.h0.b1(list));
                objQ2 = o0VarE.q();
                if (zB) {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        if (list instanceof RandomAccess) {
                            arrayList2 = new ArrayList(list.size());
                            size = list.size();
                            while (i25 < size) {
                                arrayList2.add((sc.h) b0Var.invoke(list.get(i25)));
                                i25++;
                            }
                            objQ2 = arrayList2;
                        } else {
                            arrayList = new ArrayList(p13.y.r(list, 10));
                            it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add((sc.h) b0Var.invoke(it.next()));
                            }
                            objQ2 = arrayList;
                        }
                        o0VarE.K(objQ2);
                    }
                } else {
                    if (list instanceof RandomAccess) {
                        arrayList2 = new ArrayList(list.size());
                        size = list.size();
                        while (i25 < size) {
                            arrayList2.add((sc.h) b0Var.invoke(list.get(i25)));
                            i25++;
                        }
                        objQ2 = arrayList2;
                    } else {
                        arrayList = new ArrayList(p13.y.r(list, 10));
                        it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add((sc.h) b0Var.invoke(it.next()));
                        }
                        objQ2 = arrayList;
                    }
                    o0VarE.K(objQ2);
                }
                ArrayList arrayListC15 = og2.k.C((List) objQ2, list2, o0VarE, i41112 & 112);
                p3.x1 x1Var1110 = p3.n.f135158a;
                int i41113 = i26 >> 6;
                o0Var = o0VarE;
                e(arrayListC15, rVar3, dVar5, jVar4, lVar4, lVar3, aVar7, aVar6, o0Var, (i41113 & 29360128) | (458752 & i41113) | 25008 | (3670016 & i41113) | ((i26 << 15) & 234881024));
                rVar2 = rVar3;
                dVar4 = dVar5;
                jVar2 = jVar4;
                dVar2 = lVar4;
                dVar3 = lVar3;
                pVar2 = aVar7;
                aVar3 = aVar6;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar2 = rVar;
                dVar4 = dVar;
                aVar3 = aVar2;
                jVar2 = jVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new s4(list, rVar2, dVar4, aVar3, list2, jVar2, dVar2, dVar3, pVar2, b0Var, i14, i15);
            }
        }
        pVar2 = pVar;
        i17 = i311115 | i38;
        if (o0VarE.r(b0Var)) {
        }
        if ((306783379 & i17) == 306783378) {
            z14 = true;
        } else {
            z14 = true;
        }
        if (o0VarE.n(i17 & 1, z14)) {
            o0VarE.G0();
            i19 = i14 & 1;
            aVar4 = p3.m.f135153a;
            if (i19 != 0) {
                aVar5 = h4.r.S;
                h4.d.f81522a.getClass();
                gVar = h4.d.a.f81524b;
                if ((i15 & 8) != 0) {
                    zR = o0VarE.r(list);
                    objQ = o0VarE.q();
                    if (zR) {
                        aVar4.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ad.b(list, 11);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new ad.b(list, 11);
                        o0VarE.K(objQ);
                    }
                    aVar2 = (e23.a) objQ;
                    i17 &= -7169;
                }
                jVar3 = new uc.j();
                i24 = i17 & (-458753);
                if ((i15 & 128) != 0) {
                    dVar2 = new vb1.d(7);
                    i24 = i17 & (-29818881);
                }
                if ((i15 & 256) != 0) {
                    i24 &= -234881025;
                    dVar3 = new vb1.d(8);
                }
                if ((i15 & 512) != 0) {
                    int i311118 = i24 & (-1879048193);
                    aVar7 = new uj1.a(28);
                    aVar6 = aVar2;
                    lVar4 = dVar2;
                    lVar3 = dVar3;
                    dVar5 = gVar;
                    jVar4 = jVar3;
                    i25 = 0;
                    rVar3 = aVar5;
                    i26 = i311118;
                } else {
                    aVar6 = aVar2;
                    lVar3 = dVar3;
                    aVar7 = pVar2;
                    dVar5 = gVar;
                    jVar4 = jVar3;
                    i25 = 0;
                    rVar3 = aVar5;
                    i26 = i24;
                    lVar4 = dVar2;
                }
            } else {
                aVar5 = h4.r.S;
                h4.d.f81522a.getClass();
                gVar = h4.d.a.f81524b;
                if ((i15 & 8) != 0) {
                    zR = o0VarE.r(list);
                    objQ = o0VarE.q();
                    if (zR) {
                        aVar4.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ad.b(list, 11);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new ad.b(list, 11);
                        o0VarE.K(objQ);
                    }
                    aVar2 = (e23.a) objQ;
                    i17 &= -7169;
                }
                jVar3 = new uc.j();
                i24 = i17 & (-458753);
                if ((i15 & 128) != 0) {
                    dVar2 = new vb1.d(7);
                    i24 = i17 & (-29818881);
                }
                if ((i15 & 256) != 0) {
                    i24 &= -234881025;
                    dVar3 = new vb1.d(8);
                }
                if ((i15 & 512) != 0) {
                    int i311119 = i24 & (-1879048193);
                    aVar7 = new uj1.a(28);
                    aVar6 = aVar2;
                    lVar4 = dVar2;
                    lVar3 = dVar3;
                    dVar5 = gVar;
                    jVar4 = jVar3;
                    i25 = 0;
                    rVar3 = aVar5;
                    i26 = i311119;
                } else {
                    aVar6 = aVar2;
                    lVar3 = dVar3;
                    aVar7 = pVar2;
                    dVar5 = gVar;
                    jVar4 = jVar3;
                    i25 = 0;
                    rVar3 = aVar5;
                    i26 = i24;
                    lVar4 = dVar2;
                }
            }
            o0VarE.h0();
            p3.x1 x1Var1111 = p3.n.f135158a;
            if (!list.isEmpty()) {
                vb.h.s("NavDisplay backstack cannot be empty");
                return;
            }
            int i41114 = ((i18 << 6) & 896) | (i26 & 14) | ((i26 >> 9) & 112);
            zB = o0VarE.B(p13.h0.b1(list));
            objQ2 = o0VarE.q();
            if (zB) {
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    if (list instanceof RandomAccess) {
                        arrayList2 = new ArrayList(list.size());
                        size = list.size();
                        while (i25 < size) {
                            arrayList2.add((sc.h) b0Var.invoke(list.get(i25)));
                            i25++;
                        }
                        objQ2 = arrayList2;
                    } else {
                        arrayList = new ArrayList(p13.y.r(list, 10));
                        it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add((sc.h) b0Var.invoke(it.next()));
                        }
                        objQ2 = arrayList;
                    }
                    o0VarE.K(objQ2);
                }
            } else {
                if (list instanceof RandomAccess) {
                    arrayList2 = new ArrayList(list.size());
                    size = list.size();
                    while (i25 < size) {
                        arrayList2.add((sc.h) b0Var.invoke(list.get(i25)));
                        i25++;
                    }
                    objQ2 = arrayList2;
                } else {
                    arrayList = new ArrayList(p13.y.r(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add((sc.h) b0Var.invoke(it.next()));
                    }
                    objQ2 = arrayList;
                }
                o0VarE.K(objQ2);
            }
            ArrayList arrayListC16 = og2.k.C((List) objQ2, list2, o0VarE, i41114 & 112);
            p3.x1 x1Var1112 = p3.n.f135158a;
            int i41115 = i26 >> 6;
            o0Var = o0VarE;
            e(arrayListC16, rVar3, dVar5, jVar4, lVar4, lVar3, aVar7, aVar6, o0Var, (i41115 & 29360128) | (458752 & i41115) | 25008 | (3670016 & i41115) | ((i26 << 15) & 234881024));
            rVar2 = rVar3;
            dVar4 = dVar5;
            jVar2 = jVar4;
            dVar2 = lVar4;
            dVar3 = lVar3;
            pVar2 = aVar7;
            aVar3 = aVar6;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
            dVar4 = dVar;
            aVar3 = aVar2;
            jVar2 = jVar;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s4(list, rVar2, dVar4, aVar3, list2, jVar2, dVar2, dVar3, pVar2, b0Var, i14, i15);
        }
    }

    public static final void f0(ByteArrayOutputStream byteArrayOutputStream, String str) throws IOException {
        if (str.length() == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bytes = str.getBytes(d53.c.f57666b);
        bytes.getClass();
        if (bytes.length > 255) {
            bytes = Arrays.copyOf(bytes, 255);
        }
        byteArrayOutputStream.write(bytes.length);
        byteArrayOutputStream.write(bytes);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:207:0x0487 A[PHI: r5
      0x0487: PHI (r5v22 e23.l) = (r5v15 e23.l), (r5v23 e23.l) binds: [B:206:0x0485, B:202:0x047e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:211:0x0495  */
    /* JADX WARN: Code duplicated, block: B:214:0x049e  */
    /* JADX WARN: Code duplicated, block: B:217:0x04a4 A[PHI: r6
      0x04a4: PHI (r6v23 e23.l) = (r6v17 e23.l), (r6v24 e23.l) binds: [B:216:0x04a2, B:212:0x049b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:220:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:224:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:227:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:229:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:232:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:235:0x053b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:236:0x053d  */
    /* JADX WARN: Code duplicated, block: B:239:0x0555 A[LOOP:2: B:239:0x0555->B:242:0x0590, LOOP_START, PHI: r0
      0x0555: PHI (r0v42 int) = (r0v40 int), (r0v47 int) binds: [B:238:0x0553, B:242:0x0590] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:242:0x0590 A[LOOP:2: B:239:0x0555->B:242:0x0590, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:255:0x0592 A[EDGE_INSN: B:255:0x0592->B:243:0x0592 BREAK  A[LOOP:2: B:239:0x0555->B:242:0x0590], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(uc.g gVar, xc.e eVar, h4.r rVar, h4.d dVar, e23.l lVar, e23.l lVar2, final e23.p pVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        float f14;
        int i15;
        Object next;
        boolean z14;
        float f15;
        Collection collection;
        boolean z15;
        e23.l lVar3;
        boolean z16;
        e23.l lVar4;
        boolean z17;
        Object objQ;
        Object obj;
        boolean zB;
        Object objQ2;
        Object objQ3;
        Object obj2;
        p3.o0 o0Var2;
        boolean zB2;
        Object objQ4;
        int size;
        int i16;
        p3.o0 o0VarE = mVar.E(-303833701);
        int i17 = (i14 & 6) == 0 ? (o0VarE.B(gVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i17 |= o0VarE.B(eVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i17 |= o0VarE.B(rVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i17 |= o0VarE.B(dVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i17 |= o0VarE.r(null) ? 16384 : 8192;
        }
        if ((i14 & 196608) == 0) {
            i17 |= o0VarE.r(lVar) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i17 |= o0VarE.r(lVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i17 |= o0VarE.r(pVar) ? 8388608 : 4194304;
        }
        if (o0VarE.n(i17 & 1, (i17 & 4793491) != 4793490)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            uc.c<T> cVar = gVar.f169928c;
            Collection collection2 = gVar.f169926a;
            Object objQ5 = o0VarE.q();
            p3.m.f135153a.getClass();
            Object obj3 = p3.m.a.f135155b;
            if (objQ5 == obj3) {
                objQ5 = new s1.a1(cVar);
                o0VarE.K(objQ5);
            }
            s1.a1 a1Var = (s1.a1) objQ5;
            s1.t1 t1VarD = s1.w1.d(a1Var, "scene", o0VarE, s1.a1.f155459s | 48);
            s1.a2<S> a2Var = t1VarD.f155744a;
            p3.c2 c2Var = t1VarD.f155747d;
            boolean zB3 = o0VarE.B((uc.c) a2Var.a());
            Object objQ6 = o0VarE.q();
            if (zB3 || objQ6 == obj3) {
                objQ6 = p13.h0.b1(collection2);
                o0VarE.K(objQ6);
            }
            List list = (List) objQ6;
            uc.c cVar2 = (uc.c) p13.h0.n0(gVar.f169929d);
            int i18 = i17;
            wc.j jVar = (wc.j) eVar.f189891a.getF182175a();
            boolean z18 = jVar instanceof wc.j.c;
            boolean z19 = z18 && cVar2 != null;
            boolean z24 = jVar instanceof wc.j.b;
            if (z24) {
                f14 = 0.0f;
            } else {
                if (z18 == 0) {
                    lc.u0.r();
                    return;
                }
                f14 = ((wc.j.c) jVar).f184259a.f184222b;
            }
            if (z24) {
                i15 = 2;
            } else {
                if (!z18) {
                    lc.u0.r();
                    return;
                }
                i15 = ((wc.j.c) jVar).f184259a.f184221a;
            }
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((sc.h) it.next()).f158452b);
            }
            ArrayList arrayList2 = new ArrayList(p13.y.r(collection2, 10));
            Iterator it3 = collection2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((sc.h) it3.next()).f158452b);
            }
            if (p005kotlin.jvm.internal.s.g(p13.h0.b0(arrayList), p13.h0.b0(arrayList2)) && arrayList2.size() <= arrayList.size()) {
                Iterator<Integer> it4 = p13.x.i(arrayList2).iterator();
                while (true) {
                    if (!((j23.k) it4).f96801c) {
                        next = null;
                        break;
                    }
                    next = ((p13.p0) it4).next();
                    int iIntValue = ((Number) next).intValue();
                    Iterator<Integer> it5 = it4;
                    if (!p005kotlin.jvm.internal.s.g(arrayList2.get(iIntValue), arrayList.get(iIntValue))) {
                        break;
                    } else {
                        it4 = it5;
                    }
                }
                if (((Integer) next) != null || arrayList2.size() == arrayList.size()) {
                    z14 = false;
                } else {
                    z14 = true;
                }
            } else {
                z14 = false;
            }
            Object objQ7 = o0VarE.q();
            Object obj4 = p3.m.a.f135155b;
            if (objQ7 == obj4) {
                objQ7 = new f4.u();
                o0VarE.K(objQ7);
            }
            f4.u uVar = (f4.u) objQ7;
            Object objQ8 = o0VarE.q();
            if (objQ8 == obj4) {
                int i19 = p1.x0.f134871a;
                objQ8 = new p1.o0(0, 1, null);
                o0VarE.K(objQ8);
            }
            p1.o0 o0Var3 = (p1.o0) objQ8;
            Class<?> cls = a2Var.a().getClass();
            p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
            o13.p pVar2 = new o13.p(t0Var.b(cls), ((uc.c) a2Var.a()).getF169931a());
            o13.p pVar3 = new o13.p(t0Var.b(c2Var.getF182175a().getClass()), ((uc.c) c2Var.getF182175a()).getF169931a());
            int iA = o0Var3.a(pVar2);
            if (iA >= 0) {
                f15 = o0Var3.f134864c[iA];
            } else {
                f15 = 0.0f;
                o0Var3.f(pVar2, 0.0f);
            }
            float f16 = pVar2.equals(pVar3) ? f15 : (z14 != 0 || z19) ? f15 - 1.0f : 1.0f + f15;
            uVar.put(pVar3, c2Var.getF182175a());
            f4.m mVar2 = uVar.f68808b;
            o0Var3.f(pVar3, f16);
            Collection collection3 = gVar.f169927b;
            float f17 = f15;
            float f18 = f16;
            boolean zB4 = o0VarE.B(p13.h0.b1(mVar2)) | o0VarE.B(p13.h0.b1(collection3)) | o0VarE.B(o0Var3.toString());
            Object objQ9 = o0VarE.q();
            if (zB4 || objQ9 == obj4) {
                q13.c cVar3 = new q13.c();
                ArrayList arrayList3 = new ArrayList();
                List listN0 = p13.h0.N0(mVar2, new vc.f(o0Var3));
                ArrayList<uc.c> arrayList4 = new ArrayList(p13.y.r(listN0, 10));
                Iterator it6 = listN0.iterator();
                while (it6.hasNext()) {
                    arrayList4.add((uc.c) ((Map.Entry) it6.next()).getValue());
                }
                for (uc.c cVar4 : arrayList4) {
                    if (!arrayList3.contains(cVar4)) {
                        arrayList3.add(cVar4);
                    }
                }
                ArrayList arrayListC0 = p13.h0.C0(collection3, arrayList3);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int size2 = arrayListC0.size();
                int i24 = 0;
                while (i24 < size2) {
                    uc.c cVar5 = (uc.c) arrayListC0.get(i24);
                    ArrayList arrayList5 = arrayListC0;
                    List listC = cVar5.c();
                    int i25 = size2;
                    Collection collection4 = collection3;
                    int i26 = i24;
                    ArrayList arrayList6 = new ArrayList(p13.y.r(listC, 10));
                    Iterator it7 = listC.iterator();
                    while (it7.hasNext()) {
                        arrayList6.add(((sc.h) it7.next()).f158452b);
                    }
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj5 : arrayList6) {
                        if (!linkedHashSet.contains(obj5)) {
                            arrayList7.add(obj5);
                        }
                    }
                    Set setG1 = p13.h0.g1(arrayList7);
                    cVar3.put(new o13.p(p005kotlin.jvm.internal.s0.f105811a.b(cVar5.getClass()), cVar5.getF169931a()), p13.h0.f1(linkedHashSet));
                    linkedHashSet.addAll(setG1);
                    i24 = i26 + 1;
                    arrayListC0 = arrayList5;
                    size2 = i25;
                    collection3 = collection4;
                }
                collection = collection3;
                objQ9 = cVar3.b();
                o0VarE.K(objQ9);
            } else {
                collection = collection3;
            }
            Map map = (Map) objQ9;
            uc.c cVar6 = f17 >= f18 ? (uc.c) a2Var.a() : (uc.c) c2Var.getF182175a();
            if (z19) {
                o0VarE.C(-2007902955);
                if (p005kotlin.jvm.internal.s.g(a2Var.a(), cVar2)) {
                    z15 = false;
                    o0VarE.C(-2030319737);
                } else {
                    o0VarE.C(-2007849325);
                    Float fValueOf = Float.valueOf(f14);
                    boolean zR = o0VarE.r(a1Var) | o0VarE.i(f14) | o0VarE.B(cVar2);
                    Object objQ10 = o0VarE.q();
                    if (zR || objQ10 == p3.m.a.f135155b) {
                        objQ10 = new vc.d(a1Var, f14, cVar2, null);
                        o0VarE.K(objQ10);
                    }
                    p3.l0.f(cVar2, fValueOf, (e23.p) objQ10, o0VarE);
                    z15 = false;
                }
                o0VarE.g0(z15);
                o0VarE.g0(z15);
            } else {
                o0VarE.C(-2007567752);
                boolean zR2 = o0VarE.r(a1Var) | o0VarE.B(cVar) | o0VarE.B(t1VarD);
                Object objQ11 = o0VarE.q();
                if (zR2 || objQ11 == p3.m.a.f135155b) {
                    objQ11 = new vc.e(a1Var, cVar, t1VarD, null);
                    o0VarE.K(objQ11);
                }
                p3.l0.e((e23.p) objQ11, cVar, o0VarE);
                z15 = false;
                o0VarE.g0(false);
            }
            final boolean z25 = z14;
            boolean zH = o0VarE.h(z19) | o0VarE.B(cVar6) | o0VarE.k(i15) | (((((i18 & 29360128) ^ 12582912) <= 8388608 || !o0VarE.B(pVar)) && (i18 & 12582912) != 8388608) ? z15 : true) | o0VarE.h(z25);
            if (((i18 & 3670016) ^ 1572864) > 1048576) {
                lVar3 = lVar2;
                if (o0VarE.B(lVar3)) {
                    z16 = true;
                }
                boolean z26 = zH | z16;
                if (((i18 & 458752) ^ 196608) > 131072) {
                    lVar4 = lVar;
                    if (!o0VarE.B(lVar4)) {
                        z15 = true;
                    }
                    z17 = z26 | z15;
                    objQ = o0VarE.q();
                    if (z17 || objQ == p3.m.a.f135155b) {
                        final e23.l lVar5 = lVar3;
                        final e23.l lVar6 = lVar4;
                        final int i27 = i15;
                        final uc.c cVar7 = cVar6;
                        final boolean z27 = z19;
                        Object obj6 = new e23.l() { // from class: vc.b
                            @Override // e23.l
                            public final Object invoke(Object obj7) {
                                l0 l0Var;
                                l0 l0Var2;
                                l0 l0Var3;
                                n nVar = (n) obj7;
                                boolean z28 = z27;
                                uc.c cVar8 = cVar7;
                                if (z28) {
                                    Object obj8 = cVar8.getMetadata().get("predictivePopTransitionSpec");
                                    p pVar4 = y0.f(2, obj8) ? (p) obj8 : null;
                                    int i28 = i27;
                                    return (pVar4 == null || (l0Var3 = (l0) pVar4.invoke(nVar, Integer.valueOf(i28))) == null) ? (l0) pVar.invoke(nVar, Integer.valueOf(i28)) : l0Var3;
                                }
                                if (z25) {
                                    Object obj9 = cVar8.getMetadata().get("popTransitionSpec");
                                    l lVar7 = y0.f(1, obj9) ? (l) obj9 : null;
                                    return (lVar7 == null || (l0Var2 = (l0) lVar7.invoke(nVar)) == null) ? (l0) lVar5.invoke(nVar) : l0Var2;
                                }
                                Object obj10 = cVar8.getMetadata().get("transitionSpec");
                                l lVar8 = y0.f(1, obj10) ? (l) obj10 : null;
                                return (lVar8 == null || (l0Var = (l0) lVar8.invoke(nVar)) == null) ? (l0) lVar6.invoke(nVar) : l0Var;
                            }
                        };
                        o0VarE.K(obj6);
                        objQ = obj6;
                    }
                    obj = (e23.l) objQ;
                    zB = o0VarE.B(obj) | o0VarE.i(f18) | o0VarE.r(null);
                    objQ2 = o0VarE.q();
                    if (zB || objQ2 == p3.m.a.f135155b) {
                        objQ2 = new l02.l(obj, f18, 5);
                        o0VarE.K(objQ2);
                    }
                    e23.l lVar7 = (e23.l) objQ2;
                    objQ3 = o0VarE.q();
                    obj2 = p3.m.a.f135155b;
                    if (objQ3 == obj2) {
                        objQ3 = new vb1.d(6);
                        o0VarE.K(objQ3);
                    }
                    o0Var2 = o0VarE;
                    r1.b.b(t1VarD, rVar, lVar7, dVar, (e23.l) objQ3, z3.f.c(-1167420988, new m1(11, t1VarD, map), o0VarE), o0Var2, (i18 & 7168) | ((i18 >> 3) & 112) | 221184, 0);
                    zB2 = o0Var2.B(t1VarD) | o0Var2.r(o0Var3);
                    objQ4 = o0Var2.q();
                    if (zB2 || objQ4 == obj2) {
                        objQ4 = new vc.c(t1VarD, uVar, o0Var3, null);
                        o0Var2.K(objQ4);
                    }
                    p3.l0.e((e23.p) objQ4, t1VarD, o0Var2);
                    size = collection.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            i16 = size - 1;
                            uc.b bVar = (uc.b) collection.get(size);
                            p3.v.a(uc.f.f169925a.c(p13.u0.c(new o13.p(p005kotlin.jvm.internal.s0.f105811a.b(bVar.getClass()), bVar.getF169931a()), map)), z3.f.c(485036444, new tr2.o(bVar, 16), o0Var2), o0Var2, 56);
                            if (i16 < 0) {
                                break;
                            } else {
                                size = i16;
                            }
                        }
                    }
                    p3.x1 x1Var2 = p3.n.f135158a;
                    o0Var = o0Var2;
                } else {
                    lVar4 = lVar;
                }
                if ((i18 & 196608) == 131072) {
                    z15 = true;
                }
                z17 = z26 | z15;
                objQ = o0VarE.q();
                if (z17) {
                    final e23.l lVar8 = lVar3;
                    final e23.l lVar9 = lVar4;
                    final int i28 = i15;
                    final uc.c cVar8 = cVar6;
                    final boolean z28 = z19;
                    Object obj7 = new e23.l() { // from class: vc.b
                        @Override // e23.l
                        public final Object invoke(Object obj8) {
                            l0 l0Var;
                            l0 l0Var2;
                            l0 l0Var3;
                            n nVar = (n) obj8;
                            boolean z29 = z28;
                            uc.c cVar9 = cVar8;
                            if (z29) {
                                Object obj9 = cVar9.getMetadata().get("predictivePopTransitionSpec");
                                p pVar4 = y0.f(2, obj9) ? (p) obj9 : null;
                                int i29 = i28;
                                return (pVar4 == null || (l0Var3 = (l0) pVar4.invoke(nVar, Integer.valueOf(i29))) == null) ? (l0) pVar.invoke(nVar, Integer.valueOf(i29)) : l0Var3;
                            }
                            if (z25) {
                                Object obj10 = cVar9.getMetadata().get("popTransitionSpec");
                                l lVar10 = y0.f(1, obj10) ? (l) obj10 : null;
                                return (lVar10 == null || (l0Var2 = (l0) lVar10.invoke(nVar)) == null) ? (l0) lVar8.invoke(nVar) : l0Var2;
                            }
                            Object obj11 = cVar9.getMetadata().get("transitionSpec");
                            l lVar11 = y0.f(1, obj11) ? (l) obj11 : null;
                            return (lVar11 == null || (l0Var = (l0) lVar11.invoke(nVar)) == null) ? (l0) lVar9.invoke(nVar) : l0Var;
                        }
                    };
                    o0VarE.K(obj7);
                    objQ = obj7;
                } else {
                    final e23.l lVar10 = lVar3;
                    final e23.l lVar11 = lVar4;
                    final int i29 = i15;
                    final uc.c cVar9 = cVar6;
                    final boolean z29 = z19;
                    Object obj8 = new e23.l() { // from class: vc.b
                        @Override // e23.l
                        public final Object invoke(Object obj9) {
                            l0 l0Var;
                            l0 l0Var2;
                            l0 l0Var3;
                            n nVar = (n) obj9;
                            boolean z210 = z29;
                            uc.c cVar10 = cVar9;
                            if (z210) {
                                Object obj10 = cVar10.getMetadata().get("predictivePopTransitionSpec");
                                p pVar4 = y0.f(2, obj10) ? (p) obj10 : null;
                                int i210 = i29;
                                return (pVar4 == null || (l0Var3 = (l0) pVar4.invoke(nVar, Integer.valueOf(i210))) == null) ? (l0) pVar.invoke(nVar, Integer.valueOf(i210)) : l0Var3;
                            }
                            if (z25) {
                                Object obj11 = cVar10.getMetadata().get("popTransitionSpec");
                                l lVar12 = y0.f(1, obj11) ? (l) obj11 : null;
                                return (lVar12 == null || (l0Var2 = (l0) lVar12.invoke(nVar)) == null) ? (l0) lVar10.invoke(nVar) : l0Var2;
                            }
                            Object obj12 = cVar10.getMetadata().get("transitionSpec");
                            l lVar13 = y0.f(1, obj12) ? (l) obj12 : null;
                            return (lVar13 == null || (l0Var = (l0) lVar13.invoke(nVar)) == null) ? (l0) lVar11.invoke(nVar) : l0Var;
                        }
                    };
                    o0VarE.K(obj8);
                    objQ = obj8;
                }
                obj = (e23.l) objQ;
                zB = o0VarE.B(obj) | o0VarE.i(f18) | o0VarE.r(null);
                objQ2 = o0VarE.q();
                if (zB) {
                    objQ2 = new l02.l(obj, f18, 5);
                    o0VarE.K(objQ2);
                } else {
                    objQ2 = new l02.l(obj, f18, 5);
                    o0VarE.K(objQ2);
                }
                e23.l lVar12 = (e23.l) objQ2;
                objQ3 = o0VarE.q();
                obj2 = p3.m.a.f135155b;
                if (objQ3 == obj2) {
                    objQ3 = new vb1.d(6);
                    o0VarE.K(objQ3);
                }
                o0Var2 = o0VarE;
                r1.b.b(t1VarD, rVar, lVar12, dVar, (e23.l) objQ3, z3.f.c(-1167420988, new m1(11, t1VarD, map), o0VarE), o0Var2, (i18 & 7168) | ((i18 >> 3) & 112) | 221184, 0);
                zB2 = o0Var2.B(t1VarD) | o0Var2.r(o0Var3);
                objQ4 = o0Var2.q();
                if (zB2) {
                    objQ4 = new vc.c(t1VarD, uVar, o0Var3, null);
                    o0Var2.K(objQ4);
                } else {
                    objQ4 = new vc.c(t1VarD, uVar, o0Var3, null);
                    o0Var2.K(objQ4);
                }
                p3.l0.e((e23.p) objQ4, t1VarD, o0Var2);
                size = collection.size() - 1;
                if (size >= 0) {
                    while (true) {
                        i16 = size - 1;
                        uc.b bVar2 = (uc.b) collection.get(size);
                        p3.v.a(uc.f.f169925a.c(p13.u0.c(new o13.p(p005kotlin.jvm.internal.s0.f105811a.b(bVar2.getClass()), bVar2.getF169931a()), map)), z3.f.c(485036444, new tr2.o(bVar2, 16), o0Var2), o0Var2, 56);
                        if (i16 < 0) {
                            break;
                            break;
                        }
                        size = i16;
                    }
                }
                p3.x1 x1Var3 = p3.n.f135158a;
                o0Var = o0Var2;
            } else {
                lVar3 = lVar2;
            }
            if ((i18 & 1572864) == 1048576) {
                z16 = true;
            } else {
                z16 = z15;
            }
            boolean z210 = zH | z16;
            if (((i18 & 458752) ^ 196608) > 131072) {
                lVar4 = lVar;
                if (!o0VarE.B(lVar4)) {
                    z15 = true;
                }
                z17 = z210 | z15;
                objQ = o0VarE.q();
                if (z17) {
                    final e23.l lVar13 = lVar3;
                    final e23.l lVar14 = lVar4;
                    final int i210 = i15;
                    final uc.c cVar10 = cVar6;
                    final boolean z211 = z19;
                    Object obj9 = new e23.l() { // from class: vc.b
                        @Override // e23.l
                        public final Object invoke(Object obj10) {
                            l0 l0Var;
                            l0 l0Var2;
                            l0 l0Var3;
                            n nVar = (n) obj10;
                            boolean z212 = z211;
                            uc.c cVar11 = cVar10;
                            if (z212) {
                                Object obj11 = cVar11.getMetadata().get("predictivePopTransitionSpec");
                                p pVar4 = y0.f(2, obj11) ? (p) obj11 : null;
                                int i211 = i210;
                                return (pVar4 == null || (l0Var3 = (l0) pVar4.invoke(nVar, Integer.valueOf(i211))) == null) ? (l0) pVar.invoke(nVar, Integer.valueOf(i211)) : l0Var3;
                            }
                            if (z25) {
                                Object obj12 = cVar11.getMetadata().get("popTransitionSpec");
                                l lVar15 = y0.f(1, obj12) ? (l) obj12 : null;
                                return (lVar15 == null || (l0Var2 = (l0) lVar15.invoke(nVar)) == null) ? (l0) lVar13.invoke(nVar) : l0Var2;
                            }
                            Object obj13 = cVar11.getMetadata().get("transitionSpec");
                            l lVar16 = y0.f(1, obj13) ? (l) obj13 : null;
                            return (lVar16 == null || (l0Var = (l0) lVar16.invoke(nVar)) == null) ? (l0) lVar14.invoke(nVar) : l0Var;
                        }
                    };
                    o0VarE.K(obj9);
                    objQ = obj9;
                } else {
                    final e23.l lVar15 = lVar3;
                    final e23.l lVar16 = lVar4;
                    final int i211 = i15;
                    final uc.c cVar11 = cVar6;
                    final boolean z212 = z19;
                    Object obj10 = new e23.l() { // from class: vc.b
                        @Override // e23.l
                        public final Object invoke(Object obj11) {
                            l0 l0Var;
                            l0 l0Var2;
                            l0 l0Var3;
                            n nVar = (n) obj11;
                            boolean z213 = z212;
                            uc.c cVar12 = cVar11;
                            if (z213) {
                                Object obj12 = cVar12.getMetadata().get("predictivePopTransitionSpec");
                                p pVar4 = y0.f(2, obj12) ? (p) obj12 : null;
                                int i212 = i211;
                                return (pVar4 == null || (l0Var3 = (l0) pVar4.invoke(nVar, Integer.valueOf(i212))) == null) ? (l0) pVar.invoke(nVar, Integer.valueOf(i212)) : l0Var3;
                            }
                            if (z25) {
                                Object obj13 = cVar12.getMetadata().get("popTransitionSpec");
                                l lVar17 = y0.f(1, obj13) ? (l) obj13 : null;
                                return (lVar17 == null || (l0Var2 = (l0) lVar17.invoke(nVar)) == null) ? (l0) lVar15.invoke(nVar) : l0Var2;
                            }
                            Object obj14 = cVar12.getMetadata().get("transitionSpec");
                            l lVar18 = y0.f(1, obj14) ? (l) obj14 : null;
                            return (lVar18 == null || (l0Var = (l0) lVar18.invoke(nVar)) == null) ? (l0) lVar16.invoke(nVar) : l0Var;
                        }
                    };
                    o0VarE.K(obj10);
                    objQ = obj10;
                }
                obj = (e23.l) objQ;
                zB = o0VarE.B(obj) | o0VarE.i(f18) | o0VarE.r(null);
                objQ2 = o0VarE.q();
                if (zB) {
                    objQ2 = new l02.l(obj, f18, 5);
                    o0VarE.K(objQ2);
                } else {
                    objQ2 = new l02.l(obj, f18, 5);
                    o0VarE.K(objQ2);
                }
                e23.l lVar17 = (e23.l) objQ2;
                objQ3 = o0VarE.q();
                obj2 = p3.m.a.f135155b;
                if (objQ3 == obj2) {
                    objQ3 = new vb1.d(6);
                    o0VarE.K(objQ3);
                }
                o0Var2 = o0VarE;
                r1.b.b(t1VarD, rVar, lVar17, dVar, (e23.l) objQ3, z3.f.c(-1167420988, new m1(11, t1VarD, map), o0VarE), o0Var2, (i18 & 7168) | ((i18 >> 3) & 112) | 221184, 0);
                zB2 = o0Var2.B(t1VarD) | o0Var2.r(o0Var3);
                objQ4 = o0Var2.q();
                if (zB2) {
                    objQ4 = new vc.c(t1VarD, uVar, o0Var3, null);
                    o0Var2.K(objQ4);
                } else {
                    objQ4 = new vc.c(t1VarD, uVar, o0Var3, null);
                    o0Var2.K(objQ4);
                }
                p3.l0.e((e23.p) objQ4, t1VarD, o0Var2);
                size = collection.size() - 1;
                if (size >= 0) {
                    while (true) {
                        i16 = size - 1;
                        uc.b bVar3 = (uc.b) collection.get(size);
                        p3.v.a(uc.f.f169925a.c(p13.u0.c(new o13.p(p005kotlin.jvm.internal.s0.f105811a.b(bVar3.getClass()), bVar3.getF169931a()), map)), z3.f.c(485036444, new tr2.o(bVar3, 16), o0Var2), o0Var2, 56);
                        if (i16 < 0) {
                            break;
                            break;
                        }
                        size = i16;
                    }
                }
                p3.x1 x1Var4 = p3.n.f135158a;
                o0Var = o0Var2;
            } else {
                lVar4 = lVar;
            }
            if ((i18 & 196608) == 131072) {
                z15 = true;
            }
            z17 = z210 | z15;
            objQ = o0VarE.q();
            if (z17) {
                final e23.l lVar18 = lVar3;
                final e23.l lVar19 = lVar4;
                final int i212 = i15;
                final uc.c cVar12 = cVar6;
                final boolean z213 = z19;
                Object obj11 = new e23.l() { // from class: vc.b
                    @Override // e23.l
                    public final Object invoke(Object obj12) {
                        l0 l0Var;
                        l0 l0Var2;
                        l0 l0Var3;
                        n nVar = (n) obj12;
                        boolean z214 = z213;
                        uc.c cVar13 = cVar12;
                        if (z214) {
                            Object obj13 = cVar13.getMetadata().get("predictivePopTransitionSpec");
                            p pVar4 = y0.f(2, obj13) ? (p) obj13 : null;
                            int i213 = i212;
                            return (pVar4 == null || (l0Var3 = (l0) pVar4.invoke(nVar, Integer.valueOf(i213))) == null) ? (l0) pVar.invoke(nVar, Integer.valueOf(i213)) : l0Var3;
                        }
                        if (z25) {
                            Object obj14 = cVar13.getMetadata().get("popTransitionSpec");
                            l lVar110 = y0.f(1, obj14) ? (l) obj14 : null;
                            return (lVar110 == null || (l0Var2 = (l0) lVar110.invoke(nVar)) == null) ? (l0) lVar18.invoke(nVar) : l0Var2;
                        }
                        Object obj15 = cVar13.getMetadata().get("transitionSpec");
                        l lVar111 = y0.f(1, obj15) ? (l) obj15 : null;
                        return (lVar111 == null || (l0Var = (l0) lVar111.invoke(nVar)) == null) ? (l0) lVar19.invoke(nVar) : l0Var;
                    }
                };
                o0VarE.K(obj11);
                objQ = obj11;
            } else {
                final e23.l lVar110 = lVar3;
                final e23.l lVar111 = lVar4;
                final int i213 = i15;
                final uc.c cVar13 = cVar6;
                final boolean z214 = z19;
                Object obj12 = new e23.l() { // from class: vc.b
                    @Override // e23.l
                    public final Object invoke(Object obj13) {
                        l0 l0Var;
                        l0 l0Var2;
                        l0 l0Var3;
                        n nVar = (n) obj13;
                        boolean z215 = z214;
                        uc.c cVar14 = cVar13;
                        if (z215) {
                            Object obj14 = cVar14.getMetadata().get("predictivePopTransitionSpec");
                            p pVar4 = y0.f(2, obj14) ? (p) obj14 : null;
                            int i214 = i213;
                            return (pVar4 == null || (l0Var3 = (l0) pVar4.invoke(nVar, Integer.valueOf(i214))) == null) ? (l0) pVar.invoke(nVar, Integer.valueOf(i214)) : l0Var3;
                        }
                        if (z25) {
                            Object obj15 = cVar14.getMetadata().get("popTransitionSpec");
                            l lVar112 = y0.f(1, obj15) ? (l) obj15 : null;
                            return (lVar112 == null || (l0Var2 = (l0) lVar112.invoke(nVar)) == null) ? (l0) lVar110.invoke(nVar) : l0Var2;
                        }
                        Object obj16 = cVar14.getMetadata().get("transitionSpec");
                        l lVar113 = y0.f(1, obj16) ? (l) obj16 : null;
                        return (lVar113 == null || (l0Var = (l0) lVar113.invoke(nVar)) == null) ? (l0) lVar111.invoke(nVar) : l0Var;
                    }
                };
                o0VarE.K(obj12);
                objQ = obj12;
            }
            obj = (e23.l) objQ;
            zB = o0VarE.B(obj) | o0VarE.i(f18) | o0VarE.r(null);
            objQ2 = o0VarE.q();
            if (zB) {
                objQ2 = new l02.l(obj, f18, 5);
                o0VarE.K(objQ2);
            } else {
                objQ2 = new l02.l(obj, f18, 5);
                o0VarE.K(objQ2);
            }
            e23.l lVar112 = (e23.l) objQ2;
            objQ3 = o0VarE.q();
            obj2 = p3.m.a.f135155b;
            if (objQ3 == obj2) {
                objQ3 = new vb1.d(6);
                o0VarE.K(objQ3);
            }
            o0Var2 = o0VarE;
            r1.b.b(t1VarD, rVar, lVar112, dVar, (e23.l) objQ3, z3.f.c(-1167420988, new m1(11, t1VarD, map), o0VarE), o0Var2, (i18 & 7168) | ((i18 >> 3) & 112) | 221184, 0);
            zB2 = o0Var2.B(t1VarD) | o0Var2.r(o0Var3);
            objQ4 = o0Var2.q();
            if (zB2) {
                objQ4 = new vc.c(t1VarD, uVar, o0Var3, null);
                o0Var2.K(objQ4);
            } else {
                objQ4 = new vc.c(t1VarD, uVar, o0Var3, null);
                o0Var2.K(objQ4);
            }
            p3.l0.e((e23.p) objQ4, t1VarD, o0Var2);
            size = collection.size() - 1;
            if (size >= 0) {
                while (true) {
                    i16 = size - 1;
                    uc.b bVar4 = (uc.b) collection.get(size);
                    p3.v.a(uc.f.f169925a.c(p13.u0.c(new o13.p(p005kotlin.jvm.internal.s0.f105811a.b(bVar4.getClass()), bVar4.getF169931a()), map)), z3.f.c(485036444, new tr2.o(bVar4, 16), o0Var2), o0Var2, 56);
                    if (i16 < 0) {
                        break;
                        break;
                    }
                    size = i16;
                }
            }
            p3.x1 x1Var5 = p3.n.f135158a;
            o0Var = o0Var2;
        } else {
            p3.o0 o0Var4 = o0VarE;
            o0Var4.e();
            o0Var = o0Var4;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.o(gVar, eVar, rVar, dVar, lVar, lVar2, pVar, i14, 25);
        }
    }

    public static final void h(e23.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        p3.o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, -510782061);
        int i15 = i14 | (o0VarP.r(aVar) ? 4 : 2) | (o0VarP.r(aVar2) ? 32 : 16);
        if (o0VarP.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            l72.c1.f110940a.a(false, gl1.y.Q(o0VarP, R.string.lbl_stp_reset_days_dialog_title), gl1.y.Q(o0VarP, R.string.lbl_stp_reset_days_dialog_message), null, null, gl1.y.Q(o0VarP, R.string.lbl_reset), false, false, aVar, gl1.y.Q(o0VarP, R.string.lbl_cancel), aVar2, o0VarP, (i15 << 24) & 234881024, (i15 >> 3) & 14, 217);
        } else {
            o0VarP.e();
        }
        p3.p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new nw0.l(aVar, aVar2, i14, 7);
        }
    }

    public static final void i(e23.a aVar, p3.m mVar, int i14) {
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(1199209153);
        if (o0VarE.n(i14 & 1, (i14 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            l72.c1 c1Var = l72.c1.f110940a;
            String strQ = gl1.y.Q(o0VarE, R.string.unable_to_view_account);
            String strQ2 = gl1.y.Q(o0VarE, R.string.account_cant_be_viewed_privileges);
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_ok);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            aVar2.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new pf0.j(aVar, 24);
                o0VarE.K(objQ);
            }
            e23.a<Unit> aVar3 = (e23.a) objQ;
            Object objQ2 = o0VarE.q();
            aVar2.getClass();
            if (objQ2 == c2565a) {
                objQ2 = new pf0.j(aVar, 25);
                o0VarE.K(objQ2);
            }
            c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar3, null, (e23.a) objQ2, o0VarE, 6, 0, 728);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p40.r(aVar, i14, 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    public static String j(String str, String str2) throws Throwable {
        Throwable th3;
        BufferedReader bufferedReader;
        StringBuilder sb3 = new StringBuilder();
        BufferedReader bufferedReader2 = null;
        try {
            File file = new File(str, str2);
            if (!file.exists()) {
                return null;
            }
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb3.append(line);
                } catch (IOException unused) {
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        bufferedReader = bufferedReader2;
                    }
                    return sb3.toString();
                } catch (Throwable th4) {
                    th3 = th4;
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 == null) {
                        throw th3;
                    }
                    try {
                        bufferedReader2.close();
                        throw th3;
                    } catch (Throwable unused2) {
                        throw th3;
                    }
                }
            }
            bufferedReader.close();
            return sb3.toString();
        } catch (IOException unused3) {
        } catch (Throwable th5) {
            th3 = th5;
        }
        if (bufferedReader2 != null) {
            bufferedReader = bufferedReader2;
            try {
                bufferedReader.close();
            } catch (Throwable unused4) {
            }
        }
        return sb3.toString();
    }

    public static final Integer k(int i14) {
        return new Integer(i14);
    }

    public static final t23.p0 l(p43.v0 v0Var, t23.i iVar, int i14) {
        if (iVar == null || r43.l.f(iVar)) {
            return null;
        }
        int size = iVar.q().size() + i14;
        if (iVar.l()) {
            List<p43.t1> listSubList = v0Var.D0().subList(i14, size);
            t23.l lVarD = iVar.d();
            return new t23.p0(iVar, listSubList, l(v0Var, lVarD instanceof t23.i ? (t23.i) lVarD : null, size));
        }
        if (size != v0Var.D0().size()) {
            b43.i.m(iVar);
        }
        return new t23.p0(iVar, v0Var.D0().subList(i14, v0Var.D0().size()), null);
    }

    public static final void m(LottieAnimationView lottieAnimationView, Context context, String str, int i14) {
        lottieAnimationView.getClass();
        context.getClass();
        SimpleColorFilter simpleColorFilter = new SimpleColorFilter(a7.b.getColor(context, i14));
        lottieAnimationView.addValueCallback(new KeyPath(str, "**"), LottieProperty.COLOR_FILTER, (LottieValueCallback<ColorFilter>) new LottieValueCallback(simpleColorFilter));
    }

    public static final List n(t23.i iVar) {
        List<t23.d1> parameters;
        Object next;
        p43.m1 m1VarH;
        iVar.getClass();
        List<t23.d1> listQ = iVar.q();
        listQ.getClass();
        if (!iVar.l() && !(iVar.d() instanceof t23.a)) {
            return listQ;
        }
        int i14 = f43.e.f68881a;
        f43.b bVar = f43.b.f68878a;
        List listS = c53.c0.s(c53.c0.k(c53.c0.h(c53.c0.r(c53.c0.g(c53.q.e(bVar, iVar), 1), t23.e1.f162005a), t23.f1.f162014a), t23.g1.f162024a));
        Iterator it = c53.c0.g(c53.q.e(bVar, iVar), 1).iterator();
        do {
            parameters = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof t23.e));
        t23.e eVar = (t23.e) next;
        if (eVar != null && (m1VarH = eVar.h()) != null) {
            parameters = m1VarH.getParameters();
        }
        if (parameters == null) {
            parameters = p13.j0.f134944a;
        }
        if (listS.isEmpty() && parameters.isEmpty()) {
            List<t23.d1> listQ2 = iVar.q();
            listQ2.getClass();
            return listQ2;
        }
        ArrayList<t23.d1> arrayListC0 = p13.h0.C0(listS, parameters);
        ArrayList arrayList = new ArrayList(p13.y.r(arrayListC0, 10));
        for (t23.d1 d1Var : arrayListC0) {
            d1Var.getClass();
            arrayList.add(new t23.c(d1Var, iVar, listQ.size()));
        }
        return p13.h0.C0(listQ, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    public static final String o(t23.e eVar, q33.f0 f0Var) {
        eVar.getClass();
        f0Var.getClass();
        f0Var.getClass();
        eVar.getClass();
        t23.l lVarD = eVar.d();
        lVarD.getClass();
        x33.f name = eVar.getName();
        if (name != null) {
            x33.h hVar = x33.h.f188609a;
            if (name.f188606b) {
                name = x33.h.f188612d;
            }
        } else {
            name = x33.h.f188612d;
        }
        String strC = name.c();
        strC.getClass();
        if (lVarD instanceof t23.h0) {
            x33.c cVarC = ((t23.h0) lVarD).c();
            if (cVarC.f188596a.c()) {
                return strC;
            }
            return d53.u.w(cVarC.f188596a.f188600a, '.', IOUtils.DIR_SEPARATOR_UNIX) + IOUtils.DIR_SEPARATOR_UNIX + strC;
        }
        t23.e eVar2 = lVarD instanceof t23.e ? (t23.e) lVarD : null;
        if (eVar2 == null) {
            c22.t.i("Unexpected container: ", lVarD, " for ", eVar);
            return null;
        }
        return o(eVar2, f0Var) + '$' + strC;
    }

    public static final boolean p(p43.n0 n0Var, p43.m1 m1Var, Set set) {
        boolean zP;
        if (p005kotlin.jvm.internal.s.g(n0Var.F0(), m1Var)) {
            return true;
        }
        t23.h hVarT = n0Var.F0().t();
        t23.i iVar = hVarT instanceof t23.i ? (t23.i) hVarT : null;
        List<t23.d1> listQ = iVar != null ? iVar.q() : null;
        Iterable iterableJ1 = p13.h0.j1(n0Var.D0());
        if (!(iterableJ1 instanceof Collection) || !((Collection) iterableJ1).isEmpty()) {
            Iterator it = iterableJ1.iterator();
            do {
                p13.o0 o0Var = (p13.o0) it;
                if (o0Var.f134956a.hasNext()) {
                    p13.m0 m0Var = (p13.m0) o0Var.next();
                    int i14 = m0Var.f134951a;
                    p43.t1 t1Var = (p43.t1) m0Var.f134952b;
                    t23.d1 d1Var = listQ != null ? (t23.d1) p13.h0.e0(i14, listQ) : null;
                    if ((d1Var == null || set == null || !set.contains(d1Var)) && !t1Var.b()) {
                        p43.n0 type = t1Var.getType();
                        type.getClass();
                        zP = p(type, m1Var, set);
                    } else {
                        zP = false;
                    }
                }
            } while (!zP);
            return true;
        }
        return false;
    }

    public static final u81.a q(k81.a aVar, String str) {
        aVar.getClass();
        Long lM = aVar.getUserProfilePk();
        Long lD = aVar.getDeviceId();
        String strB = aVar.getCalendarDate();
        return new u81.a(lM, lD, strB != null ? g22.k.v(strB, "yyyy-MM-dd") : null, aVar.getHillStrengthScore(), aVar.getHillEnduranceScore(), aVar.getVo2MaxScore(), aVar.getVo2MaxPreciseValue(), aVar.getHillScore(), aVar.getHillScoreClassificationId(), aVar.getHillScoreFeedbackPhraseId(), aVar.getPrimaryTrainingDevice(), str);
    }

    public static final int r(int i14, byte[] bArr) {
        int iA = 0;
        for (int i15 = 0; i15 < i14; i15++) {
            iA = q4.a(bArr[i15], iA);
        }
        return iA;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object s(mx2.c cVar, gx2.a aVar, v13.c cVar2) throws UnexpectedResponseCodeException {
        tx2.a aVar2;
        if (cVar2 instanceof tx2.a) {
            aVar2 = (tx2.a) cVar2;
            int i14 = aVar2.f166847b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar2.f166847b = i14 - Integer.MIN_VALUE;
            } else {
                aVar2 = new tx2.a(cVar2);
            }
        } else {
            aVar2 = new tx2.a(cVar2);
        }
        tx2.a aVar3 = aVar2;
        Object objD = aVar3.f166846a;
        u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar3.f166847b;
        if (i15 == 0) {
            o13.r.b(objD);
            cVar.getClass();
            String string = new JSONObject().put("mfaToken", cVar.f121453a).toString();
            string.getClass();
            byte[] bytes = string.getBytes(d53.c.f57666b);
            bytes.getClass();
            aVar3.f166847b = 1;
            objD = sx2.b.d("/account/v1/account", aVar, null, bytes, null, null, aVar3, 108);
            if (objD == aVar4) {
                return aVar4;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objD);
        }
        qx2.c cVar3 = (qx2.c) objD;
        int i16 = cVar3.f148454c;
        String str = cVar3.f148456e;
        if (i16 == 200) {
            sx2.b.c().debug(u(cVar3));
            return new mx2.d(str);
        }
        sx2.b.c().error(cVar3.toString());
        throw new UnexpectedResponseCodeException(cVar3.f148454c, str, null, 4, null);
    }

    public static final p43.v1 t(p43.n0 n0Var, p43.g2 g2Var, t23.d1 d1Var) {
        n0Var.getClass();
        g2Var.getClass();
        if ((d1Var != null ? d1Var.m() : null) == g2Var) {
            g2Var = p43.g2.INVARIANT;
        }
        return new p43.v1(g2Var, n0Var);
    }

    public static final String u(qx2.c cVar) {
        return cVar.f148454c + StringUtils.SPACE + cVar.f148452a + ": " + cVar.f148453b;
    }

    public static final void v(p43.n0 n0Var, p43.v0 v0Var, LinkedHashSet linkedHashSet, Set set) {
        t23.h hVarT = n0Var.F0().t();
        if (hVarT instanceof t23.d1) {
            if (!p005kotlin.jvm.internal.s.g(n0Var.F0(), v0Var.F0())) {
                linkedHashSet.add(hVarT);
                return;
            }
            for (p43.n0 n0Var2 : ((t23.d1) hVarT).getUpperBounds()) {
                n0Var2.getClass();
                v(n0Var2, v0Var, linkedHashSet, set);
            }
            return;
        }
        t23.h hVarT2 = n0Var.F0().t();
        t23.i iVar = hVarT2 instanceof t23.i ? (t23.i) hVarT2 : null;
        List<t23.d1> listQ = iVar != null ? iVar.q() : null;
        int i14 = 0;
        for (p43.t1 t1Var : n0Var.D0()) {
            int i15 = i14 + 1;
            t23.d1 d1Var = listQ != null ? (t23.d1) p13.h0.e0(i14, listQ) : null;
            if ((d1Var == null || set == null || !set.contains(d1Var)) && !t1Var.b() && !p13.h0.R(linkedHashSet, t1Var.getType().F0().t()) && !p005kotlin.jvm.internal.s.g(t1Var.getType().F0(), v0Var.F0())) {
                p43.n0 type = t1Var.getType();
                type.getClass();
                v(type, v0Var, linkedHashSet, set);
            }
            i14 = i15;
        }
    }

    public static final Activity w(Context context) {
        context.getClass();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        baseContext.getClass();
        return w(baseContext);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0139 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x013b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x013d  */
    /* JADX WARN: Code duplicated, block: B:45:0x016b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0172  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:52:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:55:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:58:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:60:0x0202 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0204 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0206  */
    /* JADX WARN: Code duplicated, block: B:65:0x0232  */
    /* JADX WARN: Code duplicated, block: B:67:0x0239  */
    /* JADX WARN: Code duplicated, block: B:70:0x0265  */
    /* JADX WARN: Code duplicated, block: B:72:0x026b  */
    /* JADX WARN: Code duplicated, block: B:77:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:79:0x02c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x02c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:84:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:86:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:89:0x0318  */
    /* JADX WARN: Code duplicated, block: B:91:0x031c  */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x028d, code lost:
    
        if (r12 == r1) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x033a, code lost:
    
        if (r12 == r1) goto L93;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object x(long j8, v13.c cVar, boolean z14) {
        ot2.s sVar;
        int i14;
        int i15;
        String str;
        int i16;
        int i17;
        int i18;
        int i19;
        String str2;
        int i24;
        String strConcat;
        boolean z15;
        int i25;
        int i26;
        int i27;
        String str3;
        String str4;
        int i28;
        String strConcat2;
        boolean z16;
        String str5;
        String str6;
        String str7;
        String str8;
        if (cVar instanceof ot2.s) {
            sVar = (ot2.s) cVar;
            int i29 = sVar.f133946g;
            if ((i29 & Integer.MIN_VALUE) != 0) {
                sVar.f133946g = i29 - Integer.MIN_VALUE;
            } else {
                sVar = new ot2.s(cVar);
            }
        } else {
            sVar = new ot2.s(cVar);
        }
        Object objB = sVar.f133945f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        switch (sVar.f133946g) {
            case 0:
                o13.r.b(objB);
                long j14 = DateTimeConstants.SECONDS_PER_DAY;
                int i30 = (int) (j8 / j14);
                int i34 = (int) (j8 % j14);
                int i35 = i34 / DateTimeConstants.SECONDS_PER_HOUR;
                int i36 = i34 % DateTimeConstants.SECONDS_PER_HOUR;
                i14 = i36 / 60;
                i15 = i36 % 60;
                if (i30 <= 0) {
                    str = "";
                    i16 = i15;
                    i17 = i35;
                    str2 = str;
                    if (i17 <= 0) {
                        i24 = i14;
                        strConcat = str2;
                        if (i24 <= 0) {
                            i28 = i16;
                            strConcat2 = strConcat;
                            if (i28 > 0) {
                                if (z14) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar = (o73.u) kt2.e.D0.getValue();
                                    sVar.f133944e = strConcat2;
                                    sVar.f133941b = i28;
                                    sVar.f133946g = 11;
                                    objB = o73.v.a(uVar, sVar);
                                    break;
                                } else if (i28 > 1) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar2 = (o73.u) kt2.e.f106515s0.getValue();
                                    Object[] objArr = {new Integer(i28)};
                                    sVar.f133944e = strConcat2;
                                    sVar.f133946g = 9;
                                    objB = o73.v.b(uVar2, objArr, sVar);
                                    if (objB != aVar) {
                                        str7 = strConcat2;
                                        str8 = (String) objB;
                                        strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                    }
                                } else {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar3 = (o73.u) kt2.e.f106524v0.getValue();
                                    Object[] objArr2 = {new Integer(i28)};
                                    sVar.f133944e = strConcat2;
                                    sVar.f133946g = 10;
                                    objB = o73.v.b(uVar3, objArr2, sVar);
                                    if (objB != aVar) {
                                        str7 = strConcat2;
                                        str8 = (String) objB;
                                        strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                    }
                                }
                            }
                            return d53.w.i0(strConcat2).toString();
                        }
                        if (!z14) {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar4 = (o73.u) kt2.e.f106488j0.getValue();
                            sVar.f133944e = strConcat;
                            sVar.f133940a = z14;
                            sVar.f133941b = i16;
                            sVar.f133942c = i24;
                            sVar.f133946g = 8;
                            objB = o73.v.a(uVar4, sVar);
                            break;
                        } else if (i24 > 1) {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar5 = (o73.u) kt2.e.f106512r0.getValue();
                            Object[] objArr3 = {new Integer(i24)};
                            sVar.f133944e = strConcat;
                            sVar.f133940a = z14;
                            sVar.f133941b = i16;
                            sVar.f133946g = 6;
                            objB = o73.v.b(uVar5, objArr3, sVar);
                            if (objB != aVar) {
                                i28 = i16;
                                z16 = z14;
                                str5 = strConcat;
                                str6 = (String) objB;
                                z14 = z16;
                                strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                if (i28 > 0) {
                                    if (z14) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar6 = (o73.u) kt2.e.D0.getValue();
                                        sVar.f133944e = strConcat2;
                                        sVar.f133941b = i28;
                                        sVar.f133946g = 11;
                                        objB = o73.v.a(uVar6, sVar);
                                        break;
                                    } else if (i28 > 1) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar7 = (o73.u) kt2.e.f106515s0.getValue();
                                        Object[] objArr4 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 9;
                                        objB = o73.v.b(uVar7, objArr4, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    } else {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar8 = (o73.u) kt2.e.f106524v0.getValue();
                                        Object[] objArr5 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 10;
                                        objB = o73.v.b(uVar8, objArr5, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    }
                                }
                                return d53.w.i0(strConcat2).toString();
                            }
                        } else {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar9 = (o73.u) kt2.e.f106521u0.getValue();
                            Object[] objArr6 = {new Integer(i24)};
                            sVar.f133944e = strConcat;
                            sVar.f133940a = z14;
                            sVar.f133941b = i16;
                            sVar.f133946g = 7;
                            objB = o73.v.b(uVar9, objArr6, sVar);
                            if (objB != aVar) {
                                i28 = i16;
                                z16 = z14;
                                str5 = strConcat;
                                str6 = (String) objB;
                                z14 = z16;
                                strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                if (i28 > 0) {
                                    if (z14) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar10 = (o73.u) kt2.e.D0.getValue();
                                        sVar.f133944e = strConcat2;
                                        sVar.f133941b = i28;
                                        sVar.f133946g = 11;
                                        objB = o73.v.a(uVar10, sVar);
                                        break;
                                    } else if (i28 > 1) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar11 = (o73.u) kt2.e.f106515s0.getValue();
                                        Object[] objArr7 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 9;
                                        objB = o73.v.b(uVar11, objArr7, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    } else {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar12 = (o73.u) kt2.e.f106524v0.getValue();
                                        Object[] objArr8 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 10;
                                        objB = o73.v.b(uVar12, objArr8, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    }
                                }
                                return d53.w.i0(strConcat2).toString();
                            }
                        }
                    } else if (!z14) {
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        o73.u uVar13 = (o73.u) kt2.e.f106461a0.getValue();
                        sVar.f133944e = str2;
                        sVar.f133940a = z14;
                        sVar.f133941b = i14;
                        sVar.f133942c = i16;
                        sVar.f133943d = i17;
                        sVar.f133946g = 5;
                        objB = o73.v.a(uVar13, sVar);
                        if (objB != aVar) {
                            int i37 = i14;
                            z15 = z14;
                            i25 = i37;
                            str4 = i17 + StringUtils.SPACE + objB;
                            i26 = i16;
                            i27 = i25;
                            z14 = z15;
                            str3 = str2;
                            int i38 = i27;
                            i16 = i26;
                            i24 = i38;
                            strConcat = (str3 + str4).concat(StringUtils.SPACE);
                            if (i24 <= 0) {
                                i28 = i16;
                                strConcat2 = strConcat;
                                if (i28 > 0) {
                                    if (z14) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar14 = (o73.u) kt2.e.D0.getValue();
                                        sVar.f133944e = strConcat2;
                                        sVar.f133941b = i28;
                                        sVar.f133946g = 11;
                                        objB = o73.v.a(uVar14, sVar);
                                        break;
                                    } else if (i28 > 1) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar15 = (o73.u) kt2.e.f106515s0.getValue();
                                        Object[] objArr9 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 9;
                                        objB = o73.v.b(uVar15, objArr9, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    } else {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar16 = (o73.u) kt2.e.f106524v0.getValue();
                                        Object[] objArr10 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 10;
                                        objB = o73.v.b(uVar16, objArr10, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    }
                                }
                                return d53.w.i0(strConcat2).toString();
                            }
                            if (!z14) {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar17 = (o73.u) kt2.e.f106488j0.getValue();
                                sVar.f133944e = strConcat;
                                sVar.f133940a = z14;
                                sVar.f133941b = i16;
                                sVar.f133942c = i24;
                                sVar.f133946g = 8;
                                objB = o73.v.a(uVar17, sVar);
                                break;
                            } else if (i24 > 1) {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar18 = (o73.u) kt2.e.f106512r0.getValue();
                                Object[] objArr11 = {new Integer(i24)};
                                sVar.f133944e = strConcat;
                                sVar.f133940a = z14;
                                sVar.f133941b = i16;
                                sVar.f133946g = 6;
                                objB = o73.v.b(uVar18, objArr11, sVar);
                                if (objB != aVar) {
                                    i28 = i16;
                                    z16 = z14;
                                    str5 = strConcat;
                                    str6 = (String) objB;
                                    z14 = z16;
                                    strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                    if (i28 > 0) {
                                        if (z14) {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar19 = (o73.u) kt2.e.D0.getValue();
                                            sVar.f133944e = strConcat2;
                                            sVar.f133941b = i28;
                                            sVar.f133946g = 11;
                                            objB = o73.v.a(uVar19, sVar);
                                            break;
                                        } else if (i28 > 1) {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar110 = (o73.u) kt2.e.f106515s0.getValue();
                                            Object[] objArr12 = {new Integer(i28)};
                                            sVar.f133944e = strConcat2;
                                            sVar.f133946g = 9;
                                            objB = o73.v.b(uVar110, objArr12, sVar);
                                            if (objB != aVar) {
                                                str7 = strConcat2;
                                                str8 = (String) objB;
                                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                            }
                                        } else {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar111 = (o73.u) kt2.e.f106524v0.getValue();
                                            Object[] objArr13 = {new Integer(i28)};
                                            sVar.f133944e = strConcat2;
                                            sVar.f133946g = 10;
                                            objB = o73.v.b(uVar111, objArr13, sVar);
                                            if (objB != aVar) {
                                                str7 = strConcat2;
                                                str8 = (String) objB;
                                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                            }
                                        }
                                    }
                                    return d53.w.i0(strConcat2).toString();
                                }
                            } else {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar20 = (o73.u) kt2.e.f106521u0.getValue();
                                Object[] objArr14 = {new Integer(i24)};
                                sVar.f133944e = strConcat;
                                sVar.f133940a = z14;
                                sVar.f133941b = i16;
                                sVar.f133946g = 7;
                                objB = o73.v.b(uVar20, objArr14, sVar);
                                if (objB != aVar) {
                                    i28 = i16;
                                    z16 = z14;
                                    str5 = strConcat;
                                    str6 = (String) objB;
                                    z14 = z16;
                                    strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                    if (i28 > 0) {
                                        if (z14) {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar112 = (o73.u) kt2.e.D0.getValue();
                                            sVar.f133944e = strConcat2;
                                            sVar.f133941b = i28;
                                            sVar.f133946g = 11;
                                            objB = o73.v.a(uVar112, sVar);
                                            break;
                                        } else if (i28 > 1) {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar113 = (o73.u) kt2.e.f106515s0.getValue();
                                            Object[] objArr15 = {new Integer(i28)};
                                            sVar.f133944e = strConcat2;
                                            sVar.f133946g = 9;
                                            objB = o73.v.b(uVar113, objArr15, sVar);
                                            if (objB != aVar) {
                                                str7 = strConcat2;
                                                str8 = (String) objB;
                                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                            }
                                        } else {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar114 = (o73.u) kt2.e.f106524v0.getValue();
                                            Object[] objArr16 = {new Integer(i28)};
                                            sVar.f133944e = strConcat2;
                                            sVar.f133946g = 10;
                                            objB = o73.v.b(uVar114, objArr16, sVar);
                                            if (objB != aVar) {
                                                str7 = strConcat2;
                                                str8 = (String) objB;
                                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                            }
                                        }
                                    }
                                    return d53.w.i0(strConcat2).toString();
                                }
                            }
                        }
                    } else if (i17 > 1) {
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        o73.u uVar21 = (o73.u) kt2.e.f106509q0.getValue();
                        Object[] objArr17 = {new Integer(i17)};
                        sVar.f133944e = str2;
                        sVar.f133940a = z14;
                        sVar.f133941b = i14;
                        sVar.f133942c = i16;
                        sVar.f133946g = 3;
                        objB = o73.v.b(uVar21, objArr17, sVar);
                        if (objB != aVar) {
                            i26 = i16;
                            i27 = i14;
                            str3 = str2;
                            str4 = (String) objB;
                            int i39 = i27;
                            i16 = i26;
                            i24 = i39;
                            strConcat = (str3 + str4).concat(StringUtils.SPACE);
                            if (i24 <= 0) {
                                i28 = i16;
                                strConcat2 = strConcat;
                                if (i28 > 0) {
                                    if (z14) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar115 = (o73.u) kt2.e.D0.getValue();
                                        sVar.f133944e = strConcat2;
                                        sVar.f133941b = i28;
                                        sVar.f133946g = 11;
                                        objB = o73.v.a(uVar115, sVar);
                                        break;
                                    } else if (i28 > 1) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar116 = (o73.u) kt2.e.f106515s0.getValue();
                                        Object[] objArr18 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 9;
                                        objB = o73.v.b(uVar116, objArr18, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    } else {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar117 = (o73.u) kt2.e.f106524v0.getValue();
                                        Object[] objArr19 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 10;
                                        objB = o73.v.b(uVar117, objArr19, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    }
                                }
                                return d53.w.i0(strConcat2).toString();
                            }
                            if (!z14) {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar118 = (o73.u) kt2.e.f106488j0.getValue();
                                sVar.f133944e = strConcat;
                                sVar.f133940a = z14;
                                sVar.f133941b = i16;
                                sVar.f133942c = i24;
                                sVar.f133946g = 8;
                                objB = o73.v.a(uVar118, sVar);
                                break;
                            } else if (i24 > 1) {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar119 = (o73.u) kt2.e.f106512r0.getValue();
                                Object[] objArr110 = {new Integer(i24)};
                                sVar.f133944e = strConcat;
                                sVar.f133940a = z14;
                                sVar.f133941b = i16;
                                sVar.f133946g = 6;
                                objB = o73.v.b(uVar119, objArr110, sVar);
                                if (objB != aVar) {
                                    i28 = i16;
                                    z16 = z14;
                                    str5 = strConcat;
                                    str6 = (String) objB;
                                    z14 = z16;
                                    strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                    if (i28 > 0) {
                                        if (z14) {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar1110 = (o73.u) kt2.e.D0.getValue();
                                            sVar.f133944e = strConcat2;
                                            sVar.f133941b = i28;
                                            sVar.f133946g = 11;
                                            objB = o73.v.a(uVar1110, sVar);
                                            break;
                                        } else if (i28 > 1) {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar1111 = (o73.u) kt2.e.f106515s0.getValue();
                                            Object[] objArr111 = {new Integer(i28)};
                                            sVar.f133944e = strConcat2;
                                            sVar.f133946g = 9;
                                            objB = o73.v.b(uVar1111, objArr111, sVar);
                                            if (objB != aVar) {
                                                str7 = strConcat2;
                                                str8 = (String) objB;
                                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                            }
                                        } else {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar1112 = (o73.u) kt2.e.f106524v0.getValue();
                                            Object[] objArr112 = {new Integer(i28)};
                                            sVar.f133944e = strConcat2;
                                            sVar.f133946g = 10;
                                            objB = o73.v.b(uVar1112, objArr112, sVar);
                                            if (objB != aVar) {
                                                str7 = strConcat2;
                                                str8 = (String) objB;
                                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                            }
                                        }
                                    }
                                    return d53.w.i0(strConcat2).toString();
                                }
                            } else {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar22 = (o73.u) kt2.e.f106521u0.getValue();
                                Object[] objArr113 = {new Integer(i24)};
                                sVar.f133944e = strConcat;
                                sVar.f133940a = z14;
                                sVar.f133941b = i16;
                                sVar.f133946g = 7;
                                objB = o73.v.b(uVar22, objArr113, sVar);
                                if (objB != aVar) {
                                    i28 = i16;
                                    z16 = z14;
                                    str5 = strConcat;
                                    str6 = (String) objB;
                                    z14 = z16;
                                    strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                    if (i28 > 0) {
                                        if (z14) {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar1113 = (o73.u) kt2.e.D0.getValue();
                                            sVar.f133944e = strConcat2;
                                            sVar.f133941b = i28;
                                            sVar.f133946g = 11;
                                            objB = o73.v.a(uVar1113, sVar);
                                            break;
                                        } else if (i28 > 1) {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar1114 = (o73.u) kt2.e.f106515s0.getValue();
                                            Object[] objArr114 = {new Integer(i28)};
                                            sVar.f133944e = strConcat2;
                                            sVar.f133946g = 9;
                                            objB = o73.v.b(uVar1114, objArr114, sVar);
                                            if (objB != aVar) {
                                                str7 = strConcat2;
                                                str8 = (String) objB;
                                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                            }
                                        } else {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar1115 = (o73.u) kt2.e.f106524v0.getValue();
                                            Object[] objArr115 = {new Integer(i28)};
                                            sVar.f133944e = strConcat2;
                                            sVar.f133946g = 10;
                                            objB = o73.v.b(uVar1115, objArr115, sVar);
                                            if (objB != aVar) {
                                                str7 = strConcat2;
                                                str8 = (String) objB;
                                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                            }
                                        }
                                    }
                                    return d53.w.i0(strConcat2).toString();
                                }
                            }
                        }
                    } else {
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        o73.u uVar23 = (o73.u) kt2.e.f106518t0.getValue();
                        Object[] objArr20 = {new Integer(i17)};
                        sVar.f133944e = str2;
                        sVar.f133940a = z14;
                        sVar.f133941b = i14;
                        sVar.f133942c = i16;
                        sVar.f133946g = 4;
                        objB = o73.v.b(uVar23, objArr20, sVar);
                        if (objB != aVar) {
                            i26 = i16;
                            i27 = i14;
                            str3 = str2;
                            str4 = (String) objB;
                            int i310 = i27;
                            i16 = i26;
                            i24 = i310;
                            strConcat = (str3 + str4).concat(StringUtils.SPACE);
                            if (i24 <= 0) {
                                i28 = i16;
                                strConcat2 = strConcat;
                                if (i28 > 0) {
                                    if (z14) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar1116 = (o73.u) kt2.e.D0.getValue();
                                        sVar.f133944e = strConcat2;
                                        sVar.f133941b = i28;
                                        sVar.f133946g = 11;
                                        objB = o73.v.a(uVar1116, sVar);
                                        break;
                                    } else if (i28 > 1) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar1117 = (o73.u) kt2.e.f106515s0.getValue();
                                        Object[] objArr116 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 9;
                                        objB = o73.v.b(uVar1117, objArr116, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    } else {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar1118 = (o73.u) kt2.e.f106524v0.getValue();
                                        Object[] objArr117 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 10;
                                        objB = o73.v.b(uVar1118, objArr117, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    }
                                }
                                return d53.w.i0(strConcat2).toString();
                            }
                            if (!z14) {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar1119 = (o73.u) kt2.e.f106488j0.getValue();
                                sVar.f133944e = strConcat;
                                sVar.f133940a = z14;
                                sVar.f133941b = i16;
                                sVar.f133942c = i24;
                                sVar.f133946g = 8;
                                objB = o73.v.a(uVar1119, sVar);
                                break;
                            } else if (i24 > 1) {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar1120 = (o73.u) kt2.e.f106512r0.getValue();
                                Object[] objArr118 = {new Integer(i24)};
                                sVar.f133944e = strConcat;
                                sVar.f133940a = z14;
                                sVar.f133941b = i16;
                                sVar.f133946g = 6;
                                objB = o73.v.b(uVar1120, objArr118, sVar);
                                if (objB != aVar) {
                                    i28 = i16;
                                    z16 = z14;
                                    str5 = strConcat;
                                    str6 = (String) objB;
                                    z14 = z16;
                                    strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                    if (i28 > 0) {
                                        if (z14) {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar11110 = (o73.u) kt2.e.D0.getValue();
                                            sVar.f133944e = strConcat2;
                                            sVar.f133941b = i28;
                                            sVar.f133946g = 11;
                                            objB = o73.v.a(uVar11110, sVar);
                                            break;
                                        } else if (i28 > 1) {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar11111 = (o73.u) kt2.e.f106515s0.getValue();
                                            Object[] objArr119 = {new Integer(i28)};
                                            sVar.f133944e = strConcat2;
                                            sVar.f133946g = 9;
                                            objB = o73.v.b(uVar11111, objArr119, sVar);
                                            if (objB != aVar) {
                                                str7 = strConcat2;
                                                str8 = (String) objB;
                                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                            }
                                        } else {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar11112 = (o73.u) kt2.e.f106524v0.getValue();
                                            Object[] objArr1110 = {new Integer(i28)};
                                            sVar.f133944e = strConcat2;
                                            sVar.f133946g = 10;
                                            objB = o73.v.b(uVar11112, objArr1110, sVar);
                                            if (objB != aVar) {
                                                str7 = strConcat2;
                                                str8 = (String) objB;
                                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                            }
                                        }
                                    }
                                    return d53.w.i0(strConcat2).toString();
                                }
                            } else {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar24 = (o73.u) kt2.e.f106521u0.getValue();
                                Object[] objArr1111 = {new Integer(i24)};
                                sVar.f133944e = strConcat;
                                sVar.f133940a = z14;
                                sVar.f133941b = i16;
                                sVar.f133946g = 7;
                                objB = o73.v.b(uVar24, objArr1111, sVar);
                                if (objB != aVar) {
                                    i28 = i16;
                                    z16 = z14;
                                    str5 = strConcat;
                                    str6 = (String) objB;
                                    z14 = z16;
                                    strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                    if (i28 > 0) {
                                        if (z14) {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar11113 = (o73.u) kt2.e.D0.getValue();
                                            sVar.f133944e = strConcat2;
                                            sVar.f133941b = i28;
                                            sVar.f133946g = 11;
                                            objB = o73.v.a(uVar11113, sVar);
                                            break;
                                        } else if (i28 > 1) {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar11114 = (o73.u) kt2.e.f106515s0.getValue();
                                            Object[] objArr1112 = {new Integer(i28)};
                                            sVar.f133944e = strConcat2;
                                            sVar.f133946g = 9;
                                            objB = o73.v.b(uVar11114, objArr1112, sVar);
                                            if (objB != aVar) {
                                                str7 = strConcat2;
                                                str8 = (String) objB;
                                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                            }
                                        } else {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar11115 = (o73.u) kt2.e.f106524v0.getValue();
                                            Object[] objArr1113 = {new Integer(i28)};
                                            sVar.f133944e = strConcat2;
                                            sVar.f133946g = 10;
                                            objB = o73.v.b(uVar11115, objArr1113, sVar);
                                            if (objB != aVar) {
                                                str7 = strConcat2;
                                                str8 = (String) objB;
                                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                            }
                                        }
                                    }
                                    return d53.w.i0(strConcat2).toString();
                                }
                            }
                        }
                    }
                } else if (i30 > 1) {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    o73.u uVar25 = (o73.u) kt2.e.f106508q.getValue();
                    Object[] objArr21 = {new Integer(i30)};
                    sVar.f133940a = z14;
                    sVar.f133941b = i35;
                    sVar.f133942c = i14;
                    sVar.f133943d = i15;
                    sVar.f133946g = 1;
                    objB = o73.v.b(uVar25, objArr21, sVar);
                    if (objB != aVar) {
                        i18 = i35;
                        i19 = i14;
                        str = (String) objB;
                        int i44 = i19;
                        i16 = i15;
                        i17 = i18;
                        i14 = i44;
                        str2 = str;
                        if (i17 <= 0) {
                            i24 = i14;
                            strConcat = str2;
                            if (i24 <= 0) {
                                i28 = i16;
                                strConcat2 = strConcat;
                                if (i28 > 0) {
                                    if (z14) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar11116 = (o73.u) kt2.e.D0.getValue();
                                        sVar.f133944e = strConcat2;
                                        sVar.f133941b = i28;
                                        sVar.f133946g = 11;
                                        objB = o73.v.a(uVar11116, sVar);
                                        break;
                                    } else if (i28 > 1) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar11117 = (o73.u) kt2.e.f106515s0.getValue();
                                        Object[] objArr1114 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 9;
                                        objB = o73.v.b(uVar11117, objArr1114, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    } else {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar11118 = (o73.u) kt2.e.f106524v0.getValue();
                                        Object[] objArr1115 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 10;
                                        objB = o73.v.b(uVar11118, objArr1115, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    }
                                }
                                return d53.w.i0(strConcat2).toString();
                            }
                            if (!z14) {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar11119 = (o73.u) kt2.e.f106488j0.getValue();
                                sVar.f133944e = strConcat;
                                sVar.f133940a = z14;
                                sVar.f133941b = i16;
                                sVar.f133942c = i24;
                                sVar.f133946g = 8;
                                objB = o73.v.a(uVar11119, sVar);
                                break;
                            } else if (i24 > 1) {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar1121 = (o73.u) kt2.e.f106512r0.getValue();
                                Object[] objArr1116 = {new Integer(i24)};
                                sVar.f133944e = strConcat;
                                sVar.f133940a = z14;
                                sVar.f133941b = i16;
                                sVar.f133946g = 6;
                                objB = o73.v.b(uVar1121, objArr1116, sVar);
                                if (objB != aVar) {
                                    i28 = i16;
                                    z16 = z14;
                                    str5 = strConcat;
                                    str6 = (String) objB;
                                    z14 = z16;
                                    strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                    if (i28 > 0) {
                                        if (z14) {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar111110 = (o73.u) kt2.e.D0.getValue();
                                            sVar.f133944e = strConcat2;
                                            sVar.f133941b = i28;
                                            sVar.f133946g = 11;
                                            objB = o73.v.a(uVar111110, sVar);
                                            break;
                                        } else if (i28 > 1) {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar111111 = (o73.u) kt2.e.f106515s0.getValue();
                                            Object[] objArr1117 = {new Integer(i28)};
                                            sVar.f133944e = strConcat2;
                                            sVar.f133946g = 9;
                                            objB = o73.v.b(uVar111111, objArr1117, sVar);
                                            if (objB != aVar) {
                                                str7 = strConcat2;
                                                str8 = (String) objB;
                                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                            }
                                        } else {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar111112 = (o73.u) kt2.e.f106524v0.getValue();
                                            Object[] objArr1118 = {new Integer(i28)};
                                            sVar.f133944e = strConcat2;
                                            sVar.f133946g = 10;
                                            objB = o73.v.b(uVar111112, objArr1118, sVar);
                                            if (objB != aVar) {
                                                str7 = strConcat2;
                                                str8 = (String) objB;
                                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                            }
                                        }
                                    }
                                    return d53.w.i0(strConcat2).toString();
                                }
                            } else {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar26 = (o73.u) kt2.e.f106521u0.getValue();
                                Object[] objArr1119 = {new Integer(i24)};
                                sVar.f133944e = strConcat;
                                sVar.f133940a = z14;
                                sVar.f133941b = i16;
                                sVar.f133946g = 7;
                                objB = o73.v.b(uVar26, objArr1119, sVar);
                                if (objB != aVar) {
                                    i28 = i16;
                                    z16 = z14;
                                    str5 = strConcat;
                                    str6 = (String) objB;
                                    z14 = z16;
                                    strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                    if (i28 > 0) {
                                        if (z14) {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar111113 = (o73.u) kt2.e.D0.getValue();
                                            sVar.f133944e = strConcat2;
                                            sVar.f133941b = i28;
                                            sVar.f133946g = 11;
                                            objB = o73.v.a(uVar111113, sVar);
                                            break;
                                        } else if (i28 > 1) {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar111114 = (o73.u) kt2.e.f106515s0.getValue();
                                            Object[] objArr11110 = {new Integer(i28)};
                                            sVar.f133944e = strConcat2;
                                            sVar.f133946g = 9;
                                            objB = o73.v.b(uVar111114, objArr11110, sVar);
                                            if (objB != aVar) {
                                                str7 = strConcat2;
                                                str8 = (String) objB;
                                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                            }
                                        } else {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar111115 = (o73.u) kt2.e.f106524v0.getValue();
                                            Object[] objArr11111 = {new Integer(i28)};
                                            sVar.f133944e = strConcat2;
                                            sVar.f133946g = 10;
                                            objB = o73.v.b(uVar111115, objArr11111, sVar);
                                            if (objB != aVar) {
                                                str7 = strConcat2;
                                                str8 = (String) objB;
                                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                            }
                                        }
                                    }
                                    return d53.w.i0(strConcat2).toString();
                                }
                            }
                        } else if (!z14) {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar120 = (o73.u) kt2.e.f106461a0.getValue();
                            sVar.f133944e = str2;
                            sVar.f133940a = z14;
                            sVar.f133941b = i14;
                            sVar.f133942c = i16;
                            sVar.f133943d = i17;
                            sVar.f133946g = 5;
                            objB = o73.v.a(uVar120, sVar);
                            if (objB != aVar) {
                                int i311 = i14;
                                z15 = z14;
                                i25 = i311;
                                str4 = i17 + StringUtils.SPACE + objB;
                                i26 = i16;
                                i27 = i25;
                                z14 = z15;
                                str3 = str2;
                                int i312 = i27;
                                i16 = i26;
                                i24 = i312;
                                strConcat = (str3 + str4).concat(StringUtils.SPACE);
                                if (i24 <= 0) {
                                    i28 = i16;
                                    strConcat2 = strConcat;
                                    if (i28 > 0) {
                                        if (z14) {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar111116 = (o73.u) kt2.e.D0.getValue();
                                            sVar.f133944e = strConcat2;
                                            sVar.f133941b = i28;
                                            sVar.f133946g = 11;
                                            objB = o73.v.a(uVar111116, sVar);
                                            break;
                                        } else if (i28 > 1) {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar111117 = (o73.u) kt2.e.f106515s0.getValue();
                                            Object[] objArr11112 = {new Integer(i28)};
                                            sVar.f133944e = strConcat2;
                                            sVar.f133946g = 9;
                                            objB = o73.v.b(uVar111117, objArr11112, sVar);
                                            if (objB != aVar) {
                                                str7 = strConcat2;
                                                str8 = (String) objB;
                                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                            }
                                        } else {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar111118 = (o73.u) kt2.e.f106524v0.getValue();
                                            Object[] objArr11113 = {new Integer(i28)};
                                            sVar.f133944e = strConcat2;
                                            sVar.f133946g = 10;
                                            objB = o73.v.b(uVar111118, objArr11113, sVar);
                                            if (objB != aVar) {
                                                str7 = strConcat2;
                                                str8 = (String) objB;
                                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                            }
                                        }
                                    }
                                    return d53.w.i0(strConcat2).toString();
                                }
                                if (!z14) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar111119 = (o73.u) kt2.e.f106488j0.getValue();
                                    sVar.f133944e = strConcat;
                                    sVar.f133940a = z14;
                                    sVar.f133941b = i16;
                                    sVar.f133942c = i24;
                                    sVar.f133946g = 8;
                                    objB = o73.v.a(uVar111119, sVar);
                                    break;
                                } else if (i24 > 1) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar1122 = (o73.u) kt2.e.f106512r0.getValue();
                                    Object[] objArr11114 = {new Integer(i24)};
                                    sVar.f133944e = strConcat;
                                    sVar.f133940a = z14;
                                    sVar.f133941b = i16;
                                    sVar.f133946g = 6;
                                    objB = o73.v.b(uVar1122, objArr11114, sVar);
                                    if (objB != aVar) {
                                        i28 = i16;
                                        z16 = z14;
                                        str5 = strConcat;
                                        str6 = (String) objB;
                                        z14 = z16;
                                        strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                        if (i28 > 0) {
                                            if (z14) {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar1111110 = (o73.u) kt2.e.D0.getValue();
                                                sVar.f133944e = strConcat2;
                                                sVar.f133941b = i28;
                                                sVar.f133946g = 11;
                                                objB = o73.v.a(uVar1111110, sVar);
                                                break;
                                            } else if (i28 > 1) {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar1111111 = (o73.u) kt2.e.f106515s0.getValue();
                                                Object[] objArr11115 = {new Integer(i28)};
                                                sVar.f133944e = strConcat2;
                                                sVar.f133946g = 9;
                                                objB = o73.v.b(uVar1111111, objArr11115, sVar);
                                                if (objB != aVar) {
                                                    str7 = strConcat2;
                                                    str8 = (String) objB;
                                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                                }
                                            } else {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar1111112 = (o73.u) kt2.e.f106524v0.getValue();
                                                Object[] objArr11116 = {new Integer(i28)};
                                                sVar.f133944e = strConcat2;
                                                sVar.f133946g = 10;
                                                objB = o73.v.b(uVar1111112, objArr11116, sVar);
                                                if (objB != aVar) {
                                                    str7 = strConcat2;
                                                    str8 = (String) objB;
                                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                                }
                                            }
                                        }
                                        return d53.w.i0(strConcat2).toString();
                                    }
                                } else {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar27 = (o73.u) kt2.e.f106521u0.getValue();
                                    Object[] objArr11117 = {new Integer(i24)};
                                    sVar.f133944e = strConcat;
                                    sVar.f133940a = z14;
                                    sVar.f133941b = i16;
                                    sVar.f133946g = 7;
                                    objB = o73.v.b(uVar27, objArr11117, sVar);
                                    if (objB != aVar) {
                                        i28 = i16;
                                        z16 = z14;
                                        str5 = strConcat;
                                        str6 = (String) objB;
                                        z14 = z16;
                                        strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                        if (i28 > 0) {
                                            if (z14) {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar1111113 = (o73.u) kt2.e.D0.getValue();
                                                sVar.f133944e = strConcat2;
                                                sVar.f133941b = i28;
                                                sVar.f133946g = 11;
                                                objB = o73.v.a(uVar1111113, sVar);
                                                break;
                                            } else if (i28 > 1) {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar1111114 = (o73.u) kt2.e.f106515s0.getValue();
                                                Object[] objArr11118 = {new Integer(i28)};
                                                sVar.f133944e = strConcat2;
                                                sVar.f133946g = 9;
                                                objB = o73.v.b(uVar1111114, objArr11118, sVar);
                                                if (objB != aVar) {
                                                    str7 = strConcat2;
                                                    str8 = (String) objB;
                                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                                }
                                            } else {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar1111115 = (o73.u) kt2.e.f106524v0.getValue();
                                                Object[] objArr11119 = {new Integer(i28)};
                                                sVar.f133944e = strConcat2;
                                                sVar.f133946g = 10;
                                                objB = o73.v.b(uVar1111115, objArr11119, sVar);
                                                if (objB != aVar) {
                                                    str7 = strConcat2;
                                                    str8 = (String) objB;
                                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                                }
                                            }
                                        }
                                        return d53.w.i0(strConcat2).toString();
                                    }
                                }
                            }
                        } else if (i17 > 1) {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar28 = (o73.u) kt2.e.f106509q0.getValue();
                            Object[] objArr120 = {new Integer(i17)};
                            sVar.f133944e = str2;
                            sVar.f133940a = z14;
                            sVar.f133941b = i14;
                            sVar.f133942c = i16;
                            sVar.f133946g = 3;
                            objB = o73.v.b(uVar28, objArr120, sVar);
                            if (objB != aVar) {
                                i26 = i16;
                                i27 = i14;
                                str3 = str2;
                                str4 = (String) objB;
                                int i313 = i27;
                                i16 = i26;
                                i24 = i313;
                                strConcat = (str3 + str4).concat(StringUtils.SPACE);
                                if (i24 <= 0) {
                                    i28 = i16;
                                    strConcat2 = strConcat;
                                    if (i28 > 0) {
                                        if (z14) {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar1111116 = (o73.u) kt2.e.D0.getValue();
                                            sVar.f133944e = strConcat2;
                                            sVar.f133941b = i28;
                                            sVar.f133946g = 11;
                                            objB = o73.v.a(uVar1111116, sVar);
                                            break;
                                        } else if (i28 > 1) {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar1111117 = (o73.u) kt2.e.f106515s0.getValue();
                                            Object[] objArr111110 = {new Integer(i28)};
                                            sVar.f133944e = strConcat2;
                                            sVar.f133946g = 9;
                                            objB = o73.v.b(uVar1111117, objArr111110, sVar);
                                            if (objB != aVar) {
                                                str7 = strConcat2;
                                                str8 = (String) objB;
                                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                            }
                                        } else {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar1111118 = (o73.u) kt2.e.f106524v0.getValue();
                                            Object[] objArr111111 = {new Integer(i28)};
                                            sVar.f133944e = strConcat2;
                                            sVar.f133946g = 10;
                                            objB = o73.v.b(uVar1111118, objArr111111, sVar);
                                            if (objB != aVar) {
                                                str7 = strConcat2;
                                                str8 = (String) objB;
                                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                            }
                                        }
                                    }
                                    return d53.w.i0(strConcat2).toString();
                                }
                                if (!z14) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar1111119 = (o73.u) kt2.e.f106488j0.getValue();
                                    sVar.f133944e = strConcat;
                                    sVar.f133940a = z14;
                                    sVar.f133941b = i16;
                                    sVar.f133942c = i24;
                                    sVar.f133946g = 8;
                                    objB = o73.v.a(uVar1111119, sVar);
                                    break;
                                } else if (i24 > 1) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar1123 = (o73.u) kt2.e.f106512r0.getValue();
                                    Object[] objArr111112 = {new Integer(i24)};
                                    sVar.f133944e = strConcat;
                                    sVar.f133940a = z14;
                                    sVar.f133941b = i16;
                                    sVar.f133946g = 6;
                                    objB = o73.v.b(uVar1123, objArr111112, sVar);
                                    if (objB != aVar) {
                                        i28 = i16;
                                        z16 = z14;
                                        str5 = strConcat;
                                        str6 = (String) objB;
                                        z14 = z16;
                                        strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                        if (i28 > 0) {
                                            if (z14) {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar11111110 = (o73.u) kt2.e.D0.getValue();
                                                sVar.f133944e = strConcat2;
                                                sVar.f133941b = i28;
                                                sVar.f133946g = 11;
                                                objB = o73.v.a(uVar11111110, sVar);
                                                break;
                                            } else if (i28 > 1) {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar11111111 = (o73.u) kt2.e.f106515s0.getValue();
                                                Object[] objArr111113 = {new Integer(i28)};
                                                sVar.f133944e = strConcat2;
                                                sVar.f133946g = 9;
                                                objB = o73.v.b(uVar11111111, objArr111113, sVar);
                                                if (objB != aVar) {
                                                    str7 = strConcat2;
                                                    str8 = (String) objB;
                                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                                }
                                            } else {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar11111112 = (o73.u) kt2.e.f106524v0.getValue();
                                                Object[] objArr111114 = {new Integer(i28)};
                                                sVar.f133944e = strConcat2;
                                                sVar.f133946g = 10;
                                                objB = o73.v.b(uVar11111112, objArr111114, sVar);
                                                if (objB != aVar) {
                                                    str7 = strConcat2;
                                                    str8 = (String) objB;
                                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                                }
                                            }
                                        }
                                        return d53.w.i0(strConcat2).toString();
                                    }
                                } else {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar29 = (o73.u) kt2.e.f106521u0.getValue();
                                    Object[] objArr111115 = {new Integer(i24)};
                                    sVar.f133944e = strConcat;
                                    sVar.f133940a = z14;
                                    sVar.f133941b = i16;
                                    sVar.f133946g = 7;
                                    objB = o73.v.b(uVar29, objArr111115, sVar);
                                    if (objB != aVar) {
                                        i28 = i16;
                                        z16 = z14;
                                        str5 = strConcat;
                                        str6 = (String) objB;
                                        z14 = z16;
                                        strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                        if (i28 > 0) {
                                            if (z14) {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar11111113 = (o73.u) kt2.e.D0.getValue();
                                                sVar.f133944e = strConcat2;
                                                sVar.f133941b = i28;
                                                sVar.f133946g = 11;
                                                objB = o73.v.a(uVar11111113, sVar);
                                                break;
                                            } else if (i28 > 1) {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar11111114 = (o73.u) kt2.e.f106515s0.getValue();
                                                Object[] objArr111116 = {new Integer(i28)};
                                                sVar.f133944e = strConcat2;
                                                sVar.f133946g = 9;
                                                objB = o73.v.b(uVar11111114, objArr111116, sVar);
                                                if (objB != aVar) {
                                                    str7 = strConcat2;
                                                    str8 = (String) objB;
                                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                                }
                                            } else {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar11111115 = (o73.u) kt2.e.f106524v0.getValue();
                                                Object[] objArr111117 = {new Integer(i28)};
                                                sVar.f133944e = strConcat2;
                                                sVar.f133946g = 10;
                                                objB = o73.v.b(uVar11111115, objArr111117, sVar);
                                                if (objB != aVar) {
                                                    str7 = strConcat2;
                                                    str8 = (String) objB;
                                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                                }
                                            }
                                        }
                                        return d53.w.i0(strConcat2).toString();
                                    }
                                }
                            }
                        } else {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar210 = (o73.u) kt2.e.f106518t0.getValue();
                            Object[] objArr22 = {new Integer(i17)};
                            sVar.f133944e = str2;
                            sVar.f133940a = z14;
                            sVar.f133941b = i14;
                            sVar.f133942c = i16;
                            sVar.f133946g = 4;
                            objB = o73.v.b(uVar210, objArr22, sVar);
                            if (objB != aVar) {
                                i26 = i16;
                                i27 = i14;
                                str3 = str2;
                                str4 = (String) objB;
                                int i314 = i27;
                                i16 = i26;
                                i24 = i314;
                                strConcat = (str3 + str4).concat(StringUtils.SPACE);
                                if (i24 <= 0) {
                                    i28 = i16;
                                    strConcat2 = strConcat;
                                    if (i28 > 0) {
                                        if (z14) {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar11111116 = (o73.u) kt2.e.D0.getValue();
                                            sVar.f133944e = strConcat2;
                                            sVar.f133941b = i28;
                                            sVar.f133946g = 11;
                                            objB = o73.v.a(uVar11111116, sVar);
                                            break;
                                        } else if (i28 > 1) {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar11111117 = (o73.u) kt2.e.f106515s0.getValue();
                                            Object[] objArr111118 = {new Integer(i28)};
                                            sVar.f133944e = strConcat2;
                                            sVar.f133946g = 9;
                                            objB = o73.v.b(uVar11111117, objArr111118, sVar);
                                            if (objB != aVar) {
                                                str7 = strConcat2;
                                                str8 = (String) objB;
                                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                            }
                                        } else {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar11111118 = (o73.u) kt2.e.f106524v0.getValue();
                                            Object[] objArr111119 = {new Integer(i28)};
                                            sVar.f133944e = strConcat2;
                                            sVar.f133946g = 10;
                                            objB = o73.v.b(uVar11111118, objArr111119, sVar);
                                            if (objB != aVar) {
                                                str7 = strConcat2;
                                                str8 = (String) objB;
                                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                            }
                                        }
                                    }
                                    return d53.w.i0(strConcat2).toString();
                                }
                                if (!z14) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar11111119 = (o73.u) kt2.e.f106488j0.getValue();
                                    sVar.f133944e = strConcat;
                                    sVar.f133940a = z14;
                                    sVar.f133941b = i16;
                                    sVar.f133942c = i24;
                                    sVar.f133946g = 8;
                                    objB = o73.v.a(uVar11111119, sVar);
                                    break;
                                } else if (i24 > 1) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar1124 = (o73.u) kt2.e.f106512r0.getValue();
                                    Object[] objArr1111110 = {new Integer(i24)};
                                    sVar.f133944e = strConcat;
                                    sVar.f133940a = z14;
                                    sVar.f133941b = i16;
                                    sVar.f133946g = 6;
                                    objB = o73.v.b(uVar1124, objArr1111110, sVar);
                                    if (objB != aVar) {
                                        i28 = i16;
                                        z16 = z14;
                                        str5 = strConcat;
                                        str6 = (String) objB;
                                        z14 = z16;
                                        strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                        if (i28 > 0) {
                                            if (z14) {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar111111110 = (o73.u) kt2.e.D0.getValue();
                                                sVar.f133944e = strConcat2;
                                                sVar.f133941b = i28;
                                                sVar.f133946g = 11;
                                                objB = o73.v.a(uVar111111110, sVar);
                                                break;
                                            } else if (i28 > 1) {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar111111111 = (o73.u) kt2.e.f106515s0.getValue();
                                                Object[] objArr1111111 = {new Integer(i28)};
                                                sVar.f133944e = strConcat2;
                                                sVar.f133946g = 9;
                                                objB = o73.v.b(uVar111111111, objArr1111111, sVar);
                                                if (objB != aVar) {
                                                    str7 = strConcat2;
                                                    str8 = (String) objB;
                                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                                }
                                            } else {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar111111112 = (o73.u) kt2.e.f106524v0.getValue();
                                                Object[] objArr1111112 = {new Integer(i28)};
                                                sVar.f133944e = strConcat2;
                                                sVar.f133946g = 10;
                                                objB = o73.v.b(uVar111111112, objArr1111112, sVar);
                                                if (objB != aVar) {
                                                    str7 = strConcat2;
                                                    str8 = (String) objB;
                                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                                }
                                            }
                                        }
                                        return d53.w.i0(strConcat2).toString();
                                    }
                                } else {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar211 = (o73.u) kt2.e.f106521u0.getValue();
                                    Object[] objArr1111113 = {new Integer(i24)};
                                    sVar.f133944e = strConcat;
                                    sVar.f133940a = z14;
                                    sVar.f133941b = i16;
                                    sVar.f133946g = 7;
                                    objB = o73.v.b(uVar211, objArr1111113, sVar);
                                    if (objB != aVar) {
                                        i28 = i16;
                                        z16 = z14;
                                        str5 = strConcat;
                                        str6 = (String) objB;
                                        z14 = z16;
                                        strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                        if (i28 > 0) {
                                            if (z14) {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar111111113 = (o73.u) kt2.e.D0.getValue();
                                                sVar.f133944e = strConcat2;
                                                sVar.f133941b = i28;
                                                sVar.f133946g = 11;
                                                objB = o73.v.a(uVar111111113, sVar);
                                                break;
                                            } else if (i28 > 1) {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar111111114 = (o73.u) kt2.e.f106515s0.getValue();
                                                Object[] objArr1111114 = {new Integer(i28)};
                                                sVar.f133944e = strConcat2;
                                                sVar.f133946g = 9;
                                                objB = o73.v.b(uVar111111114, objArr1111114, sVar);
                                                if (objB != aVar) {
                                                    str7 = strConcat2;
                                                    str8 = (String) objB;
                                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                                }
                                            } else {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar111111115 = (o73.u) kt2.e.f106524v0.getValue();
                                                Object[] objArr1111115 = {new Integer(i28)};
                                                sVar.f133944e = strConcat2;
                                                sVar.f133946g = 10;
                                                objB = o73.v.b(uVar111111115, objArr1111115, sVar);
                                                if (objB != aVar) {
                                                    str7 = strConcat2;
                                                    str8 = (String) objB;
                                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                                }
                                            }
                                        }
                                        return d53.w.i0(strConcat2).toString();
                                    }
                                }
                            }
                        }
                    }
                } else {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    o73.u uVar30 = (o73.u) kt2.e.f106505p.getValue();
                    Object[] objArr23 = {new Integer(i30)};
                    sVar.f133940a = z14;
                    sVar.f133941b = i35;
                    sVar.f133942c = i14;
                    sVar.f133943d = i15;
                    sVar.f133946g = 2;
                    objB = o73.v.b(uVar30, objArr23, sVar);
                    if (objB != aVar) {
                        i18 = i35;
                        i19 = i14;
                        str = (String) objB;
                        int i45 = i19;
                        i16 = i15;
                        i17 = i18;
                        i14 = i45;
                        str2 = str;
                        if (i17 <= 0) {
                            i24 = i14;
                            strConcat = str2;
                            if (i24 <= 0) {
                                i28 = i16;
                                strConcat2 = strConcat;
                                if (i28 > 0) {
                                    if (z14) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar111111116 = (o73.u) kt2.e.D0.getValue();
                                        sVar.f133944e = strConcat2;
                                        sVar.f133941b = i28;
                                        sVar.f133946g = 11;
                                        objB = o73.v.a(uVar111111116, sVar);
                                        break;
                                    } else if (i28 > 1) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar111111117 = (o73.u) kt2.e.f106515s0.getValue();
                                        Object[] objArr1111116 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 9;
                                        objB = o73.v.b(uVar111111117, objArr1111116, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    } else {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar111111118 = (o73.u) kt2.e.f106524v0.getValue();
                                        Object[] objArr1111117 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 10;
                                        objB = o73.v.b(uVar111111118, objArr1111117, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    }
                                }
                                return d53.w.i0(strConcat2).toString();
                            }
                            if (!z14) {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar111111119 = (o73.u) kt2.e.f106488j0.getValue();
                                sVar.f133944e = strConcat;
                                sVar.f133940a = z14;
                                sVar.f133941b = i16;
                                sVar.f133942c = i24;
                                sVar.f133946g = 8;
                                objB = o73.v.a(uVar111111119, sVar);
                                break;
                            } else if (i24 > 1) {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar1125 = (o73.u) kt2.e.f106512r0.getValue();
                                Object[] objArr1111118 = {new Integer(i24)};
                                sVar.f133944e = strConcat;
                                sVar.f133940a = z14;
                                sVar.f133941b = i16;
                                sVar.f133946g = 6;
                                objB = o73.v.b(uVar1125, objArr1111118, sVar);
                                if (objB != aVar) {
                                    i28 = i16;
                                    z16 = z14;
                                    str5 = strConcat;
                                    str6 = (String) objB;
                                    z14 = z16;
                                    strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                    if (i28 > 0) {
                                        if (z14) {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar1111111110 = (o73.u) kt2.e.D0.getValue();
                                            sVar.f133944e = strConcat2;
                                            sVar.f133941b = i28;
                                            sVar.f133946g = 11;
                                            objB = o73.v.a(uVar1111111110, sVar);
                                            break;
                                        } else if (i28 > 1) {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar1111111111 = (o73.u) kt2.e.f106515s0.getValue();
                                            Object[] objArr1111119 = {new Integer(i28)};
                                            sVar.f133944e = strConcat2;
                                            sVar.f133946g = 9;
                                            objB = o73.v.b(uVar1111111111, objArr1111119, sVar);
                                            if (objB != aVar) {
                                                str7 = strConcat2;
                                                str8 = (String) objB;
                                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                            }
                                        } else {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar1111111112 = (o73.u) kt2.e.f106524v0.getValue();
                                            Object[] objArr11111110 = {new Integer(i28)};
                                            sVar.f133944e = strConcat2;
                                            sVar.f133946g = 10;
                                            objB = o73.v.b(uVar1111111112, objArr11111110, sVar);
                                            if (objB != aVar) {
                                                str7 = strConcat2;
                                                str8 = (String) objB;
                                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                            }
                                        }
                                    }
                                    return d53.w.i0(strConcat2).toString();
                                }
                            } else {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar212 = (o73.u) kt2.e.f106521u0.getValue();
                                Object[] objArr11111111 = {new Integer(i24)};
                                sVar.f133944e = strConcat;
                                sVar.f133940a = z14;
                                sVar.f133941b = i16;
                                sVar.f133946g = 7;
                                objB = o73.v.b(uVar212, objArr11111111, sVar);
                                if (objB != aVar) {
                                    i28 = i16;
                                    z16 = z14;
                                    str5 = strConcat;
                                    str6 = (String) objB;
                                    z14 = z16;
                                    strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                    if (i28 > 0) {
                                        if (z14) {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar1111111113 = (o73.u) kt2.e.D0.getValue();
                                            sVar.f133944e = strConcat2;
                                            sVar.f133941b = i28;
                                            sVar.f133946g = 11;
                                            objB = o73.v.a(uVar1111111113, sVar);
                                            break;
                                        } else if (i28 > 1) {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar1111111114 = (o73.u) kt2.e.f106515s0.getValue();
                                            Object[] objArr11111112 = {new Integer(i28)};
                                            sVar.f133944e = strConcat2;
                                            sVar.f133946g = 9;
                                            objB = o73.v.b(uVar1111111114, objArr11111112, sVar);
                                            if (objB != aVar) {
                                                str7 = strConcat2;
                                                str8 = (String) objB;
                                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                            }
                                        } else {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar1111111115 = (o73.u) kt2.e.f106524v0.getValue();
                                            Object[] objArr11111113 = {new Integer(i28)};
                                            sVar.f133944e = strConcat2;
                                            sVar.f133946g = 10;
                                            objB = o73.v.b(uVar1111111115, objArr11111113, sVar);
                                            if (objB != aVar) {
                                                str7 = strConcat2;
                                                str8 = (String) objB;
                                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                            }
                                        }
                                    }
                                    return d53.w.i0(strConcat2).toString();
                                }
                            }
                        } else if (!z14) {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar121 = (o73.u) kt2.e.f106461a0.getValue();
                            sVar.f133944e = str2;
                            sVar.f133940a = z14;
                            sVar.f133941b = i14;
                            sVar.f133942c = i16;
                            sVar.f133943d = i17;
                            sVar.f133946g = 5;
                            objB = o73.v.a(uVar121, sVar);
                            if (objB != aVar) {
                                int i315 = i14;
                                z15 = z14;
                                i25 = i315;
                                str4 = i17 + StringUtils.SPACE + objB;
                                i26 = i16;
                                i27 = i25;
                                z14 = z15;
                                str3 = str2;
                                int i316 = i27;
                                i16 = i26;
                                i24 = i316;
                                strConcat = (str3 + str4).concat(StringUtils.SPACE);
                                if (i24 <= 0) {
                                    i28 = i16;
                                    strConcat2 = strConcat;
                                    if (i28 > 0) {
                                        if (z14) {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar1111111116 = (o73.u) kt2.e.D0.getValue();
                                            sVar.f133944e = strConcat2;
                                            sVar.f133941b = i28;
                                            sVar.f133946g = 11;
                                            objB = o73.v.a(uVar1111111116, sVar);
                                            break;
                                        } else if (i28 > 1) {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar1111111117 = (o73.u) kt2.e.f106515s0.getValue();
                                            Object[] objArr11111114 = {new Integer(i28)};
                                            sVar.f133944e = strConcat2;
                                            sVar.f133946g = 9;
                                            objB = o73.v.b(uVar1111111117, objArr11111114, sVar);
                                            if (objB != aVar) {
                                                str7 = strConcat2;
                                                str8 = (String) objB;
                                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                            }
                                        } else {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar1111111118 = (o73.u) kt2.e.f106524v0.getValue();
                                            Object[] objArr11111115 = {new Integer(i28)};
                                            sVar.f133944e = strConcat2;
                                            sVar.f133946g = 10;
                                            objB = o73.v.b(uVar1111111118, objArr11111115, sVar);
                                            if (objB != aVar) {
                                                str7 = strConcat2;
                                                str8 = (String) objB;
                                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                            }
                                        }
                                    }
                                    return d53.w.i0(strConcat2).toString();
                                }
                                if (!z14) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar1111111119 = (o73.u) kt2.e.f106488j0.getValue();
                                    sVar.f133944e = strConcat;
                                    sVar.f133940a = z14;
                                    sVar.f133941b = i16;
                                    sVar.f133942c = i24;
                                    sVar.f133946g = 8;
                                    objB = o73.v.a(uVar1111111119, sVar);
                                    break;
                                } else if (i24 > 1) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar1126 = (o73.u) kt2.e.f106512r0.getValue();
                                    Object[] objArr11111116 = {new Integer(i24)};
                                    sVar.f133944e = strConcat;
                                    sVar.f133940a = z14;
                                    sVar.f133941b = i16;
                                    sVar.f133946g = 6;
                                    objB = o73.v.b(uVar1126, objArr11111116, sVar);
                                    if (objB != aVar) {
                                        i28 = i16;
                                        z16 = z14;
                                        str5 = strConcat;
                                        str6 = (String) objB;
                                        z14 = z16;
                                        strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                        if (i28 > 0) {
                                            if (z14) {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar11111111110 = (o73.u) kt2.e.D0.getValue();
                                                sVar.f133944e = strConcat2;
                                                sVar.f133941b = i28;
                                                sVar.f133946g = 11;
                                                objB = o73.v.a(uVar11111111110, sVar);
                                                break;
                                            } else if (i28 > 1) {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar11111111111 = (o73.u) kt2.e.f106515s0.getValue();
                                                Object[] objArr11111117 = {new Integer(i28)};
                                                sVar.f133944e = strConcat2;
                                                sVar.f133946g = 9;
                                                objB = o73.v.b(uVar11111111111, objArr11111117, sVar);
                                                if (objB != aVar) {
                                                    str7 = strConcat2;
                                                    str8 = (String) objB;
                                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                                }
                                            } else {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar11111111112 = (o73.u) kt2.e.f106524v0.getValue();
                                                Object[] objArr11111118 = {new Integer(i28)};
                                                sVar.f133944e = strConcat2;
                                                sVar.f133946g = 10;
                                                objB = o73.v.b(uVar11111111112, objArr11111118, sVar);
                                                if (objB != aVar) {
                                                    str7 = strConcat2;
                                                    str8 = (String) objB;
                                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                                }
                                            }
                                        }
                                        return d53.w.i0(strConcat2).toString();
                                    }
                                } else {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar213 = (o73.u) kt2.e.f106521u0.getValue();
                                    Object[] objArr11111119 = {new Integer(i24)};
                                    sVar.f133944e = strConcat;
                                    sVar.f133940a = z14;
                                    sVar.f133941b = i16;
                                    sVar.f133946g = 7;
                                    objB = o73.v.b(uVar213, objArr11111119, sVar);
                                    if (objB != aVar) {
                                        i28 = i16;
                                        z16 = z14;
                                        str5 = strConcat;
                                        str6 = (String) objB;
                                        z14 = z16;
                                        strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                        if (i28 > 0) {
                                            if (z14) {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar11111111113 = (o73.u) kt2.e.D0.getValue();
                                                sVar.f133944e = strConcat2;
                                                sVar.f133941b = i28;
                                                sVar.f133946g = 11;
                                                objB = o73.v.a(uVar11111111113, sVar);
                                                break;
                                            } else if (i28 > 1) {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar11111111114 = (o73.u) kt2.e.f106515s0.getValue();
                                                Object[] objArr111111110 = {new Integer(i28)};
                                                sVar.f133944e = strConcat2;
                                                sVar.f133946g = 9;
                                                objB = o73.v.b(uVar11111111114, objArr111111110, sVar);
                                                if (objB != aVar) {
                                                    str7 = strConcat2;
                                                    str8 = (String) objB;
                                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                                }
                                            } else {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar11111111115 = (o73.u) kt2.e.f106524v0.getValue();
                                                Object[] objArr111111111 = {new Integer(i28)};
                                                sVar.f133944e = strConcat2;
                                                sVar.f133946g = 10;
                                                objB = o73.v.b(uVar11111111115, objArr111111111, sVar);
                                                if (objB != aVar) {
                                                    str7 = strConcat2;
                                                    str8 = (String) objB;
                                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                                }
                                            }
                                        }
                                        return d53.w.i0(strConcat2).toString();
                                    }
                                }
                            }
                        } else if (i17 > 1) {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar214 = (o73.u) kt2.e.f106509q0.getValue();
                            Object[] objArr121 = {new Integer(i17)};
                            sVar.f133944e = str2;
                            sVar.f133940a = z14;
                            sVar.f133941b = i14;
                            sVar.f133942c = i16;
                            sVar.f133946g = 3;
                            objB = o73.v.b(uVar214, objArr121, sVar);
                            if (objB != aVar) {
                                i26 = i16;
                                i27 = i14;
                                str3 = str2;
                                str4 = (String) objB;
                                int i317 = i27;
                                i16 = i26;
                                i24 = i317;
                                strConcat = (str3 + str4).concat(StringUtils.SPACE);
                                if (i24 <= 0) {
                                    i28 = i16;
                                    strConcat2 = strConcat;
                                    if (i28 > 0) {
                                        if (z14) {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar11111111116 = (o73.u) kt2.e.D0.getValue();
                                            sVar.f133944e = strConcat2;
                                            sVar.f133941b = i28;
                                            sVar.f133946g = 11;
                                            objB = o73.v.a(uVar11111111116, sVar);
                                            break;
                                        } else if (i28 > 1) {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar11111111117 = (o73.u) kt2.e.f106515s0.getValue();
                                            Object[] objArr111111112 = {new Integer(i28)};
                                            sVar.f133944e = strConcat2;
                                            sVar.f133946g = 9;
                                            objB = o73.v.b(uVar11111111117, objArr111111112, sVar);
                                            if (objB != aVar) {
                                                str7 = strConcat2;
                                                str8 = (String) objB;
                                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                            }
                                        } else {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar11111111118 = (o73.u) kt2.e.f106524v0.getValue();
                                            Object[] objArr111111113 = {new Integer(i28)};
                                            sVar.f133944e = strConcat2;
                                            sVar.f133946g = 10;
                                            objB = o73.v.b(uVar11111111118, objArr111111113, sVar);
                                            if (objB != aVar) {
                                                str7 = strConcat2;
                                                str8 = (String) objB;
                                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                            }
                                        }
                                    }
                                    return d53.w.i0(strConcat2).toString();
                                }
                                if (!z14) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar11111111119 = (o73.u) kt2.e.f106488j0.getValue();
                                    sVar.f133944e = strConcat;
                                    sVar.f133940a = z14;
                                    sVar.f133941b = i16;
                                    sVar.f133942c = i24;
                                    sVar.f133946g = 8;
                                    objB = o73.v.a(uVar11111111119, sVar);
                                    break;
                                } else if (i24 > 1) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar1127 = (o73.u) kt2.e.f106512r0.getValue();
                                    Object[] objArr111111114 = {new Integer(i24)};
                                    sVar.f133944e = strConcat;
                                    sVar.f133940a = z14;
                                    sVar.f133941b = i16;
                                    sVar.f133946g = 6;
                                    objB = o73.v.b(uVar1127, objArr111111114, sVar);
                                    if (objB != aVar) {
                                        i28 = i16;
                                        z16 = z14;
                                        str5 = strConcat;
                                        str6 = (String) objB;
                                        z14 = z16;
                                        strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                        if (i28 > 0) {
                                            if (z14) {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar111111111110 = (o73.u) kt2.e.D0.getValue();
                                                sVar.f133944e = strConcat2;
                                                sVar.f133941b = i28;
                                                sVar.f133946g = 11;
                                                objB = o73.v.a(uVar111111111110, sVar);
                                                break;
                                            } else if (i28 > 1) {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar111111111111 = (o73.u) kt2.e.f106515s0.getValue();
                                                Object[] objArr111111115 = {new Integer(i28)};
                                                sVar.f133944e = strConcat2;
                                                sVar.f133946g = 9;
                                                objB = o73.v.b(uVar111111111111, objArr111111115, sVar);
                                                if (objB != aVar) {
                                                    str7 = strConcat2;
                                                    str8 = (String) objB;
                                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                                }
                                            } else {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar111111111112 = (o73.u) kt2.e.f106524v0.getValue();
                                                Object[] objArr111111116 = {new Integer(i28)};
                                                sVar.f133944e = strConcat2;
                                                sVar.f133946g = 10;
                                                objB = o73.v.b(uVar111111111112, objArr111111116, sVar);
                                                if (objB != aVar) {
                                                    str7 = strConcat2;
                                                    str8 = (String) objB;
                                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                                }
                                            }
                                        }
                                        return d53.w.i0(strConcat2).toString();
                                    }
                                } else {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar215 = (o73.u) kt2.e.f106521u0.getValue();
                                    Object[] objArr111111117 = {new Integer(i24)};
                                    sVar.f133944e = strConcat;
                                    sVar.f133940a = z14;
                                    sVar.f133941b = i16;
                                    sVar.f133946g = 7;
                                    objB = o73.v.b(uVar215, objArr111111117, sVar);
                                    if (objB != aVar) {
                                        i28 = i16;
                                        z16 = z14;
                                        str5 = strConcat;
                                        str6 = (String) objB;
                                        z14 = z16;
                                        strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                        if (i28 > 0) {
                                            if (z14) {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar111111111113 = (o73.u) kt2.e.D0.getValue();
                                                sVar.f133944e = strConcat2;
                                                sVar.f133941b = i28;
                                                sVar.f133946g = 11;
                                                objB = o73.v.a(uVar111111111113, sVar);
                                                break;
                                            } else if (i28 > 1) {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar111111111114 = (o73.u) kt2.e.f106515s0.getValue();
                                                Object[] objArr111111118 = {new Integer(i28)};
                                                sVar.f133944e = strConcat2;
                                                sVar.f133946g = 9;
                                                objB = o73.v.b(uVar111111111114, objArr111111118, sVar);
                                                if (objB != aVar) {
                                                    str7 = strConcat2;
                                                    str8 = (String) objB;
                                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                                }
                                            } else {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar111111111115 = (o73.u) kt2.e.f106524v0.getValue();
                                                Object[] objArr111111119 = {new Integer(i28)};
                                                sVar.f133944e = strConcat2;
                                                sVar.f133946g = 10;
                                                objB = o73.v.b(uVar111111111115, objArr111111119, sVar);
                                                if (objB != aVar) {
                                                    str7 = strConcat2;
                                                    str8 = (String) objB;
                                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                                }
                                            }
                                        }
                                        return d53.w.i0(strConcat2).toString();
                                    }
                                }
                            }
                        } else {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar216 = (o73.u) kt2.e.f106518t0.getValue();
                            Object[] objArr24 = {new Integer(i17)};
                            sVar.f133944e = str2;
                            sVar.f133940a = z14;
                            sVar.f133941b = i14;
                            sVar.f133942c = i16;
                            sVar.f133946g = 4;
                            objB = o73.v.b(uVar216, objArr24, sVar);
                            if (objB != aVar) {
                                i26 = i16;
                                i27 = i14;
                                str3 = str2;
                                str4 = (String) objB;
                                int i318 = i27;
                                i16 = i26;
                                i24 = i318;
                                strConcat = (str3 + str4).concat(StringUtils.SPACE);
                                if (i24 <= 0) {
                                    i28 = i16;
                                    strConcat2 = strConcat;
                                    if (i28 > 0) {
                                        if (z14) {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar111111111116 = (o73.u) kt2.e.D0.getValue();
                                            sVar.f133944e = strConcat2;
                                            sVar.f133941b = i28;
                                            sVar.f133946g = 11;
                                            objB = o73.v.a(uVar111111111116, sVar);
                                            break;
                                        } else if (i28 > 1) {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar111111111117 = (o73.u) kt2.e.f106515s0.getValue();
                                            Object[] objArr1111111110 = {new Integer(i28)};
                                            sVar.f133944e = strConcat2;
                                            sVar.f133946g = 9;
                                            objB = o73.v.b(uVar111111111117, objArr1111111110, sVar);
                                            if (objB != aVar) {
                                                str7 = strConcat2;
                                                str8 = (String) objB;
                                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                            }
                                        } else {
                                            kt2.f.f106534a.getClass();
                                            kt2.e.f106460a.getClass();
                                            o73.u uVar111111111118 = (o73.u) kt2.e.f106524v0.getValue();
                                            Object[] objArr1111111111 = {new Integer(i28)};
                                            sVar.f133944e = strConcat2;
                                            sVar.f133946g = 10;
                                            objB = o73.v.b(uVar111111111118, objArr1111111111, sVar);
                                            if (objB != aVar) {
                                                str7 = strConcat2;
                                                str8 = (String) objB;
                                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                            }
                                        }
                                    }
                                    return d53.w.i0(strConcat2).toString();
                                }
                                if (!z14) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar111111111119 = (o73.u) kt2.e.f106488j0.getValue();
                                    sVar.f133944e = strConcat;
                                    sVar.f133940a = z14;
                                    sVar.f133941b = i16;
                                    sVar.f133942c = i24;
                                    sVar.f133946g = 8;
                                    objB = o73.v.a(uVar111111111119, sVar);
                                    break;
                                } else if (i24 > 1) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar1128 = (o73.u) kt2.e.f106512r0.getValue();
                                    Object[] objArr1111111112 = {new Integer(i24)};
                                    sVar.f133944e = strConcat;
                                    sVar.f133940a = z14;
                                    sVar.f133941b = i16;
                                    sVar.f133946g = 6;
                                    objB = o73.v.b(uVar1128, objArr1111111112, sVar);
                                    if (objB != aVar) {
                                        i28 = i16;
                                        z16 = z14;
                                        str5 = strConcat;
                                        str6 = (String) objB;
                                        z14 = z16;
                                        strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                        if (i28 > 0) {
                                            if (z14) {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar1111111111110 = (o73.u) kt2.e.D0.getValue();
                                                sVar.f133944e = strConcat2;
                                                sVar.f133941b = i28;
                                                sVar.f133946g = 11;
                                                objB = o73.v.a(uVar1111111111110, sVar);
                                                break;
                                            } else if (i28 > 1) {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar1111111111111 = (o73.u) kt2.e.f106515s0.getValue();
                                                Object[] objArr1111111113 = {new Integer(i28)};
                                                sVar.f133944e = strConcat2;
                                                sVar.f133946g = 9;
                                                objB = o73.v.b(uVar1111111111111, objArr1111111113, sVar);
                                                if (objB != aVar) {
                                                    str7 = strConcat2;
                                                    str8 = (String) objB;
                                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                                }
                                            } else {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar1111111111112 = (o73.u) kt2.e.f106524v0.getValue();
                                                Object[] objArr1111111114 = {new Integer(i28)};
                                                sVar.f133944e = strConcat2;
                                                sVar.f133946g = 10;
                                                objB = o73.v.b(uVar1111111111112, objArr1111111114, sVar);
                                                if (objB != aVar) {
                                                    str7 = strConcat2;
                                                    str8 = (String) objB;
                                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                                }
                                            }
                                        }
                                        return d53.w.i0(strConcat2).toString();
                                    }
                                } else {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar217 = (o73.u) kt2.e.f106521u0.getValue();
                                    Object[] objArr1111111115 = {new Integer(i24)};
                                    sVar.f133944e = strConcat;
                                    sVar.f133940a = z14;
                                    sVar.f133941b = i16;
                                    sVar.f133946g = 7;
                                    objB = o73.v.b(uVar217, objArr1111111115, sVar);
                                    if (objB != aVar) {
                                        i28 = i16;
                                        z16 = z14;
                                        str5 = strConcat;
                                        str6 = (String) objB;
                                        z14 = z16;
                                        strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                        if (i28 > 0) {
                                            if (z14) {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar1111111111113 = (o73.u) kt2.e.D0.getValue();
                                                sVar.f133944e = strConcat2;
                                                sVar.f133941b = i28;
                                                sVar.f133946g = 11;
                                                objB = o73.v.a(uVar1111111111113, sVar);
                                                break;
                                            } else if (i28 > 1) {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar1111111111114 = (o73.u) kt2.e.f106515s0.getValue();
                                                Object[] objArr1111111116 = {new Integer(i28)};
                                                sVar.f133944e = strConcat2;
                                                sVar.f133946g = 9;
                                                objB = o73.v.b(uVar1111111111114, objArr1111111116, sVar);
                                                if (objB != aVar) {
                                                    str7 = strConcat2;
                                                    str8 = (String) objB;
                                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                                }
                                            } else {
                                                kt2.f.f106534a.getClass();
                                                kt2.e.f106460a.getClass();
                                                o73.u uVar1111111111115 = (o73.u) kt2.e.f106524v0.getValue();
                                                Object[] objArr1111111117 = {new Integer(i28)};
                                                sVar.f133944e = strConcat2;
                                                sVar.f133946g = 10;
                                                objB = o73.v.b(uVar1111111111115, objArr1111111117, sVar);
                                                if (objB != aVar) {
                                                    str7 = strConcat2;
                                                    str8 = (String) objB;
                                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                                }
                                            }
                                        }
                                        return d53.w.i0(strConcat2).toString();
                                    }
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 1:
                i15 = sVar.f133943d;
                i19 = sVar.f133942c;
                int i46 = sVar.f133941b;
                boolean z17 = sVar.f133940a;
                o13.r.b(objB);
                i18 = i46;
                z14 = z17;
                str = (String) objB;
                int i47 = i19;
                i16 = i15;
                i17 = i18;
                i14 = i47;
                str2 = str;
                if (i17 <= 0) {
                    i24 = i14;
                    strConcat = str2;
                    if (i24 <= 0) {
                        i28 = i16;
                        strConcat2 = strConcat;
                        if (i28 > 0) {
                            if (z14) {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar1111111111116 = (o73.u) kt2.e.D0.getValue();
                                sVar.f133944e = strConcat2;
                                sVar.f133941b = i28;
                                sVar.f133946g = 11;
                                objB = o73.v.a(uVar1111111111116, sVar);
                                break;
                            } else if (i28 > 1) {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar1111111111117 = (o73.u) kt2.e.f106515s0.getValue();
                                Object[] objArr1111111118 = {new Integer(i28)};
                                sVar.f133944e = strConcat2;
                                sVar.f133946g = 9;
                                objB = o73.v.b(uVar1111111111117, objArr1111111118, sVar);
                                if (objB != aVar) {
                                    str7 = strConcat2;
                                    str8 = (String) objB;
                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                }
                            } else {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar1111111111118 = (o73.u) kt2.e.f106524v0.getValue();
                                Object[] objArr1111111119 = {new Integer(i28)};
                                sVar.f133944e = strConcat2;
                                sVar.f133946g = 10;
                                objB = o73.v.b(uVar1111111111118, objArr1111111119, sVar);
                                if (objB != aVar) {
                                    str7 = strConcat2;
                                    str8 = (String) objB;
                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                }
                            }
                        }
                        return d53.w.i0(strConcat2).toString();
                    }
                    if (!z14) {
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        o73.u uVar1111111111119 = (o73.u) kt2.e.f106488j0.getValue();
                        sVar.f133944e = strConcat;
                        sVar.f133940a = z14;
                        sVar.f133941b = i16;
                        sVar.f133942c = i24;
                        sVar.f133946g = 8;
                        objB = o73.v.a(uVar1111111111119, sVar);
                        break;
                    } else if (i24 > 1) {
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        o73.u uVar1129 = (o73.u) kt2.e.f106512r0.getValue();
                        Object[] objArr11111111110 = {new Integer(i24)};
                        sVar.f133944e = strConcat;
                        sVar.f133940a = z14;
                        sVar.f133941b = i16;
                        sVar.f133946g = 6;
                        objB = o73.v.b(uVar1129, objArr11111111110, sVar);
                        if (objB != aVar) {
                            i28 = i16;
                            z16 = z14;
                            str5 = strConcat;
                            str6 = (String) objB;
                            z14 = z16;
                            strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                            if (i28 > 0) {
                                if (z14) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar11111111111110 = (o73.u) kt2.e.D0.getValue();
                                    sVar.f133944e = strConcat2;
                                    sVar.f133941b = i28;
                                    sVar.f133946g = 11;
                                    objB = o73.v.a(uVar11111111111110, sVar);
                                    break;
                                } else if (i28 > 1) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar11111111111111 = (o73.u) kt2.e.f106515s0.getValue();
                                    Object[] objArr11111111111 = {new Integer(i28)};
                                    sVar.f133944e = strConcat2;
                                    sVar.f133946g = 9;
                                    objB = o73.v.b(uVar11111111111111, objArr11111111111, sVar);
                                    if (objB != aVar) {
                                        str7 = strConcat2;
                                        str8 = (String) objB;
                                        strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                    }
                                } else {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar11111111111112 = (o73.u) kt2.e.f106524v0.getValue();
                                    Object[] objArr11111111112 = {new Integer(i28)};
                                    sVar.f133944e = strConcat2;
                                    sVar.f133946g = 10;
                                    objB = o73.v.b(uVar11111111111112, objArr11111111112, sVar);
                                    if (objB != aVar) {
                                        str7 = strConcat2;
                                        str8 = (String) objB;
                                        strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                    }
                                }
                            }
                            return d53.w.i0(strConcat2).toString();
                        }
                    } else {
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        o73.u uVar218 = (o73.u) kt2.e.f106521u0.getValue();
                        Object[] objArr11111111113 = {new Integer(i24)};
                        sVar.f133944e = strConcat;
                        sVar.f133940a = z14;
                        sVar.f133941b = i16;
                        sVar.f133946g = 7;
                        objB = o73.v.b(uVar218, objArr11111111113, sVar);
                        if (objB != aVar) {
                            i28 = i16;
                            z16 = z14;
                            str5 = strConcat;
                            str6 = (String) objB;
                            z14 = z16;
                            strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                            if (i28 > 0) {
                                if (z14) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar11111111111113 = (o73.u) kt2.e.D0.getValue();
                                    sVar.f133944e = strConcat2;
                                    sVar.f133941b = i28;
                                    sVar.f133946g = 11;
                                    objB = o73.v.a(uVar11111111111113, sVar);
                                    break;
                                } else if (i28 > 1) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar11111111111114 = (o73.u) kt2.e.f106515s0.getValue();
                                    Object[] objArr11111111114 = {new Integer(i28)};
                                    sVar.f133944e = strConcat2;
                                    sVar.f133946g = 9;
                                    objB = o73.v.b(uVar11111111111114, objArr11111111114, sVar);
                                    if (objB != aVar) {
                                        str7 = strConcat2;
                                        str8 = (String) objB;
                                        strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                    }
                                } else {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar11111111111115 = (o73.u) kt2.e.f106524v0.getValue();
                                    Object[] objArr11111111115 = {new Integer(i28)};
                                    sVar.f133944e = strConcat2;
                                    sVar.f133946g = 10;
                                    objB = o73.v.b(uVar11111111111115, objArr11111111115, sVar);
                                    if (objB != aVar) {
                                        str7 = strConcat2;
                                        str8 = (String) objB;
                                        strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                    }
                                }
                            }
                            return d53.w.i0(strConcat2).toString();
                        }
                    }
                } else if (!z14) {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    o73.u uVar122 = (o73.u) kt2.e.f106461a0.getValue();
                    sVar.f133944e = str2;
                    sVar.f133940a = z14;
                    sVar.f133941b = i14;
                    sVar.f133942c = i16;
                    sVar.f133943d = i17;
                    sVar.f133946g = 5;
                    objB = o73.v.a(uVar122, sVar);
                    if (objB != aVar) {
                        int i319 = i14;
                        z15 = z14;
                        i25 = i319;
                        str4 = i17 + StringUtils.SPACE + objB;
                        i26 = i16;
                        i27 = i25;
                        z14 = z15;
                        str3 = str2;
                        int i3110 = i27;
                        i16 = i26;
                        i24 = i3110;
                        strConcat = (str3 + str4).concat(StringUtils.SPACE);
                        if (i24 <= 0) {
                            i28 = i16;
                            strConcat2 = strConcat;
                            if (i28 > 0) {
                                if (z14) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar11111111111116 = (o73.u) kt2.e.D0.getValue();
                                    sVar.f133944e = strConcat2;
                                    sVar.f133941b = i28;
                                    sVar.f133946g = 11;
                                    objB = o73.v.a(uVar11111111111116, sVar);
                                    break;
                                } else if (i28 > 1) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar11111111111117 = (o73.u) kt2.e.f106515s0.getValue();
                                    Object[] objArr11111111116 = {new Integer(i28)};
                                    sVar.f133944e = strConcat2;
                                    sVar.f133946g = 9;
                                    objB = o73.v.b(uVar11111111111117, objArr11111111116, sVar);
                                    if (objB != aVar) {
                                        str7 = strConcat2;
                                        str8 = (String) objB;
                                        strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                    }
                                } else {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar11111111111118 = (o73.u) kt2.e.f106524v0.getValue();
                                    Object[] objArr11111111117 = {new Integer(i28)};
                                    sVar.f133944e = strConcat2;
                                    sVar.f133946g = 10;
                                    objB = o73.v.b(uVar11111111111118, objArr11111111117, sVar);
                                    if (objB != aVar) {
                                        str7 = strConcat2;
                                        str8 = (String) objB;
                                        strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                    }
                                }
                            }
                            return d53.w.i0(strConcat2).toString();
                        }
                        if (!z14) {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar11111111111119 = (o73.u) kt2.e.f106488j0.getValue();
                            sVar.f133944e = strConcat;
                            sVar.f133940a = z14;
                            sVar.f133941b = i16;
                            sVar.f133942c = i24;
                            sVar.f133946g = 8;
                            objB = o73.v.a(uVar11111111111119, sVar);
                            break;
                        } else if (i24 > 1) {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar11210 = (o73.u) kt2.e.f106512r0.getValue();
                            Object[] objArr11111111118 = {new Integer(i24)};
                            sVar.f133944e = strConcat;
                            sVar.f133940a = z14;
                            sVar.f133941b = i16;
                            sVar.f133946g = 6;
                            objB = o73.v.b(uVar11210, objArr11111111118, sVar);
                            if (objB != aVar) {
                                i28 = i16;
                                z16 = z14;
                                str5 = strConcat;
                                str6 = (String) objB;
                                z14 = z16;
                                strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                if (i28 > 0) {
                                    if (z14) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar111111111111110 = (o73.u) kt2.e.D0.getValue();
                                        sVar.f133944e = strConcat2;
                                        sVar.f133941b = i28;
                                        sVar.f133946g = 11;
                                        objB = o73.v.a(uVar111111111111110, sVar);
                                        break;
                                    } else if (i28 > 1) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar111111111111111 = (o73.u) kt2.e.f106515s0.getValue();
                                        Object[] objArr11111111119 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 9;
                                        objB = o73.v.b(uVar111111111111111, objArr11111111119, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    } else {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar111111111111112 = (o73.u) kt2.e.f106524v0.getValue();
                                        Object[] objArr111111111110 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 10;
                                        objB = o73.v.b(uVar111111111111112, objArr111111111110, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    }
                                }
                                return d53.w.i0(strConcat2).toString();
                            }
                        } else {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar219 = (o73.u) kt2.e.f106521u0.getValue();
                            Object[] objArr111111111111 = {new Integer(i24)};
                            sVar.f133944e = strConcat;
                            sVar.f133940a = z14;
                            sVar.f133941b = i16;
                            sVar.f133946g = 7;
                            objB = o73.v.b(uVar219, objArr111111111111, sVar);
                            if (objB != aVar) {
                                i28 = i16;
                                z16 = z14;
                                str5 = strConcat;
                                str6 = (String) objB;
                                z14 = z16;
                                strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                if (i28 > 0) {
                                    if (z14) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar111111111111113 = (o73.u) kt2.e.D0.getValue();
                                        sVar.f133944e = strConcat2;
                                        sVar.f133941b = i28;
                                        sVar.f133946g = 11;
                                        objB = o73.v.a(uVar111111111111113, sVar);
                                        break;
                                    } else if (i28 > 1) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar111111111111114 = (o73.u) kt2.e.f106515s0.getValue();
                                        Object[] objArr111111111112 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 9;
                                        objB = o73.v.b(uVar111111111111114, objArr111111111112, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    } else {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar111111111111115 = (o73.u) kt2.e.f106524v0.getValue();
                                        Object[] objArr111111111113 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 10;
                                        objB = o73.v.b(uVar111111111111115, objArr111111111113, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    }
                                }
                                return d53.w.i0(strConcat2).toString();
                            }
                        }
                    }
                } else if (i17 > 1) {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    o73.u uVar2110 = (o73.u) kt2.e.f106509q0.getValue();
                    Object[] objArr122 = {new Integer(i17)};
                    sVar.f133944e = str2;
                    sVar.f133940a = z14;
                    sVar.f133941b = i14;
                    sVar.f133942c = i16;
                    sVar.f133946g = 3;
                    objB = o73.v.b(uVar2110, objArr122, sVar);
                    if (objB != aVar) {
                        i26 = i16;
                        i27 = i14;
                        str3 = str2;
                        str4 = (String) objB;
                        int i3111 = i27;
                        i16 = i26;
                        i24 = i3111;
                        strConcat = (str3 + str4).concat(StringUtils.SPACE);
                        if (i24 <= 0) {
                            i28 = i16;
                            strConcat2 = strConcat;
                            if (i28 > 0) {
                                if (z14) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar111111111111116 = (o73.u) kt2.e.D0.getValue();
                                    sVar.f133944e = strConcat2;
                                    sVar.f133941b = i28;
                                    sVar.f133946g = 11;
                                    objB = o73.v.a(uVar111111111111116, sVar);
                                    break;
                                } else if (i28 > 1) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar111111111111117 = (o73.u) kt2.e.f106515s0.getValue();
                                    Object[] objArr111111111114 = {new Integer(i28)};
                                    sVar.f133944e = strConcat2;
                                    sVar.f133946g = 9;
                                    objB = o73.v.b(uVar111111111111117, objArr111111111114, sVar);
                                    if (objB != aVar) {
                                        str7 = strConcat2;
                                        str8 = (String) objB;
                                        strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                    }
                                } else {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar111111111111118 = (o73.u) kt2.e.f106524v0.getValue();
                                    Object[] objArr111111111115 = {new Integer(i28)};
                                    sVar.f133944e = strConcat2;
                                    sVar.f133946g = 10;
                                    objB = o73.v.b(uVar111111111111118, objArr111111111115, sVar);
                                    if (objB != aVar) {
                                        str7 = strConcat2;
                                        str8 = (String) objB;
                                        strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                    }
                                }
                            }
                            return d53.w.i0(strConcat2).toString();
                        }
                        if (!z14) {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar111111111111119 = (o73.u) kt2.e.f106488j0.getValue();
                            sVar.f133944e = strConcat;
                            sVar.f133940a = z14;
                            sVar.f133941b = i16;
                            sVar.f133942c = i24;
                            sVar.f133946g = 8;
                            objB = o73.v.a(uVar111111111111119, sVar);
                            break;
                        } else if (i24 > 1) {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar11211 = (o73.u) kt2.e.f106512r0.getValue();
                            Object[] objArr111111111116 = {new Integer(i24)};
                            sVar.f133944e = strConcat;
                            sVar.f133940a = z14;
                            sVar.f133941b = i16;
                            sVar.f133946g = 6;
                            objB = o73.v.b(uVar11211, objArr111111111116, sVar);
                            if (objB != aVar) {
                                i28 = i16;
                                z16 = z14;
                                str5 = strConcat;
                                str6 = (String) objB;
                                z14 = z16;
                                strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                if (i28 > 0) {
                                    if (z14) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar1111111111111110 = (o73.u) kt2.e.D0.getValue();
                                        sVar.f133944e = strConcat2;
                                        sVar.f133941b = i28;
                                        sVar.f133946g = 11;
                                        objB = o73.v.a(uVar1111111111111110, sVar);
                                        break;
                                    } else if (i28 > 1) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar1111111111111111 = (o73.u) kt2.e.f106515s0.getValue();
                                        Object[] objArr111111111117 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 9;
                                        objB = o73.v.b(uVar1111111111111111, objArr111111111117, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    } else {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar1111111111111112 = (o73.u) kt2.e.f106524v0.getValue();
                                        Object[] objArr111111111118 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 10;
                                        objB = o73.v.b(uVar1111111111111112, objArr111111111118, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    }
                                }
                                return d53.w.i0(strConcat2).toString();
                            }
                        } else {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar2111 = (o73.u) kt2.e.f106521u0.getValue();
                            Object[] objArr111111111119 = {new Integer(i24)};
                            sVar.f133944e = strConcat;
                            sVar.f133940a = z14;
                            sVar.f133941b = i16;
                            sVar.f133946g = 7;
                            objB = o73.v.b(uVar2111, objArr111111111119, sVar);
                            if (objB != aVar) {
                                i28 = i16;
                                z16 = z14;
                                str5 = strConcat;
                                str6 = (String) objB;
                                z14 = z16;
                                strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                if (i28 > 0) {
                                    if (z14) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar1111111111111113 = (o73.u) kt2.e.D0.getValue();
                                        sVar.f133944e = strConcat2;
                                        sVar.f133941b = i28;
                                        sVar.f133946g = 11;
                                        objB = o73.v.a(uVar1111111111111113, sVar);
                                        break;
                                    } else if (i28 > 1) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar1111111111111114 = (o73.u) kt2.e.f106515s0.getValue();
                                        Object[] objArr1111111111110 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 9;
                                        objB = o73.v.b(uVar1111111111111114, objArr1111111111110, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    } else {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar1111111111111115 = (o73.u) kt2.e.f106524v0.getValue();
                                        Object[] objArr1111111111111 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 10;
                                        objB = o73.v.b(uVar1111111111111115, objArr1111111111111, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    }
                                }
                                return d53.w.i0(strConcat2).toString();
                            }
                        }
                    }
                } else {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    o73.u uVar2112 = (o73.u) kt2.e.f106518t0.getValue();
                    Object[] objArr25 = {new Integer(i17)};
                    sVar.f133944e = str2;
                    sVar.f133940a = z14;
                    sVar.f133941b = i14;
                    sVar.f133942c = i16;
                    sVar.f133946g = 4;
                    objB = o73.v.b(uVar2112, objArr25, sVar);
                    if (objB != aVar) {
                        i26 = i16;
                        i27 = i14;
                        str3 = str2;
                        str4 = (String) objB;
                        int i3112 = i27;
                        i16 = i26;
                        i24 = i3112;
                        strConcat = (str3 + str4).concat(StringUtils.SPACE);
                        if (i24 <= 0) {
                            i28 = i16;
                            strConcat2 = strConcat;
                            if (i28 > 0) {
                                if (z14) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar1111111111111116 = (o73.u) kt2.e.D0.getValue();
                                    sVar.f133944e = strConcat2;
                                    sVar.f133941b = i28;
                                    sVar.f133946g = 11;
                                    objB = o73.v.a(uVar1111111111111116, sVar);
                                    break;
                                } else if (i28 > 1) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar1111111111111117 = (o73.u) kt2.e.f106515s0.getValue();
                                    Object[] objArr1111111111112 = {new Integer(i28)};
                                    sVar.f133944e = strConcat2;
                                    sVar.f133946g = 9;
                                    objB = o73.v.b(uVar1111111111111117, objArr1111111111112, sVar);
                                    if (objB != aVar) {
                                        str7 = strConcat2;
                                        str8 = (String) objB;
                                        strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                    }
                                } else {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar1111111111111118 = (o73.u) kt2.e.f106524v0.getValue();
                                    Object[] objArr1111111111113 = {new Integer(i28)};
                                    sVar.f133944e = strConcat2;
                                    sVar.f133946g = 10;
                                    objB = o73.v.b(uVar1111111111111118, objArr1111111111113, sVar);
                                    if (objB != aVar) {
                                        str7 = strConcat2;
                                        str8 = (String) objB;
                                        strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                    }
                                }
                            }
                            return d53.w.i0(strConcat2).toString();
                        }
                        if (!z14) {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar1111111111111119 = (o73.u) kt2.e.f106488j0.getValue();
                            sVar.f133944e = strConcat;
                            sVar.f133940a = z14;
                            sVar.f133941b = i16;
                            sVar.f133942c = i24;
                            sVar.f133946g = 8;
                            objB = o73.v.a(uVar1111111111111119, sVar);
                            break;
                        } else if (i24 > 1) {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar11212 = (o73.u) kt2.e.f106512r0.getValue();
                            Object[] objArr1111111111114 = {new Integer(i24)};
                            sVar.f133944e = strConcat;
                            sVar.f133940a = z14;
                            sVar.f133941b = i16;
                            sVar.f133946g = 6;
                            objB = o73.v.b(uVar11212, objArr1111111111114, sVar);
                            if (objB != aVar) {
                                i28 = i16;
                                z16 = z14;
                                str5 = strConcat;
                                str6 = (String) objB;
                                z14 = z16;
                                strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                if (i28 > 0) {
                                    if (z14) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar11111111111111110 = (o73.u) kt2.e.D0.getValue();
                                        sVar.f133944e = strConcat2;
                                        sVar.f133941b = i28;
                                        sVar.f133946g = 11;
                                        objB = o73.v.a(uVar11111111111111110, sVar);
                                        break;
                                    } else if (i28 > 1) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar11111111111111111 = (o73.u) kt2.e.f106515s0.getValue();
                                        Object[] objArr1111111111115 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 9;
                                        objB = o73.v.b(uVar11111111111111111, objArr1111111111115, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    } else {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar11111111111111112 = (o73.u) kt2.e.f106524v0.getValue();
                                        Object[] objArr1111111111116 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 10;
                                        objB = o73.v.b(uVar11111111111111112, objArr1111111111116, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    }
                                }
                                return d53.w.i0(strConcat2).toString();
                            }
                        } else {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar2113 = (o73.u) kt2.e.f106521u0.getValue();
                            Object[] objArr1111111111117 = {new Integer(i24)};
                            sVar.f133944e = strConcat;
                            sVar.f133940a = z14;
                            sVar.f133941b = i16;
                            sVar.f133946g = 7;
                            objB = o73.v.b(uVar2113, objArr1111111111117, sVar);
                            if (objB != aVar) {
                                i28 = i16;
                                z16 = z14;
                                str5 = strConcat;
                                str6 = (String) objB;
                                z14 = z16;
                                strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                if (i28 > 0) {
                                    if (z14) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar11111111111111113 = (o73.u) kt2.e.D0.getValue();
                                        sVar.f133944e = strConcat2;
                                        sVar.f133941b = i28;
                                        sVar.f133946g = 11;
                                        objB = o73.v.a(uVar11111111111111113, sVar);
                                        break;
                                    } else if (i28 > 1) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar11111111111111114 = (o73.u) kt2.e.f106515s0.getValue();
                                        Object[] objArr1111111111118 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 9;
                                        objB = o73.v.b(uVar11111111111111114, objArr1111111111118, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    } else {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar11111111111111115 = (o73.u) kt2.e.f106524v0.getValue();
                                        Object[] objArr1111111111119 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 10;
                                        objB = o73.v.b(uVar11111111111111115, objArr1111111111119, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    }
                                }
                                return d53.w.i0(strConcat2).toString();
                            }
                        }
                    }
                }
                return aVar;
            case 2:
                i15 = sVar.f133943d;
                i19 = sVar.f133942c;
                int i48 = sVar.f133941b;
                boolean z18 = sVar.f133940a;
                o13.r.b(objB);
                i18 = i48;
                z14 = z18;
                str = (String) objB;
                int i49 = i19;
                i16 = i15;
                i17 = i18;
                i14 = i49;
                str2 = str;
                if (i17 <= 0) {
                    i24 = i14;
                    strConcat = str2;
                    if (i24 <= 0) {
                        i28 = i16;
                        strConcat2 = strConcat;
                        if (i28 > 0) {
                            if (z14) {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar11111111111111116 = (o73.u) kt2.e.D0.getValue();
                                sVar.f133944e = strConcat2;
                                sVar.f133941b = i28;
                                sVar.f133946g = 11;
                                objB = o73.v.a(uVar11111111111111116, sVar);
                                break;
                            } else if (i28 > 1) {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar11111111111111117 = (o73.u) kt2.e.f106515s0.getValue();
                                Object[] objArr11111111111110 = {new Integer(i28)};
                                sVar.f133944e = strConcat2;
                                sVar.f133946g = 9;
                                objB = o73.v.b(uVar11111111111111117, objArr11111111111110, sVar);
                                if (objB != aVar) {
                                    str7 = strConcat2;
                                    str8 = (String) objB;
                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                }
                            } else {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar11111111111111118 = (o73.u) kt2.e.f106524v0.getValue();
                                Object[] objArr11111111111111 = {new Integer(i28)};
                                sVar.f133944e = strConcat2;
                                sVar.f133946g = 10;
                                objB = o73.v.b(uVar11111111111111118, objArr11111111111111, sVar);
                                if (objB != aVar) {
                                    str7 = strConcat2;
                                    str8 = (String) objB;
                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                }
                            }
                        }
                        return d53.w.i0(strConcat2).toString();
                    }
                    if (!z14) {
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        o73.u uVar11111111111111119 = (o73.u) kt2.e.f106488j0.getValue();
                        sVar.f133944e = strConcat;
                        sVar.f133940a = z14;
                        sVar.f133941b = i16;
                        sVar.f133942c = i24;
                        sVar.f133946g = 8;
                        objB = o73.v.a(uVar11111111111111119, sVar);
                        break;
                    } else if (i24 > 1) {
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        o73.u uVar11213 = (o73.u) kt2.e.f106512r0.getValue();
                        Object[] objArr11111111111112 = {new Integer(i24)};
                        sVar.f133944e = strConcat;
                        sVar.f133940a = z14;
                        sVar.f133941b = i16;
                        sVar.f133946g = 6;
                        objB = o73.v.b(uVar11213, objArr11111111111112, sVar);
                        if (objB != aVar) {
                            i28 = i16;
                            z16 = z14;
                            str5 = strConcat;
                            str6 = (String) objB;
                            z14 = z16;
                            strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                            if (i28 > 0) {
                                if (z14) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar111111111111111110 = (o73.u) kt2.e.D0.getValue();
                                    sVar.f133944e = strConcat2;
                                    sVar.f133941b = i28;
                                    sVar.f133946g = 11;
                                    objB = o73.v.a(uVar111111111111111110, sVar);
                                    break;
                                } else if (i28 > 1) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar111111111111111111 = (o73.u) kt2.e.f106515s0.getValue();
                                    Object[] objArr11111111111113 = {new Integer(i28)};
                                    sVar.f133944e = strConcat2;
                                    sVar.f133946g = 9;
                                    objB = o73.v.b(uVar111111111111111111, objArr11111111111113, sVar);
                                    if (objB != aVar) {
                                        str7 = strConcat2;
                                        str8 = (String) objB;
                                        strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                    }
                                } else {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar111111111111111112 = (o73.u) kt2.e.f106524v0.getValue();
                                    Object[] objArr11111111111114 = {new Integer(i28)};
                                    sVar.f133944e = strConcat2;
                                    sVar.f133946g = 10;
                                    objB = o73.v.b(uVar111111111111111112, objArr11111111111114, sVar);
                                    if (objB != aVar) {
                                        str7 = strConcat2;
                                        str8 = (String) objB;
                                        strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                    }
                                }
                            }
                            return d53.w.i0(strConcat2).toString();
                        }
                    } else {
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        o73.u uVar2114 = (o73.u) kt2.e.f106521u0.getValue();
                        Object[] objArr11111111111115 = {new Integer(i24)};
                        sVar.f133944e = strConcat;
                        sVar.f133940a = z14;
                        sVar.f133941b = i16;
                        sVar.f133946g = 7;
                        objB = o73.v.b(uVar2114, objArr11111111111115, sVar);
                        if (objB != aVar) {
                            i28 = i16;
                            z16 = z14;
                            str5 = strConcat;
                            str6 = (String) objB;
                            z14 = z16;
                            strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                            if (i28 > 0) {
                                if (z14) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar111111111111111113 = (o73.u) kt2.e.D0.getValue();
                                    sVar.f133944e = strConcat2;
                                    sVar.f133941b = i28;
                                    sVar.f133946g = 11;
                                    objB = o73.v.a(uVar111111111111111113, sVar);
                                    break;
                                } else if (i28 > 1) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar111111111111111114 = (o73.u) kt2.e.f106515s0.getValue();
                                    Object[] objArr11111111111116 = {new Integer(i28)};
                                    sVar.f133944e = strConcat2;
                                    sVar.f133946g = 9;
                                    objB = o73.v.b(uVar111111111111111114, objArr11111111111116, sVar);
                                    if (objB != aVar) {
                                        str7 = strConcat2;
                                        str8 = (String) objB;
                                        strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                    }
                                } else {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar111111111111111115 = (o73.u) kt2.e.f106524v0.getValue();
                                    Object[] objArr11111111111117 = {new Integer(i28)};
                                    sVar.f133944e = strConcat2;
                                    sVar.f133946g = 10;
                                    objB = o73.v.b(uVar111111111111111115, objArr11111111111117, sVar);
                                    if (objB != aVar) {
                                        str7 = strConcat2;
                                        str8 = (String) objB;
                                        strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                    }
                                }
                            }
                            return d53.w.i0(strConcat2).toString();
                        }
                    }
                } else if (!z14) {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    o73.u uVar123 = (o73.u) kt2.e.f106461a0.getValue();
                    sVar.f133944e = str2;
                    sVar.f133940a = z14;
                    sVar.f133941b = i14;
                    sVar.f133942c = i16;
                    sVar.f133943d = i17;
                    sVar.f133946g = 5;
                    objB = o73.v.a(uVar123, sVar);
                    if (objB != aVar) {
                        int i3113 = i14;
                        z15 = z14;
                        i25 = i3113;
                        str4 = i17 + StringUtils.SPACE + objB;
                        i26 = i16;
                        i27 = i25;
                        z14 = z15;
                        str3 = str2;
                        int i3114 = i27;
                        i16 = i26;
                        i24 = i3114;
                        strConcat = (str3 + str4).concat(StringUtils.SPACE);
                        if (i24 <= 0) {
                            i28 = i16;
                            strConcat2 = strConcat;
                            if (i28 > 0) {
                                if (z14) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar111111111111111116 = (o73.u) kt2.e.D0.getValue();
                                    sVar.f133944e = strConcat2;
                                    sVar.f133941b = i28;
                                    sVar.f133946g = 11;
                                    objB = o73.v.a(uVar111111111111111116, sVar);
                                    break;
                                } else if (i28 > 1) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar111111111111111117 = (o73.u) kt2.e.f106515s0.getValue();
                                    Object[] objArr11111111111118 = {new Integer(i28)};
                                    sVar.f133944e = strConcat2;
                                    sVar.f133946g = 9;
                                    objB = o73.v.b(uVar111111111111111117, objArr11111111111118, sVar);
                                    if (objB != aVar) {
                                        str7 = strConcat2;
                                        str8 = (String) objB;
                                        strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                    }
                                } else {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar111111111111111118 = (o73.u) kt2.e.f106524v0.getValue();
                                    Object[] objArr11111111111119 = {new Integer(i28)};
                                    sVar.f133944e = strConcat2;
                                    sVar.f133946g = 10;
                                    objB = o73.v.b(uVar111111111111111118, objArr11111111111119, sVar);
                                    if (objB != aVar) {
                                        str7 = strConcat2;
                                        str8 = (String) objB;
                                        strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                    }
                                }
                            }
                            return d53.w.i0(strConcat2).toString();
                        }
                        if (!z14) {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar111111111111111119 = (o73.u) kt2.e.f106488j0.getValue();
                            sVar.f133944e = strConcat;
                            sVar.f133940a = z14;
                            sVar.f133941b = i16;
                            sVar.f133942c = i24;
                            sVar.f133946g = 8;
                            objB = o73.v.a(uVar111111111111111119, sVar);
                            break;
                        } else if (i24 > 1) {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar11214 = (o73.u) kt2.e.f106512r0.getValue();
                            Object[] objArr111111111111110 = {new Integer(i24)};
                            sVar.f133944e = strConcat;
                            sVar.f133940a = z14;
                            sVar.f133941b = i16;
                            sVar.f133946g = 6;
                            objB = o73.v.b(uVar11214, objArr111111111111110, sVar);
                            if (objB != aVar) {
                                i28 = i16;
                                z16 = z14;
                                str5 = strConcat;
                                str6 = (String) objB;
                                z14 = z16;
                                strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                if (i28 > 0) {
                                    if (z14) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar1111111111111111110 = (o73.u) kt2.e.D0.getValue();
                                        sVar.f133944e = strConcat2;
                                        sVar.f133941b = i28;
                                        sVar.f133946g = 11;
                                        objB = o73.v.a(uVar1111111111111111110, sVar);
                                        break;
                                    } else if (i28 > 1) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar1111111111111111111 = (o73.u) kt2.e.f106515s0.getValue();
                                        Object[] objArr111111111111111 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 9;
                                        objB = o73.v.b(uVar1111111111111111111, objArr111111111111111, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    } else {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar1111111111111111112 = (o73.u) kt2.e.f106524v0.getValue();
                                        Object[] objArr111111111111112 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 10;
                                        objB = o73.v.b(uVar1111111111111111112, objArr111111111111112, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    }
                                }
                                return d53.w.i0(strConcat2).toString();
                            }
                        } else {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar2115 = (o73.u) kt2.e.f106521u0.getValue();
                            Object[] objArr111111111111113 = {new Integer(i24)};
                            sVar.f133944e = strConcat;
                            sVar.f133940a = z14;
                            sVar.f133941b = i16;
                            sVar.f133946g = 7;
                            objB = o73.v.b(uVar2115, objArr111111111111113, sVar);
                            if (objB != aVar) {
                                i28 = i16;
                                z16 = z14;
                                str5 = strConcat;
                                str6 = (String) objB;
                                z14 = z16;
                                strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                if (i28 > 0) {
                                    if (z14) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar1111111111111111113 = (o73.u) kt2.e.D0.getValue();
                                        sVar.f133944e = strConcat2;
                                        sVar.f133941b = i28;
                                        sVar.f133946g = 11;
                                        objB = o73.v.a(uVar1111111111111111113, sVar);
                                        break;
                                    } else if (i28 > 1) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar1111111111111111114 = (o73.u) kt2.e.f106515s0.getValue();
                                        Object[] objArr111111111111114 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 9;
                                        objB = o73.v.b(uVar1111111111111111114, objArr111111111111114, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    } else {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar1111111111111111115 = (o73.u) kt2.e.f106524v0.getValue();
                                        Object[] objArr111111111111115 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 10;
                                        objB = o73.v.b(uVar1111111111111111115, objArr111111111111115, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    }
                                }
                                return d53.w.i0(strConcat2).toString();
                            }
                        }
                    }
                } else if (i17 > 1) {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    o73.u uVar2116 = (o73.u) kt2.e.f106509q0.getValue();
                    Object[] objArr123 = {new Integer(i17)};
                    sVar.f133944e = str2;
                    sVar.f133940a = z14;
                    sVar.f133941b = i14;
                    sVar.f133942c = i16;
                    sVar.f133946g = 3;
                    objB = o73.v.b(uVar2116, objArr123, sVar);
                    if (objB != aVar) {
                        i26 = i16;
                        i27 = i14;
                        str3 = str2;
                        str4 = (String) objB;
                        int i3115 = i27;
                        i16 = i26;
                        i24 = i3115;
                        strConcat = (str3 + str4).concat(StringUtils.SPACE);
                        if (i24 <= 0) {
                            i28 = i16;
                            strConcat2 = strConcat;
                            if (i28 > 0) {
                                if (z14) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar1111111111111111116 = (o73.u) kt2.e.D0.getValue();
                                    sVar.f133944e = strConcat2;
                                    sVar.f133941b = i28;
                                    sVar.f133946g = 11;
                                    objB = o73.v.a(uVar1111111111111111116, sVar);
                                    break;
                                } else if (i28 > 1) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar1111111111111111117 = (o73.u) kt2.e.f106515s0.getValue();
                                    Object[] objArr111111111111116 = {new Integer(i28)};
                                    sVar.f133944e = strConcat2;
                                    sVar.f133946g = 9;
                                    objB = o73.v.b(uVar1111111111111111117, objArr111111111111116, sVar);
                                    if (objB != aVar) {
                                        str7 = strConcat2;
                                        str8 = (String) objB;
                                        strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                    }
                                } else {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar1111111111111111118 = (o73.u) kt2.e.f106524v0.getValue();
                                    Object[] objArr111111111111117 = {new Integer(i28)};
                                    sVar.f133944e = strConcat2;
                                    sVar.f133946g = 10;
                                    objB = o73.v.b(uVar1111111111111111118, objArr111111111111117, sVar);
                                    if (objB != aVar) {
                                        str7 = strConcat2;
                                        str8 = (String) objB;
                                        strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                    }
                                }
                            }
                            return d53.w.i0(strConcat2).toString();
                        }
                        if (!z14) {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar1111111111111111119 = (o73.u) kt2.e.f106488j0.getValue();
                            sVar.f133944e = strConcat;
                            sVar.f133940a = z14;
                            sVar.f133941b = i16;
                            sVar.f133942c = i24;
                            sVar.f133946g = 8;
                            objB = o73.v.a(uVar1111111111111111119, sVar);
                            break;
                        } else if (i24 > 1) {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar11215 = (o73.u) kt2.e.f106512r0.getValue();
                            Object[] objArr111111111111118 = {new Integer(i24)};
                            sVar.f133944e = strConcat;
                            sVar.f133940a = z14;
                            sVar.f133941b = i16;
                            sVar.f133946g = 6;
                            objB = o73.v.b(uVar11215, objArr111111111111118, sVar);
                            if (objB != aVar) {
                                i28 = i16;
                                z16 = z14;
                                str5 = strConcat;
                                str6 = (String) objB;
                                z14 = z16;
                                strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                if (i28 > 0) {
                                    if (z14) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar11111111111111111110 = (o73.u) kt2.e.D0.getValue();
                                        sVar.f133944e = strConcat2;
                                        sVar.f133941b = i28;
                                        sVar.f133946g = 11;
                                        objB = o73.v.a(uVar11111111111111111110, sVar);
                                        break;
                                    } else if (i28 > 1) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar11111111111111111111 = (o73.u) kt2.e.f106515s0.getValue();
                                        Object[] objArr111111111111119 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 9;
                                        objB = o73.v.b(uVar11111111111111111111, objArr111111111111119, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    } else {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar11111111111111111112 = (o73.u) kt2.e.f106524v0.getValue();
                                        Object[] objArr1111111111111110 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 10;
                                        objB = o73.v.b(uVar11111111111111111112, objArr1111111111111110, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    }
                                }
                                return d53.w.i0(strConcat2).toString();
                            }
                        } else {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar2117 = (o73.u) kt2.e.f106521u0.getValue();
                            Object[] objArr1111111111111111 = {new Integer(i24)};
                            sVar.f133944e = strConcat;
                            sVar.f133940a = z14;
                            sVar.f133941b = i16;
                            sVar.f133946g = 7;
                            objB = o73.v.b(uVar2117, objArr1111111111111111, sVar);
                            if (objB != aVar) {
                                i28 = i16;
                                z16 = z14;
                                str5 = strConcat;
                                str6 = (String) objB;
                                z14 = z16;
                                strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                if (i28 > 0) {
                                    if (z14) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar11111111111111111113 = (o73.u) kt2.e.D0.getValue();
                                        sVar.f133944e = strConcat2;
                                        sVar.f133941b = i28;
                                        sVar.f133946g = 11;
                                        objB = o73.v.a(uVar11111111111111111113, sVar);
                                        break;
                                    } else if (i28 > 1) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar11111111111111111114 = (o73.u) kt2.e.f106515s0.getValue();
                                        Object[] objArr1111111111111112 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 9;
                                        objB = o73.v.b(uVar11111111111111111114, objArr1111111111111112, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    } else {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar11111111111111111115 = (o73.u) kt2.e.f106524v0.getValue();
                                        Object[] objArr1111111111111113 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 10;
                                        objB = o73.v.b(uVar11111111111111111115, objArr1111111111111113, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    }
                                }
                                return d53.w.i0(strConcat2).toString();
                            }
                        }
                    }
                } else {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    o73.u uVar2118 = (o73.u) kt2.e.f106518t0.getValue();
                    Object[] objArr26 = {new Integer(i17)};
                    sVar.f133944e = str2;
                    sVar.f133940a = z14;
                    sVar.f133941b = i14;
                    sVar.f133942c = i16;
                    sVar.f133946g = 4;
                    objB = o73.v.b(uVar2118, objArr26, sVar);
                    if (objB != aVar) {
                        i26 = i16;
                        i27 = i14;
                        str3 = str2;
                        str4 = (String) objB;
                        int i3116 = i27;
                        i16 = i26;
                        i24 = i3116;
                        strConcat = (str3 + str4).concat(StringUtils.SPACE);
                        if (i24 <= 0) {
                            i28 = i16;
                            strConcat2 = strConcat;
                            if (i28 > 0) {
                                if (z14) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar11111111111111111116 = (o73.u) kt2.e.D0.getValue();
                                    sVar.f133944e = strConcat2;
                                    sVar.f133941b = i28;
                                    sVar.f133946g = 11;
                                    objB = o73.v.a(uVar11111111111111111116, sVar);
                                    break;
                                } else if (i28 > 1) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar11111111111111111117 = (o73.u) kt2.e.f106515s0.getValue();
                                    Object[] objArr1111111111111114 = {new Integer(i28)};
                                    sVar.f133944e = strConcat2;
                                    sVar.f133946g = 9;
                                    objB = o73.v.b(uVar11111111111111111117, objArr1111111111111114, sVar);
                                    if (objB != aVar) {
                                        str7 = strConcat2;
                                        str8 = (String) objB;
                                        strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                    }
                                } else {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    o73.u uVar11111111111111111118 = (o73.u) kt2.e.f106524v0.getValue();
                                    Object[] objArr1111111111111115 = {new Integer(i28)};
                                    sVar.f133944e = strConcat2;
                                    sVar.f133946g = 10;
                                    objB = o73.v.b(uVar11111111111111111118, objArr1111111111111115, sVar);
                                    if (objB != aVar) {
                                        str7 = strConcat2;
                                        str8 = (String) objB;
                                        strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                    }
                                }
                            }
                            return d53.w.i0(strConcat2).toString();
                        }
                        if (!z14) {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar11111111111111111119 = (o73.u) kt2.e.f106488j0.getValue();
                            sVar.f133944e = strConcat;
                            sVar.f133940a = z14;
                            sVar.f133941b = i16;
                            sVar.f133942c = i24;
                            sVar.f133946g = 8;
                            objB = o73.v.a(uVar11111111111111111119, sVar);
                            break;
                        } else if (i24 > 1) {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar11216 = (o73.u) kt2.e.f106512r0.getValue();
                            Object[] objArr1111111111111116 = {new Integer(i24)};
                            sVar.f133944e = strConcat;
                            sVar.f133940a = z14;
                            sVar.f133941b = i16;
                            sVar.f133946g = 6;
                            objB = o73.v.b(uVar11216, objArr1111111111111116, sVar);
                            if (objB != aVar) {
                                i28 = i16;
                                z16 = z14;
                                str5 = strConcat;
                                str6 = (String) objB;
                                z14 = z16;
                                strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                if (i28 > 0) {
                                    if (z14) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar111111111111111111110 = (o73.u) kt2.e.D0.getValue();
                                        sVar.f133944e = strConcat2;
                                        sVar.f133941b = i28;
                                        sVar.f133946g = 11;
                                        objB = o73.v.a(uVar111111111111111111110, sVar);
                                        break;
                                    } else if (i28 > 1) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar111111111111111111111 = (o73.u) kt2.e.f106515s0.getValue();
                                        Object[] objArr1111111111111117 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 9;
                                        objB = o73.v.b(uVar111111111111111111111, objArr1111111111111117, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    } else {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar111111111111111111112 = (o73.u) kt2.e.f106524v0.getValue();
                                        Object[] objArr1111111111111118 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 10;
                                        objB = o73.v.b(uVar111111111111111111112, objArr1111111111111118, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    }
                                }
                                return d53.w.i0(strConcat2).toString();
                            }
                        } else {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar2119 = (o73.u) kt2.e.f106521u0.getValue();
                            Object[] objArr1111111111111119 = {new Integer(i24)};
                            sVar.f133944e = strConcat;
                            sVar.f133940a = z14;
                            sVar.f133941b = i16;
                            sVar.f133946g = 7;
                            objB = o73.v.b(uVar2119, objArr1111111111111119, sVar);
                            if (objB != aVar) {
                                i28 = i16;
                                z16 = z14;
                                str5 = strConcat;
                                str6 = (String) objB;
                                z14 = z16;
                                strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                                if (i28 > 0) {
                                    if (z14) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar111111111111111111113 = (o73.u) kt2.e.D0.getValue();
                                        sVar.f133944e = strConcat2;
                                        sVar.f133941b = i28;
                                        sVar.f133946g = 11;
                                        objB = o73.v.a(uVar111111111111111111113, sVar);
                                        break;
                                    } else if (i28 > 1) {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar111111111111111111114 = (o73.u) kt2.e.f106515s0.getValue();
                                        Object[] objArr11111111111111110 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 9;
                                        objB = o73.v.b(uVar111111111111111111114, objArr11111111111111110, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    } else {
                                        kt2.f.f106534a.getClass();
                                        kt2.e.f106460a.getClass();
                                        o73.u uVar111111111111111111115 = (o73.u) kt2.e.f106524v0.getValue();
                                        Object[] objArr11111111111111111 = {new Integer(i28)};
                                        sVar.f133944e = strConcat2;
                                        sVar.f133946g = 10;
                                        objB = o73.v.b(uVar111111111111111111115, objArr11111111111111111, sVar);
                                        if (objB != aVar) {
                                            str7 = strConcat2;
                                            str8 = (String) objB;
                                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                        }
                                    }
                                }
                                return d53.w.i0(strConcat2).toString();
                            }
                        }
                    }
                }
                return aVar;
            case 3:
                i26 = sVar.f133942c;
                i27 = sVar.f133941b;
                z14 = sVar.f133940a;
                str3 = sVar.f133944e;
                o13.r.b(objB);
                str4 = (String) objB;
                int i3117 = i27;
                i16 = i26;
                i24 = i3117;
                strConcat = (str3 + str4).concat(StringUtils.SPACE);
                if (i24 <= 0) {
                    i28 = i16;
                    strConcat2 = strConcat;
                    if (i28 > 0) {
                        if (z14) {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar111111111111111111116 = (o73.u) kt2.e.D0.getValue();
                            sVar.f133944e = strConcat2;
                            sVar.f133941b = i28;
                            sVar.f133946g = 11;
                            objB = o73.v.a(uVar111111111111111111116, sVar);
                            break;
                        } else if (i28 > 1) {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar111111111111111111117 = (o73.u) kt2.e.f106515s0.getValue();
                            Object[] objArr11111111111111112 = {new Integer(i28)};
                            sVar.f133944e = strConcat2;
                            sVar.f133946g = 9;
                            objB = o73.v.b(uVar111111111111111111117, objArr11111111111111112, sVar);
                            if (objB != aVar) {
                                str7 = strConcat2;
                                str8 = (String) objB;
                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                            }
                        } else {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar111111111111111111118 = (o73.u) kt2.e.f106524v0.getValue();
                            Object[] objArr11111111111111113 = {new Integer(i28)};
                            sVar.f133944e = strConcat2;
                            sVar.f133946g = 10;
                            objB = o73.v.b(uVar111111111111111111118, objArr11111111111111113, sVar);
                            if (objB != aVar) {
                                str7 = strConcat2;
                                str8 = (String) objB;
                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                            }
                        }
                    }
                    return d53.w.i0(strConcat2).toString();
                }
                if (!z14) {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    o73.u uVar111111111111111111119 = (o73.u) kt2.e.f106488j0.getValue();
                    sVar.f133944e = strConcat;
                    sVar.f133940a = z14;
                    sVar.f133941b = i16;
                    sVar.f133942c = i24;
                    sVar.f133946g = 8;
                    objB = o73.v.a(uVar111111111111111111119, sVar);
                    break;
                } else if (i24 > 1) {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    o73.u uVar11217 = (o73.u) kt2.e.f106512r0.getValue();
                    Object[] objArr11111111111111114 = {new Integer(i24)};
                    sVar.f133944e = strConcat;
                    sVar.f133940a = z14;
                    sVar.f133941b = i16;
                    sVar.f133946g = 6;
                    objB = o73.v.b(uVar11217, objArr11111111111111114, sVar);
                    if (objB != aVar) {
                        i28 = i16;
                        z16 = z14;
                        str5 = strConcat;
                        str6 = (String) objB;
                        z14 = z16;
                        strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                        if (i28 > 0) {
                            if (z14) {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar1111111111111111111110 = (o73.u) kt2.e.D0.getValue();
                                sVar.f133944e = strConcat2;
                                sVar.f133941b = i28;
                                sVar.f133946g = 11;
                                objB = o73.v.a(uVar1111111111111111111110, sVar);
                                break;
                            } else if (i28 > 1) {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar1111111111111111111111 = (o73.u) kt2.e.f106515s0.getValue();
                                Object[] objArr11111111111111115 = {new Integer(i28)};
                                sVar.f133944e = strConcat2;
                                sVar.f133946g = 9;
                                objB = o73.v.b(uVar1111111111111111111111, objArr11111111111111115, sVar);
                                if (objB != aVar) {
                                    str7 = strConcat2;
                                    str8 = (String) objB;
                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                }
                            } else {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar1111111111111111111112 = (o73.u) kt2.e.f106524v0.getValue();
                                Object[] objArr11111111111111116 = {new Integer(i28)};
                                sVar.f133944e = strConcat2;
                                sVar.f133946g = 10;
                                objB = o73.v.b(uVar1111111111111111111112, objArr11111111111111116, sVar);
                                if (objB != aVar) {
                                    str7 = strConcat2;
                                    str8 = (String) objB;
                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                }
                            }
                        }
                        return d53.w.i0(strConcat2).toString();
                    }
                } else {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    o73.u uVar21110 = (o73.u) kt2.e.f106521u0.getValue();
                    Object[] objArr11111111111111117 = {new Integer(i24)};
                    sVar.f133944e = strConcat;
                    sVar.f133940a = z14;
                    sVar.f133941b = i16;
                    sVar.f133946g = 7;
                    objB = o73.v.b(uVar21110, objArr11111111111111117, sVar);
                    if (objB != aVar) {
                        i28 = i16;
                        z16 = z14;
                        str5 = strConcat;
                        str6 = (String) objB;
                        z14 = z16;
                        strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                        if (i28 > 0) {
                            if (z14) {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar1111111111111111111113 = (o73.u) kt2.e.D0.getValue();
                                sVar.f133944e = strConcat2;
                                sVar.f133941b = i28;
                                sVar.f133946g = 11;
                                objB = o73.v.a(uVar1111111111111111111113, sVar);
                                break;
                            } else if (i28 > 1) {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar1111111111111111111114 = (o73.u) kt2.e.f106515s0.getValue();
                                Object[] objArr11111111111111118 = {new Integer(i28)};
                                sVar.f133944e = strConcat2;
                                sVar.f133946g = 9;
                                objB = o73.v.b(uVar1111111111111111111114, objArr11111111111111118, sVar);
                                if (objB != aVar) {
                                    str7 = strConcat2;
                                    str8 = (String) objB;
                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                }
                            } else {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar1111111111111111111115 = (o73.u) kt2.e.f106524v0.getValue();
                                Object[] objArr11111111111111119 = {new Integer(i28)};
                                sVar.f133944e = strConcat2;
                                sVar.f133946g = 10;
                                objB = o73.v.b(uVar1111111111111111111115, objArr11111111111111119, sVar);
                                if (objB != aVar) {
                                    str7 = strConcat2;
                                    str8 = (String) objB;
                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                }
                            }
                        }
                        return d53.w.i0(strConcat2).toString();
                    }
                }
                return aVar;
            case 4:
                i26 = sVar.f133942c;
                i27 = sVar.f133941b;
                z14 = sVar.f133940a;
                str3 = sVar.f133944e;
                o13.r.b(objB);
                str4 = (String) objB;
                int i3118 = i27;
                i16 = i26;
                i24 = i3118;
                strConcat = (str3 + str4).concat(StringUtils.SPACE);
                if (i24 <= 0) {
                    i28 = i16;
                    strConcat2 = strConcat;
                    if (i28 > 0) {
                        if (z14) {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar1111111111111111111116 = (o73.u) kt2.e.D0.getValue();
                            sVar.f133944e = strConcat2;
                            sVar.f133941b = i28;
                            sVar.f133946g = 11;
                            objB = o73.v.a(uVar1111111111111111111116, sVar);
                            break;
                        } else if (i28 > 1) {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar1111111111111111111117 = (o73.u) kt2.e.f106515s0.getValue();
                            Object[] objArr111111111111111110 = {new Integer(i28)};
                            sVar.f133944e = strConcat2;
                            sVar.f133946g = 9;
                            objB = o73.v.b(uVar1111111111111111111117, objArr111111111111111110, sVar);
                            if (objB != aVar) {
                                str7 = strConcat2;
                                str8 = (String) objB;
                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                            }
                        } else {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar1111111111111111111118 = (o73.u) kt2.e.f106524v0.getValue();
                            Object[] objArr111111111111111111 = {new Integer(i28)};
                            sVar.f133944e = strConcat2;
                            sVar.f133946g = 10;
                            objB = o73.v.b(uVar1111111111111111111118, objArr111111111111111111, sVar);
                            if (objB != aVar) {
                                str7 = strConcat2;
                                str8 = (String) objB;
                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                            }
                        }
                    }
                    return d53.w.i0(strConcat2).toString();
                }
                if (!z14) {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    o73.u uVar1111111111111111111119 = (o73.u) kt2.e.f106488j0.getValue();
                    sVar.f133944e = strConcat;
                    sVar.f133940a = z14;
                    sVar.f133941b = i16;
                    sVar.f133942c = i24;
                    sVar.f133946g = 8;
                    objB = o73.v.a(uVar1111111111111111111119, sVar);
                    break;
                } else if (i24 > 1) {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    o73.u uVar11218 = (o73.u) kt2.e.f106512r0.getValue();
                    Object[] objArr111111111111111112 = {new Integer(i24)};
                    sVar.f133944e = strConcat;
                    sVar.f133940a = z14;
                    sVar.f133941b = i16;
                    sVar.f133946g = 6;
                    objB = o73.v.b(uVar11218, objArr111111111111111112, sVar);
                    if (objB != aVar) {
                        i28 = i16;
                        z16 = z14;
                        str5 = strConcat;
                        str6 = (String) objB;
                        z14 = z16;
                        strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                        if (i28 > 0) {
                            if (z14) {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar11111111111111111111110 = (o73.u) kt2.e.D0.getValue();
                                sVar.f133944e = strConcat2;
                                sVar.f133941b = i28;
                                sVar.f133946g = 11;
                                objB = o73.v.a(uVar11111111111111111111110, sVar);
                                break;
                            } else if (i28 > 1) {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar11111111111111111111111 = (o73.u) kt2.e.f106515s0.getValue();
                                Object[] objArr111111111111111113 = {new Integer(i28)};
                                sVar.f133944e = strConcat2;
                                sVar.f133946g = 9;
                                objB = o73.v.b(uVar11111111111111111111111, objArr111111111111111113, sVar);
                                if (objB != aVar) {
                                    str7 = strConcat2;
                                    str8 = (String) objB;
                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                }
                            } else {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar11111111111111111111112 = (o73.u) kt2.e.f106524v0.getValue();
                                Object[] objArr111111111111111114 = {new Integer(i28)};
                                sVar.f133944e = strConcat2;
                                sVar.f133946g = 10;
                                objB = o73.v.b(uVar11111111111111111111112, objArr111111111111111114, sVar);
                                if (objB != aVar) {
                                    str7 = strConcat2;
                                    str8 = (String) objB;
                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                }
                            }
                        }
                        return d53.w.i0(strConcat2).toString();
                    }
                } else {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    o73.u uVar21111 = (o73.u) kt2.e.f106521u0.getValue();
                    Object[] objArr111111111111111115 = {new Integer(i24)};
                    sVar.f133944e = strConcat;
                    sVar.f133940a = z14;
                    sVar.f133941b = i16;
                    sVar.f133946g = 7;
                    objB = o73.v.b(uVar21111, objArr111111111111111115, sVar);
                    if (objB != aVar) {
                        i28 = i16;
                        z16 = z14;
                        str5 = strConcat;
                        str6 = (String) objB;
                        z14 = z16;
                        strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                        if (i28 > 0) {
                            if (z14) {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar11111111111111111111113 = (o73.u) kt2.e.D0.getValue();
                                sVar.f133944e = strConcat2;
                                sVar.f133941b = i28;
                                sVar.f133946g = 11;
                                objB = o73.v.a(uVar11111111111111111111113, sVar);
                                break;
                            } else if (i28 > 1) {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar11111111111111111111114 = (o73.u) kt2.e.f106515s0.getValue();
                                Object[] objArr111111111111111116 = {new Integer(i28)};
                                sVar.f133944e = strConcat2;
                                sVar.f133946g = 9;
                                objB = o73.v.b(uVar11111111111111111111114, objArr111111111111111116, sVar);
                                if (objB != aVar) {
                                    str7 = strConcat2;
                                    str8 = (String) objB;
                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                }
                            } else {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar11111111111111111111115 = (o73.u) kt2.e.f106524v0.getValue();
                                Object[] objArr111111111111111117 = {new Integer(i28)};
                                sVar.f133944e = strConcat2;
                                sVar.f133946g = 10;
                                objB = o73.v.b(uVar11111111111111111111115, objArr111111111111111117, sVar);
                                if (objB != aVar) {
                                    str7 = strConcat2;
                                    str8 = (String) objB;
                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                }
                            }
                        }
                        return d53.w.i0(strConcat2).toString();
                    }
                }
                return aVar;
            case 5:
                i17 = sVar.f133943d;
                i16 = sVar.f133942c;
                i25 = sVar.f133941b;
                z15 = sVar.f133940a;
                str2 = sVar.f133944e;
                o13.r.b(objB);
                str4 = i17 + StringUtils.SPACE + objB;
                i26 = i16;
                i27 = i25;
                z14 = z15;
                str3 = str2;
                int i3119 = i27;
                i16 = i26;
                i24 = i3119;
                strConcat = (str3 + str4).concat(StringUtils.SPACE);
                if (i24 <= 0) {
                    i28 = i16;
                    strConcat2 = strConcat;
                    if (i28 > 0) {
                        if (z14) {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar11111111111111111111116 = (o73.u) kt2.e.D0.getValue();
                            sVar.f133944e = strConcat2;
                            sVar.f133941b = i28;
                            sVar.f133946g = 11;
                            objB = o73.v.a(uVar11111111111111111111116, sVar);
                            break;
                        } else if (i28 > 1) {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar11111111111111111111117 = (o73.u) kt2.e.f106515s0.getValue();
                            Object[] objArr111111111111111118 = {new Integer(i28)};
                            sVar.f133944e = strConcat2;
                            sVar.f133946g = 9;
                            objB = o73.v.b(uVar11111111111111111111117, objArr111111111111111118, sVar);
                            if (objB != aVar) {
                                str7 = strConcat2;
                                str8 = (String) objB;
                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                            }
                        } else {
                            kt2.f.f106534a.getClass();
                            kt2.e.f106460a.getClass();
                            o73.u uVar11111111111111111111118 = (o73.u) kt2.e.f106524v0.getValue();
                            Object[] objArr111111111111111119 = {new Integer(i28)};
                            sVar.f133944e = strConcat2;
                            sVar.f133946g = 10;
                            objB = o73.v.b(uVar11111111111111111111118, objArr111111111111111119, sVar);
                            if (objB != aVar) {
                                str7 = strConcat2;
                                str8 = (String) objB;
                                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                            }
                        }
                    }
                    return d53.w.i0(strConcat2).toString();
                }
                if (!z14) {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    o73.u uVar11111111111111111111119 = (o73.u) kt2.e.f106488j0.getValue();
                    sVar.f133944e = strConcat;
                    sVar.f133940a = z14;
                    sVar.f133941b = i16;
                    sVar.f133942c = i24;
                    sVar.f133946g = 8;
                    objB = o73.v.a(uVar11111111111111111111119, sVar);
                    break;
                } else if (i24 > 1) {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    o73.u uVar11219 = (o73.u) kt2.e.f106512r0.getValue();
                    Object[] objArr1111111111111111110 = {new Integer(i24)};
                    sVar.f133944e = strConcat;
                    sVar.f133940a = z14;
                    sVar.f133941b = i16;
                    sVar.f133946g = 6;
                    objB = o73.v.b(uVar11219, objArr1111111111111111110, sVar);
                    if (objB != aVar) {
                        i28 = i16;
                        z16 = z14;
                        str5 = strConcat;
                        str6 = (String) objB;
                        z14 = z16;
                        strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                        if (i28 > 0) {
                            if (z14) {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar111111111111111111111110 = (o73.u) kt2.e.D0.getValue();
                                sVar.f133944e = strConcat2;
                                sVar.f133941b = i28;
                                sVar.f133946g = 11;
                                objB = o73.v.a(uVar111111111111111111111110, sVar);
                                break;
                            } else if (i28 > 1) {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar111111111111111111111111 = (o73.u) kt2.e.f106515s0.getValue();
                                Object[] objArr1111111111111111111 = {new Integer(i28)};
                                sVar.f133944e = strConcat2;
                                sVar.f133946g = 9;
                                objB = o73.v.b(uVar111111111111111111111111, objArr1111111111111111111, sVar);
                                if (objB != aVar) {
                                    str7 = strConcat2;
                                    str8 = (String) objB;
                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                }
                            } else {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar111111111111111111111112 = (o73.u) kt2.e.f106524v0.getValue();
                                Object[] objArr1111111111111111112 = {new Integer(i28)};
                                sVar.f133944e = strConcat2;
                                sVar.f133946g = 10;
                                objB = o73.v.b(uVar111111111111111111111112, objArr1111111111111111112, sVar);
                                if (objB != aVar) {
                                    str7 = strConcat2;
                                    str8 = (String) objB;
                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                }
                            }
                        }
                        return d53.w.i0(strConcat2).toString();
                    }
                } else {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    o73.u uVar21112 = (o73.u) kt2.e.f106521u0.getValue();
                    Object[] objArr1111111111111111113 = {new Integer(i24)};
                    sVar.f133944e = strConcat;
                    sVar.f133940a = z14;
                    sVar.f133941b = i16;
                    sVar.f133946g = 7;
                    objB = o73.v.b(uVar21112, objArr1111111111111111113, sVar);
                    if (objB != aVar) {
                        i28 = i16;
                        z16 = z14;
                        str5 = strConcat;
                        str6 = (String) objB;
                        z14 = z16;
                        strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                        if (i28 > 0) {
                            if (z14) {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar111111111111111111111113 = (o73.u) kt2.e.D0.getValue();
                                sVar.f133944e = strConcat2;
                                sVar.f133941b = i28;
                                sVar.f133946g = 11;
                                objB = o73.v.a(uVar111111111111111111111113, sVar);
                                break;
                            } else if (i28 > 1) {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar111111111111111111111114 = (o73.u) kt2.e.f106515s0.getValue();
                                Object[] objArr1111111111111111114 = {new Integer(i28)};
                                sVar.f133944e = strConcat2;
                                sVar.f133946g = 9;
                                objB = o73.v.b(uVar111111111111111111111114, objArr1111111111111111114, sVar);
                                if (objB != aVar) {
                                    str7 = strConcat2;
                                    str8 = (String) objB;
                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                }
                            } else {
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                o73.u uVar111111111111111111111115 = (o73.u) kt2.e.f106524v0.getValue();
                                Object[] objArr1111111111111111115 = {new Integer(i28)};
                                sVar.f133944e = strConcat2;
                                sVar.f133946g = 10;
                                objB = o73.v.b(uVar111111111111111111111115, objArr1111111111111111115, sVar);
                                if (objB != aVar) {
                                    str7 = strConcat2;
                                    str8 = (String) objB;
                                    strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                                }
                            }
                        }
                        return d53.w.i0(strConcat2).toString();
                    }
                }
                return aVar;
            case 6:
                i28 = sVar.f133941b;
                z16 = sVar.f133940a;
                str5 = sVar.f133944e;
                o13.r.b(objB);
                str6 = (String) objB;
                z14 = z16;
                strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                if (i28 > 0) {
                    if (z14) {
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        o73.u uVar111111111111111111111116 = (o73.u) kt2.e.D0.getValue();
                        sVar.f133944e = strConcat2;
                        sVar.f133941b = i28;
                        sVar.f133946g = 11;
                        objB = o73.v.a(uVar111111111111111111111116, sVar);
                        break;
                    } else if (i28 > 1) {
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        o73.u uVar111111111111111111111117 = (o73.u) kt2.e.f106515s0.getValue();
                        Object[] objArr1111111111111111116 = {new Integer(i28)};
                        sVar.f133944e = strConcat2;
                        sVar.f133946g = 9;
                        objB = o73.v.b(uVar111111111111111111111117, objArr1111111111111111116, sVar);
                        if (objB != aVar) {
                            str7 = strConcat2;
                            str8 = (String) objB;
                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                        }
                    } else {
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        o73.u uVar111111111111111111111118 = (o73.u) kt2.e.f106524v0.getValue();
                        Object[] objArr1111111111111111117 = {new Integer(i28)};
                        sVar.f133944e = strConcat2;
                        sVar.f133946g = 10;
                        objB = o73.v.b(uVar111111111111111111111118, objArr1111111111111111117, sVar);
                        if (objB != aVar) {
                            str7 = strConcat2;
                            str8 = (String) objB;
                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                        }
                    }
                    return aVar;
                }
                return d53.w.i0(strConcat2).toString();
            case 7:
                i28 = sVar.f133941b;
                z16 = sVar.f133940a;
                str5 = sVar.f133944e;
                o13.r.b(objB);
                str6 = (String) objB;
                z14 = z16;
                strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                if (i28 > 0) {
                    if (z14) {
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        o73.u uVar111111111111111111111119 = (o73.u) kt2.e.D0.getValue();
                        sVar.f133944e = strConcat2;
                        sVar.f133941b = i28;
                        sVar.f133946g = 11;
                        objB = o73.v.a(uVar111111111111111111111119, sVar);
                        break;
                    } else if (i28 > 1) {
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        o73.u uVar1111111111111111111111110 = (o73.u) kt2.e.f106515s0.getValue();
                        Object[] objArr1111111111111111118 = {new Integer(i28)};
                        sVar.f133944e = strConcat2;
                        sVar.f133946g = 9;
                        objB = o73.v.b(uVar1111111111111111111111110, objArr1111111111111111118, sVar);
                        if (objB != aVar) {
                            str7 = strConcat2;
                            str8 = (String) objB;
                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                        }
                    } else {
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        o73.u uVar1111111111111111111111111 = (o73.u) kt2.e.f106524v0.getValue();
                        Object[] objArr1111111111111111119 = {new Integer(i28)};
                        sVar.f133944e = strConcat2;
                        sVar.f133946g = 10;
                        objB = o73.v.b(uVar1111111111111111111111111, objArr1111111111111111119, sVar);
                        if (objB != aVar) {
                            str7 = strConcat2;
                            str8 = (String) objB;
                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                        }
                    }
                    return aVar;
                }
                return d53.w.i0(strConcat2).toString();
            case 8:
                i24 = sVar.f133942c;
                i16 = sVar.f133941b;
                z14 = sVar.f133940a;
                strConcat = sVar.f133944e;
                o13.r.b(objB);
                str6 = i24 + StringUtils.SPACE + objB;
                i28 = i16;
                z16 = z14;
                str5 = strConcat;
                z14 = z16;
                strConcat2 = (str5 + str6).concat(StringUtils.SPACE);
                if (i28 > 0) {
                    if (z14) {
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        o73.u uVar1111111111111111111111112 = (o73.u) kt2.e.D0.getValue();
                        sVar.f133944e = strConcat2;
                        sVar.f133941b = i28;
                        sVar.f133946g = 11;
                        objB = o73.v.a(uVar1111111111111111111111112, sVar);
                        break;
                    } else if (i28 > 1) {
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        o73.u uVar1111111111111111111111113 = (o73.u) kt2.e.f106515s0.getValue();
                        Object[] objArr11111111111111111110 = {new Integer(i28)};
                        sVar.f133944e = strConcat2;
                        sVar.f133946g = 9;
                        objB = o73.v.b(uVar1111111111111111111111113, objArr11111111111111111110, sVar);
                        if (objB != aVar) {
                            str7 = strConcat2;
                            str8 = (String) objB;
                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                        }
                    } else {
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        o73.u uVar1111111111111111111111114 = (o73.u) kt2.e.f106524v0.getValue();
                        Object[] objArr11111111111111111111 = {new Integer(i28)};
                        sVar.f133944e = strConcat2;
                        sVar.f133946g = 10;
                        objB = o73.v.b(uVar1111111111111111111111114, objArr11111111111111111111, sVar);
                        if (objB != aVar) {
                            str7 = strConcat2;
                            str8 = (String) objB;
                            strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                        }
                    }
                    return aVar;
                }
                return d53.w.i0(strConcat2).toString();
            case 9:
                str7 = sVar.f133944e;
                o13.r.b(objB);
                str8 = (String) objB;
                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                return d53.w.i0(strConcat2).toString();
            case 10:
                str7 = sVar.f133944e;
                o13.r.b(objB);
                str8 = (String) objB;
                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                return d53.w.i0(strConcat2).toString();
            case 11:
                i28 = sVar.f133941b;
                strConcat2 = sVar.f133944e;
                o13.r.b(objB);
                str8 = i28 + StringUtils.SPACE + objB;
                str7 = strConcat2;
                strConcat2 = (str7 + str8).concat(StringUtils.SPACE);
                return d53.w.i0(strConcat2).toString();
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public static final String y(long j8) {
        if (j8 < 60) {
            ot2.a.f133852a.getClass();
            return ot2.a.b(0, 0, (int) j8);
        }
        if (j8 < 3600) {
            long j14 = 60;
            ot2.a.f133852a.getClass();
            return ot2.a.b(0, (int) (j8 / j14), (int) (j8 % j14));
        }
        long j15 = DateTimeConstants.SECONDS_PER_HOUR;
        int i14 = (int) (j8 / j15);
        int i15 = (int) (j8 % j15);
        ot2.a.f133852a.getClass();
        return ot2.a.b(i14, i15 / 60, i15 % 60);
    }

    public static final List z(v62.c2 c2Var) {
        c2Var.getClass();
        List list = f130590d;
        if (list != null) {
            return list;
        }
        u4.d dVarC = w62.a.f183317a;
        p005kotlin.jvm.internal.j jVar = null;
        if (dVarC == null) {
            float f14 = (float) 24.0d;
            g6.f.a aVar = g6.f.f75994b;
            u4.d.a aVar2 = new u4.d.a("Gps", f14, f14, 24.0f, 24.0f, 0L, 0, true, 96, null);
            o4.t1 t1Var = new o4.t1(o4.f0.d(4278190080L), jVar);
            o4.u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            o4.h1.f128863b.getClass();
            int i14 = o4.h1.f128864c;
            u4.e eVarM = com.nimbusds.jose.shaded.gson.internal.a.m(16.7168f, 8.7737f, 15.2208f, 7.2777f);
            eVarM.d(14.8093f, 6.8661f, 14.1364f, 6.8661f, 13.7248f, 7.2777f);
            eVarM.i(9.9932f, 11.0149f);
            eVarM.d(9.5817f, 11.4264f, 9.5817f, 12.0993f, 9.9932f, 12.5108f);
            eVarM.i(11.4892f, 14.0068f);
            eVarM.d(11.9007f, 14.4184f, 12.5736f, 14.4184f, 12.9852f, 14.0068f);
            eVarM.i(16.7168f, 10.2696f);
            eVarM.d(17.1283f, 9.8581f, 17.1283f, 9.1852f, 16.7168f, 8.7737f);
            hb.a.r(eVarM, 18.1627f, 12.4608f, 16.3553f, 12.1271f);
            eVarM.i(14.8426f, 13.6398f);
            eVarM.i(15.1763f, 15.4472f);
            eVarM.i(19.0136f, 19.29f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM, 22.0f, 16.3036f, 18.1627f, 12.4608f);
            eVarM.k(10.3936f, 9.1908f);
            eVarM.i(11.9063f, 7.6781f);
            eVarM.i(11.5726f, 5.8707f);
            eVarM.i(7.7353f, 2.0278f);
            eVarM.i(4.7434f, 5.0142f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM, 8.5806f, 8.8571f, 10.3936f, 9.1908f);
            eVarM.k(9.4705f, 14.4962f);
            eVarM.d(8.8921f, 13.9178f, 8.6307f, 13.1504f, 8.6696f, 12.3885f);
            eVarM.i(7.5518f, 12.3329f);
            eVarM.d(7.4962f, 13.3951f, 7.8744f, 14.474f, 8.6807f, 15.2803f);
            eVarM.d(9.4871f, 16.0867f, 10.566f, 16.4649f, 11.6282f, 16.4093f);
            eVarM.i(11.5726f, 15.2915f);
            eVarM.d(10.8163f, 15.336f, 10.0488f, 15.0746f, 9.4705f, 14.4962f);
            eVarM.c();
            eVarM.k(4.7823f, 12.1938f);
            eVarM.d(4.6877f, 14.0124f, 5.3329f, 15.8643f, 6.7176f, 17.2546f);
            eVarM.d(8.1024f, 18.6394f, 9.9543f, 19.2845f, 11.7784f, 19.1899f);
            eVarM.i(11.7228f, 18.0832f);
            eVarM.d(10.2045f, 18.1611f, 8.6641f, 17.6272f, 7.5073f, 16.4705f);
            eVarM.d(6.3506f, 15.3137f, 5.8167f, 13.7732f, 5.8945f, 12.255f);
            r1.q2.y(eVarM, 4.7823f, 12.1938f, 5.5386f, 18.428f);
            eVarM.d(3.8035f, 16.6929f, 3.0027f, 14.3794f, 3.1195f, 12.1049f);
            eVarM.i(2.0128f, 12.0492f);
            eVarM.d(1.8793f, 14.6297f, 2.7914f, 17.249f, 4.7545f, 19.2177f);
            eVarM.d(6.7176f, 21.1809f, 9.3425f, 22.0929f, 11.923f, 21.9594f);
            eVarM.i(11.8674f, 20.8527f);
            eVarM.d(9.5872f, 20.964f, 7.2737f, 20.1631f, 5.5386f, 18.428f);
            eVarM.c();
            u4.d.a.b(aVar2, eVarM.f168407a, i14, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC = aVar2.c();
            w62.a.f183317a = dVarC;
        }
        u4.d dVarC2 = w62.d.f183320a;
        if (dVarC2 == null) {
            float f15 = (float) 24.0d;
            g6.f.a aVar3 = g6.f.f75994b;
            u4.d.a aVar4 = new u4.d.a("_5hz", f15, f15, 24.0f, 24.0f, 0L, 0, false, 96, null);
            o4.t1 t1Var2 = new o4.t1(o4.f0.d(4278190080L), jVar);
            o4.u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            u4.e eVarN = u62.z.n(o4.h1.f128863b, 2.9932f, 17.8644f, 4.7351f, 19.6793f);
            v.e0.x(eVarN, 6.4769f, 21.4943f, 2.9932f, 17.8644f);
            u4.d.a.b(aVar4, eVarN.f168407a, 0, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var3 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarL = u62.z.l(20.9942f, 21.4943f, 17.5105f, 19.6793f, 19.2524f);
            u62.z.v(eVarL, 17.8644f, 20.9942f, 21.4943f);
            u4.d.a.b(aVar4, eVarL.f168407a, 0, t1Var3, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var4 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarQ = u62.z.q(6.4769f, 2.5056f, 4.3206f, 4.7351f, 6.1356f);
            u62.z.r(eVarQ, 2.9932f, 2.5056f, 6.4769f);
            u4.d.a.b(aVar4, eVarQ.f168407a, 0, t1Var4, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var5 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarL2 = u62.z.l(20.9942f, 6.1356f, 19.2524f, 4.3206f, 17.5105f);
            u62.z.v(eVarL2, 2.5056f, 20.9942f, 6.1356f);
            u4.d.a.b(aVar4, eVarL2.f168407a, 0, t1Var5, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var6 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarD = u62.z.d(18.8045f, 14.401f, 21.5752f, 21.5753f, 16.2162f);
            eVarD.g(16.3492f);
            eVarD.i(16.3491f, 15.0293f);
            sn.a.A(eVarD, 18.9622f, 11.9808f, 16.3491f, 10.1656f);
            eVarD.g(21.3919f);
            eVarD.o(11.3182f);
            eVarD.i(18.8045f, 14.401f);
            eVarD.c();
            u4.d.a.b(aVar4, eVarD.f168407a, 0, t1Var6, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var7 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarL3 = u62.z.l(15.1877f, 16.2162f, 13.4456f, 12.5859f, 10.5422f);
            u62.z.y(eVarL3, 16.2162f, 8.8001f, 7.7454f, 10.5422f);
            u62.z.y(eVarL3, 10.7707f, 13.4456f, 7.7454f, 15.1877f);
            eVarL3.o(16.2162f);
            eVarL3.c();
            u4.d.a.b(aVar4, eVarL3.f168407a, 0, t1Var7, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var8 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarJ = sn.a.j(1.8318f, 11.9808f, 2.5353f, 7.7454f, 7.058f);
            eVarJ.o(9.5606f);
            eVarJ.i(3.9133f, 9.5606f);
            eVarJ.i(3.5739f, 10.7707f);
            eVarJ.d(3.5739f, 10.7707f, 4.1546f, 10.4682f, 4.7352f, 10.4682f);
            eVarJ.d(5.5415f, 10.4682f, 6.4953f, 10.856f, 6.9526f, 11.3495f);
            eVarJ.d(7.41f, 11.8431f, 7.6387f, 12.5337f, 7.6387f, 13.4213f);
            eVarJ.d(7.6387f, 13.9608f, 7.5224f, 14.4448f, 7.2899f, 14.8733f);
            eVarJ.d(7.0612f, 15.298f, 6.7317f, 15.6289f, 6.3014f, 15.8661f);
            eVarJ.d(5.8712f, 16.0995f, 5.2835f, 16.2162f, 4.6982f, 16.2162f);
            eVarJ.d(4.1865f, 16.2162f, 3.7117f, 16.1148f, 3.2737f, 15.912f);
            eVarJ.d(2.8357f, 15.7054f, 2.4888f, 15.4166f, 2.233f, 15.0454f);
            eVarJ.d(1.981f, 14.6743f, 1.8473f, 14.2515f, 1.8318f, 13.7771f);
            eVarJ.i(3.5739f, 13.796f);
            eVarJ.d(3.5739f, 14.712f, 4.9325f, 15.3325f, 5.5885f, 14.4773f);
            eVarJ.d(5.7939f, 14.2056f, 5.8966f, 13.823f, 5.8966f, 13.3295f);
            eVarJ.d(5.8966f, 11.8704f, 4.4982f, 11.6227f, 3.5739f, 12.5859f);
            eVarJ.i(1.8318f, 11.9808f);
            eVarJ.c();
            u4.d.a.b(aVar4, eVarJ.f168407a, 0, t1Var8, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC2 = aVar4.c();
            w62.d.f183320a = dVarC2;
        }
        u4.d dVarC3 = w62.c.f183319a;
        if (dVarC3 == null) {
            float f16 = (float) 24.0d;
            g6.f.a aVar5 = g6.f.f75994b;
            u4.d.a aVar6 = new u4.d.a(HttpHeaders.LINK, f16, f16, 24.0f, 24.0f, 0L, 0, true, 96, null);
            o4.t1 t1Var9 = new o4.t1(o4.f0.d(4278190080L), jVar);
            o4.u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            u4.e eVarK = b71.i.k(o4.h1.f128863b, 10.4265f, 3.642f);
            eVarK.d(9.1101f, 2.3589f, 7.5582f, 1.9525f, 5.7816f, 2.4658f);
            eVarK.g(5.7709f);
            eVarK.d(3.9194f, 3.0004f, 2.7742f, 4.2515f, 2.3675f, 6.1335f);
            eVarK.d(2.0251f, 7.7589f, 2.4318f, 9.1703f, 3.5769f, 10.3466f);
            eVarK.d(4.8398f, 11.6511f, 6.1241f, 12.9236f, 7.4191f, 14.1961f);
            eVarK.d(9.3883f, 16.1315f, 12.6847f, 15.8749f, 14.4399f, 13.6721f);
            eVarK.i(14.3864f, 13.6187f);
            eVarK.d(14.1295f, 13.362f, 13.8833f, 13.1161f, 13.6265f, 12.8701f);
            eVarK.d(13.4659f, 12.7204f, 13.3268f, 12.6777f, 13.2305f, 12.6777f);
            eVarK.d(13.1342f, 12.6777f, 12.9843f, 12.7204f, 12.8131f, 12.8808f);
            eVarK.d(12.3636f, 13.2979f, 11.8606f, 13.5759f, 11.3041f, 13.6935f);
            eVarK.d(10.7368f, 13.8004f, 10.1589f, 13.7363f, 9.5917f, 13.501f);
            eVarK.d(9.1529f, 13.3193f, 8.7783f, 12.9985f, 8.4893f, 12.7204f);
            eVarK.d(7.2692f, 11.5228f, 6.0599f, 10.3038f, 4.8612f, 9.0848f);
            eVarK.d(3.4699f, 7.6626f, 3.898f, 5.3208f, 5.6425f, 4.3798f);
            eVarK.d(6.2097f, 4.0805f, 6.8519f, 3.9735f, 7.4833f, 4.0591f);
            eVarK.d(8.1147f, 4.1446f, 8.6927f, 4.4333f, 9.1422f, 4.8824f);
            eVarK.d(9.688f, 5.4278f, 10.2338f, 5.9731f, 10.7689f, 6.5185f);
            eVarK.d(11.4432f, 6.2618f, 12.1388f, 6.1014f, 12.8559f, 6.0587f);
            eVarK.i(12.6098f, 5.8127f);
            eVarK.d(12.4276f, 5.6308f, 12.2462f, 5.4488f, 12.0649f, 5.267f);
            eVarK.d(11.5218f, 4.7224f, 10.9801f, 4.1792f, 10.4265f, 3.642f);
            eVarK.c();
            u4.d.a.b(aVar6, eVarK.f168407a, 0, t1Var9, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var10 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarL4 = com.nimbusds.jose.shaded.gson.internal.a.l(17.5757f, 19.8955f);
            eVarL4.d(16.5482f, 20.1201f, 15.6278f, 19.8741f, 14.8894f, 19.1577f);
            eVarL4.d(14.3258f, 18.6158f, 13.7939f, 18.074f, 13.2517f, 17.5216f);
            eVarL4.i(13.2412f, 17.5109f);
            eVarL4.d(12.5669f, 17.7676f, 11.8713f, 17.928f, 11.1542f, 17.9707f);
            eVarL4.i(13.573f, 20.3874f);
            eVarL4.d(16.0345f, 22.8254f, 20.2406f, 21.863f, 21.4285f, 18.5268f);
            eVarL4.d(22.0707f, 16.7304f, 21.7496f, 15.105f, 20.476f, 13.7363f);
            eVarL4.d(19.2024f, 12.3676f, 17.8646f, 11.0523f, 16.5054f, 9.7478f);
            eVarL4.d(14.5362f, 7.8658f, 11.2934f, 8.1438f, 9.5489f, 10.3252f);
            eVarL4.d(9.7201f, 10.4749f, 9.8806f, 10.6353f, 10.0304f, 10.785f);
            eVarL4.d(10.1482f, 10.8919f, 10.2552f, 10.9989f, 10.3622f, 11.1058f);
            eVarL4.d(10.5335f, 11.2662f, 10.6726f, 11.309f, 10.7582f, 11.309f);
            eVarL4.d(10.8439f, 11.309f, 10.983f, 11.2769f, 11.1649f, 11.1058f);
            eVarL4.d(12.4171f, 9.9403f, 14.1937f, 9.9509f, 15.3924f, 11.1486f);
            eVarL4.d(15.7987f, 11.5545f, 16.2062f, 11.9605f, 16.6141f, 12.3669f);
            eVarL4.d(17.431f, 13.1807f, 18.2495f, 13.9961f, 19.0633f, 14.8163f);
            eVarL4.d(19.8767f, 15.6397f, 20.187f, 16.6769f, 19.8339f, 17.821f);
            eVarL4.d(19.4914f, 18.9224f, 18.6994f, 19.6496f, 17.5757f, 19.8955f);
            eVarL4.c();
            u4.d.a.b(aVar6, eVarL4.f168407a, 0, t1Var10, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC3 = aVar6.c();
            w62.c.f183319a = dVarC3;
        }
        u4.d dVarC4 = w62.b.f183318a;
        if (dVarC4 == null) {
            float f17 = (float) 24.0d;
            g6.f.a aVar7 = g6.f.f75994b;
            u4.d.a aVar8 = new u4.d.a("LinkDisconnect", f17, f17, 24.0f, 24.0f, 0L, 0, true, 96, null);
            o4.t1 t1Var11 = new o4.t1(o4.f0.d(4278190080L), jVar);
            o4.u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            u4.e eVarL5 = b71.i.l(o4.h1.f128863b, 2.0f, 20.3535f, 2.8027f, 21.2754f);
            eVarL5.i(9.5859f, 15.374f);
            eVarL5.d(11.3147f, 15.7752f, 13.2439f, 15.1834f, 14.4482f, 13.6719f);
            eVarL5.i(14.3945f, 13.6191f);
            eVarL5.d(14.1378f, 13.3626f, 13.8915f, 13.116f, 13.6348f, 12.8701f);
            eVarL5.d(13.4744f, 12.7205f, 13.3346f, 12.6778f, 13.2383f, 12.6777f);
            eVarL5.d(13.142f, 12.6778f, 12.9923f, 12.7207f, 12.8213f, 12.8808f);
            eVarL5.d(12.4556f, 13.2201f, 12.0529f, 13.4647f, 11.6162f, 13.6084f);
            eVarL5.i(14.9082f, 10.7451f);
            eVarL5.d(15.08f, 10.8601f, 15.2455f, 10.9937f, 15.4004f, 11.1484f);
            eVarL5.d(15.8067f, 11.5544f, 16.2142f, 11.9608f, 16.6221f, 12.3672f);
            eVarL5.d(17.4389f, 13.1809f, 18.2576f, 13.9963f, 19.0713f, 14.8164f);
            eVarL5.d(19.8845f, 15.6397f, 20.1949f, 16.6772f, 19.8418f, 17.8213f);
            eVarL5.d(19.4994f, 18.9224f, 18.7073f, 19.6494f, 17.584f, 19.8955f);
            eVarL5.d(16.5567f, 20.12f, 15.6359f, 19.8421f, 14.8975f, 19.126f);
            eVarL5.o(19.1582f);
            eVarL5.d(14.3339f, 18.6164f, 13.8019f, 18.0738f, 13.2598f, 17.5215f);
            eVarL5.i(13.249f, 17.5107f);
            eVarL5.d(12.5748f, 17.7673f, 11.8791f, 17.9279f, 11.1621f, 17.9707f);
            eVarL5.i(13.5811f, 20.3877f);
            eVarL5.d(16.0427f, 22.8253f, 20.2486f, 21.8624f, 21.4365f, 18.5264f);
            eVarL5.d(22.0784f, 16.7303f, 21.7576f, 15.1048f, 20.4844f, 13.7363f);
            eVarL5.d(19.2109f, 12.3677f, 17.8727f, 11.0525f, 16.5137f, 9.748f);
            eVarL5.d(16.4398f, 9.6774f, 16.3635f, 9.6104f, 16.2861f, 9.5459f);
            eVarL5.i(22.0078f, 4.5693f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarL5, 21.2051f, 3.6465f, 2.0f, 20.3535f);
            u4.d.a.b(aVar8, eVarL5.f168407a, 0, t1Var11, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var12 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarL6 = com.nimbusds.jose.shaded.gson.internal.a.l(10.4346f, 3.6416f);
            eVarL6.d(9.1183f, 2.3586f, 7.5655f, 1.9526f, 5.7891f, 2.4658f);
            eVarL6.g(5.7793f);
            eVarL6.d(3.9278f, 3.0004f, 2.7817f, 4.2518f, 2.375f, 6.1338f);
            eVarL6.d(2.0326f, 7.759f, 2.4399f, 9.1705f, 3.585f, 10.3467f);
            eVarL6.d(4.8154f, 11.6177f, 6.0669f, 12.8578f, 7.3281f, 14.0976f);
            eVarL6.i(8.6982f, 12.9053f);
            eVarL6.d(8.6276f, 12.8427f, 8.5598f, 12.7811f, 8.4971f, 12.7207f);
            eVarL6.d(7.2771f, 11.5231f, 6.0678f, 10.3039f, 4.8691f, 9.085f);
            eVarL6.d(3.4778f, 7.6628f, 3.9059f, 5.3209f, 5.6504f, 4.3799f);
            eVarL6.d(6.2176f, 4.0805f, 6.8598f, 3.974f, 7.4912f, 4.0596f);
            eVarL6.d(8.1225f, 4.1452f, 8.701f, 4.4338f, 9.1504f, 4.8828f);
            eVarL6.d(9.696f, 5.4279f, 10.2415f, 5.9734f, 10.7764f, 6.5185f);
            eVarL6.d(11.4506f, 6.262f, 12.1473f, 6.1013f, 12.8643f, 6.0586f);
            eVarL6.i(12.6172f, 5.8125f);
            eVarL6.d(12.4352f, 5.6307f, 12.2544f, 5.4482f, 12.0732f, 5.2666f);
            eVarL6.d(11.5301f, 4.722f, 10.9882f, 4.1787f, 10.4346f, 3.6416f);
            eVarL6.c();
            u4.d.a.b(aVar8, eVarL6.f168407a, 0, t1Var12, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var13 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarL7 = com.nimbusds.jose.shaded.gson.internal.a.l(13.7471f, 8.5137f);
            eVarL7.d(12.2109f, 8.3858f, 10.6104f, 9.0076f, 9.5566f, 10.3252f);
            eVarL7.d(9.7278f, 10.4748f, 9.8883f, 10.6355f, 10.0381f, 10.7851f);
            eVarL7.d(10.1557f, 10.892f, 10.2632f, 10.9986f, 10.3701f, 11.1055f);
            eVarL7.d(10.451f, 11.1812f, 10.5256f, 11.2296f, 10.5898f, 11.2607f);
            eVarL7.i(13.7471f, 8.5137f);
            eVarL7.c();
            u4.d.a.b(aVar8, eVarL7.f168407a, 0, t1Var13, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC4 = aVar8.c();
            w62.b.f183318a = dVarC4;
        }
        List listK = p13.x.k(dVarC, dVarC2, dVarC3, dVarC4);
        f130590d = listK;
        listK.getClass();
        return listK;
    }
}
