package com.xiaomi.hm.health.speech.handler;

import android.content.Context;
import android.text.TextUtils;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.ai.SpeechResult;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.speech.ErrorContent;
import com.xiaomi.hm.health.bt.profile.speech.HMSpeechInfo;
import com.xiaomi.hm.health.bt.profile.speech.SpeechType;

/* JADX INFO: loaded from: classes21.dex */
public class DefaultDeviceSkillHandler extends BaseDomainHandler {
    private String c;
    private String d;
    private HMSpeechInfo e;
    private ErrorContent f;
    private String g;
    private String h;

    public DefaultDeviceSkillHandler(Context context) {
        super(context);
        this.c = "";
    }

    @Override // com.xiaomi.hm.health.speech.handler.BaseDomainHandler
    public void handleDomainEvent() {
        this.f = new ErrorContent((byte) -1, this.h);
        this.e = new HMSpeechInfo(getId(), SpeechType.ERROR, this.f);
    }

    @Override // com.xiaomi.hm.health.speech.handler.BaseDomainHandler
    public void pushInfoToDevice(HMMiLiProDevice hmMiLiProDevice) {
        hmMiLiProDevice.sendSpeechInfoSync(this.e);
    }

    @Override // com.xiaomi.hm.health.speech.handler.BaseDomainHandler
    public void resolveSpeechResult(SpeechResult speechResult) {
        this.d = this.context.getString(R.string.speech_nlp_default_handler_fall_back_answer);
        this.g = TextUtils.isEmpty(speechResult.getQuery()) ? this.c : speechResult.getQuery();
        this.h = TextUtils.isEmpty(speechResult.getAnswer()) ? this.d : speechResult.getAnswer();
    }
}
