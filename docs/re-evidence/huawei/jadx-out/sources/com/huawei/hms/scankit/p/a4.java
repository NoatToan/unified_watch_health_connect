package com.huawei.hms.scankit.p;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.common.C;
import com.huawei.hms.feature.DynamicModuleInitializer;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.hms.hatool.HmsHiAnalyticsUtils;
import com.huawei.wearengine.sensor.Sensor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes10.dex */
public class a4 {
    private static volatile a4 h = new a4();
    private static String[] i = {"AD", "AL", "AN", "AT", "AU", "AX", "BA", "BE", "BG", "BQ", "CA", "CH", "CW", "CY", "CZ", "DE", "DK", "EE", "ES", "FI", "FO", "FR", "GB", "GG", "GI", "GL", "GR", Sensor.NAME_HR, "HU", "IE", "IL", "IM", "IS", "IT", "JE", "LI", "LT", "LU", "LV", "MC", "MD", "ME", "MF", "MK", "MT", "NL", "NO", "NZ", "PL", "PM", "PT", "RO", "RS", "SE", "SI", "SJ", "SK", "SM", "SX", "TR", "UA", "UM", "US", "VA", "VC", "XK", "YK"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f15970c;
    private volatile long d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Timer f15968a = new Timer();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f15969b = true;
    private volatile boolean e = false;
    private final Lock f = new ReentrantLock();
    private List g = new ArrayList(5);

    private a4() {
    }

    public void b(String str, LinkedHashMap linkedHashMap) {
        if (this.f15970c) {
            c(str, linkedHashMap);
        } else {
            a(str, linkedHashMap);
            c();
        }
    }

    public static a4 b() {
        return h;
    }

    private void c(String str, LinkedHashMap linkedHashMap) {
        if (!this.e) {
            HmsHiAnalyticsUtils.onEvent(0, str, (LinkedHashMap<String, String>) linkedHashMap);
            HmsHiAnalyticsUtils.onEvent(1, str, (LinkedHashMap<String, String>) linkedHashMap);
        }
        if (this.f15969b) {
            this.f15969b = false;
            this.f15968a.schedule(new c(this, null), C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        }
        o4.d("ScanHiAnalytics", str + " " + linkedHashMap.toString());
    }

    private void c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.d > 6000) {
            this.d = jCurrentTimeMillis;
            new a("ScanHiAnalytics").start();
        }
    }

    class a extends Thread {
        a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            a4.this.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (!this.f.tryLock() || this.f15970c) {
            return;
        }
        try {
            Context context = DynamicModuleInitializer.getContext();
            if (context == null) {
                return;
            }
            String strA = a(context);
            if (strA != null && !strA.isEmpty()) {
                HmsHiAnalyticsUtils.init(context, false, false, false, strA, context.getPackageName());
                HmsHiAnalyticsUtils.enableLog();
                a();
            }
        } finally {
            this.f.unlock();
        }
    }

    private void a() {
        synchronized (this) {
            this.f15970c = true;
            for (b bVar : this.g) {
                c(bVar.f15972a, bVar.f15973b);
            }
            this.g = null;
        }
    }

    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f15972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private LinkedHashMap f15973b;

        private b(String str, LinkedHashMap linkedHashMap) {
            this.f15972a = str;
            this.f15973b = linkedHashMap;
        }

        /* synthetic */ b(a4 a4Var, String str, LinkedHashMap linkedHashMap, a aVar) {
            this(str, linkedHashMap);
        }
    }

    class c extends TimerTask {
        private c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                a4.this.f15969b = true;
                HmsHiAnalyticsUtils.onReport();
            } catch (Exception e) {
                o4.b("ScanHiAnalytics", e.getMessage());
            }
        }

        /* synthetic */ c(a4 a4Var, a aVar) {
            this();
        }
    }

    private void a(String str, LinkedHashMap linkedHashMap) {
        synchronized (this) {
            if (this.f15970c) {
                c(str, linkedHashMap);
            } else {
                if (this.g.size() >= 100) {
                    return;
                }
                this.g.add(new b(this, str, linkedHashMap, null));
            }
        }
    }

    private String a(Context context) {
        try {
            GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
            String strA = new a1(context, false).a();
            Log.i("ScanHiAnalytics", "getCollectURL:localCountryCode " + strA);
            if (strA != null && !strA.isEmpty() && !"UNKNOWN".equals(strA)) {
                grsBaseInfo.setSerCountry(strA.toUpperCase(Locale.ENGLISH));
            }
            if (Arrays.asList(i).contains(strA)) {
                this.e = true;
            }
            GrsClient grsClient = new GrsClient(context, grsBaseInfo);
            String strSynGetGrsUrl = grsClient.synGetGrsUrl("com.huawei.cloud.mlkithianalytics", "ROOTNEW");
            if (TextUtils.isEmpty(strSynGetGrsUrl)) {
                strSynGetGrsUrl = grsClient.synGetGrsUrl("com.huawei.cloud.mlkithianalytics", "ROOT");
            }
            Log.i("ScanHiAnalytics", "grs get url success: " + strSynGetGrsUrl + "  countryCode = " + grsBaseInfo.getSerCountry());
            return strSynGetGrsUrl;
        } catch (RuntimeException | Exception unused) {
            return null;
        }
    }
}
