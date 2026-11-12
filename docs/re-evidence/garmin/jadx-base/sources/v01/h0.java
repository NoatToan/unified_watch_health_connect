package v01;

import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lg01/z;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetDefaultMealsUseCase$invoke$2", f = "GetDefaultMealsUseCase.kt", l = {20}, m = "invokeSuspend", v = 2)
public final class h0 extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends g01.z>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f174391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f174392b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, t13.d<? super h0> dVar) {
        super(2, dVar);
        this.f174392b = i0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h0(this.f174392b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends g01.z>> dVar) {
        return ((h0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f174391a;
        if (i14 == 0) {
            o13.r.b(obj);
            m01.g gVar = this.f174392b.f174402a;
            List listC = p13.w.c("defaultMeals");
            this.f174391a = 1;
            obj = gVar.j0(listC, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (!(v2Var instanceof v2.b)) {
            return new v2.a(new Exception("Failed to fetch nutrition default meals"), null, null, 6, null);
        }
        v2.b bVar = (v2.b) v2Var;
        g01.z zVar = ((f01.h) bVar.f47386a).f67705a;
        List list = zVar.f74294a;
        if (list == null) {
            list = p13.j0.f134944a;
        }
        List list2 = list;
        b63.v vVar = zVar.f74296c;
        if (vVar == null) {
            vVar = v21.d.f175307k;
        }
        b63.v vVar2 = vVar;
        b63.v vVar3 = zVar.f74297d;
        if (vVar3 == null) {
            vVar3 = v21.d.f175308l;
        }
        return new v2.b(new g01.z(list2, (Boolean) null, vVar2, vVar3, l01.e.CLASSICAL, 2, (p005kotlin.jvm.internal.j) null), bVar.f47387b, null, null, 12, null);
    }
}
