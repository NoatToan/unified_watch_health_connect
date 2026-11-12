package xw1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R$\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b \u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0013\u001a\u0004\b$\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0016\u001a\u0004\b(\u0010\u0018R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0016\u001a\u0004\b\"\u0010\u0018¨\u0006*"}, d2 = {"Lxw1/p;", "Landroid/os/Parcelable;", "", "name", "", "planDistanceMeters", "planDurationMax", "planDurationMin", "", "trainingLevels", "trainingSubtype", "trainingType", "trainingVersion", "weeklyWorkoutsMax", "weeklyWorkoutsMin", "workoutPlanTypeId", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "c", "getPlanDurationMax", "getPlanDurationMin", JWKParameterNames.RSA_EXPONENT, "Ljava/util/List;", "getTrainingLevels", "()Ljava/util/List;", "f", "getTrainingSubtype", "g", "h", "getTrainingVersion", IntegerTokenConverter.CONVERTER_KEY, "getWeeklyWorkoutsMax", "j", "getWeeklyWorkoutsMin", JWKParameterNames.OCT_KEY_VALUE, "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("planDistanceMeters")
    private final Integer planDistanceMeters;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("planDurationMax")
    private final Integer planDurationMax;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("planDurationMin")
    private final Integer planDurationMin;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingLevel")
    private final List<String> trainingLevels;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingSubtype")
    private final String trainingSubtype;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingType")
    private final String trainingType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingVersion")
    private final String trainingVersion;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weeklyWorkoutsMax")
    private final Integer weeklyWorkoutsMax;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weeklyWorkoutsMin")
    private final Integer weeklyWorkoutsMin;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutPlanTypeId")
    private final Integer workoutPlanTypeId;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<p> {
        @Override // android.os.Parcelable.Creator
        public final p createFromParcel(Parcel parcel) {
            Integer num;
            Integer numValueOf;
            parcel.getClass();
            String string = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            Integer num2 = numValueOf3;
            Integer num3 = numValueOf4;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                Integer num4 = numValueOf6;
                numValueOf = null;
                num = num4;
            } else {
                num = numValueOf6;
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new p(string, numValueOf2, num2, num3, arrayListCreateStringArrayList, string2, string3, string4, numValueOf5, num, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final p[] newArray(int i14) {
            return new p[i14];
        }
    }

    public p(String str, Integer num, Integer num2, Integer num3, List<String> list, String str2, String str3, String str4, Integer num4, Integer num5, Integer num6) {
        this.name = str;
        this.planDistanceMeters = num;
        this.planDurationMax = num2;
        this.planDurationMin = num3;
        this.trainingLevels = list;
        this.trainingSubtype = str2;
        this.trainingType = str3;
        this.trainingVersion = str4;
        this.weeklyWorkoutsMax = num4;
        this.weeklyWorkoutsMin = num5;
        this.workoutPlanTypeId = num6;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getPlanDistanceMeters() {
        return this.planDistanceMeters;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return s.g(this.name, pVar.name) && s.g(this.planDistanceMeters, pVar.planDistanceMeters) && s.g(this.planDurationMax, pVar.planDurationMax) && s.g(this.planDurationMin, pVar.planDurationMin) && s.g(this.trainingLevels, pVar.trainingLevels) && s.g(this.trainingSubtype, pVar.trainingSubtype) && s.g(this.trainingType, pVar.trainingType) && s.g(this.trainingVersion, pVar.trainingVersion) && s.g(this.weeklyWorkoutsMax, pVar.weeklyWorkoutsMax) && s.g(this.weeklyWorkoutsMin, pVar.weeklyWorkoutsMin) && s.g(this.workoutPlanTypeId, pVar.workoutPlanTypeId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTrainingType() {
        return this.trainingType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getWorkoutPlanTypeId() {
        return this.workoutPlanTypeId;
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.planDistanceMeters;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.planDurationMax;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.planDurationMin;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<String> list = this.trainingLevels;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.trainingSubtype;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.trainingType;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.trainingVersion;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num4 = this.weeklyWorkoutsMax;
        int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.weeklyWorkoutsMin;
        int iHashCode10 = (iHashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.workoutPlanTypeId;
        return iHashCode10 + (num6 != null ? num6.hashCode() : 0);
    }

    public final String toString() {
        String str = this.name;
        Integer num = this.planDistanceMeters;
        Integer num2 = this.planDurationMax;
        Integer num3 = this.planDurationMin;
        List<String> list = this.trainingLevels;
        String str2 = this.trainingSubtype;
        String str3 = this.trainingType;
        String str4 = this.trainingVersion;
        Integer num4 = this.weeklyWorkoutsMax;
        Integer num5 = this.weeklyWorkoutsMin;
        Integer num6 = this.workoutPlanTypeId;
        StringBuilder sbN = u0.n("WorkoutPlanTypeDTO(name=", num, str, ", planDistanceMeters=", ", planDurationMax=");
        x.m(sbN, num2, ", planDurationMin=", num3, ", trainingLevels=");
        o2.c.n(", trainingSubtype=", str2, ", trainingType=", sbN, list);
        sn.a.t(sbN, str3, ", trainingVersion=", str4, ", weeklyWorkoutsMax=");
        x.m(sbN, num4, ", weeklyWorkoutsMin=", num5, ", workoutPlanTypeId=");
        return f3.i(sbN, num6, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.name);
        Integer num = this.planDistanceMeters;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.planDurationMax;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Integer num3 = this.planDurationMin;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        parcel.writeStringList(this.trainingLevels);
        parcel.writeString(this.trainingSubtype);
        parcel.writeString(this.trainingType);
        parcel.writeString(this.trainingVersion);
        Integer num4 = this.weeklyWorkoutsMax;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num4);
        }
        Integer num5 = this.weeklyWorkoutsMin;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num5);
        }
        Integer num6 = this.workoutPlanTypeId;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num6);
        }
    }
}
