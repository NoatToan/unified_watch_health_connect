package ll2;

import b21.l0;
import com.garmin.device.filetransfer.mlr.MLRTransportException;
import e23.p;
import lk2.u;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p006l2.v0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\b¨\u0006\t"}, d2 = {"Lll2/a;", "Llk2/u;", "Lkotlin/Function0;", "Lml2/l;", "mlCommunicatorFunc", "<init>", "(Le23/a;)V", "mlCommunicator", "(Lml2/l;)V", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.a<ml2.l> f113423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e.a f113424b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(ml2.l lVar) {
        this(new v0(lVar, 13));
        lVar.getClass();
    }

    @Override // lk2.u
    public final Object a(int i14, dz2.b bVar, l0 l0Var, lk2.j jVar) throws Throwable {
        l lVar = new l(i14, bVar.getF126459l());
        ml2.l lVarInvoke = this.f113423a.invoke();
        if (lVarInvoke == null) {
            throw new MLRTransportException("MultiLinkCommunicator unavailable", null, 2, null);
        }
        Object objE = this.f113424b.e(lVarInvoke, lVar, bVar, l0Var, jVar);
        return objE == u13.a.COROUTINE_SUSPENDED ? objE : Unit.INSTANCE;
    }

    @Override // lk2.u
    public final Object b(int i14, long j8, dz2.a aVar, p pVar, lk2.g gVar) throws Throwable {
        l lVar = new l(i14, j8);
        ml2.l lVarInvoke = this.f113423a.invoke();
        if (lVarInvoke == null) {
            throw new MLRTransportException("MultiLinkCommunicator unavailable", null, 2, null);
        }
        Object objC = this.f113424b.c(lVarInvoke, lVar, aVar, pVar, gVar);
        return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
    }

    public a(e23.a<ml2.l> aVar) {
        aVar.getClass();
        this.f113423a = aVar;
        this.f113424b = e.f113445l;
    }
}
