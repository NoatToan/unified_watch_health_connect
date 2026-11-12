package gp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.activities.health.presentation.HealthSnapshotActivity;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengeDTO;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.JetLagSummaryActivity;
import g2.q1;
import gw0.u;
import h2.j0;
import i3.cf;
import i3.df;
import i3.h6;
import i3.n6;
import i3.wd;
import i3.y5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nr.w0;
import o53.c0;
import o53.s0;
import o70.y;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p3.d0;
import p3.n1;
import p3.o2;
import p3.p0;
import p3.p1;
import pv0.w;
import ug2.x;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f78354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f78355c;

    public /* synthetic */ f(g gVar, Context context, in.c cVar) {
        this.f78353a = 0;
        this.f78354b = context;
        this.f78355c = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        o70.c cVar;
        int i14 = this.f78353a;
        Long l14 = null;
        boolean zG = false;
        Object[] objArr = 0;
        Object obj = this.f78355c;
        Object obj2 = this.f78354b;
        switch (i14) {
            case 0:
                g.b((Context) obj2, (in.c) obj, 0);
                return Unit.INSTANCE;
            case 1:
                e23.a aVar = (e23.a) obj;
                if (((o70.n) obj2) != o70.n.PROMPT) {
                    aVar.invoke();
                }
                return Unit.INSTANCE;
            case 2:
                in.c cVar2 = (in.c) obj;
                g gVar = (g) obj2;
                if (cVar2 != null && (cVar = cVar2.f94394b) != null) {
                    String strD = cVar.d();
                    ht.s sVar = ht.s.f85508a;
                    lt.e.b bVar = new lt.e.b(lt.e.a.Add, o70.b.ACTIVITY, strD);
                    sVar.getClass();
                    ht.s.a(bVar);
                }
                if (cVar2 != null) {
                    gVar.f78356a.f84893b.a(cVar2.f94394b);
                }
                return Unit.INSTANCE;
            case 3:
                Context context = (Context) obj2;
                ht.s sVar2 = ht.s.f85508a;
                lt.e.b bVar2 = new lt.e.b(lt.e.a.Tapped, o70.b.HEALTH_SNAPSHOT, null, 4, null);
                sVar2.getClass();
                ht.s.a(bVar2);
                HealthSnapshotActivity.a aVar2 = HealthSnapshotActivity.f29015d;
                sn.h hVar = ((t) obj).f78423a.f84928b;
                aVar2.getClass();
                context.getClass();
                Intent intent = new Intent(context, (Class<?>) HealthSnapshotActivity.class);
                intent.putExtra("ACTIVITY_EXTRA", hVar);
                context.startActivity(intent);
                return Unit.INSTANCE;
            case 4:
                Context context2 = (Context) obj2;
                Long l15 = ((cs0.c) obj).f55449b;
                if (l15 != null && l15.longValue() > 0) {
                    l14 = l15;
                }
                context2.startActivity(JetLagSummaryActivity.a.b(JetLagSummaryActivity.f36977o, context2, false, l14, 10));
                ht.s sVar3 = ht.s.f85508a;
                lt.e.m mVar = new lt.e.m(lt.e.a.Tapped, y.JET_LAG);
                sVar3.getClass();
                ht.s.a(mVar);
                return Unit.INSTANCE;
            case 5:
                pt1.p pVar = (pt1.p) obj;
                ((e23.p) obj2).invoke(Long.valueOf(pVar.f140929a), Long.valueOf(pVar.f140930b));
                return Unit.INSTANCE;
            case 6:
                ((e23.l) obj2).invoke((w) obj);
                return Unit.INSTANCE;
            case 7:
                ((u) obj2).x4((b63.o) obj, false);
                return Unit.INSTANCE;
            case 8:
                ((x) obj2).invoke();
                ((e23.a) obj).invoke();
                return Unit.INSTANCE;
            case 9:
                ((e23.l) obj2).invoke((pv0.c) obj);
                return Unit.INSTANCE;
            case 10:
                j0 j0Var = (j0) obj;
                h2.w wVar = (h2.w) ((d0) obj2).getF182175a();
                return new h2.x(j0Var, wVar, new q1((j23.l) j0Var.f80928d.f80899f.getF182175a(), wVar));
            case 11:
                ((i21.d) obj2).G4();
                ((e23.a) obj).invoke();
                return Unit.INSTANCE;
            case 12:
                x01.a aVar3 = (x01.a) obj;
                ht.s sVar4 = ht.s.f85508a;
                h21.u uVar = new h21.u();
                sVar4.getClass();
                ht.s.a(uVar);
                if (!b21.b.b((Context) obj2)) {
                    aVar3.invoke();
                }
                return Unit.INSTANCE;
            case 13:
                ((e23.l) obj2).invoke(((k01.l) obj).f102094a);
                return Unit.INSTANCE;
            case 14:
                h62.m mVar2 = (h62.m) obj2;
                mVar2.getClass();
                ge1.b.T(v1.a(mVar2), null, null, new h62.p(mVar2, null), 3);
                ((zc.d) obj).e();
                return Unit.INSTANCE;
            case 15:
                ha0.k kVar = (ha0.k) obj2;
                e23.a aVar4 = (e23.a) obj;
                List<ha0.d.b> list = ((ha0.g) kVar.f82655i.getValue()).f82638b;
                ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ha0.d.b) it.next()).f82630b);
                }
                x53.c cVar3 = s0.f129406a;
                ge1.b.T(c0.a(x53.b.f189152a), null, null, new ha0.j(kVar, arrayList, null), 3);
                aVar4.invoke();
                return Unit.INSTANCE;
            case 16:
                ((e23.l) obj2).invoke(((ha0.d.b) obj).f82630b);
                return Unit.INSTANCE;
            case 17:
                return p13.w.c(new o13.p((nf.j.a) obj2, (k23.d) obj));
            case 18:
                ((e23.l) obj2).invoke(((ho.y) obj).f84690a);
                return Unit.INSTANCE;
            case 19:
                int i15 = ho0.h.f84713l;
                h82.c.f((ho0.h) obj, (Context) obj2, "http://www.heart.org/HEARTORG/Conditions/HighBloodPressure/GettheFactsAboutHighBloodPressure/All-About-Heart-Rate-Pulse_UCM_438850_Article.jsp#.WoNtgXanFPY");
                return Unit.INSTANCE;
            case 20:
                qo0.a aVar5 = (qo0.a) obj2;
                DateTime dateTime = new DateTime(((gs1.d.b) obj).f78713a);
                aVar5.getClass();
                ge1.b.T(v1.a(aVar5), null, null, new qo0.b(dateTime, aVar5, null), 3);
                aVar5.x4(null);
                return Unit.INSTANCE;
            case 21:
                ((hs.j) obj2).f85338d.b((w0) obj);
                return Unit.INSTANCE;
            case 22:
                Context context3 = (Context) obj2;
                us1.h hVar2 = ((pt1.l) obj).f140883j;
                return p0.n(hVar2 != null ? context3.getString(hVar2.f172408b) : "");
            case 23:
                ((wd2.a) obj2).c((Activity) obj);
                return Unit.INSTANCE;
            case 24:
                float f14 = com.garmin.android.apps.connectmobile.newsfeed.d.f39492d;
                return g6.f.a(((g6.c) obj2).c1(((n1) obj).getIntValue()));
            case 25:
                i10.h hVar3 = (i10.h) obj;
                int i16 = i10.h.f87056h;
                return new i10.e((GroupChallengeDTO) obj2, hVar3.f87060d, hVar3.f87063g);
            case 26:
                String str = (String) obj2;
                p1 p1Var = (p1) obj;
                String str2 = ((y5) p1Var.getF182175a()).f90407a;
                int i17 = h6.f88295a;
                y5.f90403b.getClass();
                if (p005kotlin.jvm.internal.s.g(str, y5.f90404c) || p005kotlin.jvm.internal.s.g(str, y5.f90405d)) {
                    zG = true;
                } else {
                    String str3 = y5.f90406e;
                    if (p005kotlin.jvm.internal.s.g(str, str3)) {
                        zG = p005kotlin.jvm.internal.s.g(str2, str3);
                    }
                }
                if (zG) {
                    p1Var.setValue(y5.a(str));
                }
                return Unit.INSTANCE;
            case 27:
                wd wdVar = (wd) obj2;
                n6 n6Var = (n6) obj;
                if (!p005kotlin.jvm.internal.s.g(wdVar, n6Var.f89062a)) {
                    p13.d0.B(new ho0.g(wdVar, 16), n6Var.f89063b);
                    o2 o2Var = n6Var.f89064c;
                    if (o2Var != null) {
                        o2Var.invalidate();
                    }
                }
                return Unit.INSTANCE;
            case 28:
                return new cf((df) obj2, (e23.l) obj);
            default:
                return k63.k.e((String) obj2, k63.c.b.f103223a, new k63.e[0], new i63.f((i63.g) obj, objArr == true ? 1 : 0));
        }
    }

    public /* synthetic */ f(int i14, Object obj, Object obj2) {
        this.f78353a = i14;
        this.f78354b = obj;
        this.f78355c = obj2;
    }

    public /* synthetic */ f(Object obj, int i14, Object obj2, boolean z14) {
        this.f78353a = i14;
        this.f78355c = obj;
        this.f78354b = obj2;
    }
}
