package com.xiaomi.accountsdk.hasheddeviceidlib;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import com.xiaomi.account.privacy_data.master.PrivacyDataMaster;
import com.xiaomi.account.privacy_data.master.PrivacyDataType;
import com.xiaomi.accountsdk.account.XMPassportSettings;
import com.xiaomi.accountsdk.account.exception.IllegalDeviceException;
import com.xiaomi.accountsdk.utils.AccountLogger;
import com.xiaomi.passport.accountmanager.XiaomiAccountManager;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class HashedDeviceIdUtil {
    private static final String ANDROID_ID_PREFIX = "an_";
    private static final String OAID_PREFIX = "oa_";
    private static final String PSEUDO_DEVICE_ID_PREFIX = "android_";
    private static final String SP_KEY_HASHED_DEVICE_ID = "hashedDeviceId";
    private static final String SP_NAME_DEVICE_ID = "deviceId";
    private static final String TAG = "HashedDeviceIdUtil";
    private final Context context;
    private final PlainDeviceIdUtil.IPlainDeviceIdFetcher plainDeviceIdFetcher;

    public enum DeviceIdPolicy {
        RUNTIME_DEVICE_ID_ONLY,
        CACHED_THEN_RUNTIME_THEN_PSEUDO
    }

    public static class GlobalConfig {
        public static DeviceIdPolicy DEFAULT_DEVICE_ID_POLICY = DeviceIdPolicy.RUNTIME_DEVICE_ID_ONLY;
        private static final GlobalConfig sInstance = new GlobalConfig();
        private DeviceIdPolicy policy = DEFAULT_DEVICE_ID_POLICY;
        private IUnifiedDeviceIdFetcher unifiedDeviceIdFetcher;

        private GlobalConfig() {
        }

        public static GlobalConfig getInstance() {
            return sInstance;
        }

        public IUnifiedDeviceIdFetcher getUnifiedDeviceIdFetcher() {
            return this.unifiedDeviceIdFetcher;
        }

        public void setUnifiedDeviceIdFetcher(IUnifiedDeviceIdFetcher iUnifiedDeviceIdFetcher) {
            this.unifiedDeviceIdFetcher = iUnifiedDeviceIdFetcher;
        }

        public void setupPolicy(Context context) {
            this.policy = XiaomiAccountManager.isSystemXiaomiAccountApp(context) ? DeviceIdPolicy.RUNTIME_DEVICE_ID_ONLY : DeviceIdPolicy.CACHED_THEN_RUNTIME_THEN_PSEUDO;
        }
    }

    public HashedDeviceIdUtil(Context context) {
        this(context, PlainDeviceIdUtil.getFetcherInstance());
    }

    private static boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public String createPseudoDeviceId() {
        return String.format("%s%s", PSEUDO_DEVICE_ID_PREFIX, UUID.randomUUID().toString());
    }

    public synchronized String getHashedDeviceId(boolean z) {
        IUnifiedDeviceIdFetcher unifiedDeviceIdFetcher;
        DeviceIdPolicy deviceIdPolicyPolicy = policy();
        if (deviceIdPolicyPolicy == DeviceIdPolicy.RUNTIME_DEVICE_ID_ONLY) {
            return getRuntimeDeviceIdHashed();
        }
        if (deviceIdPolicyPolicy != DeviceIdPolicy.CACHED_THEN_RUNTIME_THEN_PSEUDO) {
            throw new IllegalStateException("unknown policy " + deviceIdPolicyPolicy);
        }
        String strLoadHistoricalHashedDeviceId = loadHistoricalHashedDeviceId();
        if (!TextUtils.isEmpty(strLoadHistoricalHashedDeviceId)) {
            return strLoadHistoricalHashedDeviceId;
        }
        String runtimeDeviceIdHashed = getRuntimeDeviceIdHashed();
        if (runtimeDeviceIdHashed != null) {
            saveHistoricalHashedDeviceId(runtimeDeviceIdHashed);
            return runtimeDeviceIdHashed;
        }
        if (z && !isMainThread() && (unifiedDeviceIdFetcher = GlobalConfig.getInstance().getUnifiedDeviceIdFetcher()) != null) {
            String hashedDeviceId = unifiedDeviceIdFetcher.getHashedDeviceId(this.context);
            if (!TextUtils.isEmpty(hashedDeviceId)) {
                saveHistoricalHashedDeviceId(hashedDeviceId);
                return hashedDeviceId;
            }
        }
        String str = PrivacyDataMaster.get(this.context, PrivacyDataType.OAID, new String[0]);
        if (!TextUtils.isEmpty(str)) {
            String str2 = OAID_PREFIX + DeviceIDCloudCoder.getDataMd5Digest(str.getBytes());
            saveHistoricalHashedDeviceId(str2);
            return str2;
        }
        String str3 = PrivacyDataMaster.get(this.context, PrivacyDataType.ANDROID_ID, new String[0]);
        if (TextUtils.isEmpty(str3)) {
            String strCreatePseudoDeviceId = createPseudoDeviceId();
            saveHistoricalHashedDeviceId(strCreatePseudoDeviceId);
            return strCreatePseudoDeviceId;
        }
        String str4 = ANDROID_ID_PREFIX + DeviceIDCloudCoder.getDataMd5Digest(str3.getBytes());
        saveHistoricalHashedDeviceId(str4);
        return str4;
    }

    @Deprecated
    public synchronized String getHashedDeviceIdNoThrow() {
        return getHashedDeviceId(true);
    }

    public String getHashedDeviceIdThrow() throws IllegalDeviceException {
        String hashedDeviceIdNoThrow = getHashedDeviceIdNoThrow();
        if (hashedDeviceIdNoThrow != null) {
            return hashedDeviceIdNoThrow;
        }
        throw new IllegalDeviceException("null device id");
    }

    public String getRuntimeDeviceIdHashed() {
        try {
            String userEnvironmentPlainDeviceId = getUserEnvironmentPlainDeviceId();
            if (legal(userEnvironmentPlainDeviceId)) {
                return XMPassportSettings.getDeviceType() == XMPassportSettings.DeviceType.WEAR ? userEnvironmentPlainDeviceId : DeviceIdHasher.hashDeviceInfo(userEnvironmentPlainDeviceId);
            }
            return null;
        } catch (SecurityException e) {
            AccountLogger.log(TAG, "can't get deviceid.", e);
            return null;
        }
    }

    public SharedPreferences getSP() {
        Context context = this.context;
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences("deviceId", 0);
    }

    public String getUserEnvironmentPlainDeviceId() {
        return this.plainDeviceIdFetcher.getPlainDeviceId(this.context);
    }

    public boolean hasHistoricalHashedDeviceId() {
        return legal(loadHistoricalHashedDeviceId());
    }

    public boolean legal(String str) {
        return !TextUtils.isEmpty(str);
    }

    public String loadHistoricalHashedDeviceId() {
        SharedPreferences sp = getSP();
        if (sp == null) {
            return null;
        }
        return sp.getString(SP_KEY_HASHED_DEVICE_ID, null);
    }

    public DeviceIdPolicy policy() {
        return GlobalConfig.getInstance().policy;
    }

    public void saveHistoricalHashedDeviceId(String str) {
        SharedPreferences sp = getSP();
        if (sp != null) {
            sp.edit().putString(SP_KEY_HASHED_DEVICE_ID, str).commit();
        }
    }

    public HashedDeviceIdUtil(Context context, PlainDeviceIdUtil.IPlainDeviceIdFetcher iPlainDeviceIdFetcher) {
        if (iPlainDeviceIdFetcher == null) {
            throw new IllegalArgumentException("plainDeviceIdFetcher == null");
        }
        this.context = context == null ? null : context.getApplicationContext();
        this.plainDeviceIdFetcher = iPlainDeviceIdFetcher;
    }
}
