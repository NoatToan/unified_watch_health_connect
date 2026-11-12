package hg1;

import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.settings.activityoptions.GCMRunModeAlertsActivity;
import com.garmin.android.apps.connectmobile.view.GCMComplexOneLineButton;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements com.garmin.android.apps.connectmobile.settings.activityoptions.b.a, com.garmin.android.apps.connectmobile.settings.activityoptions.d.a, com.garmin.android.apps.connectmobile.settings.activityoptions.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GCMRunModeAlertsActivity f83677b;

    public /* synthetic */ d(GCMRunModeAlertsActivity gCMRunModeAlertsActivity, int i14) {
        this.f83676a = i14;
        this.f83677b = gCMRunModeAlertsActivity;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.activityoptions.d.a
    public void b(int i14) {
        switch (this.f83676a) {
            case 1:
                GCMRunModeAlertsActivity gCMRunModeAlertsActivity = this.f83677b;
                gCMRunModeAlertsActivity.f41659e.setButtonRightLabel(l3.f23124b.p0(i14, gCMRunModeAlertsActivity));
                gCMRunModeAlertsActivity.f41662h.I1(i14);
                gCMRunModeAlertsActivity.f41662h.y1("intervalAlertsEnabled", Boolean.TRUE);
                break;
            case 2:
                GCMRunModeAlertsActivity gCMRunModeAlertsActivity2 = this.f83677b;
                gCMRunModeAlertsActivity2.f41658d.setButtonRightLabel(l3.f23124b.p0(i14, gCMRunModeAlertsActivity2));
                gCMRunModeAlertsActivity2.f41662h.G1(i14);
                gCMRunModeAlertsActivity2.f41662h.y1("intervalAlertsEnabled", Boolean.TRUE);
                break;
            default:
                GCMRunModeAlertsActivity gCMRunModeAlertsActivity3 = this.f83677b;
                GCMComplexOneLineButton gCMComplexOneLineButton = gCMRunModeAlertsActivity3.f41658d;
                boolean zS1 = gCMRunModeAlertsActivity3.f41662h.s1();
                l3.a aVar = l3.f23124b;
                aVar.getClass();
                gCMComplexOneLineButton.setButtonRightLabel(aVar.r0(gCMRunModeAlertsActivity3, i14, zS1, true, ""));
                gCMRunModeAlertsActivity3.f41662h.b2(i14);
                gCMRunModeAlertsActivity3.f41662h.y1("virtualPacerEnabled", Boolean.TRUE);
                break;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.activityoptions.b.a
    public void e(double d14) {
        int i14 = this.f83676a;
        GCMRunModeAlertsActivity gCMRunModeAlertsActivity = this.f83677b;
        switch (i14) {
            case 0:
                int i15 = (int) d14;
                gCMRunModeAlertsActivity.f41658d.setButtonRightLabel(l3.j(i15, gCMRunModeAlertsActivity, true));
                com.garmin.android.apps.connectmobile.devices.model.f fVar = gCMRunModeAlertsActivity.f41662h;
                fVar.getClass();
                if (i15 < 1 || i15 > 999) {
                    i15 = 10;
                }
                fVar.y1("repsAlertValue", Integer.valueOf(i15));
                gCMRunModeAlertsActivity.f41662h.y1("repsAlertEnabled", Boolean.TRUE);
                break;
            case 5:
                m3 m3VarW0 = gCMRunModeAlertsActivity.f41662h.w0();
                l3.f23124b.getClass();
                double dH = l3.a.h(d14, m3VarW0);
                gCMRunModeAlertsActivity.f41658d.setButtonRightLabel(l3.a.R(null, dH, m3VarW0, l3.n(), false, null));
                gCMRunModeAlertsActivity.f41662h.M1(dH);
                gCMRunModeAlertsActivity.f41662h.y1("distanceAlertEnabled", Boolean.TRUE);
                break;
            default:
                m3[] m3VarArr = GCMRunModeAlertsActivity.f41654i;
                int i16 = (int) d14;
                gCMRunModeAlertsActivity.f41658d.setButtonRightLabel(l3.c(new l22.a(gCMRunModeAlertsActivity), i16, true));
                gCMRunModeAlertsActivity.f41662h.D1(i16);
                gCMRunModeAlertsActivity.f41662h.y1("caloriesAlertEnabled", Boolean.TRUE);
                break;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.activityoptions.e.a
    public void m(int i14) {
        GCMRunModeAlertsActivity gCMRunModeAlertsActivity = this.f83677b;
        GCMComplexOneLineButton gCMComplexOneLineButton = gCMRunModeAlertsActivity.f41658d;
        l3.f23124b.getClass();
        gCMComplexOneLineButton.setButtonRightLabel(l3.a.n1(i14));
        com.garmin.android.apps.connectmobile.devices.model.f fVar = gCMRunModeAlertsActivity.f41662h;
        fVar.getClass();
        if (i14 < 1 || i14 > 32395) {
            i14 = 1800;
        }
        fVar.y1("timeAlertSeconds", Integer.valueOf(i14));
        gCMRunModeAlertsActivity.f41662h.y1("timeAlertEnabled", Boolean.TRUE);
    }
}
