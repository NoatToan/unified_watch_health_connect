package com.xiaomi.smarthome.cache;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.mmkv.MMKV;
import com.xiaomi.smarthome.cache.keystore.EncryptionManager;
import com.xiaomi.smarthome.cache.keystore.ICacheStore;
import com.xiaomi.smarthome.library.log.MiJiaLog;

/* JADX INFO: loaded from: classes4.dex */
public class SecurityCache {
    private static final String KEY_PREFIX = "mijia";
    private static final String MMKV_PWD = "ox23.j3qk";
    private static final String TAG = "SecurityCache";
    private ICacheStore cacheStore;
    private EncryptionManager cryptManager;
    private volatile boolean isInit;
    private byte[] shiftKey;

    public static final class Holder {
        static final SecurityCache INSTANCE = new SecurityCache();
    }

    public interface KeySuffix {
        public static final String LTMK = ".ltmk";
        public static final String PinCode = ".pincode";
        public static final String lockShareCreateTime = ".lockShareCreateTime";
        public static final String lockShareKeyId = ".lockShareKeyId";
        public static final String lockShareUserKey = ".lockShareUserKey";
        public static final String meshBindInfo = ".meshBindInfo";
        public static final String mitvBleMac = ".mitvBleMac";
        public static final String sessionKey = ".sessionKey";
        public static final String shareKeyId = ".shareKeyId";
        public static final String token = ".token";
        public static final String uwbDeviceKey = ".uwbDeviceKey";
    }

    public static SecurityCache getInstance() {
        return Holder.INSTANCE;
    }

    private String read(String str) {
        try {
            String strJ = store().j(EncryptionManager.getHashed(str));
            if (strJ != null) {
                return this.cryptManager.decrypt(strJ);
            }
            return null;
        } catch (Exception e) {
            MiJiaLog.onlyLogcat(TAG, "read " + str + ",occur exception :" + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    private boolean write(String str, String str2) {
        try {
            store().u(EncryptionManager.getHashed(str), this.cryptManager.encrypt(str2));
            return true;
        } catch (Exception e) {
            MiJiaLog.onlyLogcat(TAG, "write " + str + ",occur exception :" + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public String getLockShareCreateTime(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return read(str + KeySuffix.lockShareCreateTime);
    }

    public String getLockShareKeyId(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return read(str + KeySuffix.lockShareKeyId);
    }

    public String getLockShareUserKey(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return read(str + KeySuffix.lockShareUserKey);
    }

    public String getLtmk(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return read(str + KeySuffix.LTMK);
    }

    public String getMeshBindInfo(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return read(str + KeySuffix.meshBindInfo);
    }

    public String getMitvBleMac(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return read(str + KeySuffix.mitvBleMac);
    }

    public String getPinCode(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return read(str + KeySuffix.PinCode);
    }

    public String getSessionKey(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return read(str + KeySuffix.sessionKey);
    }

    public String getShareKeyId(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return read(str + KeySuffix.shareKeyId);
    }

    public String getToken(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return read(str + KeySuffix.token);
    }

    public String getUwbDeviceKey(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return read(str + KeySuffix.uwbDeviceKey);
    }

    public void init(Context context) {
        try {
            this.cryptManager = new EncryptionManager(context, this.cacheStore, "mijia", this.shiftKey);
            this.isInit = true;
        } catch (Exception e) {
            MiJiaLog.onlyLogcat(TAG, "init  fail");
            e.printStackTrace();
            this.isInit = false;
        }
    }

    public boolean isInited() {
        return this.isInit;
    }

    public boolean setLockShareCreateTime(String str, String str2) {
        return write(str + KeySuffix.lockShareCreateTime, str2);
    }

    public boolean setLockShareKeyId(String str, String str2) {
        return write(str + KeySuffix.lockShareKeyId, str2);
    }

    public boolean setLockShareUserKey(String str, String str2) {
        return write(str + KeySuffix.lockShareUserKey, str2);
    }

    public boolean setLtmk(String str, String str2) {
        return write(str + KeySuffix.LTMK, str2);
    }

    public boolean setMeshBindInfo(String str, String str2) {
        return write(str + KeySuffix.meshBindInfo, str2);
    }

    public boolean setMitvBleMac(String str) {
        int length = str.length();
        if (TextUtils.isEmpty(str) || length < 4) {
            return false;
        }
        String strReplace = str.replace(":", "");
        int length2 = strReplace.length();
        String str2 = strReplace.substring(length2 - 4, length2) + KeySuffix.mitvBleMac;
        MiJiaLog.onlyLogcat(TAG, "UwbLogUtilPlus setMitvBleMac key: " + str2 + " blemac: " + str);
        return write(str2, str);
    }

    public boolean setPinCode(String str, String str2) {
        return write(str + KeySuffix.PinCode, str2);
    }

    public boolean setSessionKey(String str, String str2) {
        return write(str + KeySuffix.sessionKey, str2);
    }

    public boolean setShareKeyId(String str, String str2) {
        return write(str + KeySuffix.shareKeyId, str2);
    }

    public boolean setToken(String str, String str2) {
        return write(str + KeySuffix.token, str2);
    }

    public boolean setUwbDeviceKey(String str, String str2) {
        return write(str + KeySuffix.uwbDeviceKey, str2);
    }

    public MMKV store() {
        return MMKV.H("security.cache", 2, MMKV_PWD);
    }

    private SecurityCache() {
        this.shiftKey = "j49ks1q".getBytes();
        this.isInit = false;
        this.cacheStore = new ICacheStore() { // from class: com.xiaomi.smarthome.cache.SecurityCache.1
            @Override // com.xiaomi.smarthome.cache.keystore.ICacheStore
            public boolean contains(String str) {
                return SecurityCache.this.store().contains(str);
            }

            @Override // com.xiaomi.smarthome.cache.keystore.ICacheStore
            public boolean getBoolean(String str, boolean z) {
                return SecurityCache.this.store().d(str, z);
            }

            @Override // com.xiaomi.smarthome.cache.keystore.ICacheStore
            public String getString(String str, String str2) {
                return SecurityCache.this.store().k(str, str2);
            }

            @Override // com.xiaomi.smarthome.cache.keystore.ICacheStore
            public boolean putBoolean(String str, boolean z) {
                return SecurityCache.this.store().w(str, z);
            }

            @Override // com.xiaomi.smarthome.cache.keystore.ICacheStore
            public boolean putString(String str, String str2) {
                return SecurityCache.this.store().u(str, str2);
            }
        };
    }
}
