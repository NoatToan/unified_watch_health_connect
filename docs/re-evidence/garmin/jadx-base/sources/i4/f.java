package i4;

import ch.qos.logback.core.CoreConstants;
import ds.e0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0083@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Li4/f;", "Li4/r;", "androidAutofillType", "", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f90839b;

    private /* synthetic */ f(int i14) {
        this.f90839b = i14;
    }

    public static final /* synthetic */ f a(int i14) {
        return new f(i14);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f90839b == ((f) obj).f90839b;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f90839b);
    }

    public final String toString() {
        return e0.i("AndroidContentDataType(androidAutofillType=", this.f90839b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
