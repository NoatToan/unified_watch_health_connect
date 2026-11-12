package hx0;

import java.util.concurrent.locks.ReentrantLock;
import o53.c2;
import o53.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleDetailsViewModel$clearCachedData$2", f = "MenstrualCycleDetailsViewModel.kt", l = {210}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f86173b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleDetailsViewModel$clearCachedData$2$2", f = "MenstrualCycleDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s f86174a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s sVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f86174a = sVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f86174a, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            s sVar = this.f86174a;
            sVar.f86144h.m(null);
            if (sVar.f86144h.e()) {
                sVar.B4(true);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(s sVar, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f86173b = sVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t(this.f86173b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f86172a;
        if (i14 == 0) {
            o13.r.b(obj);
            s sVar = this.f86173b;
            ReentrantLock reentrantLock = sVar.f86143g;
            reentrantLock.lock();
            try {
                c2 c2Var = sVar.f86145i;
                if (c2Var != null) {
                    c2Var.c(null);
                    Unit unit = Unit.INSTANCE;
                }
                reentrantLock.unlock();
                x53.c cVar = o53.s0.f129406a;
                t1 t1Var = u53.o.f168762a;
                a aVar2 = new a(sVar, null);
                this.f86172a = 1;
                if (ge1.b.e0(t1Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } catch (Throwable th3) {
                reentrantLock.unlock();
                throw th3;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
