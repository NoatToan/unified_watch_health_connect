package com.xiaomi.fitness.route.export.track;

import com.xiaomi.hm.health.dataprocess.StepsInfo;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003JY\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/route/export/track/TrackDetailData;", "Ljava/io/Serializable;", "suffix", "", "mFileUrl", "uploadTime", "", "uploadTimeStr", "source", "routeId", "alias", StepsInfo.KEY_DISTANCE, "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSuffix", "()Ljava/lang/String;", "getMFileUrl", "getUploadTime", "()J", "getUploadTimeStr", "getSource", "getRouteId", "getAlias", "getDis", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "route-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TrackDetailData implements Serializable {

    @NotNull
    private final String alias;

    @NotNull
    private final String dis;

    @NotNull
    private final String mFileUrl;

    @NotNull
    private final String routeId;

    @NotNull
    private final String source;

    @NotNull
    private final String suffix;
    private final long uploadTime;

    @NotNull
    private final String uploadTimeStr;

    public TrackDetailData(@NotNull String suffix, @NotNull String mFileUrl, long j, @NotNull String uploadTimeStr, @NotNull String source, @NotNull String routeId, @NotNull String alias, @NotNull String dis) {
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        Intrinsics.checkNotNullParameter(mFileUrl, "mFileUrl");
        Intrinsics.checkNotNullParameter(uploadTimeStr, "uploadTimeStr");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(routeId, "routeId");
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(dis, "dis");
        this.suffix = suffix;
        this.mFileUrl = mFileUrl;
        this.uploadTime = j;
        this.uploadTimeStr = uploadTimeStr;
        this.source = source;
        this.routeId = routeId;
        this.alias = alias;
        this.dis = dis;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSuffix() {
        return this.suffix;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMFileUrl() {
        return this.mFileUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getUploadTime() {
        return this.uploadTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUploadTimeStr() {
        return this.uploadTimeStr;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRouteId() {
        return this.routeId;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAlias() {
        return this.alias;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDis() {
        return this.dis;
    }

    @NotNull
    public final TrackDetailData copy(@NotNull String suffix, @NotNull String mFileUrl, long uploadTime, @NotNull String uploadTimeStr, @NotNull String source, @NotNull String routeId, @NotNull String alias, @NotNull String dis) {
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        Intrinsics.checkNotNullParameter(mFileUrl, "mFileUrl");
        Intrinsics.checkNotNullParameter(uploadTimeStr, "uploadTimeStr");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(routeId, "routeId");
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(dis, "dis");
        return new TrackDetailData(suffix, mFileUrl, uploadTime, uploadTimeStr, source, routeId, alias, dis);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackDetailData)) {
            return false;
        }
        TrackDetailData trackDetailData = (TrackDetailData) other;
        return Intrinsics.areEqual(this.suffix, trackDetailData.suffix) && Intrinsics.areEqual(this.mFileUrl, trackDetailData.mFileUrl) && this.uploadTime == trackDetailData.uploadTime && Intrinsics.areEqual(this.uploadTimeStr, trackDetailData.uploadTimeStr) && Intrinsics.areEqual(this.source, trackDetailData.source) && Intrinsics.areEqual(this.routeId, trackDetailData.routeId) && Intrinsics.areEqual(this.alias, trackDetailData.alias) && Intrinsics.areEqual(this.dis, trackDetailData.dis);
    }

    @NotNull
    public final String getAlias() {
        return this.alias;
    }

    @NotNull
    public final String getDis() {
        return this.dis;
    }

    @NotNull
    public final String getMFileUrl() {
        return this.mFileUrl;
    }

    @NotNull
    public final String getRouteId() {
        return this.routeId;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final String getSuffix() {
        return this.suffix;
    }

    public final long getUploadTime() {
        return this.uploadTime;
    }

    @NotNull
    public final String getUploadTimeStr() {
        return this.uploadTimeStr;
    }

    public int hashCode() {
        return (((((((((((((this.suffix.hashCode() * 31) + this.mFileUrl.hashCode()) * 31) + Long.hashCode(this.uploadTime)) * 31) + this.uploadTimeStr.hashCode()) * 31) + this.source.hashCode()) * 31) + this.routeId.hashCode()) * 31) + this.alias.hashCode()) * 31) + this.dis.hashCode();
    }

    @NotNull
    public String toString() {
        return "TrackDetailData(suffix=" + this.suffix + ", mFileUrl=" + this.mFileUrl + ", uploadTime=" + this.uploadTime + ", uploadTimeStr=" + this.uploadTimeStr + ", source=" + this.source + ", routeId=" + this.routeId + ", alias=" + this.alias + ", dis=" + this.dis + ")";
    }
}
