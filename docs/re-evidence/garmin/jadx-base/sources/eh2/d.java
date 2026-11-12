package eh2;

import androidx.room.a0;
import com.garmin.device.multilink.MultiLinkException;
import com.garmin.device.multilink.reliable.MLRConnectionHelper;
import com.garmin.device.multilink.reliable.MLRInitializer;
import com.google.common.base.Function;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import eh2.d.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import ml2.l;
import ml2.m;
import ml2.r;
import ml2.s;
import ml2.y;
import ml2.z;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p13.h0;
import pj2.k;

/* JADX INFO: loaded from: classes11.dex */
public class d implements k, e, eh2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f64050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f64051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f64052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final UUID[] f64053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArraySet<b> f64054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ma2.f f64055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f64056g = false;

    public class a implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Integer f64057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ UUID f64058b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ UUID f64059c;

        public a(Integer num, UUID uuid, UUID uuid2) {
            this.f64057a = num;
            this.f64058b = uuid;
            this.f64059c = uuid2;
        }

        @Override // ml2.y
        public final void a(int i14, byte[] bArr) {
            d dVar = d.this;
            for (b bVar : dVar.f64054e) {
                if (bVar.f64062b.equals(this.f64057a)) {
                    bVar.f64061a.a(dVar, this.f64058b, this.f64059c, bArr);
                }
            }
        }

        @Override // ml2.y
        public final void c(int i14) {
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final pj2.l f64061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f64062b;

        public b(pj2.l lVar, Integer num) {
            this.f64061a = lVar;
            this.f64062b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                b bVar = (b) obj;
                if (Objects.equals(this.f64061a, bVar.f64061a) && Objects.equals(this.f64062b, bVar.f64062b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.f64061a, this.f64062b);
        }
    }

    public d(l lVar, UUID uuid, UUID[] uuidArr) {
        if (lVar == null) {
            vb.h.s("communicator is null");
            throw null;
        }
        if (uuid == null) {
            vb.h.s("service is null");
            throw null;
        }
        if (uuidArr == null || uuidArr.length == 0) {
            vb.h.s("chars is empty");
            throw null;
        }
        this.f64050a = LoggerFactory.getLogger(oa2.d.b("ML#", "MultiLinkLegacyShim", lVar.f119377d.getMacAddress(), -1L, this));
        this.f64051b = lVar;
        this.f64052c = uuid;
        this.f64053d = uuidArr;
        this.f64054e = new CopyOnWriteArraySet<>();
    }

    public static Integer g(UUID uuid, UUID uuid2) {
        xm2.h hVar;
        if (ma2.h.f117688p.equals(uuid)) {
            return 1;
        }
        if (!ma2.h.f117687o.equals(uuid) || (hVar = (xm2.h) zm2.a.f205369n.get(uuid2)) == null) {
            return null;
        }
        return Integer.valueOf(hVar.f191549a);
    }

    @Override // pj2.k
    public final void a(pj2.l lVar, UUID uuid, UUID uuid2) {
        if (uuid == null) {
            vb.h.s("service is null");
            return;
        }
        if (uuid2 == null) {
            vb.h.s("characteristic is null");
            return;
        }
        if (lVar == null) {
            vb.h.s("callback is null");
            return;
        }
        Integer numG = g(uuid, uuid2);
        if (numG != null) {
            this.f64054e.add(new b(lVar, numG));
            return;
        }
        this.f64050a.warn("service [" + uuid + "] and characteristic [" + uuid2 + "] do not map to a valid MultiLinkService");
    }

    @Override // eh2.e
    public final void b(int i14) {
        this.f64055f.initialize(this.f64052c, this.f64053d);
    }

    @Override // pj2.k
    public final ListenableFuture<Void> c(UUID uuid, UUID uuid2, byte[] bArr) {
        this.f64050a.warn("writeWithResponse not supported.  Falling back to standard write.");
        return j(uuid, uuid2, bArr);
    }

    @Override // eh2.a
    public final boolean d() {
        return this.f64056g;
    }

    @Override // eh2.e
    public final boolean delayStartUntilAfterHandshake() {
        ma2.f fVar = this.f64055f;
        return fVar == null || fVar.delayStartUntilAfterHandshake();
    }

    @Override // pj2.k
    public final void e(pj2.l lVar, UUID uuid, UUID uuid2) {
        if (uuid == null) {
            vb.h.s("service is null");
            return;
        }
        if (uuid2 == null) {
            vb.h.s("characteristic is null");
            return;
        }
        Integer numG = g(uuid, uuid2);
        if (numG == null) {
            this.f64050a.warn("service [" + uuid + "] and characteristic [" + uuid2 + "] do not map to a valid MultiLinkService");
            return;
        }
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArraySet<b> copyOnWriteArraySet = this.f64054e;
        for (b bVar : copyOnWriteArraySet) {
            if (bVar.f64061a.equals(lVar) && bVar.f64062b.equals(numG)) {
                arrayList.add(bVar);
            }
        }
        copyOnWriteArraySet.removeAll(arrayList);
    }

    @Override // pj2.k
    public final qj2.b f(UUID uuid, UUID uuid2) {
        return new qj2.b(this, uuid, uuid2);
    }

    @Override // pj2.k
    public final String getMacAddress() {
        return this.f64051b.f119377d.getMacAddress();
    }

    @Override // pj2.k
    public final String getName() {
        return this.f64051b.f119377d.getName();
    }

    @Override // pj2.k
    public final ListenableFuture<Void> j(UUID uuid, UUID uuid2, byte[] bArr) {
        s sVar;
        ml2.d dVar;
        Integer numG = g(uuid, uuid2);
        if (numG == null) {
            return Futures.immediateFailedFuture(new MultiLinkException("service [" + uuid + "] and characteristic [" + uuid2 + "] do not map to a valid MultiLinkService"));
        }
        l lVar = this.f64051b;
        lVar.getClass();
        if (bArr == null || bArr.length == 0) {
            vb.h.s("payload is invalid");
            return null;
        }
        synchronized (lVar.f119379f) {
            sVar = lVar.f119388o.get(numG);
        }
        if (sVar != null) {
            return sVar.g(new dz2.f(bArr));
        }
        MLRConnectionHelper mLRConnectionHelper = lVar.f119386m;
        if (mLRConnectionHelper != null && (dVar = mLRConnectionHelper.watchDog) != null) {
            int iIntValue = numG.intValue();
            Logger logger = dVar.f119317d;
            try {
                az2.a<Integer, ml2.d.C2269d> aVar = dVar.f119318e;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<Integer, ml2.d.C2269d> entry : aVar.entrySet()) {
                    if (entry.getValue().f119321a == iIntValue) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                ml2.d.C2269d c2269d = (ml2.d.C2269d) h0.c0(linkedHashMap.values());
                if (m.f119396c.contains(numG)) {
                    c2269d = new ml2.d.C2269d(iIntValue, dVar.f119315b);
                }
                logger.warn("resetConnectionIfMonitored: " + iIntValue + ", handles: [" + h0.k0(linkedHashMap.keySet(), null, null, null, null, 63) + "]");
                if (c2269d != null) {
                    ge1.b.T(dVar.f119316c, null, null, new ml2.f(dVar, "missing service", c2269d, null), 3);
                }
            } catch (Throwable th3) {
                logger.error("Failed to reset connection for service " + iIntValue, th3);
            }
        }
        return Futures.immediateFailedFuture(new IOException(a0.i("Service [", numG, "] not registered")));
    }

    @Override // pj2.k
    public final qj2.a k(UUID uuid, UUID uuid2) {
        return new qj2.a(this, uuid, uuid2);
    }

    @Override // pj2.k
    public final int l() {
        int iF = this.f64051b.f(this.f64056g);
        return this.f64056g ? iF * 16 : iF;
    }

    @Override // pj2.k
    public final List<UUID> n(UUID uuid) {
        return this.f64052c.equals(uuid) ? Arrays.asList(this.f64053d) : Collections.EMPTY_LIST;
    }

    @Override // eh2.e
    public final void onDeviceDisconnect() {
        ma2.f fVar = this.f64055f;
        if (fVar != null) {
            fVar.onDeviceDisconnect();
        }
    }

    @Override // pj2.k
    public final List<UUID> p() {
        return Collections.singletonList(this.f64052c);
    }

    @Override // pj2.k
    public final ListenableFuture<Void> s(final UUID uuid, final UUID uuid2, boolean z14) {
        s sVar;
        if (uuid != this.f64052c) {
            vb.h.s("Unknown service UUID");
            return null;
        }
        final Integer numG = g(uuid, uuid2);
        if (numG == null) {
            return Futures.immediateFailedFuture(new MultiLinkException("service [" + uuid + "] and characteristic [" + uuid2 + "] do not map to a valid MultiLinkService"));
        }
        if (z14) {
            return Futures.transform(this.f64051b.l(numG.intValue(), MLRInitializer.isLoaded() && this.f64052c == ma2.h.f117688p), new Function() { // from class: eh2.c
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    r rVar = (r) obj;
                    d dVar = this.f64046a;
                    rVar.d(dVar.new a(numG, uuid, uuid2));
                    dVar.f64056g = rVar.getF119442a().f119489b;
                    return null;
                }
            }, MoreExecutors.directExecutor());
        }
        l lVar = this.f64051b;
        synchronized (lVar.f119379f) {
            sVar = lVar.f119388o.get(numG);
        }
        if (sVar == null) {
            lVar.f119376c.warn("Closing unregistered handled");
            return Futures.immediateFuture(null);
        }
        sVar.h();
        z zVar = sVar.f119442a;
        return lVar.e(zVar.f119488a, zVar.f119490c);
    }

    @Override // pj2.k
    public final ListenableFuture<byte[]> v(UUID uuid, UUID uuid2) {
        throw new UnsupportedOperationException("Read not supported over Multi-Link");
    }

    @Override // pj2.k
    public final void w(pj2.l lVar) {
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArraySet<b> copyOnWriteArraySet = this.f64054e;
        for (b bVar : copyOnWriteArraySet) {
            if (bVar.f64061a.equals(lVar)) {
                arrayList.add(bVar);
            }
        }
        copyOnWriteArraySet.removeAll(arrayList);
    }
}
