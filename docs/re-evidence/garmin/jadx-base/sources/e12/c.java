package e12;

import b71.i;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b\u0016\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b\u001a\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b\u0012\u0010\u001f¨\u0006*"}, d2 = {"Le12/c;", "", "", "", "userRoles", "", "motivation", "favoriteActivityTypes", "", "showEmergencyContactSetup", "locale", "showEmergencyContactAlert", "showLiveTrackContactAlert", "primaryActivity", "isPulseOxAllowed", "hasPerformanceDashboard", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "a", "Ljava/util/List;", "getUserRoles", "()Ljava/util/List;", "b", "Ljava/lang/Integer;", "getMotivation", "()Ljava/lang/Integer;", "c", "getFavoriteActivityTypes", "d", "Ljava/lang/Boolean;", "getShowEmergencyContactSetup", "()Ljava/lang/Boolean;", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/String;", "getLocale", "()Ljava/lang/String;", "f", "g", "h", "getPrimaryActivity", IntegerTokenConverter.CONVERTER_KEY, "j", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userRoles")
    private final List<String> userRoles;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("motivation")
    private final Integer motivation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("favoriteActivityTypes")
    private final List<String> favoriteActivityTypes;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("showEmergencyContactSetup")
    private final Boolean showEmergencyContactSetup;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("locale")
    private final String locale;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("showEmergencyContactAlert")
    private final Boolean showEmergencyContactAlert;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("showLivetrackContactAlert")
    private final Boolean showLiveTrackContactAlert;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("primaryActivity")
    private final String primaryActivity;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isPulseOxAllowed")
    private final Boolean isPulseOxAllowed;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasPerformanceDashboard")
    private final Boolean hasPerformanceDashboard;

    public c(List<String> list, Integer num, List<String> list2, Boolean bool, String str, Boolean bool2, Boolean bool3, String str2, Boolean bool4, Boolean bool5) {
        this.userRoles = list;
        this.motivation = num;
        this.favoriteActivityTypes = list2;
        this.showEmergencyContactSetup = bool;
        this.locale = str;
        this.showEmergencyContactAlert = bool2;
        this.showLiveTrackContactAlert = bool3;
        this.primaryActivity = str2;
        this.isPulseOxAllowed = bool4;
        this.hasPerformanceDashboard = bool5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getHasPerformanceDashboard() {
        return this.hasPerformanceDashboard;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getShowEmergencyContactAlert() {
        return this.showEmergencyContactAlert;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getShowLiveTrackContactAlert() {
        return this.showLiveTrackContactAlert;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getIsPulseOxAllowed() {
        return this.isPulseOxAllowed;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.userRoles, cVar.userRoles) && s.g(this.motivation, cVar.motivation) && s.g(this.favoriteActivityTypes, cVar.favoriteActivityTypes) && s.g(this.showEmergencyContactSetup, cVar.showEmergencyContactSetup) && s.g(this.locale, cVar.locale) && s.g(this.showEmergencyContactAlert, cVar.showEmergencyContactAlert) && s.g(this.showLiveTrackContactAlert, cVar.showLiveTrackContactAlert) && s.g(this.primaryActivity, cVar.primaryActivity) && s.g(this.isPulseOxAllowed, cVar.isPulseOxAllowed) && s.g(this.hasPerformanceDashboard, cVar.hasPerformanceDashboard);
    }

    public final int hashCode() {
        List<String> list = this.userRoles;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.motivation;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list2 = this.favoriteActivityTypes;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.showEmergencyContactSetup;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.locale;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.showEmergencyContactAlert;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.showLiveTrackContactAlert;
        int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.primaryActivity;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool4 = this.isPulseOxAllowed;
        int iHashCode9 = (iHashCode8 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.hasPerformanceDashboard;
        return iHashCode9 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public final String toString() {
        List<String> list = this.userRoles;
        Integer num = this.motivation;
        List<String> list2 = this.favoriteActivityTypes;
        Boolean bool = this.showEmergencyContactSetup;
        String str = this.locale;
        Boolean bool2 = this.showEmergencyContactAlert;
        Boolean bool3 = this.showLiveTrackContactAlert;
        String str2 = this.primaryActivity;
        Boolean bool4 = this.isPulseOxAllowed;
        Boolean bool5 = this.hasPerformanceDashboard;
        StringBuilder sb3 = new StringBuilder("ProfileBasedIndicators(userRoles=");
        sb3.append(list);
        sb3.append(", motivation=");
        sb3.append(num);
        sb3.append(", favoriteActivityTypes=");
        sb3.append(list2);
        sb3.append(", showEmergencyContactSetup=");
        sb3.append(bool);
        sb3.append(", locale=");
        i.w(sb3, str, ", showEmergencyContactAlert=", bool2, ", showLiveTrackContactAlert=");
        i.s(sb3, bool3, ", primaryActivity=", str2, ", isPulseOxAllowed=");
        sb3.append(bool4);
        sb3.append(", hasPerformanceDashboard=");
        sb3.append(bool5);
        sb3.append(")");
        return sb3.toString();
    }
}
