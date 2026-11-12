package com.huawei.health.h5pro.jsbridge.system.eventhub;

import android.text.TextUtils;
import android.util.Pair;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProAppInfo;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class H5ProEventHubManager {
    private static H5ProEventHubInterceptor e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f6798a = new Object();
    private static final Object d = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ConcurrentHashMap<String, List<Pair<Boolean, H5ProEventHubObserver>>> f6799c = new ConcurrentHashMap<>();

    private H5ProEventHubManager() {
    }

    private static void a(String str, List<Pair<Boolean, H5ProEventHubObserver>> list) {
        synchronized (f6798a) {
            ConcurrentHashMap<String, List<Pair<Boolean, H5ProEventHubObserver>>> concurrentHashMap = f6799c;
            List<Pair<Boolean, H5ProEventHubObserver>> list2 = concurrentHashMap.get(str);
            if (list2 == null) {
                return;
            }
            if (list2.isEmpty()) {
                concurrentHashMap.remove(str);
                return;
            }
            Iterator<Pair<Boolean, H5ProEventHubObserver>> it = list2.iterator();
            while (it.hasNext()) {
                Pair<Boolean, H5ProEventHubObserver> next = it.next();
                list.add(next);
                if (((Boolean) next.first).booleanValue()) {
                    it.remove();
                }
            }
            if (list2.isEmpty()) {
                f6799c.remove(str);
            }
        }
    }

    public static void addObserver(String str, H5ProEventHubObserver h5ProEventHubObserver) {
        d(str, false, h5ProEventHubObserver);
    }

    public static void addOnceObserver(String str, H5ProEventHubObserver h5ProEventHubObserver) {
        d(str, true, h5ProEventHubObserver);
    }

    public static void removeAllObserver() {
        synchronized (f6798a) {
            f6799c.clear();
        }
    }

    public static void removeObserver(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.w("H5PRO_H5ProEventHubManager", "removeObserver: eventName is empty");
            return;
        }
        synchronized (f6798a) {
            f6799c.remove(str);
        }
    }

    public static void setEventHubInterceptor(H5ProEventHubInterceptor h5ProEventHubInterceptor) {
        synchronized (d) {
            e = h5ProEventHubInterceptor;
        }
    }

    public static Pair<Boolean, String> trigger(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.w("H5PRO_H5ProEventHubManager", "trigger: eventName is empty");
            return new Pair<>(Boolean.FALSE, "eventName is empty");
        }
        ArrayList arrayList = new ArrayList(1);
        a(str, arrayList);
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    ((H5ProEventHubObserver) ((Pair) it.next()).second).onEventChanged(str2);
                } catch (Exception e2) {
                    LogUtil.e("H5PRO_H5ProEventHubManager", "trigger: exception -> ", e2);
                }
            }
            return new Pair<>(Boolean.TRUE, "");
        }
        LogUtil.w("H5PRO_H5ProEventHubManager", "trigger: Observer without " + str + " added");
        return new Pair<>(Boolean.FALSE, "Observer without " + str + " added");
    }

    private static void d(String str, boolean z, H5ProEventHubObserver h5ProEventHubObserver) {
        if (TextUtils.isEmpty(str) || h5ProEventHubObserver == null) {
            LogUtil.e("H5PRO_H5ProEventHubManager", "addObserver: eventName is empty or observer is null");
            return;
        }
        synchronized (f6798a) {
            ConcurrentHashMap<String, List<Pair<Boolean, H5ProEventHubObserver>>> concurrentHashMap = f6799c;
            List<Pair<Boolean, H5ProEventHubObserver>> list = concurrentHashMap.get(str);
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Pair(Boolean.valueOf(z), h5ProEventHubObserver));
                concurrentHashMap.put(str, arrayList);
            } else {
                Iterator<Pair<Boolean, H5ProEventHubObserver>> it = list.iterator();
                while (it.hasNext()) {
                    if (((H5ProEventHubObserver) it.next().second).hashCode() == h5ProEventHubObserver.hashCode()) {
                        it.remove();
                    }
                }
                list.add(new Pair<>(Boolean.valueOf(z), h5ProEventHubObserver));
            }
        }
    }

    public static boolean isAllowedUseApi(H5ProInstance h5ProInstance) {
        if (h5ProInstance == null) {
            LogUtil.w("H5PRO_H5ProEventHubManager", "isAllowUseApi: h5ProInstance is null");
            return false;
        }
        synchronized (d) {
            H5ProAppInfo appInfo = h5ProInstance.getAppInfo();
            if (appInfo == null) {
                LogUtil.w("H5PRO_H5ProEventHubManager", "isAllowUseApi: h5ProAppInfo is null");
                return false;
            }
            String url = h5ProInstance.getUrl();
            H5ProEventHubInterceptor h5ProEventHubInterceptor = e;
            if (h5ProEventHubInterceptor == null || h5ProEventHubInterceptor.isAllowedUseApi(appInfo, h5ProInstance.getUrl())) {
                return true;
            }
            LogUtil.w("H5PRO_H5ProEventHubManager", "isAllowUseApi: API usage is not allowed -> " + appInfo.getPkgName() + "/" + url);
            return false;
        }
    }

    public static void removeObserver(String str, H5ProEventHubObserver h5ProEventHubObserver) {
        if (!TextUtils.isEmpty(str) && h5ProEventHubObserver != null) {
            synchronized (f6798a) {
                ConcurrentHashMap<String, List<Pair<Boolean, H5ProEventHubObserver>>> concurrentHashMap = f6799c;
                List<Pair<Boolean, H5ProEventHubObserver>> list = concurrentHashMap.get(str);
                if (list == null) {
                    return;
                }
                if (list.isEmpty()) {
                    concurrentHashMap.remove(str);
                    return;
                }
                Iterator<Pair<Boolean, H5ProEventHubObserver>> it = list.iterator();
                while (it.hasNext()) {
                    if (((H5ProEventHubObserver) it.next().second).equals(h5ProEventHubObserver)) {
                        it.remove();
                    }
                }
                if (list.isEmpty()) {
                    f6799c.remove(str);
                }
                return;
            }
        }
        LogUtil.w("H5PRO_H5ProEventHubManager", "removeObserver: eventName is empty or observer is null");
    }
}
