package jn2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljn2/p;", "Lpl2/j;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p implements pl2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cs2.a<js2.d> f99663a;

    public p(cs2.a<js2.d> aVar) {
        this.f99663a = aVar;
    }

    @Override // pl2.j
    public final void a(com.garmin.device.nfc.e eVar) {
        js2.b.f100651c.getClass();
        js2.b bVarA = js2.b.a.a(eVar);
        cs2.a<js2.d> aVar = this.f99663a;
        if (bVarA != null) {
            js2.d.a aVar2 = js2.d.f100659h;
            js2.c cVar = js2.c.OWNER_DATA_SET;
            aVar2.getClass();
            aVar.accept(js2.d.a.b(bVarA, cVar));
            return;
        }
        js2.d.a aVar3 = js2.d.f100659h;
        js2.c cVar2 = js2.c.OWNER_DATA_NOT_SET;
        aVar3.getClass();
        aVar.accept(js2.d.a.b(bVarA, cVar2));
    }

    @Override // pl2.j
    public final void b() {
        js2.d.a aVar = js2.d.f100659h;
        js2.c cVar = js2.c.FAILED_TO_GET_OWNER_DATA;
        aVar.getClass();
        this.f99663a.accept(js2.d.a.b(null, cVar));
    }
}
