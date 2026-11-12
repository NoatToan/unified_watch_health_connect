package ik1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bv1.v;
import c2.b0;
import c2.j;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import c22.s1;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.audio.WavUtil;
import d53.u;
import e23.q;
import h4.k;
import h5.e0;
import h5.g;
import hk1.f;
import hk1.r;
import i11.i;
import i3.mh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import o4.q1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.i0;
import s5.r0;
import u1.a2;
import v.h;
import v62.fa;
import w5.c0;
import w5.f0;
import yc.l2;
import z3.e;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(r rVar, i53.d dVar, hk1.c cVar, boolean z14, q qVar, e eVar, m mVar, int i14) {
        rVar.getClass();
        dVar.getClass();
        qVar.getClass();
        o0 o0VarE = mVar.E(1681315761);
        int i15 = (i14 & 6) == 0 ? (o0VarE.r(rVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(dVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(cVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(qVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(eVar) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            h4.r.a aVar = h4.r.S;
            h4.r rVarB = a2.b(x2.d(aVar, 1.0f), a2.a(o0VarE), true);
            j.f22691a.getClass();
            j.g gVar = j.f22698h;
            h4.d.f81522a.getClass();
            z zVarA = y.a(gVar, h4.d.a.f81536n, o0VarE, 6);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = k.c(rVarB, o0VarE);
            g.V.getClass();
            e0.a aVar2 = g.a.f81805b;
            int i16 = i15;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            if (!rVar.getUnverified() || ((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(39091931);
                o0VarE.g0(false);
            } else {
                o0VarE.C(39015051);
                Object objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new i(p1Var, 16);
                    o0VarE.K(objQ2);
                }
                d((e23.a) objQ2, o0VarE, 6);
                o0VarE.g0(false);
            }
            if (rVar.getUnverified()) {
                o0VarE.C(39342907);
                o0VarE.g0(false);
            } else {
                o0VarE.C(39193952);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                l.f(x2.h(aVar, j92.b.f97899b.f97920e), o0VarE);
                c(z14, rVar, o0VarE, ((i16 >> 9) & 14) | ((i16 << 3) & 112));
                o0VarE.g0(false);
            }
            boolean isFirstBeatEnabled = rVar.getIsFirstBeatEnabled();
            ArrayList arrayList = new ArrayList();
            Set setKeySet = dVar.keySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : setKeySet) {
                f fVar = ((hk1.d) obj).f84141b;
                Object arrayList2 = linkedHashMap.get(fVar);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(fVar, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            TreeMap treeMap = new TreeMap(new ck1.a());
            treeMap.putAll(linkedHashMap);
            for (Map.Entry entry : treeMap.entrySet()) {
                f fVar2 = (f) entry.getKey();
                List<hk1.d> list = (List) entry.getValue();
                fVar2.getClass();
                arrayList.add(new hk1.i.c(fVar2));
                list.getClass();
                for (hk1.d dVar2 : list) {
                    Boolean bool = (Boolean) dVar.get(dVar2);
                    arrayList.add(new hk1.i.a(dVar2, bool != null ? bool.booleanValue() : false));
                    if (dVar2 == hk1.d.f84135g && isFirstBeatEnabled) {
                        arrayList.add(new hk1.i.b(dVar2));
                    }
                }
            }
            i53.f fVarJ = i53.a.j(arrayList);
            String applicationName = rVar.getApplicationName();
            if (applicationName == null) {
                applicationName = "";
            }
            boolean zR = ((i16 & 57344) == 16384) | o0VarE.r(rVar);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == m.a.f135155b) {
                objQ3 = new hy.h(19, qVar, rVar);
                o0VarE.K(objQ3);
            }
            d.d(0, (e23.l) objQ3, fVarJ, applicationName, o0VarE);
            b(cVar, rVar.getApplicationName(), o0VarE, (i16 >> 6) & 14);
            b71.i.n((i16 >> 15) & 14, eVar, o0VarE, true);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.b(rVar, dVar, cVar, z14, qVar, eVar, i14, 11);
        }
    }

    public static final void b(hk1.c cVar, String str, m mVar, int i14) {
        int i15;
        o0 o0Var;
        int i16;
        String str2;
        o0 o0VarE = mVar.E(1416951601);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(cVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            String str3 = str == null ? "" : str;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarC = l.C(aVar, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            bVar.getClass();
            h4.r rVarA = l.A(rVarC, eVar.f97920e, 0.0f, 2);
            String strV = (cVar == null || (str2 = cVar.f84127a) == null) ? "" : u.v(str2, "[APP]", str3, false);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            String str4 = str3;
            i16 = 0;
            mh.c(strV, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), o0VarE), o0VarE, 0, 0, 131068);
            i53.c<String> cVar2 = cVar != null ? cVar.f84128b : null;
            String strV2 = cVar2 != null ? u.v(h0.k0(cVar2, "\n", null, null, null, 62), "[APP]", str4, false) : "";
            fVar.getClass();
            mh.c(strV2, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131068);
            s5.c.b bVarH = l2.h(o0VarE, 185880327, 0, 1, null);
            o0VarE.C(185881282);
            ck1.d.f27908a.getClass();
            Locale locale = Locale.getDefault();
            locale.getClass();
            int iG = bVarH.g(new s5.m.b(String.format("https://support.garmin.com/%s/?faq=glJyCFNknq1gbFIL4MBGn6", Arrays.copyOf(new Object[]{s1.b(locale)}, 1)), new r0(new i0(hb.a.e(o0VarE), 0L, (f0) null, (w5.b0) null, (c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null), null, null, null, 14, null), null, 4, null));
            try {
                bVarH.b(gl1.y.Q(o0VarE, R.string.common_learn_more));
                Unit unit = Unit.INSTANCE;
                bVarH.f(iG);
                o0VarE.g0(false);
                s5.c cVarK = bVarH.k();
                o0VarE.g0(false);
                mh.d(cVarK, rVarA, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, null, o0VarE, 0, 0, 524284);
                i53.c<String> cVar3 = cVar != null ? cVar.f84129c : null;
                String strV3 = cVar3 != null ? u.v(h0.k0(cVar3, "\n", null, null, null, 62), "[APP]", str4, false) : "";
                fVar.getClass();
                o0Var = o0VarE;
                mh.c(strV3, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0Var, 0, 0, 131068);
            } catch (Throwable th3) {
                bVarH.f(iG);
                throw th3;
            }
        } else {
            o0Var = o0VarE;
            i16 = 0;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(cVar, str, i14, i16);
        }
    }

    public static final void c(boolean z14, r rVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        rVar.getClass();
        o0 o0VarE = mVar.E(1258497636);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(rVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            if (z14) {
                o0VarE.C(1133707595);
                wf.f.a aVar = new wf.f.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
                aVar.f184930c = rVar.getImageUrl();
                wf.g.a(aVar);
                jf.r.b(aVar.a(), gl1.y.Q(o0VarE, R.string.default_image_view_content_description), x2.h(x2.f(h4.r.S, 1.0f), kk1.d.f105141a), null, n5.c.a(2131232717, o0VarE, 0), n5.c.a(2131232717, o0VarE, 0), null, null, null, null, null, null, o0VarE, 384, 0, 32712);
                o0Var = o0VarE;
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                o0Var.C(1134310142);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new v(z14, rVar, i14, 4);
        }
    }

    public static final void d(e23.a<Unit> aVar, m mVar, int i14) {
        e23.a<Unit> aVar2;
        aVar.getClass();
        o0 o0VarE = mVar.E(-182051884);
        if (o0VarE.n(i14 & 1, (i14 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            l72.s sVar = l72.s.f111232a;
            h4.r.a aVar3 = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            float f15 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarC = l.C(aVar3, f14, eVar.f97920e, f15, 0.0f, 8);
            l72.s.b bVar2 = l72.s.b.INFO;
            s62.a.f157643a.getClass();
            aVar2 = aVar;
            sVar.d(rVarC, bVar2, fa.a(t62.b.f162798a), gl1.y.Q(o0VarE, R.string.unverified_app_title), gl1.y.Q(o0VarE, R.string.unverified_app_message), null, null, aVar2, o0VarE, 100663344, 224);
        } else {
            aVar2 = aVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hl1.i(aVar2, i14, 8);
        }
    }
}
