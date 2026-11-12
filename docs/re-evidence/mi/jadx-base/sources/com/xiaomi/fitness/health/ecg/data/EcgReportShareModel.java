package com.xiaomi.fitness.health.ecg.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/data/EcgReportShareModel;", "", "url", "", "fileType", "", "<init>", "(Ljava/lang/String;I)V", "getUrl", "()Ljava/lang/String;", "getFileType", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EcgReportShareModel {

    @SerializedName("file_type")
    private final int fileType;

    @SerializedName("url")
    @NotNull
    private final String url;

    public EcgReportShareModel(@NotNull String url, int i) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.fileType = i;
    }

    public static /* synthetic */ EcgReportShareModel copy$default(EcgReportShareModel ecgReportShareModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = ecgReportShareModel.url;
        }
        if ((i2 & 2) != 0) {
            i = ecgReportShareModel.fileType;
        }
        return ecgReportShareModel.copy(str, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getFileType() {
        return this.fileType;
    }

    @NotNull
    public final EcgReportShareModel copy(@NotNull String url, int fileType) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new EcgReportShareModel(url, fileType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcgReportShareModel)) {
            return false;
        }
        EcgReportShareModel ecgReportShareModel = (EcgReportShareModel) other;
        return Intrinsics.areEqual(this.url, ecgReportShareModel.url) && this.fileType == ecgReportShareModel.fileType;
    }

    public final int getFileType() {
        return this.fileType;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (this.url.hashCode() * 31) + Integer.hashCode(this.fileType);
    }

    @NotNull
    public String toString() {
        return "EcgReportShareModel(url=" + this.url + ", fileType=" + this.fileType + ")";
    }
}
