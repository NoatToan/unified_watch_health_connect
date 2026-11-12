package jj;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile s f98933d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f98934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f98935b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f98936c;

    public class a implements qj.g<ConnectivityManager> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f98937a;

        public a(s sVar, Context context) {
            this.f98937a = context;
        }

        @Override // qj.g
        public final ConnectivityManager get() {
            return (ConnectivityManager) this.f98937a.getSystemService("connectivity");
        }
    }

    public class b implements jj.b.a {
        public b() {
        }

        @Override // jj.b.a
        public final void a(boolean z14) {
            ArrayList arrayList;
            qj.m.a();
            synchronized (s.this) {
                arrayList = new ArrayList(s.this.f98935b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((jj.b.a) it.next()).a(z14);
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f98939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final jj.b.a f98940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final qj.g<ConnectivityManager> f98941c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final a f98942d = new a();

        public class a extends ConnectivityManager.NetworkCallback {
            public a() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                qj.m.f().post(new t(this, true));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                qj.m.f().post(new t(this, false));
            }
        }

        public c(qj.g<ConnectivityManager> gVar, jj.b.a aVar) {
            this.f98941c = gVar;
            this.f98940b = aVar;
        }
    }

    private s(Context context) {
        this.f98934a = new c(new qj.f(new a(this, context)), new b());
    }

    public static s a(Context context) {
        if (f98933d == null) {
            synchronized (s.class) {
                try {
                    if (f98933d == null) {
                        f98933d = new s(context.getApplicationContext());
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return f98933d;
    }
}
