package d6;

import ch.qos.logback.core.CoreConstants;
import g6.q;
import o53.f0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Ld6/n;", "", "Lg6/q;", "firstLine", "restLine", "<init>", "(JJLkotlin/jvm/internal/j;)V", "a", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f57779c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f57780d = new n(0, 0, 3, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f57781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f57782b;

    public /* synthetic */ n(long j8, long j14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? f0.B(0) : j8, (i14 & 2) != 0 ? f0.B(0) : j14, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return q.b(this.f57781a, nVar.f57781a) && q.b(this.f57782b, nVar.f57782b);
    }

    public final int hashCode() {
        q.a aVar = q.f76018b;
        return Long.hashCode(this.f57782b) + (Long.hashCode(this.f57781a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) q.f(this.f57781a)) + ", restLine=" + ((Object) q.f(this.f57782b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld6/n$a;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    private n(long j8, long j14) {
        this.f57781a = j8;
        this.f57782b = j14;
    }

    public /* synthetic */ n(long j8, long j14, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14);
    }
}
