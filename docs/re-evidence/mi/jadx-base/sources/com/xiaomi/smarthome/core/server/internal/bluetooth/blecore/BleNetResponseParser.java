package com.xiaomi.smarthome.core.server.internal.bluetooth.blecore;

import com.xiaomi.smarthome.library.safejson.JSONObjectSafe;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class BleNetResponseParser {
    private static final int INVALID = -9999;
    private static final int SUCCESS = 0;
    private static Object mLock = new Object();
    private static volatile BleNetResponseParser sInstance;
    private ExecutorService mThreadPool = Executors.newCachedThreadPool();

    private BleNetResponseParser() {
    }

    public static BleNetResponseParser getInstance() {
        if (sInstance == null) {
            synchronized (mLock) {
                try {
                    if (sInstance == null) {
                        sInstance = new BleNetResponseParser();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public <R> void parse(String str, BleJsonParser<R> bleJsonParser, BleAsyncCallback<R, BleNetError> bleAsyncCallback) {
        parse(str, bleJsonParser, bleAsyncCallback, false);
    }

    public <R> void parse(final String str, final BleJsonParser<R> bleJsonParser, final BleAsyncCallback<R, BleNetError> bleAsyncCallback, final boolean z) {
        if (str != null) {
            this.mThreadPool.submit(new Runnable() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetResponseParser.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        int iOptInt = jSONObject.optInt("code");
                        if (iOptInt != 0) {
                            if (bleAsyncCallback != null) {
                                bleAsyncCallback.sendFailureMessage(new BleNetError(iOptInt, jSONObject.optString("message"), str));
                                return;
                            }
                            return;
                        }
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
                        JSONObjectSafe jSONObjectSafe = (jSONObjectOptJSONObject == null || z) ? new JSONObjectSafe(jSONObject) : new JSONObjectSafe(jSONObjectOptJSONObject);
                        BleJsonParser bleJsonParser2 = bleJsonParser;
                        if (bleJsonParser2 == null) {
                            BleAsyncCallback bleAsyncCallback2 = bleAsyncCallback;
                            if (bleAsyncCallback2 != null) {
                                bleAsyncCallback2.sendSuccessMessage(null);
                                return;
                            }
                            return;
                        }
                        Object obj = bleJsonParser2.parse(jSONObjectSafe);
                        BleAsyncCallback bleAsyncCallback3 = bleAsyncCallback;
                        if (bleAsyncCallback3 != null) {
                            bleAsyncCallback3.sendSuccessMessage(obj);
                        }
                    } catch (Exception unused) {
                        BleAsyncCallback bleAsyncCallback4 = bleAsyncCallback;
                        if (bleAsyncCallback4 != null) {
                            bleAsyncCallback4.sendFailureMessage(new BleNetError(-9999, "BleNetResponseParser.parse wrong response format"));
                        }
                    }
                }
            });
        } else if (bleAsyncCallback != null) {
            bleAsyncCallback.sendFailureMessage(new BleNetError(-9999, "BleNetResponseParser.parse response is null"));
        }
    }
}
