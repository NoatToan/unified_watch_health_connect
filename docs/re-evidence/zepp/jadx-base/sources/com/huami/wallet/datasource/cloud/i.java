package com.huami.wallet.datasource.cloud;

import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.nfc.applet.BlackListException;
import com.huami.nfc.base.PayResponse;
import com.huami.tools.log.HMLog;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.util.ErrorCode;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.UndeclaredThrowableException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes13.dex */
class i<T> implements FlowableTransformer<Resource<T>, Resource<T>> {
    private static final String d = "NFC_BLACKLIST_CARD";
    private static final String e = "City";
    private static final String f = "DeviceSource";
    private final OnWalletHttpError a;
    private final String b;
    private final String c;

    public i(CloudDataSource.Config config, String str, String str2) {
        this.a = config.onWalletHttpError;
        this.b = str;
        this.c = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource c(Throwable th) throws Exception {
        Throwable cause = th;
        do {
            if (!(cause instanceof UndeclaredThrowableException) && !(cause instanceof InvocationTargetException)) {
                break;
            }
            cause = cause.getCause();
        } while (cause != null);
        if (cause != null) {
            th = cause;
        }
        if ((th instanceof UnknownHostException) || (th instanceof j) || (th instanceof SocketTimeoutException)) {
            return Resource.error(ErrorCode.NETWORK_ERROR, th.getMessage(), null);
        }
        if (th instanceof c) {
            return Resource.error(Const.InternalErrorCode.CODE_NO_CITY, th.getMessage(), null);
        }
        if (!(th instanceof BlackListException)) {
            HMLog.w(CloudDataSource.y, th, "拦截到公交支付相关操作产生的未捕获的异常", new Object[0]);
            return Resource.error("w10000", th.getMessage(), null);
        }
        HashMap map = new HashMap(2);
        map.put("City", "" + this.b);
        map.put("DeviceSource", "" + this.c);
        Analytics.recordEvent(new CountEventBuilder(d).putExtras(map));
        return Resource.error(ErrorCode.CARD_IN_BLACK_LIST, th.getMessage(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(Resource resource) throws Exception {
        String str;
        OnWalletHttpError onWalletHttpError;
        if (resource == null || (str = resource.code) == null) {
            return;
        }
        if ((str.startsWith("http401") || resource.code.equals(PayResponse.CODE_HTTP_ERROR_MI_TOKEN)) && (onWalletHttpError = this.a) != null) {
            onWalletHttpError.onHttpError(resource.code, resource.message);
        }
    }

    @Override // io.reactivex.FlowableTransformer
    public Publisher<Resource<T>> apply(Flowable<Resource<T>> flowable) {
        return flowable.onErrorReturn(new Function() { // from class: com.huami.wallet.datasource.cloud.h
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.a.c((Throwable) obj);
            }
        }).doOnNext(new Consumer() { // from class: com.huami.wallet.datasource.cloud.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.d((Resource) obj);
            }
        }).startWith(Resource.loading(null));
    }
}
