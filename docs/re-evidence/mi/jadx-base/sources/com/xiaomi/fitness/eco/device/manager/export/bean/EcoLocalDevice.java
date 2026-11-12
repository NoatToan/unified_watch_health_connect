package com.xiaomi.fitness.eco.device.manager.export.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@TypeConverters({EcoDeviceConverter.class})
@Entity(tableName = "eco_local_device")
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 22\u00020\u0001:\u00012Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010B\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u000f\u0010\u0013J\u0018\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00122\u0006\u00101\u001a\u00020\tH\u0016R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001a\u0010\b\u001a\u00020\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\n\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0015\"\u0004\b'\u0010\u0017R\u001a\u0010\f\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoLocalDevice;", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDevice;", "appDeviceId", "", "appToken", "sn", "oob", "did", "productId", "", "model", "name", "alias", "detail", "Lcom/xiaomi/fitness/device/manager/bean/Device$Detail;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/xiaomi/fitness/device/manager/bean/Device$Detail;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getAppDeviceId", "()Ljava/lang/String;", "setAppDeviceId", "(Ljava/lang/String;)V", "getAppToken", "setAppToken", "getSn", "setSn", "getOob", "setOob", "getDid", "setDid", "getProductId", "()I", "setProductId", "(I)V", "getModel", "setModel", "getName", "setName", "getAlias", "setAlias", "getDetail", "()Lcom/xiaomi/fitness/device/manager/bean/Device$Detail;", "setDetail", "(Lcom/xiaomi/fitness/device/manager/bean/Device$Detail;)V", "writeToParcel", "", "dest", "flags", "CREATOR", "eco-device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcoLocalDevice extends EcoDevice {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private String alias;

    @PrimaryKey
    @ColumnInfo(name = "app_device_id")
    @NotNull
    private String appDeviceId;

    @ColumnInfo(name = "token")
    @Nullable
    private String appToken;

    @Nullable
    private Device.Detail detail;

    @NotNull
    private String did;

    @NotNull
    private String model;

    @NotNull
    private String name;

    @ColumnInfo(name = "oob")
    @Nullable
    private String oob;
    private int productId;

    @ColumnInfo(name = "sn")
    @Nullable
    private String sn;

    /* JADX INFO: renamed from: com.xiaomi.fitness.eco.device.manager.export.bean.EcoLocalDevice$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoLocalDevice$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoLocalDevice;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoLocalDevice;", "eco-device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<EcoLocalDevice> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public EcoLocalDevice createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EcoLocalDevice(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public EcoLocalDevice[] newArray(int size) {
            return new EcoLocalDevice[size];
        }
    }

    public /* synthetic */ EcoLocalDevice(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, Device.Detail detail, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? "" : str7, (i2 & 256) == 0 ? str8 : "", (i2 & 512) == 0 ? detail : null);
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice, com.xiaomi.fitness.device.manager.bean.Device
    @NotNull
    public String getAlias() {
        return this.alias;
    }

    @NotNull
    public final String getAppDeviceId() {
        return this.appDeviceId;
    }

    @Nullable
    public final String getAppToken() {
        return this.appToken;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice, com.xiaomi.fitness.device.manager.bean.Device
    @Nullable
    public Device.Detail getDetail() {
        return this.detail;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice, com.xiaomi.fitness.device.manager.bean.Device
    @NotNull
    public String getDid() {
        return this.did;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice, com.xiaomi.fitness.device.manager.bean.Device
    @NotNull
    public String getModel() {
        return this.model;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice, com.xiaomi.fitness.device.manager.bean.Device
    @NotNull
    public String getName() {
        return this.name;
    }

    @Nullable
    public final String getOob() {
        return this.oob;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice, com.xiaomi.fitness.device.manager.bean.Device
    public int getProductId() {
        return this.productId;
    }

    @Nullable
    public final String getSn() {
        return this.sn;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice, com.xiaomi.fitness.device.manager.bean.Device
    public void setAlias(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.alias = str;
    }

    public final void setAppDeviceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appDeviceId = str;
    }

    public final void setAppToken(@Nullable String str) {
        this.appToken = str;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice, com.xiaomi.fitness.device.manager.bean.Device
    public void setDetail(@Nullable Device.Detail detail) {
        this.detail = detail;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice, com.xiaomi.fitness.device.manager.bean.Device
    public void setDid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.did = str;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice, com.xiaomi.fitness.device.manager.bean.Device
    public void setModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.model = str;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice, com.xiaomi.fitness.device.manager.bean.Device
    public void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setOob(@Nullable String str) {
        this.oob = str;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice, com.xiaomi.fitness.device.manager.bean.Device
    public void setProductId(int i) {
        this.productId = i;
    }

    public final void setSn(@Nullable String str) {
        this.sn = str;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice, com.xiaomi.fitness.device.manager.bean.Device, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.appDeviceId);
        dest.writeString(this.appToken);
        dest.writeString(this.sn);
        dest.writeString(this.oob);
        super.writeToParcel(dest, flags);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcoLocalDevice(@NotNull String appDeviceId, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String did, int i, @NotNull String model, @NotNull String name, @NotNull String alias, @Nullable Device.Detail detail) {
        super(null, 0, null, null, null, null, null, 0, null, 0, false, null, null, null, 16383, null);
        Intrinsics.checkNotNullParameter(appDeviceId, "appDeviceId");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.appDeviceId = appDeviceId;
        this.appToken = str;
        this.sn = str2;
        this.oob = str3;
        this.did = did;
        this.productId = i;
        this.model = model;
        this.name = name;
        this.alias = alias;
        this.detail = detail;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EcoLocalDevice(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        this(string == null ? "" : string, null, null, null, null, 0, null, null, null, null, 1022, null);
        this.appToken = parcel.readString();
        this.sn = parcel.readString();
        this.oob = parcel.readString();
        readFromParcel(parcel);
    }
}
