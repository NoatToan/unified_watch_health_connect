package xw;

import am.b1;
import am.x0;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import androidx.core.view.m1;
import androidx.core.view.z;
import androidx.fragment.app.m;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import aq.u2;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.charts3.components.OverlayCombinedChart;
import com.garmin.android.apps.connectmobile.activities.newmodel.h;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.devices.DeviceDetailsActivity;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.settings.devices.wifi.GCMWiFiNetworksActivity;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.formatter.IFillFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.google.android.exoplayer2.C;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.common.collect.ImmutableList;
import fa.g;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import ps.a1;
import q03.v;
import ya1.t;
import yb.k;
import zb0.g0;
import zm.x;
import zn2.f1;
import zn2.u0;
import zo.j;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements SwipeRefreshLayout.f, j42.b.InterfaceC1852b, g, z, ia.d.a, com.garmin.android.apps.connectmobile.devices.settings.realtime.b.InterfaceC0579b, q1.a, MultiLineImeEditText.a, IFillFormatter, u03.f, b1.a, TabLayoutMediator.TabConfigurationStrategy, SimpleLottieValueCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f192292b;

    public /* synthetic */ b(Object obj, int i14) {
        this.f192291a = i14;
        this.f192292b = obj;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public void M7() {
        com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.a aVar = (com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.a) this.f192292b;
        com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.a.C0494a c0494a = com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.a.f30928x;
        aVar.H6().A4();
    }

    @Override // com.garmin.android.apps.connectmobile.devices.settings.realtime.b.InterfaceC0579b
    public void a() {
        DeviceDetailsActivity deviceDetailsActivity = (DeviceDetailsActivity) this.f192292b;
        int i14 = DeviceDetailsActivity.f33804q;
        deviceDetailsActivity.hideProgressOverlay();
        deviceDetailsActivity.finish();
    }

    @Override // fa.g
    public void accept(Object obj) {
        switch (this.f192291a) {
            case 2:
                k kVar = (k) this.f192292b;
                yb.c cVar = (yb.c) obj;
                long j8 = cVar.f195639b;
                yb.b bVar = kVar.f195647b;
                ImmutableList<ea.a> immutableList = cVar.f195638a;
                long j14 = cVar.f195640c;
                bVar.getClass();
                k.b bVar2 = new k.b(j8, yb.b.a(j14, immutableList));
                kVar.f195649d.add(bVar2);
                long j15 = kVar.f195656k;
                if (j15 == C.TIME_UNSET || cVar.f195639b >= j15) {
                    kVar.f(bVar2);
                }
                break;
            default:
                ((ImmutableList.Builder) this.f192292b).add((yb.c) obj);
                break;
        }
    }

    @Override // u03.f
    /* JADX INFO: renamed from: apply */
    public Object mo330apply(Object obj) {
        int i14 = this.f192291a;
        z81.b bVar = (z81.b) this.f192292b;
        switch (i14) {
            case 12:
                u0 u0Var = u0.f205864a;
                obj.getClass();
                break;
            case 13:
                u0 u0Var2 = u0.f205864a;
                obj.getClass();
                break;
            case 14:
                u0 u0Var3 = u0.f205864a;
                obj.getClass();
                break;
            case 15:
                u0 u0Var4 = u0.f205864a;
                obj.getClass();
                break;
            default:
                f1 f1Var = f1.f205508a;
                obj.getClass();
                break;
        }
        return (v) bVar.invoke(obj);
    }

    @Override // com.garmin.android.apps.connectmobile.view.MultiLineImeEditText.a
    public void b() {
        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.c cVar = (com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.c) this.f192292b;
        View view2 = cVar.f43903h;
        if (view2 == null) {
            s.m("notesTextClearButton");
            throw null;
        }
        view2.setVisibility(8);
        pj1.s sVar = (pj1.s) cVar.f43897b.getValue();
        MultiLineImeEditText multiLineImeEditText = cVar.f43901f;
        if (multiLineImeEditText != null) {
            sVar.W4(String.valueOf(multiLineImeEditText.getText()));
        } else {
            s.m("notesEditText");
            throw null;
        }
    }

    @Override // am.b1.a
    public void c() {
        int i14 = this.f192291a;
        Object obj = this.f192292b;
        switch (i14) {
            case 17:
                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.a aVar = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.c.f29328l;
                ((Button) obj).setEnabled(true);
                break;
            default:
                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.g gVar = (com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.g) obj;
                gVar.f29353b = true;
                m activity = gVar.getActivity();
                if (activity != null) {
                    activity.invalidateOptionsMenu();
                }
                break;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.q1.a
    public void g(boolean z14) {
        m activity;
        a1 a1Var;
        a1 a1Var2;
        Boolean boolZ0;
        int i14 = this.f192291a;
        Object obj = this.f192292b;
        switch (i14) {
            case 7:
                g0 g0Var = (g0) obj;
                if (z14) {
                    sd2.f fVar = g0Var.f203492c.f76871d;
                    GCMWiFiNetworksActivity.f43245f.h(g0Var.requireActivity(), -1, fVar.getUnitID(), fVar.getProductNumber(), fVar.getProductDisplayName(), fVar.getImageURL(), true);
                    return;
                }
                return;
            case 8:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b bVar = (com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b) obj;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.b.f43873n;
                if (!z14 || (activity = bVar.getActivity()) == null) {
                    return;
                }
                activity.finish();
                return;
            default:
                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.k kVar = (com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.k) obj;
                if (!z14) {
                    int i15 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.k.f29371j;
                    return;
                }
                u2 u2Var = kVar.f29373b;
                if (u2Var == null) {
                    s.m("restoreActivityViewModel");
                    throw null;
                }
                ap.d dVar = kVar.f29372a;
                if (dVar == null) {
                    s.m("viewModel");
                    throw null;
                }
                long j8 = dVar.f11589a;
                x0 x0Var = x0.C;
                h hVar = dVar.f11602n;
                int i16 = 0;
                boolean zBooleanValue = (hVar == null || (a1Var2 = hVar.f29459l) == null || (boolZ0 = a1Var2.getIsActivityTrimmed()) == null) ? false : boolZ0.booleanValue();
                ap.d dVar2 = kVar.f29372a;
                if (dVar2 == null) {
                    s.m("viewModel");
                    throw null;
                }
                h hVar2 = dVar2.f11602n;
                u2Var.z4(j8, x0Var, zBooleanValue, (hVar2 == null || (a1Var = hVar2.f29459l) == null) ? false : a1Var.E0()).f(kVar.getViewLifecycleOwner(), new com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.k.d(new zo.v(kVar, i16)));
                return;
        }
    }

    @Override // com.github.mikephil.charting.formatter.IFillFormatter
    public float getFillLinePosition(ILineDataSet iLineDataSet, LineDataProvider lineDataProvider) {
        switch (this.f192291a) {
            case 10:
                LineChart lineChart = ((x) this.f192292b).f205266f;
                if (lineChart != null) {
                    return lineChart.getAxisLeft().getAxisMaximum();
                }
                s.m("chart");
                throw null;
            default:
                OverlayCombinedChart overlayCombinedChart = ((zm.z) this.f192292b).f205273f;
                if (overlayCombinedChart != null) {
                    return overlayCombinedChart.getAxisLeft().getAxisMaximum();
                }
                s.m("chart");
                throw null;
        }
    }

    @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
    public Object getValue(LottieFrameInfo lottieFrameInfo) {
        return (Integer) this.f192292b;
    }

    @Override // j42.b.InterfaceC1852b
    public void j(final double d14) {
        final t tVar = (t) this.f192292b;
        if (tVar.f195614d == d14) {
            return;
        }
        new androidx.appcompat.app.e.a(tVar.f195612b).setTitle(R.string.rider_weight_update_confirmation_dialog_title).setMessage(R.string.power_guide_footer_add_rider_weight).setPositiveButton(R.string.lbl_update, new DialogInterface.OnClickListener() { // from class: ya1.s
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i14) {
                e23.l<Double, Unit> lVar = tVar.f195611a;
                if (lVar != null) {
                    lVar.invoke(Double.valueOf(d14));
                }
            }
        }).setNegativeButton(R.string.lbl_cancel, (DialogInterface.OnClickListener) null).show();
    }

    @Override // androidx.core.view.z
    public m1 onApplyWindowInsets(View view2, m1 m1Var) {
        za1.b bVar = (za1.b) this.f192292b;
        int i14 = za1.b.f203281e;
        view2.getClass();
        c7.e eVarI = m1Var.f6508a.i(128);
        eVarI.getClass();
        CustomLineChart customLineChart = bVar.f203282a;
        Resources resources = view2.getResources();
        resources.getClass();
        customLineChart.setExtraLeftOffset(eVarI.f25190a / resources.getDisplayMetrics().density);
        return m1Var;
    }

    @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
    public void onConfigureTab(TabLayout.Tab tab, int i14) {
        j jVar = (j) this.f192292b;
        tab.getClass();
        tab.setText(i14 == 0 ? jVar.f206038a.getContext().getString(R.string.lbl_time) : jVar.f206038a.getContext().getString(R.string.lbl_distance));
    }
}
