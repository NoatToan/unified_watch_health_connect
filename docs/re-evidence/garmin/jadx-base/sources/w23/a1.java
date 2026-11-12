package w23;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a1 extends z0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f181567f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o43.k<d43.g<?>> f181568g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e23.a<o43.k<d43.g<?>>> f181569h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(t23.l lVar, u23.h hVar, x33.f fVar, p43.n0 n0Var, boolean z14, t23.y0 y0Var) {
        super(lVar, hVar, fVar, n0Var, y0Var);
        if (lVar == null) {
            y(0);
            throw null;
        }
        if (hVar == null) {
            y(1);
            throw null;
        }
        if (fVar == null) {
            y(2);
            throw null;
        }
        if (y0Var == null) {
            y(3);
            throw null;
        }
        this.f181567f = z14;
    }

    public static /* synthetic */ void y(int i14) {
        Object[] objArr = new Object[3];
        if (i14 == 1) {
            objArr[0] = "annotations";
        } else if (i14 == 2) {
            objArr[0] = "name";
        } else if (i14 == 3) {
            objArr[0] = "source";
        } else if (i14 == 4 || i14 == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i14 == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i14 != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public final void E0(o43.k<d43.g<?>> kVar, e23.a<o43.k<d43.g<?>>> aVar) {
        if (aVar == null) {
            y(5);
            throw null;
        }
        this.f181569h = aVar;
        if (kVar == null) {
            kVar = aVar.invoke();
        }
        this.f181568g = kVar;
    }

    @Override // t23.k1
    public final d43.g<?> Q() {
        o43.k<d43.g<?>> kVar = this.f181568g;
        if (kVar != null) {
            return kVar.invoke();
        }
        return null;
    }

    @Override // t23.k1
    public final boolean Y() {
        return this.f181567f;
    }
}
