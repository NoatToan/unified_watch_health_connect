package com.xiaomi.ai;

import android.content.Context;
import android.media.AudioTrack;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.watch.companion.xiaomiai.VoiceProtocol;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.ai.mibrain.MibrainRequestParamsBuilder;
import com.xiaomi.ai.utils.DeviceUtils;
import com.xiaomi.ai.utils.Log;
import com.xiaomi.ai.utils.UploadHelper;
import com.xiaomi.hm.health.speech.utils.JsonParseUtils;
import java.util.ArrayList;
import org.cybergarage.upnp.std.av.server.ContentDirectory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public abstract class SpeechEngine {
    public static final int ENGINE_MI_AI = 1;
    public static final int ENV_PREVIEW = 1;
    public static final int ENV_PRODUCTION = 0;
    public static final int ENV_PRODUCTION_SGP = 3;
    public static final int ENV_STAGING = 2;
    public static final int EVENT_TRACK_RECEIVER_DEFALUT = 0;
    public static final int EVENT_TRACK_RECEIVER_UPSTREAM = 128;
    public static final int STREAMING_PLAYER_DEFAULT = 1;
    public static final int STREAMING_PLAYER_GET_PCM = 2;
    private static final String TAG = "MiSpeechSDK:SpeechEngine";
    public static final int USE_ANONYMOUS = 1;
    public static final int USE_ANONYMOUS_PROXY = 2;
    public String mAppId;
    public AsrListener mAsrListener;
    public int mAuthMode;
    private BluetoothManager mBluetoothManager;
    public Context mContext;
    public String mDeviceModel;
    public EventTrackListener mEventTrackListener;
    public InstructionListener mInstructionListener;
    private boolean mIsScoEnable;
    public NlpListener mNlpListener;
    public MiAiOauthCallbacks mOauthListener;
    public String mRedirectUrl;
    public q mResultParser;
    public ServiceEventListener mServiceEventListener;
    public SpeechError mSpeechError;
    public String mToken;
    public com.xiaomi.ai.utils.k mTrackUtils;
    public TtsListener mTtsListener;
    public NeedUpdateTokenCallback mUpdateTokenCallback;
    public String mUserAgent;
    public VoiceprintDeleteListener mVPDelListener;
    public VoiceprintRecognizeListener mVPListener;
    public VoiceprintQueryListener mVPQryListener;
    public VoiceprintRegisterListener mVPRListener;
    public static final int ENGINE_AUTH_APPIDTOKEN = MibrainRequestParamsBuilder.MIBRAIN_AUTH_APPIDTOKEN;
    public static final int ENGINE_AUTH_MIOT = MibrainRequestParamsBuilder.MIBRAIN_AUTH_MIOTTOKEN;
    public static final int ENGINE_AUTH_MIAI = MibrainRequestParamsBuilder.MIBRAIN_AUTH_MIAITOKEN;
    public static final int ENGINE_AUTH_TP = MibrainRequestParamsBuilder.MIBRAIN_AUTH_TPTOKEN;
    public static final int ENGINE_AUTH_MIAO = MibrainRequestParamsBuilder.MIBRAIN_AUTH_MIAOTOKEN;
    public static final int ENGINE_AUTH_ANONYMOUS = MibrainRequestParamsBuilder.MIBRAIN_AUTH_ANONYMOUS;
    public static final int ENGINE_AUTH_ANONYMOUS_PROXY = MibrainRequestParamsBuilder.MIBRAIN_AUTH_ANONYMOUS_PROXY;
    public int mStreamType = 3;
    public String mProtocolVersion = "1.0.5";
    public int mStartEventTrack = 1;
    public int mConnectTimeout = 5;
    public int mReceiveTimeout = 10;
    public int mUploadTimeout = 4;
    public int mActiveTimeout = 10;
    public int mEventTrackReceiver = 0;
    public int mUseExternalOAuthToken = 0;

    public static class ParamBuilder {
        public static final int EVENT_LEVEL_DEBUG = 2;
        public static final int EVENT_LEVEL_INFO = 1;
        public static final int EVENT_LEVEL_WARN = 0;
        public String apiKey;
        public AsrRequest asrRequest;
        public EventRequest eventRequest;
        public int mEventLevel = 1;
        public boolean needAsr;
        public boolean needEvent;
        public boolean needExtraNlp;
        public boolean needNlp;
        public boolean needTts;
        public boolean needVpDel;
        public boolean needVpQry;
        public boolean needVpRec;
        public boolean needVpReg;
        public boolean needWakeupData;
        public NlpRequest nlpRequest;
        public TtsRequest ttsRequest;
        public VoiceprintDeleteRequest voiceprintDeleteRequest;
        public VoiceprintQueryRequest voiceprintQueryRequest;
        public VoiceprintRecognizeRequest voiceprintRecognizeRequest;
        public VoiceprintRegisterRequest voiceprintRegisterRequest;
        public byte[] wakeupData;
        public String wakeupInfoString;

        public ParamBuilder needAsr() {
            needAsr(true);
            return this;
        }

        public ParamBuilder needAsr(boolean z) {
            this.needAsr = z;
            return this;
        }

        public ParamBuilder needEvent() {
            this.needEvent = true;
            return this;
        }

        public ParamBuilder needEvent(boolean z) {
            this.needEvent = z;
            return this;
        }

        public ParamBuilder needNlp() {
            needNlp(true);
            return this;
        }

        public ParamBuilder needNlp(boolean z) {
            this.needNlp = z;
            return this;
        }

        public ParamBuilder needTts() {
            needTts(true);
            return this;
        }

        public ParamBuilder needTts(boolean z) {
            this.needTts = z;
            return this;
        }

        public ParamBuilder needWakeupData() {
            needWakeupData(true);
            return this;
        }

        public ParamBuilder needWakeupData(boolean z) {
            this.needWakeupData = z;
            return this;
        }

        public ParamBuilder setApiKey(String str) {
            this.apiKey = str;
            return this;
        }

        public ParamBuilder setAsrRequest(AsrRequest asrRequest) {
            this.asrRequest = asrRequest;
            return this;
        }

        public ParamBuilder setEventLevel(int i) {
            this.mEventLevel = i;
            return this;
        }

        public ParamBuilder setEventRequest(EventRequest eventRequest) {
            this.eventRequest = eventRequest;
            return this;
        }

        public ParamBuilder setNlpRequest(NlpRequest nlpRequest) {
            this.nlpRequest = nlpRequest;
            return this;
        }

        public ParamBuilder setTtsRequest(TtsRequest ttsRequest) {
            this.ttsRequest = ttsRequest;
            return this;
        }

        public ParamBuilder setWakeupData(byte[] bArr) {
            this.wakeupData = bArr;
            return this;
        }

        public ParamBuilder setWakeupInfo(UploadHelper.WakeupDataInfo wakeupDataInfo) {
            this.wakeupInfoString = UploadHelper.generateWakeupDataMessage(wakeupDataInfo);
            return this;
        }
    }

    public enum ProcessStage {
        STAGE_REQUESTING,
        STAGE_ASR,
        STAGE_NLP,
        STAGE_TTS,
        STAGE_VP_REG,
        STAGE_VP,
        STAGE_VP_DEL,
        STAGE_VP_QRY,
        STAGE_EVENT,
        STAGE_IDLE
    }

    public static class ResultParser extends q {
        @Override // com.xiaomi.ai.q
        public SpeechResult getAsrResult(JSONObject jSONObject) throws JSONException {
            SpeechResult speechResult = new SpeechResult();
            JSONObject jSONObject2 = jSONObject.getJSONObject(AbstractJSONTokenResponse.RESPONSE);
            JSONArray jSONArray = jSONObject2.getJSONArray("queries");
            if (jSONArray != null && jSONArray.length() > 0) {
                speechResult.query = jSONObject2.getJSONArray("queries").getJSONObject(0).getString("query");
                speechResult.response = jSONObject2.toString();
            }
            speechResult.requestId = jSONObject.getJSONObject("meta").getString("request_id");
            return speechResult;
        }

        @Override // com.xiaomi.ai.q
        public Instruction[] getInstruction(JSONObject jSONObject) throws JSONException {
            String str;
            if (!jSONObject.has(AbstractJSONTokenResponse.RESPONSE)) {
                return null;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(AbstractJSONTokenResponse.RESPONSE);
            if (!jSONObject2.has("instructions")) {
                return null;
            }
            JSONArray jSONArray = jSONObject2.getJSONArray("instructions");
            if (jSONArray != null) {
                ArrayList arrayList = new ArrayList(jSONArray.length());
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        arrayList.add(APIUtils.readInstruction(jSONArray.get(i).toString()));
                    } catch (Exception e) {
                        Log.e(SpeechEngine.TAG, "getInstruction: failed to readInstruction, " + jSONArray.get(i).toString());
                        e.printStackTrace();
                    }
                }
                if (!arrayList.isEmpty()) {
                    return (Instruction[]) arrayList.toArray(new Instruction[arrayList.size()]);
                }
                str = "getInstruction: instruction array is empty";
            } else {
                str = "getInstruction: no instructions";
            }
            Log.e(SpeechEngine.TAG, str);
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0067  */
        @Override // com.xiaomi.ai.q
        public SpeechResult getNlpResult(JSONObject jSONObject) throws JSONException {
            JSONObject jSONObject2;
            String str;
            String strOptString;
            SpeechResult speechResult = new SpeechResult();
            JSONObject jSONObject3 = jSONObject.getJSONObject(AbstractJSONTokenResponse.RESPONSE);
            double d = jSONObject3.getDouble("version");
            Object obj = jSONObject3.get(VoiceProtocol.ANSWER);
            if (obj instanceof JSONArray) {
                jSONObject2 = ((JSONArray) obj).getJSONObject(0);
            } else {
                jSONObject2 = obj instanceof JSONObject ? (JSONObject) obj : null;
            }
            JSONObject jSONObject4 = jSONObject2.getJSONObject(VoiceProtocol.INTENTION);
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("content");
            String strOptString2 = jSONObject3.optString("session_id");
            String strOptString3 = jSONObject2.optString("action");
            String strOptString4 = jSONObject2.optString("domain");
            String string = jSONObject2.toString();
            String strOptString5 = jSONObject2.optString("text");
            String strOptString6 = jSONObject4.optString("query");
            if (d >= 2.2d) {
                if (jSONObjectOptJSONObject == null) {
                    strOptString = null;
                } else {
                    str = "to_speak";
                    strOptString = jSONObjectOptJSONObject.optString(str);
                }
            } else if (jSONObjectOptJSONObject == null) {
                strOptString = null;
            } else {
                str = VoiceProtocol.TOSPEAK;
                strOptString = jSONObjectOptJSONObject.optString(str);
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject == null ? null : jSONObjectOptJSONObject.optJSONObject("to_display");
            String strOptString7 = jSONObjectOptJSONObject2 == null ? null : jSONObjectOptJSONObject2.optString("text");
            int iOptInt = jSONObjectOptJSONObject2 == null ? Integer.MIN_VALUE : jSONObjectOptJSONObject2.optInt("duration", Integer.MIN_VALUE);
            int iOptInt2 = jSONObjectOptJSONObject == null ? 0 : jSONObjectOptJSONObject.optInt(JsonParseUtils.JSON_KEY_UNKNOWN_DOMAIN_ACTION);
            boolean zOptBoolean = jSONObjectOptJSONObject == null ? false : jSONObjectOptJSONObject.optBoolean("open_mic", false);
            String strOptString8 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("directive") : null;
            int iOptInt3 = jSONObjectOptJSONObject == null ? Integer.MIN_VALUE : jSONObjectOptJSONObject.optInt("vad_idle", Integer.MIN_VALUE);
            speechResult.answerText = strOptString5;
            speechResult.query = strOptString6;
            speechResult.intention = jSONObject4.toString();
            speechResult.content = jSONObjectOptJSONObject == null ? null : jSONObjectOptJSONObject.toString();
            speechResult.requestId = jSONObject.getJSONObject("meta").getString("request_id");
            speechResult.sessionId = strOptString2;
            speechResult.domain = strOptString4;
            speechResult.action = strOptString3;
            speechResult.response = jSONObject3.toString();
            speechResult.answer = string;
            speechResult.toSpeak = strOptString;
            speechResult.toDisplay = strOptString7;
            speechResult.displayDuration = iOptInt;
            speechResult.openMic = zOptBoolean;
            speechResult.directive = strOptString8;
            speechResult.unknownDomainAction = iOptInt2;
            speechResult.vadIdle = iOptInt3;
            return speechResult;
        }

        @Override // com.xiaomi.ai.q
        public SpeechResult getVoiceDelResult(JSONObject jSONObject) throws JSONException {
            SpeechResult speechResult = new SpeechResult();
            JSONObject jSONObject2 = jSONObject.getJSONObject(AbstractJSONTokenResponse.RESPONSE);
            speechResult.deleteSuccess = jSONObject2.optBoolean("is_success", false);
            speechResult.extraMessage = jSONObject2.optString("error_msg");
            speechResult.requestId = jSONObject.getJSONObject("meta").getString("request_id");
            return speechResult;
        }

        @Override // com.xiaomi.ai.q
        public SpeechResult getVoiceQryResult(JSONObject jSONObject) throws JSONException {
            SpeechResult speechResult = new SpeechResult();
            JSONObject jSONObject2 = jSONObject.getJSONObject(AbstractJSONTokenResponse.RESPONSE);
            JSONArray jSONArray = jSONObject2.getJSONArray("result");
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null && jSONArray.length() > 0) {
                JSONArray jSONArrayOptJSONArray = jSONArray.getJSONObject(0).optJSONArray("members");
                if (jSONArrayOptJSONArray != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        arrayList.add(jSONArrayOptJSONArray.getString(i));
                    }
                }
            }
            speechResult.extraMessage = jSONObject2.optString("error_msg");
            speechResult.voiceUserIds = arrayList;
            speechResult.requestId = jSONObject.getJSONObject("meta").getString("request_id");
            return speechResult;
        }

        @Override // com.xiaomi.ai.q
        public SpeechResult getVoiceRecResult(JSONObject jSONObject) throws JSONException {
            SpeechResult speechResult = new SpeechResult();
            JSONObject jSONObject2 = jSONObject.getJSONObject(AbstractJSONTokenResponse.RESPONSE);
            JSONArray jSONArray = jSONObject2.getJSONArray("result");
            if (jSONArray != null && jSONArray.length() > 0) {
                speechResult.voiceUserId = jSONArray.getJSONObject(0).getString("role");
            }
            speechResult.extraMessage = jSONObject2.optString("error_msg");
            speechResult.requestId = jSONObject.getJSONObject("meta").getString("request_id");
            return speechResult;
        }

        @Override // com.xiaomi.ai.q
        public SpeechResult getVoiceRegResult(JSONObject jSONObject) throws JSONException {
            SpeechResult speechResult = new SpeechResult();
            JSONObject jSONObject2 = jSONObject.getJSONObject(AbstractJSONTokenResponse.RESPONSE);
            speechResult.regSuccess = jSONObject2.optBoolean("is_success", false);
            speechResult.isRegFinal = "RESULT_VOR_REG_FINAL".equals(jSONObject.getJSONObject("meta").getString("type"));
            speechResult.extraMessage = jSONObject2.optString("error_msg");
            speechResult.requestId = jSONObject.optJSONObject("meta").getString("request_id");
            return speechResult;
        }
    }

    public SpeechEngine(Context context, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.mAppId = str;
        this.mToken = str2;
        this.mTrackUtils = new com.xiaomi.ai.utils.k(str, DeviceUtils.getDeviceId(applicationContext));
    }

    public static SpeechEngine createEngine(Context context, int i, String str) {
        c cVar = i != 1 ? null : new c(context, str, null);
        if (cVar != null) {
            cVar.init(context, null, ENGINE_AUTH_MIOT);
        }
        return cVar;
    }

    @Deprecated
    public static SpeechEngine createEngine(Context context, int i, String str, String str2) {
        c cVar = i != 1 ? null : new c(context, str, str2);
        if (cVar != null) {
            cVar.init(context, null, ENGINE_AUTH_APPIDTOKEN);
        }
        return cVar;
    }

    public static SpeechEngine createEngine(Context context, int i, String str, String str2, String str3) {
        c cVar = i != 1 ? null : new c(context, str, str2);
        if (cVar != null) {
            cVar.init(context, str3, ENGINE_AUTH_MIAI);
        }
        return cVar;
    }

    public static SpeechEngine createEngine(Context context, int i, String str, String str2, String str3, int i2) {
        int i3;
        Log.d("SpeechEngine", "use anonymous mode " + i2);
        c cVar = i != 1 ? null : new c(context, str, str2);
        if (cVar != null) {
            if (i2 == 1) {
                i3 = ENGINE_AUTH_ANONYMOUS;
            } else {
                if (i2 != 2) {
                    return null;
                }
                if (!context.getPackageName().equals("com.xiaomi.mibrain.speech") && !context.getPackageName().equals("com.xiaomi.mibrain.demo")) {
                    Log.e(ContentDirectory.ERROR, "illegal call");
                    return null;
                }
                i3 = ENGINE_AUTH_ANONYMOUS_PROXY;
            }
            cVar.init(context, str3, i3);
            cVar.setAnonymousAuthCallbacks(new o());
        }
        return cVar;
    }

    public static SpeechEngine createEngine(Context context, int i, String str, String str2, String str3, boolean z) {
        int i2;
        c cVar = i != 1 ? null : new c(context, str, str2);
        if (z) {
            if (cVar != null) {
                i2 = ENGINE_AUTH_MIAO;
                cVar.init(context, str3, i2);
            }
        } else if (cVar != null) {
            i2 = ENGINE_AUTH_MIAI;
            cVar.init(context, str3, i2);
        }
        return cVar;
    }

    public static SpeechEngine createEngine(Context context, int i, String str, boolean z) {
        c cVar = i != 1 ? null : new c(context, str, null);
        if (cVar != null) {
            cVar.init(context, null, z ? ENGINE_AUTH_TP : ENGINE_AUTH_MIOT);
        }
        return cVar;
    }

    public static int getSDKVersionCode() {
        return BuildConfig.VERSION_CODE;
    }

    public static String getSDKVersionName() {
        return BuildConfig.VERSION_NAME;
    }

    public abstract void addBuffer(byte[] bArr, int i, int i2);

    public abstract void addNlpData(JSONObject jSONObject);

    public abstract void addVADBegin();

    public abstract void cancelTTS();

    public abstract void cleanAllUserLoginData();

    public abstract void cleanUserLoginData();

    public abstract void cleanUserLoginData(String str);

    public final void deleteVoiceprint(VoiceprintDeleteRequest voiceprintDeleteRequest) {
        forceStop();
        doDeleteVoiceprint(voiceprintDeleteRequest);
    }

    public abstract void doAsyncTrackUpload(HTTPCallback hTTPCallback, TrackInfo trackInfo, String str);

    public abstract void doAsyncTrackUpload(TrackInfo trackInfo, String str);

    public abstract void doDeleteVoiceprint(VoiceprintDeleteRequest voiceprintDeleteRequest);

    public abstract void doListenSpeech(AsrRequest asrRequest);

    public abstract void doQueryVoiceprint(VoiceprintQueryRequest voiceprintQueryRequest);

    public abstract void doSemanticsParse(NlpRequest nlpRequest);

    public abstract void doSpeak(TtsRequest ttsRequest);

    public abstract void doStartIntegrally(ParamBuilder paramBuilder);

    public abstract void doVoiceprintRecognize(VoiceprintRecognizeRequest voiceprintRecognizeRequest);

    public abstract void doVoiceprintRegister(VoiceprintRegisterRequest voiceprintRegisterRequest);

    public void enableScoCheck(boolean z) {
        this.mIsScoEnable = z;
        if (!z) {
            BluetoothManager bluetoothManager = this.mBluetoothManager;
            if (bluetoothManager != null) {
                bluetoothManager.unregister();
                return;
            }
            return;
        }
        if (this.mBluetoothManager == null) {
            BluetoothManager bluetoothManager2 = BluetoothManager.getInstance(this.mContext);
            this.mBluetoothManager = bluetoothManager2;
            bluetoothManager2.register();
        }
    }

    public void endSpeech() {
    }

    public abstract void endVoiceprintRecognize();

    public abstract void endVoiceprintRegister();

    public void forceStop() {
        this.mSpeechError = null;
    }

    public abstract String getAuthorizationValue();

    public abstract String getAuthorizationValue(boolean z);

    public SpeechError getError() {
        return this.mSpeechError;
    }

    public final ProcessStage getNextStage(ParamBuilder paramBuilder, ProcessStage processStage) {
        if (processStage == ProcessStage.STAGE_REQUESTING) {
            if (paramBuilder.needAsr) {
                return ProcessStage.STAGE_ASR;
            }
            if (paramBuilder.needNlp) {
                return ProcessStage.STAGE_NLP;
            }
            if (paramBuilder.needTts) {
                return ProcessStage.STAGE_TTS;
            }
            if (paramBuilder.needVpRec) {
                return ProcessStage.STAGE_VP;
            }
            if (paramBuilder.needVpReg) {
                return ProcessStage.STAGE_VP_REG;
            }
            return paramBuilder.needVpDel ? ProcessStage.STAGE_VP_DEL : ProcessStage.STAGE_VP_QRY;
        }
        if (processStage == ProcessStage.STAGE_ASR) {
            if (paramBuilder.needNlp) {
                return ProcessStage.STAGE_NLP;
            }
            if (paramBuilder.needTts) {
                return ProcessStage.STAGE_TTS;
            }
        } else if (processStage != ProcessStage.STAGE_NLP) {
            ProcessStage processStage2 = ProcessStage.STAGE_VP_REG;
            if (processStage == processStage2) {
                return processStage2;
            }
        } else if (paramBuilder.needTts) {
            return ProcessStage.STAGE_TTS;
        }
        return ProcessStage.STAGE_IDLE;
    }

    public abstract boolean getOAuthStatus();

    public abstract String getResourceDetails(String str, String str2);

    public abstract UploadHelper getUploadHelper(SendWakeupDataStatusInterface sendWakeupDataStatusInterface);

    public boolean hasError() {
        return this.mSpeechError != null;
    }

    public void init(Context context, String str, int i) {
        Log.init(context);
        this.mRedirectUrl = str;
        this.mAuthMode = i;
    }

    public final void listenSpeech(AsrRequest asrRequest) {
        forceStop();
        doListenSpeech(asrRequest);
    }

    public void notifyAsrBeginningOfSpeech() {
        BluetoothManager bluetoothManager;
        Log.e(TAG, "mIsScoEnable" + this.mIsScoEnable);
        if (this.mIsScoEnable && (bluetoothManager = this.mBluetoothManager) != null) {
            bluetoothManager.setBluetoothOn(true);
        }
        AsrListener asrListener = this.mAsrListener;
        if (asrListener != null) {
            asrListener.onBeginningOfSpeech();
        }
    }

    public void notifyAsrBufferReceived(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        this.mAsrListener.onBufferReceived(bArr);
    }

    public void notifyAsrEndOfSpeech() {
        BluetoothManager bluetoothManager;
        Log.e(TAG, "notifyAsrEndOfSpeech:=" + this.mIsScoEnable);
        if (this.mIsScoEnable && (bluetoothManager = this.mBluetoothManager) != null) {
            bluetoothManager.setBluetoothOn(false);
        }
        AsrListener asrListener = this.mAsrListener;
        if (asrListener != null) {
            asrListener.onEndOfSpeech();
        }
    }

    public void notifyAsrError(SpeechError speechError) {
        AsrListener asrListener = this.mAsrListener;
        if (asrListener != null) {
            asrListener.onError(speechError);
        }
    }

    public void notifyAsrEvent() {
        AsrListener asrListener = this.mAsrListener;
        if (asrListener != null) {
            asrListener.onEvent();
        }
    }

    public void notifyAsrFileStored(String str, String str2) {
        AsrListener asrListener = this.mAsrListener;
        if (asrListener != null) {
            asrListener.onFileStored(str, str2);
        }
    }

    public void notifyAsrParticalResults(SpeechResult speechResult) {
        AsrListener asrListener = this.mAsrListener;
        if (asrListener != null) {
            asrListener.onPartialResults(speechResult);
        }
    }

    public void notifyAsrReadyForSpeech() {
        AsrListener asrListener = this.mAsrListener;
        if (asrListener != null) {
            asrListener.onReadyForSpeech();
        }
    }

    public void notifyAsrResults(SpeechResult speechResult) {
        AsrListener asrListener = this.mAsrListener;
        if (asrListener != null) {
            asrListener.onResults(speechResult);
        }
    }

    public void notifyAsrRmsChanged(float f) {
        AsrListener asrListener = this.mAsrListener;
        if (asrListener != null) {
            asrListener.onRmsChanged(f);
        }
    }

    public void notifyError(ParamBuilder paramBuilder, SpeechError speechError) {
        Log.e(TAG, "notifyError: " + speechError + "state" + speechError.stage);
        this.mSpeechError = speechError;
        ProcessStage processStage = speechError.stage;
        if (processStage == ProcessStage.STAGE_REQUESTING) {
            speechError.stage = getNextStage(paramBuilder, processStage);
        }
        switch (p.a[speechError.stage.ordinal()]) {
            case 1:
                notifyAsrError(speechError);
                break;
            case 2:
                notifyNlpError(speechError);
                break;
            case 3:
                notifyTtsError(speechError);
                break;
            case 4:
                notifyVoiceRecError(speechError);
                break;
            case 5:
                notifyVoiceRegError(speechError);
                break;
            case 6:
                notifyVoiceDelError(speechError);
                break;
            case 7:
                notifyVoiceQryError(speechError);
                break;
        }
    }

    public void notifyEventTrack(String str) {
        EventTrackListener eventTrackListener = this.mEventTrackListener;
        if (eventTrackListener != null) {
            eventTrackListener.onEventTrack(str);
        }
    }

    public void notifyInstruction(Instruction[] instructionArr, SpeechResult speechResult) {
        InstructionListener instructionListener = this.mInstructionListener;
        if (instructionListener != null) {
            instructionListener.onInstruction(instructionArr, speechResult);
        }
    }

    public void notifyNlpError(SpeechError speechError) {
        NlpListener nlpListener = this.mNlpListener;
        if (nlpListener != null) {
            nlpListener.onError(speechError);
        }
    }

    public void notifyNlpResults(SpeechResult speechResult) {
        NlpListener nlpListener = this.mNlpListener;
        if (nlpListener != null) {
            nlpListener.onResult(speechResult);
        }
    }

    public void notifyServiceEvent(ServiceEvent serviceEvent) {
        ServiceEventListener serviceEventListener = this.mServiceEventListener;
        if (serviceEventListener != null) {
            serviceEventListener.onEvent(serviceEvent);
        }
    }

    public void notifyTtsError(SpeechError speechError) {
        TtsListener ttsListener = this.mTtsListener;
        if (ttsListener != null) {
            ttsListener.onError(speechError);
        }
    }

    public void notifyTtsGotUrl(String str) {
        TtsListener ttsListener = this.mTtsListener;
        if (ttsListener != null) {
            ttsListener.onTtsGotURL(str);
        }
    }

    public void notifyTtsPCMData(PCMInfo pCMInfo) {
        TtsListener ttsListener = this.mTtsListener;
        if (ttsListener != null) {
            ttsListener.onPCMData(pCMInfo);
        }
    }

    public void notifyTtsPlayFinish() {
        TtsListener ttsListener = this.mTtsListener;
        if (ttsListener != null) {
            ttsListener.onPlayFinish();
        }
    }

    public void notifyTtsPlayStart(AudioTrack audioTrack) {
        TtsListener ttsListener = this.mTtsListener;
        if (ttsListener != null) {
            ttsListener.onPlayStart(audioTrack);
        }
    }

    public void notifyTtsTransEnd(boolean z) {
        TtsListener ttsListener = this.mTtsListener;
        if (ttsListener != null) {
            ttsListener.onTtsTransEnd(z);
        }
    }

    public void notifyTtsTransStart() {
        TtsListener ttsListener = this.mTtsListener;
        if (ttsListener != null) {
            ttsListener.onTtsTransStart();
        }
    }

    public void notifyVoiceDelError(SpeechError speechError) {
        VoiceprintDeleteListener voiceprintDeleteListener = this.mVPDelListener;
        if (voiceprintDeleteListener != null) {
            voiceprintDeleteListener.onError(speechError);
        }
    }

    public void notifyVoiceDelResults(SpeechResult speechResult) {
        VoiceprintDeleteListener voiceprintDeleteListener = this.mVPDelListener;
        if (voiceprintDeleteListener != null) {
            voiceprintDeleteListener.onResults(speechResult);
        }
    }

    public void notifyVoiceQryError(SpeechError speechError) {
        VoiceprintQueryListener voiceprintQueryListener = this.mVPQryListener;
        if (voiceprintQueryListener != null) {
            voiceprintQueryListener.onError(speechError);
        }
    }

    public void notifyVoiceQryResults(SpeechResult speechResult) {
        VoiceprintQueryListener voiceprintQueryListener = this.mVPQryListener;
        if (voiceprintQueryListener != null) {
            voiceprintQueryListener.onResults(speechResult);
        }
    }

    public void notifyVoiceRecBeginningOfSpeech() {
        BluetoothManager bluetoothManager;
        if (this.mIsScoEnable && (bluetoothManager = this.mBluetoothManager) != null) {
            bluetoothManager.setBluetoothOn(true);
        }
        VoiceprintRecognizeListener voiceprintRecognizeListener = this.mVPListener;
        if (voiceprintRecognizeListener != null) {
            voiceprintRecognizeListener.onBeginningOfDataInput();
        }
    }

    public void notifyVoiceRecBufferReceived(byte[] bArr) {
        VoiceprintRecognizeListener voiceprintRecognizeListener;
        if (bArr == null || (voiceprintRecognizeListener = this.mVPListener) == null) {
            return;
        }
        voiceprintRecognizeListener.onBufferReceived(bArr);
    }

    public void notifyVoiceRecEndOfSpeech() {
        BluetoothManager bluetoothManager;
        if (this.mIsScoEnable && (bluetoothManager = this.mBluetoothManager) != null) {
            bluetoothManager.setBluetoothOn(false);
        }
        VoiceprintRecognizeListener voiceprintRecognizeListener = this.mVPListener;
        if (voiceprintRecognizeListener != null) {
            voiceprintRecognizeListener.onEndOfDataInput();
        }
    }

    public void notifyVoiceRecError(SpeechError speechError) {
        VoiceprintRecognizeListener voiceprintRecognizeListener = this.mVPListener;
        if (voiceprintRecognizeListener != null) {
            voiceprintRecognizeListener.onError(speechError);
        }
    }

    public void notifyVoiceRecResults(SpeechResult speechResult) {
        VoiceprintRecognizeListener voiceprintRecognizeListener = this.mVPListener;
        if (voiceprintRecognizeListener != null) {
            voiceprintRecognizeListener.onResults(speechResult);
        }
    }

    public void notifyVoiceRecRmsChanged(float f) {
        VoiceprintRecognizeListener voiceprintRecognizeListener = this.mVPListener;
        if (voiceprintRecognizeListener != null) {
            voiceprintRecognizeListener.onRmsChanged(f);
        }
    }

    public void notifyVoiceRegBeginningOfSpeech() {
        BluetoothManager bluetoothManager;
        if (this.mIsScoEnable && (bluetoothManager = this.mBluetoothManager) != null) {
            bluetoothManager.setBluetoothOn(true);
        }
        VoiceprintRegisterListener voiceprintRegisterListener = this.mVPRListener;
        if (voiceprintRegisterListener != null) {
            voiceprintRegisterListener.onBeginningOfDataInput();
        }
    }

    public void notifyVoiceRegBufferReceived(byte[] bArr) {
        VoiceprintRegisterListener voiceprintRegisterListener;
        if (bArr == null || (voiceprintRegisterListener = this.mVPRListener) == null) {
            return;
        }
        voiceprintRegisterListener.onBufferReceived(bArr);
    }

    public void notifyVoiceRegEndOfSpeech() {
        BluetoothManager bluetoothManager;
        if (this.mIsScoEnable && (bluetoothManager = this.mBluetoothManager) != null) {
            bluetoothManager.setBluetoothOn(false);
        }
        VoiceprintRegisterListener voiceprintRegisterListener = this.mVPRListener;
        if (voiceprintRegisterListener != null) {
            voiceprintRegisterListener.onEndOfDataInput();
        }
    }

    public void notifyVoiceRegError(SpeechError speechError) {
        VoiceprintRegisterListener voiceprintRegisterListener = this.mVPRListener;
        if (voiceprintRegisterListener != null) {
            voiceprintRegisterListener.onError(speechError);
        }
    }

    public void notifyVoiceRegResults(SpeechResult speechResult) {
        VoiceprintRegisterListener voiceprintRegisterListener = this.mVPRListener;
        if (voiceprintRegisterListener != null) {
            voiceprintRegisterListener.onResults(speechResult);
        }
    }

    public void notifyVoiceRegRmsChanged(float f) {
        VoiceprintRegisterListener voiceprintRegisterListener = this.mVPRListener;
        if (voiceprintRegisterListener != null) {
            voiceprintRegisterListener.onRmsChanged(f);
        }
    }

    public final void queryVoiceprint(VoiceprintQueryRequest voiceprintQueryRequest) {
        forceStop();
        doQueryVoiceprint(voiceprintQueryRequest);
    }

    public void release() {
        BluetoothManager bluetoothManager = this.mBluetoothManager;
        if (bluetoothManager != null) {
            bluetoothManager.unregister();
        }
    }

    public final void semanticsParse(NlpRequest nlpRequest) {
        forceStop();
        doSemanticsParse(nlpRequest);
    }

    public abstract int sendPendingNLPData(NlpRequest nlpRequest);

    public abstract void sendWakeupData(SendWakeupDataStatusInterface sendWakeupDataStatusInterface, String str, String str2, String str3, int i, int i2, String str4, byte[] bArr);

    public void setActiveTimeout(int i) {
        this.mActiveTimeout = i;
    }

    public void setAnonymousAuthCallbacks(MiAiOauthCallbacks miAiOauthCallbacks) {
        this.mOauthListener = miAiOauthCallbacks;
    }

    public void setAsrLisnter(AsrListener asrListener) {
        this.mAsrListener = asrListener;
    }

    public abstract boolean setAuthorizationTokens(String str, String str2, long j);

    public void setBluetoothOn(boolean z) {
        BluetoothManager bluetoothManager;
        if (!this.mIsScoEnable || (bluetoothManager = this.mBluetoothManager) == null) {
            return;
        }
        bluetoothManager.setBluetoothOn(z);
    }

    public void setConnectTimeout(int i) {
        this.mConnectTimeout = i;
    }

    public void setCustomNlpUrl(String str) {
    }

    public void setDeviceModel(String str) {
        this.mDeviceModel = str;
    }

    public void setEnv(int i) {
    }

    public void setEnv(int i, String str) {
    }

    public void setEnv(int i, String str, String str2) {
    }

    public void setEventTrackListener(EventTrackListener eventTrackListener) {
        this.mEventTrackListener = eventTrackListener;
    }

    public void setEventTrackReceiver(int i) {
        this.mEventTrackReceiver = i;
    }

    public abstract void setExternalOAuthToken(String str);

    public void setInstructionListener(InstructionListener instructionListener) {
        this.mInstructionListener = instructionListener;
    }

    public void setMiAIOauthCallbacks(MiAiOauthCallbacks miAiOauthCallbacks) {
        this.mOauthListener = miAiOauthCallbacks;
    }

    public void setMiAOOauthCallbacks(MiAiOauthCallbacks miAiOauthCallbacks) {
        this.mOauthListener = miAiOauthCallbacks;
    }

    public void setNlpListener(NlpListener nlpListener) {
        this.mNlpListener = nlpListener;
    }

    public void setProtocolVersion(String str) {
        this.mProtocolVersion = str;
    }

    public void setReceiveTimeout(int i) {
        this.mReceiveTimeout = i;
    }

    public void setServiceEventListener(ServiceEventListener serviceEventListener) {
        this.mServiceEventListener = serviceEventListener;
    }

    public void setStartEventTrack(boolean z) {
        this.mStartEventTrack = z ? 1 : 0;
    }

    public abstract void setTTSMode(int i);

    public abstract void setTrackUploadCallback(HTTPCallback hTTPCallback);

    public void setTtsAudioStreamType(int i) {
        this.mStreamType = i;
    }

    public abstract void setTtsEnable(boolean z);

    public void setTtsListener(TtsListener ttsListener) {
        this.mTtsListener = ttsListener;
    }

    public void setUpdateTokenCallback(NeedUpdateTokenCallback needUpdateTokenCallback) {
        this.mUpdateTokenCallback = needUpdateTokenCallback;
    }

    public void setUploadTimeout(int i) {
        this.mUploadTimeout = i;
    }

    public void setUseExternalOAuthToken(boolean z) {
        this.mUseExternalOAuthToken = z ? 1 : 0;
    }

    public void setUserAgent(String str) {
        Log.e("SET UA", str);
        this.mUserAgent = str;
    }

    public void setVoiceprintDeleteListener(VoiceprintDeleteListener voiceprintDeleteListener) {
        this.mVPDelListener = voiceprintDeleteListener;
    }

    public void setVoiceprintQueryListener(VoiceprintQueryListener voiceprintQueryListener) {
        this.mVPQryListener = voiceprintQueryListener;
    }

    public void setVoiceprintReconListener(VoiceprintRecognizeListener voiceprintRecognizeListener) {
        this.mVPListener = voiceprintRecognizeListener;
    }

    public void setVoiceprintRegistListener(VoiceprintRegisterListener voiceprintRegisterListener) {
        this.mVPRListener = voiceprintRegisterListener;
    }

    public final void speak(TtsRequest ttsRequest) {
        forceStop();
        doSpeak(ttsRequest);
    }

    public final void startIntegrally(ParamBuilder paramBuilder) {
        forceStop();
        doStartIntegrally(paramBuilder);
    }

    public abstract int startUploadASRRecord(SendWakeupDataStatusInterface sendWakeupDataStatusInterface, UploadHelper.ASRRecordInfo aSRRecordInfo, byte[] bArr);

    public abstract int startUploadWakeupData(SendWakeupDataStatusInterface sendWakeupDataStatusInterface, UploadHelper.WakeupDataInfo wakeupDataInfo, byte[] bArr);

    public abstract boolean updateAnonymousProxyArgs(String str, String str2, String str3, String str4, String str5, String str6);

    public void updateMiotAuth(String str, String str2) {
    }

    public void updateTPAuth(String str) {
    }

    public final void voicePrintRecognize(VoiceprintRecognizeRequest voiceprintRecognizeRequest) {
        forceStop();
        doVoiceprintRecognize(voiceprintRecognizeRequest);
    }

    public final void voiceprintRegister(VoiceprintRegisterRequest voiceprintRegisterRequest) {
        forceStop();
        doVoiceprintRegister(voiceprintRegisterRequest);
    }
}
