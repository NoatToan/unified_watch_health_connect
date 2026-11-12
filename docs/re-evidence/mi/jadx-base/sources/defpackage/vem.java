package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import com.example.statistics.export.OneTrackConstant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class vem {
    public static volatile vem d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f36810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    public final Set<af4.a> f36811b = new HashSet();

    @GuardedBy("this")
    public boolean c;

    public class a implements c0b.b<ConnectivityManager> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f36812a;

        public a(Context context) {
            this.f36812a = context;
        }

        @Override // c0b.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f36812a.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
        }
    }

    public class b implements af4.a {
        public b() {
        }

        @Override // af4.a
        public void a(boolean z) {
            ArrayList arrayList;
            ulq.b();
            synchronized (vem.this) {
                arrayList = new ArrayList(vem.this.f36811b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((af4.a) it.next()).a(z);
            }
        }
    }

    public interface c {
        boolean a();

        void b();
    }

    @RequiresApi(24)
    public static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f36815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final af4.a f36816b;
        public final c0b.b<ConnectivityManager> c;
        public final ConnectivityManager.NetworkCallback d = new a();

        public class a extends ConnectivityManager.NetworkCallback {

            /* JADX INFO: renamed from: vem$d$a$a, reason: collision with other inner class name */
            public class RunnableC1122a implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f36818a;

                public RunnableC1122a(boolean z) {
                    this.f36818a = z;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.a(this.f36818a);
                }
            }

            public a() {
            }

            public void a(boolean z) {
                ulq.b();
                d dVar = d.this;
                boolean z2 = dVar.f36815a;
                dVar.f36815a = z;
                if (z2 != z) {
                    dVar.f36816b.a(z);
                }
            }

            public final void b(boolean z) {
                ulq.v(new RunnableC1122a(z));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                b(false);
            }
        }

        public d(c0b.b<ConnectivityManager> bVar, af4.a aVar) {
            this.c = bVar;
            this.f36816b = aVar;
        }

        @Override // vem.c
        @SuppressLint({"MissingPermission"})
        public boolean a() {
            this.f36815a = this.c.get().getActiveNetwork() != null;
            try {
                this.c.get().registerDefaultNetworkCallback(this.d);
                return true;
            } catch (RuntimeException unused) {
                Log.isLoggable("ConnectivityMonitor", 5);
                return false;
            }
        }

        @Override // vem.c
        public void b() {
            this.c.get().unregisterNetworkCallback(this.d);
        }
    }

    public vem(Context context) {
        this.f36810a = new d(c0b.a(new a(context)), new b());
    }

    public static vem a(Context context) {
        if (d == null) {
            synchronized (vem.class) {
                try {
                    if (d == null) {
                        d = new vem(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    @GuardedBy("this")
    public final void b() {
        if (this.c || this.f36811b.isEmpty()) {
            return;
        }
        this.c = this.f36810a.a();
    }

    @GuardedBy("this")
    public final void c() {
        if (this.c && this.f36811b.isEmpty()) {
            this.f36810a.b();
            this.c = false;
        }
    }

    public synchronized void d(af4.a aVar) {
        this.f36811b.add(aVar);
        b();
    }

    public synchronized void e(af4.a aVar) {
        this.f36811b.remove(aVar);
        c();
    }
}
