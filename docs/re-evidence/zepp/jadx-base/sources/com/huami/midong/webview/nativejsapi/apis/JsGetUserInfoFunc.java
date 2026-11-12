package com.huami.midong.webview.nativejsapi.apis;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.huami.midong.webview.JsBridgeDelegate;
import com.huami.midong.webview.jsbridge.JsBridgeError;
import com.huami.midong.webview.jsbridge.JsCallBackFunction;
import com.huami.midong.webview.nativejsapi.JsBridgeNativeAPIEnum;
import com.huami.midong.webview.nativejsapi.apis.JsGetUserInfoFunc;
import com.huami.watch.util.Rx;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;

/* JADX INFO: loaded from: classes11.dex */
public class JsGetUserInfoFunc extends JsBridgeFunc {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$0(ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(JsBridgeDelegate.getJsBridgeCallback().getUserInfo(this.mNativeApi.getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$execute$1(JsCallBackFunction jsCallBackFunction, String str) throws Exception {
        if (TextUtils.isEmpty(str)) {
            jsCallBackFunction.onCallBack(new Gson().toJson(new JsBridgeError(4030803L, new String[0])));
        } else {
            jsCallBackFunction.onCallBack(str);
        }
    }

    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public void execute(String str, final JsCallBackFunction jsCallBackFunction) {
        Rx.io(new ObservableOnSubscribe() { // from class: vj4
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.lambda$execute$0(observableEmitter);
            }
        }).safeSubscribe(new Consumer() { // from class: wj4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                JsGetUserInfoFunc.lambda$execute$1(jsCallBackFunction, (String) obj);
            }
        });
    }

    @Override // com.huami.midong.webview.nativejsapi.apis.JsBridgeFunc
    public JsBridgeNativeAPIEnum func() {
        return JsBridgeNativeAPIEnum.FUNC_GET_USERS_INFO;
    }
}
