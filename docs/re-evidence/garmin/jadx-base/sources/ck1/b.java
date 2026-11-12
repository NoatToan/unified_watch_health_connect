package ck1;

import com.garmin.android.apps.connectmobile.settings.thirdparty.details.ThirdPartyConnectActivity;
import e23.p;
import hk1.l;
import hk1.q;
import hk1.w;
import hk1.y;
import jk1.e;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.m;
import p3.n;
import p3.p1;
import p3.v;
import p3.x1;
import r53.p2;
import z3.f;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThirdPartyConnectActivity f27904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f27905c;

    public /* synthetic */ b(ThirdPartyConnectActivity thirdPartyConnectActivity, p1 p1Var, int i14) {
        this.f27903a = i14;
        this.f27904b = thirdPartyConnectActivity;
        this.f27905c = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f27903a;
        p1 p1Var = this.f27905c;
        final ThirdPartyConnectActivity thirdPartyConnectActivity = this.f27904b;
        final int i15 = 2;
        Object[] objArr = 0;
        final int i16 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ThirdPartyConnectActivity.a aVar = ThirdPartyConnectActivity.f43974c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    v.a(g02.d.f74342a.c(thirdPartyConnectActivity.getOnBackPressedDispatcher()), f.c(-77170818, new b(thirdPartyConnectActivity, p1Var, i16), mVar), mVar, 56);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ThirdPartyConnectActivity.a aVar2 = ThirdPartyConnectActivity.f43974c;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    y yVar = ((e) p1Var.getF182175a()).f99391e;
                    boolean z14 = yVar instanceof y.b;
                    m.a aVar3 = m.f135153a;
                    if (z14) {
                        mVar2.C(-1188202686);
                        Object value = thirdPartyConnectActivity.f43976b.getValue();
                        value.getClass();
                        String str = (String) value;
                        jk1.f fVar = thirdPartyConnectActivity.f43975a;
                        if (fVar == null) {
                            s.m("viewModel");
                            throw null;
                        }
                        boolean zR = mVar2.r(thirdPartyConnectActivity);
                        Object objQ = mVar2.q();
                        if (zR) {
                            final Object[] objArr2 = objArr == true ? 1 : 0;
                            objQ = new e23.a() { // from class: ck1.c
                                @Override // e23.a
                                public final Object invoke() {
                                    l lVar;
                                    Object value2;
                                    int i17 = objArr2;
                                    ThirdPartyConnectActivity thirdPartyConnectActivity2 = thirdPartyConnectActivity;
                                    switch (i17) {
                                        case 0:
                                            ThirdPartyConnectActivity.a aVar4 = ThirdPartyConnectActivity.f43974c;
                                            thirdPartyConnectActivity2.onBackPressed();
                                            return Unit.INSTANCE;
                                        case 1:
                                            jk1.f fVar2 = thirdPartyConnectActivity2.f43975a;
                                            if (fVar2 == null) {
                                                s.m("viewModel");
                                                throw null;
                                            }
                                            p2 p2Var = fVar2.f99406j;
                                            w wVar = fVar2.f99397a;
                                            String str2 = wVar instanceof w.b ? ((w.b) wVar).f84210b : null;
                                            if (str2 != null && (lVar = ((e) p2Var.getValue()).f99389c) != null) {
                                                String strX4 = fVar2.x4(new q.b(lVar, str2));
                                                do {
                                                    value2 = p2Var.getValue();
                                                } while (!p2Var.b(value2, e.a((e) value2, false, null, null, strX4, 127)));
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            ThirdPartyConnectActivity.a aVar5 = ThirdPartyConnectActivity.f43974c;
                                            thirdPartyConnectActivity2.onBackPressed();
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            mVar2.K(objQ);
                        } else {
                            aVar3.getClass();
                            if (objQ == m.a.f135155b) {
                                final int objArr3 = objArr == true ? 1 : 0;
                                objQ = new e23.a() { // from class: ck1.c
                                    @Override // e23.a
                                    public final Object invoke() {
                                        l lVar;
                                        Object value2;
                                        int i17 = objArr3;
                                        ThirdPartyConnectActivity thirdPartyConnectActivity2 = thirdPartyConnectActivity;
                                        switch (i17) {
                                            case 0:
                                                ThirdPartyConnectActivity.a aVar4 = ThirdPartyConnectActivity.f43974c;
                                                thirdPartyConnectActivity2.onBackPressed();
                                                return Unit.INSTANCE;
                                            case 1:
                                                jk1.f fVar2 = thirdPartyConnectActivity2.f43975a;
                                                if (fVar2 == null) {
                                                    s.m("viewModel");
                                                    throw null;
                                                }
                                                p2 p2Var = fVar2.f99406j;
                                                w wVar = fVar2.f99397a;
                                                String str2 = wVar instanceof w.b ? ((w.b) wVar).f84210b : null;
                                                if (str2 != null && (lVar = ((e) p2Var.getValue()).f99389c) != null) {
                                                    String strX4 = fVar2.x4(new q.b(lVar, str2));
                                                    do {
                                                        value2 = p2Var.getValue();
                                                    } while (!p2Var.b(value2, e.a((e) value2, false, null, null, strX4, 127)));
                                                }
                                                return Unit.INSTANCE;
                                            default:
                                                ThirdPartyConnectActivity.a aVar5 = ThirdPartyConnectActivity.f43974c;
                                                thirdPartyConnectActivity2.onBackPressed();
                                                return Unit.INSTANCE;
                                        }
                                    }
                                };
                                mVar2.K(objQ);
                            }
                        }
                        jk1.b.b(str, fVar, (e23.a) objQ, mVar2, 0);
                        mVar2.f();
                    } else if (yVar instanceof y.a) {
                        mVar2.C(-1187844512);
                        e eVar = (e) p1Var.getF182175a();
                        jk1.f fVar2 = thirdPartyConnectActivity.f43975a;
                        if (fVar2 == null) {
                            s.m("viewModel");
                            throw null;
                        }
                        boolean z15 = fVar2.f99397a instanceof w.b;
                        boolean zR2 = mVar2.r(thirdPartyConnectActivity);
                        Object objQ2 = mVar2.q();
                        if (zR2) {
                            objQ2 = new e23.a() { // from class: ck1.c
                                @Override // e23.a
                                public final Object invoke() {
                                    l lVar;
                                    Object value2;
                                    int i17 = i16;
                                    ThirdPartyConnectActivity thirdPartyConnectActivity2 = thirdPartyConnectActivity;
                                    switch (i17) {
                                        case 0:
                                            ThirdPartyConnectActivity.a aVar4 = ThirdPartyConnectActivity.f43974c;
                                            thirdPartyConnectActivity2.onBackPressed();
                                            return Unit.INSTANCE;
                                        case 1:
                                            jk1.f fVar3 = thirdPartyConnectActivity2.f43975a;
                                            if (fVar3 == null) {
                                                s.m("viewModel");
                                                throw null;
                                            }
                                            p2 p2Var = fVar3.f99406j;
                                            w wVar = fVar3.f99397a;
                                            String str2 = wVar instanceof w.b ? ((w.b) wVar).f84210b : null;
                                            if (str2 != null && (lVar = ((e) p2Var.getValue()).f99389c) != null) {
                                                String strX4 = fVar3.x4(new q.b(lVar, str2));
                                                do {
                                                    value2 = p2Var.getValue();
                                                } while (!p2Var.b(value2, e.a((e) value2, false, null, null, strX4, 127)));
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            ThirdPartyConnectActivity.a aVar5 = ThirdPartyConnectActivity.f43974c;
                                            thirdPartyConnectActivity2.onBackPressed();
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            mVar2.K(objQ2);
                        } else {
                            aVar3.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = new e23.a() { // from class: ck1.c
                                    @Override // e23.a
                                    public final Object invoke() {
                                        l lVar;
                                        Object value2;
                                        int i17 = i16;
                                        ThirdPartyConnectActivity thirdPartyConnectActivity2 = thirdPartyConnectActivity;
                                        switch (i17) {
                                            case 0:
                                                ThirdPartyConnectActivity.a aVar4 = ThirdPartyConnectActivity.f43974c;
                                                thirdPartyConnectActivity2.onBackPressed();
                                                return Unit.INSTANCE;
                                            case 1:
                                                jk1.f fVar3 = thirdPartyConnectActivity2.f43975a;
                                                if (fVar3 == null) {
                                                    s.m("viewModel");
                                                    throw null;
                                                }
                                                p2 p2Var = fVar3.f99406j;
                                                w wVar = fVar3.f99397a;
                                                String str2 = wVar instanceof w.b ? ((w.b) wVar).f84210b : null;
                                                if (str2 != null && (lVar = ((e) p2Var.getValue()).f99389c) != null) {
                                                    String strX4 = fVar3.x4(new q.b(lVar, str2));
                                                    do {
                                                        value2 = p2Var.getValue();
                                                    } while (!p2Var.b(value2, e.a((e) value2, false, null, null, strX4, 127)));
                                                }
                                                return Unit.INSTANCE;
                                            default:
                                                ThirdPartyConnectActivity.a aVar5 = ThirdPartyConnectActivity.f43974c;
                                                thirdPartyConnectActivity2.onBackPressed();
                                                return Unit.INSTANCE;
                                        }
                                    }
                                };
                                mVar2.K(objQ2);
                            }
                        }
                        e23.a aVar4 = (e23.a) objQ2;
                        boolean zR3 = mVar2.r(thirdPartyConnectActivity);
                        Object objQ3 = mVar2.q();
                        if (zR3) {
                            objQ3 = new e23.a() { // from class: ck1.c
                                @Override // e23.a
                                public final Object invoke() {
                                    l lVar;
                                    Object value2;
                                    int i17 = i15;
                                    ThirdPartyConnectActivity thirdPartyConnectActivity2 = thirdPartyConnectActivity;
                                    switch (i17) {
                                        case 0:
                                            ThirdPartyConnectActivity.a aVar5 = ThirdPartyConnectActivity.f43974c;
                                            thirdPartyConnectActivity2.onBackPressed();
                                            return Unit.INSTANCE;
                                        case 1:
                                            jk1.f fVar3 = thirdPartyConnectActivity2.f43975a;
                                            if (fVar3 == null) {
                                                s.m("viewModel");
                                                throw null;
                                            }
                                            p2 p2Var = fVar3.f99406j;
                                            w wVar = fVar3.f99397a;
                                            String str2 = wVar instanceof w.b ? ((w.b) wVar).f84210b : null;
                                            if (str2 != null && (lVar = ((e) p2Var.getValue()).f99389c) != null) {
                                                String strX4 = fVar3.x4(new q.b(lVar, str2));
                                                do {
                                                    value2 = p2Var.getValue();
                                                } while (!p2Var.b(value2, e.a((e) value2, false, null, null, strX4, 127)));
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            ThirdPartyConnectActivity.a aVar6 = ThirdPartyConnectActivity.f43974c;
                                            thirdPartyConnectActivity2.onBackPressed();
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            mVar2.K(objQ3);
                        } else {
                            aVar3.getClass();
                            if (objQ3 == m.a.f135155b) {
                                objQ3 = new e23.a() { // from class: ck1.c
                                    @Override // e23.a
                                    public final Object invoke() {
                                        l lVar;
                                        Object value2;
                                        int i17 = i15;
                                        ThirdPartyConnectActivity thirdPartyConnectActivity2 = thirdPartyConnectActivity;
                                        switch (i17) {
                                            case 0:
                                                ThirdPartyConnectActivity.a aVar5 = ThirdPartyConnectActivity.f43974c;
                                                thirdPartyConnectActivity2.onBackPressed();
                                                return Unit.INSTANCE;
                                            case 1:
                                                jk1.f fVar3 = thirdPartyConnectActivity2.f43975a;
                                                if (fVar3 == null) {
                                                    s.m("viewModel");
                                                    throw null;
                                                }
                                                p2 p2Var = fVar3.f99406j;
                                                w wVar = fVar3.f99397a;
                                                String str2 = wVar instanceof w.b ? ((w.b) wVar).f84210b : null;
                                                if (str2 != null && (lVar = ((e) p2Var.getValue()).f99389c) != null) {
                                                    String strX4 = fVar3.x4(new q.b(lVar, str2));
                                                    do {
                                                        value2 = p2Var.getValue();
                                                    } while (!p2Var.b(value2, e.a((e) value2, false, null, null, strX4, 127)));
                                                }
                                                return Unit.INSTANCE;
                                            default:
                                                ThirdPartyConnectActivity.a aVar6 = ThirdPartyConnectActivity.f43974c;
                                                thirdPartyConnectActivity2.onBackPressed();
                                                return Unit.INSTANCE;
                                        }
                                    }
                                };
                                mVar2.K(objQ3);
                            }
                        }
                        jk1.d.c(eVar, z15, aVar4, (e23.a) objQ3, mVar2, 0);
                        mVar2.f();
                    } else {
                        mVar2.C(-1187435436);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
