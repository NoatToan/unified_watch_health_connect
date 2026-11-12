package io.sentry.android.replay;

import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.io.Closeable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lio/sentry/android/replay/Recorder;", "Ljava/io/Closeable;", "pause", "", "resume", StatConstants.PARAM_START, "recorderConfig", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", BroadcastsKt.SILENT_PUSHING_STOP, "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Recorder extends Closeable {
    void pause();

    void resume();

    void start(@NotNull ScreenshotRecorderConfig recorderConfig);

    void stop();
}
