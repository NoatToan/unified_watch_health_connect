package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel$refreshForUpdatedPoolSize$1", f = "WorkoutEditCreateViewModel.kt", l = {1479, 1480}, m = "invokeSuspend", v = 2)
public final class b0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f48932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Double f48933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m52.j f48934d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(r rVar, Double d14, m52.j jVar, t13.d<? super b0> dVar) {
        super(2, dVar);
        this.f48932b = rVar;
        this.f48933c = d14;
        this.f48934d = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b0(this.f48932b, this.f48933c, this.f48934d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        if (r4.N4(r14) == r0) goto L18;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f48931a;
        r rVar = this.f48932b;
        if (i14 != 0) {
            if (i14 == 1) {
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
        q qVar = (q) v52.d.c(rVar.f49286m);
        l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> iVar = qVar.f49250f;
        Double d14 = this.f48933c;
        m52.j jVar = this.f48934d;
        rVar.U4(iVar, d14, jVar);
        rVar.f49280g = true;
        rVar.f49278e = jVar;
        if (zf.b.D(d14)) {
            r.C4(rVar, iVar, jVar);
        }
        r53.j<v52.c<q>> jVar2 = rVar.f49285l;
        q qVarL = q.L(qVar, iVar, null, null, null, null, null, false, 33554399);
        this.f48931a = 1;
        if (v52.d.a(jVar2, qVarL, this) != aVar) {
        }
        return aVar;
        this.f48931a = 2;
        m52.j jVar3 = r.f49273q;
    }
}
