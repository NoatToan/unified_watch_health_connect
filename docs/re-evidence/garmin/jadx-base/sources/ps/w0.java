package ps;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lps/w0;", "Landroid/os/Parcelable;", "", "distance", "hangTime", "latitude", "longitude", "", FirebaseAnalytics.Param.SCORE, "speed", "", "timeStamp", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Long;)V", "a", "Ljava/lang/Double;", "b", "()Ljava/lang/Double;", "d", "c", "f", "g", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/Long;", "j", "()Ljava/lang/Long;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class w0 implements Parcelable {
    public static final Parcelable.Creator<w0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("distance")
    private final Double distance;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hangTime")
    private final Double hangTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("latitude")
    private final Double latitude;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("longitude")
    private final Double longitude;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName(FirebaseAnalytics.Param.SCORE)
    private final Integer score;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("speed")
    private final Double speed;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timestamp")
    private final Long timeStamp;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f140252h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f140253i;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<w0> {
        @Override // android.os.Parcelable.Creator
        public final w0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new w0(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final w0[] newArray(int i14) {
            return new w0[i14];
        }
    }

    public /* synthetic */ w0(Double d14, Double d15, Double d16, Double d17, Integer num, Double d18, Long l14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : d15, (i14 & 4) != 0 ? null : d16, (i14 & 8) != 0 ? null : d17, (i14 & 16) != 0 ? null : num, (i14 & 32) != 0 ? null : d18, (i14 & 64) != 0 ? null : l14);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getHangTime() {
        return this.hangTime;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return p005kotlin.jvm.internal.s.g(this.distance, w0Var.distance) && p005kotlin.jvm.internal.s.g(this.hangTime, w0Var.hangTime) && p005kotlin.jvm.internal.s.g(this.latitude, w0Var.latitude) && p005kotlin.jvm.internal.s.g(this.longitude, w0Var.longitude) && p005kotlin.jvm.internal.s.g(this.score, w0Var.score) && p005kotlin.jvm.internal.s.g(this.speed, w0Var.speed) && p005kotlin.jvm.internal.s.g(this.timeStamp, w0Var.timeStamp);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getScore() {
        return this.score;
    }

    public final int hashCode() {
        Double d14 = this.distance;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Double d15 = this.hangTime;
        int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.latitude;
        int iHashCode3 = (iHashCode2 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.longitude;
        int iHashCode4 = (iHashCode3 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Integer num = this.score;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Double d18 = this.speed;
        int iHashCode6 = (iHashCode5 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Long l14 = this.timeStamp;
        return iHashCode6 + (l14 != null ? l14.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Double getSpeed() {
        return this.speed;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Long getTimeStamp() {
        return this.timeStamp;
    }

    public final String toString() {
        Double d14 = this.distance;
        Double d15 = this.hangTime;
        Double d16 = this.latitude;
        Double d17 = this.longitude;
        Integer num = this.score;
        Double d18 = this.speed;
        Long l14 = this.timeStamp;
        StringBuilder sbI = tn.k.i("JumpMetricDTO(distance=", d14, d15, ", hangTime=", ", latitude=");
        b71.i.p(d16, d17, ", longitude=", ", score=", sbI);
        b71.i.v(sbI, num, ", speed=", d18, ", timeStamp=");
        return p6.b.g(sbI, l14, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Double d14 = this.distance;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.hangTime;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.latitude;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        Double d17 = this.longitude;
        if (d17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d17);
        }
        Integer num = this.score;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Double d18 = this.speed;
        if (d18 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d18);
        }
        Long l14 = this.timeStamp;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
    }

    public w0(Double d14, Double d15, Double d16, Double d17, Integer num, Double d18, Long l14) {
        this.distance = d14;
        this.hangTime = d15;
        this.latitude = d16;
        this.longitude = d17;
        this.score = num;
        this.speed = d18;
        this.timeStamp = l14;
    }

    public w0() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
