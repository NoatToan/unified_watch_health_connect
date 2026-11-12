package ss1;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lqs1/c0;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.data.repository.GarminTrailsReviewsRepoImpl$getUserTripReportStats$2", f = "GarminTrailsReviewsRepoImpl.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS}, m = "invokeSuspend", v = 2)
public final class m0 extends v13.i implements e23.l<t13.d<? super c83.a0<qs1.c0>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f160697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f160698b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(v0 v0Var, t13.d<? super m0> dVar) {
        super(1, dVar);
        this.f160698b = v0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new m0(this.f160698b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<qs1.c0>> dVar) {
        return ((m0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f160697a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        ps1.b bVar = this.f160698b.f160763a;
        this.f160697a = 1;
        Object objC = bVar.c(this);
        return objC == aVar ? aVar : objC;
    }
}
