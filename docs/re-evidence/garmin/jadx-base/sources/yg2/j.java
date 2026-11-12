package yg2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class j<T> implements r53.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f197058a;

    public j(h hVar) {
        this.f197058a = hVar;
    }

    @Override // r53.j
    public final Object emit(Object obj, t13.d dVar) {
        sf2.e eVar = (sf2.e) obj;
        boolean z14 = eVar instanceof sf2.e.g;
        h hVar = this.f197058a;
        if (z14) {
            hVar.f197007o.k(null, Boolean.TRUE);
            hVar.f197008p.k(null, Boolean.FALSE);
        } else if (eVar instanceof sf2.e.m) {
            hVar.f197006n.k(null, Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
