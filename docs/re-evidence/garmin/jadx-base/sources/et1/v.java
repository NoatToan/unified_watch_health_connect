package et1;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.personalizedinsights.presentation.dev.PersonalizedInsightsDevMenuActivity;
import i3.mh;
import java.util.Set;
import l72.g3;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class v implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f65901b;

    public /* synthetic */ v(Object obj, int i14) {
        this.f65900a = i14;
        this.f65901b = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        d91.s sVar = (d91.s) this.f65901b;
        c2.c1 c1Var = (c2.c1) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        c1Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(c1Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            zd0.e.d(c1Var.c(aVar, bVar), 0L, mVar, 0);
            String strQ = gl1.y.Q(mVar, R.string.active_intelligence);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c(strQ, c1Var.c(aVar, bVar), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, mVar), mVar, 0, 0, 131068);
            String str = sVar.f58583e;
            if (str == null) {
                mVar.C(574043525);
                mVar.f();
            } else {
                mVar.C(574043526);
                g3.a(0, 0, c1Var.c(aVar, bVar), str, mVar);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        iv1.b bVar = (iv1.b) this.f65901b;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i14 = iv1.b.f95208f;
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            p3.x1 x1Var = p3.n.f135158a;
            bVar.g(mVar, h82.c.f82429e);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        ix0.j jVar = (ix0.j) this.f65901b;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i14 = ix0.j.f95701f;
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            p3.x1 x1Var = p3.n.f135158a;
            jVar.g(mVar, h82.c.f82429e);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        iz1.d dVar = (iz1.d) this.f65901b;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i14 = iz1.d.f95867f;
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            p3.x1 x1Var = p3.n.f135158a;
            dVar.g(mVar, h82.c.f82429e);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        PersonalizedInsightsDevMenuActivity personalizedInsightsDevMenuActivity = (PersonalizedInsightsDevMenuActivity) this.f65901b;
        String str = (String) obj;
        Set<String> set = (Set) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        PersonalizedInsightsDevMenuActivity.a aVar = PersonalizedInsightsDevMenuActivity.f40322b;
        str.getClass();
        set.getClass();
        personalizedInsightsDevMenuActivity.ca().f97885a.c(str, set, zBooleanValue);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0044  */
    private final Object f(Object obj, Object obj2, Object obj3) {
        l11.k kVar = (l11.k) this.f65901b;
        p3.m mVar = (p3.m) obj2;
        ((Integer) obj3).getClass();
        ((r1.e0) obj).getClass();
        p3.x1 x1Var = p3.n.f135158a;
        l72.c1 c1Var = l72.c1.f110940a;
        String strQ = gl1.y.Q(mVar, R.string.generic_error_message);
        String strQ2 = gl1.y.Q(mVar, R.string.connect_iq_try_again);
        String strQ3 = gl1.y.Q(mVar, R.string.lbl_ok);
        boolean zR = mVar.r(kVar);
        Object objQ = mVar.q();
        if (zR) {
            objQ = new jx0.e(kVar, 5);
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new jx0.e(kVar, 5);
                mVar.K(objQ);
            }
        }
        c1Var.a(true, strQ, strQ2, null, null, strQ3, false, false, (e23.a) objQ, null, null, mVar, 6, 0, 1752);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:163:0x0438  */
    /* JADX WARN: Code duplicated, block: B:166:0x044c  */
    /* JADX WARN: Code duplicated, block: B:167:0x0461  */
    /* JADX WARN: Code duplicated, block: B:169:0x046b  */
    /* JADX WARN: Code duplicated, block: B:170:0x0480  */
    /* JADX WARN: Code duplicated, block: B:172:0x049b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0096  */
    /* JADX WARN: Code duplicated, block: B:355:0x0a38  */
    /* JADX WARN: Code duplicated, block: B:360:0x0a55  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r18v20 java.lang.Object, still in use, count: 2, list:
          (r18v20 java.lang.Object) from 0x0434: PHI (r18 I:??) = (r18v14 java.lang.Object), (r18v20 java.lang.Object) binds: [B:160:0x0432, B:419:0x0434] A[DONT_GENERATE, DONT_INLINE]
          (r18v20 java.lang.Object) from 0x0429: CHECK_CAST (j23.l) (r18v20 java.lang.Object)
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
    @Override // e23.q
    public final java.lang.Object invoke(java.lang.Object r39, java.lang.Object r40, java.lang.Object r41) {
        /*
            Method dump skipped, instruction units count: 3382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: et1.v.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
