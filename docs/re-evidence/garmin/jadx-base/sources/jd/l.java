package jd;

import androidx.room.t0;
import androidx.room.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "androidx.room.coroutines.PassthroughConnection$withTransaction$2", f = "PassthroughConnectionPool.kt", l = {103}, m = "invokeSuspend")
public final class l extends v13.i implements e23.l<t13.d<? super Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f98252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f98253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0.a f98254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.p<t0<Object>, t13.d<Object>, Object> f98255d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(h hVar, u0.a aVar, e23.p<? super t0<Object>, ? super t13.d<Object>, ? extends Object> pVar, t13.d<? super l> dVar) {
        super(1, dVar);
        this.f98253b = hVar;
        this.f98254c = aVar;
        this.f98255d = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new l(this.f98253b, this.f98254c, this.f98255d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Object> dVar) {
        return ((l) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f98252a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f98252a = 1;
            Object objE = this.f98253b.e(this.f98254c, this.f98255d, this);
            return objE == aVar ? aVar : objE;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            return obj;
        }
        vb.h.z("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
