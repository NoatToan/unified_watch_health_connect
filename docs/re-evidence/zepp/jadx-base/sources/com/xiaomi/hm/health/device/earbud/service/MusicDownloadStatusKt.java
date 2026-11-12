package com.xiaomi.hm.health.device.earbud.service;

import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a \u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a \u0010\u0007\u001a\u00020\u0006*\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a \u0010\n\u001a\u00020\t*\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0086\b¢\u0006\u0004\b\n\u0010\u000b\u001a \u0010\f\u001a\u00020\t*\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0086\b¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/service/MusicDownloadStatus;", "", "musicId", "Ljava/math/BigDecimal;", "percent", "(Lcom/xiaomi/hm/health/device/earbud/service/MusicDownloadStatus;Ljava/lang/Long;)Ljava/math/BigDecimal;", "", "percentStr", "(Lcom/xiaomi/hm/health/device/earbud/service/MusicDownloadStatus;Ljava/lang/Long;)Ljava/lang/String;", "", "progress", "(Lcom/xiaomi/hm/health/device/earbud/service/MusicDownloadStatus;Ljava/lang/Long;)I", "total", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class MusicDownloadStatusKt {
    @NotNull
    public static final BigDecimal percent(@Nullable MusicDownloadStatus musicDownloadStatus, @Nullable Long l) {
        if (musicDownloadStatus == null || l == null || musicDownloadStatus.getId() != l.longValue()) {
            return new BigDecimal(0);
        }
        int status = musicDownloadStatus.getStatus();
        if (status == 0) {
            return new BigDecimal(0);
        }
        if (CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{1, -1}).contains(Integer.valueOf(status))) {
            return (musicDownloadStatus.getProgress() == null || musicDownloadStatus.getProgress().progress == 0 || musicDownloadStatus.getProgress().total == 0) ? new BigDecimal(0) : new BigDecimal(((double) (musicDownloadStatus.getProgress().progress * 100)) / ((double) musicDownloadStatus.getProgress().total)).setScale(1, 4);
        }
        return new BigDecimal(100);
    }

    @NotNull
    public static final String percentStr(@Nullable MusicDownloadStatus musicDownloadStatus, @Nullable Long l) {
        BigDecimal bigDecimal;
        int status;
        if (musicDownloadStatus == null || l == null || musicDownloadStatus.getId() != l.longValue() || (status = musicDownloadStatus.getStatus()) == 0) {
            bigDecimal = new BigDecimal(0);
        } else if (CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{1, -1}).contains(Integer.valueOf(status))) {
            bigDecimal = (musicDownloadStatus.getProgress() == null || musicDownloadStatus.getProgress().progress == 0 || musicDownloadStatus.getProgress().total == 0) ? new BigDecimal(0) : new BigDecimal(((double) (musicDownloadStatus.getProgress().progress * 100)) / ((double) musicDownloadStatus.getProgress().total)).setScale(1, 4);
        } else {
            bigDecimal = new BigDecimal(100);
        }
        return bigDecimal.toString();
    }

    public static final int progress(@Nullable MusicDownloadStatus musicDownloadStatus, @Nullable Long l) {
        Progress progress;
        if (musicDownloadStatus == null || l == null) {
            return 0;
        }
        if (l.longValue() == musicDownloadStatus.getId() && (progress = musicDownloadStatus.getProgress()) != null) {
            return progress.progress;
        }
        return 0;
    }

    public static final int total(@Nullable MusicDownloadStatus musicDownloadStatus, @Nullable Long l) {
        Progress progress;
        if (musicDownloadStatus == null || l == null) {
            return 100;
        }
        if (l.longValue() != musicDownloadStatus.getId()) {
            return 100;
        }
        Progress progress2 = musicDownloadStatus.getProgress();
        boolean z = false;
        if (progress2 != null && progress2.total == 0) {
            z = true;
        }
        if (z || (progress = musicDownloadStatus.getProgress()) == null) {
            return 100;
        }
        return progress.total;
    }
}
