package or0;

import com.garmin.android.apps.connectmobile.v2;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.intensityminutes.presentation.IntensityMinutesReportsViewModel$updateIntensityMinutesGoal$1", f = "IntensityMinutesReportsViewModel.kt", l = {202}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f133393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f133394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f133395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l<Boolean, Unit> f133396d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(m mVar, int i14, e23.l<? super Boolean, Unit> lVar, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f133394b = mVar;
        this.f133395c = i14;
        this.f133396d = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f133394b, this.f133395c, this.f133396d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Exception {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f133393a;
        e23.l<Boolean, Unit> lVar = this.f133396d;
        m mVar = this.f133394b;
        try {
            if (i14 == 0) {
                r.b(obj);
                m.x4(mVar, true);
                zk0.h hVar = new zk0.h("INTENSITY_MINUTES", this.f133395c);
                al0.k kVar = mVar.f133363b;
                String string = new fz0.c(DateTime.now(), null, 2, null).toString();
                this.f133393a = 1;
                obj = kVar.a("intensity-minutes", string, hVar, this);
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
            if (((v2) obj) instanceof v2.b) {
                lVar.invoke(Boolean.TRUE);
                m.x4(mVar, false);
            }
            return Unit.INSTANCE;
        } catch (Throwable unused) {
            lVar.invoke(Boolean.FALSE);
            m.x4(mVar, false);
            q2.u("Error editing intensity minutes weekly goal");
            return null;
        }
    }
}
