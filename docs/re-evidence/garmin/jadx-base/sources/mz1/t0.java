package mz1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.EventDetailsViewModel$getGroupEventData$1", f = "EventDetailsViewModel.kt", l = {389}, m = "invokeSuspend", v = 2)
public final class t0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f121935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f121936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f121937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f121938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f121939e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(e0 e0Var, long j8, long j14, t13.d<? super t0> dVar) {
        super(2, dVar);
        this.f121937c = e0Var;
        this.f121938d = j8;
        this.f121939e = j14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        t0 t0Var = new t0(this.f121937c, this.f121938d, this.f121939e, dVar);
        t0Var.f121936b = obj;
        return t0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f121936b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121935a;
        e0 e0Var = this.f121937c;
        if (i14 == 0) {
            o13.r.b(obj);
            zf0.d dVar = e0Var.f204384a;
            this.f121936b = b0Var;
            this.f121935a = 1;
            dVar.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(dVar, new zf0.o(dVar, this.f121938d, this.f121939e, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            e0Var.E5((fg0.k) ((v2.b) v2Var).f47386a);
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            String string = ((v2.a) v2Var).f47383a.toString();
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "EventDetailsViewModel", string);
        }
        return Unit.INSTANCE;
    }
}
