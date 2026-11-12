package i3;

import android.graphics.Matrix;
import android.graphics.Path;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Li3/ui;", "Lo4/r1;", "Lp3/p1;", "Lo4/a1;", "transformationMatrix", "tooltipShape", "caretShape", "<init>", "(Lp3/p1;Lo4/r1;Lo4/r1;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ui implements o4.r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p3.p1<o4.a1> f89953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o4.r1 f89954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o4.r1 f89955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o4.j f89956d = o4.m.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o4.j f89957e = o4.m.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o4.j f89958f = o4.m.a();

    public ui(p3.p1<o4.a1> p1Var, o4.r1 r1Var, o4.r1 r1Var2) {
        this.f89953a = p1Var;
        this.f89954b = r1Var;
        this.f89955c = r1Var2;
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
    @Override // o4.r1
    public final o4.b1 a(long j8, g6.o oVar, g6.c cVar) {
        o4.j jVar = this.f89956d;
        jVar.reset();
        o4.j jVar2 = this.f89957e;
        jVar2.reset();
        o4.j jVar3 = this.f89958f;
        jVar3.reset();
        o4.b1 b1VarA = this.f89954b.a(j8, oVar, cVar);
        o4.b1 b1VarA2 = this.f89955c.a(j8, oVar, cVar);
        if (b1VarA instanceof o4.b1.a) {
            o4.f1.m(jVar, ((o4.b1.a) b1VarA).f128811a);
        } else if (b1VarA instanceof o4.b1.c) {
            jVar.k(((o4.b1.c) b1VarA).f128813a, o4.f1.b.CounterClockwise);
        } else {
            if (!(b1VarA instanceof o4.b1.b)) {
                lc.u0.r();
                return null;
            }
            jVar.q(((o4.b1.b) b1VarA).f128812a, o4.f1.b.CounterClockwise);
        }
        if (b1VarA2 instanceof o4.b1.a) {
            o4.f1.m(jVar3, ((o4.b1.a) b1VarA2).f128811a);
        } else if (b1VarA2 instanceof o4.b1.c) {
            jVar3.k(((o4.b1.c) b1VarA2).f128813a, o4.f1.b.CounterClockwise);
        } else {
            if (!(b1VarA2 instanceof o4.b1.b)) {
                lc.u0.r();
                return null;
            }
            jVar3.q(((o4.b1.b) b1VarA2).f128812a, o4.f1.b.CounterClockwise);
        }
        float[] fArr = this.f89953a.getF182175a().f128808a;
        if (jVar3.f128872e == null) {
            jVar3.f128872e = new Matrix();
        }
        Matrix matrix = jVar3.f128872e;
        matrix.getClass();
        o4.l1.e(fArr, matrix);
        Path path = jVar3.f128869b;
        Matrix matrix2 = jVar3.f128872e;
        matrix2.getClass();
        path.transform(matrix2);
        o4.j1.f128873b.getClass();
        jVar2.s(jVar, jVar3, o4.j1.f128875d);
        return new o4.b1.a(jVar2);
    }
}
