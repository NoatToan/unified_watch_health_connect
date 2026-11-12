package com.huawei.ui.device.utlis;

import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import defpackage.coq;
import defpackage.rba;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class SearchDeviceThreadManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile SearchDeviceThreadManager f24957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f24958b = new Object();
    private SearchCallback d;

    /* JADX INFO: loaded from: classes3.dex */
    public interface SearchCallback {
        void onSearchResult(List<rba> list);
    }

    private SearchDeviceThreadManager() {
    }

    public static SearchDeviceThreadManager b() {
        SearchDeviceThreadManager searchDeviceThreadManager;
        synchronized (f24958b) {
            if (f24957a == null) {
                f24957a = new SearchDeviceThreadManager();
            }
            searchDeviceThreadManager = f24957a;
        }
        return searchDeviceThreadManager;
    }

    public void e(SearchCallback searchCallback) {
        this.d = searchCallback;
    }

    public void d(final String str, final List<rba> list) {
        LogUtil.a("SearchDeviceThreadManager", "start updateSearchLocalDevice");
        ThreadPoolManager.c().a("searchDevice", new Runnable() { // from class: com.huawei.ui.device.utlis.SearchDeviceThreadManager.3
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("SearchDeviceThreadManager", "start thread do search");
                List list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    SearchDeviceThreadManager.this.e(str, (List<rba>) list);
                } else {
                    LogUtil.d("SearchDeviceThreadManager", "Search original list is empty");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, List<rba> list) {
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        for (rba rbaVar : list) {
            if (1 != rbaVar.t() && 2 != rbaVar.t() && 5 != rbaVar.t()) {
                String strG = rbaVar.g();
                String strE = rbaVar.e();
                boolean zE = e(strG, str);
                boolean zE2 = e(strE, str);
                if (zE || zE2) {
                    rbaVar.j(4);
                    arrayList.add(rbaVar);
                } else {
                    List<String> listB = rbaVar.b();
                    if (coq.d(listB)) {
                        arrayList2.add(rbaVar);
                    } else {
                        Iterator<String> it = listB.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (e(it.next(), str)) {
                                    rbaVar.j(4);
                                    arrayList.add(rbaVar);
                                    break;
                                }
                            } else {
                                arrayList2.add(rbaVar);
                                break;
                            }
                        }
                    }
                }
            }
        }
        c(arrayList2, arrayList, str);
        SearchCallback searchCallback = this.d;
        if (searchCallback != null) {
            searchCallback.onSearchResult(arrayList);
        }
    }

    private void c(List<rba> list, List<rba> list2, String str) {
        for (rba rbaVar : list) {
            String strG = rbaVar.g();
            String strE = rbaVar.e();
            boolean zA = a(strG, str);
            boolean zA2 = a(strE, str);
            if (zA || zA2) {
                rbaVar.j(4);
                list2.add(rbaVar);
            } else {
                List<String> listB = rbaVar.b();
                if (!coq.d(listB)) {
                    Iterator<String> it = listB.iterator();
                    while (it.hasNext()) {
                        if (e(it.next(), str)) {
                            rbaVar.j(4);
                            list2.add(rbaVar);
                            break;
                        }
                    }
                }
            }
        }
    }

    private boolean e(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return str.toLowerCase(Locale.ENGLISH).contains(str2.toLowerCase(Locale.ENGLISH));
    }

    private boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.d("SearchDeviceThreadManager", "deviceText or searchKey is empty");
            return false;
        }
        String strReplaceAll = str2.toLowerCase(Locale.ENGLISH).replaceAll("\\s*", "");
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        int length = lowerCase.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (i2 > length) {
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

    public void d() {
        ThreadPoolManager.c().d("searchDevice", (Runnable) null);
        this.d = null;
    }

    public void a() {
        c();
    }

    private static void c() {
        synchronized (f24958b) {
            f24957a = null;
        }
    }
}
