package ml2;

import android.os.SystemClock;
import com.garmin.device.multilink.MultiLinkException;
import com.garmin.device.multilink.reliable.MLRConnectionHelper;
import com.google.common.base.Function;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements Closeable, nl2.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Logger f119376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pj2.k f119377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f119378e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public nl2.d f119383j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public UUID f119384k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i0 f119385l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public MLRConnectionHelper f119386m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f119374a = new g(this, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a73.l f119375b = new a73.l(this, 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f119379f = new byte[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap<Integer, s> f119380g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap<Integer, b> f119381h = new HashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap<Integer, ListenableFuture<r>> f119382i = new HashMap<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public eh2.b f119387n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final HashMap<Integer, s> f119388o = new HashMap<>();

    public class a implements FutureCallback<nl2.h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f119389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SettableFuture f119390b;

        public a(int i14, SettableFuture settableFuture) {
            this.f119389a = i14;
            this.f119390b = settableFuture;
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public final void onFailure(Throwable th3) {
            synchronized (l.this.f119379f) {
                l.this.f119382i.remove(Integer.valueOf(this.f119389a));
            }
            this.f119390b.setException(th3);
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public final void onSuccess(nl2.h hVar) {
            s sVar;
            int iOnOpenHandle;
            nl2.h hVar2 = hVar;
            if (hVar2 == null || hVar2.f126520d != 0) {
                synchronized (l.this.f119379f) {
                    l.this.f119382i.remove(Integer.valueOf(this.f119389a));
                }
                int i14 = hVar2 != null ? hVar2.f126520d : -1;
                l.this.f119376c.debug("Registration for {} failed: {}", Integer.valueOf(this.f119389a), Integer.valueOf(i14));
                this.f119390b.setException(new MultiLinkException("Register returned a bad status: ".concat(nl2.h.b(i14))));
                return;
            }
            l lVar = l.this;
            MLRConnectionHelper mLRConnectionHelper = lVar.f119386m;
            if (mLRConnectionHelper != null && (hVar2.f126523g & 1) != 0 && (iOnOpenHandle = mLRConnectionHelper.onOpenHandle(hVar2.f126521e, this.f119389a, lVar.f119377d.l())) != 0) {
                l.this.e(this.f119389a, hVar2.f126521e);
                onFailure(new MultiLinkException(am.j.h(iOnOpenHandle, "onOpenHandle failed: ")));
                return;
            }
            z zVar = new z(this.f119389a, (hVar2.f126523g & 1) != 0, hVar2.f126524h, hVar2.f126521e);
            synchronized (l.this.f119379f) {
                b bVarRemove = l.this.f119381h.remove(Integer.valueOf(hVar2.f126521e));
                ArrayList arrayList = null;
                if (bVarRemove != null && SystemClock.elapsedRealtime() - bVarRemove.f119392a < 3000) {
                    arrayList = bVarRemove.f119393b;
                }
                String macAddress = l.this.f119377d.getMacAddress();
                l lVar2 = l.this;
                sVar = new s(macAddress, zVar, lVar2, lVar2.f119385l, lVar2.f119386m, arrayList);
                l.this.f119380g.put(Integer.valueOf(hVar2.f126521e), sVar);
                l.this.f119388o.put(Integer.valueOf(this.f119389a), sVar);
                l.this.f119382i.remove(Integer.valueOf(this.f119389a));
            }
            this.f119390b.set(sVar);
            l.this.f119376c.debug("Multi-Link service {} communicating on handle {}, isReliable: {}", Integer.valueOf(this.f119389a), Integer.valueOf(hVar2.f126521e), Boolean.valueOf((hVar2.f126523g & 1) != 0));
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f119392a = SystemClock.elapsedRealtime();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f119393b = new ArrayList();
    }

    public l(pj2.k kVar, long j8) {
        if (kVar == null) {
            vb.h.s("gatt is null");
            throw null;
        }
        this.f119376c = LoggerFactory.getLogger(m.a("MultiLinkCommunicator", kVar.getMacAddress(), this));
        this.f119377d = kVar;
        this.f119378e = j8;
    }

    @Override // nl2.e
    public final void a(int i14) {
        j(i14);
    }

    @Override // nl2.e
    public final void c(int i14) {
        j(i14);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f119377d.w(this.f119374a);
        nl2.d dVar = this.f119383j;
        if (dVar != null) {
            dVar.close();
        }
        i0 i0Var = this.f119385l;
        if (i0Var != null) {
            i0Var.close();
        }
        MLRConnectionHelper mLRConnectionHelper = this.f119386m;
        if (mLRConnectionHelper != null) {
            mLRConnectionHelper.close();
        }
    }

    public final ListenableFuture<Void> e(int i14, final int i15) {
        synchronized (this.f119379f) {
            this.f119380g.remove(Integer.valueOf(i15));
            this.f119388o.remove(Integer.valueOf(i14));
        }
        nl2.d dVar = this.f119383j;
        dVar.f126508c.trace("Closing handle {} on {}", Integer.valueOf(i15), Integer.valueOf(i14));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(13);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put((byte) 2);
        byteBufferAllocate.putLong(dVar.f126512g);
        byteBufferAllocate.putShort((short) i14);
        byteBufferAllocate.put((byte) i15);
        return Futures.transform(dVar.j(nl2.d.e(3, i14), byteBufferAllocate.array(), new ha.j(2), 5), new Function() { // from class: ml2.i
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                String strH;
                int i16 = ((nl2.b) obj).f126503e;
                if (i16 == 0) {
                    strH = "SUCCESS";
                } else if (i16 != 1) {
                    strH = i16 != 2 ? am.j.h(i16, "Unknown status: ") : "NO_CONNECTION";
                } else {
                    strH = "INVALID_HANDLE";
                }
                this.f119359a.f119376c.debug("Close handle [{}] returned status: [{}]", Integer.valueOf(i15), strH);
                return null;
            }
        }, MoreExecutors.directExecutor());
    }

    public final int f(boolean z14) {
        pj2.k kVar = this.f119377d;
        return z14 ? kVar.l() - 2 : kVar.l() - 1;
    }

    public final void j(int i14) {
        s sVarRemove;
        synchronized (this.f119379f) {
            try {
                sVarRemove = this.f119380g.remove(Integer.valueOf(i14));
                if (sVarRemove != null) {
                    this.f119388o.remove(Integer.valueOf(sVarRemove.f119442a.f119488a));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (sVarRemove != null) {
            sVarRemove.h();
        }
    }

    public final void k(int i14, byte[] bArr) {
        synchronized (this.f119379f) {
            try {
                s sVar = this.f119380g.get(Integer.valueOf(i14));
                if (sVar == null) {
                    if (this.f119382i.isEmpty()) {
                        this.f119376c.trace("onCharacteristicChanged: No callback for handle {}. Probably sharing a characteristic", Integer.valueOf(i14));
                        return;
                    }
                    b bVar = this.f119381h.get(Integer.valueOf(i14));
                    if (bVar == null) {
                        bVar = new b();
                        this.f119381h.put(Integer.valueOf(i14), bVar);
                    }
                    if (bVar.f119393b == null || SystemClock.elapsedRealtime() - bVar.f119392a >= 3000) {
                        bVar.f119393b = null;
                    } else {
                        bVar.f119393b.add(bArr);
                    }
                }
                if (sVar != null) {
                    bArr.getClass();
                    synchronized (sVar.f119450i) {
                        try {
                            y yVar = sVar.f119451j;
                            if (yVar != null) {
                                sVar.f119453l.submit(new fh2.a(yVar, 18, sVar, bArr));
                                return;
                            }
                            ArrayList arrayList = sVar.f119452k;
                            if (arrayList == null) {
                                sVar.f119452k = p13.x.m(bArr);
                            } else {
                                arrayList.add(bArr);
                            }
                            ArrayList arrayList2 = sVar.f119452k;
                            if (arrayList2 != null) {
                                while (arrayList2.size() > 1) {
                                    Iterator it = arrayList2.iterator();
                                    int length = 0;
                                    int length2 = 0;
                                    while (it.hasNext()) {
                                        length2 += ((byte[]) it.next()).length;
                                    }
                                    if (length2 <= 1024) {
                                        break;
                                    }
                                    byte[] bArr2 = (byte[]) p13.d0.E(arrayList2);
                                    Logger logger = sVar.f119446e;
                                    if (bArr2 != null) {
                                        length = bArr2.length;
                                    }
                                    logger.warn("Dropping " + length + " bytes from service ID " + sVar.f119442a.f119488a);
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final ListenableFuture<r> l(int i14, boolean z14) {
        synchronized (this.f119379f) {
            try {
                for (s sVar : this.f119380g.values()) {
                    if (sVar.f119442a.f119488a == i14) {
                        return Futures.immediateFuture(sVar);
                    }
                }
                ListenableFuture<r> listenableFuture = this.f119382i.get(Integer.valueOf(i14));
                if (listenableFuture != null) {
                    return listenableFuture;
                }
                SettableFuture settableFutureCreate = SettableFuture.create();
                this.f119382i.put(Integer.valueOf(i14), settableFutureCreate);
                this.f119376c.debug("Registering Multi-Link service: {} requestReliable: {}", Integer.valueOf(i14), Boolean.valueOf(z14));
                Futures.addCallback(this.f119383j.f(i14, (!z14 || this.f119386m == null) ? 0 : 2), new a(i14, settableFutureCreate), MoreExecutors.directExecutor());
                return settableFutureCreate;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
