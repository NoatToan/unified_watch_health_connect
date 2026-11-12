package m01;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.NutritionRepositoryImpl$markFoodAsFavorite$2", f = "NutritionRepositoryImpl.kt", l = {245}, m = "invokeSuspend", v = 2)
public final class t0 extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f115683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f115684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f115685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g01.u f115686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Double f115687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f115688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f115689h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(h hVar, String str, String str2, g01.u uVar, Double d14, String str3, String str4, t13.d<? super t0> dVar) {
        super(1, dVar);
        this.f115683b = hVar;
        this.f115684c = str;
        this.f115685d = str2;
        this.f115686e = uVar;
        this.f115687f = d14;
        this.f115688g = str3;
        this.f115689h = str4;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new t0(this.f115683b, this.f115684c, this.f115685d, this.f115686e, this.f115687f, this.f115688g, this.f115689h, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((t0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115682a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        c01.b bVar = this.f115683b.f115594a;
        h01.b bVar2 = new h01.b(this.f115684c, this.f115685d, this.f115686e, this.f115687f, this.f115688g, this.f115689h);
        this.f115682a = 1;
        Object objV = bVar.v(bVar2, this);
        return objV == aVar ? aVar : objV;
    }
}
