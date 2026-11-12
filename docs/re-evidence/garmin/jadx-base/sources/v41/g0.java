package v41;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lv41/g0;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "isMetric", "Lo53/b0;", "coroutineScope", "Lr53/z1;", "Lu41/b;", "paceProPlanFlow", "<init>", "(Landroid/content/Context;ZLo53/b0;Lr53/z1;)V", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f175603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o53.b0 f175604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1<u41.b> f175605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f175606d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pacepro.domain.usecase.UpdateStatsUseCase$updateGoalTime$1", f = "UpdateStatsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f175608b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j8, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f175608b = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return g0.this.new a(this.f175608b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u41.b value;
            u41.b bVar;
            boolean z14;
            com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVarB;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            z1<u41.b> z1Var = g0.this.f175605c;
            do {
                value = z1Var.getValue();
                bVar = value;
                com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVar2 = bVar.f168609a;
                com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar2 = aVar2.f39760b;
                double d14 = bVar2.f39770g;
                long j8 = this.f175608b;
                z14 = true;
                aVarB = com.garmin.android.apps.connectmobile.pacepro.data.dto.a.b(aVar2, null, com.garmin.android.apps.connectmobile.pacepro.data.dto.b.b(bVar2, null, null, null, null, 0.0d, null, null, j8, d14 / (j8 >= 1 ? j8 : 1L), false, null, null, null, 260607), 1);
                if (!bVar.f168622n && bVar.f168609a.f39760b.f39773j == j8) {
                    z14 = false;
                }
            } while (!z1Var.b(value, u41.b.a(bVar, aVarB, null, null, 0, 0, null, null, null, null, null, null, false, false, z14, 8190)));
            return Unit.INSTANCE;
        }
    }

    public g0(Context context, boolean z14, o53.b0 b0Var, z1<u41.b> z1Var) {
        context.getClass();
        b0Var.getClass();
        z1Var.getClass();
        this.f175603a = z14;
        this.f175604b = b0Var;
        this.f175605c = z1Var;
        String string = context.getString(R.string.txt_untitle);
        string.getClass();
        this.f175606d = string;
    }

    public final void a(long j8) {
        x53.c cVar = s0.f129406a;
        ge1.b.T(this.f175604b, x53.b.f189152a, null, new a(j8, null), 2);
    }

    public final boolean b() {
        u41.b value = this.f175605c.getValue();
        return !p005kotlin.jvm.internal.s.g(value.f168618j, value.f168609a.f39759a);
    }
}
