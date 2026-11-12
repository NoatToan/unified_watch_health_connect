package mw0;

import androidx.room.w0;
import c2.b0;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h5.e0;
import i3.e5;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l72.x0;
import o4.m1;
import p005kotlin.Unit;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import pv0.s;
import w2.a0;

/* JADX INFO: loaded from: classes9.dex */
public final class q {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f121287a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f121287a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00c2  */
    public static final void a(b63.o oVar, List<kw0.a> list, e23.l<? super b63.o, Unit> lVar, p3.m mVar, int i14) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        String strG;
        s sVar;
        Object next;
        oVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(1433701940);
        int i15 = i14 | (o0VarE.r(oVar) ? 4 : 2) | (o0VarE.r(list) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            aw0.a aVar = new aw0.a(a0.s(o0VarE));
            if ((list == null || list.size() != 0) && list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    kw0.a aVar2 = (kw0.a) obj;
                    aVar2.getClass();
                    if (aVar2.f106904b != null) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            ArrayList arrayList6 = new ArrayList();
            o0VarE.C(-896924635);
            for (int i16 = 0; i16 < 7; i16++) {
                b63.i.INSTANCE.getClass();
                b63.o oVarE = b63.q.e(oVar, i16, b63.i.f16190d);
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!p005kotlin.jvm.internal.s.g(((kw0.a) next).f106903a, oVarE));
                    kw0.a aVar3 = (kw0.a) next;
                    if (aVar3 != null) {
                        sVar = aVar3.f106904b;
                    } else {
                        sVar = null;
                    }
                } else {
                    sVar = null;
                }
                int i17 = sVar == null ? -1 : a.f121287a[sVar.ordinal()];
                arrayList6.add(new c82.j(oVarE, i17 != 1 ? i17 != 2 ? c82.h.f.f25735a : new c82.h.e(null, 1, null) : new c82.h.a(null, 1, null), y.P(R.string.lbl_press_to_navigate_to, new Object[]{oVarE.toString()}, o0VarE), false, 8, null));
            }
            o0VarE.g0(false);
            if (arrayList != null) {
                ArrayList arrayList7 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (gl1.d.H((kw0.a) obj2)) {
                        arrayList7.add(obj2);
                    }
                }
                arrayList2 = arrayList7;
            } else {
                arrayList2 = null;
            }
            if (arrayList != null) {
                ArrayList arrayList8 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (!gl1.d.H((kw0.a) obj3)) {
                        arrayList8.add(obj3);
                    }
                }
                arrayList3 = arrayList8;
            } else {
                arrayList3 = null;
            }
            String strC = aVar.c(arrayList2 != null ? Integer.valueOf(arrayList2.size()) : null);
            String strC2 = aVar.c(arrayList3 != null ? Integer.valueOf(arrayList3.size()) : null);
            h4.r.a aVar4 = h4.r.S;
            h4.r rVarE = u1.n.e(aVar4, tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = c2.l.y(rVarE, eVar.f97920e);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            x1 x1Var2 = p3.n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            String strQ = y.Q(o0VarE, R.string.lbl_7_day_log);
            d92.b.f58624b.getClass();
            mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, 0, 0, 131070);
            i53.f fVarJ = i53.a.j(arrayList6);
            bVar.getClass();
            h4.r rVarA = c2.l.A(aVar4, 0.0f, eVar.f97920e, 1);
            if (arrayList2 != null) {
                ArrayList arrayList9 = new ArrayList();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    b63.o oVar2 = ((kw0.a) it3.next()).f106903a;
                    b63.j jVarB = oVar2 != null ? oVar2.b() : null;
                    if (jVarB != null) {
                        arrayList9.add(jVarB);
                    }
                }
                arrayList4 = arrayList9;
            } else {
                arrayList4 = null;
            }
            if (arrayList3 != null) {
                arrayList5 = new ArrayList();
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    b63.o oVar3 = ((kw0.a) it4.next()).f106903a;
                    b63.j jVarB2 = oVar3 != null ? oVar3.b() : null;
                    if (jVarB2 != null) {
                        arrayList5.add(jVarB2);
                    }
                }
            } else {
                arrayList5 = null;
            }
            l22.b bVar3 = aVar.f13319a;
            if (arrayList4 == null && arrayList5 == null) {
                strG = bVar3.getString(R.string.no_data_label);
            } else {
                strG = e5.g(bVar3.a(R.string.lbl_logged_days_yes, arrayList4 != null ? h0.k0(arrayList4, null, null, null, new w0(9), 31) : bVar3.getString(R.string.lbl_no_logged_days)), ". ", bVar3.a(R.string.lbl_logged_days_no, arrayList5 != null ? h0.k0(arrayList5, null, null, null, new w0(10), 31) : bVar3.getString(R.string.lbl_no_logged_days)));
            }
            a12.c.a(fVarJ, strG, rVarA, null, lVar, o0VarE, 3080 | (57344 & (i15 << 6)));
            o0VarE = o0VarE;
            x0 x0Var = x0.f111346a;
            h4.r.a aVar6 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            x0Var.e(c2.l.A(aVar6, 0.0f, j92.b.f97899b.f97920e, 1), z3.f.c(-497364027, new b(strC, aVar, strC2, 2), o0VarE), o0VarE, (x0.f111348c << 6) | 48, 0);
            o0VarE.g0(true);
            x1 x1Var3 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new lb0.a((Object) oVar, (Object) list, (Object) lVar, i14, 29);
        }
    }
}
