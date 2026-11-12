package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel$deleteStep$1", f = "WorkoutEditCreateViewModel.kt", l = {1163, 1165, 1166}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f49385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l52.e f49386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f49388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f49389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> f49390f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(r rVar, l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f49389e = rVar;
        this.f49390f = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        u uVar = new u(this.f49389e, this.f49390f, dVar);
        uVar.f49388d = obj;
        return uVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a1, code lost:
    
        if (r6.N4(r19) == r1) goto L25;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        q qVar;
        l52.e<com.garmin.android.apps.connectmobile.workouts.data.model.j0> eVarB;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f49387c;
        r rVar = this.f49389e;
        if (i14 != 0) {
            if (i14 == 1) {
                eVarB = this.f49386b;
                qVar = this.f49385a;
                o13.r.b(obj);
            } else if (i14 == 2) {
                o13.r.b(obj);
                this.f49388d = null;
                this.f49385a = null;
                this.f49386b = null;
                this.f49387c = 3;
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
        qVar = (q) v52.d.c(rVar.f49286m);
        eVarB = l52.w.b(qVar.f49250f);
        l52.e.b bVarN3 = ((l52.m) eVarB).n3(this.f49390f.getPath());
        if (bVarN3 == null) {
            return Unit.INSTANCE;
        }
        bVarN3.delete();
        r.d.f49311c.getClass();
        rVar.f49283j = r.d.f49312d;
        this.f49388d = null;
        this.f49385a = qVar;
        this.f49386b = eVarB;
        this.f49387c = 1;
        if (rVar.R4(eVarB, false, this) != aVar) {
        }
        return aVar;
        l52.e<com.garmin.android.apps.connectmobile.workouts.data.model.j0> eVar = eVarB;
        q qVar2 = qVar;
        rVar.f49280g = true;
        r53.j<v52.c<q>> jVar2 = rVar.f49285l;
        q qVarL = q.L(qVar2, eVar, null, null, null, null, null, false, 33554399);
        this.f49388d = null;
        this.f49385a = null;
        this.f49386b = null;
        this.f49387c = 2;
        if (v52.d.a(jVar2, qVarL, this) != aVar) {
            this.f49388d = null;
            this.f49385a = null;
            this.f49386b = null;
            this.f49387c = 3;
            m52.j jVar3 = r.f49273q;
        }
        return aVar;
    }
}
