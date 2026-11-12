package bd0;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/t0;", "", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.setup.GDIAuthPairingViewModel$redisplayPairingPasskey$1", f = "GDIAuthPairingAndroidNotificationPressedActivity.kt", l = {140, 166}, m = "invokeSuspend", v = 2)
public final class g0 extends v13.i implements e23.p<t0<Boolean>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l80.b f17571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f17572d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)I"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.devices.setup.GDIAuthPairingViewModel$redisplayPairingPasskey$1$status$1", f = "GDIAuthPairingAndroidNotificationPressedActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Integer>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l80.b f17573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f17574b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l80.b bVar, String str, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f17573a = bVar;
            this.f17574b = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f17573a, this.f17574b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Integer> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return new Integer(this.f17573a.q(this.f17574b));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(l80.b bVar, String str, t13.d<? super g0> dVar) {
        super(2, dVar);
        this.f17571c = bVar;
        this.f17572d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g0 g0Var = new g0(this.f17571c, this.f17572d, dVar);
        g0Var.f17570b = obj;
        return g0Var;
    }

    @Override // e23.p
    public final Object invoke(t0<Boolean> t0Var, t13.d<? super Unit> dVar) {
        return ((g0) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
    
        if (r0.emit(r10, r9) == r1) goto L27;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        t0 t0Var = (t0) this.f17570b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f17569a;
        l80.b bVar = this.f17571c;
        boolean z14 = true;
        if (i14 != 0) {
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
        }
        o13.r.b(obj);
        x53.c cVar = s0.f129406a;
        x53.b bVar2 = x53.b.f189152a;
        a aVar2 = new a(bVar, this.f17572d, null);
        this.f17570b = t0Var;
        this.f17569a = 1;
        obj = ge1.b.e0(bVar2, aVar2, this);
        if (obj != aVar) {
        }
        return aVar;
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue != 0) {
            bVar.getClass();
            z14 = false;
            if (iIntValue == -131) {
                a2 a2Var = a2.DEVICES;
                i2.f36769a.getClass();
                i2.a.f(a2Var, "GDIAuthPairingViewModel", "GFDIService.redisplayPairingPasskey() returned [remote service dead]");
            } else if (iIntValue == -132) {
                a2 a2Var2 = a2.DEVICES;
                i2.f36769a.getClass();
                i2.a.f(a2Var2, "GDIAuthPairingViewModel", "GFDIService.redisplayPairingPasskey() returned [remote service exception]");
            } else if (iIntValue == 2) {
                a2 a2Var3 = a2.DEVICES;
                i2.f36769a.getClass();
                i2.a.f(a2Var3, "GDIAuthPairingViewModel", "GFDIService.redisplayPairingPasskey() returned [remote device disconnected]");
            } else {
                a2 a2Var4 = a2.DEVICES;
                String strF = v.e0.f(iIntValue, "Fix me developer! I'm not handling status [", "] returned by redisplayPairingPasskey()!");
                i2.f36769a.getClass();
                i2.a.f(a2Var4, "GDIAuthPairingViewModel", strF);
            }
        }
        Boolean boolValueOf = Boolean.valueOf(z14);
        this.f17570b = null;
        this.f17569a = 2;
    }
}
