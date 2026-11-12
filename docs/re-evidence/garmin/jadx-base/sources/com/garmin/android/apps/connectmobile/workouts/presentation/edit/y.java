package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel$refreshForDeletedStep$1", f = "WorkoutEditCreateViewModel.kt", l = {1339, 1340, 1341}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f49405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l52.e f49406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f49408d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(r rVar, t13.d<? super y> dVar) {
        super(2, dVar);
        this.f49408d = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y(this.f49408d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
    
        if (r6.N4(r18) == r1) goto L29;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        q qVar;
        l52.e<com.garmin.android.apps.connectmobile.workouts.data.model.j0> eVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f49407c;
        r rVar = this.f49408d;
        if (i14 != 0) {
            if (i14 == 1) {
                l52.e<com.garmin.android.apps.connectmobile.workouts.data.model.j0> eVar2 = this.f49406b;
                q qVar2 = this.f49405a;
                o13.r.b(obj);
                eVar = eVar2;
                qVar = qVar2;
            } else if (i14 == 2) {
                o13.r.b(obj);
                this.f49405a = null;
                this.f49406b = null;
                this.f49407c = 3;
                m52.j jVar = r.f49273q;
            } else {
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        q qVar3 = (q) v52.d.c(rVar.f49286m);
        l52.e<com.garmin.android.apps.connectmobile.workouts.data.model.j0> eVarB = l52.w.b(qVar3.f49250f);
        l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar = rVar.f49279f;
        if (bVar == null) {
            return Unit.INSTANCE;
        }
        rVar.f49279f = null;
        l52.e.b bVarN3 = ((l52.m) eVarB).n3(bVar);
        if (bVarN3 == null) {
            return Unit.INSTANCE;
        }
        bVarN3.delete();
        rVar.f49280g = true;
        this.f49405a = qVar3;
        this.f49406b = eVarB;
        this.f49407c = 1;
        if (rVar.R4(eVarB, false, this) != aVar) {
            qVar = qVar3;
            eVar = eVarB;
        }
        return aVar;
        r53.j<v52.c<q>> jVar2 = rVar.f49285l;
        q qVarL = q.L(qVar, eVar, null, null, null, null, null, false, 33554399);
        this.f49405a = null;
        this.f49406b = null;
        this.f49407c = 2;
        if (v52.d.a(jVar2, qVarL, this) != aVar) {
            this.f49405a = null;
            this.f49406b = null;
            this.f49407c = 3;
            m52.j jVar3 = r.f49273q;
        }
        return aVar;
    }
}
