package com.huami.ai.speech.xiaoai.capability.skill;

import com.huami.ai.helper.SpeechDevice;
import com.huami.ai.helper.VoiceConfigFuncKt;
import com.huami.ai.skill.PlayInfoSkill;
import com.huami.ai.speech.xiaoai.utils.PlayInfoExtKt;
import com.huami.ai.uitls.TrancateTextKt;
import com.huami.bluetooth.profile.channel.module.voice.VoiceConfig;
import com.huami.bluetooth.profile.channel.module.voice.command.TTSTextCommand;
import com.xiaomi.ai.api.Template;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/skill/NewBlePlayInfoSkillImpl;", "Lcom/huami/ai/skill/PlayInfoSkill;", "Lcom/xiaomi/ai/api/Template$PlayInfo;", "payload", "", "doPlayInfo", "Lcom/huami/ai/helper/SpeechDevice;", "a", "Lcom/huami/ai/helper/SpeechDevice;", "baseDevice", "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "b", "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "voiceConfig", "<init>", "(Lcom/huami/ai/helper/SpeechDevice;Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class NewBlePlayInfoSkillImpl implements PlayInfoSkill {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SpeechDevice baseDevice;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final VoiceConfig voiceConfig;

    public NewBlePlayInfoSkillImpl(@NotNull SpeechDevice speechDevice, @NotNull VoiceConfig voiceConfig) {
        this.baseDevice = speechDevice;
        this.voiceConfig = voiceConfig;
    }

    @Override // com.huami.ai.skill.PlayInfoSkill
    public boolean doPlayInfo(@NotNull Template.PlayInfo payload) {
        if (payload.getItems().isEmpty()) {
            return false;
        }
        return SpeechDevice.DefaultImpls.sendCommand$default(this.baseDevice, new TTSTextCommand(TrancateTextKt.truncateSpeechChatCharacters(PlayInfoExtKt.parseText(payload), VoiceConfigFuncKt.maxTTSTextSize(this.voiceConfig))), null, 2, null);
    }
}
