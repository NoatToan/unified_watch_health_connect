package com.garmin.android.apps.connectmobile.devices.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.device.pairing.devices.PrimaryApp;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import okhttp3.internal.http2.Http2Connection;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\bJ\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0091\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\u0006\u0010\u001d\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u000b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010!\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010$\u001a\u00020\u000b\u0012\b\b\u0002\u0010%\u001a\u00020\u000b¢\u0006\u0004\b&\u0010'R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00101R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010/\u001a\u0004\b7\u00101R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010/\u001a\u0004\b9\u00101R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b4\u0010;R\u001a\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010:\u001a\u0004\b8\u0010;R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010=\u001a\u0004\b<\u0010>R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010/\u001a\u0004\bB\u00101R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010/\u001a\u0004\bH\u00101R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010/\u001a\u0004\bJ\u00101R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010/\u001a\u0004\bK\u00101R\u001a\u0010\u0018\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010:\u001a\u0004\bM\u0010;R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010N\u001a\u0004\bO\u0010PR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010Q\u001a\u0004\bG\u0010RR\"\u0010\u001c\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bJ\u0010:\u001a\u0004\bS\u0010;\"\u0004\bT\u0010UR\"\u0010\u001d\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bV\u0010:\u001a\u0004\bW\u0010;\"\u0004\bX\u0010UR\u001a\u0010\u001e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010:\u001a\u0004\bZ\u0010;R$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R*\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010!8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bD\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR$\u0010#\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b]\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010j¨\u0006k"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/model/l;", "Landroid/os/Parcelable;", "Lbm2/f;", "", "deviceUnitId", "", "deviceName", "deviceSerialNumber", "productSKU", "deviceImageURL", "deviceApplicationKey", "", "bluetoothClassicDevice", "bluetoothLowEnergyDevice", "", "deviceCategories", "Lcom/garmin/android/apps/connectmobile/devices/model/r;", "deviceTypeCapabilities", "", "minGCMAndroidVersion", "devicePartNumber", "deviceDisplayName", "includeCountries", "excludeCountries", "isPrimaryUser", "fitProductNumber", "Loc0/a;", "deviceSkuImages", "golfAppSyncCapable", "golfAppPairingCapable", "hasPowerButton", "Lcom/garmin/device/pairing/devices/PrimaryApp;", "primaryApp", "", "incompatibleApps", "currentFirmwareVersion", "intensityMinutesGoalCapable", "floorsClimbedGoalCapable", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ[Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/devices/model/r;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Loc0/a;ZZZLcom/garmin/device/pairing/devices/PrimaryApp;Ljava/util/List;Ljava/lang/Integer;ZZ)V", "a", "J", "o", "()J", "setDeviceUnitId", "(J)V", "b", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "c", "getDeviceSerialNumber", "d", "A", JWKParameterNames.RSA_EXPONENT, IntegerTokenConverter.CONVERTER_KEY, "f", "g", "Z", "()Z", "h", "[Ljava/lang/String;", "()[Ljava/lang/String;", "Lcom/garmin/android/apps/connectmobile/devices/model/r;", "getDeviceTypeCapabilities", "()Lcom/garmin/android/apps/connectmobile/devices/model/r;", JWKParameterNames.OCT_KEY_VALUE, "I", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "()I", "l", "m", "getDeviceDisplayName", JWKParameterNames.RSA_MODULUS, JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "p", "T", "Ljava/lang/Long;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "()Ljava/lang/Long;", "Loc0/a;", "()Loc0/a;", "s", "setGolfAppSyncCapable", "(Z)V", "v", "getGolfAppPairingCapable", "setGolfAppPairingCapable", "w", "getHasPowerButton", "x", "Lcom/garmin/device/pairing/devices/PrimaryApp;", "z", "()Lcom/garmin/device/pairing/devices/PrimaryApp;", "setPrimaryApp", "(Lcom/garmin/device/pairing/devices/PrimaryApp;)V", "Ljava/util/List;", "u", "()Ljava/util/List;", "setIncompatibleApps", "(Ljava/util/List;)V", "Ljava/lang/Integer;", "getCurrentFirmwareVersion", "()Ljava/lang/Integer;", "setCurrentFirmwareVersion", "(Ljava/lang/Integer;)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l implements Parcelable, bm2.f {
    public static final Parcelable.Creator<l> CREATOR = new a();
    public final boolean A;
    public final boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private long deviceUnitId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceName")
    private final String deviceName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("serialNumber")
    private final String deviceSerialNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName(alternate = {"productSku"}, value = "productSKU")
    private final String productSKU;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName(alternate = {"imageUrl"}, value = "imageURL")
    private final String deviceImageURL;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("applicationKey")
    private final String deviceApplicationKey;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bluetoothClassicDevice")
    private final boolean bluetoothClassicDevice;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bluetoothLowEnergyDevice")
    private final boolean bluetoothLowEnergyDevice;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceCategories")
    private final String[] deviceCategories;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceTypeCapabilitiesWithMinVersion")
    private final r deviceTypeCapabilities;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("minGCMAndroidVersion")
    private final int minGCMAndroidVersion;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("partNumber")
    private final String devicePartNumber;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("productDisplayName")
    private final String deviceDisplayName;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("includeCountries")
    private final String includeCountries;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("excludeCountries")
    private final String excludeCountries;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isPrimaryUser")
    private final boolean isPrimaryUser;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fitProductNumber")
    private final Long fitProductNumber;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceTutorialImages")
    private final oc0.a deviceSkuImages;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private boolean golfAppSyncCapable;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private boolean golfAppPairingCapable;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private final boolean hasPowerButton;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private PrimaryApp primaryApp;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private List<? extends PrimaryApp> incompatibleApps;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private Integer currentFirmwareVersion;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<l> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            int i14;
            boolean z14;
            ArrayList arrayList;
            parcel.getClass();
            long j8 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            boolean z15 = false;
            boolean z16 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z15 = true;
            }
            String[] strArrCreateStringArray = parcel.createStringArray();
            r rVarCreateFromParcel = parcel.readInt() == 0 ? null : r.CREATOR.createFromParcel(parcel);
            int i15 = parcel.readInt();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            boolean z17 = parcel.readInt() != 0;
            Long lValueOf = parcel.readInt() == 0 ? r17 : Long.valueOf(parcel.readLong());
            oc0.a aVar = (oc0.a) (parcel.readInt() == 0 ? r17 : oc0.a.CREATOR.createFromParcel(parcel));
            boolean z18 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                i14 = 0;
                z14 = true;
            } else {
                i14 = 0;
                z14 = false;
            }
            boolean z19 = parcel.readInt() != 0 ? 1 : i14;
            PrimaryApp primaryApp = (PrimaryApp) parcel.readParcelable(l.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i16 = parcel.readInt();
                arrayList = new ArrayList(i16);
                int iD = i14;
                while (iD != i16) {
                    iD = u0.d(l.class, parcel, arrayList, iD, 1);
                    i16 = i16;
                }
            }
            return new l(j8, string, string2, string3, string4, string5, z16, z15, strArrCreateStringArray, rVarCreateFromParcel, i15, string6, string7, string8, string9, z17, lValueOf, aVar, z18, z14, z19, primaryApp, arrayList, parcel.readInt() == 0 ? r17 : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? 1 : i14, parcel.readInt() != 0 ? 1 : i14);
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i14) {
            return new l[i14];
        }
    }

    public l(long j8, String str, String str2, String str3, String str4, String str5, boolean z14, boolean z15, String[] strArr, r rVar, int i14, String str6, String str7, String str8, String str9, boolean z16, Long l14, oc0.a aVar, boolean z17, boolean z18, boolean z19, PrimaryApp primaryApp, List list, Integer num, boolean z24, boolean z25, int i15, p005kotlin.jvm.internal.j jVar) {
        this(j8, str, str2, str3, str4, str5, z14, z15, strArr, rVar, i14, str6, str7, str8, str9, (i15 & 32768) != 0 ? true : z16, l14, aVar, z17, z18, (i15 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? true : z19, (i15 & 2097152) != 0 ? PrimaryApp.UNSPECIFIED : primaryApp, (i15 & 4194304) != 0 ? j0.f134944a : list, (i15 & 8388608) != 0 ? null : num, (i15 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? true : z24, (i15 & 33554432) != 0 ? true : z25);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final String getProductSKU() {
        return this.productSKU;
    }

    public final String C() {
        String str = this.productSKU;
        return str == null ? "" : str;
    }

    public final String D() {
        String str = this.deviceSerialNumber;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final boolean getBluetoothLowEnergyDevice() {
        return this.bluetoothLowEnergyDevice;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final boolean getBluetoothClassicDevice() {
        return this.bluetoothClassicDevice;
    }

    public final boolean H() {
        r rVar = this.deviceTypeCapabilities;
        if (rVar != null) {
            return rVar.b();
        }
        return false;
    }

    public final boolean I() {
        String[] strArr = this.deviceCategories;
        if (strArr == null) {
            return false;
        }
        for (String str : strArr) {
            g22.n.g(str);
        }
        return p13.u.z(strArr, "WELLNESS");
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final boolean getIsPrimaryUser() {
        return this.isPrimaryUser;
    }

    @Override // bm2.f
    public final void b(long j8) {
        this.deviceUnitId = j8;
    }

    public final boolean d() {
        return this.bluetoothClassicDevice;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        l lVar = (l) obj;
        return this.deviceUnitId == lVar.deviceUnitId && p005kotlin.jvm.internal.s.g(this.devicePartNumber, lVar.devicePartNumber);
    }

    public final boolean f() {
        return this.bluetoothLowEnergyDevice;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDeviceApplicationKey() {
        return this.deviceApplicationKey;
    }

    @Override // bm2.f, com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto
    public final String getApplicationKey() {
        String str = this.deviceApplicationKey;
        return str == null ? "" : str;
    }

    public final String getDeviceDisplayName() {
        return this.deviceDisplayName;
    }

    @Override // bm2.f, com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto
    /* JADX INFO: renamed from: getDeviceId, reason: from getter */
    public final long getDeviceUnitId() {
        return this.deviceUnitId;
    }

    @Override // bm2.f, com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto
    public final String getImageUrl() {
        oc0.b bVarI;
        oc0.b bVarD;
        oc0.a aVar = this.deviceSkuImages;
        String strB = null;
        String strB2 = (aVar == null || (bVarD = aVar.getDefaultWatchFaceImage()) == null) ? null : bVarD.b();
        oc0.a aVar2 = this.deviceSkuImages;
        if (aVar2 != null && (bVarI = aVar2.getSideProfileImage()) != null) {
            strB = bVarI.b();
        }
        String str = this.deviceImageURL;
        if (str != null && str.length() > 0) {
            return this.deviceImageURL;
        }
        if (strB2 == null || strB2.length() <= 0) {
            return (strB == null || strB.length() <= 0) ? "" : strB;
        }
        return strB2;
    }

    public final String getPartNumber() {
        String str = this.devicePartNumber;
        return str == null ? "" : str;
    }

    @Override // bm2.f, com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto
    public final String getPartNumberPartial() {
        String str = this.devicePartNumber;
        if (str == null) {
            return "";
        }
        List listW = d53.w.W(str, new String[]{"-"});
        return listW.size() > 1 ? ((String) listW.get(1)).substring(1) : "";
    }

    @Override // bm2.f, com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto
    public final String getProductDisplayName() {
        String str = this.deviceDisplayName;
        if (str != null && str.length() > 0) {
            return (d53.u.y(this.deviceDisplayName, "Garmin ", false) || d53.u.y(this.deviceDisplayName, "GARMIN ", false)) ? d53.w.i0(this.deviceDisplayName.substring(7)).toString() : this.deviceDisplayName;
        }
        String str2 = this.deviceName;
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String[] getDeviceCategories() {
        return this.deviceCategories;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.deviceUnitId) * 31;
        String str = this.devicePartNumber;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getDeviceImageURL() {
        return this.deviceImageURL;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getDevicePartNumber() {
        return this.devicePartNumber;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final oc0.a getDeviceSkuImages() {
        return this.deviceSkuImages;
    }

    public final long o() {
        return this.deviceUnitId;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getExcludeCountries() {
        return this.excludeCountries;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Long getFitProductNumber() {
        return this.fitProductNumber;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getGolfAppSyncCapable() {
        return this.golfAppSyncCapable;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getIncludeCountries() {
        return this.includeCountries;
    }

    public final String toString() {
        long j8 = this.deviceUnitId;
        String str = this.deviceName;
        String str2 = this.deviceSerialNumber;
        String str3 = this.productSKU;
        String str4 = this.deviceImageURL;
        String str5 = this.deviceApplicationKey;
        boolean z14 = this.bluetoothClassicDevice;
        boolean z15 = this.bluetoothLowEnergyDevice;
        String string = Arrays.toString(this.deviceCategories);
        r rVar = this.deviceTypeCapabilities;
        int i14 = this.minGCMAndroidVersion;
        String str6 = this.devicePartNumber;
        String str7 = this.deviceDisplayName;
        String str8 = this.includeCountries;
        String str9 = this.excludeCountries;
        boolean z16 = this.isPrimaryUser;
        Long l14 = this.fitProductNumber;
        oc0.a aVar = this.deviceSkuImages;
        boolean z17 = this.golfAppSyncCapable;
        boolean z18 = this.golfAppPairingCapable;
        boolean z19 = this.hasPowerButton;
        PrimaryApp primaryApp = this.primaryApp;
        List<? extends PrimaryApp> list = this.incompatibleApps;
        Integer num = this.currentFirmwareVersion;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "DeviceGeneralInfoDTO(deviceUnitId=", ", deviceName=", str);
        sn.a.t(sbK, ", deviceSerialNumber=", str2, ", productSKU=", str3);
        sn.a.t(sbK, ", deviceImageURL=", str4, ", deviceApplicationKey=", str5);
        com.airbnb.lottie.animation.keyframe.a.v(", bluetoothClassicDevice=", ", bluetoothLowEnergyDevice=", sbK, z14, z15);
        sbK.append(", deviceCategories=");
        sbK.append(string);
        sbK.append(", deviceTypeCapabilities=");
        sbK.append(rVar);
        sbK.append(", minGCMAndroidVersion=");
        sbK.append(i14);
        sbK.append(", devicePartNumber=");
        sbK.append(str6);
        sn.a.t(sbK, ", deviceDisplayName=", str7, ", includeCountries=", str8);
        com.airbnb.lottie.animation.keyframe.a.t(", excludeCountries=", str9, ", isPrimaryUser=", sbK, z16);
        sbK.append(", fitProductNumber=");
        sbK.append(l14);
        sbK.append(", deviceSkuImages=");
        sbK.append(aVar);
        com.airbnb.lottie.animation.keyframe.a.v(", golfAppSyncCapable=", ", golfAppPairingCapable=", sbK, z17, z18);
        sbK.append(", hasPowerButton=");
        sbK.append(z19);
        sbK.append(", primaryApp=");
        sbK.append(primaryApp);
        sbK.append(", incompatibleApps=");
        sbK.append(list);
        sbK.append(", currentFirmwareVersion=");
        sbK.append(num);
        com.airbnb.lottie.animation.keyframe.a.v(", intensityMinutesGoalCapable=", ", floorsClimbedGoalCapable=", sbK, this.A, this.B);
        sbK.append(")");
        return sbK.toString();
    }

    public final List<PrimaryApp> u() {
        return this.incompatibleApps;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.deviceUnitId);
        parcel.writeString(this.deviceName);
        parcel.writeString(this.deviceSerialNumber);
        parcel.writeString(this.productSKU);
        parcel.writeString(this.deviceImageURL);
        parcel.writeString(this.deviceApplicationKey);
        parcel.writeInt(this.bluetoothClassicDevice ? 1 : 0);
        parcel.writeInt(this.bluetoothLowEnergyDevice ? 1 : 0);
        parcel.writeStringArray(this.deviceCategories);
        r rVar = this.deviceTypeCapabilities;
        if (rVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rVar.writeToParcel(parcel, i14);
        }
        parcel.writeInt(this.minGCMAndroidVersion);
        parcel.writeString(this.devicePartNumber);
        parcel.writeString(this.deviceDisplayName);
        parcel.writeString(this.includeCountries);
        parcel.writeString(this.excludeCountries);
        parcel.writeInt(this.isPrimaryUser ? 1 : 0);
        Long l14 = this.fitProductNumber;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        oc0.a aVar = this.deviceSkuImages;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, i14);
        }
        parcel.writeInt(this.golfAppSyncCapable ? 1 : 0);
        parcel.writeInt(this.golfAppPairingCapable ? 1 : 0);
        parcel.writeInt(this.hasPowerButton ? 1 : 0);
        parcel.writeParcelable(this.primaryApp, i14);
        List<? extends PrimaryApp> list = this.incompatibleApps;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                parcel.writeParcelable((Parcelable) itO.next(), i14);
            }
        }
        Integer num = this.currentFirmwareVersion;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeInt(this.B ? 1 : 0);
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final int getMinGCMAndroidVersion() {
        return this.minGCMAndroidVersion;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final PrimaryApp getPrimaryApp() {
        return this.primaryApp;
    }

    public l(long j8, String str, String str2, String str3, String str4, String str5, boolean z14, boolean z15, String[] strArr, r rVar, int i14, String str6, String str7, String str8, String str9, boolean z16, Long l14, oc0.a aVar, boolean z17, boolean z18, boolean z19, PrimaryApp primaryApp, List<? extends PrimaryApp> list, Integer num, boolean z24, boolean z25) {
        this.deviceUnitId = j8;
        this.deviceName = str;
        this.deviceSerialNumber = str2;
        this.productSKU = str3;
        this.deviceImageURL = str4;
        this.deviceApplicationKey = str5;
        this.bluetoothClassicDevice = z14;
        this.bluetoothLowEnergyDevice = z15;
        this.deviceCategories = strArr;
        this.deviceTypeCapabilities = rVar;
        this.minGCMAndroidVersion = i14;
        this.devicePartNumber = str6;
        this.deviceDisplayName = str7;
        this.includeCountries = str8;
        this.excludeCountries = str9;
        this.isPrimaryUser = z16;
        this.fitProductNumber = l14;
        this.deviceSkuImages = aVar;
        this.golfAppSyncCapable = z17;
        this.golfAppPairingCapable = z18;
        this.hasPowerButton = z19;
        this.primaryApp = primaryApp;
        this.incompatibleApps = list;
        this.currentFirmwareVersion = num;
        this.A = z24;
        this.B = z25;
    }
}
