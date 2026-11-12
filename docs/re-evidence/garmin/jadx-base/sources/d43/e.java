package d43;

import ch.qos.logback.classic.spi.CallerData;
import java.util.Arrays;
import p43.n0;
import p43.v0;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends r<Character> {
    public e(char c14) {
        super(Character.valueOf(c14));
    }

    @Override // d43.g
    public final n0 a(t23.c0 c0Var) {
        p005kotlin.reflect.jvm.internal.impl.builtins.d dVarE = c0Var.e();
        dVarE.getClass();
        v0 v0VarT = dVarE.t(q23.h.CHAR);
        if (v0VarT != null) {
            return v0VarT;
        }
        p005kotlin.reflect.jvm.internal.impl.builtins.d.a(63);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d43.g
    public final String toString() {
        String strValueOf;
        T t7 = this.f57481a;
        Integer numValueOf = Integer.valueOf(((Character) t7).charValue());
        char cCharValue = ((Character) t7).charValue();
        switch (cCharValue) {
            case '\b':
                strValueOf = "\\b";
                break;
            case '\t':
                strValueOf = "\\t";
                break;
            case '\n':
                strValueOf = "\\n";
                break;
            case 11:
            default:
                byte type = (byte) Character.getType(cCharValue);
                strValueOf = (type != 0 && type != 13 && type != 14 && type != 15 && type != 16 && type != 18 && type != 19) ? String.valueOf(cCharValue) : CallerData.NA;
                break;
            case '\f':
                strValueOf = "\\f";
                break;
            case '\r':
                strValueOf = "\\r";
                break;
        }
        return String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{numValueOf, strValueOf}, 2));
    }
}
