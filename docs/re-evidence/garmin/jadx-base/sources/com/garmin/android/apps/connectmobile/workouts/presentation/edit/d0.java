package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel$updateRepeatNumber$1", f = "WorkoutEditCreateViewModel.kt", l = {1615, 1616}, m = "invokeSuspend", v = 2)
public final class d0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f48951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f48952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> f48953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f48954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Boolean f48955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f48956g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(r rVar, l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar, int i14, Boolean bool, boolean z14, t13.d<? super d0> dVar) {
        super(2, dVar);
        this.f48952c = rVar;
        this.f48953d = aVar;
        this.f48954e = i14;
        this.f48955f = bool;
        this.f48956g = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d0 d0Var = new d0(this.f48952c, this.f48953d, this.f48954e, this.f48955f, this.f48956g, dVar);
        d0Var.f48951b = obj;
        return d0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ae, code lost:
    
        if (r4.N4(r43) == r1) goto L19;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f48950a;
        r rVar = this.f48952c;
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
        l52.e<com.garmin.android.apps.connectmobile.workouts.data.model.j0> eVarB = l52.w.b(qVar.f49250f);
        l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar2 = this.f48953d;
        l52.e.b bVarN3 = ((l52.m) eVarB).n3(aVar2.getPath());
        if (bVarN3 == null) {
            return Unit.INSTANCE;
        }
        bVarN3.h(com.garmin.android.apps.connectmobile.workouts.data.model.j0.b((com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar2.getData(), this.f48954e, this.f48955f, this.f48956g, false, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0, 0, 0, null, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, -209, 16383));
        rVar.f49280g = true;
        r53.j<v52.c<q>> jVar = rVar.f49285l;
        q qVarL = q.L(qVar, eVarB, null, null, null, null, null, false, 33554399);
        this.f48951b = null;
        this.f48950a = 1;
        if (v52.d.a(jVar, qVarL, this) != aVar) {
        }
        return aVar;
        this.f48951b = null;
        this.f48950a = 2;
        m52.j jVar2 = r.f49273q;
    }
}
