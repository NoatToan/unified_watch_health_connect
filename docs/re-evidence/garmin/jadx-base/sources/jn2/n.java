package jn2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljn2/n;", "Lpl2/j;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n implements pl2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cs2.a<js2.d> f99659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pl2.l f99660b;

    public n(cs2.a<js2.d> aVar, pl2.l lVar) {
        this.f99659a = aVar;
        this.f99660b = lVar;
    }

    @Override // pl2.j
    public final void a(com.garmin.device.nfc.e eVar) {
        js2.b.f100651c.getClass();
        js2.b bVarA = js2.b.a.a(eVar);
        cs2.a<js2.d> aVar = this.f99659a;
        pl2.l lVar = this.f99660b;
        if (bVarA != null) {
            js2.d.a aVar2 = js2.d.f100659h;
            js2.c cVar = js2.c.OWNER_DATA_SET;
            int i14 = lVar.f138588a;
            int i15 = lVar.f138591d;
            aVar2.getClass();
            aVar.accept(js2.d.a.a(bVarA, cVar, i14, i15));
            return;
        }
        js2.d.a aVar3 = js2.d.f100659h;
        js2.c cVar2 = js2.c.OWNER_DATA_NOT_SET;
        int i16 = lVar.f138588a;
        int i17 = lVar.f138591d;
        aVar3.getClass();
        aVar.accept(js2.d.a.a(bVarA, cVar2, i16, i17));
    }

    @Override // pl2.j
    public final void b() {
        js2.d.a aVar = js2.d.f100659h;
        js2.c cVar = js2.c.FAILED_TO_GET_OWNER_DATA;
        pl2.l lVar = this.f99660b;
        int i14 = lVar.f138588a;
        int i15 = lVar.f138591d;
        aVar.getClass();
        this.f99659a.accept(js2.d.a.a(null, cVar, i14, i15));
    }
}
