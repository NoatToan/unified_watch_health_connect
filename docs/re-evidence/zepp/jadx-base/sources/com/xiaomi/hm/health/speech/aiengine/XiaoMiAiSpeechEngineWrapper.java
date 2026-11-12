package com.xiaomi.hm.health.speech.aiengine;

import android.content.Context;
import android.media.AudioTrack;
import android.text.TextUtils;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.util.ThirdPartUtil;
import com.huami.watch.companion.xiaomiai.VoiceProtocol;
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
import com.xiaomi.ai.mibrain.Mibrainsdk;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.locweather.LocWeatherKeeper;
import com.xiaomi.hm.health.locweather.location.MyLocation;
import com.xiaomi.hm.health.speech.aiengine.XiaoMiAiSpeechEngineWrapper;
import com.xiaomi.hm.health.speech.constant.AiEngineAuthType;
import com.xiaomi.hm.health.speech.constant.AiEnginePlatform;
import com.xiaomi.hm.health.speech.constant.SpeechRequestStrategy;
import com.xiaomi.hm.health.speech.listener.SpeechListenerManager;
import com.xiaomi.hm.health.speech.utils.SpeechErrorShowUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class XiaoMiAiSpeechEngineWrapper extends BaseAiSpeechEngine {
    private static String o = "XiaoMiAiSpeechEngineWrapper";
    private static XiaoMiAiSpeechEngineWrapper p;
    private Context a;
    private AiEnginePlatform b;
    private SpeechEngine c;
    private String d;
    private String e;
    private SpeechEngine.ParamBuilder f;
    private AsrRequest g;
    private NlpRequest h;
    private TtsRequest i;
    private AsrListener j;
    private NlpListener k;
    private TtsListener l;
    private boolean m = false;
    private AtomicBoolean n = new AtomicBoolean(false);

    public class a extends AsrListener.SimpleAsrListener {
        public a() {
        }

        @Override // com.xiaomi.ai.AsrListener.SimpleAsrListener, com.xiaomi.ai.AsrListener
        public void onBeginningOfSpeech() {
        }

        @Override // com.xiaomi.ai.AsrListener.SimpleAsrListener, com.xiaomi.ai.AsrListener
        public void onBufferReceived(byte[] bytes) {
        }

        @Override // com.xiaomi.ai.AsrListener.SimpleAsrListener, com.xiaomi.ai.AsrListener
        public void onEndOfSpeech() {
        }

        @Override // com.xiaomi.ai.AsrListener.SimpleAsrListener, com.xiaomi.ai.AsrListener
        public void onError(SpeechError speechError) {
            HMLog.d(XiaoMiAiSpeechEngineWrapper.o, speechError.getErrCode() + "---------" + speechError.getErrMsg(), new Object[0]);
            SpeechListenerManager.getInstance().notifySpeechError(XiaoMiAiSpeechEngineWrapper.this.a);
            HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
            if (hMMiLiProDevice == null || !hMMiLiProDevice.isConnected()) {
                return;
            }
            if (NetUtil.isNetworkConnected(XiaoMiAiSpeechEngineWrapper.this.a)) {
                SpeechErrorShowUtils.showError(XiaoMiAiSpeechEngineWrapper.this.a, hMMiLiProDevice, 2);
            } else {
                SpeechErrorShowUtils.showError(XiaoMiAiSpeechEngineWrapper.this.a, hMMiLiProDevice, 0);
            }
            XiaoMiAiSpeechEngineWrapper.this.p(speechError);
        }

        @Override // com.xiaomi.ai.AsrListener.SimpleAsrListener, com.xiaomi.ai.AsrListener
        public void onEvent() {
        }

        @Override // com.xiaomi.ai.AsrListener.SimpleAsrListener, com.xiaomi.ai.AsrListener
        public void onFileStored(String s, String s1) {
        }

        @Override // com.xiaomi.ai.AsrListener.SimpleAsrListener, com.xiaomi.ai.AsrListener
        public void onPartialResults(SpeechResult speechResult) {
        }

        @Override // com.xiaomi.ai.AsrListener.SimpleAsrListener, com.xiaomi.ai.AsrListener
        public void onReadyForSpeech() {
        }

        @Override // com.xiaomi.ai.AsrListener.SimpleAsrListener, com.xiaomi.ai.AsrListener
        public void onResults(SpeechResult speechResult) {
            HMLog.d(XiaoMiAiSpeechEngineWrapper.o, speechResult.getQuery(), new Object[0]);
            SpeechListenerManager.getInstance().notifySpeechAsrResult(speechResult.getQuery());
            if (XiaoMiAiSpeechEngineWrapper.this.m) {
                SpeechListenerManager.getInstance().notifySpeechManualRequestEnd(XiaoMiAiSpeechEngineWrapper.this.a);
            } else {
                SpeechListenerManager.getInstance().notifySpeechVadDetectionEnd(XiaoMiAiSpeechEngineWrapper.this.a);
            }
            if (TextUtils.isEmpty(speechResult.getQuery())) {
                HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
                if (hMMiLiProDevice == null || !hMMiLiProDevice.isConnected()) {
                    return;
                } else {
                    SpeechErrorShowUtils.showError(XiaoMiAiSpeechEngineWrapper.this.a, hMMiLiProDevice, 1);
                }
            }
            XiaoMiAiSpeechEngineWrapper.this.p(speechResult);
        }

        @Override // com.xiaomi.ai.AsrListener.SimpleAsrListener, com.xiaomi.ai.AsrListener
        public void onRmsChanged(float v) {
        }
    }

    public class b implements NlpListener {
        public b() {
        }

        @Override // com.xiaomi.ai.NlpListener
        public void onError(SpeechError speechError) {
            XiaoMiAiSpeechEngineWrapper.this.p(speechError);
        }

        @Override // com.xiaomi.ai.NlpListener
        public void onResult(SpeechResult speechResult) {
            SpeechListenerManager.getInstance().notifySpeechAnswer(XiaoMiAiSpeechEngineWrapper.this.a, speechResult);
            XiaoMiAiSpeechEngineWrapper.this.p(speechResult);
        }
    }

    public class c implements TtsListener {
        public c() {
        }

        @Override // com.xiaomi.ai.TtsListener
        public void onError(SpeechError speechError) {
        }

        @Override // com.xiaomi.ai.TtsListener
        public void onPCMData(PCMInfo pcmInfo) {
        }

        @Override // com.xiaomi.ai.TtsListener
        public void onPlayFinish() {
        }

        @Override // com.xiaomi.ai.TtsListener
        public void onPlayStart(AudioTrack audioTrack) {
        }

        @Override // com.xiaomi.ai.TtsListener
        public void onTtsGotURL(String s) {
        }

        @Override // com.xiaomi.ai.TtsListener
        public void onTtsTransEnd(boolean b) {
        }

        @Override // com.xiaomi.ai.TtsListener
        public void onTtsTransStart() {
        }
    }

    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[SpeechRequestStrategy.values().length];
            c = iArr;
            try {
                iArr[SpeechRequestStrategy.SINGLE_ASR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[SpeechRequestStrategy.SINGLE_NLP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[SpeechRequestStrategy.SINGLE_TTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[SpeechRequestStrategy.COMBINE_ASR_NLP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                c[SpeechRequestStrategy.COMBINE_NLP_TTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                c[SpeechRequestStrategy.COMBINE_ASR_NLP_TTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[AiEnginePlatform.values().length];
            b = iArr2;
            try {
                iArr2[AiEnginePlatform.XIAOMI.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[AiEngineAuthType.values().length];
            a = iArr3;
            try {
                iArr3[AiEngineAuthType.XIAOMI_AUTH_DEVICE_OAUTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private XiaoMiAiSpeechEngineWrapper() {
    }

    private AsrListener g() {
        if (this.j == null) {
            this.j = new a();
        }
        return this.j;
    }

    public static synchronized XiaoMiAiSpeechEngineWrapper getInstance(Context context) {
        XiaoMiAiSpeechEngineWrapper xiaoMiAiSpeechEngineWrapper;
        if (p == null) {
            p = new XiaoMiAiSpeechEngineWrapper();
        }
        xiaoMiAiSpeechEngineWrapper = p;
        xiaoMiAiSpeechEngineWrapper.a = context;
        return xiaoMiAiSpeechEngineWrapper;
    }

    private AsrRequest h() {
        AsrRequest asrRequest = new AsrRequest();
        this.g = asrRequest;
        asrRequest.setDataInputMode(AsrRequest.DataInputMode.DATA_INPUT_MODE_BUFFER);
        return this.g;
    }

    private NlpListener i() {
        if (this.k == null) {
            this.k = new b();
        }
        return this.k;
    }

    private NlpRequest j() {
        this.h = new NlpRequest();
        MyLocation lastLocation = LocWeatherKeeper.getLastLocation();
        if (lastLocation != null) {
            this.h.setLatitude((float) lastLocation.getLatitude());
            this.h.setLongitude((float) lastLocation.getLongitude());
        }
        NlpRequest.UserInfo userInfo = new NlpRequest.UserInfo();
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(this.d) || TextUtils.isEmpty(this.e)) {
            userInfo.setExtend(null);
        } else {
            try {
                jSONObject.put(VoiceProtocol.MIOT_TOKEN, this.d);
                jSONObject.put(VoiceProtocol.MIOT_SESSION, this.e);
            } catch (Exception e) {
                e.printStackTrace();
            }
            userInfo.setExtend(jSONObject.toString());
        }
        this.h.setUserInfo(userInfo);
        return this.h;
    }

    private TtsListener k() {
        if (this.l == null) {
            this.l = new c();
        }
        return this.l;
    }

    private TtsRequest l() {
        TtsRequest ttsRequest = new TtsRequest();
        this.i = ttsRequest;
        return ttsRequest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String m() {
        return "auth_code_with_external_tokens";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String o() {
        return "auth_code_with_external_tokens";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(Object obj) {
    }

    @Override // com.xiaomi.hm.health.speech.aiengine.BaseAiSpeechEngine
    public void addBuffer(byte[] bytes, int offset, int length) {
        if (this.n.get()) {
            this.c.addBuffer(bytes, offset, length);
        } else {
            HMLog.i(o, "not running", new Object[0]);
        }
    }

    @Override // com.xiaomi.hm.health.speech.aiengine.BaseAiSpeechEngine
    public void combineRequest(SpeechRequestStrategy speechRequestStrategy) {
        this.f = null;
        this.f = new SpeechEngine.ParamBuilder();
        switch (d.c[speechRequestStrategy.ordinal()]) {
            case 1:
                this.f.needAsr().setAsrRequest(h());
                break;
            case 2:
                this.f.needNlp().setNlpRequest(j());
                break;
            case 3:
                this.f.needTts().setTtsRequest(l());
                break;
            case 4:
                this.f.needAsr().setAsrRequest(h()).needNlp().setNlpRequest(j());
                break;
            case 5:
                this.f.needNlp().setNlpRequest(j()).needTts().setTtsRequest(l());
                break;
            case 6:
                this.f.needAsr().setAsrRequest(h()).needNlp().setNlpRequest(j()).needTts().setTtsRequest(l());
                break;
        }
    }

    @Override // com.xiaomi.hm.health.speech.aiengine.BaseAiSpeechEngine
    public BaseAiSpeechEngine createAiSpeechEngine(AiEnginePlatform enginePlatform, AiEngineAuthType aiEngineAuthType, String... authParams) {
        this.b = enginePlatform;
        if (d.a[aiEngineAuthType.ordinal()] == 1) {
            SpeechEngine speechEngineCreateEngine = SpeechEngine.createEngine(this.a, 1, ThirdPartUtil.getXiaomiId(), ThirdPartUtil.getClientSecret(), ThirdPartUtil.getXiaomi().getRedirectUrl(), true);
            this.c = speechEngineCreateEngine;
            speechEngineCreateEngine.setMiAOOauthCallbacks(new MiAiOauthCallbacks() { // from class: hz8
                @Override // com.xiaomi.ai.MiAiOauthCallbacks
                public final String getOauthCode() {
                    return XiaoMiAiSpeechEngineWrapper.m();
                }
            });
            HMAccountKeeper hMAccountKeeper = HMAccountKeeper.INSTANCE;
            String xiaomiAccessToken = hMAccountKeeper.getXiaomiAccessToken();
            String xiaomiRefreshToken = hMAccountKeeper.getXiaomiRefreshToken();
            long expiresIn = hMAccountKeeper.getExpiresIn();
            if (!TextUtils.isEmpty(xiaomiAccessToken) && !TextUtils.isEmpty(xiaomiRefreshToken)) {
                this.c.setAuthorizationTokens(xiaomiAccessToken, xiaomiRefreshToken, expiresIn);
            }
        }
        return this;
    }

    @Override // com.xiaomi.hm.health.speech.aiengine.BaseAiSpeechEngine
    public void end() {
        this.n.set(false);
        this.c.endSpeech();
    }

    @Override // com.xiaomi.hm.health.speech.aiengine.BaseAiSpeechEngine
    public void initEngine() {
        this.c.setEnv(0);
        Mibrainsdk.setLogLevel(Mibrainsdk.MIBRAIN_DEBUG_LEVEL_DEBUG);
        this.c.setAsrLisnter(g());
        this.c.setNlpListener(i());
        this.c.setTtsListener(k());
        SpeechListenerManager.getInstance().clear();
        SpeechListenerManager.getInstance().initDefaultSpeechListener();
    }

    @Override // com.xiaomi.hm.health.speech.aiengine.BaseAiSpeechEngine
    public void interrupt() {
        this.n.set(false);
        this.c.forceStop();
    }

    @Override // com.xiaomi.hm.health.speech.aiengine.BaseAiSpeechEngine
    public void openVadMode(boolean open) {
        if (this.g != null) {
            if (!open) {
                HMLog.d(o, "open vad", new Object[0]);
                this.g.setUseVad(open);
            } else {
                HMLog.d(o, "open vad", new Object[0]);
                this.g.setUseVad(open);
                this.g.setVadMode(AsrRequest.VadMode.VAD_MODE_LOCAL);
            }
        }
    }

    @Override // com.xiaomi.hm.health.speech.aiengine.BaseAiSpeechEngine
    public void release() {
        this.n.set(false);
        this.c.release();
        this.c = null;
    }

    @Override // com.xiaomi.hm.health.speech.aiengine.BaseAiSpeechEngine
    public void start(boolean isManual) {
        this.c.startIntegrally(this.f);
        this.m = isManual;
        this.n.set(true);
    }

    @Override // com.xiaomi.hm.health.speech.aiengine.BaseAiSpeechEngine
    public boolean updateAuthEngine(AiEnginePlatform aiEnginePlatform, AiEngineAuthType aiEngineAuthType, String... authParams) {
        this.b = aiEnginePlatform;
        SpeechEngine speechEngine = this.c;
        if (speechEngine != null) {
            speechEngine.release();
            this.c = null;
        }
        if (d.a[aiEngineAuthType.ordinal()] == 1) {
            SpeechEngine speechEngineCreateEngine = SpeechEngine.createEngine(this.a, 1, ThirdPartUtil.getXiaomiId(), ThirdPartUtil.getClientSecret(), ThirdPartUtil.getXiaomi().getRedirectUrl(), true);
            this.c = speechEngineCreateEngine;
            speechEngineCreateEngine.setMiAOOauthCallbacks(new MiAiOauthCallbacks() { // from class: gz8
                @Override // com.xiaomi.ai.MiAiOauthCallbacks
                public final String getOauthCode() {
                    return XiaoMiAiSpeechEngineWrapper.o();
                }
            });
            HMAccountKeeper hMAccountKeeper = HMAccountKeeper.INSTANCE;
            String xiaomiAccessToken = hMAccountKeeper.getXiaomiAccessToken();
            String xiaomiRefreshToken = hMAccountKeeper.getXiaomiRefreshToken();
            long expiresIn = hMAccountKeeper.getExpiresIn();
            if (!TextUtils.isEmpty(xiaomiAccessToken) && !TextUtils.isEmpty(xiaomiRefreshToken)) {
                this.c.setAuthorizationTokens(xiaomiAccessToken, xiaomiRefreshToken, expiresIn);
            }
        }
        return true;
    }

    @Override // com.xiaomi.hm.health.speech.aiengine.BaseAiSpeechEngine
    public void updateThirdToken(String... thirdTokenParams) {
        if (d.b[this.b.ordinal()] != 1) {
            return;
        }
        this.d = thirdTokenParams[0];
        this.e = thirdTokenParams[1];
    }
}
