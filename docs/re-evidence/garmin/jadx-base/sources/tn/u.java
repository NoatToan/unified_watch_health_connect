package tn;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import et1.s0;
import gl1.y;
import lc.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import sg0.w0;
import yc.v2;
import yc.z0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Ltn/u;", "", "Ltn/v;", "viewModel", "Lkotlin/Function0;", "", "navigateToHelp", "onNavigateUp", "Lkotlin/Function1;", "Lsn/h;", "onActivitySelected", "<init>", "(Ltn/v;Le23/a;Le23/a;Le23/l;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f165495e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f165496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<Unit> f165497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a<Unit> f165498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.l<sn.h, Unit> f165499d;

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(v vVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.l<? super sn.h, Unit> lVar) {
        vVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        lVar.getClass();
        this.f165496a = vVar;
        this.f165497b = aVar;
        this.f165498c = aVar2;
        this.f165499d = lVar;
    }

    public final void a(m0 m0Var, p3.m mVar, int i14) {
        m0Var.getClass();
        o0 o0VarE = mVar.E(559544880);
        int i15 = (o0VarE.r(this) ? 32 : 16) | i14;
        final int i16 = 0;
        final int i17 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            z02.d.a(false, z3.f.c(-2103634571, new e23.p(this) { // from class: tn.t

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ u f165494b;

                {
                    this.f165494b = this;
                }

                /* JADX WARN: Code duplicated, block: B:20:0x0099  */
                /* JADX WARN: Code duplicated, block: B:35:0x0113  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    zc.d dVarA;
                    int i18 = i16;
                    p3.m.a aVar = p3.m.f135153a;
                    u uVar = this.f165494b;
                    switch (i18) {
                        case 0:
                            p3.m mVar2 = (p3.m) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            int i19 = u.f165495e;
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                x1 x1Var2 = p3.n.f135158a;
                                String strQ = y.Q(mVar2, R.string.lbl_health_snapshot);
                                boolean zR = mVar2.r(uVar);
                                Object objQ = mVar2.q();
                                if (zR) {
                                    objQ = new w0(uVar, 23);
                                    mVar2.K(objQ);
                                } else {
                                    aVar.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new w0(uVar, 23);
                                        mVar2.K(objQ);
                                    }
                                }
                                z02.f.c(0, 54, null, (e23.a) objQ, null, strQ, mVar2, null);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            p3.m mVar3 = (p3.m) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            int i24 = u.f165495e;
                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                x1 x1Var3 = p3.n.f135158a;
                                g8.i.d(1, mVar3, 6);
                                wn.c cVar = new wn.c((Context) mVar3.A(AndroidCompositionLocals_androidKt.f6042b));
                                mVar3.C(1583345951);
                                r53.i<v2<sn.h>> iVar = ((s) p0.c(uVar.f165496a.x4(), mVar3, 0).getF182175a()).f165492a;
                                if (iVar == null) {
                                    mVar3.C(1373359333);
                                    mVar3.f();
                                    dVarA = null;
                                } else {
                                    mVar3.C(1373359334);
                                    dVarA = zc.g.a(iVar, mVar3);
                                    mVar3.f();
                                    Unit unit = Unit.INSTANCE;
                                }
                                mVar3.f();
                                if (dVarA != null) {
                                    mVar3.C(1839427521);
                                    boolean z14 = dVarA.d().f196385a instanceof z0.b;
                                    m3.s sVarE = m3.l.e(mVar3);
                                    boolean zR2 = mVar3.r(dVarA);
                                    Object objQ2 = mVar3.q();
                                    if (zR2) {
                                        objQ2 = new s0(dVarA, 10);
                                        mVar3.K(objQ2);
                                    } else {
                                        aVar.getClass();
                                        if (objQ2 == p3.m.a.f135155b) {
                                            objQ2 = new s0(dVarA, 10);
                                            mVar3.K(objQ2);
                                        }
                                    }
                                    m3.l.b(z14, (e23.a) objQ2, null, sVarE, null, z3.f.c(-1511107219, new p003ji0.e(z14, sVarE, 13), mVar3), z3.f.c(-1453124946, new ng2.i(dVarA, 27, uVar, cVar), mVar3), mVar3, 1769472, 20);
                                    mVar3.f();
                                } else {
                                    mVar3.C(1843555977);
                                    mVar3.f();
                                }
                            } else {
                                mVar3.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), null, null, null, z3.f.c(-297793415, new e23.p(this) { // from class: tn.t

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ u f165494b;

                {
                    this.f165494b = this;
                }

                /* JADX WARN: Code duplicated, block: B:20:0x0099  */
                /* JADX WARN: Code duplicated, block: B:35:0x0113  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    zc.d dVarA;
                    int i18 = i17;
                    p3.m.a aVar = p3.m.f135153a;
                    u uVar = this.f165494b;
                    switch (i18) {
                        case 0:
                            p3.m mVar2 = (p3.m) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            int i19 = u.f165495e;
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                x1 x1Var2 = p3.n.f135158a;
                                String strQ = y.Q(mVar2, R.string.lbl_health_snapshot);
                                boolean zR = mVar2.r(uVar);
                                Object objQ = mVar2.q();
                                if (zR) {
                                    objQ = new w0(uVar, 23);
                                    mVar2.K(objQ);
                                } else {
                                    aVar.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new w0(uVar, 23);
                                        mVar2.K(objQ);
                                    }
                                }
                                z02.f.c(0, 54, null, (e23.a) objQ, null, strQ, mVar2, null);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            p3.m mVar3 = (p3.m) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            int i24 = u.f165495e;
                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                x1 x1Var3 = p3.n.f135158a;
                                g8.i.d(1, mVar3, 6);
                                wn.c cVar = new wn.c((Context) mVar3.A(AndroidCompositionLocals_androidKt.f6042b));
                                mVar3.C(1583345951);
                                r53.i<v2<sn.h>> iVar = ((s) p0.c(uVar.f165496a.x4(), mVar3, 0).getF182175a()).f165492a;
                                if (iVar == null) {
                                    mVar3.C(1373359333);
                                    mVar3.f();
                                    dVarA = null;
                                } else {
                                    mVar3.C(1373359334);
                                    dVarA = zc.g.a(iVar, mVar3);
                                    mVar3.f();
                                    Unit unit = Unit.INSTANCE;
                                }
                                mVar3.f();
                                if (dVarA != null) {
                                    mVar3.C(1839427521);
                                    boolean z14 = dVarA.d().f196385a instanceof z0.b;
                                    m3.s sVarE = m3.l.e(mVar3);
                                    boolean zR2 = mVar3.r(dVarA);
                                    Object objQ2 = mVar3.q();
                                    if (zR2) {
                                        objQ2 = new s0(dVarA, 10);
                                        mVar3.K(objQ2);
                                    } else {
                                        aVar.getClass();
                                        if (objQ2 == p3.m.a.f135155b) {
                                            objQ2 = new s0(dVarA, 10);
                                            mVar3.K(objQ2);
                                        }
                                    }
                                    m3.l.b(z14, (e23.a) objQ2, null, sVarE, null, z3.f.c(-1511107219, new p003ji0.e(z14, sVarE, 13), mVar3), z3.f.c(-1453124946, new ng2.i(dVarA, 27, uVar, cVar), mVar3), mVar3, 1769472, 20);
                                    mVar3.f();
                                } else {
                                    mVar3.C(1843555977);
                                    mVar3.f();
                                }
                            } else {
                                mVar3.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 196656, 29);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t21.l(this, m0Var, i14, 15);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltn/u$a;", "", "<init>", "()V", "", "ROUTE", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
