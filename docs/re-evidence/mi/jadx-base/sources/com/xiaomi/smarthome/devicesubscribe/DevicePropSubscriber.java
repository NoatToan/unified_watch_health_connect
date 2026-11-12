package com.xiaomi.smarthome.devicesubscribe;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.google.android.gms.common.ConnectionResult;
import com.xiaomi.smarthome.core.server.internal.util.SetMerger;
import com.xiaomi.smarthome.device.Device;
import com.xiaomi.smarthome.frame.AsyncHandle;
import com.xiaomi.smarthome.frame.Error;
import com.xiaomi.smarthome.library.common.util.CommonUtil;
import com.xiaomi.smarthome.library.crypto.MD5Util;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.library.util.GlobalHandlerManager;
import com.xiaomi.smarthome.network.NetworkDepApi;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class DevicePropSubscriber extends BaseDevicePropSubscriber implements DefaultLifecycleObserver {
    public static final String EVENT_DEVICE_OFFLINE = "event.dev_offline";
    public static final String EVENT_DEVICE_ONLINE = "event.dev_online";
    private static final byte EXEC_INIT = 0;
    private static final byte EXEC_MAXRETRY = 3;
    private static final byte EXEC_PENDING = -1;
    private static final int MSG_MERGE_SUBSCRIBE = 2;
    private static final int MSG_RE_SUBSCRIBE = 1;
    private static final int SUBSCRIBE_INTERVAL = 160000;
    private static final String TAG = "DevicePropSubscriber";
    private boolean isDestroyed;
    private Map<String, ? extends Collection<String>> mCacheMap;
    private OnSubscribeListener mDeviceSubscriberInterface;
    private final Handler mHandler;
    private final ConcurrentHashMap<String, SubscribeEntry> mSubscribeMap;

    public static class SubscribeEntry {
        public AsyncHandle asyncHandle;
        byte execute = 0;
        String id;
        JSONObject list;

        public SubscribeEntry(String str, JSONObject jSONObject) {
            this.id = str;
            this.list = jSONObject;
        }

        public String toString() {
            return "SubscribeEntry{execute=" + ((int) this.execute) + ", id='" + this.id + "', list=" + this.list + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public DevicePropSubscriber() {
        this(null);
    }

    private void cacheProps(HashMap<String, HashSet<String>> map, JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            HashSet<String> hashSet = new HashSet<>();
            map.put(next, hashSet);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    hashSet.add(jSONArrayOptJSONArray.optString(i));
                }
            }
        }
    }

    private String getSubId(JSONObject jSONObject) {
        return MD5Util.getMd5Digest(jSONObject.toString() + NetworkDepApi.getInstance().getPushId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$destroy$3() {
        ProcessLifecycleOwner.get().getLifecycle().removeObserver(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        ProcessLifecycleOwner.get().getLifecycle().addObserver(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$subscribe$2(Map map, long j) {
        if (this.mCacheMap == null) {
            this.mCacheMap = map;
        } else {
            this.mCacheMap = new SetMerger().mergeMap(this.mCacheMap, map);
        }
        if (this.isDestroyed) {
            return;
        }
        this.mHandler.removeMessages(2);
        this.mHandler.sendEmptyMessageDelayed(2, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendMessageDelay(SubscribeEntry subscribeEntry, int i) {
        if (this.isDestroyed) {
            return;
        }
        Handler handler = this.mHandler;
        handler.sendMessageDelayed(handler.obtainMessage(1, subscribeEntry), i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void subscribeSplit(Map<String, ? extends Collection<String>> map) {
        if (map == null || map.size() == 0) {
            return;
        }
        HashMap<String, HashSet<String>> map2 = new HashMap<>();
        Iterator<Map.Entry<String, SubscribeEntry>> it = this.mSubscribeMap.entrySet().iterator();
        while (it.hasNext()) {
            cacheProps(map2, it.next().getValue().list);
        }
        JSONObject jSONObject = new JSONObject();
        int length = 0;
        for (Map.Entry<String, ? extends Collection<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            HashSet<String> hashSet = map2.get(key);
            Collection<String> value = entry.getValue();
            if (value != null && value.size() != 0 && !TextUtils.isEmpty(key)) {
                JSONArray jSONArray = new JSONArray();
                for (String str : value) {
                    if (!TextUtils.isEmpty(str)) {
                        if (!str.startsWith("prop.") && !str.startsWith("event.")) {
                            str = "prop." + str;
                        }
                        if (hashSet == null || !hashSet.contains(str)) {
                            jSONArray.put(str);
                        }
                    }
                }
                if (jSONArray.length() + length > 300 && length != 0) {
                    subscribeInner(new SubscribeEntry(getSubId(jSONObject), jSONObject));
                    jSONObject = new JSONObject();
                    length = 0;
                }
                try {
                    if (jSONArray.length() != 0) {
                        jSONObject.put(key, jSONArray);
                    }
                } catch (Exception unused) {
                }
                length += jSONArray.length();
            }
        }
        if (jSONObject.length() <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("subscribeSplit all contain ");
            sb.append(this.mDeviceSubscriberInterface);
        } else {
            subscribeInner(new SubscribeEntry(getSubId(jSONObject), jSONObject));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("subscribeSplit ");
            sb2.append(this.mDeviceSubscriberInterface);
            sb2.append(" ");
            sb2.append(jSONObject);
        }
    }

    private void unSubscribeAll() {
        for (Map.Entry<String, SubscribeEntry> entry : this.mSubscribeMap.entrySet()) {
            if (entry.getValue().asyncHandle == null) {
                DeviceSubscribeManager.getInstance().stopSubscribeBatch(entry.getKey(), null);
            } else {
                entry.getValue().asyncHandle.cancel();
            }
        }
        this.mSubscribeMap.clear();
    }

    @Override // com.xiaomi.smarthome.devicesubscribe.BaseDevicePropSubscriber
    public void destroy() {
        CommonUtil.runMainThread(new Runnable() { // from class: ua6
            @Override // java.lang.Runnable
            public final void run() {
                this.f35561a.lambda$destroy$3();
            }
        });
        this.mDeviceSubscriberInterface = null;
        try {
            this.mHandler.removeMessages(2);
            this.mHandler.removeMessages(1);
            unSubscribeAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.isDestroyed = true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner lifecycleOwner) {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        sb.append("订阅回到前台 ");
        sb.append(this.mDeviceSubscriberInterface);
        HashMap<String, HashSet<String>> map = new HashMap<>();
        Iterator<Map.Entry<String, SubscribeEntry>> it = this.mSubscribeMap.entrySet().iterator();
        while (it.hasNext()) {
            SubscribeEntry value = it.next().getValue();
            if (value.execute == -1) {
                value.execute = (byte) 0;
                subscribeInner(value);
                cacheProps(map, value.list);
            }
        }
        shouldUpdate(map);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner lifecycleOwner) {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        sb.append("订阅退到后台 ");
        sb.append(this.mDeviceSubscriberInterface);
    }

    public void shouldUpdate(HashMap<String, HashSet<String>> map) {
    }

    public void subscribe(List<Device> list, final DeviceSubscriberInterface deviceSubscriberInterface) {
        if (list == null || deviceSubscriberInterface == null) {
            return;
        }
        this.mDeviceSubscriberInterface = new OnSubscribeListener() { // from class: wa6
            @Override // com.xiaomi.smarthome.devicesubscribe.OnSubscribeListener
            public final void onReceive(String str, String str2, JSONArray jSONArray) {
                deviceSubscriberInterface.onSubscribedValueChanged(str, jSONArray);
            }
        };
        HashMap map = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            Device device = list.get(i);
            map.put(device.getDid(), deviceSubscriberInterface.getSubscribePropName(device));
        }
        subscribe(map);
    }

    public void subscribeInner(final SubscribeEntry subscribeEntry) {
        if (subscribeEntry.list.length() == 0) {
            return;
        }
        this.mSubscribeMap.put(subscribeEntry.id, subscribeEntry);
        if (subscribeEntry.execute <= 3) {
            subscribeEntry.asyncHandle = DeviceSubscribeManager.getInstance().scheduleSubscribeBatch(subscribeEntry.list, subscribeEntry.id, 180, new SubscribeCallback() { // from class: com.xiaomi.smarthome.devicesubscribe.DevicePropSubscriber.2
                @Override // com.xiaomi.smarthome.devicesubscribe.SubscribeCallback
                public void onFailure(Error error) {
                    SubscribeEntry subscribeEntry2 = subscribeEntry;
                    subscribeEntry2.execute = (byte) (subscribeEntry2.execute + 1);
                    String str = null;
                    subscribeEntry2.asyncHandle = null;
                    int iNextInt = new Random(7000L).nextInt() + ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
                    DevicePropSubscriber.this.sendMessageDelay(subscribeEntry, iNextInt);
                    LogType logType = LogType.PUSH;
                    StringBuilder sb = new StringBuilder();
                    sb.append("startSubscribeBatch fail =");
                    if (error != null) {
                        str = error.getCode() + "," + error.getDetail();
                    }
                    sb.append(str);
                    sb.append(" mDeviceSubscriberInterface:");
                    sb.append(DevicePropSubscriber.this.mDeviceSubscriberInterface);
                    sb.append(" retryDelay:");
                    sb.append(iNextInt);
                    MiJiaLog.writeLogOnGrey(logType, DevicePropSubscriber.TAG, sb.toString());
                }

                @Override // com.xiaomi.smarthome.devicesubscribe.SubscribeCallback
                public void onReceive(String str, String str2, JSONArray jSONArray) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("subscribe onReceive did=");
                    sb.append(str);
                    sb.append(",model=");
                    sb.append(str2);
                    sb.append(", prop=");
                    sb.append(jSONArray == null ? null : jSONArray.toString());
                    if (DevicePropSubscriber.this.mDeviceSubscriberInterface != null) {
                        DevicePropSubscriber.this.mDeviceSubscriberInterface.onReceive(str, str2, jSONArray);
                    }
                }

                @Override // com.xiaomi.smarthome.devicesubscribe.SubscribeCallback
                public void onSuccess(String str) {
                    MiJiaLog.writeLogOnAll(LogType.PUSH, "", hashCode() + " subscribe onSuccess subid=" + str + " SubscriberInterface" + DevicePropSubscriber.this.mDeviceSubscriberInterface);
                    SubscribeEntry subscribeEntry2 = subscribeEntry;
                    subscribeEntry2.execute = (byte) 0;
                    subscribeEntry2.asyncHandle = null;
                    DevicePropSubscriber.this.sendMessageDelay(subscribeEntry2, DevicePropSubscriber.SUBSCRIBE_INTERVAL);
                }
            });
            return;
        }
        subscribeEntry.execute = (byte) 0;
        sendMessageDelay(subscribeEntry, SUBSCRIBE_INTERVAL);
        StringBuilder sb = new StringBuilder();
        sb.append(hashCode());
        sb.append(" subscribe fail times>3 ");
        sb.append(subscribeEntry.id);
        sb.append(" SubscriberInterface");
        sb.append(this.mDeviceSubscriberInterface);
    }

    public DevicePropSubscriber(OnSubscribeListener onSubscribeListener) {
        this(true, onSubscribeListener);
    }

    public DevicePropSubscriber(final boolean z, OnSubscribeListener onSubscribeListener) {
        this.isDestroyed = false;
        this.mSubscribeMap = new ConcurrentHashMap<>();
        CommonUtil.runMainThread(new Runnable() { // from class: ta6
            @Override // java.lang.Runnable
            public final void run() {
                this.f34494a.lambda$new$0();
            }
        });
        this.mDeviceSubscriberInterface = onSubscribeListener;
        this.mHandler = new Handler(GlobalHandlerManager.getInstance().getGlobalWorkerHandler().getLooper()) { // from class: com.xiaomi.smarthome.devicesubscribe.DevicePropSubscriber.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (DevicePropSubscriber.this.isDestroyed) {
                    return;
                }
                int i = message.what;
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    DevicePropSubscriber devicePropSubscriber = DevicePropSubscriber.this;
                    devicePropSubscriber.subscribeSplit(devicePropSubscriber.mCacheMap);
                    DevicePropSubscriber.this.mCacheMap = null;
                    return;
                }
                SubscribeEntry subscribeEntry = (SubscribeEntry) message.obj;
                Lifecycle.State state = ProcessLifecycleOwner.get().getLifecycle().getState();
                if (!z || state.isAtLeast(Lifecycle.State.STARTED)) {
                    DevicePropSubscriber.this.subscribeInner(subscribeEntry);
                    return;
                }
                MiJiaLog.writeLogOnAll(LogType.PUSH, DevicePropSubscriber.TAG, "disable background " + z + " current " + state + " subid " + subscribeEntry.id);
                subscribeEntry.execute = (byte) -1;
            }
        };
    }

    public void subscribe(Map<String, ? extends Collection<String>> map, OnSubscribeListener onSubscribeListener) {
        this.mDeviceSubscriberInterface = onSubscribeListener;
        subscribe(map);
    }

    @Override // com.xiaomi.smarthome.devicesubscribe.BaseDevicePropSubscriber
    public void subscribe(Map<String, ? extends Collection<String>> map) {
        subscribe(map, 1000L);
    }

    public void subscribe(final Map<String, ? extends Collection<String>> map, final long j) {
        this.mHandler.post(new Runnable() { // from class: va6
            @Override // java.lang.Runnable
            public final void run() {
                this.f36654a.lambda$subscribe$2(map, j);
            }
        });
    }
}
