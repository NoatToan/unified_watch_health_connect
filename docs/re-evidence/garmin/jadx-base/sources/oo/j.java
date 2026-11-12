package oo;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.manual.viewmodel.ActivitiesEditViewModel$unlinkEventForNonEventTypes$1", f = "ActivitiesEditViewModel.kt", l = {269}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f133099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f133100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f133101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f133102d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b bVar, long j8, e23.a<Unit> aVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f133100b = bVar;
        this.f133101c = j8;
        this.f133102d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f133100b, this.f133101c, this.f133102d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f133099a;
        if (i14 == 0) {
            r.b(obj);
            ps.d dVar = new ps.d(null, null, 3, null);
            dVar.b(null);
            ps.l lVar = new ps.l(null, 1, null);
            lVar.a();
            dVar.c(lVar);
            this.f133099a = 1;
            obj = b.y4(this.f133100b, this.f133101c, dVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            this.f133102d.invoke();
        }
        return Unit.INSTANCE;
    }
}
