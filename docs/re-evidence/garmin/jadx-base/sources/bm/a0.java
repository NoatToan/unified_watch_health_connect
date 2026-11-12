package bm;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.advancedactivityediting.TrimActivityViewModel$getMultisportReconstruct$1", f = "TrimActivityViewModel.kt", l = {501}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d f18760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d f18761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d f18763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f18764e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVar, long j8, t13.d<? super a0> dVar2) {
        super(2, dVar2);
        this.f18763d = dVar;
        this.f18764e = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a0(this.f18763d, this.f18764e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVar;
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVar2;
        yo.d dVar3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f18762c;
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVar4 = this.f18763d;
        if (i14 == 0) {
            o13.r.b(obj);
            try {
                o53.i0<c83.a0<yo.d>> i0VarC = ((yo.q) dVar4.f28876n.getValue()).c(this.f18764e);
                this.f18760a = dVar4;
                this.f18761b = dVar4;
                this.f18762c = 1;
                obj = i0VarC.await(this);
                if (obj == aVar) {
                    return aVar;
                }
                dVar2 = dVar4;
                dVar = dVar2;
            } catch (Exception unused) {
                dVar = dVar4;
                dVar3 = null;
                dVar2 = dVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dVar2 = this.f18761b;
            dVar = this.f18760a;
            try {
                o13.r.b(obj);
            } catch (Exception unused2) {
                dVar3 = null;
                dVar2 = dVar;
            }
        }
        dVar3 = (yo.d) ((c83.a0) obj).f25746b;
        dVar2.f28875m = dVar3;
        yo.d dVar5 = dVar4.f28875m;
        if (dVar5 != null) {
            yo.w wVar = new yo.w();
            dVar4.D = wVar;
            wVar.j(dVar4.f28867e);
            yo.w wVar2 = dVar4.D;
            if (wVar2 != null) {
                wVar2.f198312b = dVar5;
            }
        }
        return Unit.INSTANCE;
    }
}
