package rp;

import am.x0;
import android.content.Context;
import android.content.Intent;
import b63.o;
import c.q;
import c.w;
import c22.o2;
import com.garmin.android.apps.connectmobile.performance.StrengthStatsActivity;
import e23.l;
import e23.p;
import g.h;
import java.io.Serializable;
import java.util.Collection;
import lc.m0;
import lc.y;
import o82.g;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrp/c;", "Lop/a;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements op.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f154055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ np.c f154056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p<Long, x0, Unit> f154057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0 f154058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l<x0, Unit> f154059e;

    /* JADX WARN: Multi-variable type inference failed */
    public c(e23.a<Unit> aVar, np.c cVar, p<? super Long, ? super x0, Unit> pVar, m0 m0Var, l<? super x0, Unit> lVar) {
        this.f154055a = aVar;
        this.f154056b = cVar;
        this.f154057c = pVar;
        this.f154058d = m0Var;
        this.f154059e = lVar;
    }

    @Override // op.a
    public final void a(long j8, x0 x0Var) {
        x0Var.getClass();
        this.f154057c.invoke(Long.valueOf(j8), x0Var);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0032  */
    @Override // op.a
    public final q b(p pVar, m mVar) {
        pVar.getClass();
        mVar.C(930112864);
        x1 x1Var = n.f135158a;
        h hVar = new h();
        e23.a<Unit> aVar = this.f154055a;
        boolean zB = mVar.B(aVar);
        np.c cVar = this.f154056b;
        boolean zR = zB | mVar.r(cVar) | mVar.B(pVar);
        Object objQ = mVar.q();
        int i14 = 0;
        if (zR) {
            objQ = new b(aVar, i14, cVar, pVar);
            mVar.K(objQ);
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new b(aVar, i14, cVar, pVar);
                mVar.K(objQ);
            }
        }
        q qVarC = w.c(hVar, (l) objQ, mVar, 0);
        mVar.f();
        return qVarC;
    }

    @Override // op.a
    public final void c(x0 x0Var) {
        x0Var.getClass();
        this.f154059e.invoke(x0Var);
    }

    @Override // op.a
    public final void d(int i14, int i15) {
        y.l(this.f154058d, new f(i14, i15));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.Serializable, java.lang.Object[]] */
    @Override // op.a
    public final void e(Context context, q<Intent, f.a> qVar, mp.a aVar, g gVar, o oVar) {
        Collection collection;
        context.getClass();
        qVar.getClass();
        gVar.getClass();
        DateTime dateTime = new DateTime(String.valueOf(oVar));
        LocalDate localDate = gVar == g.f130857j ? dateTime.toLocalDate() : null;
        StrengthStatsActivity.a aVar2 = StrengthStatsActivity.f39815r;
        if (aVar == null || (collection = aVar.f119947b) == null) {
            collection = j0.f134944a;
        }
        e32.o oVarC = o2.c(gVar);
        aVar2.getClass();
        collection.getClass();
        oVarC.getClass();
        Intent intent = new Intent(context, (Class<?>) StrengthStatsActivity.class);
        intent.putExtra("EXTRA_AVAILABLE_ACTIVITIES", (Serializable) collection.toArray(new mp.b[0]));
        intent.putExtra("EXTRA_YEAR_MONTH_DESTINATION", localDate);
        intent.putExtra("EXTRA_SUMMARY_TIME_INTERVAL", oVarC);
        intent.putExtra("EXTRA_INITIAL_DATE", dateTime);
        qVar.a(intent, null);
    }
}
