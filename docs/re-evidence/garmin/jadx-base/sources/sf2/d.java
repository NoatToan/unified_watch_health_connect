package sf2;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.UUID;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lsf2/d;", "", "<init>", "()V", IntegerTokenConverter.CONVERTER_KEY, JWKParameterNames.RSA_EXPONENT, "c", "h", "g", "d", "a", "b", "f", "Lsf2/d$a;", "Lsf2/d$b;", "Lsf2/d$c;", "Lsf2/d$d;", "Lsf2/d$e;", "Lsf2/d$f;", "Lsf2/d$g;", "Lsf2/d$h;", "Lsf2/d$i;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class d {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsf2/d$a;", "Lsf2/d;", "Ljava/util/UUID;", "sessionUuid", "<init>", "(Ljava/util/UUID;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f158938a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(UUID uuid) {
            super(null);
            uuid.getClass();
            this.f158938a = uuid;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s.g(this.f158938a, ((a) obj).f158938a);
        }

        public final int hashCode() {
            return this.f158938a.hashCode();
        }

        public final String toString() {
            return "DeviceDisconnected(sessionUuid=" + this.f158938a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsf2/d$b;", "Lsf2/d;", "Ljava/util/UUID;", "sessionUuid", "<init>", "(Ljava/util/UUID;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f158939a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(UUID uuid) {
            super(null);
            uuid.getClass();
            this.f158939a = uuid;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && s.g(this.f158939a, ((b) obj).f158939a);
        }

        public final int hashCode() {
            return this.f158939a.hashCode();
        }

        public final String toString() {
            return "DeviceReconnected(sessionUuid=" + this.f158939a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsf2/d$c;", "Lsf2/d;", "Ljava/util/UUID;", "sessionUuid", "<init>", "(Ljava/util/UUID;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f158940a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(UUID uuid) {
            super(null);
            uuid.getClass();
            this.f158940a = uuid;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && s.g(this.f158940a, ((c) obj).f158940a);
        }

        public final int hashCode() {
            return this.f158940a.hashCode();
        }

        public final String toString() {
            return "Discarding(sessionUuid=" + this.f158940a + ")";
        }
    }

    /* JADX INFO: renamed from: sf2.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsf2/d$d;", "Lsf2/d;", "Ljava/util/UUID;", "sessionUuid", "Lrf2/e;", "endType", "<init>", "(Ljava/util/UUID;Lrf2/e;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C3004d extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f158941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final rf2.e f158942b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3004d(UUID uuid, rf2.e eVar) {
            super(null);
            uuid.getClass();
            eVar.getClass();
            this.f158941a = uuid;
            this.f158942b = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3004d)) {
                return false;
            }
            C3004d c3004d = (C3004d) obj;
            return s.g(this.f158941a, c3004d.f158941a) && s.g(this.f158942b, c3004d.f158942b);
        }

        public final int hashCode() {
            return this.f158942b.hashCode() + (this.f158941a.hashCode() * 31);
        }

        public final String toString() {
            return "Ended(sessionUuid=" + this.f158941a + ", endType=" + this.f158942b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsf2/d$f;", "Lsf2/d;", "Ljava/util/UUID;", "sessionUuid", "<init>", "(Ljava/util/UUID;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f158945a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(UUID uuid) {
            super(null);
            uuid.getClass();
            this.f158945a = uuid;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && s.g(this.f158945a, ((f) obj).f158945a);
        }

        public final int hashCode() {
            return this.f158945a.hashCode();
        }

        public final String toString() {
            return "PromptCompleteSkippedWorkoutSteps(sessionUuid=" + this.f158945a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsf2/d$g;", "Lsf2/d;", "Ljava/util/UUID;", "sessionUuid", "<init>", "(Ljava/util/UUID;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f158946a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(UUID uuid) {
            super(null);
            uuid.getClass();
            this.f158946a = uuid;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && s.g(this.f158946a, ((g) obj).f158946a);
        }

        public final int hashCode() {
            return this.f158946a.hashCode();
        }

        public final String toString() {
            return "Resumed(sessionUuid=" + this.f158946a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsf2/d$h;", "Lsf2/d;", "Ljava/util/UUID;", "sessionUuid", "<init>", "(Ljava/util/UUID;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f158947a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(UUID uuid) {
            super(null);
            uuid.getClass();
            this.f158947a = uuid;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && s.g(this.f158947a, ((h) obj).f158947a);
        }

        public final int hashCode() {
            return this.f158947a.hashCode();
        }

        public final String toString() {
            return "Saving(sessionUuid=" + this.f158947a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsf2/d$i;", "Lsf2/d;", "Ljava/util/UUID;", "sessionUuid", "<init>", "(Ljava/util/UUID;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f158948a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(UUID uuid) {
            super(null);
            uuid.getClass();
            this.f158948a = uuid;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && s.g(this.f158948a, ((i) obj).f158948a);
        }

        public final int hashCode() {
            return this.f158948a.hashCode();
        }

        public final String toString() {
            return "Started(sessionUuid=" + this.f158948a + ")";
        }
    }

    public /* synthetic */ d(j jVar) {
        this();
    }

    private d() {
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsf2/d$e;", "Lsf2/d;", "Ljava/util/UUID;", "sessionUuid", "", "currentDistanceInMeters", "<init>", "(Ljava/util/UUID;Ljava/lang/Integer;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f158943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f158944b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(UUID uuid, Integer num) {
            super(null);
            uuid.getClass();
            this.f158943a = uuid;
            this.f158944b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return s.g(this.f158943a, eVar.f158943a) && s.g(this.f158944b, eVar.f158944b);
        }

        public final int hashCode() {
            int iHashCode = this.f158943a.hashCode() * 31;
            Integer num = this.f158944b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            return "Paused(sessionUuid=" + this.f158943a + ", currentDistanceInMeters=" + this.f158944b + ")";
        }

        public /* synthetic */ e(UUID uuid, Integer num, int i14, j jVar) {
            this(uuid, (i14 & 2) != 0 ? null : num);
        }
    }
}
