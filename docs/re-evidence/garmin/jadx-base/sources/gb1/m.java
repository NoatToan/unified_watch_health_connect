package gb1;

import c83.a0;
import o53.b0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyDetailsViewModel$deletePregnancy$1", f = "PregnancyDetailsViewModel.kt", l = {129}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f76694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocalDate f76695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f76696c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(LocalDate localDate, l lVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f76695b = localDate;
        this.f76696c = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f76695b, this.f76696c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f76694a;
        LocalDate localDate = this.f76695b;
        l lVar = this.f76696c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b bVar = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.f40430a;
                String string = localDate.toString();
                string.getClass();
                this.f76694a = 1;
                bVar.getClass();
                obj = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b.b(string, this);
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
            lVar.f76688f.j(tb1.d.b(localDate, new Integer(((a0) obj).f25745a.code()), null, null, 12));
        } catch (Throwable th3) {
            lVar.f76688f.j(tb1.d.b(localDate, null, th3, null, 10));
        }
        return Unit.INSTANCE;
    }
}
