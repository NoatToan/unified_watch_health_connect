package defpackage;

import android.content.Context;
import android.content.Intent;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.bundle.AppBundlePluginProxy;
import com.huawei.health.baseapi.hiaiengine.HiAiEngineApi;
import com.huawei.health.baseapi.hiaiengine.HiAiFaceDetectorApi;
import com.huawei.health.baseapi.hiaiengine.HiAiIntelligentSleepApi;
import com.huawei.health.baseapi.hiaiengine.HiAiKitCreateListener;
import com.huawei.health.baseapi.hiaiengine.HiAiKitInitTtsListener;
import com.huawei.health.baseapi.hiaiengine.HiAiKitRecognizeListener;
import com.huawei.health.baseapi.hiaiengine.HiAiSmartClipApi;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes6.dex */
public class ddr extends AppBundlePluginProxy<HiAiEngineApi> implements HiAiEngineApi {
    private static volatile ddr d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HiAiSmartClipApi f31674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HiAiEngineApi f31675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HiAiFaceDetectorApi f31676c;
    private HiAiIntelligentSleepApi e;

    private ddr() {
        super("HiAiEngineProxy", "PluginHiAiEngine", "com.huawei.health.pluginhiaiengine.HiAiEngineApiImpl");
        this.f31675b = createPluginApi();
    }

