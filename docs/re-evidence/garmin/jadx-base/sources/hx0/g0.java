package hx0;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleSymptomsViewModel$getDailyData$1$1", f = "MenstrualCycleSymptomsViewModel.kt", l = {72}, m = "invokeSuspend", v = 2)
public final class g0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f86054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f86055c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleSymptomsViewModel$getDailyData$1$1$1", f = "MenstrualCycleSymptomsViewModel.kt", l = {74}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f86056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i0 f86057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LocalDate f86058c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i0 i0Var, LocalDate localDate, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f86057b = i0Var;
            this.f86058c = localDate;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f86057b, this.f86058c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f86056a;
            i0 i0Var = this.f86057b;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    yw0.a aVar2 = i0Var.f86080a;
                    LocalDate localDate = this.f86058c;
                    this.f86056a = 1;
                    obj = aVar2.b(localDate, this);
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
                i0Var.f86084e.j(new cx0.a<>((ww0.c) obj, null, null, false, 12, null));
            } catch (Throwable th3) {
                i0Var.f86084e.j(new cx0.a<>(null, th3, null, false, 12, null));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i0 i0Var, LocalDate localDate, t13.d<? super g0> dVar) {
        super(2, dVar);
        this.f86054b = i0Var;
        this.f86055c = localDate;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g0(this.f86054b, this.f86055c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f86053a;
        if (i14 == 0) {
            o13.r.b(obj);
            a aVar2 = new a(this.f86054b, this.f86055c, null);
            this.f86053a = 1;
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
        return Unit.INSTANCE;
    }
}
