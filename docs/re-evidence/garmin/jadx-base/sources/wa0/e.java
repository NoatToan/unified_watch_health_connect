package wa0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.inreach.InReachSubscriptionViewModel$loadInitialData$1", f = "InReachSubscriptionViewModel.kt", l = {41, 42, 43, 53}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f183778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f183779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f183780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f183781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f183782e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f183782e = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f183782e, dVar);
        eVar.f183781d = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007d  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b8, code lost:
    
        if (r14 == r1) goto L32;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z14;
        boolean zBooleanValue;
        Object objE;
        boolean z15;
        boolean z16;
        b0 b0Var = (b0) this.f183781d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f183780c;
        c cVar = this.f183782e;
        if (i14 == 0) {
            r.b(obj);
            long j8 = cVar.f183764a;
            this.f183781d = b0Var;
            this.f183780c = 1;
            obj = c.x4(cVar, j8, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
        } else {
            if (i14 == 2) {
                z14 = this.f183778a;
                r.b(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                m90.a aVar2 = cVar.f183765b;
                long j14 = cVar.f183764a;
                this.f183781d = b0Var;
                this.f183778a = z14;
                this.f183779b = zBooleanValue;
                this.f183780c = 3;
                objE = aVar2.e(j14, this);
                if (objE != aVar) {
                    boolean z17 = z14;
                    z15 = zBooleanValue;
                    obj = objE;
                    z16 = z17;
                    boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                    a2 a2Var = a2.DEVICE_SETUP;
                    String strK = hb.a.k(com.airbnb.lottie.animation.keyframe.a.m("loadInitialData: isInReachServicesCapable=[", "], isExistingUser=[", "], isSubscriptionActiveForDeviceId=[", z16, z15), zBooleanValue2, "]");
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "InReachSubscriptionViewModel", strK);
                    if (z16) {
                    }
                    i2.a.b(a2Var, "InReachSubscriptionViewModel", "Skipping InReach subscription screen");
                    cVar.f183768e.k(null, new c.b(false, true, null, 0, 12, null));
                    return Unit.INSTANCE;
                }
                return aVar;
            }
            if (i14 == 3) {
                z15 = this.f183779b;
                z16 = this.f183778a;
                r.b(obj);
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                a2 a2Var2 = a2.DEVICE_SETUP;
                String strK2 = hb.a.k(com.airbnb.lottie.animation.keyframe.a.m("loadInitialData: isInReachServicesCapable=[", "], isExistingUser=[", "], isSubscriptionActiveForDeviceId=[", z16, z15), zBooleanValue3, "]");
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "InReachSubscriptionViewModel", strK2);
                if (z16 || z15 || zBooleanValue3) {
                    i2.a.b(a2Var2, "InReachSubscriptionViewModel", "Skipping InReach subscription screen");
                    cVar.f183768e.k(null, new c.b(false, true, null, 0, 12, null));
                    return Unit.INSTANCE;
                }
                m90.a aVar3 = cVar.f183765b;
                long j15 = cVar.f183764a;
                this.f183781d = b0Var;
                this.f183778a = z16;
                this.f183779b = z15;
                this.f183780c = 4;
                obj = aVar3.c(j15, this);
            } else {
                if (i14 != 4) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        }
        o90.b bVar = (o90.b) obj;
        a2 a2Var3 = a2.DEVICE_SETUP;
        String str = "Is user eligible for free trial - " + bVar.f130971a + ", duration - " + bVar.f130972b;
        i2.f36769a.getClass();
        i2.a.b(a2Var3, "InReachSubscriptionViewModel", str);
        cVar.f183768e.k(null, new c.b(false, false, Boolean.valueOf(bVar.f130971a), bVar.f130972b, 2, null));
        return Unit.INSTANCE;
        boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
        m90.a aVar4 = cVar.f183765b;
        long j16 = cVar.f183764a;
        this.f183781d = b0Var;
        this.f183778a = zBooleanValue4;
        this.f183780c = 2;
        Object objG = aVar4.g(j16, this);
        if (objG != aVar) {
            z14 = zBooleanValue4;
            obj = objG;
            zBooleanValue = ((Boolean) obj).booleanValue();
            m90.a aVar5 = cVar.f183765b;
            long j17 = cVar.f183764a;
            this.f183781d = b0Var;
            this.f183778a = z14;
            this.f183779b = zBooleanValue;
            this.f183780c = 3;
            objE = aVar5.e(j17, this);
            if (objE != aVar) {
                boolean z18 = z14;
                z15 = zBooleanValue;
                obj = objE;
                z16 = z18;
                boolean zBooleanValue5 = ((Boolean) obj).booleanValue();
                a2 a2Var4 = a2.DEVICE_SETUP;
                String strK3 = hb.a.k(com.airbnb.lottie.animation.keyframe.a.m("loadInitialData: isInReachServicesCapable=[", "], isExistingUser=[", "], isSubscriptionActiveForDeviceId=[", z16, z15), zBooleanValue5, "]");
                i2.f36769a.getClass();
                i2.a.b(a2Var4, "InReachSubscriptionViewModel", strK3);
                if (z16) {
                }
                i2.a.b(a2Var4, "InReachSubscriptionViewModel", "Skipping InReach subscription screen");
                cVar.f183768e.k(null, new c.b(false, true, null, 0, 12, null));
                return Unit.INSTANCE;
            }
        }
        return aVar;
    }
}
