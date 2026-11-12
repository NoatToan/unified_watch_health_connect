package jv1;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0013\u001a\u0004\b%\u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0013\u001a\u0004\b'\u0010\u0015R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u001fR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010\u001f¨\u0006,"}, d2 = {"Ljv1/j;", "", "", "customPlanName", "planEndDate", "", "templatePlanId", "", "availableTrainingDays", "preferredLongTrainingDays", "preferredSwimDays", "swimAbility", "localeKey", "supplementalSports", "Ljv1/b;", "workoutTargetTypePrefs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/lang/String;", "getCustomPlanName", "()Ljava/lang/String;", "b", "getPlanEndDate", "c", "Ljava/lang/Integer;", "getTemplatePlanId", "()Ljava/lang/Integer;", "d", "Ljava/util/List;", "getAvailableTrainingDays", "()Ljava/util/List;", JWKParameterNames.RSA_EXPONENT, "getPreferredLongTrainingDays", "f", "getPreferredSwimDays", "g", "getSwimAbility", "h", "getLocaleKey", IntegerTokenConverter.CONVERTER_KEY, "getSupplementalSports", "j", "getWorkoutTargetTypePrefs", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("customPlanName")
    private final String customPlanName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("planEndDate")
    private final String planEndDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("templatePlanId")
    private final Integer templatePlanId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("availableTrainingDays")
    private final List<String> availableTrainingDays;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("preferredLongTrainingDays")
    private final List<String> preferredLongTrainingDays;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("preferredSwimTrainingDays")
    private final List<String> preferredSwimDays;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("swimAbility")
    private final String swimAbility;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("localeKey")
    private final String localeKey;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("supplementalSports")
    private final List<String> supplementalSports;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutTargetTypePrefs")
    private final List<b> workoutTargetTypePrefs;

    public /* synthetic */ j(String str, String str2, Integer num, List list, List list2, List list3, String str3, String str4, List list4, List list5, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : list, (i14 & 16) != 0 ? null : list2, (i14 & 32) != 0 ? null : list3, (i14 & 64) != 0 ? null : str3, (i14 & 128) != 0 ? null : str4, (i14 & 256) != 0 ? null : list4, (i14 & 512) != 0 ? null : list5);
    }

    public final boolean a() {
        List<String> list;
        List<String> list2;
        List<b> list3;
        return (this.customPlanName == null || this.planEndDate == null || this.templatePlanId == null || (list = this.availableTrainingDays) == null || list.isEmpty() || (list2 = this.preferredLongTrainingDays) == null || list2.isEmpty() || this.localeKey == null || (list3 = this.workoutTargetTypePrefs) == null || list3.isEmpty()) ? false : true;
    }

    public final boolean b() {
        List<String> list;
        List<b> list2;
        return (this.customPlanName == null || this.planEndDate == null || this.templatePlanId == null || (list = this.preferredLongTrainingDays) == null || list.isEmpty() || this.localeKey == null || (list2 = this.workoutTargetTypePrefs) == null || list2.isEmpty()) ? false : true;
    }

    public final boolean c() {
        List<String> list;
        List<b> list2;
        return (this.customPlanName == null || this.planEndDate == null || this.templatePlanId == null || (list = this.availableTrainingDays) == null || list.isEmpty() || this.localeKey == null || (list2 = this.workoutTargetTypePrefs) == null || list2.isEmpty()) ? false : true;
    }

    public final boolean d() {
        List<String> list;
        return (!a() || (list = this.preferredSwimDays) == null || list.isEmpty() || this.swimAbility == null) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return p005kotlin.jvm.internal.s.g(this.customPlanName, jVar.customPlanName) && p005kotlin.jvm.internal.s.g(this.planEndDate, jVar.planEndDate) && p005kotlin.jvm.internal.s.g(this.templatePlanId, jVar.templatePlanId) && p005kotlin.jvm.internal.s.g(this.availableTrainingDays, jVar.availableTrainingDays) && p005kotlin.jvm.internal.s.g(this.preferredLongTrainingDays, jVar.preferredLongTrainingDays) && p005kotlin.jvm.internal.s.g(this.preferredSwimDays, jVar.preferredSwimDays) && p005kotlin.jvm.internal.s.g(this.swimAbility, jVar.swimAbility) && p005kotlin.jvm.internal.s.g(this.localeKey, jVar.localeKey) && p005kotlin.jvm.internal.s.g(this.supplementalSports, jVar.supplementalSports) && p005kotlin.jvm.internal.s.g(this.workoutTargetTypePrefs, jVar.workoutTargetTypePrefs);
    }

    public final int hashCode() {
        String str = this.customPlanName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.planEndDate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.templatePlanId;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list = this.availableTrainingDays;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.preferredLongTrainingDays;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.preferredSwimDays;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str3 = this.swimAbility;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.localeKey;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list4 = this.supplementalSports;
        int iHashCode9 = (iHashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<b> list5 = this.workoutTargetTypePrefs;
        return iHashCode9 + (list5 != null ? list5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.customPlanName;
        String str2 = this.planEndDate;
        Integer num = this.templatePlanId;
        List<String> list = this.availableTrainingDays;
        List<String> list2 = this.preferredLongTrainingDays;
        List<String> list3 = this.preferredSwimDays;
        String str3 = this.swimAbility;
        String str4 = this.localeKey;
        List<String> list4 = this.supplementalSports;
        List<b> list5 = this.workoutTargetTypePrefs;
        StringBuilder sbI = p6.b.i("FBTAdaptiveDTO(customPlanName=", str, ", planEndDate=", str2, ", templatePlanId=");
        sbI.append(num);
        sbI.append(", availableTrainingDays=");
        sbI.append(list);
        sbI.append(", preferredLongTrainingDays=");
        n23.j.z(sbI, list2, ", preferredSwimDays=", list3, ", swimAbility=");
        sn.a.t(sbI, str3, ", localeKey=", str4, ", supplementalSports=");
        return n23.j.j(sbI, list4, ", workoutTargetTypePrefs=", list5, ")");
    }

    public j(String str, String str2, Integer num, List<String> list, List<String> list2, List<String> list3, String str3, String str4, List<String> list4, List<b> list5) {
        this.customPlanName = str;
        this.planEndDate = str2;
        this.templatePlanId = num;
        this.availableTrainingDays = list;
        this.preferredLongTrainingDays = list2;
        this.preferredSwimDays = list3;
        this.swimAbility = str3;
        this.localeKey = str4;
        this.supplementalSports = list4;
        this.workoutTargetTypePrefs = list5;
    }

    public j() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }
}
