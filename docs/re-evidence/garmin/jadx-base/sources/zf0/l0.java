package zf0;

import com.garmin.android.apps.connectmobile.g3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.o2;
import r53.z1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.events.RaceAndEventBaseViewModel$fetchActiveTrainingPlans$1", f = "RaceAndEventBaseViewModel.kt", l = {534, 534}, m = "invokeSuspend", v = 2)
public final class l0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z1 f204428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f204429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1<g3<ww1.g>> f204430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0 f204431d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(z1<g3<ww1.g>> z1Var, j0 j0Var, t13.d<? super l0> dVar) {
        super(2, dVar);
        this.f204430c = z1Var;
        this.f204431d = j0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l0(this.f204430c, this.f204431d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (r1.emit(r5, r4) == r0) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        z1<g3<ww1.g>> z1Var;
        z1 z1Var2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f204429b;
        if (i14 != 0) {
            if (i14 == 1) {
                z1 z1Var3 = this.f204428a;
                o13.r.b(obj);
                z1Var2 = z1Var3;
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
        ou1.a aVar2 = (ou1.a) this.f204431d.E.getValue();
        z1Var = this.f204430c;
        this.f204428a = z1Var;
        this.f204429b = 1;
        obj = aVar2.a(this);
        if (obj != aVar) {
        }
        z1Var2 = z1Var;
        return aVar;
        z1Var2 = z1Var;
        Object value = ((o2) obj).getValue();
        this.f204428a = null;
        this.f204429b = 2;
    }
}
