package com.huawei.ui.main.stories.history.model;

import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import defpackage.vqx;
import defpackage.vre;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class SearchSportThreadManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f28342c = new Object();
    private static volatile SearchSportThreadManager e;
    private SearchCallback d;

    public interface SearchCallback {
        void onSearchResult(List<vre> list);
    }

    private SearchSportThreadManager() {
    }

    public static SearchSportThreadManager a() {
        if (e == null) {
            synchronized (f28342c) {
                if (e == null) {
                    e = new SearchSportThreadManager();
                }
            }
        }
        return e;
    }

    public void a(SearchCallback searchCallback) {
        this.d = searchCallback;
    }

    public void e(final String str, final List<vre> list) {
        LogUtil.a("R_SearchSportThreadManager", "start updateSearchLocalSport");
        ThreadPoolManager.c().a("searchSportType", new Runnable() { // from class: com.huawei.ui.main.stories.history.model.SearchSportThreadManager.3
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("R_SearchSportThreadManager", "start thread do search");
                List list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    SearchSportThreadManager.this.b(str, list);
                } else {
                    LogUtil.d("R_SearchSportThreadManager", "Search original list is empty");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, List<vre> list) {
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        for (vre vreVar : list) {
            if (d(vqx.e(vreVar), str)) {
                arrayList.add(vreVar);
            } else {
                arrayList2.add(vreVar);
            }
        }
        e(arrayList2, arrayList, str);
        SearchCallback searchCallback = this.d;
        if (searchCallback != null) {
            searchCallback.onSearchResult(arrayList);
        }
    }

    private void e(List<vre> list, List<vre> list2, String str) {
        for (vre vreVar : list) {
            if (a(vqx.e(vreVar), str)) {
                list2.add(vreVar);
            }
        }
    }

    private boolean d(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return str.toLowerCase(Locale.ENGLISH).contains(str2.toLowerCase(Locale.ENGLISH));
    }

    private boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.d("R_SearchSportThreadManager", "sportText or searchKey is empty");
            return false;
        }
        String strReplaceAll = str2.toLowerCase(Locale.ENGLISH).replaceAll("\\s*", "");
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        int length = lowerCase.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (length < i2) {
                break;
            }
            String strSubstring = lowerCase.substring(i, i2);
            if (!TextUtils.isEmpty(strSubstring) && strReplaceAll.contains(strSubstring)) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    public void e() {
        ThreadPoolManager.c().d("searchSportType", (Runnable) null);
        this.d = null;
    }

    public void c() {
        b();
    }

    private static void b() {
        synchronized (f28342c) {
            e = null;
        }
    }
}
