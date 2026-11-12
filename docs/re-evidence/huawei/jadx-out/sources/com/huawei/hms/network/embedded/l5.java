package com.huawei.hms.network.embedded;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.network.netdiag.cache.SignalInfoCache;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes34.dex */
public class l5 {
    public static final String e = "DispatcherMessage";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f15035a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap<Integer, r4> f15036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<Integer> f15037c;
    public HandlerThread d;

    public void b(Message message) {
        synchronized (this) {
            if (b() != null) {
                b().sendMessage(message);
            } else {
                Logger.i(e, "hander is null,this time will abort!");
            }
        }
    }

    public void a(List<Integer> list) {
        synchronized (this) {
            for (int i = 0; i < list.size(); i++) {
                Message messageObtain = Message.obtain();
                messageObtain.what = list.get(i).intValue();
                b(messageObtain);
            }
        }
    }

    public void a(Message message) {
        synchronized (this) {
            if (b() != null) {
                b().handleMessage(message);
            } else {
                Logger.i(e, "hander is null,this time will abort!");
            }
        }
    }

    public void a(int i, r4 r4Var) {
        this.f15036b.put(Integer.valueOf(i), r4Var);
    }

    public void a(int i) {
        this.f15036b.remove(Integer.valueOf(i));
    }

    public void a() {
        synchronized (this) {
            a(this.f15037c);
        }
    }

    public class a extends Handler {
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            try {
                r4 r4Var = (r4) l5.this.f15036b.get(Integer.valueOf(message.what));
                if (r4Var != null) {
                    Logger.v(l5.e, "the handler message will obtain, what =" + message.what);
                    r4Var.updateCacheInfo(message.obj);
                    return;
                }
                Logger.i(l5.e, "please register firstly");
            } catch (RuntimeException unused) {
                Logger.i(l5.e, "the handler has exception!");
            } catch (Throwable th) {
                HianalyticsHelper.getInstance().reportException(th, CrashHianalyticsData.EVENT_ID_CRASH);
            }
        }

        public a(Looper looper) {
            super(looper);
        }
    }

    private Handler b() {
        synchronized (this) {
            Handler handler = this.f15035a;
            if (handler != null) {
                return handler;
            }
            Looper looper = this.d.getLooper();
            if (looper == null) {
                return null;
            }
            a aVar = new a(looper);
            this.f15035a = aVar;
            return aVar;
        }
    }

    public l5() {
        ConcurrentHashMap<Integer, r4> concurrentHashMap = new ConcurrentHashMap<>();
        this.f15036b = concurrentHashMap;
        this.f15037c = Collections.unmodifiableList(new ArrayList(Arrays.asList(1001)));
        HandlerThread handlerThread = new HandlerThread("netdiag_thread");
        this.d = handlerThread;
        handlerThread.start();
        concurrentHashMap.put(1003, s4.getInstance());
        concurrentHashMap.put(1002, t4.getInstance());
        concurrentHashMap.put(1001, SignalInfoCache.getInstance());
    }
}
