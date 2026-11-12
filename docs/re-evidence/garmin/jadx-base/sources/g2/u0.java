package g2;

import g2.t0;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b!\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg2/u0;", "Lg2/t0;", "T", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class u0<T extends t0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1.i0<List<f5.v1>> f75246a = p1.o.a();

    public abstract T a(int i14, int i15, int i16, long j8);

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
    public final List<f5.v1> b(r0 r0Var, int i14, long j8) {
        p1.i0<List<f5.v1>> i0Var = this.f75246a;
        List<f5.v1> listB = i0Var.b(i14);
        if (listB != null) {
            return listB;
        }
        List<f5.y0> listX0 = r0Var.x0(i14);
        int size = listX0.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i15 = 0; i15 < size; i15++) {
            arrayList.add(listX0.get(i15).Q(j8));
        }
        i0Var.i(i14, arrayList);
        return arrayList;
    }
}
