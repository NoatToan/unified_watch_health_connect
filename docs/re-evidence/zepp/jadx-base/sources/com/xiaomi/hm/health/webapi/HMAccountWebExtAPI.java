package com.xiaomi.hm.health.webapi;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.Log;
import com.huami.account.HMLoginManager;
import com.huami.account.api.HMAccountWebAPI;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.base.util.HMHttpUtils;
import com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bodyfat.model.Birthday;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import com.xiaomi.hm.health.utils.WeatherUtils;
import com.xiaomi.hm.health.webapi.HMAccountWebExtAPI;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;
import rx.Emitter;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes22.dex */
public class HMAccountWebExtAPI {
    private static final String a = "AccountExternalAPI";
    private static final String b = "users/{userId}";

    public class a implements IHMBasicHttpResponseHandler {
        public final /* synthetic */ Emitter a;

        public a(final Emitter val$emitter) {
            this.a = val$emitter;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int type) {
            this.a.onError(null);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable throwable) {
            this.a.onError(throwable);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData item) {
            this.a.onError(null);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onSuccess(HMHttpResponseData item) {
            HMLog.v(HMAccountWebExtAPI.a, "item: " + item.toString(), new Object[0]);
            try {
                this.a.onNext(new JSONObject(new String(item.getResponseBody(), Charset.defaultCharset())).getString("birthday"));
                this.a.onCompleted();
            } catch (Exception e) {
                e.printStackTrace();
                this.a.onError(e);
            }
        }
    }

    public class b extends IHMSimpleHttpResponseHandler {
        public final /* synthetic */ Action0 a;

        public b(final Action0 val$successCallback) {
            this.a = val$successCallback;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData item) {
            HMLog.i(HMAccountWebExtAPI.a, "updateProfile failed: " + item, new Object[0]);
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse response, HMHttpResponseData item) {
            if (response.success() && item.isSuccess()) {
                HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
                String remoteAvatar = HMAccountWebExtAPI.parseRemoteAvatar(response);
                if (!TextUtils.isEmpty(remoteAvatar)) {
                    hMPersonInfo.getUserInfo().setAvatar(remoteAvatar);
                }
                hMPersonInfo.saveInfo(0);
                this.a.call();
            }
        }
    }

    public class c extends IHMSimpleHttpResponseHandler {
        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData item) {
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse response, HMHttpResponseData item) {
            if (response.success() && item.isSuccess()) {
                HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
                String remoteAvatar = HMAccountWebExtAPI.parseRemoteAvatar(response);
                if (!TextUtils.isEmpty(remoteAvatar)) {
                    hMPersonInfo.getUserInfo().setAvatar(remoteAvatar);
                }
                hMPersonInfo.saveInfo(0);
            }
        }
    }

    public class d extends IHMSimpleHttpResponseHandler {
        public final /* synthetic */ Action1 a;

        public d(final Action1 val$callback) {
            this.a = val$callback;
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler, com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int type) {
            HMLog.i(HMAccountWebExtAPI.a, "updateProfile onCancel: " + type, new Object[0]);
            this.a.call(Boolean.FALSE);
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler, com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable throwable) {
            HMLog.i(HMAccountWebExtAPI.a, "updateProfile onError: " + throwable, new Object[0]);
            this.a.call(Boolean.FALSE);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData item) {
            HMLog.i(HMAccountWebExtAPI.a, "updateProfile failed: " + item, new Object[0]);
            this.a.call(Boolean.FALSE);
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse response, HMHttpResponseData item) {
            if (response.success() && item.isSuccess()) {
                HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
                String remoteAvatar = HMAccountWebExtAPI.parseRemoteAvatar(response);
                if (!TextUtils.isEmpty(remoteAvatar)) {
                    hMPersonInfo.getUserInfo().setAvatar(remoteAvatar);
                }
                hMPersonInfo.saveInfo(0);
                this.a.call(Boolean.TRUE);
            }
        }
    }

    public static String getMiliConfigJson(HMPersonInfo info) {
        try {
            JSONObject jSONObject = new JSONObject(HMHttpUtils.getGson().toJson(info.getMiliConfig()));
            if (WeatherUtils.isKoreaUser()) {
                HMLog.i(a, "not upload weatherSetting for korea user!", new Object[0]);
                jSONObject.put(HMAccountWebAPI.MILI_CONFIG_EXTRA_WEATHER, "");
            }
            return jSONObject.toString();
        } catch (Exception e) {
            HMLog.i(a, e.toString(), new Object[0]);
            return null;
        }
    }

