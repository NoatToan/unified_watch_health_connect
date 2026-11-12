package health.compact.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.store.SharedStoreManager;
import com.huawei.hiai.awareness.AwarenessConstants;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdataaccessmodel.sharedpreference.SharedPreferenceModel;
import com.huawei.hwdataaccessmodel.utils.StorageDataCallback;
import com.tencent.mmkv.MMKV;
import java.security.GeneralSecurityException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import ohos.ace.plugin.taskmanagerplugin.EventType;

/* JADX INFO: loaded from: classes.dex */
public class SharedPreferenceManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f36632c = String.valueOf(10000);

    private SharedPreferenceManager() {
    }

    public static int c(String str, String str2, int i) {
        MMKV mmkvB = MmkvUtil.b(str, null);
        b(str, mmkvB);
        return mmkvB.decodeInt(str2, i);
    }

    public static void d(String str, String str2, int i) {
        if (MmkvUtil.b(str, null).encode(str2, i)) {
            return;
        }
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("SharedPreferenceManager", "setInt the key ", str2, " in moduleId ", str, " save failed");
    }

    public static String b(String str, String str2, String str3) {
        MMKV mmkvB = MmkvUtil.b(str, null);
        b(str, mmkvB);
        return mmkvB.decodeString(str2, str3);
    }

    public static void c(String str, String str2, String str3) {
        if (MmkvUtil.b(str, null).encode(str2, str3)) {
            return;
        }
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("SharedPreferenceManager", "setString the key ", str2, " in moduleId ", str, " save failed");
    }

    public static float a(String str, String str2, float f) {
        MMKV mmkvB = MmkvUtil.b(str, null);
        b(str, mmkvB);
        return mmkvB.decodeFloat(str2, f);
    }

    public static void c(String str, String str2, float f) {
        if (MmkvUtil.b(str, null).encode(str2, f)) {
            return;
        }
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("SharedPreferenceManager", "the key ", str2, " in moduleId ", str, " save failed");
    }

    public static boolean b(String str, String str2, boolean z) {
        MMKV mmkvB = MmkvUtil.b(str, null);
        b(str, mmkvB);
        return mmkvB.decodeBool(str2, z);
    }

    public static void a(String str, String str2, boolean z) {
        if (MmkvUtil.b(str, null).encode(str2, z)) {
            return;
        }
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("SharedPreferenceManager", "the key ", str2, " in moduleId ", str, " save failed");
    }

    public static long d(String str, String str2, long j) {
        MMKV mmkvB = MmkvUtil.b(str, null);
        b(str, mmkvB);
        return mmkvB.decodeLong(str2, j);
    }

    public static void c(String str, String str2, long j) {
        if (MmkvUtil.b(str, null).encode(str2, j)) {
            return;
        }
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("SharedPreferenceManager", "the key ", str2, " in moduleId ", str, " save failed");
    }

    public static int e(Context context, String str, String str2, String str3, StorageParams storageParams) {
        SharedPreferenceModel sharedPreferenceModel;
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "setSharedPreference context is null");
            return AwarenessConstants.ERROR_UNKNOWN_CODE;
        }
        String str4 = f36632c;
        if (str4.equals(str) && !EnvironmentUtils.d()) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e("SharedPreferenceManager", "setSharedPreference UI_ID_HOME error. key=", str2, ", processName=", EnvironmentUtils.c());
        }
        if (str4.equals(str) && "functionSetCardConfig".equals(str2) && TextUtils.isEmpty(str3)) {
            h(str2, str3);
            return AwarenessConstants.ERROR_UNKNOWN_CODE;
        }
        try {
            MMKV mmkvB = MmkvUtil.b(str, null);
            String string = mmkvB.getString(str2, "");
            if (TextUtils.isEmpty(string)) {
                sharedPreferenceModel = new SharedPreferenceModel();
                c(str3, storageParams, sharedPreferenceModel);
            } else {
                try {
                    SharedPreferenceModel sharedPreferenceModel2 = (SharedPreferenceModel) new Gson().fromJson(string, SharedPreferenceModel.class);
                    if (sharedPreferenceModel2 == null) {
                        return 201000;
                    }
                    if (storageParams == null && sharedPreferenceModel2.getEncryptType() != 0) {
                        return AwarenessConstants.ERROR_UNKNOWN_CODE;
                    }
                    if (storageParams != null && storageParams.a() != sharedPreferenceModel2.getEncryptType()) {
                        return AwarenessConstants.ERROR_UNKNOWN_CODE;
                    }
                    a(str3, sharedPreferenceModel2);
                    sharedPreferenceModel = sharedPreferenceModel2;
                } catch (JsonSyntaxException unused) {
                    com.huawei.hwlogsmodel.LogUtil.e("SharedPreferenceManager", "setSharedPreference JsonSyntaxException, ", "key = ", str2, " content = ", string);
                    mmkvB.remove(str2);
                    sharedPreferenceModel = new SharedPreferenceModel();
                    c(str3, storageParams, sharedPreferenceModel);
                }
            }
            mmkvB.putString(str2, new Gson().toJson(sharedPreferenceModel));
            return 0;
        } catch (GeneralSecurityException unused2) {
            com.huawei.hwlogsmodel.LogUtil.e("SharedPreferenceManager", "setSharedPreference GeneralSecurityException");
            return 201000;
        } catch (Exception e) {
            com.huawei.hwlogsmodel.LogUtil.e("SharedPreferenceManager", "setSharedPreference Exception: ", ExceptionUtils.c(e));
            return 201000;
        }
    }

    @Deprecated
    public static void b(String str, String str2, String str3, StorageParams storageParams, StorageDataCallback storageDataCallback) {
        if (BaseApplication.getContext() == null) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "setSharedPreference context is null");
            return;
        }
        try {
            MMKV mmkvB = MmkvUtil.b(str, null);
            String string = mmkvB.getString(str2, "");
            SharedPreferenceModel sharedPreferenceModel = new SharedPreferenceModel();
            if (TextUtils.isEmpty(string)) {
                c(str3, storageParams, sharedPreferenceModel);
            } else {
                try {
                    sharedPreferenceModel = (SharedPreferenceModel) new Gson().fromJson(string, SharedPreferenceModel.class);
                    d(sharedPreferenceModel, storageParams, str2, storageDataCallback, str3);
                } catch (JsonSyntaxException unused) {
                    com.huawei.hwlogsmodel.LogUtil.e("SharedPreferenceManager", "setSharedPreference JsonSyntaxException, key = ", str2, " content = ", string);
                    mmkvB.remove(str2);
                    sharedPreferenceModel = new SharedPreferenceModel();
                    c(str3, storageParams, sharedPreferenceModel);
                }
            }
            mmkvB.putString(str2, new Gson().toJson(sharedPreferenceModel));
            c(0, storageDataCallback);
        } catch (GeneralSecurityException e) {
            c(201000, storageDataCallback);
            com.huawei.hwlogsmodel.LogUtil.e("SharedPreferenceManager", "setSharedPreference exception ", e.toString());
        } catch (Exception unused2) {
            com.huawei.hwlogsmodel.LogUtil.e("SharedPreferenceManager", "setSharedPreference Exception");
            c(201000, storageDataCallback);
        }
    }

    private static void c(String str, StorageParams storageParams, SharedPreferenceModel sharedPreferenceModel) throws GeneralSecurityException {
        if (storageParams != null && storageParams.a() != 0) {
            sharedPreferenceModel.setValue(HwEncryptUtil.b(BaseApplication.getContext()).e(storageParams.a(), str));
            sharedPreferenceModel.setEncryptType(storageParams.a());
        } else {
            sharedPreferenceModel.setValue(str);
            sharedPreferenceModel.setEncryptType(0);
        }
    }

    private static void h(String str, String str2) {
        if (CommonUtil.ap()) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "setSharedPreference UI_ID_HOME error. key=", str, " value=", str2, "StackTrace=", Arrays.toString(Thread.currentThread().getStackTrace()));
        }
        health.compact.a.hwlogsmodel.ReleaseLogUtil.e("SharedPreferenceManager", "setSharedPreference UI_ID_HOME error. key=", str, " value=", str2);
    }

    private static void a(String str, SharedPreferenceModel sharedPreferenceModel) throws GeneralSecurityException {
        if (sharedPreferenceModel.getEncryptType() == 0) {
            sharedPreferenceModel.setValue(str);
        } else {
            sharedPreferenceModel.setValue(HwEncryptUtil.b(BaseApplication.getContext()).e(sharedPreferenceModel.getEncryptType(), str));
            com.huawei.hwlogsmodel.LogUtil.a("SharedPreferenceManager", "setSharedPreference need to encrypt");
        }
    }

    private static void d(SharedPreferenceModel sharedPreferenceModel, StorageParams storageParams, String str, StorageDataCallback storageDataCallback, String str2) {
        Context context = BaseApplication.getContext();
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "setSharedPreferenceImpl context is null");
            return;
        }
        if (sharedPreferenceModel == null) {
            c(201000, storageDataCallback);
            return;
        }
        if (storageParams == null && sharedPreferenceModel.getEncryptType() != 0 && !"server_token".equals(str) && !"lite_access_token".equals(str)) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "setSharedPreferenceImpl not same");
            c(AwarenessConstants.ERROR_UNKNOWN_CODE, storageDataCallback);
            return;
        }
        if (storageParams != null && storageParams.a() != sharedPreferenceModel.getEncryptType()) {
            c(AwarenessConstants.ERROR_UNKNOWN_CODE, storageDataCallback);
            return;
        }
        if (storageParams == null) {
            sharedPreferenceModel.setValue(str2);
            return;
        }
        try {
            sharedPreferenceModel.setValue(HwEncryptUtil.b(context).e(sharedPreferenceModel.getEncryptType(), str2));
        } catch (GeneralSecurityException e) {
            c(201000, storageDataCallback);
            com.huawei.hwlogsmodel.LogUtil.e("SharedPreferenceManager", "setSharedPreferenceImpl exception ", e.toString());
        }
    }

    private static void c(int i, StorageDataCallback storageDataCallback) {
        StorageResult storageResult = new StorageResult();
        storageResult.e(i);
        c(storageDataCallback, storageResult);
    }

    public static Set<String> a(Context context, String str) {
        HashSet hashSet = new HashSet();
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "getAllKeysById context is null");
            return hashSet;
        }
        MMKV mmkvB = MmkvUtil.b(str, null);
        b(str, mmkvB);
        String[] strArrAllKeys = mmkvB.allKeys();
        if (strArrAllKeys != null) {
            for (int i = 0; i < strArrAllKeys.length; i++) {
                if (!strArrAllKeys[i].equals("have_moved")) {
                    hashSet.add(strArrAllKeys[i]);
                }
            }
        }
        return hashSet;
    }

    public static boolean e(String str, String str2) {
        MMKV mmkvB = MmkvUtil.b(str, null);
        b(str, mmkvB);
        return mmkvB.containsKey(str2);
    }

    public static String e(Context context, String str, String str2) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "getSharedPreference context is null");
            return null;
        }
        try {
            MMKV mmkvB = MmkvUtil.b(str, null);
            SharedPreferenceModel sharedPreferenceModel = (SharedPreferenceModel) new Gson().fromJson(mmkvB.getString(str2, ""), SharedPreferenceModel.class);
            if (sharedPreferenceModel == null) {
                b(str, mmkvB);
                sharedPreferenceModel = (SharedPreferenceModel) new Gson().fromJson(mmkvB.getString(str2, ""), SharedPreferenceModel.class);
            }
            if (sharedPreferenceModel == null) {
                return "";
            }
            if (sharedPreferenceModel.getEncryptType() == 0) {
                return sharedPreferenceModel.getValue();
            }
            return HwEncryptUtil.b(BaseApplication.getContext()).c(sharedPreferenceModel.getEncryptType(), sharedPreferenceModel.getValue());
        } catch (JsonSyntaxException e) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "getSharedPreference, storageKey = ", str2, ", value = ", MmkvUtil.b(str, null).getString(str2, ""), ", JsonSyntaxException e = ", e);
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("SharedPreferenceManager", "getSharedPreference parse json error, key:", str2);
            return null;
        } catch (IllegalArgumentException | GeneralSecurityException unused) {
            com.huawei.hwlogsmodel.LogUtil.e("SharedPreferenceManager", "getSharedPreference GeneralSecurityException | IllegalArgumentException");
            return null;
        } catch (Exception unused2) {
            com.huawei.hwlogsmodel.LogUtil.e("SharedPreferenceManager", "getSharedPreference Exception");
            return null;
        }
    }

    public static Map<String, String> e(Context context, String str) {
        SharedPreferenceModel sharedPreferenceModel;
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "getAllSharedPreferencesById context is null");
            return null;
        }
        try {
            MMKV mmkvB = MmkvUtil.b(str, null);
            b(str, mmkvB);
            HashMap map = new HashMap();
            String[] strArrAllKeys = mmkvB.allKeys();
            if (strArrAllKeys != null) {
                for (String str2 : strArrAllKeys) {
                    if (!str2.equals("have_moved") && (sharedPreferenceModel = (SharedPreferenceModel) new Gson().fromJson(mmkvB.getString(str2, ""), SharedPreferenceModel.class)) != null) {
                        if (sharedPreferenceModel.getEncryptType() != 0) {
                            com.huawei.hwlogsmodel.LogUtil.a("SharedPreferenceManager", "getAllSharedPreferencesById need to encrypt");
                            map.put(str2, HwEncryptUtil.b(BaseApplication.getContext()).c(sharedPreferenceModel.getEncryptType(), sharedPreferenceModel.getValue()));
                        } else {
                            map.put(str2, sharedPreferenceModel.getValue());
                        }
                    }
                }
            }
            return map;
        } catch (Exception unused) {
            com.huawei.hwlogsmodel.LogUtil.e("SharedPreferenceManager", "getAllSharedPreferencesById exception");
            return null;
        }
    }

    private static void b(String str, MMKV mmkv) {
        if (mmkv.getString("have_moved", "").equals("done")) {
            return;
        }
        mmkv.putString("have_moved", "done");
        if (SharedStoreManager.b(str)) {
            com.huawei.hwlogsmodel.LogUtil.d("SharedPreferenceManager", "Enter moveDataToMMKV, moduleId = ", str);
            Map<String, ?> all = BaseApplication.getContext().getSharedPreferences(str, 0).getAll();
            if (all != null && all.size() > 0) {
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (key != null && value != null && !mmkv.contains(key)) {
                        if (value instanceof String) {
                            mmkv.encode(key, (String) value);
                        } else if (value instanceof Boolean) {
                            mmkv.encode(key, ((Boolean) value).booleanValue());
                        } else if (value instanceof Long) {
                            mmkv.encode(key, ((Long) value).longValue());
                        } else if (value instanceof Integer) {
                            mmkv.encode(key, ((Integer) value).intValue());
                        } else if (value instanceof Float) {
                            mmkv.encode(key, ((Float) value).floatValue());
                        } else if (value instanceof Set) {
                            mmkv.encode(key, (Set<String>) value);
                        } else {
                            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "Unknown Type, key = ", key, " value = ", value.toString());
                        }
                    }
                }
                com.huawei.hwlogsmodel.LogUtil.a("SharedPreferenceManager", "After traverse data");
            }
            com.huawei.hwlogsmodel.LogUtil.d("SharedPreferenceManager", "Leave moveDataToMMKV, moduleId = ", str);
        }
    }

    public static int b(Context context, String str, String str2) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "deleteSharedPreference context is null");
            return AwarenessConstants.ERROR_UNKNOWN_CODE;
        }
        MMKV mmkvB = MmkvUtil.b(str, null);
        b(str, mmkvB);
        mmkvB.putString(str2, "");
        return 0;
    }

    public static int i(Context context, String str) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "resetSharedPreference context is null");
            return AwarenessConstants.ERROR_UNKNOWN_CODE;
        }
        context.getSharedPreferences(str, 0).edit().clear().commit();
        MmkvUtil.b(str, null).clear();
        return 0;
    }

    public static boolean b(String str, String str2) {
        MMKV mmkvB = MmkvUtil.b(str, null);
        b(str, mmkvB);
        mmkvB.remove(str2);
        boolean zContainsKey = mmkvB.containsKey(str2);
        if (zContainsKey) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.d("SharedPreferenceManager", "deleteKey this key ", str2, EventType.FAILED);
        }
        return !zContainsKey;
    }

    public static void d(String str, String[] strArr) {
        MMKV mmkvB = MmkvUtil.b(str, null);
        b(str, mmkvB);
        mmkvB.removeValuesForKeys(strArr);
    }

    private static void c(StorageDataCallback storageDataCallback, StorageResult storageResult) {
        if (storageDataCallback != null) {
            storageDataCallback.onProcessed(storageResult);
        }
    }

    public static String g(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "getWearBtName context is null");
            return "";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("goal_steps_perference", 0);
        return sharedPreferences != null ? sharedPreferences.getString("watch_bt_info", "") : "";
    }

    public static String f(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "getWearFaceUrl context is null");
            return "";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("goal_steps_perference", 0);
        String string = sharedPreferences != null ? sharedPreferences.getString("watch_face_url", "") : "";
        com.huawei.hwlogsmodel.LogUtil.a("SharedPreferenceManager", " getWearFaceUrl=", string);
        return string;
    }

    public static boolean j(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "isSaveUpDataWatchFaceUrlData context is null");
            return false;
        }
        String str = new SimpleDateFormat("yyyyMMdd").format(new Date());
        com.huawei.hwlogsmodel.LogUtil.a("SharedPreferenceManager", "isSaveUpDataWatchFaceUrlData currentData=", str);
        SharedPreferences sharedPreferences = context.getSharedPreferences("goal_steps_perference", 0);
        String string = "";
        if (sharedPreferences != null) {
            string = sharedPreferences.getString("watch_face_updata_data", "");
            com.huawei.hwlogsmodel.LogUtil.a("SharedPreferenceManager", "isSaveUpDataWatchFaceUrlData date=", string);
        }
        return str.equals(string);
    }

    public static void d(Context context, long j, String str) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "setUploadLogTime context is null");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("goal_steps_perference", 0).edit();
        if (editorEdit != null) {
            editorEdit.putLong(str, j);
            editorEdit.commit();
        }
    }

    public static long b(Context context, String str) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "getUploadLogTime context is null");
            return 0L;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("goal_steps_perference", 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getLong(str, 0L);
        }
        return 0L;
    }

    public static void f(Context context, String str) {
        SharedPreferences.Editor editorEdit;
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "setQuestionNumber context is null");
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("goal_steps_perference", 0);
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
            return;
        }
        editorEdit.putString("BETA_CLUB_QUESTION_NUMBER", str);
        editorEdit.commit();
    }

    public static String e(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "getQuestionNumber context is null");
            return "";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("goal_steps_perference", 0);
        return sharedPreferences != null ? sharedPreferences.getString("BETA_CLUB_QUESTION_NUMBER", "") : "";
    }

    public static void a(Context context, String str, String str2) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "setUploadResult context is null");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("goal_steps_perference", 0).edit();
        if (editorEdit != null) {
            editorEdit.putString(str2, str);
            editorEdit.commit();
        }
    }

    public static String d(Context context, String str) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "getUploadResult context is null");
            return "";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("goal_steps_perference", 0);
        if (sharedPreferences == null) {
            return "";
        }
        return sharedPreferences.getString(str, "");
    }

    public static void c(Context context, int i) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "setUploadSize context is null");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("goal_steps_perference", 0).edit();
        if (editorEdit != null) {
            editorEdit.putInt("update_log_size", i);
            editorEdit.commit();
        }
    }

    public static int a(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "getUploadSize context is null");
            return 0;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("goal_steps_perference", 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getInt("update_log_size", 0);
        }
        return 0;
    }

    public static boolean h(Context context, String str) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "judgeCurrentLanguage context is null");
            return false;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("goal_steps_perference", 0);
        String string = sharedPreferences != null ? sharedPreferences.getString("save_devices_current_language", "") : "";
        com.huawei.hwlogsmodel.LogUtil.a("SharedPreferenceManager", "judgeCurrentLanguage Last language:", string, "current language:", str);
        return string.equals(str);
    }

    public static void b(Context context, boolean z) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "setWatchFacePrivacyIsAgree context is null");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("goal_steps_perference", 0).edit();
        if (editorEdit != null) {
            editorEdit.putBoolean("watch_face_privacy_is_agree", z);
            editorEdit.commit();
        }
    }

    public static void c(Context context, boolean z) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "setCurrentUserIsAppMarketState context is null");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("APP_MARKET", 0).edit();
        if (editorEdit != null) {
            editorEdit.putBoolean("SHOW_APP_MARKET_SERVICE_AGREE", z);
            editorEdit.commit();
        }
    }

    public static boolean d(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "getAppMarketPrivacyIsAgree context is null");
            return false;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("APP_MARKET", 0);
        boolean z = sharedPreferences != null ? sharedPreferences.getBoolean("SHOW_APP_MARKET_SERVICE_AGREE", false) : false;
        com.huawei.hwlogsmodel.LogUtil.a("SharedPreferenceManager", "getAppMarketPrivacyIsAgree :", Boolean.valueOf(z));
        return z;
    }

    public static boolean c(Context context, String str) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "getPrivacyIsAgree context is null");
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            str = "HONOR_NOT_CLOUD_USE_ID_KEY";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("goal_steps_perference", 0);
        boolean z = sharedPreferences != null ? sharedPreferences.getBoolean(str, false) : false;
        com.huawei.hwlogsmodel.LogUtil.a("SharedPreferenceManager", " getPrivacyIsAgree = ", Boolean.valueOf(z));
        return z;
    }

    public static void b(Context context, String str, boolean z) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "setPrivacyIsAgree context is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "HONOR_NOT_CLOUD_USE_ID_KEY";
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("goal_steps_perference", 0).edit();
        if (editorEdit != null) {
            editorEdit.putBoolean(str, z);
            editorEdit.commit();
        }
    }

    public static int b(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "getHonorDeviceCount context is null");
            return 0;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("goal_steps_perference", 0);
        int i = sharedPreferences != null ? sharedPreferences.getInt("HONOR_WEAR_DEVICE_COUNT", 0) : 0;
        com.huawei.hwlogsmodel.LogUtil.a("SharedPreferenceManager", " getHonorDeviceCount = ", Integer.valueOf(i));
        return i;
    }

    public static void b(Context context, int i) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "setHonorDeviceCount context is null");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("goal_steps_perference", 0).edit();
        if (editorEdit != null) {
            editorEdit.putInt("HONOR_WEAR_DEVICE_COUNT", i);
            editorEdit.commit();
        }
    }

    public static void a(Context context, boolean z) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "setAuthForClone context is null");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("health_clone_preference", 0).edit();
        if (editorEdit != null) {
            editorEdit.putString("key_wether_to_auth", String.valueOf(z));
            editorEdit.commit();
        }
    }

    public static void e(Context context, boolean z) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "setHasSleepData context is null");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("goal_steps_perference", 0).edit();
        if (editorEdit != null) {
            editorEdit.putBoolean("HAS_SLEEP_DATA", z);
            editorEdit.apply();
        }
    }

    public static boolean c(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "getHasSleepData context is null");
            return false;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("goal_steps_perference", 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean("HAS_SLEEP_DATA", false);
        }
        return false;
    }

    public static boolean j(Context context, String str) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "isThirdKitAuth context is null");
            return true;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("THIRD_KIT_AUTH", 4);
        if (sharedPreferences == null) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "isThirdKitAuth preferences is null");
            return true;
        }
        return sharedPreferences.getBoolean(str, true);
    }

    public static boolean g(Context context, String str) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("SharedPreferenceManager", "isUseNewPkgNameInBetaEnviroment context is null");
            return false;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("USE_IN_BETA_ENVIROMENT", 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean(str, false);
        }
        return false;
    }

    @Deprecated
    public static void e(String str, String str2, boolean z) {
        SharedPreferences.Editor editorEdit = BaseApplication.getContext().getSharedPreferences(str, 0).edit();
        if (editorEdit != null) {
            editorEdit.putBoolean(str2, z);
            editorEdit.commit();
        }
    }

    @Deprecated
    public static boolean a(String str, String str2) {
        SharedPreferences sharedPreferences = BaseApplication.getContext().getSharedPreferences(str, 0);
        boolean z = sharedPreferences != null ? sharedPreferences.getBoolean(str2, false) : false;
        com.huawei.hwlogsmodel.LogUtil.a("SharedPreferenceManager", " getBooleanSharedPreference moduleId = ", str, Boolean.valueOf(z));
        return z;
    }

    public static String e(String str) {
        SharedPreferences sharedPreferences = BaseApplication.getContext().getSharedPreferences("my_watch_face", 0);
        if (sharedPreferences == null) {
            return "";
        }
        String string = sharedPreferences.getString(str, "");
        com.huawei.hwlogsmodel.LogUtil.a("SharedPreferenceManager", "getMyWatchFaceJson, storageKey: ", str, " json: ", string);
        return string;
    }

    public static void c(String str, String str2) {
        SharedPreferences.Editor editorEdit = BaseApplication.getContext().getSharedPreferences("my_watch_face", 0).edit();
        if (editorEdit != null) {
            editorEdit.putString(str, str2);
            editorEdit.apply();
        }
    }

    public static void a(String str, String str2, String str3) {
        SharedPreferences.Editor editorEdit = BaseApplication.getContext().getSharedPreferences(str, 0).edit();
        if (editorEdit != null) {
            editorEdit.putString(str2, str3);
            editorEdit.apply();
        }
    }

    public static String d(String str, String str2) {
        SharedPreferences sharedPreferences = BaseApplication.getContext().getSharedPreferences(str, 0);
        if (sharedPreferences == null) {
            return "";
        }
        return sharedPreferences.getString(str2, "");
    }
}
