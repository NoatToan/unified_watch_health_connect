package i13;

import ds.e0;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f87106a = new a();

    public static final class a extends Throwable {
        public a() {
            super("No further exceptions");
        }

        @Override // java.lang.Throwable
        public final Throwable fillInStackTrace() {
            return this;
        }
    }

    private d() {
        throw new IllegalStateException("No instances!");
    }

    public static String a(long j8, TimeUnit timeUnit) {
        StringBuilder sbK = e0.k(j8, "The source did not signal an event for ", StringUtils.SPACE);
        sbK.append(timeUnit.toString().toLowerCase());
        sbK.append(" and has been terminated.");
        return sbK.toString();
    }

    public static RuntimeException b(Throwable th3) {
        if (th3 instanceof Error) {
            throw ((Error) th3);
        }
        return th3 instanceof RuntimeException ? (RuntimeException) th3 : new RuntimeException(th3);
    }
}
