package com.huami.bluetooth.profile.channel.module.notification.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/entity/AppReplyResult;", "", "", "component1", "", "component2", "uniqueId", "succeed", "copy", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getUniqueId", "()I", "b", "Z", "getSucceed", "()Z", "<init>", "(IZ)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AppReplyResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int uniqueId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean succeed;

    public AppReplyResult(int i, boolean z) {
        this.uniqueId = i;
        this.succeed = z;
    }

    public static /* synthetic */ AppReplyResult copy$default(AppReplyResult appReplyResult, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = appReplyResult.uniqueId;
        }
        if ((i2 & 2) != 0) {
            z = appReplyResult.succeed;
        }
        return appReplyResult.copy(i, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getUniqueId() {
        return this.uniqueId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSucceed() {
        return this.succeed;
    }

    @NotNull
    public final AppReplyResult copy(int uniqueId, boolean succeed) {
        return new AppReplyResult(uniqueId, succeed);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppReplyResult)) {
            return false;
        }
        AppReplyResult appReplyResult = (AppReplyResult) other;
        return this.uniqueId == appReplyResult.uniqueId && this.succeed == appReplyResult.succeed;
    }

    public final boolean getSucceed() {
        return this.succeed;
    }

    public final int getUniqueId() {
        return this.uniqueId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int i = this.uniqueId * 31;
        boolean z = this.succeed;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return i + r1;
    }

    @NotNull
    public String toString() {
        return "AppReplyResult(uniqueId=" + this.uniqueId + ", succeed=" + this.succeed + ')';
    }
}
