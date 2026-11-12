package com.huami.account.userinfo.webapi;

import android.text.TextUtils;
import com.huami.account.api.HMAccountWebAPI;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.userinfo.bean.Birthday;
import com.huami.account.userinfo.webapi.HMAccountWebExtAPI;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Map;
import org.json.JSONObject;
import rx.Emitter;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes4.dex */
public class HMAccountWebExtAPI {
    private static final String a = "AccountExternalAPI";
    private static final String b = "users/{userId}";

    public class a implements IHMBasicHttpResponseHandler {
        public final /* synthetic */ Emitter a;

        public a(Emitter emitter) {
            this.a = emitter;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            this.a.onError(null);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            this.a.onError(null);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onSuccess(HMHttpResponseData hMHttpResponseData) {
            HMLog.v(HMAccountWebExtAPI.a, "item: " + hMHttpResponseData.toString(), new Object[0]);
            try {
                this.a.onNext(new JSONObject(new String(hMHttpResponseData.getResponseBody(), Charset.defaultCharset())).getString("birthday"));
                this.a.onCompleted();
            } catch (Exception e) {
                e.printStackTrace();
                this.a.onError(e);
            }
        }
    }

    public class b extends IHMSimpleHttpResponseHandler {
        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
            if (webResponse.success() && hMHttpResponseData.isSuccess()) {
                HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
                String remoteAvatar = HMAccountWebExtAPI.parseRemoteAvatar(webResponse);
                if (!TextUtils.isEmpty(remoteAvatar)) {
                    hMPersonInfo.getUserInfo().setAvatar(remoteAvatar);
                }
                hMPersonInfo.saveInfo(0);
            }
        }
    }

    public class c extends IHMSimpleHttpResponseHandler {
        public final /* synthetic */ Action0 a;

        public c(Action0 action0) {
            this.a = action0;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            HMLog.i(HMAccountWebExtAPI.a, "updateProfile failed: " + hMHttpResponseData, new Object[0]);
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
            if (webResponse.success() && hMHttpResponseData.isSuccess()) {
                HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
                String remoteAvatar = HMAccountWebExtAPI.parseRemoteAvatar(webResponse);
                if (!TextUtils.isEmpty(remoteAvatar)) {
                    hMPersonInfo.getUserInfo().setAvatar(remoteAvatar);
                }
                hMPersonInfo.saveInfo(0);
                this.a.call();
            }
        }
    }

    private static Observable<String> g() {
        return Observable.create(new Action1() { // from class: pi2
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                HMAccountWebExtAPI.h((Emitter) obj);
            }
        }, Emitter.BackpressureMode.BUFFER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Emitter emitter) {
        String url = HMServerDef.getUrl(b.replace("{userId}", HMPersonInfo.getInstance().getUserInfo().getUserid()));
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("userId", HMPersonInfo.getInstance().getUserInfo().getUserid());
        HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.GET, true, new a(emitter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean i(String str) {
        return Boolean.valueOf(!TextUtils.isEmpty(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean j(String str) {
        String stringData = Birthday.fromStr(str).toStringData();
        if (stringData == null) {
            return Boolean.FALSE;
        }
        HMPersonInfo.getInstance().getUserInfo().setBirthday(stringData);
        HMPersonInfo.getInstance().saveInfo(2);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(Throwable th) {
    }

    public static String parseRemoteAvatar(WebResponse webResponse) {
        try {
            return new JSONObject(webResponse.data).optString(WebAPI.PARAM_SHARE_INVITE_AVATAR, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void updateProfile() {
        updateProfile(false);
    }

    public static Observable<Boolean> updateUserBirthday(boolean z) {
        Calendar calendar = Calendar.getInstance();
        HMAccountKeeper hMAccountKeeper = HMAccountKeeper.INSTANCE;
        calendar.setTimeInMillis(hMAccountKeeper.getCheckUserBirthdayTime());
        int age = HMPersonInfo.getInstance().getUserInfo().getAge();
        if (TimeUtils.isToday(calendar) && z && age != 0) {
            return Observable.just(Boolean.FALSE);
        }
        hMAccountKeeper.setCheckUserBirthdayTime(System.currentTimeMillis());
        return g().subscribeOn(Schedulers.io()).filter(new Func1() { // from class: ri2
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return HMAccountWebExtAPI.i((String) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).map(new Func1() { // from class: qi2
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return HMAccountWebExtAPI.j((String) obj);
            }
        });
    }

    public static void uploadUserBirthdayASync() {
        Observable.create(new Action1() { // from class: oi2
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                HMAccountWebAPI.uploadUserBirthday();
            }
        }, Emitter.BackpressureMode.BUFFER).subscribeOn(Schedulers.io()).subscribe(new Action1() { // from class: ni2
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                HMAccountWebExtAPI.l((Void) obj);
            }
        }, new Action1() { // from class: ii2
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                HMAccountWebExtAPI.m((Throwable) obj);
            }
        });
    }

    public static void updateProfile(boolean z) {
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        if (z || hMPersonInfo.getUserInfo().getSynced() != 0) {
            HMAccountWebAPI.updateProfile(hMPersonInfo, false, new b());
        } else {
            HMLog.v(a, "user profile is not changed ! return ", new Object[0]);
        }
    }

    public static void updateProfile(Action0 action0) {
        HMAccountWebAPI.updateProfile(HMPersonInfo.getInstance(), false, new c(action0));
    }
}
