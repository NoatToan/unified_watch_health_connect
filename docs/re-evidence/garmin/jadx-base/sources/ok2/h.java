package ok2;

import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.core.CoreTransferManager$close$1", f = "CoreTransferManager.kt", l = {725, 726}, m = "invokeSuspend")
public final class h extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pk2.x f132731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f132732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f132733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f132734d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, String str, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f132733c = gVar;
        this.f132734d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f132733c, this.f132734d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00e1 A[Catch: all -> 0x00f9, TRY_LEAVE, TryCatch #1 {, blocks: (B:33:0x00cf, B:34:0x00db, B:36:0x00e1, B:37:0x00ea, B:39:0x00ee, B:40:0x00f1, B:42:0x00f5, B:46:0x00fc), top: B:65:0x00cf }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ee A[Catch: Exception -> 0x00f1, all -> 0x00f9, TRY_LEAVE, TryCatch #1 {, blocks: (B:33:0x00cf, B:34:0x00db, B:36:0x00e1, B:37:0x00ea, B:39:0x00ee, B:40:0x00f1, B:42:0x00f5, B:46:0x00fc), top: B:65:0x00cf }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c2, code lost:
    
        if (r10.b(r9) == r0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, bl2.b] */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        pk2.x xVarC;
        zk2.d dVar;
        Map<UUID, zk2.k> map;
        long f92746j;
        wk2.d dVar2;
        wk2.e eVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f132732b;
        if (i14 != 0) {
            if (i14 == 1) {
                xVarC = this.f132731a;
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            dVar = this.f132733c.f132695n;
            map = dVar.f205129c;
            map.getClass();
            synchronized (map) {
                for (zk2.k kVar : dVar.f205129c.values()) {
                    kVar.getClass();
                    try {
                        eVar = kVar.f205153c;
                        if (eVar != null) {
                            eVar.close();
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        dVar2 = kVar.f205154d;
                        if (dVar2 != null) {
                            dVar2.close();
                        }
                    } catch (Exception unused2) {
                    }
                }
                dVar.f205129c.clear();
                Unit unit = Unit.INSTANCE;
            }
            cl2.h hVar = cl2.h.f27950a;
            f92746j = this.f132733c.f132682a.getF92746j();
            hVar.getClass();
            Logger logger = cl2.h.f27951b;
            String str = cl2.h.f27953d;
            try {
                a23.g.d(new File(str + "//source/" + f92746j));
            } catch (Exception e4) {
                logger.debug("Did not delete source temp files for " + f92746j, (Throwable) e4);
            }
            try {
                a23.g.d(new File(str + "/sink/" + f92746j));
            } catch (Exception e14) {
                logger.debug("Did not delete sink temp files for " + f92746j, (Throwable) e14);
            }
            o53.c0.d(this.f132733c.f132687f, "Manager closed");
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        g gVar = this.f132733c;
        g.b bVar = g.f132677s;
        ArrayList<pk2.a0> arrayListZ = gVar.z();
        g gVar2 = this.f132733c;
        for (pk2.a0 a0Var : arrayListZ) {
            try {
                a0Var.p(gVar2.f132682a);
            } catch (Exception e15) {
                gVar2.f132688g.warn(a0Var.A() + " failed onDeviceRemoved: " + e15.getMessage());
            }
        }
        r0 r0Var = new r0();
        xVarC = pk2.x.a.c(pk2.x.f138495e, e.I, this.f132734d, null, 4);
        bl2.b bVar2 = this.f132733c.f132694m.get();
        if (bVar2 != 0) {
            g gVar3 = this.f132733c;
            gVar3.f132695n.r(bVar2.f18603d.getId(), xVarC);
            r0Var.f105810a = bVar2;
            bVar2.m(false, xVarC.f138498c);
            gVar3.f132688g.info("close() stop active transfer");
        }
        bl2.b bVar3 = (bl2.b) r0Var.f105810a;
        if (bVar3 != null) {
            this.f132731a = xVarC;
            this.f132732b = 1;
            if (bVar3.b(this) != aVar) {
            }
            return aVar;
        }
        bl2.b bVarE = this.f132733c.A().e(null, xVarC);
        if (bVarE != null) {
            this.f132731a = null;
            this.f132732b = 2;
        }
        dVar = this.f132733c.f132695n;
        map = dVar.f205129c;
        map.getClass();
        synchronized (map) {
            while (r1.hasNext()) {
                kVar.getClass();
                eVar = kVar.f205153c;
                if (eVar != null) {
                    eVar.close();
                }
                dVar2 = kVar.f205154d;
                if (dVar2 != null) {
                    dVar2.close();
                }
            }
            dVar.f205129c.clear();
            Unit unit2 = Unit.INSTANCE;
            cl2.h hVar2 = cl2.h.f27950a;
            f92746j = this.f132733c.f132682a.getF92746j();
            hVar2.getClass();
            Logger logger2 = cl2.h.f27951b;
            String str2 = cl2.h.f27953d;
            a23.g.d(new File(str2 + "//source/" + f92746j));
            a23.g.d(new File(str2 + "/sink/" + f92746j));
            o53.c0.d(this.f132733c.f132687f, "Manager closed");
            return Unit.INSTANCE;
        }
    }
}
