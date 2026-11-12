package u2;

import ch.qos.logback.core.CoreConstants;
import ds.e0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0081@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lu2/j;", "", "a", "value", "", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f167854b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f167855c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f167856a;

    private /* synthetic */ j(int i14) {
        this.f167856a = i14;
    }

    public static final /* synthetic */ j a(int i14) {
        return new j(i14);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f167856a == ((j) obj).f167856a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f167856a);
    }

    public final String toString() {
        return e0.i("TextHighlightType(value=", this.f167856a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu2/j$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
