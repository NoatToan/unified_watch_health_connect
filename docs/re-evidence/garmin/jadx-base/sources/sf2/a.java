package sf2;

import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import java.util.UUID;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import vf2.p;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lsf2/a;", "", "<init>", "()V", "d", JWKParameterNames.RSA_EXPONENT, "b", "c", "a", "f", "Lsf2/a$a;", "Lsf2/a$b;", "Lsf2/a$c;", "Lsf2/a$d;", "Lsf2/a$e;", "Lsf2/a$f;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: sf2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsf2/a$a;", "Lsf2/a;", "Ljava/util/UUID;", "sessionUuid", "Lrf2/e;", "endType", "<init>", "(Ljava/util/UUID;Lrf2/e;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C3001a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f158875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final rf2.e f158876b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3001a(UUID uuid, rf2.e eVar) {
            super(null);
            uuid.getClass();
            eVar.getClass();
            this.f158875a = uuid;
            this.f158876b = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3001a)) {
                return false;
            }
            C3001a c3001a = (C3001a) obj;
            return s.g(this.f158875a, c3001a.f158875a) && s.g(this.f158876b, c3001a.f158876b);
        }

        public final int hashCode() {
            return this.f158876b.hashCode() + (this.f158875a.hashCode() * 31);
        }

        public final String toString() {
            return "ActivityEnded(sessionUuid=" + this.f158875a + ", endType=" + this.f158876b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsf2/a$b;", "Lsf2/a;", "Ljava/util/UUID;", "sessionUuid", "<init>", "(Ljava/util/UUID;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f158877a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(UUID uuid) {
            super(null);
            uuid.getClass();
            this.f158877a = uuid;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && s.g(this.f158877a, ((b) obj).f158877a);
        }

        public final int hashCode() {
            return this.f158877a.hashCode();
        }

        public final String toString() {
            return "ActivityPaused(sessionUuid=" + this.f158877a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsf2/a$c;", "Lsf2/a;", "Ljava/util/UUID;", "sessionUuid", "<init>", "(Ljava/util/UUID;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f158878a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(UUID uuid) {
            super(null);
            uuid.getClass();
            this.f158878a = uuid;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && s.g(this.f158878a, ((c) obj).f158878a);
        }

        public final int hashCode() {
            return this.f158878a.hashCode();
        }

        public final String toString() {
            return "ActivityResumed(sessionUuid=" + this.f158878a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lsf2/a$d;", "Lsf2/a;", "Ljava/util/UUID;", "sessionUuid", "", "activityTypeKey", "activityName", "Lvf2/p;", "workoutData", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lvf2/p;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f158879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f158880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f158881c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final p f158882d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(UUID uuid, String str, String str2, p pVar) {
            super(null);
            uuid.getClass();
            this.f158879a = uuid;
            this.f158880b = str;
            this.f158881c = str2;
            this.f158882d = pVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return s.g(this.f158879a, dVar.f158879a) && s.g(this.f158880b, dVar.f158880b) && s.g(this.f158881c, dVar.f158881c) && s.g(this.f158882d, dVar.f158882d);
        }

        public final int hashCode() {
            int iHashCode = this.f158879a.hashCode() * 31;
            String str = this.f158880b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f158881c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            p pVar = this.f158882d;
            return iHashCode3 + (pVar != null ? pVar.hashCode() : 0);
        }

        public final String toString() {
            return "ActivityStarted(sessionUuid=" + this.f158879a + ", activityTypeKey=" + this.f158880b + ", activityName=" + this.f158881c + ", workoutData=" + this.f158882d + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lsf2/a$e;", "Lsf2/a;", "Ljava/util/UUID;", "sessionUuid", "", "activityTypeKey", "activityName", "Lvf2/p;", "workoutData", "", "Lrf2/b;", "data", "", "isSupportedActivity", "isCurrentStepRestType", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lvf2/p;Ljava/util/List;ZZ)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f158883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f158884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f158885c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final p f158886d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<rf2.b> f158887e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f158888f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f158889g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(UUID uuid, String str, String str2, p pVar, List<rf2.b> list, boolean z14, boolean z15) {
            super(null);
            uuid.getClass();
            list.getClass();
            this.f158883a = uuid;
            this.f158884b = str;
            this.f158885c = str2;
            this.f158886d = pVar;
            this.f158887e = list;
            this.f158888f = z14;
            this.f158889g = z15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return s.g(this.f158883a, eVar.f158883a) && s.g(this.f158884b, eVar.f158884b) && s.g(this.f158885c, eVar.f158885c) && s.g(this.f158886d, eVar.f158886d) && s.g(this.f158887e, eVar.f158887e) && this.f158888f == eVar.f158888f && this.f158889g == eVar.f158889g;
        }

        public final int hashCode() {
            int iHashCode = this.f158883a.hashCode() * 31;
            String str = this.f158884b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f158885c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            p pVar = this.f158886d;
            return Boolean.hashCode(this.f158889g) + q6.f.g(u0.b((iHashCode3 + (pVar != null ? pVar.hashCode() : 0)) * 31, 31, this.f158887e), 31, this.f158888f);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("ActivityUpdated(sessionUuid=");
            sb3.append(this.f158883a);
            sb3.append(", activityTypeKey=");
            sb3.append(this.f158884b);
            sb3.append(", activityName=");
            sb3.append(this.f158885c);
            sb3.append(", workoutData=");
            sb3.append(this.f158886d);
            sb3.append(", data=");
            sb3.append(this.f158887e);
            sb3.append(", isSupportedActivity=");
            sb3.append(this.f158888f);
            sb3.append(", isCurrentStepRestType=");
            return hb.a.k(sb3, this.f158889g, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsf2/a$f;", "Lsf2/a;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f158890a = new f();

        private f() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1308122112;
        }

        public final String toString() {
            return "Disconnected";
        }
    }

    public /* synthetic */ a(j jVar) {
        this();
    }

    private a() {
    }
}
