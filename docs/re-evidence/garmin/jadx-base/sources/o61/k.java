package o61;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0015\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e¨\u0006\u0018"}, d2 = {"Lo61/k;", "Landroid/os/Parcelable;", "", "activityId", "", "aerobicValue", "anaerobicValue", "startLocal", "trainingEffectLabel", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "Ljava/lang/Double;", "f", "()Ljava/lang/Double;", "c", "g", "getStartLocal", JWKParameterNames.RSA_EXPONENT, "h3", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityId")
    private final String activityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("aerobicTrainingEffect")
    private final Double aerobicValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("anaerobicTrainingEffect")
    private final Double anaerobicValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startLocal")
    private final String startLocal;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingEffectLabel")
    private final String trainingEffectLabel;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new k(parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i14) {
            return new k[i14];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ k(String str, Double d14, Double d15, String str2, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
        Double dValueOf = Double.valueOf(Double.NaN);
        this(str, (i14 & 2) != 0 ? dValueOf : d14, (i14 & 4) != 0 ? dValueOf : d15, str2, str3);
    }

    public static k b(k kVar, Double d14, Double d15, String str) {
        String str2 = kVar.activityId;
        String str3 = kVar.startLocal;
        kVar.getClass();
        return new k(str2, d14, d15, str3, str);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getActivityId() {
        return this.activityId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return s.g(this.activityId, kVar.activityId) && s.g(this.aerobicValue, kVar.aerobicValue) && s.g(this.anaerobicValue, kVar.anaerobicValue) && s.g(this.startLocal, kVar.startLocal) && s.g(this.trainingEffectLabel, kVar.trainingEffectLabel);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getAerobicValue() {
        return this.aerobicValue;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getAnaerobicValue() {
        return this.anaerobicValue;
    }

    public final DateTime h() {
        String str = this.startLocal;
        if (str != null) {
            return g22.k.q(str, "yyyy-MM-dd'T'HH:mm:ss", null);
        }
        return null;
    }

    /* JADX INFO: renamed from: h3, reason: from getter */
    public final String getTrainingEffectLabel() {
        return this.trainingEffectLabel;
    }

    public final int hashCode() {
        String str = this.activityId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d14 = this.aerobicValue;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.anaerobicValue;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        String str2 = this.startLocal;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.trainingEffectLabel;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.activityId;
        Double d14 = this.aerobicValue;
        Double d15 = this.anaerobicValue;
        String str2 = this.startLocal;
        String str3 = this.trainingEffectLabel;
        StringBuilder sb3 = new StringBuilder("TrainingEffectStat(activityId=");
        sb3.append(str);
        sb3.append(", aerobicValue=");
        sb3.append(d14);
        sb3.append(", anaerobicValue=");
        b71.i.u(sb3, d15, ", startLocal=", str2, ", trainingEffectLabel=");
        return am.j.o(str3, ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.activityId);
        Double d14 = this.aerobicValue;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.anaerobicValue;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        parcel.writeString(this.startLocal);
        parcel.writeString(this.trainingEffectLabel);
    }

    public k(String str, Double d14, Double d15, String str2, String str3) {
        this.activityId = str;
        this.aerobicValue = d14;
        this.anaerobicValue = d15;
        this.startLocal = str2;
        this.trainingEffectLabel = str3;
    }
}
