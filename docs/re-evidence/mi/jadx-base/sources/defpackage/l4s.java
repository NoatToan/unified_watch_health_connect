package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.mipush.sdk.aq;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class l4s {
    public static volatile l4s c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f24671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<qet> f24672b = new ArrayList();

    public l4s(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f24671a = applicationContext;
        if (applicationContext == null) {
            this.f24671a = context;
        }
    }

    public static l4s b(Context context) {
        if (c == null) {
            synchronized (l4s.class) {
                try {
                    if (c == null) {
                        c = new l4s(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public int a(String str) {
        synchronized (this.f24672b) {
            try {
                qet qetVar = new qet();
                qetVar.f31459b = str;
                if (this.f24672b.contains(qetVar)) {
                    for (qet qetVar2 : this.f24672b) {
                        if (qetVar2.equals(qetVar)) {
                            return qetVar2.f31458a;
                        }
                    }
                }
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized String c(aq aqVar) {
        return this.f24671a.getSharedPreferences("mipush_extra", 0).getString(aqVar.name(), "");
    }

    public synchronized void d(aq aqVar, String str) {
        SharedPreferences sharedPreferences = this.f24671a.getSharedPreferences("mipush_extra", 0);
        sharedPreferences.edit().putString(aqVar.name(), str).apply();
    }

    public void e(String str) {
        synchronized (this.f24672b) {
            try {
                qet qetVar = new qet();
                qetVar.f31458a = 0;
                qetVar.f31459b = str;
                if (this.f24672b.contains(qetVar)) {
                    this.f24672b.remove(qetVar);
                }
                this.f24672b.add(qetVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean f(String str) {
        synchronized (this.f24672b) {
            try {
                qet qetVar = new qet();
                qetVar.f31459b = str;
                return this.f24672b.contains(qetVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void g(String str) {
        synchronized (this.f24672b) {
            try {
                qet qetVar = new qet();
                qetVar.f31459b = str;
                if (this.f24672b.contains(qetVar)) {
                    for (qet qetVar2 : this.f24672b) {
                        if (qetVar.equals(qetVar2)) {
                            qetVar = qetVar2;
                            break;
                        }
                    }
                }
                qetVar.f31458a++;
                this.f24672b.remove(qetVar);
                this.f24672b.add(qetVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void h(String str) {
        synchronized (this.f24672b) {
            try {
                qet qetVar = new qet();
                qetVar.f31459b = str;
                if (this.f24672b.contains(qetVar)) {
                    this.f24672b.remove(qetVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
