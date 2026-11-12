package h42;

import android.os.Parcel;
import android.os.Parcelable;
import b71.i;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u001b\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u001c"}, d2 = {"Lh42/c;", "Landroid/os/Parcelable;", "", "hourOfDay", "icon", "Lh42/f;", "temp", "Lh42/g;", "wind", "precipPercent", "relativeHumidity", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Lh42/f;Lh42/g;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Ljava/lang/Integer;", "getHourOfDay", "()Ljava/lang/Integer;", "b", "c", "Lh42/f;", "f", "()Lh42/f;", "d", "Lh42/g;", "getWind", "()Lh42/g;", JWKParameterNames.RSA_EXPONENT, "getPrecipPercent", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hourOfDay")
    private final Integer hourOfDay;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("icon")
    private final Integer icon;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("temp")
    private final f temp;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("wind")
    private final g wind;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("precipPercent")
    private final Integer precipPercent;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("relativeHumidity")
    private final Integer relativeHumidity;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : f.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : g.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(Integer num, Integer num2, f fVar, g gVar, Integer num3, Integer num4, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, (i14 & 4) != 0 ? null : fVar, (i14 & 8) != 0 ? null : gVar, (i14 & 16) != 0 ? null : num3, (i14 & 32) != 0 ? null : num4);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getIcon() {
        return this.icon;
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
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.hourOfDay, cVar.hourOfDay) && s.g(this.icon, cVar.icon) && s.g(this.temp, cVar.temp) && s.g(this.wind, cVar.wind) && s.g(this.precipPercent, cVar.precipPercent) && s.g(this.relativeHumidity, cVar.relativeHumidity);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final f getTemp() {
        return this.temp;
    }

    public final int hashCode() {
        Integer num = this.hourOfDay;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.icon;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        f fVar = this.temp;
        int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        g gVar = this.wind;
        int iHashCode4 = (iHashCode3 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Integer num3 = this.precipPercent;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.relativeHumidity;
        return iHashCode5 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.hourOfDay;
        Integer num2 = this.icon;
        f fVar = this.temp;
        g gVar = this.wind;
        Integer num3 = this.precipPercent;
        Integer num4 = this.relativeHumidity;
        StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(num, "RaceDayWeatherForecastDTO(hourOfDay=", ", icon=", ", temp=", num2);
        sbL.append(fVar);
        sbL.append(", wind=");
        sbL.append(gVar);
        sbL.append(", precipPercent=");
        return i.h(sbL, num3, ", relativeHumidity=", num4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.hourOfDay;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.icon;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        f fVar = this.temp;
        if (fVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar.writeToParcel(parcel, i14);
        }
        g gVar = this.wind;
        if (gVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gVar.writeToParcel(parcel, i14);
        }
        Integer num3 = this.precipPercent;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        Integer num4 = this.relativeHumidity;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num4);
        }
    }

    public c(Integer num, Integer num2, f fVar, g gVar, Integer num3, Integer num4) {
        this.hourOfDay = num;
        this.icon = num2;
        this.temp = fVar;
        this.wind = gVar;
        this.precipPercent = num3;
        this.relativeHumidity = num4;
    }

    public c() {
        this(null, null, null, null, null, null, 63, null);
    }
}
