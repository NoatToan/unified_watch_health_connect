package com.xiaomi.ai.mibrain;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes18.dex */
class MibrainNativeRequest {
    public static int MIBRAINSDK_CMD_ASR_NLP = 0;
    public static int MIBRAINSDK_CMD_ASR_NLP_TTS = 2;
    public static int MIBRAINSDK_CMD_EVENT = 10;
    public static int MIBRAINSDK_CMD_EVENT_TTS = 11;
    public static int MIBRAINSDK_CMD_NLP = 4;
    public static int MIBRAINSDK_CMD_NLP_TTS = 5;
    public static int MIBRAINSDK_CMD_TTS = 3;
    public static int MIBRAINSDK_CMD_VOR = 7;
    public static int MIBRAINSDK_CMD_VOR_DEL = 8;
    public static int MIBRAINSDK_CMD_VOR_QUERY = 9;
    public static int MIBRAINSDK_CMD_VOR_REG = 6;
    public static int MIBRAINSDK_RESULT_TYPE_BINARY_TTS = 121;
    public static int MIBRAINSDK_RESULT_TYPE_TXT_ASR = 11;
    public static int MIBRAINSDK_RESULT_TYPE_TXT_ASR_FINAL = 12;
    public static int MIBRAINSDK_RESULT_TYPE_TXT_FLAG_ERROR = 72;
    public static int MIBRAINSDK_RESULT_TYPE_TXT_FLAG_OTHER = 62;
    public static int MIBRAINSDK_RESULT_TYPE_TXT_FLAG_SESSION_BEGIN = 41;
    public static int MIBRAINSDK_RESULT_TYPE_TXT_FLAG_SESSION_END = 42;
    public static int MIBRAINSDK_RESULT_TYPE_TXT_FLAG_SESSION_TTS_BEGIN = 51;
    public static int MIBRAINSDK_RESULT_TYPE_TXT_FLAG_SESSION_TTS_END = 52;
    public static int MIBRAINSDK_RESULT_TYPE_TXT_INSTRUCTION = 86;
    public static int MIBRAINSDK_RESULT_TYPE_TXT_NLP = 31;
    public static int MIBRAINSDK_RESULT_TYPE_TXT_RESULT_VOR_DEL = 84;
    public static int MIBRAINSDK_RESULT_TYPE_TXT_RESULT_VOR_QUERY = 85;
    public static int MIBRAINSDK_RESULT_TYPE_TXT_RESULT_VOR_REC = 92;
    public static int MIBRAINSDK_RESULT_TYPE_TXT_RESULT_VOR_REG_FINAL = 82;
    public static int MIBRAINSDK_RESULT_TYPE_TXT_RESULT_VOR_REG_PARTIAL = 83;
    public static int MIBRAINSDK_RESULT_TYPE_TXT_TTS = 122;
    public static int MIRBAINSDK_CMD_ASR = 1;
    public static int MI_STOP_FLAG_ASYNC_STOP = 2;
    public static int MI_STOP_FLAG_SYNC_STOP = 1;
    public static int MI_STOP_FLAG_WAIT_RESULT;
    public static Mibrainsdk.MibrainsdkLogHook slogHook;
    private MibrainRequestListener mMibrainRequestListener;
    private MibrainRequest mibrainRequest;

    static {
        Mibrainsdk.loadMibrainLibs();
    }

    public MibrainNativeRequest(MibrainRequestListener mibrainRequestListener, MibrainRequest mibrainRequest) {
        this.mMibrainRequestListener = mibrainRequestListener;
        this.mibrainRequest = mibrainRequest;
    }

    public static native String getResourceDetails(String str, String str2, String str3, int i);

    private String needUpdateToken() {
        return this.mMibrainRequestListener.onNeedUpdateToken();
    }

    private void onEnd() {
        this.mMibrainRequestListener.onRequestSessionEnd(this.mibrainRequest);
    }

    private void onError(int i, byte[] bArr) {
        MibrainRequestListener mibrainRequestListener = this.mMibrainRequestListener;
        try {
            mibrainRequestListener.onRequestError(this.mibrainRequest, new String(bArr, "UTF-8"), 2, i);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            mibrainRequestListener.onRequestError(this.mibrainRequest, "onError UnsupportedEncodingException", 2, -11);
        }
    }

