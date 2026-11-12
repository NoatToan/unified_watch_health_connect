package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import java.io.File;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel$updateWorkoutNotes$1", f = "WorkoutEditCreateViewModel.kt", l = {1964, 720}, m = "invokeSuspend", v = 2)
public final class e0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f48975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f48976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.data.model.a f48977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f48978e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(r rVar, String str, com.garmin.android.apps.connectmobile.workouts.data.model.a aVar, String str2, t13.d<? super e0> dVar) {
        super(2, dVar);
        this.f48975b = rVar;
        this.f48976c = str;
        this.f48977d = aVar;
        this.f48978e = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e0(this.f48975b, this.f48976c, this.f48977d, this.f48978e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r3.S4(r7, r6, r16) == r1) goto L21;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f48974a;
        r rVar = this.f48975b;
        if (i14 == 0) {
            o13.r.b(obj);
            q qVarL = q.L((q) v52.d.c(rVar.f49286m), null, this.f48978e, null, null, null, null, false, 33546239);
            r53.j<v52.c<q>> jVar = rVar.f49285l;
            this.f48974a = 1;
            if (v52.d.a(jVar, qVarL, this) != aVar) {
            }
            return aVar;
        }
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
        String str = this.f48976c;
        File file = str != null ? new File(str) : null;
        com.garmin.android.apps.connectmobile.workouts.data.model.a aVar2 = file != null ? new com.garmin.android.apps.connectmobile.workouts.data.model.a(a23.g.f(file), null, null, 6, null) : this.f48977d;
        this.f48974a = 2;
        m52.j jVar2 = r.f49273q;
    }
}
