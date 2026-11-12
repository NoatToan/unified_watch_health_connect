package fn1;

import android.content.Context;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.List;
import o53.b0;
import o53.s0;
import o53.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.detail.coach.SleepCoachDailyStatsKt$SleepCoachDailyStats$1$4$1$1$1", f = "SleepCoachDailyStats.kt", l = {313}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ km1.b f72214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ km1.c f72215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm1.s f72216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f72217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f72218f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.presentation.detail.coach.SleepCoachDailyStatsKt$SleepCoachDailyStats$1$4$1$1$1$1", f = "SleepCoachDailyStats.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ km1.b f72219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ km1.c f72220b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ sm1.s f72221c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f72222d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Context f72223e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(km1.b bVar, km1.c cVar, sm1.s sVar, e23.a<Unit> aVar, Context context, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f72219a = bVar;
            this.f72220b = cVar;
            this.f72221c = sVar;
            this.f72222d = aVar;
            this.f72223e = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f72219a, this.f72220b, this.f72221c, this.f72222d, this.f72223e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            km1.v dailySleep;
            km1.v dailySleep2;
            List<km1.b> listT;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            km1.b bVar = this.f72219a;
            if (bVar != null) {
                sn.a.o(f12.l.f68084a, true);
                km1.c cVar = this.f72220b;
                ArrayList arrayList = (cVar == null || (dailySleep2 = cVar.getDailySleep()) == null || (listT = dailySleep2.t()) == null) ? new ArrayList() : new ArrayList(listT);
                arrayList.add(bVar);
                this.f72221c.f160189i.setValue((cVar == null || (dailySleep = cVar.getDailySleep()) == null) ? null : km1.v.b(dailySleep, 0L, null, 0, 0L, 0L, arrayList, -1, 7167));
                this.f72222d.invoke();
            } else {
                Toast.makeText(this.f72223e, R.string.txt_error_occurred, 0).show();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(km1.b bVar, km1.c cVar, sm1.s sVar, e23.a<Unit> aVar, Context context, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f72214b = bVar;
        this.f72215c = cVar;
        this.f72216d = sVar;
        this.f72217e = aVar;
        this.f72218f = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f72214b, this.f72215c, this.f72216d, this.f72217e, this.f72218f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72213a;
        if (i14 == 0) {
            o13.r.b(obj);
            x53.c cVar = s0.f129406a;
            t1 t1Var = u53.o.f168762a;
            a aVar2 = new a(this.f72214b, this.f72215c, this.f72216d, this.f72217e, this.f72218f, null);
            this.f72213a = 1;
            if (ge1.b.e0(t1Var, aVar2, this) == aVar) {
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
