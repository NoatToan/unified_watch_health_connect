package sa1;

import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.powerguide.PowerGuideRepo$deleteCourseRelatedPowerGuideStrategies$2", f = "PowerGuideRepo.kt", l = {58}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f158293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f158294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f158295c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(m mVar, long j8, t13.d<? super p> dVar) {
        super(1, dVar);
        this.f158294b = mVar;
        this.f158295c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new p(this.f158294b, this.f158295c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((p) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f158293a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<Unit>> i0VarB = this.f158294b.f158285a.b(this.f158295c);
        this.f158293a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
