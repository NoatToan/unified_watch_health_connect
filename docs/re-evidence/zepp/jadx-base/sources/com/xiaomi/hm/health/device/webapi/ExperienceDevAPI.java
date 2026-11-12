package com.xiaomi.hm.health.device.webapi;

import com.huami.account.HMLoginManager;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.data.PropertyStoreApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.network.base.HMHttpConfig;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.webapi.ExperienceDevAPI;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import rx.Emitter;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes17.dex */
public class ExperienceDevAPI {
    public static final int CACHE_INVALID = -1;
    public static final int CACHE_NOT_SHOW = 0;
    public static final int CACHE_SHOW = 1;
    public static final String URL = "users/{userId}/appPublicPreview";
    private static final String a = "ExperienceDevAPI";
    private static final Lazy<DeviceManagerApi> b = KoinJavaComponent.inject(DeviceManagerApi.class);
    private static final Lazy<PropertyStoreApi> c = KoinJavaComponent.inject(PropertyStoreApi.class);
    private static final int d = 2;

    public class a extends IHMHttpResponseHandler {
        public final /* synthetic */ Emitter a;

        public a(Emitter emitter) {
            this.a = emitter;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            HMLog.i(ExperienceDevAPI.a, "queryUserState onCancel, type: " + i, new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            this.a.onCompleted();
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            if (th != null) {
                HMLog.i(ExperienceDevAPI.a, "queryUserState error: " + th, new Object[0]);
            }
            this.a.onError(th);
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            String str = new String(hMHttpResponseData.getResponseBody());
            HMLog.i(ExperienceDevAPI.a, "queryUserState onItem: " + str, new Object[0]);
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.a.onNext(new Boolean[]{Boolean.valueOf(jSONObject.optBoolean("isInPreview")), Boolean.valueOf(jSONObject.optBoolean("isQuotaFull"))});
                this.a.onCompleted();
            } catch (JSONException e) {
                e.printStackTrace();
                this.a.onError(e);
            }
        }
    }

    public class b implements IHMBasicHttpResponseHandler {
        public final /* synthetic */ Emitter a;

        public b(Emitter emitter) {
            this.a = emitter;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            HMLog.i(ExperienceDevAPI.a, "joinPublicPreview onCancel: " + i, new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            if (th != null) {
                HMLog.i(ExperienceDevAPI.a, "joinPublicPreview onError: " + th, new Object[0]);
            }
            this.a.onError(th);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            if (hMHttpResponseData != null && hMHttpResponseData.getResponseBody() != null) {
                HMLog.i(ExperienceDevAPI.a, "joinPublicPreview onFailure: " + new String(hMHttpResponseData.getResponseBody()), new Object[0]);
            }
            this.a.onNext(Boolean.FALSE);
            this.a.onCompleted();
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onSuccess(HMHttpResponseData hMHttpResponseData) {
            HMLog.i(ExperienceDevAPI.a, "joinPublicPreview onItem: " + new String(hMHttpResponseData.getResponseBody()), new Object[0]);
            this.a.onNext(Boolean.valueOf(hMHttpResponseData.isSuccess()));
            this.a.onCompleted();
        }
    }

    public class c extends IHMHttpResponseHandler {
        public final /* synthetic */ Emitter a;

        public c(Emitter emitter) {
            this.a = emitter;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            HMLog.i(ExperienceDevAPI.a, "quitPublicPreview onCancel, type: " + i, new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            this.a.onCompleted();
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            if (th != null) {
                HMLog.i(ExperienceDevAPI.a, "quitPublicPreview error: " + th, new Object[0]);
            }
            this.a.onError(th);
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            HMLog.i(ExperienceDevAPI.a, "quitPublicPreview onItem: " + new String(hMHttpResponseData.getResponseBody()), new Object[0]);
            this.a.onNext(Boolean.valueOf(hMHttpResponseData.isSuccess()));
            this.a.onCompleted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(Emitter emitter) {
        try {
            Map<String, String> systemHeader = HMWebUtil.getSystemHeader();
            HashSet hashSet = new HashSet();
            systemHeader.put("Content-Type", "application/json");
            HMWebUtil.doSeparateRequest(url(), systemHeader, (Set<Object>) hashSet, Support.RequestSupport.POST, true, true, (IHMBasicHttpResponseHandler) new b(emitter), new HMHttpConfig[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(Map map, Emitter emitter) {
        HMWebUtil.doRequest(url(), map, Support.RequestSupport.GET, true, new a(emitter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Map map, Emitter emitter) {
        HMWebUtil.doRequest(url(), map, Support.RequestSupport.DELETE, true, new c(emitter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(Boolean[] boolArr) {
        if (boolArr == null || boolArr.length < 2) {
            c.getValue().setShowPublicPreView(0);
        } else {
            c.getValue().setShowPublicPreView(boolArr[0].booleanValue() ? 1 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(Throwable th) {
        HMLog.i(a, "queryUserState fail!", new Object[0]);
    }

    public static Observable<Boolean> joinPublicPreview() {
        return Observable.create(new Action1() { // from class: hx1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                ExperienceDevAPI.f((Emitter) obj);
            }
        }, Emitter.BackpressureMode.BUFFER).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }

    public static Observable<Boolean[]> queryUserState() {
        final Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("userId", HMPersonInfo.getInstance().getUserInfo().getUserid());
        return Observable.create(new Action1() { // from class: ex1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                ExperienceDevAPI.g(systemParams, (Emitter) obj);
            }
        }, Emitter.BackpressureMode.BUFFER).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }

    public static Observable<Boolean> quitPublicPreview() {
        final Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        return Observable.create(new Action1() { // from class: fx1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                ExperienceDevAPI.h(systemParams, (Emitter) obj);
            }
        }, Emitter.BackpressureMode.BUFFER).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }

    public static void updatePublicPreViewStatus() {
        if (!HMLoginManager.isInChina()) {
            c.getValue().setShowPublicPreView(0);
            return;
        }
        if (GlobalConfig.get().isBuildMidong()) {
            c.getValue().setShowPublicPreView(0);
            return;
        }
        Lazy<DeviceManagerApi> lazy = b;
        if (lazy.getValue().hasBound(HMDeviceSource.MILI_PEYTO) || lazy.getValue().hasBound(HMDeviceSource.MILI_TEMPO)) {
            c.getValue().setShowPublicPreView(1);
        } else if (NetUtil.isNetworkConnected(DeviceXFunctionsKt.getContext())) {
            queryUserState().subscribe(new Action1() { // from class: ix1
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    ExperienceDevAPI.i((Boolean[]) obj);
                }
            }, new Action1() { // from class: gx1
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    ExperienceDevAPI.j((Throwable) obj);
                }
            });
        }
    }

    public static String url() {
        return HMServerDef.getUrl(URL.replace("{userId}", HMPersonInfo.getInstance().getUserInfo().getUserid()));
    }
}
