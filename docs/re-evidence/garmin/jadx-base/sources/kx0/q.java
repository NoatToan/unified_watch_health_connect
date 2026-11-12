package kx0;

import c83.a0;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.MenstrualCycleSettingsViewModel$postSettings$3", f = "MenstrualCycleSettingsViewModel.kt", l = {295}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f107106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ db1.m f107107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f107108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f107109d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(db1.m mVar, LocalDate localDate, m mVar2, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f107107b = mVar;
        this.f107108c = localDate;
        this.f107109d = mVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f107107b, this.f107108c, this.f107109d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        db1.m mVar = this.f107107b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f107106a;
        m mVar2 = this.f107109d;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                mVar.A(DateTime.now());
                ax0.a aVar2 = (ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null);
                String string = this.f107108c.toString();
                string.getClass();
                this.f107106a = 1;
                obj = aVar2.s(string, mVar, this);
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
            mVar2.f107068k.j(tb1.d.b(null, new Integer(((a0) obj).f25745a.code()), null, null, 13));
        } catch (Throwable th3) {
            mVar2.f107068k.j(tb1.d.b(null, null, th3, null, 11));
        }
        return Unit.INSTANCE;
    }
}
