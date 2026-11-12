package ic1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.k1;
import e23.p;
import gl1.y;
import h82.r;
import i3.d6;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.p0;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92612a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f92613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f92614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f92615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f92616e;

    public /* synthetic */ f(Context context, r rVar, boolean z14, i iVar) {
        this.f92613b = context;
        this.f92614c = rVar;
        this.f92615d = z14;
        this.f92616e = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x021e  */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        r rVar;
        int i14;
        int i15;
        int i16 = this.f92612a;
        p3.m.a aVar = p3.m.f135153a;
        i iVar = this.f92616e;
        boolean z14 = this.f92615d;
        Context context = this.f92613b;
        int i17 = 3;
        switch (i16) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                i.a aVar2 = i.f92620g;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    r rVar2 = this.f92614c;
                    rVar2.t(R.string.pulse_ox_lbl_reading, mVar, 0);
                    if (z14) {
                        mVar.C(1499736988);
                        rVar2.q(y.Q(mVar, R.string.msg_pulse_ox_reading_help_1_jpn), mVar, 0);
                        mVar.f();
                    } else {
                        mVar.C(1499853982);
                        String strQ = y.Q(mVar, R.string.msg_pulse_ox_reading_help_1);
                        Object objQ = mVar.q();
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new g(2);
                            mVar.K(objQ);
                        }
                        rVar2.o(R.string.msg_pulse_ox_reading_help_1, 0, 0, oi0.c.A(context, (e23.l) objQ, strQ), mVar);
                        mVar = mVar;
                        mVar.f();
                    }
                    rVar2.c(mVar, 0);
                    if (z14) {
                        mVar.C(1500178428);
                        rVar2.q(y.Q(mVar, R.string.msg_pulse_ox_reading_help_2_jpn), mVar, 0);
                        mVar.f();
                        rVar = rVar2;
                    } else {
                        mVar.C(1500295422);
                        String strQ2 = y.Q(mVar, R.string.msg_pulse_ox_reading_help_2);
                        Object objQ2 = mVar.q();
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new g(3);
                            mVar.K(objQ2);
                        }
                        rVar = rVar2;
                        rVar.o(R.string.msg_pulse_ox_reading_help_2, 0, 0, oi0.c.A(context, (e23.l) objQ2, strQ2), mVar);
                        mVar.f();
                    }
                    rVar.c(mVar, 0);
                    rVar.o(z14 ? R.string.msg_pulse_ox_reading_help_3_jpn : R.string.msg_pulse_ox_reading_help_3, 0, 2, null, mVar);
                    if (iVar.f92621f) {
                        bv.b.f21239a.getClass();
                        bv.b.a();
                        k1 k1Var = k1.f37122a;
                        if (k1Var.e0() || k1Var.l()) {
                            mVar.C(1500831350);
                            e eVar = (e) KoinJavaComponent.get$default(e.class, null, null, 6, null);
                            Object objQ3 = mVar.q();
                            aVar.getClass();
                            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                            if (objQ3 == c2565a) {
                                objQ3 = p0.n(null);
                                mVar.K(objQ3);
                            }
                            p1 p1Var = (p1) objQ3;
                            eVar.d(new i.b(p1Var));
                            if (((hc1.b) p1Var.getF182175a()) != null) {
                                mVar.C(1501717795);
                                rVar.c(mVar, 0);
                                if (z14) {
                                    i14 = 1711014060;
                                    i15 = R.string.pulse_ox_sleep_help4_jpn;
                                } else {
                                    i14 = 1711015816;
                                    i15 = R.string.pulse_ox_sleep_help4;
                                }
                                String strH = sn.a.h(mVar, i14, i15, mVar);
                                boolean zR = mVar.r(eVar) | mVar.r(context);
                                Object objQ4 = mVar.q();
                                if (zR || objQ4 == c2565a) {
                                    objQ4 = new d6(p1Var, 10, eVar, context);
                                    mVar.K(objQ4);
                                }
                                rVar.w(strH, null, (e23.a) objQ4, mVar, 0, 2);
                                mVar.f();
                            } else {
                                mVar.C(1502551943);
                                mVar.f();
                            }
                            mVar.f();
                        } else {
                            mVar.C(1502569799);
                            mVar.f();
                        }
                    } else {
                        mVar.C(1502569799);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                i.a aVar3 = i.f92620g;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    String strQ3 = y.Q(mVar2, R.string.pulse_ox_help_link);
                    Object objQ5 = mVar2.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ5 == c2565a2) {
                        objQ5 = new g(0);
                        mVar2.K(objQ5);
                    }
                    String strA = oi0.c.A(context, (e23.l) objQ5, strQ3);
                    String strH2 = z14 ? sn.a.h(mVar2, 734528962, R.string.pulse_ox_help_link_jpn, mVar2) : sn.a.h(mVar2, 734530654, R.string.pulse_ox_help_link, mVar2);
                    if (z14) {
                        strA = sn.a.h(mVar2, 734533986, R.string.pulse_ox_help_link_jpn, mVar2);
                    } else {
                        mVar2.C(734535657);
                        mVar2.f();
                    }
                    String str = strA;
                    boolean zR2 = mVar2.r(iVar) | mVar2.r(context);
                    Object objQ6 = mVar2.q();
                    if (zR2 || objQ6 == c2565a2) {
                        objQ6 = new i91.c(i17, iVar, context);
                        mVar2.K(objQ6);
                    }
                    this.f92614c.x(strH2, str, "https://www.mayoclinic.org/symptoms/hypoxemia/basics/definition/sym-20050930", (e23.a) objQ6, mVar2, 384);
                    iVar.h(mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f(r rVar, boolean z14, Context context, i iVar) {
        this.f92614c = rVar;
        this.f92615d = z14;
        this.f92613b = context;
        this.f92616e = iVar;
    }
}
