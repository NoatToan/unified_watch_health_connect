package com.huawei.hms.mlsdk.asr.engine;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.media3.extractor.AacUtil;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hms.mlsdk.asr.engine.utils.SmartLogger;
import com.huawei.hms.mlsdk.asr.o.m;
import com.huawei.hms.mlsdk.common.MLApplication;
import com.huawei.operation.OpAnalyticsConstants;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes10.dex */
public class AsrEngine {
    private static final String TAG = "AsrEngine";
    private Callback callback;
    private AsrEngineConfig engineConfig;
    private com.huawei.hms.mlsdk.asr.engine.a mAsrProcessor;
    private com.huawei.hms.mlsdk.asr.engine.b mAsrRecorder;
    private String mAsrResult;
    private com.huawei.hms.mlsdk.asr.engine.c mAsrVadDetector;
    private int recognizerType;
    private Long recordStartTime = null;
    private Long processStartTime = null;
    private volatile boolean mIsDestroying = false;
    private String mTaskId = null;
    private Runnable mDestroy = new a();
    private Handler posterHandler = new Handler(Looper.getMainLooper());
    private Executor posterExecutor = new i();

    public interface Callback {
        void onEnergy(double d, byte[] bArr, Bundle bundle);

        void onError(AsrError asrError, String str);

        void onResult(AsrResult asrResult);

