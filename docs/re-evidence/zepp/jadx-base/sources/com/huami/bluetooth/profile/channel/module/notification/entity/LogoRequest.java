package com.huami.bluetooth.profile.channel.module.notification.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001e¨\u0006#"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/entity/LogoRequest;", "", "", "component1", "Lcom/huami/bluetooth/profile/channel/module/notification/entity/LogoFormat;", "component2", "", "component3", "component4", "pkg", TrainingWebConst.QueryParam.VIDEO_FORMAT, ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "height", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getPkg", "()Ljava/lang/String;", "b", "Lcom/huami/bluetooth/profile/channel/module/notification/entity/LogoFormat;", "getFormat", "()Lcom/huami/bluetooth/profile/channel/module/notification/entity/LogoFormat;", "c", LogUtil.I, "getWidth", "()I", GoogleApiAvailabilityLight.a, "getHeight", "<init>", "(Ljava/lang/String;Lcom/huami/bluetooth/profile/channel/module/notification/entity/LogoFormat;II)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class LogoRequest {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String pkg;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final LogoFormat format;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int width;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int height;

    public LogoRequest(@NotNull String str, @NotNull LogoFormat logoFormat, int i, int i2) {
        this.pkg = str;
        this.format = logoFormat;
        this.width = i;
        this.height = i2;
    }

    public static /* synthetic */ LogoRequest copy$default(LogoRequest logoRequest, String str, LogoFormat logoFormat, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = logoRequest.pkg;
        }
        if ((i3 & 2) != 0) {
            logoFormat = logoRequest.format;
        }
        if ((i3 & 4) != 0) {
            i = logoRequest.width;
        }
        if ((i3 & 8) != 0) {
            i2 = logoRequest.height;
        }
        return logoRequest.copy(str, logoFormat, i, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPkg() {
        return this.pkg;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LogoFormat getFormat() {
        return this.format;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final LogoRequest copy(@NotNull String pkg, @NotNull LogoFormat format, int width, int height) {
        return new LogoRequest(pkg, format, width, height);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogoRequest)) {
            return false;
        }
        LogoRequest logoRequest = (LogoRequest) other;
        return Intrinsics.areEqual(this.pkg, logoRequest.pkg) && this.format == logoRequest.format && this.width == logoRequest.width && this.height == logoRequest.height;
    }

    @NotNull
    public final LogoFormat getFormat() {
        return this.format;
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final String getPkg() {
        return this.pkg;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((((this.pkg.hashCode() * 31) + this.format.hashCode()) * 31) + this.width) * 31) + this.height;
    }

    @NotNull
    public String toString() {
        return "LogoRequest(pkg=" + this.pkg + ", format=" + this.format + ", width=" + this.width + ", height=" + this.height + ')';
    }
}
