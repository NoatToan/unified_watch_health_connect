package g02;

import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
public interface l0 {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg02/l0$a;", "Lg02/l0;", "", "durationMillis", "<init>", "(I)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f74463a;

        public /* synthetic */ a(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
            this((i15 & 1) != 0 ? AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS : i14);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f74463a == ((a) obj).f74463a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f74463a);
        }

        public final String toString() {
            return v.e0.f(this.f74463a, "Completed(durationMillis=", ")");
        }

        public a(int i14) {
            this.f74463a = i14;
        }

        public a() {
            this(0, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg02/l0$b;", "Lg02/l0;", "", "durationMillis", "<init>", "(I)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f74464a;

        public /* synthetic */ b(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
            this((i15 & 1) != 0 ? AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS : i14);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f74464a == ((b) obj).f74464a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f74464a);
        }

        public final String toString() {
            return v.e0.f(this.f74464a, "FixedDuration(durationMillis=", ")");
        }

        public b(int i14) {
            this.f74464a = i14;
        }

        public b() {
            this(0, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg02/l0$c;", "Lg02/l0;", "", "showAnimatedIcon", "", "repeatDurationMillis", "<init>", "(ZI)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f74465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f74466b;

        public /* synthetic */ c(boolean z14, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
            this((i15 & 1) != 0 ? true : z14, (i15 & 2) != 0 ? 2000 : i14);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f74465a == cVar.f74465a && this.f74466b == cVar.f74466b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f74466b) + (Boolean.hashCode(this.f74465a) * 31);
        }

        public final String toString() {
            return "Indeterminate(showAnimatedIcon=" + this.f74465a + ", repeatDurationMillis=" + this.f74466b + ")";
        }

        public c(boolean z14, int i14) {
            this.f74465a = z14;
            this.f74466b = i14;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c() {
            this(false, 0 == true ? 1 : 0, 3, null);
        }
    }
}
