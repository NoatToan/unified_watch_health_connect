package com.xiaomi.fitness.eco.device.manager.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice;
import defpackage.yzi;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001b\b\u0016\u0018\u0000 -2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000fR\u001a\u0010\u001d\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\t\"\u0004\b\u001e\u0010\u000bR\u001a\u0010\u001f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000bR\u001a\u0010!\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011R\u001a\u0010$\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\t\"\u0004\b%\u0010\u000bR\u001a\u0010&\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0015\"\u0004\b(\u0010\u0017R\u0014\u0010)\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u000fR\u0011\u0010+\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\tR\u0011\u0010,\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\t¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ui/EcoDeviceDetail;", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDevice;", "<init>", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "isConnecting", "", "()Z", "setConnecting", "(Z)V", "icon", "", "getIcon", "()Ljava/lang/String;", "setIcon", "(Ljava/lang/String;)V", "defaultIcon", "", "getDefaultIcon", "()I", "setDefaultIcon", "(I)V", "connectStatus", "getConnectStatus", "setConnectStatus", "statusText", "getStatusText", "isCurrent", "setCurrent", "isEco", "setEco", "nameSuffix", "getNameSuffix", "setNameSuffix", "isPendingPairing", "setPendingPairing", "lastConnectedStatus", "getLastConnectedStatus", "setLastConnectedStatus", "des", "getDes", "isConnected", "isEditMode", "Companion", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class EcoDeviceDetail extends EcoDevice {
    public static final int MODE_EDIT = 2;
    public static final int MODE_NORMAL = 1;
    private int connectStatus;
    private int defaultIcon;

    @Nullable
    private String icon;
    private final boolean isConnected;
    private boolean isConnecting;
    private boolean isCurrent;
    private boolean isEco;
    private boolean isPendingPairing;
    private int lastConnectedStatus;

    @NotNull
    private String nameSuffix;

    @NotNull
    private final String statusText;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static int displayMode = 1;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<EcoDeviceDetail> CREATOR = new Parcelable.Creator<EcoDeviceDetail>() { // from class: com.xiaomi.fitness.eco.device.manager.ui.EcoDeviceDetail$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EcoDeviceDetail createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new EcoDeviceDetail(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EcoDeviceDetail[] newArray(int size) {
            return new EcoDeviceDetail[size];
        }
    };

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0007J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ui/EcoDeviceDetail$Companion;", "", "<init>", "()V", "MODE_NORMAL", "", "MODE_EDIT", "displayMode", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/eco/device/manager/ui/EcoDeviceDetail;", "checkIsEditMode", "", "setMode", "", "mode", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final boolean checkIsEditMode() {
            return EcoDeviceDetail.displayMode == 2;
        }

        public final void setMode(int mode) {
            EcoDeviceDetail.displayMode = mode;
        }
    }

    public EcoDeviceDetail() {
        super(null, 0, null, null, null, null, null, 0, null, 0, false, null, null, null, 16383, null);
        boolean z = true;
        this.isConnecting = true;
        this.defaultIcon = -1;
        this.statusText = ResourceExtKt.getString(yzi.o0);
        this.nameSuffix = "";
        this.lastConnectedStatus = -1;
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

    public final int getConnectStatus() {
        return this.connectStatus;
    }

    public final int getDefaultIcon() {
        return this.defaultIcon;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    @NotNull
    public String getDes() {
        int i;
        String shareId = getShareId();
        if (shareId != null && shareId.length() > 0) {
            return ResourceExtKt.getString(yzi.T);
        }
        Logger.i("connectStatus = " + this.connectStatus, new Object[0]);
        int i2 = this.connectStatus;
        if (i2 == 1) {
            i = yzi.K;
        } else if (i2 == 2) {
            i = yzi.q0;
        } else if (i2 == 3) {
            i = yzi.G;
        } else if (i2 == 4) {
            i = yzi.K;
        } else if (i2 == 5 || i2 == 7) {
            i = yzi.G;
        } else {
            i = yzi.K;
        }
        return ResourceExtKt.getString(i);
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    public final int getLastConnectedStatus() {
        return this.lastConnectedStatus;
    }

    @NotNull
    public final String getNameSuffix() {
        return this.nameSuffix;
    }

    @NotNull
    public String getStatusText() {
        return this.statusText;
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

    /* JADX INFO: renamed from: isEco, reason: from getter */
    public final boolean getIsEco() {
        return this.isEco;
    }

    public final boolean isEditMode() {
        return INSTANCE.checkIsEditMode();
    }

    /* JADX INFO: renamed from: isPendingPairing, reason: from getter */
    public final boolean getIsPendingPairing() {
        return this.isPendingPairing;
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

    public final void setEco(boolean z) {
        this.isEco = z;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setLastConnectedStatus(int i) {
        this.lastConnectedStatus = i;
    }

    public final void setNameSuffix(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nameSuffix = str;
    }

    public final void setPendingPairing(boolean z) {
        this.isPendingPairing = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcoDeviceDetail(@NotNull Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        readFromParcel(parcel);
    }
}
