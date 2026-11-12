package qx1;

import c2.a0;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import h4.r;
import p005kotlin.Unit;
import p3.x1;
import u1.w;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f148432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f148433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f148434d;

    public /* synthetic */ k(boolean z14, boolean z15, e23.l lVar) {
        this.f148431a = 1;
        this.f148432b = z14;
        this.f148433c = z15;
        this.f148434d = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:53:0x013b  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f148431a;
        p3.m.a aVar = p3.m.f135153a;
        boolean z14 = this.f148433c;
        Object obj4 = this.f148434d;
        switch (i14) {
            case 0:
                e23.l lVar = (e23.l) obj4;
                r rVar = (r) obj;
                p3.m mVar = (p3.m) obj2;
                v.h.y(134046522, rVar, (Integer) obj3, mVar);
                x1 x1Var = p3.n.f135158a;
                boolean zB = mVar.B(lVar) | mVar.h(z14);
                Object objQ = mVar.q();
                if (zB) {
                    objQ = new ad0.e(lVar, z14, 14);
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ad0.e(lVar, z14, 14);
                        mVar.K(objQ);
                    }
                }
                r rVarD = w.d(rVar, this.f148432b, null, null, (e23.a) objQ, 14);
                mVar.f();
                return rVarD;
            case 1:
                e23.l lVar2 = (e23.l) obj4;
                r rVar2 = (r) obj;
                p3.m mVar2 = (p3.m) obj2;
                v.h.y(-337926029, rVar2, (Integer) obj3, mVar2);
                x1 x1Var2 = p3.n.f135158a;
                boolean zB2 = mVar2.B(lVar2);
                boolean z15 = this.f148432b;
                boolean zH = zB2 | mVar2.h(z15);
                Object objQ2 = mVar2.q();
                if (zH) {
                    objQ2 = new ad0.e(lVar2, z15, 13);
                    mVar2.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new ad0.e(lVar2, z15, 13);
                        mVar2.K(objQ2);
                    }
                }
                r rVarB = j2.b.b(rVar2, z15, this.f148433c, null, (e23.a) objQ2, 12);
                mVar2.f();
                return rVarB;
            default:
                i53.c<r90.a> cVar = (i53.c) obj4;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar3.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    if (this.f148432b) {
                        mVar3.C(2005466382);
                        za0.q.a(x2.d(r.S, 1.0f), mVar3, 6);
                        mVar3.f();
                    } else {
                        mVar3.C(2005569519);
                        for (r90.a aVar2 : cVar) {
                            mVar3.C(203245331);
                            aVar2.getClass();
                            j22.g gVar = aVar2.f151353a;
                            int[] iArr = r90.a.C2846a.f151355a;
                            Integer numValueOf = null;
                            Integer numValueOf2 = iArr[aVar2.ordinal()] == 1 ? Integer.valueOf(R.string.lbl_notification_access) : gVar != null ? Integer.valueOf(gVar.f96772a) : null;
                            int i15 = iArr[aVar2.ordinal()];
                            if (i15 == 1) {
                                numValueOf = Integer.valueOf(R.string.notifications_permission_description_settings);
                            } else if (i15 == 2) {
                                numValueOf = Integer.valueOf(z14 ? R.string.location_permission_description_settings_v2 : R.string.location_permission_description_settings);
                            } else if (gVar != null) {
                                numValueOf = Integer.valueOf(gVar.f96773b);
                            }
                            if (numValueOf2 != null && numValueOf != null) {
                                za0.q.d(aVar2.f151354b, numValueOf2.intValue(), numValueOf.intValue(), mVar3, 0);
                            }
                            mVar3.f();
                        }
                        mVar3.f();
                    }
                    x1 x1Var4 = p3.n.f135158a;
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ k(Object obj, boolean z14, boolean z15, int i14) {
        this.f148431a = i14;
        this.f148432b = z14;
        this.f148434d = obj;
        this.f148433c = z15;
    }
}
