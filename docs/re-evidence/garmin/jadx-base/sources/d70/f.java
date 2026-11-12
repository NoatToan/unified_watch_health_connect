package d70;

import c2.q;
import c2.u;
import c2.x2;
import c22.t;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import f5.k2;
import f5.y0;
import h4.r;
import h5.e0;
import i3.i7;
import i3.mc;
import i3.pc;
import i3.z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.t1;
import l3.e1;
import l72.b1;
import lc.u0;
import me2.y;
import o4.d0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import p3.x3;
import p3.y3;
import p5.v;
import s5.x0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f58103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f58104c;

    public /* synthetic */ f(float f14, Object obj, int i14) {
        this.f58102a = i14;
        this.f58103b = f14;
        this.f58104c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:89:0x02b9 A[PHI: r2
      0x02b9: PHI (r2v9 i3.pc) = (r2v8 i3.pc), (r2v10 i3.pc), (r2v11 i3.pc), (r2v12 i3.pc), (r2v14 i3.pc), (r2v15 i3.pc), (r2v16 i3.pc) binds: [B:107:0x02f2, B:98:0x02d7, B:101:0x02e0, B:104:0x02e9, B:88:0x02b7, B:91:0x02c1, B:94:0x02ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        pc pcVar;
        int i14 = this.f58102a;
        Object[] objArr = 0;
        float f14 = this.f58103b;
        Object obj3 = this.f58104c;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                g.b((x0) obj3, f14, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                int i15 = com.garmin.android.apps.connectmobile.bic.a.f30723c;
                ((com.garmin.android.apps.connectmobile.bic.a) obj3).ca(f14, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 2:
                mc mcVar = (mc) obj3;
                float fI = g6.a.i(((g6.a) obj2).f75988a);
                float f15 = (int) (((g6.m) obj).f76013a & 4294967295L);
                l3.p0 p0Var = new l3.p0();
                if (!mcVar.f88992a) {
                    p0Var.a(pc.PartiallyExpanded, fI - f14);
                }
                if (f15 != f14) {
                    p0Var.a(pc.Expanded, Math.max(fI - f15, 0.0f));
                }
                if (!mcVar.f88994c) {
                    p0Var.a(pc.Hidden, fI);
                }
                Unit unit = Unit.INSTANCE;
                e1 e1Var = new e1(p0Var.f109381a);
                pc pcVar2 = (pc) mcVar.f88996e.f109326h.getF182175a();
                int i16 = z0.a.f90508a[pcVar2.ordinal()];
                Map<T, Float> map = e1Var.f109228a;
                if (i16 == 1) {
                    pcVar = pc.Hidden;
                    if (map.containsKey(pcVar)) {
                        pcVar2 = pcVar;
                    }
                } else if (i16 == 2) {
                    pcVar = pc.PartiallyExpanded;
                    if (map.containsKey(pcVar)) {
                        pcVar2 = pcVar;
                    } else {
                        pcVar = pc.Expanded;
                        if (map.containsKey(pcVar)) {
                            pcVar2 = pcVar;
                        } else {
                            pcVar = pc.Hidden;
                            if (map.containsKey(pcVar)) {
                                pcVar2 = pcVar;
                            }
                        }
                    }
                } else {
                    if (i16 != 3) {
                        u0.r();
                        return null;
                    }
                    pcVar = pc.Expanded;
                    if (map.containsKey(pcVar)) {
                        pcVar2 = pcVar;
                    } else {
                        pcVar = pc.PartiallyExpanded;
                        if (map.containsKey(pcVar)) {
                            pcVar2 = pcVar;
                        } else {
                            pcVar = pc.Hidden;
                            if (map.containsKey(pcVar)) {
                                pcVar2 = pcVar;
                            }
                        }
                    }
                }
                return new o13.p(e1Var, pcVar2);
            case 3:
                String str = (String) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.d.f81522a.getClass();
                    h4.g gVar = h4.d.a.f81528f;
                    r.a aVar = r.S;
                    g6.f.a aVar2 = g6.f.f75994b;
                    r rVarQ = x2.q(aVar, 48);
                    Object objQ = mVar.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new b1(1);
                        mVar.K(objQ);
                    }
                    r rVarB = v.b(rVarQ, (e23.l) objQ);
                    f5.z0 z0VarD = q.d(gVar, false);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC = h4.k.c(rVarB, mVar);
                    h5.g.V.getClass();
                    e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar3);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    u uVar = u.f22885a;
                    u4.d.b bVar2 = u4.d.f168373k;
                    u4.d dVarB = n5.e.b(R.drawable.compass_outline, mVar, 6);
                    d0.f128823b.getClass();
                    i7.b(dVarB, null, l4.k.g(x2.q(aVar, 40), -f14), d0.f128832k, mVar, 3120, 0);
                    y3 y3Var = t1.f91490h;
                    p3.v.a(y3Var.c(new g6.d(((g6.c) mVar.A(y3Var)).getF75991a(), 1.0f)), z3.f.c(1264229624, new fv1.b(str, 17), mVar), mVar, 56);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                y.c((le2.d) obj3, f14, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                z3.e eVar = (z3.e) obj3;
                k2 k2Var = (k2) obj;
                g6.a aVar4 = (g6.a) obj2;
                k2Var.getClass();
                int iF0 = k2Var.f0(f14);
                List listF0 = k2Var.F0(eVar, r21.m.Main);
                int size = listF0.size();
                int i17 = size - 1;
                if (i17 < 0) {
                    i17 = 0;
                }
                int iJ = (g6.a.j(aVar4.f75988a) - (i17 * iF0)) / size;
                if (iJ < 0) {
                    iJ = 0;
                }
                long jB = g6.b.b(iJ, 0, 13);
                Iterator it = listF0.iterator();
                if (!it.hasNext()) {
                    t.g();
                    return null;
                }
                int i18 = ((y0) it.next()).Q(jB).f69145b;
                while (it.hasNext()) {
                    int i19 = ((y0) it.next()).Q(jB).f69145b;
                    if (i18 < i19) {
                        i18 = i19;
                    }
                }
                g6.a.f75987b.getClass();
                long jC = g6.a.C1525a.c(iJ, i18);
                List listF1 = k2Var.F0(eVar, r21.m.Dependent);
                ArrayList arrayList = new ArrayList(p13.y.r(listF1, 10));
                Iterator it3 = listF1.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((y0) it3.next()).Q(jC));
                }
                return f5.b1.h0(k2Var, g6.a.j(aVar4.f75988a), i18, new r21.e(arrayList, iJ, iF0, objArr == true ? 1 : 0));
            case 6:
                ((Integer) obj2).getClass();
                sg2.d.d((c2.t) obj3, f14, (p3.m) obj, p0.t(7));
                return Unit.INSTANCE;
            default:
                x3 x3Var = (x3) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.badges.redesign.b.a aVar5 = com.garmin.android.apps.connectmobile.badges.redesign.b.X;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    for (com.garmin.android.apps.connectmobile.badges.service.model.p pVar : (List) x3Var.getF182175a()) {
                        com.garmin.android.apps.connectmobile.userprofile.model.k kVar = com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND;
                        Long userLevel = pVar.getUserLevel();
                        b12.k.b(null, null, this.f58103b, pVar.i(kVar, userLevel != null ? Integer.valueOf((int) userLevel.longValue()) : null), mVar2, (b12.b.f14385f << 9) | 384, 19);
                    }
                    x1 x1Var3 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ f(Object obj, float f14, int i14) {
        this.f58102a = i14;
        this.f58104c = obj;
        this.f58103b = f14;
    }

    public /* synthetic */ f(Object obj, float f14, int i14, int i15) {
        this.f58102a = i15;
        this.f58104c = obj;
        this.f58103b = f14;
    }
}
