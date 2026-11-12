package vr;

import b82.d2;
import c2.t2;
import e23.q;
import h4.r;
import java.util.List;
import nr.q0;
import nr.s;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f179470b;

    public /* synthetic */ d(q0 q0Var, int i14) {
        this.f179469a = i14;
        this.f179470b = q0Var;
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
        List<s> list;
        int i14 = this.f179469a;
        int size = 0;
        size = 0;
        q0 q0Var = this.f179470b;
        t2 t2Var = (t2) obj;
        m mVar = (m) obj2;
        switch (i14) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = n.f135158a;
                    if (q0Var != null && (list = q0Var.f127308a) != null) {
                        size = list.size();
                    }
                    float f14 = 1.0f / size;
                    List<s> list2 = q0Var != null ? q0Var.f127308a : null;
                    if (list2 == null) {
                        mVar.C(913796938);
                        mVar.f();
                    } else {
                        mVar.C(913796939);
                        for (s sVar : list2) {
                            d2 d2Var = d2.f16532a;
                            String str = sVar.f127316a;
                            h4.d.f81522a.getClass();
                            h4.g.a aVar = h4.d.a.f81537o;
                            d2Var.getClass();
                            d2Var.c(t2Var, str, null, t2Var.a(d2.h(), f14, true), aVar, 0, 0, mVar, (iIntValue & 14) | 24576, 50);
                        }
                        mVar.f();
                    }
                    x1 x1Var2 = n.f135158a;
                } else {
                    mVar.e();
                }
                break;
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var3 = n.f135158a;
                    for (s sVar2 : q0Var.f127308a) {
                        Integer num = sVar2.f127317b;
                        String str2 = sVar2.f127316a;
                        h4.d.f81522a.getClass();
                        g.d(t2Var, str2, t2Var.c(t2Var.a(r.S, 0.2f, true), h4.d.a.f81534l), h4.d.a.f81537o, 0, 0, num, mVar, (iIntValue2 & 14) | 3072);
                    }
                    x1 x1Var4 = n.f135158a;
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
