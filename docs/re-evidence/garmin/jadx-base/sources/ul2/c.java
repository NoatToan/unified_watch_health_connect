package ul2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import tl2.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lul2/c;", "Lul2/a;", "Ltl2/e;", "transferData", "", "maxBatchSize", "Ltl2/c$c;", "transferType", "<init>", "(Ltl2/e;ILtl2/c$c;)V", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, int i14, tl2.c.EnumC3105c enumC3105c) {
        super(eVar, true, enumC3105c, "ApduTransfer", i14);
        eVar.getClass();
        enumC3105c.getClass();
    }

    @Override // tl2.c
    public final void c(tl2.c.b bVar, tl2.a aVar) {
        bVar.getClass();
        aVar.accept(Boolean.TRUE);
    }

    @Override // tl2.c
    public final void d(tl2.b bVar) {
        bVar.accept(Boolean.TRUE);
    }

    public /* synthetic */ c(e eVar, int i14, tl2.c.EnumC3105c enumC3105c, int i15, j jVar) {
        this(eVar, i14, (i15 & 4) != 0 ? tl2.c.EnumC3105c.APDU : enumC3105c);
    }
}
