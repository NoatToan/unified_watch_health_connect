package com.autonavi.aps.amapapi.restruct;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.iq;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f3937b;
    private Handler e;
    private String f;
    private boolean g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3938c = false;
    private Map<String, C0033a> d = new ConcurrentHashMap();
    private Runnable h = new Runnable() { // from class: com.autonavi.aps.amapapi.restruct.a.2
        @Override // java.lang.Runnable
        public final void run() {
            if (a.this.f3938c) {
                if (a.this.g) {
                    a.this.e();
                    a.e(a.this);
                }
                if (a.this.e != null) {
                    a.this.e.postDelayed(a.this.h, 60000L);
                }
            }
        }
    };

    public static int a(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    abstract void a(T t, long j);

    abstract long b();

    public abstract String b(T t);

    abstract int c(T t);

    abstract long c();

    abstract long d(T t);

    static /* synthetic */ boolean e(a aVar) {
        aVar.g = false;
        return false;
    }

    public a(Context context, String str, Handler handler) {
        this.f = null;
        if (context == null) {
            return;
        }
        this.e = handler;
        this.f3936a = TextUtils.isEmpty(str) ? "unknow" : str;
        this.f = com.autonavi.aps.amapapi.utils.k.l(context);
        try {
            this.f3937b = new File(context.getFilesDir().getPath(), this.f3936a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        d();
    }

    public final void a() {
        Handler handler;
        if (!this.f3938c && (handler = this.e) != null) {
            handler.removeCallbacks(this.h);
            this.e.postDelayed(this.h, 60000L);
        }
        this.f3938c = true;
    }

    public final void a(boolean z) {
        Handler handler = this.e;
        if (handler != null) {
            handler.removeCallbacks(this.h);
        }
        if (!z) {
            this.h.run();
        }
        this.f3938c = false;
    }

    public final void a(T t) {
        b(t, com.autonavi.aps.amapapi.utils.k.b());
    }

    public final void a(List<T> list) {
        long jB = com.autonavi.aps.amapapi.utils.k.b();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            b(it.next(), jB);
        }
        if (this.d.size() >= list.size()) {
            this.g = true;
        }
        if (this.d.size() > 16384 || c() <= 0) {
            this.d.clear();
            for (T t : list) {
                this.d.put(b(t), new C0033a(c(t), d(t), jB));
            }
        }
    }

    private void b(T t, long j) {
        if (t == null || d(t) < 0) {
            return;
        }
        String strB = b(t);
        C0033a c0033a = this.d.get(strB);
        if (c0033a == null) {
            a(t, j);
            this.d.put(strB, new C0033a(c(t), d(t), j));
            this.g = true;
            return;
        }
        c0033a.f3943c = j;
        if (c0033a.f3941a != c(t)) {
            a(t, j);
            c0033a.f3941a = c(t);
            c0033a.f3942b = d(t);
            this.g = true;
            return;
        }
        a(t, c0033a.f3942b);
    }

    private void d() {
        long jB;
        try {
            Iterator<String> it = com.autonavi.aps.amapapi.utils.k.a(this.f3937b).iterator();
            while (it.hasNext()) {
                try {
                    String[] strArrSplit = new String(com.autonavi.aps.amapapi.security.a.b(iq.b(it.next()), this.f), "UTF-8").split(",");
                    if (strArrSplit.length >= 4) {
                        jB = Long.parseLong(strArrSplit[3]);
                    } else {
                        jB = com.autonavi.aps.amapapi.utils.k.b();
                    }
                    this.d.put(strArrSplit[0], new C0033a(Integer.parseInt(strArrSplit[1]), Long.parseLong(strArrSplit[2]), jB));
                } catch (Throwable th) {
                    if (this.f3937b.exists()) {
                        this.f3937b.delete();
                    }
                    th.printStackTrace();
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (c() > 0) {
            this.d.size();
            if (b() > 0) {
                long jB = com.autonavi.aps.amapapi.utils.k.b();
                Iterator<Map.Entry<String, C0033a>> it = this.d.entrySet().iterator();
                while (it.hasNext()) {
                    if (jB - this.d.get(it.next().getKey()).f3943c > b()) {
                        it.remove();
                    }
                }
            }
            if (this.d.size() > c()) {
                ArrayList arrayList = new ArrayList(this.d.keySet());
                Collections.sort(arrayList, new Comparator<String>() { // from class: com.autonavi.aps.amapapi.restruct.a.1
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // java.util.Comparator
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public int compare(String str, String str2) {
                        return a.a(((C0033a) a.this.d.get(str2)).f3943c, ((C0033a) a.this.d.get(str)).f3943c);
                    }
                });
                for (int iC = (int) c(); iC < arrayList.size(); iC++) {
                    this.d.remove(arrayList.get(iC));
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, C0033a> entry : this.d.entrySet()) {
            try {
                sb.append(iq.b(com.autonavi.aps.amapapi.security.a.a((entry.getKey() + "," + entry.getValue().f3941a + "," + entry.getValue().f3942b + "," + entry.getValue().f3943c).getBytes("UTF-8"), this.f)) + "\n");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        String string = sb.toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        com.autonavi.aps.amapapi.utils.k.a(this.f3937b, string);
    }

    /* JADX INFO: renamed from: com.autonavi.aps.amapapi.restruct.a$a, reason: collision with other inner class name */
    static final class C0033a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f3941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f3942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f3943c;

        public C0033a(int i, long j, long j2) {
            this.f3941a = i;
            this.f3942b = j;
            this.f3943c = j2;
        }
    }

    public final long e(T t) {
        return (com.autonavi.aps.amapapi.utils.k.b() - d(t)) / 1000;
    }
}
