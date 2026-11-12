package ep1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.solarcharge.EdgeSolarChargeChartViewModel$fetchEdgeSolarChargeDailyData$1", f = "EdgeSolarChargeChartViewModel.kt", l = {32}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f64928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f64929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f64930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f64931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DateTime f64932e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, long j8, DateTime dateTime, DateTime dateTime2, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f64929b = eVar;
        this.f64930c = j8;
        this.f64931d = dateTime;
        this.f64932e = dateTime2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f64929b, this.f64930c, this.f64931d, this.f64932e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        j jVar;
        Object value2;
        Object value3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f64928a;
        e eVar = this.f64929b;
        if (i14 == 0) {
            r.b(obj);
            p2 p2Var = eVar.f64934b;
            do {
                value = p2Var.getValue();
                jVar = (j) value;
            } while (!p2Var.b(value, new j(jVar.f64943a, true, jVar.f64945c)));
            jp1.b bVar = eVar.f64933a;
            this.f64928a = 1;
            bVar.getClass();
            obj = f0.J(bVar, new jp1.c(bVar, this.f64930c, this.f64931d, this.f64932e, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            ip1.b bVar2 = (ip1.b) ((v2.b) v2Var).f47386a;
            p2 p2Var2 = eVar.f64934b;
            do {
                value3 = p2Var2.getValue();
                ((j) value3).getClass();
            } while (!p2Var2.b(value3, new j(bVar2, false, false)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            p2 p2Var3 = eVar.f64934b;
            do {
                value2 = p2Var3.getValue();
                ((j) value2).getClass();
            } while (!p2Var3.b(value2, new j(null, false, true)));
        }
        return Unit.INSTANCE;
    }
}
