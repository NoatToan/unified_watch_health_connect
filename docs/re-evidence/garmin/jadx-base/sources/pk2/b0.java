package pk2;

import com.garmin.device.filetransfer.core.util.CoreTransferException;
import java.util.UUID;
import ok2.g0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpk2/b0;", "Lpk2/d0;", "Lpk2/c0;", "agent", "Lkotlin/Function1;", "", "Lok2/g;", "transferManager", "<init>", "(Lpk2/c0;Le23/l;)V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f138373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<String, ok2.g> f138374b;

    /* JADX WARN: Multi-variable type inference failed */
    public b0(c0 c0Var, e23.l<? super String, ok2.g> lVar) {
        c0Var.getClass();
        lVar.getClass();
        this.f138373a = c0Var;
        this.f138374b = lVar;
    }

    @Override // pk2.d0
    public final void a(String str, zk2.k kVar) {
        str.getClass();
        ok2.g gVarInvoke = this.f138374b.invoke(str);
        if (gVarInvoke != null) {
            gVarInvoke.E(kVar);
        }
    }

    @Override // pk2.c0.a
    public final void b(String str, wk2.f fVar, wk2.e eVar) {
        str.getClass();
        fVar.getClass();
        eVar.getClass();
        ok2.g gVarInvoke = this.f138374b.invoke(str);
        if (gVarInvoke != null) {
            g0 g0VarF = cl2.c.f(this.f138373a, gVarInvoke.f132682a, fVar);
            g0VarF.getClass();
            gVarInvoke.E(wk2.i.a.b(wk2.i.f185855a, fVar, eVar, g0VarF, wk2.m.f185864d, gVarInvoke.f132683b.a(), null, null, 224));
        }
    }

    @Override // pk2.c0.a
    public final void c(String str, UUID uuid, CoreTransferException coreTransferException) throws CoreTransferException {
        al2.m mVar;
        str.getClass();
        uuid.getClass();
        coreTransferException.getClass();
        ok2.g gVarInvoke = this.f138374b.invoke(str);
        if (gVarInvoke != null) {
            gVarInvoke.f132688g.warn("cancelTransfer " + uuid + " - " + coreTransferException.getFailure());
            zk2.d dVar = gVarInvoke.f132695n;
            dVar.r(uuid, x.a.b(x.f138495e, coreTransferException));
            zk2.k kVarO = dVar.o(uuid);
            bl2.b bVar = gVarInvoke.f132694m.get();
            if (p005kotlin.jvm.internal.s.g(bVar != null ? bVar.f18603d.getId() : null, uuid)) {
                if (gVarInvoke.B() != null) {
                    int i14 = cl2.c.a.f27940a[coreTransferException.getFailure().ordinal()];
                    if (i14 == 1 || i14 == 2 || i14 == 3) {
                        return;
                    }
                    ok2.g.J(gVarInvoke, "Active item cancelled", null, false, 6);
                    return;
                }
                return;
            }
            if (kVarO == null || (mVar = kVarO.f205159i) == null) {
                return;
            }
            al2.l.a aVar = al2.l.f3818k;
            rs2.c cVar = gVarInvoke.f132682a;
            zy2.f fVarA = gVarInvoke.f132683b.a();
            aVar.getClass();
            x xVar = kVarO.f205158h;
            if (xVar != null) {
                al2.k.f3808b.getClass();
                al2.k kVarA = al2.k.a.a(xVar, true);
                if (kVarA != null) {
                    mVar.u(new al2.l(cVar, kVarO.f205155e, kVarO.f205152b, kVarA, kVarA != al2.k.STARTED ? kVarO.f205158h : null, null, null, null, null, kVarO.e(fVarA), 480, null));
                    return;
                }
            }
            throw new CoreTransferException(ok2.e.f132644l, "File result created without AgentResult", null, 4, null);
        }
    }
}
