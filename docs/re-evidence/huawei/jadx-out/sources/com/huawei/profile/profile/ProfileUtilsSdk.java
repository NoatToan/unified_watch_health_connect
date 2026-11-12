package com.huawei.profile.profile;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.huawei.profile.account.AccountClientSdk;
import com.huawei.profile.datamanager.AbstractDatabase;
import com.huawei.profile.datamanager.DatabaseFactory;
import com.huawei.profile.kv.DBEntity;
import com.huawei.profile.kv.ProfileSdkStore;
import com.huawei.profile.kv.ProfileValue;
import com.huawei.profile.utils.JsonUtils;
import com.huawei.profile.utils.logger.DsLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes15.dex */
public final class ProfileUtilsSdk {
    public static final String CHARACTER_KEY = "characteristics";
    private static final int DEFAULT_DATA_SOURCE = 1;
    private static final String DEFAULT_WRONG_CLOUD_BASE_VERSION_MESSAGE = "get cloud base version failed";
    public static final String DEVICES_KEY = "devices";
    public static final String DEVICE_ID = "deviceId";
    private static final String DEVICE_PROFILE_CLOUD_BASE_VERSION = "device_profile_cloud_base_version";
    public static final String DEV_ID_AND_CLOUD_INDEX = "com.huawei.profile/localDevidIntoCloudDevid";
    public static final String DEV_TYPE = "devType";
    public static final String EMPTY_STR = "";
    public static final String HW_TIMESTAMP = "timestamp";
    public static final boolean IS_NOT_NEED_CLOUD = false;
    public static final String NEED_CLOUD_DEVICE = "needCloudDevice";
    public static final String PROFILE_PACKAGE_NAME = "com.huawei.profile";
    public static final String PROFILE_TAG = "all_profiles";
    public static final String RESEND_DELETE_CHARACTER = "deleteCharacter";
    public static final String RESEND_DELETE_DEVICE = "deleteDevice";
    public static final String RESEND_DELETE_SERVICE = "deleteService";
    public static final String RESEND_INDEX_KEY = "com.huawei.profile/reSendIndexKey";
    public static final String RESEND_PUT_CHARACTER = "putCharacter";
    public static final String RESEND_PUT_DEVICE = "putDevice";
    public static final String RESEND_PUT_SERVICE = "putService";
    public static final String SEPARATOR = "/";
    public static final String SERVICES_KEY = "services";
    public static final String TAG = "ProfileUtilsSdk";
    public static final String TYPE = "type";
    private static ProfileSdkStore profileSdkStore;
    private Context mContext;
    public static final List<?> NULL_LIST = new ArrayList();
    public static final Map<?, ?> NULL_MAP = new HashMap();
    private static final Object LOCK = new Object();
    private static ProfileUtilsSdk singleton = null;

    private ProfileUtilsSdk(Context context) {
        this.mContext = context;
    }

    public static ProfileUtilsSdk getInstance(Context context) {
        ProfileUtilsSdk profileUtilsSdk;
        synchronized (LOCK) {
            if (singleton == null) {
                singleton = new ProfileUtilsSdk(context);
                profileSdkStore = new ProfileSdkStore(context);
            }
            profileUtilsSdk = singleton;
        }
        return profileUtilsSdk;
    }

    public Map<String, ProfileValue> putProfilesToMap(List list) {
        HashMap map = new HashMap(list.size());
        for (Object obj : list) {
            if (obj instanceof ProfileValue) {
                ProfileValue profileValue = (ProfileValue) obj;
                map.put(profileValue.getId(), profileValue);
            }
        }
        return map;
    }

    public List<DeviceProfile> getAllDevicesInter() {
        return profileSdkStore.getDevices("com.huawei.profile", false, 1);
    }

    public DeviceProfile getDeviceInter(String str) {
        return profileSdkStore.getDeviceByDevId("com.huawei.profile", str);
    }

    public List<ServiceProfile> getServicesInter(String str) {
        return profileSdkStore.getServicesOfDevice("com.huawei.profile", str, false, 1);
    }

    public ServiceCharacteristicProfile getCharacterInter(String str, String str2) {
        return profileSdkStore.getServiceCharacteristicsForCloudRequest("com.huawei.profile", str, str2);
    }

