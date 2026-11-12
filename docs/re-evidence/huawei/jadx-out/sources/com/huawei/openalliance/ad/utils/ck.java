package com.huawei.openalliance.ad.utils;

import android.content.Context;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.gk;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.PlacementAdLoader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes12.dex */
public class ck {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ck f20540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f20541c = new byte[0];
    private static final Set<String> i = new HashSet();
    private static final byte[] k = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f20542a;
    private TimerTask d;
    private Timer e;
    private gk f;
    private long g;
    private int h = 4;
    private boolean j = false;

    public boolean c() {
        boolean z;
        synchronized (k) {
            z = this.j;
        }
        return z;
    }

    public void b() {
        hw.a("PlacementRequestTimer", "stop timer");
        Timer timer = this.e;
        if (timer != null) {
            timer.cancel();
        }
        this.d = null;
        this.e = null;
        synchronized (k) {
            this.j = false;
        }
    }

    public void a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return;
        }
        for (String str : strArr) {
            i.add(str);
        }
    }

    public void a(long j) {
        this.g = j;
    }

    public void a(int i2) {
        this.h = i2;
    }

    public void a() {
        hw.a("PlacementRequestTimer", "start timer");
        synchronized (k) {
            if (this.j) {
                hw.c("PlacementRequestTimer", "timer already running");
                return;
            }
            this.j = true;
            int iBF = this.f.bF();
            hw.a("PlacementRequestTimer", "interval:%d", Integer.valueOf(iBF));
            if (iBF <= 0) {
                return;
            }
            if (this.e == null) {
                this.e = new Timer();
            }
            if (this.d == null) {
                this.d = new a(this.f20542a, (String[]) i.toArray(new String[0]), this.h);
            }
            int i2 = iBF * 60000;
            long jC = as.c() - this.g;
            long j = i2;
            long j2 = jC < j ? j - jC : 0L;
            hw.a("PlacementRequestTimer", "schedule task, delay:%s,intervalMills:%d", Long.valueOf(j2), Integer.valueOf(i2));
            this.e.schedule(this.d, j2, j);
        }
    }

    /* JADX INFO: loaded from: classes41.dex */
    static class a extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f20543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String[] f20544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f20545c;

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            hw.a("PlacementRequestTimer", "task excute, preload placement ad");
            new PlacementAdLoader.Builder(this.f20543a).setAutoCache(true).setDeviceType(this.f20545c).setAdIds(this.f20544b).setTest(false).build().preLoadAds();
            ck.a(this.f20543a).a(as.c());
        }

        public a(Context context, String[] strArr, int i) {
            this.f20543a = context;
            this.f20544b = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.f20545c = i;
        }
    }

    public static ck a(Context context) {
        ck ckVar;
        synchronized (f20541c) {
            if (f20540b == null) {
                f20540b = new ck(context);
            }
            ckVar = f20540b;
        }
        return ckVar;
    }

    private ck(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f20542a = applicationContext;
        this.f = fp.b(applicationContext);
    }
}
