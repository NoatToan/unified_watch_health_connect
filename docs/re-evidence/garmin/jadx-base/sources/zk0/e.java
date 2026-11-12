package zk0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import ds.e0;
import g22.k;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b0\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u0083\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\"\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!R$\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!R$\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b+\u0010\u001f\"\u0004\b,\u0010!R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010-\u001a\u0004\b\"\u0010.\"\u0004\b/\u00100R\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b1\u0010\u001f\"\u0004\b2\u0010!R\"\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010\u001d\u001a\u0004\b4\u0010\u001f\"\u0004\b5\u0010!R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0014\u001a\u0004\b6\u0010\u0016\"\u0004\b7\u0010\u0018R\"\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u0010\u001d\u001a\u0004\b9\u0010\u001f\"\u0004\b:\u0010!¨\u0006;"}, d2 = {"Lzk0/e;", "Landroid/os/Parcelable;", "", "userGoalPk", "userProfilePk", "", "userGoalCategory", "userGoalType", "startDate", "endDate", "goalName", "", "goalValue", "updateDate", "createDate", "activityTypePk", "trackingPeriodType", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "a", "J", "h", "()J", "setUserGoalPk", "(J)V", "b", "getUserProfilePk", "setUserProfilePk", "c", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "setUserGoalCategory", "(Ljava/lang/String;)V", "d", IntegerTokenConverter.CONVERTER_KEY, "setUserGoalType", JWKParameterNames.RSA_EXPONENT, "getStartDate", "setStartDate", "f", "getEndDate", "setEndDate", "getGoalName", "setGoalName", "D", "()D", JWKParameterNames.OCT_KEY_VALUE, "(D)V", "getUpdateDate", "setUpdateDate", "j", "getCreateDate", "setCreateDate", "getActivityTypePk", "setActivityTypePk", "l", "getTrackingPeriodType", "setTrackingPeriodType", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userGoalPk")
    private long userGoalPk;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePk")
    private long userProfilePk;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userGoalCategory")
    private String userGoalCategory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userGoalType")
    private String userGoalType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDate")
    private String startDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endDate")
    private String endDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("goalName")
    private String goalName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("goalValue")
    private double goalValue;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("updateDate")
    private String updateDate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createDate")
    private String createDate;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityTypePk")
    private long activityTypePk;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trackingPeriodType")
    private String trackingPeriodType;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new e(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ e(long j8, long j14, String str, String str2, String str3, String str4, String str5, double d14, String str6, String str7, long j15, String str8, int i14, j jVar) {
        this((i14 & 1) != 0 ? 0L : j8, (i14 & 2) != 0 ? 0L : j14, (i14 & 4) != 0 ? "" : str, (i14 & 8) != 0 ? "" : str2, (i14 & 16) != 0 ? "" : str3, (i14 & 32) != 0 ? "" : str4, (i14 & 64) != 0 ? "" : str5, (i14 & 128) != 0 ? 0.0d : d14, (i14 & 256) != 0 ? "" : str6, (i14 & 512) == 0 ? str7 : "", (i14 & 1024) != 0 ? 0L : j15, (i14 & 2048) != 0 ? "DAILY" : str8);
    }

    public static e b(e eVar, double d14) {
        long j8 = eVar.userGoalPk;
        long j14 = eVar.userProfilePk;
        String str = eVar.userGoalCategory;
        String str2 = eVar.userGoalType;
        String str3 = eVar.startDate;
        String str4 = eVar.endDate;
        String str5 = eVar.goalName;
        String str6 = eVar.updateDate;
        String str7 = eVar.createDate;
        long j15 = eVar.activityTypePk;
        String str8 = eVar.trackingPeriodType;
        hb.a.p(str, str2, str3, str6, str7);
        str8.getClass();
        return new e(j8, j14, str, str2, str3, str4, str5, d14, str6, str7, j15, str8);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getGoalValue() {
        return this.goalValue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.userGoalPk == eVar.userGoalPk && this.userProfilePk == eVar.userProfilePk && s.g(this.userGoalCategory, eVar.userGoalCategory) && s.g(this.userGoalType, eVar.userGoalType) && s.g(this.startDate, eVar.startDate) && s.g(this.endDate, eVar.endDate) && s.g(this.goalName, eVar.goalName) && Double.compare(this.goalValue, eVar.goalValue) == 0 && s.g(this.updateDate, eVar.updateDate) && s.g(this.createDate, eVar.createDate) && this.activityTypePk == eVar.activityTypePk && s.g(this.trackingPeriodType, eVar.trackingPeriodType);
    }

    public final DateTime f() {
        return k.q(this.updateDate, "yyyy-MM-dd'T'HH:mm:ss.S", DateTimeZone.UTC);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getUserGoalCategory() {
        return this.userGoalCategory;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getUserGoalPk() {
        return this.userGoalPk;
    }

    public final int hashCode() {
        int iJ = wr.g.j(wr.g.j(wr.g.j(q6.f.e(Long.hashCode(this.userGoalPk) * 31, 31, this.userProfilePk), 31, this.userGoalCategory), 31, this.userGoalType), 31, this.startDate);
        String str = this.endDate;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.goalName;
        return this.trackingPeriodType.hashCode() + q6.f.e(wr.g.j(wr.g.j(org.apache.commons.lang3.e.b((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.goalValue), 31, this.updateDate), 31, this.createDate), 31, this.activityTypePk);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getUserGoalType() {
        return this.userGoalType;
    }

    public final boolean j() {
        return this.userProfilePk != 0;
    }

    public final void k(double d14) {
        this.goalValue = d14;
    }

    public final String toString() {
        long j8 = this.userGoalPk;
        long j14 = this.userProfilePk;
        String str = this.userGoalCategory;
        String str2 = this.userGoalType;
        String str3 = this.startDate;
        String str4 = this.endDate;
        String str5 = this.goalName;
        double d14 = this.goalValue;
        String str6 = this.updateDate;
        String str7 = this.createDate;
        long j15 = this.activityTypePk;
        String str8 = this.trackingPeriodType;
        StringBuilder sbK = e0.k(j8, "UserGoalDTO(userGoalPk=", ", userProfilePk=");
        p6.b.k(j14, ", userGoalCategory=", str, sbK);
        sn.a.t(sbK, ", userGoalType=", str2, ", startDate=", str3);
        sn.a.t(sbK, ", endDate=", str4, ", goalName=", str5);
        am.j.x(sbK, ", goalValue=", d14, ", updateDate=");
        sn.a.t(sbK, str6, ", createDate=", str7, ", activityTypePk=");
        p6.b.k(j15, ", trackingPeriodType=", str8, sbK);
        sbK.append(")");
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.userGoalPk);
        parcel.writeLong(this.userProfilePk);
        parcel.writeString(this.userGoalCategory);
        parcel.writeString(this.userGoalType);
        parcel.writeString(this.startDate);
        parcel.writeString(this.endDate);
        parcel.writeString(this.goalName);
        parcel.writeDouble(this.goalValue);
        parcel.writeString(this.updateDate);
        parcel.writeString(this.createDate);
        parcel.writeLong(this.activityTypePk);
        parcel.writeString(this.trackingPeriodType);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Lzk0/e$a;", "", "<init>", "()V", "", "USER_GOAL_PK", "Ljava/lang/String;", "USER_PROFILE_PK", "USER_GOAL_CATEGORY", "USER_GOAL_TYPE", "START_DATE", "END_DATE", "GOAL_NAME", "GOAL_VALUE", "UPDATE_DATE", "CREATE_DATE", "ACTIVITY_TYPE_PK", "TRACKING_PERIOD_TYPE", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public e(long j8, long j14, String str, String str2, String str3, String str4, String str5, double d14, String str6, String str7, long j15, String str8) {
        hb.a.p(str, str2, str3, str6, str7);
        str8.getClass();
        this.userGoalPk = j8;
        this.userProfilePk = j14;
        this.userGoalCategory = str;
        this.userGoalType = str2;
        this.startDate = str3;
        this.endDate = str4;
        this.goalName = str5;
        this.goalValue = d14;
        this.updateDate = str6;
        this.createDate = str7;
        this.activityTypePk = j15;
        this.trackingPeriodType = str8;
    }

    public e() {
        this(0L, 0L, null, null, null, null, null, 0.0d, null, null, 0L, null, 4095, null);
    }
}
