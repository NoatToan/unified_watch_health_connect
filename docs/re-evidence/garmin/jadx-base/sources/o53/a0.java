package o53;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lo53/a0;", "Lt13/a;", "", "name", "<init>", "(Ljava/lang/String;)V", "a", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class a0 extends t13.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f129303b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f129304a;

    public a0(String str) {
        super(f129303b);
        this.f129304a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && p005kotlin.jvm.internal.s.g(this.f129304a, ((a0) obj).f129304a);
    }

    public final int hashCode() {
        return this.f129304a.hashCode();
    }

    public final String toString() {
        return androidx.room.a0.m(new StringBuilder("CoroutineName("), this.f129304a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lo53/a0$a;", "Lt13/g$b;", "Lo53/a0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements t13.g.b<a0> {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
