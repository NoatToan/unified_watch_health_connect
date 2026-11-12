package com.xiaomi.hm.health.play.process;

import com.xiaomi.hm.health.smalltool.model.ToolKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/play/process/PlayToolProcessFactory;", "", "", "toolKey", "Lcom/xiaomi/hm/health/play/process/IPlayToolsProcess;", "getPlayToolProcess", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class PlayToolProcessFactory {

    @NotNull
    public static final PlayToolProcessFactory INSTANCE = new PlayToolProcessFactory();

    private PlayToolProcessFactory() {
    }

    @Nullable
    public final IPlayToolsProcess getPlayToolProcess(@NotNull String toolKey) {
        if (Intrinsics.areEqual(toolKey, ToolKey.REMINDER)) {
            return new EventReminderProcess();
        }
        if (Intrinsics.areEqual(toolKey, ToolKey.CALL_ALERT)) {
            return new CallAlertProcess();
        }
        return null;
    }
}
