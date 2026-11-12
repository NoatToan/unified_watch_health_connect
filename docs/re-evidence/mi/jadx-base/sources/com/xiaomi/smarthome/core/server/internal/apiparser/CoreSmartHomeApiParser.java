package com.xiaomi.smarthome.core.server.internal.apiparser;

import com.xiaomi.smarthome.core.entity.net.NetResult;
import com.xiaomi.smarthome.core.server.internal.CoreAsyncCallback;
import com.xiaomi.smarthome.core.server.internal.CoreError;
import com.xiaomi.smarthome.frame.ErrorCode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class CoreSmartHomeApiParser {
    private static Object mLock = new Object();
    private static volatile CoreSmartHomeApiParser sInstance;
    private volatile ExecutorService mThreadPool = Executors.newCachedThreadPool();

    private CoreSmartHomeApiParser() {
    }

    public static CoreSmartHomeApiParser getInstance() {
        if (sInstance == null) {
            synchronized (mLock) {
                try {
                    if (sInstance == null) {
                        sInstance = new CoreSmartHomeApiParser();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public <R> void parse(final NetResult netResult, final CoreJsonParser<R> coreJsonParser, final CoreAsyncCallback<R, CoreError> coreAsyncCallback) {
        if (this.mThreadPool != null && netResult != null) {
            this.mThreadPool.submit(new Runnable() { // from class: com.xiaomi.smarthome.core.server.internal.apiparser.CoreSmartHomeApiParser.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        JSONObject jSONObject = new JSONObject(netResult.mResponse);
                        int iOptInt = jSONObject.optInt("code");
                        if (ErrorCode.valueof(iOptInt) == ErrorCode.SUCCESS) {
                            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
                            if (jSONObjectOptJSONObject != null) {
                                jSONObject = jSONObjectOptJSONObject;
                            }
                            CoreJsonParser coreJsonParser2 = coreJsonParser;
                            if (coreJsonParser2 != null) {
                                Object obj = coreJsonParser2.parse(jSONObject);
                                CoreAsyncCallback coreAsyncCallback2 = coreAsyncCallback;
                                if (coreAsyncCallback2 != null) {
                                    coreAsyncCallback2.sendSuccessMessage(obj);
                                }
                            } else {
                                CoreAsyncCallback coreAsyncCallback3 = coreAsyncCallback;
                                if (coreAsyncCallback3 != null) {
                                    coreAsyncCallback3.sendSuccessMessage(null);
                                }
                            }
                        } else if (coreAsyncCallback != null) {
                            coreAsyncCallback.sendFailureMessage(new CoreError(iOptInt, jSONObject.optString("message")));
                        }
                    } catch (Exception unused) {
                        CoreAsyncCallback coreAsyncCallback4 = coreAsyncCallback;
                        if (coreAsyncCallback4 != null) {
                            coreAsyncCallback4.sendFailureMessage(new CoreError(ErrorCode.INVALID.getCode(), "wrong response format"));
                        }
                    }
                }
            });
            return;
        }
        if (coreAsyncCallback != null) {
            coreAsyncCallback.sendFailureMessage(new CoreError(ErrorCode.INVALID.getCode(), "CoreSmartHomeApiParser.parse netResult is:" + netResult));
        }
    }
}