    public boolean putDeviceInter(DeviceProfile deviceProfile) {
        if (deviceProfile == null) {
            DsLog.et(TAG, "Some input params may be null, check device profile", new Object[0]);
            return false;
        }
        deviceProfile.setIsNeedCloud(false);
        return profileSdkStore.putDeviceCore("com.huawei.profile", deviceProfile);
    }

    public boolean putDevicesInter(List<DeviceProfile> list) {
        Iterator<DeviceProfile> it = list.iterator();
        while (it.hasNext()) {
            it.next().setIsNeedCloud(false);
        }
        return profileSdkStore.putDevicesCore("com.huawei.profile", list);
    }

    public void putServicesInter(String str, List<ServiceProfile> list) {
        if (list == null || list.isEmpty()) {
            DsLog.et(TAG, "Some input params may be null, check service profile list", new Object[0]);
            return;
        }
        Iterator<ServiceProfile> it = list.iterator();
        while (it.hasNext()) {
            it.next().setIsNeedCloud(false);
        }
        profileSdkStore.putServicesOfDevice("com.huawei.profile", str, list);
    }

    public void putServicesCharacteristicInter(String str, String str2, ServiceCharacteristicProfile serviceCharacteristicProfile) {
        if (serviceCharacteristicProfile == null) {
            DsLog.et(TAG, "Some input params may be null, check character profile", new Object[0]);
        } else {
            serviceCharacteristicProfile.setIsNeedCloud(false);
            profileSdkStore.putServiceCharacteristic("com.huawei.profile", str, str2, serviceCharacteristicProfile);
        }
    }

    public void deleteServiceHard(String str, Set<String> set) {
        profileSdkStore.deleteServiceAndCharacterHard("com.huawei.profile", str, set);
    }

    public void saveCloudDevId(String str, String str2) {
        ProfileBaseUtils.saveCloudDevId(this.mContext, str, str2);
    }

    public void saveCloudDevIdList(List<String> list, List<String> list2) {
        if (list == null || list2 == null) {
            return;
        }
        ProfileBaseUtils.saveCloudDevIdList(this.mContext, list, list2);
    }

    public String getCloudDevId(String str) {
        String str2 = DatabaseFactory.generateDb(this.mContext).get("com.huawei.profile", "com.huawei.profile/localDevidIntoCloudDevid");
        if (str2 == null || str2.isEmpty()) {
            DsLog.et(TAG, "getCloudDevId failed, reason is dbVal is null", new Object[0]);
            return "";
        }
        try {
            JsonObject asJsonObject = JsonParser.parseString(JsonUtils.sanitize(str2)).getAsJsonObject();
            if (asJsonObject.has(str)) {
                return asJsonObject.get(str).getAsString();
            }
        } catch (IllegalStateException | UnsupportedOperationException unused) {
            DsLog.et(TAG, "an error happens when get string value from json.", new Object[0]);
        }
        return "";
    }

    public void saveResendIndex(String str, String str2, String str3) {
        JsonObject jsonObject;
        JsonObject jsonObject2;
        synchronized (this) {
            if (str2 != null) {
                if (!str2.isEmpty() && str3 != null && !str3.isEmpty()) {
                    if (!str.equals("devices") && !str.equals("services") && !str.equals("characteristics")) {
                        DsLog.et(TAG, "saveDevResentIndex failed, reason is indexSort is invalid", new Object[0]);
                        return;
                    }
                    String str4 = DatabaseFactory.generateDb(this.mContext).get("com.huawei.profile", "com.huawei.profile/reSendIndexKey");
                    if (str4 == null || str4.isEmpty()) {
                        jsonObject = new JsonObject();
                    } else {
                        jsonObject = JsonParser.parseString(JsonUtils.sanitize(str4)).getAsJsonObject();
                    }
                    if (jsonObject.has(str)) {
                        jsonObject2 = jsonObject.getAsJsonObject(str);
                    } else {
                        jsonObject2 = new JsonObject();
                    }
                    if (jsonObject2 != null) {
                        jsonObject2.addProperty(str2, str3);
                    }
                    jsonObject.add(str, jsonObject2);
                    DBEntity dBEntity = new DBEntity("com.huawei.profile/reSendIndexKey", jsonObject.toString());
                    DsLog.it(TAG, "dbEntity key is " + dBEntity.getEntityKey(), new Object[0]);
                    DatabaseFactory.generateDb(this.mContext).put("com.huawei.profile", dBEntity);
                    return;
                }
            }
            DsLog.et(TAG, "saveDevResentIndex failed, reason is parameter is invalid", new Object[0]);
        }
    }

