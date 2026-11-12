package com.xiaomi.fitness.device.manager.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000 c*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0002cdB\u0007¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0010\u0010W\u001a\u00020X2\u0006\u0010\u0006\u001a\u00020\u0007H\u0004J\u0006\u0010Y\u001a\u00020XJ\u0006\u0010Z\u001a\u00020$J\b\u0010[\u001a\u00020\fH\u0016J\u0018\u0010\\\u001a\u00020X2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010]\u001a\u000200H\u0016J\b\u0010^\u001a\u000200H\u0016J\u0013\u0010_\u001a\u00020$2\b\u0010`\u001a\u0004\u0018\u00010aH\u0096\u0002J\b\u0010b\u001a\u000200H\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R\u001a\u0010#\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010+\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b,\u0010\u000eR\u0013\u0010-\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b.\u0010\u000eR$\u00101\u001a\u0002002\u0006\u0010/\u001a\u0002008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0013\u00106\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b7\u0010\u000eR\u0013\u00108\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b9\u0010\u000eR\u0011\u0010:\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b;\u0010\u000eR\u0011\u0010<\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b=\u0010\u000eR\u0011\u0010>\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b?\u0010\u000eR\u0013\u0010@\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bA\u0010\u000eR\u0013\u0010B\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bC\u0010\u000eR\u0011\u0010D\u001a\u0002008F¢\u0006\u0006\u001a\u0004\bE\u00103R\u001c\u0010F\u001a\u0004\u0018\u00010GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0011\u0010L\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bL\u0010&R\u0011\u0010M\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bM\u0010&R\u0011\u0010N\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bN\u0010&R\u0011\u0010O\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bO\u0010&R\u0011\u0010P\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bP\u0010&R\u0011\u0010Q\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bQ\u0010&R\u0011\u0010R\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bR\u0010&R\u0011\u0010S\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bS\u0010&R\u0011\u0010T\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bT\u0010&R\u0011\u0010U\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bU\u0010&R\u0011\u0010V\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bV\u0010&¨\u0006e"}, d2 = {"Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo;", "T", "Lcom/xiaomi/fitness/device/manager/bean/Device;", "Landroid/os/Parcelable;", "<init>", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "device", "Lcom/xiaomi/fitness/device/manager/bean/Device;", "firmwareVersion", "", "getFirmwareVersion", "()Ljava/lang/String;", "setFirmwareVersion", "(Ljava/lang/String;)V", "product", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "getProduct", "()Lcom/xiaomi/fitness/device/manager/bean/Product;", "setProduct", "(Lcom/xiaomi/fitness/device/manager/bean/Product;)V", "bleName", "getBleName", "setBleName", "batteryInfo", "Lcom/xiaomi/fitness/device/manager/bean/BatteryInfo;", "getBatteryInfo", "()Lcom/xiaomi/fitness/device/manager/bean/BatteryInfo;", "setBatteryInfo", "(Lcom/xiaomi/fitness/device/manager/bean/BatteryInfo;)V", "oob", "getOob", "setOob", "bindServer", "", "getBindServer", "()Z", "setBindServer", "(Z)V", "firmwareUpgradeTipTimestamp", "", "sn", "getSn", "randomMac", "getRandomMac", "level", "", Column.BATTERY, "getBattery", "()I", "setBattery", "(I)V", "mac", "getMac", "identifier", "getIdentifier", "did", "getDid", "model", "getModel", "name", "getName", "nodeID", "getNodeID", "huamiAuthKey", "getHuamiAuthKey", "productId", "getProductId", "privateUUID", "Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo$PrivateUUID;", "getPrivateUUID", "()Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo$PrivateUUID;", "setPrivateUUID", "(Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo$PrivateUUID;)V", "isHuaMi", "isBandType", "isLocalDevice", "isLibai", "isEcg", "isBloodSugar", "isWearOS", "isWatch", "isBle", "isDual", "isPhone", "readFromParcel", "", "updateFirmwareUpgradeTipTimestamp", "shouldAutoCheckUpgrade", "toString", "writeToParcel", "flags", "describeContents", "equals", "other", "", "hashCode", "CREATOR", "PrivateUUID", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class DeviceInfo<T extends Device> implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long FIRMWARE_UPGRADE_COOLDOWN = 3600000;
    public static final int PRODUCT_ID_REDMI_WATCH = 2723;

    @NotNull
    private BatteryInfo batteryInfo;
    private boolean bindServer;

    @Nullable
    private String bleName;

    @JvmField
    @Nullable
    public T device;
    private long firmwareUpgradeTipTimestamp;

    @Nullable
    private String firmwareVersion;

    @Nullable
    private String oob;

    @Nullable
    private PrivateUUID privateUUID;

    @Nullable
    private Product product;

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.bean.DeviceInfo$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J#\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo;", "Lcom/xiaomi/fitness/device/manager/bean/Device;", "<init>", "()V", "FIRMWARE_UPGRADE_COOLDOWN", "", "PRODUCT_ID_REDMI_WATCH", "", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "(I)[Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo;", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<DeviceInfo<Device>> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public DeviceInfo<Device> createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeviceInfo<>(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public DeviceInfo<Device>[] newArray(int size) {
            return new DeviceInfo[size];
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010(\u001a\u00020)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020)HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020)R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010¨\u00065"}, d2 = {"Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo$PrivateUUID;", "Landroid/os/Parcelable;", "service", "", "protoTX", "protoRX", "fitness", "voice", "mass", "otaTX", "otaRX", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getService", "()Ljava/lang/String;", "setService", "(Ljava/lang/String;)V", "getProtoTX", "setProtoTX", "getProtoRX", "setProtoRX", "getFitness", "setFitness", "getVoice", "setVoice", "getMass", "setMass", "getOtaTX", "setOtaTX", "getOtaRX", "setOtaRX", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PrivateUUID implements Parcelable {

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

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getService() {
            return this.service;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getProtoTX() {
            return this.protoTX;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getProtoRX() {
            return this.protoRX;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getFitness() {
            return this.fitness;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getVoice() {
            return this.voice;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getMass() {
            return this.mass;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getOtaTX() {
            return this.otaTX;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getOtaRX() {
            return this.otaRX;
        }

        @NotNull
        public final PrivateUUID copy(@Nullable String service, @Nullable String protoTX, @Nullable String protoRX, @Nullable String fitness, @Nullable String voice, @Nullable String mass, @Nullable String otaTX, @Nullable String otaRX) {
            return new PrivateUUID(service, protoTX, protoRX, fitness, voice, mass, otaTX, otaRX);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PrivateUUID)) {
                return false;
            }
            PrivateUUID privateUUID = (PrivateUUID) other;
            return Intrinsics.areEqual(this.service, privateUUID.service) && Intrinsics.areEqual(this.protoTX, privateUUID.protoTX) && Intrinsics.areEqual(this.protoRX, privateUUID.protoRX) && Intrinsics.areEqual(this.fitness, privateUUID.fitness) && Intrinsics.areEqual(this.voice, privateUUID.voice) && Intrinsics.areEqual(this.mass, privateUUID.mass) && Intrinsics.areEqual(this.otaTX, privateUUID.otaTX) && Intrinsics.areEqual(this.otaRX, privateUUID.otaRX);
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

        public int hashCode() {
            String str = this.service;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.protoTX;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.protoRX;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.fitness;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.voice;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.mass;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.otaTX;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.otaRX;
            return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
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

        @NotNull
        public String toString() {
            return "PrivateUUID(service=" + this.service + ", protoTX=" + this.protoTX + ", protoRX=" + this.protoRX + ", fitness=" + this.fitness + ", voice=" + this.voice + ", mass=" + this.mass + ", otaTX=" + this.otaTX + ", otaRX=" + this.otaRX + ")";
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

    public DeviceInfo() {
        this.batteryInfo = new BatteryInfo();
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
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.xiaomi.fitness.device.manager.bean.DeviceInfo<*>");
        DeviceInfo deviceInfo = (DeviceInfo) other;
        return Intrinsics.areEqual(this.device, deviceInfo.device) && Intrinsics.areEqual(this.firmwareVersion, deviceInfo.firmwareVersion) && Intrinsics.areEqual(this.product, deviceInfo.product) && Intrinsics.areEqual(this.bleName, deviceInfo.bleName) && Intrinsics.areEqual(this.batteryInfo, deviceInfo.batteryInfo) && Intrinsics.areEqual(this.oob, deviceInfo.oob) && this.bindServer == deviceInfo.bindServer && this.firmwareUpgradeTipTimestamp == deviceInfo.firmwareUpgradeTipTimestamp && Intrinsics.areEqual(this.privateUUID, deviceInfo.privateUUID);
    }

    public final int getBattery() {
        return this.batteryInfo.getBattery();
    }

    @NotNull
    public final BatteryInfo getBatteryInfo() {
        return this.batteryInfo;
    }

    public final boolean getBindServer() {
        return this.bindServer;
    }

    @Nullable
    public final String getBleName() {
        return this.bleName;
    }

    @NotNull
    public final String getDid() {
        String did;
        T t = this.device;
        return (t == null || (did = t.getDid()) == null) ? "" : did;
    }

    @Nullable
    public final String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    @Nullable
    public final String getHuamiAuthKey() {
        Device.Detail detail;
        T t = this.device;
        if (t == null || (detail = t.getDetail()) == null) {
            return null;
        }
        return detail.getAuthKey();
    }

    @Nullable
    public final String getIdentifier() {
        T t = this.device;
        if (t != null) {
            return t.getIdentifier();
        }
        return null;
    }

    @Nullable
    public final String getMac() {
        T t = this.device;
        if (t != null) {
            return t.getMac();
        }
        return null;
    }

    @NotNull
    public final String getModel() {
        String model;
        T t = this.device;
        return (t == null || (model = t.getModel()) == null) ? "" : model;
    }

    @NotNull
    public final String getName() {
        String name;
        T t = this.device;
        return (t == null || (name = t.getName()) == null) ? "" : name;
    }

    @Nullable
    public final String getNodeID() {
        T t = this.device;
        if (t != null) {
            return t.getNodeId();
        }
        return null;
    }

    @Nullable
    public final String getOob() {
        return this.oob;
    }

    @Nullable
    public final PrivateUUID getPrivateUUID() {
        return this.privateUUID;
    }

    @Nullable
    public final Product getProduct() {
        return this.product;
    }

    public final int getProductId() {
        T t = this.device;
        if (t != null) {
            return t.getProductId();
        }
        return -1;
    }

    @Nullable
    public final String getRandomMac() {
        Device.Detail detail;
        T t = this.device;
        if (t == null || (detail = t.getDetail()) == null) {
            return null;
        }
        return detail.getRandomMac();
    }

    @Nullable
    public final String getSn() {
        Device.Detail detail;
        T t = this.device;
        if (t == null || (detail = t.getDetail()) == null) {
            return null;
        }
        return detail.getSn();
    }

    public int hashCode() {
        T t = this.device;
        int iHashCode = (t != null ? t.hashCode() : 0) * 31;
        String str = this.firmwareVersion;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        Product product = this.product;
        int iHashCode3 = (iHashCode2 + (product != null ? product.hashCode() : 0)) * 31;
        String str2 = this.bleName;
        int iHashCode4 = (((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.batteryInfo.hashCode()) * 31;
        String str3 = this.oob;
        int iHashCode5 = (((((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.bindServer)) * 31) + Long.hashCode(this.firmwareUpgradeTipTimestamp)) * 31;
        PrivateUUID privateUUID = this.privateUUID;
        return iHashCode5 + (privateUUID != null ? privateUUID.hashCode() : 0);
    }

    public final boolean isBandType() {
        Product product;
        Product product2 = this.product;
        return (product2 != null && product2.getType() == 3) || isHuaMi() || ((product = this.product) != null && product.getType() == 7);
    }

    public final boolean isBle() {
        Product product;
        Product product2 = this.product;
        return (product2 != null && product2.getType() == 2) || ((product = this.product) != null && product.getType() == 3);
    }

    public final boolean isBloodSugar() {
        Product product = this.product;
        return product != null && product.getType() == 12;
    }

    public final boolean isDual() {
        Product product;
        Product product2 = this.product;
        return (product2 != null && product2.getType() == 7) || ((product = this.product) != null && product.getType() == 6);
    }

    public final boolean isEcg() {
        Product product = this.product;
        return product != null && product.getType() == 4;
    }

    public final boolean isHuaMi() {
        Product product = this.product;
        return product != null && product.getType() == 5;
    }

    public final boolean isLibai() {
        Product product = this.product;
        return product != null && DeviceModelExtKt.isLibai(product);
    }

    public final boolean isLocalDevice() {
        Product product = this.product;
        return product != null && product.getAccessType() == 1;
    }

    public final boolean isPhone() {
        return StringsKt__StringsJVMKt.equals(Product.PHONE_MODEL, getModel(), true);
    }

    public final boolean isWatch() {
        Product product;
        Product product2;
        return isWearOS() || ((product = this.product) != null && product.getType() == 2) || ((product2 = this.product) != null && product2.getType() == 6);
    }

    public final boolean isWearOS() {
        Product product = this.product;
        return product != null && product.getType() == 1;
    }

    public final void readFromParcel(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        Class cls = Device.class;
        if (string == null) {
            string = cls.getName();
        }
        try {
            cls = Class.forName(string);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        this.device = (T) parcel.readParcelable(cls.getClassLoader());
        this.firmwareVersion = parcel.readString();
        String string2 = parcel.readString();
        Class cls2 = Product.class;
        if (string2 == null) {
            string2 = cls2.getName();
        }
        try {
            cls2 = Class.forName(string2);
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
        }
        this.product = (Product) parcel.readParcelable(cls2.getClassLoader());
        this.bleName = parcel.readString();
        this.firmwareUpgradeTipTimestamp = parcel.readLong();
        this.privateUUID = (PrivateUUID) parcel.readParcelable(PrivateUUID.class.getClassLoader());
        BatteryInfo batteryInfo = (BatteryInfo) parcel.readParcelable(BatteryInfo.class.getClassLoader());
        if (batteryInfo == null) {
            batteryInfo = new BatteryInfo();
        }
        this.batteryInfo = batteryInfo;
    }

    public final void setBattery(int i) {
        this.batteryInfo.setBattery(i);
    }

    public final void setBatteryInfo(@NotNull BatteryInfo batteryInfo) {
        Intrinsics.checkNotNullParameter(batteryInfo, "<set-?>");
        this.batteryInfo = batteryInfo;
    }

    public final void setBindServer(boolean z) {
        this.bindServer = z;
    }

    public final void setBleName(@Nullable String str) {
        this.bleName = str;
    }

    public final void setFirmwareVersion(@Nullable String str) {
        this.firmwareVersion = str;
    }

    public final void setOob(@Nullable String str) {
        this.oob = str;
    }

    public final void setPrivateUUID(@Nullable PrivateUUID privateUUID) {
        this.privateUUID = privateUUID;
    }

    public final void setProduct(@Nullable Product product) {
        this.product = product;
    }

    public final boolean shouldAutoCheckUpgrade() {
        return this.firmwareUpgradeTipTimestamp == 0 || SystemClock.elapsedRealtime() - this.firmwareUpgradeTipTimestamp >= 3600000;
    }

    @NotNull
    public String toString() {
        return "DeviceInfo(device=" + this.device + ", firmwareVersion=" + this.firmwareVersion + ", product=" + this.product + ", bleName=" + this.bleName + ", batteryInfo=" + this.batteryInfo + ", firmwareUpgradeTipTimestamp=" + this.firmwareUpgradeTipTimestamp + ", sn=" + getSn() + ", battery=" + getBattery() + ", mac=" + getMac() + ", did='" + getDid() + "', model='" + getModel() + "', name='" + getName() + "', nodeID=" + getNodeID() + ", huamiAuthKey=" + getHuamiAuthKey() + ", productId=" + getProductId() + ", privateUUID=" + this.privateUUID + ")";
    }

    public final void updateFirmwareUpgradeTipTimestamp() {
        this.firmwareUpgradeTipTimestamp = SystemClock.elapsedRealtime();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        T t = this.device;
        parcel.writeString((t != null ? t.getClass() : Device.class).getName());
        parcel.writeParcelable(this.device, flags);
        String str = this.firmwareVersion;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        Product product = this.product;
        parcel.writeString((product != null ? product.getClass() : Product.class).getName());
        parcel.writeParcelable(this.product, flags);
        parcel.writeString(this.bleName);
        parcel.writeLong(this.firmwareUpgradeTipTimestamp);
        parcel.writeParcelable(this.privateUUID, flags);
        parcel.writeParcelable(this.batteryInfo, flags);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeviceInfo(@NotNull Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        readFromParcel(parcel);
    }
}
