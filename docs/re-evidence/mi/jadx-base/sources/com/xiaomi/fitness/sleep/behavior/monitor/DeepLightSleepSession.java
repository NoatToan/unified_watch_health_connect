package com.xiaomi.fitness.sleep.behavior.monitor;

import android.content.Context;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.sleep.behavior.monitor.DeepLightSleepSession;
import java.io.File;
import java.io.PrintWriter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/monitor/DeepLightSleepSession;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mRecordFile", "Ljava/io/File;", "mSessionLock", "openSession", "", "isOpened", "", "()Z", "recordState", "state", "", "closeSession", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeepLightSleepSession {

    @NotNull
    public static final String DEEP_LIGHT_DETECTION_CANCEL = "deep_light_sleep_cancel";

    @NotNull
    public static final String DEEP_LIGHT_DETECTION_FINISH = "deep_light_sleep_finish";

    @NotNull
    public static final String DEEP_LIGHT_DETECTION_START = "deep_light_sleep_start";

    @NotNull
    private static final String FILENAME = "dls.log";

    @NotNull
    private static final String SESSION_DIR = "dls_session";

    @NotNull
    private final File mRecordFile;

    @NotNull
    private final Object mSessionLock;

    public DeepLightSleepSession(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.mRecordFile = FileUtils.INSTANCE.getFileInFilesPath(context, SESSION_DIR, FILENAME);
        this.mSessionLock = new Object();
    }

    private final boolean isOpened() {
        return this.mRecordFile.exists();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void recordState$lambda$1(DeepLightSleepSession this$0, String state) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(state, "$state");
        PrintWriter printWriterCreatePrinter = FileUtils.INSTANCE.createPrinter(this$0.mRecordFile);
        printWriterCreatePrinter.println(state);
        printWriterCreatePrinter.close();
    }

    public final void closeSession(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.mRecordFile.delete()) {
            DeepLightSleepMonitorWorker.INSTANCE.cancelSleepDetectionMonitorWorker(context);
        }
    }

    public final void openSession(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (this.mSessionLock) {
            try {
                if (!isOpened()) {
                    FileUtils.INSTANCE.createFileWithDirs(this.mRecordFile);
                    DeepLightSleepMonitorWorker.INSTANCE.startSleepDetectionMonitorWorker(context, this.mRecordFile.getAbsolutePath());
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void recordState(@NotNull final String state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (isOpened()) {
            ExecutorHelper.runInWorker(new Runnable() { // from class: ys5
                @Override // java.lang.Runnable
                public final void run() {
                    DeepLightSleepSession.recordState$lambda$1(this.f40483a, state);
                }
            });
        }
    }
}
