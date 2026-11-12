package v01;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lk01/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.BulkEditFoodUseCase$invoke$2", f = "BulkEditFoodUseCase.kt", l = {45}, m = "invokeSuspend", v = 2)
public final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends k01.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f174199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<b11.i> f174200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i01.a f174201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b63.o f174202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<b63.o> f174203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Long f174204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b63.v f174205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b f174206h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends b11.i> list, i01.a aVar, b63.o oVar, List<b63.o> list2, Long l14, b63.v vVar, b bVar, t13.d<? super a> dVar) {
        super(2, dVar);
        this.f174200b = list;
        this.f174201c = aVar;
        this.f174202d = oVar;
        this.f174203e = list2;
        this.f174204f = l14;
        this.f174205g = vVar;
        this.f174206h = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a(this.f174200b, this.f174201c, this.f174202d, this.f174203e, this.f174204f, this.f174205g, this.f174206h, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends k01.b>> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f174199a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        List<b11.i> list = this.f174200b;
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        for (b11.i iVar : list) {
            arrayList.add(new i01.b(iVar.getF14315a(), b63.a.C0229a.f16171a.a(), iVar.getF14317c(), new Long(iVar.getF14318d())));
        }
        i01.c cVar = new i01.c(this.f174201c, this.f174202d, this.f174203e, arrayList, this.f174204f, this.f174205g);
        m01.g gVar = this.f174206h.f174216a;
        this.f174199a = 1;
        Object objF = gVar.f(cVar, this);
        return objF == aVar ? aVar : objF;
    }
}
