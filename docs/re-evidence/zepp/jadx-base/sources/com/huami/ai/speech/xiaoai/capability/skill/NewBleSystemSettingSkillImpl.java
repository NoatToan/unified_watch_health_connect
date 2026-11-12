package com.huami.ai.speech.xiaoai.capability.skill;

import com.huami.ai.helper.SpeechDevice;
import com.huami.ai.skill.Operation;
import com.huami.ai.skill.SystemSettingSkill;
import com.huami.bluetooth.profile.channel.module.voice.command.NLPCommand;
import com.huami.bluetooth.profile.channel.module.voice.content.OpenAppContent;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/skill/NewBleSystemSettingSkillImpl;", "Lcom/huami/ai/skill/SystemSettingSkill;", "Lcom/huami/ai/skill/Operation;", "quietMode", "", "shutdown", "reboot", "quiet", "phoneQuiet", "Lcom/huami/ai/helper/SpeechDevice;", "a", "Lcom/huami/ai/helper/SpeechDevice;", "baseDevice", "<init>", "(Lcom/huami/ai/helper/SpeechDevice;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class NewBleSystemSettingSkillImpl implements SystemSettingSkill {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SpeechDevice baseDevice;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Operation.values().length];
            iArr[Operation.ON.ordinal()] = 1;
            iArr[Operation.OFF.ordinal()] = 2;
            iArr[Operation.SWITCH.ordinal()] = 3;
            iArr[Operation.NO_OPERATION.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "发送了控制手机静音的指令(是否静音：" + this.a + ')';
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Operation a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Operation operation) {
            super(0);
            this.a = operation;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("发送了手环勿扰的指令（参数：", this.a.name());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "发送了重启的指令";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "发送了关机的指令";
        }
    }

    public NewBleSystemSettingSkillImpl(@NotNull SpeechDevice speechDevice) {
        this.baseDevice = speechDevice;
    }

    @Override // com.huami.ai.skill.SystemSettingSkill
    public boolean phoneQuiet(boolean quiet) {
        boolean zSendCommand$default = SpeechDevice.DefaultImpls.sendCommand$default(this.baseDevice, new NLPCommand(new OpenAppContent(13, new OpenAppContent.PhoneMuteParameter(quiet ? 1 : 2))), null, 2, null);
        HMLog.info("speech", new a(quiet));
        return zSendCommand$default;
    }

    @Override // com.huami.ai.skill.SystemSettingSkill
    public boolean quietMode(@NotNull Operation quietMode) {
        int i = WhenMappings.$EnumSwitchMapping$0[quietMode.ordinal()];
        int i2 = 0;
        if (i == 1) {
            i2 = 1;
        } else if (i == 2) {
            i2 = 2;
        } else if (i != 3 && i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        boolean zSendCommand$default = SpeechDevice.DefaultImpls.sendCommand$default(this.baseDevice, new NLPCommand(new OpenAppContent(7, new OpenAppContent.DNDParameter(i2))), null, 2, null);
        HMLog.info("speech", new b(quietMode));
        return zSendCommand$default;
    }

    @Override // com.huami.ai.skill.SystemSettingSkill
    public boolean reboot() {
        boolean zSendCommand$default = SpeechDevice.DefaultImpls.sendCommand$default(this.baseDevice, new NLPCommand(new OpenAppContent(45, null, 2, null)), null, 2, null);
        HMLog.info("speech", c.a);
        return zSendCommand$default;
    }

    @Override // com.huami.ai.skill.SystemSettingSkill
    public boolean shutdown() {
        boolean zSendCommand$default = SpeechDevice.DefaultImpls.sendCommand$default(this.baseDevice, new NLPCommand(new OpenAppContent(47, null, 2, null)), null, 2, null);
        HMLog.info("speech", d.a);
        return zSendCommand$default;
    }
}
