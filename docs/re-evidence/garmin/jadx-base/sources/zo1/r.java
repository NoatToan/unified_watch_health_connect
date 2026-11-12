package zo1;

import com.garmin.android.apps.connectmobile.v2;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.socialgroupride.presentation.GroupRideDetailsViewModel$checkPromotionEligible$1", f = "GroupRideDetailsViewModel.kt", l = {146, 164}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p005kotlin.jvm.internal.m0 f206439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p005kotlin.jvm.internal.m0 f206440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f206441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f206442d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q qVar, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f206442d = qVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r(this.f206442d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cd, code lost:
    
        if (r11.b(r1, r10) == r0) goto L43;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        p005kotlin.jvm.internal.m0 m0Var;
        p005kotlin.jvm.internal.m0 m0Var2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f206441c;
        q qVar = this.f206442d;
        if (i14 != 0) {
            if (i14 == 1) {
                m0Var2 = this.f206440b;
                m0Var = this.f206439a;
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
        m0Var = new p005kotlin.jvm.internal.m0();
        m0Var2 = new p005kotlin.jvm.internal.m0();
        vo1.c cVar = qVar.f206414a;
        this.f206439a = m0Var;
        this.f206440b = m0Var2;
        this.f206441c = 1;
        obj = cVar.a(this);
        if (obj != aVar) {
        }
        return aVar;
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            for (yo1.a aVar2 : (Iterable) ((v2.b) v2Var).f47386a) {
                if (q.x4(qVar, aVar2.b()) && !p005kotlin.jvm.internal.s.g(aVar2.getGroupTrack2Capable(), Boolean.TRUE)) {
                    Long registeredDate = aVar2.getRegisteredDate();
                    if (new DateTime(registeredDate != null ? registeredDate.longValue() : DateTime.now().getMillis()).isBefore(DateTime.now().minusYears(1))) {
                        m0Var.f105804a = true;
                    }
                }
                if (q.x4(qVar, aVar2.b()) && p005kotlin.jvm.internal.s.g(aVar2.getGroupTrack2Capable(), Boolean.TRUE)) {
                    m0Var2.f105804a = true;
                }
            }
        } else if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        if (m0Var.f105804a && !m0Var2.f105804a) {
            t60.m mVar = qVar.f206420g;
            t60.a aVar3 = t60.a.EDGE_1050_BANNER;
            this.f206439a = null;
            this.f206440b = null;
            this.f206441c = 2;
        }
        return Unit.INSTANCE;
    }
}
