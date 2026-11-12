package f12;

import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.util.adapters.YearMonthDayDateTimeJsonAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u000e\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001e¨\u0006!"}, d2 = {"Lf12/w;", "", "", "userOptionalFeaturePK", "userProfilePK", "Lf12/s;", "optionalFeatureType", "Lf12/v;", "userOptionType", "Lorg/joda/time/DateTime;", "createDate", "updateDate", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Lf12/s;Lf12/v;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "a", "Ljava/lang/Long;", "getUserOptionalFeaturePK", "()Ljava/lang/Long;", "b", "getUserProfilePK", "c", "Lf12/s;", "getOptionalFeatureType", "()Lf12/s;", "d", "Lf12/v;", "()Lf12/v;", JWKParameterNames.RSA_EXPONENT, "Lorg/joda/time/DateTime;", "getCreateDate", "()Lorg/joda/time/DateTime;", "f", "getUpdateDate", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userOptionalFeaturePK")
    private final Long userOptionalFeaturePK;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePK")
    private final Long userProfilePK;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("optionalFeatureType")
    private final s optionalFeatureType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userOptionType")
    private final v userOptionType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createDate")
    @JsonAdapter(YearMonthDayDateTimeJsonAdapter.class)
    private final DateTime createDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("updateDate")
    @JsonAdapter(YearMonthDayDateTimeJsonAdapter.class)
    private final DateTime updateDate;

    public /* synthetic */ w(Long l14, Long l15, s sVar, v vVar, DateTime dateTime, DateTime dateTime2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : l15, (i14 & 4) != 0 ? null : sVar, (i14 & 8) != 0 ? null : vVar, (i14 & 16) != 0 ? null : dateTime, (i14 & 32) != 0 ? null : dateTime2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final v getUserOptionType() {
        return this.userOptionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return p005kotlin.jvm.internal.s.g(this.userOptionalFeaturePK, wVar.userOptionalFeaturePK) && p005kotlin.jvm.internal.s.g(this.userProfilePK, wVar.userProfilePK) && this.optionalFeatureType == wVar.optionalFeatureType && this.userOptionType == wVar.userOptionType && p005kotlin.jvm.internal.s.g(this.createDate, wVar.createDate) && p005kotlin.jvm.internal.s.g(this.updateDate, wVar.updateDate);
    }

    public final int hashCode() {
        Long l14 = this.userOptionalFeaturePK;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Long l15 = this.userProfilePK;
        int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
        s sVar = this.optionalFeatureType;
        int iHashCode3 = (iHashCode2 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        v vVar = this.userOptionType;
        int iHashCode4 = (iHashCode3 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        DateTime dateTime = this.createDate;
        int iHashCode5 = (iHashCode4 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.updateDate;
        return iHashCode5 + (dateTime2 != null ? dateTime2.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.userOptionalFeaturePK;
        Long l15 = this.userProfilePK;
        s sVar = this.optionalFeatureType;
        v vVar = this.userOptionType;
        DateTime dateTime = this.createDate;
        DateTime dateTime2 = this.updateDate;
        StringBuilder sbJ = f3.j(l14, l15, "UserOptionalFeatureDTO(userOptionalFeaturePK=", ", userProfilePK=", ", optionalFeatureType=");
        sbJ.append(sVar);
        sbJ.append(", userOptionType=");
        sbJ.append(vVar);
        sbJ.append(", createDate=");
        sbJ.append(dateTime);
        sbJ.append(", updateDate=");
        sbJ.append(dateTime2);
        sbJ.append(")");
        return sbJ.toString();
    }

    public w(Long l14, Long l15, s sVar, v vVar, DateTime dateTime, DateTime dateTime2) {
        this.userOptionalFeaturePK = l14;
        this.userProfilePK = l15;
        this.optionalFeatureType = sVar;
        this.userOptionType = vVar;
        this.createDate = dateTime;
        this.updateDate = dateTime2;
    }

    public w() {
        this(null, null, null, null, null, null, 63, null);
    }
}
