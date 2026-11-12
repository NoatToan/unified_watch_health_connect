package com.huawei.hianalytics;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hianalytics.core.common.EnvUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.framework.threadpool.TaskThread;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f11580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f11581c;
    public WeakReference d;
    public WeakReference e;
    public final String f;

    public m0(Looper looper, int i, String str) {
        super(looper);
        this.f11579a = Looper.myLooper() == Looper.getMainLooper();
        if (i == 1) {
            long j = l.a().g;
            l lVarA = l.a();
            lVarA.getClass();
            sendEmptyMessageDelayed(4, (((long) new Random().nextInt(lVarA.l)) * 60000) + j);
        } else if (i == 2) {
            long j2 = j1.a().f11560c;
            j1 j1VarA = j1.a();
            j1VarA.getClass();
            sendEmptyMessageDelayed(5, (((long) new Random().nextInt(j1VarA.d)) * 60000) + j2);
        }
        this.f = str;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(Message message) {
        i1 i1Var;
        i1 i1Var2;
        e eVar;
        u1 u1Var;
        q1 q1Var;
        switch (message.what) {
            case 1:
                String str = (String) message.obj;
                WeakReference weakReference = this.f11580b;
                if (weakReference == null || (i1Var = (i1) weakReference.get()) == null) {
                    return;
                }
                String strA = m.a();
                if (TextUtils.isEmpty(strA)) {
                    i1Var.d = "";
                    i1Var.f = 0L;
                    i1Var.e = "";
                    return;
                }
                if (!TextUtils.isEmpty(i1Var.d) && !TextUtils.equals(i1Var.d, strA)) {
                    i1Var.b();
                }
                if (TextUtils.equals(i1Var.d, strA)) {
                    return;
                }
                i1Var.d = strA;
                i1Var.f = System.currentTimeMillis();
                i1Var.e = str;
                return;
            case 2:
                WeakReference weakReference2 = this.f11580b;
                if (weakReference2 == null || (i1Var2 = (i1) weakReference2.get()) == null) {
                    return;
                }
                i1Var2.c();
                return;
            case 3:
                WeakReference weakReference3 = this.f11581c;
                if (weakReference3 == null || (eVar = (e) weakReference3.get()) == null) {
                    return;
                }
                eVar.b();
                return;
            case 4:
                c();
                return;
            case 5:
                b();
                return;
            case 6:
                WeakReference weakReference4 = this.d;
                if (weakReference4 == null || (u1Var = (u1) weakReference4.get()) == null) {
                    return;
                }
                u1Var.b();
                return;
            case 7:
                a();
                return;
            case 8:
                WeakReference weakReference5 = this.e;
                if (weakReference5 == null || (q1Var = (q1) weakReference5.get()) == null) {
                    return;
                }
                synchronized (q1Var) {
                    HiLog.d("MPL", "cache info");
                    l1 l1Var = q1Var.f11604b;
                    l1Var.getClass();
                    try {
                        l1Var.h = Long.parseLong(l1Var.e);
                    } catch (Exception unused) {
                        l1Var.h = j1.a().n;
                        HiLog.d("McInfo", "cache failed");
                    }
                    q1Var.a();
                    break;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0111  */
    public final void c() {
        String strA;
        y1 y1Var;
        u1 u1Var;
        i1 i1Var;
        e eVar;
        HiLog.d("handler", "handleMessage report");
        if (System.currentTimeMillis() - c2.a("global_v2", "lastReportTime", 0L) < l.a().g) {
            return;
        }
        if (l.a().f11570a) {
            if (g0.f11539a[0].equals(this.f)) {
                WeakReference weakReference = this.f11581c;
                if (weakReference != null && (eVar = (e) weakReference.get()) != null) {
                    eVar.b();
                }
                WeakReference weakReference2 = this.f11580b;
                if (weakReference2 != null && (i1Var = (i1) weakReference2.get()) != null) {
                    i1Var.c();
                }
                h2.a();
            }
            WeakReference weakReference3 = this.d;
            if (weakReference3 != null && (u1Var = (u1) weakReference3.get()) != null) {
                u1Var.b();
            }
            HiAnalyticsInstance instanceByTag = HiAnalyticsManager.getInstanceByTag("ha_default_collection");
            if (instanceByTag != null) {
                String strA2 = c2.a("global_v2", "sdkReportUrl");
                if (!TextUtils.isEmpty(strA2)) {
                    k.b().getClass();
                    ((q0) k.f11563b.get("ha_default_collection")).f11601b.e = strA2;
                }
                if (TextUtils.isEmpty(s.a())) {
                    Pair pairA = x0.a(EnvUtils.getAppContext());
                    instanceByTag.setOAID(0, (String) pairA.first);
                    instanceByTag.setOAIDTrackingFlag(0, ((Boolean) pairA.second).booleanValue());
                }
                instanceByTag.onReport(0);
                c2.b("global_v2", "lastReportTime", System.currentTimeMillis());
            }
        }
        l lVarA = l.a();
        lVarA.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - c2.a("global_v2", "lastReloadTime", 0L) > lVarA.h) {
            boolean z = lVarA.f11570a;
            HiAnalyticsInstance instanceByTag2 = HiAnalyticsManager.getInstanceByTag(g0.f11539a[0]);
            if (instanceByTag2 == null) {
                strA = "";
            } else {
                String collectUrl = instanceByTag2.getCollectUrl();
                if (!TextUtils.isEmpty(collectUrl) && (collectUrl.contains("metrics1-drcn") || collectUrl.contains("metrics-drcn") || collectUrl.contains("metrics1.data"))) {
                    strA = c2.a("global_v2", "sdkConfigUrl");
                    if (TextUtils.isEmpty(strA)) {
                        synchronized (y1.f11732c) {
                            if (y1.d == null) {
                                y1.d = new y1(EnvUtils.getAppContext());
                            }
                            y1Var = y1.d;
                        }
                        String strA3 = y1Var.a();
                        if (TextUtils.isEmpty(strA3)) {
                            strA = "";
                        } else {
                            strA = strA3 + "/abtest/1.0/com.huawei.hianalytics/AB/config";
                        }
                    }
                } else {
                    strA = "";
                }
            }
            if (z1.a(strA)) {
                HiLog.d("DC", "reloadConfig success");
                lVarA.b();
                c2.b("global_v2", "lastReloadTime", jCurrentTimeMillis);
                boolean z2 = lVarA.f11570a;
                if (z2 != z) {
                    f0.b(z2);
                }
            } else {
                HiLog.w("DC", "reloadConfig failed");
            }
        }
        removeMessages(4);
        long j = l.a().g;
        l lVarA2 = l.a();
        lVarA2.getClass();
        sendEmptyMessageDelayed(4, (((long) new Random().nextInt(lVarA2.l)) * 60000) + j);
    }

    @Override // android.os.Handler
    public final void handleMessage(final Message message) {
        if (this.f11579a) {
            TaskThread.getRecordThread().addToQueue(new Runnable() { // from class: com.huawei.hianalytics.m0$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(message);
                }
            });
            return;
        }
        try {
            b(message);
        } catch (Throwable th) {
            HiLog.w("handler", "handleMessage error:" + th.getMessage());
        }
    }

    public final void b() {
        WeakReference weakReference;
        q1 q1Var;
        if (r1.a()) {
            removeMessages(5);
            long j = j1.a().f11560c;
            j1 j1VarA = j1.a();
            j1VarA.getClass();
            sendEmptyMessageDelayed(5, (((long) new Random().nextInt(j1VarA.d)) * 60000) + j);
            return;
        }
        if (j1.a().f11558a && (weakReference = this.e) != null && (q1Var = (q1) weakReference.get()) != null) {
            synchronized (q1Var) {
                HiLog.d("MPL", "flush");
                if (!j.a(EnvUtils.getAppContext()).checkAndClearTable()) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        List listA = q1.a(arrayList2);
                        if (listA.isEmpty()) {
                            HiLog.d("MPL", "no metric data");
                            r1.b();
                            r1.a(arrayList2, arrayList);
                        } else {
                            HashMap mapB = q1.b(arrayList);
                            ArrayList arrayList3 = new ArrayList();
                            q1.a(listA, arrayList2, arrayList3, mapB);
                            if (arrayList3.isEmpty()) {
                                HiLog.d("MPL", "no new metric data");
                                r1.b();
                                r1.a(arrayList2, arrayList);
                            } else if (q1.a(arrayList3, mapB)) {
                                q1.a(arrayList3, null, null, mapB);
                                r1.b();
                                r1.a(arrayList2, arrayList);
                            } else {
                                r1.b();
                            }
                        }
                    } catch (Throwable unused) {
                        HiLog.d("MPL", "handle info failed");
                    }
                }
                q1Var.f11603a.removeMessages(5);
                m0 m0Var = q1Var.f11603a;
                long j2 = j1.a().f11560c;
                j1 j1VarA2 = j1.a();
                j1VarA2.getClass();
                m0Var.sendEmptyMessageDelayed(5, (((long) new Random().nextInt(j1VarA2.d)) * 60000) + j2);
            }
        }
        removeMessages(5);
        long j3 = j1.a().f11560c;
        j1 j1VarA3 = j1.a();
        j1VarA3.getClass();
        sendEmptyMessageDelayed(5, (((long) new Random().nextInt(j1VarA3.d)) * 60000) + j3);
    }

    public final void a() {
        u1 u1Var;
        WeakReference weakReference = this.d;
        if (weakReference == null || (u1Var = (u1) weakReference.get()) == null) {
            return;
        }
        synchronized (u1Var) {
            u1Var.f = m.a();
        }
    }
}
