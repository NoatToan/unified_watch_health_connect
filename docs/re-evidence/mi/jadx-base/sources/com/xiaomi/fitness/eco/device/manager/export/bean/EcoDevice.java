package com.xiaomi.fitness.eco.device.manager.export.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@TypeConverters({EcoDeviceConverter.class})
@Entity(tableName = "eco_device")
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0001IB©\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u0016\u0010\u001aJ\u0010\u0010C\u001a\u00020D2\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J\u0018\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020\u00192\u0006\u0010G\u001a\u00020\u0006H\u0016J\b\u0010H\u001a\u00020\u0004H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0007\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\u001a\u0010\b\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\u000b\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001c\"\u0004\b,\u0010\u001eR\u001a\u0010\f\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010\u001eR\u001a\u0010\r\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010 \"\u0004\b0\u0010\"R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u0010\u0010\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010 \"\u0004\b6\u0010\"R\u001a\u0010\u0011\u001a\u00020\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u00107\"\u0004\b8\u00109R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001c\"\u0004\b;\u0010\u001eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u001c\"\u0004\b=\u0010\u001eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001c\"\u0004\b?\u0010\u001eR\u001e\u0010@\u001a\u00020\u00068\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010 \"\u0004\bB\u0010\"¨\u0006J"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDevice;", "Lcom/xiaomi/fitness/device/manager/bean/Device;", "Landroid/os/Parcelable;", "did", "", "productId", "", "model", "name", "extraValues", "", "identifier", "alias", "status", "detail", "Lcom/xiaomi/fitness/device/manager/bean/Device$Detail;", "deviceType", "isOwner", "", "userId", "shareUserId", "shareId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILcom/xiaomi/fitness/device/manager/bean/Device$Detail;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getDid", "()Ljava/lang/String;", "setDid", "(Ljava/lang/String;)V", "getProductId", "()I", "setProductId", "(I)V", "getModel", "setModel", "getName", "setName", "getExtraValues", "()Ljava/util/Map;", "setExtraValues", "(Ljava/util/Map;)V", "getIdentifier", "setIdentifier", "getAlias", "setAlias", "getStatus", "setStatus", "getDetail", "()Lcom/xiaomi/fitness/device/manager/bean/Device$Detail;", "setDetail", "(Lcom/xiaomi/fitness/device/manager/bean/Device$Detail;)V", "getDeviceType", "setDeviceType", "()Z", "setOwner", "(Z)V", "getUserId", "setUserId", "getShareUserId", "setShareUserId", "getShareId", "setShareId", "uploaded", "getUploaded", "setUploaded", "readFromParcel", "", "writeToParcel", "dest", "flags", "toString", "CREATOR", "eco-device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class EcoDevice extends Device implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private String alias;

    @Nullable
    private Device.Detail detail;
    private int deviceType;

    @PrimaryKey
    @NotNull
    private String did;

    @Nullable
    private Map<String, String> extraValues;

    @NotNull
    private String identifier;
    private boolean isOwner;

    @NotNull
    private String model;

    @NotNull
    private String name;
    private int productId;

    @Nullable
    private String shareId;

    @Nullable
    private String shareUserId;
    private int status;
    private int uploaded;

    @Nullable
    private String userId;

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDevice$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDevice;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDevice;", "eco-device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<EcoDevice> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public EcoDevice createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EcoDevice(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public EcoDevice[] newArray(int size) {
            return new EcoDevice[size];
        }
    }

    public EcoDevice() {
        this(null, 0, null, null, null, null, null, 0, null, 0, false, null, null, null, 16383, null);
    }

    @Override // com.xiaomi.fitness.device.manager.bean.Device
    @NotNull
    public String getAlias() {
        return this.alias;
    }

    @Override // com.xiaomi.fitness.device.manager.bean.Device
    @Nullable
    public Device.Detail getDetail() {
        return this.detail;
    }

    public int getDeviceType() {
        return this.deviceType;
    }

    @Override // com.xiaomi.fitness.device.manager.bean.Device
    @NotNull
    public String getDid() {
        return this.did;
    }

    @Override // com.xiaomi.fitness.device.manager.bean.Device
    @Nullable
    public Map<String, String> getExtraValues() {
        return this.extraValues;
    }

    @Override // com.xiaomi.fitness.device.manager.bean.Device
    @NotNull
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // com.xiaomi.fitness.device.manager.bean.Device
    @NotNull
    public String getModel() {
        return this.model;
    }

    @Override // com.xiaomi.fitness.device.manager.bean.Device
    @NotNull
    public String getName() {
        return this.name;
    }

    @Override // com.xiaomi.fitness.device.manager.bean.Device
    public int getProductId() {
        return this.productId;
    }

    @Nullable
    public String getShareId() {
        return this.shareId;
    }

    @Nullable
    public String getShareUserId() {
        return this.shareUserId;
    }

    @Override // com.xiaomi.fitness.device.manager.bean.Device
    public int getStatus() {
        return this.status;
    }

    @Override // com.xiaomi.fitness.device.manager.bean.Device
    public int getUploaded() {
        return this.uploaded;
    }

    @Nullable
    public String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: isOwner, reason: from getter */
    public boolean getIsOwner() {
        return this.isOwner;
    }

    @Override // com.xiaomi.fitness.device.manager.bean.Device
    public void readFromParcel(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        super.readFromParcel(parcel);
        setDeviceType(parcel.readInt());
        setOwner(parcel.readInt() == 1);
        setUserId(parcel.readString());
        setShareUserId(parcel.readString());
        setShareId(parcel.readString());
    }

    @Override // com.xiaomi.fitness.device.manager.bean.Device
    public void setAlias(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.alias = str;
    }

    @Override // com.xiaomi.fitness.device.manager.bean.Device
    public void setDetail(@Nullable Device.Detail detail) {
        this.detail = detail;
    }

    public void setDeviceType(int i) {
        this.deviceType = i;
    }

    @Override // com.xiaomi.fitness.device.manager.bean.Device
    public void setDid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.did = str;
    }

    @Override // com.xiaomi.fitness.device.manager.bean.Device
    public void setExtraValues(@Nullable Map<String, String> map) {
        this.extraValues = map;
    }

    @Override // com.xiaomi.fitness.device.manager.bean.Device
    public void setIdentifier(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.identifier = str;
    }

    @Override // com.xiaomi.fitness.device.manager.bean.Device
    public void setModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.model = str;
    }

    @Override // com.xiaomi.fitness.device.manager.bean.Device
    public void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public void setOwner(boolean z) {
        this.isOwner = z;
    }

    @Override // com.xiaomi.fitness.device.manager.bean.Device
    public void setProductId(int i) {
        this.productId = i;
    }

    public void setShareId(@Nullable String str) {
        this.shareId = str;
    }

    public void setShareUserId(@Nullable String str) {
        this.shareUserId = str;
    }

    @Override // com.xiaomi.fitness.device.manager.bean.Device
    public void setStatus(int i) {
        this.status = i;
    }

    @Override // com.xiaomi.fitness.device.manager.bean.Device
    public void setUploaded(int i) {
        this.uploaded = i;
    }

    public void setUserId(@Nullable String str) {
        this.userId = str;
    }

    @Override // com.xiaomi.fitness.device.manager.bean.Device
    @NotNull
    public String toString() {
        return "EcoDevice(did='" + getDid() + "', productId=" + getProductId() + ", model='" + getModel() + "', name='" + getName() + "', extraValues=" + getExtraValues() + ", identifier='" + getIdentifier() + "', alias='" + getAlias() + "', status=" + getStatus() + ", detail=" + getDetail() + ", isOwner=" + getIsOwner() + ")";
    }

    @Override // com.xiaomi.fitness.device.manager.bean.Device, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, flags);
        dest.writeInt(getDeviceType());
        dest.writeInt(getIsOwner() ? 1 : 0);
        dest.writeString(getUserId());
        dest.writeString(getShareUserId());
        dest.writeString(getShareId());
    }

    public /* synthetic */ EcoDevice(String str, int i, String str2, String str3, Map map, String str4, String str5, int i2, Device.Detail detail, int i3, boolean z, String str6, String str7, String str8, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? "" : str3, (i4 & 16) != 0 ? null : map, (i4 & 32) != 0 ? "" : str4, (i4 & 64) != 0 ? "" : str5, (i4 & 128) != 0 ? -1 : i2, (i4 & 256) == 0 ? detail : null, (i4 & 512) != 0 ? 1 : i3, (i4 & 1024) == 0 ? z : true, (i4 & 2048) != 0 ? "" : str6, (i4 & 4096) != 0 ? "" : str7, (i4 & 8192) == 0 ? str8 : "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcoDevice(@NotNull String did, int i, @NotNull String model, @NotNull String name, @Nullable Map<String, String> map, @NotNull String identifier, @NotNull String alias, int i2, @Nullable Device.Detail detail, int i3, boolean z, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        super(null, 0, null, null, null, null, null, 0, null, 0, 1023, null);
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
        this.deviceType = i3;
        this.isOwner = z;
        this.userId = str;
        this.shareUserId = str2;
        this.shareId = str3;
        this.uploaded = 1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcoDevice(@NotNull Parcel parcel) {
        this(null, 0, null, null, null, null, null, 0, null, 0, false, null, null, null, 16383, null);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        readFromParcel(parcel);
    }
}