    public Map<String, Map<String, String>> getAllResendIndex() {
        synchronized (this) {
            String str = DatabaseFactory.generateDb(this.mContext).get("com.huawei.profile", "com.huawei.profile/reSendIndexKey");
            if (str != null && !str.isEmpty()) {
                JsonObject asJsonObject = JsonParser.parseString(JsonUtils.sanitize(str)).getAsJsonObject();
                JsonObject asJsonObject2 = asJsonObject.getAsJsonObject("devices");
                JsonObject asJsonObject3 = asJsonObject.getAsJsonObject("services");
                JsonObject asJsonObject4 = asJsonObject.getAsJsonObject("characteristics");
                HashMap map = new HashMap();
                Gson gson = new Gson();
                if (asJsonObject2 != null) {
                    map.put("devices", (Map) gson.fromJson(JsonUtils.sanitize(asJsonObject2.toString()), Map.class));
                }
                if (asJsonObject3 != null) {
                    map.put("services", (Map) gson.fromJson(JsonUtils.sanitize(asJsonObject3.toString()), Map.class));
                }
                if (asJsonObject4 != null) {
                    map.put("characteristics", (Map) gson.fromJson(JsonUtils.sanitize(asJsonObject4.toString()), Map.class));
                }
                return map;
            }
            DsLog.wt(TAG, "getAllResendIndex failed, reason is dbVal is invalid", new Object[0]);
            return Collections.EMPTY_MAP;
        }
    }

    public boolean removeResendIndex(String str, String str2) {
        synchronized (this) {
            if (str2 != null) {
                if (!str2.isEmpty()) {
                    if (!str.equals("devices") && !str.equals("services") && !str.equals("characteristics")) {
                        DsLog.et(TAG, "saveDevResentIndex failed, reason is indexSort is invalid", new Object[0]);
                        return false;
                    }
                    String str3 = DatabaseFactory.generateDb(this.mContext).get("com.huawei.profile", "com.huawei.profile/reSendIndexKey");
                    if (str3 != null && !str3.isEmpty()) {
                        JsonObject asJsonObject = JsonParser.parseString(JsonUtils.sanitize(str3)).getAsJsonObject();
                        if (asJsonObject.has(str)) {
                            JsonObject asJsonObject2 = asJsonObject.getAsJsonObject(str);
                            if (asJsonObject2 != null) {
                                asJsonObject2.remove(str2);
                            }
                            asJsonObject.add(str, asJsonObject2);
                            return DatabaseFactory.generateDb(this.mContext).put("com.huawei.profile", new DBEntity("com.huawei.profile/reSendIndexKey", asJsonObject.toString()));
                        }
                        DsLog.it(TAG, "removeResendIndex success, reason is detailIndex is not exist", new Object[0]);
                        return true;
                    }
                    DsLog.it(TAG, "removeResendIndex success, reason is index is not exist", new Object[0]);
                    return true;
                }
            }
            DsLog.et(TAG, "removeResendIndex failed, reason is parameter is invalid", new Object[0]);
            return false;
        }
    }

    public void removeResendIndexOfCharacter(String str, String str2) {
        synchronized (this) {
            Map<String, Map<String, String>> allResendIndex = getAllResendIndex();
            if (allResendIndex != null && !allResendIndex.isEmpty()) {
                Map<String, String> map = allResendIndex.get("characteristics");
                if (map != null) {
                    if (map.get(str + "/" + str2).indexOf("putCharacter") >= 0) {
                        removeResendIndex("characteristics", str + "/" + str2);
                    }
                }
                return;
            }
            DsLog.dt(TAG, "removeResendIndexOfCharacter, allResendIndex is null or empty", new Object[0]);
        }
    }

