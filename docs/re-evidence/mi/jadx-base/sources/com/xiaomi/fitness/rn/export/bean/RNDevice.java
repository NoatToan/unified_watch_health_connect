package com.xiaomi.fitness.rn.export.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.PrimaryKey;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 E2\u00020\u0001:\u0001EBg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u000e\u0010\u0012J\u0018\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u00112\u0006\u0010D\u001a\u00020\u0005H\u0016R\u001e\u0010\u0002\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\n\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010\u001aR\u001c\u00103\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0014\"\u0004\b5\u0010\u0016R\u001c\u00106\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0014\"\u0004\b8\u0010\u0016R\u001a\u00109\u001a\u00020,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010-\"\u0004\b:\u0010/R\u001c\u0010;\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0014\"\u0004\b=\u0010\u0016R\u001c\u0010>\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0014\"\u0004\b@\u0010\u0016¨\u0006F"}, d2 = {"Lcom/xiaomi/fitness/rn/export/bean/RNDevice;", "Lcom/xiaomi/fitness/device/manager/bean/Device;", "did", "", "productId", "", "model", "name", "extraValues", "", "alias", "status", "detail", "Lcom/xiaomi/fitness/device/manager/bean/Device$Detail;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILcom/xiaomi/fitness/device/manager/bean/Device$Detail;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getDid", "()Ljava/lang/String;", "setDid", "(Ljava/lang/String;)V", "getProductId", "()I", "setProductId", "(I)V", "getModel", "setModel", "getName", "setName", "getExtraValues", "()Ljava/util/Map;", "setExtraValues", "(Ljava/util/Map;)V", "getAlias", "setAlias", "getStatus", "setStatus", "getDetail", "()Lcom/xiaomi/fitness/device/manager/bean/Device$Detail;", "setDetail", "(Lcom/xiaomi/fitness/device/manager/bean/Device$Detail;)V", "isOwner", "", "()Z", "setOwner", "(Z)V", "permitLevel", "getPermitLevel", "setPermitLevel", "ownerId", "getOwnerId", "setOwnerId", "ownerName", "getOwnerName", "setOwnerName", "isOnline", "setOnline", "extraJson", "getExtraJson", "setExtraJson", "orderTimeJString", "getOrderTimeJString", "setOrderTimeJString", "writeToParcel", "", "dest", "flags", "CREATOR", "export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RNDevice extends Device {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private String alias;

    @Nullable
    private Device.Detail detail;

    @PrimaryKey
    @NotNull
    private String did;

    @Nullable
    private String extraJson;

    @Nullable
    private Map<String, String> extraValues;
    private boolean isOnline;
    private boolean isOwner;

    @NotNull
    private String model;

    @NotNull
    private String name;

    @Nullable
    private String orderTimeJString;

    @Nullable
    private String ownerId;

    @Nullable
    private String ownerName;
    private int permitLevel;
    private int productId;
    private int status;

    /* JADX INFO: renamed from: com.xiaomi.fitness.rn.export.bean.RNDevice$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/rn/export/bean/RNDevice$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/rn/export/bean/RNDevice;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fitness/rn/export/bean/RNDevice;", "export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<RNDevice> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public RNDevice createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RNDevice(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public RNDevice[] newArray(int size) {
            return new RNDevice[size];
        }
    }

    public RNDevice() {
        this(null, 0, null, null, null, null, 0, null, 255, null);
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

    @Override // com.xiaomi.fitness.device.manager.bean.Device
    @NotNull
    public String getDid() {
        return this.did;
    }

    @Nullable
    public final String getExtraJson() {
        return this.extraJson;
    }

    @Override // com.xiaomi.fitness.device.manager.bean.Device
    @Nullable
    public Map<String, String> getExtraValues() {
        return this.extraValues;
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

    @Nullable
    public final String getOrderTimeJString() {
        return this.orderTimeJString;
    }

    @Nullable
    public final String getOwnerId() {
        return this.ownerId;
    }

    @Nullable
    public final String getOwnerName() {
        return this.ownerName;
    }

    public final int getPermitLevel() {
        return this.permitLevel;
    }

    @Override // com.xiaomi.fitness.device.manager.bean.Device
    public int getProductId() {
        return this.productId;
    }

    @Override // com.xiaomi.fitness.device.manager.bean.Device
    public int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: isOnline, reason: from getter */
    public final boolean getIsOnline() {
        return this.isOnline;
    }

    /* JADX INFO: renamed from: isOwner, reason: from getter */
    public final boolean getIsOwner() {
        return this.isOwner;
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

    @Override // com.xiaomi.fitness.device.manager.bean.Device
    public void setDid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.did = str;
    }

    public final void setExtraJson(@Nullable String str) {
        this.extraJson = str;
    }

    @Override // com.xiaomi.fitness.device.manager.bean.Device
    public void setExtraValues(@Nullable Map<String, String> map) {
        this.extraValues = map;
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

    public final void setOnline(boolean z) {
        this.isOnline = z;
    }

    public final void setOrderTimeJString(@Nullable String str) {
        this.orderTimeJString = str;
    }

    public final void setOwner(boolean z) {
        this.isOwner = z;
    }

    public final void setOwnerId(@Nullable String str) {
        this.ownerId = str;
    }

    public final void setOwnerName(@Nullable String str) {
        this.ownerName = str;
    }

    public final void setPermitLevel(int i) {
        this.permitLevel = i;
    }

    @Override // com.xiaomi.fitness.device.manager.bean.Device
    public void setProductId(int i) {
        this.productId = i;
    }

    @Override // com.xiaomi.fitness.device.manager.bean.Device
    public void setStatus(int i) {
        this.status = i;
    }

    @Override // com.xiaomi.fitness.device.manager.bean.Device, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, flags);
        dest.writeInt(this.isOwner ? 1 : 0);
        dest.writeInt(this.permitLevel);
        dest.writeString(this.ownerId);
        dest.writeString(this.ownerName);
        dest.writeInt(this.isOnline ? 1 : 0);
        dest.writeString(this.extraJson);
    }

    public /* synthetic */ RNDevice(String str, int i, String str2, String str3, Map map, String str4, int i2, Device.Detail detail, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? null : map, (i3 & 32) == 0 ? str4 : "", (i3 & 64) != 0 ? -1 : i2, (i3 & 128) == 0 ? detail : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNDevice(@NotNull String did, int i, @NotNull String model, @NotNull String name, @Nullable Map<String, String> map, @NotNull String alias, int i2, @Nullable Device.Detail detail) {
        super(did, i, model, name, map, "", alias, i2, detail, 0, 512, null);
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.did = did;
        this.productId = i;
        this.model = model;
        this.name = name;
        this.extraValues = map;
        this.alias = alias;
        this.status = i2;
        this.detail = detail;
        this.isOwner = true;
        this.isOnline = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RNDevice(@NotNull Parcel parcel) {
        this(null, 0, null, null, null, null, 0, null, 255, null);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        readFromParcel(parcel);
        this.isOwner = parcel.readInt() == 1;
        this.permitLevel = parcel.readInt();
        this.ownerId = parcel.readString();
        this.ownerName = parcel.readString();
        this.isOnline = parcel.readInt() == 1;
        this.extraJson = parcel.readString();
    }
}
