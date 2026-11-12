package e30;

import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/d;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.details.GetFavoriteCoursesUseCase$invoke$1", f = "GetFavoriteCoursesUseCase.kt", l = {15, 17, 20}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<r53.j<? super List<? extends com.garmin.android.apps.connectmobile.courses.model.d>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f62718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f62719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f62720c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f62720c = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        s sVar = new s(this.f62720c, dVar);
        sVar.f62719b = obj;
        return sVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super List<? extends com.garmin.android.apps.connectmobile.courses.model.d>> jVar, t13.d<? super Unit> dVar) {
        return ((s) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (r0.emit(null, r7) == r1) goto L25;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f62719b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f62718a;
        if (i14 == 0) {
            o13.r.b(obj);
            d60.b bVar = this.f62720c.f62721a;
            this.f62719b = jVar;
            this.f62718a = 1;
            obj = bVar.C(new d60.o(bVar, null), this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2 && i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            T t7 = ((v2.b) v2Var).f47386a;
            this.f62719b = null;
            this.f62718a = 2;
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            this.f62719b = null;
            this.f62718a = 3;
        }
    }
}
