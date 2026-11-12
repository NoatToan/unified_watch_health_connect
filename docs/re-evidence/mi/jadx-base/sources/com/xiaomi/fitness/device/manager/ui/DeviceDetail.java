package com.xiaomi.fitness.device.manager.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.device.manager.bean.Device;
import defpackage.uzi;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0015\u0018\u0000 -2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001a\u0010!\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0011R\u001a\u0010#\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\u0011R\u001a\u0010%\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000f\"\u0004\b&\u0010\u0011R\u001a\u0010'\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u000f\"\u0004\b(\u0010\u0011R\u0011\u0010)\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b*\u0010\u0015R\u0011\u0010+\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u000fR\u0011\u0010,\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b,\u0010\u000f¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/DeviceDetail;", "Lcom/xiaomi/fitness/device/manager/bean/Device;", "<init>", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", Column.BATTERY, "Lcom/xiaomi/fitness/device/manager/ui/Battery;", "getBattery", "()Lcom/xiaomi/fitness/device/manager/ui/Battery;", "setBattery", "(Lcom/xiaomi/fitness/device/manager/ui/Battery;)V", "isConnecting", "", "()Z", "setConnecting", "(Z)V", "icon", "", "getIcon", "()Ljava/lang/String;", "setIcon", "(Ljava/lang/String;)V", "defaultIcon", "", "getDefaultIcon", "()I", "setDefaultIcon", "(I)V", "connectStatus", "getConnectStatus", "setConnectStatus", "isCurrent", "setCurrent", "isYunMai", "setYunMai", "isPendingPairing", "setPendingPairing", "isAccessory", "setAccessory", "des", "getDes", "isConnected", "isEditMode", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceDetail extends Device {
    public static final int MODE_EDIT = 2;
    public static final int MODE_NORMAL = 1;

    @Nullable
    private Battery battery;
    private int connectStatus;
    private int defaultIcon;

    @Nullable
    private String icon;
    private boolean isAccessory;
    private final boolean isConnected;
    private boolean isConnecting;
    private boolean isCurrent;
    private boolean isPendingPairing;
    private boolean isYunMai;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static int displayMode = 1;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<DeviceDetail> CREATOR = new Parcelable.Creator<DeviceDetail>() { // from class: com.xiaomi.fitness.device.manager.ui.DeviceDetail$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceDetail createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new DeviceDetail(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceDetail[] newArray(int size) {
            return new DeviceDetail[size];
        }
    };

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0007J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/DeviceDetail$Companion;", "", "<init>", "()V", "MODE_NORMAL", "", "MODE_EDIT", "displayMode", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/device/manager/ui/DeviceDetail;", "checkIsEditMode", "", "setMode", "", "mode", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final boolean checkIsEditMode() {
            return DeviceDetail.displayMode == 2;
        }

        public final void setMode(int mode) {
            DeviceDetail.displayMode = mode;
        }
    }

    public DeviceDetail() {
        super(null, 0, null, null, null, null, null, 0, null, 0, 1023, null);
        boolean z = true;
        this.isConnecting = true;
        this.defaultIcon = -1;
        int i = this.connectStatus;
        if (i != 7 && i != 5 && i != 3) {
            z = false;
        }
        this.isConnected = z;
    }

    @JvmStatic
    public static final boolean checkIsEditMode() {
        return INSTANCE.checkIsEditMode();
    }

    @Nullable
    public final Battery getBattery() {
        return this.battery;
    }

    public final int getConnectStatus() {
        return this.connectStatus;
    }

    public final int getDefaultIcon() {
        return this.defaultIcon;
    }

    @NotNull
    public final String getDes() {
        int i;
        switch (this.connectStatus) {
            case 1:
            case 4:
                i = uzi.f0;
                break;
            case 2:
                i = uzi.Q1;
                break;
            case 3:
            case 5:
            case 7:
                i = uzi.d0;
                break;
            case 6:
                i = uzi.W1;
                break;
            default:
                i = uzi.f0;
                break;
        }
        return ResourceExtKt.getString(i);
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: isAccessory, reason: from getter */
    public final boolean getIsAccessory() {
        return this.isAccessory;
    }

    /* JADX INFO: renamed from: isConnected, reason: from getter */
    public final boolean getIsConnected() {
        return this.isConnected;
    }

    /* JADX INFO: renamed from: isConnecting, reason: from getter */
    public final boolean getIsConnecting() {
        return this.isConnecting;
    }

    /* JADX INFO: renamed from: isCurrent, reason: from getter */
    public final boolean getIsCurrent() {
        return this.isCurrent;
    }

    public final boolean isEditMode() {
        return INSTANCE.checkIsEditMode();
    }

    /* JADX INFO: renamed from: isPendingPairing, reason: from getter */
    public final boolean getIsPendingPairing() {
        return this.isPendingPairing;
    }

    /* JADX INFO: renamed from: isYunMai, reason: from getter */
    public final boolean getIsYunMai() {
        return this.isYunMai;
    }

    public final void setAccessory(boolean z) {
        this.isAccessory = z;
    }

    public final void setBattery(@Nullable Battery battery) {
        this.battery = battery;
    }

    public final void setConnectStatus(int i) {
        this.connectStatus = i;
    }

    public final void setConnecting(boolean z) {
        this.isConnecting = z;
    }

    public final void setCurrent(boolean z) {
        this.isCurrent = z;
    }

    public final void setDefaultIcon(int i) {
        this.defaultIcon = i;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setPendingPairing(boolean z) {
        this.isPendingPairing = z;
    }

    public final void setYunMai(boolean z) {
        this.isYunMai = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeviceDetail(@NotNull Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        readFromParcel(parcel);
    }
}
