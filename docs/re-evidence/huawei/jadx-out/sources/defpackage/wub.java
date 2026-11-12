package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.common.utils.AppInfoUtils;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.h5pro.jsbridge.system.storage.StorageUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwlogsmodel.common.LogConfig;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.EzPluginManager;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class wub {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f52492b = new ArrayList<String>() { // from class: wub.4
        {
            add("e570b133-357b-4b49-b894-600a27a0e826");
            add("9684a253-0fb5-4560-8fa3-b925163f8b67");
            add("825c82bd-84fe-44a0-9884-6a764bd73183");
            add("578d0675-cece-4426-bf28-43ce31eb7b5d");
            add("54af062d-b049-4880-beda-f0cbe64e9205");
            add("9bf158ba-49b0-46aa-9fdf-ed75da1569cf");
            add("6ab08ad8-753b-4dd9-bf3a-798a0a1d81bf");
            add("e4b0b1d5-2003-4d88-8b5f-c4f64542040b");
            add("a8ba095d-4123-43c4-a30a-0240011c58de");
            add("34fa0346-d46c-439d-9cb0-2f696618846b");
            add("7a1063dd-0e0f-4a72-9939-461476ff0259");
            add("ccd1f0f8-8c57-4bd7-a884-0ef38482f15f");
            add("33123f39-7fc1-420b-9882-a4b0d6c61100");
        }
    };

    public static long c() {
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        long courseUseCacheSize = courseApi != null ? courseApi.getCourseUseCacheSize() : 0L;
        LogUtil.a("CacheUtils", "getFitnessCacheSize useCacheSize is ", Long.valueOf(courseUseCacheSize));
        return courseUseCacheSize;
    }

    public static long b(Context context) {
        Iterator<File> it = c(context).iterator();
        long jI = 0;
        while (it.hasNext()) {
            jI += FileUtils.i(it.next());
        }
        LogUtil.a("CacheUtils", "OtherCacheSize:", Long.valueOf(jI));
        return jI;
    }

    public static List<File> c(Context context) {
        ArrayList arrayList = new ArrayList();
        String strO = LogConfig.f() ? LogConfig.o() : CommonUtils.g(null);
        arrayList.add(new File(strO + BaseApplication.d()));
        arrayList.add(new File(strO + "BetaClub"));
        arrayList.add(new File(strO + "SmartWearableDFX"));
        arrayList.add(new File(strO + "SmartWearableDFXHonor"));
        arrayList.add(new File(strO + "com.huawei.health.otalog"));
        arrayList.add(new File(strO + "tracktest"));
        arrayList.add(new File(strO + "CoreSleepLog"));
        arrayList.add(AppInfoUtils.g("Log"));
        arrayList.add(BaseApplication.b().getCacheDir());
        File fileE = AppInfoUtils.e("huaweisystem");
        if (fileE != null) {
            arrayList.add(fileE);
            arrayList.add(AppInfoUtils.e("Log"));
            arrayList.add(BaseApplication.b().getExternalCacheDir());
            arrayList.add(AppInfoUtils.c("nanotraceFiles"));
        }
        return arrayList;
    }

    public static long a(Context context) {
        String str;
        if (context == null) {
            return 0L;
        }
        try {
            str = context.getFilesDir().getCanonicalPath() + File.separator + "achievemedal";
        } catch (IOException e) {
            LogUtil.e("CacheUtils", "getMedalCacheSize(),", e.getMessage());
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("CacheUtils", "getMedalCacheSize(), medalPath is null");
            return 0L;
        }
        long jI = FileUtils.i(new File(str));
        LogUtil.d("CacheUtils", "getMedalCacheSize medalSize is ", Long.valueOf(jI));
        return jI;
    }

    public static HashSet<String> h(Context context) {
        HashSet<String> hashSet = new HashSet<>(16);
        if (Utils.o() && !CommonUtil.cl()) {
            List<phz> listD = EzPluginManager.b().d();
            if (njy.e(listD)) {
                return hashSet;
            }
            for (phz phzVar : listD) {
                if (phzVar != null && !TextUtils.equals(phzVar.k(), "SMART_WATCH") && !TextUtils.equals(phzVar.k(), "SMART_BAND") && !TextUtils.equals(phzVar.k(), "SMART_HEADPHONES") && !TextUtils.isEmpty(a(phzVar.a()))) {
                    hashSet.add(a(phzVar.a()));
                }
            }
            LogUtil.a("CacheUtils", "Oversea thirdDevicePathSet = ", hashSet.toString());
            return hashSet;
        }
        Iterator<Map.Entry<String, String>> it = pip.f45447a.entrySet().iterator();
        List<phz> listC = null;
        while (it.hasNext()) {
            String key = it.next().getKey();
            if ((!Utils.o() || CommonUtil.cl()) && pip.f45449c.containsKey(key)) {
                listC = EzPluginManager.b().c(key);
            }
            if (listC != null && !listC.isEmpty()) {
                b(hashSet, listC);
            }
        }
        e(context, hashSet);
        for (String str : f52492b) {
            if (!TextUtils.isEmpty(a(str))) {
                hashSet.add(a(str));
            }
        }
        LogUtil.a("CacheUtils", "thirdDevicePathSet = ", hashSet.toString());
        return hashSet;
    }

    private static void e(Context context, HashSet<String> hashSet) {
        List<phz> listE;
        String strE = SharedPreferenceManager.e(context, String.valueOf(20010), "key_ezplugin_healthcloud_mgr");
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        for (String str : (HashSet) new Gson().fromJson(strE, new TypeToken<HashSet<String>>() { // from class: com.huawei.ui.main.stories.utils.CacheUtils$2
        }.getType())) {
            if (!TextUtils.isEmpty(str) && (listE = efz.b().e(str)) != null && !listE.isEmpty()) {
                b(hashSet, listE);
            }
        }
    }

    private static void b(HashSet<String> hashSet, List<phz> list) {
        for (phz phzVar : list) {
            if (phzVar != null && !TextUtils.isEmpty(a(phzVar.a()))) {
                hashSet.add(a(phzVar.a()));
            }
        }
    }

    public static String a(String str) {
        if (!TextUtils.isEmpty(str)) {
            String str2 = phs.d + str;
            return (!new File(str2).exists() || etn.d(str, (String) null)) ? "" : str2;
        }
        return "";
    }

    public static long a(HashSet<String> hashSet) {
        long jI = 0;
        if (hashSet != null && hashSet.size() != 0) {
            for (String str : hashSet) {
                if (!TextUtils.isEmpty(str)) {
                    jI += FileUtils.i(new File(str));
                }
            }
            LogUtil.d("CacheUtils", "getDeviceCacheSize deviceSize is ", Long.valueOf(jI));
        }
        return jI;
    }

    public static long d(Context context) {
        if (context == null || jem.i() || !LanguageUtil.l(context) || Utils.o()) {
            return 0L;
        }
        long jI = FileUtils.i(new File(jdv.f38440a));
        LogUtil.a("CacheUtils", "getSmartCoachCacheSize smartCoachCacheSize is ", Long.valueOf(jI));
        return jI;
    }

    public static long e(Context context, String str) {
        if (context == null) {
            return 0L;
        }
        return FileUtils.i(new File(context.getFilesDir() + File.separator + str + File.separator));
    }

    public static long e(Context context) {
        if (context == null) {
            LogUtil.j("CacheUtils", "getSleepMusicCachePath context is null");
            return 0L;
        }
        return FileUtils.i(new File(StorageUtil.getNativeFilePath(context, "h5hosting-drcn.dbankcdn.cn/operationmusic"))) + FileUtils.i(new File(StorageUtil.getNativeFilePath(context, "operationmusic"))) + FileUtils.i(new File(StorageUtil.getNativeFilePath(context, "com.huawei.health.h5.sleeping-music/sleeping-music")));
    }
}
