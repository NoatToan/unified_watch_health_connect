package bx;

import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0006\u0007\b\t\n\u000bB\u0013\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0005\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lbx/d;", "", "", "value", "<init>", "(Ljava/lang/String;)V", "b", "a", JWKParameterNames.RSA_EXPONENT, "d", "f", "c", "Lbx/d$a;", "Lbx/d$b;", "Lbx/d$d;", "Lbx/d$e;", "Lbx/d$f;", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f21618b = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21619a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbx/d$a;", "Lbx/d;", "<init>", "()V", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f21620c = new a();

        private a() {
            super("AFTER_WAKEUP", null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 760097950;
        }

        public final String toString() {
            return "AfterWakeup";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbx/d$b;", "Lbx/d;", "<init>", "()V", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f21621c = new b();

        private b() {
            super("BEFORE_WAKEUP", null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 820566939;
        }

        public final String toString() {
            return "BeforeWakeup";
        }
    }

    /* JADX INFO: renamed from: bx.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbx/d$d;", "Lbx/d;", "<init>", "()V", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C0331d extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0331d f21622c = new C0331d();

        private C0331d() {
            super("FIVE_PM_UNTIL_SLEEP", null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0331d);
        }

        public final int hashCode() {
            return -130725563;
        }

        public final String toString() {
            return "FivePmUntilSleep";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbx/d$e;", "Lbx/d;", "<init>", "()V", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f21623c = new e();

        private e() {
            super("NOON_UNTIL_FIVE_PM", null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -795212624;
        }

        public final String toString() {
            return "NoonUntilFivePm";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbx/d$f;", "Lbx/d;", "<init>", "()V", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f21624c = new f();

        /* JADX WARN: Multi-variable type inference failed */
        private f() {
            super(null, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1026639885;
        }

        public final String toString() {
            return "PastDay";
        }
    }

    private d(String str) {
        this.f21619a = str;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbx/d$c;", "", "<init>", "()V", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ d(String str, p005kotlin.jvm.internal.j jVar) {
        this(str);
    }
}
