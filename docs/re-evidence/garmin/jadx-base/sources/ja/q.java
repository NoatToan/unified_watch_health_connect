package ja;

import android.media.metrics.LogSessionId;
import fa.z;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f98046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f98047c;

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f98048b = new a(LogSessionId.LOG_SESSION_ID_NONE);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LogSessionId f98049a;

        public a(LogSessionId logSessionId) {
            this.f98049a = logSessionId;
        }
    }

    static {
        if (z.f70071a < 31) {
            new q("");
        } else {
            new q(a.f98048b, "");
        }
    }

    public q(String str) {
        fa.a.d(z.f70071a < 31);
        this.f98045a = str;
        this.f98046b = null;
        this.f98047c = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Objects.equals(this.f98045a, qVar.f98045a) && Objects.equals(this.f98046b, qVar.f98046b) && Objects.equals(this.f98047c, qVar.f98047c);
    }

    public final int hashCode() {
        return Objects.hash(this.f98045a, this.f98046b, this.f98047c);
    }

    public q(LogSessionId logSessionId, String str) {
        this(new a(logSessionId), str);
    }

    private q(a aVar, String str) {
        this.f98046b = aVar;
        this.f98045a = str;
        this.f98047c = new Object();
    }
}
