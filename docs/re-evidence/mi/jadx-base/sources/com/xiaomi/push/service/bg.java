package com.xiaomi.push.service;

import android.content.Context;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaomi.smarthome.framework.api.UserConfig;
import defpackage.ccs;
import defpackage.gv5;
import defpackage.x9s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class bg {
    public static bg c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap<String, HashMap<String, b>> f14194a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<a> f14195b = new ArrayList();

    public interface a {
        void a();
    }

    public enum c {
        unbind,
        binding,
        binded
    }

    public static synchronized bg c() {
        try {
            if (c == null) {
                c = new bg();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public synchronized int a() {
        return this.f14194a.size();
    }

    public synchronized b b(String str, String str2) {
        HashMap<String, b> map = this.f14194a.get(str);
        if (map == null) {
            return null;
        }
        return map.get(d(str2));
    }

    public final String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int iIndexOf = str.indexOf(gv5.CONNECT_VALUE_STR);
        return iIndexOf > 0 ? str.substring(0, iIndexOf) : str;
    }

    public synchronized ArrayList<b> e() {
        ArrayList<b> arrayList;
        arrayList = new ArrayList<>();
        Iterator<HashMap<String, b>> it = this.f14194a.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().values());
        }
        return arrayList;
    }

    public synchronized Collection<b> f(String str) {
        if (this.f14194a.containsKey(str)) {
            return ((HashMap) this.f14194a.get(str).clone()).values();
        }
        return new ArrayList();
    }

    public synchronized List<String> g(String str) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<HashMap<String, b>> it = this.f14194a.values().iterator();
        while (it.hasNext()) {
            for (b bVar : it.next().values()) {
                if (str.equals(bVar.f14196a)) {
                    arrayList.add(bVar.h);
                }
            }
        }
        return arrayList;
    }

    public synchronized void h() {
        try {
            Iterator<b> it = e().iterator();
            while (it.hasNext()) {
                it.next().f();
            }
            this.f14194a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void i(Context context) {
        Iterator<HashMap<String, b>> it = this.f14194a.values().iterator();
        while (it.hasNext()) {
            Iterator<b> it2 = it.next().values().iterator();
            while (it2.hasNext()) {
                it2.next().k(c.unbind, 1, 3, null, null);
            }
        }
    }

    public synchronized void j(Context context, int i) {
        Iterator<HashMap<String, b>> it = this.f14194a.values().iterator();
        while (it.hasNext()) {
            Iterator<b> it2 = it.next().values().iterator();
            while (it2.hasNext()) {
                it2.next().k(c.unbind, 2, i, null, null);
            }
        }
    }

    public synchronized void k(a aVar) {
        this.f14195b.add(aVar);
    }

    public synchronized void l(b bVar) {
        try {
            HashMap<String, b> map = this.f14194a.get(bVar.h);
            if (map == null) {
                map = new HashMap<>();
                this.f14194a.put(bVar.h, map);
            }
            map.put(d(bVar.f14197b), bVar);
            x9s.o("add active client. " + bVar.f14196a);
            Iterator<a> it = this.f14195b.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void m(String str) {
        try {
            HashMap<String, b> map = this.f14194a.get(str);
            if (map != null) {
                Iterator<b> it = map.values().iterator();
                while (it.hasNext()) {
                    it.next().f();
                }
                map.clear();
                this.f14194a.remove(str);
            }
            Iterator<a> it2 = this.f14195b.iterator();
            while (it2.hasNext()) {
                it2.next().a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void n(String str, String str2) {
        try {
            HashMap<String, b> map = this.f14194a.get(str);
            if (map != null) {
                b bVar = map.get(d(str2));
                if (bVar != null) {
                    bVar.f();
                }
                map.remove(d(str2));
                if (map.isEmpty()) {
                    this.f14194a.remove(str);
                }
            }
            Iterator<a> it = this.f14195b.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void o() {
        this.f14195b.clear();
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f14196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f14197b;
        public String c;
        public String d;
        public boolean e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public i0 f14198k;
        public Context l;
        public XMPushService p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Messenger f14199r;
        public c m = c.unbind;
        public int n = 0;
        public final CopyOnWriteArrayList<a> o = new CopyOnWriteArrayList<>();
        public c q = null;
        public boolean s = false;
        public XMPushService.c t = new XMPushService.c(this);
        public IBinder.DeathRecipient u = null;
        public final C0844b v = new C0844b();

        public interface a {
            void a(c cVar, c cVar2, int i);
        }

        /* JADX INFO: renamed from: com.xiaomi.push.service.bg$b$b, reason: collision with other inner class name */
        public class C0844b extends XMPushService.j {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f14200b;
            public int c;
            public String d;
            public String e;

            public C0844b() {
                super(0);
            }

            @Override // com.xiaomi.push.service.XMPushService.j
            public String a() {
                return "notify job";
            }

            @Override // com.xiaomi.push.service.XMPushService.j
            public void b() {
                if (b.this.l(this.f14200b, this.c, this.e)) {
                    b.this.g(this.f14200b, this.c, this.d, this.e);
                    return;
                }
                x9s.y(" ignore notify client :" + b.this.h);
            }

            public XMPushService.j c(int i, int i2, String str, String str2) {
                this.f14200b = i;
                this.c = i2;
                this.e = str2;
                this.d = str;
                return this;
            }
        }

        public class c implements IBinder.DeathRecipient {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f14201a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Messenger f14202b;

            public c(b bVar, Messenger messenger) {
                this.f14201a = bVar;
                this.f14202b = messenger;
            }

            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                x9s.y("peer died, chid = " + this.f14201a.h);
                b.this.p.a(new q(this, 0), 0L);
                if (UserConfig.KEY_LITE_SCENE_ORDER.equals(this.f14201a.h) && "com.xiaomi.xmsf".equals(b.this.p.getPackageName())) {
                    b.this.p.a(new r(this, 0), 60000L);
                }
            }
        }

        public b() {
        }

        public static String e(String str) {
            int iLastIndexOf;
            return (TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf("/")) == -1) ? "" : str.substring(iLastIndexOf + 1);
        }

        public long a() {
            return (((long) ((Math.random() * 20.0d) - 10.0d)) + ((long) ((this.n + 1) * 15))) * 1000;
        }

        public String d(int i) {
            if (i == 1) {
                return "OPEN";
            }
            if (i != 2) {
                return i != 3 ? "unknown" : "KICK";
            }
            return "CLOSE";
        }

        public void f() {
            try {
                Messenger messenger = this.f14199r;
                if (messenger != null && this.u != null) {
                    messenger.getBinder().unlinkToDeath(this.u, 0);
                }
            } catch (Exception unused) {
            }
            this.q = null;
        }

        public final void g(int i, int i2, String str, String str2) {
            c cVar = this.m;
            this.q = cVar;
            if (i == 2) {
                this.f14198k.f(this.l, this, i2);
                return;
            }
            if (i == 3) {
                this.f14198k.g(this.l, this, str2, str);
                return;
            }
            if (i == 1) {
                boolean z = cVar == c.binded;
                if (!z && "wait".equals(str2)) {
                    this.n++;
                } else if (z) {
                    this.n = 0;
                    if (this.f14199r != null) {
                        try {
                            this.f14199r.send(Message.obtain(null, 16, this.p.f421a));
                        } catch (RemoteException unused) {
                        }
                    }
                }
                this.f14198k.h(this.p, this, z, i2, str);
            }
        }

        public void h(Messenger messenger) {
            f();
            try {
                if (messenger != null) {
                    this.f14199r = messenger;
                    this.s = true;
                    this.u = new c(this, messenger);
                    messenger.getBinder().linkToDeath(this.u, 0);
                } else {
                    x9s.y("peer linked with old sdk chid = " + this.h);
                }
            } catch (Exception e) {
                x9s.y("peer linkToDeath err: " + e.getMessage());
                this.f14199r = null;
                this.s = false;
            }
        }

        public void i(a aVar) {
            this.o.add(aVar);
        }

        public void k(c cVar, int i, int i2, String str, String str2) {
            boolean z;
            for (a aVar : this.o) {
                if (aVar != null) {
                    aVar.a(this.m, cVar, i2);
                }
            }
            c cVar2 = this.m;
            if (cVar2 != cVar) {
                x9s.o(String.format("update the client %7$s status. %1$s->%2$s %3$s %4$s %5$s %6$s", cVar2, cVar, d(i), ccs.a(i2), str, str2, this.h));
                this.m = cVar;
            }
            if (this.f14198k == null) {
                x9s.D("status changed while the client dispatcher is missing");
                return;
            }
            if (cVar == c.binding) {
                return;
            }
            int i3 = (this.q == null || !(z = this.s)) ? 0 : (this.f14199r == null || !z) ? 10100 : 1000;
            this.p.b(this.v);
            if (o(i, i2, str2)) {
                g(i, i2, str, str2);
            } else {
                this.p.a(this.v.c(i, i2, str, str2), i3);
            }
        }

        public final boolean l(int i, int i2, String str) {
            boolean z;
            c cVar = this.q;
            if (cVar == null || !(z = this.s)) {
                return true;
            }
            if (cVar == this.m) {
                x9s.y(" status recovered, don't notify client:" + this.h);
                return false;
            }
            if (this.f14199r == null || !z) {
                x9s.y("peer died, ignore notify " + this.h);
                return false;
            }
            x9s.y("Peer alive notify status to client:" + this.h);
            return true;
        }

        public void n(a aVar) {
            this.o.remove(aVar);
        }

        public final boolean o(int i, int i2, String str) {
            if (i == 1) {
                return (this.m == c.binded || !this.p.m836c() || i2 == 21 || (i2 == 7 && "wait".equals(str))) ? false : true;
            }
            if (i == 2) {
                return this.p.m836c();
            }
            if (i != 3) {
                return false;
            }
            return !"wait".equals(str);
        }

        public b(XMPushService xMPushService) {
            this.p = xMPushService;
            i(new p(this));
        }
    }
}
