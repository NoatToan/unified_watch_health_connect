package cs0;

import j70.d;
import java.util.List;
import n70.a0;
import p005kotlin.Metadata;
import yr0.f;
import yr0.g;
import yr0.l;
import yr0.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcs0/b;", "Ln70/a0;", "Lcs0/c;", "Lj70/d;", "", "jetLagCardData", "<init>", "(Lj70/d;)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements a0<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d<String> f55447a;

    public b(d<String> dVar) {
        dVar.getClass();
        this.f55447a = dVar;
    }

    @Override // n70.a0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final c invoke() {
        g gVar;
        List<l> listO;
        d<String> dVar = this.f55447a;
        f fVar = (f) a(dVar.f97521b, new a());
        i53.f fVarJ = null;
        if (fVar != null) {
            ns0.b bVar = ns0.b.f127812a;
            bVar.getClass();
            gVar = new g(fVar, null, bVar.k(fVar, ns0.b.h(fVar)));
        } else {
            gVar = null;
        }
        if (gVar == null) {
            return null;
        }
        yz1.d dVar2 = dVar.f97520a;
        Long tripId = fVar != null ? fVar.getTripId() : null;
        boolean z14 = gVar.f198960c == t.ACCLIMATED;
        if (fVar != null && (listO = fVar.o()) != null) {
            fVarJ = i53.a.j(listO);
        }
        t tVar = gVar.f198960c;
        Integer numValueOf = Integer.valueOf(gVar.f198958a.getSeverity());
        ns0.b.f127812a.getClass();
        return new c(dVar2, tripId, z14, fVarJ, tVar, numValueOf, ns0.b.n(gVar), ns0.b.j(gVar));
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetJetLagUseCase";
    }
}
