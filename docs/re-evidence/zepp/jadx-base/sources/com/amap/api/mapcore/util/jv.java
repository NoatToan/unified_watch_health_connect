package com.amap.api.mapcore.util;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class jv {
    private List<ju> a = new ArrayList();

    public final void a() {
        synchronized (jv.class) {
            List<ju> list = this.a;
            if (list != null) {
                list.add(null);
            }
        }
    }

    public final void b() {
        synchronized (jv.class) {
            Iterator<ju> it2 = this.a.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    public final void c() {
        synchronized (jv.class) {
            Iterator<ju> it2 = this.a.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    public final void d() {
        synchronized (jv.class) {
            Iterator<ju> it2 = this.a.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    public final void e() {
        synchronized (jv.class) {
            Iterator<ju> it2 = this.a.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    public final void f() {
        synchronized (jv.class) {
            Iterator<ju> it2 = this.a.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            this.a.clear();
        }
    }

    public final String g() {
        String string;
        synchronized (jv.class) {
            StringBuffer stringBuffer = new StringBuffer();
            for (ju juVar : this.a) {
                if (juVar != null) {
                    String strA = juVar.a();
                    if (!TextUtils.isEmpty(strA)) {
                        stringBuffer.append(strA);
                        if (!strA.endsWith(";")) {
                            stringBuffer.append(";");
                        }
                    }
                }
            }
            string = stringBuffer.toString();
        }
        return string;
    }

    public final void h() {
        synchronized (jv.class) {
            Iterator<ju> it2 = this.a.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    public final void i() {
        synchronized (jv.class) {
            Iterator<ju> it2 = this.a.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    public final Object j() {
        Object objB;
        synchronized (jv.class) {
            for (ju juVar : this.a) {
                if (juVar != null && (objB = juVar.b()) != null) {
                    return objB;
                }
            }
            return null;
        }
    }
}
