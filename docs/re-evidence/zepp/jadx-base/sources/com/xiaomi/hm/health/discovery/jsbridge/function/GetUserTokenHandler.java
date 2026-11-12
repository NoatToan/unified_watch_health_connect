package com.xiaomi.hm.health.discovery.jsbridge.function;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huami.account.HMLoginManager;
import com.huami.account.api.model.HMWebAccess;
import com.huami.account.keeper.FrozenAccountKeeper;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.service.AnonymousInfo;
import com.huami.account.service.AnonymousInfoManager;
import com.huami.account.utils.PolicyTipUtil;
import com.huami.discovery.bridge.jsbridge.JsBridgeError;
import com.huami.discovery.bridge.jsbridge.JsCallBackFunction;
import com.huami.discovery.bridge.jsbridge.api.ApiHandler;
import com.huami.discovery.bridge.jsbridge.common.ErrorMessage;
import com.huami.passport.AccountManager;
import com.huami.passport.Configs;
import com.huami.passport.entity.HttpDNS;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.discovery.jsbridge.function.GetUserTokenHandler;
import com.xiaomi.hm.health.privacy.AnonymousManager;
import com.xiaomi.hm.health.utils.Utils;
import java.util.List;
import java.util.concurrent.Callable;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes21.dex */
public class GetUserTokenHandler implements ApiHandler {
    private static final String b = "GetUserTokenHandler";
    private Context a;

    public class a implements Callable<String> {
        public final /* synthetic */ b a;

        public a(final b val$ut) {
            this.a = val$ut;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() throws Exception {
            String lastLoginProvider = HMAccountKeeper.INSTANCE.getLastLoginProvider("xiaomi");
            this.a.a = HMLoginManager.getHuamiId();
            if (HMLoginManager.isOldAccount()) {
                this.a.c = "mi";
                return HMLoginManager.getSecurity();
            }
            if (PolicyTipUtil.isNeedIntercept()) {
                AnonymousInfo anonymousInfo = AnonymousInfoManager.getAnonymousInfo();
                if (anonymousInfo != null) {
                    return anonymousInfo.getToken();
                }
                return null;
            }
            if (!HMLoginManager.isHuamiSDKLogin()) {
                return null;
            }
            String token = HMWebAccess.getToken();
            if (TextUtils.isEmpty(token)) {
                HMLog.i(GetUserTokenHandler.b, "get token error", new Object[0]);
            }
            if ("wechat".equals(lastLoginProvider)) {
                this.a.c = "wechat";
                return token;
            }
            if ("xiaomi".equals(lastLoginProvider)) {
                this.a.c = "mi";
                return token;
            }
            this.a.c = "huami";
            return token;
        }
    }

    public static class b {
        public static final String f = "mi";
        public static final String g = "huami";
        public static final String h = "wechat";
        public static final String i = "weibo";
        public static final String j = "weibo";

        @SerializedName("uid")
        public String a;

        @SerializedName("token")
        public String b;

        @SerializedName("openType")
        public String c;

        @SerializedName("openId")
        public String d;

        @SerializedName(Configs.Params.DOMAINS)
        public List<HttpDNS> e;

        private b() {
        }
    }

    public GetUserTokenHandler(Context context) {
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(b bVar, JsCallBackFunction jsCallBackFunction, long j, String str) {
        bVar.b = str;
        bVar.d = HMLoginManager.getThirdId();
        bVar.e = AccountManager.getDefault(this.a).getHttpDNS(this.a);
        jsCallBackFunction.onCallBack(Utils.getGson().toJson(bVar));
        HMLog.v(b, "getUserToken done, elapsedTime: " + (System.currentTimeMillis() - j), new Object[0]);
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public ErrorMessage getFailedResult() {
        return null;
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public void handleData(String data, final JsCallBackFunction function) {
        final b bVar = new b();
        FrozenAccountKeeper frozenAccountKeeper = FrozenAccountKeeper.INSTANCE;
        if (frozenAccountKeeper.getUserToken() != null && frozenAccountKeeper.getUserId() != null) {
            bVar.a = frozenAccountKeeper.getUserId();
            bVar.b = frozenAccountKeeper.getUserToken();
            bVar.c = frozenAccountKeeper.getUserProvider();
            function.onCallBack(Utils.getGson().toJson(bVar));
            return;
        }
        if (!HMLoginManager.isUnInit() || AnonymousManager.isAnonymousLogin()) {
            HMLog.v(b, "getUserToken start", new Object[0]);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            Observable.fromCallable(new a(bVar)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: com.xiaomi.hm.health.discovery.jsbridge.function.a
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    this.a.c(bVar, function, jCurrentTimeMillis, (String) obj);
                }
            }, new Action1() { // from class: ag2
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    HMLog.w(GetUserTokenHandler.b, (Throwable) obj);
                }
            });
        } else {
            bVar.a = "";
            bVar.b = "";
            function.onCallBack(Utils.getGson().toJson(new JsBridgeError(4030803L, new String[0])));
        }
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public boolean handleData(String data) {
        return false;
    }
}
