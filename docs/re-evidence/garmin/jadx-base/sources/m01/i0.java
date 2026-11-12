package m01;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lg01/v;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.NutritionRepositoryImpl$getRecentFoods$2", f = "NutritionRepositoryImpl.kt", l = {290}, m = "invokeSuspend", v = 2)
public final class i0 extends v13.i implements e23.l<t13.d<? super c83.a0<g01.v>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f115604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f115605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f115606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f01.j f115607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Long f115608f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(h hVar, int i14, int i15, f01.j jVar, Long l14, t13.d<? super i0> dVar) {
        super(1, dVar);
        this.f115604b = hVar;
        this.f115605c = i14;
        this.f115606d = i15;
        this.f115607e = jVar;
        this.f115608f = l14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new i0(this.f115604b, this.f115605c, this.f115606d, this.f115607e, this.f115608f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<g01.v>> dVar) {
        return ((i0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115603a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        fz0.c cVarA = fz0.d.a(g22.l.d(b63.o.INSTANCE));
        c01.b bVar = this.f115604b.f115594a;
        this.f115603a = 1;
        Object objZ = bVar.z(cVarA, this.f115605c, this.f115606d, this.f115607e, this.f115608f, this);
        return objZ == aVar ? aVar : objZ;
    }
}
