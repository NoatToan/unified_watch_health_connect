package ew0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import lc.u0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.m1;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.onboarding.LifestyleLoggingOnboardingViewModel$saveSetup$1", f = "LifestyleLoggingOnboardingViewModel.kt", l = {147, 168, 180}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f66257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f66258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f66259c;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltv0/h;", "saveBehavioursResult", "", "<anonymous>", "(Ltv0/h;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.onboarding.LifestyleLoggingOnboardingViewModel$saveSetup$1$3", f = "LifestyleLoggingOnboardingViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<tv0.h, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f66260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o53.b0 f66261b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m f66262c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o53.b0 b0Var, m mVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f66261b = b0Var;
            this.f66262c = mVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f66261b, this.f66262c, dVar);
            aVar.f66260a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(tv0.h hVar, t13.d<? super Unit> dVar) {
            return ((a) create(hVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object value3;
            tv0.h hVar = (tv0.h) this.f66260a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            boolean z14 = hVar instanceof tv0.h.c;
            m mVar = this.f66262c;
            if (z14) {
                a2 a2Var = a2.LIFESTYLE_LOGGING;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "LifestyleLoggingOnboardingViewModel", "Behaviour changes saved successfully");
                p2 p2Var = mVar.f66243j;
                do {
                    value3 = p2Var.getValue();
                } while (!p2Var.b(value3, ((tv0.h.c) hVar).f166559a));
            } else if (hVar instanceof tv0.h.a) {
                a2 a2Var2 = a2.LIFESTYLE_LOGGING;
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "LifestyleLoggingOnboardingViewModel", "Failed to save behaviour changes: save setup cancelled");
                p2 p2Var2 = mVar.f66243j;
                do {
                    value = p2Var2.getValue();
                } while (!p2Var2.b(value, ((tv0.h.a) hVar).f166556a));
                p2 p2Var3 = mVar.f66247n;
                do {
                    value2 = p2Var3.getValue();
                } while (!p2Var3.b(value2, q.a((q) value2, false, true, 4)));
                o53.c0.c(this.f66261b, null);
            } else if (!p005kotlin.jvm.internal.s.g(hVar, tv0.h.b.f166558a)) {
                u0.r();
                return null;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkd1/g;", "reminderResult", "", "<anonymous>", "(Lkd1/g;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.onboarding.LifestyleLoggingOnboardingViewModel$saveSetup$1$4", f = "LifestyleLoggingOnboardingViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<kd1.g, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f66263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o53.b0 f66264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m f66265c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o53.b0 b0Var, m mVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f66264b = b0Var;
            this.f66265c = mVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(this.f66264b, this.f66265c, dVar);
            bVar.f66263a = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(kd1.g gVar, t13.d<? super Unit> dVar) {
            return ((b) create(gVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            kd1.g gVar = (kd1.g) this.f66263a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (gVar instanceof kd1.g.a) {
                a2 a2Var = a2.LIFESTYLE_LOGGING;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "LifestyleLoggingOnboardingViewModel", "Failed to save reminder: save setup cancelled");
                p2 p2Var = this.f66265c.f66247n;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, q.a((q) value, false, true, 4)));
                o53.c0.c(this.f66264b, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m mVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f66259c = mVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f66259c, dVar);
        oVar.f66258b = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f8  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x011a, code lost:
    
        if (r1 == r2) goto L34;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        Object objE0;
        Object value3;
        Object value4;
        o53.b0 b0Var = (o53.b0) this.f66258b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f66257a;
        m mVar = this.f66259c;
        if (i14 == 0) {
            o13.r.b(obj);
            if (az0.b.a()) {
                p2 p2Var = mVar.f66247n;
                do {
                    value2 = p2Var.getValue();
                } while (!p2Var.b(value2, q.a((q) value2, true, false, 4)));
            } else {
                a2 a2Var = a2.LIFESTYLE_LOGGING;
                i2.f36769a.getClass();
                i2.a.f(a2Var, "LifestyleLoggingOnboardingViewModel", "Failed to save onboarding completed status: no internet connection");
                p2 p2Var2 = mVar.f66247n;
                do {
                    value = p2Var2.getValue();
                } while (!p2Var2.b(value, q.a((q) value, false, true, 4)));
                o53.c0.c(b0Var, null);
            }
            a2 a2Var2 = a2.LIFESTYLE_LOGGING;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "LifestyleLoggingOnboardingViewModel", "Saving behaviour changes");
            tv0.i iVar = mVar.f66236c;
            List list = (List) mVar.f66243j.getValue();
            b63.o oVarD = g22.l.d(b63.o.INSTANCE);
            b63.i.INSTANCE.getClass();
            r53.i iVarG = tv0.i.g(iVar, list, null, b63.q.c(oVarD, 7, b63.i.f16190d), Boolean.valueOf(((d0) mVar.f66249p.getValue()).f66201b), 2);
            a aVar2 = new a(b0Var, mVar, null);
            this.f66258b = b0Var;
            this.f66257a = 1;
            if (r53.s.k(iVarG, aVar2, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 == 2) {
                o13.r.b(obj);
                if (o53.c0.g(b0Var)) {
                    a2 a2Var3 = a2.LIFESTYLE_LOGGING;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var3, "LifestyleLoggingOnboardingViewModel", "Saving onboarding completed status");
                    this.f66258b = b0Var;
                    this.f66257a = 3;
                    int i15 = m.f66233v;
                    mVar.getClass();
                    x53.c cVar = s0.f129406a;
                    objE0 = ge1.b.e0(x53.b.f189152a, new p(mVar, null), this);
                }
                return Unit.INSTANCE;
            }
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objE0 = obj;
        }
        v2 v2Var = (v2) objE0;
        if (v2Var instanceof v2.b) {
            a2 a2Var4 = a2.LIFESTYLE_LOGGING;
            i2.f36769a.getClass();
            i2.a.b(a2Var4, "LifestyleLoggingOnboardingViewModel", "Onboarding completed successfully");
            p2 p2Var3 = mVar.f66247n;
            do {
                value4 = p2Var3.getValue();
            } while (!p2Var3.b(value4, q.a((q) value4, false, false, 2)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var5 = a2.LIFESTYLE_LOGGING;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to save onboarding completed status: ");
            i2.f36769a.getClass();
            i2.a.f(a2Var5, "LifestyleLoggingOnboardingViewModel", strD);
            p2 p2Var4 = mVar.f66247n;
            do {
                value3 = p2Var4.getValue();
            } while (!p2Var4.b(value3, q.a((q) value3, false, true, 4)));
        }
        return Unit.INSTANCE;
        if (o53.c0.g(b0Var)) {
            a2 a2Var6 = a2.LIFESTYLE_LOGGING;
            i2.f36769a.getClass();
            i2.a.b(a2Var6, "LifestyleLoggingOnboardingViewModel", "Saving reminder");
            m1 m1VarA = mVar.f66237d.a((rd1.a) mVar.f66246m.f150540a.getValue());
            b bVar = new b(b0Var, mVar, null);
            this.f66258b = b0Var;
            this.f66257a = 2;
            if (r53.s.k(m1VarA, bVar, this) != aVar) {
                if (o53.c0.g(b0Var)) {
                    a2 a2Var7 = a2.LIFESTYLE_LOGGING;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var7, "LifestyleLoggingOnboardingViewModel", "Saving onboarding completed status");
                    this.f66258b = b0Var;
                    this.f66257a = 3;
                    int i16 = m.f66233v;
                    mVar.getClass();
                    x53.c cVar2 = s0.f129406a;
                    objE0 = ge1.b.e0(x53.b.f189152a, new p(mVar, null), this);
                }
            }
            return aVar;
        }
        if (o53.c0.g(b0Var)) {
            a2 a2Var8 = a2.LIFESTYLE_LOGGING;
            i2.f36769a.getClass();
            i2.a.b(a2Var8, "LifestyleLoggingOnboardingViewModel", "Saving onboarding completed status");
            this.f66258b = b0Var;
            this.f66257a = 3;
            int i17 = m.f66233v;
            mVar.getClass();
            x53.c cVar3 = s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new p(mVar, null), this);
        }
        return Unit.INSTANCE;
    }
}
