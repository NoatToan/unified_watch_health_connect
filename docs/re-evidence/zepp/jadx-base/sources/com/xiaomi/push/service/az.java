package com.xiaomi.push.service;

import android.content.Context;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huami.device.feature.notification.utils.PkgNameConstants;
import com.tencent.connect.common.Constants;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes22.dex */
public class az {
    private static az c;
    private ConcurrentHashMap<String, HashMap<String, b>> a = new ConcurrentHashMap<>();
    private List<a> b = new ArrayList();

    public interface a {
        void a();
    }

    public static class b {
        public Context a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        public j f205a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        public String f206a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        public boolean f207a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        private XMPushService m;
        public Messenger o;
        public c j = c.unbind;
        private int k = 0;
        private List<a> l = new ArrayList();
        public c n = null;
        private boolean p = false;
        private XMPushService.c q = new XMPushService.c(this);
        public IBinder.DeathRecipient r = null;
        public final C1046b s = new C1046b();

        public interface a {
            void a(c cVar, c cVar2, int i);
        }

        /* JADX INFO: renamed from: com.xiaomi.push.service.az$b$b, reason: collision with other inner class name */
        public class C1046b extends XMPushService.j {
            public int b;
            public int c;
            public String d;
            public String e;

            public C1046b() {
                super(0);
            }

            @Override // com.xiaomi.push.service.XMPushService.j
            public String a() {
                return "notify job";
            }

            @Override // com.xiaomi.push.service.XMPushService.j
            /* JADX INFO: renamed from: a */
            public void mo3788a() {
                if (b.this.h(this.b, this.c, this.e)) {
                    b.this.e(this.b, this.c, this.d, this.e);
                    return;
                }
                com.xiaomi.channel.commonutils.logger.b.b(" ignore notify client :" + b.this.g);
            }

            public XMPushService.j b(int i, int i2, String str, String str2) {
                this.b = i;
                this.c = i2;
                this.e = str2;
                this.d = str;
                return this;
            }
        }

        public class c implements IBinder.DeathRecipient {
            public final b a;
            public final Messenger b;

            public c(b bVar, Messenger messenger) {
                this.a = bVar;
                this.b = messenger;
            }

            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                com.xiaomi.channel.commonutils.logger.b.b("peer died, chid = " + this.a.g);
                b.this.m.a(new b0(this, 0), 0L);
                if ("9".equals(this.a.g) && PkgNameConstants.XMSF.equals(b.this.m.getPackageName())) {
                    b.this.m.a(new c0(this, 0), 60000L);
                }
            }
        }

        public b() {
        }

        public b(XMPushService xMPushService) {
            this.m = xMPushService;
            a(new a0(this));
        }

