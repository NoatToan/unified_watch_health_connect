package pk1;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f138294b;

    public /* synthetic */ i(k kVar, int i14) {
        this.f138293a = i14;
        this.f138294b = kVar;
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
        int i14 = this.f138293a;
        int i15 = 16;
        k kVar = this.f138294b;
        int i16 = 0;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                k.a aVar = k.f138297g;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    kVar.k(mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                k.a aVar2 = k.f138297g;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    kVar.j(mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                k.a aVar3 = k.f138297g;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    kVar.g(mVar3, 0);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                h82.r rVar = (h82.r) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                k.a aVar4 = k.f138297g;
                rVar.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar4.B(rVar) ? 4 : 2;
                }
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var4 = p3.n.f135158a;
                    int i17 = (iIntValue4 << 3) & 112;
                    rVar.D(R.string.lbl_user_settings_how_active_you_are, mVar4, i17);
                    int i18 = (iIntValue4 << 6) & 896;
                    rVar.o(R.string.msg_user_settings_activity_level1, i18, 2, null, mVar4);
                    rVar.o(R.string.msg_user_settings_activity_level2, i18, 2, null, mVar4);
                    rVar.t(R.string.lbl_user_settings_class_breakdown, mVar4, i17);
                    String strQ = gl1.y.Q(mVar4, R.string.user_settings_class_breakdown_option0);
                    k kVar2 = this.f138294b;
                    kVar2.h(strQ, "0", null, null, mVar4, 48);
                    kVar2.h(gl1.y.Q(mVar4, R.string.user_settings_class_breakdown_option1), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, null, null, mVar4, 48);
                    kVar2.h(gl1.y.Q(mVar4, R.string.user_settings_class_breakdown_option2), "2", null, null, mVar4, 48);
                    kVar2.h(gl1.y.Q(mVar4, R.string.user_settings_class_breakdown_option3), "3", null, null, mVar4, 48);
                    kVar2.h(gl1.y.Q(mVar4, R.string.user_settings_class_breakdown_option4), "4", null, null, mVar4, 48);
                    kVar2.h(gl1.y.Q(mVar4, R.string.user_settings_class_breakdown_option5), "5", null, null, mVar4, 48);
                    kVar2.h(gl1.y.Q(mVar4, R.string.user_settings_class_breakdown_option6), "6", null, null, mVar4, 48);
                    kVar2.h(gl1.y.Q(mVar4, R.string.user_settings_class_breakdown_option7), "7", null, null, mVar4, 48);
                    kVar2.h(gl1.y.Q(mVar4, R.string.user_settings_class_breakdown_option8), "8", null, null, mVar4, 48);
                    kVar2.h(gl1.y.Q(mVar4, R.string.user_settings_class_breakdown_option9), "9", null, null, mVar4, 48);
                    kVar2.h(gl1.y.Q(mVar4, R.string.user_settings_class_breakdown_option10), "10", null, null, mVar4, 48);
                } else {
                    mVar4.e();
                }
                break;
            default:
                h82.r rVar2 = (h82.r) obj;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                k.a aVar5 = k.f138297g;
                rVar2.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar5.B(rVar2) ? 4 : 2;
                }
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var5 = p3.n.f135158a;
                    int i19 = ((iIntValue5 << 3) & 112) | 6;
                    rVar2.k(z3.f.c(-1664108424, new g(rVar2, i16), mVar5), mVar5, i19);
                    rVar2.a(z3.f.c(806951087, new oo0.f(i15, kVar, rVar2), mVar5), mVar5, i19);
                } else {
                    mVar5.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
