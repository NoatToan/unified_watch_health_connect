package ae2;

import ch.qos.logback.core.joran.action.Action;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0006\u0006\u0007\b\t\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0005\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lae2/g0;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;)V", "c", "d", "b", JWKParameterNames.RSA_EXPONENT, "f", "a", "Lae2/g0$b;", "Lae2/g0$c;", "Lae2/g0$d;", "Lae2/g0$e;", "Lae2/g0$f;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2876b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2877a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/g0$b;", "Lae2/g0;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends g0 {
        public b() {
            super("RECIPIENT_SESSION_ENDED", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/g0$c;", "Lae2/g0;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends g0 {
        public c() {
            super("RECIPIENT_SESSION_INVALID", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/g0$d;", "Lae2/g0;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends g0 {
        public d() {
            super("SENDER_SESSION_ENDED", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/g0$e;", "Lae2/g0;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends g0 {
        public e() {
            super("SENDER_SESSION_INVALID", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/g0$f;", "Lae2/g0;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f extends g0 {
        public f() {
            super("UNKNOWN_ERROR", null);
        }
    }

    private g0(String str) {
        this.f2877a = str;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lae2/g0$a;", "", "<init>", "()V", "", "RECIPIENT_SESSION_INVALID", "Ljava/lang/String;", "SENDER_SESSION_ENDED", "RECIPIENT_SESSION_ENDED", "SENDER_SESSION_INVALID", "UNKNOWN_ERROR", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ g0(String str, p005kotlin.jvm.internal.j jVar) {
        this(str);
    }
}
