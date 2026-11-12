package kotlin;

import ch.qos.logback.core.CoreConstants;
import ds.e0;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@p005kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Li5/c1;", "", "a", "value", "", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f91121b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f91122c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91123a;

    private /* synthetic */ c1(int i14) {
        this.f91123a = i14;
    }

    public static final /* synthetic */ c1 a(int i14) {
        return new c1(i14);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c1) {
            return this.f91123a == ((c1) obj).f91123a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f91123a);
    }

    public final String toString() {
        return e0.i("AutoClearFocusBehavior(value=", this.f91123a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @p005kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li5/c1$a;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
