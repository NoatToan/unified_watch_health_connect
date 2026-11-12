package sc0;

import b71.i;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b\u0012\u0010!R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b\u001e\u0010#¨\u0006$"}, d2 = {"Lsc0/a;", "", "", "deviceName", "imageUrl", "batteryStatus", "sensorType", "", "serialNumber", "productId", "Lorg/joda/time/DateTime;", "_lastConnectedUTC", "", "batteryLevel", "", "rechargeableSensorCapable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "d", "h", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Long;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/Long;", "f", "g", "Lorg/joda/time/DateTime;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceName")
    private final String deviceName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("imageUrl")
    private final String imageUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("batteryStatus")
    private final String batteryStatus;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sensorType")
    private final String sensorType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("serialNumber")
    private final Long serialNumber;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("productId")
    private final String productId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastConnected")
    @JsonAdapter(GsonUtil.UtcDateTimeTypeAdapter.class)
    private final DateTime _lastConnectedUTC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("batteryLevel")
    private final Integer batteryLevel;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("rechargeableSensorCapable")
    private final Boolean rechargeableSensorCapable;

    public /* synthetic */ a(String str, String str2, String str3, String str4, Long l14, String str5, DateTime dateTime, Integer num, Boolean bool, int i14, j jVar) {
        this(str, str2, str3, str4, l14, str5, dateTime, (i14 & 128) != 0 ? null : num, bool);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getBatteryLevel() {
        return this.batteryLevel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBatteryStatus() {
        return this.batteryStatus;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final DateTime e() {
        DateTime dateTime = this._lastConnectedUTC;
        if (dateTime != null) {
            return dateTime.withZone(DateTimeZone.getDefault());
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.deviceName, aVar.deviceName) && s.g(this.imageUrl, aVar.imageUrl) && s.g(this.batteryStatus, aVar.batteryStatus) && s.g(this.sensorType, aVar.sensorType) && s.g(this.serialNumber, aVar.serialNumber) && s.g(this.productId, aVar.productId) && s.g(this._lastConnectedUTC, aVar._lastConnectedUTC) && s.g(this.batteryLevel, aVar.batteryLevel) && s.g(this.rechargeableSensorCapable, aVar.rechargeableSensorCapable);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Boolean getRechargeableSensorCapable() {
        return this.rechargeableSensorCapable;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSensorType() {
        return this.sensorType;
    }

    public final int hashCode() {
        String str = this.deviceName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.imageUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.batteryStatus;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sensorType;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l14 = this.serialNumber;
        int iHashCode5 = (iHashCode4 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str5 = this.productId;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        DateTime dateTime = this._lastConnectedUTC;
        int iHashCode7 = (iHashCode6 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Integer num = this.batteryLevel;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.rechargeableSensorCapable;
        return iHashCode8 + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getSerialNumber() {
        return this.serialNumber;
    }

    public final String toString() {
        String str = this.deviceName;
        String str2 = this.imageUrl;
        String str3 = this.batteryStatus;
        String str4 = this.sensorType;
        Long l14 = this.serialNumber;
        String str5 = this.productId;
        DateTime dateTime = this._lastConnectedUTC;
        Integer num = this.batteryLevel;
        Boolean bool = this.rechargeableSensorCapable;
        StringBuilder sbI = p6.b.i("SensorDTO(deviceName=", str, ", imageUrl=", str2, ", batteryStatus=");
        sn.a.t(sbI, str3, ", sensorType=", str4, ", serialNumber=");
        i.q(l14, ", productId=", str5, ", _lastConnectedUTC=", sbI);
        sbI.append(dateTime);
        sbI.append(", batteryLevel=");
        sbI.append(num);
        sbI.append(", rechargeableSensorCapable=");
        return p6.b.f(sbI, bool, ")");
    }

    public a(String str, String str2, String str3, String str4, Long l14, String str5, DateTime dateTime, Integer num, Boolean bool) {
        this.deviceName = str;
        this.imageUrl = str2;
        this.batteryStatus = str3;
        this.sensorType = str4;
        this.serialNumber = l14;
        this.productId = str5;
        this._lastConnectedUTC = dateTime;
        this.batteryLevel = num;
        this.rechargeableSensorCapable = bool;
    }
}
