package sz0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.notifications.NotificationsViewModel$declineInvite$1", f = "NotificationsViewModel.kt", l = {387, 388}, m = "invokeSuspend", v = 2)
public final class p0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f161478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f161479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f161480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1 f161481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f161482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ue0.n f161483f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(i0 i0Var, l1 l1Var, long j8, ue0.n nVar, t13.d<? super p0> dVar) {
        super(2, dVar);
        this.f161480c = i0Var;
        this.f161481d = l1Var;
        this.f161482e = j8;
        this.f161483f = nVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        p0 p0Var = new p0(this.f161480c, this.f161481d, this.f161482e, this.f161483f, dVar);
        p0Var.f161479b = obj;
        return p0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        if (r9 == r1) goto L17;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f161479b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f161478a;
        i0 i0Var = this.f161480c;
        if (i14 == 0) {
            o13.r.b(obj);
            i0Var.f161428p.k(null, fw.m.a.f(fw.m.f73767e, null, null, 3));
            l1 l1Var = this.f161481d;
            if (l1Var != null) {
                this.f161479b = b0Var;
                this.f161478a = 1;
                if (l1Var.P(this) != aVar) {
                }
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
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            i0Var.f161428p.k(null, fw.m.a.g(fw.m.f73767e, ue0.n.b(this.f161483f, null, null, 8183), 1));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            Exception exc = ((v2.a) v2Var).f47383a;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(exc, "Failed to decline invite. ");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "NotificationViewModel", strD);
            i0Var.f161428p.k(null, fw.m.a.d(fw.m.f73767e, exc));
        }
        return Unit.INSTANCE;
        int i15 = i0.f161413r;
        re0.h hVar = (re0.h) i0Var.f161418f.getValue();
        this.f161479b = b0Var;
        this.f161478a = 2;
        obj = hVar.c(this.f161482e, this);
    }
}
