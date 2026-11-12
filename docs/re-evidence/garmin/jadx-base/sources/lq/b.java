package lq;

import am.z0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import b71.i;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.g0;
import com.garmin.android.apps.connectmobile.activities.newmodel.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mq.o;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.u;
import p13.w;
import ps.c0;
import ps.o1;
import ps.p;
import ps.q1;
import ps.x0;
import ps.x1;
import qs.x;
import tn.k;
import u62.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Llq/b;", "Lmq/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lrs/b;", "lapsData", "Lps/p;", "activitySplits", "", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/j;", "activityWorkouts", "", "Lps/c0;", "connectIqAppDtoList", "", "userWeight", "<init>", "(Landroid/content/Context;Lrs/b;Lps/p;Ljava/util/List;Ljava/util/List;D)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends mq.e {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f114255u = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List<o1> f114256q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f114257r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f114258s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f114259t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Iterable, java.lang.Object] */
    public b(Context context, rs.b bVar, p pVar, List<? extends j> list, List<c0> list2, double d14) {
        ?? arrayList;
        super(context, bVar, list, list2, d14, false, false, null);
        context.getClass();
        bVar.getClass();
        pVar.getClass();
        list.getClass();
        list2.getClass();
        this.f114256q = pVar.h();
        List<x1> listI = pVar.i();
        if (listI != null) {
            arrayList = new ArrayList();
            for (Object obj : listI) {
                if (((x1) obj).a2() == null) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = j0.f134944a;
        }
        this.f114257r = arrayList;
        this.f114258s = new ArrayList();
        this.f114259t = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((x1) obj2).a2() != x.POWER_GUIDE_SPLIT) {
                arrayList2.add(obj2);
            }
        }
        if (((x1) arrayList2.get(0)).p0() == null) {
            int i14 = 1;
            for (x1 x1Var : this.f114257r) {
                if (x1Var.a2() != x.POWER_GUIDE_SPLIT) {
                    x1Var.b3(w.c(Integer.valueOf(i14)));
                    i14++;
                }
            }
        }
        for (x1 x1Var2 : this.f114257r) {
            this.f114258s.add(new a(x1Var2.getAverageSpeed(), x1Var2.getAverageMovingSpeed(), x1Var2.getDistance(), x1Var2.getDuration(), x1Var2.getMovingDuration(), x1Var2.o0(), x1Var2.p0()));
        }
    }

    @Override // mq.e
    public final int c(int i14) {
        return !l(i14) ? 1 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00f1  */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Iterable, java.lang.Object] */
    @Override // mq.e
    @SuppressLint({"InflateParams"})
    public final View d() {
        rs.b bVar;
        double d14;
        int i14;
        to.j jVar;
        ArrayList arrayList;
        int i15;
        boolean z14;
        int i16;
        int i17;
        List<Integer> listP0;
        Context context = this.f120160a;
        Object systemService = context.getSystemService("layout_inflater");
        systemService.getClass();
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.activity_stats_laps_landscape_3_0, (ViewGroup) null);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.activity_stats_laps_number_container);
        LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(R.id.activity_stats_laps_data_container);
        LinearLayout linearLayout3 = (LinearLayout) viewInflate.findViewById(R.id.number_container);
        LinearLayout linearLayout4 = (LinearLayout) viewInflate.findViewById(R.id.data_container);
        ScrollView scrollView = (ScrollView) viewInflate.findViewById(R.id.number_scroll_view);
        ScrollView scrollView2 = (ScrollView) viewInflate.findViewById(R.id.data_scroll_view);
        lq.a aVar = new lq.a(scrollView2, 0);
        lq.a aVar2 = new lq.a(scrollView, 1);
        scrollView.setOnScrollChangeListener(aVar);
        scrollView2.setOnScrollChangeListener(aVar2);
        rs.b bVar2 = this.f120161b;
        rs.a aVar3 = bVar2.f154297c;
        ArrayList arrayListE = e(aVar3);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(mq.a.INTERVAL);
        to.j jVar2 = new to.j(0, 0, 0, this.f120169j, aVar3.f154290a, 7, null);
        mq.h hVar = new mq.h(context, arrayListE, arrayList2, bVar2, jVar2, null);
        Context context2 = context;
        ArrayList arrayList3 = arrayList2;
        to.j jVar3 = jVar2;
        LinearLayout linearLayoutE = hVar.e(hVar.f120191a, false);
        if (linearLayoutE != null) {
            linearLayout4.addView(linearLayoutE, 0);
        }
        LinearLayout linearLayoutE2 = hVar.e(hVar.f120180c, true);
        if (linearLayoutE2 != null) {
            linearLayout3.addView(linearLayoutE2, 0);
        }
        ArrayList arrayList4 = new ArrayList();
        for (x1 x1Var : this.f114257r) {
            if (ge1.b.M(this.f120172m) != h.ALL) {
                h.a aVar4 = h.f114305d;
                g0.a aVar5 = g0.f29436c;
                String strO0 = x1Var.o0();
                aVar5.getClass();
                String str = g0.a.a(strO0).f29446a;
                aVar4.getClass();
                if (h.a.a(str) == ge1.b.M(this.f120172m)) {
                    arrayList4.add(x1Var);
                }
            } else {
                arrayList4.add(x1Var);
            }
        }
        Iterator it = arrayList4.iterator();
        int i18 = 0;
        int i19 = 0;
        int i24 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            bVar = bVar2;
            d14 = this.f120164e;
            if (!zHasNext) {
                break;
            }
            int i25 = i18 + 1;
            x1 x1Var2 = (x1) it.next();
            List<Integer> listP1 = x1Var2.p0();
            int size = listP1 != null ? listP1.size() : 0;
            g0.a aVar6 = g0.f29436c;
            String strO1 = x1Var2.o0();
            aVar6.getClass();
            View view2 = viewInflate;
            g0 g0VarA = g0.a.a(strO1);
            ArrayList arrayList5 = arrayListE;
            g0 g0Var = g0.ACTIVE;
            Iterator it3 = it;
            ArrayList arrayList6 = this.f114259t;
            if (g0VarA == g0Var) {
                int iIntValue = (size <= 0 || (listP0 = x1Var2.p0()) == null) ? 0 : listP0.get(size - 1).intValue();
                View viewD = hVar.d(d14, g(), this.f120166g);
                int i26 = i19;
                LinearLayout linearLayoutC = hVar.c(g(), this.f120166g, d14);
                int iE = fb2.g.e(16, context2);
                Context context3 = context2;
                if (linearLayoutC != null) {
                    linearLayoutC.setPadding(iE, 0, 0, 0);
                }
                if (viewD != null) {
                    viewD.setPadding(0, 0, iE, 0);
                }
                viewD.getClass();
                o oVar = new o(viewD, arrayList5.size(), hVar, false);
                linearLayoutC.getClass();
                o oVar2 = new o(linearLayoutC, arrayList3.size(), hVar, true);
                int i27 = i26 + 1;
                jVar3.f165806a = i24;
                if (size != 1) {
                    d dVar = d.f114281a;
                    a aVar7 = (a) arrayList6.get(i18);
                    jVar = jVar3;
                    i16 = i27;
                    List<x0> listG = g();
                    dVar.getClass();
                    arrayList = arrayList3;
                    context2 = context3;
                    i15 = i18;
                    i17 = i24;
                    d.b(context2, oVar, arrayList5, aVar7, listG, iIntValue, i16, jVar);
                    d.b(context2, oVar2, arrayList, (a) arrayList6.get(i15), g(), iIntValue, i16, jVar);
                    z14 = false;
                } else {
                    jVar = jVar3;
                    arrayList = arrayList3;
                    context2 = context3;
                    i15 = i18;
                    i16 = i27;
                    int i28 = i24;
                    List<Integer> listP2 = x1Var2.p0();
                    jVar.f165807b = listP2 != null ? listP2.get(0).intValue() : 0;
                    d dVar2 = d.f114281a;
                    a aVar8 = (a) arrayList6.get(i15);
                    List<x0> listG2 = g();
                    dVar2.getClass();
                    d.b(context2, oVar, arrayList5, aVar8, listG2, iIntValue, i16, jVar);
                    d.b(context2, oVar2, arrayList, (a) arrayList6.get(i15), g(), iIntValue, i16, jVar);
                    i17 = i28 + 1;
                    z14 = true;
                }
                linearLayout2.addView(viewD);
                linearLayout.addView(linearLayoutC);
                i14 = i16;
                i24 = i17;
            } else {
                i14 = i19;
                jVar = jVar3;
                arrayList = arrayList3;
                bVar = bVar;
                i15 = i18;
                z14 = false;
            }
            List<Integer> listP3 = x1Var2.p0();
            if (listP3 == null || z14) {
                jVar3 = jVar;
            } else {
                Iterator<Integer> it4 = listP3.iterator();
                while (it4.hasNext()) {
                    int iIntValue2 = it4.next().intValue();
                    double d15 = d14;
                    View viewD2 = hVar.d(d15, g(), this.f120166g);
                    LinearLayout linearLayoutC2 = hVar.c(g(), this.f120166g, d15);
                    viewD2.getClass();
                    Iterator<Integer> it5 = it4;
                    Context context4 = context2;
                    o oVar3 = new o(viewD2, arrayList5.size(), hVar, false);
                    linearLayoutC2.getClass();
                    o oVar4 = new o(linearLayoutC2, arrayList.size(), hVar, true);
                    jVar.f165806a = i24;
                    int i29 = iIntValue2 - 1;
                    Integer numK = u.K(i29, h());
                    jVar.f165807b = numK != null ? numK.intValue() : -1;
                    d dVar3 = d.f114281a;
                    a aVar9 = (a) arrayList6.get(i15);
                    d14 = d15;
                    List<x0> listG3 = g();
                    dVar3.getClass();
                    to.j jVar4 = jVar;
                    context2 = context4;
                    d.a(context2, oVar3, arrayList5, aVar9, listG3, i29, jVar4);
                    d.a(context2, oVar4, arrayList, (a) arrayList6.get(i15), g(), i29, jVar4);
                    linearLayout2.addView(viewD2);
                    linearLayout.addView(linearLayoutC2);
                    jVar = jVar4;
                    it4 = it5;
                }
                jVar3 = jVar;
                i24++;
            }
            arrayList3 = arrayList;
            i18 = i25;
            viewInflate = view2;
            arrayListE = arrayList5;
            it = it3;
            i19 = i14;
            bVar2 = bVar;
        }
        View view3 = viewInflate;
        ArrayList arrayList7 = arrayListE;
        ArrayList arrayList8 = arrayList3;
        View viewD3 = hVar.d(d14, g(), this.f120166g);
        LinearLayout linearLayoutC3 = hVar.c(g(), this.f120166g, d14);
        viewD3.getClass();
        o oVar5 = new o(viewD3, arrayList7.size(), hVar, false);
        linearLayoutC3.getClass();
        o oVar6 = new o(linearLayoutC3, arrayList8.size(), hVar, true);
        jVar3.f165806a = i24;
        if (ge1.b.M(this.f120172m) == h.ALL) {
            q1 q1Var = bVar.f154296b;
            d.f114281a.getClass();
            d.c(context2, oVar5, arrayList7, q1Var, jVar3);
            d.c(context2, oVar6, arrayList8, q1Var, jVar3);
        } else {
            d dVar4 = d.f114281a;
            h hVar2 = this.f120172m;
            List<o1> list = this.f114256q;
            q1 q1VarH = ge1.b.H(list, hVar2);
            dVar4.getClass();
            d.c(context2, oVar5, arrayList7, q1VarH, jVar3);
            d.c(context2, oVar6, arrayList8, ge1.b.H(list, this.f120172m), jVar3);
        }
        linearLayout2.addView(viewD3);
        linearLayout.addView(linearLayoutC3);
        return view3;
    }

    @Override // mq.e
    public final ArrayList e(rs.a aVar) {
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        String str = aVar.f154290a;
        arrayList.add(mq.a.INTERVAL_SPLIT_TYPE);
        arrayList.add(mq.a.LAP);
        a(arrayList, mq.a.TIME);
        a(arrayList, mq.a.CUMULATIVE_TIME);
        a(arrayList, mq.a.DISTANCE);
        z0 z0Var = z0.f4390a;
        if (z0.b(am.x0.f4308n, str)) {
            a(arrayList, mq.a.AVG_PACE);
            a(arrayList, mq.a.AVG_GAP);
            a(arrayList, mq.a.AVG_HR);
            a(arrayList, mq.a.MAX_HR);
            a(arrayList, mq.a.ELEV_GAIN);
            a(arrayList, mq.a.ELEV_LOSS);
            a(arrayList, mq.a.AVG_POWER);
            a(arrayList, mq.a.WEIGHT_AVG_POWER);
            a(arrayList, mq.a.MAX_POWER);
            a(arrayList, mq.a.WEIGHT_MAX_POWER);
            a(arrayList, mq.a.AVG_RUN_CADENCE);
            a(arrayList, mq.a.AVG_GCT);
            a(arrayList, mq.a.AVG_GCT_BAL);
            a(arrayList, mq.a.AVG_STRIDE_LENGTH);
            a(arrayList, mq.a.AVG_VERT_OSC);
            a(arrayList, mq.a.AVG_VERT_OSC_RATIO);
            a(arrayList, mq.a.CALORIES);
            a(arrayList, mq.a.AVG_TEMPERATURE);
            a(arrayList, mq.a.BEST_PACE);
            a(arrayList, mq.a.MAX_RUN_CADENCE);
            a(arrayList, mq.a.MOVING_TIME);
            a(arrayList, mq.a.AVG_MOVING_PACE);
            a(arrayList, mq.a.AVG_STEP_SPEED_LOSS);
            a(arrayList, mq.a.AVG_STEP_SPEED_LOSS_PERCENT);
            return arrayList;
        }
        if (!z0.b(am.x0.f4312o, str)) {
            if (!z0.Q(str) && !z0.b(am.x0.f4297k1, str) && !z0.b(am.x0.f4301l1, str)) {
                a(arrayList, mq.a.MOVING_TIME);
                a(arrayList, mq.a.ELEV_GAIN);
                a(arrayList, mq.a.ELEV_LOSS);
                a(arrayList, mq.a.AVG_SPEED);
                a(arrayList, mq.a.AVG_MOVING_SPEED);
                a(arrayList, mq.a.MAX_SPEED);
                return arrayList;
            }
            a(arrayList, mq.a.MOVING_TIME);
            a(arrayList, mq.a.AVG_STROKE_RATE);
            a(arrayList, mq.a.MAX_STROKE_RATE);
            a(arrayList, mq.a.AVG_DISTANCE_STROKE);
            a(arrayList, mq.a.BEST_PACE);
            a(arrayList, mq.a.AVG_HR);
            a(arrayList, mq.a.MAX_HR);
            a(arrayList, mq.a.CALORIES);
            a(arrayList, mq.a.AVG_PACE);
            a(arrayList, mq.a.AVG_TEMPERATURE);
            return arrayList;
        }
        a(arrayList, mq.a.MOVING_TIME);
        a(arrayList, mq.a.AVG_SPEED);
        a(arrayList, mq.a.AVG_MOVING_SPEED);
        a(arrayList, mq.a.MAX_SPEED);
        a(arrayList, mq.a.AVG_HR);
        a(arrayList, mq.a.MAX_HR);
        a(arrayList, mq.a.ELEV_GAIN);
        a(arrayList, mq.a.ELEV_LOSS);
        a(arrayList, mq.a.AVG_BIKE_CADENCE);
        a(arrayList, mq.a.MAX_BIKE_CADENCE);
        a(arrayList, mq.a.ATA);
        a(arrayList, mq.a.AATA);
        a(arrayList, mq.a.ALTA);
        a(arrayList, mq.a.AUTA);
        a(arrayList, mq.a.ASTA);
        a(arrayList, mq.a.SEATED_TIME);
        a(arrayList, mq.a.AT);
        a(arrayList, mq.a.LT);
        a(arrayList, mq.a.UT);
        a(arrayList, mq.a.STANDING_TIME);
        a(arrayList, mq.a.AVG_POWER);
        a(arrayList, mq.a.MAX_POWER);
        a(arrayList, mq.a.AVG_SEATED_POWER);
        a(arrayList, mq.a.MAX_SEATED_POWER);
        a(arrayList, mq.a.AAP);
        a(arrayList, mq.a.MAP);
        a(arrayList, mq.a.ALP);
        a(arrayList, mq.a.MLP);
        a(arrayList, mq.a.AUP);
        a(arrayList, mq.a.MUP);
        a(arrayList, mq.a.AVG_STANDING_POWER);
        a(arrayList, mq.a.MAX_STANDING_POWER);
        a(arrayList, mq.a.NORMALIZED_POWER);
        a(arrayList, mq.a.AVG_BIKE_FORCE);
        a(arrayList, mq.a.MAX_BIKE_FORCE);
        a(arrayList, mq.a.NORMALIZED_FORCE);
        a(arrayList, mq.a.LR_BALANCE);
        a(arrayList, mq.a.LR_TORQUE_EFFECTIVENESS);
        a(arrayList, mq.a.LR_PEDAL_SMOOTHNESS);
        a(arrayList, mq.a.CALORIES);
        a(arrayList, mq.a.AVG_TEMPERATURE);
        a(arrayList, mq.a.GRIT);
        a(arrayList, mq.a.FLOW);
        a(arrayList, mq.a.JUMP_COUNT);
        return arrayList;
    }

    @Override // mq.e
    public final ArrayList f(String str) {
        str.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(mq.a.INTERVAL);
        arrayList.add(mq.a.INTERVAL_SPLIT_TYPE);
        a(arrayList, mq.a.TIME);
        a(arrayList, mq.a.DISTANCE);
        if (z0.c(str)) {
            a(arrayList, mq.a.AVG_SPEED);
            return arrayList;
        }
        a(arrayList, mq.a.AVG_PACE);
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // mq.e
    public final int j() {
        return this.f114257r.size();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object] */
    @Override // mq.e
    public final View k() {
        ArrayList arrayList = this.f114259t;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        ?? r14 = this.f114257r;
        for (Object obj : r14) {
            if (((x1) obj).a2() != x.POWER_GUIDE_SPLIT) {
                arrayList2.add(obj);
            }
        }
        if (((x1) arrayList2.get(0)).p0() == null) {
            int i14 = 1;
            for (x1 x1Var : r14) {
                if (x1Var.a2() != x.POWER_GUIDE_SPLIT) {
                    x1Var.b3(w.c(Integer.valueOf(i14)));
                    i14++;
                }
            }
        }
        for (x1 x1Var2 : r14) {
            if (ge1.b.M(this.f120172m) != h.ALL) {
                h.a aVar = h.f114305d;
                g0.a aVar2 = g0.f29436c;
                String strO0 = x1Var2.o0();
                aVar2.getClass();
                String str = g0.a.a(strO0).f29446a;
                aVar.getClass();
                if (h.a.a(str) == ge1.b.M(this.f120172m)) {
                }
            }
            arrayList.add(new a(x1Var2.getAverageSpeed(), x1Var2.getAverageMovingSpeed(), x1Var2.getDistance(), x1Var2.getDuration(), x1Var2.getMovingDuration(), x1Var2.o0(), x1Var2.p0()));
        }
        if (g().isEmpty()) {
            return null;
        }
        return d();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // mq.e
    public final boolean l(int i14) {
        return i14 <= this.f114257r.size();
    }

    @Override // mq.e
    public final void o() {
        this.f120170k = new int[g().size()];
        int size = g().size();
        for (int i14 = 0; i14 < size; i14++) {
            h()[i14] = g().get(i14).getLapIndex();
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llq/b$a;", "", "", "averageSpeed", "averageMovingSpeed", "distance", "duration", "movingDuration", "", "splitType", "", "", "lapIndexes", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Double f114260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Double f114261b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Double f114262c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Double f114263d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Double f114264e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f114265f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List<Integer> f114266g;

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ a(Double d14, Double d15, Double d16, Double d17, Double d18, String str, List list, int i14, p005kotlin.jvm.internal.j jVar) {
            Double dValueOf = Double.valueOf(0.0d);
            this((i14 & 1) != 0 ? dValueOf : d14, (i14 & 2) != 0 ? dValueOf : d15, (i14 & 4) != 0 ? dValueOf : d16, (i14 & 8) != 0 ? dValueOf : d17, (i14 & 16) != 0 ? dValueOf : d18, (i14 & 32) != 0 ? "" : str, (i14 & 64) != 0 ? null : list);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f114260a, aVar.f114260a) && s.g(this.f114261b, aVar.f114261b) && s.g(this.f114262c, aVar.f114262c) && s.g(this.f114263d, aVar.f114263d) && s.g(this.f114264e, aVar.f114264e) && s.g(this.f114265f, aVar.f114265f) && s.g(this.f114266g, aVar.f114266g);
        }

        public final int hashCode() {
            Double d14 = this.f114260a;
            int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
            Double d15 = this.f114261b;
            int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
            Double d16 = this.f114262c;
            int iHashCode3 = (iHashCode2 + (d16 == null ? 0 : d16.hashCode())) * 31;
            Double d17 = this.f114263d;
            int iHashCode4 = (iHashCode3 + (d17 == null ? 0 : d17.hashCode())) * 31;
            Double d18 = this.f114264e;
            int iHashCode5 = (iHashCode4 + (d18 == null ? 0 : d18.hashCode())) * 31;
            String str = this.f114265f;
            int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            List<Integer> list = this.f114266g;
            return iHashCode6 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbI = k.i("IntervalSummaryDTO(averageSpeed=", this.f114260a, this.f114261b, ", averageMovingSpeed=", ", distance=");
            i.p(this.f114262c, this.f114263d, ", duration=", ", movingDuration=", sbI);
            i.u(sbI, this.f114264e, ", splitType=", this.f114265f, ", lapIndexes=");
            return z.c(sbI, this.f114266g, ")");
        }

        public a(Double d14, Double d15, Double d16, Double d17, Double d18, String str, List<Integer> list) {
            this.f114260a = d14;
            this.f114261b = d15;
            this.f114262c = d16;
            this.f114263d = d17;
            this.f114264e = d18;
            this.f114265f = str;
            this.f114266g = list;
        }

        public a() {
            this(null, null, null, null, null, null, null, 127, null);
        }
    }
}
