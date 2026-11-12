package fb1;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.PregnancyLoggingViewModel$getGlucoseData$1", f = "PregnancyLoggingViewModel.kt", l = {21}, m = "invokeSuspend", v = 2)
public final class o0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f70280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocalDate f70281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f70282c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(LocalDate localDate, p0 p0Var, t13.d<? super o0> dVar) {
        super(2, dVar);
        this.f70281b = localDate;
        this.f70282c = p0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o0(this.f70281b, this.f70282c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f70280a;
        p0 p0Var = this.f70282c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b bVar = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.f40430a;
                LocalDate localDate = this.f70281b;
                this.f70280a = 1;
                bVar.getClass();
                obj = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b.e(localDate, this);
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
            p0Var.f70286a.j(tb1.d.b(a0Var.f25746b, new Integer(a0Var.f25745a.code()), null, null, 12));
        } catch (Throwable th3) {
            p0Var.f70286a.j(tb1.d.b(null, null, th3, null, 11));
        }
        return Unit.INSTANCE;
    }
}
