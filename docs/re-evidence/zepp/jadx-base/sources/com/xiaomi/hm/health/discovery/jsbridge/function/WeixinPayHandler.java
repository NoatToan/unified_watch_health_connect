package com.xiaomi.hm.health.discovery.jsbridge.function;

import com.huami.discovery.bridge.jsbridge.JsBridgeError;
import com.huami.discovery.bridge.jsbridge.JsCallBackFunction;
import com.huami.discovery.bridge.jsbridge.api.ApiHandler;
import com.huami.discovery.bridge.jsbridge.common.ErrorMessage;
import com.huami.network.base.util.HMHttpUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.cashier.CashierPay;
import com.xiaomi.hm.health.cashier.model.CashierPayResponse;
import com.xiaomi.hm.health.cashier.model.WeChatPayData;
import com.xiaomi.hm.health.discovery.jsbridge.entity.JsCashierErrorRep;
import com.xiaomi.hm.health.discovery.jsbridge.entity.JsCashierSuccessRep;
import com.xiaomi.hm.health.discovery.jsbridge.function.WeixinPayHandler;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function0;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes21.dex */
public class WeixinPayHandler implements ApiHandler {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CashierPayResponse e(String str) throws Exception {
        return CashierPay.wechatPay(BraceletApp.getContext(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(JsCallBackFunction jsCallBackFunction, final CashierPayResponse cashierPayResponse) {
        Objects.requireNonNull(cashierPayResponse);
        HMLog.info("wechat_pay", new Function0() { // from class: du8
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return cashierPayResponse.toString();
            }
        });
        if (cashierPayResponse.getResult()) {
            jsCallBackFunction.onCallBack(JsCashierSuccessRep.get().toString());
        } else {
            jsCallBackFunction.onCallBack(JsCashierErrorRep.get(cashierPayResponse.getCode()).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Throwable th) {
        HMLog.error("WeixinPayHandler", "", th, new Function0() { // from class: eu8
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return WeixinPayHandler.g();
            }
        });
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public ErrorMessage getFailedResult() {
        return null;
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public void handleData(String data, final JsCallBackFunction function) {
        try {
            final String string = ((WeChatPayData) HMHttpUtils.getGson().fromJson(data, WeChatPayData.class)).toString();
            Observable.fromCallable(new Callable() { // from class: cu8
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return WeixinPayHandler.e(string);
                }
            }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: fu8
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    WeixinPayHandler.f(function, (CashierPayResponse) obj);
                }
            }, new Action1() { // from class: gu8
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    WeixinPayHandler.h((Throwable) obj);
                }
            });
        } catch (Exception unused) {
            function.onCallBack(HMHttpUtils.getGson().toJson(JsBridgeError.jsonParseError()));
        }
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public boolean handleData(String data) {
        return false;
    }
}
