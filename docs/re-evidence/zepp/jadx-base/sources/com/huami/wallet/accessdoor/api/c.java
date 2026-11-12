package com.huami.wallet.accessdoor.api;

import android.text.TextUtils;
import com.huami.nfc.base.PayResponse;
import com.huami.tools.log.HMLog;
import com.huami.wallet.accessdoor.api.exception.NetworkNotConnectedException;
import com.huami.wallet.accessdoor.helper.Resource;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.functions.Function;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.UndeclaredThrowableException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes15.dex */
class c<T> implements FlowableTransformer<Resource<T>, Resource<T>> {
    private static final String b = "Door-CloudAccessDoorSource";
    private OnAccessDoorHttpError a;

    public c(OnAccessDoorHttpError onAccessDoorHttpError) {
        this.a = onAccessDoorHttpError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource c(Resource resource) throws Exception {
        String str;
        OnAccessDoorHttpError onAccessDoorHttpError;
        if (resource == null || (str = resource.code) == null) {
            return resource;
        }
        if ((!str.equals("http401") && !resource.code.equals(PayResponse.CODE_HTTP_ERROR_MI_TOKEN)) || (onAccessDoorHttpError = this.a) == null) {
            return resource;
        }
        onAccessDoorHttpError.onHttpError(resource.code, TextUtils.isEmpty(resource.rawMessage) ? "token 校验错误或者小米认证时出错" : resource.rawMessage);
        return Resource.error(resource.code, resource.message, resource.rawMessage, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Resource d(Throwable th) throws Exception {
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
        if ((th instanceof UnknownHostException) || (th instanceof NetworkNotConnectedException) || (th instanceof SocketTimeoutException)) {
            HMLog.w(b, th, "拦截到门禁卡相关操作产生的可能是网络未捕获的异常", new Object[0]);
            return Resource.error(PayResponse.CODE_NETWORK_ERROR, th.getMessage(), null);
        }
        HMLog.w(b, th, "拦截到门禁卡相关操作产生的未捕获的异常", new Object[0]);
        return Resource.error("w10000", th.getMessage(), null);
    }

    @Override // io.reactivex.FlowableTransformer
    public Publisher<Resource<T>> apply(Flowable<Resource<T>> flowable) {
        return flowable.map(new Function() { // from class: com.huami.wallet.accessdoor.api.a
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.a.c((Resource) obj);
            }
        }).onErrorReturn(new Function() { // from class: com.huami.wallet.accessdoor.api.b
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return c.d((Throwable) obj);
            }
        }).startWith(Resource.loading(null));
    }
}
