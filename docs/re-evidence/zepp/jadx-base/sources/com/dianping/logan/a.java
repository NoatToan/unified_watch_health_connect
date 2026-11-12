package com.dianping.logan;

import android.os.Looper;
import android.text.TextUtils;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
class a {
    private static a l;
    private String b;
    private String c;
    private long d;
    private long e;
    private long f;
    private long g;
    private String h;
    private String i;
    private d j;
    private ConcurrentLinkedQueue<b> a = new ConcurrentLinkedQueue<>();
    private SimpleDateFormat k = new SimpleDateFormat("yyyy-MM-dd");

    private a(LoganConfig loganConfig) {
        if (!loganConfig.h()) {
            throw new NullPointerException("config's param is invalid");
        }
        this.c = loganConfig.b;
        this.b = loganConfig.a;
        this.d = loganConfig.d;
        this.f = loganConfig.f;
        this.e = loganConfig.c;
        this.g = loganConfig.e;
        this.h = new String(loganConfig.g);
        this.i = new String(loganConfig.h);
        d();
    }

    private long b(String str) {
        try {
            return this.k.parse(str).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
            return 0L;
        }
    }

    private void d() {
        if (this.j == null) {
            d dVar = new d(this.a, this.b, this.c, this.d, this.e, this.f, this.h, this.i);
            this.j = dVar;
            dVar.setName("logan-thread");
            this.j.start();
        }
    }

    public static a e(LoganConfig loganConfig) {
        if (l == null) {
            synchronized (a.class) {
                if (l == null) {
                    l = new a(loganConfig);
                }
            }
        }
        return l;
    }

    public void a() {
        if (TextUtils.isEmpty(this.c)) {
            return;
        }
        b bVar = new b();
        bVar.a = b.a.FLUSH;
        this.a.add(bVar);
        d dVar = this.j;
        if (dVar != null) {
            dVar.n();
        }
    }

    public File c() {
        return new File(this.c);
    }

    public void f(String[] strArr, SendLogRunnable sendLogRunnable) {
        if (TextUtils.isEmpty(this.c) || strArr == null || strArr.length == 0) {
            return;
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                long jB = b(str);
                if (jB > 0) {
                    b bVar = new b();
                    e eVar = new e();
                    bVar.a = b.a.SEND;
                    eVar.b = String.valueOf(jB);
                    eVar.d = sendLogRunnable;
                    bVar.c = eVar;
                    this.a.add(bVar);
                    d dVar = this.j;
                    if (dVar != null) {
                        dVar.n();
                    }
                }
            }
        }
    }

    public void g(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        b bVar = new b();
        bVar.a = b.a.WRITE;
        f fVar = new f();
        String name = Thread.currentThread().getName();
        long id = Thread.currentThread().getId();
        boolean z = Looper.getMainLooper() == Looper.myLooper();
        fVar.a = str;
        fVar.e = System.currentTimeMillis();
        fVar.f = i;
        fVar.b = z;
        fVar.c = id;
        fVar.d = name;
        bVar.b = fVar;
        if (this.a.size() < this.g) {
            this.a.add(bVar);
            d dVar = this.j;
            if (dVar != null) {
                dVar.n();
            }
        }
    }
}
