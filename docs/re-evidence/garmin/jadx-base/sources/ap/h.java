package ap;

import androidx.lifecycle.y0;
import e23.p;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import ps.d1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.multisport.advancededit.viewmodel.MultisportEditLegsViewModel$getDivisionChartData$1", f = "MultisportEditLegsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y0<zm.p> f11629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f11630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f11633e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(y0<zm.p> y0Var, d dVar, int i14, int i15, fz.c cVar, t13.d<? super h> dVar2) {
        super(2, dVar2);
        this.f11629a = y0Var;
        this.f11630b = dVar;
        this.f11631c = i14;
        this.f11632d = i15;
        this.f11633e = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f11629a, this.f11630b, this.f11631c, this.f11632d, this.f11633e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        double d14;
        List<d1> listSubList;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        yo.e eVar = this.f11630b.f11593e;
        eVar.getClass();
        fz.c cVar = this.f11633e;
        cVar.getClass();
        y0<List<d1>> y0Var = eVar.f198239i;
        List<d1> listD = y0Var.d();
        int i14 = this.f11632d;
        im.b bVarA = null;
        d1 d1Var = listD != null ? (d1) h0.e0(i14, listD) : null;
        if (d1Var != null) {
            if (cVar == fz.c.TIME) {
                d14 = d1Var.f139789e - d1Var.f139786b;
            } else {
                List<d1> listD2 = y0Var.d();
                d14 = 0.0d;
                if (listD2 != null && (listSubList = listD2.subList(0, i14)) != null) {
                    Iterator<T> it = listSubList.iterator();
                    while (it.hasNext()) {
                        d14 += ((d1) it.next()).f139787c;
                    }
                }
            }
            double d15 = (cVar == fz.c.TIME ? d1Var.f139786b : d1Var.f139787c) + d14;
            wo.b bVar = eVar.f198238h;
            if (bVar == null) {
                s.m("chartDataHandler");
                throw null;
            }
            bVarA = bVar.a(d14, d15, this.f11631c, cVar);
        }
        this.f11629a.j(bVarA);
        return Unit.INSTANCE;
    }
}
