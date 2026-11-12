package zr1;

import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lzr1/c;", "", "<init>", "()V", "c", "b", JWKParameterNames.RSA_EXPONENT, "d", "a", "Lzr1/c$a;", "Lzr1/c$b;", "Lzr1/c$c;", "Lzr1/c$d;", "Lzr1/c$e;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzr1/c$a;", "Lzr1/c;", "Lal2/c;", "status", "", "successfulSync", "<init>", "(Lal2/c;Z)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final al2.c f206771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f206772b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(al2.c cVar, boolean z14) {
            super(null);
            cVar.getClass();
            this.f206771a = cVar;
            this.f206772b = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f206771a, aVar.f206771a) && this.f206772b == aVar.f206772b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f206772b) + (this.f206771a.hashCode() * 31);
        }

        public final String toString() {
            return "Finished(status=" + this.f206771a + ", successfulSync=" + this.f206772b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzr1/c$b;", "Lzr1/c;", "<init>", "()V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f206773a = new b();

        private b() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1950276530;
        }

        public final String toString() {
            return "ManualSyncStarted";
        }
    }

    /* JADX INFO: renamed from: zr1.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzr1/c$c;", "Lzr1/c;", "<init>", "()V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C3852c extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3852c f206774a = new C3852c();

        private C3852c() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C3852c);
        }

        public final int hashCode() {
            return 1554013024;
        }

        public final String toString() {
            return "NotStarted";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzr1/c$d;", "Lzr1/c;", "Lal2/a;", "progress", "", "softwareUpdateStarted", "<init>", "(Lal2/a;Z)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final al2.a f206775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f206776b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(al2.a aVar, boolean z14) {
            super(null);
            aVar.getClass();
            this.f206775a = aVar;
            this.f206776b = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return s.g(this.f206775a, dVar.f206775a) && this.f206776b == dVar.f206776b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f206776b) + (this.f206775a.hashCode() * 31);
        }

        public final String toString() {
            return "Progress(progress=" + this.f206775a + ", softwareUpdateStarted=" + this.f206776b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzr1/c$e;", "Lzr1/c;", "Lal2/c;", "status", "<init>", "(Lal2/c;)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final al2.c f206777a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(al2.c cVar) {
            super(null);
            cVar.getClass();
            this.f206777a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && s.g(this.f206777a, ((e) obj).f206777a);
        }

        public final int hashCode() {
            return this.f206777a.hashCode();
        }

        public final String toString() {
            return "Started(status=" + this.f206777a + ")";
        }
    }

    public /* synthetic */ c(j jVar) {
        this();
    }

    private c() {
    }
}
