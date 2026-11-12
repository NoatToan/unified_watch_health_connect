package com.xiaomi.hm.health.device.earbud.repo;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/repo/MusicLocalStatus;", "", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface MusicLocalStatus {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;
    public static final int DELETED = -1;
    public static final int DOWNLOADED = 3;
    public static final int DOWNLOADING = 2;
    public static final int NOT_DOWNLOAD = 0;
    public static final int WAIT_DOWNLOAD = 1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/repo/MusicLocalStatus$Companion;", "", "", "DELETED", LogUtil.I, "NOT_DOWNLOAD", "WAIT_DOWNLOAD", "DOWNLOADING", "DOWNLOADED", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final int DELETED = -1;
        public static final int DOWNLOADED = 3;
        public static final int DOWNLOADING = 2;
        public static final int NOT_DOWNLOAD = 0;
        public static final int WAIT_DOWNLOAD = 1;
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }
}
