package com.huawei.hms.mlsdk.asr;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.hms.mlsdk.asr.engine.AsrConstants;
import com.huawei.hms.mlsdk.asr.engine.AsrEngine;
import com.huawei.hms.mlsdk.asr.engine.AsrEngineConfig;
import com.huawei.hms.mlsdk.asr.engine.AsrError;
import com.huawei.hms.mlsdk.asr.engine.AsrResult;
import com.huawei.hms.mlsdk.asr.engine.cloud.vo.AsrLanguageResponse;
import com.huawei.hms.mlsdk.asr.engine.cloud.vo.LanguageListInfo;
import com.huawei.hms.mlsdk.asr.engine.utils.HttpUtils;
import com.huawei.hms.mlsdk.asr.engine.utils.SmartLogger;
import com.huawei.hms.network.httpclient.Callback;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.httpclient.Submit;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes10.dex */
public class MLAsrRecognizer {
    public static final String RESULTS_CODE = "results_code";
    public static final String RESULTS_RECOGNIZED = "results_recognized";
    public static final String RESULTS_RECOGNIZING = "results_recognizing";
    private static final String TAG = "MLAsrRecognizer";
    private AsrEngine mAsrEngine;
    private MLAsrListener mAsrListener;
    private MLAsrWriteAudioListener mAsrWriteAudioListener;
    private AsrEngineConfig mConfig;
    private final Context mContext;
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private volatile boolean mHasStartedRecognized = false;
    private LanguageCallback mLanguageCallback;

    public interface LanguageCallback {
        void onError(int i, String str);

        void onResult(List<String> list);
    }

    /* JADX INFO: loaded from: classes34.dex */
    final class a implements AsrEngine.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f14322a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Handler f14323b = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Executor f14324c = new ExecutorC0153a();

        /* JADX INFO: renamed from: com.huawei.hms.mlsdk.asr.MLAsrRecognizer$a$a, reason: collision with other inner class name */
        final class ExecutorC0153a implements Executor {
            ExecutorC0153a() {
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                a.this.f14323b.post(runnable);
            }
        }

        final class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ byte[] f14326a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ double f14327b;

