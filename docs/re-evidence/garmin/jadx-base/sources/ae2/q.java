package ae2;

import com.garmin.android.library.livetrack.data.typeadapters.PeriodAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.Map;
import org.joda.time.Period;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0080\b\u0018\u00002\u00020\u0001Bg\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lae2/q;", "", "", "", "Lae2/c;", "deviceSettings", "", "emailEnabled", "extendLiveTrack", "groupTrackAllConnections", "groupTrackEnabled", "Lorg/joda/time/Period;", "postTrackPointFrequency", "Lae2/d0;", "profileSettings", "<init>", "(Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lorg/joda/time/Period;Lae2/d0;)V", "a", "Ljava/util/Map;", "getDeviceSettings", "()Ljava/util/Map;", "b", "Ljava/lang/Boolean;", "getEmailEnabled", "()Ljava/lang/Boolean;", "c", "getExtendLiveTrack", "d", "getGroupTrackAllConnections", JWKParameterNames.RSA_EXPONENT, "getGroupTrackEnabled", "f", "Lorg/joda/time/Period;", "getPostTrackPointFrequency", "()Lorg/joda/time/Period;", "g", "Lae2/d0;", "getProfileSettings", "()Lae2/d0;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceSettings")
    private final Map<String, c> deviceSettings;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("emailEnabled")
    private final Boolean emailEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("extendLiveTrack")
    private final Boolean extendLiveTrack;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupTrackAllConnections")
    private final Boolean groupTrackAllConnections;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupTrackEnabled")
    private final Boolean groupTrackEnabled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("postTrackPointFrequency")
    @JsonAdapter(PeriodAdapter.class)
    private final Period postTrackPointFrequency;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileSettings")
    private final d0 profileSettings;

    public /* synthetic */ q(Map map, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Period period, d0 d0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : map, (i14 & 2) != 0 ? null : bool, (i14 & 4) != 0 ? null : bool2, (i14 & 8) != 0 ? null : bool3, (i14 & 16) != 0 ? null : bool4, (i14 & 32) != 0 ? null : period, (i14 & 64) != 0 ? null : d0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return p005kotlin.jvm.internal.s.g(this.deviceSettings, qVar.deviceSettings) && p005kotlin.jvm.internal.s.g(this.emailEnabled, qVar.emailEnabled) && p005kotlin.jvm.internal.s.g(this.extendLiveTrack, qVar.extendLiveTrack) && p005kotlin.jvm.internal.s.g(this.groupTrackAllConnections, qVar.groupTrackAllConnections) && p005kotlin.jvm.internal.s.g(this.groupTrackEnabled, qVar.groupTrackEnabled) && p005kotlin.jvm.internal.s.g(this.postTrackPointFrequency, qVar.postTrackPointFrequency) && p005kotlin.jvm.internal.s.g(this.profileSettings, qVar.profileSettings);
    }

    public final int hashCode() {
        Map<String, c> map = this.deviceSettings;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Boolean bool = this.emailEnabled;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.extendLiveTrack;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.groupTrackAllConnections;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.groupTrackEnabled;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Period period = this.postTrackPointFrequency;
        int iHashCode6 = (iHashCode5 + (period == null ? 0 : period.hashCode())) * 31;
        d0 d0Var = this.profileSettings;
        return iHashCode6 + (d0Var != null ? d0Var.hashCode() : 0);
    }

    public final String toString() {
        Map<String, c> map = this.deviceSettings;
        Boolean bool = this.emailEnabled;
        Boolean bool2 = this.extendLiveTrack;
        Boolean bool3 = this.groupTrackAllConnections;
        Boolean bool4 = this.groupTrackEnabled;
        Period period = this.postTrackPointFrequency;
        d0 d0Var = this.profileSettings;
        StringBuilder sb3 = new StringBuilder("LivetrackSettingsDTO(deviceSettings=");
        sb3.append(map);
        sb3.append(", emailEnabled=");
        sb3.append(bool);
        sb3.append(", extendLiveTrack=");
        b71.i.o(bool2, bool3, ", groupTrackAllConnections=", ", groupTrackEnabled=", sb3);
        sb3.append(bool4);
        sb3.append(", postTrackPointFrequency=");
        sb3.append(period);
        sb3.append(", profileSettings=");
        sb3.append(d0Var);
        sb3.append(")");
        return sb3.toString();
    }

    public q(Map<String, c> map, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Period period, d0 d0Var) {
        this.deviceSettings = map;
        this.emailEnabled = bool;
        this.extendLiveTrack = bool2;
        this.groupTrackAllConnections = bool3;
        this.groupTrackEnabled = bool4;
        this.postTrackPointFrequency = period;
        this.profileSettings = d0Var;
    }

    public q() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
