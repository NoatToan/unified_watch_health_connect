package w23;

import org.apache.commons.lang3.StringUtils;
import p43.g2;
import t23.b1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o43.n nVar, t23.l lVar, u23.h hVar, x33.f fVar, g2 g2Var, boolean z14, int i14, t23.y0 y0Var, b1 b1Var) {
        super(nVar, lVar, hVar, fVar, g2Var, z14, i14, y0Var, b1Var);
        if (nVar == null) {
            y(0);
            throw null;
        }
        if (lVar == null) {
            y(1);
            throw null;
        }
        if (hVar == null) {
            y(2);
            throw null;
        }
        if (fVar == null) {
            y(3);
            throw null;
        }
        if (g2Var == null) {
            y(4);
            throw null;
        }
        if (y0Var == null) {
            y(5);
            throw null;
        }
        if (b1Var != null) {
        } else {
            y(6);
            throw null;
        }
    }

    public static /* synthetic */ void y(int i14) {
        Object[] objArr = new Object[3];
        switch (i14) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // w23.o
    public final String toString() {
        String str = "";
        String str2 = this.f181609f ? "reified " : "";
        if (m() != g2.INVARIANT) {
            str = m() + StringUtils.SPACE;
        }
        return str2 + str + getName();
    }
}
