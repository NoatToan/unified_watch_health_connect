package com.amazon.alexa.avs;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.alexa.avs.NewAvsController;
import com.amazon.alexa.avs.http.AVSClient;
import com.amazon.alexa.avs.http.AVSClientFactory;
import com.amazon.alexa.avs.http.MultipartParser;
import com.amazon.alexa.avs.http.ParsingFailedHandler;
import com.amazon.alexa.avs.log.LogHelper;
import com.amazon.alexa.avs.log.Logger;
import com.amazon.alexa.avs.log.LoggerFactory;
import com.amazon.alexa.avs.message.request.RequestBody;
import com.amazon.alexa.avs.message.request.RequestFactory;
import com.amazon.alexa.avs.message.request.settings.LocaleSetting;
import com.amazon.alexa.avs.message.response.Directive;
import com.huami.identity.auth.alexa.AlexaAuthKtxKt;
import com.huami.identity.auth.alexa.AuthApi;
import com.huami.tools.log.HMLog;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes2.dex */
public class NewAvsController implements MultipartParser.MultipartParserConsumer, ParsingFailedHandler {
    private static final String FORMAT = "AUDIO_L16_RATE_16000_CHANNELS_1";
    private AlexaListener alexaListener;
    private AVSClient avsClient;
    private final DialogRequestIdAuthority dialogRequestIdAuthority;
    private String mAccessToken = null;
    private Context mContext;
    private final BlockingQueue<Object> sendContentQueue;
    private static final String TAG = LogHelper.makeLogTag(NewAvsController.class);
    private static final Logger log = LoggerFactory.getLogger(NewAvsController.class);
    private static final SpeechProfile PROFILE = SpeechProfile.NEAR_FIELD;

    public interface AlexaListener {
        void onDirectiveData(Directive directive);

        void onErrorException(ErrorMsg errorMsg);

        void onTtsPcmData(String str, InputStream inputStream);
    }

    public static class ErrorMsg {
        public static final int ERROR_CODE_AUTH = 1;
        public static final int ERROR_CODE_DOWNLOAD_ERROR = 6;
        public static final int ERROR_CODE_NETWORK = 3;
        public static final int ERROR_CODE_NOT_SUPPORT = 5;
        public static final int ERROR_CODE_NO_CONTENT = 4;
        public static final int ERROR_CODE_TOKEN = 2;
        public static final int ERROR_CODE_UNKOWN = 0;
        private final String errorMsg;
        private final int type;

        public ErrorMsg(int i, String str) {
            this.type = i;
            this.errorMsg = str;
        }

