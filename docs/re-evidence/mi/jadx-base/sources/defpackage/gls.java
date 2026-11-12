package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.maps.model.LatLng;
import java.lang.ref.WeakReference;
import java.util.Hashtable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class gls {
    public static boolean c = false;
    public static volatile gls d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Hashtable<String, String> f19122a = new Hashtable<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference<Context> f19123b = null;

    public static gls a() {
        if (d == null) {
            synchronized (gls.class) {
                try {
                    if (d == null) {
                        d = new gls();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public static void e(boolean z) {
        c = z;
    }

    public static void f() {
        if (d != null) {
            if (d.f19122a != null && d.f19122a.size() > 0) {
                synchronized (d.f19122a) {
                    try {
                        d.h();
                        if (d.f19123b != null) {
                            d.f19123b.clear();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            d = null;
        }
        e(false);
    }

    public static boolean g() {
        return c;
    }

    public final void b(Context context) {
        if (context != null) {
            this.f19123b = new WeakReference<>(context);
        }
    }

    public final void c(LatLng latLng, String str, String str2) {
        if (!c) {
            this.f19122a.clear();
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
        stringBuffer.append("}");
        d(stringBuffer.toString());
    }

    public final void d(String str) {
        Hashtable<String, String> hashtable;
        if (str == null || (hashtable = this.f19122a) == null) {
            return;
        }
        synchronized (hashtable) {
            try {
                String strD = m0t.d(str);
                Hashtable<String, String> hashtable2 = this.f19122a;
                if (hashtable2 != null && !hashtable2.contains(strD)) {
                    this.f19122a.put(strD, str);
                }
                if (i()) {
                    h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        WeakReference<Context> weakReference;
        if (!c) {
            this.f19122a.clear();
            return;
        }
        if (this.f19122a != null) {
            StringBuffer stringBuffer = new StringBuffer();
            int size = this.f19122a.size();
            if (size > 0) {
                stringBuffer.append("[");
                Iterator<String> it = this.f19122a.values().iterator();
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
                if (!TextUtils.isEmpty(string) && (weakReference = this.f19123b) != null && weakReference.get() != null) {
                    c6t.a(string, this.f19123b.get());
                }
            }
            this.f19122a.clear();
        }
    }

    public final boolean i() {
        Hashtable<String, String> hashtable = this.f19122a;
        return hashtable != null && hashtable.size() > 20;
    }
}
