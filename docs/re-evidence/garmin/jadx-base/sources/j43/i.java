package j43;

import com.garmin.android.gncs.NotificationConstants;
import p43.n0;

/* JADX INFO: loaded from: classes3.dex */
public class i extends a {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(n0 n0Var) {
        this(n0Var, null);
        if (n0Var != null) {
        } else {
            c(0);
            throw null;
        }
    }

    public static /* synthetic */ void c(int i14) {
        Object[] objArr = new Object[3];
        if (i14 != 2) {
            objArr[0] = NotificationConstants.KEY_DATA_MIME_TYPE;
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i14 != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public final String toString() {
        return "{Transient} : " + getType();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private i(n0 n0Var, g gVar) {
        super(n0Var, gVar);
        if (n0Var != null) {
        } else {
            c(1);
            throw null;
        }
    }
}
