package com.xiaomi.smarthome.core.server.internal.bluetooth.model;

import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.xiaomi.smarthome.cache.SecurityCache;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.core.server.internal.plugin.util.Callback;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.BluetoothContextManager;
import com.xiaomi.smarthome.library.bluetooth.connect.BleGattProfile;
import com.xiaomi.smarthome.library.common.util.ByteUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public final class BleDevicePropCache extends BluetoothContextManager implements IBlePropCacher {
    public static final int CACHE_LOADED = 3;
    public static final int CACHE_LOADING = 2;
    public static final int CACHE_UNLOAD = 1;
    private static final String PREFS_TAG = "ble_device_prop_cache";
    private static final Executor SERIAL_EXECUTOR = new SerialExecutor();
    private static volatile BleDevicePropCache sInstance;
    private String mCurrentTag;
    private SharedPreferences mSharedPreferences;
    private volatile int mCacheStatus = 1;
    private final List<Callback<Integer, Integer>> cacheReadyCallbacks = new ArrayList();
    private HashMap<String, BleDeviceProp> mPropCache = new HashMap<>();

    public abstract class BleCacheTask extends AsyncTask<Void, Void, Void> {
        private BleCacheTask() {
        }

        public abstract void doInBackground();

        @Override // android.os.AsyncTask
        public Void doInBackground(Void... voidArr) {
            doInBackground();
            return null;
        }
    }

    public interface IPropGetter<T> {
        T getProp(BleDeviceProp bleDeviceProp);
    }

    public interface IPropSetter {
        boolean setProp(BleDeviceProp bleDeviceProp);
    }

    public interface IPropTraverse {
        boolean onTraverse(String str, BleDeviceProp bleDeviceProp);
    }

    public abstract class PropSetter implements IPropSetter {
        private String name;

        public PropSetter(String str) {
            this.name = str;
        }

        public String toString() {
            return "PropSetter{name='" + this.name + '\'' + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class SerialExecutor implements Executor {
        Runnable mActive;
        final ArrayDeque<Runnable> mTasks;

        private SerialExecutor() {
            this.mTasks = new ArrayDeque<>();
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(final Runnable runnable) {
            this.mTasks.offer(new Runnable() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.SerialExecutor.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        runnable.run();
                    } finally {
                        SerialExecutor.this.scheduleNext();
                    }
                }
            });
            if (this.mActive == null) {
                scheduleNext();
            }
        }

        public synchronized void scheduleNext() {
            Runnable runnablePoll = this.mTasks.poll();
            this.mActive = runnablePoll;
            if (runnablePoll != null) {
                AsyncTask.THREAD_POOL_EXECUTOR.execute(runnablePoll);
            }
        }
    }

    private BleDevicePropCache() {
    }

    private void executeCacheTask(final BleCacheTask bleCacheTask) {
        BluetoothContextManager.post(new Runnable() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.65
            @Override // java.lang.Runnable
            public void run() {
                bleCacheTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            }
        });
    }

    private void executeSerialCacheTask(final BleCacheTask bleCacheTask) {
        BluetoothContextManager.post(new Runnable() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.64
            @Override // java.lang.Runnable
            public void run() {
                bleCacheTask.executeOnExecutor(BleDevicePropCache.SERIAL_EXECUTOR, new Void[0]);
            }
        });
    }

    public static BleDevicePropCache getInstance() {
        if (sInstance == null) {
            synchronized (BleDevicePropCache.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new BleDevicePropCache();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    private static String getPrefsTag() {
        String miId = BluetoothService.getBleCoreProvider().getMiId();
        if (TextUtils.isEmpty(miId) || "0".equals(miId)) {
            return null;
        }
        String machineCode = BluetoothService.getBleCoreProvider().getMachineCode();
        if (machineCode == null) {
            machineCode = "";
        }
        return String.format("%s.%s.%s", PREFS_TAG, miId, machineCode);
    }

    private <T> T getProp(String str, IPropGetter<T> iPropGetter, T t) {
        if (TextUtils.isEmpty(str)) {
            return t;
        }
        synchronized (this.mPropCache) {
            try {
                BleDeviceProp bleDeviceProp = this.mPropCache.get(str);
                if (bleDeviceProp == null) {
                    return t;
                }
                return iPropGetter.getProp(bleDeviceProp);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void notifyReadyCallback() {
        synchronized (this.cacheReadyCallbacks) {
            try {
                if (this.cacheReadyCallbacks.isEmpty()) {
                    return;
                }
                Iterator<Callback<Integer, Integer>> it = this.cacheReadyCallbacks.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().call(Integer.valueOf(this.mCacheStatus));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                this.cacheReadyCallbacks.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reloadPropCache() {
        if (!SecurityCache.getInstance().isInited()) {
            SecurityCache.getInstance().init(BluetoothContextManager.getContext());
        }
        String prefsTag = getPrefsTag();
        if (TextUtils.isEmpty(prefsTag)) {
            synchronized (this.mPropCache) {
                this.mPropCache.clear();
            }
            this.mSharedPreferences = null;
            this.mCacheStatus = 1;
            this.mCurrentTag = "";
        } else if (prefsTag.equalsIgnoreCase(this.mCurrentTag)) {
            this.mCacheStatus = 3;
        } else {
            this.mCurrentTag = prefsTag;
            BluetoothMyLogger.d("start loadPropCache");
            SharedPreferences sharedPreferences = BluetoothContextManager.getContext().getSharedPreferences(this.mCurrentTag, 0);
            this.mSharedPreferences = sharedPreferences;
            Map<String, ?> all = sharedPreferences.getAll();
            HashMap map = new HashMap();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                BleDeviceProp bleDevicePropFromJson = BleDeviceProp.fromJson((String) entry.getValue());
                if (bleDevicePropFromJson != null) {
                    map.put(entry.getKey(), bleDevicePropFromJson);
                }
            }
            synchronized (this.mPropCache) {
                this.mPropCache.clear();
                this.mPropCache.putAll(map);
                BluetoothMyLogger.d("end loadPropCache");
                this.mCacheStatus = 3;
            }
        }
        notifyReadyCallback();
    }

    private void savePropCacheAsync(final SharedPreferences sharedPreferences, final String str, final BleDeviceProp bleDeviceProp) {
        executeSerialCacheTask(new BleCacheTask() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.63
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.BleCacheTask
            public void doInBackground() {
                SharedPreferences sharedPreferences2 = sharedPreferences;
                if (sharedPreferences2 != null) {
                    sharedPreferences2.edit().putString(str, bleDeviceProp.toJson()).apply();
                }
            }
        });
    }

    private void setProp(String str, PropSetter propSetter) {
        setProp(str, propSetter, true);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public String getEncryptedKeyId(String str) {
        return (String) getProp(str, new IPropGetter<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.38
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropGetter
            public String getProp(BleDeviceProp bleDeviceProp) {
                return bleDeviceProp.getEncryptedKeyId();
            }
        }, "");
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public String getEncryptedLtmk(String str) {
        return (String) getProp(str, new IPropGetter<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.28
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropGetter
            public String getProp(BleDeviceProp bleDeviceProp) {
                return bleDeviceProp.getEncryptedLtmk();
            }
        }, "");
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public String getEncryptedMeshBindInfo(String str) {
        return (String) getProp(str, new IPropGetter<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.40
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropGetter
            public String getProp(BleDeviceProp bleDeviceProp) {
                return bleDeviceProp.getEncryptedMeshBindInfo();
            }
        }, "");
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public String getEncryptedSessionKey(String str) {
        return (String) getProp(str, new IPropGetter<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.36
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropGetter
            public String getProp(BleDeviceProp bleDeviceProp) {
                return bleDeviceProp.getEncryptedSession();
            }
        }, "");
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public String getEncryptedToken(String str) {
        return (String) getProp(str, new IPropGetter<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.26
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropGetter
            public String getProp(BleDeviceProp bleDeviceProp) {
                return bleDeviceProp.getEncryptedToken();
            }
        }, "");
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public String getJsonFirmwareUpdateInfo(String str) {
        return (String) getProp(str, new IPropGetter<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.43
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropGetter
            public String getProp(BleDeviceProp bleDeviceProp) {
                return bleDeviceProp.getExtra("ble.firmware.update.info", "");
            }
        }, "");
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public String getLockShareCreateTime(String str) {
        return (String) getProp(str, new IPropGetter<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.49
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropGetter
            public String getProp(BleDeviceProp bleDeviceProp) {
                return bleDeviceProp.getLockShareCreateTime();
            }
        }, "");
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public String getLockShareKeyId(String str) {
        return (String) getProp(str, new IPropGetter<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.47
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropGetter
            public String getProp(BleDeviceProp bleDeviceProp) {
                return bleDeviceProp.getLockShareKeyId();
            }
        }, "");
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public String getLockShareUserKey(String str) {
        return (String) getProp(str, new IPropGetter<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.45
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropGetter
            public String getProp(BleDeviceProp bleDeviceProp) {
                return bleDeviceProp.getLockShareUserKey();
            }
        }, "");
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public int getLtmkEncryptType(String str) {
        return ((Integer) getProp(str, new IPropGetter<Integer>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.32
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropGetter
            public Integer getProp(BleDeviceProp bleDeviceProp) {
                return Integer.valueOf(bleDeviceProp.getLtmkEncryptType());
            }
        }, 0)).intValue();
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public String getPincode(String str) {
        return (String) getProp(str, new IPropGetter<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.30
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropGetter
            public String getProp(BleDeviceProp bleDeviceProp) {
                return bleDeviceProp.getPincode();
            }
        }, "");
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public String getPropBeaconName(String str) {
        return (String) getProp(str, new IPropGetter<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.9
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropGetter
            public String getProp(BleDeviceProp bleDeviceProp) {
                return bleDeviceProp.getBeaconName();
            }
        }, "");
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public int getPropBoundStatus(String str) {
        return ((Integer) getProp(str, new IPropGetter<Integer>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.25
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropGetter
            public Integer getProp(BleDeviceProp bleDeviceProp) {
                return Integer.valueOf(bleDeviceProp.getBoundStatus());
            }
        }, 0)).intValue();
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public String getPropDesc(String str) {
        return (String) getProp(str, new IPropGetter<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.15
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropGetter
            public String getProp(BleDeviceProp bleDeviceProp) {
                return bleDeviceProp.getDesc();
            }
        }, "");
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public String getPropDid(String str) {
        return (String) getProp(str, new IPropGetter<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.11
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropGetter
            public String getProp(BleDeviceProp bleDeviceProp) {
                return bleDeviceProp.getDid();
            }
        }, "");
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public int getPropExtra(String str, final String str2, final int i) {
        return ((Integer) getProp(str, new IPropGetter<Integer>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.56
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropGetter
            public Integer getProp(BleDeviceProp bleDeviceProp) {
                return Integer.valueOf(bleDeviceProp.getExtra(str2, i));
            }
        }, Integer.valueOf(i))).intValue();
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public BleGattProfile getPropGattProfile(String str) {
        return (BleGattProfile) getProp(str, new IPropGetter<BleGattProfile>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.54
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropGetter
            public BleGattProfile getProp(BleDeviceProp bleDeviceProp) {
                return bleDeviceProp.getProfile();
            }
        }, null);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public String getPropModel(String str) {
        return (String) getProp(str, new IPropGetter<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.17
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropGetter
            public String getProp(BleDeviceProp bleDeviceProp) {
                return bleDeviceProp.getModel();
            }
        }, "");
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public String getPropName(String str) {
        return (String) getProp(str, new IPropGetter<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.3
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropGetter
            public String getProp(BleDeviceProp bleDeviceProp) {
                return bleDeviceProp.getName();
            }
        }, "");
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public String getPropOwnerId(String str) {
        return (String) getProp(str, new IPropGetter<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.13
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropGetter
            public String getProp(BleDeviceProp bleDeviceProp) {
                return bleDeviceProp.getOwnerId();
            }
        }, "");
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public String getPropOwnerName(String str) {
        return (String) getProp(str, new IPropGetter<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.7
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropGetter
            public String getProp(BleDeviceProp bleDeviceProp) {
                return bleDeviceProp.getOwnerName();
            }
        }, "");
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public int getPropPermitLevel(String str) {
        return ((Integer) getProp(str, new IPropGetter<Integer>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.23
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropGetter
            public Integer getProp(BleDeviceProp bleDeviceProp) {
                return Integer.valueOf(bleDeviceProp.getPermitLevel());
            }
        }, 0)).intValue();
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public int getPropProductId(String str) {
        return ((Integer) getProp(str, new IPropGetter<Integer>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.19
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropGetter
            public Integer getProp(BleDeviceProp bleDeviceProp) {
                return Integer.valueOf(bleDeviceProp.getProductId());
            }
        }, 0)).intValue();
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public int getPropRssi(String str) {
        return ((Integer) getProp(str, new IPropGetter<Integer>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.21
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropGetter
            public Integer getProp(BleDeviceProp bleDeviceProp) {
                return Integer.valueOf(bleDeviceProp.getRssi());
            }
        }, -60)).intValue();
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public String getPropSMac(String str) {
        return (String) getProp(str, new IPropGetter<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.5
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropGetter
            public String getProp(BleDeviceProp bleDeviceProp) {
                return bleDeviceProp.getSmac();
            }
        }, "");
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public byte[] getPropScanRecord(String str) {
        return (byte[]) getProp(str, new IPropGetter<byte[]>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.50
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropGetter
            public byte[] getProp(BleDeviceProp bleDeviceProp) {
                String scanRecord = bleDeviceProp.getScanRecord();
                return TextUtils.isEmpty(scanRecord) ? ByteUtils.EMPTY_BYTES : ByteUtils.stringToBytes(scanRecord);
            }
        }, ByteUtils.EMPTY_BYTES);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public int getPropType(String str) {
        return ((Integer) getProp(str, new IPropGetter<Integer>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.52
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropGetter
            public Integer getProp(BleDeviceProp bleDeviceProp) {
                return Integer.valueOf(bleDeviceProp.getType());
            }
        }, 0)).intValue();
    }

    public void isCacheReady(Callback<Integer, Integer> callback) throws Exception {
        if (callback == null) {
            return;
        }
        synchronized (this.cacheReadyCallbacks) {
            try {
                if (this.mCacheStatus == 3) {
                    callback.call(Integer.valueOf(this.mCacheStatus));
                } else {
                    this.cacheReadyCallbacks.add(callback);
                }
                if (this.mCacheStatus == 1) {
                    reloadIfNeeded();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public boolean isShowPincode(String str) {
        return ((Boolean) getProp(str, new IPropGetter<Boolean>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.34
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropGetter
            public Boolean getProp(BleDeviceProp bleDeviceProp) {
                return Boolean.valueOf(bleDeviceProp.isShowPincode());
            }
        }, Boolean.TRUE)).booleanValue();
    }

    public void reloadIfNeeded() {
        this.mCacheStatus = 2;
        executeCacheTask(new BleCacheTask() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.1
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.BleCacheTask
            public void doInBackground() {
                BleDevicePropCache.this.reloadPropCache();
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public void removePropExtra(String str, final String str2) {
        setProp(str, new PropSetter("remove") { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.62
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropSetter
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                bleDeviceProp.removeExtra(str2);
                return true;
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public void setEncryptedKeyId(String str, final String str2) {
        setProp(str, new PropSetter("encryptedKeyId") { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.39
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropSetter
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (str2.equals(bleDeviceProp.getEncryptedKeyId())) {
                    return false;
                }
                bleDeviceProp.setEncryptedKeyId(str2);
                return true;
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public void setEncryptedLtmk(String str, final String str2) {
        setProp(str, new PropSetter("encryptedLtmk") { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.29
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropSetter
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (str2.equals(bleDeviceProp.getEncryptedLtmk())) {
                    return false;
                }
                bleDeviceProp.setEncryptedLtmk(str2);
                return true;
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public void setEncryptedMeshBindInfo(String str, final String str2) {
        setProp(str, new PropSetter("encryptedMeshBindInfo") { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.41
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropSetter
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (str2.equals(bleDeviceProp.getEncryptedMeshBindInfo())) {
                    return false;
                }
                bleDeviceProp.setEncryptedMeshBindInfo(str2);
                return true;
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public void setEncryptedSessionKey(String str, final String str2) {
        setProp(str, new PropSetter("encryptedSession") { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.37
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropSetter
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (str2.equals(bleDeviceProp.getEncryptedSession())) {
                    return false;
                }
                bleDeviceProp.setEncryptedSession(str2);
                return true;
            }
        }, false);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public void setEncryptedToken(String str, final String str2) {
        setProp(str, new PropSetter("encryptedToken") { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.27
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropSetter
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (str2.equals(bleDeviceProp.getEncryptedToken())) {
                    return false;
                }
                bleDeviceProp.setEncryptedToken(str2);
                return true;
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public void setJsonFirmwareUpdateInfo(String str, final String str2) {
        setProp(str, new PropSetter("ble.firmware.update.info") { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.42
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropSetter
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                String str3 = str2;
                if (str3 == null) {
                    bleDeviceProp.removeExtra("ble.firmware.update.info");
                    return true;
                }
                if (str3.equals(bleDeviceProp.getExtra("ble.firmware.update.info", ""))) {
                    return false;
                }
                bleDeviceProp.setExtra("ble.firmware.update.info", str2);
                return true;
            }
        }, false);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public void setLockShareCreateTime(String str, final String str2) {
        setProp(str, new PropSetter("lockShareCreateTime") { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.48
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropSetter
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (str2.equals(bleDeviceProp.getLockShareCreateTime())) {
                    return false;
                }
                bleDeviceProp.setLockShareKeyId(str2);
                return true;
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public void setLockShareKeyId(String str, final String str2) {
        setProp(str, new PropSetter("lockShareKeyId") { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.46
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropSetter
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (str2.equals(bleDeviceProp.getLockShareKeyId())) {
                    return false;
                }
                bleDeviceProp.setLockShareKeyId(str2);
                return true;
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public void setLockShareUserKey(String str, final String str2) {
        setProp(str, new PropSetter("lockShareUserKey") { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.44
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropSetter
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (str2.equals(bleDeviceProp.getLockShareUserKey())) {
                    return false;
                }
                bleDeviceProp.setLockShareUserKey(str2);
                return true;
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public void setLtmkEncryptType(String str, final int i) {
        setProp(str, new PropSetter("ltmkEncryptType") { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.33
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropSetter
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (i == bleDeviceProp.getLtmkEncryptType()) {
                    return false;
                }
                bleDeviceProp.setLtmkEncryptType(i);
                return true;
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public void setPincode(String str, final String str2) {
        setProp(str, new PropSetter("pincode") { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.31
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropSetter
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (str2.equals(bleDeviceProp.getPincode())) {
                    return false;
                }
                bleDeviceProp.setPincode(str2);
                return true;
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public void setPropBeaconName(String str, final String str2) {
        setProp(str, new PropSetter("beaconName") { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.8
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropSetter
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (str2.equals(bleDeviceProp.getBeaconName())) {
                    return false;
                }
                bleDeviceProp.setBeaconName(str2);
                return true;
            }
        }, false);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public void setPropBoundStatus(String str, final int i) {
        setProp(str, new PropSetter("boundStatus") { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.24
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropSetter
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (i == bleDeviceProp.getBoundStatus()) {
                    return false;
                }
                bleDeviceProp.setBoundStatus(i);
                return true;
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public void setPropDesc(String str, final String str2) {
        setProp(str, new PropSetter("desc") { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.14
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropSetter
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (str2.equals(bleDeviceProp.getDesc())) {
                    return false;
                }
                bleDeviceProp.setDesc(str2);
                return true;
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public void setPropDid(String str, final String str2) {
        setProp(str, new PropSetter("did") { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.10
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropSetter
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (str2.equals(bleDeviceProp.getDid())) {
                    return false;
                }
                bleDeviceProp.setDid(str2);
                return true;
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public void setPropExtra(String str, final String str2, final int i) {
        setProp(str, new PropSetter("int extra") { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.57
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropSetter
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (i == bleDeviceProp.getExtra(str2, 0)) {
                    return false;
                }
                bleDeviceProp.setExtra(str2, i);
                return true;
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public void setPropGattProfile(String str, final BleGattProfile bleGattProfile) {
        setProp(str, new PropSetter("GattProfile") { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.55
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropSetter
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                bleDeviceProp.setProfile(bleGattProfile);
                return true;
            }
        }, false);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public void setPropModel(String str, final String str2) {
        setProp(str, new PropSetter("model") { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.16
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropSetter
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (str2.equals(bleDeviceProp.getModel())) {
                    return false;
                }
                bleDeviceProp.setModel(str2);
                return true;
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public void setPropName(String str, final String str2) {
        setProp(str, new PropSetter("name") { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.2
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropSetter
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (str2.equals(bleDeviceProp.getName())) {
                    return false;
                }
                bleDeviceProp.setName(str2);
                return true;
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public void setPropOwnerId(String str, final String str2) {
        setProp(str, new PropSetter("ownerId") { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.12
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropSetter
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (str2.equals(bleDeviceProp.getOwnerId())) {
                    return false;
                }
                bleDeviceProp.setOwnerId(str2);
                return true;
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public void setPropOwnerName(String str, final String str2) {
        setProp(str, new PropSetter("ownerName") { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.6
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropSetter
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (str2.equals(bleDeviceProp.getOwnerName())) {
                    return false;
                }
                bleDeviceProp.setOwnerName(str2);
                return true;
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public void setPropPermitLevel(String str, final int i) {
        setProp(str, new PropSetter("permitLevel") { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.22
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropSetter
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (i == bleDeviceProp.getPermitLevel()) {
                    return false;
                }
                bleDeviceProp.setPermitLevel(i);
                return true;
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public void setPropProductId(String str, final int i) {
        setProp(str, new PropSetter("pid") { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.18
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropSetter
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (i == bleDeviceProp.getProductId()) {
                    return false;
                }
                bleDeviceProp.setProductId(i);
                return true;
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public void setPropRssi(String str, final int i) {
        setProp(str, new PropSetter("rssi") { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.20
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropSetter
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (i == bleDeviceProp.getRssi()) {
                    return false;
                }
                bleDeviceProp.setRssi(i);
                return true;
            }
        }, false);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public void setPropSMac(String str, final String str2) {
        setProp(str, new PropSetter("smac") { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.4
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropSetter
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (str2.equals(bleDeviceProp.getSmac())) {
                    return false;
                }
                bleDeviceProp.setSmac(str2);
                return true;
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public void setPropScanRecord(String str, final byte[] bArr) {
        if (ByteUtils.isEmpty(bArr)) {
            return;
        }
        setProp(str, new PropSetter("scanRecord") { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.51
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropSetter
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                String strByteToString = ByteUtils.byteToString(bArr);
                if (strByteToString.equalsIgnoreCase(bleDeviceProp.getScanRecord())) {
                    return false;
                }
                bleDeviceProp.setScanRecord(strByteToString);
                return true;
            }
        }, false);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public void setPropType(String str, final int i) {
        setProp(str, new PropSetter("type") { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.53
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropSetter
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (i == bleDeviceProp.getType()) {
                    return false;
                }
                bleDeviceProp.setType(i);
                return true;
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public void setShowPincode(String str, final boolean z) {
        setProp(str, new PropSetter("setShowPincode") { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.35
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropSetter
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (z == bleDeviceProp.isShowPincode()) {
                    return false;
                }
                bleDeviceProp.setShowPincode(z);
                return true;
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public void traverse(IPropTraverse iPropTraverse) {
        synchronized (this.mPropCache) {
            try {
                for (Map.Entry<String, BleDeviceProp> entry : this.mPropCache.entrySet()) {
                    if (iPropTraverse.onTraverse(entry.getKey(), entry.getValue())) {
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void setProp(String str, PropSetter propSetter, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.mPropCache) {
            try {
                BleDeviceProp bleDeviceProp = this.mPropCache.get(str);
                if (bleDeviceProp == null) {
                    bleDeviceProp = new BleDeviceProp();
                    this.mPropCache.put(str, bleDeviceProp);
                }
                if (propSetter.setProp(bleDeviceProp) && z) {
                    savePropCacheAsync(this.mSharedPreferences, str, bleDeviceProp);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public void setPropExtra(String str, final String str2, final boolean z) {
        setProp(str, new PropSetter("boolean extra") { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.59
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropSetter
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (z == bleDeviceProp.getExtra(str2, false)) {
                    return false;
                }
                bleDeviceProp.setExtra(str2, z);
                return true;
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public void setPropExtra(String str, final String str2, final String str3) {
        setProp(str, new PropSetter("String extra") { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.61
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropSetter
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (str3.equals(bleDeviceProp.getExtra(str2, ""))) {
                    return false;
                }
                bleDeviceProp.setExtra(str2, str3);
                return true;
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public boolean getPropExtra(String str, final String str2, final boolean z) {
        return ((Boolean) getProp(str, new IPropGetter<Boolean>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.58
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropGetter
            public Boolean getProp(BleDeviceProp bleDeviceProp) {
                return Boolean.valueOf(bleDeviceProp.getExtra(str2, z));
            }
        }, Boolean.valueOf(z))).booleanValue();
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.IBlePropCacher
    public String getPropExtra(String str, final String str2) {
        return (String) getProp(str, new IPropGetter<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.60
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.model.BleDevicePropCache.IPropGetter
            public String getProp(BleDeviceProp bleDeviceProp) {
                return bleDeviceProp.getExtra(str2, "");
            }
        }, "");
    }
}
