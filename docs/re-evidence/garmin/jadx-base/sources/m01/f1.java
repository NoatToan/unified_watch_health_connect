package m01;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lj01/c;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.NutritionRepositoryImpl$updateRecipe$2", f = "NutritionRepositoryImpl.kt", l = {415}, m = "invokeSuspend", v = 2)
public final class f1 extends v13.i implements e23.l<t13.d<? super c83.a0<j01.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f115587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f115588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j01.a f115589d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(h hVar, String str, j01.a aVar, t13.d<? super f1> dVar) {
        super(1, dVar);
        this.f115587b = hVar;
        this.f115588c = str;
        this.f115589d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f1(this.f115587b, this.f115588c, this.f115589d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<j01.c>> dVar) {
        return ((f1) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115586a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        c01.b bVar = this.f115587b.f115594a;
        this.f115586a = 1;
        Object objJ = bVar.j(this.f115588c, this.f115589d, this);
        return objJ == aVar ? aVar : objJ;
    }
}
