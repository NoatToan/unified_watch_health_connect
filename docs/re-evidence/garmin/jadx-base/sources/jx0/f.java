package jx0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.MenstrualCycleMultipleCyclesChartView;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMRunningProgressView;
import com.github.mikephil.charting.utils.Utils;
import hx0.u0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import o13.t;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljx0/f;", "Ljx0/a;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends jx0.a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f101438w = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f101439o = o13.m.b(new e(this, 0));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenstrualCycleMultipleCyclesChartView f101440p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f101441q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f101442r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public GCMRunningProgressView f101443t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Group f101444v;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((ww0.n) t14).getStartDate(), ((ww0.n) t7).getStartDate());
        }
    }

    @Override // jx0.a
    public final void I6(ww0.k kVar) {
        boolean z14;
        List listN0;
        List<ww0.n> listF;
        List<ww0.n> listF2;
        List<ww0.n> listN1;
        String str;
        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a aVar;
        List<ww0.n> listF3;
        List<ww0.n> listF4;
        List<ww0.n> listF5;
        super.I6(kVar);
        MenstrualCycleMultipleCyclesChartView menstrualCycleMultipleCyclesChartView = this.f101440p;
        if (menstrualCycleMultipleCyclesChartView == null) {
            s.m("menstrualCycleMultipleCyclesChartView");
            throw null;
        }
        rz.a<List<com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a>, d00.a> aVar2 = menstrualCycleMultipleCyclesChartView.f38773d;
        Bundle bundle = (Bundle) this.f101402l.getValue();
        int i14 = bundle != null ? bundle.getInt("REPORT_SIZE") : 6;
        ArrayList arrayList = new ArrayList();
        boolean z15 = false;
        if (((kVar == null || (listF5 = kVar.f()) == null) ? 0 : listF5.size()) > 0) {
            int size = i14 - ((kVar == null || (listF4 = kVar.f()) == null) ? 0 : listF4.size());
            if (1 <= size) {
                int i15 = 1;
                while (true) {
                    arrayList.add(new com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a("", 0, 0, 0, 0, 0));
                    if (i15 == size) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            if (kVar == null || (listF3 = kVar.f()) == null || (listN1 = h0.N0(listF3, new dx0.b())) == null) {
                listN1 = j0.f134944a;
            }
            for (ww0.n nVar : listN1) {
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a.f38776g.getClass();
                nVar.getClass();
                LocalDate startDate = nVar.getStartDate();
                if (startDate != null) {
                    c22.j0.f23099a.getClass();
                    str = c22.j0.w("M/d").format(startDate.toDate());
                } else {
                    str = "";
                }
                String str2 = str;
                if (nVar.getCycleType() == ww0.a.PREGNANT) {
                    Integer cycleLength = nVar.getCycleLength();
                    int iIntValue = cycleLength != null ? cycleLength.intValue() : 0;
                    str2.getClass();
                    aVar = new com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a(str2, 0, iIntValue, 0, 0, 0);
                } else {
                    c22.h0 h0VarM = nVar.m();
                    if (s.g(nVar.getGapCycle(), Boolean.TRUE) || h0VarM == null) {
                        str2.getClass();
                        aVar = new com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a(str2, 0, 0, 0, 0, 0);
                    } else {
                        c22.h0 h0VarI = nVar.i();
                        Integer cycleLength2 = nVar.getCycleLength();
                        int iIntValue2 = cycleLength2 != null ? cycleLength2.intValue() : 0;
                        int iC = h0VarM.c();
                        int iC2 = h0VarI != null ? h0VarI.c() : 0;
                        int days = (h0VarI == null || iC2 <= 0) ? 0 : Days.daysBetween(h0VarM.f23062b, h0VarI.f23061a).getDays() - 1;
                        str2.getClass();
                        aVar = new com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a(str2, iIntValue2, 0, iC, days, iC2);
                    }
                }
                arrayList.add(aVar);
            }
        }
        boolean z16 = ((kVar == null || (listF2 = kVar.f()) == null) ? 0 : listF2.size()) == 0;
        v22.e.v(menstrualCycleMultipleCyclesChartView.f38770a, z16);
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a) it.next()).f38782f > 0) {
                    z14 = true;
                    break;
                }
            } else {
                z14 = false;
                break;
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            if (((com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a) it3.next()).f38779c > 0) {
                z15 = true;
                break;
            }
        }
        v22.e.v(menstrualCycleMultipleCyclesChartView.f38774e, z14);
        v22.e.v(menstrualCycleMultipleCyclesChartView.f38775f, z15);
        v22.e.v(menstrualCycleMultipleCyclesChartView.f38771b, !z16);
        menstrualCycleMultipleCyclesChartView.f38772c.getLayoutParams().height = MathKt.c(Utils.convertDpToPixel(z16 ? 170.0f : 240.0f));
        aVar2.f155195c.getF63186d().f80604h = arrayList.size() > 6 ? 270.0f : 0.0f;
        aVar2.c();
        qz.a.b(aVar2, arrayList, null, 6);
        if (kVar == null || (listF = kVar.f()) == null || (listN0 = h0.N0(listF, new b())) == null) {
            listN0 = j0.f134944a;
        }
        t tVar = this.f101439o;
        ((h) tVar.getValue()).u(listN0);
        ((h) tVar.getValue()).notifyDataSetChanged();
        h hVar = (h) tVar.getValue();
        Object context = getContext();
        hVar.f101461e = context instanceof u0 ? (u0) context : null;
    }

    @Override // jx0.a
    public final TextView K6() {
        TextView textView = this.f101441q;
        if (textView != null) {
            return textView;
        }
        s.m("menstrualCycleMultipleCyclesLengthCycleData");
        throw null;
    }

    @Override // jx0.a
    public final Group M6() {
        Group group = this.f101444v;
        if (group != null) {
            return group;
        }
        s.m("menstrualCycleMultipleCyclesDataGroup");
        throw null;
    }

    @Override // jx0.a
    public final TextView S6() {
        TextView textView = this.f101442r;
        if (textView != null) {
            return textView;
        }
        s.m("menstrualCycleMultipleCyclesLengthPeriodData");
        throw null;
    }

    @Override // jx0.a
    public final GCMRunningProgressView T6() {
        GCMRunningProgressView gCMRunningProgressView = this.f101443t;
        if (gCMRunningProgressView != null) {
            return gCMRunningProgressView;
        }
        s.m("menstrualCycleMultipleCyclesRunningProgress");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewA6 = A6(viewGroup, layoutInflater, R.layout.fragment_menstrual_cycle_multiple_cycles);
        View viewFindViewById = viewA6.findViewById(R.id.menstrual_cycle_multiple_cycles_chart_view);
        viewFindViewById.getClass();
        this.f101440p = (MenstrualCycleMultipleCyclesChartView) viewFindViewById;
        View viewFindViewById2 = viewA6.findViewById(R.id.menstrual_cycle_multiple_cycles_length_cycle_data);
        viewFindViewById2.getClass();
        this.f101441q = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewA6.findViewById(R.id.menstrual_cycle_multiple_cycles_length_period_data);
        viewFindViewById3.getClass();
        this.f101442r = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewA6.findViewById(R.id.menstrual_cycle_multiple_cycles_running_progress);
        viewFindViewById4.getClass();
        this.f101443t = (GCMRunningProgressView) viewFindViewById4;
        View viewFindViewById5 = viewA6.findViewById(R.id.menstrual_cycle_multiple_cycles_data_group);
        viewFindViewById5.getClass();
        this.f101444v = (Group) viewFindViewById5;
        return viewA6;
    }

    @Override // jx0.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.menstrual_cycle_multiple_cycles_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter((h) this.f101439o.getValue());
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ljx0/f$a;", "", "<init>", "()V", "", "REPORT_SIZE_KEY", "Ljava/lang/String;", "CYCLE_REPORT_STATE_KEY_VALUE", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