    private static Observable<String> i() {
        return Observable.create(new Action1() { // from class: ki2
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                HMAccountWebExtAPI.j((Emitter) obj);
            }
        }, Emitter.BackpressureMode.BUFFER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(Emitter emitter) {
        String url = HMServerDef.getUrl(b.replace("{userId}", HMPersonInfo.getInstance().getUserInfo().getUserid()));
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("userId", HMPersonInfo.getInstance().getUserInfo().getUserid());
        HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.GET, true, new a(emitter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String k() {
        return "保存用户信息失败: 用户未登录";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String l(Throwable th) {
        return "保存用户信息失败: " + Log.getThrowableString(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean m(String str) {
        return Boolean.valueOf(!TextUtils.isEmpty(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean n(String str) {
        String stringData = Birthday.fromStr(str).toStringData();
        if (stringData == null) {
            return Boolean.FALSE;
        }
        HMPersonInfo.getInstance().getUserInfo().setBirthday(stringData);
        HMPersonInfo.getInstance().saveInfo(2);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(Void r0) {
    }

    public static String parseRemoteAvatar(WebResponse response) {
        try {
            return new JSONObject(response.data).optString(WebAPI.PARAM_SHARE_INVITE_AVATAR, null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(Throwable th) {
    }

    public static void safeUpdateProfile(Action1<Boolean> callback) {
        try {
            if (HMLoginManager.isUserValid()) {
                updateProfile(callback);
            } else {
                HMLog.error(a, new Function0() { // from class: ti2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HMAccountWebExtAPI.k();
                    }
                });
                callback.call(Boolean.FALSE);
            }
        } catch (Throwable th) {
            HMLog.error(a, new Function0() { // from class: si2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMAccountWebExtAPI.l(th);
                }
            });
            callback.call(Boolean.FALSE);
        }
    }

    public static void updateProfile() {
        updateProfile(false);
    }

    public static Observable<Boolean> updateUserBirthday(boolean isMainTab) {
        Calendar calendar = Calendar.getInstance();
        HMAccountKeeper hMAccountKeeper = HMAccountKeeper.INSTANCE;
        calendar.setTimeInMillis(hMAccountKeeper.getCheckUserBirthdayTime());
        int age = HMPersonInfo.getInstance().getUserInfo().getAge();
        if (TimeUtils.isToday(calendar) && isMainTab && age != 0) {
            return Observable.just(Boolean.FALSE);
        }
        hMAccountKeeper.setCheckUserBirthdayTime(System.currentTimeMillis());
        return i().subscribeOn(Schedulers.io()).filter(new Func1() { // from class: li2
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return HMAccountWebExtAPI.m((String) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).map(new Func1() { // from class: mi2
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return HMAccountWebExtAPI.n((String) obj);
            }
        });
    }

    public static void uploadUserBirthdayASync() {
        Observable.create(new Action1() { // from class: ji2
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                HMAccountWebAPI.uploadUserBirthday();
            }
        }, Emitter.BackpressureMode.BUFFER).subscribeOn(Schedulers.io()).subscribe(new Action1() { // from class: vi2
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                HMAccountWebExtAPI.p((Void) obj);
            }
        }, new Action1() { // from class: ui2
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                HMAccountWebExtAPI.q((Throwable) obj);
            }
        });
    }

    public static void updateProfile(Action0 successCallback) {
        HMAccountWebAPI.updateProfile(HMPersonInfo.getInstance(), false, new b(successCallback));
    }

    public static void updateProfile(boolean isForce) {
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        if (!isForce && hMPersonInfo.getUserInfo().getSynced() == 0) {
            HMLog.v(a, "user profile is not changed ! return ", new Object[0]);
        } else {
            HMAccountWebAPI.updateProfile(hMPersonInfo, false, new c());
        }
    }

    public static void updateProfile(Action1<Boolean> callback) {
        HMAccountWebAPI.updateProfile(HMPersonInfo.getInstance(), false, new d(callback));
    }
}
