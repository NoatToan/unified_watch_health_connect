package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class x {
    private static volatile x c;
    private Context a;
    private List<d0> b = new ArrayList();

    private x(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        if (applicationContext == null) {
            this.a = context;
        }
    }

    public static x a(Context context) {
        if (c == null) {
            synchronized (x.class) {
                if (c == null) {
                    c = new x(context);
                }
            }
        }
        return c;
    }

    public int a(String str) {
        synchronized (this.b) {
            d0 d0Var = new d0();
            d0Var.b = str;
            if (this.b.contains(d0Var)) {
                for (d0 d0Var2 : this.b) {
                    if (d0Var2.equals(d0Var)) {
                        return d0Var2.a;
                    }
                }
            }
            return 0;
        }
    }

    public synchronized String a(am amVar) {
        return this.a.getSharedPreferences("mipush_extra", 0).getString(amVar.name(), "");
    }

    public synchronized void a(am amVar, String str) {
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("mipush_extra", 0);
        sharedPreferences.edit().putString(amVar.name(), str).commit();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3484a(String str) {
        synchronized (this.b) {
            d0 d0Var = new d0();
            d0Var.a = 0;
            d0Var.b = str;
            if (this.b.contains(d0Var)) {
                this.b.remove(d0Var);
            }
            this.b.add(d0Var);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3485a(String str) {
        synchronized (this.b) {
            d0 d0Var = new d0();
            d0Var.b = str;
            return this.b.contains(d0Var);
        }
    }

    public void b(String str) {
        synchronized (this.b) {
            d0 d0Var = new d0();
            d0Var.b = str;
            if (this.b.contains(d0Var)) {
                for (d0 d0Var2 : this.b) {
                    if (d0Var.equals(d0Var2)) {
                        d0Var = d0Var2;
                        break;
                    }
                }
            }
            d0Var.a++;
            this.b.remove(d0Var);
            this.b.add(d0Var);
        }
    }

    public void c(String str) {
        synchronized (this.b) {
            d0 d0Var = new d0();
            d0Var.b = str;
            if (this.b.contains(d0Var)) {
                this.b.remove(d0Var);
            }
        }
    }
}
