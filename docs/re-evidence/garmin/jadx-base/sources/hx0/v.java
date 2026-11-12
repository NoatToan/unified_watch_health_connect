package hx0;

import androidx.lifecycle.y0;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleDetailsViewModel$getGlucoseData$1", f = "MenstrualCycleDetailsViewModel.kt", l = {347}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocalDate f86186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0<fw.m<db1.s>> f86187c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(LocalDate localDate, y0<fw.m<db1.s>> y0Var, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f86186b = localDate;
        this.f86187c = y0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v(this.f86186b, this.f86187c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f86185a;
        y0<fw.m<db1.s>> y0Var = this.f86187c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                ax0.a aVar2 = (ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null);
                LocalDate localDate = this.f86186b;
                this.f86185a = 1;
                obj = aVar2.D(localDate, this);
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
            y0Var.j(tb1.d.b(a0Var.f25746b, new Integer(a0Var.f25745a.code()), null, null, 12));
        } catch (Throwable th3) {
            y0Var.j(tb1.d.b(null, null, th3, null, 11));
        }
        return Unit.INSTANCE;
    }
}
