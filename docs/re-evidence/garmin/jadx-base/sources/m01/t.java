package m01;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lg01/f;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.NutritionRepositoryImpl$getCustomMeals$2", f = "NutritionRepositoryImpl.kt", l = {334}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.l<t13.d<? super c83.a0<g01.f>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f115677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f115678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Long f115679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f115680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f115681f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(h hVar, String str, Long l14, int i14, int i15, t13.d<? super t> dVar) {
        super(1, dVar);
        this.f115677b = hVar;
        this.f115678c = str;
        this.f115679d = l14;
        this.f115680e = i14;
        this.f115681f = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new t(this.f115677b, this.f115678c, this.f115679d, this.f115680e, this.f115681f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<g01.f>> dVar) {
        return ((t) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115676a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        c01.b bVar = this.f115677b.f115594a;
        this.f115676a = 1;
        Object objT = bVar.t(this.f115678c, this.f115679d, this.f115680e, this.f115681f, this);
        return objT == aVar ? aVar : objT;
    }
}
