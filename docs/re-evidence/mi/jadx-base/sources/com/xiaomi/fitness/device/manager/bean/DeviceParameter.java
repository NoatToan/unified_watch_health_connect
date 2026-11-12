package com.xiaomi.fitness.device.manager.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Parcelize
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001a\u001a\u00020\fH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\fH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/device/manager/bean/DeviceParameter;", "Landroid/os/Parcelable;", "model", "", "mac", "bleName", "nodeId", "oob", "serverBind", "", "did", "from", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)V", "getModel", "()Ljava/lang/String;", "getMac", "getBleName", "getNodeId", "getOob", "getServerBind", "()Z", "getDid", "getFrom", "()I", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class DeviceParameter implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DeviceParameter> CREATOR = new Creator();

    @Nullable
    private final String bleName;

    @Nullable
    private final String did;
    private final int from;

    @NotNull
    private final String mac;

    @NotNull
    private final String model;

    @Nullable
    private final String nodeId;

    @Nullable
    private final String oob;
    private final boolean serverBind;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeviceParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeviceParameter createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeviceParameter(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeviceParameter[] newArray(int i) {
            return new DeviceParameter[i];
        }
    }

    public DeviceParameter(@NotNull String model, @NotNull String mac, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, @Nullable String str4, int i) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(mac, "mac");
        this.model = model;
        this.mac = mac;
        this.bleName = str;
        this.nodeId = str2;
        this.oob = str3;
        this.serverBind = z;
        this.did = str4;
        this.from = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public String getBleName() {
        return this.bleName;
    }

    @Nullable
    public String getDid() {
        return this.did;
    }

    public int getFrom() {
        return this.from;
    }

    @NotNull
    public String getMac() {
        return this.mac;
    }

    @NotNull
    public String getModel() {
        return this.model;
    }

    @Nullable
    public String getNodeId() {
        return this.nodeId;
    }

    @Nullable
    public String getOob() {
        return this.oob;
    }

    public boolean getServerBind() {
        return this.serverBind;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.model);
        dest.writeString(this.mac);
        dest.writeString(this.bleName);
        dest.writeString(this.nodeId);
        dest.writeString(this.oob);
        dest.writeInt(this.serverBind ? 1 : 0);
        dest.writeString(this.did);
        dest.writeInt(this.from);
    }

    public /* synthetic */ DeviceParameter(String str, String str2, String str3, String str4, String str5, boolean z, String str6, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? null : str6, i);
    }
}
