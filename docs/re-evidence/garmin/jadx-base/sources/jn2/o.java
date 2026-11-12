package jn2;

import com.google.common.util.concurrent.ListeningScheduledExecutorService;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljn2/o;", "Lpl2/j;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o implements pl2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f99661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cs2.a<js2.d> f99662b;

    public o(m mVar, cs2.a<js2.d> aVar) {
        this.f99661a = mVar;
        this.f99662b = aVar;
    }

    @Override // pl2.j
    public final void a(com.garmin.device.nfc.e eVar) {
        js2.b.f100651c.getClass();
        js2.b bVarA = js2.b.a.a(eVar);
        js2.c cVar = bVarA != null ? js2.c.OWNER_DATA_SET : js2.c.OWNER_DATA_NOT_SET;
        ListeningScheduledExecutorService listeningScheduledExecutorService = m.f99646l;
        boolean zD = this.f99661a.d();
        cs2.a<js2.d> aVar = this.f99662b;
        if (zD) {
            js2.d.f100659h.getClass();
            aVar.accept(js2.d.a.b(bVarA, cVar));
        } else {
            js2.d.f100659h.getClass();
            cVar.getClass();
            aVar.accept(new js2.d(js2.e.NOT_APPLICABLE, bVarA, cVar, null, 8, null));
        }
    }

    @Override // pl2.j
    public final void b() {
        ListeningScheduledExecutorService listeningScheduledExecutorService = m.f99646l;
        boolean zD = this.f99661a.d();
        cs2.a<js2.d> aVar = this.f99662b;
        if (zD) {
            js2.d.a aVar2 = js2.d.f100659h;
            js2.c cVar = js2.c.FAILED_TO_GET_OWNER_DATA;
            aVar2.getClass();
            aVar.accept(js2.d.a.b(null, cVar));
            return;
        }
        js2.d.a aVar3 = js2.d.f100659h;
        js2.c cVar2 = js2.c.FAILED_TO_GET_OWNER_DATA;
        aVar3.getClass();
        cVar2.getClass();
        aVar.accept(new js2.d(js2.e.NOT_APPLICABLE, null, cVar2, null, 8, null));
    }
}
