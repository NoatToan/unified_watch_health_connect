package aq1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lq92/v;", "<anonymous>", "(Lo53/b0;)Lq92/v;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.StartupChecksViewModel$checkUserGraduationConsents$diConnectUploadStatus$1", f = "StartupChecksViewModel.kt", l = {245}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.p<o53.b0, t13.d<? super q92.v>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12452a;

    public z(t13.d<? super z> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new z(dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super q92.v> dVar) {
        return new z(dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f12452a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        p92.o oVar = p92.o.f136619a;
        q92.x xVar = q92.x.DI_CONNECT_UPLOAD;
        this.f12452a = 1;
        Object objC = oVar.c(xVar, this);
        return objC == aVar ? aVar : objC;
    }
}
