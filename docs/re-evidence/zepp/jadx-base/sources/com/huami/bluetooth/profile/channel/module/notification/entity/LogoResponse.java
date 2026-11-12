package com.huami.bluetooth.profile.channel.module.notification.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/entity/LogoResponse;", "", "", "component1", "", "component2", "pkg", "code", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getPkg", "()Ljava/lang/String;", "b", LogUtil.I, "getCode", "()I", "<init>", "(Ljava/lang/String;I)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class LogoResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String pkg;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int code;

    public LogoResponse(@NotNull String str, int i) {
        this.pkg = str;
        this.code = i;
    }

    public static /* synthetic */ LogoResponse copy$default(LogoResponse logoResponse, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = logoResponse.pkg;
        }
        if ((i2 & 2) != 0) {
            i = logoResponse.code;
        }
        return logoResponse.copy(str, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPkg() {
        return this.pkg;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final LogoResponse copy(@NotNull String pkg, int code) {
        return new LogoResponse(pkg, code);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogoResponse)) {
            return false;
        }
        LogoResponse logoResponse = (LogoResponse) other;
        return Intrinsics.areEqual(this.pkg, logoResponse.pkg) && this.code == logoResponse.code;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getPkg() {
        return this.pkg;
    }

    public int hashCode() {
        return (this.pkg.hashCode() * 31) + this.code;
    }

    @NotNull
    public String toString() {
        return "LogoResponse(pkg=" + this.pkg + ", code=" + this.code + ')';
    }
}
