package com.xiaomi.fitness.route.export.track;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.util.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/route/export/track/UploadUrl;", "", "file", "Lcom/xiaomi/fitness/route/export/track/UrlModel;", "icon", "code", "", "strategyId", "<init>", "(Lcom/xiaomi/fitness/route/export/track/UrlModel;Lcom/xiaomi/fitness/route/export/track/UrlModel;II)V", "getFile", "()Lcom/xiaomi/fitness/route/export/track/UrlModel;", "getIcon", "getCode", "()I", "getStrategyId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "route-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UploadUrl {

    @SerializedName(Constants.EXTRA_RESULT_CODE)
    private final int code;

    @NotNull
    private final UrlModel file;

    @NotNull
    private final UrlModel icon;

    @SerializedName("strategy_id")
    private final int strategyId;

    public UploadUrl(@NotNull UrlModel file, @NotNull UrlModel icon, int i, int i2) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.file = file;
        this.icon = icon;
        this.code = i;
        this.strategyId = i2;
    }

    public static /* synthetic */ UploadUrl copy$default(UploadUrl uploadUrl, UrlModel urlModel, UrlModel urlModel2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            urlModel = uploadUrl.file;
        }
        if ((i3 & 2) != 0) {
            urlModel2 = uploadUrl.icon;
        }
        if ((i3 & 4) != 0) {
            i = uploadUrl.code;
        }
        if ((i3 & 8) != 0) {
            i2 = uploadUrl.strategyId;
        }
        return uploadUrl.copy(urlModel, urlModel2, i, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UrlModel getFile() {
        return this.file;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UrlModel getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getStrategyId() {
        return this.strategyId;
    }

    @NotNull
    public final UploadUrl copy(@NotNull UrlModel file, @NotNull UrlModel icon, int code, int strategyId) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new UploadUrl(file, icon, code, strategyId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadUrl)) {
            return false;
        }
        UploadUrl uploadUrl = (UploadUrl) other;
        return Intrinsics.areEqual(this.file, uploadUrl.file) && Intrinsics.areEqual(this.icon, uploadUrl.icon) && this.code == uploadUrl.code && this.strategyId == uploadUrl.strategyId;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final UrlModel getFile() {
        return this.file;
    }

    @NotNull
    public final UrlModel getIcon() {
        return this.icon;
    }

    public final int getStrategyId() {
        return this.strategyId;
    }

    public int hashCode() {
        return (((((this.file.hashCode() * 31) + this.icon.hashCode()) * 31) + Integer.hashCode(this.code)) * 31) + Integer.hashCode(this.strategyId);
    }

    @NotNull
    public String toString() {
        return "UploadUrl(file=" + this.file + ", icon=" + this.icon + ", code=" + this.code + ", strategyId=" + this.strategyId + ")";
    }
}
