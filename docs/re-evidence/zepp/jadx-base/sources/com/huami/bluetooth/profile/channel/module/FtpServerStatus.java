package com.huami.bluetooth.profile.channel.module;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.integrity.IntegrityManager;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB#\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u000f\u001a\u00020\bHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006 "}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/FtpServerStatus;", "", "", Constants.ENABLED, "enabling", "disabled", "", "component1", "", "component2", "component3", "stateCode", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "userName", "copy", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getStateCode", "()I", "b", "Ljava/lang/String;", "getAddress", "()Ljava/lang/String;", "c", "getUserName", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class FtpServerStatus {
    public static final int STATE_DISABLED = 0;
    public static final int STATE_ENABLED = 2;
    public static final int STATE_ENABLEING = 1;
    public static final int STATE_FAILED = 3;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int stateCode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String address;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String userName;

    public FtpServerStatus(int i, @Nullable String str, @Nullable String str2) {
        this.stateCode = i;
        this.address = str;
        this.userName = str2;
    }

    public static /* synthetic */ FtpServerStatus copy$default(FtpServerStatus ftpServerStatus, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ftpServerStatus.stateCode;
        }
        if ((i2 & 2) != 0) {
            str = ftpServerStatus.address;
        }
        if ((i2 & 4) != 0) {
            str2 = ftpServerStatus.userName;
        }
        return ftpServerStatus.copy(i, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStateCode() {
        return this.stateCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    @NotNull
    public final FtpServerStatus copy(int stateCode, @Nullable String address, @Nullable String userName) {
        return new FtpServerStatus(stateCode, address, userName);
    }

    public final boolean disabled() {
        return this.stateCode == 0;
    }

    public final boolean enabled() {
        if (this.stateCode == 2) {
            String str = this.address;
            if (str != null && str.length() > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean enabling() {
        return this.stateCode == 1;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FtpServerStatus)) {
            return false;
        }
        FtpServerStatus ftpServerStatus = (FtpServerStatus) other;
        return this.stateCode == ftpServerStatus.stateCode && Intrinsics.areEqual(this.address, ftpServerStatus.address) && Intrinsics.areEqual(this.userName, ftpServerStatus.userName);
    }

    @Nullable
    public final String getAddress() {
        return this.address;
    }

    public final int getStateCode() {
        return this.stateCode;
    }

    @Nullable
    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        int i = this.stateCode * 31;
        String str = this.address;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userName;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FtpServerStatus(stateCode=" + this.stateCode + ", address=" + ((Object) this.address) + ", userName=" + ((Object) this.userName) + ')';
    }
}
