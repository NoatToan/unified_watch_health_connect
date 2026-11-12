package com.xiaomi.fitness.device.manager.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@TypeConverters({DeviceConverter.class})
@Entity(tableName = "device")
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0017\u0018\u0000 D2\u00020\u0001:\u0002CDB{\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0010\u0010\u0014J\u0010\u00101\u001a\u0002022\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\u0018\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u00132\u0006\u00105\u001a\u00020\u0005H\u0016J\u000e\u00106\u001a\u0002022\u0006\u00107\u001a\u00020\u0003J\u0006\u00108\u001a\u00020\u0003J\u000e\u00109\u001a\u0002022\u0006\u0010:\u001a\u00020\u0003J\u0006\u0010;\u001a\u00020\u0003J\b\u0010<\u001a\u00020\u0003H\u0016J\b\u0010=\u001a\u00020\u0005H\u0016J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010AH\u0096\u0002J\b\u0010B\u001a\u00020\u0005H\u0016R\u001e\u0010\u0002\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R,\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t8\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\n\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018R\u001a\u0010\f\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010\u000f\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u0010\u001c¨\u0006E"}, d2 = {"Lcom/xiaomi/fitness/device/manager/bean/Device;", "Landroid/os/Parcelable;", "did", "", "productId", "", "model", "name", "extraValues", "", "identifier", "alias", "status", "detail", "Lcom/xiaomi/fitness/device/manager/bean/Device$Detail;", "uploaded", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILcom/xiaomi/fitness/device/manager/bean/Device$Detail;I)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getDid", "()Ljava/lang/String;", "setDid", "(Ljava/lang/String;)V", "getProductId", "()I", "setProductId", "(I)V", "getModel", "setModel", "getName", "setName", "getExtraValues", "()Ljava/util/Map;", "setExtraValues", "(Ljava/util/Map;)V", "getIdentifier", "setIdentifier", "getAlias", "setAlias", "getStatus", "setStatus", "getDetail", "()Lcom/xiaomi/fitness/device/manager/bean/Device$Detail;", "setDetail", "(Lcom/xiaomi/fitness/device/manager/bean/Device$Detail;)V", "getUploaded", "setUploaded", "readFromParcel", "", "writeToParcel", "dest", "flags", "setMac", "mac", "getMac", "setNodeId", "nodeId", "getNodeId", "toString", "describeContents", "equals", "", "other", "", "hashCode", "Detail", "CREATOR", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class Device implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private String alias;

    @Nullable
    private Detail detail;

    @SerializedName("sid")
    @PrimaryKey
    @NotNull
    private String did;

    @SerializedName("extra_values")
    @Nullable
    private Map<String, String> extraValues;

    @NotNull
    private String identifier;

    @NotNull
    private String model;

    @NotNull
    private String name;

    @SerializedName("pd_id")
    private int productId;
    private int status;
    private int uploaded;

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.manager.bean.Device$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/device/manager/bean/Device$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/device/manager/bean/Device;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fitness/device/manager/bean/Device;", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<Device> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public Device createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Device(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public Device[] newArray(int size) {
            return new Device[size];
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0096\u0002J\b\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u00020\u0003H\u0016J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J±\u0001\u0010F\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010G\u001a\u000206J\u0016\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u000206R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0014\"\u0004\b(\u0010\u0016R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010\u0016R \u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010\u0016R \u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010\u0016R \u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0014\"\u0004\b0\u0010\u0016¨\u0006M"}, d2 = {"Lcom/xiaomi/fitness/device/manager/bean/Device$Detail;", "Landroid/os/Parcelable;", "mac", "", "sn", "token", "encryptKey", "irqKey", "beaconKey", "thirdNodeId", "peripheralId", "authKey", "macAddress", "deviceId", "phoneId", "randomMac", "nodeId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMac", "()Ljava/lang/String;", "setMac", "(Ljava/lang/String;)V", "getSn", "setSn", "getToken", "setToken", "getEncryptKey", "setEncryptKey", "getIrqKey", "setIrqKey", "getBeaconKey", "setBeaconKey", "getThirdNodeId", "setThirdNodeId", "getPeripheralId", "setPeripheralId", "getAuthKey", "setAuthKey", "getMacAddress", "setMacAddress", "getDeviceId", "setDeviceId", "getPhoneId", "setPhoneId", "getRandomMac", "setRandomMac", "getNodeId", "setNodeId", "equals", "", "other", "", "hashCode", "", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Entity
    public static final /* data */ class Detail implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Detail> CREATOR = new Creator();

        @SerializedName("auth_key")
        @Nullable
        private String authKey;

        @SerializedName("beaconkey")
        @Nullable
        private String beaconKey;

        @SerializedName("device_id")
        @Nullable
        private String deviceId;

        @SerializedName("encrypt_key")
        @Nullable
        private String encryptKey;

        @SerializedName("irq_key")
        @Nullable
        private String irqKey;

        @Nullable
        private String mac;

        @SerializedName("mac_address")
        @Nullable
        private String macAddress;

        @SerializedName("node_id")
        @Nullable
        private String nodeId;

        @SerializedName("peripheral_id")
        @Nullable
        private String peripheralId;

        @SerializedName("phone_id")
        @Nullable
        private String phoneId;

        @SerializedName("random_mac")
        @Nullable
        private String randomMac;

        @Nullable
        private String sn;

        @SerializedName("third_node_id")
        @Nullable
        private String thirdNodeId;

        @Nullable
        private String token;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Detail> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Detail createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Detail(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Detail[] newArray(int i) {
                return new Detail[i];
            }
        }

        public Detail() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMac() {
            return this.mac;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getMacAddress() {
            return this.macAddress;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getDeviceId() {
            return this.deviceId;
        }

        @Nullable
        /* JADX INFO: renamed from: component12, reason: from getter */
        public final String getPhoneId() {
            return this.phoneId;
        }

        @Nullable
        /* JADX INFO: renamed from: component13, reason: from getter */
        public final String getRandomMac() {
            return this.randomMac;
        }

        @Nullable
        /* JADX INFO: renamed from: component14, reason: from getter */
        public final String getNodeId() {
            return this.nodeId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSn() {
            return this.sn;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getEncryptKey() {
            return this.encryptKey;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getIrqKey() {
            return this.irqKey;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getBeaconKey() {
            return this.beaconKey;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getThirdNodeId() {
            return this.thirdNodeId;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getPeripheralId() {
            return this.peripheralId;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getAuthKey() {
            return this.authKey;
        }

        @NotNull
        public final Detail copy(@Nullable String mac, @Nullable String sn, @Nullable String token, @Nullable String encryptKey, @Nullable String irqKey, @Nullable String beaconKey, @Nullable String thirdNodeId, @Nullable String peripheralId, @Nullable String authKey, @Nullable String macAddress, @Nullable String deviceId, @Nullable String phoneId, @Nullable String randomMac, @Nullable String nodeId) {
            return new Detail(mac, sn, token, encryptKey, irqKey, beaconKey, thirdNodeId, peripheralId, authKey, macAddress, deviceId, phoneId, randomMac, nodeId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.areEqual(Detail.class, other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.xiaomi.fitness.device.manager.bean.Device.Detail");
            Detail detail = (Detail) other;
            return Intrinsics.areEqual(this.mac, detail.mac) && Intrinsics.areEqual(this.sn, detail.sn) && Intrinsics.areEqual(this.token, detail.token) && Intrinsics.areEqual(this.encryptKey, detail.encryptKey) && Intrinsics.areEqual(this.irqKey, detail.irqKey) && Intrinsics.areEqual(this.beaconKey, detail.beaconKey) && Intrinsics.areEqual(this.thirdNodeId, detail.thirdNodeId) && Intrinsics.areEqual(this.authKey, detail.authKey) && Intrinsics.areEqual(this.macAddress, detail.macAddress) && Intrinsics.areEqual(this.deviceId, detail.deviceId) && Intrinsics.areEqual(this.phoneId, detail.phoneId) && Intrinsics.areEqual(this.randomMac, detail.randomMac) && Intrinsics.areEqual(this.nodeId, detail.nodeId);
        }

        @Nullable
        public final String getAuthKey() {
            return this.authKey;
        }

        @Nullable
        public final String getBeaconKey() {
            return this.beaconKey;
        }

        @Nullable
        public final String getDeviceId() {
            return this.deviceId;
        }

        @Nullable
        public final String getEncryptKey() {
            return this.encryptKey;
        }

        @Nullable
        public final String getIrqKey() {
            return this.irqKey;
        }

        @Nullable
        public final String getMac() {
            return this.mac;
        }

        @Nullable
        public final String getMacAddress() {
            return this.macAddress;
        }

        @Nullable
        public final String getNodeId() {
            return this.nodeId;
        }

        @Nullable
        public final String getPeripheralId() {
            return this.peripheralId;
        }

        @Nullable
        public final String getPhoneId() {
            return this.phoneId;
        }

        @Nullable
        public final String getRandomMac() {
            return this.randomMac;
        }

        @Nullable
        public final String getSn() {
            return this.sn;
        }

        @Nullable
        public final String getThirdNodeId() {
            return this.thirdNodeId;
        }

        @Nullable
        public final String getToken() {
            return this.token;
        }

        public int hashCode() {
            String str = this.mac;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.sn;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.token;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.encryptKey;
            int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.irqKey;
            int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.beaconKey;
            int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
            String str7 = this.thirdNodeId;
            int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
            String str8 = this.authKey;
            int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
            String str9 = this.macAddress;
            int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
            String str10 = this.deviceId;
            int iHashCode10 = (iHashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
            String str11 = this.phoneId;
            int iHashCode11 = (iHashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31;
            String str12 = this.randomMac;
            int iHashCode12 = (iHashCode11 + (str12 != null ? str12.hashCode() : 0)) * 31;
            String str13 = this.nodeId;
            return iHashCode12 + (str13 != null ? str13.hashCode() : 0);
        }

        public final void setAuthKey(@Nullable String str) {
            this.authKey = str;
        }

        public final void setBeaconKey(@Nullable String str) {
            this.beaconKey = str;
        }

        public final void setDeviceId(@Nullable String str) {
            this.deviceId = str;
        }

        public final void setEncryptKey(@Nullable String str) {
            this.encryptKey = str;
        }

        public final void setIrqKey(@Nullable String str) {
            this.irqKey = str;
        }

        public final void setMac(@Nullable String str) {
            this.mac = str;
        }

        public final void setMacAddress(@Nullable String str) {
            this.macAddress = str;
        }

        public final void setNodeId(@Nullable String str) {
            this.nodeId = str;
        }

        public final void setPeripheralId(@Nullable String str) {
            this.peripheralId = str;
        }

        public final void setPhoneId(@Nullable String str) {
            this.phoneId = str;
        }

        public final void setRandomMac(@Nullable String str) {
            this.randomMac = str;
        }

        public final void setSn(@Nullable String str) {
            this.sn = str;
        }

        public final void setThirdNodeId(@Nullable String str) {
            this.thirdNodeId = str;
        }

        public final void setToken(@Nullable String str) {
            this.token = str;
        }

        @NotNull
        public String toString() {
            return "Detail(mac=" + this.mac + ", sn=" + this.sn + ", thirdNodeId=" + this.thirdNodeId + ", peripheralId=" + this.peripheralId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.mac);
            dest.writeString(this.sn);
            dest.writeString(this.token);
            dest.writeString(this.encryptKey);
            dest.writeString(this.irqKey);
            dest.writeString(this.beaconKey);
            dest.writeString(this.thirdNodeId);
            dest.writeString(this.peripheralId);
            dest.writeString(this.authKey);
            dest.writeString(this.macAddress);
            dest.writeString(this.deviceId);
            dest.writeString(this.phoneId);
            dest.writeString(this.randomMac);
            dest.writeString(this.nodeId);
        }

        public Detail(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14) {
            this.mac = str;
            this.sn = str2;
            this.token = str3;
            this.encryptKey = str4;
            this.irqKey = str5;
            this.beaconKey = str6;
            this.thirdNodeId = str7;
            this.peripheralId = str8;
            this.authKey = str9;
            this.macAddress = str10;
            this.deviceId = str11;
            this.phoneId = str12;
            this.randomMac = str13;
            this.nodeId = str14;
        }

        public /* synthetic */ Detail(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) == 0 ? str14 : null);
        }
    }

    public Device() {
        this(null, 0, null, null, null, null, null, 0, null, 0, 1023, null);
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
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.xiaomi.fitness.device.manager.bean.Device");
        Device device = (Device) other;
        return Intrinsics.areEqual(getDid(), device.getDid()) && getProductId() == device.getProductId() && Intrinsics.areEqual(getModel(), device.getModel()) && Intrinsics.areEqual(getDetail(), device.getDetail());
    }

    @NotNull
    public String getAlias() {
        return this.alias;
    }

    @Nullable
    public Detail getDetail() {
        return this.detail;
    }

    @NotNull
    public String getDid() {
        return this.did;
    }

    @Nullable
    public Map<String, String> getExtraValues() {
        return this.extraValues;
    }

    @NotNull
    public String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    public final String getMac() {
        String mac;
        String randomMac;
        Detail detail = getDetail();
        if (detail != null && (randomMac = detail.getRandomMac()) != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String upperCase = randomMac.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (upperCase != null) {
                return upperCase;
            }
        }
        Detail detail2 = getDetail();
        if (detail2 == null || (mac = detail2.getMac()) == null) {
            return "";
        }
        Locale locale2 = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
        String upperCase2 = mac.toUpperCase(locale2);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
        return upperCase2;
    }

    @NotNull
    public String getModel() {
        return this.model;
    }

    @NotNull
    public String getName() {
        return this.name;
    }

    @NotNull
    public final String getNodeId() {
        String nodeId;
        Detail detail = getDetail();
        if (detail != null && (nodeId = detail.getNodeId()) != null) {
            return nodeId;
        }
        Detail detail2 = getDetail();
        String thirdNodeId = detail2 != null ? detail2.getThirdNodeId() : null;
        return thirdNodeId == null ? "" : thirdNodeId;
    }

    public int getProductId() {
        return this.productId;
    }

    public int getStatus() {
        return this.status;
    }

    public int getUploaded() {
        return this.uploaded;
    }

    public int hashCode() {
        int iHashCode = ((((getDid().hashCode() * 31) + getProductId()) * 31) + getModel().hashCode()) * 31;
        Detail detail = getDetail();
        return iHashCode + (detail != null ? detail.hashCode() : 0);
    }

    public void readFromParcel(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        if (string == null) {
            string = "";
        }
        setDid(string);
        setProductId(parcel.readInt());
        String string2 = parcel.readString();
        if (string2 == null) {
            string2 = "";
        }
        setModel(string2);
        String string3 = parcel.readString();
        if (string3 == null) {
            string3 = "";
        }
        setName(string3);
        setExtraValues(new LinkedHashMap());
        Map<String, String> extraValues = getExtraValues();
        Intrinsics.checkNotNull(extraValues);
        parcel.readMap(extraValues, getClass().getClassLoader());
        String string4 = parcel.readString();
        if (string4 == null) {
            string4 = "";
        }
        setIdentifier(string4);
        String string5 = parcel.readString();
        setAlias(string5 != null ? string5 : "");
        setStatus(parcel.readInt());
        setDetail((Detail) parcel.readParcelable(Detail.class.getClassLoader()));
        setUploaded(parcel.readInt());
    }

    public void setAlias(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.alias = str;
    }

    public void setDetail(@Nullable Detail detail) {
        this.detail = detail;
    }

    public void setDid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.did = str;
    }

    public void setExtraValues(@Nullable Map<String, String> map) {
        this.extraValues = map;
    }

    public void setIdentifier(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.identifier = str;
    }

    public final void setMac(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        if (getDetail() == null) {
            setDetail(new Detail(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null));
        }
        Detail detail = getDetail();
        Intrinsics.checkNotNull(detail);
        detail.setMac(mac);
    }

    public void setModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.model = str;
    }

    public void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setNodeId(@NotNull String nodeId) {
        Intrinsics.checkNotNullParameter(nodeId, "nodeId");
        if (getDetail() == null) {
            setDetail(new Detail(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null));
        }
        Detail detail = getDetail();
        Intrinsics.checkNotNull(detail);
        detail.setNodeId(nodeId);
    }

    public void setProductId(int i) {
        this.productId = i;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setUploaded(int i) {
        this.uploaded = i;
    }

    @NotNull
    public String toString() {
        return "Device(did='" + getDid() + "', productId=" + getProductId() + ", model='" + getModel() + "', name='" + getName() + "', extraValues=" + getExtraValues() + ", identifier='" + getIdentifier() + "', alias='" + getAlias() + "', status=" + getStatus() + ", detail=" + getDetail() + ", uploaded=" + getUploaded() + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(getDid());
        dest.writeInt(getProductId());
        dest.writeString(getModel());
        dest.writeString(getName());
        dest.writeMap(getExtraValues());
        dest.writeString(getIdentifier());
        dest.writeString(getAlias());
        dest.writeInt(getStatus());
        dest.writeParcelable(getDetail(), flags);
        dest.writeInt(getUploaded());
    }

    public Device(@NotNull String did, int i, @NotNull String model, @NotNull String name, @Nullable Map<String, String> map, @NotNull String identifier, @NotNull String alias, int i2, @Nullable Detail detail, int i3) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.did = did;
        this.productId = i;
        this.model = model;
        this.name = name;
        this.extraValues = map;
        this.identifier = identifier;
        this.alias = alias;
        this.status = i2;
        this.detail = detail;
        this.uploaded = i3;
    }

    public /* synthetic */ Device(String str, int i, String str2, String str3, Map map, String str4, String str5, int i2, Detail detail, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? "" : str3, (i4 & 16) != 0 ? null : map, (i4 & 32) != 0 ? "" : str4, (i4 & 64) == 0 ? str5 : "", (i4 & 128) != 0 ? -1 : i2, (i4 & 256) == 0 ? detail : null, (i4 & 512) != 0 ? 1 : i3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Device(@NotNull Parcel parcel) {
        this(null, 0, null, null, null, null, null, 0, null, 0, 1023, null);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        readFromParcel(parcel);
    }
}
