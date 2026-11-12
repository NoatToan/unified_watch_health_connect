package com.huami.ad.db;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.huami.ad.AdModule;
import com.huami.ad.entity.SportAd;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class AdKeeper {
    private static final String a = "AdKeeper";
    private static final String b = "download_list";
    private static final String c = "_sport_ad_list";
    private static SharedPreferences d;
    private static final Object e = new Object();

    public class a extends TypeToken<List<String>> {
    }

    public class b extends TypeToken<List<c>> {
    }

    public static class c {

        @SerializedName("key")
        public SportAd a;

        @SerializedName("value")
        public List<SportAd> b;

        public c(SportAd sportAd, List<SportAd> list) {
            this.a = sportAd;
            this.b = list;
        }
    }

    private static void a(String str, long j) {
        synchronized (e) {
            SharedPreferences.Editor editorEdit = d.edit();
            editorEdit.putLong(str, j);
            editorEdit.apply();
        }
    }

    public static void addDownloadList(String str) {
        List<String> downloadList = getDownloadList();
        if (downloadList.contains(str)) {
            return;
        }
        downloadList.add(str);
        b(b, new Gson().toJson(downloadList));
    }

    private static void b(String str, String str2) {
        synchronized (e) {
            SharedPreferences.Editor editorEdit = d.edit();
            editorEdit.putString(str, str2);
            editorEdit.apply();
        }
    }

    public static List<String> getDownloadList() {
        SharedPreferences sharedPreferences = d;
        List<String> list = null;
        try {
            list = (List) new Gson().fromJson(sharedPreferences != null ? sharedPreferences.getString(b, "") : null, new a().getType());
        } catch (Exception e2) {
            e2.printStackTrace();
            HMLog.d(a, "getDownloadList: " + e2, new Object[0]);
        }
        return list == null ? new ArrayList() : list;
    }

    public static Map<SportAd, List<SportAd>> getSportAdList(String str) {
        String string = d.getString(str + c, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (TextUtils.isEmpty(string)) {
            return linkedHashMap;
        }
        try {
            List<c> list = (List) new Gson().fromJson(string, new b().getType());
            if (list != null && !list.isEmpty()) {
                for (c cVar : list) {
                    linkedHashMap.put(cVar.a, cVar.b);
                }
                return linkedHashMap;
            }
            return linkedHashMap;
        } catch (JsonSyntaxException e2) {
            e2.printStackTrace();
        }
    }

    public static void init() {
        d = AdModule.appContext.getSharedPreferences(a, 0);
    }

    public static void removeDownloadList(String str) {
        List<String> downloadList = getDownloadList();
        if (downloadList.contains(str)) {
            downloadList.remove(str);
            b(b, new Gson().toJson(downloadList));
        }
    }

    public static void saveSportAdList(String str, @Nullable Map<SportAd, List<SportAd>> map) {
        String str2 = str + c;
        if (map == null || map.isEmpty()) {
            b(str2, null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<SportAd, List<SportAd>> entry : map.entrySet()) {
            arrayList.add(new c(entry.getKey(), entry.getValue()));
        }
        b(str2, new Gson().toJson(arrayList));
    }
}
