package hc0;

import android.util.Pair;
import java.util.Map;
import java.util.concurrent.Callable;
import vg1.t;
import zb0.n0;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sd2.f f83235b;

    public /* synthetic */ d(sd2.f fVar, int i14) {
        this.f83234a = i14;
        this.f83235b = fVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i14 = this.f83234a;
        sd2.f fVar = this.f83235b;
        switch (i14) {
            case 0:
                rd2.j jVar = rd2.f.a().f152045a;
                long unitID = fVar.getUnitID();
                jVar.getClass();
                byte[] bArrJ = rd2.j.j(unitID);
                return bArrJ == null ? new byte[0] : bArrJ;
            default:
                Map<u0, t> map = n0.f203577a;
                return n0.f203580d.contains((u0) u0.f203782n6.get(fVar.getProductNumber())) ? new Pair(Boolean.TRUE, fVar) : new Pair(Boolean.FALSE, fVar);
        }
    }
}
