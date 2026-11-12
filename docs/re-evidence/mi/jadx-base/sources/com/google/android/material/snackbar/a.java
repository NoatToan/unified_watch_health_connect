package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public class a {
    public static a e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8831a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f8832b = new Handler(Looper.getMainLooper(), new C0218a());
    public c c;
    public c d;

    /* JADX INFO: renamed from: com.google.android.material.snackbar.a$a, reason: collision with other inner class name */
    public class C0218a implements Handler.Callback {
        public C0218a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a.this.d((c) message.obj);
            return true;
        }
    }

    public interface b {
        void a();

        void e(int i);
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<b> f8834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8835b;
        public boolean c;

        public c(int i, b bVar) {
            this.f8834a = new WeakReference<>(bVar);
            this.f8835b = i;
        }

        public boolean a(b bVar) {
            return bVar != null && this.f8834a.get() == bVar;
        }
    }

    public static a c() {
        if (e == null) {
            e = new a();
        }
        return e;
    }

    public final boolean a(c cVar, int i) {
        b bVar = cVar.f8834a.get();
        if (bVar == null) {
            return false;
        }
        this.f8832b.removeCallbacksAndMessages(cVar);
        bVar.e(i);
        return true;
    }

    public void b(b bVar, int i) {
        synchronized (this.f8831a) {
            try {
                if (f(bVar)) {
                    a(this.c, i);
                } else if (g(bVar)) {
                    a(this.d, i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(c cVar) {
        synchronized (this.f8831a) {
            try {
                if (this.c == cVar || this.d == cVar) {
                    a(cVar, 2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean e(b bVar) {
        boolean z;
        synchronized (this.f8831a) {
            try {
                z = f(bVar) || g(bVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final boolean f(b bVar) {
        c cVar = this.c;
        return cVar != null && cVar.a(bVar);
    }

    public final boolean g(b bVar) {
        c cVar = this.d;
        return cVar != null && cVar.a(bVar);
    }

    public void h(b bVar) {
        synchronized (this.f8831a) {
            try {
                if (f(bVar)) {
                    this.c = null;
                    if (this.d != null) {
                        n();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i(b bVar) {
        synchronized (this.f8831a) {
            try {
                if (f(bVar)) {
                    l(this.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(b bVar) {
        synchronized (this.f8831a) {
            try {
                if (f(bVar)) {
                    c cVar = this.c;
                    if (!cVar.c) {
                        cVar.c = true;
                        this.f8832b.removeCallbacksAndMessages(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(b bVar) {
        synchronized (this.f8831a) {
            try {
                if (f(bVar)) {
                    c cVar = this.c;
                    if (cVar.c) {
                        cVar.c = false;
                        l(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(c cVar) {
        int i = cVar.f8835b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED : 2750;
        }
        this.f8832b.removeCallbacksAndMessages(cVar);
        Handler handler = this.f8832b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i);
    }

    public void m(int i, b bVar) {
        synchronized (this.f8831a) {
            try {
                if (f(bVar)) {
                    c cVar = this.c;
                    cVar.f8835b = i;
                    this.f8832b.removeCallbacksAndMessages(cVar);
                    l(this.c);
                    return;
                }
                if (g(bVar)) {
                    this.d.f8835b = i;
                } else {
                    this.d = new c(i, bVar);
                }
                c cVar2 = this.c;
                if (cVar2 == null || !a(cVar2, 4)) {
                    this.c = null;
                    n();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        c cVar = this.d;
        if (cVar != null) {
            this.c = cVar;
            this.d = null;
            b bVar = cVar.f8834a.get();
            if (bVar != null) {
                bVar.a();
            } else {
                this.c = null;
            }
        }
    }
}
