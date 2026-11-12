package com.huami.phone_call.sms.data;

import androidx.annotation.StringRes;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0004\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00042\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0007¨\u0006\u001f"}, d2 = {"Lcom/huami/phone_call/sms/data/PermissionInfo;", "", "", "component1", "", "component2", "component3", "()Ljava/lang/Integer;", PointCategory.PERMISSION, "message", "tips", "copy", "(Ljava/lang/String;ILjava/lang/Integer;)Lcom/huami/phone_call/sms/data/PermissionInfo;", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getPermission", "()Ljava/lang/String;", "b", LogUtil.I, "getMessage", "()I", "c", "Ljava/lang/Integer;", "getTips", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;)V", "phone_call_sms_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PermissionInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String permission;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int message;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer tips;

    public PermissionInfo(@NotNull String str, @StringRes int i, @StringRes @Nullable Integer num) {
        this.permission = str;
        this.message = i;
        this.tips = num;
    }

    public static /* synthetic */ PermissionInfo copy$default(PermissionInfo permissionInfo, String str, int i, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = permissionInfo.permission;
        }
        if ((i2 & 2) != 0) {
            i = permissionInfo.message;
        }
        if ((i2 & 4) != 0) {
            num = permissionInfo.tips;
        }
        return permissionInfo.copy(str, i, num);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPermission() {
        return this.permission;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMessage() {
        return this.message;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getTips() {
        return this.tips;
    }

    @NotNull
    public final PermissionInfo copy(@NotNull String permission, @StringRes int message, @StringRes @Nullable Integer tips) {
        return new PermissionInfo(permission, message, tips);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PermissionInfo)) {
            return false;
        }
        PermissionInfo permissionInfo = (PermissionInfo) other;
        return Intrinsics.areEqual(this.permission, permissionInfo.permission) && this.message == permissionInfo.message && Intrinsics.areEqual(this.tips, permissionInfo.tips);
    }

    public final int getMessage() {
        return this.message;
    }

    @NotNull
    public final String getPermission() {
        return this.permission;
    }

    @Nullable
    public final Integer getTips() {
        return this.tips;
    }

    public int hashCode() {
        int iHashCode = ((this.permission.hashCode() * 31) + this.message) * 31;
        Integer num = this.tips;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "PermissionInfo(permission=" + this.permission + ", message=" + this.message + ", tips=" + this.tips + ")";
    }
}
