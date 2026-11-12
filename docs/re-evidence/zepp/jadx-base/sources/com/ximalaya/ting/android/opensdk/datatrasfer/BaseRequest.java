package com.ximalaya.ting.android.opensdk.datatrasfer;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ximalaya.ting.android.opensdk.httputil.BaseResponse;
import com.ximalaya.ting.android.opensdk.httputil.ExecutorDelivery;
import com.ximalaya.ting.android.opensdk.httputil.IHttpCallBack;
import com.ximalaya.ting.android.opensdk.httputil.XimalayaException;
import java.util.Map;
import okhttp3.Response;

/* JADX INFO: loaded from: classes22.dex */
public abstract class BaseRequest {
    public static ExecutorDelivery delivery;
    public static Handler mHandler;
    public String mAppsecret;
    public String mAppkey = "";
    public String mAppid = "";

    public interface IRequestCallBack<T> {
        T success(String str) throws Exception;
    }

    static {
        Handler handler = new Handler(Looper.getMainLooper());
        mHandler = handler;
        delivery = new ExecutorDelivery(handler);
    }

    public static <T> T baseGetReqeustSync(String str, Map<String, String> map, IRequestCallBack<T> iRequestCallBack, IRequestHandler iRequestHandler) throws Exception {
        try {
            try {
                String strDoSync = AccessTokenBaseCall.doSync(iRequestHandler.getRequest(), map, iRequestHandler.getAppSercet(), str);
                if (iRequestCallBack == null) {
                    return null;
                }
                try {
                    return iRequestCallBack.success(strDoSync);
                } catch (Exception e) {
                    throw e;
                }
            } catch (XimalayaException e2) {
                throw e2;
            }
        } catch (XimalayaException e3) {
            throw e3;
        }
    }

    public static <T extends XimalayaResponse> void baseGetRequest(String str, Map<String, String> map, final IDataCallBack<T> iDataCallBack, final IRequestCallBack<T> iRequestCallBack, IRequestHandler iRequestHandler) {
        try {
            AccessTokenBaseCall.doAsync(iRequestHandler.getRequest(), new IHttpCallBack() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.1
                @Override // com.ximalaya.ting.android.opensdk.httputil.IHttpCallBack
                public void onFailure(int i, String str2) {
                    BaseRequest.delivery.postError(i, str2, iDataCallBack);
                }

                @Override // com.ximalaya.ting.android.opensdk.httputil.IHttpCallBack
                public void onResponse(Response response) {
                    try {
                        String responseBodyToString = new BaseResponse(response).getResponseBodyToString();
                        IRequestCallBack iRequestCallBack2 = iRequestCallBack;
                        if (iRequestCallBack2 != null) {
                            BaseRequest.delivery.postSuccess(iDataCallBack, iRequestCallBack2.success(responseBodyToString));
                        } else {
                            BaseRequest.delivery.postSuccess(iDataCallBack, null);
                        }
                    } catch (Exception e) {
                        if (TextUtils.isEmpty(e.getMessage())) {
                            BaseRequest.delivery.postError(1007, "parse response json data error", iDataCallBack);
                        } else {
                            BaseRequest.delivery.postError(1007, e.getMessage(), iDataCallBack);
                        }
                    }
                }
            }, map, iRequestHandler.getAppSercet(), str);
        } catch (XimalayaException e) {
            iDataCallBack.onError(e.getErrorCode(), e.getMessage());
        }
    }

    public static <T> void basePostRequest(String str, Map<String, String> map, final IDataCallBack<T> iDataCallBack, final IRequestCallBack<T> iRequestCallBack, IRequestHandler iRequestHandler) {
        try {
            AccessTokenBaseCall.doAsync(iRequestHandler.getRequest(), new IHttpCallBack() { // from class: com.ximalaya.ting.android.opensdk.datatrasfer.BaseRequest.2
                @Override // com.ximalaya.ting.android.opensdk.httputil.IHttpCallBack
                public void onFailure(int i, String str2) {
                    BaseRequest.delivery.postError(i, str2, iDataCallBack);
                }

                @Override // com.ximalaya.ting.android.opensdk.httputil.IHttpCallBack
                public void onResponse(Response response) {
                    try {
                        String responseBodyToString = new BaseResponse(response).getResponseBodyToString();
                        IRequestCallBack iRequestCallBack2 = iRequestCallBack;
                        if (iRequestCallBack2 != null) {
                            BaseRequest.delivery.postSuccess(iDataCallBack, iRequestCallBack2.success(responseBodyToString));
                        } else {
                            BaseRequest.delivery.postSuccess(iDataCallBack, null);
                        }
                    } catch (Exception e) {
                        if (TextUtils.isEmpty(e.getMessage())) {
                            BaseRequest.delivery.postError(1007, "parse response json data error", iDataCallBack);
                        } else {
                            BaseRequest.delivery.postError(1007, e.getMessage(), iDataCallBack);
                        }
                    }
                }
            }, map, iRequestHandler.getAppSercet(), str);
        } catch (XimalayaException e) {
            iDataCallBack.onError(e.getErrorCode(), e.getMessage());
        }
    }

    public static <T> T basePostRequestSync(String str, Map<String, String> map, IRequestCallBack<T> iRequestCallBack, IRequestHandler iRequestHandler) throws Exception {
        try {
            try {
                String strDoSync = AccessTokenBaseCall.doSync(iRequestHandler.getRequest(), map, iRequestHandler.getAppSercet(), str);
                if (iRequestCallBack == null) {
                    return null;
                }
                try {
                    return iRequestCallBack.success(strDoSync);
                } catch (Exception e) {
                    throw e;
                }
            } catch (XimalayaException e2) {
                throw e2;
            }
        } catch (XimalayaException e3) {
            throw e3;
        }
    }

    public String getAppsecret() {
        return this.mAppsecret;
    }

    public void setAppkey(String str) {
        this.mAppkey = str;
    }

    public void setAppsecret(String str) {
        this.mAppsecret = str;
    }

    public void setPackid(String str) {
        this.mAppid = str;
    }
}
