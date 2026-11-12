package com.huami.ai.speech.xiaoai.capability.instruction;

import com.huami.ai.skill.CardType;
import com.huami.ai.skill.NFCSkill;
import com.xiaomi.ai.android.capability.InstructionCapability;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.NFC;
import com.xiaomi.ai.api.common.Instruction;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\b\u001a\u00020\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/instruction/NFCInstruction;", "Lcom/xiaomi/ai/android/capability/InstructionCapability;", "Lcom/xiaomi/ai/api/NFC$TurnOn;", "payload", "", "a", "Lcom/xiaomi/ai/api/common/Instruction;", "instruction", "process", "Lcom/huami/ai/skill/NFCSkill;", "Lcom/huami/ai/skill/NFCSkill;", "nfcSkill", "<init>", "(Lcom/huami/ai/skill/NFCSkill;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class NFCInstruction extends InstructionCapability {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final NFCSkill nfcSkill;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NFC.CardType.values().length];
            iArr[NFC.CardType.DEFAULT.ordinal()] = 1;
            iArr[NFC.CardType.BANK.ordinal()] = 2;
            iArr[NFC.CardType.TRAFFIC.ordinal()] = 3;
            iArr[NFC.CardType.ACCESS.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NFCInstruction(@NotNull NFCSkill nFCSkill) {
        this.nfcSkill = nFCSkill;
    }

    private final boolean a(NFC.TurnOn payload) {
        CardType cardType;
        NFC.CardType card = payload.getCard();
        int i = card == null ? -1 : WhenMappings.$EnumSwitchMapping$0[card.ordinal()];
        if (i == 1) {
            cardType = CardType.CARD_DEFAULT;
        } else if (i == 2) {
            cardType = CardType.CARD_BANK;
        } else if (i != 3) {
            cardType = i != 4 ? null : CardType.CARD_ACCESS;
        } else {
            cardType = CardType.CARD_TRAFFIC;
        }
        if (cardType == null) {
            return false;
        }
        return this.nfcSkill.openCard(cardType);
    }

    @Override // com.xiaomi.ai.android.capability.InstructionCapability
    public boolean process(@NotNull Instruction<?> instruction) {
        if (!Intrinsics.areEqual(instruction.getFullName(), AIApiConstants.NFC.TurnOn)) {
            return false;
        }
        Object payload = instruction.getPayload();
        Objects.requireNonNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.NFC.TurnOn");
        return a((NFC.TurnOn) payload);
    }
}
