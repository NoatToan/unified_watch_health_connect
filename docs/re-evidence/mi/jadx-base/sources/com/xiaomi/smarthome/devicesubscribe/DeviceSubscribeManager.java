package com.xiaomi.smarthome.devicesubscribe;

import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.smarthome.account.AccountDepApi;
import com.xiaomi.smarthome.device.api.DevicelibApi;
import com.xiaomi.smarthome.frame.AsyncCallback;
import com.xiaomi.smarthome.frame.AsyncHandle;
import com.xiaomi.smarthome.frame.Error;
import com.xiaomi.smarthome.frame.server_compact.ServerCompact;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.commonapi.SystemApi;
import com.xiaomi.smarthome.library.crypto.MD5Util;
import com.xiaomi.smarthome.library.crypto.SHA1Util;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.library.util.GlobalHandlerManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class DeviceSubscribeManager {
    private static volatile DeviceSubscribeManager sInstance;
    private static Object sLock = new Object();
    private List<AsyncHandle.ExecuteAsyncHandle> mList;
    private Random mRandom = new Random();
    private Map<String, SubscribeCallback> mSubscribeCallbackMap = new ConcurrentHashMap();
    private Map<String, SubscribeCallback> mSubscribeCallbackBatchMap = new ConcurrentHashMap();
    private Map<String, Runnable> mSubscribeRemoveMap = new ConcurrentHashMap();

    private String generateSubId() {
        boolean zIsEurope = ServerCompact.isEurope(MiJiaEnvironment.getAppContext());
        String str = SystemApi.getInstance().getDeviceId(MiJiaEnvironment.getAppContext(), zIsEurope) + AccountDepApi.getInstance().getMiId() + this.mRandom.nextInt() + System.currentTimeMillis();
        return zIsEurope ? SHA1Util.getSHA2Digest(str) : MD5Util.getMd5Digest(str);
    }

    public static DeviceSubscribeManager getInstance() {
        if (sInstance == null) {
            synchronized (sLock) {
                try {
                    if (sInstance == null) {
                        sInstance = new DeviceSubscribeManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    private void removeDelayRunnable(String str) {
        Runnable runnableRemove = this.mSubscribeRemoveMap.remove(str);
        if (runnableRemove != null) {
            GlobalHandlerManager.getInstance().getGlobalWorkerHandler().removeCallbacks(runnableRemove);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSubscribeCallback(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mSubscribeCallbackMap.remove(str);
        removeDelayRunnable(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSubscribeCallbackBatch(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mSubscribeCallbackBatchMap.remove(str);
        removeDelayRunnable(str);
    }

    public void onReceivePush(String str, String str2, String str3, JSONArray jSONArray) {
        SubscribeCallback subscribeCallback;
        if (TextUtils.isEmpty(str) || (subscribeCallback = this.mSubscribeCallbackMap.get(str)) == null) {
            return;
        }
        subscribeCallback.onReceive(str2, str3, jSONArray);
    }

    public void onReceivePushBatch(String str, String str2, String str3, JSONArray jSONArray) {
        SubscribeCallback subscribeCallback;
        if (TextUtils.isEmpty(str) || (subscribeCallback = this.mSubscribeCallbackBatchMap.get(str)) == null) {
            return;
        }
        subscribeCallback.onReceive(str2, str3, jSONArray);
    }

    public void onReceiveRegid(String str) {
        List<AsyncHandle.ExecuteAsyncHandle> list;
        synchronized (this) {
            list = this.mList;
            this.mList = null;
        }
        if (list == null) {
            return;
        }
        Iterator<AsyncHandle.ExecuteAsyncHandle> it = list.iterator();
        while (it.hasNext()) {
            try {
                it.next().execute();
            } catch (Exception e) {
                MiJiaLog.writeLogOnAll(LogType.PUSH, "DeviceSubscribeManager", Log.getStackTraceString(e));
            }
        }
    }

    public AsyncHandle scheduleSubscribeBatch(final JSONObject jSONObject, final String str, final int i, final SubscribeCallback subscribeCallback) {
        if (this.mList != null) {
            synchronized (this) {
                try {
                    if (this.mList != null) {
                        AsyncHandle.ExecuteAsyncHandle executeAsyncHandle = new AsyncHandle.ExecuteAsyncHandle(new Callable() { // from class: wp6
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return this.f38206a.lambda$scheduleSubscribeBatch$0(jSONObject, str, i, subscribeCallback);
                            }
                        });
                        this.mList.add(executeAsyncHandle);
                        return executeAsyncHandle;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lambda$scheduleSubscribeBatch$0(jSONObject, str, i, subscribeCallback);
    }

    public void startSubscribe(String str, int i, List<String> list, int i2, String str2, final SubscribeCallback subscribeCallback) {
        if (subscribeCallback == null) {
            return;
        }
        if (i2 <= 0) {
            subscribeCallback.onFailure(new Error(-1, "expire <=0"));
            return;
        }
        int i3 = i2 > 10 ? 10 : i2;
        final String strGenerateSubId = generateSubId();
        Runnable runnable = this.mSubscribeRemoveMap.get(strGenerateSubId);
        if (runnable == null) {
            synchronized (sLock) {
                try {
                    runnable = this.mSubscribeRemoveMap.get(strGenerateSubId);
                    if (runnable == null) {
                        runnable = new Runnable() { // from class: com.xiaomi.smarthome.devicesubscribe.DeviceSubscribeManager.1
                            @Override // java.lang.Runnable
                            public void run() {
                                DeviceSubscribeManager.this.removeSubscribeCallback(strGenerateSubId);
                                DeviceSubscribeManager.this.mSubscribeRemoveMap.remove(strGenerateSubId);
                            }
                        };
                        this.mSubscribeRemoveMap.put(strGenerateSubId, runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        GlobalHandlerManager.getInstance().getGlobalWorkerHandler().removeCallbacks(runnable);
        GlobalHandlerManager.getInstance().getGlobalWorkerHandler().postDelayed(runnable, ((long) i3) * 60000);
        this.mSubscribeCallbackMap.put(strGenerateSubId, subscribeCallback);
        DevicelibApi.subscribeDeviceV2(MiJiaEnvironment.getAppContext(), str, i, list, strGenerateSubId, i3, str2, new AsyncCallback<Boolean, Error>() { // from class: com.xiaomi.smarthome.devicesubscribe.DeviceSubscribeManager.2
            @Override // com.xiaomi.smarthome.frame.AsyncCallback
            public void onFailure(Error error) {
                subscribeCallback.onFailure(error);
            }

            @Override // com.xiaomi.smarthome.frame.AsyncCallback
            public void onSuccess(Boolean bool) {
                if (bool.booleanValue()) {
                    subscribeCallback.onSuccess(strGenerateSubId);
                } else {
                    subscribeCallback.onFailure(new Error(-1, ""));
                }
            }
        });
    }

    /* JADX INFO: renamed from: startSubscribeBatch, reason: merged with bridge method [inline-methods] */
    public AsyncHandle lambda$scheduleSubscribeBatch$0(JSONObject jSONObject, String str, final int i, final SubscribeCallback subscribeCallback) {
        if (subscribeCallback == null) {
            return null;
        }
        if (i <= 0) {
            subscribeCallback.onFailure(new Error(-1, "expire <=0"));
            return null;
        }
        if (i > 180) {
            i = 180;
        }
        return DevicelibApi.subscribeDeviceBatchV2(MiJiaEnvironment.getAppContext(), jSONObject, str, i, new AsyncCallback<String, Error>() { // from class: com.xiaomi.smarthome.devicesubscribe.DeviceSubscribeManager.4
            @Override // com.xiaomi.smarthome.frame.AsyncCallback
            public void onFailure(Error error) {
                SubscribeCallback subscribeCallback2 = subscribeCallback;
                if (subscribeCallback2 != null) {
                    subscribeCallback2.onFailure(error);
                }
            }

            @Override // com.xiaomi.smarthome.frame.AsyncCallback
            public void onSuccess(final String str2) {
                if (TextUtils.isEmpty(str2)) {
                    SubscribeCallback subscribeCallback2 = subscribeCallback;
                    if (subscribeCallback2 != null) {
                        subscribeCallback2.onFailure(new Error(-1, "subId return null"));
                        return;
                    }
                    return;
                }
                Runnable runnable = (Runnable) DeviceSubscribeManager.this.mSubscribeRemoveMap.get(str2);
                if (runnable == null) {
                    synchronized (DeviceSubscribeManager.sLock) {
                        try {
                            runnable = (Runnable) DeviceSubscribeManager.this.mSubscribeRemoveMap.get(str2);
                            if (runnable == null) {
                                runnable = new Runnable() { // from class: com.xiaomi.smarthome.devicesubscribe.DeviceSubscribeManager.4.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        DeviceSubscribeManager.this.removeSubscribeCallbackBatch(str2);
                                        DeviceSubscribeManager.this.mSubscribeRemoveMap.remove(str2);
                                    }
                                };
                                DeviceSubscribeManager.this.mSubscribeRemoveMap.put(str2, runnable);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                GlobalHandlerManager.getInstance().getGlobalWorkerHandler().removeCallbacks(runnable);
                GlobalHandlerManager.getInstance().getGlobalWorkerHandler().postDelayed(runnable, ((long) i) * 1000);
                DeviceSubscribeManager.this.mSubscribeCallbackBatchMap.put(str2, subscribeCallback);
                SubscribeCallback subscribeCallback3 = subscribeCallback;
                if (subscribeCallback3 != null) {
                    subscribeCallback3.onSuccess(str2);
                }
            }
        });
    }

    public void stopSubscribe(String str, int i, List<String> list, final String str2, final UnSubscribeCallback unSubscribeCallback) {
        DevicelibApi.unsubscribeDeviceV2(MiJiaEnvironment.getAppContext(), str, i, list, str2, new AsyncCallback<Boolean, Error>() { // from class: com.xiaomi.smarthome.devicesubscribe.DeviceSubscribeManager.3
            @Override // com.xiaomi.smarthome.frame.AsyncCallback
            public void onFailure(Error error) {
                UnSubscribeCallback unSubscribeCallback2 = unSubscribeCallback;
                if (unSubscribeCallback2 != null) {
                    unSubscribeCallback2.onFailure(new Error(-1, ""));
                }
            }

            @Override // com.xiaomi.smarthome.frame.AsyncCallback
            public void onSuccess(Boolean bool) {
                if (!bool.booleanValue()) {
                    UnSubscribeCallback unSubscribeCallback2 = unSubscribeCallback;
                    if (unSubscribeCallback2 != null) {
                        unSubscribeCallback2.onFailure(new Error(-1, ""));
                        return;
                    }
                    return;
                }
                DeviceSubscribeManager.this.removeSubscribeCallback(str2);
                UnSubscribeCallback unSubscribeCallback3 = unSubscribeCallback;
                if (unSubscribeCallback3 != null) {
                    unSubscribeCallback3.onSuccess();
                }
            }
        });
    }

    public void stopSubscribeBatch(String str, final UnSubscribeCallback unSubscribeCallback) {
        removeSubscribeCallbackBatch(str);
        DevicelibApi.unsubscribeDeviceBatchV2(MiJiaEnvironment.getAppContext(), str, new AsyncCallback<Void, Error>() { // from class: com.xiaomi.smarthome.devicesubscribe.DeviceSubscribeManager.5
            @Override // com.xiaomi.smarthome.frame.AsyncCallback
            public void onFailure(Error error) {
                UnSubscribeCallback unSubscribeCallback2 = unSubscribeCallback;
                if (unSubscribeCallback2 != null) {
                    unSubscribeCallback2.onFailure(new Error(-1, ""));
                }
            }

            @Override // com.xiaomi.smarthome.frame.AsyncCallback
            public void onSuccess(Void r1) {
                UnSubscribeCallback unSubscribeCallback2 = unSubscribeCallback;
                if (unSubscribeCallback2 != null) {
                    unSubscribeCallback2.onSuccess();
                }
            }
        });
    }
}
