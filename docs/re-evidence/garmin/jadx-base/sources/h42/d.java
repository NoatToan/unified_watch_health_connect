package h42;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000f¨\u0006\u001a"}, d2 = {"Lh42/d;", "Landroid/os/Parcelable;", "Lh42/f;", "average", "high", "low", "", "relativeHumidity", "windSpeed", "precip", "<init>", "(Lh42/f;Lh42/f;Lh42/f;Ljava/lang/Integer;Lh42/f;Lh42/f;)V", "a", "Lh42/f;", "b", "()Lh42/f;", "getHigh", "c", "getLow", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", JWKParameterNames.RSA_EXPONENT, "getWindSpeed", "f", "getPrecip", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("average")
    private final f average;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("high")
    private final f high;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("low")
    private final f low;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("relativeHumidity")
    private final Integer relativeHumidity;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("windSpeed")
    private final f windSpeed;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("precip")
    private final f precip;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(parcel.readInt() == 0 ? null : f.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : f.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : f.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : f.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? f.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public /* synthetic */ d(f fVar, f fVar2, f fVar3, Integer num, f fVar4, f fVar5, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : fVar, (i14 & 2) != 0 ? null : fVar2, (i14 & 4) != 0 ? null : fVar3, (i14 & 8) != 0 ? null : num, (i14 & 16) != 0 ? null : fVar4, (i14 & 32) != 0 ? null : fVar5);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final f getAverage() {
        return this.average;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getRelativeHumidity() {
        return this.relativeHumidity;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.average, dVar.average) && s.g(this.high, dVar.high) && s.g(this.low, dVar.low) && s.g(this.relativeHumidity, dVar.relativeHumidity) && s.g(this.windSpeed, dVar.windSpeed) && s.g(this.precip, dVar.precip);
    }

    public final int hashCode() {
        f fVar = this.average;
        int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        f fVar2 = this.high;
        int iHashCode2 = (iHashCode + (fVar2 == null ? 0 : fVar2.hashCode())) * 31;
        f fVar3 = this.low;
        int iHashCode3 = (iHashCode2 + (fVar3 == null ? 0 : fVar3.hashCode())) * 31;
        Integer num = this.relativeHumidity;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        f fVar4 = this.windSpeed;
        int iHashCode5 = (iHashCode4 + (fVar4 == null ? 0 : fVar4.hashCode())) * 31;
        f fVar5 = this.precip;
        return iHashCode5 + (fVar5 != null ? fVar5.hashCode() : 0);
    }

    public final String toString() {
        return "RaceDayWeatherForecastHistoricalDTO(average=" + this.average + ", high=" + this.high + ", low=" + this.low + ", relativeHumidity=" + this.relativeHumidity + ", windSpeed=" + this.windSpeed + ", precip=" + this.precip + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        f fVar = this.average;
        if (fVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar.writeToParcel(parcel, i14);
        }
        f fVar2 = this.high;
        if (fVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar2.writeToParcel(parcel, i14);
        }
        f fVar3 = this.low;
        if (fVar3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar3.writeToParcel(parcel, i14);
        }
        Integer num = this.relativeHumidity;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        f fVar4 = this.windSpeed;
        if (fVar4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar4.writeToParcel(parcel, i14);
        }
        f fVar5 = this.precip;
        if (fVar5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar5.writeToParcel(parcel, i14);
        }
    }

    public d(f fVar, f fVar2, f fVar3, Integer num, f fVar4, f fVar5) {
        this.average = fVar;
        this.high = fVar2;
        this.low = fVar3;
        this.relativeHumidity = num;
        this.windSpeed = fVar4;
        this.precip = fVar5;
    }

    public d() {
        this(null, null, null, null, null, null, 63, null);
    }
}
