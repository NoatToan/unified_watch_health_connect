package m42;

import b63.o;
import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ll42/h;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.data.repository.WeightsRepository$getLatestWeightAsync$2", f = "WeightsRepository.kt", l = {38}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements l<t13.d<? super a0<l42.h>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f116625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f116626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f116627c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o oVar, boolean z14, t13.d<? super g> dVar) {
        super(1, dVar);
        this.f116626b = oVar;
        this.f116627c = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new g(this.f116626b, this.f116627c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<l42.h>> dVar) {
        return ((g) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f116625a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<l42.h>> i0VarD = b.a.a(b.f116608a).d(fz0.d.a(this.f116626b), this.f116627c);
        this.f116625a = 1;
        Object objAwait = i0VarD.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
