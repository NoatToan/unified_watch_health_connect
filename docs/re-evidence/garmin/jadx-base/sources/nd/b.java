package nd;

import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lnd/b;", "", "source", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f125382a;

    public static final boolean a(Bundle bundle, String str) {
        str.getClass();
        boolean z14 = bundle.getBoolean(str, false);
        if (z14 || !bundle.getBoolean(str, true)) {
            return z14;
        }
        gg.b.J(str);
        throw null;
    }

    public static final double b(Bundle bundle, String str) {
        str.getClass();
        double d14 = bundle.getDouble(str, Double.MIN_VALUE);
        if (d14 != Double.MIN_VALUE || bundle.getDouble(str, Double.MAX_VALUE) != Double.MAX_VALUE) {
            return d14;
        }
        gg.b.J(str);
        throw null;
    }

    public static final float c(Bundle bundle, String str) {
        str.getClass();
        float f14 = bundle.getFloat(str, Float.MIN_VALUE);
        if (f14 != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
            return f14;
        }
        gg.b.J(str);
        throw null;
    }

    public static final int d(Bundle bundle, String str) {
        str.getClass();
        int i14 = bundle.getInt(str, Integer.MIN_VALUE);
        if (i14 != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i14;
        }
        gg.b.J(str);
        throw null;
    }

    public static final int[] e(Bundle bundle, String str) {
        str.getClass();
        int[] intArray = bundle.getIntArray(str);
        if (intArray != null) {
            return intArray;
        }
        gg.b.J(str);
        throw null;
    }

    public static final long f(Bundle bundle, String str) {
        str.getClass();
        long j8 = bundle.getLong(str, Long.MIN_VALUE);
        if (j8 != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
            return j8;
        }
        gg.b.J(str);
        throw null;
    }

    public static final Bundle g(Bundle bundle, String str) {
        str.getClass();
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        gg.b.J(str);
        throw null;
    }

    public static final String h(Bundle bundle, String str) {
        str.getClass();
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        gg.b.J(str);
        throw null;
    }

    public static final String[] i(Bundle bundle, String str) {
        str.getClass();
        String[] stringArray = bundle.getStringArray(str);
        if (stringArray != null) {
            return stringArray;
        }
        gg.b.J(str);
        throw null;
    }

    public static final ArrayList j(Bundle bundle, String str) {
        str.getClass();
        ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
        if (stringArrayList != null) {
            return stringArrayList;
        }
        gg.b.J(str);
        throw null;
    }

    public static final boolean k(Bundle bundle, String str) {
        str.getClass();
        return bundle.containsKey(str) && bundle.get(str) == null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return s.g(this.f125382a, ((b) obj).f125382a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f125382a.hashCode();
    }

    public final String toString() {
        return "SavedStateReader(source=" + this.f125382a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
