package qw;

import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.blood_pressure.presentation.BloodPressureReportsViewModel$getLastMeasurementInInterval$1", f = "BloodPressureReportsViewModel.kt", l = {229}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f148274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f148275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f148276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f148277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z0<pw.a> f148278e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, DateTime dateTime, DateTime dateTime2, z0<pw.a> z0Var, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f148275b = gVar;
        this.f148276c = dateTime;
        this.f148277d = dateTime2;
        this.f148278e = z0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f148275b, this.f148276c, this.f148277d, this.f148278e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f148274a;
        if (i14 == 0) {
            r.b(obj);
            lw.b bVar = this.f148275b.f148246a;
            this.f148274a = 1;
            obj = bVar.g(this.f148276c, this.f148277d, this);
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
        boolean z14 = v2Var instanceof v2.b;
        z0<pw.a> z0Var = this.f148278e;
        if (z14) {
            z0Var.onChanged((pw.a) h0.d0((List) ((v2.b) v2Var).f47386a));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            z0Var.onChanged(null);
        }
        return Unit.INSTANCE;
    }
}
