package com.huami.ai.speech.xiaoai.capability.instruction;

import com.huami.ai.entity.audioplay.AudioData;
import com.huami.ai.entity.audioplay.AudioItem;
import com.huami.ai.entity.audioplay.PlayBehavior;
import com.huami.ai.skill.AudioPlaySkill;
import com.xiaomi.ai.android.capability.InstructionCapability;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.AudioPlayer;
import com.xiaomi.ai.api.common.Instruction;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0016\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\nH\u0016R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/instruction/AudioPlayerInstruction;", "Lcom/xiaomi/ai/android/capability/InstructionCapability;", "Lcom/xiaomi/ai/api/AudioPlayer$Play;", "payload", "", "a", "Lcom/xiaomi/ai/api/AudioPlayer$PlayBehavior;", "playBehavior", "Lcom/huami/ai/entity/audioplay/PlayBehavior;", "b", "Lcom/xiaomi/ai/api/common/Instruction;", "instruction", "process", "Lcom/huami/ai/skill/AudioPlaySkill;", "Lcom/huami/ai/skill/AudioPlaySkill;", "audioPlaySkill", "<init>", "(Lcom/huami/ai/skill/AudioPlaySkill;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class AudioPlayerInstruction extends InstructionCapability {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final AudioPlaySkill audioPlaySkill;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AudioPlayer.PlayBehavior.values().length];
            iArr[AudioPlayer.PlayBehavior.UNKNOWN.ordinal()] = 1;
            iArr[AudioPlayer.PlayBehavior.REPLACE_ALL.ordinal()] = 2;
            iArr[AudioPlayer.PlayBehavior.APPEND.ordinal()] = 3;
            iArr[AudioPlayer.PlayBehavior.REPLACE_PENDING.ordinal()] = 4;
            iArr[AudioPlayer.PlayBehavior.INSERT_FRONT.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AudioPlayerInstruction(@Nullable AudioPlaySkill audioPlaySkill) {
        this.audioPlaySkill = audioPlaySkill;
    }

    private final boolean a(AudioPlayer.Play payload) {
        AudioPlaySkill audioPlaySkill = this.audioPlaySkill;
        if (audioPlaySkill == null) {
            return false;
        }
        PlayBehavior playBehaviorB = b(payload.getPlayBehavior());
        List<AudioPlayer.AudioItemV1> audioItems = payload.getAudioItems();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(audioItems, 10));
        for (AudioPlayer.AudioItemV1 audioItemV1 : audioItems) {
            arrayList.add(new AudioItem(audioItemV1.getItemId().getAudioId(), audioItemV1.getStream().getUrl(), null, 4, null));
        }
        audioPlaySkill.playAudio(new AudioData(playBehaviorB, arrayList));
        return true;
    }

    private final PlayBehavior b(AudioPlayer.PlayBehavior playBehavior) {
        int i = WhenMappings.$EnumSwitchMapping$0[playBehavior.ordinal()];
        if (i == 1 || i == 2) {
            return PlayBehavior.REPLACE_ALL;
        }
        if (i == 3) {
            return PlayBehavior.APPEND;
        }
        if (i == 4) {
            return PlayBehavior.REPLACE_APPENDING;
        }
        if (i == 5) {
            return PlayBehavior.INSERT_FRONT;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.xiaomi.ai.android.capability.InstructionCapability
    public boolean process(@Nullable Instruction<?> instruction) {
        if (!Intrinsics.areEqual(instruction == null ? null : instruction.getFullName(), AIApiConstants.AudioPlayer.Play)) {
            return false;
        }
        Object payload = instruction.getPayload();
        Objects.requireNonNull(payload, "null cannot be cast to non-null type com.xiaomi.ai.api.AudioPlayer.Play");
        return a((AudioPlayer.Play) payload);
    }
}
