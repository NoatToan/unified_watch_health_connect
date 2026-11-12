package com.garmin.android.apps.connectmobile.workouts.presentation.stepedit;

import e23.p;
import e23.q;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.WorkoutStepEditViewModel$downloadAudioNote$1", f = "WorkoutStepEditViewModel.kt", l = {366}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f49721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f49722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f49723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f49724e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar, String str, String str2, e23.a<Unit> aVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f49721b = jVar;
        this.f49722c = str;
        this.f49723d = str2;
        this.f49724e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f49721b, this.f49722c, this.f49723d, this.f49724e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f49720a;
        String str = this.f49723d;
        String str2 = this.f49722c;
        j jVar = this.f49721b;
        if (i14 == 0) {
            r.b(obj);
            jVar.J4(new g.b(true));
            j.a aVar2 = jVar.f49709i;
            if (aVar2 == null) {
                return Unit.INSTANCE;
            }
            q<String, String, t13.d<? super Boolean>, Object> qVar = aVar2.f49711b;
            this.f49720a = 1;
            obj = qVar.invoke(str2, str, this);
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
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        jVar.J4(new g.b(false));
        e23.a<Unit> aVar3 = this.f49724e;
        if (zBooleanValue) {
            aVar3.invoke();
        } else {
            jVar.J4(new g.h(str2, str, aVar3));
        }
        return Unit.INSTANCE;
    }
}
