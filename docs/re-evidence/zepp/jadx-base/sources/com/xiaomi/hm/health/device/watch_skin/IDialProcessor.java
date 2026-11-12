package com.xiaomi.hm.health.device.watch_skin;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/device/watch_skin/IDialProcessor;", "", "", "originPath", "process", "", "originSize", "finalSize", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface IDialProcessor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/device/watch_skin/IDialProcessor$Companion;", "", "", "b", LogUtil.I, "getBG_TYPE_DEFAULT", "()I", "BG_TYPE_DEFAULT", "c", "getBG_TYPE_BMP_565", "BG_TYPE_BMP_565", GoogleApiAvailabilityLight.a, "getBG_TYPE_BMP_888", "BG_TYPE_BMP_888", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final int BG_TYPE_DEFAULT = 0;
        public static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private static final int BG_TYPE_BMP_565 = 1;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private static final int BG_TYPE_BMP_888 = 2;

        private Companion() {
        }

        public final int getBG_TYPE_BMP_565() {
            return BG_TYPE_BMP_565;
        }

        public final int getBG_TYPE_BMP_888() {
            return BG_TYPE_BMP_888;
        }

        public final int getBG_TYPE_DEFAULT() {
            return BG_TYPE_DEFAULT;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static long finalSize(@NotNull IDialProcessor iDialProcessor) {
            return 0L;
        }

        public static long originSize(@NotNull IDialProcessor iDialProcessor) {
            return 0L;
        }
    }

    long finalSize();

    long originSize();

    @NotNull
    String process(@NotNull String originPath);
}
