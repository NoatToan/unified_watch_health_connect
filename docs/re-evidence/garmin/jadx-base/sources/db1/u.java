package db1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Ldb1/u;", "Landroid/os/Parcelable;", "", "weightGoalRecommendation", "", "heightInCm", "weightInGram", "Lorg/joda/time/DateTime;", "reportTimestamp", "<init>", "(ZLjava/lang/Double;Ljava/lang/Double;Lorg/joda/time/DateTime;)V", "a", "Z", "f", "()Z", "j", "(Z)V", "b", "Ljava/lang/Double;", "d", "()Ljava/lang/Double;", "h", "(Ljava/lang/Double;)V", "c", "g", JWKParameterNames.OCT_KEY_VALUE, "Lorg/joda/time/DateTime;", "getReportTimestamp", "()Lorg/joda/time/DateTime;", IntegerTokenConverter.CONVERTER_KEY, "(Lorg/joda/time/DateTime;)V", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class u implements Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weightGoalRecommendation")
    private boolean weightGoalRecommendation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("heightInCm")
    private Double heightInCm;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weightInGram")
    private Double weightInGram;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reportTimestamp")
    @JsonAdapter(GsonUtil.UtcDateTimeTypeAdapter.class)
    private DateTime reportTimestamp;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<u> {
        @Override // android.os.Parcelable.Creator
        public final u createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new u(parcel.readInt() != 0, parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, (DateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final u[] newArray(int i14) {
            return new u[i14];
        }
    }

    public /* synthetic */ u(boolean z14, Double d14, Double d15, DateTime dateTime, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? null : d14, (i14 & 4) != 0 ? null : d15, (i14 & 8) != 0 ? null : dateTime);
    }

    public static u b(u uVar) {
        return new u(uVar.weightGoalRecommendation, uVar.heightInCm, uVar.weightInGram, uVar.reportTimestamp);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getHeightInCm() {
        return this.heightInCm;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.weightGoalRecommendation == uVar.weightGoalRecommendation && p005kotlin.jvm.internal.s.g(this.heightInCm, uVar.heightInCm) && p005kotlin.jvm.internal.s.g(this.weightInGram, uVar.weightInGram) && p005kotlin.jvm.internal.s.g(this.reportTimestamp, uVar.reportTimestamp);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getWeightGoalRecommendation() {
        return this.weightGoalRecommendation;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getWeightInGram() {
        return this.weightInGram;
    }

    public final void h(Double d14) {
        this.heightInCm = d14;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.weightGoalRecommendation) * 31;
        Double d14 = this.heightInCm;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.weightInGram;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        DateTime dateTime = this.reportTimestamp;
        return iHashCode3 + (dateTime != null ? dateTime.hashCode() : 0);
    }

    public final void i(DateTime dateTime) {
        this.reportTimestamp = dateTime;
    }

    public final void j(boolean z14) {
        this.weightGoalRecommendation = z14;
    }

    public final void k(Double d14) {
        this.weightInGram = d14;
    }

    public final String toString() {
        return "WeightGoalUserInputsDTO(weightGoalRecommendation=" + this.weightGoalRecommendation + ", heightInCm=" + this.heightInCm + ", weightInGram=" + this.weightInGram + ", reportTimestamp=" + this.reportTimestamp + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.weightGoalRecommendation ? 1 : 0);
        Double d14 = this.heightInCm;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.weightInGram;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        parcel.writeSerializable(this.reportTimestamp);
    }

    public u(boolean z14, Double d14, Double d15, DateTime dateTime) {
        this.weightGoalRecommendation = z14;
        this.heightInCm = d14;
        this.weightInGram = d15;
        this.reportTimestamp = dateTime;
    }

    public u() {
        this(false, null, null, null, 15, null);
    }
}