        public String getJsonMessage() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", this.type);
                jSONObject.put("errorMsg", this.errorMsg);
                return jSONObject.toString();
            } catch (JSONException e) {
                LogHelper.d(NewAvsController.TAG, "", e);
                return null;
            }
        }
    }

    public class SendAvsContentThread extends Thread {
        private BlockingQueue<Object> sendQueue;

        public SendAvsContentThread(BlockingQueue<Object> blockingQueue) {
            this.sendQueue = blockingQueue;
            setName(getClass().getSimpleName());
        }

        /* JADX INFO: Infinite loop detected, blocks: 37, insns: 0 */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    Object objTake = this.sendQueue.take();
                    if (objTake instanceof Directive) {
                        if (NewAvsController.this.alexaListener != null) {
                            NewAvsController.this.alexaListener.onDirectiveData((Directive) objTake);
                        }
                    } else if (objTake instanceof TtsData) {
                        NewAvsController.log.debug("send voice id : " + ((TtsData) objTake).contentId);
                        if (NewAvsController.this.alexaListener != null) {
                            NewAvsController.this.alexaListener.onTtsPcmData(((TtsData) objTake).contentId, ((TtsData) objTake).tts);
                        }
                    } else if ((objTake instanceof ErrorMsg) && NewAvsController.this.alexaListener != null) {
                        NewAvsController.this.alexaListener.onErrorException((ErrorMsg) objTake);
                    }
                } catch (InterruptedException e) {
                    NewAvsController.log.error("Exception in the request thread", e);
                }
            }
        }
    }

    public static class TtsData {
        public String contentId;
        public InputStream tts;

        private TtsData() {
        }
    }

    public NewAvsController(final Context context, AVSClientFactory aVSClientFactory, DialogRequestIdAuthority dialogRequestIdAuthority) throws Exception {
        this.mContext = context;
        this.dialogRequestIdAuthority = dialogRequestIdAuthority;
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        this.sendContentQueue = linkedBlockingDeque;
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.avsClient = aVSClientFactory.getAVSClient(this.mContext.getApplicationContext(), this, this, new ResultListener() { // from class: com.amazon.alexa.avs.NewAvsController.1
            private boolean setLocaleCalled;

            private void sendSyncAndLocale() {
                Log.d(NewAvsController.TAG, "sendSyncAndLocale");
                if (countDownLatch.getCount() > 0) {
                    NewAvsController.log.info("wait loading all relevant data");
                    return;
                }
                NewAvsController.log.info("Start sending SynchronizeStateEvent");
                if (this.setLocaleCalled) {
                    return;
                }
                this.setLocaleCalled = true;
                NewAvsController.this.setLocale(AlexaSupportUtils.getSupportLocalLanguage(context));
            }

            @Override // com.amazon.alexa.avs.ResultListener
            public void onFailure() {
                countDownLatch.countDown();
                sendSyncAndLocale();
            }

            @Override // com.amazon.alexa.avs.ResultListener
            public void onSuccess() {
                countDownLatch.countDown();
                sendSyncAndLocale();
            }
        });
        Runtime.getRuntime().addShutdownHook(new Thread() { // from class: com.amazon.alexa.avs.NewAvsController.2
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                NewAvsController.this.avsClient.shutdown();
            }
        });
        new SendAvsContentThread(linkedBlockingDeque).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$sendAudioDataRequest$3() {
        return "sendAudioDataRequest with bytes";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$updateAccessToken$0() {
        return "updateAccessToken";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$updateAccessToken$1() {
        return "not login";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$updateAccessToken$2() {
        return "set avs client access token";
    }

    private boolean updateAccessToken() {
        Lazy lazyInject = KoinJavaComponent.inject(AuthApi.class);
        HMLog.info("speech", new Function0() { // from class: de5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewAvsController.lambda$updateAccessToken$0();
            }
        });
        if (!((AuthApi) lazyInject.getValue()).isLogin()) {
            HMLog.info("speech", new Function0() { // from class: be5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NewAvsController.lambda$updateAccessToken$1();
                }
            });
            if (!this.sendContentQueue.offer(new ErrorMsg(1, "access token is null"))) {
                log.error("Failed to enqueue access token ");
            }
            return true;
        }
        String accessTokenSync = AlexaAuthKtxKt.getAccessTokenSync((AuthApi) lazyInject.getValue());
        if (accessTokenSync == null || TextUtils.equals(accessTokenSync, this.mAccessToken)) {
            return false;
        }
        Logger logger = log;
        logger.debug("updateAccessToken setAccessToken ");
        logger.debug("updateAccessToken accessToken = " + accessTokenSync);
        HMLog.info("speech", new Function0() { // from class: ee5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewAvsController.lambda$updateAccessToken$2();
            }
        });
        this.mAccessToken = accessTokenSync;
        this.avsClient.setAccessToken(accessTokenSync);
        return false;
    }

    @Override // com.amazon.alexa.avs.http.MultipartParser.MultipartParserConsumer
    public void onDirective(Directive directive) {
        if (this.sendContentQueue.offer(directive)) {
            return;
        }
        log.error("Failed to enqueue directive : " + directive);
    }

    @Override // com.amazon.alexa.avs.http.MultipartParser.MultipartParserConsumer
    public void onDirectiveAttachment(String str, InputStream inputStream) {
        Logger logger = log;
        logger.error("onDirectiveAttachment : contentId = " + str);
        TtsData ttsData = new TtsData();
        ttsData.contentId = str;
        ttsData.tts = inputStream;
        if (this.sendContentQueue.offer(ttsData)) {
            return;
        }
        logger.error("Failed to enqueue tts data  : " + str);
    }

    @Override // com.amazon.alexa.avs.http.ParsingFailedHandler
    public void onParsingFailed(int i, String str) {
        if (this.sendContentQueue.offer(new ErrorMsg(i, str))) {
            return;
        }
        log.error("Failed to enqueue exception data  : " + str);
    }

    public void removeAccessToken() {
        this.avsClient.setAccessToken("");
    }

    public void sendAudioDataRequest(byte[] bArr) {
        if (updateAccessToken()) {
            return;
        }
        HMLog.info("speech", new Function0() { // from class: ce5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewAvsController.lambda$sendAudioDataRequest$3();
            }
        });
        this.avsClient.sendEvent(RequestFactory.createSpeechRecognizerRecognizeRequest(this.dialogRequestIdAuthority.createNewDialogRequestId(), PROFILE, FORMAT, null, null, null, null), bArr, (RequestListener) null);
    }

    public void sendEndPoint(String str) {
        try {
            URL url = new URL(AlexaSupportUtils.getEndpoint(str));
            Log.e(TAG, "update endpoint " + url);
            this.avsClient.setNewHost(url);
        } catch (MalformedURLException e) {
            Log.e(TAG, e.toString());
        }
    }

    public void sendRequest(RequestBody requestBody) {
        if (updateAccessToken()) {
            return;
        }
        try {
            this.avsClient.sendEvent(requestBody, (RequestListener) null);
        } catch (Exception e) {
            log.error("Failed to send request", e);
        }
    }

    public void setAlexaListener(AlexaListener alexaListener) {
        this.alexaListener = alexaListener;
    }

    public void setLocale(String str) {
        Log.e(TAG, "upload local" + str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new LocaleSetting(str));
        sendRequest(RequestFactory.createSettingsUpdatedEvent(arrayList));
    }

    public void sendRequest(String str) {
        if (updateAccessToken()) {
            return;
        }
        try {
            this.avsClient.sendEvent(str, (RequestListener) null);
        } catch (Exception e) {
            log.error("Failed to send request", e);
        }
    }

    public void sendAudioDataRequest(String str, InputStream inputStream) {
        if (updateAccessToken()) {
            IOUtils.closeQuietly(inputStream);
            LogHelper.d(TAG, "sendAudioDataRequest access token is null, close input stream");
        } else {
            this.avsClient.sendEvent(str, inputStream, (RequestListener) null);
        }
    }
}
