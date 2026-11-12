package a30;

import am.j;
import com.google.firebase.messaging.Constants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"La30/c;", "", "", "jsonValue", "<init>", "(Ljava/lang/String;)V", "b", "c", "a", JWKParameterNames.RSA_EXPONENT, "d", "La30/c$a;", "La30/c$b;", "La30/c$c;", "La30/c$d;", "La30/c$e;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f907a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La30/c$a;", "La30/c;", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Ljava/lang/String;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f908b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super("CreatedFailed", null);
            str.getClass();
            this.f908b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s.g(this.f908b, ((a) obj).f908b);
        }

        public final int hashCode() {
            return this.f908b.hashCode();
        }

        public final String toString() {
            return j.m("CreateFailed(error=", this.f908b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La30/c$b;", "La30/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f909b = new b();

        private b() {
            super("SendToDevice", null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -550484314;
        }

        public final String toString() {
            return "SendToDevice";
        }
    }

    /* JADX INFO: renamed from: a30.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La30/c$c;", "La30/c;", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Ljava/lang/String;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C0009c extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f910b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0009c(String str) {
            super("SendToDeviceFailed", null);
            str.getClass();
            this.f910b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0009c) && s.g(this.f910b, ((C0009c) obj).f910b);
        }

        public final int hashCode() {
            return this.f910b.hashCode();
        }

        public final String toString() {
            return j.m("SendToDeviceFailed(error=", this.f910b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La30/c$d;", "La30/c;", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Ljava/lang/String;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f911b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super("UpdatedFailed", null);
            str.getClass();
            this.f911b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && s.g(this.f911b, ((d) obj).f911b);
        }

        public final int hashCode() {
            return this.f911b.hashCode();
        }

        public final String toString() {
            return j.m("UpdateFailed(error=", this.f911b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La30/c$e;", "La30/c;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f912b = new e();

        private e() {
            super("Updated", null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 2098911822;
        }

        public final String toString() {
            return "Updated";
        }
    }

    private c(String str) {
        this.f907a = fb1.c.n("CoursePlanner", str);
    }

    public /* synthetic */ c(String str, p005kotlin.jvm.internal.j jVar) {
        this(str);
    }
}
