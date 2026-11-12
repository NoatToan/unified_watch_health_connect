package gk1;

import gl1.t;
import lc.n0;
import lc.y;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import vv0.e0;
import vv0.f0;
import vv0.i;
import vv0.v;
import vv0.z;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f77738b;

    public /* synthetic */ b(y yVar, int i14) {
        this.f77737a = i14;
        this.f77738b = yVar;
    }

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
    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f77737a;
        char c14 = 1;
        y yVar = this.f77738b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.googlehealthconnect.b bVar = com.garmin.android.apps.connectmobile.googlehealthconnect.b.f36013a;
                com.garmin.android.apps.connectmobile.googlehealthconnect.b.EnumC0626b enumC0626b = com.garmin.android.apps.connectmobile.googlehealthconnect.b.EnumC0626b.SETTINGS;
                bVar.getClass();
                com.garmin.android.apps.connectmobile.googlehealthconnect.b.b(enumC0626b);
                y.k(lk1.e.b.f113147b.f113145a, yVar);
                return Unit.INSTANCE;
            case 1:
                y.l(yVar, t.INSTANCE);
                return Unit.INSTANCE;
            case 2:
                y.k(com.garmin.android.apps.connectmobile.fitness_age.presentation.b.c.f35227b.f35224a, yVar);
                return Unit.INSTANCE;
            case 3:
                y.k(com.garmin.android.apps.connectmobile.fitness_age.presentation.b.a.f35225b.f35224a, yVar);
                return Unit.INSTANCE;
            case 4:
                y.l(yVar, n51.b.g.INSTANCE);
                return Unit.INSTANCE;
            case 5:
                yVar.f111908f.f(yVar.f111909g && yVar.d() > 1);
                return Unit.INSTANCE;
            case 6:
                boolean z14 = y.f111902i;
                return new n0(yVar.f111903a, yVar.f111904b.f144333t);
            case 7:
                y.k("Exit", yVar);
                return Unit.INSTANCE;
            case 8:
                yVar.getClass();
                y.l(yVar, new i((ro0.i) null, (int) (c14 == true ? 1 : 0), (j) (0 == true ? 1 : 0)));
                return Unit.INSTANCE;
            case 9:
                y.l(yVar, z.INSTANCE);
                return Unit.INSTANCE;
            case 10:
                y.l(yVar, v.INSTANCE);
                return Unit.INSTANCE;
            case 11:
                y.l(yVar, vv0.t.INSTANCE);
                return Unit.INSTANCE;
            case 12:
                y.l(yVar, vv0.t.INSTANCE);
                return Unit.INSTANCE;
            case 13:
                y.l(yVar, f0.INSTANCE);
                return Unit.INSTANCE;
            default:
                y.l(yVar, e0.INSTANCE);
                return Unit.INSTANCE;
        }
    }
}
