package aw;

import com.garmin.android.apps.connectmobile.R;
import e23.q;
import gl1.y;
import h82.r;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f13314b;

    public /* synthetic */ b(d dVar, int i14) {
        this.f13313a = i14;
        this.f13314b = dVar;
    }

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
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f13313a;
        d dVar = this.f13314b;
        switch (i14) {
            case 0:
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i15 = d.f13318f;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                    dVar.j(mVar, h82.c.f82429e);
                } else {
                    mVar.e();
                }
                break;
            default:
                r rVar = (r) obj;
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i16 = d.f13318f;
                rVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    int i17 = (iIntValue2 << 3) & 112;
                    rVar.t(R.string.lbl_update_in_progress, mVar2, i17);
                    String strQ = y.Q(mVar2, R.string.lbl_rally);
                    rVar.q(y.P(R.string.msg_vector_update_in_progress, new Object[]{strQ}, mVar2), mVar2, i17);
                    rVar.t(R.string.device_settings_vector_status_info_title, mVar2, i17);
                    rVar.q(y.P(R.string.device_settings_vector_status_info_notes, new Object[]{strQ}, mVar2), mVar2, i17);
                    dVar.i(mVar2, h82.c.f82429e);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
