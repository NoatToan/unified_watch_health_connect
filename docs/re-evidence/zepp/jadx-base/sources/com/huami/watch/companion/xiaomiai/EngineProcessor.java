package com.huami.watch.companion.xiaomiai;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.huami.passport.AccountManager;
import com.huami.passport.entity.ThirdPartyToken;
import com.huami.watch.companion.account.Account;
import com.huami.watch.companion.account.AccountMiTokenUtil;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.cloud.CloudClient;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.initial.InitialState;
import com.huami.watch.companion.miot.SmartHomeServer;
import com.huami.watch.companion.sync.SyncUtil;
import com.huami.watch.companion.util.ThirdPartUtil;
import com.huami.watch.opus.OpusCodecEncoder;
import com.huami.watch.util.Log;
import com.xiaomi.ai.AsrListener;
import com.xiaomi.ai.AsrRequest;
import com.xiaomi.ai.MiAiOauthCallbacks;
import com.xiaomi.ai.NlpListener;
import com.xiaomi.ai.NlpRequest;
import com.xiaomi.ai.PCMInfo;
import com.xiaomi.ai.SpeechEngine;
import com.xiaomi.ai.SpeechError;
import com.xiaomi.ai.SpeechResult;
import com.xiaomi.ai.TtsListener;
import com.xiaomi.ai.TtsRequest;
import com.xiaomi.ai.core.AivsConfig;
import com.xiaomi.ai.mibrain.Mibrainsdk;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class EngineProcessor extends Handler {
    public static final int ANONYMOUS_ENGINE_STYLE = 12;
    private static final String APPID = "2882303761517406029";
    private static final String DEFAULT_BASE_SERVER = Cloud.get().getHost();
    public static final String KEY_DETAIL = "details";
    public static final String KEY_MOBILE_ID = "mobileDeviceId";
    public static final int MSG_ANSWER_RESULT = 4;
    public static final int MSG_END_OF_SPEECH = 2;
    public static final int MSG_NEW_ANSWER_RESULT = 10004;
    public static final int MSG_NEW_END_OF_SPEECH = 10002;
    private static final int MSG_NEW_NLP_ERROR = 10005;
    public static final int MSG_NEW_QUERY_RESULT = 10003;
    public static final int MSG_NEW_START_SPEECH = 10001;
    private static final int MSG_NLP_ERROR = 5;
    public static final int MSG_QUERY_RESULT = 3;
    public static final int MSG_START_SPEECH = 1;
    private static final int MSG_UPDATE_THIRDTOKEN = 51;
    public static final int OAUTH_ENGINE_STYLE = 11;
    private static final String OPUS_TAG = "opus-tag";
    public static final int STATE_IDLE = 1;
    public static final int STATE_PROCESSING = 0;
    public static final String TAG = "XmAIHandlerf";
    private static final String TIME_TAG = "time-tag";
    private static final String TOKEN = "5651740635029";
    private Context mContext;
    private VoiceParcelFD mFds;
    private LoginTokenReceiver mLogTokenReceiver;
    private SpeechEngine mMiAiEngine;
    private NewAsrListener mNewAsrListener;
    private NewNlpListener mNewNlpListener;
    private OldAsrListener mOldAsrListener;
    private OldNlpListener mOldNlpListener;
    private OpusCodecEncoder mOpus;
    private FileTransfer mTransfer;
    private ArrayList<byte[]> result;
    private FileInputStream mAudioOutStream = null;
    private boolean isOlderVoice = true;
    private int mSampleRate = 16000;
    private int mChannels = 1;
    private int mState = 1;
    public int mEngineStyle = 12;
    private AsrListener mAsrListener = new AsrListener.SimpleAsrListener() { // from class: com.huami.watch.companion.xiaomiai.EngineProcessor.1
        @Override // com.xiaomi.ai.AsrListener.SimpleAsrListener, com.xiaomi.ai.AsrListener
        public void onBeginningOfSpeech() {
            EngineProcessor.this.getCurrentAsrListener().onBeginningOfSpeech();
        }

        @Override // com.xiaomi.ai.AsrListener.SimpleAsrListener, com.xiaomi.ai.AsrListener
        public void onEndOfSpeech() {
            EngineProcessor.this.getCurrentAsrListener().onEndOfSpeech();
        }

        @Override // com.xiaomi.ai.AsrListener.SimpleAsrListener, com.xiaomi.ai.AsrListener
        public void onError(SpeechError speechError) {
            EngineProcessor.this.getCurrentAsrListener().onError(speechError);
        }

        @Override // com.xiaomi.ai.AsrListener.SimpleAsrListener, com.xiaomi.ai.AsrListener
        public void onPartialResults(SpeechResult speechResult) {
            EngineProcessor.this.getCurrentAsrListener().onPartialResults(speechResult);
        }

        @Override // com.xiaomi.ai.AsrListener.SimpleAsrListener, com.xiaomi.ai.AsrListener
        public void onReadyForSpeech() {
            EngineProcessor.this.getCurrentAsrListener().onReadyForSpeech();
        }

        @Override // com.xiaomi.ai.AsrListener.SimpleAsrListener, com.xiaomi.ai.AsrListener
        public void onResults(SpeechResult speechResult) {
            EngineProcessor.this.getCurrentAsrListener().onResults(speechResult);
        }
    };
    private NlpListenerObject mNlpListener = new NlpListenerObject();
    private TtsListener ttsListener = new TtsListener() { // from class: com.huami.watch.companion.xiaomiai.EngineProcessor.2
        @Override // com.xiaomi.ai.TtsListener
        public void onError(SpeechError speechError) {
            Log.d(EngineProcessor.TAG, " ====== TtsListener  ========  onError", new Object[0]);
            EngineProcessor.this.putToEncodeSize(null, true);
        }

        @Override // com.xiaomi.ai.TtsListener
        public void onPCMData(PCMInfo pCMInfo) {
            EngineProcessor.this.putToEncodeSize(pCMInfo.getPCM(), false);
        }

        @Override // com.xiaomi.ai.TtsListener
        public void onPlayFinish() {
            Log.d(EngineProcessor.TAG, " ====== TtsListener  ========  onPlayFinish", new Object[0]);
            EngineProcessor.this.putToEncodeSize(null, true);
        }

        @Override // com.xiaomi.ai.TtsListener
        public void onPlayStart(AudioTrack audioTrack) {
            Log.d(EngineProcessor.TAG, " ====== TtsListener  ========  onPlayStart", new Object[0]);
            audioTrack.play();
        }

        @Override // com.xiaomi.ai.TtsListener
        public void onTtsGotURL(String str) {
            Log.d(EngineProcessor.TAG, " ====== TtsListener  ========  onTtsGotURL s : " + str, new Object[0]);
        }

        @Override // com.xiaomi.ai.TtsListener
        public void onTtsTransEnd(boolean z) {
            Log.d(EngineProcessor.TAG, " ====== TtsListener  ========  onTtsTransEnd and hasPcm " + String.valueOf(z), new Object[0]);
        }

        @Override // com.xiaomi.ai.TtsListener
        public void onTtsTransStart() {
            Log.d(EngineProcessor.TAG, " ====== TtsListener  ========  onTtsTransStart", new Object[0]);
        }
    };
    private MiAiOauthCallbacks miAOauthListener = new MiAiOauthCallbacks() { // from class: com.huami.watch.companion.xiaomiai.EngineProcessor.4
        @Override // com.xiaomi.ai.MiAiOauthCallbacks
        public String getOauthCode() {
            EngineProcessor.this.updateThirdToken();
            return "auth_code_with_external_tokens";
        }
    };

    public class LoginTokenReceiver extends BroadcastReceiver {
        public LoginTokenReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Log.d(EngineProcessor.TAG, "receive AccountThirdPartyMiAuth", new Object[0]);
            EngineProcessor.this.changeEngineStyle();
        }
    }

    public class NewAsrListener extends AsrListener.SimpleAsrListener {
        private long mASRRequestId = -1;
        private long mAsrResultTime;

        public NewAsrListener() {
        }

        @Override // com.xiaomi.ai.AsrListener.SimpleAsrListener, com.xiaomi.ai.AsrListener
        public void onBeginningOfSpeech() {
            super.onBeginningOfSpeech();
            Log.d(EngineProcessor.TAG, "new onBeginningOfSpeech", new Object[0]);
            Log.d(EngineProcessor.TIME_TAG, "====new AsrListener onBeginningOfSpeech ====", new Object[0]);
            this.mASRRequestId = System.currentTimeMillis();
        }

        @Override // com.xiaomi.ai.AsrListener.SimpleAsrListener, com.xiaomi.ai.AsrListener
        public void onEndOfSpeech() {
            Log.d(EngineProcessor.TAG, "new onEndOfSpeech", new Object[0]);
            Log.d(EngineProcessor.TIME_TAG, "====new AsrListener onEndOfSpeech ====", new Object[0]);
            EngineProcessor.this.mFds.closeReadParcelFD();
            EngineProcessor.this.sendEmptyMessage(10002);
        }

        @Override // com.xiaomi.ai.AsrListener.SimpleAsrListener, com.xiaomi.ai.AsrListener
        public void onError(SpeechError speechError) {
            this.mASRRequestId = -1L;
            Log.d(EngineProcessor.TAG, "new onError :" + speechError.toString(), new Object[0]);
            Log.d(EngineProcessor.TIME_TAG, "====new AsrListener onError ====", new Object[0]);
            EngineProcessor.this.mState = 1;
            EngineProcessor.this.mFds.closeReadParcelFD();
            EngineProcessor.this.sendMessage(EngineProcessor.this.obtainMessage(EngineProcessor.MSG_NEW_NLP_ERROR, speechError));
            if (speechError.getErrCode() == -23) {
                EngineProcessor.this.updateThirdToken();
            }
        }

        @Override // com.xiaomi.ai.AsrListener.SimpleAsrListener, com.xiaomi.ai.AsrListener
        public void onPartialResults(SpeechResult speechResult) {
            Log.d(EngineProcessor.TIME_TAG, "====new AsrListener onPartialResults ====", new Object[0]);
            Log.d(EngineProcessor.TAG, "new onPartialResults :" + speechResult.getResponse() + "    " + speechResult, new Object[0]);
            NewVoiceArg newVoiceArg = new NewVoiceArg();
            newVoiceArg.id = this.mASRRequestId;
            newVoiceArg.r = speechResult;
            EngineProcessor.this.sendMessage(EngineProcessor.this.obtainMessage(10003, newVoiceArg));
        }

        @Override // com.xiaomi.ai.AsrListener.SimpleAsrListener, com.xiaomi.ai.AsrListener
        public void onReadyForSpeech() {
            Log.d(EngineProcessor.TAG, "new onReadyForSpeech", new Object[0]);
            Log.d(EngineProcessor.TIME_TAG, "====new AsrListener onReadyForSpeech ====", new Object[0]);
        }

        @Override // com.xiaomi.ai.AsrListener.SimpleAsrListener, com.xiaomi.ai.AsrListener
        public void onResults(SpeechResult speechResult) {
            Log.d(EngineProcessor.TIME_TAG, "====new AsrListener onResults ====", new Object[0]);
            this.mAsrResultTime = System.currentTimeMillis();
            Log.d(EngineProcessor.TAG, "new onResults :" + speechResult.getResponse(), new Object[0]);
            NewVoiceArg newVoiceArg = new NewVoiceArg();
            newVoiceArg.id = this.mASRRequestId;
            newVoiceArg.r = speechResult;
            EngineProcessor.this.sendMessage(EngineProcessor.this.obtainMessage(10003, newVoiceArg));
        }
    }

    public class NewNlpListener implements NlpListener {
        private NewAsrListener mNewAsrListener;

        public NewNlpListener(NewAsrListener newAsrListener) {
            this.mNewAsrListener = newAsrListener;
        }

        @Override // com.xiaomi.ai.NlpListener
        public void onError(SpeechError speechError) {
            this.mNewAsrListener.mASRRequestId = -1L;
            Log.d(EngineProcessor.TIME_TAG, "====new NlpListener onError ====", new Object[0]);
            Log.d(EngineProcessor.TAG, "new NlpListener onError :" + speechError.toString(), new Object[0]);
            EngineProcessor.this.sendMessage(EngineProcessor.this.obtainMessage(EngineProcessor.MSG_NEW_NLP_ERROR, speechError));
        }

        @Override // com.xiaomi.ai.NlpListener
        public void onResult(SpeechResult speechResult) {
            Log.d(EngineProcessor.TIME_TAG, "====new NlpListener onEndOfSpeech ====", new Object[0]);
            NewVoiceArg newVoiceArg = new NewVoiceArg();
            newVoiceArg.id = this.mNewAsrListener.mASRRequestId;
            newVoiceArg.r = speechResult;
            EngineProcessor.this.sendMessage(EngineProcessor.this.obtainMessage(EngineProcessor.MSG_NEW_ANSWER_RESULT, newVoiceArg));
            String directive = speechResult.getDirective();
            if (TextUtils.isEmpty(directive)) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray(directive);
                if (jSONArray.length() > 0) {
                    Log.d(EngineProcessor.TAG, "directive url : " + ((JSONObject) ((JSONObject) jSONArray.get(0)).getJSONArray("items").get(0)).getJSONObject(AivsConfig.Tts.AUDIO_TYPE_STREAM).getString("url"), new Object[0]);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public class NewVoiceArg {
        public long id;
        public SpeechResult r;

        private NewVoiceArg() {
        }
    }

    public class NlpListenerObject implements NlpListener {
        public boolean hasError = false;
        private Handler mHandler;
        private HandlerThread mHandlerThread;

        public NlpListenerObject() {
            HandlerThread handlerThread = new HandlerThread("xiao_ai_upload_data");
            this.mHandlerThread = handlerThread;
            handlerThread.start();
            this.mHandler = new Handler(this.mHandlerThread.getLooper());
        }

        public void finalize() throws Throwable {
            super.finalize();
            HandlerThread handlerThread = this.mHandlerThread;
            if (handlerThread != null) {
                handlerThread.quit();
                this.mHandlerThread = null;
            }
            if (this.mHandler != null) {
                this.mHandler = null;
            }
        }

        public boolean hasError() {
            return this.hasError;
        }

        @Override // com.xiaomi.ai.NlpListener
        public void onError(SpeechError speechError) {
            setError(true);
            EngineProcessor.this.getCurrentNlpListener().onError(speechError);
        }

        @Override // com.xiaomi.ai.NlpListener
        public void onResult(final SpeechResult speechResult) {
            EngineProcessor.this.dealWithMultiDialogue(speechResult);
            setError(false);
            this.mHandler.post(new Runnable() { // from class: com.huami.watch.companion.xiaomiai.EngineProcessor.NlpListenerObject.1
                @Override // java.lang.Runnable
                public void run() {
                    EngineProcessor.this.uploadData(speechResult);
                }
            });
            EngineProcessor.this.getCurrentNlpListener().onResult(speechResult);
        }

        public void setError(boolean z) {
            this.hasError = z;
        }
    }

    public class OldAsrListener extends AsrListener.SimpleAsrListener {
        private long mAsrResultTime;

        private OldAsrListener() {
        }

        @Override // com.xiaomi.ai.AsrListener.SimpleAsrListener, com.xiaomi.ai.AsrListener
        public void onEndOfSpeech() {
            Log.d(EngineProcessor.TAG, "onEndOfSpeech", new Object[0]);
            Log.d(EngineProcessor.TIME_TAG, "====AsrListener onEndOfSpeech ====", new Object[0]);
            EngineProcessor.this.sendEmptyMessage(2);
        }

        @Override // com.xiaomi.ai.AsrListener.SimpleAsrListener, com.xiaomi.ai.AsrListener
        public void onError(SpeechError speechError) {
            Log.d(EngineProcessor.TAG, "onError :" + speechError.toString(), new Object[0]);
            Log.d(EngineProcessor.TIME_TAG, "====AsrListener onError ====", new Object[0]);
            EngineProcessor.this.mState = 1;
            EngineProcessor.this.sendMessage(EngineProcessor.this.obtainMessage(5, speechError));
            try {
                EngineProcessor.this.mAudioOutStream.close();
            } catch (Exception e) {
                Log.e(EngineProcessor.TAG, e.toString(), e, new Object[0]);
            }
        }

        @Override // com.xiaomi.ai.AsrListener.SimpleAsrListener, com.xiaomi.ai.AsrListener
        public void onPartialResults(SpeechResult speechResult) {
            Log.d(EngineProcessor.TIME_TAG, "====AsrListener onPartialResults ====", new Object[0]);
        }

        @Override // com.xiaomi.ai.AsrListener.SimpleAsrListener, com.xiaomi.ai.AsrListener
        public void onReadyForSpeech() {
            Log.d(EngineProcessor.TAG, "onReadyForSpeech", new Object[0]);
            Log.d(EngineProcessor.TIME_TAG, "====AsrListener onReadyForSpeech ====", new Object[0]);
        }

        @Override // com.xiaomi.ai.AsrListener.SimpleAsrListener, com.xiaomi.ai.AsrListener
        public void onResults(SpeechResult speechResult) {
            Log.d(EngineProcessor.TIME_TAG, "====AsrListener onResults ====", new Object[0]);
            this.mAsrResultTime = System.currentTimeMillis();
            Log.d(EngineProcessor.TAG, "onResults :" + speechResult.getAnswer(), new Object[0]);
            Log.d(EngineProcessor.TAG, "onResults :" + speechResult.getAnswerText(), new Object[0]);
            EngineProcessor.this.sendMessage(EngineProcessor.this.obtainMessage(3, speechResult));
        }
    }

    public class OldNlpListener implements NlpListener {
        private OldNlpListener() {
        }

        @Override // com.xiaomi.ai.NlpListener
        public void onError(SpeechError speechError) {
            Log.d(EngineProcessor.TIME_TAG, "====NlpListener onError ====", new Object[0]);
            Log.d(EngineProcessor.TAG, "NlpListener onError :" + speechError.toString(), new Object[0]);
            EngineProcessor.this.sendMessage(EngineProcessor.this.obtainMessage(5, speechError));
        }

        @Override // com.xiaomi.ai.NlpListener
        public void onResult(SpeechResult speechResult) {
            Log.d(EngineProcessor.TIME_TAG, "====NlpListener onEndOfSpeech ====", new Object[0]);
            EngineProcessor.this.sendMessage(EngineProcessor.this.obtainMessage(4, speechResult));
        }
    }

    public EngineProcessor(Context context, FileTransfer fileTransfer) {
        Log.d(TAG, "EngineProcessor init", new Object[0]);
        this.mContext = context;
        this.mTransfer = fileTransfer;
        initXmAI();
    }

    private byte[] byteCombineAll(ArrayList<byte[]> arrayList) {
        int length = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            length += arrayList.get(i).length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            byte[] bArr2 = arrayList.get(i2);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dealWithMultiDialogue(SpeechResult speechResult) {
        SharedPreferences.Editor editorEdit = this.mContext.getSharedPreferences(VoiceProtocol.HUAMI_CMD_KEY, 0).edit();
        try {
            JSONObject jSONObject = new JSONObject(speechResult.getAnswer());
            boolean zOptBoolean = jSONObject.getJSONObject("content").optBoolean("open_mic");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(VoiceProtocol.RESULT_KEY_POSTBACK);
            if (!zOptBoolean || jSONObjectOptJSONObject == null) {
                editorEdit.putBoolean(VoiceProtocol.HUAMI_CMD_OPEN_MIC, false);
                editorEdit.putString(VoiceProtocol.HUAMI_CMD_SMARTMIOT_POSTBACK, "");
            } else {
                editorEdit.putBoolean(VoiceProtocol.HUAMI_CMD_OPEN_MIC, true);
                editorEdit.putString(VoiceProtocol.HUAMI_CMD_SMARTMIOT_POSTBACK, jSONObjectOptJSONObject.toString());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        editorEdit.commit();
    }

    public static String getBaseServer() {
        String str = DEFAULT_BASE_SERVER;
        if (str.endsWith(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)) {
            return str;
        }
        return str + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE;
    }

    private NlpRequest.UserInfo getNlpRequestUserInfo() {
        NlpRequest.UserInfo userInfo = new NlpRequest.UserInfo();
        userInfo.setUserId(SmartHomeServer.get().getMiotUid());
        userInfo.setUserType("xiaomi_id");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(VoiceProtocol.MIOT_TOKEN, SmartHomeServer.get().getMiotToken());
            jSONObject.put(VoiceProtocol.MIOT_SESSION, SmartHomeServer.get().getMiotSessionId());
            Log.d(TAG, " extend = " + jSONObject.toString() + " uid = " + SmartHomeServer.get().getMiotUid(), new Object[0]);
            userInfo.setExtend(jSONObject.toString());
            return userInfo;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getUrlDropBoxCrash(String str) {
        return getBaseServer() + "users/" + str + "/mobileAppActivities?activityType=SPEECH_AI";
    }

    private void handOldVoiceMeeage(Message message) {
        int i = message.what;
        if (i == 1) {
            File file = (File) message.obj;
            Log.d(TAG, "XmAIHandler handle received sound :" + file.getAbsolutePath(), new Object[0]);
            if (this.mState != 1) {
                Log.w(TAG, "there is a session on going. ", new Object[0]);
                return;
            } else {
                this.mState = 0;
                handleAudioFile(file);
                return;
            }
        }
        if (i == 2) {
            this.mState = 1;
            try {
                this.mAudioOutStream.close();
                return;
            } catch (IOException e) {
                Log.e(TAG, "handOldVoiceMeeage error" + e.toString(), e, new Object[0]);
                return;
            }
        }
        if (i == 3) {
            if (message.obj == null) {
                Log.w(TAG, "null result!!", new Object[0]);
                return;
            }
            return;
        }
        if (i != 4) {
            if (i != 5) {
                return;
            }
            SpeechError speechError = (SpeechError) message.obj;
            FileTransfer fileTransfer = this.mTransfer;
            if (fileTransfer == null) {
                Log.w(TAG, "transfer is null!", new Object[0]);
                return;
            }
            fileTransfer.sendCmd(VoiceProtocol.SPEECH_ERROR + speechError.toString());
            return;
        }
        Object obj = message.obj;
        if (obj == null) {
            Log.w(TAG, "null result!!", new Object[0]);
            return;
        }
        SpeechResult speechResult = (SpeechResult) obj;
        if (this.mTransfer == null) {
            Log.w(TAG, "transfer is null!", new Object[0]);
            return;
        }
        String strRemoveDebugInfo = removeDebugInfo(speechResult);
        Log.d(TAG, "old nlp :" + strRemoveDebugInfo, new Object[0]);
        this.mTransfer.sendCmd(strRemoveDebugInfo);
    }

    private void handleAudioFile(File file) {
        FileDescriptor fd;
        this.isOlderVoice = true;
        Log.d(TAG, "handleAudioFile " + file.getAbsolutePath() + " file can read:" + file.canRead(), new Object[0]);
        Log.d(TIME_TAG, "====receive audio file ====", new Object[0]);
        AsrRequest asrRequest = new AsrRequest();
        NlpRequest nlpRequest = new NlpRequest();
        TtsRequest ttsRequest = new TtsRequest();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            this.mAudioOutStream = fileInputStream;
            fd = fileInputStream.getFD();
        } catch (FileNotFoundException e) {
            Log.e(TAG, "handleAudioFile " + e.toString(), e, new Object[0]);
            fd = null;
        } catch (IOException e2) {
            Log.e(TAG, "handleAudioFile " + e2.toString(), e2, new Object[0]);
            fd = null;
        }
        if (fd == null) {
            Log.e(TAG, " null audio fd , do nothing!!!", new Object[0]);
            return;
        }
        asrRequest.setDataInputMode(AsrRequest.DataInputMode.DATA_INPUT_MODE_BUFFER);
        SpeechEngine.ParamBuilder paramBuilder = new SpeechEngine.ParamBuilder();
        paramBuilder.needAsr().setAsrRequest(asrRequest).needNlp().setNlpRequest(nlpRequest).needTts().setTtsRequest(ttsRequest);
        this.mMiAiEngine.startIntegrally(paramBuilder);
        Log.d(TIME_TAG, "====request xiaomi ai server ====", new Object[0]);
    }

    private void handleNewVoiceMessage(Message message) {
        switch (message.what) {
            case 10001:
                this.mState = 0;
                break;
            case 10002:
                this.mState = 1;
                break;
            case 10003:
                Object obj = message.obj;
                if (obj == null) {
                    Log.w(TAG, "null result!!", new Object[0]);
                } else if (this.mTransfer != null) {
                    NewVoiceArg newVoiceArg = (NewVoiceArg) obj;
                    this.mTransfer.sendCmd(inflateResponse(true, newVoiceArg.id, newVoiceArg.r).toString());
                } else {
                    Log.w(TAG, "transfer is null!", new Object[0]);
                }
                break;
            case MSG_NEW_ANSWER_RESULT /* 10004 */:
                Object obj2 = message.obj;
                if (obj2 == null) {
                    Log.w(TAG, "null result!!", new Object[0]);
                } else if (this.mTransfer != null) {
                    NewVoiceArg newVoiceArg2 = (NewVoiceArg) obj2;
                    JSONObject jSONObjectInflateResponse = inflateResponse(false, newVoiceArg2.id, newVoiceArg2.r);
                    if (!DeviceUtil.isSupportMiAi2_2(this.mContext)) {
                        Log.d(TAG, "is not SupportMiAi2_2!", new Object[0]);
                        inflateformmerAboutXiaoMi(jSONObjectInflateResponse);
                        if (newVoiceArg2.r.getDomain().equals("internal-platform")) {
                            inflateformmerLocalAppAboutXiaoMi(jSONObjectInflateResponse);
                        }
                        this.mTransfer.sendCmd(jSONObjectInflateResponse.toString());
                    } else {
                        Log.d(TAG, "isSupportMiAi2_2!", new Object[0]);
                        this.mTransfer.sendCmd(jSONObjectInflateResponse.toString());
                    }
                } else {
                    Log.w(TAG, "transfer is null!", new Object[0]);
                }
                break;
            case MSG_NEW_NLP_ERROR /* 10005 */:
                SpeechError speechError = (SpeechError) message.obj;
                if (this.mTransfer != null) {
                    this.mTransfer.sendCmd(inflateErrorJson(speechError));
                } else {
                    Log.w(TAG, "transfer is null!", new Object[0]);
                }
                break;
        }
    }

    private void infalteContextJson(NlpRequest nlpRequest, JSONObject jSONObject) {
        if (nlpRequest == null || jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                String string = jSONObject.getString(next);
                if (TextUtils.isEmpty(next) || TextUtils.isEmpty(string)) {
                    Log.d(TAG, "key " + next + " value " + string, new Object[0]);
                } else {
                    nlpRequest.setContext(next, string);
                }
            } catch (JSONException e) {
                Log.e(TAG, "infalteContextJson" + e.toString(), e, new Object[0]);
            }
        }
    }

    private String inflateErrorJson(SpeechError speechError) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(VoiceProtocol.XIAO_MI_SPEECH_ERROR_TYPE, speechError.getErrType());
            jSONObject2.put(VoiceProtocol.XIAO_MI_SPEECH_ERROR_CODE, speechError.getErrCode());
            jSONObject2.put(VoiceProtocol.XIAO_MI_SPEECH_ERROR_MSG, speechError.getErrMsg());
            jSONObject.put(VoiceProtocol.SPEECH_ERROR, jSONObject2);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.e(TAG, e.toString(), e, new Object[0]);
            return "speech_error:" + e.toString();
        }
    }

    private JSONObject inflateResponse(boolean z, long j, SpeechResult speechResult) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(VoiceProtocol.HEADER_ID, j);
            jSONObject2.put(VoiceProtocol.RESPONSE_TYPE, z ? "asr" : "nlp");
            jSONObject.put(VoiceProtocol.HEADER, jSONObject2);
            if (z) {
                jSONObject.put(VoiceProtocol.XIAOMI_CONTENT, new JSONObject(speechResult.getResponse()));
            } else {
                jSONObject.put(VoiceProtocol.XIAOMI_CONTENT, new JSONObject(removeDebugInfo(speechResult)));
            }
            Log.d(TAG, jSONObject.toString(), new Object[0]);
            return jSONObject;
        } catch (JSONException e) {
            Log.e(TAG, e.toString(), e, new Object[0]);
            return null;
        }
    }

    private JSONObject inflateformmerAboutXiaoMi(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = ((JSONObject) jSONObject.getJSONObject(VoiceProtocol.XIAOMI_CONTENT).getJSONArray(VoiceProtocol.ANSWER).get(0)).getJSONObject("content");
                String strOptString = jSONObject2.optString("to_speak");
                jSONObject2.remove("to_speak");
                jSONObject2.put(VoiceProtocol.TOSPEAK, strOptString);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    private JSONObject inflateformmerLocalAppAboutXiaoMi(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = (JSONObject) jSONObject.getJSONObject(VoiceProtocol.XIAOMI_CONTENT).getJSONArray(VoiceProtocol.ANSWER).get(0);
                JSONObject jSONObjectOptJSONObject = jSONObject2.getJSONObject("content").optJSONObject("intent").optJSONObject("device_command").optJSONObject("data");
                JSONObject jSONObject3 = jSONObject2.getJSONObject(VoiceProtocol.INTENTION);
                jSONObject3.remove("data");
                jSONObject3.put("data", jSONObjectOptJSONObject);
                jSONObject3.remove("domain");
                jSONObject3.put("domain", "huamiSports");
                jSONObject2.remove("domain");
                jSONObject2.put("domain", "huamiSports");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    private void initEngine() {
        boolean zIsNeedLogin = InitialState.isNeedLogin();
        boolean zIsLoginByWechat = Account.isLoginByWechat(this.mContext);
        boolean zCheckNeedMiAuth = AccountMiTokenUtil.checkNeedMiAuth(this.mContext);
        Log.d(TAG, "newSDK initengine :  isNeedLogin = " + zIsNeedLogin + " , isLoginByWechat = " + zIsLoginByWechat + " , checkNeedMiAuth = " + zCheckNeedMiAuth, new Object[0]);
        this.mLogTokenReceiver = new LoginTokenReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(AccountMiTokenUtil.ACTION_MI_AUTH);
        LocalBroadcastManager.getInstance(this.mContext).registerReceiver(this.mLogTokenReceiver, intentFilter);
        if (zCheckNeedMiAuth) {
            changeEngineTo(12, false);
        } else {
            changeEngineTo(11, false);
        }
    }

    private void initXmAI() {
        initEngine();
        OpusCodecEncoder opusCodecEncoder = new OpusCodecEncoder();
        this.mOpus = opusCodecEncoder;
        opusCodecEncoder.createOpusEncoder(this.mSampleRate, this.mChannels, OpusCodecEncoder.OPUS_APPLICATION.OPUS_APPLICATION_AUDIO);
        this.mFds = new VoiceParcelFD();
    }

    private void opusCode(byte[] bArr, AudioBufferManager audioBufferManager) {
        int inputByteBufferSize = this.mOpus.getInputByteBufferSize(this.mSampleRate, OpusCodecEncoder.OPUS_FRAME_DURATION.TIME_20, this.mChannels);
        Log.d(OPUS_TAG, "  frame-size " + inputByteBufferSize + " , buffer.length " + bArr.length, new Object[0]);
        int i = 0;
        while (true) {
            int i2 = i + inputByteBufferSize;
            if (i2 > bArr.length) {
                return;
            }
            byte[] bArr2 = new byte[inputByteBufferSize];
            System.arraycopy(bArr, i, bArr2, 0, inputByteBufferSize);
            byte[] bArrOpusEncode = this.mOpus.opusEncode(bArr2, OpusCodecEncoder.OPUS_FRAME_DURATION.TIME_20, 1500);
            if (bArrOpusEncode == null) {
                Log.d(OPUS_TAG, "  encodeData is null", new Object[0]);
            } else {
                audioBufferManager.addBuffer(bArrOpusEncode, bArrOpusEncode.length);
            }
            i = i2;
        }
    }

    private String removeDebugInfo(SpeechResult speechResult) {
        try {
            JSONObject jSONObject = new JSONObject(speechResult.getResponse());
            jSONObject.remove("debug");
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.d(TAG, e.toString(), e);
            return speechResult.getResponse();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Removed unreachable split cross block B:36:0x016d */
    public void uploadData(SpeechResult speechResult) {
        String string;
        String string2 = "";
        if (speechResult == null) {
            Log.d(TAG, "upload data  is null", new Object[0]);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(speechResult.getResponse());
            string = jSONObject.getString("session_id");
            try {
                string2 = jSONObject.getString("request_id");
            } catch (JSONException e) {
                e = e;
                Log.e(TAG, e.toString(), e, new Object[0]);
            }
        } catch (JSONException e2) {
            e = e2;
            string = "";
        }
        String query = speechResult.getQuery();
        String answer = speechResult.getAnswer();
        String intention = speechResult.getIntention();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String toSpeak = speechResult.getToSpeak();
        Log.d(TAG, "upload info :[sessionId : " + string + "  requestId:" + string2 + "    query :" + query + "  answer : " + answer + "   intention：  " + intention + "  time : " + jCurrentTimeMillis + "   toSpeak :" + toSpeak, new Object[0]);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("session_id", string);
            jSONObject2.put("request_id", string2);
            jSONObject2.put("time", System.currentTimeMillis());
            jSONObject2.put(VoiceProtocol.INTENTION, intention);
            jSONObject2.put("tospeak", toSpeak);
            new HashMap();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("details", jSONObject2.toString());
            jSONObject3.put("mobileDeviceId", DeviceManager.getManager(this.mContext).getCurrentDevice().getCpuId());
            HashMap map = new HashMap();
            map.put("Content-Type", "application/json");
            try {
                Response responseDoRequest = CloudClient.doRequest(this.mContext, CloudClient.newPost(getUrlDropBoxCrash(Account.getUID(this.mContext)), map, jSONObject3.toString(), "application/json"));
                if (responseDoRequest.isSuccessful()) {
                    Log.d(TAG, "upload ai result success " + responseDoRequest.message() + "   code  " + responseDoRequest.code() + " response11 :" + responseDoRequest.headers(), new Object[0]);
                } else {
                    Log.d(TAG, "upload ai result failed " + responseDoRequest.message() + "   code  " + responseDoRequest.code() + "  response11 :" + responseDoRequest.headers(), new Object[0]);
                }
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        } catch (JSONException e4) {
            Log.e(TAG, e4.toString(), e4, new Object[0]);
        }
    }

    public void addBuffer(byte[] bArr, int i, int i2) {
        this.mMiAiEngine.addBuffer(bArr, i, i2);
    }

    public void changeEngineStyle() {
        boolean zIsNeedLogin = InitialState.isNeedLogin();
        boolean zIsLoginByWechat = Account.isLoginByWechat(this.mContext);
        boolean zCheckNeedMiAuth = AccountMiTokenUtil.checkNeedMiAuth(this.mContext);
        Log.d(TAG, "changeEngineStyle :  isNeedLogin = " + zIsNeedLogin + " , isLoginByWechat = " + zIsLoginByWechat + " , checkNeedMiAuth = " + zCheckNeedMiAuth, new Object[0]);
        if (zCheckNeedMiAuth) {
            changeEngineTo(12, true);
        } else {
            changeEngineTo(11, true);
        }
    }

    public void changeEngineTo(int i, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("changeEngineTo SYTLE : ");
        sb.append(i == 11 ? "OAUTH_ENGINE_STYLE" : "ANONYMOUS_ENGINE_STYLE");
        sb.append(" isClearData : ");
        sb.append(z);
        Log.d(TAG, sb.toString(), new Object[0]);
        SpeechEngine speechEngine = this.mMiAiEngine;
        if (speechEngine != null) {
            speechEngine.release();
        }
        if (i == 12) {
            if (z) {
                this.mMiAiEngine.cleanUserLoginData();
            }
            this.mMiAiEngine = SpeechEngine.createEngine(this.mContext, 1, ThirdPartUtil.getXiaomiId(), ThirdPartUtil.getSignSecret(), ThirdPartUtil.getNewApiKey(), 1);
        } else if (i == 11) {
            if (z) {
                this.mMiAiEngine.cleanUserLoginData(ThirdPartUtil.getXiaomiId());
            }
            this.mMiAiEngine = SpeechEngine.createEngine(this.mContext, 1, ThirdPartUtil.getXiaomiId(), ThirdPartUtil.getClientSecret(), ThirdPartUtil.getXiaomi().getRedirectUrl(), true);
            updateThirdToken();
            this.mMiAiEngine.setMiAOOauthCallbacks(this.miAOauthListener);
        } else {
            if (z) {
                this.mMiAiEngine.cleanUserLoginData(ThirdPartUtil.getXiaomiId());
            }
            this.mMiAiEngine = SpeechEngine.createEngine(this.mContext, 1, ThirdPartUtil.getXiaomiId(), ThirdPartUtil.getClientSecret(), ThirdPartUtil.getXiaomi().getRedirectUrl(), true);
            updateThirdToken();
            this.mMiAiEngine.setMiAOOauthCallbacks(this.miAOauthListener);
        }
        this.mEngineStyle = i;
        this.mMiAiEngine.setTTSMode(2);
        if (DeviceUtil.isSupportMiAiTts(this.mContext)) {
            Log.d(TAG, " createEngine  SupportMiAiTts", new Object[0]);
        } else {
            Log.d(TAG, " createEngine  not SupportMiAiTts", new Object[0]);
        }
        this.mMiAiEngine.setTtsListener(this.ttsListener);
        this.mMiAiEngine.setAsrLisnter(this.mAsrListener);
        this.mMiAiEngine.setNlpListener(this.mNlpListener);
        this.mMiAiEngine.setEnv(0);
        Mibrainsdk.setLogLevel(Mibrainsdk.MIBRAIN_DEBUG_LEVEL_DEBUG);
    }

    public void doEndSpeech() {
        this.mMiAiEngine.endSpeech();
    }

    public void doListeningSpeech(JSONObject jSONObject, JSONObject jSONObject2) {
        this.isOlderVoice = false;
        Log.d(TIME_TAG, "====receive audio file ====", new Object[0]);
        AsrRequest asrRequest = new AsrRequest();
        NlpRequest nlpRequest = new NlpRequest();
        TtsRequest ttsRequest = new TtsRequest();
        SharedPreferences sharedPreferences = this.mContext.getSharedPreferences(VoiceProtocol.HUAMI_CMD_KEY, 0);
        if (jSONObject == null) {
            String string = sharedPreferences.getString(VoiceProtocol.HUAMI_CMD_REQUEIRED_CONTEXT, "");
            if (!TextUtils.isEmpty(string)) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException e) {
                    Log.e(TAG, VoiceProtocol.HUAMI_CMD_REQUEIRED_CONTEXT + e.toString(), e, new Object[0]);
                }
            }
        }
        NlpListenerObject nlpListenerObject = this.mNlpListener;
        if (nlpListenerObject != null && nlpListenerObject.hasError()) {
            nlpRequest.startNewSession();
            this.mNlpListener.setError(false);
        }
        if (DeviceUtil.isRomSupportMiotToken(this.mContext)) {
            nlpRequest.setUserInfo(getNlpRequestUserInfo());
            Log.d(TAG, "version is supported token", new Object[0]);
        } else {
            infalteContextJson(nlpRequest, jSONObject);
            Log.d(TAG, "version is not supported token", new Object[0]);
        }
        boolean z = sharedPreferences.getBoolean(VoiceProtocol.HUAMI_CMD_OPEN_MIC, false);
        String string2 = sharedPreferences.getString(VoiceProtocol.HUAMI_CMD_SMARTMIOT_POSTBACK, null);
        if (z && !TextUtils.isEmpty(string2)) {
            nlpRequest.setContext(VoiceProtocol.RESULT_KEY_POSTBACK, string2);
        }
        infalteContextJson(nlpRequest, jSONObject2);
        asrRequest.setDataInputMode(AsrRequest.DataInputMode.DATA_INPUT_MODE_BUFFER);
        SpeechEngine.ParamBuilder paramBuilder = new SpeechEngine.ParamBuilder();
        paramBuilder.needAsr().setAsrRequest(asrRequest).needNlp().setNlpRequest(nlpRequest).needTts().setTtsRequest(ttsRequest);
        this.mMiAiEngine.startIntegrally(paramBuilder);
        Log.d(TIME_TAG, "====request xiaomi ai server ====", new Object[0]);
    }

    public AsrListener getCurrentAsrListener() {
        return this.isOlderVoice ? getOldAsrListener() : getNewAsrListener();
    }

    public NlpListener getCurrentNlpListener() {
        return this.isOlderVoice ? getOldNlpListener() : getNewNlpListener();
    }

    public AsrListener getNewAsrListener() {
        if (this.mNewAsrListener == null) {
            this.mNewAsrListener = new NewAsrListener();
        }
        return this.mNewAsrListener;
    }

    public NlpListener getNewNlpListener() {
        if (this.mNewNlpListener == null) {
            this.mNewNlpListener = new NewNlpListener((NewAsrListener) getNewAsrListener());
        }
        return this.mNewNlpListener;
    }

    public AsrListener getOldAsrListener() {
        if (this.mOldAsrListener == null) {
            this.mOldAsrListener = new OldAsrListener();
        }
        return this.mOldAsrListener;
    }

    public NlpListener getOldNlpListener() {
        if (this.mOldNlpListener == null) {
            this.mOldNlpListener = new OldNlpListener();
        }
        return this.mOldNlpListener;
    }

    public VoiceParcelFD getVoiceParcelFD() {
        return this.mFds;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        ThirdPartyToken thirdPartyToken;
        super.handleMessage(message);
        int i = message.what;
        if (i > 100) {
            Log.d(TAG, "new voice processor", new Object[0]);
            handleNewVoiceMessage(message);
            return;
        }
        if (i <= 50) {
            Log.d(TAG, "old voice processor", new Object[0]);
            handOldVoiceMeeage(message);
        } else {
            if (i != 51 || (thirdPartyToken = (ThirdPartyToken) message.obj) == null) {
                return;
            }
            Log.d(TAG, " updateInfo  " + thirdPartyToken.toString(), new Object[0]);
            this.mMiAiEngine.setAuthorizationTokens(thirdPartyToken.getAccessToken(), thirdPartyToken.getRefreshToken(), thirdPartyToken.getExpiresIn());
            SyncUtil.syncXiaoMiTokenToWatch(this.mContext);
        }
    }

    public void putToEncode(byte[] bArr, boolean z) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        if (!z) {
            this.result.add(bArr);
            return;
        }
        byte[] bArrByteCombineAll = byteCombineAll(this.result);
        int inputByteBufferSize = this.mOpus.getInputByteBufferSize(this.mSampleRate, OpusCodecEncoder.OPUS_FRAME_DURATION.TIME_20, this.mChannels);
        int length = bArrByteCombineAll.length % inputByteBufferSize;
        if (length != 0) {
            this.result.add(new byte[inputByteBufferSize - length]);
            bArrByteCombineAll = byteCombineAll(this.result);
        }
        this.result.clear();
        AudioBufferManager audioBufferManager = new AudioBufferManager();
        opusCode(bArrByteCombineAll, audioBufferManager);
        Log.d(TAG, "send pcm data", new Object[0]);
        this.mTransfer.sendCmd(audioBufferManager.getAudioBuffer());
    }

    public void putToEncodeSize(byte[] bArr, boolean z) {
        if (!DeviceUtil.isSupportMiAiTts(this.mContext)) {
            Log.d(TAG, " putToEncodeSize  ---  supportMiAiTts : is false", new Object[0]);
            return;
        }
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        if (z) {
            Log.d(TAG, " over send pcm data---------------------------", new Object[0]);
            byte[] bArrByteCombineAll = byteCombineAll(this.result);
            AudioBufferManager audioBufferManager = new AudioBufferManager();
            opusCode(bArrByteCombineAll, audioBufferManager);
            this.mTransfer.sendCmd(audioBufferManager.getAudioBuffer());
            this.result.clear();
            return;
        }
        this.result.add(bArr);
        if (this.result.size() == 10) {
            byte[] bArrByteCombineAll2 = byteCombineAll(this.result);
            AudioBufferManager audioBufferManager2 = new AudioBufferManager();
            opusCode(bArrByteCombineAll2, audioBufferManager2);
            Log.d(TAG, "not over send pcm data---------------------------", new Object[0]);
            this.mTransfer.sendCmd(audioBufferManager2.getAudioBuffer());
            this.result.clear();
        }
    }

    public void releaseEngine() {
        this.mMiAiEngine.release();
        LocalBroadcastManager.getInstance(this.mContext).unregisterReceiver(this.mLogTokenReceiver);
    }

    public void updateThirdToken() {
        new Thread() { // from class: com.huami.watch.companion.xiaomiai.EngineProcessor.3
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                if (AccountManager.getDefault(EngineProcessor.this.mContext).getUserInfo() == null) {
                    return;
                }
                ThirdPartyToken miToken = AccountMiTokenUtil.getMiToken(EngineProcessor.this.mContext);
                Message messageObtain = Message.obtain();
                messageObtain.obj = miToken;
                messageObtain.what = 51;
                EngineProcessor.this.sendMessage(messageObtain);
            }
        }.start();
    }

    public void xiamiDot() {
    }

    public void doListeningSpeech(FileDescriptor fileDescriptor, JSONObject jSONObject, JSONObject jSONObject2) {
        this.isOlderVoice = false;
        Log.d(TIME_TAG, "====receive audio file ====", new Object[0]);
        AsrRequest asrRequest = new AsrRequest();
        NlpRequest nlpRequest = new NlpRequest();
        if (jSONObject == null) {
            String string = this.mContext.getSharedPreferences(VoiceProtocol.HUAMI_CMD_KEY, 0).getString(VoiceProtocol.HUAMI_CMD_REQUEIRED_CONTEXT, "");
            if (!TextUtils.isEmpty(string)) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException e) {
                    Log.e(TAG, VoiceProtocol.HUAMI_CMD_REQUEIRED_CONTEXT + e.toString(), e, new Object[0]);
                }
            }
        }
        NlpListenerObject nlpListenerObject = this.mNlpListener;
        if (nlpListenerObject != null && nlpListenerObject.hasError()) {
            nlpRequest.startNewSession();
            this.mNlpListener.setError(false);
        }
        if (DeviceUtil.isRomSupportMiotToken(this.mContext)) {
            nlpRequest.setUserInfo(getNlpRequestUserInfo());
            Log.d(TAG, "version is supported token", new Object[0]);
        } else {
            infalteContextJson(nlpRequest, jSONObject);
            Log.d(TAG, "version is not supported token", new Object[0]);
        }
        infalteContextJson(nlpRequest, jSONObject2);
        asrRequest.setDataInputMode(AsrRequest.DataInputMode.DATA_INPUT_MODE_BUFFER);
        SpeechEngine.ParamBuilder paramBuilder = new SpeechEngine.ParamBuilder();
        paramBuilder.needAsr().setAsrRequest(asrRequest).needNlp().setNlpRequest(nlpRequest);
        this.mMiAiEngine.startIntegrally(paramBuilder);
        Log.d(TIME_TAG, "====request xiaomi ai server ====", new Object[0]);
    }
}
