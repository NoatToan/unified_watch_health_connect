package com.huawei.haf.language;

import android.text.TextUtils;
import androidx.media3.datasource.cache.CacheDataSink;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.os.FileUtils;
import health.compact.a.LogUtil;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class LanguageInfoHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<String> f5964a = new HashSet();

    private LanguageInfoHelper() {
    }

    static void b(Map<String, String> map, Set<String> set) {
        if (a(map, set)) {
            LogUtil.b("HAF_LanguageInfo", "initLanguageInfo size=", Integer.valueOf(map.size()), ", preset=", Integer.valueOf(set.size()), ", second=", Integer.valueOf(f5964a.size()));
            if (!map.isEmpty() && !set.isEmpty()) {
                return;
            }
        }
        map.clear();
        set.clear();
        f5964a.clear();
        LogUtil.d("HAF_LanguageInfo", "initLanguageInfo fail, the default language configuration will be used. please check.");
        e(map, set);
    }

    static boolean d(String str) {
        return f5964a.contains(str);
    }

    private static JSONObject d() throws JSONException, IOException {
        InputStream inputStreamOpen = BaseApplication.b().getAssets().open("language_plugins/dynamic_language_config.json");
        if (inputStreamOpen == null) {
            throw new IOException("not language info in assets.");
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject(FileUtils.e(inputStreamOpen, CacheDataSink.DEFAULT_FRAGMENT_SIZE));
            LogUtil.b("HAF_LanguageInfo", "read language info from assets, times=", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            return jSONObject;
        } finally {
            FileUtils.a(inputStreamOpen);
        }
    }

    private static boolean a(Map<String, String> map, Set<String> set) {
        try {
            JSONArray jSONArray = d().getJSONArray("all_lang");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("name");
                String string2 = jSONObject.getString("uuid");
                String strOptString = jSONObject.optString("flag");
                if (!"unused".equals(strOptString)) {
                    map.put(string, string2);
                    if (!TextUtils.isEmpty(strOptString)) {
                        if ("preset".equals(strOptString)) {
                            set.add(string2);
                        } else if ("second".equals(strOptString)) {
                            f5964a.add(string2);
                        }
                    }
                }
            }
            return true;
        } catch (IOException | JSONException e) {
            LogUtil.e("HAF_LanguageInfo", "parseLanguageInfo ex=", LogUtil.c(e));
            return false;
        }
    }

    private static void e(Map<String, String> map, Set<String> set) {
        map.put("en", "e7edf7db-00a5-4e3a-9cff-032a854e29ef");
        set.add("e7edf7db-00a5-4e3a-9cff-032a854e29ef");
    }
}
