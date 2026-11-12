package m01;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lh01/c;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.NutritionRepositoryImpl$getFavoritesConsumable$2", f = "NutritionRepositoryImpl.kt", l = {232}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.l<t13.d<? super c83.a0<h01.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f115705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f115706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f115707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f115708e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(h hVar, int i14, int i15, String str, t13.d<? super w> dVar) {
        super(1, dVar);
        this.f115705b = hVar;
        this.f115706c = i14;
        this.f115707d = i15;
        this.f115708e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new w(this.f115705b, this.f115706c, this.f115707d, this.f115708e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<h01.c>> dVar) {
        return ((w) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115704a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        c01.b bVar = this.f115705b.f115594a;
        this.f115704a = 1;
        Object objC = bVar.C(this.f115706c, this.f115707d, true, this.f115708e, this);
        return objC == aVar ? aVar : objC;
    }
}
