package com.garmin.android.apps.connectmobile.userprofile;

import am.x0;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import c22.j0;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.garmin.android.apps.connectmobile.l2;
import j12.m;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.Months;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0897a f46527l = new C0897a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f46528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f46529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<DateTime, Double> f46530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x0 f46531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f46532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f46533f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f46534g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f46535h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CustomBarChart f46536i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p12.b f46537j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public rz.a<double[], d00.a> f46538k;

    public a() {
        super(R.layout.user_profile_monthly_summary);
        j0 j0Var = j0.f23099a;
        DateTime dateTimeNow = DateTime.now();
        dateTimeNow.getClass();
        j0Var.getClass();
        DateTime dateTimeS = j0.S(dateTimeNow);
        this.f46528a = dateTimeS;
        DateTime dateTimeMinusMonths = dateTimeS.minusMonths(11);
        dateTimeMinusMonths.getClass();
        this.f46529b = j0.S(dateTimeMinusMonths);
        this.f46530c = new HashMap<>();
    }

    @Override // androidx.fragment.app.Fragment
    @o13.e
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        CustomBarChart customBarChart = this.f46536i;
        if (customBarChart == null) {
            s.m("barChart");
            throw null;
        }
        LocalDate localDate = this.f46529b.toLocalDate();
        localDate.getClass();
        LocalDate localDate2 = this.f46528a.toLocalDate();
        localDate2.getClass();
        this.f46537j = new p12.b(customBarChart, localDate, localDate2);
        CustomBarChart customBarChart2 = this.f46536i;
        if (customBarChart2 == null) {
            s.m("barChart");
            throw null;
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        p12.a aVar = new p12.a(contextRequireContext);
        p12.b bVar = this.f46537j;
        if (bVar == null) {
            s.m("rendererConfig");
            throw null;
        }
        rz.a<double[], d00.a> aVar2 = new rz.a<>(customBarChart2, aVar, bVar, null, null, null, 56, null);
        this.f46538k = aVar2;
        aVar2.c();
        v6();
        w6();
        u6();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Object serializable;
        Parcelable parcelable;
        super.onCreate(bundle);
        l2.f37135b.getClass();
        Bundle bundleC = l2.a.b().c(this);
        if (bundleC != null) {
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 33) {
                serializable = bundleC.getSerializable("GCM_extra_activity_type", x0.class);
            } else {
                Object serializable2 = bundleC.getSerializable("GCM_extra_activity_type");
                if (!(serializable2 instanceof x0)) {
                    serializable2 = null;
                }
                serializable = (x0) serializable2;
            }
            x0 x0Var = (x0) serializable;
            if (x0Var == null) {
                x0Var = x0.f4308n;
            }
            this.f46531d = x0Var;
            if (i14 >= 33) {
                parcelable = (Parcelable) bundleC.getParcelable("EXTRA_PROFILE_STATS", m.class);
            } else {
                Parcelable parcelable2 = bundleC.getParcelable("EXTRA_PROFILE_STATS");
                parcelable = (m) (parcelable2 instanceof m ? parcelable2 : null);
            }
            m mVar = (m) parcelable;
            if (mVar == null) {
                mVar = new m(0, null, null, null, null, null, 63, null);
            }
            this.f46532e = mVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.chart_title);
        viewFindViewById.getClass();
        this.f46533f = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.chart_subtitle);
        viewFindViewById2.getClass();
        this.f46534g = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.profile_chart_privacy);
        viewFindViewById3.getClass();
        this.f46535h = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.bar_chart_view);
        viewFindViewById4.getClass();
        this.f46536i = (CustomBarChart) viewFindViewById4;
    }

    public final void u6() {
        double[] dArr = new double[12];
        x0 x0Var = this.f46531d;
        if (x0Var == null) {
            s.m("mActivityType");
            throw null;
        }
        m3 m3VarB = ar.b.b(x0Var, null);
        m3VarB.getClass();
        j0 j0Var = j0.f23099a;
        DateTime dateTimeNow = DateTime.now();
        dateTimeNow.getClass();
        j0Var.getClass();
        DateTime dateTimeS = j0.S(dateTimeNow);
        HashMap<DateTime, Double> map = this.f46530c;
        for (Map.Entry<DateTime, Double> entry : map.entrySet()) {
            DateTime key = entry.getKey();
            double dDoubleValue = entry.getValue().doubleValue();
            int months = 11 - Months.monthsBetween(key, dateTimeS).getMonths();
            if (months >= 0 && months < 12) {
                l3.a aVar = l3.f23124b;
                m3 m3Var = m3.CENTIMETER;
                aVar.getClass();
                dArr[months] = l3.a.g(dDoubleValue, m3Var, m3VarB);
            }
        }
        if (!map.isEmpty()) {
            rz.a<double[], d00.a> aVar2 = this.f46538k;
            if (aVar2 != null) {
                qz.a.b(aVar2, dArr, null, 6);
                return;
            } else {
                s.m("barChartConfigurator");
                throw null;
            }
        }
        p12.b bVar = this.f46537j;
        if (bVar == null) {
            s.m("rendererConfig");
            throw null;
        }
        p12.b.c cVar = bVar.f134908a;
        cVar.b();
        cVar.f80607k = false;
        cVar.f80608l = false;
        p12.b.C2562b c2562b = bVar.f134909b;
        c2562b.f();
        c2562b.h();
        rz.a<double[], d00.a> aVar3 = this.f46538k;
        if (aVar3 == null) {
            s.m("barChartConfigurator");
            throw null;
        }
        aVar3.c();
        rz.a<double[], d00.a> aVar4 = this.f46538k;
        if (aVar4 == null) {
            s.m("barChartConfigurator");
            throw null;
        }
        qz.a.b(aVar4, null, requireContext().getString(R.string.txt_empty_page_no_data), 4);
    }

    public final void v6() {
        String string;
        TextView textView = this.f46533f;
        if (textView == null) {
            s.m("mChartTitleText");
            throw null;
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        x0 x0Var = this.f46531d;
        if (x0Var == null) {
            s.m("mActivityType");
            throw null;
        }
        textView.setText(dh.b.A(contextRequireContext, x0Var.f4360c));
        j0 j0Var = j0.f23099a;
        DateTime dateTimeNow = DateTime.now();
        j0Var.getClass();
        String string2 = requireContext().getString(j0.H(dateTimeNow, this.f46528a) ? R.string.lbl_last_number_of_months : R.string.lbl_number_of_months, "12");
        string2.getClass();
        Context contextRequireContext2 = requireContext();
        x0 x0Var2 = this.f46531d;
        if (x0Var2 == null) {
            s.m("mActivityType");
            throw null;
        }
        switch (gm.b.a.f77986a[ar.b.b(x0Var2, null).ordinal()]) {
            case 1:
                string = contextRequireContext2.getString(R.string.lbl_kilometers);
                break;
            case 2:
                string = contextRequireContext2.getString(R.string.common_meters_string);
                break;
            case 3:
                string = contextRequireContext2.getString(R.string.lbl_miles);
                break;
            case 4:
                string = contextRequireContext2.getString(R.string.lbl_foot);
                break;
            case 5:
                string = contextRequireContext2.getString(R.string.common_yards_string);
                break;
            case 6:
                string = contextRequireContext2.getString(R.string.lbl_nautical_miles_plural);
                break;
            default:
                string = "";
                break;
        }
        String string3 = requireContext().getString(R.string.string_line_string_pattern, string2, string);
        string3.getClass();
        TextView textView2 = this.f46534g;
        if (textView2 == null) {
            s.m("mChartSubtitleText");
            throw null;
        }
        textView2.setText(string3);
        m mVar = this.f46532e;
        if (mVar == null) {
            s.m("mProfileStatsDTO");
            throw null;
        }
        if (mVar.getUserId() == ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()) {
            m mVar2 = this.f46532e;
            if (mVar2 == null) {
                s.m("mProfileStatsDTO");
                throw null;
            }
            j12.j sectionPublicity = mVar2.getSectionPublicity();
            if (!(sectionPublicity != null ? sectionPublicity.getIsShowLast12Months() : false)) {
                TextView textView3 = this.f46535h;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                    return;
                } else {
                    s.m("mPrivacyText");
                    throw null;
                }
            }
        }
        TextView textView4 = this.f46535h;
        if (textView4 != null) {
            textView4.setVisibility(8);
        } else {
            s.m("mPrivacyText");
            throw null;
        }
    }

    public final void w6() {
        HashMap<DateTime, Double> map = this.f46530c;
        map.clear();
        m mVar = this.f46532e;
        if (mVar == null) {
            s.m("mProfileStatsDTO");
            throw null;
        }
        if (mVar.f() != null) {
            m mVar2 = this.f46532e;
            if (mVar2 == null) {
                s.m("mProfileStatsDTO");
                throw null;
            }
            List<j12.e> listF = mVar2.f();
            if (listF == null) {
                listF = p13.j0.f134944a;
            }
            int size = listF.size();
            for (int i14 = 0; i14 < size; i14++) {
                j12.e eVar = listF.get(i14);
                DateTime dateTimeK = j0.K(eVar.getCom.roomorama.caldroid.CaldroidFragment.MONTH java.lang.String(), "MM-yyyy");
                if (dateTimeK != null) {
                    x0 x0Var = this.f46531d;
                    if (x0Var == null) {
                        s.m("mActivityType");
                        throw null;
                    }
                    if (x0Var == x0.f4308n) {
                        map.put(dateTimeK, Double.valueOf(eVar.getTotalRunningDistance()));
                    } else if (x0Var == x0.f4312o) {
                        map.put(dateTimeK, Double.valueOf(eVar.getTotalCyclingDistance()));
                    } else if (x0Var == x0.f4324r) {
                        map.put(dateTimeK, Double.valueOf(eVar.getTotalSwimmingDistance()));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.userprofile.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/a$a;", "", "<init>", "()V", "", "EXTRA_PROFILE_STATS", "Ljava/lang/String;", "", "TWELVE_MONTH", "I", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0897a {
        public /* synthetic */ C0897a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static a a(x0 x0Var, m mVar) {
            x0Var.getClass();
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putSerializable("GCM_extra_activity_type", x0Var);
            bundle.putParcelable("EXTRA_PROFILE_STATS", mVar);
            l2.f37135b.getClass();
            l2.a.c(aVar, bundle);
            return aVar;
        }

        private C0897a() {
        }
    }
}
