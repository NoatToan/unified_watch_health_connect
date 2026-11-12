package xl2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import tl2.e;
import tl2.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lxl2/a;", "Ltl2/c;", "Ltl2/e;", "transferData", "Ltl2/c$c;", "transferType", "", "useExplicitLock", "<init>", "(Ltl2/e;Ltl2/c$c;Z)V", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends tl2.c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f191310m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, tl2.c.EnumC3105c enumC3105c, boolean z14) {
        super(eVar, z14, enumC3105c, "RawMessageTransfer");
        eVar.getClass();
        enumC3105c.getClass();
        this.f191310m = eVar.f165320a;
    }

    @Override // tl2.c
    public final void b() {
        super.b();
        f fVar = this.f191310m;
        b bVar = fVar instanceof b ? (b) fVar : null;
        if (bVar != null) {
            bVar.f191315e.b(bVar.f191311a.b());
        }
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

    public /* synthetic */ a(e eVar, tl2.c.EnumC3105c enumC3105c, boolean z14, int i14, j jVar) {
        this(eVar, enumC3105c, (i14 & 4) != 0 ? false : z14);
    }
}
