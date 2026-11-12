package xl2;

import com.garmin.device.nfc.g;
import com.garmin.device.nfc.i;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxl2/c;", "Lcom/garmin/device/nfc/g$f;", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements g.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tl2.c f191318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f191319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f191320c;

    public c(tl2.c cVar, b bVar, int i14) {
        this.f191318a = cVar;
        this.f191319b = bVar;
        this.f191320c = i14;
    }

    @Override // com.garmin.device.nfc.g.e
    public final void a(i iVar) {
        this.f191318a.e();
        this.f191319b.f191315e.a(iVar);
    }

    @Override // com.garmin.device.nfc.g.f
    public final void b(int i14) {
        tl2.c cVar = this.f191318a;
        b bVar = this.f191319b;
        int i15 = this.f191320c;
        if (i15 > 0) {
            bVar.getClass();
            cVar.f165289f.c(bVar.f191311a, new c(cVar, bVar, i15 - 1), bVar.f191312b);
        } else {
            cVar.e();
            bVar.f191315e.b(bVar.f191311a.b());
        }
    }
}
