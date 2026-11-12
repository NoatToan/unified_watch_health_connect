package cx1;

import c83.a0;
import java.util.List;
import o13.r;
import o53.i0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lyw1/l;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.network.repo.FitnessStatsRepo$getLactateThresholdHeartRate$2", f = "FitnessStatsRepo.kt", l = {156}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.l<t13.d<? super a0<List<? extends yw1.l>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f56641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f56642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f56643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LocalDate f56644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f56645e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, LocalDate localDate, LocalDate localDate2, String str, t13.d<? super i> dVar) {
        super(1, dVar);
        this.f56642b = oVar;
        this.f56643c = localDate;
        this.f56644d = localDate2;
        this.f56645e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new i(this.f56642b, this.f56643c, this.f56644d, this.f56645e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends yw1.l>>> dVar) {
        return ((i) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f56641a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<List<yw1.l>>> i0VarK = this.f56642b.f56664a.k(fz0.d.c(this.f56643c), fz0.d.c(this.f56644d), this.f56645e);
        this.f56641a = 1;
        Object objAwait = i0VarK.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
