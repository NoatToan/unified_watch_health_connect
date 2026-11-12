package d70;

import c2.x2;
import cn1.p;
import com.garmin.android.apps.connectmobile.R;
import h4.r;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.t1;
import m92.c0;
import m92.y;
import o4.d0;
import p3.o0;
import p3.p2;
import p3.x1;
import s5.s0;
import w5.q;

/* JADX INFO: loaded from: classes8.dex */
public final class j {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f58113a;

        static {
            int[] iArr = new int[o82.g.values().length];
            try {
                iArr[o82.g.f130853f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o82.g.f130854g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o82.g.f130856i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f58113a = iArr;
        }
    }

    public static final void a(int i14, String str, long j8, p3.m mVar, int i15) {
        o0 o0VarE = mVar.E(-257671243);
        int i16 = (o0VarE.k(i14) ? 4 : 2) | i15 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.l(j8) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            y.a(str, z3.f.c(559830596, new h(i14, j8), o0VarE), o0VarE, ((i16 >> 3) & 14) | 384);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(i14, i15, j8, str);
        }
    }

    public static final void b(r rVar, b bVar, o82.g gVar, p3.m mVar, int i14) {
        int i15;
        o82.g gVar2;
        o0 o0Var;
        rVar.getClass();
        long j8 = bVar.f58083b;
        gVar.getClass();
        o0 o0VarE = mVar.E(466660163);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(bVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.k(gVar.ordinal()) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            String str = bVar.f58082a;
            g6.f.a aVar = g6.f.f75994b;
            r rVarThen = x2.h(x2.f(r.S, 1.0f), 275).then(rVar);
            float f14 = bVar.f58086e;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f15 = j92.b.f97900c.f97910b;
            i53.c<k61.a> cVar = bVar.f58085d;
            ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
            Iterator<k61.a> it = cVar.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f103160a);
            }
            i53.c cVarE = i53.a.e(arrayList);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f16 = j92.b.f97899b.f97916a;
            m92.m.d dVar = new m92.m.d(j8, null);
            n92.n nVar = bVar.f58087f;
            n92.j jVar = new n92.j(new d02.c(), Float.valueOf(0.0f), Float.valueOf(100.0f), 0, 8, null);
            s0 s0Var = new s0((q.b) o0VarE.A(t1.f91493k), new g6.d(((g6.c) o0VarE.A(t1.f91490h)).getF75991a(), 1.0f), (g6.o) o0VarE.A(t1.f91496n), 0, 8, null);
            d92.b.f58624b.getClass();
            gVar2 = gVar;
            o0Var = o0VarE;
            c0.a(rVarThen, str, f16, dVar, true, f15, d0.a(j8), cVarE, Float.valueOf(f14), null, false, gl1.y.Q(o0VarE, R.string.common_no_data), new n92.a(jVar, null, new n92.g(sn.a.c(o0VarE), s0Var, d92.c.f(j92.f.f97935l, o0VarE), null, 8, null), nVar, 2, null), null, z3.f.c(1510190663, new aa2.f(25, bVar, gVar2), o0VarE), o0Var, 24576, 1572864, 44544);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            gVar2 = gVar;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(rVar, bVar, gVar2, i14, 14);
        }
    }
}
