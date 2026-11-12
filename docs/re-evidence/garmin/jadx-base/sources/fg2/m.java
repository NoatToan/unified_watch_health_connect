package fg2;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class m<T> implements r53.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f71529a;

    public m(f fVar) {
        this.f71529a = fVar;
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
    @Override // r53.j
    public final Object emit(Object obj, t13.d dVar) {
        Object value;
        a cVar;
        sf2.d dVar2 = (sf2.d) obj;
        boolean z14 = dVar2 instanceof sf2.d.e;
        f fVar = this.f71529a;
        if (z14) {
            zg2.c cVar2 = zg2.c.f204692a;
            Integer num = ((sf2.d.e) dVar2).f158944b;
            cVar2.getClass();
            zg2.c.a("LiveActivityRepository", "Session paused with distance: " + num);
            fVar.q(true);
            p2 p2Var = fVar.f71493q;
            if (num == null) {
                cVar = a.d.f71402a;
            } else {
                cVar = num.intValue() == -1 ? a.b.f71400a : new a.c(num.intValue());
            }
            p2Var.setValue(cVar);
        } else if ((dVar2 instanceof sf2.d.g) || (dVar2 instanceof sf2.d.i)) {
            fVar.q(false);
            fVar.f71493q.setValue(a.d.f71402a);
        } else if (dVar2 instanceof sf2.d.C3004d) {
            p2 p2Var2 = fVar.f71495s;
            do {
                value = p2Var2.getValue();
            } while (!p2Var2.b(value, null));
        } else if (dVar2 instanceof sf2.d.f) {
            fVar.q(false);
            fVar.r(true);
        }
        return Unit.INSTANCE;
    }
}
