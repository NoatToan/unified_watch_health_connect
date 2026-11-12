package l8;

import java.time.Duration;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final /* synthetic */ class e implements a.c.b, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f111485a = new e();

    public final boolean equals(Object obj) {
        if ((obj instanceof a.c.b) && (obj instanceof n)) {
            return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p005kotlin.jvm.internal.n
    public final h<?> getFunctionDelegate() {
        return new q(1, Duration.class, "ofMillis", "ofMillis(J)Ljava/time/Duration;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        return Duration.ofMillis(((Number) obj).longValue());
    }
}
