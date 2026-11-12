package yt;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.player.AnnualReportPlayerViewModel$loadAnnualReportDataListFromCache$2", f = "AnnualReportPlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f199366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<ot.n> f199367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f199368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f199369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tt.i f199370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ot.x f199371f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(List<? extends ot.n> list, n nVar, Context context, tt.i iVar, ot.x xVar, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f199367b = list;
        this.f199368c = nVar;
        this.f199369d = context;
        this.f199370e = iVar;
        this.f199371f = xVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        p pVar = new p(this.f199367b, this.f199368c, this.f199369d, this.f199370e, this.f199371f, dVar);
        pVar.f199366a = obj;
        return pVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        ot.l c0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        ArrayList arrayListX = v.h.x(obj);
        Iterator<T> it = this.f199367b.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            n nVar = this.f199368c;
            if (!zHasNext) {
                ArrayList arrayList = nVar.f199344e;
                ArrayList arrayList2 = nVar.f199344e;
                arrayList.clear();
                arrayList2.addAll(arrayListX);
                String strF = v.e0.f(arrayList2.size(), "loadAnnualReportDataListFromCache loaded ", " chapters");
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "AnnualReportPlayerViewModel", strF);
                nVar.f199347h.j(Boolean.TRUE);
                nVar.f199341b.f192134c.a(true);
                return Unit.INSTANCE;
            }
            ot.n nVar2 = (ot.n) it.next();
            ot.n.f133627b.getClass();
            Context context = this.f199369d;
            context.getClass();
            tt.i iVar = this.f199370e;
            iVar.getClass();
            nVar2.getClass();
            ot.x xVar = this.f199371f;
            xVar.getClass();
            switch (ot.n.c.a.f133644a[nVar2.ordinal()]) {
                case 1:
                    c0Var = new ot.c0(context, iVar.getSteps(), xVar);
                    break;
                case 2:
                    c0Var = new ot.t(context, iVar.getPushes(), xVar);
                    break;
                case 3:
                    c0Var = new ot.z(context, iVar.getSleepScore(), xVar);
                    break;
                case 4:
                    c0Var = new ot.y(context, iVar.getSleep(), xVar);
                    break;
                case 5:
                    c0Var = new ot.q(context, iVar.getBodyBattery(), xVar);
                    break;
                case 6:
                    c0Var = new ot.j(context, iVar.getActivitySummary(), xVar);
                    break;
                case 7:
                    c0Var = new ot.k(context, iVar.getActivityTime(), xVar);
                    break;
                case 8:
                    c0Var = new ot.d(context, iVar.getActivityElevation(), xVar);
                    break;
                case 9:
                    c0Var = new ot.f(context, iVar.getActivityDistance(), xVar);
                    break;
                case 10:
                    c0Var = new ot.e(context, iVar.getActivityCalories(), xVar);
                    break;
                case 11:
                    c0Var = new ot.b(context, iVar.getAchievements(), xVar);
                    break;
                case 12:
                    c0Var = new ot.u(context, iVar, xVar);
                    break;
                default:
                    u0.r();
                    return null;
            }
            if (c0Var.n()) {
                String strConcat = "add chapter: ".concat(c0Var.getClass().getSimpleName());
                i2.a aVar3 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar3.getClass();
                i2.a.b(a2Var2, "AnnualReportPlayerViewModel", strConcat);
                arrayListX.add(c0Var);
                xt.a aVar4 = nVar.f199341b;
                String f133677s = c0Var.getF133705t();
                aVar4.getClass();
                f133677s.getClass();
                if (!aVar4.f192134c.h()) {
                    nt.a.f127827a.getClass();
                    ht.s sVar = ht.s.f85508a;
                    lt.a.f fVar = new lt.a.f(f133677s, lt.a.c.ACTION_CHAPTER_GENERATED);
                    sVar.getClass();
                    ht.s.a(fVar);
                    i2.a.b(a2Var2, "AnnualReportRepo", "logging " + f133677s + " as generated");
                }
            }
        }
    }
}
