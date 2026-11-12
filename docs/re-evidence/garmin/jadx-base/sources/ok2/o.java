package ok2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class o extends p005kotlin.jvm.internal.q implements e23.l<wk2.i, Unit> {
    public o(Object obj) {
        super(1, obj, g.class, "retryAdHoc", "retryAdHoc(Lcom/garmin/device/filetransfer/core/data/TransferItem;)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(wk2.i iVar) {
        wk2.i iVar2 = iVar;
        iVar2.getClass();
        g gVar = (g) this.receiver;
        g.b bVar = g.f132677s;
        gVar.getClass();
        zk2.k kVar = iVar2 instanceof zk2.k ? (zk2.k) iVar2 : null;
        if (kVar != null) {
            kVar.j();
        }
        zk2.d dVar = gVar.f132695n;
        dVar.getClass();
        dVar.c(iVar2, false);
        return Unit.INSTANCE;
    }
}