    public static boolean waitForCallback(long j, CountDownLatch countDownLatch) {
        try {
            return countDownLatch.await(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            DsLog.et(TAG, "Waiting for call back is interrupted!", new Object[0]);
            return false;
        }
    }

    public void resetAccessTokenTime() {
        AccountClientSdk.getInstance(this.mContext).setAccountInvalid();
    }

    public void saveNeedCloudDevice(String str) {
        ProfileBaseUtils.saveNeedCloudDevice(this.mContext, str);
    }

    public void saveNeedCloudDevices(List<String> list) {
        ProfileBaseUtils.saveNeedCloudDevices(this.mContext, list);
    }

    public void queryDeleteDeviceHard(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        profileSdkStore.queryDeleteDeviceHard("com.huawei.profile", str);
    }

    public void deleteDeviceHard() {
        profileSdkStore.deleteDeviceHard("com.huawei.profile");
    }

    public void deleteAccountData() {
        JsonObject asJsonObject;
        boolean z;
        DsLog.it(TAG, "deleteAccountData start", new Object[0]);
        HashSet hashSet = new HashSet();
        JsonObject jsonObjectQueryNeedCloudDevice = ProfileBaseUtils.queryNeedCloudDevice(this.mContext);
        if (jsonObjectQueryNeedCloudDevice != null) {
            Iterator<String> it = jsonObjectQueryNeedCloudDevice.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
        }
        AbstractDatabase abstractDatabaseGenerateDb = DatabaseFactory.generateDb(this.mContext);
        String str = abstractDatabaseGenerateDb.get("com.huawei.profile", "com.huawei.profile/localDevidIntoCloudDevid");
        if (TextUtils.isEmpty(str)) {
            asJsonObject = null;
        } else {
            try {
                asJsonObject = JsonParser.parseString(str).getAsJsonObject();
            } catch (ClassCastException | IllegalStateException | NumberFormatException unused) {
                DsLog.et(TAG, "parse cloudDeviceStr Exception", new Object[0]);
                asJsonObject = null;
            }
        }
        if (asJsonObject != null) {
            Iterator<String> it2 = asJsonObject.keySet().iterator();
            while (it2.hasNext()) {
                hashSet.add(it2.next());
            }
        }
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            queryDeleteDeviceHard((String) it3.next());
        }
        profileSdkStore.deleteDeviceHard("com.huawei.profile");
        ProfileBaseUtils.clearCloudDeviceRecordSet(this.mContext, hashSet);
        DsLog.dt(TAG, "finish clear cloud", new Object[0]);
        ArrayList arrayList = new ArrayList();
        arrayList.add("com.huawei.profile/reSendIndexKey");
        arrayList.add("com.huawei.profile/localDevidIntoCloudDevid");
        arrayList.add("needCloudDevice");
        Iterator it4 = arrayList.iterator();
        while (true) {
            while (true) {
                if (it4.hasNext()) {
                    z = z && abstractDatabaseGenerateDb.remove("com.huawei.profile", (String) it4.next());
                } else {
                    DsLog.it(TAG, "delete account info result is " + z, new Object[0]);
                    return;
                }
            }
        }
    }

    public static <T> List<T> nullList() {
        return (List<T>) NULL_LIST;
    }

    public static <K, V> Map<K, V> nullMap() {
        return (Map<K, V>) NULL_MAP;
    }

    public static boolean isNull(List<?> list) {
        return list == null || list == NULL_LIST;
    }

    public static boolean isNull(Map<?, ?> map) {
        return map == null || map == NULL_MAP;
    }

    public static String getCloudBaseVersion(Context context) {
        ApplicationInfo applicationInfo;
        if (context == null) {
            DsLog.et(TAG, "getCloudBaseVersion failed context is null", new Object[0]);
            return DEFAULT_WRONG_CLOUD_BASE_VERSION_MESSAGE;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            Log.e(TAG, "Failed to get packageManager.");
            return DEFAULT_WRONG_CLOUD_BASE_VERSION_MESSAGE;
        }
        try {
            applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(TAG, "name not found: " + e.getMessage());
            applicationInfo = null;
        } catch (RuntimeException unused) {
            DsLog.et(TAG, "runtime for get app info", new Object[0]);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            Log.e(TAG, "Failed to get applicationInfo.");
            return DEFAULT_WRONG_CLOUD_BASE_VERSION_MESSAGE;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle == null) {
            Log.e(TAG, "Failed to get bundle.");
            return DEFAULT_WRONG_CLOUD_BASE_VERSION_MESSAGE;
        }
        return bundle.getString(DEVICE_PROFILE_CLOUD_BASE_VERSION);
    }
}
