package pf0;

import android.net.Uri;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class u implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.ecg.presentation.stats.b f137535b;

    public /* synthetic */ u(com.garmin.android.apps.connectmobile.ecg.presentation.stats.b bVar, int i14) {
        this.f137534a = i14;
        this.f137535b = bVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f137534a;
        com.garmin.android.apps.connectmobile.ecg.presentation.stats.b bVar = this.f137535b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    bVar.i(mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar2 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    bVar.j(mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar3 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    bVar.h(mVar3, 0);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar4 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var4 = p3.n.f135158a;
                    bVar.m(mVar4, 0);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                h82.r rVar = (h82.r) obj;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar5 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                rVar.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar5.B(rVar) ? 4 : 2;
                }
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var5 = p3.n.f135158a;
                    int i15 = (iIntValue5 << 3) & 112;
                    rVar.D(R.string.lbl_using_the_ecg_app, mVar5, i15);
                    int i16 = (iIntValue5 << 6) & 896;
                    rVar.l(R.string.msg_using_ecg_app_intro, i16, 2, null, mVar5);
                    e23.p<? super p3.m, ? super Integer, Unit> pVarC = z3.f.c(-357951810, new or0.f(rVar, 22), mVar5);
                    int i17 = i15 | 6;
                    rVar.g(pVarC, mVar5, i17);
                    if (bVar.f34895g != null) {
                        mVar5.C(-237901360);
                        Uri uri = bVar.f34895g;
                        if (uri == null) {
                            mVar5.C(-237901361);
                            mVar5.f();
                        } else {
                            mVar5.C(-237901360);
                            bVar.n(uri, mVar5, 0);
                            mVar5.f();
                            Unit unit = Unit.INSTANCE;
                        }
                        mVar5.f();
                    } else {
                        mVar5.C(-237805043);
                        g6.f.a aVar6 = g6.f.f75994b;
                        rVar.b(220, mVar5, i16 | 48);
                        mVar5.f();
                    }
                    rVar.j(z3.f.c(-2020249825, new or0.f(rVar, 23), mVar5), mVar5, i17);
                    rVar.j(z3.f.c(139695446, new or0.f(rVar, 24), mVar5), mVar5, i17);
                    rVar.j(z3.f.c(1303276631, new or0.f(rVar, 25), mVar5), mVar5, i17);
                } else {
                    mVar5.e();
                }
                break;
            case 5:
                h82.r rVar2 = (h82.r) obj;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar7 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                rVar2.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar6.B(rVar2) ? 4 : 2;
                }
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var6 = p3.n.f135158a;
                    rVar2.k(z3.f.c(1571324823, new w(rVar2, bVar, 0), mVar6), mVar6, ((iIntValue6 << 3) & 112) | 6);
                } else {
                    mVar6.e();
                }
                break;
            case 6:
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar8 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var7 = p3.n.f135158a;
                    bVar.k(mVar7, 0);
                } else {
                    mVar7.e();
                }
                break;
            case 7:
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar9 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    x1 x1Var8 = p3.n.f135158a;
                    bVar.l(mVar8, 0);
                } else {
                    mVar8.e();
                }
                break;
            default:
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar10 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    x1 x1Var9 = p3.n.f135158a;
                    bVar.g(mVar9, 0);
                } else {
                    mVar9.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
