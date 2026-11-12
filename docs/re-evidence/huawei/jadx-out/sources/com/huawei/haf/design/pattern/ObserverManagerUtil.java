package com.huawei.haf.design.pattern;

import health.compact.a.LogUtil;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ObserverManagerUtil {
    private static HashMap<String, Observable> e = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f5929b = new Object();

    public static void d(Observer observer, String str) {
        if (observer == null) {
            return;
        }
        synchronized (f5929b) {
            if (!e.containsKey(str)) {
                Observable observable = new Observable(str);
                observable.b(observer);
                e.put(str, observable);
            } else {
                Observable observable2 = e.get(str);
                observable2.b(observer);
                e.put(str, observable2);
            }
        }
    }

    public static void c(Observer observer) {
        if (observer == null) {
            return;
        }
        synchronized (f5929b) {
            Iterator<Observable> it = e.values().iterator();
            while (it.hasNext()) {
                it.next().d(observer);
            }
        }
    }

    public static void a(Observer observer, String str) {
        if (observer == null) {
            return;
        }
        synchronized (f5929b) {
            if (e.containsKey(str)) {
                if (e.get(str).d(observer) == 0) {
                    e.remove(str);
                }
            } else {
                LogUtil.e("HAF_SubscribeManager", "unregister label = ", str, " not registered");
            }
        }
    }

    public static void a(String str) {
        synchronized (f5929b) {
            if (e.containsKey(str)) {
                e.get(str).c();
                e.remove(str);
            } else {
                LogUtil.e("HAF_SubscribeManager", "unregisterObserver action = ", str, " not registered");
            }
        }
    }

    public static boolean e(String str, Object... objArr) {
        synchronized (f5929b) {
            if (!e.containsKey(str)) {
                return false;
            }
            Observable observable = e.get(str);
            if (observable == null) {
                return true;
            }
            observable.b(objArr);
            return true;
        }
    }
}
