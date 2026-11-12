package cy0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\r\u0012\u0010B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcy0/c;", "Landroid/os/Parcelable;", "", "activityId", "", "Lps/j;", "images", "Lcy0/c$b;", "weather", "<init>", "(JLjava/util/List;Lcy0/c$b;)V", "a", "J", "b", "()J", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "Lcy0/c$b;", "getWeather", "()Lcy0/c$b;", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityId")
    private final long activityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("images")
    private final List<ps.j> images;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weather")
    private final b weather;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            long j8 = parcel.readLong();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iD = 0;
            while (iD != i14) {
                iD = u0.d(c.class, parcel, arrayList, iD, 1);
            }
            return new c(j8, arrayList, b.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010\u0014R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcy0/c$b;", "Landroid/os/Parcelable;", "", "temp", "apparentTemp", "dewPoint", "relativeHumidity", "windDirection", "", "windDirectionCompassPoint", "windSpeed", "Lcy0/c$c;", "weatherStationDTO", "Lcy0/c$d;", "weatherTypeDTO", "<init>", "(DDDDDLjava/lang/String;DLcy0/c$c;Lcy0/c$d;)V", "a", "D", "getTemp", "()D", "b", "getApparentTemp", "c", "getDewPoint", "d", "getRelativeHumidity", JWKParameterNames.RSA_EXPONENT, "getWindDirection", "f", "Ljava/lang/String;", "getWindDirectionCompassPoint", "()Ljava/lang/String;", "g", "getWindSpeed", "h", "Lcy0/c$c;", "getWeatherStationDTO", "()Lcy0/c$c;", IntegerTokenConverter.CONVERTER_KEY, "Lcy0/c$d;", "getWeatherTypeDTO", "()Lcy0/c$d;", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("temp")
        private final double temp;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @SerializedName("apparentTemp")
        private final double apparentTemp;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @SerializedName("dewPoint")
        private final double dewPoint;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @SerializedName("relativeHumidity")
        private final double relativeHumidity;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @SerializedName("windDirection")
        private final double windDirection;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @SerializedName("windDirectionCompassPoint")
        private final String windDirectionCompassPoint;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @SerializedName("windSpeed")
        private final double windSpeed;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @SerializedName("weatherStationDTO")
        private final C1214c weatherStationDTO;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @SerializedName("weatherTypeDTO")
        private final d weatherTypeDTO;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new b(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readDouble(), C1214c.CREATOR.createFromParcel(parcel), d.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        public b(double d14, double d15, double d16, double d17, double d18, String str, double d19, C1214c c1214c, d dVar) {
            str.getClass();
            c1214c.getClass();
            dVar.getClass();
            this.temp = d14;
            this.apparentTemp = d15;
            this.dewPoint = d16;
            this.relativeHumidity = d17;
            this.windDirection = d18;
            this.windDirectionCompassPoint = str;
            this.windSpeed = d19;
            this.weatherStationDTO = c1214c;
            this.weatherTypeDTO = dVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Double.compare(this.temp, bVar.temp) == 0 && Double.compare(this.apparentTemp, bVar.apparentTemp) == 0 && Double.compare(this.dewPoint, bVar.dewPoint) == 0 && Double.compare(this.relativeHumidity, bVar.relativeHumidity) == 0 && Double.compare(this.windDirection, bVar.windDirection) == 0 && p005kotlin.jvm.internal.s.g(this.windDirectionCompassPoint, bVar.windDirectionCompassPoint) && Double.compare(this.windSpeed, bVar.windSpeed) == 0 && p005kotlin.jvm.internal.s.g(this.weatherStationDTO, bVar.weatherStationDTO) && p005kotlin.jvm.internal.s.g(this.weatherTypeDTO, bVar.weatherTypeDTO);
        }

        public final int hashCode() {
            return this.weatherTypeDTO.hashCode() + ((this.weatherStationDTO.hashCode() + org.apache.commons.lang3.e.b(wr.g.j(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(Double.hashCode(this.temp) * 31, 31, this.apparentTemp), 31, this.dewPoint), 31, this.relativeHumidity), 31, this.windDirection), 31, this.windDirectionCompassPoint), 31, this.windSpeed)) * 31);
        }

        public final String toString() {
            double d14 = this.temp;
            double d15 = this.apparentTemp;
            double d16 = this.dewPoint;
            double d17 = this.relativeHumidity;
            double d18 = this.windDirection;
            String str = this.windDirectionCompassPoint;
            double d19 = this.windSpeed;
            C1214c c1214c = this.weatherStationDTO;
            d dVar = this.weatherTypeDTO;
            StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("Weather(temp=", d14, ", apparentTemp=");
            sbA.append(d15);
            am.j.x(sbA, ", dewPoint=", d16, ", relativeHumidity=");
            sbA.append(d17);
            am.j.x(sbA, ", windDirection=", d18, ", windDirectionCompassPoint=");
            sbA.append(str);
            sbA.append(", windSpeed=");
            sbA.append(d19);
            sbA.append(", weatherStationDTO=");
            sbA.append(c1214c);
            sbA.append(", weatherTypeDTO=");
            sbA.append(dVar);
            sbA.append(")");
            return sbA.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeDouble(this.temp);
            parcel.writeDouble(this.apparentTemp);
            parcel.writeDouble(this.dewPoint);
            parcel.writeDouble(this.relativeHumidity);
            parcel.writeDouble(this.windDirection);
            parcel.writeString(this.windDirectionCompassPoint);
            parcel.writeDouble(this.windSpeed);
            this.weatherStationDTO.writeToParcel(parcel, i14);
            this.weatherTypeDTO.writeToParcel(parcel, i14);
        }
    }

    /* JADX INFO: renamed from: cy0.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcy0/c$c;", "Landroid/os/Parcelable;", "", TtmlNode.ATTR_ID, "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C1214c implements Parcelable {
        public static final Parcelable.Creator<C1214c> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName(TtmlNode.ATTR_ID)
        private final String id;

        /* JADX INFO: renamed from: cy0.c$c$a */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<C1214c> {
            @Override // android.os.Parcelable.Creator
            public final C1214c createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new C1214c(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final C1214c[] newArray(int i14) {
                return new C1214c[i14];
            }
        }

        public C1214c(String str) {
            str.getClass();
            this.id = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1214c) && p005kotlin.jvm.internal.s.g(this.id, ((C1214c) obj).id);
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final String toString() {
            return am.j.m("WeatherStationDTO(id=", this.id, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.id);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcy0/c$d;", "Landroid/os/Parcelable;", "", "desc", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getDesc", "()Ljava/lang/String;", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("desc")
        private final String desc;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new d(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i14) {
                return new d[i14];
            }
        }

        public d(String str) {
            str.getClass();
            this.desc = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p005kotlin.jvm.internal.s.g(this.desc, ((d) obj).desc);
        }

        public final int hashCode() {
            return this.desc.hashCode();
        }

        public final String toString() {
            return am.j.m("WeatherTypeDTO(desc=", this.desc, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.desc);
        }
    }

    public c(long j8, List<ps.j> list, b bVar) {
        list.getClass();
        bVar.getClass();
        this.activityId = j8;
        this.images = list;
        this.weather = bVar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getActivityId() {
        return this.activityId;
    }

    public final List<ps.j> d() {
        return this.images;
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
        return this.activityId == cVar.activityId && p005kotlin.jvm.internal.s.g(this.images, cVar.images) && p005kotlin.jvm.internal.s.g(this.weather, cVar.weather);
    }

    public final int hashCode() {
        return this.weather.hashCode() + u0.b(Long.hashCode(this.activityId) * 31, 31, this.images);
    }

    public final String toString() {
        return "ActivityResourcesDTO(activityId=" + this.activityId + ", images=" + this.images + ", weather=" + this.weather + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.activityId);
        Iterator itE = kg.f.e(this.images, parcel);
        while (itE.hasNext()) {
            parcel.writeParcelable((Parcelable) itE.next(), i14);
        }
        this.weather.writeToParcel(parcel, i14);
    }
}
