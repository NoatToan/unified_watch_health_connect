package y3;

import ch.qos.logback.core.CoreConstants;
import ds.e0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ly3/a;", "", "", "count", "<init>", "(I)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f194360a;

    public /* synthetic */ a(int i14, int i15, j jVar) {
        this((i15 & 1) != 0 ? 0 : i14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f194360a == ((a) obj).f194360a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f194360a);
    }

    public final String toString() {
        return e0.j(new StringBuilder("DeltaCounter(count="), this.f194360a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public a(int i14) {
        this.f194360a = i14;
    }

    public a() {
        this(0, 1, null);
    }
}
