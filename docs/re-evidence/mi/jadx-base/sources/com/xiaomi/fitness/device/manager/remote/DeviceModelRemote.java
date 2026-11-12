package com.xiaomi.fitness.device.manager.remote;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Parcelize
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/device/manager/remote/DeviceModelRemote;", "Landroid/os/Parcelable;", "did", "", "<init>", "(Ljava/lang/String;)V", "getDid", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceModelRemote implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DeviceModelRemote> CREATOR = new Creator();

    @NotNull
    private final String did;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeviceModelRemote> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeviceModelRemote createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeviceModelRemote(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeviceModelRemote[] newArray(int i) {
            return new DeviceModelRemote[i];
        }
    }

    public DeviceModelRemote(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        this.did = did;
    }

    public static /* synthetic */ DeviceModelRemote copy$default(DeviceModelRemote deviceModelRemote, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceModelRemote.did;
        }
        return deviceModelRemote.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDid() {
        return this.did;
    }

    @NotNull
    public final DeviceModelRemote copy(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return new DeviceModelRemote(did);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeviceModelRemote) && Intrinsics.areEqual(this.did, ((DeviceModelRemote) other).did);
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    public int hashCode() {
        return this.did.hashCode();
    }

    @NotNull
    public String toString() {
        return "DeviceModelRemote(did=" + this.did + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.did);
    }
}
