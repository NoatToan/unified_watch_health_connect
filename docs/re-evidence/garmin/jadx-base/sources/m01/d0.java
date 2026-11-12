package m01;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Ll01/g;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.NutritionRepositoryImpl$getMicronutrientsGuidance$2", f = "NutritionRepositoryImpl.kt", l = {182}, m = "invokeSuspend", v = 2)
public final class d0 extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends l01.g>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f115564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f115565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f115566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f115567e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(h hVar, int i14, String str, boolean z14, t13.d<? super d0> dVar) {
        super(1, dVar);
        this.f115564b = hVar;
        this.f115565c = i14;
        this.f115566d = str;
        this.f115567e = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d0(this.f115564b, this.f115565c, this.f115566d, this.f115567e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends l01.g>>> dVar) {
        return ((d0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115563a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        c01.b bVar = this.f115564b.f115594a;
        this.f115563a = 1;
        Object objQ = bVar.q(this.f115565c, this.f115566d, this.f115567e, this);
        return objQ == aVar ? aVar : objQ;
    }
}
