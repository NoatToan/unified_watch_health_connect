package com.huami.midong.webview.nativejsapi.apis;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.huami.midong.webview.JsBridgeDelegate;
import com.huami.midong.webview.jsbridge.JsCallBackFunction;
import com.huami.midong.webview.nativejsapi.JsBridgeNativeAPIEnum;
import com.huami.midong.webview.nativejsapi.apis.JsGetUserTokenFunc;
import com.huami.tools.log.HMLog;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public class JsGetUserTokenFunc extends JsBridgeFunc {

    public static class LoginInfo {
        public static final String TYPE_HUAMI = "huami";
        public static final String TYPE_MI = "mi";

        @SerializedName("openId")
        public String openId;

        @SerializedName("openType")
        public String type;

        @SerializedName("uid")
        public String uid = "";

        @SerializedName("token")
        public String token = "";

        public static String convertType(String str) {
            return "huami";
        }

        public String getOpenId() {
            return this.openId;
        }

        public String getToken() {
            return this.token;
        }

        public String getType() {
            return this.type;
        }

        public String getUid() {
            return this.uid;
        }

        public void setOpenId(String str) {
            this.openId = str;
        }

        public void setToken(String str) {
            this.token = str;
        }

        public void setType(String str) {
            this.type = str;
        }

        public void setUid(String str) {
            this.uid = str;
        }

        public String toString() {
            return " LoginInfo : [ uid : " + this.uid + " ,token : " + this.token + " ,type : " + this.type;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$execute$0(ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(JsBridgeDelegate.getJsBridgeCallback().getUserToken());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$execute$1(JsCallBackFunction jsCallBackFunction, LoginInfo loginInfo) throws Exception {
        jsCallBackFunction.onCallBack(new Gson().toJson(loginInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$execute$3(Throwable th) throws Exception {
        HMLog.warn(JsBridgeFunc.TAG, th, new Function0() { // from class: ak4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JsGetUserTokenFunc.lambda$null$2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$null$2() {
        return "";
    }

    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public void execute(String str, final JsCallBackFunction jsCallBackFunction) {
        Observable.create(new ObservableOnSubscribe() { // from class: xj4
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                JsGetUserTokenFunc.lambda$execute$0(observableEmitter);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: yj4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                JsGetUserTokenFunc.lambda$execute$1(jsCallBackFunction, (JsGetUserTokenFunc.LoginInfo) obj);
            }
        }, new Consumer() { // from class: zj4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                JsGetUserTokenFunc.lambda$execute$3((Throwable) obj);
            }
        });
    }

    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public JsBridgeNativeAPIEnum func() {
        return JsBridgeNativeAPIEnum.FUNC_GET_USER_TOKEN;
    }
}
