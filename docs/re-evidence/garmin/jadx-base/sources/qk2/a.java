package qk2;

import bl2.y;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import lk2.v;
import mk2.d;
import mk2.e;
import ok2.g0;
import ok2.j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import p13.k0;
import p13.l0;
import p40.o0;
import pk2.a0;
import pk2.b0;
import pk2.c0;
import pk2.d0;
import pk2.e0;
import pk2.f0;
import pk2.g;
import pk2.x;
import pk2.z;
import v13.i;
import wk2.f;
import wk2.n;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqk2/a;", "Lpk2/c0;", "Lpk2/f0;", "Lpk2/a0;", "Lmk2/e;", "<init>", "()V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements c0, f0, a0, e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f145172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f145173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f145174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap<String, b> f145175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ok2.a0 f145176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference<d0> f145177g;

    public a() {
        Logger logger = LoggerFactory.getLogger("CFT#AdHocTransferAgent");
        logger.getClass();
        this.f145172b = logger;
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        this.f145173c = k0Var;
        l0 l0Var = l0.f134950a;
        v.f113300e.getClass();
        this.f145174d = new v(l0Var, l0Var, v.f113301f, null, 8, null);
        this.f145175e = new ConcurrentHashMap<>();
        this.f145177g = new AtomicReference<>(null);
    }

    @Override // pk2.z
    public final String A() {
        return "AdHocTransferAgent";
    }

    @Override // pk2.z
    public final Map<String, e0> D() {
        return this.f145173c;
    }

    @Override // mk2.e
    public final d a(String str) {
        str.getClass();
        return this.f145175e.get(str);
    }

    @Override // pk2.f0
    public final wk2.a b(rs2.c cVar, f fVar) {
        cVar.getClass();
        wk2.d.f185837a.getClass();
        return new wk2.a(cVar, fVar, null, 4, null);
    }

    @Override // pk2.z
    public final void c(ok2.a0 a0Var) {
        this.f145176f = a0Var;
    }

    @Override // pk2.c0
    public final Object d(rs2.c cVar, f fVar, CoreTransferException coreTransferException, v13.c cVar2) {
        return Unit.INSTANCE;
    }

    @Override // pk2.z
    public final Object e(rs2.c cVar, j jVar) {
        Unit unit = Unit.INSTANCE;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return unit;
    }

    @Override // pk2.a0
    public final void f(rs2.c cVar) {
    }

    @Override // pk2.c0
    public final boolean h(rs2.c cVar, f fVar) {
        b bVar;
        boolean z14;
        cVar.getClass();
        fVar.getClass();
        if (fVar.a() && (bVar = this.f145175e.get(cVar.getF92741e())) != null) {
            UUID uuid = fVar.f185842a;
            uuid.getClass();
            synchronized (bVar.f145187i) {
                z14 = bVar.f145188j.get(uuid) != null;
            }
            if (z14) {
                return true;
            }
        }
        return false;
    }

    @Override // pk2.a0
    public final void i(rs2.c cVar) {
        String str = "onDeviceAdded(" + cVar.getF92741e() + ")";
        Logger logger = this.f145172b;
        logger.info(str);
        d0 d0Var = this.f145177g.get();
        if (d0Var == null) {
            com.airbnb.lottie.animation.keyframe.a.z("Failed to create AdHocService(", cVar.getF92741e(), ") since DownloadSourceChange unavailable", logger);
            return;
        }
        this.f145175e.putIfAbsent(cVar.getF92741e(), new b(cVar, d0Var, new o0(26, this, cVar), null, 0, null, 56, null));
    }

    @Override // pk2.f0
    public final Object j(rs2.c cVar, g0 g0Var, g gVar) {
        return Unit.INSTANCE;
    }

    @Override // pk2.z
    /* JADX INFO: renamed from: k */
    public final e0 getF77880b() {
        return e0.SILENT;
    }

    @Override // pk2.c0
    public final void l(b0 b0Var) {
        AtomicReference<d0> atomicReference;
        do {
            atomicReference = this.f145177g;
            if (atomicReference.compareAndSet(null, b0Var)) {
                return;
            }
        } while (atomicReference.get() == null);
    }

    @Override // pk2.f0
    public final boolean m(rs2.c cVar, f fVar) {
        boolean z14;
        cVar.getClass();
        fVar.getClass();
        b bVar = this.f145175e.get(cVar.getF92741e());
        if (bVar != null) {
            UUID uuid = fVar.f185842a;
            uuid.getClass();
            synchronized (bVar.f145187i) {
                z14 = bVar.f145188j.get(uuid) != null;
            }
            if (z14) {
                return true;
            }
        }
        return false;
    }

    @Override // pk2.f0
    public final Object n(rs2.c cVar, n nVar, dz2.b bVar, y yVar) {
        try {
            b bVar2 = this.f145175e.get(cVar.getF92741e());
            if (bVar2 != null) {
                bVar2.e(nVar.getF205152b().f185842a, bVar);
                x.f138495e.getClass();
                return x.a.e();
            }
            x.a aVar = x.f138495e;
            ok2.e eVar = ok2.e.f132645m;
            aVar.getClass();
            eVar.getClass();
            return x.a.d(new CoreTransferException(eVar, "Service not found", null, 4, null));
        } catch (Throwable th3) {
            this.f145172b.error("Failed to write data", (Throwable) th3);
            x.a aVar2 = x.f138495e;
            CoreTransferException coreTransferException = new CoreTransferException(ok2.e.A, "Failed to write data", th3 instanceof Exception ? th3 : null);
            aVar2.getClass();
            return x.a.d(coreTransferException);
        }
    }

    @Override // pk2.c0
    public final Object o(rs2.c cVar, boolean z14, pk2.f fVar) {
        return j0.f134944a;
    }

    @Override // pk2.a0
    public final void p(rs2.c cVar) {
        this.f145175e.remove(cVar.getF92741e());
        this.f145172b.info("onDeviceRemoved(" + cVar.getF92741e() + ")");
    }

    @Override // pk2.z
    public final x q(rs2.c cVar, f fVar, x xVar) {
        b bVar;
        cVar.getClass();
        fVar.getClass();
        xVar.getClass();
        CoreTransferException coreTransferException = xVar.f138497b;
        if (coreTransferException == null || (bVar = this.f145175e.get(cVar.getF92741e())) == null || !bVar.d(fVar.f185842a, coreTransferException)) {
            return null;
        }
        x.f138495e.getClass();
        return x.a.d(coreTransferException);
    }

    @Override // pk2.f0
    public final String r(rs2.c cVar) {
        cVar.getClass();
        return null;
    }

    @Override // pk2.z
    public final Set t(rs2.c cVar, f fVar) {
        fVar.getClass();
        cVar.getClass();
        return z.a.a(cVar, fVar);
    }

    @Override // pk2.f0
    public final List<UUID> v(x xVar) {
        xVar.getClass();
        return getF159941g().f113303b;
    }

    @Override // pk2.f0
    public final Object w(rs2.c cVar, i iVar) {
        return Unit.INSTANCE;
    }

    @Override // pk2.a0
    public final void x(rs2.c cVar) {
        b bVar = this.f145175e.get(cVar.getF92741e());
        if (bVar != null) {
            ArrayList arrayList = new ArrayList();
            CoreTransferException coreTransferException = new CoreTransferException(ok2.e.f132636d, "Ad Hoc transfer can't retry after disconnect", null, 4, null);
            synchronized (bVar.f145187i) {
                try {
                    Set<UUID> setKeySet = bVar.f145188j.keySet();
                    setKeySet.getClass();
                    for (UUID uuid : setKeySet) {
                        uuid.getClass();
                        if (bVar.d(uuid, coreTransferException)) {
                            arrayList.add(uuid);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        bVar.f145188j.remove((UUID) it.next());
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                bVar.f145180b.c(bVar.f145186h, (UUID) it3.next(), coreTransferException);
            }
        }
    }

    @Override // pk2.f0
    /* JADX INFO: renamed from: z, reason: from getter */
    public final v getF159941g() {
        return this.f145174d;
    }
}
