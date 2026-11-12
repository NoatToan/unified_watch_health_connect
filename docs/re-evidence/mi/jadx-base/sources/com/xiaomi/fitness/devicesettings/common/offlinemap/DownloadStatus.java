package com.xiaomi.fitness.devicesettings.common.offlinemap;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/offlinemap/DownloadStatus;", "", "<init>", "(Ljava/lang/String;I)V", "STATUS_IDEL", "STATUS_DOWNLOADING", "STATUS_PAUSE", "STATUS_PENDING", "STATUS_INSTALLING", "STATUS_INSTALLED", "STATUS_FAILED", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum DownloadStatus {
    STATUS_IDEL,
    STATUS_DOWNLOADING,
    STATUS_PAUSE,
    STATUS_PENDING,
    STATUS_INSTALLING,
    STATUS_INSTALLED,
    STATUS_FAILED;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<DownloadStatus> getEntries() {
        return $ENTRIES;
    }
}