    private void onEventTrack(String str) {
        this.mMibrainRequestListener.onEventTrack(str);
    }

    private String onGetToken(int i) {
        return this.mMibrainRequestListener.onRequestGetToken(this.mibrainRequest, i != 0);
    }

    private static void onLogHook(int i, byte[] bArr) {
        Mibrainsdk.MibrainsdkLogHook mibrainsdkLogHook = slogHook;
        if (mibrainsdkLogHook != null) {
            try {
                mibrainsdkLogHook.onLog(i, new String(bArr, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                slogHook.onLog(i, "log UnsupportedEncodingException ");
            }
        }
    }

    private void onResults(byte[] bArr, boolean z, int i) {
        MibrainRequestListener mibrainRequestListener = this.mMibrainRequestListener;
        if (i == MIBRAINSDK_RESULT_TYPE_TXT_ASR) {
            try {
                mibrainRequestListener.onRequestASRResult(this.mibrainRequest, new String(bArr, "UTF-8"), false);
                return;
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                mibrainRequestListener.onRequestError(this.mibrainRequest, "data UnsupportedEncodingException", 2, -11);
                return;
            }
        }
        if (i == MIBRAINSDK_RESULT_TYPE_TXT_ASR_FINAL) {
            try {
                mibrainRequestListener.onRequestASRResult(this.mibrainRequest, new String(bArr, "UTF-8"), true);
                return;
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
                mibrainRequestListener.onRequestError(this.mibrainRequest, "data UnsupportedEncodingException", 2, -11);
                return;
            }
        }
        if (i == MIBRAINSDK_RESULT_TYPE_TXT_NLP) {
            try {
                mibrainRequestListener.onRequestNLpResult(this.mibrainRequest, new String(bArr, "UTF-8"));
                return;
            } catch (UnsupportedEncodingException e3) {
                e3.printStackTrace();
                mibrainRequestListener.onRequestError(this.mibrainRequest, "data UnsupportedEncodingException", 2, -11);
                return;
            }
        }
        if (i == MIBRAINSDK_RESULT_TYPE_BINARY_TTS) {
            mibrainRequestListener.onRequestTTSResult(this.mibrainRequest, null, bArr, z);
            return;
        }
        if (i == MIBRAINSDK_RESULT_TYPE_TXT_TTS) {
            try {
                mibrainRequestListener.onRequestTTSResult(this.mibrainRequest, new String(bArr, "UTF-8"), null, z);
                return;
            } catch (UnsupportedEncodingException e4) {
                e4.printStackTrace();
                mibrainRequestListener.onRequestError(this.mibrainRequest, "data UnsupportedEncodingException", 2, -11);
                return;
            }
        }
        if (i == MIBRAINSDK_RESULT_TYPE_TXT_FLAG_SESSION_TTS_BEGIN) {
            try {
                mibrainRequestListener.onRequestTTSResult(this.mibrainRequest, new String(bArr, "UTF-8"), null, false);
                return;
            } catch (UnsupportedEncodingException e5) {
                e5.printStackTrace();
                mibrainRequestListener.onRequestError(this.mibrainRequest, "data UnsupportedEncodingException", 2, -11);
                return;
            }
        }
        if (i == MIBRAINSDK_RESULT_TYPE_TXT_FLAG_SESSION_TTS_END) {
            try {
                mibrainRequestListener.onRequestTTSResult(this.mibrainRequest, new String(bArr, "UTF-8"), null, true);
                return;
            } catch (UnsupportedEncodingException e6) {
                e6.printStackTrace();
                mibrainRequestListener.onRequestError(this.mibrainRequest, "data UnsupportedEncodingException", 2, -11);
                return;
            }
        }
        if (i == MIBRAINSDK_RESULT_TYPE_TXT_FLAG_ERROR) {
            try {
                mibrainRequestListener.onRequestError(this.mibrainRequest, new String(bArr, "UTF-8"), 1, -11);
                return;
            } catch (UnsupportedEncodingException e7) {
                e7.printStackTrace();
                mibrainRequestListener.onRequestError(this.mibrainRequest, "data UnsupportedEncodingException", 2, -11);
                return;
            }
        }
        if (i == MIBRAINSDK_RESULT_TYPE_TXT_RESULT_VOR_REC) {
            try {
                mibrainRequestListener.onRequestVoiceprintRecognizedResult(this.mibrainRequest, new String(bArr, "UTF-8"));
                return;
            } catch (UnsupportedEncodingException e8) {
                e8.printStackTrace();
                mibrainRequestListener.onRequestError(this.mibrainRequest, "data UnsupportedEncodingException", 2, -11);
                return;
            }
        }
        if (i == MIBRAINSDK_RESULT_TYPE_TXT_RESULT_VOR_REG_FINAL || i == MIBRAINSDK_RESULT_TYPE_TXT_RESULT_VOR_REG_PARTIAL) {
            try {
                mibrainRequestListener.onRequestVoiceprintRegisteredResult(this.mibrainRequest, new String(bArr, "UTF-8"), i == MIBRAINSDK_RESULT_TYPE_TXT_RESULT_VOR_REG_FINAL);
                return;
            } catch (UnsupportedEncodingException e9) {
                e9.printStackTrace();
                mibrainRequestListener.onRequestError(this.mibrainRequest, "data UnsupportedEncodingException", 2, -11);
                return;
            }
        }
        if (i == MIBRAINSDK_RESULT_TYPE_TXT_RESULT_VOR_DEL) {
            try {
                mibrainRequestListener.onRequestVoiceprintDeleteResult(this.mibrainRequest, new String(bArr, "UTF-8"));
                return;
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
                mibrainRequestListener.onRequestError(this.mibrainRequest, "data UnsupportedEncodingException", 2, -11);
                return;
            }
        }
        if (i == MIBRAINSDK_RESULT_TYPE_TXT_RESULT_VOR_QUERY) {
            try {
                mibrainRequestListener.onRequestVoiceprintQueryResult(this.mibrainRequest, new String(bArr, "UTF-8"));
                return;
            } catch (UnsupportedEncodingException e11) {
                e11.printStackTrace();
                mibrainRequestListener.onRequestError(this.mibrainRequest, "data UnsupportedEncodingException", 2, -11);
                return;
            }
        }
        if (i == MIBRAINSDK_RESULT_TYPE_TXT_INSTRUCTION) {
            try {
                mibrainRequestListener.onInstruction(this.mibrainRequest, new String(bArr, "UTF-8"));
                return;
            } catch (UnsupportedEncodingException e12) {
                e12.printStackTrace();
                mibrainRequestListener.onRequestError(this.mibrainRequest, "data UnsupportedEncodingException", 2, -11);
                return;
            }
        }
        try {
            mibrainRequestListener.onRequestOtherResult(this.mibrainRequest, new String(bArr, "UTF-8"));
        } catch (UnsupportedEncodingException e13) {
            e13.printStackTrace();
            mibrainRequestListener.onRequestError(this.mibrainRequest, "data UnsupportedEncodingException", 2, -11);
        }
    }

    private void onStart() {
        this.mMibrainRequestListener.onRequestSessionStart(this.mibrainRequest);
    }

    public static native int setDebugLogLevel(int i);

    public static void setLogHook(Mibrainsdk.MibrainsdkLogHook mibrainsdkLogHook) {
        slogHook = mibrainsdkLogHook;
        if (mibrainsdkLogHook == null) {
            setLogHookEnable(0);
        } else {
            setLogHookEnable(1);
        }
    }

    public static native int setLogHookEnable(int i);

    public native int addData(long j, byte[] bArr, int i, int i2);

    public native int addDataRaw(long j, int i, byte[] bArr, int i2, int i3, int i4);

    public native int addNlpData(long j, String str);

    public native int addUploadData(long j, byte[] bArr, int i);

    public native int deleteContext(long j);

    public native int endUploadData(long j);

    public native String getAnonymousAuthorization(long j);

    public native long newContext(MibrainRequestParams mibrainRequestParams, int i, long j);

    public native long newWakeUpRequestParams(int i, int i2);

    public native void releaseWakeUpRequestParams(long j);

    public native int sendWakeUpRequest(long j, MibrainWakeupRequestParams mibrainWakeupRequestParams);

    public native int startRequest(long j);

    public native long startUploadRequest(long j, MibrainWakeupRequestParams mibrainWakeupRequestParams);

    public native int stopRequest(long j, int i);
}
