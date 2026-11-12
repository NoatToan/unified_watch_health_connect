package com.huawei.wearengine.utils;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.wearengine.device.Device;
import defpackage.yic;
import defpackage.yik;
import defpackage.yit;
import defpackage.yiv;
import defpackage.yja;
import defpackage.ymi;
import defpackage.ymk;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class DeviceProcessor {
    private static final String DEVICE_PROCESSOR_FILE = "WearEngine_DeviceProcessor";
    private static final String DEVICE_PROCESSOR_THREAD_NAME = "WearEngine_DeviceProcessor_Thread";
    private static final Object MAP_LOCK = new Object();
    private static final int MAX_DEVICE_NUM = 24;
    private static final int MAX_WEAR_ENGINE_DEVICE_ID_NUM = 10;
    private static final int PACKAGE_NAME_KEEP_LENGTH = 30;
    private static final String RESERVEDNESS_FIELD = "mReservedness";
    private static final Set<String> SUPER_CALLER_SET;
    private static final String TAG = "DeviceProcessor";
    private static final int UUID_ARRAY_LEN = 2;
    private static final String UUID_DELIMITER = "##";
    private static final String WEAR_ENGINE_SERVICE_ID_MAP = "WearEngineDeviceIdMap";
    private static volatile boolean isInit;
    private static Handler mSaveDataHandler;
    private static SharedPreferences mSharedPreferences;
    private static Map<String, List<String>> sUUIDWearEngineDeviceIdListMap;
    private static Map<String, String> sWearEngineDeviceIdMap;

    static {
        HashSet hashSet = new HashSet(yic.a());
        SUPER_CALLER_SET = hashSet;
        sWearEngineDeviceIdMap = new ConcurrentHashMap();
        sUUIDWearEngineDeviceIdListMap = new LinkedHashMap();
        isInit = false;
        hashSet.addAll(yik.e());
    }

    private DeviceProcessor() {
    }

    public static Set<String> getSuperCallerSet() {
        return new HashSet(SUPER_CALLER_SET);
    }

    public static List<Device> processOutputDevice(String str, List<Device> list) {
        yit.e(TAG, "processOutputDevice callingPkgName: " + str);
        if (TextUtils.isEmpty(str)) {
            yit.b(TAG, "processOutputDevice callingPkgName is empty");
            throw new IllegalStateException(String.valueOf(12));
        }
        if (list == null) {
            yit.b(TAG, "processOutputDevice devices is null");
            throw new IllegalStateException(String.valueOf(12));
        }
        handleDeviceExtraInfo(str, list);
        if ("com.huawei.deveco.assistant".equals(str)) {
            return processOutputDeviceForAssistant(list);
        }
        if (SUPER_CALLER_SET.contains(str)) {
            return list;
        }
        checkLocalCacheInit();
        HashMap map = new HashMap(16);
        for (Device device : list) {
            if (device.getProductType() == 0) {
                saveDeviceIdUuIdMapAndSetDeviceUuid(str, device, map);
            }
        }
        updateWearEngineIdDeviceInfo(map);
        dumpDeviceInfo(list);
        return list;
    }

    private static void handleDeviceExtraInfo(String str, List<Device> list) {
        boolean zB = yik.b(str);
        boolean zE = yik.e(str);
        yit.e(TAG, "handleDeviceExtraInfo isCanGetDeviceSnCaller: " + zB + ", isCanGetDeviceFidCaller:" + zE);
        for (Device device : list) {
            if (device.getProductType() == 0) {
                deleteDeviceExtraInfo(device, zB, zE);
            }
        }
    }

    private static void deleteDeviceExtraInfo(Device device, boolean z, boolean z2) {
        String strC = yja.c(device);
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        try {
            yja yjaVar = new yja(strC);
            if (!z2) {
                yjaVar.remove("device_fid");
            }
            deleteDeviceSNAndUdid(z, yjaVar);
            device.setReservedness(yjaVar.toString());
        } catch (JSONException unused) {
            yit.b(TAG, "deleteDeviceExtraInfo has an JSONException");
        }
    }

    private static void deleteDeviceSNAndUdid(boolean z, yja yjaVar) throws JSONException {
        String string;
        if (yjaVar.has("device_extra")) {
            String strB = yjaVar.b();
            if (TextUtils.isEmpty(strB)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strB);
            if (!z) {
                jSONObject.remove(HealthEngineRequestManager.PARAMS_DEVICE_SN);
                jSONObject.remove("deviceUdid");
            }
            if (jSONObject.length() == 0) {
                string = "";
            } else {
                string = jSONObject.toString();
            }
            yjaVar.c(string);
        }
    }

    private static void saveDeviceIdUuIdMapAndSetDeviceUuid(String str, Device device, Map<String, String> map) {
        String strM = ymk.m(getJsonFromDevice(device));
        if (TextUtils.isEmpty(strM)) {
            yit.b(TAG, "processOutputDevice wearEngineDeviceId is empty");
            throw new IllegalStateException(String.valueOf(12));
        }
        String uuid = device.getUuid();
        if (TextUtils.isEmpty(uuid)) {
            yit.b(TAG, "processOutputDevice uuId is empty");
            throw new IllegalStateException(String.valueOf(12));
        }
        map.put(strM, uuid);
        String strC = ymi.c(str, "SHA-256");
        if (TextUtils.isEmpty(strC)) {
            yit.b(TAG, "processOutputDevice pkgNameSha256 is empty");
            throw new IllegalStateException(String.valueOf(12));
        }
        if (strC.length() < 30) {
            yit.b(TAG, "processOutputDevice pkgNameSha256 length is invalid");
            throw new IllegalStateException(String.valueOf(12));
        }
        device.setUuid(strM + UUID_DELIMITER + strC.substring(0, 30));
    }

    public static Device processInputDevice(String str, Device device) {
        yit.e(TAG, "processInputDevice callingPkgName: " + str);
        if (device == null) {
            yit.b(TAG, "processInputDevice inputDevice is null");
            throw new IllegalStateException(String.valueOf(5));
        }
        if (TextUtils.isEmpty(str)) {
            yit.b(TAG, "processInputDevice callingPkgName is empty");
            throw new IllegalStateException(String.valueOf(12));
        }
        if (device.getProductType() == 0) {
            if ("com.huawei.deveco.assistant".equals(str)) {
                return processInputDeviceForAssistant(device);
            }
            if (!SUPER_CALLER_SET.contains(str)) {
                checkLocalCacheInit();
                device.setUuid(getInputDeviceRealUuId(device));
                return device;
            }
        }
        return device;
    }

    private static String getInputDeviceRealUuId(Device device) {
        String uuid = device.getUuid();
        yit.e(TAG, "processInputDevice input uuid: " + uuid);
        if (TextUtils.isEmpty(uuid) || !uuid.contains(UUID_DELIMITER)) {
            yit.b(TAG, "processInputDevice input uuid is invalid");
            throw new IllegalStateException(String.valueOf(17));
        }
        String wearEngineDeviceIdFromInputUuid = getWearEngineDeviceIdFromInputUuid(uuid);
        if (TextUtils.isEmpty(wearEngineDeviceIdFromInputUuid)) {
            yit.b(TAG, "processInputDevice wearEngineDeviceId from inputDeviceId is empty");
            throw new IllegalStateException(String.valueOf(17));
        }
        String realUuIdFromCache = getRealUuIdFromCache(wearEngineDeviceIdFromInputUuid);
        if (!TextUtils.isEmpty(realUuIdFromCache)) {
            return realUuIdFromCache;
        }
        yit.b(TAG, "processInputDevice uuId from cache is empty");
        throw new IllegalStateException(String.valueOf(17));
    }

    private static void dumpDeviceInfo(List<Device> list) {
        StringBuilder sb = new StringBuilder();
        for (Device device : list) {
            sb.append("device name: ");
            sb.append(device.getName());
            sb.append(", wearEngineDeviceId: ");
            sb.append(device.getUuid());
            sb.append(" ");
        }
        yit.e(TAG, sb.toString());
    }

    private static String getRealUuIdFromCache(String str) {
        String str2;
        yit.e(TAG, "getRealUuIdFromCache:" + str);
        synchronized (MAP_LOCK) {
            str2 = sWearEngineDeviceIdMap.get(str);
        }
        return str2;
    }

    private static String getWearEngineDeviceIdFromInputUuid(String str) {
        String[] strArrSplit = str.split(UUID_DELIMITER);
        if (strArrSplit.length < 2) {
            yit.b(TAG, "getWearEngineDeviceIdFromInputUuid strings length invalid");
            return "";
        }
        return strArrSplit[0];
    }

    private static String getJsonFromDevice(Object obj) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(RESERVEDNESS_FIELD);
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            if (!(obj2 instanceof String)) {
                return "";
            }
            return (String) obj2;
        } catch (IllegalAccessException unused) {
            yit.b(TAG, "getJsonFromDevice catch IllegalAccessException");
            return "";
        } catch (NoSuchFieldException unused2) {
            yit.b(TAG, "getJsonFromDevice catch NoSuchFieldException");
            return "";
        }
    }

    private static void checkLocalCacheInit() {
        synchronized (MAP_LOCK) {
            if (!isInit) {
                initLocalDeviceWearEngineInfo();
            }
        }
    }

    private static void initLocalDeviceWearEngineInfo() {
        synchronized (MAP_LOCK) {
            if (isInit) {
                yit.c(TAG, "initLocalDeviceWearEngineInfo already init return");
                return;
            }
            HandlerThread handlerThread = new HandlerThread(DEVICE_PROCESSOR_THREAD_NAME);
            handlerThread.start();
            if (handlerThread.getLooper() == null) {
                yit.b(TAG, "initLocalDeviceWearEngineInfo looper is null return");
                return;
            }
            mSaveDataHandler = new Handler(handlerThread.getLooper());
            mSharedPreferences = yiv.a().getSharedPreferences(DEVICE_PROCESSOR_FILE, 0);
            sUUIDWearEngineDeviceIdListMap.clear();
            sWearEngineDeviceIdMap.clear();
            String string = mSharedPreferences.getString(WEAR_ENGINE_SERVICE_ID_MAP, "");
            if (TextUtils.isEmpty(string)) {
                isInit = true;
                yit.c(TAG, "initLocalDeviceWearEngineInfo local cache is null");
                return;
            }
            try {
                Map<? extends String, ? extends List<String>> map = (Map) new Gson().fromJson(string, new TypeToken<Map<String, List<String>>>() { // from class: com.huawei.wearengine.utils.DeviceProcessor.1
                }.getType());
                if (map != null) {
                    sUUIDWearEngineDeviceIdListMap.putAll(map);
                }
                yit.e(TAG, "local save size:" + sUUIDWearEngineDeviceIdListMap.size());
            } catch (JsonSyntaxException unused) {
                yit.b(TAG, "parse local device id info exception");
            }
            for (Map.Entry<String, List<String>> entry : sUUIDWearEngineDeviceIdListMap.entrySet()) {
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    sWearEngineDeviceIdMap.put(it.next(), entry.getKey());
                }
            }
            isInit = true;
        }
    }

    private static void updateLocalCache(final Map<String, List<String>> map) {
        mSaveDataHandler.post(new Runnable() { // from class: com.huawei.wearengine.utils.DeviceProcessor.3
            @Override // java.lang.Runnable
            public void run() {
                DeviceProcessor.updateLocalCacheLock(map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void updateLocalCacheLock(Map<String, List<String>> map) {
        synchronized (MAP_LOCK) {
            SharedPreferences.Editor editorEdit = mSharedPreferences.edit();
            if (map == null || map.size() == 0) {
                editorEdit.remove(WEAR_ENGINE_SERVICE_ID_MAP);
                yit.e(TAG, "updateLocalCache map is null or size 0");
            } else {
                editorEdit.putString(WEAR_ENGINE_SERVICE_ID_MAP, new Gson().toJson(map));
                yit.e(TAG, "updateLocalCache size:" + map.size());
            }
            if (!editorEdit.commit()) {
                yit.c(TAG, "updateLocalCache failed");
            }
        }
    }

    private static void removeMemoryCache(Map<String, List<String>> map) {
        int size = sUUIDWearEngineDeviceIdListMap.size() - 24;
        yit.e(TAG, "removeMemoryCache need remove size:" + size);
        if (size <= 0) {
            yit.c(TAG, "removeMemoryCache needRemoveNum less than 0");
            return;
        }
        Iterator<Map.Entry<String, List<String>>> it = sUUIDWearEngineDeviceIdListMap.entrySet().iterator();
        while (it.hasNext() && size > 0) {
            Map.Entry<String, List<String>> next = it.next();
            if (!map.containsKey(next.getKey())) {
                it.remove();
                size--;
                List<String> value = next.getValue();
                if (value != null && value.size() != 0) {
                    Iterator<String> it2 = value.iterator();
                    while (it2.hasNext()) {
                        sWearEngineDeviceIdMap.remove(it2.next());
                    }
                }
            }
        }
    }

    private static void updateWearEngineIdDeviceInfo(Map<String, String> map) {
        synchronized (MAP_LOCK) {
            updateWearEngineIdDeviceInfoLocked(map);
        }
    }

    private static void updateWearEngineIdDeviceInfoLocked(Map<String, String> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = false;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!sWearEngineDeviceIdMap.containsKey(key) || !value.equals(sWearEngineDeviceIdMap.get(key))) {
                List<String> arrayList = sUUIDWearEngineDeviceIdListMap.get(value);
                if (arrayList == null) {
                    yit.e(TAG, "updateWearEngineIdDeviceInfo WearEngineDeviceId list is null");
                    arrayList = new ArrayList<>();
                    sUUIDWearEngineDeviceIdListMap.put(value, arrayList);
                }
                if (arrayList.size() >= 10) {
                    yit.e(TAG, "updateWearEngineIdDeviceInfo remove oldest WearEngineDeviceId");
                    sWearEngineDeviceIdMap.remove(arrayList.remove(0));
                }
                arrayList.add(key);
                sWearEngineDeviceIdMap.put(key, value);
                z = true;
            }
            linkedHashMap.put(value, sUUIDWearEngineDeviceIdListMap.get(value));
        }
        if (sUUIDWearEngineDeviceIdListMap.size() > 24) {
            removeMemoryCache(linkedHashMap);
        }
        if (z) {
            updateLocalCache(linkedHashMap);
        }
    }

    private static List<Device> processOutputDeviceForAssistant(List<Device> list) {
        checkLocalCacheInit();
        HashMap map = new HashMap(16);
        for (Device device : list) {
            if (device.getProductType() == 0) {
                String strM = ymk.m(getJsonFromDevice(device));
                if (TextUtils.isEmpty(strM)) {
                    yit.b(TAG, "processOutputDeviceForAssistant fullUdId is empty");
                    throw new IllegalStateException(String.valueOf(12));
                }
                String uuid = device.getUuid();
                if (TextUtils.isEmpty(uuid)) {
                    yit.b(TAG, "processOutputDeviceForAssistant uuId is empty");
                    throw new IllegalStateException(String.valueOf(12));
                }
                map.put(strM, uuid);
                device.setUuid(strM);
            }
        }
        updateWearEngineIdDeviceInfo(map);
        return list;
    }

    private static Device processInputDeviceForAssistant(Device device) {
        checkLocalCacheInit();
        String uuid = device.getUuid();
        if (TextUtils.isEmpty(uuid)) {
            yit.b(TAG, "processInputDeviceForAssistant input uuid is invalid");
            throw new IllegalStateException(String.valueOf(17));
        }
        String realUuIdFromCache = getRealUuIdFromCache(uuid);
        if (TextUtils.isEmpty(realUuIdFromCache)) {
            yit.b(TAG, "processInputDevice uuId from cache is empty");
            throw new IllegalStateException(String.valueOf(17));
        }
        device.setUuid(realUuIdFromCache);
        return device;
    }
}
