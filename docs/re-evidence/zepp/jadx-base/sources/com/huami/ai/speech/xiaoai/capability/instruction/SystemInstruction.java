package com.huami.ai.speech.xiaoai.capability.instruction;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ai.notify.EngineExceptionNotify;
import com.huami.ai.notify.VoiceCaptureNotify;
import com.huami.ai.skill.Operation;
import com.huami.ai.skill.SystemSettingSkill;
import com.huami.ai.speech.xiaoai.auth.XiaoMiToken;
import com.huami.tools.log.HMLog;
import com.xiaomi.ai.android.capability.InstructionCapability;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.Sys;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.hm.health.Constant;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB'\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\u0014\u0010\u000e\u001a\u00020\u00042\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0016R\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/instruction/SystemInstruction;", "Lcom/xiaomi/ai/android/capability/InstructionCapability;", "Lcom/xiaomi/ai/api/Sys$SetProperty;", "setPropertyPayload", "", "c", "Lcom/xiaomi/ai/api/Sys$Exception;", "exceptionPayload", "a", "Lcom/xiaomi/ai/api/Sys$Power;", "powerPayload", "b", "Lcom/xiaomi/ai/api/common/Instruction;", "instruction", "process", "Lcom/huami/ai/skill/SystemSettingSkill;", "Lcom/huami/ai/skill/SystemSettingSkill;", "systemSettingSkill", "Lcom/huami/ai/notify/EngineExceptionNotify;", "Lcom/huami/ai/notify/EngineExceptionNotify;", "engineExceptionNotify", "Lcom/huami/ai/notify/VoiceCaptureNotify;", "Lcom/huami/ai/notify/VoiceCaptureNotify;", "voiceCaptureNotify", "Lcom/huami/ai/speech/xiaoai/auth/XiaoMiToken;", GoogleApiAvailabilityLight.a, "Lcom/huami/ai/speech/xiaoai/auth/XiaoMiToken;", "xiaoMiToken", "<init>", "(Lcom/huami/ai/skill/SystemSettingSkill;Lcom/huami/ai/notify/EngineExceptionNotify;Lcom/huami/ai/notify/VoiceCaptureNotify;Lcom/huami/ai/speech/xiaoai/auth/XiaoMiToken;)V", "Companion", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class SystemInstruction extends InstructionCapability {
    private static final int e = 102;
    private static final int f = 121;
    private static final int g = 40110018;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SystemSettingSkill systemSettingSkill;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final EngineExceptionNotify engineExceptionNotify;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final VoiceCaptureNotify voiceCaptureNotify;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final XiaoMiToken xiaoMiToken;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Sys.PowerOp.values().length];
            iArr[Sys.PowerOp.REBOOT.ordinal()] = 1;
            iArr[Sys.PowerOp.SHUTDOWN.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Sys.Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Sys.Exception exception) {
            super(0);
            this.a = exception;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "小爱System Exception.Code:" + this.a.getCode() + ",Msg:" + ((Object) this.a.getMessage());
        }
    }

    public SystemInstruction(@NotNull SystemSettingSkill systemSettingSkill, @NotNull EngineExceptionNotify engineExceptionNotify, @NotNull VoiceCaptureNotify voiceCaptureNotify, @NotNull XiaoMiToken xiaoMiToken) {
        this.systemSettingSkill = systemSettingSkill;
        this.engineExceptionNotify = engineExceptionNotify;
        this.voiceCaptureNotify = voiceCaptureNotify;
        this.xiaoMiToken = xiaoMiToken;
    }

    private final boolean a(Sys.Exception exceptionPayload) {
        int code = exceptionPayload.getCode();
        if (code == 102) {
            this.engineExceptionNotify.engineException(9);
            return true;
        }
        if (code == 121) {
            this.engineExceptionNotify.engineException(6);
            return true;
        }
        if (code != 40110018) {
            HMLog.error$default("speech", null, null, new a(exceptionPayload), 6, null);
            return false;
        }
        this.xiaoMiToken.clearInValidToken();
        this.engineExceptionNotify.engineException(18);
        return true;
    }

    private final boolean b(Sys.Power powerPayload) {
        Sys.PowerOp operation = powerPayload.getOperation();
        int i = operation == null ? -1 : WhenMappings.$EnumSwitchMapping$0[operation.ordinal()];
        if (i == 1) {
            return this.systemSettingSkill.reboot();
        }
        if (i != 2) {
            return false;
        }
        return this.systemSettingSkill.shutdown();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    private final boolean c(Sys.SetProperty setPropertyPayload) {
        Operation operation;
        String name = setPropertyPayload.getName();
        if (!Intrinsics.areEqual(name, "QUIET_MODE")) {
            if (Intrinsics.areEqual(name, "MUTE_MODE")) {
                return this.systemSettingSkill.phoneQuiet(Intrinsics.areEqual(setPropertyPayload.getValue(), Constant.ON));
            }
            return false;
        }
        String value = setPropertyPayload.getValue();
        if (value == null) {
            operation = Operation.NO_OPERATION;
        } else {
            int iHashCode = value.hashCode();
            if (iHashCode != -1836143820) {
                if (iHashCode != 2527) {
                    if (iHashCode == 78159 && value.equals(Constant.OFF)) {
                        operation = Operation.OFF;
                    } else {
                        operation = Operation.NO_OPERATION;
                    }
                } else if (value.equals(Constant.ON)) {
                    operation = Operation.ON;
                } else {
                    operation = Operation.NO_OPERATION;
                }
            } else if (value.equals("SWITCH")) {
                operation = Operation.SWITCH;
            } else {
                operation = Operation.NO_OPERATION;
            }
        }
        this.systemSettingSkill.quietMode(operation);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.xiaomi.ai.android.capability.InstructionCapability
    public boolean process(@NotNull Instruction<?> instruction) {
        String fullName = instruction.getFullName();
        if (fullName != null) {
            switch (fullName.hashCode()) {
                case -1836500200:
                    if (fullName.equals(AIApiConstants.System.SetProperty)) {
                        Object payload = instruction.getPayload();
                        Objects.requireNonNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Sys.SetProperty");
                        return c((Sys.SetProperty) payload);
                    }
                    break;
                case -1616270202:
                    if (fullName.equals(AIApiConstants.System.Power)) {
                        Object payload2 = instruction.getPayload();
                        Objects.requireNonNull(payload2, "null cannot be cast to non-null type com.xiaomi.ai.api.Sys.Power");
                        return b((Sys.Power) payload2);
                    }
                    break;
                case -788476173:
                    if (fullName.equals(AIApiConstants.System.TruncationNotification)) {
                        this.voiceCaptureNotify.stopCapture();
                        return true;
                    }
                    break;
                case 1214991184:
                    if (fullName.equals(AIApiConstants.System.Exception)) {
                        Object payload3 = instruction.getPayload();
                        Objects.requireNonNull(payload3, "null cannot be cast to non-null type com.xiaomi.ai.api.Sys.Exception");
                        return a((Sys.Exception) payload3);
                    }
                    break;
            }
        }
        return false;
    }
}
