package com.xiaomi.hm.health.speech.handler;

import android.content.Context;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.ai.SpeechResult;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.speech.ErrorContent;
import com.xiaomi.hm.health.bt.profile.speech.HMSpeechInfo;
import com.xiaomi.hm.health.bt.profile.speech.SpeechType;

/* JADX INFO: loaded from: classes21.dex */
public class SilentHandler extends BaseDomainHandler {
    private HMSpeechInfo c;
    private ErrorContent d;
    private String e;

    public SilentHandler(Context context) {
        super(context);
        this.e = context.getString(R.string.speech_nlp_silent_handler_answer);
    }

    @Override // com.xiaomi.hm.health.speech.handler.BaseDomainHandler
    public void handleDomainEvent() {
        this.c = new HMSpeechInfo(getId(), SpeechType.ERROR, this.d);
    }

    @Override // com.xiaomi.hm.health.speech.handler.BaseDomainHandler
    public void pushInfoToDevice(HMMiLiProDevice hmMiLiProDevice) {
        hmMiLiProDevice.sendSpeechInfoSync(this.c);
    }

    @Override // com.xiaomi.hm.health.speech.handler.BaseDomainHandler
    public void resolveSpeechResult(SpeechResult speechResult) {
        this.d = new ErrorContent((byte) -1, this.e);
    }
}
