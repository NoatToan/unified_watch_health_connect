package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.maps.model.LatLng;
import java.lang.ref.WeakReference;
import java.util.Hashtable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class eb {
    private static boolean a = false;
    private static volatile eb d;
    private Hashtable<String, String> b = new Hashtable<>();
    private WeakReference<Context> c = null;

    private eb() {
    }

    public static eb a() {
        if (d == null) {
            synchronized (eb.class) {
                if (d == null) {
                    d = new eb();
                }
            }
        }
        return d;
    }

    public static void b() {
        if (d != null) {
            if (d.b != null && d.b.size() > 0) {
                synchronized (d.b) {
                    d.d();
                    if (d.c != null) {
                        d.c.clear();
                    }
                }
            }
            d = null;
        }
        a = false;
    }

    public static boolean c() {
        return a;
    }

    private void d() {
        WeakReference<Context> weakReference;
        if (!a) {
            this.b.clear();
            return;
        }
        if (this.b != null) {
            StringBuffer stringBuffer = new StringBuffer();
            int i = 0;
            int size = this.b.size();
            if (size > 0) {
                stringBuffer.append("[");
                Iterator<String> it2 = this.b.values().iterator();
                while (it2.hasNext()) {
                    i++;
                    stringBuffer.append(it2.next());
                    if (i < size) {
                        stringBuffer.append(",");
                    }
                }
                stringBuffer.append("]");
                String string = stringBuffer.toString();
                if (!TextUtils.isEmpty(string) && (weakReference = this.c) != null && weakReference.get() != null) {
                    iw.a(string, this.c.get());
                }
            }
            this.b.clear();
        }
    }

    public static void a(boolean z) {
        a = z;
    }

    public static void a(int i) {
        if (a) {
            a = i < 1000;
        }
    }

    public final void a(Context context) {
        if (context != null) {
            this.c = new WeakReference<>(context);
        }
    }

    public final void a(LatLng latLng, String str, String str2) {
        Hashtable<String, String> hashtable;
        if (!a) {
            this.b.clear();
            return;
        }
        if (latLng == null || TextUtils.isEmpty(str)) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{");
        stringBuffer.append("\"lon\":");
        stringBuffer.append(latLng.longitude);
        stringBuffer.append(",");
        stringBuffer.append("\"lat\":");
        stringBuffer.append(latLng.latitude);
        stringBuffer.append(",");
        stringBuffer.append("\"title\":\"");
        stringBuffer.append(str);
        stringBuffer.append("\",");
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        stringBuffer.append("\"snippet\":\"");
        stringBuffer.append(str2);
        stringBuffer.append("\"");
        stringBuffer.append(com.alipay.sdk.m.u.i.d);
        String string = stringBuffer.toString();
        if (string == null || (hashtable = this.b) == null) {
            return;
        }
        synchronized (hashtable) {
            String strB = gr.b(string);
            Hashtable<String, String> hashtable2 = this.b;
            if (hashtable2 != null && !hashtable2.contains(strB)) {
                this.b.put(strB, string);
            }
            Hashtable<String, String> hashtable3 = this.b;
            boolean z = false;
            if (hashtable3 != null && hashtable3.size() > 20) {
                z = true;
            }
            if (z) {
                d();
            }
        }
    }
}
