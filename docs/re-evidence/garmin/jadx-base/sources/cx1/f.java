package cx1;

import c83.a0;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import o13.r;
import o53.i0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lyw1/g;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.network.repo.FitnessStatsRepo$getFitnessCoachVigorousIMCalories$2", f = "FitnessStatsRepo.kt", l = {SyslogConstants.LOG_LOCAL1}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.l<t13.d<? super a0<List<? extends yw1.g>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f56627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f56628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f56629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LocalDate f56630d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o oVar, LocalDate localDate, LocalDate localDate2, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f56628b = oVar;
        this.f56629c = localDate;
        this.f56630d = localDate2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f56628b, this.f56629c, this.f56630d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends yw1.g>>> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f56627a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        bx1.a aVar2 = this.f56628b.f56664a;
        fy1.i.f73924a.getClass();
        List<String> list = (List) fy1.i.f73935l.getValue();
        pu1.c.f141303c.getClass();
        i0<a0<List<yw1.g>>> i0VarL = aVar2.l(this.f56629c, this.f56630d, list, pu1.c.a.a(), (List) fy1.i.f73936m.getValue(), true, false, TtmlNode.COMBINE_ALL);
        this.f56627a = 1;
        Object objAwait = i0VarL.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
