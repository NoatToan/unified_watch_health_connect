package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.maps.model.LatLng;
import java.lang.ref.WeakReference;
import java.util.Hashtable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class dp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f2386a = false;
    private static volatile dp d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Hashtable<String, String> f2387b = new Hashtable<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference<Context> f2388c = null;

    private dp() {
    }

    public static dp a() {
        if (d == null) {
            synchronized (dp.class) {
                if (d == null) {
                    d = new dp();
                }
            }
        }
        return d;
    }

    public static void b() {
        if (d != null) {
            if (d.f2387b != null && d.f2387b.size() > 0) {
                synchronized (d.f2387b) {
                    d.d();
                    if (d.f2388c != null) {
                        d.f2388c.clear();
                    }
                }
            }
            d = null;
        }
        a(false);
    }

    public static void a(boolean z) {
        f2386a = z;
    }

    public static boolean c() {
        return f2386a;
    }

    public final void a(Context context) {
        if (context != null) {
            this.f2388c = new WeakReference<>(context);
        }
    }

    public final void a(LatLng latLng, String str, String str2) {
        if (!f2386a) {
            this.f2387b.clear();
            return;
        }
        if (latLng == null || TextUtils.isEmpty(str)) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer("{\"lon\":");
        stringBuffer.append(latLng.longitude).append(",\"lat\":");
        stringBuffer.append(latLng.latitude).append(",\"title\":\"");
        stringBuffer.append(str).append("\",\"snippet\":\"");
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        stringBuffer.append(str2).append("\"}");
        a(stringBuffer.toString());
    }

    private void a(String str) {
        Hashtable<String, String> hashtable;
        if (str == null || (hashtable = this.f2387b) == null) {
            return;
        }
        synchronized (hashtable) {
            String strB = it.b(str);
            Hashtable<String, String> hashtable2 = this.f2387b;
            if (hashtable2 != null && !hashtable2.contains(strB)) {
                this.f2387b.put(strB, str);
            }
            if (e()) {
                d();
            }
        }
    }

    private void d() {
        WeakReference<Context> weakReference;
        if (!f2386a) {
            this.f2387b.clear();
            return;
        }
        if (this.f2387b != null) {
            StringBuffer stringBuffer = new StringBuffer();
            int size = this.f2387b.size();
            if (size > 0) {
                stringBuffer.append("[");
                Iterator<String> it = this.f2387b.values().iterator();
                int i = 0;
                while (it.hasNext()) {
                    i++;
                    stringBuffer.append(it.next());
                    if (i < size) {
                        stringBuffer.append(",");
                    }
                }
                stringBuffer.append("]");
                String string = stringBuffer.toString();
                if (!TextUtils.isEmpty(string) && (weakReference = this.f2388c) != null && weakReference.get() != null) {
                    lf.a(string, this.f2388c.get());
                }
            }
            this.f2387b.clear();
        }
    }

    private boolean e() {
        Hashtable<String, String> hashtable = this.f2387b;
        return hashtable != null && hashtable.size() > 20;
    }
}
