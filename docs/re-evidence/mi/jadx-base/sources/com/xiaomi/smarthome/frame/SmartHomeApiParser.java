package com.xiaomi.smarthome.frame;

import com.xiaomi.smarthome.core.entity.net.NetResult;
import com.xiaomi.smarthome.library.safejson.JSONObjectSafe;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class SmartHomeApiParser {
    private static Object mLock = new Object();
    private static volatile SmartHomeApiParser sInstance;
    private ExecutorService mThreadPool = Executors.newCachedThreadPool();

    private SmartHomeApiParser() {
    }

    public static SmartHomeApiParser getInstance() {
        if (sInstance == null) {
            synchronized (mLock) {
                try {
                    if (sInstance == null) {
                        sInstance = new SmartHomeApiParser();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public <R> void parse(NetResult netResult, JsonParser<R> jsonParser, AsyncCallback<R, Error> asyncCallback) {
        parse(netResult, jsonParser, asyncCallback, false);
    }

    public <R> void parse(final NetResult netResult, final JsonParser<R> jsonParser, final AsyncCallback<R, Error> asyncCallback, final boolean z) {
        if (netResult != null) {
            this.mThreadPool.submit(new Runnable() { // from class: com.xiaomi.smarthome.frame.SmartHomeApiParser.1
                @Override // java.lang.Runnable
                public void run() {
                    AsyncCallback asyncCallback2;
                    try {
                        JSONObject jSONObject = new JSONObject(netResult.mResponse);
                        int iOptInt = jSONObject.optInt("code");
                        if (ErrorCode.valueof(iOptInt) != ErrorCode.SUCCESS) {
                            if (netResult.mIsCache || asyncCallback == null) {
                                return;
                            }
                            asyncCallback.sendFailureMessage(new Error(iOptInt, jSONObject.optString("message"), netResult.mResponse));
                            return;
                        }
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
                        JSONObjectSafe jSONObjectSafe = (jSONObjectOptJSONObject == null || z) ? new JSONObjectSafe(jSONObject) : new JSONObjectSafe(jSONObjectOptJSONObject);
                        JsonParser jsonParser2 = jsonParser;
                        if (jsonParser2 == null) {
                            if (netResult.mIsCache) {
                                AsyncCallback asyncCallback3 = asyncCallback;
                                if (asyncCallback3 != null) {
                                    asyncCallback3.sendCacheMessage(null);
                                    return;
                                }
                                return;
                            }
                            AsyncCallback asyncCallback4 = asyncCallback;
                            if (asyncCallback4 != null) {
                                asyncCallback4.sendSuccessMessage(null);
                                return;
                            }
                            return;
                        }
                        Object obj = jsonParser2.parse(jSONObjectSafe);
                        if (netResult.mIsCache) {
                            AsyncCallback asyncCallback5 = asyncCallback;
                            if (asyncCallback5 != null) {
                                asyncCallback5.sendCacheMessage(obj);
                                return;
                            }
                            return;
                        }
                        AsyncCallback asyncCallback6 = asyncCallback;
                        if (asyncCallback6 != null) {
                            asyncCallback6.sendSuccessMessage(obj);
                        }
                    } catch (Exception unused) {
                        if (netResult.mIsCache || (asyncCallback2 = asyncCallback) == null) {
                            return;
                        }
                        asyncCallback2.sendFailureMessage(new Error(ErrorCode.INVALID.getCode(), "wrong response format"));
                    }
                }
            });
        } else if (asyncCallback != null) {
            asyncCallback.sendFailureMessage(new Error(ErrorCode.INVALID.getCode(), "SmartHomeApiParser.parse netResult is null"));
        }
    }
}
