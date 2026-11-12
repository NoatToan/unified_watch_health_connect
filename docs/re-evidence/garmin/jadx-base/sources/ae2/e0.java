package ae2;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.gncs.NotificationConstants;
import com.garmin.android.library.livetrack.data.typeadapters.PublisherTypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\fBA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u000f\u0010\u000e\"\u0004\b\u0017\u0010\u0018R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Lae2/e0;", "", "", "identifier", "Lae2/e0$a;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "connectUserProfileId", "nickname", "trackerId", "<init>", "(Ljava/lang/String;Lae2/e0$a;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "Lae2/e0$a;", "d", "()Lae2/e0$a;", "c", "Ljava/lang/Long;", "getConnectUserProfileId", "()Ljava/lang/Long;", "setNickname", "(Ljava/lang/String;)V", JWKParameterNames.RSA_EXPONENT, "setTrackerId", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("identifier")
    private final String identifier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    @JsonAdapter(PublisherTypeAdapter.class)
    private final a type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("connectUserProfileId")
    private final Long connectUserProfileId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("nickname")
    private String nickname;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trackerId")
    private String trackerId;

    public /* synthetic */ e0(String str, a aVar, Long l14, String str2, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? new a.b() : aVar, (i14 & 4) != 0 ? null : l14, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : str3);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTrackerId() {
        return this.trackerId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a getType() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return p005kotlin.jvm.internal.s.g(this.identifier, e0Var.identifier) && p005kotlin.jvm.internal.s.g(this.type, e0Var.type) && p005kotlin.jvm.internal.s.g(this.connectUserProfileId, e0Var.connectUserProfileId) && p005kotlin.jvm.internal.s.g(this.nickname, e0Var.nickname) && p005kotlin.jvm.internal.s.g(this.trackerId, e0Var.trackerId);
    }

    public final int hashCode() {
        String str = this.identifier;
        int iHashCode = (this.type.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        Long l14 = this.connectUserProfileId;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str2 = this.nickname;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.trackerId;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.identifier;
        a aVar = this.type;
        Long l14 = this.connectUserProfileId;
        String str2 = this.nickname;
        String str3 = this.trackerId;
        StringBuilder sb3 = new StringBuilder("Publisher(identifier=");
        sb3.append(str);
        sb3.append(", type=");
        sb3.append(aVar);
        sb3.append(", connectUserProfileId=");
        b71.i.q(l14, ", nickname=", str2, ", trackerId=", sb3);
        return am.j.o(str3, ")", sb3);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lae2/e0$a;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;)V", "b", "c", "a", "Lae2/e0$a$b;", "Lae2/e0$a$c;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0042a f2836b = new C0042a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2837a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/e0$a$b;", "Lae2/e0$a;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b extends a {
            public b() {
                super("FITNESSAPP", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/e0$a$c;", "Lae2/e0$a;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c extends a {
            public c() {
                super("WEARABLE", null);
            }
        }

        private a(String str) {
            this.f2837a = str;
        }

        /* JADX INFO: renamed from: ae2.e0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lae2/e0$a$a;", "", "<init>", "()V", "", "FITNESSAPP", "Ljava/lang/String;", "WEARABLE", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0042a {
            public /* synthetic */ C0042a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public static a a(String str) {
                if ("FITNESSAPP".equalsIgnoreCase(str)) {
                    return new b();
                }
                if ("WEARABLE".equalsIgnoreCase(str)) {
                    return new c();
                }
                return null;
            }

            private C0042a() {
            }
        }

        public /* synthetic */ a(String str, p005kotlin.jvm.internal.j jVar) {
            this(str);
        }
    }

    public e0(String str, a aVar, Long l14, String str2, String str3) {
        aVar.getClass();
        this.identifier = str;
        this.type = aVar;
        this.connectUserProfileId = l14;
        this.nickname = str2;
        this.trackerId = str3;
    }

    public e0() {
        this(null, null, null, null, null, 31, null);
    }
}
