package ey;

import com.garmin.android.apps.connectmobile.calendar.presentation.GCMCalendarActivity;
import com.garmin.android.apps.connectmobile.i2;
import o53.b0;
import o53.s0;
import o53.t1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.calendar.presentation.GCMCalendarActivity$handleTargetedDeviceSelected$1", f = "GCMCalendarActivity.kt", l = {687, 696}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GCMCalendarActivity f67106b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.calendar.presentation.GCMCalendarActivity$handleTargetedDeviceSelected$1$1", f = "GCMCalendarActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sd2.f f67107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ GCMCalendarActivity f67108b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(sd2.f fVar, GCMCalendarActivity gCMCalendarActivity, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f67107a = fVar;
            this.f67108b = gCMCalendarActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f67107a, this.f67108b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            sd2.f fVar = this.f67107a;
            if (fVar != null) {
                GCMCalendarActivity.a aVar2 = GCMCalendarActivity.F;
                this.f67108b.oa(fVar);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lsd2/f;", "<anonymous>", "(Lo53/b0;)Lsd2/f;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.calendar.presentation.GCMCalendarActivity$handleTargetedDeviceSelected$1$device$1", f = "GCMCalendarActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super sd2.f>, Object> {
        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super sd2.f> dVar) {
            return new b(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            long jB = ((vx.f) KoinJavaComponent.get$default(vx.f.class, null, null, 6, null)).B();
            rd2.f.a().f152045a.getClass();
            sd2.f fVarI = rd2.j.i(jB, null);
            if (fVarI == null) {
                i2.a.j(i2.f36769a, "GCMCalendarActivity", "Cannot retrieve info by unit ID: " + jB);
            }
            return fVarI;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(GCMCalendarActivity gCMCalendarActivity, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f67106b = gCMCalendarActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o(this.f67106b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (ge1.b.e0(r1, r3, r6) == r0) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67105a;
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
        x53.b bVar = x53.b.f189152a;
        b bVar2 = new b(null);
        this.f67105a = 1;
        obj = ge1.b.e0(bVar, bVar2, this);
        if (obj != aVar) {
        }
        return aVar;
        x53.c cVar2 = s0.f129406a;
        t1 t1Var = u53.o.f168762a;
        a aVar2 = new a((sd2.f) obj, this.f67106b, null);
        this.f67105a = 2;
    }
}
