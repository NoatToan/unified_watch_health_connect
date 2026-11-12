package com.xiaomi.hm.health.speech.handler;

import android.content.Context;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.ai.SpeechResult;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.speech.ErrorContent;
import com.xiaomi.hm.health.bt.profile.speech.HMSpeechInfo;
import com.xiaomi.hm.health.bt.profile.speech.SpeechType;
import com.xiaomi.hm.health.speech.constant.SpeechError;

/* JADX INFO: loaded from: classes21.dex */
public class ErrorHandler extends BaseDomainHandler {
    private HMSpeechInfo c;
    private ErrorContent d;
    private SpeechError e;
    private String f;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SpeechError.values().length];
            a = iArr;
            try {
                iArr[SpeechError.NO_NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[SpeechError.EMPTY_AUDIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[SpeechError.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[SpeechError.SPEECH_ENGINE_PRE_CONDITION_ILLEGAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[SpeechError.SPEECH_ENGINE_NO_PERMISSION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public ErrorHandler(Context context) {
        super(context);
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
        SpeechError speechErrorBySpeechErrorTypeIntValue = SpeechError.getSpeechErrorBySpeechErrorTypeIntValue(this.errorType);
        this.e = speechErrorBySpeechErrorTypeIntValue;
        int i = a.a[speechErrorBySpeechErrorTypeIntValue.ordinal()];
        if (i == 1) {
            this.f = this.context.getString(R.string.speech_error_type_no_network_connection);
        } else if (i == 2) {
            this.f = this.context.getString(R.string.speech_error_type_audio_empty);
        } else if (i == 3) {
            this.f = this.context.getString(R.string.speech_error_type_other);
        } else if (i == 4) {
            this.f = this.context.getString(R.string.speech_error_type_speech_engine_pre_condition_illegal);
        } else if (i != 5) {
            this.f = "";
        } else {
            this.f = this.context.getString(R.string.speech_nlp_miot_hanlder_unauthorized_answer);
        }
        this.d = new ErrorContent((byte) -1, this.f);
    }
}
