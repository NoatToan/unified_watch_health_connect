package hx0;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleSymptomsViewModel$putDailyLog$1$1", f = "MenstrualCycleSymptomsViewModel.kt", l = {90}, m = "invokeSuspend", v = 2)
public final class h0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f86065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f86066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww0.b f86067d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleSymptomsViewModel$putDailyLog$1$1$1", f = "MenstrualCycleSymptomsViewModel.kt", l = {92}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f86068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i0 f86069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LocalDate f86070c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ww0.b f86071d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i0 i0Var, LocalDate localDate, ww0.b bVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f86069b = i0Var;
            this.f86070c = localDate;
            this.f86071d = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f86069b, this.f86070c, this.f86071d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f86068a;
            i0 i0Var = this.f86069b;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    yw0.a aVar2 = i0Var.f86080a;
                    LocalDate localDate = this.f86070c;
                    ww0.b bVar = this.f86071d;
                    this.f86068a = 1;
                    obj = aVar2.i(localDate, bVar, this);
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
                if (!((Boolean) obj).booleanValue()) {
                    throw new Exception("Server call failure");
                }
                i0Var.f86083d.j(new cx0.a<>(this.f86071d, null, null, false, 12, null));
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                i0Var.f86083d.j(new cx0.a<>(null, th3, null, false, 12, null));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, LocalDate localDate, ww0.b bVar, t13.d<? super h0> dVar) {
        super(2, dVar);
        this.f86065b = i0Var;
        this.f86066c = localDate;
        this.f86067d = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h0(this.f86065b, this.f86066c, this.f86067d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f86064a;
        if (i14 == 0) {
            o13.r.b(obj);
            a aVar2 = new a(this.f86065b, this.f86066c, this.f86067d, null);
            this.f86064a = 1;
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
