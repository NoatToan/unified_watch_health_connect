package w23;

/* JADX INFO: loaded from: classes3.dex */
public class y extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t23.e f181776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j43.e f181777d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(t23.e eVar) {
        super(u23.h.a.f168228b);
        if (eVar == null) {
            y(0);
            throw null;
        }
        u23.h.f168226x0.getClass();
        this.f181776c = eVar;
        this.f181777d = new j43.e(eVar, null);
    }

    public static /* synthetic */ void y(int i14) {
        String str = (i14 == 1 || i14 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i14 == 1 || i14 == 2) ? 2 : 3];
        if (i14 == 1 || i14 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i14 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i14 == 1) {
            objArr[1] = "getValue";
        } else if (i14 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i14 != 1 && i14 != 2) {
            if (i14 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i14 != 1 && i14 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // t23.l
    public final t23.l d() {
        t23.e eVar = this.f181776c;
        if (eVar != null) {
            return eVar;
        }
        y(2);
        throw null;
    }

    @Override // t23.u0
    public final j43.g getValue() {
        j43.e eVar = this.f181777d;
        if (eVar != null) {
            return eVar;
        }
        y(1);
        throw null;
    }

    @Override // w23.o
    public final String toString() {
        return "class " + this.f181776c.getName() + "::this";
    }
}
