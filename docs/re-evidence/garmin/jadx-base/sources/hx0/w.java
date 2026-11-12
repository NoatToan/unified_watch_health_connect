package hx0;

import androidx.lifecycle.y0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleDetailsViewModel$getHasCycle$1$1", f = "MenstrualCycleDetailsViewModel.kt", l = {175}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f86189b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleDetailsViewModel$getHasCycle$1$1$1", f = "MenstrualCycleDetailsViewModel.kt", l = {177}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f86190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s f86191b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s sVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f86191b = sVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f86191b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f86190a;
            s sVar = this.f86191b;
            boolean z14 = true;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    yw0.a aVar2 = sVar.f86137a;
                    this.f86190a = 1;
                    obj = aVar2.c(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                y0<cx0.a<Boolean>> y0Var = sVar.f86144h;
                if (((c83.a0) obj).f25745a.code() != 200) {
                    z14 = false;
                }
                y0Var.j(new cx0.a<>(Boolean.valueOf(z14), null, null, false, 12, null));
            } catch (Throwable th3) {
                sVar.f86144h.j(new cx0.a<>(null, th3, null, false, 12, null));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(s sVar, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f86189b = sVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w(this.f86189b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f86188a;
        s sVar = this.f86189b;
        if (i14 == 0) {
            o13.r.b(obj);
            a aVar2 = new a(sVar, null);
            this.f86188a = 1;
            if (ge1.b.Y(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        sVar.f86145i = null;
        return Unit.INSTANCE;
    }
}
