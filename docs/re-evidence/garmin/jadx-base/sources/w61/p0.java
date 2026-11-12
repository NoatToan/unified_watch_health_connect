package w61;

import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusViewModel$supportsTrainingStatusPause$2", f = "TrainingStatusViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class p0 extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f183241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f183242b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(x xVar, Long l14, t13.d<? super p0> dVar) {
        super(2, dVar);
        this.f183241a = xVar;
        this.f183242b = l14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p0(this.f183241a, this.f183242b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((p0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        boolean zP2;
        Object next;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        rd2.f.a().f152045a.getClass();
        ArrayList arrayListD = rd2.j.d();
        this.f183241a.f183278m = arrayListD;
        if (arrayListD != null) {
            Iterator it = arrayListD.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                long unitID = ((sd2.f) next).getUnitID();
                Long l14 = this.f183242b;
                if (l14 != null && unitID == l14.longValue()) {
                    break;
                }
            }
            sd2.f fVar = (sd2.f) next;
            if (fVar != null) {
                zP2 = fVar.p2();
            } else {
                zP2 = false;
            }
        } else {
            zP2 = false;
        }
        return Boolean.valueOf(zP2);
    }
}
