package zo1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.g3;
import com.google.android.exoplayer2.audio.WavUtil;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.mh;
import i3.ve;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import o4.q1;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
public final class r0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f206443a;

        static {
            int[] iArr = new int[li0.b0.values().length];
            try {
                iArr[li0.b0.FAVORITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[li0.b0.FOLLOWING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f206443a = iArr;
        }
    }

    public static final void a(ps.r rVar, ps.n nVar, p3.m mVar, int i14) {
        int i15;
        ps.r rVar2;
        ps.n nVar2;
        p3.o0 o0VarE = mVar.E(303973354);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(rVar) : o0VarE.r(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(nVar) : o0VarE.r(nVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            vo1.b bVar = (vo1.b) KoinJavaComponent.get$default(vo1.b.class, null, null, 6, null);
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar2.getClass();
            int i16 = i15 << 3;
            rVar2 = rVar;
            nVar2 = nVar;
            bVar.f(c2.l.z(rVarF, f14, eVar.f97918c), rVar2, nVar2, o0VarE, (ps.n.f139941b << 6) | (ps.r.f140175t << 3) | (i16 & 112) | (i16 & 896));
        } else {
            rVar2 = rVar;
            nVar2 = nVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.a(rVar2, nVar2, i14, 27);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    public static final void b(yo1.b bVar, yo1.i iVar, boolean z14, bp1.a aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(282408520);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(iVar) : o0VarE.r(iVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar2) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            boolean z15 = (i15 & 57344) == 16384;
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new yy1.d(aVar2, 24);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new yy1.d(aVar2, 24);
                    o0VarE.K(objQ);
                }
            }
            o0Var = o0VarE;
            p004k6.c.a((e23.a) objQ, null, z3.f.c(1454763409, new g0(0, aVar, aVar2, bVar, iVar, z14), o0VarE), o0Var, 384, 2);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.l(i14, aVar, aVar2, bVar, iVar, z14);
        }
    }

    public static final void c(e2.f0 f0Var, Context context, l22.a aVar, yo1.j jVar, ArrayList arrayList) {
        bp1.a aVar2 = new bp1.a(context, aVar);
        long forUserPk = jVar.getForUserPk();
        List<yo1.i> listG = jVar.g();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((yo1.b) obj).getWinnerUserPk() == forUserPk) {
                arrayList2.add(obj);
            }
        }
        f0Var.a(arrayList2.size(), null, new l0(k0.f206395a, arrayList2), new z3.e(802480018, true, new m0(arrayList2, listG, aVar2)));
        int iA = p13.t0.a(p13.y.r(listG, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj2 : listG) {
            linkedHashMap.put(Long.valueOf(((yo1.i) obj2).getUserPk()), obj2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (((yo1.b) obj3).getWinnerUserPk() != forUserPk) {
                arrayList3.add(obj3);
            }
        }
        List listN0 = p13.h0.N0(arrayList3, new t0(new s0(linkedHashMap), linkedHashMap));
        f0Var.a(listN0.size(), null, new o0(n0.f206406a, listN0), new z3.e(802480018, true, new p0(listN0, listG, aVar2)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(yo1.b bVar, yo1.i iVar, boolean z14, bp1.a aVar, p3.m mVar, int i14) {
        int i15;
        long jE;
        p3.o0 o0VarE = mVar.E(-43354947);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(iVar) : o0VarE.r(iVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            h4.r.a aVar2 = h4.r.S;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new zk1.d(p1Var, 6);
                o0VarE.K(objQ2);
            }
            h4.r rVarD = u1.w.d(aVar2, false, null, null, (e23.a) objQ2, 15);
            if (z14) {
                o0VarE.C(1285581861);
                jE = com.nimbusds.jose.shaded.gson.internal.a.b(d92.b.f58623a, o0VarE, false);
            } else {
                o0VarE.C(1285583045);
                d92.b.f58623a.getClass();
                jE = d92.b.a(o0VarE).c().e();
                o0VarE.g0(false);
            }
            ve.a(rVarD, null, jE, 0L, 0.0f, 0.0f, null, z3.f.c(-1931881342, new f0(bVar, iVar, aVar), o0VarE), o0VarE, 12582912, 122);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(1200759825);
                Object objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = new zk1.d(p1Var, 7);
                    o0VarE.K(objQ3);
                }
                o0VarE = o0VarE;
                b(bVar, iVar, z14, aVar, (e23.a) objQ3, o0VarE, yo1.b.f198415i | 24576 | (i15 & 14) | (yo1.i.f198488o << 3) | (i15 & 112) | (i15 & 896) | (i15 & 7168));
                o0VarE.g0(false);
            } else {
                o0VarE = o0VarE;
                o0VarE.C(1201025061);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new yy1.g(bVar, iVar, z14, aVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0129  */
    public static final void e(e23.a<Unit> aVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1911095538);
        if (o0VarE.n(i14 & 1, (i14 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            s5.c.b bVarH = l2.h(o0VarE, 1683194376, 0, 1, null);
            o0VarE.C(1683195120);
            d92.b.f58623a.getClass();
            int iJ = bVarH.j(new s5.i0(d92.b.a(o0VarE).k().d(), 0L, (w5.f0) null, (w5.b0) null, (w5.c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null));
            try {
                bVarH.b(gl1.y.Q(o0VarE, R.string.lbl_group_ride_preliminary_footer));
                Unit unit = Unit.INSTANCE;
                bVarH.f(iJ);
                o0VarE.g0(false);
                bVarH.b(StringUtils.SPACE);
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_view_all_climbs);
                bVarH.h("ClimbRankingsMessageTag", strQ);
                int iJ2 = bVarH.j(new s5.i0(hb.a.e(o0VarE), 0L, (w5.f0) null, (w5.b0) null, (w5.c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null));
                try {
                    bVarH.b(strQ);
                    bVarH.f(iJ2);
                    bVarH.e();
                    s5.c cVarK = bVarH.k();
                    o0VarE.g0(false);
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
                    h4.r.a aVar2 = h4.r.S;
                    j92.b bVar = d92.b.f58625c;
                    bVar.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97920e;
                    float f15 = eVar.f97920e;
                    bVar.getClass();
                    bVar.getClass();
                    float f16 = eVar.f97918c;
                    bVar.getClass();
                    h4.r rVarB = c2.l.B(aVar2, f14, f16, f15, f15);
                    Object objQ = o0VarE.q();
                    p3.m.a aVar3 = p3.m.f135153a;
                    aVar3.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new yy1.d(aVar, 25);
                        o0VarE.K(objQ);
                    }
                    h4.r rVarD = u1.w.d(rVarB, false, null, null, (e23.a) objQ, 15);
                    boolean zB = o0VarE.B(cVarK);
                    Object objQ2 = o0VarE.q();
                    if (zB) {
                        objQ2 = new ht1.u(cVarK, aVar, 1);
                        o0VarE.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == c2565a) {
                            objQ2 = new ht1.u(cVarK, aVar, 1);
                            o0VarE.K(objQ2);
                        }
                    }
                    p006l2.c0.a(cVarK, rVarD, x0VarF, false, 0, 0, null, (e23.l) objQ2, o0VarE, 0, 120);
                } catch (Throwable th3) {
                    bVarH.f(iJ2);
                    throw th3;
                }
            } catch (Throwable th4) {
                bVarH.f(iJ);
                throw th4;
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w51.n0(aVar, i14, 28);
        }
    }

    public static final void f(p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(558172610);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_group_ride_preliminary_footer_without_activity);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
            h4.r.a aVar = h4.r.S;
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97920e;
            bVar.getClass();
            bVar.getClass();
            float f16 = eVar.f97918c;
            bVar.getClass();
            o0Var = o0VarE;
            mh.c(strQ, c2.l.B(aVar, f14, f16, f15, f15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0Var, 0, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z21.a(i14);
        }
    }

    public static final void g(int i14, p3.m mVar, int i15) {
        p3.o0 o0VarE = mVar.E(831981775);
        int i16 = (o0VarE.k(i14) ? 4 : 2) | i15;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h(gl1.y.Q(o0VarE, i14), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.e(i14, i15, 19);
        }
    }

    public static final void h(String str, p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(-1448155149);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
            h4.r.a aVar = h4.r.S;
            d92.b.f58625c.getClass();
            o0Var = o0VarE;
            mh.c(str, c2.l.A(aVar, j92.b.f97899b.f97920e, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0Var, i15 & 14, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vd0.b(str, i14, 28);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0248  */
    public static final void i(final yo1.h hVar, final e23.l lVar, final e23.l lVar2, final q qVar, String str, final boolean z14, final String str2, final e23.l lVar3, p3.m mVar, int i14) throws Throwable {
        p3.o0 o0Var;
        Throwable th3;
        ArrayList arrayList;
        m00.a aVar;
        boolean z15;
        List<yo1.d> listD;
        Object next;
        int i15;
        Object obj = str;
        final yo1.j jVar = hVar.f198481d;
        lVar.getClass();
        lVar2.getClass();
        qVar.getClass();
        p3.o0 o0VarE = mVar.E(-446586869);
        int i16 = i14 | (o0VarE.r(hVar) ? 4 : 2) | (o0VarE.r(qVar) ? 2048 : 1024) | (o0VarE.B(obj) ? 16384 : 8192) | (o0VarE.h(z14) ? 131072 : 65536) | (o0VarE.B(str2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(lVar3) ? 8388608 : 4194304);
        if (o0VarE.n(i16 & 1, (4793491 & i16) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            final ps.r rVar = hVar.f198482e;
            final ps.n nVar = hVar.f198483f;
            String str3 = hVar.f198480c;
            final List<ps.x1> list = hVar.f198484g;
            final ActivityDetailChartDTO activityDetailChartDTO = hVar.f198485h;
            final yo1.f fVar = hVar.f198486i;
            final List listK = p13.x.k(Integer.valueOf(wo1.b.TOP_3_CLIMB.f186455a), Integer.valueOf(wo1.b.FIRST_CLIMB.f186455a), Integer.valueOf(wo1.b.SECOND_CLIMB.f186455a), Integer.valueOf(wo1.b.THIRD_CLIMB.f186455a), Integer.valueOf(wo1.b.DEFAULT_2ND.f186455a), Integer.valueOf(wo1.b.NOT_LAST_PLACE.f186455a), Integer.valueOf(wo1.b.CONSOLATION.f186455a));
            final Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            final l22.a aVar2 = new l22.a(context);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            final p1 p1Var = (p1) objQ;
            final p1 p1VarG = o53.f0.G(qVar.f206427n, o0VarE);
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarE.r(qVar);
            Object objQ2 = o0VarE.q();
            Throwable th4 = null;
            if (zR || objQ2 == c2565a) {
                objQ2 = new q0(qVar, null);
                o0VarE.K(objQ2);
            }
            p3.l0.e((e23.p) objQ2, unit, o0VarE);
            final boolean z16 = (str3 == null && rVar == null) ? false : true;
            final boolean z17 = jVar.getFinal();
            final ArrayList arrayList2 = new ArrayList();
            m00.a aVar3 = new m00.a(context, null, 2, null);
            List<yo1.i> listG = jVar.g();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : listG) {
                if (((yo1.i) obj2).getUserPk() != jVar.getForUserPk()) {
                    arrayList3.add(obj2);
                }
            }
            int size = arrayList3.size();
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj3 : list) {
                    Throwable th5 = th4;
                    ps.x1 x1Var2 = (ps.x1) obj3;
                    if (x1Var2.getGroupRideCompetitionId() != null) {
                        i15 = size;
                        if (obj == null || obj.equals(x1Var2.getGroupRideSessionUuid())) {
                            arrayList.add(obj3);
                        }
                    } else {
                        i15 = size;
                    }
                    th4 = th5;
                    size = i15;
                }
                th3 = th4;
            } else {
                th3 = null;
                arrayList = null;
            }
            final int i17 = size;
            if (arrayList == null) {
                o0VarE.C(1541578533);
                o0VarE.g0(false);
                aVar = aVar3;
            } else {
                o0VarE.C(1541578534);
                Iterator it = arrayList.iterator();
                int i18 = 0;
                while (it.hasNext()) {
                    Object next2 = it.next();
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        p13.x.q();
                        throw th3;
                    }
                    ps.x1 x1Var3 = (ps.x1) next2;
                    String strG = aVar3.g(Integer.valueOf(i19));
                    Iterator it3 = it;
                    m00.a aVar4 = aVar3;
                    String strP = gl1.y.P(R.string.lbl_value1_of_value2, new Object[]{aVar3.g(Integer.valueOf(i19)), String.valueOf(arrayList.size())}, o0VarE);
                    if (fVar != null && (listD = fVar.d()) != null) {
                        Iterator it4 = listD.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                next = th3;
                                break;
                            }
                            next = it4.next();
                            long competitionId = ((yo1.d) next).getCompetitionId();
                            Long groupRideCompetitionId = x1Var3.getGroupRideCompetitionId();
                            if (groupRideCompetitionId != null && competitionId == groupRideCompetitionId.longValue()) {
                                if (obj == null || obj.equals(x1Var3.getGroupRideSessionUuid())) {
                                    break;
                                }
                            }
                            it4 = it4;
                        }
                        yo1.d dVar = (yo1.d) next;
                        if (dVar != null) {
                            z15 = dVar.getFinal();
                        }
                    }
                    arrayList2.add(new c(x1Var3, strG, strP, z15));
                    obj = str;
                    i18 = i19;
                    it = it3;
                    aVar3 = aVar4;
                }
                aVar = aVar3;
                o0VarE.g0(false);
                Unit unit2 = Unit.INSTANCE;
            }
            final m00.a aVar5 = aVar;
            o0Var = o0VarE;
            ve.a(x2.d(h4.r.S, 1.0f), null, vb.h.f(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(1795221670, new e23.p() { // from class: zo1.i0
                /* JADX WARN: Code duplicated, block: B:18:0x0123  */
                /* JADX WARN: Code duplicated, block: B:20:0x012b  */
                /* JADX WARN: Code duplicated, block: B:21:0x0135  */
                /* JADX WARN: Code duplicated, block: B:23:0x0146  */
                /* JADX WARN: Code duplicated, block: B:26:0x016d  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.p
                public final Object invoke(Object obj4, Object obj5) {
                    final p1 p1Var2;
                    yo1.f fVar2;
                    p1 p1Var3;
                    Object objQ3;
                    p3.m mVar2 = (p3.m) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        x1 x1Var4 = p3.n.f135158a;
                        final yo1.h hVar2 = hVar;
                        boolean zR2 = mVar2.r(hVar2);
                        final ps.r rVar2 = rVar;
                        boolean zR3 = zR2 | mVar2.r(rVar2);
                        final ps.n nVar2 = nVar;
                        boolean zR4 = zR3 | mVar2.r(nVar2);
                        final boolean z18 = z17;
                        boolean zH = zR4 | mVar2.h(z18);
                        final yo1.j jVar2 = jVar;
                        boolean zR5 = zH | mVar2.r(jVar2);
                        final Context context2 = context;
                        boolean zR6 = zR5 | mVar2.r(context2);
                        final l22.a aVar6 = aVar2;
                        boolean zR7 = zR6 | mVar2.r(aVar6);
                        final ArrayList arrayList4 = arrayList2;
                        boolean zR8 = zR7 | mVar2.r(arrayList4);
                        final int i24 = i17;
                        boolean zK = zR8 | mVar2.k(i24);
                        final boolean z19 = z14;
                        boolean zH2 = zK | mVar2.h(z19);
                        final String str4 = str2;
                        boolean zB = zH2 | mVar2.B(str4);
                        final m00.a aVar7 = aVar5;
                        boolean zR9 = zB | mVar2.r(aVar7);
                        final yo1.f fVar3 = fVar;
                        boolean zR10 = zR9 | mVar2.r(fVar3);
                        final e23.l lVar4 = lVar2;
                        boolean zB2 = zR10 | mVar2.B(lVar4);
                        final List list2 = list;
                        boolean zR11 = zB2 | mVar2.r(list2);
                        final ActivityDetailChartDTO activityDetailChartDTO2 = activityDetailChartDTO;
                        boolean zR12 = zR11 | mVar2.r(activityDetailChartDTO2);
                        final boolean z24 = z16;
                        boolean zH3 = zR12 | mVar2.h(z24);
                        final e23.l lVar5 = lVar3;
                        boolean zB3 = zH3 | mVar2.B(lVar5);
                        final x3 x3Var = p1VarG;
                        boolean zB4 = zB3 | mVar2.B(x3Var);
                        final q qVar2 = qVar;
                        boolean zR13 = zB4 | mVar2.r(qVar2);
                        Object objQ4 = mVar2.q();
                        p1 p1Var4 = p1Var;
                        p3.m.a aVar8 = p3.m.f135153a;
                        if (zR13) {
                            p1Var2 = p1Var4;
                        } else {
                            aVar8.getClass();
                            p1Var2 = p1Var4;
                            if (objQ4 != p3.m.a.f135155b) {
                                fVar2 = fVar3;
                                p1Var3 = p1Var2;
                            }
                            e2.c.b(null, null, null, null, null, null, false, null, (e23.l) objQ4, mVar2, 0, 511);
                            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                                mVar2.C(-1368529605);
                                if (list2 == null) {
                                    mVar2.C(525255206);
                                    mVar2.f();
                                } else {
                                    mVar2.C(525255207);
                                    objQ3 = mVar2.q();
                                    aVar8.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new zk1.d(p1Var3, 8);
                                        mVar2.K(objQ3);
                                    }
                                    lVar.invoke(new b(list2, activityDetailChartDTO2, fVar2, z24, (e23.a) objQ3));
                                    mVar2.f();
                                }
                                mVar2.f();
                            } else {
                                mVar2.C(525685084);
                                mVar2.f();
                            }
                        }
                        final List list3 = listK;
                        e23.l lVar6 = new e23.l() { // from class: zo1.d0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.l
                            public final Object invoke(Object obj6) {
                                ActivityDetailChartDTO activityDetailChartDTO3;
                                boolean z25;
                                ArrayList arrayList5;
                                int i25;
                                int i26;
                                final List list4;
                                final m00.a aVar9;
                                v60.a aVar10;
                                ArrayList arrayList6;
                                Object obj7;
                                boolean z26;
                                ArrayList arrayList7;
                                ps.r rVar3;
                                ps.n nVar3;
                                e2.f0 f0Var = (e2.f0) obj6;
                                f0Var.getClass();
                                e.f206278a.getClass();
                                e2.f0.b(f0Var, null, e.f206279b, 3);
                                if (hVar2.f198487j && (rVar3 = rVar2) != null && (nVar3 = nVar2) != null) {
                                    e2.f0.b(f0Var, null, new z3.e(-357630602, true, new yu1.h(5, rVar3, nVar3)), 3);
                                }
                                boolean z27 = z18;
                                yo1.j jVar3 = jVar2;
                                Context context3 = context2;
                                l22.a aVar11 = aVar6;
                                List list5 = list3;
                                if (z27) {
                                    List<yo1.b> listB = jVar3.b();
                                    if (listB != null) {
                                        arrayList7 = new ArrayList();
                                        for (Object obj8 : listB) {
                                            if (!list5.contains(Integer.valueOf(((yo1.b) obj8).getAwardTypeId()))) {
                                                arrayList7.add(obj8);
                                            }
                                        }
                                    } else {
                                        arrayList7 = null;
                                    }
                                    if (arrayList7 != null && !arrayList7.isEmpty()) {
                                        e.f206278a.getClass();
                                        e2.f0.b(f0Var, null, e.f206280c, 3);
                                        r0.c(f0Var, context3, aVar11, jVar3, arrayList7);
                                        e2.f0.b(f0Var, null, e.f206281d, 3);
                                    }
                                } else {
                                    e2.f0.b(f0Var, null, e.f206282e, 3);
                                }
                                final ArrayList arrayList8 = new ArrayList();
                                ArrayList arrayList9 = arrayList4;
                                for (Object obj9 : arrayList9) {
                                    if (((c) obj9).f206244d) {
                                        arrayList8.add(obj9);
                                    }
                                }
                                boolean zIsEmpty = arrayList8.isEmpty();
                                int i27 = i24;
                                final m00.a aVar12 = aVar7;
                                final yo1.f fVar4 = fVar3;
                                final e23.l lVar7 = lVar4;
                                List list6 = list2;
                                final ActivityDetailChartDTO activityDetailChartDTO4 = activityDetailChartDTO2;
                                final boolean z28 = z24;
                                final e23.l lVar8 = lVar5;
                                p1 p1Var5 = p1Var2;
                                if (zIsEmpty || i27 <= 0) {
                                    activityDetailChartDTO3 = activityDetailChartDTO4;
                                    z25 = z28;
                                    arrayList5 = arrayList9;
                                    i25 = i27;
                                    i26 = 6;
                                    list4 = list6;
                                    aVar9 = aVar12;
                                } else {
                                    boolean z29 = z19;
                                    e2.f0.b(f0Var, null, new z3.e(-1371270146, true, new ng2.j(z29, str4, 2)), 3);
                                    int size2 = arrayList8.size();
                                    i25 = i27;
                                    list4 = list6;
                                    final int i28 = 0;
                                    e23.r rVar4 = new e23.r() { // from class: zo1.j0
                                        /* JADX WARN: Code duplicated, block: B:32:0x011d  */
                                        /* JADX WARN: Code duplicated, block: B:69:0x026b  */
                                        @Override // e23.r
                                        public final Object invoke(Object obj10, Object obj11, Object obj12, Object obj13) {
                                            int i29 = i28;
                                            p3.m.a aVar13 = p3.m.f135153a;
                                            switch (i29) {
                                                case 0:
                                                    int iIntValue2 = ((Integer) obj11).intValue();
                                                    p3.m mVar3 = (p3.m) obj12;
                                                    int iIntValue3 = ((Integer) obj13).intValue();
                                                    ((e2.d) obj10).getClass();
                                                    if ((iIntValue3 & 48) == 0) {
                                                        iIntValue3 |= mVar3.k(iIntValue2) ? 32 : 16;
                                                    }
                                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                                                        x1 x1Var5 = p3.n.f135158a;
                                                        g6.f.a aVar14 = g6.f.f75994b;
                                                        h4.r rVarA = c2.l.A(h4.r.S, 16, 0.0f, 2);
                                                        c2.j.f22691a.getClass();
                                                        c2.j.k kVar = c2.j.f22694d;
                                                        h4.d.f81522a.getClass();
                                                        c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar3, 0);
                                                        int iHashCode = Long.hashCode(mVar3.getU());
                                                        i2 i2VarX = mVar3.x();
                                                        h4.r rVarC = h4.k.c(rVarA, mVar3);
                                                        h5.g.V.getClass();
                                                        h5.e0.a aVar15 = h5.g.a.f81805b;
                                                        if (mVar3.F() == null) {
                                                            p3.p0.l();
                                                            throw null;
                                                        }
                                                        mVar3.z();
                                                        if (mVar3.getT()) {
                                                            mVar3.M(aVar15);
                                                        } else {
                                                            mVar3.c();
                                                        }
                                                        b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                                        b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                                        h5.g.a.b bVar = h5.g.a.f81813j;
                                                        if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                                            v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                                        }
                                                        b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                                        c2.b0 b0Var = c2.b0.f22601a;
                                                        vo1.b bVar2 = (vo1.b) KoinJavaComponent.get$default(vo1.b.class, null, null, 6, null);
                                                        final ArrayList arrayList10 = arrayList8;
                                                        ps.x1 x1Var6 = ((c) arrayList10.get(iIntValue2)).f206241a;
                                                        String str5 = ((c) arrayList10.get(iIntValue2)).f206242b;
                                                        boolean zR14 = mVar3.r(arrayList10);
                                                        final e23.l lVar9 = lVar7;
                                                        boolean zB5 = zR14 | mVar3.B(lVar9);
                                                        final List list7 = list4;
                                                        boolean zR15 = zB5 | mVar3.r(list7);
                                                        final ActivityDetailChartDTO activityDetailChartDTO5 = activityDetailChartDTO4;
                                                        boolean zR16 = zR15 | mVar3.r(activityDetailChartDTO5);
                                                        final yo1.f fVar5 = fVar4;
                                                        boolean zR17 = zR16 | mVar3.r(fVar5);
                                                        final boolean z34 = z28;
                                                        boolean zH4 = zR17 | mVar3.h(z34);
                                                        final e23.l lVar10 = lVar8;
                                                        boolean zB6 = zH4 | mVar3.B(lVar10);
                                                        Object objQ5 = mVar3.q();
                                                        if (zB6) {
                                                            final int i30 = 1;
                                                            e23.p pVar = new e23.p() { // from class: zo1.e0
                                                                @Override // e23.p
                                                                public final Object invoke(Object obj14, Object obj15) {
                                                                    int i34 = i30;
                                                                    int iIntValue4 = ((Integer) obj14).intValue();
                                                                    ((Boolean) obj15).getClass();
                                                                    switch (i34) {
                                                                        case 0:
                                                                            c cVar = (c) arrayList10.get(iIntValue4);
                                                                            ps.x1 x1Var7 = cVar.f206241a;
                                                                            List list8 = list7;
                                                                            if (list8 == null) {
                                                                                list8 = p13.j0.f134944a;
                                                                            }
                                                                            lVar9.invoke(new a(x1Var7, list8, cVar.f206243c, cVar.f206244d, activityDetailChartDTO5, fVar5, z34, true, lVar10));
                                                                            break;
                                                                        default:
                                                                            c cVar2 = (c) arrayList10.get(iIntValue4);
                                                                            ps.x1 x1Var8 = cVar2.f206241a;
                                                                            List list9 = list7;
                                                                            if (list9 == null) {
                                                                                list9 = p13.j0.f134944a;
                                                                            }
                                                                            lVar9.invoke(new a(x1Var8, list9, cVar2.f206243c, cVar2.f206244d, activityDetailChartDTO5, fVar5, z34, true, lVar10));
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            mVar3.K(pVar);
                                                            objQ5 = pVar;
                                                        } else {
                                                            aVar13.getClass();
                                                            if (objQ5 == p3.m.a.f135155b) {
                                                                final int i34 = 1;
                                                                e23.p pVar2 = new e23.p() { // from class: zo1.e0
                                                                    @Override // e23.p
                                                                    public final Object invoke(Object obj14, Object obj15) {
                                                                        int i35 = i34;
                                                                        int iIntValue4 = ((Integer) obj14).intValue();
                                                                        ((Boolean) obj15).getClass();
                                                                        switch (i35) {
                                                                            case 0:
                                                                                c cVar = (c) arrayList10.get(iIntValue4);
                                                                                ps.x1 x1Var7 = cVar.f206241a;
                                                                                List list8 = list7;
                                                                                if (list8 == null) {
                                                                                    list8 = p13.j0.f134944a;
                                                                                }
                                                                                lVar9.invoke(new a(x1Var7, list8, cVar.f206243c, cVar.f206244d, activityDetailChartDTO5, fVar5, z34, true, lVar10));
                                                                                break;
                                                                            default:
                                                                                c cVar2 = (c) arrayList10.get(iIntValue4);
                                                                                ps.x1 x1Var8 = cVar2.f206241a;
                                                                                List list9 = list7;
                                                                                if (list9 == null) {
                                                                                    list9 = p13.j0.f134944a;
                                                                                }
                                                                                lVar9.invoke(new a(x1Var8, list9, cVar2.f206243c, cVar2.f206244d, activityDetailChartDTO5, fVar5, z34, true, lVar10));
                                                                                break;
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                };
                                                                mVar3.K(pVar2);
                                                                objQ5 = pVar2;
                                                            }
                                                        }
                                                        bVar2.h(x1Var6, str5, iIntValue2, aVar12, fVar5, (e23.p) objQ5, mVar3, ps.x1.G1 | ((iIntValue3 << 3) & 896) | (m00.a.f115515e << 9) | (yo1.f.f198451e << 12));
                                                        mVar3.y();
                                                    } else {
                                                        mVar3.e();
                                                    }
                                                    return Unit.INSTANCE;
                                                default:
                                                    int iIntValue4 = ((Integer) obj11).intValue();
                                                    p3.m mVar4 = (p3.m) obj12;
                                                    int iIntValue5 = ((Integer) obj13).intValue();
                                                    ((e2.d) obj10).getClass();
                                                    if ((iIntValue5 & 48) == 0) {
                                                        iIntValue5 |= mVar4.k(iIntValue4) ? 32 : 16;
                                                    }
                                                    if (mVar4.n(iIntValue5 & 1, (iIntValue5 & 145) != 144)) {
                                                        x1 x1Var7 = p3.n.f135158a;
                                                        g6.f.a aVar16 = g6.f.f75994b;
                                                        h4.r rVarA2 = c2.l.A(h4.r.S, 16, 0.0f, 2);
                                                        c2.j.f22691a.getClass();
                                                        c2.j.k kVar2 = c2.j.f22694d;
                                                        h4.d.f81522a.getClass();
                                                        c2.z zVarA2 = c2.y.a(kVar2, h4.d.a.f81536n, mVar4, 0);
                                                        int iHashCode2 = Long.hashCode(mVar4.getU());
                                                        i2 i2VarX2 = mVar4.x();
                                                        h4.r rVarC2 = h4.k.c(rVarA2, mVar4);
                                                        h5.g.V.getClass();
                                                        h5.e0.a aVar17 = h5.g.a.f81805b;
                                                        if (mVar4.F() == null) {
                                                            p3.p0.l();
                                                            throw null;
                                                        }
                                                        mVar4.z();
                                                        if (mVar4.getT()) {
                                                            mVar4.M(aVar17);
                                                        } else {
                                                            mVar4.c();
                                                        }
                                                        b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                                        b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                                        h5.g.a.b bVar3 = h5.g.a.f81813j;
                                                        if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                                            v.h.z(iHashCode2, mVar4, iHashCode2, bVar3);
                                                        }
                                                        b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                                        c2.b0 b0Var2 = c2.b0.f22601a;
                                                        vo1.b bVar4 = (vo1.b) KoinJavaComponent.get$default(vo1.b.class, null, null, 6, null);
                                                        final ArrayList arrayList11 = arrayList8;
                                                        ps.x1 x1Var8 = ((c) arrayList11.get(iIntValue4)).f206241a;
                                                        String str6 = ((c) arrayList11.get(iIntValue4)).f206242b;
                                                        boolean zR18 = mVar4.r(arrayList11);
                                                        final e23.l lVar11 = lVar7;
                                                        boolean zB7 = zR18 | mVar4.B(lVar11);
                                                        final List list8 = list4;
                                                        boolean zR19 = zB7 | mVar4.r(list8);
                                                        final ActivityDetailChartDTO activityDetailChartDTO6 = activityDetailChartDTO4;
                                                        boolean zR20 = zR19 | mVar4.r(activityDetailChartDTO6);
                                                        final yo1.f fVar6 = fVar4;
                                                        boolean zR21 = zR20 | mVar4.r(fVar6);
                                                        final boolean z35 = z28;
                                                        boolean zH5 = zR21 | mVar4.h(z35);
                                                        final e23.l lVar12 = lVar8;
                                                        boolean zB8 = zH5 | mVar4.B(lVar12);
                                                        Object objQ6 = mVar4.q();
                                                        if (zB8) {
                                                            final int i35 = 0;
                                                            e23.p pVar3 = new e23.p() { // from class: zo1.e0
                                                                @Override // e23.p
                                                                public final Object invoke(Object obj14, Object obj15) {
                                                                    int i36 = i35;
                                                                    int iIntValue6 = ((Integer) obj14).intValue();
                                                                    ((Boolean) obj15).getClass();
                                                                    switch (i36) {
                                                                        case 0:
                                                                            c cVar = (c) arrayList11.get(iIntValue6);
                                                                            ps.x1 x1Var9 = cVar.f206241a;
                                                                            List list9 = list8;
                                                                            if (list9 == null) {
                                                                                list9 = p13.j0.f134944a;
                                                                            }
                                                                            lVar11.invoke(new a(x1Var9, list9, cVar.f206243c, cVar.f206244d, activityDetailChartDTO6, fVar6, z35, true, lVar12));
                                                                            break;
                                                                        default:
                                                                            c cVar2 = (c) arrayList11.get(iIntValue6);
                                                                            ps.x1 x1Var10 = cVar2.f206241a;
                                                                            List list10 = list8;
                                                                            if (list10 == null) {
                                                                                list10 = p13.j0.f134944a;
                                                                            }
                                                                            lVar11.invoke(new a(x1Var10, list10, cVar2.f206243c, cVar2.f206244d, activityDetailChartDTO6, fVar6, z35, true, lVar12));
                                                                            break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            };
                                                            mVar4.K(pVar3);
                                                            objQ6 = pVar3;
                                                        } else {
                                                            aVar13.getClass();
                                                            if (objQ6 == p3.m.a.f135155b) {
                                                                final int i36 = 0;
                                                                e23.p pVar4 = new e23.p() { // from class: zo1.e0
                                                                    @Override // e23.p
                                                                    public final Object invoke(Object obj14, Object obj15) {
                                                                        int i37 = i36;
                                                                        int iIntValue6 = ((Integer) obj14).intValue();
                                                                        ((Boolean) obj15).getClass();
                                                                        switch (i37) {
                                                                            case 0:
                                                                                c cVar = (c) arrayList11.get(iIntValue6);
                                                                                ps.x1 x1Var9 = cVar.f206241a;
                                                                                List list9 = list8;
                                                                                if (list9 == null) {
                                                                                    list9 = p13.j0.f134944a;
                                                                                }
                                                                                lVar11.invoke(new a(x1Var9, list9, cVar.f206243c, cVar.f206244d, activityDetailChartDTO6, fVar6, z35, true, lVar12));
                                                                                break;
                                                                            default:
                                                                                c cVar2 = (c) arrayList11.get(iIntValue6);
                                                                                ps.x1 x1Var10 = cVar2.f206241a;
                                                                                List list10 = list8;
                                                                                if (list10 == null) {
                                                                                    list10 = p13.j0.f134944a;
                                                                                }
                                                                                lVar11.invoke(new a(x1Var10, list10, cVar2.f206243c, cVar2.f206244d, activityDetailChartDTO6, fVar6, z35, true, lVar12));
                                                                                break;
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                };
                                                                mVar4.K(pVar4);
                                                                objQ6 = pVar4;
                                                            }
                                                        }
                                                        bVar4.h(x1Var8, str6, iIntValue4, aVar12, fVar6, (e23.p) objQ6, mVar4, ps.x1.G1 | ((iIntValue5 << 3) & 896) | (m00.a.f115515e << 9) | (yo1.f.f198451e << 12));
                                                        mVar4.y();
                                                    } else {
                                                        mVar4.e();
                                                    }
                                                    return Unit.INSTANCE;
                                            }
                                        }
                                    };
                                    z25 = z28;
                                    activityDetailChartDTO3 = activityDetailChartDTO4;
                                    aVar9 = aVar12;
                                    arrayList5 = arrayList9;
                                    i26 = 6;
                                    e2.f0.f(f0Var, size2, null, new z3.e(1475473237, true, rVar4), 6);
                                    if (z27 && z29) {
                                        e2.f0.b(f0Var, null, new z3.e(988249475, true, new ky0.e0(z25, p1Var5, 1)), 3);
                                    }
                                }
                                if (!z27) {
                                    e2.f0.b(f0Var, null, new z3.e(1590897949, true, new xn.t(jVar3, 22)), 3);
                                    List<yo1.b> listB2 = jVar3.b();
                                    if (listB2 != null) {
                                        arrayList6 = new ArrayList();
                                        for (Object obj10 : listB2) {
                                            if (!list5.contains(Integer.valueOf(((yo1.b) obj10).getAwardTypeId()))) {
                                                arrayList6.add(obj10);
                                            }
                                        }
                                    } else {
                                        arrayList6 = null;
                                    }
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        e.f206278a.getClass();
                                        e2.f0.b(f0Var, null, e.f206283f, 3);
                                        r0.c(f0Var, context3, aVar11, jVar3, arrayList6);
                                    }
                                    final ArrayList arrayList10 = new ArrayList();
                                    for (Object obj11 : arrayList5) {
                                        if (!((c) obj11).f206244d) {
                                            arrayList10.add(obj11);
                                        }
                                    }
                                    if (arrayList10.isEmpty() || i25 <= 0) {
                                        obj7 = null;
                                        z26 = true;
                                    } else {
                                        e.f206278a.getClass();
                                        obj7 = null;
                                        e2.f0.b(f0Var, null, e.f206284g, 3);
                                        final int i29 = 1;
                                        final boolean z34 = z25;
                                        final List list7 = list4;
                                        final ActivityDetailChartDTO activityDetailChartDTO5 = activityDetailChartDTO3;
                                        z26 = true;
                                        e2.f0.f(f0Var, arrayList10.size(), null, new z3.e(-1553248414, true, new e23.r() { // from class: zo1.j0
                                            /* JADX WARN: Code duplicated, block: B:32:0x011d  */
                                            /* JADX WARN: Code duplicated, block: B:69:0x026b  */
                                            @Override // e23.r
                                            public final Object invoke(Object obj12, Object obj13, Object obj14, Object obj15) {
                                                int i210 = i29;
                                                p3.m.a aVar13 = p3.m.f135153a;
                                                switch (i210) {
                                                    case 0:
                                                        int iIntValue2 = ((Integer) obj13).intValue();
                                                        p3.m mVar3 = (p3.m) obj14;
                                                        int iIntValue3 = ((Integer) obj15).intValue();
                                                        ((e2.d) obj12).getClass();
                                                        if ((iIntValue3 & 48) == 0) {
                                                            iIntValue3 |= mVar3.k(iIntValue2) ? 32 : 16;
                                                        }
                                                        if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                                                            x1 x1Var5 = p3.n.f135158a;
                                                            g6.f.a aVar14 = g6.f.f75994b;
                                                            h4.r rVarA = c2.l.A(h4.r.S, 16, 0.0f, 2);
                                                            c2.j.f22691a.getClass();
                                                            c2.j.k kVar = c2.j.f22694d;
                                                            h4.d.f81522a.getClass();
                                                            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar3, 0);
                                                            int iHashCode = Long.hashCode(mVar3.getU());
                                                            i2 i2VarX = mVar3.x();
                                                            h4.r rVarC = h4.k.c(rVarA, mVar3);
                                                            h5.g.V.getClass();
                                                            h5.e0.a aVar15 = h5.g.a.f81805b;
                                                            if (mVar3.F() == null) {
                                                                p3.p0.l();
                                                                throw null;
                                                            }
                                                            mVar3.z();
                                                            if (mVar3.getT()) {
                                                                mVar3.M(aVar15);
                                                            } else {
                                                                mVar3.c();
                                                            }
                                                            b4.c(h5.g.a.f81810g, zVarA, mVar3);
                                                            b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                                                            h5.g.a.b bVar = h5.g.a.f81813j;
                                                            if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                                                v.h.z(iHashCode, mVar3, iHashCode, bVar);
                                                            }
                                                            b4.c(h5.g.a.f81807d, rVarC, mVar3);
                                                            c2.b0 b0Var = c2.b0.f22601a;
                                                            vo1.b bVar2 = (vo1.b) KoinJavaComponent.get$default(vo1.b.class, null, null, 6, null);
                                                            final ArrayList arrayList11 = arrayList10;
                                                            ps.x1 x1Var6 = ((c) arrayList11.get(iIntValue2)).f206241a;
                                                            String str5 = ((c) arrayList11.get(iIntValue2)).f206242b;
                                                            boolean zR14 = mVar3.r(arrayList11);
                                                            final e23.l lVar9 = lVar7;
                                                            boolean zB5 = zR14 | mVar3.B(lVar9);
                                                            final List list8 = list7;
                                                            boolean zR15 = zB5 | mVar3.r(list8);
                                                            final ActivityDetailChartDTO activityDetailChartDTO6 = activityDetailChartDTO5;
                                                            boolean zR16 = zR15 | mVar3.r(activityDetailChartDTO6);
                                                            final yo1.f fVar5 = fVar4;
                                                            boolean zR17 = zR16 | mVar3.r(fVar5);
                                                            final boolean z35 = z34;
                                                            boolean zH4 = zR17 | mVar3.h(z35);
                                                            final e23.l lVar10 = lVar8;
                                                            boolean zB6 = zH4 | mVar3.B(lVar10);
                                                            Object objQ5 = mVar3.q();
                                                            if (zB6) {
                                                                final int i34 = 1;
                                                                e23.p pVar2 = new e23.p() { // from class: zo1.e0
                                                                    @Override // e23.p
                                                                    public final Object invoke(Object obj16, Object obj17) {
                                                                        int i37 = i34;
                                                                        int iIntValue6 = ((Integer) obj16).intValue();
                                                                        ((Boolean) obj17).getClass();
                                                                        switch (i37) {
                                                                            case 0:
                                                                                c cVar = (c) arrayList11.get(iIntValue6);
                                                                                ps.x1 x1Var9 = cVar.f206241a;
                                                                                List list9 = list8;
                                                                                if (list9 == null) {
                                                                                    list9 = p13.j0.f134944a;
                                                                                }
                                                                                lVar9.invoke(new a(x1Var9, list9, cVar.f206243c, cVar.f206244d, activityDetailChartDTO6, fVar5, z35, true, lVar10));
                                                                                break;
                                                                            default:
                                                                                c cVar2 = (c) arrayList11.get(iIntValue6);
                                                                                ps.x1 x1Var10 = cVar2.f206241a;
                                                                                List list10 = list8;
                                                                                if (list10 == null) {
                                                                                    list10 = p13.j0.f134944a;
                                                                                }
                                                                                lVar9.invoke(new a(x1Var10, list10, cVar2.f206243c, cVar2.f206244d, activityDetailChartDTO6, fVar5, z35, true, lVar10));
                                                                                break;
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                };
                                                                mVar3.K(pVar2);
                                                                objQ5 = pVar2;
                                                            } else {
                                                                aVar13.getClass();
                                                                if (objQ5 == p3.m.a.f135155b) {
                                                                    final int i35 = 1;
                                                                    e23.p pVar3 = new e23.p() { // from class: zo1.e0
                                                                        @Override // e23.p
                                                                        public final Object invoke(Object obj16, Object obj17) {
                                                                            int i37 = i35;
                                                                            int iIntValue6 = ((Integer) obj16).intValue();
                                                                            ((Boolean) obj17).getClass();
                                                                            switch (i37) {
                                                                                case 0:
                                                                                    c cVar = (c) arrayList11.get(iIntValue6);
                                                                                    ps.x1 x1Var9 = cVar.f206241a;
                                                                                    List list9 = list8;
                                                                                    if (list9 == null) {
                                                                                        list9 = p13.j0.f134944a;
                                                                                    }
                                                                                    lVar9.invoke(new a(x1Var9, list9, cVar.f206243c, cVar.f206244d, activityDetailChartDTO6, fVar5, z35, true, lVar10));
                                                                                    break;
                                                                                default:
                                                                                    c cVar2 = (c) arrayList11.get(iIntValue6);
                                                                                    ps.x1 x1Var10 = cVar2.f206241a;
                                                                                    List list10 = list8;
                                                                                    if (list10 == null) {
                                                                                        list10 = p13.j0.f134944a;
                                                                                    }
                                                                                    lVar9.invoke(new a(x1Var10, list10, cVar2.f206243c, cVar2.f206244d, activityDetailChartDTO6, fVar5, z35, true, lVar10));
                                                                                    break;
                                                                            }
                                                                            return Unit.INSTANCE;
                                                                        }
                                                                    };
                                                                    mVar3.K(pVar3);
                                                                    objQ5 = pVar3;
                                                                }
                                                            }
                                                            bVar2.h(x1Var6, str5, iIntValue2, aVar9, fVar5, (e23.p) objQ5, mVar3, ps.x1.G1 | ((iIntValue3 << 3) & 896) | (m00.a.f115515e << 9) | (yo1.f.f198451e << 12));
                                                            mVar3.y();
                                                        } else {
                                                            mVar3.e();
                                                        }
                                                        return Unit.INSTANCE;
                                                    default:
                                                        int iIntValue4 = ((Integer) obj13).intValue();
                                                        p3.m mVar4 = (p3.m) obj14;
                                                        int iIntValue5 = ((Integer) obj15).intValue();
                                                        ((e2.d) obj12).getClass();
                                                        if ((iIntValue5 & 48) == 0) {
                                                            iIntValue5 |= mVar4.k(iIntValue4) ? 32 : 16;
                                                        }
                                                        if (mVar4.n(iIntValue5 & 1, (iIntValue5 & 145) != 144)) {
                                                            x1 x1Var7 = p3.n.f135158a;
                                                            g6.f.a aVar16 = g6.f.f75994b;
                                                            h4.r rVarA2 = c2.l.A(h4.r.S, 16, 0.0f, 2);
                                                            c2.j.f22691a.getClass();
                                                            c2.j.k kVar2 = c2.j.f22694d;
                                                            h4.d.f81522a.getClass();
                                                            c2.z zVarA2 = c2.y.a(kVar2, h4.d.a.f81536n, mVar4, 0);
                                                            int iHashCode2 = Long.hashCode(mVar4.getU());
                                                            i2 i2VarX2 = mVar4.x();
                                                            h4.r rVarC2 = h4.k.c(rVarA2, mVar4);
                                                            h5.g.V.getClass();
                                                            h5.e0.a aVar17 = h5.g.a.f81805b;
                                                            if (mVar4.F() == null) {
                                                                p3.p0.l();
                                                                throw null;
                                                            }
                                                            mVar4.z();
                                                            if (mVar4.getT()) {
                                                                mVar4.M(aVar17);
                                                            } else {
                                                                mVar4.c();
                                                            }
                                                            b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                                                            b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                                                            h5.g.a.b bVar3 = h5.g.a.f81813j;
                                                            if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                                                                v.h.z(iHashCode2, mVar4, iHashCode2, bVar3);
                                                            }
                                                            b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                                                            c2.b0 b0Var2 = c2.b0.f22601a;
                                                            vo1.b bVar4 = (vo1.b) KoinJavaComponent.get$default(vo1.b.class, null, null, 6, null);
                                                            final ArrayList arrayList12 = arrayList10;
                                                            ps.x1 x1Var8 = ((c) arrayList12.get(iIntValue4)).f206241a;
                                                            String str6 = ((c) arrayList12.get(iIntValue4)).f206242b;
                                                            boolean zR18 = mVar4.r(arrayList12);
                                                            final e23.l lVar11 = lVar7;
                                                            boolean zB7 = zR18 | mVar4.B(lVar11);
                                                            final List list9 = list7;
                                                            boolean zR19 = zB7 | mVar4.r(list9);
                                                            final ActivityDetailChartDTO activityDetailChartDTO7 = activityDetailChartDTO5;
                                                            boolean zR20 = zR19 | mVar4.r(activityDetailChartDTO7);
                                                            final yo1.f fVar6 = fVar4;
                                                            boolean zR21 = zR20 | mVar4.r(fVar6);
                                                            final boolean z36 = z34;
                                                            boolean zH5 = zR21 | mVar4.h(z36);
                                                            final e23.l lVar12 = lVar8;
                                                            boolean zB8 = zH5 | mVar4.B(lVar12);
                                                            Object objQ6 = mVar4.q();
                                                            if (zB8) {
                                                                final int i36 = 0;
                                                                e23.p pVar4 = new e23.p() { // from class: zo1.e0
                                                                    @Override // e23.p
                                                                    public final Object invoke(Object obj16, Object obj17) {
                                                                        int i37 = i36;
                                                                        int iIntValue6 = ((Integer) obj16).intValue();
                                                                        ((Boolean) obj17).getClass();
                                                                        switch (i37) {
                                                                            case 0:
                                                                                c cVar = (c) arrayList12.get(iIntValue6);
                                                                                ps.x1 x1Var9 = cVar.f206241a;
                                                                                List list10 = list9;
                                                                                if (list10 == null) {
                                                                                    list10 = p13.j0.f134944a;
                                                                                }
                                                                                lVar11.invoke(new a(x1Var9, list10, cVar.f206243c, cVar.f206244d, activityDetailChartDTO7, fVar6, z36, true, lVar12));
                                                                                break;
                                                                            default:
                                                                                c cVar2 = (c) arrayList12.get(iIntValue6);
                                                                                ps.x1 x1Var10 = cVar2.f206241a;
                                                                                List list11 = list9;
                                                                                if (list11 == null) {
                                                                                    list11 = p13.j0.f134944a;
                                                                                }
                                                                                lVar11.invoke(new a(x1Var10, list11, cVar2.f206243c, cVar2.f206244d, activityDetailChartDTO7, fVar6, z36, true, lVar12));
                                                                                break;
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                };
                                                                mVar4.K(pVar4);
                                                                objQ6 = pVar4;
                                                            } else {
                                                                aVar13.getClass();
                                                                if (objQ6 == p3.m.a.f135155b) {
                                                                    final int i37 = 0;
                                                                    e23.p pVar5 = new e23.p() { // from class: zo1.e0
                                                                        @Override // e23.p
                                                                        public final Object invoke(Object obj16, Object obj17) {
                                                                            int i38 = i37;
                                                                            int iIntValue6 = ((Integer) obj16).intValue();
                                                                            ((Boolean) obj17).getClass();
                                                                            switch (i38) {
                                                                                case 0:
                                                                                    c cVar = (c) arrayList12.get(iIntValue6);
                                                                                    ps.x1 x1Var9 = cVar.f206241a;
                                                                                    List list10 = list9;
                                                                                    if (list10 == null) {
                                                                                        list10 = p13.j0.f134944a;
                                                                                    }
                                                                                    lVar11.invoke(new a(x1Var9, list10, cVar.f206243c, cVar.f206244d, activityDetailChartDTO7, fVar6, z36, true, lVar12));
                                                                                    break;
                                                                                default:
                                                                                    c cVar2 = (c) arrayList12.get(iIntValue6);
                                                                                    ps.x1 x1Var10 = cVar2.f206241a;
                                                                                    List list11 = list9;
                                                                                    if (list11 == null) {
                                                                                        list11 = p13.j0.f134944a;
                                                                                    }
                                                                                    lVar11.invoke(new a(x1Var10, list11, cVar2.f206243c, cVar2.f206244d, activityDetailChartDTO7, fVar6, z36, true, lVar12));
                                                                                    break;
                                                                            }
                                                                            return Unit.INSTANCE;
                                                                        }
                                                                    };
                                                                    mVar4.K(pVar5);
                                                                    objQ6 = pVar5;
                                                                }
                                                            }
                                                            bVar4.h(x1Var8, str6, iIntValue4, aVar9, fVar6, (e23.p) objQ6, mVar4, ps.x1.G1 | ((iIntValue5 << 3) & 896) | (m00.a.f115515e << 9) | (yo1.f.f198451e << 12));
                                                            mVar4.y();
                                                        } else {
                                                            mVar4.e();
                                                        }
                                                        return Unit.INSTANCE;
                                                }
                                            }
                                        }), i26);
                                    }
                                    e2.f0.b(f0Var, obj7, new z3.e(-21519802, z26, new ky0.e0(z25, p1Var5, 2)), 3);
                                }
                                x3 x3Var2 = x3Var;
                                g3 g3Var = (g3) x3Var2.getF182175a();
                                if (g3Var != null && (aVar10 = (v60.a) g3Var.f35301b) != null && aVar10.f175792a) {
                                    e2.f0.b(f0Var, null, new z3.e(258098748, true, new yu1.h(6, x3Var2, qVar2)), 3);
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        fVar2 = fVar3;
                        p1Var3 = p1Var2;
                        mVar2.K(lVar6);
                        objQ4 = lVar6;
                        e2.c.b(null, null, null, null, null, null, false, null, (e23.l) objQ4, mVar2, 0, 511);
                        if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                            mVar2.C(-1368529605);
                            if (list2 == null) {
                                mVar2.C(525255206);
                                mVar2.f();
                            } else {
                                mVar2.C(525255207);
                                objQ3 = mVar2.q();
                                aVar8.getClass();
                                if (objQ3 == p3.m.a.f135155b) {
                                    objQ3 = new zk1.d(p1Var3, 8);
                                    mVar2.K(objQ3);
                                }
                                lVar.invoke(new b(list2, activityDetailChartDTO2, fVar2, z24, (e23.a) objQ3));
                                mVar2.f();
                            }
                            mVar2.f();
                        } else {
                            mVar2.C(525685084);
                            mVar2.f();
                        }
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0Var, 12582918, 122);
            x1 x1Var4 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e11.n(hVar, lVar, lVar2, qVar, str, z14, str2, lVar3, i14);
        }
    }

    public static final yo1.i j(yo1.b bVar, List list) {
        Object next;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((yo1.i) next).getUserPk() == bVar.getWinnerUserPk()) {
                return (yo1.i) next;
            }
        }
        next = null;
        return (yo1.i) next;
    }

    public static final int k(yo1.i iVar) {
        hi0.a follow;
        hi0.e followStatus;
        li0.b0 b0VarA = (iVar == null || (follow = iVar.getFollow()) == null || (followStatus = follow.getFollowStatus()) == null) ? null : hi0.f.a(followStatus);
        int i14 = b0VarA == null ? -1 : a.f206443a[b0VarA.ordinal()];
        if (i14 != 1) {
            return i14 != 2 ? 1 : 2;
        }
        return 3;
    }
}
