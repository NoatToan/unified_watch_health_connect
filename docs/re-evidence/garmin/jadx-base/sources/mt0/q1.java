package mt0;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class q1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f120821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.s f120822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.model.p f120823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f120824e;

    public /* synthetic */ q1(boolean z14, com.garmin.android.apps.connectmobile.leaderboard.challenges.s sVar, com.garmin.android.apps.connectmobile.leaderboard.model.p pVar, boolean z15, int i14) {
        this.f120820a = i14;
        this.f120821b = z14;
        this.f120822c = sVar;
        this.f120823d = pVar;
        this.f120824e = z15;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008a  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String string;
        Object obj3;
        boolean z14 = false;
        switch (this.f120820a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1513387196, new q1(this.f120821b, this.f120822c, this.f120823d, this.f120824e, 1), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    l72.f0 f0Var = l72.f0.f110999a;
                    g6.f.a aVar = g6.f.f75994b;
                    h4.r rVarB = c2.x2.b(h4.r.S, 0.0f, 54, 1);
                    boolean z15 = this.f120821b;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.s sVar = this.f120822c;
                    com.garmin.android.apps.connectmobile.leaderboard.model.p pVar = this.f120823d;
                    if (z15) {
                        string = sVar.getString(R.string.lbl_challenge_redeem_reward);
                    } else {
                        string = pVar.L0() ? sVar.getString(R.string.social_start_expedition) : sVar.getString(R.string.social_join_challenge_lbl);
                    }
                    String str = string;
                    str.getClass();
                    boolean zQ0 = pVar.Q0();
                    z3.e eVarC = z3.f.c(-1601180923, new j30.d(this.f120824e, 19, z14 ? 1 : 0), mVar2);
                    boolean zH = mVar2.h(z15) | mVar2.r(pVar) | mVar2.r(sVar);
                    Object objQ = mVar2.q();
                    if (zH) {
                        obj3 = objQ;
                        c.e eVar = new c.e(z15, pVar, sVar, 6);
                        mVar2.K(eVar);
                        obj3 = eVar;
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            obj3 = objQ;
                            c.e eVar2 = new c.e(z15, pVar, sVar, 6);
                            mVar2.K(eVar2);
                            obj3 = eVar2;
                        }
                    }
                    obj3 = objQ;
                    f0Var.e(eVarC, str, rVarB, zQ0, (e23.a) obj3, mVar2, 390, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
