package db1;

import com.garmin.android.apps.connectmobile.menstrualcycle.data.adapters.LocalDateAdapter;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R6\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b\u001a\u0010,\"\u0004\b-\u0010.R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010/\u001a\u0004\b\u001f\u00100\"\u0004\b1\u00102R$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b*\u00107¨\u00068"}, d2 = {"Ldb1/e;", "", "", "userProfilePk", "Lorg/joda/time/LocalDate;", "dueDate", "", "title", "Ldb1/b;", "numOfBabies", "Ljava/util/ArrayList;", "Ldb1/j;", "Lkotlin/collections/ArrayList;", "pregnancyHealthGoals", "Ldb1/u;", "weightGoalUserInputs", "Lorg/joda/time/DateTime;", "reportTimestamp", "<init>", "(Ljava/lang/Integer;Lorg/joda/time/LocalDate;Ljava/lang/String;Ldb1/b;Ljava/util/ArrayList;Ldb1/u;Lorg/joda/time/DateTime;)V", "a", "Ljava/lang/Integer;", "getUserProfilePk", "()Ljava/lang/Integer;", "setUserProfilePk", "(Ljava/lang/Integer;)V", "b", "Lorg/joda/time/LocalDate;", "()Lorg/joda/time/LocalDate;", "d", "(Lorg/joda/time/LocalDate;)V", "c", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "Ldb1/b;", "getNumOfBabies", "()Ldb1/b;", "setNumOfBabies", "(Ldb1/b;)V", JWKParameterNames.RSA_EXPONENT, "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "setPregnancyHealthGoals", "(Ljava/util/ArrayList;)V", "Ldb1/u;", "()Ldb1/u;", "setWeightGoalUserInputs", "(Ldb1/u;)V", "g", "Lorg/joda/time/DateTime;", "getReportTimestamp", "()Lorg/joda/time/DateTime;", "(Lorg/joda/time/DateTime;)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePk")
    private Integer userProfilePk;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dueDate")
    @JsonAdapter(LocalDateAdapter.class)
    private LocalDate dueDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("title")
    private String title;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("numOfBabies")
    private b numOfBabies;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pregnancyHealthGoals")
    private ArrayList<j> pregnancyHealthGoals;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weightGoalUserInputs")
    private u weightGoalUserInputs;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reportTimestamp")
    @JsonAdapter(GsonUtil.UtcDateTimeTypeAdapter.class)
    private DateTime reportTimestamp;

    public /* synthetic */ e(Integer num, LocalDate localDate, String str, b bVar, ArrayList arrayList, u uVar, DateTime dateTime, int i14, p005kotlin.jvm.internal.j jVar) {
        this(num, (i14 & 2) != 0 ? null : localDate, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : bVar, arrayList, (i14 & 32) != 0 ? null : uVar, (i14 & 64) != 0 ? null : dateTime);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getDueDate() {
        return this.dueDate;
    }

    public final ArrayList<j> b() {
        return this.pregnancyHealthGoals;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final u getWeightGoalUserInputs() {
        return this.weightGoalUserInputs;
    }

    public final void d(LocalDate localDate) {
        this.dueDate = localDate;
    }

    public final void e(DateTime dateTime) {
        this.reportTimestamp = dateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return p005kotlin.jvm.internal.s.g(this.userProfilePk, eVar.userProfilePk) && p005kotlin.jvm.internal.s.g(this.dueDate, eVar.dueDate) && p005kotlin.jvm.internal.s.g(this.title, eVar.title) && this.numOfBabies == eVar.numOfBabies && p005kotlin.jvm.internal.s.g(this.pregnancyHealthGoals, eVar.pregnancyHealthGoals) && p005kotlin.jvm.internal.s.g(this.weightGoalUserInputs, eVar.weightGoalUserInputs) && p005kotlin.jvm.internal.s.g(this.reportTimestamp, eVar.reportTimestamp);
    }

    public final void f(String str) {
        this.title = str;
    }

    public final void g(j jVar) {
        ArrayList<j> arrayList = this.pregnancyHealthGoals;
        if (arrayList != null) {
            arrayList.add(jVar);
        }
    }

    public final int hashCode() {
        Integer num = this.userProfilePk;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        LocalDate localDate = this.dueDate;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str = this.title;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.numOfBabies;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        ArrayList<j> arrayList = this.pregnancyHealthGoals;
        int iHashCode5 = (iHashCode4 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        u uVar = this.weightGoalUserInputs;
        int iHashCode6 = (iHashCode5 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        DateTime dateTime = this.reportTimestamp;
        return iHashCode6 + (dateTime != null ? dateTime.hashCode() : 0);
    }

    public final String toString() {
        return "InitPregnancyCycleDTO(userProfilePk=" + this.userProfilePk + ", dueDate=" + this.dueDate + ", title=" + this.title + ", numOfBabies=" + this.numOfBabies + ", pregnancyHealthGoals=" + this.pregnancyHealthGoals + ", weightGoalUserInputs=" + this.weightGoalUserInputs + ", reportTimestamp=" + this.reportTimestamp + ")";
    }

    public e(Integer num, LocalDate localDate, String str, b bVar, ArrayList<j> arrayList, u uVar, DateTime dateTime) {
        this.userProfilePk = num;
        this.dueDate = localDate;
        this.title = str;
        this.numOfBabies = bVar;
        this.pregnancyHealthGoals = arrayList;
        this.weightGoalUserInputs = uVar;
        this.reportTimestamp = dateTime;
    }
}
