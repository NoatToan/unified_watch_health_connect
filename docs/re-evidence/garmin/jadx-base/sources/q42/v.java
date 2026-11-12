package q42;

import am.x0;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.badges.service.model.SimpleBadgeDTO;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.proto.generated.WifiSetup;
import i3.mc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import n70.z2;
import nr.w0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p13.a1;
import p13.h0;
import p13.j0;
import p13.l0;
import p3.n1;
import p3.p1;
import r53.p2;
import r53.z1;
import rk0.c1;
import rk0.d1;
import s70.k0;
import zd0.u1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class v implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f142687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f142688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f142689d;

    public /* synthetic */ v(Object obj, int i14, Object obj2, Object obj3) {
        this.f142686a = i14;
        this.f142687b = obj;
        this.f142688c = obj2;
        this.f142689d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        nr.p value;
        List listB1;
        int i14 = this.f142686a;
        Object obj = this.f142689d;
        Object obj2 = this.f142688c;
        Object obj3 = this.f142687b;
        switch (i14) {
            case 0:
                ge1.b.T((o53.b0) obj3, null, null, new x.b((mc) obj2, null), 3).J(new s((y) obj, 0));
                return Unit.INSTANCE;
            case 1:
                qb0.b bVar = (qb0.b) obj2;
                e23.a aVar = (e23.a) obj;
                if (((d90.f) obj3) instanceof d90.f.C1248f) {
                    bVar.getClass();
                    ge1.b.T(v1.a(bVar), null, null, new qb0.c(bVar, null), 3);
                } else {
                    int i15 = qb0.b.f143957q;
                    bVar.getClass();
                    ge1.b.T(v1.a(bVar), null, null, new qb0.e(bVar, false, null), 3);
                    aVar.invoke();
                }
                return Unit.INSTANCE;
            case 2:
                p1 p1Var = (p1) obj;
                p1Var.setValue(i53.a.h(h0.h1((Iterable) p1Var.getF182175a(), ((qk0.t) obj3).f145155a)));
                ((p1) obj2).setValue(null);
                return Unit.INSTANCE;
            case 3:
                qr.t tVar = (qr.t) obj3;
                ps.r rVar = (ps.r) obj2;
                ActivityDetailChartDTO activityDetailChartDTO = (ActivityDetailChartDTO) obj;
                int i16 = qr.t.A2;
                if (rVar != null && activityDetailChartDTO != null) {
                    tVar.E4(new w0.u(rVar, activityDetailChartDTO));
                }
                return Unit.INSTANCE;
            case 4:
                qr.t tVar2 = (qr.t) obj3;
                String str = (String) obj2;
                int i17 = qr.t.A2;
                int i18 = ((SimpleBadgeDTO) obj).f30530a;
                if (p005kotlin.jvm.internal.s.g(str, ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName())) {
                    tVar2.E4(new w0.m(i18));
                } else if (str != null && str.length() > 0) {
                    tVar2.E4(new w0.p(str, i18));
                }
                return Unit.INSTANCE;
            case 5:
                qr.t tVar3 = (qr.t) obj3;
                int i19 = qr.t.A2;
                tVar3.E4(new w0.o0((x0) obj2, (Long) obj));
                tVar3.C = false;
                z1<nr.p> z1VarA5 = tVar3.a5();
                do {
                    value = z1VarA5.getValue();
                } while (!z1VarA5.b(value, nr.p.a(value, null, false, false, 29)));
                return Unit.INSTANCE;
            case 6:
                ((p1) obj).setValue(Boolean.FALSE);
                ((e23.l) obj3).invoke((com.garmin.android.apps.connectmobile.badges.service.model.r) obj2);
                return Unit.INSTANCE;
            case 7:
                k31.c cVar = (k31.c) obj3;
                r31.f.e(cVar.f102645a, (d31.c) obj2);
                ((e23.l) obj).invoke(cVar.f102645a);
                return Unit.INSTANCE;
            case 8:
                k31.a aVar2 = (k31.a) obj3;
                k31.c cVar2 = (k31.c) obj2;
                ht.s sVar = ht.s.f85508a;
                lt.e.i iVar = new lt.e.i(lt.e.a.Dismiss, aVar2.f102604b, cVar2.f102645a.f57377a);
                sVar.getClass();
                ht.s.a(iVar);
                ((e23.p) obj).invoke(Long.valueOf(aVar2.f102603a), cVar2.f102645a);
                return Unit.INSTANCE;
            case 9:
                ((r50.g) obj3).y4(new t50.c.C3061c((com.garmin.android.apps.connectmobile.courses.model.f) obj2, (com.garmin.android.library.mapsdkadapter.f) obj));
                return Unit.INSTANCE;
            case 10:
                ((e23.l) obj3).invoke((n60.a) obj2);
                ((e23.a) obj).invoke();
                return Unit.INSTANCE;
            case 11:
                ((e23.l) obj3).invoke((g60.b) obj2);
                ((e23.a) obj).invoke();
                return Unit.INSTANCE;
            case 12:
                r72.c cVar3 = (r72.c) obj3;
                ((p1) obj).setValue(cVar3);
                ((r72.m) obj2).invoke(cVar3);
                return Unit.INSTANCE;
            case 13:
                rk0.h.d((p1) obj2, (e23.p) obj, (i53.c) obj3);
                return Unit.INSTANCE;
            case 14:
                rk0.f0 f0Var = (rk0.f0) obj3;
                e23.p pVar = (e23.p) obj2;
                i53.c cVar4 = (i53.c) obj;
                c80.u uVar = f0Var.f153103c;
                if (uVar != null) {
                    qk0.c.Companion companion = qk0.c.INSTANCE;
                    String str2 = f0Var.f153101a;
                    Iterable iterable = f0Var.f153121w;
                    if (iterable == null) {
                        iterable = j0.f134944a;
                    }
                    ArrayList arrayList = new ArrayList(p13.y.r(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((rk0.l) it.next()).f153210b);
                    }
                    Set setG1 = h0.g1(arrayList);
                    companion.getClass();
                    setG1.getClass();
                    qk0.c cVarA = qk0.c.Companion.a(a1.b(uVar), str2 != null ? a1.b(str2) : l0.f134950a, setG1);
                    if (cVar4 == null || (listB1 = h0.b1(cVar4)) == null) {
                        listB1 = j0.f134944a;
                    }
                    pVar.invoke(listB1, cVarA);
                }
                return Unit.INSTANCE;
            case 15:
                ((c.q) obj3).a(((e23.l) obj2).invoke(Long.valueOf(((wo0.a) obj).f186415a)), null);
                return Unit.INSTANCE;
            case 16:
                return new rk0.x0(((d1) obj3).f153089a, ((c1) obj2).f153081a, (List) obj);
            case 17:
                ht.s sVar2 = ht.s.f85508a;
                kt.a.e eVar = new kt.a.e(kt.a.EnumC2056a.Tapped, kt.a.f.DEVICE);
                sVar2.getClass();
                ht.s.a(eVar);
                ge1.b.T((o53.b0) obj3, null, null, new ro0.s((Context) obj2, (bm2.c) obj, null), 3);
                return Unit.INSTANCE;
            case 18:
                g3 g3Var = (g3) obj3;
                e23.l lVar = (e23.l) obj2;
                e23.a aVar3 = (e23.a) obj;
                if (g3Var.f35300a == fw.p.SUCCESS) {
                    tw1.m mVar = (tw1.m) g3Var.f35301b;
                    lVar.invoke(Long.valueOf(mVar != null ? mVar.getTrainingPlanId() : 0L));
                } else {
                    aVar3.invoke();
                }
                return Unit.INSTANCE;
            case 19:
                androidx.fragment.app.m mVar2 = (androidx.fragment.app.m) obj3;
                tw1.j jVar = (tw1.j) obj2;
                sw1.a aVar4 = (sw1.a) obj;
                wt1.a aVar5 = (wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null);
                long workoutId = jVar.getWorkoutId();
                Long workoutScheduleId = jVar.getWorkoutScheduleId();
                aVar5.q(mVar2, workoutId, workoutScheduleId != null ? workoutScheduleId.longValue() : 0L, g22.k.f(aVar4.f161085a.o(), jVar.j()));
                return Unit.INSTANCE;
            case 20:
                ge1.b.T((o53.b0) obj3, null, null, new ry0.i.b((ly0.r) obj2, (ry0.j) obj, null), 3);
                return Unit.INSTANCE;
            case 21:
                ((e23.l) obj3).invoke(Long.valueOf(((z2.b) obj2).f124811a));
                ((p1) obj).setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 22:
                ((c.q) obj3).a(((n70.g) obj2).n((Context) obj), null);
                return Unit.INSTANCE;
            case 23:
                ((e23.a) obj3).invoke();
                ht.s sVar3 = ht.s.f85508a;
                lt.e.l lVar2 = new lt.e.l(lt.e.a.Tapped);
                sVar3.getClass();
                ht.s.a(lVar2);
                ((k0) obj2).f157719b.D((Context) obj);
                return Unit.INSTANCE;
            case 24:
                Activity activity = (Activity) obj3;
                c.q qVar = (c.q) obj2;
                u1 u1Var = (u1) obj;
                ht.a aVar6 = ht.a.f85464a;
                Bundle bundleA = h7.c.a(new o13.p("Screen", "InReachHomeEmergencyContacts"), new o13.p("Action", "GetStarted"));
                aVar6.getClass();
                ht.a.a(bundleA, "UserAction");
                if (activity != null) {
                    try {
                        qVar.a(u1.d(u1Var, activity), null);
                    } catch (Exception unused) {
                        Toast.makeText(activity, R.string.msg_something_went_wrong_please_try_again_later, 0).show();
                    }
                    break;
                }
                return Unit.INSTANCE;
            case 25:
                ((e23.a) obj3).invoke();
                ht.s sVar4 = ht.s.f85508a;
                lt.e.l lVar3 = new lt.e.l(lt.e.a.Tapped);
                sVar4.getClass();
                ht.s.a(lVar3);
                ((s70.c1) obj2).f157674b.y((Context) obj);
                return Unit.INSTANCE;
            case 26:
                j70.r rVar2 = (j70.r) obj2;
                r70.z zVar = (r70.z) obj;
                ((e23.a) obj3).invoke();
                if (rVar2 != null) {
                    zVar.getClass();
                    p2 p2Var = zVar.f151127k;
                    g3.f35298f.getClass();
                    p2Var.k(null, g3.a.d(rVar2));
                }
                g3 g3Var2 = (g3) zVar.f151128l.f150540a.getValue();
                g3Var2.getClass();
                j70.r rVar3 = (j70.r) g3Var2.f35301b;
                if (rVar3 != null) {
                    zVar.x4(rVar3, true);
                }
                return Unit.INSTANCE;
            case 27:
                Context context = (Context) obj3;
                o70.v vVar = (o70.v) obj2;
                ht.s sVar5 = ht.s.f85508a;
                lt.e.l lVar4 = new lt.e.l(lt.e.a.Tapped);
                sVar5.getClass();
                ht.s.a(lVar4);
                new androidx.appcompat.app.e.a(context).setTitle(vVar.f130105b).setMessage(vVar.f130106c).setPositiveButton(R.string.lbl_status, new pk1.t(5, context, (String) obj)).setNegativeButton(R.string.lbl_close, new qh1.j(12)).show();
                return Unit.INSTANCE;
            case 28:
                sa0.n.b bVar2 = (sa0.n.b) obj3;
                e23.a aVar7 = (e23.a) obj2;
                e23.a aVar8 = (e23.a) obj;
                if (!bVar2.f158214a) {
                    if (bVar2.f158220g == WifiSetup.StatusType.ConnectionSuccess) {
                        aVar7.invoke();
                    } else {
                        aVar8.invoke();
                    }
                }
                return Unit.INSTANCE;
            default:
                n1 n1Var = (n1) obj;
                ((p1) obj3).setValue(Boolean.FALSE);
                ((p1) obj2).setValue(Boolean.TRUE);
                n1Var.t(n1Var.getIntValue() + 1);
                return Unit.INSTANCE;
        }
    }
}
