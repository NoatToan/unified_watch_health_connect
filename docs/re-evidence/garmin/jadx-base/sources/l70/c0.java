package l70;

import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lj70/b;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.repository.DashboardRepositoryImpl$getAvailablePrimaryStats$1", f = "DashboardRepositoryImpl.kt", l = {220, 220}, m = "invokeSuspend", v = 2)
public final class c0 extends v13.i implements e23.p<r53.j<? super v2<? extends List<? extends j70.b>>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f110604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f110605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f110606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f110607d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(e eVar, t13.d<? super c0> dVar) {
        super(2, dVar);
        this.f110607d = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c0 c0Var = new c0(this.f110607d, dVar);
        c0Var.f110606c = obj;
        return c0Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super v2<? extends List<? extends j70.b>>> jVar, t13.d<? super Unit> dVar) {
        return ((c0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f110606c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f110605b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f110604a;
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        com.garmin.android.apps.connectmobile.dashboard.data.datasource.x xVar = this.f110607d.f110627m;
        this.f110606c = null;
        this.f110604a = jVar;
        this.f110605b = 1;
        obj = xVar.a(this);
        if (obj != aVar) {
        }
        return aVar;
        this.f110606c = null;
        this.f110604a = null;
        this.f110605b = 2;
    }
}
