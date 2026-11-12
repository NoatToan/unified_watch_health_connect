package fb1;

import androidx.lifecycle.y0;
import okhttp3.Response;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.BloodGlucoseLoggingViewModel$addBloodGlucose$1", f = "BloodGlucoseLoggingViewModel.kt", l = {23}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f70277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ db1.t f70278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f70279c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(db1.t tVar, r rVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f70278b = tVar;
        this.f70279c = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o(this.f70278b, this.f70279c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        db1.t tVar = this.f70278b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f70277a;
        r rVar = this.f70279c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                tVar.j(new DateTime());
                com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b bVar = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.f40430a;
                this.f70277a = 1;
                bVar.getClass();
                obj = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b.n(tVar, this);
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
            c83.a0 a0Var = (c83.a0) obj;
            y0<cx0.a<Unit>> y0Var = rVar.f70294a;
            T t7 = a0Var.f25746b;
            Response response = a0Var.f25745a;
            y0Var.j(new cx0.a<>(t7, null, new Integer(response.code()), response.isSuccessful()));
        } catch (Exception e4) {
            rVar.f70294a.j(new cx0.a<>(null, e4, null, false, 12, null));
        }
        return Unit.INSTANCE;
    }
}