    public static ddr e() {
        ddr ddrVar;
        if (d == null) {
            synchronized (ddr.class) {
                if (d == null) {
                    d = new ddr();
                }
                ddrVar = d;
            }
            return ddrVar;
        }
        return d;
    }

    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    public boolean isPluginAvaiable() {
        return this.f31675b != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void initialize(HiAiEngineApi hiAiEngineApi) {
        this.f31675b = hiAiEngineApi;
    }

    @Override // com.huawei.health.baseapi.hiaiengine.HiAiEngineApi
    public void initHiAiEngine() {
        HiAiEngineApi hiAiEngineApi = this.f31675b;
        if (hiAiEngineApi != null) {
            hiAiEngineApi.initHiAiEngine();
        } else {
            loadPlugin();
        }
    }

    @Override // com.huawei.health.baseapi.hiaiengine.HiAiEngineApi
    public void createKit(Context context, Intent intent, String str, HiAiKitCreateListener hiAiKitCreateListener) {
        HiAiEngineApi hiAiEngineApi = this.f31675b;
        if (hiAiEngineApi != null) {
            hiAiEngineApi.createKit(context, intent, str, hiAiKitCreateListener);
        }
    }

    @Override // com.huawei.health.baseapi.hiaiengine.HiAiEngineApi
    public void initKitRecognizeEngine(String str, String str2, HiAiKitRecognizeListener hiAiKitRecognizeListener) {
        HiAiEngineApi hiAiEngineApi = this.f31675b;
        if (hiAiEngineApi != null) {
            hiAiEngineApi.initKitRecognizeEngine(str, str2, hiAiKitRecognizeListener);
        }
    }

    @Override // com.huawei.health.baseapi.hiaiengine.HiAiEngineApi
    public void updateSwitch(boolean z) {
        HiAiEngineApi hiAiEngineApi = this.f31675b;
        if (hiAiEngineApi != null) {
            hiAiEngineApi.updateSwitch(z);
        }
    }

    @Override // com.huawei.health.baseapi.hiaiengine.HiAiEngineApi
    public void initKitTtsEngine(HiAiKitInitTtsListener hiAiKitInitTtsListener) {
        HiAiEngineApi hiAiEngineApi = this.f31675b;
        if (hiAiEngineApi != null) {
            hiAiEngineApi.initKitTtsEngine(hiAiKitInitTtsListener);
        }
    }

    @Override // com.huawei.health.baseapi.hiaiengine.HiAiEngineApi
    public void startRecognize(String str, String str2, String str3) {
        HiAiEngineApi hiAiEngineApi = this.f31675b;
        if (hiAiEngineApi != null) {
            hiAiEngineApi.startRecognize(str, str2, str3);
        }
    }

    @Override // com.huawei.health.baseapi.hiaiengine.HiAiEngineApi
    public void writeAudio(byte[] bArr) {
        HiAiEngineApi hiAiEngineApi = this.f31675b;
        if (hiAiEngineApi != null) {
            hiAiEngineApi.writeAudio(bArr);
        }
    }

    @Override // com.huawei.health.baseapi.hiaiengine.HiAiEngineApi
    public void updateVoiceContext(String str) {
        HiAiEngineApi hiAiEngineApi = this.f31675b;
        if (hiAiEngineApi != null) {
            hiAiEngineApi.updateVoiceContext(str);
        }
    }

    @Override // com.huawei.health.baseapi.hiaiengine.HiAiEngineApi
    public void updateVoiceEvent(String str) {
        HiAiEngineApi hiAiEngineApi = this.f31675b;
        if (hiAiEngineApi != null) {
            hiAiEngineApi.updateVoiceEvent(str);
        }
    }

    @Override // com.huawei.health.baseapi.hiaiengine.HiAiEngineApi
    public String getLngAndLat(Context context) {
        HiAiEngineApi hiAiEngineApi = this.f31675b;
        if (hiAiEngineApi != null) {
            return hiAiEngineApi.getLngAndLat(context);
        }
        return "";
    }

    @Override // com.huawei.health.baseapi.hiaiengine.HiAiEngineApi
    public void textToSpeak(String str, Intent intent) {
        HiAiEngineApi hiAiEngineApi = this.f31675b;
        if (hiAiEngineApi != null) {
            hiAiEngineApi.textToSpeak(str, intent);
        }
    }

    @Override // com.huawei.health.baseapi.hiaiengine.HiAiEngineApi
    public boolean isSpeaking() {
        HiAiEngineApi hiAiEngineApi = this.f31675b;
        if (hiAiEngineApi != null) {
            return hiAiEngineApi.isSpeaking();
        }
        return false;
    }

    @Override // com.huawei.health.baseapi.hiaiengine.HiAiEngineApi
    public void stopSpeak() {
        HiAiEngineApi hiAiEngineApi = this.f31675b;
        if (hiAiEngineApi != null) {
            hiAiEngineApi.stopSpeak();
        }
    }

    @Override // com.huawei.health.baseapi.hiaiengine.HiAiEngineApi
    public void cancelSpeak() {
        HiAiEngineApi hiAiEngineApi = this.f31675b;
        if (hiAiEngineApi != null) {
            hiAiEngineApi.cancelSpeak();
        }
    }

    @Override // com.huawei.health.baseapi.hiaiengine.HiAiEngineApi
    public boolean isDestroyKit() {
        HiAiEngineApi hiAiEngineApi = this.f31675b;
        if (hiAiEngineApi != null) {
            return hiAiEngineApi.isDestroyKit();
        }
        return false;
    }

    @Override // com.huawei.health.baseapi.hiaiengine.HiAiEngineApi
    public void initServiceRoute() {
        HiAiEngineApi hiAiEngineApi = this.f31675b;
        if (hiAiEngineApi != null) {
            hiAiEngineApi.initServiceRoute();
        }
    }

    public void b(AppBundleLauncher.InstallCallback installCallback) {
        loadPlugin(installCallback);
    }

    @Override // com.huawei.health.baseapi.hiaiengine.HiAiEngineApi
    public HiAiSmartClipApi getHiAiSmartClip() {
        HiAiEngineApi hiAiEngineApi = this.f31675b;
        if (hiAiEngineApi != null) {
            this.f31674a = hiAiEngineApi.getHiAiSmartClip();
        } else {
            LogUtil.a("HiAiEngineProxy", "cann't get mHiAiSmartClipApi");
            loadPlugin();
        }
        return this.f31674a;
    }

    @Override // com.huawei.health.baseapi.hiaiengine.HiAiEngineApi
    public HiAiIntelligentSleepApi getHiAiIntelligentSleepApi() {
        HiAiEngineApi hiAiEngineApi = this.f31675b;
        if (hiAiEngineApi != null) {
            this.e = hiAiEngineApi.getHiAiIntelligentSleepApi();
        } else {
            LogUtil.a("HiAiEngineProxy", "cann't get mHiAiIntelligentSleepApi");
            loadPlugin();
        }
        return this.e;
    }

    @Override // com.huawei.health.baseapi.hiaiengine.HiAiEngineApi
    public HiAiFaceDetectorApi getHiAiFaceDetectorApi() {
        HiAiEngineApi hiAiEngineApi = this.f31675b;
        if (hiAiEngineApi != null) {
            this.f31676c = hiAiEngineApi.getHiAiFaceDetectorApi();
        } else {
            LogUtil.a("HiAiEngineProxy", "cann't get mHiAiFaceDetectorApi");
            loadPlugin();
        }
        return this.f31676c;
    }
}
