package com.xiaomi.hm.health.speech.handler;

import android.content.Context;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.ai.SpeechResult;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.speech.HMSpeechInfo;
import com.xiaomi.hm.health.bt.profile.speech.MIOTContent;
import com.xiaomi.hm.health.bt.profile.speech.SpeechType;
import com.xiaomi.hm.health.speech.entity.SmartMiotSkill;
import com.xiaomi.hm.health.speech.utils.JsonParseUtils;

/* JADX INFO: loaded from: classes21.dex */
public class SmartMiotHandler extends BaseDomainHandler {
    private static final int k = 200;
    private SmartMiotSkill c;
    private HMSpeechInfo d;
    private MIOTContent e;
    private String f;
    private String g;
    private SilentHandler h;
    private String i;
    private String j;

    public SmartMiotHandler(Context context) {
        super(context);
        this.i = context.getString(R.string.speech_nlp_miot_hanlder_unauthorized_answer);
        this.j = context.getString(R.string.speech_nlp_miot_handler_no_smart_device_answer);
    }

    @Override // com.xiaomi.hm.health.speech.handler.BaseDomainHandler
    public void handleDomainEvent() {
        if (this.c == null) {
            this.h.handleDomainEvent();
        } else {
            this.e.setContent(this.g);
            this.d = new HMSpeechInfo(getId(), SpeechType.MIOT, this.e);
        }
    }

    @Override // com.xiaomi.hm.health.speech.handler.BaseDomainHandler
    public void pushInfoToDevice(HMMiLiProDevice hmMiLiProDevice) {
        if (this.c == null) {
            this.h.pushInfoToDevice(hmMiLiProDevice);
        } else {
            hmMiLiProDevice.sendSpeechInfoSync(this.d);
        }
    }

    @Override // com.xiaomi.hm.health.speech.handler.BaseDomainHandler
    public void resolveSpeechResult(SpeechResult speechResult) {
        SmartMiotSkill responseContentJsonStrToSmartMiotSkill = JsonParseUtils.parseResponseContentJsonStrToSmartMiotSkill(speechResult.getResponse());
        this.c = responseContentJsonStrToSmartMiotSkill;
        if (responseContentJsonStrToSmartMiotSkill == null) {
            SilentHandler silentHandler = new SilentHandler(this.context);
            this.h = silentHandler;
            silentHandler.resolveSpeechResult(speechResult);
        } else {
            if (responseContentJsonStrToSmartMiotSkill.getStatusExtend().getCode() == 200) {
                this.e = new MIOTContent((byte) 3);
            } else {
                this.e = new MIOTContent((byte) 4);
            }
            this.g = this.c.getSmartMiotAnswerArr().get(0).getText();
        }
    }
}
