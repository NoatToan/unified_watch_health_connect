package com.xiaomi.hm.health.speech.utils;

import android.content.Context;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.speech.handler.ErrorHandler;

/* JADX INFO: loaded from: classes21.dex */
public class SpeechErrorShowUtils {
    public static final int EMPTY_AUDIO_TYPE_VALUE = 1;
    public static final int NO_NETWORK_TYPE_VALUE = 0;
    public static final int OTHER_EXCEPTION_TYPE_VALUE = 2;
    public static final int SPEECH_ENGINE_NO_PERMISSION = 4;
    public static final int SPEECH_ENGINE_PRE_CONDITION_ILLEGAL = 3;

    public static void showError(Context context, HMMiLiProDevice hmMiLiProDevice, int type) {
        ErrorHandler errorHandler = new ErrorHandler(context);
        errorHandler.setErrorType(type);
        errorHandler.resolveSpeechResult(null);
        errorHandler.handleDomainEvent();
        errorHandler.pushInfoToDevice(hmMiLiProDevice);
    }
}
