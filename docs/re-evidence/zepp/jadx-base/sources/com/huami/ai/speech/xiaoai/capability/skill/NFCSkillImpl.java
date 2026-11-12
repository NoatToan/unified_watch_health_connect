package com.huami.ai.speech.xiaoai.capability.skill;

import com.huami.ai.helper.SpeechDevice;
import com.huami.ai.skill.CardType;
import com.huami.ai.skill.NFCSkill;
import com.huami.bluetooth.profile.channel.module.voice.command.NLPCommand;
import com.huami.bluetooth.profile.channel.module.voice.content.OpenAppContent;
import com.huami.tools.log.HMLog;
import com.unionpay.tsmservice.data.Constant;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/skill/NFCSkillImpl;", "Lcom/huami/ai/skill/NFCSkill;", "Lcom/huami/ai/skill/CardType;", Constant.KEY_CARD_TYPE, "", "openCard", "Lcom/huami/ai/helper/SpeechDevice;", "a", "Lcom/huami/ai/helper/SpeechDevice;", "baseDevice", "<init>", "(Lcom/huami/ai/helper/SpeechDevice;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class NFCSkillImpl implements NFCSkill {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SpeechDevice baseDevice;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardType.values().length];
            iArr[CardType.CARD_DEFAULT.ordinal()] = 1;
            iArr[CardType.CARD_BANK.ordinal()] = 2;
            iArr[CardType.CARD_TRAFFIC.ordinal()] = 3;
            iArr[CardType.CARD_ACCESS.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ CardType a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CardType cardType) {
            super(0);
            this.a = cardType;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "发送了打卡NFC卡包的指令（参数：" + this.a.name() + '.';
        }
    }

    public NFCSkillImpl(@NotNull SpeechDevice speechDevice) {
        this.baseDevice = speechDevice;
    }

    @Override // com.huami.ai.skill.NFCSkill
    public boolean openCard(@NotNull CardType cardType) {
        int i = WhenMappings.$EnumSwitchMapping$0[cardType.ordinal()];
        int i2 = 3;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            if (i == 3) {
                i2 = 2;
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 1;
            }
        }
        boolean zSendCommand$default = SpeechDevice.DefaultImpls.sendCommand$default(this.baseDevice, new NLPCommand(new OpenAppContent(1, new OpenAppContent.NFCCardParameter(i2))), null, 2, null);
        HMLog.info("speech", new a(cardType));
        return zSendCommand$default;
    }
}
