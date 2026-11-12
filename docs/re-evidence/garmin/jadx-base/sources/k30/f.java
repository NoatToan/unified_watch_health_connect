package k30;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0011\u0010\r¨\u0006\u0014"}, d2 = {"Lk30/f;", "Landroid/os/Parcelable;", "", "minGrade", "avgGrade", "maxGrade", "climbStartToSectionStartDistance", "climbStartToSectionEndDistance", "<init>", "(DDDDD)V", "a", "D", "getMinGrade", "()D", "b", "c", "getMaxGrade", "d", "f", JWKParameterNames.RSA_EXPONENT, "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("minGrade")
    private final double minGrade;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgGrade")
    private final double avgGrade;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxGrade")
    private final double maxGrade;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("climbStartToSectionStartDistance")
    private final double climbStartToSectionStartDistance;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("climbStartToSectionEndDistance")
    private final double climbStartToSectionEndDistance;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new f(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public f(double d14, double d15, double d16, double d17, double d18) {
        this.minGrade = d14;
        this.avgGrade = d15;
        this.maxGrade = d16;
        this.climbStartToSectionStartDistance = d17;
        this.climbStartToSectionEndDistance = d18;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getAvgGrade() {
        return this.avgGrade;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getClimbStartToSectionEndDistance() {
        return this.climbStartToSectionEndDistance;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Double.compare(this.minGrade, fVar.minGrade) == 0 && Double.compare(this.avgGrade, fVar.avgGrade) == 0 && Double.compare(this.maxGrade, fVar.maxGrade) == 0 && Double.compare(this.climbStartToSectionStartDistance, fVar.climbStartToSectionStartDistance) == 0 && Double.compare(this.climbStartToSectionEndDistance, fVar.climbStartToSectionEndDistance) == 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final double getClimbStartToSectionStartDistance() {
        return this.climbStartToSectionStartDistance;
    }

    public final int hashCode() {
        return Double.hashCode(this.climbStartToSectionEndDistance) + org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(Double.hashCode(this.minGrade) * 31, 31, this.avgGrade), 31, this.maxGrade), 31, this.climbStartToSectionStartDistance);
    }

    public final String toString() {
        double d14 = this.minGrade;
        double d15 = this.avgGrade;
        double d16 = this.maxGrade;
        double d17 = this.climbStartToSectionStartDistance;
        double d18 = this.climbStartToSectionEndDistance;
        StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("ClimbSectionDTO(minGrade=", d14, ", avgGrade=");
        sbA.append(d15);
        am.j.x(sbA, ", maxGrade=", d16, ", climbStartToSectionStartDistance=");
        sbA.append(d17);
        return am.j.r(sbA, ", climbStartToSectionEndDistance=", d18, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeDouble(this.minGrade);
        parcel.writeDouble(this.avgGrade);
        parcel.writeDouble(this.maxGrade);
        parcel.writeDouble(this.climbStartToSectionStartDistance);
        parcel.writeDouble(this.climbStartToSectionEndDistance);
    }
}
