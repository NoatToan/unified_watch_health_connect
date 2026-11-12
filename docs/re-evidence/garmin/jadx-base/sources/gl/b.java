package gl;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.j1;
import androidx.room.q;
import androidx.room.x0;
import androidx.room.z0;
import b43.j;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.data.LineScatterCandleRadarDataSet;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.LatLng;
import d53.u;
import e2.i0;
import gj1.i;
import h2.j0;
import h2.o0;
import h5.e0;
import i3.fe;
import ii0.g0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import km1.a0;
import km1.v;
import kotlin.t1;
import l30.y0;
import lc.m0;
import lc.r;
import n23.n4;
import n23.s4;
import n63.x;
import o13.p;
import o53.b0;
import o61.k;
import o63.t;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.w;
import p13.y;
import p3.l0;
import p3.m;
import p3.n;
import p3.p2;
import p3.x1;
import p43.d2;
import p43.n0;
import p43.v0;
import p43.y1;
import r53.c2;
import t13.g;
import t23.d0;
import t23.h;
import t23.h1;
import t23.k1;
import t23.l;
import t23.r0;
import t23.u0;
import x33.f;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static final ArrayList A(v0 v0Var) {
        ?? C;
        if (!j.f(v0Var)) {
            return null;
        }
        h hVarT = v0Var.F0().t();
        hVarT.getClass();
        int i14 = f43.e.f68881a;
        h1<v0> h1VarJ = ((t23.e) hVarT).J();
        d0 d0Var = h1VarJ instanceof d0 ? (d0) h1VarJ : null;
        d0Var.getClass();
        Collection<p> collection = d0Var.f162002a;
        ArrayList arrayList = new ArrayList();
        for (p pVar : collection) {
            f fVar = (f) pVar.f128594a;
            ArrayList arrayListA = A((v0) pVar.f128595b);
            if (arrayListA != null) {
                C = new ArrayList(y.r(arrayListA, 10));
                Iterator it = arrayListA.iterator();
                while (it.hasNext()) {
                    C.add(fVar.c() + '-' + ((String) it.next()));
                }
            } else {
                C = w.c(fVar.c());
            }
            p13.d0.v(arrayList, C);
        }
        return arrayList;
    }

    public static final Float B(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fMin = ((k00.c) it.next()).f101962b;
        while (it.hasNext()) {
            fMin = Math.min(fMin, ((k00.c) it.next()).f101962b);
        }
        return Float.valueOf(fMin);
    }

    public static final long C(k4.c cVar) {
        float x14 = cVar.f102805a.getX();
        float y14 = cVar.f102805a.getY();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x14)) << 32) | (((long) Float.floatToRawIntBits(y14)) & 4294967295L);
        n4.c.a aVar = n4.c.f123541b;
        return jFloatToRawIntBits;
    }

    public static final gj1.b D(gj1.f fVar, Long l14) {
        List<gj1.b> listB;
        fVar.getClass();
        gj1.e eVarD = fVar.getPrimaryTrainingDevices();
        Object obj = null;
        if (eVarD == null || (listB = eVarD.b()) == null) {
            return null;
        }
        for (Object obj2 : listB) {
            if (s.g(((gj1.b) obj2).getDeviceId(), l14)) {
                obj = obj2;
                break;
            }
        }
        return (gj1.b) obj;
    }

    public static final gj1.b E(gj1.f fVar, Long l14) {
        List<gj1.b> listB;
        i iVarH = fVar.getWearableDevices();
        Object obj = null;
        if (iVarH == null || (listB = iVarH.b()) == null) {
            return null;
        }
        for (Object obj2 : listB) {
            if (s.g(((gj1.b) obj2).getDeviceId(), l14)) {
                obj = obj2;
                break;
            }
        }
        return (gj1.b) obj;
    }

    public static final boolean F(e0 e0Var) {
        if (e0Var.f81767h == null) {
            return false;
        }
        e0 e0VarK = e0Var.K();
        return (e0VarK != null ? e0VarK.f81767h : null) == null || e0Var.T.f81839b;
    }

    public static final boolean G(gj1.a aVar) {
        aVar.getClass();
        return s.g(aVar.getPrimaryActivityTrackerSettingCapable(), Boolean.TRUE);
    }

    public static final boolean H(KeyEvent keyEvent) {
        return keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar());
    }

    public static void I(b0 b0Var, g gVar, e23.p pVar, int i14) {
        if ((i14 & 1) != 0) {
            gVar = t13.h.f161748a;
        }
        o53.d0 d0Var = o53.d0.DEFAULT;
        b0Var.getClass();
        gVar.getClass();
        d0Var.getClass();
        ge1.b.S(b0Var, gVar, d0Var, pVar);
    }

    public static final float J(float f14, float f15, float f16) {
        return (f16 * f15) + ((1 - f16) * f14);
    }

    public static final int K(int i14, int i15, float f14) {
        return i14 + ((int) Math.round(((double) (i15 - i14)) * ((double) f14)));
    }

    public static final Object L(n63.b bVar, String str, x xVar, i63.b bVar2) {
        bVar.getClass();
        str.getClass();
        return new t(bVar, xVar, str, bVar2.getF158591b()).h(bVar2);
    }

    public static final m82.f M(int i14, e23.a aVar, m mVar, int i15, int i16) {
        aVar.getClass();
        if ((i16 & 1) != 0) {
            i14 = 2147483646;
        }
        x1 x1Var = n.f135158a;
        return new m82.f(o0.b(i14, aVar, mVar, (i15 << 3) & 896, 2));
    }

    public static final boolean N(ou0.d dVar) {
        return !(dVar != null ? s.g(dVar.f133974a, Boolean.TRUE) : false) || dVar.a();
    }

    public static final gj2.b O(fj2.a aVar) {
        return new gj2.b(aVar.getFirstName(), aVar.getLastName(), aVar.getCity(), aVar.getStateOrProvince(), aVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE java.lang.String(), aVar.getPostalCode(), aVar.getLine1(), aVar.getLine2(), new gj2.c(aVar.getPhoneNumberId(), aVar.getPhoneNumberId() != null, false, 4, null));
    }

    public static final com.garmin.android.apps.connectmobile.repcounting.model.e P(com.garmin.android.apps.connectmobile.repcounting.model.d dVar) {
        dVar.getClass();
        com.garmin.android.apps.connectmobile.repcounting.model.b bVar = new com.garmin.android.apps.connectmobile.repcounting.model.b();
        bVar.H(dVar.f41102a);
        String str = dVar.f41102a;
        bVar.I((str == null || u.m(str, dVar.f41106e)) ? null : dVar.f41106e);
        bVar.M();
        com.garmin.android.apps.connectmobile.repcounting.model.e eVar = new com.garmin.android.apps.connectmobile.repcounting.model.e();
        eVar.h0(new com.garmin.android.apps.connectmobile.repcounting.model.b[]{bVar});
        eVar.f41115e = dVar.f41102a;
        eVar.f41116f = dVar.f41106e;
        eVar.f41117g = dVar.f41107f;
        eVar.k0("ACTIVE");
        eVar.j0(new DateTime());
        eVar.f41124n = dVar.f41108g;
        eVar.f41125o = dVar.f41109h;
        return eVar;
    }

    public static final Class Q(n0 n0Var) {
        v0 v0VarG;
        Class clsR = R(n0Var.F0().t());
        if (clsR == null) {
            return null;
        }
        if (d2.g(n0Var) && ((v0VarG = j.g(n0Var)) == null || d2.g(v0VarG) || p005kotlin.reflect.jvm.internal.impl.builtins.d.H(v0VarG))) {
            return null;
        }
        return clsR;
    }

    public static final Class R(l lVar) {
        if (!(lVar instanceof t23.e) || !j.b(lVar)) {
            return null;
        }
        t23.e eVar = (t23.e) lVar;
        Class<?> clsI = s4.i(eVar);
        if (clsI != null) {
            return clsI;
        }
        StringBuilder sb3 = new StringBuilder("Class object for the class ");
        sb3.append(eVar.getName());
        kg.f.t(sb3, " cannot be found (classId=", f43.e.f((h) lVar));
        return null;
    }

    public static final Object S(j1 j1Var, k23.d dVar, Map map) {
        dVar.getClass();
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        i63.c cVarJ = gl1.y.J(dVar);
        for (r rVar : rc.l.c(cVarJ, map)) {
            linkedHashMap.put(rVar.f111860a, rVar.f111861b.f111866a);
        }
        return cVarJ.deserialize(new rc.j(j1Var, linkedHashMap));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void T(a aVar, a aVar2) {
        aVar.getClass();
        aVar.f77747a.setValue(o4.d0.a(aVar2.f()));
        aVar.f77748b.setValue(o4.d0.a(aVar2.g()));
        aVar.f77749c.setValue(o4.d0.a(aVar2.b()));
        aVar.f77750d.setValue(o4.d0.a(aVar2.c()));
        aVar.f77751e.setValue(o4.d0.a(aVar2.d()));
        aVar.f77752f.setValue(o4.d0.a(aVar2.e()));
        aVar.f77753g.setValue(o4.d0.a(aVar2.h()));
        aVar.f77754h.setValue(o4.d0.a(aVar2.i()));
        aVar.f77755i.setValue(o4.d0.a(aVar2.j()));
        aVar.f77756j.setValue(o4.d0.a(aVar2.k()));
        aVar.f77757k.setValue(o4.d0.a(aVar2.l()));
        aVar.f77758l.setValue(o4.d0.a(aVar2.m()));
        aVar.f77759m.setValue(o4.d0.a(aVar2.n()));
        aVar.f77760n.setValue(o4.d0.a(aVar2.o()));
        aVar.f77761o.setValue(o4.d0.a(aVar2.p()));
        aVar.f77762p.setValue(o4.d0.a(aVar2.q()));
        aVar.f77763q.setValue(o4.d0.a(aVar2.r()));
        aVar.f77764r.setValue(o4.d0.a(((o4.d0) aVar2.f77764r.getF182175a()).f128833a));
        aVar.f77765s.setValue(o4.d0.a(((o4.d0) aVar2.f77765s.getF182175a()).f128833a));
    }

    public static final o61.l U(o61.l lVar, k kVar) {
        lVar.getClass();
        double d14 = lVar.f129607c;
        double d15 = lVar.f129606b;
        if (kVar == null || !s.g(lVar.f129608d, kVar.h())) {
            return lVar;
        }
        ArrayList arrayListD1 = h0.d1(lVar.f129605a);
        Double dF = kVar.getAerobicValue();
        double dDoubleValue = dF != null ? dF.doubleValue() : Double.NaN;
        if ((Double.isNaN(d15) && !Double.isNaN(dDoubleValue)) || (!Double.isNaN(dDoubleValue) && dDoubleValue > d15)) {
            d15 = dDoubleValue;
        }
        Double dG = kVar.getAnaerobicValue();
        double dDoubleValue2 = dG != null ? dG.doubleValue() : Double.NaN;
        double d16 = ((!Double.isNaN(d14) || Double.isNaN(dDoubleValue2)) && (Double.isNaN(dDoubleValue2) || dDoubleValue2 <= d14)) ? d14 : dDoubleValue2;
        String strH3 = kVar.getTrainingEffectLabel();
        arrayListD1.add(k.b(kVar, Double.valueOf(d15), Double.valueOf(d16), strH3));
        return new o61.l(arrayListD1, d15, d16, lVar.f129608d, strH3);
    }

    public static final void a(e23.a aVar, m mVar, int i14) {
        e23.a aVar2;
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-334684457);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            String strQ = gl1.y.Q(o0VarE, R.string.title_live_track);
            kv0.a.f106604a.getClass();
            aVar2 = aVar;
            gl1.d.b(strQ, aVar2, false, null, null, null, kv0.a.f106605b, o0VarE, ((i15 << 3) & 112) | 1572864, 60);
        } else {
            aVar2 = aVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hl1.i(aVar2, i14, 25);
        }
    }

    public static o53.s b() {
        return new o53.s(null);
    }

    public static final void c(String str, zc.d dVar, zc.d dVar2, li0.f fVar, u2.h hVar, p003ji0.a aVar, i0 i0Var, i0 i0Var2, e23.a aVar2, m mVar, int i14) {
        int i15;
        dVar2.getClass();
        fVar.getClass();
        hVar.getClass();
        aVar.getClass();
        i0Var.getClass();
        i0Var2.getClass();
        aVar2.getClass();
        p3.o0 o0VarE = mVar.E(-1772560090);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(dVar2) : o0VarE.r(dVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= (i14 & 4096) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(hVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(aVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.B(i0Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.B(i0Var2) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i15 |= o0VarE.r(aVar2) ? 67108864 : 33554432;
        }
        if (o0VarE.n(i15 & 1, (38347923 & i15) != 38347922)) {
            x1 x1Var = n.f135158a;
            ii0.e.f93588a.getClass();
            g0.a(str, dVar, dVar2, fVar, hVar, aVar, i0Var, i0Var2, aVar2, ii0.e.f93589b, o0VarE, (i15 & 14) | 805306432 | (i15 & 112) | 512 | (i15 & 896) | (li0.f.f112658h << 9) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | (3670016 & i15) | (29360128 & i15) | (i15 & 234881024));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ii0.d0(str, dVar, dVar2, fVar, hVar, aVar, i0Var, i0Var2, aVar2, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    public static final void d(m0 m0Var, e23.a aVar, m mVar, int i14) {
        e23.a aVar2;
        m0Var.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(1963058637);
        int i15 = (o0VarE.r(m0Var) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            boolean zR = o0VarE.r(m0Var);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new k62.j(m0Var, 20);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new k62.j(m0Var, 20);
                    o0VarE.K(objQ);
                }
            }
            n72.g.f124888a.getClass();
            aVar2 = aVar;
            m72.f.a("Typography", (e23.a) objQ, aVar2, null, null, n72.g.f124889b, o0VarE, ((i15 << 3) & 896) | 196614, 24);
        } else {
            aVar2 = aVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n72.h(m0Var, aVar2, i14, i16);
        }
    }

    public static final void e(m0 m0Var, Long l14, m mVar, int i14) {
        m0 m0VarI;
        int i15;
        p3.o0 o0VarE = mVar.E(519116028);
        int i16 = i14 | 2 | (o0VarE.B(l14) ? 32 : 16);
        int i17 = 1;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                m0VarI = gl1.y.I(new lc.v0[0], o0VarE);
                i15 = i16 & (-15);
            } else {
                o0VarE.e();
                i15 = i16 & (-15);
                m0VarI = m0Var;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
            }
            fe feVar = (fe) objQ;
            qt1.a aVarG0 = gl1.d.g0(o0VarE);
            String strD = ot1.y.f133845a.d();
            boolean zR = o0VarE.r(m0VarI);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new mt1.a(m0VarI, feVar, i17);
                o0VarE.K(objQ2);
            }
            int i18 = i15;
            nc.y.b(m0VarI, strD, null, null, null, null, null, null, (e23.l) objQ2, o0VarE, 0, 1020);
            Unit unit = Unit.INSTANCE;
            boolean zR2 = o0VarE.r(aVarG0);
            Object objQ3 = o0VarE.q();
            if (zR2 || objQ3 == c2565a) {
                objQ3 = new mt1.h(aVarG0, feVar, null);
                o0VarE.K(objQ3);
            }
            l0.e((e23.p) objQ3, unit, o0VarE);
            qt1.k kVarF0 = gl1.d.f0(m0VarI, o0VarE);
            boolean zR3 = o0VarE.r(kVarF0) | ((i18 & 112) == 32);
            Object objQ4 = o0VarE.q();
            if (zR3 || objQ4 == c2565a) {
                objQ4 = new mt1.i(l14, kVarF0, null);
                o0VarE.K(objQ4);
            }
            l0.e((e23.p) objQ4, unit, o0VarE);
        } else {
            o0VarE.e();
            m0VarI = m0Var;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y0(m0VarI, l14, i14, 28);
        }
    }

    public static final String f(Method method) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        sb3.append(p13.u.P(parameterTypes, "", "(", ")", n4.f122543a, 24));
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        sb3.append(z23.f.b(returnType));
        return sb3.toString();
    }

    public static final String g(float f14, m mVar) {
        int i14;
        int i15;
        x1 x1Var = n.f135158a;
        float f15 = 360;
        float f16 = ((f14 % f15) + f15) % f15;
        if (f16 < 45.0f || f16 >= 315.0f) {
            i14 = -1980137944;
            i15 = R.string.gak_lbl_compass_north_full;
        } else if (f16 < 135.0f) {
            i14 = -1980135193;
            i15 = R.string.gak_lbl_compass_east_full;
        } else if (f16 < 225.0f) {
            i14 = -1980132472;
            i15 = R.string.gak_lbl_compass_south_full;
        } else {
            i14 = -1980130297;
            i15 = R.string.gak_lbl_compass_west_full;
        }
        return sn.a.h(mVar, i14, i15, mVar);
    }

    public static final Object h(Object obj, t23.b bVar) {
        n0 n0VarW;
        Class clsQ;
        return (((bVar instanceof r0) && j.d((k1) bVar)) || (n0VarW = w(bVar)) == null || (clsQ = Q(n0VarW)) == null) ? obj : x(clsQ, bVar).invoke(obj, null);
    }

    public static void i(IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet, Context context) {
        iBarLineScatterCandleBubbleDataSet.getClass();
        if (iBarLineScatterCandleBubbleDataSet instanceof BarLineScatterCandleBubbleDataSet) {
            ((BarLineScatterCandleBubbleDataSet) iBarLineScatterCandleBubbleDataSet).setHighLightColor(a7.b.getColor(context, R.color.gcm_chart_highlight_line));
        }
        if (iBarLineScatterCandleBubbleDataSet instanceof LineScatterCandleRadarDataSet) {
            LineScatterCandleRadarDataSet lineScatterCandleRadarDataSet = (LineScatterCandleRadarDataSet) iBarLineScatterCandleBubbleDataSet;
            lineScatterCandleRadarDataSet.setHighlightLineWidth(1.0f);
            lineScatterCandleRadarDataSet.setDrawHorizontalHighlightIndicator(false);
        }
    }

    public static final boolean j(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj != obj2 && !s.g(obj, obj2)) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                    if (!j((Bundle) obj, (Bundle) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!p13.m.b((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final int k(Bundle bundle) {
        int iHashCode;
        Iterator<String> it = bundle.keySet().iterator();
        int i14 = 1;
        while (it.hasNext()) {
            Object obj = bundle.get(it.next());
            if (obj instanceof Bundle) {
                iHashCode = k((Bundle) obj);
            } else if (obj instanceof Object[]) {
                iHashCode = Arrays.deepHashCode((Object[]) obj);
            } else if (obj instanceof byte[]) {
                iHashCode = Arrays.hashCode((byte[]) obj);
            } else if (obj instanceof short[]) {
                iHashCode = Arrays.hashCode((short[]) obj);
            } else if (obj instanceof int[]) {
                iHashCode = Arrays.hashCode((int[]) obj);
            } else if (obj instanceof long[]) {
                iHashCode = Arrays.hashCode((long[]) obj);
            } else if (obj instanceof float[]) {
                iHashCode = Arrays.hashCode((float[]) obj);
            } else if (obj instanceof double[]) {
                iHashCode = Arrays.hashCode((double[]) obj);
            } else if (obj instanceof char[]) {
                iHashCode = Arrays.hashCode((char[]) obj);
            } else if (obj instanceof boolean[]) {
                iHashCode = Arrays.hashCode((boolean[]) obj);
            } else {
                iHashCode = obj != null ? obj.hashCode() : 0;
            }
            i14 = (i14 * 31) + iHashCode;
        }
        return i14;
    }

    public static final void l(com.garmin.android.apps.connectmobile.courses.model.e eVar) {
        List<com.garmin.android.apps.connectmobile.courses.model.g> listJ = eVar.j();
        if (listJ != null) {
            for (com.garmin.android.apps.connectmobile.courses.model.g gVar : listJ) {
                Double d14 = gVar.lat;
                Double d15 = gVar.lon;
                if (d14 != null && d15 != null) {
                    LatLng latLng = new LatLng(d14.doubleValue(), d15.doubleValue());
                    com.garmin.android.library.mapsdkadapter.m mVar = com.garmin.android.library.mapsdkadapter.m.f50298a;
                    if (!Double.isNaN(latLng.latitude) && !Double.isNaN(latLng.longitude)) {
                        ie2.f.f93122a.getClass();
                        LatLng latLngB = ie2.f.b(latLng);
                        gVar.lat = Double.valueOf(latLngB.latitude);
                        gVar.lon = Double.valueOf(latLngB.longitude);
                    }
                }
            }
        }
    }

    public static final void m(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GeoPointDTO geoPointDTO = (GeoPointDTO) it.next();
            Double d14 = geoPointDTO.latitude;
            Double d15 = geoPointDTO.longitude;
            if (d14 != null && d15 != null) {
                LatLng latLng = new LatLng(d14.doubleValue(), d15.doubleValue());
                com.garmin.android.library.mapsdkadapter.m mVar = com.garmin.android.library.mapsdkadapter.m.f50298a;
                if (!Double.isNaN(latLng.latitude) && !Double.isNaN(latLng.longitude)) {
                    ie2.f.f93122a.getClass();
                    LatLng latLngB = ie2.f.b(latLng);
                    geoPointDTO.latitude = Double.valueOf(latLngB.latitude);
                    geoPointDTO.longitude = Double.valueOf(latLngB.longitude);
                }
            }
        }
    }

    public static final jd.g n(androidx.room.b0 b0Var, boolean z14, String[] strArr, e23.l lVar) {
        b0Var.getClass();
        androidx.room.m invalidationTracker = b0Var.getInvalidationTracker();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        invalidationTracker.getClass();
        x0 x0Var = invalidationTracker.f10883e;
        p<String[], int[]> pVarG = x0Var.g(strArr2);
        String[] strArr3 = pVarG.f128594a;
        int[] iArr = pVarG.f128595b;
        strArr3.getClass();
        iArr.getClass();
        r53.i c2Var = new c2(new z0(x0Var, iArr, true, strArr3, null));
        androidx.room.r rVar = invalidationTracker.f10891m;
        q qVar = rVar != null ? new q(rVar.f10932h, strArr3) : null;
        if (qVar != null) {
            c2Var = r53.s.E(c2Var, qVar);
        }
        return new jd.g(r53.s.o(c2Var), b0Var, z14, lVar);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    /* JADX WARN: Code duplicated, block: B:28:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    /* JADX WARN: Code duplicated, block: B:32:0x008c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    /* JADX WARN: Code duplicated, block: B:36:0x0095  */
    /* JADX WARN: Code duplicated, block: B:38:0x009b  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[LOOP:1: B:20:0x0055->B:55:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a9, code lost:
    
        if ((r0 != null ? b43.j.e(r0) : false) == true) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final o23.h o(t23.b bVar, o23.h hVar, boolean z14) {
        List<t23.j1> listF;
        n0 returnType;
        n0 n0VarW;
        h hVarT;
        boolean zB;
        Iterator<T> it;
        h hVarT2;
        boolean zE;
        bVar.getClass();
        if (!j.a(bVar)) {
            List<u0> listS = bVar.S();
            listS.getClass();
            if (listS.isEmpty()) {
                listF = bVar.f();
                listF.getClass();
                if (listF.isEmpty()) {
                    returnType = bVar.getReturnType();
                    if (returnType == null) {
                        n0VarW = w(bVar);
                        if (n0VarW != null) {
                            h hVarT3 = n0VarW.F0().t();
                        }
                        return hVar;
                    }
                    hVarT = returnType.F0().t();
                    if (hVarT != null) {
                        zB = j.b(hVarT);
                    } else {
                        zB = false;
                    }
                    if (!zB) {
                        n0VarW = w(bVar);
                        if (n0VarW != null) {
                            h hVarT4 = n0VarW.F0().t();
                        }
                        return hVar;
                    }
                } else {
                    it = listF.iterator();
                    while (it.hasNext()) {
                        n0 type = ((t23.j1) it.next()).getType();
                        type.getClass();
                        hVarT2 = type.F0().t();
                        if (hVarT2 != null) {
                            zE = j.e(hVarT2);
                        } else {
                            zE = false;
                        }
                        if (zE) {
                        }
                    }
                    returnType = bVar.getReturnType();
                    if (returnType == null) {
                        n0VarW = w(bVar);
                        if (n0VarW != null) {
                            h hVarT5 = n0VarW.F0().t();
                        }
                        return hVar;
                    }
                    hVarT = returnType.F0().t();
                    if (hVarT != null) {
                        zB = j.b(hVarT);
                    } else {
                        zB = false;
                    }
                    if (!zB) {
                        n0VarW = w(bVar);
                        if (n0VarW != null) {
                            h hVarT6 = n0VarW.F0().t();
                        }
                        return hVar;
                    }
                }
            } else {
                Iterator<T> it3 = listS.iterator();
                while (it3.hasNext()) {
                    n0 type2 = ((u0) it3.next()).getType();
                    type2.getClass();
                    h hVarT7 = type2.F0().t();
                    if (hVarT7 != null ? j.e(hVarT7) : false) {
                    }
                }
                listF = bVar.f();
                listF.getClass();
                if (listF.isEmpty()) {
                    returnType = bVar.getReturnType();
                    if (returnType == null) {
                        n0VarW = w(bVar);
                        if (n0VarW != null) {
                            h hVarT8 = n0VarW.F0().t();
                        }
                        return hVar;
                    }
                    hVarT = returnType.F0().t();
                    if (hVarT != null) {
                        zB = j.b(hVarT);
                    } else {
                        zB = false;
                    }
                    if (!zB) {
                        n0VarW = w(bVar);
                        if (n0VarW != null) {
                            h hVarT9 = n0VarW.F0().t();
                        }
                        return hVar;
                    }
                } else {
                    it = listF.iterator();
                    while (it.hasNext()) {
                        n0 type3 = ((t23.j1) it.next()).getType();
                        type3.getClass();
                        hVarT2 = type3.F0().t();
                        if (hVarT2 != null) {
                            zE = j.e(hVarT2);
                        } else {
                            zE = false;
                        }
                        if (zE) {
                        }
                    }
                    returnType = bVar.getReturnType();
                    if (returnType == null) {
                        n0VarW = w(bVar);
                        if (n0VarW != null) {
                            h hVarT10 = n0VarW.F0().t();
                        }
                        return hVar;
                    }
                    hVarT = returnType.F0().t();
                    if (hVarT != null) {
                        zB = j.b(hVarT);
                    } else {
                        zB = false;
                    }
                    if (!zB) {
                        n0VarW = w(bVar);
                        if (n0VarW != null) {
                            h hVarT11 = n0VarW.F0().t();
                        }
                        return hVar;
                    }
                }
            }
        }
        return new o23.m(bVar, hVar, z14);
    }

    public static final long p(j0 j0Var) {
        return MathKt.d(j0Var.m() * j0Var.q()) + (((long) j0Var.l()) * ((long) j0Var.q()));
    }

    public static final float q(m mVar, int i14) {
        x1 x1Var = n.f135158a;
        float dimension = ((Resources) mVar.A(AndroidCompositionLocals_androidKt.f6043c)).getDimension(i14) / ((g6.c) mVar.A(t1.f91490h)).getF69050b();
        g6.f.a aVar = g6.f.f75994b;
        return dimension;
    }

    public static final float r(float f14) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f14)) & 8589934591L) / ((long) 3))) + 709952852);
        float f15 = fIntBitsToFloat - ((fIntBitsToFloat - (f14 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f15 - ((f15 - (f14 / (f15 * f15))) * 0.33333334f);
    }

    public static final gj1.a s(List list) {
        Object next;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (s.g(((gj1.a) next).getPrimaryActivityTrackerIndicator(), Boolean.TRUE)) {
                return (gj1.a) next;
            }
        }
        next = null;
        return (gj1.a) next;
    }

    public static final gj1.a t(Long l14, List list) {
        list.getClass();
        Object obj = null;
        if (l14 == null) {
            return null;
        }
        for (Object obj2 : list) {
            gj1.a aVar = (gj1.a) obj2;
            if (aVar != null) {
                Long lF = aVar.getDeviceId();
                long jLongValue = l14.longValue();
                if (lF != null && lF.longValue() == jLongValue) {
                    obj = obj2;
                    break;
                }
            }
        }
        return (gj1.a) obj;
    }

    public static final gj1.b u(gj1.f fVar) {
        List<gj1.b> listB;
        fVar.getClass();
        i iVarH = fVar.getWearableDevices();
        Object obj = null;
        if (iVarH == null || (listB = iVarH.b()) == null) {
            return null;
        }
        for (Object obj2 : listB) {
            if (s.g(((gj1.b) obj2).getPrimaryWearableDevice(), Boolean.TRUE)) {
                obj = obj2;
                break;
            }
        }
        return (gj1.b) obj;
    }

    public static final a0 v(km1.c cVar) {
        cVar.getClass();
        v vVarJ = cVar.getDailySleep();
        if (g22.k.g(vVarJ != null ? vVarJ.s() : null, LocalDate.now())) {
            v vVarJ2 = cVar.getDailySleep();
            if (vVarJ2 != null) {
                return vVarJ2.getNextSleepNeed();
            }
            return null;
        }
        v vVarJ3 = cVar.getDailySleep();
        if (vVarJ3 != null) {
            return vVarJ3.getSleepNeed();
        }
        return null;
    }

    public static final n0 w(t23.b bVar) {
        u0 u0VarI = bVar.I();
        u0 u0VarH = bVar.H();
        if (u0VarI != null) {
            return u0VarI.getType();
        }
        if (u0VarH != null) {
            if (bVar instanceof t23.k) {
                return u0VarH.getType();
            }
            l lVarD = bVar.d();
            t23.e eVar = lVarD instanceof t23.e ? (t23.e) lVarD : null;
            if (eVar != null) {
                return eVar.p();
            }
        }
        return null;
    }

    public static final Method x(Class cls, t23.b bVar) {
        bVar.getClass();
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            declaredMethod.getClass();
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            n23.j.u("No unbox method found in inline class: ", cls, " (calling ", bVar);
            return null;
        }
    }

    public static final Float y(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fMax = ((k00.c) it.next()).f101962b;
        while (it.hasNext()) {
            fMax = Math.max(fMax, ((k00.c) it.next()).f101962b);
        }
        return Float.valueOf(fMax);
    }

    public static final ArrayList z(v0 v0Var) {
        ArrayList arrayListA = A(y1.a(v0Var));
        if (arrayListA == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(y.r(arrayListA, 10));
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        h hVarT = v0Var.F0().t();
        hVarT.getClass();
        Class<?> clsI = s4.i((t23.e) hVarT);
        clsI.getClass();
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(clsI.getDeclaredMethod((String) it3.next(), null));
        }
        return arrayList2;
    }
}
