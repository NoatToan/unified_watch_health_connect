package w23;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t23.l f181641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t23.y0 f181642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f181643h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o43.n nVar, t23.l lVar, x33.f fVar, t23.y0 y0Var, boolean z14) {
        super(nVar, fVar);
        if (nVar == null) {
            T(0);
            throw null;
        }
        if (lVar == null) {
            T(1);
            throw null;
        }
        if (fVar == null) {
            T(2);
            throw null;
        }
        if (y0Var == null) {
            T(3);
            throw null;
        }
        this.f181641f = lVar;
        this.f181642g = y0Var;
        this.f181643h = z14;
    }

    public static /* synthetic */ void T(int i14) {
        String str = (i14 == 4 || i14 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i14 == 4 || i14 == 5) ? 2 : 3];
        if (i14 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i14 == 2) {
            objArr[0] = "name";
        } else if (i14 == 3) {
            objArr[0] = "source";
        } else if (i14 == 4 || i14 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i14 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i14 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i14 != 4 && i14 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i14 != 4 && i14 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // t23.l
    public final t23.l d() {
        t23.l lVar = this.f181641f;
        if (lVar != null) {
            return lVar;
        }
        T(4);
        throw null;
    }

    @Override // t23.m
    public final t23.y0 getSource() {
        t23.y0 y0Var = this.f181642g;
        if (y0Var != null) {
            return y0Var;
        }
        T(5);
        throw null;
    }

    public boolean isExternal() {
        return this.f181643h;
    }
}
