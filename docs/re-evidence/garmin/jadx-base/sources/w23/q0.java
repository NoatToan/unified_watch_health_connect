package w23;

/* JADX INFO: loaded from: classes3.dex */
public class q0 extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t23.l f181698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j43.g f181699d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(t23.l lVar, j43.g gVar, u23.h hVar, x33.f fVar) {
        super(hVar, fVar);
        if (lVar == null) {
            y(3);
            throw null;
        }
        if (gVar == null) {
            y(4);
            throw null;
        }
        if (hVar == null) {
            y(5);
            throw null;
        }
        if (fVar == null) {
            y(6);
            throw null;
        }
        this.f181698c = lVar;
        this.f181699d = gVar;
    }

    public static /* synthetic */ void y(int i14) {
        String str = (i14 == 7 || i14 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i14 == 7 || i14 == 8) ? 2 : 3];
        switch (i14) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i14 == 7) {
            objArr[1] = "getValue";
        } else if (i14 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i14) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i14 != 7 && i14 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // t23.l
    public final t23.l d() {
        t23.l lVar = this.f181698c;
        if (lVar != null) {
            return lVar;
        }
        y(8);
        throw null;
    }

    @Override // t23.u0
    public final j43.g getValue() {
        j43.g gVar = this.f181699d;
        if (gVar != null) {
            return gVar;
        }
        y(7);
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q0(t23.l lVar, j43.g gVar, u23.h hVar) {
        this(lVar, gVar, hVar, x33.h.f188613e);
        if (lVar == null) {
            y(0);
            throw null;
        }
        if (gVar == null) {
            y(1);
            throw null;
        }
        if (hVar != null) {
        } else {
            y(2);
            throw null;
        }
    }
}
