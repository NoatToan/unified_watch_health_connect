package defpackage;

import android.content.SharedPreferences;
import com.xiaomi.push.c;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class rds {
    public static String d;
    public static rds e = new rds();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<a> f32453a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public cqs f32454b;
    public z5s.b c;

    public static abstract class a {
        public void b(cqs cqsVar) {
        }

        public void c(fqs fqsVar) {
        }
    }

    public static rds c() {
        return e;
    }

    public static synchronized String g() {
        try {
            if (d == null) {
                SharedPreferences sharedPreferences = odt.b().getSharedPreferences("XMPushServiceConfig", 0);
                String string = sharedPreferences.getString("DeviceUUID", null);
                d = string;
                if (string == null) {
                    String strH = lzs.h(odt.b(), false);
                    d = strH;
                    if (strH != null) {
                        sharedPreferences.edit().putString("DeviceUUID", d).commit();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return d;
    }

    public int a() throws Throwable {
        m();
        cqs cqsVar = this.f32454b;
        if (cqsVar != null) {
            return cqsVar.u();
        }
        return 0;
    }

    public cqs d() throws Throwable {
        m();
        return this.f32454b;
    }

    public synchronized void i() {
        this.f32453a.clear();
    }

    public synchronized void j(a aVar) {
        this.f32453a.add(aVar);
    }

    public void l(fqs fqsVar) {
        a[] aVarArr;
        if (fqsVar.u() && fqsVar.t() > a()) {
            n();
        }
        synchronized (this) {
            List<a> list = this.f32453a;
            aVarArr = (a[]) list.toArray(new a[list.size()]);
        }
        for (a aVar : aVarArr) {
            aVar.c(fqsVar);
        }
    }

    public final void m() throws Throwable {
        if (this.f32454b == null) {
            o();
        }
    }

    public final void n() {
        if (this.c != null) {
            return;
        }
        vds vdsVar = new vds(this);
        this.c = vdsVar;
        vys.a(vdsVar);
    }

    public final void o() throws Throwable {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        Exception e2;
        try {
            try {
                bufferedInputStream = new BufferedInputStream(odt.b().openFileInput("XMCloudCfg"));
                try {
                    this.f32454b = cqs.r(cas.f(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Exception e3) {
                    e2 = e3;
                    x9s.o("load config failure: " + e2.getMessage());
                }
            } catch (Throwable th2) {
                th = th2;
                mgt.b(bufferedInputStream);
                throw th;
            }
        } catch (Exception e4) {
            bufferedInputStream = null;
            e2 = e4;
        } catch (Throwable th3) {
            bufferedInputStream = null;
            th = th3;
            mgt.b(bufferedInputStream);
            throw th;
        }
        mgt.b(bufferedInputStream);
        if (this.f32454b == null) {
            this.f32454b = new cqs();
        }
    }

    public final void p() {
        try {
            if (this.f32454b != null) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(odt.b().openFileOutput("XMCloudCfg", 0));
                c cVarN = c.n(bufferedOutputStream);
                this.f32454b.e(cVarN);
                cVarN.q();
                bufferedOutputStream.close();
            }
        } catch (Exception e2) {
            x9s.o("save config failure: " + e2.getMessage());
        }
    }
}
