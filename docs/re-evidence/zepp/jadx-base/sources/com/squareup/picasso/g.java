package com.squareup.picasso;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import io.flutter.plugins.connectivity.ConnectivityBroadcastReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes18.dex */
class g {
    public static final int A = 8;
    public static final int B = 9;
    public static final int C = 10;
    public static final int D = 11;
    public static final int E = 12;
    public static final int F = 13;
    private static final String G = "Dispatcher";
    private static final int H = 200;
    private static final int q = 500;
    private static final int r = 1;
    private static final int s = 0;
    public static final int t = 1;
    public static final int u = 2;
    public static final int v = 3;
    public static final int w = 4;
    public static final int x = 5;
    public static final int y = 6;
    public static final int z = 7;
    public final c a;
    public final Context b;
    public final ExecutorService c;
    public final Downloader d;
    public final Map<String, com.squareup.picasso.c> e;
    public final Map<Object, com.squareup.picasso.a> f;
    public final Map<Object, com.squareup.picasso.a> g;
    public final Set<Object> h;
    public final Handler i;
    public final Handler j;
    public final Cache k;
    public final s l;
    public final List<com.squareup.picasso.c> m;
    public final d n;
    public final boolean o;
    public boolean p;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.n.b();
        }
    }

    public static class b extends Handler {
        private final g a;

        public class a implements Runnable {
            public final /* synthetic */ Message a;

            public a(Message message) {
                this.a = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.a.what);
            }
        }

        public b(Looper looper, g gVar) {
            super(looper);
            this.a = gVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.a.x((com.squareup.picasso.a) message.obj);
                    break;
                case 2:
                    this.a.q((com.squareup.picasso.a) message.obj);
                    break;
                case 3:
                case 8:
                default:
                    Picasso.q.post(new a(message));
                    break;
                case 4:
                    this.a.r((com.squareup.picasso.c) message.obj);
                    break;
                case 5:
                    this.a.w((com.squareup.picasso.c) message.obj);
                    break;
                case 6:
                    this.a.s((com.squareup.picasso.c) message.obj, false);
                    break;
                case 7:
                    this.a.p();
                    break;
                case 9:
                    this.a.t((NetworkInfo) message.obj);
                    break;
                case 10:
                    this.a.o(message.arg1 == 1);
                    break;
                case 11:
                    this.a.u(message.obj);
                    break;
                case 12:
                    this.a.v(message.obj);
                    break;
            }
        }
    }

    public static class c extends HandlerThread {
        public c() {
            super("Picasso-Dispatcher", 10);
        }
    }

    public static class d extends BroadcastReceiver {
        public static final String b = "state";
        private final g a;

        public d(g gVar) {
            this.a = gVar;
        }

        public void a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.a.o) {
                intentFilter.addAction(ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION);
            }
            this.a.b.registerReceiver(this, intentFilter);
        }

        public void b() {
            this.a.b.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                if (intent.hasExtra("state")) {
                    this.a.b(intent.getBooleanExtra("state", false));
                }
            } else if (ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION.equals(action)) {
                this.a.f(((ConnectivityManager) u.q(context, "connectivity")).getActiveNetworkInfo());
            }
        }
    }

    public g(Context context, ExecutorService executorService, Handler handler, Downloader downloader, Cache cache, s sVar) {
        c cVar = new c();
        this.a = cVar;
        cVar.start();
        u.k(cVar.getLooper());
        this.b = context;
        this.c = executorService;
        this.e = new LinkedHashMap();
        this.f = new WeakHashMap();
        this.g = new WeakHashMap();
        this.h = new HashSet();
        this.i = new b(cVar.getLooper(), this);
        this.d = downloader;
        this.j = handler;
        this.k = cache;
        this.l = sVar;
        this.m = new ArrayList(4);
        this.p = u.s(context);
        this.o = u.r(context, "android.permission.ACCESS_NETWORK_STATE");
        d dVar = new d(this);
        this.n = dVar;
        dVar.a();
    }

    private void a(com.squareup.picasso.c cVar) {
        if (cVar.s()) {
            return;
        }
        this.m.add(cVar);
        if (this.i.hasMessages(7)) {
            return;
        }
        this.i.sendEmptyMessageDelayed(7, 200L);
    }

    private void k() {
        if (this.f.isEmpty()) {
            return;
        }
        Iterator<com.squareup.picasso.a> it2 = this.f.values().iterator();
        while (it2.hasNext()) {
            com.squareup.picasso.a next = it2.next();
            it2.remove();
            if (next.g().n) {
                u.v("Dispatcher", u.C, next.i().c());
            }
            y(next, false);
        }
    }

    private void l(List<com.squareup.picasso.c> list) {
        if (list == null || list.isEmpty() || !list.get(0).o().n) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (com.squareup.picasso.c cVar : list) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(u.m(cVar));
        }
        u.v("Dispatcher", u.B, sb.toString());
    }

    private void m(com.squareup.picasso.a aVar) {
        Object objK = aVar.k();
        if (objK != null) {
            aVar.k = true;
            this.f.put(objK, aVar);
        }
    }

    private void n(com.squareup.picasso.c cVar) {
        com.squareup.picasso.a aVarH = cVar.h();
        if (aVarH != null) {
            m(aVarH);
        }
        List<com.squareup.picasso.a> listI = cVar.i();
        if (listI != null) {
            int size = listI.size();
            for (int i = 0; i < size; i++) {
                m(listI.get(i));
            }
        }
    }

    public void b(boolean z2) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(10, z2 ? 1 : 0, 0));
    }

    public void c(com.squareup.picasso.a aVar) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(2, aVar));
    }

    public void d(com.squareup.picasso.c cVar) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(4, cVar));
    }

    public void e(com.squareup.picasso.c cVar) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(6, cVar));
    }

    public void f(NetworkInfo networkInfo) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    public void g(Object obj) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(11, obj));
    }

    public void h(Object obj) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(12, obj));
    }

    public void i(com.squareup.picasso.c cVar) {
        Handler handler = this.i;
        handler.sendMessageDelayed(handler.obtainMessage(5, cVar), 500L);
    }

    public void j(com.squareup.picasso.a aVar) {
        Handler handler = this.i;
        handler.sendMessage(handler.obtainMessage(1, aVar));
    }

    public void o(boolean z2) {
        this.p = z2;
    }

    public void p() {
        ArrayList arrayList = new ArrayList(this.m);
        this.m.clear();
        Handler handler = this.j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        l(arrayList);
    }

    public void q(com.squareup.picasso.a aVar) {
        String strD = aVar.d();
        com.squareup.picasso.c cVar = this.e.get(strD);
        if (cVar != null) {
            cVar.f(aVar);
            if (cVar.c()) {
                this.e.remove(strD);
                if (aVar.g().n) {
                    u.v("Dispatcher", u.t, aVar.i().c());
                }
            }
        }
        if (this.h.contains(aVar.j())) {
            this.g.remove(aVar.k());
            if (aVar.g().n) {
                u.w("Dispatcher", u.t, aVar.i().c(), "because paused request got canceled");
            }
        }
        com.squareup.picasso.a aVarRemove = this.f.remove(aVar.k());
        if (aVarRemove == null || !aVarRemove.g().n) {
            return;
        }
        u.w("Dispatcher", u.t, aVarRemove.i().c(), "from replaying");
    }

    public void r(com.squareup.picasso.c cVar) {
        if (MemoryPolicy.b(cVar.n())) {
            this.k.set(cVar.l(), cVar.q());
        }
        this.e.remove(cVar.l());
        a(cVar);
        if (cVar.o().n) {
            u.w("Dispatcher", u.u, u.m(cVar), "for completion");
        }
    }

    public void s(com.squareup.picasso.c cVar, boolean z2) {
        if (cVar.o().n) {
            String strM = u.m(cVar);
            StringBuilder sb = new StringBuilder();
            sb.append("for error");
            sb.append(z2 ? " (will replay)" : "");
            u.w("Dispatcher", u.u, strM, sb.toString());
        }
        this.e.remove(cVar.l());
        a(cVar);
    }

    public void t(NetworkInfo networkInfo) {
        ExecutorService executorService = this.c;
        if (executorService instanceof p) {
            ((p) executorService).a(networkInfo);
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return;
        }
        k();
    }

    public void u(Object obj) {
        if (this.h.add(obj)) {
            Iterator<com.squareup.picasso.c> it2 = this.e.values().iterator();
            while (it2.hasNext()) {
                com.squareup.picasso.c next = it2.next();
                boolean z2 = next.o().n;
                com.squareup.picasso.a aVarH = next.h();
                List<com.squareup.picasso.a> listI = next.i();
                boolean z3 = (listI == null || listI.isEmpty()) ? false : true;
                if (aVarH != null || z3) {
                    if (aVarH != null && aVarH.j().equals(obj)) {
                        next.f(aVarH);
                        this.g.put(aVarH.k(), aVarH);
                        if (z2) {
                            u.w("Dispatcher", u.F, aVarH.b.c(), "because tag '" + obj + "' was paused");
                        }
                    }
                    if (z3) {
                        for (int size = listI.size() - 1; size >= 0; size--) {
                            com.squareup.picasso.a aVar = listI.get(size);
                            if (aVar.j().equals(obj)) {
                                next.f(aVar);
                                this.g.put(aVar.k(), aVar);
                                if (z2) {
                                    u.w("Dispatcher", u.F, aVar.b.c(), "because tag '" + obj + "' was paused");
                                }
                            }
                        }
                    }
                    if (next.c()) {
                        it2.remove();
                        if (z2) {
                            u.w("Dispatcher", u.t, u.m(next), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    public void v(Object obj) {
        if (this.h.remove(obj)) {
            ArrayList arrayList = null;
            Iterator<com.squareup.picasso.a> it2 = this.g.values().iterator();
            while (it2.hasNext()) {
                com.squareup.picasso.a next = it2.next();
                if (next.j().equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(next);
                    it2.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.j;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    public void w(com.squareup.picasso.c cVar) {
        if (cVar.s()) {
            return;
        }
        boolean z2 = false;
        if (this.c.isShutdown()) {
            s(cVar, false);
            return;
        }
        NetworkInfo activeNetworkInfo = this.o ? ((ConnectivityManager) u.q(this.b, "connectivity")).getActiveNetworkInfo() : null;
        boolean z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean zU = cVar.u(this.p, activeNetworkInfo);
        boolean zV = cVar.v();
        if (!zU) {
            if (this.o && zV) {
                z2 = true;
            }
            s(cVar, z2);
            if (z2) {
                n(cVar);
                return;
            }
            return;
        }
        if (this.o && !z3) {
            s(cVar, zV);
            if (zV) {
                n(cVar);
                return;
            }
            return;
        }
        if (cVar.o().n) {
            u.v("Dispatcher", u.v, u.m(cVar));
        }
        if (cVar.k() instanceof n.a) {
            cVar.i |= NetworkPolicy.NO_CACHE.index;
        }
        cVar.n = this.c.submit(cVar);
    }

    public void x(com.squareup.picasso.a aVar) {
        y(aVar, true);
    }

    public void y(com.squareup.picasso.a aVar, boolean z2) {
        if (this.h.contains(aVar.j())) {
            this.g.put(aVar.k(), aVar);
            if (aVar.g().n) {
                u.w("Dispatcher", u.F, aVar.b.c(), "because tag '" + aVar.j() + "' is paused");
                return;
            }
            return;
        }
        com.squareup.picasso.c cVar = this.e.get(aVar.d());
        if (cVar != null) {
            cVar.b(aVar);
            return;
        }
        if (this.c.isShutdown()) {
            if (aVar.g().n) {
                u.w("Dispatcher", u.r, aVar.b.c(), "because shut down");
                return;
            }
            return;
        }
        com.squareup.picasso.c cVarG = com.squareup.picasso.c.g(aVar.g(), this, this.k, this.l, aVar);
        cVarG.n = this.c.submit(cVarG);
        this.e.put(aVar.d(), cVarG);
        if (z2) {
            this.f.remove(aVar.k());
        }
        if (aVar.g().n) {
            u.v("Dispatcher", u.s, aVar.b.c());
        }
    }

    public void z() {
        ExecutorService executorService = this.c;
        if (executorService instanceof p) {
            executorService.shutdown();
        }
        this.d.shutdown();
        this.a.quit();
        Picasso.q.post(new a());
    }
}
