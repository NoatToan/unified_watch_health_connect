package com.xiaomi.wearable.core;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import com.xiaomi.smarthome.homeroom.model.Home;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\bQ\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 k2\u00020\u0001:\u0002klBï\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010M\u001a\u00020\u0011J\u0006\u0010N\u001a\u00020\u0011J\u0006\u0010O\u001a\u00020\u0011J\u0006\u0010P\u001a\u00020\u0011J\u0006\u0010Q\u001a\u00020\u0011J\u0006\u0010R\u001a\u00020\u0011J\u0006\u0010S\u001a\u00020\u0011J\u0006\u0010T\u001a\u00020\u0011J\u0006\u0010U\u001a\u00020\u0011J\u0006\u0010V\u001a\u00020\u0011J\u0006\u0010W\u001a\u00020\u0011J\u0006\u0010X\u001a\u00020\u0011J\u0006\u0010Y\u001a\u00020\u0011J\u0006\u0010Z\u001a\u00020\u0011J\u0006\u0010[\u001a\u00020\u0011J\u0006\u0010\\\u001a\u00020\u0011J\u0006\u0010]\u001a\u00020\u0011J\u0006\u0010^\u001a\u00020\u0011J\u0006\u0010_\u001a\u00020\u0011J\b\u0010`\u001a\u00020\u0003H\u0016J\u0013\u0010a\u001a\u00020\u00112\b\u0010b\u001a\u0004\u0018\u00010cH\u0096\u0002J\b\u0010d\u001a\u00020\bH\u0016J\b\u0010e\u001a\u00020\bH\u0016J\u0018\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020\bH\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001e\"\u0004\b.\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001e\"\u0004\b0\u0010 R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001e\"\u0004\b2\u0010 R\u001a\u0010\r\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010(\"\u0004\b4\u0010*R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001e\"\u0004\b>\u0010 R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001e\"\u0004\b@\u0010 R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001e\"\u0004\bB\u0010 R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u001e\"\u0004\bD\u0010 R\u001a\u0010\u0016\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010:\"\u0004\bE\u0010<R\u001a\u0010\u0017\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010:\"\u0004\bF\u0010<R\u001a\u0010\u0018\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010:\"\u0004\bH\u0010<R\u001a\u0010\u0019\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010:\"\u0004\bJ\u0010<R\u001a\u0010\u001a\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010(\"\u0004\bL\u0010*¨\u0006m"}, d2 = {"Lcom/xiaomi/wearable/core/DeviceInfo;", "Landroid/os/Parcelable;", "userId", "", "phoneId", Home.JSON_KEY_ADDRESS, "model", "type", "", "did", "productName", "productId", "deviceName", "accessType", "privateUUID", "Lcom/xiaomi/wearable/core/DeviceInfo$PrivateUUID;", "requestBond", "", "token", "appDeviceId", "oob", "region", "isConnectActive", "isAppActive", "createBondWithoutDialog", "proxyConnectionFirst", "retryStrategy", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/xiaomi/wearable/core/DeviceInfo$PrivateUUID;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZI)V", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "getPhoneId", "setPhoneId", "getAddress", "setAddress", "getModel", "setModel", "getType", "()I", "setType", "(I)V", "getDid", "setDid", "getProductName", "setProductName", "getProductId", "setProductId", "getDeviceName", "setDeviceName", "getAccessType", "setAccessType", "getPrivateUUID", "()Lcom/xiaomi/wearable/core/DeviceInfo$PrivateUUID;", "setPrivateUUID", "(Lcom/xiaomi/wearable/core/DeviceInfo$PrivateUUID;)V", "getRequestBond", "()Z", "setRequestBond", "(Z)V", "getToken", "setToken", "getAppDeviceId", "setAppDeviceId", "getOob", "setOob", "getRegion", "setRegion", "setConnectActive", "setAppActive", "getCreateBondWithoutDialog", "setCreateBondWithoutDialog", "getProxyConnectionFirst", "setProxyConnectionFirst", "getRetryStrategy", "setRetryStrategy", "isWearOs", "isDualWatch", "isDualBand", "isDual", "isBle", "isHuaMi", "isBloodSugar", "isBleWatch", "isEcg", "isEarphone", "isBleBand", "isJumpScale", "isBLE", "isBR", "isBand", "isWearableDevice", "isWatch", "isLocalBindMode", "isThirdParty", "toString", "equals", "other", "", "hashCode", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "PrivateUUID", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class DeviceInfo implements Parcelable {
    public static final int RETRY_STRATEGY_BACKOFF = 0;
    public static final int RETRY_STRATEGY_LIMIT_TIMES = 2;
    public static final int RETRY_STRATEGY_NONE = 1;
    public static final int TYPE_BLE_BAND = 3;
    public static final int TYPE_BLE_ECG = 4;
    public static final int TYPE_BLE_WATCH = 2;
    public static final int TYPE_DUAL_BAND = 7;
    public static final int TYPE_DUAL_WATCH = 6;
    public static final int TYPE_EARPHONE = 14;
    public static final int TYPE_GLUCOSE_METER = 12;
    public static final int TYPE_HUAMI = 5;
    public static final int TYPE_JUMP_SCALE = 11;
    public static final int TYPE_RN = 13;
    public static final int TYPE_WEAROS = 1;
    private int accessType;

    @NotNull
    private String address;

    @Nullable
    private String appDeviceId;
    private boolean createBondWithoutDialog;

    @Nullable
    private String deviceName;

    @Nullable
    private String did;
    private boolean isAppActive;
    private boolean isConnectActive;

    @Nullable
    private String model;

    @Nullable
    private String oob;

    @Nullable
    private String phoneId;

    @Nullable
    private PrivateUUID privateUUID;

    @Nullable
    private String productId;

    @Nullable
    private String productName;
    private boolean proxyConnectionFirst;

    @Nullable
    private String region;
    private boolean requestBond;
    private int retryStrategy;

    @Nullable
    private String token;
    private int type;

    @Nullable
    private String userId;

    @NotNull
    public static final Parcelable.Creator<DeviceInfo> CREATOR = new Creator();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeviceInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeviceInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeviceInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : PrivateUUID.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeviceInfo[] newArray(int i) {
            return new DeviceInfo[i];
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020 R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010¨\u0006&"}, d2 = {"Lcom/xiaomi/wearable/core/DeviceInfo$PrivateUUID;", "Landroid/os/Parcelable;", "service", "", "protoTX", "protoRX", "fitness", "voice", "mass", "otaTX", "otaRX", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getService", "()Ljava/lang/String;", "setService", "(Ljava/lang/String;)V", "getProtoTX", "setProtoTX", "getProtoRX", "setProtoRX", "getFitness", "setFitness", "getVoice", "setVoice", "getMass", "setMass", "getOtaTX", "setOtaTX", "getOtaRX", "setOtaRX", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PrivateUUID implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PrivateUUID> CREATOR = new Creator();

        @Nullable
        private String fitness;

        @Nullable
        private String mass;

        @Nullable
        private String otaRX;

        @Nullable
        private String otaTX;

        @Nullable
        private String protoRX;

        @Nullable
        private String protoTX;

        @Nullable
        private String service;

        @Nullable
        private String voice;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PrivateUUID> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrivateUUID createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PrivateUUID(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrivateUUID[] newArray(int i) {
                return new PrivateUUID[i];
            }
        }

        public PrivateUUID() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final String getFitness() {
            return this.fitness;
        }

        @Nullable
        public final String getMass() {
            return this.mass;
        }

        @Nullable
        public final String getOtaRX() {
            return this.otaRX;
        }

        @Nullable
        public final String getOtaTX() {
            return this.otaTX;
        }

        @Nullable
        public final String getProtoRX() {
            return this.protoRX;
        }

        @Nullable
        public final String getProtoTX() {
            return this.protoTX;
        }

        @Nullable
        public final String getService() {
            return this.service;
        }

        @Nullable
        public final String getVoice() {
            return this.voice;
        }

        public final void setFitness(@Nullable String str) {
            this.fitness = str;
        }

        public final void setMass(@Nullable String str) {
            this.mass = str;
        }

        public final void setOtaRX(@Nullable String str) {
            this.otaRX = str;
        }

        public final void setOtaTX(@Nullable String str) {
            this.otaTX = str;
        }

        public final void setProtoRX(@Nullable String str) {
            this.protoRX = str;
        }

        public final void setProtoTX(@Nullable String str) {
            this.protoTX = str;
        }

        public final void setService(@Nullable String str) {
            this.service = str;
        }

        public final void setVoice(@Nullable String str) {
            this.voice = str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.service);
            dest.writeString(this.protoTX);
            dest.writeString(this.protoRX);
            dest.writeString(this.fitness);
            dest.writeString(this.voice);
            dest.writeString(this.mass);
            dest.writeString(this.otaTX);
            dest.writeString(this.otaRX);
        }

        public PrivateUUID(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
            this.service = str;
            this.protoTX = str2;
            this.protoRX = str3;
            this.fitness = str4;
            this.voice = str5;
            this.mass = str6;
            this.otaTX = str7;
            this.otaRX = str8;
        }

        public /* synthetic */ PrivateUUID(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) == 0 ? str8 : null);
        }
    }

    public DeviceInfo(@Nullable String str, @Nullable String str2, @NotNull String address, @Nullable String str3, int i, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, int i2, @Nullable PrivateUUID privateUUID, boolean z, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, boolean z2, boolean z3, boolean z4, boolean z5, int i3) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.userId = str;
        this.phoneId = str2;
        this.address = address;
        this.model = str3;
        this.type = i;
        this.did = str4;
        this.productName = str5;
        this.productId = str6;
        this.deviceName = str7;
        this.accessType = i2;
        this.privateUUID = privateUUID;
        this.requestBond = z;
        this.token = str8;
        this.appDeviceId = str9;
        this.oob = str10;
        this.region = str11;
        this.isConnectActive = z2;
        this.isAppActive = z3;
        this.createBondWithoutDialog = z4;
        this.proxyConnectionFirst = z5;
        this.retryStrategy = i3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.xiaomi.wearable.core.DeviceInfo");
        DeviceInfo deviceInfo = (DeviceInfo) other;
        return Intrinsics.areEqual(this.address, deviceInfo.address) && Intrinsics.areEqual(this.model, deviceInfo.model) && this.type == deviceInfo.type && Intrinsics.areEqual(this.did, deviceInfo.did) && Intrinsics.areEqual(this.token, deviceInfo.token) && this.createBondWithoutDialog == deviceInfo.createBondWithoutDialog && this.proxyConnectionFirst == deviceInfo.proxyConnectionFirst && this.isConnectActive == deviceInfo.isConnectActive;
    }

    public final int getAccessType() {
        return this.accessType;
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    public final String getAppDeviceId() {
        return this.appDeviceId;
    }

    public final boolean getCreateBondWithoutDialog() {
        return this.createBondWithoutDialog;
    }

    @Nullable
    public final String getDeviceName() {
        return this.deviceName;
    }

    @Nullable
    public final String getDid() {
        return this.did;
    }

    @Nullable
    public final String getModel() {
        return this.model;
    }

    @Nullable
    public final String getOob() {
        return this.oob;
    }

    @Nullable
    public final String getPhoneId() {
        return this.phoneId;
    }

    @Nullable
    public final PrivateUUID getPrivateUUID() {
        return this.privateUUID;
    }

    @Nullable
    public final String getProductId() {
        return this.productId;
    }

    @Nullable
    public final String getProductName() {
        return this.productName;
    }

    public final boolean getProxyConnectionFirst() {
        return this.proxyConnectionFirst;
    }

    @Nullable
    public final String getRegion() {
        return this.region;
    }

    public final boolean getRequestBond() {
        return this.requestBond;
    }

    public final int getRetryStrategy() {
        return this.retryStrategy;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = this.address.hashCode() * 31;
        String str = this.model;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.type) * 31;
        String str2 = this.did;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.createBondWithoutDialog)) * 31) + Boolean.hashCode(this.proxyConnectionFirst);
    }

    /* JADX INFO: renamed from: isAppActive, reason: from getter */
    public final boolean getIsAppActive() {
        return this.isAppActive;
    }

    public final boolean isBLE() {
        return isBleBand() || isBleWatch();
    }

    public final boolean isBR() {
        return isDualBand() || isDualWatch();
    }

    public final boolean isBand() {
        return isBleBand() || isHuaMi() || isDualBand();
    }

    public final boolean isBle() {
        return isBleBand() || isBleWatch() || isEcg();
    }

    public final boolean isBleBand() {
        return this.type == 3;
    }

    public final boolean isBleWatch() {
        return this.type == 2;
    }

    public final boolean isBloodSugar() {
        return this.type == 12;
    }

    /* JADX INFO: renamed from: isConnectActive, reason: from getter */
    public final boolean getIsConnectActive() {
        return this.isConnectActive;
    }

    public final boolean isDual() {
        int i = this.type;
        return i == 6 || i == 7;
    }

    public final boolean isDualBand() {
        return this.type == 7;
    }

    public final boolean isDualWatch() {
        return this.type == 6;
    }

    public final boolean isEarphone() {
        return this.type == 14;
    }

    public final boolean isEcg() {
        return this.type == 4;
    }

    public final boolean isHuaMi() {
        return this.type == 5;
    }

    public final boolean isJumpScale() {
        return this.type == 11;
    }

    public final boolean isLocalBindMode() {
        return this.accessType == 1;
    }

    public final boolean isThirdParty() {
        return false;
    }

    public final boolean isWatch() {
        return isBleWatch() || isWearOs() || isDualWatch();
    }

    public final boolean isWearOs() {
        return this.type == 1;
    }

    public final boolean isWearableDevice() {
        return isBleBand() || isBleWatch() || isDualWatch() || isDualBand();
    }

    public final void setAccessType(int i) {
        this.accessType = i;
    }

    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.address = str;
    }

    public final void setAppActive(boolean z) {
        this.isAppActive = z;
    }

    public final void setAppDeviceId(@Nullable String str) {
        this.appDeviceId = str;
    }

    public final void setConnectActive(boolean z) {
        this.isConnectActive = z;
    }

    public final void setCreateBondWithoutDialog(boolean z) {
        this.createBondWithoutDialog = z;
    }

    public final void setDeviceName(@Nullable String str) {
        this.deviceName = str;
    }

    public final void setDid(@Nullable String str) {
        this.did = str;
    }

    public final void setModel(@Nullable String str) {
        this.model = str;
    }

    public final void setOob(@Nullable String str) {
        this.oob = str;
    }

    public final void setPhoneId(@Nullable String str) {
        this.phoneId = str;
    }

    public final void setPrivateUUID(@Nullable PrivateUUID privateUUID) {
        this.privateUUID = privateUUID;
    }

    public final void setProductId(@Nullable String str) {
        this.productId = str;
    }

    public final void setProductName(@Nullable String str) {
        this.productName = str;
    }

    public final void setProxyConnectionFirst(boolean z) {
        this.proxyConnectionFirst = z;
    }

    public final void setRegion(@Nullable String str) {
        this.region = str;
    }

    public final void setRequestBond(boolean z) {
        this.requestBond = z;
    }

    public final void setRetryStrategy(int i) {
        this.retryStrategy = i;
    }

    public final void setToken(@Nullable String str) {
        this.token = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUserId(@Nullable String str) {
        this.userId = str;
    }

    @NotNull
    public String toString() {
        return "DeviceInfo(address=" + this.address + ", model=" + this.model + ", type=" + this.type + ", token=" + this.token + ",did=" + this.did + ", proxyConnectionFirst=" + this.proxyConnectionFirst + ", deviceName=" + this.deviceName + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.userId);
        dest.writeString(this.phoneId);
        dest.writeString(this.address);
        dest.writeString(this.model);
        dest.writeInt(this.type);
        dest.writeString(this.did);
        dest.writeString(this.productName);
        dest.writeString(this.productId);
        dest.writeString(this.deviceName);
        dest.writeInt(this.accessType);
        PrivateUUID privateUUID = this.privateUUID;
        if (privateUUID == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            privateUUID.writeToParcel(dest, flags);
        }
        dest.writeInt(this.requestBond ? 1 : 0);
        dest.writeString(this.token);
        dest.writeString(this.appDeviceId);
        dest.writeString(this.oob);
        dest.writeString(this.region);
        dest.writeInt(this.isConnectActive ? 1 : 0);
        dest.writeInt(this.isAppActive ? 1 : 0);
        dest.writeInt(this.createBondWithoutDialog ? 1 : 0);
        dest.writeInt(this.proxyConnectionFirst ? 1 : 0);
        dest.writeInt(this.retryStrategy);
    }

    public /* synthetic */ DeviceInfo(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, int i2, PrivateUUID privateUUID, boolean z, String str9, String str10, String str11, String str12, boolean z2, boolean z3, boolean z4, boolean z5, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? null : str2, str3, (i4 & 8) != 0 ? null : str4, (i4 & 16) != 0 ? -1 : i, (i4 & 32) != 0 ? null : str5, (i4 & 64) != 0 ? null : str6, (i4 & 128) != 0 ? null : str7, (i4 & 256) != 0 ? null : str8, (i4 & 512) != 0 ? -1 : i2, (i4 & 1024) != 0 ? null : privateUUID, (i4 & 2048) != 0 ? false : z, (i4 & 4096) != 0 ? null : str9, (i4 & 8192) != 0 ? null : str10, (i4 & 16384) != 0 ? null : str11, (32768 & i4) != 0 ? null : str12, (65536 & i4) != 0 ? true : z2, (131072 & i4) != 0 ? true : z3, (262144 & i4) != 0 ? true : z4, (524288 & i4) != 0 ? false : z5, (i4 & EventRecurrence.TH) != 0 ? 0 : i3);
    }
}
