package com.xiaomi.push.service;

import android.content.SharedPreferences;
import com.xiaomi.push.C1648r;
import com.xiaomi.push.cv;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class bn {
    private static String d;
    private static bn e = new bn();
    private List<a> a = new ArrayList();
    private com.xiaomi.push.at.a b;
    private C1648r.b c;

    public static abstract class a {
        public void a(com.xiaomi.push.at.a aVar) {
        }

        public void a(com.xiaomi.push.au.b bVar) {
        }
    }

    private bn() {
    }

    public static bn a() {
        return e;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static synchronized String m3832a() {
        if (d == null) {
            SharedPreferences sharedPreferences = com.xiaomi.channel.commonutils.android.k.m3431a().getSharedPreferences("XMPushServiceConfig", 0);
            String string = sharedPreferences.getString("DeviceUUID", null);
            d = string;
            if (string == null) {
                String strA = com.xiaomi.channel.commonutils.android.c.a(com.xiaomi.channel.commonutils.android.k.m3431a());
                d = strA;
                if (strA != null) {
                    sharedPreferences.edit().putString("DeviceUUID", d).commit();
                }
            }
        }
        return d;
    }

    private void j() throws Throwable {
        if (this.b == null) {
            l();
        }
    }

    private void k() {
        if (this.c != null) {
            return;
        }
        g0 g0Var = new g0(this);
        this.c = g0Var;
        cv.a(g0Var);
    }

    private void l() throws Throwable {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        Exception e2;
        try {
            try {
                bufferedInputStream = new BufferedInputStream(com.xiaomi.channel.commonutils.android.k.m3431a().openFileInput("XMCloudCfg"));
                try {
                    this.b = com.xiaomi.push.at.a.b(com.xiaomi.push.b.a(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Exception e3) {
                    e2 = e3;
                    com.xiaomi.channel.commonutils.logger.b.m3434a("load config failure: " + e2.getMessage());
                }
            } catch (Throwable th2) {
                th = th2;
                com.xiaomi.push.h.a(bufferedInputStream);
                throw th;
            }
        } catch (Exception e4) {
            bufferedInputStream = null;
            e2 = e4;
        } catch (Throwable th3) {
            bufferedInputStream = null;
            th = th3;
            com.xiaomi.push.h.a(bufferedInputStream);
            throw th;
        }
        com.xiaomi.push.h.a(bufferedInputStream);
        if (this.b == null) {
            this.b = new com.xiaomi.push.at.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        try {
            if (this.b != null) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(com.xiaomi.channel.commonutils.android.k.m3431a().openFileOutput("XMCloudCfg", 0));
                com.xiaomi.push.c cVarA = com.xiaomi.push.c.a(bufferedOutputStream);
                this.b.a(cVarA);
                cVarA.m3616a();
                bufferedOutputStream.close();
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("save config failure: " + e2.getMessage());
        }
    }

    public synchronized void a(a aVar) {
        this.a.add(aVar);
    }

    public int b() throws Throwable {
        j();
        com.xiaomi.push.at.a aVar = this.b;
        if (aVar != null) {
            return aVar.c();
        }
        return 0;
    }

    public synchronized void g() {
        this.a.clear();
    }

    public void h(com.xiaomi.push.au.b bVar) {
        a[] aVarArr;
        if (bVar.m3528d() && bVar.d() > b()) {
            k();
        }
        synchronized (this) {
            List<a> list = this.a;
            aVarArr = (a[]) list.toArray(new a[list.size()]);
        }
        for (a aVar : aVarArr) {
            aVar.a(bVar);
        }
    }
}
