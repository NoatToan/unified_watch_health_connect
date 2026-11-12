package com.huawei.health.device.util;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes7.dex */
public class EventBus {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<b> f6439c = new ArrayList<>(16);
    private static final HashMap<String, EventBus> e = new HashMap<>(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ReentrantLock f6437a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ThreadPoolExecutor f6438b = null;

    public interface ICallback {
        void onEvent(d dVar);
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f6444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Intent f6445b;
        private Bundle e;

        public d(String str) {
            this(str, new Bundle());
        }

        public d(String str, Bundle bundle) {
            this.f6444a = str;
            this.e = bundle;
        }

        public d(String str, Intent intent) {
            this.f6444a = str;
            this.f6445b = intent;
        }

        public String e() {
            return this.f6444a;
        }

        public Bundle b() {
            return this.e;
        }

        public Intent c() {
            return this.f6445b;
        }
    }

    private EventBus() {
    }

    public static void a(d dVar) {
        String str;
        if (dVar == null || (str = dVar.f6444a) == null) {
            return;
        }
        f6437a.lock();
        try {
            EventBus eventBus = e.get(str);
            if (eventBus != null) {
                ReleaseLogUtil.d("PluginDevice_EventBus", "EventBus publish ", dVar.e());
                Iterator<b> it = eventBus.f6439c.iterator();
                while (it.hasNext()) {
                    it.next().b(dVar);
                }
            }
        } finally {
            f6437a.unlock();
        }
    }

    public static void b(ICallback iCallback, int i, String... strArr) {
        if (iCallback == null || strArr == null || strArr.length == 0) {
            return;
        }
        f6437a.lock();
        try {
            ReleaseLogUtil.d("PluginDevice_EventBus", "EventBus subscribe ", Arrays.toString(strArr));
            b bVar = null;
            for (String str : strArr) {
                if (str != null) {
                    HashMap<String, EventBus> map = e;
                    EventBus eventBus = map.get(str);
                    if (eventBus == null) {
                        eventBus = new EventBus();
                        map.put(str, eventBus);
                    }
                    ArrayList<b> arrayList = eventBus.f6439c;
                    Iterator<b> it = arrayList.iterator();
                    do {
                        if (!it.hasNext()) {
                            if (bVar == null) {
                                bVar = new b(iCallback, i);
                            }
                            arrayList.add(bVar);
                            break;
                        }
                    } while (it.next().f6440b != iCallback);
                }
            }
        } finally {
            f6437a.unlock();
        }
    }

    public static void a(ICallback iCallback, String... strArr) {
        EventBus eventBus;
        if (iCallback == null || strArr == null || strArr.length == 0) {
            return;
        }
        f6437a.lock();
        try {
            ReleaseLogUtil.d("PluginDevice_EventBus", "EventBus unsubscribe ", Arrays.toString(strArr));
            for (String str : strArr) {
                if (str != null && (eventBus = e.get(str)) != null) {
                    ArrayList<b> arrayList = eventBus.f6439c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size && arrayList.get(i).f6440b != iCallback) {
                        i++;
                    }
                    if (i < size) {
                        arrayList.remove(i);
                        if (arrayList.isEmpty()) {
                            HashMap<String, EventBus> map = e;
                            map.remove(str);
                            if (map.isEmpty() && f6438b != null) {
                                f6438b = null;
                            }
                        }
                    }
                }
            }
        } finally {
            f6437a.unlock();
        }
    }

    static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ICallback f6440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Handler f6441c;

        b(ICallback iCallback, int i) {
            this.f6440b = iCallback;
            if (i != 1) {
                if (i == 2) {
                    this.f6441c = new Handler(Looper.getMainLooper());
                    return;
                } else {
                    this.f6441c = null;
                    return;
                }
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                LogUtil.d("PluginDevice_EventBus", "No Looper; Looper.prepare() wasn't called on this thread.");
            } else {
                this.f6441c = new Handler(looperMyLooper);
            }
        }

        void b(final d dVar) {
            Runnable runnable = new Runnable() { // from class: com.huawei.health.device.util.EventBus.b.2
                @Override // java.lang.Runnable
                public void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    try {
                        if (b.this.f6440b != null) {
                            ReleaseLogUtil.d("PluginDevice_EventBus", "EventBus onEvent ", dVar.e());
                            b.this.f6440b.onEvent(dVar);
                        }
                    } finally {
                        if (b.this.f6441c == null) {
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                            if (jCurrentTimeMillis2 > 5000 && b.this.f6440b != null) {
                                LogUtil.d("PluginDevice_EventBus", b.this.f6440b.getClass().getName(), " takes too long (", Long.valueOf(jCurrentTimeMillis2), "ms)!");
                            }
                        }
                    }
                }
            };
            Handler handler = this.f6441c;
            if (handler == null) {
                if (EventBus.f6438b == null) {
                    ThreadPoolExecutor unused = EventBus.f6438b = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                    EventBus.f6438b.allowCoreThreadTimeOut(true);
                }
                EventBus.f6438b.execute(runnable);
                return;
            }
            handler.post(runnable);
        }
    }
}
