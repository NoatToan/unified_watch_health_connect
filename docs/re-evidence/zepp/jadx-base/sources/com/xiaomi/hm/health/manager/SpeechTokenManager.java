package com.xiaomi.hm.health.manager;

import android.text.TextUtils;
import com.huami.account.HMLoginManager;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.network.base.HMHttpConfig;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.callback.IHMGetTokenCallback;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import de.greenrobot.event.EventBus;
import java.util.Map;
import kotlin.Lazy;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes21.dex */
public class SpeechTokenManager {
    private static final Lazy<DeviceManagerApi> c = KoinJavaComponent.inject(DeviceManagerApi.class);
    private static final Lazy<KeeperProxyApi> d = KoinJavaComponent.inject(KeeperProxyApi.class);
    private static final String e = "SpeechTokenManager";
    private static final String f = "users/%s/devices/%s/token";
    private static final String g = "deviceSource";
    private static final String h = "Content-Type";
    private static final String i = "result";
    private static final String j = "token";
    private static final String k = "session";
    private static final String l = "expire";
    private static final long m = -1;
    private static final float n = 0.33333334f;
    private final Lazy<DeviceUtilsApi> a;
    private final int b;

    public interface OnTokenCallback {
        void onFail();

        void onSuccess(String str, String str2);
    }

    public class a implements IHMGetTokenCallback {
        public final /* synthetic */ HMDeviceSource a;
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.manager.SpeechTokenManager$a$a, reason: collision with other inner class name */
        public class C0976a extends IHMHttpResponseHandler {
            public C0976a() {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCancel(int i) {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCompleted() {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onError(Throwable th) {
                HMLog.i(SpeechTokenManager.e, "token request is error", new Object[0]);
            }

            @Override // com.huami.network.base.handler.IHMHttpResponseHandler
            public void onItem(HMHttpResponseData hMHttpResponseData) {
                if (!hMHttpResponseData.isSuccess()) {
                    HMLog.i(SpeechTokenManager.e, "token request is wrong", new Object[0]);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(hMHttpResponseData.getResponseString()).getJSONObject("result");
                    SpeechTokenManager.this.d(jSONObject.getString("token"), jSONObject.getString("session"), System.currentTimeMillis(), jSONObject.getLong(SpeechTokenManager.l));
                } catch (Exception unused) {
                    HMLog.i(SpeechTokenManager.e, "token data is wrong", new Object[0]);
                }
            }
        }

        public a(HMDeviceSource hMDeviceSource, String str) {
            this.a = hMDeviceSource;
            this.b = str;
        }

        @Override // com.huami.network.hmnetwork.callback.IHMGetTokenCallback
        public void onError(Throwable th) {
            HMLog.i(SpeechTokenManager.e, "request header in that user request mi iot token is wrong", new Object[0]);
            HMLog.i(SpeechTokenManager.e, th.getMessage(), new Object[0]);
        }

        @Override // com.huami.network.hmnetwork.callback.IHMGetTokenCallback
        public void onSuccess(Map<String, String> map) {
            map.put("Content-Type", "application/json");
            Map<String, Object> systemParams = HMWebUtil.getSystemParams();
            systemParams.put("deviceSource", Integer.valueOf(this.a.getValue()));
            HMWebUtil.doSeparateRequest(this.b, map, systemParams, Support.RequestSupport.GET, true, false, (IHMBasicHttpResponseHandler) new C0976a(), new HMHttpConfig[0]);
        }
    }

    public static class b {
        private static final SpeechTokenManager a = new SpeechTokenManager();

        private b() {
        }
    }

    private SpeechTokenManager() {
        this.a = KoinJavaComponent.inject(DeviceUtilsApi.class);
        this.b = 1000;
    }

    private boolean b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HMAccountKeeper hMAccountKeeper = HMAccountKeeper.INSTANCE;
        long miotTokenStartTimeStamp = hMAccountKeeper.getMiotTokenStartTimeStamp();
        long miotTokenExpire = hMAccountKeeper.getMiotTokenExpire();
        return miotTokenExpire == -1 || miotTokenStartTimeStamp == -1 || jCurrentTimeMillis <= miotTokenStartTimeStamp || ((float) (jCurrentTimeMillis - miotTokenStartTimeStamp)) > ((float) (miotTokenExpire * 1000)) * 0.33333334f;
    }

    private void c() {
        Lazy<DeviceManagerApi> lazy = c;
        HMDeviceSource boundDeviceSource = lazy.getValue().getBoundDeviceSource(HMDeviceType.MILI);
        HMWebUtil.getSystemHeaderAsync(new a(boundDeviceSource, HMServerDef.getHost() + String.format(f, Long.valueOf(HMLoginManager.getValidUid()), lazy.getValue().getBoundDeviceId(boundDeviceSource.getType()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, String str2, long j2, long j3) {
        HMAccountKeeper.INSTANCE.saveMiotTokenInfo(str, str2, j2, j3);
        this.a.getValue().updateSpeechEngineThirdToken(str, str2);
    }

    public static SpeechTokenManager getInstance() {
        return b.a;
    }

    public void clearMiotTokenData() {
        HMAccountKeeper.INSTANCE.clearMiotTokenInfo();
        this.a.getValue().updateSpeechEngineThirdToken(null, null);
    }

    public void getMiotTokenData(OnTokenCallback onTokenCallback) {
        HMAccountKeeper hMAccountKeeper = HMAccountKeeper.INSTANCE;
        String miotToken = hMAccountKeeper.getMiotToken();
        String miotSession = hMAccountKeeper.getMiotSession();
        if (TextUtils.isEmpty(miotToken) || TextUtils.isEmpty(miotSession)) {
            onTokenCallback.onFail();
        } else {
            onTokenCallback.onSuccess(miotToken, miotSession);
        }
    }

    public boolean isSpeechMiotTokenInit() {
        HMAccountKeeper hMAccountKeeper = HMAccountKeeper.INSTANCE;
        return hMAccountKeeper.isMiotTokenInit() && ((hMAccountKeeper.getMiotTokenExpire() > (-1L) ? 1 : (hMAccountKeeper.getMiotTokenExpire() == (-1L) ? 0 : -1)) != 0 && (d.getValue().getMiotTokenStartTimeStamp() > (-1L) ? 1 : (d.getValue().getMiotTokenStartTimeStamp() == (-1L) ? 0 : -1)) != 0);
    }

    public void onEventMainThread(HMDeviceConnectionEvent hMDeviceConnectionEvent) {
        if (hMDeviceConnectionEvent.isConnected()) {
            updateSpeechMiotToken();
        }
    }

    public void registerEventMonitor() {
        EventBus.getDefault().register(getInstance());
    }

    public void releaseEventMonitor() {
        EventBus.getDefault().unregister(getInstance());
    }

    public void updateSpeechMiotToken() {
    }
}
