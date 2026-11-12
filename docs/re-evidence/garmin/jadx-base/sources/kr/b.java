package kr;

import am.x0;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import e23.p;
import g22.n;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Ljr/d;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.data.repository.ActivityConfigurationRepo$getActivityDetailsConfiguration$1", f = "ActivityConfigurationRepo.kt", l = {26}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements p<r53.j<? super jr.d>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f106202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f106203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f106204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0 f106205d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, x0 x0Var, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f106204c = eVar;
        this.f106205d = x0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f106204c, this.f106205d, dVar);
        bVar.f106203b = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super jr.d> jVar, t13.d<? super Unit> dVar) {
        return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f106203b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f106202a;
        if (i14 == 0) {
            r.b(obj);
            a aVar2 = this.f106204c.f106213a;
            int i15 = a.f106200b;
            x0 x0Var = x0.f4346x;
            x0 x0Var2 = this.f106205d;
            x0Var2.getClass();
            x0Var.getClass();
            String strD = a.d(aVar2, x0Var2.f4363f, Integer.valueOf(x0Var.f4363f), 4);
            jr.d dVar = n.d(strD) ? (jr.d) GsonUtil.f47253b.fromJson(strD, jr.d.class) : new jr.d(null, 1, null);
            this.f106203b = null;
            this.f106202a = 1;
            if (jVar.emit(dVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
