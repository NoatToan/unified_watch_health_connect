package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import java.util.HashSet;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel$preSave$1", f = "WorkoutEditCreateViewModel.kt", l = {1046, 1059, 1068}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f49403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f49404c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(q qVar, r rVar, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f49403b = qVar;
        this.f49404c = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x(this.f49403b, this.f49404c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (v52.d.d(r10, r1, r9) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        if (v52.d.d(r10, r2, r9) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
    
        if (com.garmin.android.apps.connectmobile.workouts.presentation.edit.r.D4(r5, r9) == r0) goto L30;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f49402a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return Unit.INSTANCE;
            }
            if (i14 == 2) {
                o13.r.b(obj);
                return Unit.INSTANCE;
            }
            if (i14 == 3) {
                o13.r.b(obj);
                return Unit.INSTANCE;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        q qVar = this.f49403b;
        l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> iVar = qVar.f49250f;
        iVar.getClass();
        HashSet hashSet = new HashSet();
        l52.o.a(iVar, l52.h.PRE_ORDER, new hy.d(hashSet, 19));
        boolean zIsEmpty = hashSet.isEmpty();
        r rVar = this.f49404c;
        if (zIsEmpty) {
            m52.k kVar = qVar.f49245a;
            if (!k52.g.f(kVar) || l52.w.d(qVar.f49250f, kVar)) {
                rVar.f49281h.clear();
                this.f49402a = 3;
            } else {
                q53.w<v52.c<? extends o>> wVar = rVar.f49287n;
                o.n nVar = new o.n(kVar);
                this.f49402a = 2;
            }
        } else {
            q53.w<v52.c<? extends o>> wVar2 = rVar.f49287n;
            o.i iVar2 = o.i.f49228a;
            this.f49402a = 1;
        }
        return aVar;
    }
}
