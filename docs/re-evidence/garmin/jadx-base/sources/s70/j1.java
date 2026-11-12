package s70;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.garmin.proto.generated.WifiSetup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f157714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f157715c;

    public /* synthetic */ j1(int i14, Object obj, Object obj2) {
        this.f157713a = i14;
        this.f157714b = obj;
        this.f157715c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f157713a;
        Object obj = this.f157715c;
        Object obj2 = this.f157714b;
        switch (i14) {
            case 0:
                ht.a aVar = ht.a.f85464a;
                Bundle bundleA = h7.c.a(new o13.p("Screen", "Home"), new o13.p("Type", "InReachSubscriptionBanner"), new o13.p("Action", "ManagePlan"));
                aVar.getClass();
                ht.a.a(bundleA, "UserAction");
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData((Uri) obj);
                ((c.q) obj2).a(intent, null);
                break;
            case 1:
                ht.s sVar = ht.s.f85508a;
                lt.e.l lVar = new lt.e.l(lt.e.a.Tapped);
                sVar.getClass();
                ht.s.a(lVar);
                ((o70.v) obj2).f130107d.f25518n.invoke((Context) obj);
                break;
            case 2:
                Context context = (Context) obj;
                y70.w wVar = ((b2) obj2).f157656a;
                context.getClass();
                wVar.f194687b.k(context);
                break;
            case 3:
                ((e23.l) obj2).invoke((WifiSetup.ScannedAccessPoint) obj);
                break;
            case 4:
                ((sa0.n) obj2).A4();
                ((e23.a) obj).invoke();
                break;
            case 5:
                sg0.f0 f0Var = (sg0.f0) obj;
                Long userId = ((ue0.l) obj2).getUserId();
                if (userId != null) {
                    f0Var.y4(userId.longValue());
                }
                break;
            case 6:
                ((sg0.s0) obj2).invoke((ue0.l) obj);
                break;
            case 7:
                ti1.b bVar = (ti1.b) obj2;
                ht.a aVar2 = ht.a.f85464a;
                Bundle bundleA2 = h7.c.a(new o13.p("Screen", "InReachOpenMessengerApp"), new o13.p("Type", "CWS"), new o13.p("Action", "Dismiss"), new o13.p("IsFreeTrial", Boolean.valueOf(bVar.f164588f)), new o13.p("FromPlanSetupFlow", Boolean.valueOf(bVar.f164586d)));
                aVar2.getClass();
                ht.a.a(bundleA2, "UserAction");
                ((e23.a) obj).invoke();
                break;
            case 8:
                ht.a aVar3 = ht.a.f85464a;
                Bundle bundleA3 = h7.c.a(new o13.p("Screen", "InReachSubscriptionSetup"), new o13.p("Type", "CWS"), new o13.p("Action", "Dismiss"), new o13.p("IsFreeTrial", Boolean.valueOf(((ti1.a) obj2).f164579e)));
                aVar3.getClass();
                ht.a.a(bundleA3, "UserAction");
                ((e23.a) obj).invoke();
                break;
            case 9:
                ((sk0.f1) obj2).P1(((sk0.p1.a) ((sk0.p1) obj)).f159803a);
                break;
            case 10:
                ((sk0.g1) obj2).v0(((sk0.q1.a) ((sk0.q1) obj)).f159818a);
                break;
            case 11:
                ((e23.l) obj2).invoke(((sk0.q1.a) ((sk0.q1) obj)).f159818a);
                break;
            case 12:
                ((p3.p1) obj).setValue((c80.u) obj2);
                break;
            case 13:
                int i15 = sm0.c.T;
                ((sm0.c) obj2).Y6().f145567b.j((wg0.a) obj);
                break;
            case 14:
                e23.l lVar2 = (e23.l) obj2;
                oz1.a aVar4 = (oz1.a) obj;
                if (lVar2 != null) {
                    lVar2.invoke(aVar4);
                }
                break;
            case 15:
                ((e23.l) obj2).invoke((s21.k) obj);
                break;
            case 16:
                ((e23.l) obj2).invoke((s21.n) obj);
                break;
            case 17:
                ((e23.l) obj2).invoke((s21.s) obj);
                break;
            case 18:
                ((p3.p1) obj).setValue(Boolean.FALSE);
                ((x30.c) obj2).f188572c.invoke();
                break;
            case 19:
                ((e23.l) obj2).invoke((l42.c) obj);
                break;
            case 20:
                LocalDate localDate = ((l42.b) obj).d().toLocalDate();
                localDate.getClass();
                ((e23.l) obj2).invoke(g22.k.t(localDate));
                break;
            case 21:
                LocalDate localDate2 = ((l42.f) obj).getStartDate().toLocalDate();
                localDate2.getClass();
                ((e23.l) obj2).invoke(g22.k.t(localDate2));
                break;
            case 22:
                Bundle bundle = new Bundle();
                bundle.putString("Screen", ((t60.g) obj2).f162711a);
                bundle.putString("Action", "DismissCrossSellingBanner");
                ht.a.f85464a.getClass();
                ht.a.a(bundle, "UserAction");
                ((e23.a) obj).invoke();
                break;
            case 23:
                t70.q qVar = (t70.q) obj2;
                t70.q.z4(qVar, (List) qVar.f162966n.getValue());
                qVar.f162964l.k(null, Boolean.FALSE);
                ((e23.a) obj).invoke();
                break;
            case 24:
                t70.l0 l0Var = (t70.l0) obj2;
                t70.l0.z4(l0Var, l0Var.f162918o);
                l0Var.f162916m.k(null, Boolean.FALSE);
                ((e23.a) obj).invoke();
                break;
            case 25:
                t70.x0 x0Var = (t70.x0) obj2;
                x0Var.y4();
                x0Var.f163051e.setValue(null);
                x0Var.f163063q.k(null, Boolean.FALSE);
                ((e23.a) obj).invoke();
                break;
            case 26:
                ta0.x xVar = (ta0.x) obj2;
                e23.l lVar3 = (e23.l) obj;
                xVar.y4(l90.c.REJECT);
                Collection<o13.p<dk2.d, l90.b>> collectionValues = xVar.f163459c.f103446d.values();
                ArrayList arrayList = new ArrayList(p13.y.r(collectionValues, 10));
                Iterator<T> it = collectionValues.iterator();
                while (it.hasNext()) {
                    o13.p pVar = (o13.p) it.next();
                    arrayList.add(xVar.z4((l90.b) pVar.f128595b, (dk2.d) pVar.f128594a));
                }
                lVar3.invoke(arrayList);
                break;
            case 27:
                ((ta0.x) obj2).y4(l90.c.SKIP);
                ((ca0.u0) obj).invoke();
                break;
            case 28:
                c.q qVar2 = (c.q) obj2;
                j22.b bVar2 = j22.b.f96736a;
                List listY0 = ((ta0.q0) obj).f163421a ? j22.g.f96765j.f96774c : p13.h0.y0(j22.g.f96765j.f96774c, j22.a.f96720i);
                bVar2.getClass();
                j22.b.A(qVar2, listY0);
                break;
            default:
                ((e23.l) obj2).invoke((l90.k) obj);
                break;
        }
        return Unit.INSTANCE;
    }
}
