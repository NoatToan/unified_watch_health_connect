package uf2;

import java.util.UUID;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.DeviceWorkoutFileTransfer$fetchWorkouts$2$1", f = "DeviceWorkoutFileTransfer.kt", l = {75, 78}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f170294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dz2.e f170295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f170296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f170297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UUID f170298e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(dz2.e eVar, c cVar, String str, UUID uuid, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f170295b = eVar;
        this.f170296c = cVar;
        this.f170297d = str;
        this.f170298e = uuid;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f170295b, this.f170296c, this.f170297d, this.f170298e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        if (r10 == r0) goto L17;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f170294a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f170294a = 1;
            if (o53.m0.b(2000L, this) != aVar) {
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
        bool = (Boolean) obj;
        zg2.c.f204692a.getClass();
        zg2.c.a("DeviceWorkoutFileTransfer", "result - " + bool);
        return Unit.INSTANCE;
        xk2.d.f191298a.getClass();
        dz2.e eVar = this.f170295b;
        eVar.getClass();
        c cVar = this.f170296c;
        cVar.getClass();
        xk2.e eVar2 = new xk2.e(eVar, cVar, 0, 4, null);
        ok2.w wVarA = ok2.a0.f132585h.a().a(this.f170297d);
        if (wVarA != null) {
            xk2.a aVar2 = new xk2.a(this.f170298e, "WORKOUTS", 1000000L);
            this.f170294a = 2;
            obj = wVarA.d(aVar2, eVar2, this);
        } else {
            bool = null;
        }
        zg2.c.f204692a.getClass();
        zg2.c.a("DeviceWorkoutFileTransfer", "result - " + bool);
        return Unit.INSTANCE;
    }
}
