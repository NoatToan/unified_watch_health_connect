package ae2;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.gncs.NotificationConstants;
import com.garmin.android.library.livetrack.data.typeadapters.SubscriberTypeAdapter;
import com.google.common.net.HttpHeaders;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\fBC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\f\u0010\u001a¨\u0006\u001b"}, d2 = {"Lae2/n0;", "", "", "connectUserProfileId", "", "identifier", "nickname", "trackerId", "Lae2/n0$a;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lae2/n0$a;)V", "a", "Ljava/lang/Long;", "getConnectUserProfileId", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "c", "getNickname", "d", "getTrackerId", JWKParameterNames.RSA_EXPONENT, "Lae2/n0$a;", "()Lae2/n0$a;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("connectUserProfileId")
    private final Long connectUserProfileId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("identifier")
    private final String identifier;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("nickname")
    private final String nickname;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trackerId")
    private final String trackerId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    @JsonAdapter(SubscriberTypeAdapter.class)
    private final a type;

    public /* synthetic */ n0(Long l14, String str, String str2, String str3, a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : aVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getType() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return p005kotlin.jvm.internal.s.g(this.connectUserProfileId, n0Var.connectUserProfileId) && p005kotlin.jvm.internal.s.g(this.identifier, n0Var.identifier) && p005kotlin.jvm.internal.s.g(this.nickname, n0Var.nickname) && p005kotlin.jvm.internal.s.g(this.trackerId, n0Var.trackerId) && p005kotlin.jvm.internal.s.g(this.type, n0Var.type);
    }

    public final int hashCode() {
        Long l14 = this.connectUserProfileId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.identifier;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nickname;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.trackerId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        a aVar = this.type;
        return iHashCode4 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.connectUserProfileId;
        String str = this.identifier;
        String str2 = this.nickname;
        String str3 = this.trackerId;
        a aVar = this.type;
        StringBuilder sbJ = b71.i.j("Subscriber(connectUserProfileId=", ", identifier=", str, l14, ", nickname=");
        sn.a.t(sbJ, str2, ", trackerId=", str3, ", type=");
        sbJ.append(aVar);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0006\u0007\b\t\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0006\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lae2/n0$a;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;)V", "a", "d", "f", "c", JWKParameterNames.RSA_EXPONENT, "g", "b", "Lae2/n0$a$a;", "Lae2/n0$a$c;", "Lae2/n0$a$d;", "Lae2/n0$a$e;", "Lae2/n0$a$f;", "Lae2/n0$a$g;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f2940b = new b(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2941a;

        /* JADX INFO: renamed from: ae2.n0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/n0$a$a;", "Lae2/n0$a;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C0045a extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C0045a f2942c = new C0045a();

            private C0045a() {
                super("ANONYMOUS", null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0045a);
            }

            public final int hashCode() {
                return 154246708;
            }

            public final String toString() {
                return "Anonymous";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/n0$a$c;", "Lae2/n0$a;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class c extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final c f2943c = new c();

            private c() {
                super("CONNECTION", null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 256675319;
            }

            public final String toString() {
                return HttpHeaders.CONNECTION;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/n0$a$d;", "Lae2/n0$a;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class d extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final d f2944c = new d();

            private d() {
                super("EMAIL", null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 1041330403;
            }

            public final String toString() {
                return "Email";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/n0$a$e;", "Lae2/n0$a;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class e extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final e f2945c = new e();

            private e() {
                super("SMS_SUBSCRIBER", null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -122799896;
            }

            public final String toString() {
                return "SmsSubscriber";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/n0$a$f;", "Lae2/n0$a;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class f extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final f f2946c = new f();

            private f() {
                super("STRAVA", null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return -1670723948;
            }

            public final String toString() {
                return "Strava";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/n0$a$g;", "Lae2/n0$a;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class g extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final g f2947c = new g();

            private g() {
                super("SUBSCRIPTION_SUBSCRIBER", null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return -659148034;
            }

            public final String toString() {
                return "SubscriptionSubscriber";
            }
        }

        private a(String str) {
            this.f2941a = str;
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lae2/n0$a$b;", "", "<init>", "()V", "", "ANONYMOUS", "Ljava/lang/String;", "EMAIL", "STRAVA", "CONNECTION", "SMS_SUBSCRIBER", "SUBSCRIPTION_SUBSCRIBER", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b {
            public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private b() {
            }
        }

        public /* synthetic */ a(String str, p005kotlin.jvm.internal.j jVar) {
            this(str);
        }
    }

    public n0(Long l14, String str, String str2, String str3, a aVar) {
        this.connectUserProfileId = l14;
        this.identifier = str;
        this.nickname = str2;
        this.trackerId = str3;
        this.type = aVar;
    }

    public n0() {
        this(null, null, null, null, null, 31, null);
    }
}