        public static String a(String str) {
            int iLastIndexOf;
            return (TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)) == -1) ? "" : str.substring(iLastIndexOf + 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(int i, int i2, String str, String str2) {
            c cVar = this.j;
            this.n = cVar;
            if (i == 2) {
                this.f205a.a(this.a, this, i2);
                return;
            }
            if (i == 3) {
                this.f205a.a(this.a, this, str2, str);
                return;
            }
            if (i == 1) {
                boolean z = cVar == c.binded;
                if (!z && "wait".equals(str2)) {
                    this.k++;
                } else if (z) {
                    this.k = 0;
                    if (this.o != null) {
                        try {
                            this.o.send(Message.obtain(null, 16, this.m.f183a));
                        } catch (RemoteException unused) {
                        }
                    }
                }
                this.f205a.a(this.m, this, z, i2, str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean h(int i, int i2, String str) {
            boolean z;
            StringBuilder sb;
            String str2;
            c cVar = this.n;
            if (cVar == null || !(z = this.p)) {
                return true;
            }
            if (cVar == this.j) {
                sb = new StringBuilder();
                str2 = " status recovered, don't notify client:";
            } else {
                if (this.o != null && z) {
                    com.xiaomi.channel.commonutils.logger.b.b("Peer alive notify status to client:" + this.g);
                    return true;
                }
                sb = new StringBuilder();
                str2 = "peer died, ignore notify ";
            }
            sb.append(str2);
            sb.append(this.g);
            com.xiaomi.channel.commonutils.logger.b.b(sb.toString());
            return false;
        }

        private boolean j(int i, int i2, String str) {
            if (i == 1) {
                return (this.j == c.binded || !this.m.m3811d() || i2 == 21 || (i2 == 7 && "wait".equals(str))) ? false : true;
            }
            if (i == 2) {
                return this.m.m3811d();
            }
            if (i != 3) {
                return false;
            }
            return !"wait".equals(str);
        }

        public long a() {
            return (((long) ((Math.random() * 20.0d) - 10.0d)) + ((long) ((this.k + 1) * 15))) * 1000;
        }

        public String a(int i) {
            if (i == 1) {
                return com.thanosfisherman.wifiutils.a.a;
            }
            if (i != 2) {
                return i != 3 ? "unknown" : "KICK";
            }
            return "CLOSE";
        }

        public void a(a aVar) {
            synchronized (this.l) {
                this.l.add(aVar);
            }
        }

        public void a(c cVar, int i, int i2, String str, String str2) {
            boolean z;
            synchronized (this.l) {
                Iterator<a> it2 = this.l.iterator();
                while (it2.hasNext()) {
                    it2.next().a(this.j, cVar, i2);
                }
            }
            c cVar2 = this.j;
            int i3 = 0;
            if (cVar2 != cVar) {
                com.xiaomi.channel.commonutils.logger.b.m3434a(String.format("update the client %7$s status. %1$s->%2$s %3$s %4$s %5$s %6$s", cVar2, cVar, a(i), bd.a(i2), str, str2, this.g));
                this.j = cVar;
            }
            if (this.f205a == null) {
                com.xiaomi.channel.commonutils.logger.b.d("status changed while the client dispatcher is missing");
                return;
            }
            if (cVar == c.binding) {
                return;
            }
            if (this.n != null && (z = this.p)) {
                i3 = (this.o == null || !z) ? Constants.REQUEST_API : 1000;
            }
            this.m.b(this.s);
            if (j(i, i2, str2)) {
                e(i, i2, str, str2);
            } else {
                this.m.a(this.s.b(i, i2, str, str2), i3);
            }
        }

        public void d() {
            try {
                Messenger messenger = this.o;
                if (messenger != null && this.r != null) {
                    messenger.getBinder().unlinkToDeath(this.r, 0);
                }
            } catch (Exception unused) {
            }
            this.n = null;
        }

        public void f(Messenger messenger) {
            d();
            try {
                if (messenger != null) {
                    this.o = messenger;
                    this.p = true;
                    this.r = new c(this, messenger);
                    messenger.getBinder().linkToDeath(this.r, 0);
                } else {
                    com.xiaomi.channel.commonutils.logger.b.b("peer linked with old sdk chid = " + this.g);
                }
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.b("peer linkToDeath err: " + e.getMessage());
                this.o = null;
                this.p = false;
            }
        }
    }

    public enum c {
        unbind,
        binding,
        binded
    }

    private az() {
    }

    public static synchronized az a() {
        if (c == null) {
            c = new az();
        }
        return c;
    }

    private String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int iIndexOf = str.indexOf("@");
        return iIndexOf > 0 ? str.substring(0, iIndexOf) : str;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized int m3824a() {
        return this.a.size();
    }

    public synchronized b a(String str, String str2) {
        HashMap<String, b> map = this.a.get(str);
        if (map == null) {
            return null;
        }
        return map.get(b(str2));
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized ArrayList<b> m3825a() {
        ArrayList<b> arrayList;
        arrayList = new ArrayList<>();
        Iterator<HashMap<String, b>> it2 = this.a.values().iterator();
        while (it2.hasNext()) {
            arrayList.addAll(it2.next().values());
        }
        return arrayList;
    }

    public synchronized Collection<b> a(String str) {
        if (this.a.containsKey(str)) {
            return ((HashMap) this.a.get(str).clone()).values();
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized List<String> m3826a(String str) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<HashMap<String, b>> it2 = this.a.values().iterator();
        while (it2.hasNext()) {
            for (b bVar : it2.next().values()) {
                if (str.equals(bVar.f206a)) {
                    arrayList.add(bVar.g);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized void m3827a() {
        Iterator<b> it2 = m3825a().iterator();
        while (it2.hasNext()) {
            it2.next().d();
        }
        this.a.clear();
    }

    public synchronized void a(Context context) {
        Iterator<HashMap<String, b>> it2 = this.a.values().iterator();
        while (it2.hasNext()) {
            Iterator<b> it3 = it2.next().values().iterator();
            while (it3.hasNext()) {
                it3.next().a(c.unbind, 1, 3, null, null);
            }
        }
    }

    public synchronized void a(Context context, int i) {
        Iterator<HashMap<String, b>> it2 = this.a.values().iterator();
        while (it2.hasNext()) {
            Iterator<b> it3 = it2.next().values().iterator();
            while (it3.hasNext()) {
                it3.next().a(c.unbind, 2, i, null, null);
            }
        }
    }

    public synchronized void a(a aVar) {
        this.b.add(aVar);
    }

    public synchronized void a(b bVar) {
        HashMap<String, b> map = this.a.get(bVar.g);
        if (map == null) {
            map = new HashMap<>();
            this.a.put(bVar.g, map);
        }
        map.put(b(bVar.b), bVar);
        com.xiaomi.channel.commonutils.logger.b.m3434a("add active client. " + bVar.f206a);
        Iterator<a> it2 = this.b.iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized void m3828a(String str) {
        HashMap<String, b> map = this.a.get(str);
        if (map != null) {
            Iterator<b> it2 = map.values().iterator();
            while (it2.hasNext()) {
                it2.next().d();
            }
            map.clear();
            this.a.remove(str);
        }
        Iterator<a> it3 = this.b.iterator();
        while (it3.hasNext()) {
            it3.next().a();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized void m3829a(String str, String str2) {
        HashMap<String, b> map = this.a.get(str);
        if (map != null) {
            b bVar = map.get(b(str2));
            if (bVar != null) {
                bVar.d();
            }
            map.remove(b(str2));
            if (map.isEmpty()) {
                this.a.remove(str);
            }
        }
        Iterator<a> it2 = this.b.iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
    }

    public synchronized void b() {
        this.b.clear();
    }
}
