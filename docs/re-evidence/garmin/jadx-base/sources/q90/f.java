package q90;

import am.j;
import androidx.room.a0;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lq90/f;", "", "<init>", "()V", "c", "b", JWKParameterNames.RSA_EXPONENT, "d", "f", "a", "Lq90/f$a;", "Lq90/f$b;", "Lq90/f$c;", "Lq90/f$d;", "Lq90/f$e;", "Lq90/f$f;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class f {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq90/f$a;", "Lq90/f;", "<init>", "()V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f143522a = new a();

        private a() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -622596837;
        }

        public final String toString() {
            return "NoAction";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lq90/f$b;", "Lq90/f;", "", "currentPrimaryTrainingName", "<init>", "(Ljava/lang/String;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f143523a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            str.getClass();
            this.f143523a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && s.g(this.f143523a, ((b) obj).f143523a);
        }

        public final int hashCode() {
            return this.f143523a.hashCode();
        }

        public final String toString() {
            return j.m("PromptPrimaryTraining(currentPrimaryTrainingName=", this.f143523a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lq90/f$c;", "Lq90/f;", "", "currentPrimaryWearableName", "", "primaryTrainingCapable", "<init>", "(Ljava/lang/String;Z)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f143524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f143525b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, boolean z14) {
            super(null);
            str.getClass();
            this.f143524a = str;
            this.f143525b = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return s.g(this.f143524a, cVar.f143524a) && this.f143525b == cVar.f143525b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f143525b) + (this.f143524a.hashCode() * 31);
        }

        public final String toString() {
            return n23.j.g("PromptPrimaryWearable(currentPrimaryWearableName=", this.f143524a, ", primaryTrainingCapable=", this.f143525b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lq90/f$d;", "Lq90/f;", "", "deviceUnitId", "<init>", "(J)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f143526a;

        public d(long j8) {
            super(null);
            this.f143526a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f143526a == ((d) obj).f143526a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f143526a);
        }

        public final String toString() {
            return a0.f(this.f143526a, "UpdatePrimaryTraining(deviceUnitId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lq90/f$e;", "Lq90/f;", "", "deviceUnitId", "<init>", "(J)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f143527a;

        public e(long j8) {
            super(null);
            this.f143527a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f143527a == ((e) obj).f143527a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f143527a);
        }

        public final String toString() {
            return a0.f(this.f143527a, "UpdatePrimaryWearable(deviceUnitId=", ")");
        }
    }

    /* JADX INFO: renamed from: q90.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lq90/f$f;", "Lq90/f;", "", "deviceUnitId", "<init>", "(J)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C2707f extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f143528a;

        public C2707f(long j8) {
            super(null);
            this.f143528a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2707f) && this.f143528a == ((C2707f) obj).f143528a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f143528a);
        }

        public final String toString() {
            return a0.f(this.f143528a, "UpdatePrimaryWearableAndTraining(deviceUnitId=", ")");
        }
    }

    public /* synthetic */ f(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private f() {
    }
}
