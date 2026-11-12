package ps;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u008b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b\u0017\u0010'R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b(\u0010\u0016R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0014\u001a\u0004\b%\u0010\u0016¨\u0006*"}, d2 = {"Lps/m1;", "Landroid/os/Parcelable;", "", "batteryStatus", "bleDeviceType", "bodyLocation", "manufacturer", "", "serialNumber", "sku", "", "softwareVersion", "fitProductNumber", "", "batteryLevel", "sourceType", "productName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "getBleDeviceType", "c", "getBodyLocation", "getManufacturer", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Long;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/Long;", "f", "g", "Ljava/lang/Double;", "j", "()Ljava/lang/Double;", "h", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "getSourceType", JWKParameterNames.OCT_KEY_VALUE, "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m1 implements Parcelable {
    public static final Parcelable.Creator<m1> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("batteryStatus")
    private final String batteryStatus;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bleDeviceType")
    private final String bleDeviceType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bodyLocation")
    private final String bodyLocation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("manufacturer")
    private final String manufacturer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("serialNumber")
    private final Long serialNumber;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sku")
    private final String sku;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("softwareVersion")
    private final Double softwareVersion;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fitProductNumber")
    private final Long fitProductNumber;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("batteryLevel")
    private final Integer batteryLevel;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sourceType")
    private final String sourceType;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("productName")
    private final String productName;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<m1> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final m1 createFromParcel(Parcel parcel) {
            Long lValueOf;
            Integer numValueOf;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf = null;
                numValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                numValueOf = null;
            }
            String string5 = parcel.readString();
            Object objValueOf = parcel.readInt() == 0 ? numValueOf : Double.valueOf(parcel.readDouble());
            Object objValueOf2 = parcel.readInt() == 0 ? numValueOf : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new m1(string, string2, string3, string4, lValueOf, string5, objValueOf, objValueOf2, numValueOf, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final m1[] newArray(int i14) {
            return new m1[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ m1(String str, String str2, String str3, String str4, Long l14, String str5, Double d14, Long l15, Integer num, String str6, String str7, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : l14, (i14 & 32) != 0 ? null : str5, (i14 & 64) != 0 ? null : d14, (i14 & 128) != 0 ? null : l15, (i14 & 256) != 0 ? null : num, (i14 & 512) != 0 ? null : str6, (i14 & 1024) != 0 ? null : str7);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getBatteryLevel() {
        return this.batteryLevel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getBatteryStatus() {
        return this.batteryStatus;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return p005kotlin.jvm.internal.s.g(this.batteryStatus, m1Var.batteryStatus) && p005kotlin.jvm.internal.s.g(this.bleDeviceType, m1Var.bleDeviceType) && p005kotlin.jvm.internal.s.g(this.bodyLocation, m1Var.bodyLocation) && p005kotlin.jvm.internal.s.g(this.manufacturer, m1Var.manufacturer) && p005kotlin.jvm.internal.s.g(this.serialNumber, m1Var.serialNumber) && p005kotlin.jvm.internal.s.g(this.sku, m1Var.sku) && p005kotlin.jvm.internal.s.g(this.softwareVersion, m1Var.softwareVersion) && p005kotlin.jvm.internal.s.g(this.fitProductNumber, m1Var.fitProductNumber) && p005kotlin.jvm.internal.s.g(this.batteryLevel, m1Var.batteryLevel) && p005kotlin.jvm.internal.s.g(this.sourceType, m1Var.sourceType) && p005kotlin.jvm.internal.s.g(this.productName, m1Var.productName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getFitProductNumber() {
        return this.fitProductNumber;
    }

    public final qs.o g() {
        String str = this.bleDeviceType;
        Object obj = null;
        if (str == null) {
            return null;
        }
        w13.c cVar = qs.o.f147136i;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        while (bVarN.hasNext()) {
            Object next = bVarN.next();
            if (d53.u.q(((qs.o) next).f147137a, str, true)) {
                obj = next;
                break;
            }
        }
        return (qs.o) obj;
    }

    public final String getProductNumber() {
        String str = this.sku;
        if (str == null) {
            return null;
        }
        if (str.length() == 4) {
            return this.sku;
        }
        try {
            int iH = d53.w.H(str, "-", 0, false, 4);
            return str.substring(iH + 2, iH + 6);
        } catch (IndexOutOfBoundsException unused) {
            i2.a aVar = i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            aVar.getClass();
            i2.a.e(a2Var, "Error retrieving product number");
            return null;
        }
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    public final int hashCode() {
        String str = this.batteryStatus;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bleDeviceType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bodyLocation;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.manufacturer;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l14 = this.serialNumber;
        int iHashCode5 = (iHashCode4 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str5 = this.sku;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d14 = this.softwareVersion;
        int iHashCode7 = (iHashCode6 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Long l15 = this.fitProductNumber;
        int iHashCode8 = (iHashCode7 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Integer num = this.batteryLevel;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.sourceType;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.productName;
        return iHashCode10 + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getSerialNumber() {
        return this.serialNumber;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Double getSoftwareVersion() {
        return this.softwareVersion;
    }

    public final boolean k() {
        return !TextUtils.isEmpty(this.bleDeviceType) && "CONNECTED_GPS".equalsIgnoreCase(this.bleDeviceType);
    }

    public final String toString() {
        String str = this.batteryStatus;
        String str2 = this.bleDeviceType;
        String str3 = this.bodyLocation;
        String str4 = this.manufacturer;
        Long l14 = this.serialNumber;
        String str5 = this.sku;
        Double d14 = this.softwareVersion;
        Long l15 = this.fitProductNumber;
        Integer num = this.batteryLevel;
        String str6 = this.sourceType;
        String str7 = this.productName;
        StringBuilder sbI = p6.b.i("SensorDTO(batteryStatus=", str, ", bleDeviceType=", str2, ", bodyLocation=");
        sn.a.t(sbI, str3, ", manufacturer=", str4, ", serialNumber=");
        b71.i.q(l14, ", sku=", str5, ", softwareVersion=", sbI);
        sbI.append(d14);
        sbI.append(", fitProductNumber=");
        sbI.append(l15);
        sbI.append(", batteryLevel=");
        p6.b.l(num, ", sourceType=", str6, ", productName=", sbI);
        return am.j.o(str7, ")", sbI);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.batteryStatus);
        parcel.writeString(this.bleDeviceType);
        parcel.writeString(this.bodyLocation);
        parcel.writeString(this.manufacturer);
        Long l14 = this.serialNumber;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.sku);
        Double d14 = this.softwareVersion;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Long l15 = this.fitProductNumber;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        Integer num = this.batteryLevel;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.sourceType);
        parcel.writeString(this.productName);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lps/m1$a;", "", "<init>", "()V", "", "CONNECTED_GPS", "Ljava/lang/String;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public m1(String str, String str2, String str3, String str4, Long l14, String str5, Double d14, Long l15, Integer num, String str6, String str7) {
        this.batteryStatus = str;
        this.bleDeviceType = str2;
        this.bodyLocation = str3;
        this.manufacturer = str4;
        this.serialNumber = l14;
        this.sku = str5;
        this.softwareVersion = d14;
        this.fitProductNumber = l15;
        this.batteryLevel = num;
        this.sourceType = str6;
        this.productName = str7;
    }

    public m1() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
}
