package com.xiaomi.hm.health.device.earbud.service;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B#\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/service/MusicDownloadStatus;", "", "", "component1", "", "component2", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "component3", "id", "status", "progress", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "J", "getId", "()J", "b", LogUtil.I, "getStatus", "()I", "c", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "getProgress", "()Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "<init>", "(JILcom/xiaomi/hm/health/bt/profile/mili/model/Progress;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MusicDownloadStatus {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int STATUS_DOWNLOADING = 1;
    public static final int STATUS_FAIL = -1;
    public static final int STATUS_START = 0;
    public static final int STATUS_SUCCESS = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int status;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Progress progress;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0016\u0010\u000e\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0016\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/service/MusicDownloadStatus$Companion;", "", "", "id", "Lcom/xiaomi/hm/health/device/earbud/service/MusicDownloadStatus;", "start", "finish", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "progress", "fail", "", "STATUS_DOWNLOADING", LogUtil.I, "STATUS_FAIL", "STATUS_START", "STATUS_SUCCESS", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MusicDownloadStatus fail(long id) {
            return new MusicDownloadStatus(id, -1, null, null);
        }

        @NotNull
        public final MusicDownloadStatus finish(long id) {
            return new MusicDownloadStatus(id, 2, new Progress(100, 100), null);
        }

        @NotNull
        public final MusicDownloadStatus progress(long id, @NotNull Progress progress) {
            return new MusicDownloadStatus(id, 1, progress, null);
        }

        @NotNull
        public final MusicDownloadStatus start(long id) {
            return new MusicDownloadStatus(id, 0, new Progress(100, 0), null);
        }
    }

    private MusicDownloadStatus(long j, int i, Progress progress) {
        this.id = j;
        this.status = i;
        this.progress = progress;
    }

    public /* synthetic */ MusicDownloadStatus(long j, int i, Progress progress, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, progress);
    }

    public static /* synthetic */ MusicDownloadStatus copy$default(MusicDownloadStatus musicDownloadStatus, long j, int i, Progress progress, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = musicDownloadStatus.id;
        }
        if ((i2 & 2) != 0) {
            i = musicDownloadStatus.status;
        }
        if ((i2 & 4) != 0) {
            progress = musicDownloadStatus.progress;
        }
        return musicDownloadStatus.copy(j, i, progress);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Progress getProgress() {
        return this.progress;
    }

    @NotNull
    public final MusicDownloadStatus copy(long id, int status, @Nullable Progress progress) {
        return new MusicDownloadStatus(id, status, progress);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MusicDownloadStatus)) {
            return false;
        }
        MusicDownloadStatus musicDownloadStatus = (MusicDownloadStatus) other;
        return this.id == musicDownloadStatus.id && this.status == musicDownloadStatus.status && Intrinsics.areEqual(this.progress, musicDownloadStatus.progress);
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final Progress getProgress() {
        return this.progress;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iA = ((b.a(this.id) * 31) + this.status) * 31;
        Progress progress = this.progress;
        return iA + (progress == null ? 0 : progress.hashCode());
    }

    @NotNull
    public String toString() {
        return "MusicDownloadStatus(id=" + this.id + ", status=" + this.status + ", progress=" + this.progress + ")";
    }
}
