package v71;

import b63.o;
import c83.a0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ln61/c;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.performancescores.endurancescore.data.repository.EnduranceScoreRepoImpl$getEnduranceScoreForDate$result$1", f = "EnduranceScoreRepoImpl.kt", l = {26}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.l<t13.d<? super a0<n61.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f176127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f176128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f176129c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, o oVar, t13.d<? super c> dVar) {
        super(1, dVar);
        this.f176128b = fVar;
        this.f176129c = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f176128b, this.f176129c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<n61.c>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f176127a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        u71.a aVar2 = this.f176128b.f176138a;
        fz0.c cVarA = fz0.d.a(this.f176129c);
        this.f176127a = 1;
        Object objA = aVar2.a(cVarA, this);
        return objA == aVar ? aVar : objA;
    }
}
