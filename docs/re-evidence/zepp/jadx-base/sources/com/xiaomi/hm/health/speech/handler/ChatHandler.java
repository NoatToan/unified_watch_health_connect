package com.xiaomi.hm.health.speech.handler;

import android.content.Context;
import com.xiaomi.ai.SpeechResult;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.speech.ChatContent;
import com.xiaomi.hm.health.bt.profile.speech.HMSpeechInfo;
import com.xiaomi.hm.health.bt.profile.speech.SpeechType;
import com.xiaomi.hm.health.speech.utils.ChatCharacterUtils;

/* JADX INFO: loaded from: classes21.dex */
public class ChatHandler extends BaseDomainHandler {
    private static final int e = 200;
    private HMSpeechInfo c;
    private ChatContent d;

    public ChatHandler(Context context) {
        super(context);
    }

    @Override // com.xiaomi.hm.health.speech.handler.BaseDomainHandler
    public void handleDomainEvent() {
        this.c = new HMSpeechInfo(getId(), SpeechType.CHAT, this.d);
    }

    @Override // com.xiaomi.hm.health.speech.handler.BaseDomainHandler
    public void pushInfoToDevice(HMMiLiProDevice hmMiLiProDevice) {
        hmMiLiProDevice.sendSpeechInfoSync(this.c);
    }

    @Override // com.xiaomi.hm.health.speech.handler.BaseDomainHandler
    public void resolveSpeechResult(SpeechResult speechResult) {
        ChatContent chatContent = new ChatContent();
        this.d = chatContent;
        chatContent.setQuery(speechResult.getQuery());
        this.d.setAnswer(ChatCharacterUtils.truncateSpeechChatCharacters(speechResult.getAnswerText(), 200));
    }
}
