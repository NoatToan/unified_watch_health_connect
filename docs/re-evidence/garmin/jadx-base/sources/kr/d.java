package kr;

import com.garmin.android.apps.connectmobile.util.GsonUtil;
import e23.p;
import g22.n;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Ljr/a;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.data.repository.ActivityConfigurationRepo$getDefaultChartsConfiguration$1", f = "ActivityConfigurationRepo.kt", l = {34}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements p<r53.j<? super jr.a>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f106210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f106211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f106212c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f106212c = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d dVar2 = new d(this.f106212c, dVar);
        dVar2.f106211b = obj;
        return dVar2;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super jr.a> jVar, t13.d<? super Unit> dVar) {
        return ((d) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f106211b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f106210a;
        if (i14 == 0) {
            r.b(obj);
            String strD = a.d(this.f106212c.f106213a, a.f106200b, null, 6);
            jr.a aVar2 = n.d(strD) ? (jr.a) GsonUtil.f47253b.fromJson(strD, jr.a.class) : new jr.a(null, null, null, 7, null);
            this.f106211b = null;
            this.f106210a = 1;
            if (jVar.emit(aVar2, this) == aVar) {
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
