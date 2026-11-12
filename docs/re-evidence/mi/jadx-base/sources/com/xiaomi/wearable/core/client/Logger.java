package com.xiaomi.wearable.core.client;

import com.miui.tsmclient.util.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\u001a\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u001a\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\"\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u001a\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u001a\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\r"}, d2 = {"Lcom/xiaomi/wearable/core/client/Logger;", "", PluginDeviceInfo.FICONOFF, "", "tag", "", "msg", PluginDeviceInfo.FICONOFFLINE, "exception", "", "i", Constants.DEVICE_TYPE_WEAR, "Companion", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Logger {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/wearable/core/client/Logger$Companion;", "", "<init>", "()V", "TAG", "", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final String TAG = "MiWear";

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void d$default(Logger logger, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: d");
            }
            if ((i & 1) != 0) {
                str = "MiWear";
            }
            logger.d(str, str2);
        }

        public static /* synthetic */ void e$default(Logger logger, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: e");
            }
            if ((i & 1) != 0) {
                str = "MiWear";
            }
            logger.e(str, str2);
        }

        public static /* synthetic */ void i$default(Logger logger, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: i");
            }
            if ((i & 1) != 0) {
                str = "MiWear";
            }
            logger.i(str, str2);
        }

        public static /* synthetic */ void w$default(Logger logger, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: w");
            }
            if ((i & 1) != 0) {
                str = "MiWear";
            }
            logger.w(str, str2);
        }

        public static /* synthetic */ void e$default(Logger logger, String str, String str2, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: e");
            }
            if ((i & 1) != 0) {
                str = "MiWear";
            }
            logger.e(str, str2, th);
        }
    }

    void d(@NotNull String tag, @NotNull String msg);

    void e(@NotNull String tag, @NotNull String msg);

    void e(@NotNull String tag, @NotNull String msg, @NotNull Throwable exception);

    void i(@NotNull String tag, @NotNull String msg);

    void w(@NotNull String tag, @NotNull String msg);
}
