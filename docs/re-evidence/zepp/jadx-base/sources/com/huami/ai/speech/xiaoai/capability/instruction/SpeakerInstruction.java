package com.huami.ai.speech.xiaoai.capability.instruction;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ai.helper.DeviceVoiceType;
import com.huami.ai.helper.UnitType;
import com.huami.ai.skill.VolumeControlSkill;
import com.huami.tools.log.HMLog;
import com.xiaomi.ai.android.capability.InstructionCapability;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.Speaker;
import com.xiaomi.ai.api.common.Instruction;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0014\u0010\u0014\u001a\u00020\u00042\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0016R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/instruction/SpeakerInstruction;", "Lcom/xiaomi/ai/android/capability/InstructionCapability;", "Lcom/xiaomi/ai/api/Speaker$SetVolume;", "payload", "", "c", "Lcom/xiaomi/ai/api/Speaker$AdjustVolume;", "a", "Lcom/xiaomi/ai/api/Speaker$SetMute;", "b", "Lcom/xiaomi/ai/api/Speaker$VolumeType;", "volumeType", "Lcom/huami/ai/helper/DeviceVoiceType;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/ai/api/Speaker$UnitDef;", "unit", "Lcom/huami/ai/helper/UnitType;", "e", "Lcom/xiaomi/ai/api/common/Instruction;", "instruction", "process", "Lcom/huami/ai/skill/VolumeControlSkill;", "Lcom/huami/ai/skill/VolumeControlSkill;", "volumeControlSkill", "<init>", "(Lcom/huami/ai/skill/VolumeControlSkill;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class SpeakerInstruction extends InstructionCapability {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final VolumeControlSkill volumeControlSkill;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Speaker.VolumeType.values().length];
            iArr[Speaker.VolumeType.MEDIA.ordinal()] = 1;
            iArr[Speaker.VolumeType.RING.ordinal()] = 2;
            iArr[Speaker.VolumeType.NOTIFICATION.ordinal()] = 3;
            iArr[Speaker.VolumeType.ALARM.ordinal()] = 4;
            iArr[Speaker.VolumeType.XIAOAI_VOICE_ASSISTANT.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Speaker.UnitDef.values().length];
            iArr2[Speaker.UnitDef.PERCENT.ordinal()] = 1;
            iArr2[Speaker.UnitDef.ABSOLUTE.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("set Volume fail:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Speaker.SetMute a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Speaker.SetMute setMute) {
            super(0);
            this.a = setMute;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("set mute:", Boolean.valueOf(this.a.isMute()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("set Volume fail:", this.a);
        }
    }

    public SpeakerInstruction(@NotNull VolumeControlSkill volumeControlSkill) {
        this.volumeControlSkill = volumeControlSkill;
    }

    private final boolean a(Speaker.AdjustVolume payload) {
        try {
            Result.Companion companion = Result.Companion;
            return this.volumeControlSkill.adjustVolume(d(payload.getType()), payload.getVolumeDelta(), e(payload.getUnit()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(Result.m3845constructorimpl(ResultKt.createFailure(th)));
            if (thM3848exceptionOrNullimpl == null) {
                return false;
            }
            HMLog.info("speech", new a(thM3848exceptionOrNullimpl));
            return false;
        }
    }

    private final boolean b(Speaker.SetMute payload) {
        HMLog.info("speech", new b(payload));
        return this.volumeControlSkill.mute(payload.isMute());
    }

    private final boolean c(Speaker.SetVolume payload) {
        try {
            Result.Companion companion = Result.Companion;
            return this.volumeControlSkill.setVolume(d(payload.getType()), payload.getVolume(), e(payload.getUnit()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(Result.m3845constructorimpl(ResultKt.createFailure(th)));
            if (thM3848exceptionOrNullimpl == null) {
                return false;
            }
            HMLog.info("speech", new c(thM3848exceptionOrNullimpl));
            return false;
        }
    }

    private final DeviceVoiceType d(Speaker.VolumeType volumeType) {
        int i = WhenMappings.$EnumSwitchMapping$0[volumeType.ordinal()];
        if (i == 1) {
            return DeviceVoiceType.MEDIA;
        }
        if (i == 2) {
            return DeviceVoiceType.RING;
        }
        if (i == 3) {
            return DeviceVoiceType.NOTIFICATION;
        }
        if (i != 4) {
            return i != 5 ? DeviceVoiceType.UNKNOW : DeviceVoiceType.XIAOAI_VOICE_ASSISTANT;
        }
        return DeviceVoiceType.ALARM;
    }

    private final UnitType e(Speaker.UnitDef unit) {
        int i = WhenMappings.$EnumSwitchMapping$1[unit.ordinal()];
        if (i == 1) {
            return UnitType.PERCENT;
        }
        if (i == 2) {
            return UnitType.ABSOLUTE;
        }
        throw new IllegalArgumentException("unSupport type");
    }

    @Override // com.xiaomi.ai.android.capability.InstructionCapability
    public boolean process(@NotNull Instruction<?> instruction) {
        String fullName = instruction.getFullName();
        if (fullName != null) {
            int iHashCode = fullName.hashCode();
            if (iHashCode != -1603244712) {
                if (iHashCode != 506647148) {
                    if (iHashCode == 1808506541 && fullName.equals(AIApiConstants.Speaker.SetVolume)) {
                        Object payload = instruction.getPayload();
                        Objects.requireNonNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.Speaker.SetVolume");
                        c((Speaker.SetVolume) payload);
                        return true;
                    }
                } else if (fullName.equals(AIApiConstants.Speaker.SetMute)) {
                    Object payload2 = instruction.getPayload();
                    Objects.requireNonNull(payload2, "null cannot be cast to non-null type com.xiaomi.ai.api.Speaker.SetMute");
                    b((Speaker.SetMute) payload2);
                    return true;
                }
            } else if (fullName.equals(AIApiConstants.Speaker.AdjustVolume)) {
                Object payload3 = instruction.getPayload();
                Objects.requireNonNull(payload3, "null cannot be cast to non-null type com.xiaomi.ai.api.Speaker.AdjustVolume");
                a((Speaker.AdjustVolume) payload3);
                return true;
            }
        }
        return false;
    }
}
