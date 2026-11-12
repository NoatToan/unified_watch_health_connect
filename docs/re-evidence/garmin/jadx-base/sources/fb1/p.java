package fb1;

import androidx.lifecycle.y0;
import okhttp3.Response;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.BloodGlucoseLoggingViewModel$deleteBloodGlucose$1", f = "BloodGlucoseLoggingViewModel.kt", l = {60}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f70283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DateTime f70284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f70285c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(DateTime dateTime, r rVar, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f70284b = dateTime;
        this.f70285c = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f70284b, this.f70285c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f70283a;
        r rVar = this.f70285c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b bVar = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.f40430a;
                DateTime dateTime = this.f70284b;
                this.f70283a = 1;
                bVar.getClass();
                obj = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b.a(dateTime, this);
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
            y0<cx0.a<Unit>> y0Var = rVar.f70296c;
            T t7 = a0Var.f25746b;
            Response response = a0Var.f25745a;
            y0Var.j(new cx0.a<>(t7, null, new Integer(response.code()), response.isSuccessful()));
        } catch (Exception e4) {
            rVar.f70296c.j(new cx0.a<>(null, e4, null, false, 12, null));
        }
        return Unit.INSTANCE;
    }
}
