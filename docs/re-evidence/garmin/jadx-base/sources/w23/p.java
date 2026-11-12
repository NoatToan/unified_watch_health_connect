package w23;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p extends o implements t23.m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t23.l f181694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t23.y0 f181695d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(t23.l lVar, u23.h hVar, x33.f fVar, t23.y0 y0Var) {
        super(hVar, fVar);
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
        this.f181694c = lVar;
        this.f181695d = y0Var;
    }

    public static /* synthetic */ void y(int i14) {
        String str = (i14 == 4 || i14 == 5 || i14 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i14 == 4 || i14 == 5 || i14 == 6) ? 2 : 3];
        switch (i14) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i14 == 4) {
            objArr[1] = "getOriginal";
        } else if (i14 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i14 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i14 != 4 && i14 != 5 && i14 != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i14 != 4 && i14 != 5 && i14 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // w23.o, t23.l
    /* JADX INFO: renamed from: T */
    public t23.m a() {
        return this;
    }

    public t23.l d() {
        t23.l lVar = this.f181694c;
        if (lVar != null) {
            return lVar;
        }
        y(5);
        throw null;
    }

    public t23.y0 getSource() {
        t23.y0 y0Var = this.f181695d;
        if (y0Var != null) {
            return y0Var;
        }
        y(6);
        throw null;
    }
}
