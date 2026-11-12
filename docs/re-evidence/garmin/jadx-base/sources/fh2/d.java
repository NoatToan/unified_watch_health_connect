package fh2;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import da2.e;
import java.util.Iterator;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import ma2.f;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pj2.k;
import pj2.l;
import xm2.g;
import xm2.h;
import xm2.i;
import xm2.m;
import xm2.n;
import xm2.o;
import xm2.p;
import xm2.q;
import xm2.r;
import xm2.s;
import xm2.t;

/* JADX INFO: loaded from: classes11.dex */
public class d implements f, l, g.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f71626f = LoggerFactory.getLogger("RealTimeSubscriber");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ConcurrentHashMap<String, d> f71627g = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Timer f71628a = new Timer();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f71629b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public UUID[] f71630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f71631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f71632e;

    public static class a implements f.a {
        @Override // ma2.f.a
        public final f create(Context context, e eVar, k kVar) {
            return new d(kVar);
        }
    }

    public d(k kVar) {
        this.f71631d = kVar;
        this.f71632e = kVar.getMacAddress();
    }

    public static String d(UUID uuid) {
        h hVar = (h) zm2.a.f205369n.get(uuid);
        return hVar != null ? hVar.name() : uuid.toString();
    }

    @Override // pj2.l
    public final void a(k kVar, UUID uuid, UUID uuid2, byte[] bArr) {
        CopyOnWriteArraySet<ym2.a> copyOnWriteArraySet;
        h hVar = (h) zm2.a.f205369n.get(uuid2);
        f71626f.debug("onBlePacketReceived: " + hVar + StringUtils.SPACE + dz2.c.a(bArr));
        if (hVar != null) {
            g.f191527c.getClass();
            g gVarB = g.a.b();
            String macAddress = kVar.getMacAddress();
            gVarB.getClass();
            macAddress.getClass();
            if (bArr == null || bArr.length == 0 || (copyOnWriteArraySet = g.f191531g.get(hVar)) == null || copyOnWriteArraySet.size() == 0) {
                return;
            }
            p pVar = null;
            if (bArr.length != 0) {
                p pVar2 = new p(hVar);
                try {
                    switch (m.f191564a[hVar.ordinal()]) {
                        case 1:
                            pVar2.f191570a = new r(bArr);
                            pVar = pVar2;
                            break;
                        case 2:
                            pVar2.f191571b = new n(bArr);
                            pVar = pVar2;
                            break;
                        case 3:
                            new xm2.k(bArr);
                            pVar = pVar2;
                            break;
                        case 4:
                            pVar2.f191572c = new xm2.f(bArr);
                            pVar = pVar2;
                            break;
                        case 5:
                            pVar2.f191573d = new xm2.d(bArr);
                            pVar = pVar2;
                            break;
                        case 6:
                            pVar2.f191574e = new xm2.l(bArr);
                            pVar = pVar2;
                            break;
                        case 7:
                            pVar2.f191575f = new i(bArr);
                            pVar = pVar2;
                            break;
                        case 8:
                            new s(bArr);
                            pVar = pVar2;
                            break;
                        case 9:
                            new xm2.b(bArr);
                            pVar = pVar2;
                            break;
                        case 10:
                            new q(bArr);
                            pVar = pVar2;
                            break;
                        case 11:
                            pVar2.f191576g = new o(bArr);
                            pVar = pVar2;
                            break;
                        case 12:
                            pVar2.f191577h = new xm2.e(bArr);
                            pVar = pVar2;
                            break;
                        case 13:
                            new xm2.c(bArr);
                            pVar = pVar2;
                            break;
                        case 14:
                            pVar2.f191578i = new t(bArr);
                            pVar = pVar2;
                            break;
                    }
                } catch (Exception unused) {
                }
            }
            if (pVar == null) {
                return;
            }
            Iterator<ym2.a> it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                it.next().a(macAddress, hVar, pVar);
            }
        }
    }

    @Override // xm2.g.b
    public final void b(h hVar) {
        UUID uuid = (UUID) zm2.a.f205368m.get(hVar);
        if (g(uuid) && g(uuid)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis >= this.f71629b) {
                e(uuid);
            } else {
                Timer timer = this.f71628a;
                if (timer != null) {
                    timer.schedule(new c(this, uuid), this.f71629b - jCurrentTimeMillis);
                }
            }
            long j8 = this.f71629b;
            this.f71629b = j8 > jCurrentTimeMillis ? j8 + 500 : jCurrentTimeMillis + 500;
        }
    }

    @Override // xm2.g.b
    public final void c(h hVar, byte[] bArr) {
        UUID uuid = (UUID) zm2.a.f205368m.get(hVar);
        if (!g(uuid)) {
            f71626f.trace("Ignoring unsupported characteristic " + d(uuid));
        } else if (g(uuid)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis >= this.f71629b) {
                f(uuid, bArr);
            } else {
                Timer timer = this.f71628a;
                if (timer != null) {
                    timer.schedule(new b(this, uuid, bArr), this.f71629b - jCurrentTimeMillis);
                }
            }
            long j8 = this.f71629b;
            this.f71629b = j8 > jCurrentTimeMillis ? j8 + 500 : jCurrentTimeMillis + 500;
        }
    }

    public final void e(UUID uuid) {
        UUID uuid2 = ma2.h.f117687o;
        k kVar = this.f71631d;
        kVar.e(this, uuid2, uuid);
        kVar.s(uuid2, uuid, false);
        f71626f.debug("DisableCharacteristic:" + d(uuid));
    }

    public final void f(UUID uuid, byte[] bArr) {
        UUID uuid2 = ma2.h.f117687o;
        k kVar = this.f71631d;
        kVar.a(this, uuid2, uuid);
        ListenableFuture<Void> listenableFutureS = kVar.s(uuid2, uuid, true);
        if (bArr != null && bArr.length > 0) {
            listenableFutureS.addListener(new fh2.a(this, 0, uuid, bArr), MoreExecutors.directExecutor());
        }
        f71626f.debug("EnableCharacteristic:" + d(uuid));
    }

    public final boolean g(UUID uuid) {
        UUID[] uuidArr;
        if (uuid != null && (uuidArr = this.f71630c) != null && uuidArr.length != 0) {
            for (UUID uuid2 : uuidArr) {
                if (uuid2.equals(uuid)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ma2.f
    public final boolean initialize(UUID uuid, UUID[] uuidArr) {
        ConcurrentHashMap<String, d> concurrentHashMap = f71627g;
        String str = this.f71632e;
        concurrentHashMap.put(str, this);
        g.f191527c.getClass();
        g gVarB = g.a.b();
        gVarB.getClass();
        str.getClass();
        g.f191530f.debug("Registering device that was connected.");
        gVarB.f191532a.put(str, this);
        this.f71630c = uuidArr;
        return true;
    }

    @Override // ma2.f
    public final void onDeviceDisconnect() {
        ConcurrentHashMap<String, d> concurrentHashMap = f71627g;
        String str = this.f71632e;
        concurrentHashMap.remove(str);
        g.f191527c.getClass();
        g gVarB = g.a.b();
        gVarB.getClass();
        str.getClass();
        g.f191530f.debug("Unregistering device that was disconnected.");
        gVarB.f191532a.remove(str);
        Timer timer = this.f71628a;
        if (timer != null) {
            timer.cancel();
            this.f71628a = null;
        }
    }
}
