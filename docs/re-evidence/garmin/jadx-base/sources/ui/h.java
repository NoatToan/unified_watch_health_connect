package ui;

import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qj.b f171173b = new qj.b();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // ui.e
    public final void b(MessageDigest messageDigest) {
        int i14 = 0;
        while (true) {
            qj.b bVar = this.f171173b;
            if (i14 >= bVar.f134761c) {
                return;
            }
            g gVar = (g) bVar.g(i14);
            V vK = this.f171173b.k(i14);
            g.b<T> bVar2 = gVar.f171170b;
            if (gVar.f171172d == null) {
                gVar.f171172d = gVar.f171171c.getBytes(e.f171166a);
            }
            bVar2.a(gVar.f171172d, vK, messageDigest);
            i14++;
        }
    }

    public final <T> T c(g<T> gVar) {
        qj.b bVar = this.f171173b;
        return bVar.containsKey(gVar) ? (T) bVar.get(gVar) : gVar.f171169a;
    }

    @Override // ui.e
    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f171173b.equals(((h) obj).f171173b);
        }
        return false;
    }

    @Override // ui.e
    public final int hashCode() {
        return this.f171173b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f171173b + CoreConstants.CURLY_RIGHT;
    }
}
