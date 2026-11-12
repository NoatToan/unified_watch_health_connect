package um2;

import e23.l;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class c extends q implements l<al2.c, Unit> {
    public c(Object obj) {
        super(1, obj, b.class, "onUserSyncStartResult", "onUserSyncStartResult(Lcom/garmin/device/filetransfer/core/result/BatchTransferEventDetails;)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(al2.c cVar) {
        al2.c cVar2 = cVar;
        cVar2.getClass();
        b bVar = (b) this.receiver;
        Logger logger = b.f172015n;
        bVar.getClass();
        al2.b bVar2 = cVar2.f3777c;
        if (bVar2 == al2.b.REJECTED) {
            synchronized (bVar.f172023h) {
                bVar.f172026k = true;
                Unit unit = Unit.INSTANCE;
            }
        } else if (bVar2 == al2.b.NO_ITEMS) {
            bVar.a(null, true);
        }
        return Unit.INSTANCE;
    }
}
