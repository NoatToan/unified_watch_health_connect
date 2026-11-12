package qb1;

import java.util.List;
import okhttp3.Response;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.PregnancySetupViewModel$getPregnancyWeightDTOList$1", f = "PregnancySetupViewModel.kt", l = {746}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f144160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f144161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f144162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f144163d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(LocalDate localDate, f fVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f144162c = localDate;
        this.f144163d = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f144162c, this.f144163d, dVar);
        oVar.f144161b = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f144161b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f144160a;
        f fVar = this.f144163d;
        LocalDate localDate = this.f144162c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                LocalDate localDateMinusWeeks = localDate.minusWeeks(2);
                LocalDate localDatePlusWeeks = localDate.plusWeeks(2);
                com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b bVar = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.f40430a;
                localDateMinusWeeks.getClass();
                localDatePlusWeeks.getClass();
                this.f144161b = b0Var;
                this.f144160a = 1;
                bVar.getClass();
                obj = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b.j(localDateMinusWeeks, localDatePlusWeeks, this);
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
            T t7 = a0Var.f25746b;
            Response response = a0Var.f25745a;
            List list = (List) t7;
            if (list == null || list.isEmpty()) {
                int i15 = f.D;
                fVar.K4().j(tb1.d.b(null, new Integer(response.code()), null, null, 12));
            } else {
                fVar.K4().j(tb1.d.b(f.I4(fVar, h0.Z(list), localDate), new Integer(response.code()), null, null, 12));
            }
        } catch (Throwable th3) {
            int i16 = f.D;
            fVar.K4().j(tb1.d.b(null, null, th3, null, 11));
        }
        return Unit.INSTANCE;
    }
}
