package og2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class y<T> implements r53.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f132145a;

    public y(v vVar) {
        this.f132145a = vVar;
    }

    @Override // r53.j
    public final Object emit(Object obj, t13.d dVar) {
        if (!(((sf2.b) obj) instanceof sf2.b.a)) {
            lc.u0.r();
            return null;
        }
        int i14 = v.f132105p;
        v vVar = this.f132145a;
        vVar.getClass();
        zg2.c.f204692a.getClass();
        zg2.c.d("LiveActivityAnimatedChartDataProvider", "Clear chart cache");
        vVar.u();
        return Unit.INSTANCE;
    }
}
