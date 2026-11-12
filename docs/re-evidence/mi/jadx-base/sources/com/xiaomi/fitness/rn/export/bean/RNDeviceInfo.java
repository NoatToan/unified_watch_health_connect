package com.xiaomi.fitness.rn.export.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/rn/export/bean/RNDeviceInfo;", "Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo;", "Lcom/xiaomi/fitness/rn/export/bean/RNDevice;", "<init>", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "CREATOR", "export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RNDeviceInfo extends DeviceInfo<RNDevice> {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.xiaomi.fitness.rn.export.bean.RNDeviceInfo$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/rn/export/bean/RNDeviceInfo$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/rn/export/bean/RNDeviceInfo;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fitness/rn/export/bean/RNDeviceInfo;", "export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<RNDeviceInfo> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public RNDeviceInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RNDeviceInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public RNDeviceInfo[] newArray(int size) {
            return new RNDeviceInfo[size];
        }
    }

    public RNDeviceInfo() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RNDeviceInfo(@NotNull Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        readFromParcel(parcel);
    }
}