            b(byte[] bArr, double d) {
                this.f14326a = bArr;
                this.f14327b = d;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (MLAsrRecognizer.this.mAsrListener != null) {
                    MLAsrRecognizer.this.mAsrListener.onVoiceDataReceived(this.f14326a, (float) this.f14327b, new Bundle());
                }
            }
        }

        a() {
        }

        @Override // com.huawei.hms.mlsdk.asr.engine.AsrEngine.Callback
        public final void onEnergy(double d, byte[] bArr, Bundle bundle) {
            ((ExecutorC0153a) this.f14324c).execute(new b(bArr, d));
        }

        @Override // com.huawei.hms.mlsdk.asr.engine.AsrEngine.Callback
        public final void onError(AsrError asrError, String str) {
            StringBuilder sb = new StringBuilder(",errorMessage: ");
            sb.append(asrError.getMessage() == null ? "no error message" : asrError.getMessage());
            String string = sb.toString();
            int iTranslateErrorCode = MLAsrRecognizer.this.translateErrorCode(asrError.getErrorCode());
            Integer subErrorCode = asrError.getSubErrorCode();
            if (MLAsrRecognizer.this.mAsrListener != null) {
                if (asrError.getMessage().equals("No network")) {
                    MLAsrRecognizer.this.mAsrListener.onState(7, new Bundle());
                } else {
                    MLAsrRecognizer.this.mAsrListener.onState(iTranslateErrorCode, new Bundle());
                }
            }
            if (subErrorCode != null) {
                string = ",subError code: " + subErrorCode + string;
            }
            if (MLAsrRecognizer.this.mAsrListener != null) {
                MLAsrRecognizer.this.mAsrListener.onError(iTranslateErrorCode, string);
            }
            SmartLogger.i(MLAsrRecognizer.TAG, "onError code:" + asrError.getErrorCode() + string);
            MLAsrRecognizer.this.destroy();
        }

        @Override // com.huawei.hms.mlsdk.asr.engine.AsrEngine.Callback
        public final void onResult(AsrResult asrResult) {
            if (MLAsrRecognizer.this.mAsrListener == null) {
                MLAsrRecognizer.this.destroy();
                return;
            }
            SmartLogger.i(MLAsrRecognizer.TAG, "onResult retCode: " + asrResult.getRetCode() + ", isFinal: " + asrResult.isFinal() + ", feature: " + MLAsrRecognizer.this.mConfig.getFeature());
            Bundle bundle = new Bundle();
            int retCode = asrResult.getRetCode();
            if (retCode == 3) {
                MLAsrRecognizer.this.mAsrListener.onState(3, new Bundle());
                this.f14322a = true;
                bundle.putString(MLAsrRecognizer.RESULTS_RECOGNIZED, "");
                MLAsrRecognizer.this.mAsrListener.onResults(bundle);
                MLAsrRecognizer.this.destroy();
                return;
            }
            if (retCode != 4) {
                if (retCode == 5) {
                    if (MLAsrRecognizer.this.mConfig.getFeature() == 11) {
                        if (asrResult.getText() == null) {
                            SmartLogger.d(MLAsrRecognizer.TAG, "RECOGNIZING result.getText() is null");
                            return;
                        } else {
                            bundle.putString(MLAsrRecognizer.RESULTS_RECOGNIZING, asrResult.getText());
                            MLAsrRecognizer.this.mAsrListener.onRecognizingResults(bundle);
                            return;
                        }
                    }
                    return;
                }
                if (retCode != 8) {
                    MLAsrRecognizer.this.destroy();
                    SmartLogger.w(MLAsrRecognizer.TAG, "!!! other code -->" + asrResult.getRetCode());
                    return;
                }
            }
            if (this.f14322a) {
                SmartLogger.i(MLAsrRecognizer.TAG, "NO_SOUND_TIMES_EXCEED has detected before");
                return;
            }
            bundle.putInt(MLAsrRecognizer.RESULTS_CODE, 8);
            if ((asrResult.getText() == null || !asrResult.isFinal()) && asrResult.getText() == null) {
                bundle.putString(MLAsrRecognizer.RESULTS_RECOGNIZED, "");
                SmartLogger.i(MLAsrRecognizer.TAG, " onResults text is null");
                MLAsrRecognizer.this.mAsrListener.onResults(bundle);
            } else {
                bundle.putString(MLAsrRecognizer.RESULTS_RECOGNIZED, asrResult.getText());
                MLAsrRecognizer.this.mAsrListener.onResults(bundle);
            }
            MLAsrRecognizer.this.destroy();
        }

        @Override // com.huawei.hms.mlsdk.asr.engine.AsrEngine.Callback
        public final void onState(int i) {
            SmartLogger.i(MLAsrRecognizer.TAG, "status code：" + i);
            if (MLAsrRecognizer.this.mAsrListener == null) {
                return;
            }
            if (i == 1) {
                SmartLogger.d(MLAsrRecognizer.TAG, "please start speeching");
                MLAsrRecognizer.this.mAsrListener.onStartListening();
                MLAsrRecognizer.this.mAsrListener.onState(i, new Bundle());
            } else if (i != 10) {
                MLAsrRecognizer.this.mAsrListener.onState(i, new Bundle());
            } else {
                SmartLogger.d(MLAsrRecognizer.TAG, "user started to speech");
                MLAsrRecognizer.this.mAsrListener.onStartingOfSpeech();
            }
        }
    }

    final class b extends Callback<ResponseBody> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f14329a;

        b(long j) {
            this.f14329a = j;
        }

        @Override // com.huawei.hms.network.httpclient.Callback
        public final void onFailure(Submit<ResponseBody> submit, Throwable th) {
            SmartLogger.e(MLAsrRecognizer.TAG, "language list unavailable:" + th.getMessage());
            MLAsrRecognizer.this.onError(MLAsrConstants.ERR_NO_NETWORK, "language list unavailable:" + th.getMessage());
        }

        @Override // com.huawei.hms.network.httpclient.Callback
        public final void onResponse(Submit<ResponseBody> submit, Response<ResponseBody> response) throws IOException {
            if (response == null || response.getBody() == null) {
                MLAsrRecognizer.this.onError(MLAsrConstants.ERR_NO_NETWORK, "language list unavailable,response or response body is null");
                return;
            }
            String str = new String(response.getBody().bytes());
            AsrLanguageResponse asrLanguageResponse = (AsrLanguageResponse) new Gson().fromJson(str, AsrLanguageResponse.class);
            if (asrLanguageResponse == null) {
                MLAsrRecognizer.this.onError(MLAsrConstants.ERR_NO_NETWORK, "Abnormal network connection.");
                return;
            }
            String retCode = asrLanguageResponse.getRetCode();
            if (TextUtils.isEmpty(retCode)) {
                SmartLogger.e(MLAsrRecognizer.TAG, "connect failed:" + asrLanguageResponse.getRetMsg());
                MLAsrRecognizer.this.onError(MLAsrConstants.ERR_NO_NETWORK, "Abnormal network connection.");
                return;
            }
            if (!retCode.equals("0")) {
                if (retCode.equals("001001")) {
                    SmartLogger.e(MLAsrRecognizer.TAG, "Abnormal network connection.");
                    MLAsrRecognizer.this.onError(MLAsrConstants.ERR_INVALIDATE_TOKEN, asrLanguageResponse.getRetMsg());
                    return;
                } else {
                    SmartLogger.e(MLAsrRecognizer.TAG, "connect failed:" + asrLanguageResponse.getRetMsg());
                    MLAsrRecognizer.this.onError(MLAsrConstants.ERR_NO_NETWORK, asrLanguageResponse.getRetMsg());
                    return;
                }
            }
            SmartLogger.d(MLAsrRecognizer.TAG, "language list response=".concat(str));
            if (!HttpUtils.getInstance().isLegalJson(str)) {
                SmartLogger.e(MLAsrRecognizer.TAG, "language list parse error.[" + str + "]");
                MLAsrRecognizer.this.onError(MLAsrConstants.ERR_SERVICE_UNAVAILABLE, "language list parse error.[" + str + "]");
                return;
            }
            try {
                LanguageListInfo result = asrLanguageResponse.getResult();
                if (result != null && result.getLanguages() != null && result.getLanguages().size() != 0) {
                    MLAsrRecognizer.this.onResult(result.getLanguages());
                    SmartLogger.d(MLAsrRecognizer.TAG, "request support languages time is : " + (System.currentTimeMillis() - this.f14329a));
                    return;
                }
                SmartLogger.e(MLAsrRecognizer.TAG, "Response json not contain languages");
                MLAsrRecognizer.this.onError(MLAsrConstants.ERR_SERVICE_UNAVAILABLE, "Response json not contain languages");
            } catch (Exception e) {
                SmartLogger.e(MLAsrRecognizer.TAG, "Exception", e);
                MLAsrRecognizer.this.onError(MLAsrConstants.ERR_SERVICE_UNAVAILABLE, "Exception" + e.getMessage());
            }
        }
    }

    final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f14331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f14332b;

        c(int i, String str) {
            this.f14331a = i;
            this.f14332b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (MLAsrRecognizer.this.mLanguageCallback != null) {
                MLAsrRecognizer.this.mLanguageCallback.onError(this.f14331a, this.f14332b);
            }
        }
    }

    final class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f14334a;

        d(List list) {
            this.f14334a = list;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (MLAsrRecognizer.this.mLanguageCallback != null) {
                MLAsrRecognizer.this.mLanguageCallback.onResult(this.f14334a);
            }
        }
    }

    final class e implements AsrEngine.Callback {
        e() {
        }

        @Override // com.huawei.hms.mlsdk.asr.engine.AsrEngine.Callback
        public final void onEnergy(double d, byte[] bArr, Bundle bundle) {
        }

        @Override // com.huawei.hms.mlsdk.asr.engine.AsrEngine.Callback
        public final void onError(AsrError asrError, String str) {
            StringBuilder sb = new StringBuilder(",errorMessage: ");
            sb.append(asrError.getMessage() == null ? "no error message" : asrError.getMessage());
            String string = sb.toString();
            int iTranslateErrorCode = MLAsrRecognizer.this.translateErrorCode(asrError.getErrorCode());
            Integer subErrorCode = asrError.getSubErrorCode();
            if (subErrorCode != null) {
                string = ",subError code: " + subErrorCode + string;
            }
            if (MLAsrRecognizer.this.mAsrWriteAudioListener != null) {
                MLAsrRecognizer.this.mAsrWriteAudioListener.onError(iTranslateErrorCode, string);
            }
            SmartLogger.i(MLAsrRecognizer.TAG, "onError code:" + asrError.getErrorCode() + string);
            MLAsrRecognizer.this.destroy();
        }

        @Override // com.huawei.hms.mlsdk.asr.engine.AsrEngine.Callback
        public final void onResult(AsrResult asrResult) {
            if (MLAsrRecognizer.this.mAsrWriteAudioListener == null) {
                MLAsrRecognizer.this.destroy();
                return;
            }
            Bundle bundle = new Bundle();
            int retCode = asrResult.getRetCode();
            if (retCode == 5) {
                if (MLAsrRecognizer.this.mConfig.getFeature() == 11) {
                    if (asrResult.getText() == null) {
                        SmartLogger.d(MLAsrRecognizer.TAG, "RECOGNIZING result.getText() is null");
                        return;
                    } else {
                        bundle.putString(MLAsrRecognizer.RESULTS_RECOGNIZED, asrResult.getText());
                        MLAsrRecognizer.this.mAsrWriteAudioListener.onResults(bundle);
                        return;
                    }
                }
                return;
            }
            if (retCode != 8) {
                MLAsrRecognizer.this.destroy();
                SmartLogger.w(MLAsrRecognizer.TAG, "!!! other code -->" + asrResult.getRetCode());
                return;
            }
            if (asrResult.getText() != null && asrResult.isFinal()) {
                bundle.putString(MLAsrRecognizer.RESULTS_RECOGNIZED, asrResult.getText());
                MLAsrRecognizer.this.mAsrWriteAudioListener.onResults(bundle);
            } else if (asrResult.getText() == null) {
                bundle.putString(MLAsrRecognizer.RESULTS_RECOGNIZED, "");
                SmartLogger.i(MLAsrRecognizer.TAG, "onResults text is null");
                MLAsrRecognizer.this.mAsrWriteAudioListener.onResults(bundle);
            }
            MLAsrRecognizer.this.destroy();
        }

        @Override // com.huawei.hms.mlsdk.asr.engine.AsrEngine.Callback
        public final void onState(int i) {
            SmartLogger.i(MLAsrRecognizer.TAG, "status code：" + i);
            if (MLAsrRecognizer.this.mAsrWriteAudioListener != null && i == 10) {
                SmartLogger.d(MLAsrRecognizer.TAG, "please start speeching");
                MLAsrRecognizer.this.mAsrWriteAudioListener.onStartListening();
            }
        }
    }

    private MLAsrRecognizer(Context context) {
        this.mContext = context;
        SmartLogger.d(TAG, "Context is not null");
        SmartLogger.d(TAG, "mContext:" + context.toString());
    }

    public static MLAsrRecognizer createAsrRecognizer(Context context) {
        if (context != null) {
            return new MLAsrRecognizer(context);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onError(int i, String str) {
        this.mHandler.post(new c(i, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onResult(List<String> list) {
        this.mHandler.post(new d(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int translateErrorCode(int i) {
        if (i == 6) {
            return 6;
        }
        if (i == 7) {
            return MLAsrConstants.ERR_NO_NETWORK;
        }
        if (i != 40) {
            return i != 44 ? i : MLAsrConstants.ERR_INVALIDATE_TOKEN;
        }
        return MLAsrConstants.ERR_SERVICE_UNAVAILABLE;
    }

    public void destroy() {
        AsrEngine asrEngine = this.mAsrEngine;
        if (asrEngine != null) {
            asrEngine.destroy();
            this.mAsrEngine = null;
        }
        this.mHasStartedRecognized = false;
    }

    public void getLanguages(LanguageCallback languageCallback) {
        this.mLanguageCallback = languageCallback;
        new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis();
        HttpUtils.getInstance().requestSupportLanguages(HttpUtils.getInstance().getOkHttpClient(), AsrConstants.AsrGrs.ASR_SHORT_QUERY_LANGUAGE_URL, new b(jCurrentTimeMillis));
    }

    public void receiveVoiceStream(byte[] bArr, boolean z) {
        AsrEngine asrEngine = this.mAsrEngine;
        if (asrEngine == null || bArr == null) {
            return;
        }
        asrEngine.setInput(bArr, z);
    }

    public void setAsrListener(MLAsrListener mLAsrListener) {
        this.mAsrListener = mLAsrListener;
    }

    public void setAsrWriteAudioListener(MLAsrWriteAudioListener mLAsrWriteAudioListener) {
        this.mAsrWriteAudioListener = mLAsrWriteAudioListener;
    }

    public void startRecognizing(Intent intent) {
        Bundle extras;
        if (intent == null) {
            throw new IllegalArgumentException("intent must not be null");
        }
        if (this.mHasStartedRecognized) {
            SmartLogger.w(TAG, "AsrRecognizer is processing now");
            return;
        }
        this.mHasStartedRecognized = true;
        SmartLogger.i(TAG, "start Recognizing");
        try {
            extras = intent.getExtras();
        } catch (RuntimeException e2) {
            SmartLogger.e(TAG, "RuntimeException e = " + e2.getMessage());
            extras = null;
        }
        AsrEngineConfig asrEngineConfigLoad = new AsrEngineConfig().load(extras);
        this.mConfig = asrEngineConfigLoad;
        AsrEngine asrEngine = new AsrEngine(asrEngineConfigLoad, new a());
        this.mAsrEngine = asrEngine;
        try {
            asrEngine.create();
        } catch (Exception e3) {
            SmartLogger.e(TAG, "AsrEngine catch Exception: " + e3.getMessage());
            MLAsrListener mLAsrListener = this.mAsrListener;
            if (mLAsrListener != null) {
                mLAsrListener.onError(40, e3.getMessage());
            }
        }
    }

    public void startWriteAudio(Intent intent) {
        Bundle extras;
        if (intent == null) {
            throw new IllegalArgumentException("intent must not be null");
        }
        if (this.mHasStartedRecognized) {
            SmartLogger.w(TAG, "AsrRecognizer is processing now");
            return;
        }
        this.mHasStartedRecognized = true;
        SmartLogger.i(TAG, "start Recognizing");
        try {
            extras = intent.getExtras();
        } catch (RuntimeException e2) {
            SmartLogger.e(TAG, "RuntimeException e = " + e2.getMessage());
            extras = null;
        }
        AsrEngineConfig asrEngineConfigLoad = new AsrEngineConfig().load(extras);
        this.mConfig = asrEngineConfigLoad;
        AsrEngine asrEngine = new AsrEngine(asrEngineConfigLoad, new e());
        this.mAsrEngine = asrEngine;
        try {
            asrEngine.createWriteAudio();
        } catch (Exception e3) {
            SmartLogger.e(TAG, "AsrEngine catch Exception: " + e3.getMessage());
            MLAsrWriteAudioListener mLAsrWriteAudioListener = this.mAsrWriteAudioListener;
            if (mLAsrWriteAudioListener != null) {
                mLAsrWriteAudioListener.onError(40, e3.getMessage());
            }
        }
    }
}
