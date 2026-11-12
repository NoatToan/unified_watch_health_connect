package h42;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import fg0.y;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b$\u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u001d\u001a\u0004\b-\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010!\u001a\u0004\b/\u0010#R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010\u001d\u001a\u0004\b(\u0010\u001fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u001d\u001a\u0004\b6\u0010\u001fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010\u001d\u001a\u0004\b<\u0010\u001f¨\u0006="}, d2 = {"Lh42/e;", "Landroid/os/Parcelable;", "", "description", "Lh42/f;", "dewPoint", "", "epochSeconds", "feelsLikeTemperature", "", "icon", "locationName", "pressure", "pressureChange", "relativeHumidity", "Lfg0/y;", "station", "temperature", "visibility", "Lh42/g;", "wind", "windChill", "<init>", "(Ljava/lang/String;Lh42/f;Ljava/lang/Long;Lh42/f;Ljava/lang/Integer;Ljava/lang/String;Lh42/f;Lh42/f;Ljava/lang/Long;Lfg0/y;Lh42/f;Lh42/f;Lh42/g;Lh42/f;)V", "a", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "b", "Lh42/f;", "getDewPoint", "()Lh42/f;", "c", "Ljava/lang/Long;", "getEpochSeconds", "()Ljava/lang/Long;", "d", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "f", "getLocationName", "g", "getPressure", "h", "getPressureChange", IntegerTokenConverter.CONVERTER_KEY, "getRelativeHumidity", "j", "Lfg0/y;", "getStation", "()Lfg0/y;", JWKParameterNames.OCT_KEY_VALUE, "l", "getVisibility", "m", "Lh42/g;", "getWind", "()Lh42/g;", JWKParameterNames.RSA_MODULUS, "getWindChill", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("description")
    private final String description;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dewPoint")
    private final f dewPoint;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("epochSeconds")
    private final Long epochSeconds;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("feelsLikeTemperature")
    private final f feelsLikeTemperature;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("icon")
    private final Integer icon;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("locationName")
    private final String locationName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pressure")
    private final f pressure;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pressureChange")
    private final f pressureChange;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("relativeHumidity")
    private final Long relativeHumidity;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("station")
    private final y station;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("temperature")
    private final f temperature;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("visibility")
    private final f visibility;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("wind")
    private final g wind;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("windChill")
    private final f windChill;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Long l14;
            parcel.getClass();
            String string = parcel.readString();
            f fVarCreateFromParcel = parcel.readInt() == 0 ? null : f.CREATOR.createFromParcel(parcel);
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            f fVarCreateFromParcel2 = parcel.readInt() == 0 ? null : f.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                numValueOf = null;
                l14 = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
                l14 = null;
            }
            return new e(string, fVarCreateFromParcel, lValueOf, fVarCreateFromParcel2, numValueOf, parcel.readString(), (f) (parcel.readInt() == 0 ? l14 : f.CREATOR.createFromParcel(parcel)), (f) (parcel.readInt() == 0 ? l14 : f.CREATOR.createFromParcel(parcel)), parcel.readInt() == 0 ? l14 : Long.valueOf(parcel.readLong()), (y) (parcel.readInt() == 0 ? l14 : y.CREATOR.createFromParcel(parcel)), (f) (parcel.readInt() == 0 ? l14 : f.CREATOR.createFromParcel(parcel)), (f) (parcel.readInt() == 0 ? l14 : f.CREATOR.createFromParcel(parcel)), (g) (parcel.readInt() == 0 ? l14 : g.CREATOR.createFromParcel(parcel)), (f) (parcel.readInt() == 0 ? l14 : f.CREATOR.createFromParcel(parcel)));
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public /* synthetic */ e(String str, f fVar, Long l14, f fVar2, Integer num, String str2, f fVar3, f fVar4, Long l15, y yVar, f fVar5, f fVar6, g gVar, f fVar7, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : fVar, (i14 & 4) != 0 ? null : l14, (i14 & 8) != 0 ? null : fVar2, (i14 & 16) != 0 ? null : num, (i14 & 32) != 0 ? null : str2, (i14 & 64) != 0 ? null : fVar3, (i14 & 128) != 0 ? null : fVar4, (i14 & 256) != 0 ? null : l15, (i14 & 512) != 0 ? null : yVar, (i14 & 1024) != 0 ? null : fVar5, (i14 & 2048) != 0 ? null : fVar6, (i14 & 4096) != 0 ? null : gVar, (i14 & 8192) != 0 ? null : fVar7);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final f getFeelsLikeTemperature() {
        return this.feelsLikeTemperature;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getIcon() {
        return this.icon;
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
        return s.g(this.description, eVar.description) && s.g(this.dewPoint, eVar.dewPoint) && s.g(this.epochSeconds, eVar.epochSeconds) && s.g(this.feelsLikeTemperature, eVar.feelsLikeTemperature) && s.g(this.icon, eVar.icon) && s.g(this.locationName, eVar.locationName) && s.g(this.pressure, eVar.pressure) && s.g(this.pressureChange, eVar.pressureChange) && s.g(this.relativeHumidity, eVar.relativeHumidity) && s.g(this.station, eVar.station) && s.g(this.temperature, eVar.temperature) && s.g(this.visibility, eVar.visibility) && s.g(this.wind, eVar.wind) && s.g(this.windChill, eVar.windChill);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final f getTemperature() {
        return this.temperature;
    }

    public final int hashCode() {
        String str = this.description;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        f fVar = this.dewPoint;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Long l14 = this.epochSeconds;
        int iHashCode3 = (iHashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        f fVar2 = this.feelsLikeTemperature;
        int iHashCode4 = (iHashCode3 + (fVar2 == null ? 0 : fVar2.hashCode())) * 31;
        Integer num = this.icon;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.locationName;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        f fVar3 = this.pressure;
        int iHashCode7 = (iHashCode6 + (fVar3 == null ? 0 : fVar3.hashCode())) * 31;
        f fVar4 = this.pressureChange;
        int iHashCode8 = (iHashCode7 + (fVar4 == null ? 0 : fVar4.hashCode())) * 31;
        Long l15 = this.relativeHumidity;
        int iHashCode9 = (iHashCode8 + (l15 == null ? 0 : l15.hashCode())) * 31;
        y yVar = this.station;
        int iHashCode10 = (iHashCode9 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        f fVar5 = this.temperature;
        int iHashCode11 = (iHashCode10 + (fVar5 == null ? 0 : fVar5.hashCode())) * 31;
        f fVar6 = this.visibility;
        int iHashCode12 = (iHashCode11 + (fVar6 == null ? 0 : fVar6.hashCode())) * 31;
        g gVar = this.wind;
        int iHashCode13 = (iHashCode12 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        f fVar7 = this.windChill;
        return iHashCode13 + (fVar7 != null ? fVar7.hashCode() : 0);
    }

    public final String toString() {
        String str = this.description;
        f fVar = this.dewPoint;
        Long l14 = this.epochSeconds;
        f fVar2 = this.feelsLikeTemperature;
        Integer num = this.icon;
        String str2 = this.locationName;
        f fVar3 = this.pressure;
        f fVar4 = this.pressureChange;
        Long l15 = this.relativeHumidity;
        y yVar = this.station;
        f fVar5 = this.temperature;
        f fVar6 = this.visibility;
        g gVar = this.wind;
        f fVar7 = this.windChill;
        StringBuilder sb3 = new StringBuilder("RaceDayWeatherHistoricalDTO(description=");
        sb3.append(str);
        sb3.append(", dewPoint=");
        sb3.append(fVar);
        sb3.append(", epochSeconds=");
        sb3.append(l14);
        sb3.append(", feelsLikeTemperature=");
        sb3.append(fVar2);
        sb3.append(", icon=");
        p6.b.l(num, ", locationName=", str2, ", pressure=", sb3);
        sb3.append(fVar3);
        sb3.append(", pressureChange=");
        sb3.append(fVar4);
        sb3.append(", relativeHumidity=");
        sb3.append(l15);
        sb3.append(", station=");
        sb3.append(yVar);
        sb3.append(", temperature=");
        sb3.append(fVar5);
        sb3.append(", visibility=");
        sb3.append(fVar6);
        sb3.append(", wind=");
        sb3.append(gVar);
        sb3.append(", windChill=");
        sb3.append(fVar7);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.description);
        f fVar = this.dewPoint;
        if (fVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar.writeToParcel(parcel, i14);
        }
        Long l14 = this.epochSeconds;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        f fVar2 = this.feelsLikeTemperature;
        if (fVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar2.writeToParcel(parcel, i14);
        }
        Integer num = this.icon;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.locationName);
        f fVar3 = this.pressure;
        if (fVar3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar3.writeToParcel(parcel, i14);
        }
        f fVar4 = this.pressureChange;
        if (fVar4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar4.writeToParcel(parcel, i14);
        }
        Long l15 = this.relativeHumidity;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        y yVar = this.station;
        if (yVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yVar.writeToParcel(parcel, i14);
        }
        f fVar5 = this.temperature;
        if (fVar5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar5.writeToParcel(parcel, i14);
        }
        f fVar6 = this.visibility;
        if (fVar6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar6.writeToParcel(parcel, i14);
        }
        g gVar = this.wind;
        if (gVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gVar.writeToParcel(parcel, i14);
        }
        f fVar7 = this.windChill;
        if (fVar7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar7.writeToParcel(parcel, i14);
        }
    }

    public e(String str, f fVar, Long l14, f fVar2, Integer num, String str2, f fVar3, f fVar4, Long l15, y yVar, f fVar5, f fVar6, g gVar, f fVar7) {
        this.description = str;
        this.dewPoint = fVar;
        this.epochSeconds = l14;
        this.feelsLikeTemperature = fVar2;
        this.icon = num;
        this.locationName = str2;
        this.pressure = fVar3;
        this.pressureChange = fVar4;
        this.relativeHumidity = l15;
        this.station = yVar;
        this.temperature = fVar5;
        this.visibility = fVar6;
        this.wind = gVar;
        this.windChill = fVar7;
    }

    public e() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }
}
