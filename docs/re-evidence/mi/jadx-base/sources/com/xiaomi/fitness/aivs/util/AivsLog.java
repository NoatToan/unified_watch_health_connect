package com.xiaomi.fitness.aivs.util;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.WearableController;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\t\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\u001a\u0010\n\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\n\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\u001a\u0010\f\u001a\u00020\u00072\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u000f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/aivs/util/AivsLog;", "", "<init>", "()V", "sTag", "", "i", "", "msg", PluginDeviceInfo.FICONOFF, PluginDeviceInfo.FICONOFFLINE, "", "log", "instruction", "Lcom/xiaomi/ai/api/common/Instruction;", "fullName", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AivsLog {

    @NotNull
    public static final AivsLog INSTANCE = new AivsLog();

    @NotNull
    private static final String sTag = "AivsService";

    private AivsLog() {
    }

    public final void d(@Nullable String msg) {
        Logger.d("AivsService", msg);
    }

    public final void e(@Nullable String msg, @Nullable Throwable e) {
        Logger.e("AivsService", msg, e);
    }

    public final void i(@Nullable String msg) {
        Logger.i("AivsService", msg);
    }

    public final void log(@NotNull Instruction<?> instruction, @NotNull String fullName) {
        Intrinsics.checkNotNullParameter(instruction, "instruction");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        if (Intrinsics.areEqual(fullName, AIApiConstants.WearableController.Switch)) {
            Object payload = instruction.getPayload();
            Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.WearableController.Switch");
            WearableController.Switch r3 = (WearableController.Switch) payload;
            if (r3.getOperation() == WearableController.OperationType.START) {
                Logger.i("AivsService", "WearableController.Switch mode:" + r3.getMode() + " start");
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual(fullName, AIApiConstants.WearableController.SetProperty)) {
            Logger.d("AivsService", "process Instruction:" + fullName);
            return;
        }
        Object payload2 = instruction.getPayload();
        Intrinsics.checkNotNull(payload2, "null cannot be cast to non-null type com.xiaomi.ai.api.WearableController.SetProperty");
        WearableController.SetProperty setProperty = (WearableController.SetProperty) payload2;
        Logger.i("AivsService", "WearableController.SetProperty propertyName:" + ((setProperty.getProperties() == null || setProperty.getProperties().size() <= 0) ? null : setProperty.getProperties().get(0).getName()));
    }

    public final void e(@Nullable String msg) {
        Logger.e("AivsService", msg);
    }
}
