package com.xiaomi.fitness.sleep.behavior.collection.audio;

import com.xiaomi.fitness.sleep.behavior.BehaviorConfiguration;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tJ\b\u0010\u000b\u001a\u00020\tH\u0002J\u0006\u0010\u000f\u001a\u00020\tJ\u0006\u0010\u0010\u001a\u00020\tJ\u0006\u0010\u0011\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR$\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/collection/audio/AudioTaskEnvironment;", "", "<init>", "()V", "MODE_CANCEL_CLEAR", "", "MODE_CANCEL_SAVE_RESULT", "CANCEL_MODE", "prepare", "", "release", "reset", "isCancelClearMode", "", "()Z", "setCancelModeClearResult", "setCancelModeSaveResult", "setCancelModeDefault", "needGenerate", "isNeedGenerateReport", "setNeedGenerateReport", "(Z)V", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AudioTaskEnvironment {
    private static final int MODE_CANCEL_CLEAR = 1;
    private static final int MODE_CANCEL_SAVE_RESULT = 2;

    @NotNull
    public static final AudioTaskEnvironment INSTANCE = new AudioTaskEnvironment();
    private static int CANCEL_MODE = 1;

    private AudioTaskEnvironment() {
    }

    private final void reset() {
        setCancelModeDefault();
        BehaviorConfiguration.INSTANCE.setSnoreDetectionFinishTimeMills$sleep_trace_chinaProductRelease(0L);
        setNeedGenerateReport(true);
    }

    public final boolean isCancelClearMode() {
        return CANCEL_MODE == 1;
    }

    public final boolean isNeedGenerateReport() {
        return BehaviorConfiguration.INSTANCE.isSnoreNeedGenerateReport$sleep_trace_chinaProductRelease();
    }

    public final void prepare() {
        reset();
    }

    public final void release() {
        reset();
        BehaviorConfiguration.INSTANCE.resetSnoreIfNeed();
    }

    public final void setCancelModeClearResult() {
        CANCEL_MODE = 1;
    }

    public final void setCancelModeDefault() {
        setCancelModeSaveResult();
    }

    public final void setCancelModeSaveResult() {
        CANCEL_MODE = 2;
    }

    public final void setNeedGenerateReport(boolean z) {
        BehaviorConfiguration.INSTANCE.setSnoreNeedGenerateReport$sleep_trace_chinaProductRelease(z);
    }
}
