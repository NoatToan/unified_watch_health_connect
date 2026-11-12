package d60;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lw01/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.repo.CoursesRepo$getNutritionAndHydrationAsync$nutritionAndHydrationResult$1", f = "CoursesRepo.kt", l = {475}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.l<t13.d<? super c83.a0<w01.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f57932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f57933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f57934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Double f57935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Double f57936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Double f57937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Integer f57938g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(b bVar, Integer num, Double d14, Double d15, Double d16, Integer num2, t13.d<? super r> dVar) {
        super(1, dVar);
        this.f57933b = bVar;
        this.f57934c = num;
        this.f57935d = d14;
        this.f57936e = d15;
        this.f57937f = d16;
        this.f57938g = num2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new r(this.f57933b, this.f57934c, this.f57935d, this.f57936e, this.f57937f, this.f57938g, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<w01.b>> dVar) {
        return ((r) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f57932a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        b.a aVar2 = b.f57806c;
        o53.i0<c83.a0<w01.b>> i0VarX = this.f57933b.b().x(this.f57934c, this.f57935d, this.f57936e, this.f57937f, this.f57938g);
        this.f57932a = 1;
        Object objAwait = i0VarX.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
