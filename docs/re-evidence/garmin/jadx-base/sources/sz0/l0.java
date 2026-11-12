package sz0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.notifications.NotificationsViewModel$acceptInvite$1", f = "NotificationsViewModel.kt", l = {359, 360, 363}, m = "invokeSuspend", v = 2)
public final class l0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f161445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f161446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f161447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0 f161448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1 f161449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f161450f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ue0.n f161451g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(i0 i0Var, l1 l1Var, long j8, ue0.n nVar, t13.d<? super l0> dVar) {
        super(2, dVar);
        this.f161448d = i0Var;
        this.f161449e = l1Var;
        this.f161450f = j8;
        this.f161451g = nVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l0 l0Var = new l0(this.f161448d, this.f161449e, this.f161450f, this.f161451g, dVar);
        l0Var.f161447c = obj;
        return l0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x009f  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d1  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        if (r9.a(r8) == r1) goto L26;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        o53.b0 b0Var = (o53.b0) this.f161447c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f161446b;
        i0 i0Var = this.f161448d;
        if (i14 == 0) {
            o13.r.b(obj);
            i0Var.f161426n.k(null, fw.m.a.f(fw.m.f73767e, null, null, 3));
            l1 l1Var = this.f161449e;
            if (l1Var != null) {
                this.f161447c = b0Var;
                this.f161446b = 1;
                if (l1Var.P(this) != aVar) {
                }
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 == 2) {
                o13.r.b(obj);
                obj2 = (v2) obj;
                if (obj2 instanceof v2.b) {
                    if (!i0Var.f161424l.X3()) {
                        te0.d dVar = i0Var.f161423k;
                        this.f161447c = null;
                        this.f161445a = (v2.b) obj2;
                        this.f161446b = 3;
                    }
                } else {
                    if (obj2 instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    v2.a aVar2 = (v2.a) obj2;
                    Exception exc = aVar2.f47383a;
                    String strD = com.airbnb.lottie.animation.keyframe.a.d(exc, "Failed to accept invite. ");
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.f(a2Var, "NotificationViewModel", strD);
                    p2 p2Var = i0Var.f161426n;
                    fw.m.a aVar4 = fw.m.f73767e;
                    i0.a aVar5 = new i0.a(null, aVar2.f47384b);
                    aVar4.getClass();
                    p2Var.k(null, fw.m.a.a(aVar5, exc));
                }
                return Unit.INSTANCE;
            }
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.f161445a;
            o13.r.b(obj);
        }
        i0Var.f161426n.k(null, fw.m.a.g(fw.m.f73767e, new i0.a(ue0.n.a(this.f161451g), new Integer(((v2.b) obj2).f47387b)), 1));
        return Unit.INSTANCE;
        int i15 = i0.f161413r;
        re0.h hVar = (re0.h) i0Var.f161418f.getValue();
        this.f161447c = b0Var;
        this.f161446b = 2;
        obj = hVar.b(this.f161450f, this);
        if (obj != aVar) {
            obj2 = (v2) obj;
            if (obj2 instanceof v2.b) {
                if (!i0Var.f161424l.X3()) {
                    te0.d dVar2 = i0Var.f161423k;
                    this.f161447c = null;
                    this.f161445a = (v2.b) obj2;
                    this.f161446b = 3;
                }
                i0Var.f161426n.k(null, fw.m.a.g(fw.m.f73767e, new i0.a(ue0.n.a(this.f161451g), new Integer(((v2.b) obj2).f47387b)), 1));
            } else {
                if (obj2 instanceof v2.a) {
                    u0.r();
                    return null;
                }
                v2.a aVar6 = (v2.a) obj2;
                Exception exc2 = aVar6.f47383a;
                String strD2 = com.airbnb.lottie.animation.keyframe.a.d(exc2, "Failed to accept invite. ");
                i2.a aVar7 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar7.getClass();
                i2.a.f(a2Var2, "NotificationViewModel", strD2);
                p2 p2Var2 = i0Var.f161426n;
                fw.m.a aVar8 = fw.m.f73767e;
                i0.a aVar9 = new i0.a(null, aVar6.f47384b);
                aVar8.getClass();
                p2Var2.k(null, fw.m.a.a(aVar9, exc2));
            }
            return Unit.INSTANCE;
        }
        return aVar;
    }
}
