package w23;

import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o extends u23.b implements t23.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x33.f f181691b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(u23.h hVar, x33.f fVar) {
        super(hVar);
        if (hVar == null) {
            y(0);
            throw null;
        }
        if (fVar == null) {
            y(1);
            throw null;
        }
        this.f181691b = fVar;
    }

    public static String N(t23.l lVar) {
        try {
            return a43.n.f1166d.y(lVar) + "[" + lVar.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(lVar)) + "]";
        } catch (Throwable unused) {
            return lVar.getClass().getSimpleName() + StringUtils.SPACE + lVar.getName();
        }
    }

    public static /* synthetic */ void y(int i14) {
        String str = (i14 == 2 || i14 == 3 || i14 == 5 || i14 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i14 == 2 || i14 == 3 || i14 == 5 || i14 == 6) ? 2 : 3];
        switch (i14) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i14 == 2) {
            objArr[1] = "getName";
        } else if (i14 == 3) {
            objArr[1] = "getOriginal";
        } else if (i14 == 5 || i14 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i14 != 2 && i14 != 3) {
            if (i14 == 4) {
                objArr[2] = "toString";
            } else if (i14 != 5 && i14 != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i14 != 2 && i14 != 3 && i14 != 5 && i14 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public t23.l a() {
        return this;
    }

    @Override // t23.l
    public final x33.f getName() {
        x33.f fVar = this.f181691b;
        if (fVar != null) {
            return fVar;
        }
        y(2);
        throw null;
    }

    public String toString() {
        return N(this);
    }
}