        void onState(int i);
    }

    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AsrEngine.this.runDestroy();
        }
    }

    final class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle f14352a;

        f(Bundle bundle) {
            this.f14352a = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AsrEngine.this.callback.onError(new AsrError(40, "not HuaWei phone and not Emui", this.f14352a), null);
        }
    }

    final class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f14354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bundle f14355b;

        g(String str, Bundle bundle) {
            this.f14354a = str;
            this.f14355b = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AsrEngine.this.callback.onError(new AsrError(40, this.f14354a, this.f14355b), null);
        }
    }

    final class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f14357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bundle f14358b;

        h(String str, Bundle bundle) {
            this.f14357a = str;
            this.f14358b = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AsrEngine.this.callback.onError(new AsrError(40, this.f14357a, this.f14358b), null);
        }
    }

    final class i implements Executor {
        i() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            AsrEngine.this.posterHandler.post(runnable);
        }
    }

    public AsrEngine(AsrEngineConfig asrEngineConfig, Callback callback) {
        this.engineConfig = asrEngineConfig;
        this.callback = callback;
    }

    private String checkParameters() {
        int feature;
        if (isRecognizerLong() || (feature = this.engineConfig.getFeature()) == 12 || feature == 11) {
            return null;
        }
        return "Invalid feature options";
    }

    private String checkPermissions() {
        String[] strArr = {"android.permission.INTERNET", "android.permission.ACCESS_WIFI_STATE", "android.permission.ACCESS_NETWORK_STATE", "android.permission.RECORD_AUDIO"};
        Context appContext = MLApplication.getInstance().getAppContext();
        PackageManager packageManager = appContext.getPackageManager();
        String packageName = appContext.getPackageName();
        for (int i2 = 0; i2 < 4; i2++) {
            String str = strArr[i2];
            if (packageManager.checkPermission(str, packageName) == -1) {
                return "Permission missing: " + str;
            }
        }
        return null;
    }

    private boolean isEMUIAndHuaWeiPhone() {
        String str;
        if (!m.a()) {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                str = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, "ro.product.manufacturer");
            } catch (ClassNotFoundException unused) {
                SmartLogger.e("EmuiUtil", "ClassNotFoundException");
                str = "";
            } catch (IllegalAccessException unused2) {
                SmartLogger.e("EmuiUtil", "IllegalAccessException");
                str = "";
            } catch (NoSuchMethodException unused3) {
                SmartLogger.e("EmuiUtil", "NoSuchMethodException");
                str = "";
            } catch (InvocationTargetException unused4) {
                SmartLogger.e("EmuiUtil", "InvocationTargetException");
                str = "";
            }
            if (!"HUAWEI".equals(str) && !"HONOR".equals(str) && !this.engineConfig.getLanguage().equals(MLAsrConstants.LAN_ZH) && !this.engineConfig.getLanguage().equals("en-US")) {
                Bundle bundle = new Bundle();
                bundle.putInt("subErrorCode", 3016);
                this.posterExecutor.execute(new f(bundle));
                SmartLogger.e(TAG, "not HuaWei phone and not Emui");
                return false;
            }
        }
        return true;
    }

    private boolean legalityCheckPassed() {
        String strCheckPermissions = checkPermissions();
        if (strCheckPermissions != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("subErrorCode", 1004);
            this.posterExecutor.execute(new g(strCheckPermissions, bundle));
            return false;
        }
        String strCheckParameters = checkParameters();
        if (strCheckParameters == null) {
            return true;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putInt("subErrorCode", 3002);
        this.posterExecutor.execute(new h(strCheckParameters, bundle2));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runDestroy() {
        com.huawei.hms.mlsdk.asr.engine.b bVar = this.mAsrRecorder;
        if (bVar != null) {
            bVar.a();
            this.mAsrRecorder = null;
        }
        com.huawei.hms.mlsdk.asr.engine.c cVar = this.mAsrVadDetector;
        if (cVar != null) {
            cVar.a();
            this.mAsrVadDetector = null;
        }
        com.huawei.hms.mlsdk.asr.engine.a aVar = this.mAsrProcessor;
        if (aVar != null) {
            aVar.b();
            this.mAsrProcessor = null;
        }
        this.mIsDestroying = false;
    }

    public AsrEngine create() {
        if (!isEMUIAndHuaWeiPhone() || !legalityCheckPassed()) {
            return this;
        }
        com.huawei.hms.mlsdk.asr.o.e.b().a(MLApplication.getInstance().getAppContext(), isRecognizerLong());
        String strA = com.huawei.hms.mlsdk.asr.o.e.a();
        com.huawei.hms.mlsdk.asr.o.e.b().a(strA);
        SmartLogger.i(TAG, "TaskId: " + strA);
        String language = this.engineConfig.getLanguage();
        Bundle bundle = new Bundle();
        bundle.putString("applanguage", language);
        com.huawei.hms.mlsdk.asr.o.e.b().a(strA, 0, bundle);
        setTaskId(strA);
        com.huawei.hms.mlsdk.asr.engine.a aVar = new com.huawei.hms.mlsdk.asr.engine.a(this);
        this.mAsrProcessor = aVar;
        aVar.a(strA);
        this.mAsrRecorder = new com.huawei.hms.mlsdk.asr.engine.b();
        this.mAsrVadDetector = new com.huawei.hms.mlsdk.asr.engine.c(this);
        this.mAsrProcessor.a(new b(bundle));
        this.mAsrRecorder.a(new c());
        this.mAsrVadDetector.a(new d(bundle));
        if (this.mAsrProcessor.e()) {
            this.mAsrRecorder.c();
        }
        this.mAsrProcessor.h();
        return this;
    }

    public AsrEngine createWriteAudio() {
        if (!isEMUIAndHuaWeiPhone()) {
            return this;
        }
        com.huawei.hms.mlsdk.asr.o.e.b().a(MLApplication.getInstance().getAppContext(), isRecognizerLong());
        String strA = com.huawei.hms.mlsdk.asr.o.e.a();
        com.huawei.hms.mlsdk.asr.o.e.b().a(strA);
        SmartLogger.i(TAG, "TaskId: " + strA);
        String language = this.engineConfig.getLanguage();
        Bundle bundle = new Bundle();
        bundle.putString("applanguage", language);
        com.huawei.hms.mlsdk.asr.o.e.b().a(strA, 0, bundle);
        setTaskId(strA);
        com.huawei.hms.mlsdk.asr.engine.a aVar = new com.huawei.hms.mlsdk.asr.engine.a(this);
        this.mAsrProcessor = aVar;
        aVar.a(strA);
        this.mAsrProcessor.a(new e(bundle));
        this.mAsrProcessor.h();
        return this;
    }

    public void destroy() {
        if (isRecognizerLong()) {
            com.huawei.hms.mlsdk.asr.o.e.b().f(getTaskId());
        }
        com.huawei.hms.mlsdk.asr.o.e.b().c();
        com.huawei.hms.mlsdk.asr.engine.b bVar = this.mAsrRecorder;
        if (bVar != null) {
            bVar.a();
            this.mAsrRecorder = null;
        }
        if (this.mIsDestroying) {
            SmartLogger.w(TAG, "AsrEngine is destroying");
        } else {
            this.mIsDestroying = true;
            new Thread(this.mDestroy).start();
        }
    }

    public String getAsrResult() {
        String str = this.mAsrResult;
        return str == null ? "" : str;
    }

    public AsrEngineConfig getEngineConfig() {
        return this.engineConfig;
    }

    public Long getProcessStartTime() {
        return this.processStartTime;
    }

    public int getRecognizerType() {
        return this.recognizerType;
    }

    public Long getRecordStartTime() {
        return this.recordStartTime;
    }

    public String getTaskId() {
        return this.mTaskId;
    }

    public boolean hasResult() {
        return !"".equals(getAsrResult());
    }

    public boolean isRecognizerLong() {
        return this.engineConfig.getRecognizerType() == 1;
    }

    public void setAsrResult(String str) {
        this.mAsrResult = str;
    }

    public void setInput(byte[] bArr, boolean z) {
        com.huawei.hms.mlsdk.asr.engine.a aVar = this.mAsrProcessor;
        if (aVar != null) {
            aVar.a(bArr, z);
        }
    }

    public void setRecognizerType(int i2) {
        this.recognizerType = i2;
    }

    public void setTaskId(String str) {
        this.mTaskId = str;
    }

    final class d implements com.huawei.hms.mlsdk.asr.engine.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f14346a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bundle f14347b;

        d(Bundle bundle) {
            this.f14347b = bundle;
        }

        @Override // com.huawei.hms.mlsdk.asr.engine.c.a
        public final void a() {
            AsrEngine.this.posterExecutor.execute(new j(AsrEngine.this.callback, 2));
            SmartLogger.d(AsrEngine.TAG, "onNoSound(long time)");
        }

        @Override // com.huawei.hms.mlsdk.asr.engine.c.a
        public final void b() {
            SmartLogger.i(AsrEngine.TAG, "onVoiceEnd");
            this.f14347b.putLong("speechEndTime", System.currentTimeMillis());
            SmartLogger.i(AsrEngine.TAG, "onVoiceEnd speechEndTime: " + System.currentTimeMillis());
            com.huawei.hms.mlsdk.asr.o.e.b().a(AsrEngine.this.getTaskId(), 2, this.f14347b);
            if (AsrEngine.this.mAsrProcessor != null) {
                AsrEngine.this.mAsrRecorder.a();
                AsrEngine.this.mAsrProcessor.c();
            }
        }

        @Override // com.huawei.hms.mlsdk.asr.engine.c.a
        public final void c() {
            AsrEngine.this.posterExecutor.execute(new j(AsrEngine.this.callback, new AsrResult(3)));
            SmartLogger.d(AsrEngine.TAG, "onNoSoundTimesExceed(long time)");
            if (AsrEngine.this.mAsrProcessor != null) {
                SmartLogger.i(AsrEngine.TAG, "onNoSoundTimesExceed and send finish");
                AsrEngine.this.mAsrProcessor.g();
            }
        }

        @Override // com.huawei.hms.mlsdk.asr.engine.c.a
        public final void d() {
            AsrEngine.this.posterExecutor.execute(new j(AsrEngine.this.callback, new AsrResult(4, AsrEngine.this.mAsrResult)));
            SmartLogger.d(AsrEngine.TAG, "onMaxDurationExceed(long time)");
        }

        @Override // com.huawei.hms.mlsdk.asr.engine.c.a
        public final void a(long j) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f14347b.putLong("speechStartTime", jCurrentTimeMillis);
            SmartLogger.i(AsrEngine.TAG, "speechStartTime: " + jCurrentTimeMillis);
            com.huawei.hms.mlsdk.asr.o.e.b().a(AsrEngine.this.getTaskId(), 1, this.f14347b);
            this.f14346a = true;
            AsrEngine.this.posterExecutor.execute(new j(AsrEngine.this.callback, 10));
            SmartLogger.d(AsrEngine.TAG, "onVoiceStart(long time)");
            SmartLogger.i(AsrEngine.TAG, "start send audio to cloud at " + j);
        }

        @Override // com.huawei.hms.mlsdk.asr.engine.c.a
        public final void a(com.huawei.hms.mlsdk.asr.engine.c.b bVar) {
            Bundle bundle = new Bundle();
            bundle.putString(MLAsrConstants.WAVE_PAINE_ENCODING, "pcm");
            bundle.putInt(MLAsrConstants.WAVE_PAINE_SAMPLE_RATE, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND);
            bundle.putInt(MLAsrConstants.WAVE_PAINE_BIT_WIDTH, 16);
            bundle.putInt(MLAsrConstants.WAVE_PAINE_CHANNEL_COUNT, 1);
            AsrEngine.this.callback.onEnergy(bVar.b(), bVar.a(), bundle);
            SmartLogger.d(AsrEngine.TAG, "onResult(AsrVadDetector.Result result)");
            if (AsrEngine.this.mAsrProcessor == null || !this.f14346a) {
                return;
            }
            AsrEngine.this.mAsrProcessor.a(bVar.a());
        }

        @Override // com.huawei.hms.mlsdk.asr.engine.c.a
        public final void a(AsrError asrError) {
            AsrEngine.this.posterExecutor.execute(new j(AsrEngine.this.callback, asrError, AsrEngine.this.mAsrResult));
            SmartLogger.d(AsrEngine.TAG, "onError(AsrError error)");
        }
    }

    final class c implements com.huawei.hms.mlsdk.asr.engine.b.InterfaceC0156b {
        c() {
        }

        @Override // com.huawei.hms.mlsdk.asr.engine.b.InterfaceC0156b
        public final void a(long j) {
            AsrEngine.this.recordStartTime = Long.valueOf(j);
            AsrEngine.this.posterExecutor.execute(new j(AsrEngine.this.callback, 1));
            SmartLogger.d(AsrEngine.TAG, "onStart(long time)");
        }

        @Override // com.huawei.hms.mlsdk.asr.engine.b.InterfaceC0156b
        public final void a(byte[] bArr) throws com.huawei.hms.mlsdk.asr.o.d {
            if (AsrEngine.this.mAsrVadDetector != null) {
                AsrEngine.this.mAsrVadDetector.b(bArr);
            }
        }

        @Override // com.huawei.hms.mlsdk.asr.engine.b.InterfaceC0156b
        public final void a(AsrError asrError) {
            AsrEngine.this.posterExecutor.execute(new j(AsrEngine.this.callback, asrError, AsrEngine.this.mAsrResult));
            SmartLogger.d(AsrEngine.TAG, "onError(AsrError error)");
        }
    }

    static final class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Callback f14361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f14362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private AsrResult f14363c;
        private AsrError d;
        private String e;
        private int f = 1;

        public j(Callback callback, int i) {
            this.f14361a = callback;
            this.f14362b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.f;
            if (i == 1) {
                this.f14361a.onState(this.f14362b);
                return;
            }
            if (i != 2) {
                this.f14361a.onError(this.d, this.e);
                return;
            }
            SmartLogger.d("ResultDeliveryRunnable", "result.text is: onResult= " + this.f14363c.getText() + "  " + this.f14363c.getRetCode());
            this.f14361a.onResult(this.f14363c);
        }

        public j(Callback callback, AsrResult asrResult) {
            this.f14361a = callback;
            this.f14363c = asrResult;
        }

        public j(Callback callback, AsrError asrError, String str) {
            this.f14361a = callback;
            this.d = asrError;
            this.e = str;
        }
    }

    final class b implements com.huawei.hms.mlsdk.asr.engine.a.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f14342a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bundle f14343b;

        b(Bundle bundle) {
            this.f14343b = bundle;
        }

        @Override // com.huawei.hms.mlsdk.asr.engine.a.e
        public final void a(AsrError asrError) {
            int errorCode = asrError.getErrorCode();
            if (AsrEngine.this.mAsrResult != null) {
                int length = AsrEngine.this.mAsrResult.length();
                SmartLogger.i(AsrEngine.TAG, "onError textLenth :" + length);
                this.f14343b.putInt(OpAnalyticsConstants.NOTIFICATION_TEXT_LENGTH, length);
                com.huawei.hms.mlsdk.asr.o.e.b().a(AsrEngine.this.getTaskId(), 7, this.f14343b);
            }
            this.f14343b.putInt("result", errorCode);
            com.huawei.hms.mlsdk.asr.o.e.b().a(AsrEngine.this.getTaskId(), 9, this.f14343b);
            this.f14343b.putString("errMsg", asrError.toString());
            com.huawei.hms.mlsdk.asr.o.e.b().a(AsrEngine.this.getTaskId(), 10, this.f14343b);
            com.huawei.hms.mlsdk.asr.o.e.b().f(AsrEngine.this.getTaskId());
            AsrEngine.this.posterExecutor.execute(new j(AsrEngine.this.callback, asrError, AsrEngine.this.mAsrResult));
            SmartLogger.d(AsrEngine.TAG, "onError(AsrError error)");
        }

        @Override // com.huawei.hms.mlsdk.asr.engine.a.e
        public final void b(long j) {
            SmartLogger.d(AsrEngine.TAG, "onSilence");
            AsrEngineConfig asrEngineConfig = AsrEngine.this.engineConfig;
            int vadStartMuteDetectTimes = asrEngineConfig.getVadStartMuteDetectTimes() * asrEngineConfig.getVadStartMuteDuration();
            SmartLogger.i(AsrEngine.TAG, "engine.hasResult: " + AsrEngine.this.hasResult() + "engine.recordStartTime: " + AsrEngine.this.recordStartTime + "time-engine.recordStartTime" + (j - AsrEngine.this.recordStartTime.longValue()) + "maxAllowMuteDuration" + vadStartMuteDetectTimes);
            if (!AsrEngine.this.hasResult() && j - AsrEngine.this.recordStartTime.longValue() < vadStartMuteDetectTimes) {
                SmartLogger.i(AsrEngine.TAG, "onSilence return");
                return;
            }
            if (AsrEngine.this.isRecognizerLong()) {
                return;
            }
            onResult(new AsrResult(8));
            if (AsrEngine.this.mAsrProcessor != null) {
                SmartLogger.i(AsrEngine.TAG, "server detect silence and send finish");
                AsrEngine.this.mAsrRecorder.a();
                AsrEngine.this.mAsrProcessor.g();
            }
        }

        @Override // com.huawei.hms.mlsdk.asr.engine.a.e
        public final void onResult(AsrResult asrResult) {
            String text = asrResult.getText();
            if (text != null && !"".equals(text)) {
                AsrEngine.this.mAsrResult = text;
            }
            if (asrResult.getRetCode() != 5 && !this.f14342a) {
                this.f14342a = true;
                if (com.huawei.hms.mlsdk.asr.o.e.b().b(AsrEngine.this.getTaskId()) == 0) {
                    long jC = com.huawei.hms.mlsdk.asr.o.e.b().c(AsrEngine.this.getTaskId());
                    if (jC == 0 && AsrEngine.this.mAsrProcessor != null) {
                        jC = AsrEngine.this.mAsrProcessor.d();
                        SmartLogger.i(AsrEngine.TAG, "there is no sendFinalDataTime and use processor.getSendLastDataTime, is " + jC);
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis() - jC;
                    SmartLogger.i(AsrEngine.TAG, "onResult but lastWordCost is 0 ,so to calculate lastWorCost: " + jCurrentTimeMillis);
                    this.f14343b.putInt("lastWordCost", (int) jCurrentTimeMillis);
                    com.huawei.hms.mlsdk.asr.o.e.b().a(AsrEngine.this.getTaskId(), 4, this.f14343b);
                }
                if (AsrEngine.this.mAsrResult != null) {
                    int length = AsrEngine.this.mAsrResult.length();
                    SmartLogger.i(AsrEngine.TAG, "onResult textLenth :" + length);
                    this.f14343b.putInt(OpAnalyticsConstants.NOTIFICATION_TEXT_LENGTH, length);
                    com.huawei.hms.mlsdk.asr.o.e.b().a(AsrEngine.this.getTaskId(), 7, this.f14343b);
                    this.f14343b.putInt("result", 0);
                    com.huawei.hms.mlsdk.asr.o.e.b().a(AsrEngine.this.getTaskId(), 9, this.f14343b);
                    com.huawei.hms.mlsdk.asr.o.e.b().f(AsrEngine.this.getTaskId());
                }
            }
            SmartLogger.d(AsrEngine.TAG, "result.text is:" + asrResult.getText() + ", engine.asrResult====>" + AsrEngine.this.mAsrResult + "  " + asrResult.getRetCode());
            if (!AsrEngine.this.isRecognizerLong()) {
                AsrEngine.this.posterExecutor.execute(new j(AsrEngine.this.callback, new AsrResult(asrResult.getRetCode(), null, AsrEngine.this.mAsrResult, asrResult.isFinal())));
                return;
            }
            String str = AsrEngine.this.mAsrResult;
            if (!TextUtils.isEmpty(AsrEngine.this.mAsrResult)) {
                AsrResult asrResult2 = new AsrResult(asrResult.getRetCode(), null, str, asrResult.isFinal());
                asrResult2.setWordOffsetList(asrResult.getWordOffsetList());
                asrResult2.setSentenceOffsetList(asrResult.getSentenceOffsetList());
                SmartLogger.d(AsrEngine.TAG, "onResult(AsrResult result)");
                AsrEngine.this.posterExecutor.execute(new j(AsrEngine.this.callback, asrResult2));
                if (asrResult.isFinal()) {
                    AsrEngine.this.mAsrResult = "";
                }
            }
            if (8 == asrResult.getRetCode()) {
                AsrEngine.this.destroy();
            }
        }

        @Override // com.huawei.hms.mlsdk.asr.engine.a.e
        public final void onState(int i) {
            AsrEngine.this.posterExecutor.execute(new j(AsrEngine.this.callback, i));
            SmartLogger.d(AsrEngine.TAG, "onState(int state)");
        }

        @Override // com.huawei.hms.mlsdk.asr.engine.a.e
        public final void a(long j) {
            AsrEngine.this.processStartTime = Long.valueOf(j);
        }
    }

    final class e implements com.huawei.hms.mlsdk.asr.engine.a.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f14349a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bundle f14350b;

        e(Bundle bundle) {
            this.f14350b = bundle;
        }

        @Override // com.huawei.hms.mlsdk.asr.engine.a.e
        public final void a(AsrError asrError) {
            int errorCode = asrError.getErrorCode();
            if (AsrEngine.this.mAsrResult != null) {
                int length = AsrEngine.this.mAsrResult.length();
                SmartLogger.i(AsrEngine.TAG, "onError textLenth :" + length);
                this.f14350b.putInt(OpAnalyticsConstants.NOTIFICATION_TEXT_LENGTH, length);
                com.huawei.hms.mlsdk.asr.o.e.b().a(AsrEngine.this.getTaskId(), 7, this.f14350b);
            }
            this.f14350b.putInt("result", errorCode);
            com.huawei.hms.mlsdk.asr.o.e.b().a(AsrEngine.this.getTaskId(), 9, this.f14350b);
            this.f14350b.putString("errMsg", asrError.toString());
            com.huawei.hms.mlsdk.asr.o.e.b().a(AsrEngine.this.getTaskId(), 10, this.f14350b);
            com.huawei.hms.mlsdk.asr.o.e.b().f(AsrEngine.this.getTaskId());
            AsrEngine.this.posterExecutor.execute(new j(AsrEngine.this.callback, asrError, AsrEngine.this.mAsrResult));
            SmartLogger.d(AsrEngine.TAG, "onError(AsrError error)");
        }

        @Override // com.huawei.hms.mlsdk.asr.engine.a.e
        public final void b(long j) {
            SmartLogger.d(AsrEngine.TAG, "onSilence");
            AsrEngineConfig asrEngineConfig = AsrEngine.this.engineConfig;
            int vadStartMuteDetectTimes = asrEngineConfig.getVadStartMuteDetectTimes() * asrEngineConfig.getVadStartMuteDuration();
            SmartLogger.i(AsrEngine.TAG, "engine.hasResult: " + AsrEngine.this.hasResult() + "engine.recordStartTime: " + AsrEngine.this.recordStartTime + "time-engine.recordStartTime" + (j - AsrEngine.this.recordStartTime.longValue()) + "maxAllowMuteDuration" + vadStartMuteDetectTimes);
            if (!AsrEngine.this.hasResult() && j - AsrEngine.this.recordStartTime.longValue() < vadStartMuteDetectTimes) {
                SmartLogger.i(AsrEngine.TAG, "onSilence return");
                return;
            }
            if (AsrEngine.this.isRecognizerLong()) {
                return;
            }
            onResult(new AsrResult(8));
            if (AsrEngine.this.mAsrProcessor != null) {
                SmartLogger.i(AsrEngine.TAG, "server detect silence and send finish");
                AsrEngine.this.mAsrProcessor.g();
            }
        }

        @Override // com.huawei.hms.mlsdk.asr.engine.a.e
        public final void onResult(AsrResult asrResult) {
            String text = asrResult.getText();
            if (text != null && !"".equals(text)) {
                AsrEngine.this.mAsrResult = text;
            }
            if (asrResult.getRetCode() != 5 && !this.f14349a) {
                this.f14349a = true;
                if (com.huawei.hms.mlsdk.asr.o.e.b().b(AsrEngine.this.getTaskId()) == 0) {
                    long jC = com.huawei.hms.mlsdk.asr.o.e.b().c(AsrEngine.this.getTaskId());
                    if (jC == 0 && AsrEngine.this.mAsrProcessor != null) {
                        jC = AsrEngine.this.mAsrProcessor.d();
                        SmartLogger.i(AsrEngine.TAG, "there is no sendFinalDataTime and use processor.getSendLastDataTime, is " + jC);
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis() - jC;
                    SmartLogger.i(AsrEngine.TAG, "onResult but lastWordCost is 0 ,so to calculate lastWorCost: " + jCurrentTimeMillis);
                    this.f14350b.putInt("lastWordCost", (int) jCurrentTimeMillis);
                    com.huawei.hms.mlsdk.asr.o.e.b().a(AsrEngine.this.getTaskId(), 4, this.f14350b);
                }
                if (AsrEngine.this.mAsrResult != null) {
                    int length = AsrEngine.this.mAsrResult.length();
                    SmartLogger.i(AsrEngine.TAG, "onResult textLenth :" + length);
                    this.f14350b.putInt(OpAnalyticsConstants.NOTIFICATION_TEXT_LENGTH, length);
                    com.huawei.hms.mlsdk.asr.o.e.b().a(AsrEngine.this.getTaskId(), 7, this.f14350b);
                    this.f14350b.putInt("result", 0);
                    com.huawei.hms.mlsdk.asr.o.e.b().a(AsrEngine.this.getTaskId(), 9, this.f14350b);
                    com.huawei.hms.mlsdk.asr.o.e.b().f(AsrEngine.this.getTaskId());
                }
            }
            SmartLogger.d(AsrEngine.TAG, "result.text is:" + asrResult.getText() + ", engine.asrResult====>" + AsrEngine.this.mAsrResult + "  " + asrResult.getRetCode());
            if (!AsrEngine.this.isRecognizerLong()) {
                AsrEngine.this.posterExecutor.execute(new j(AsrEngine.this.callback, new AsrResult(asrResult.getRetCode(), null, AsrEngine.this.mAsrResult, asrResult.isFinal())));
                return;
            }
            String str = AsrEngine.this.mAsrResult;
            if (!TextUtils.isEmpty(AsrEngine.this.mAsrResult)) {
                AsrResult asrResult2 = new AsrResult(asrResult.getRetCode(), null, str, asrResult.isFinal());
                asrResult2.setWordOffsetList(asrResult.getWordOffsetList());
                asrResult2.setSentenceOffsetList(asrResult.getSentenceOffsetList());
                SmartLogger.d(AsrEngine.TAG, "onResult(AsrResult result)");
                AsrEngine.this.posterExecutor.execute(new j(AsrEngine.this.callback, asrResult2));
                if (asrResult.isFinal()) {
                    AsrEngine.this.mAsrResult = "";
                }
            }
            if (8 == asrResult.getRetCode()) {
                AsrEngine.this.destroy();
            }
        }

        @Override // com.huawei.hms.mlsdk.asr.engine.a.e
        public final void onState(int i) {
            AsrEngine.this.posterExecutor.execute(new j(AsrEngine.this.callback, i));
            SmartLogger.d(AsrEngine.TAG, "onState(int state)");
        }

        @Override // com.huawei.hms.mlsdk.asr.engine.a.e
        public final void a(long j) {
            AsrEngine.this.processStartTime = Long.valueOf(j);
            AsrEngine.this.recordStartTime = Long.valueOf(j);
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f14350b.putLong("speechStartTime", jCurrentTimeMillis);
            SmartLogger.i(AsrEngine.TAG, "speechStartTime: " + jCurrentTimeMillis);
            com.huawei.hms.mlsdk.asr.o.e.b().a(AsrEngine.this.getTaskId(), 1, this.f14350b);
            AsrEngine.this.posterExecutor.execute(new j(AsrEngine.this.callback, 10));
        }
    }
}
