package q42;

import androidx.lifecycle.y0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightServiceMCTViewModel$fetchDailyData$1", f = "WeightServiceMCTViewModel.kt", l = {131}, m = "invokeSuspend", v = 2)
public final class e0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f142623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f142624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f142625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y0<com.garmin.android.apps.connectmobile.weighttracker.data.womenshealth.network.a<j52.c>> f142626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j52.c f142627e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightServiceMCTViewModel$fetchDailyData$1$1", f = "WeightServiceMCTViewModel.kt", l = {133}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f142628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LocalDate f142629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y0<com.garmin.android.apps.connectmobile.weighttracker.data.womenshealth.network.a<j52.c>> f142630c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ j52.c f142631d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d0 f142632e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LocalDate localDate, y0<com.garmin.android.apps.connectmobile.weighttracker.data.womenshealth.network.a<j52.c>> y0Var, j52.c cVar, d0 d0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f142629b = localDate;
            this.f142630c = y0Var;
            this.f142631d = cVar;
            this.f142632e = d0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f142629b, this.f142630c, this.f142631d, this.f142632e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:35:0x008d A[Catch: all -> 0x0011, TRY_LEAVE, TryCatch #0 {all -> 0x0011, blocks: (B:5:0x000d, B:15:0x002b, B:17:0x0030, B:19:0x0036, B:21:0x003c, B:22:0x0053, B:24:0x005d, B:26:0x0061, B:28:0x0067, B:34:0x007f, B:35:0x008d, B:12:0x0020, B:30:0x006d), top: B:40:0x0009, inners: #1 }] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            j52.f cycleSummary;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f142628a;
            LocalDate localDate = this.f142629b;
            y0<com.garmin.android.apps.connectmobile.weighttracker.data.womenshealth.network.a<j52.c>> y0Var = this.f142630c;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    com.garmin.android.apps.connectmobile.weighttracker.data.womenshealth.network.b.C0937b c0937b = com.garmin.android.apps.connectmobile.weighttracker.data.womenshealth.network.b.f47986a;
                    this.f142628a = 1;
                    obj = c0937b.a(localDate, this);
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
                j52.c cVar = (j52.c) obj;
                if (cVar != null && (cycleSummary = cVar.getCycleSummary()) != null && !cycleSummary.h()) {
                    y0Var.j(new com.garmin.android.apps.connectmobile.weighttracker.data.womenshealth.network.a<>(this.f142631d, new IllegalArgumentException("Invalid cycle summary."), null, false, 12, null));
                } else if (p005kotlin.jvm.internal.s.g(localDate, LocalDate.now())) {
                    if (this.f142632e.y4(cVar != null ? cVar.getCycleSummary() : null)) {
                        try {
                            y0Var.j(new com.garmin.android.apps.connectmobile.weighttracker.data.womenshealth.network.a<>(cVar, null, null, false, 12, null));
                        } catch (Throwable th3) {
                            y0Var.j(new com.garmin.android.apps.connectmobile.weighttracker.data.womenshealth.network.a<>(cVar, th3, null, false, 12, null));
                        }
                    } else {
                        y0Var.j(new com.garmin.android.apps.connectmobile.weighttracker.data.womenshealth.network.a<>(cVar, null, null, false, 12, null));
                    }
                } else {
                    y0Var.j(new com.garmin.android.apps.connectmobile.weighttracker.data.womenshealth.network.a<>(cVar, null, null, false, 12, null));
                }
            } catch (Throwable th4) {
                y0Var.j(new com.garmin.android.apps.connectmobile.weighttracker.data.womenshealth.network.a<>(this.f142631d, th4, null, false, 12, null));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(d0 d0Var, LocalDate localDate, y0<com.garmin.android.apps.connectmobile.weighttracker.data.womenshealth.network.a<j52.c>> y0Var, j52.c cVar, t13.d<? super e0> dVar) {
        super(2, dVar);
        this.f142624b = d0Var;
        this.f142625c = localDate;
        this.f142626d = y0Var;
        this.f142627e = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e0(this.f142624b, this.f142625c, this.f142626d, this.f142627e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f142623a;
        if (i14 == 0) {
            o13.r.b(obj);
            a aVar2 = new a(this.f142625c, this.f142626d, this.f142627e, this.f142624b, null);
            this.f142623a = 1;
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
        this.f142624b.f142615f.remove(this.f142625c);
        return Unit.INSTANCE;
    }
}
