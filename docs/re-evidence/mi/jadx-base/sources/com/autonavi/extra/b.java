package com.autonavi.extra;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<a> f6921a = new ArrayList();

    public final void a() {
        synchronized (b.class) {
            try {
                List<a> list = this.f6921a;
                if (list != null) {
                    list.add(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (b.class) {
            try {
                Iterator<a> it = this.f6921a.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (b.class) {
            try {
                Iterator<a> it = this.f6921a.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (b.class) {
            try {
                Iterator<a> it = this.f6921a.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (b.class) {
            try {
                Iterator<a> it = this.f6921a.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        synchronized (b.class) {
            try {
                Iterator<a> it = this.f6921a.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                this.f6921a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String g() {
        String string;
        synchronized (b.class) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                for (a aVar : this.f6921a) {
                    if (aVar != null) {
                        String strA = aVar.a();
                        if (!TextUtils.isEmpty(strA)) {
                            stringBuffer.append(strA);
                            if (!strA.endsWith(";")) {
                                stringBuffer.append(";");
                            }
                        }
                    }
                }
                string = stringBuffer.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    public final void h() {
        synchronized (b.class) {
            try {
                Iterator<a> it = this.f6921a.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (b.class) {
            try {
                Iterator<a> it = this.f6921a.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object j() {
        Object objB;
        synchronized (b.class) {
            try {
                for (a aVar : this.f6921a) {
                    if (aVar != null && (objB = aVar.b()) != null) {
                        return objB;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
