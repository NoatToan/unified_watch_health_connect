package sm1;

import com.garmin.android.apps.connectmobile.v2;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsViewModel$addSleep$1", f = "SleepReportsViewModel.kt", l = {363, 365}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f160248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f160249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f160250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km1.v f160251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l<Boolean, Unit> f160252e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u(long j8, s sVar, km1.v vVar, e23.l<? super Boolean, Unit> lVar, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f160249b = j8;
        this.f160250c = sVar;
        this.f160251d = vVar;
        this.f160252e = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u(this.f160249b, this.f160250c, this.f160251d, this.f160252e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        if (r10 == r0) goto L23;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        v2 v2Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f160248a;
        e23.l<Boolean, Unit> lVar = this.f160252e;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                long j8 = this.f160249b;
                km1.v vVar = this.f160251d;
                s sVar = this.f160250c;
                if (j8 != -1) {
                    nm1.a aVar2 = sVar.f160181a;
                    this.f160248a = 1;
                    obj = aVar2.j(j8, vVar, this);
                    if (obj == aVar) {
                    }
                    v2Var = (v2) obj;
                } else {
                    nm1.a aVar3 = sVar.f160181a;
                    this.f160248a = 2;
                    obj = aVar3.i(vVar, this);
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                v2Var = (v2) obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                v2Var = (v2) obj;
            }
            if (v2Var instanceof v2.b) {
                lVar.invoke(Boolean.TRUE);
            }
            return Unit.INSTANCE;
        } catch (Throwable unused) {
            lVar.invoke(Boolean.FALSE);
            q2.u("Error editing user sleep data");
            return null;
        }
    }
}
