package a61;

import com.garmin.android.apps.connectmobile.performance.dto.StrengthStatsDto;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/performance/dto/StrengthStatsDto;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.StrengthStatsRepo$getMonthlyStats$2", f = "StrengthStatsRepo.kt", l = {41}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends StrengthStatsDto>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f1689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f1690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LocalDate f1691d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(r rVar, LocalDate localDate, LocalDate localDate2, t13.d<? super w> dVar) {
        super(1, dVar);
        this.f1689b = rVar;
        this.f1690c = localDate;
        this.f1691d = localDate2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new w(this.f1689b, this.f1690c, this.f1691d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends StrengthStatsDto>>> dVar) {
        return ((w) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f1688a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        b bVar = this.f1689b.f1666h;
        fz0.c cVarC = fz0.d.c(this.f1690c);
        fz0.c cVarC2 = fz0.d.c(this.f1691d);
        this.f1688a = 1;
        Object objA = bVar.a(cVarC, cVarC2, this);
        return objA == aVar ? aVar : objA;
    }
}
