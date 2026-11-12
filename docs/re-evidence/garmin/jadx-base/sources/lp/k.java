package lp;

import android.content.SharedPreferences;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import d53.u;
import j70.r;
import java.util.Set;
import n70.d3;
import n70.i6;
import n70.o6;
import p92.y;
import pc0.o0;
import q53.t;
import uy0.j1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f114119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f114120c;

    public /* synthetic */ k(Object obj, t tVar, int i14) {
        this.f114118a = i14;
        this.f114120c = obj;
        this.f114119b = tVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        int i14 = this.f114118a;
        t tVar = this.f114119b;
        Object obj = this.f114120c;
        switch (i14) {
            case 0:
                j jVar = (j) obj;
                if (str != null) {
                    f12.l.f68084a.getClass();
                    if (str.equals("keyHistoricalActivitiesRefreshNeeded")) {
                        boolean zK4 = jVar.f114117a.K4();
                        String strH = com.airbnb.lottie.animation.keyframe.a.h("Refresh Historical Activities Needed changed -> ", zK4);
                        i2.a aVar = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar.getClass();
                        i2.a.b(a2Var, "HistoricalActivitiesChangedUseCase", strH);
                        if ((zK4 ? Boolean.valueOf(zK4) : null) != null) {
                            tVar.i(Boolean.TRUE);
                        }
                    }
                }
                break;
            case 1:
                n70.h hVar = (n70.h) obj;
                f12.l.f68084a.getClass();
                if (u.q(str, "keyMyDayRefreshNeeded", true) && hVar.f124246a.r0()) {
                    tVar.i(Boolean.TRUE);
                    break;
                }
                break;
            case 2:
                d3 d3Var = (d3) obj;
                if ("DISMISSED_BANNER_DEVICES".equals(str)) {
                    int i15 = d3.f124134d;
                    tVar.i(d3Var.b());
                }
                break;
            case 3:
                i6 i6Var = (i6) obj;
                if (str != null && str.equals("companion_device_unlinked_dismissed_cards")) {
                    Set<String> setL1 = i6Var.f124289b.L1("companion_device_unlinked_dismissed_cards");
                    i2.f36769a.getClass();
                    i2.a.b(a2.DASHBOARD, "GetUnlinkedDevicesCardsUseCase", "Get unlinked companion devices dismissed cards changed -> " + setL1);
                    tVar.i(setL1);
                    break;
                }
                break;
            case 4:
                o6 o6Var = (o6) obj;
                f12.l.f68084a.getClass();
                if (u.q(str, "userFocus", true)) {
                    r.a aVar2 = r.f97623f;
                    String strH4 = o6Var.f124464a.h4();
                    aVar2.getClass();
                    r rVarA = r.a.a(strH4);
                    if (rVarA == null) {
                        rVarA = r.f97627j;
                    }
                    tVar.i(rVarA);
                }
                break;
            case 5:
                o0 o0Var = (o0) obj;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1991338196:
                            if (!str.equals("key_inreach_devices")) {
                            }
                            break;
                        case -617400617:
                            if (!str.equals("key_inreach_has_emergency_contacts")) {
                            }
                            break;
                        case -178481054:
                            if (!str.equals("key_inreach_last_api_check_date")) {
                            }
                            break;
                        case 611016075:
                            if (!str.equals("key_inreach_banner_dismissed_at")) {
                            }
                            break;
                    }
                    tVar.i(Boolean.valueOf(o0.p(o0Var)));
                }
                break;
            case 6:
                t92.c cVar = (t92.c) obj;
                if (u.q(str, "sync_device_data", true)) {
                    Boolean boolH = cVar.h();
                    y.f136664a.getClass();
                    y.a.a("ConsentPrefsImpl", "observeSyncDeviceDataStatus() on update -> isSyncDeviceDataEnabled[" + boolH + "]");
                    tVar.i(boolH);
                }
                break;
            case 7:
                uy0.j jVar2 = (uy0.j) obj;
                if (str != null) {
                    f12.l.f68084a.getClass();
                    if (str.equals("key_bottom_navigation_items")) {
                        String[] strArrT1 = jVar2.f173212a.t1();
                        String str2 = "Bottom Navigation Items changed -> " + p13.u.i0(strArrT1);
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var2 = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.b(a2Var2, "GetBottomNavigationItemsUseCase", str2);
                        tVar.i(p13.u.i0(strArrT1));
                    }
                }
                break;
            case 8:
                j1 j1Var = (j1) obj;
                if (str != null) {
                    f12.l.f68084a.getClass();
                    if (str.equals("keyMoreMenuRefreshNeeded")) {
                        boolean zY0 = j1Var.f173216a.Y0();
                        String strH2 = com.airbnb.lottie.animation.keyframe.a.h("Refresh More Menu Needed changed -> ", zY0);
                        i2.a aVar4 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar4.getClass();
                        i2.a.b(a2Var3, "RefreshMoreMenuNeededUseCase", strH2);
                        if ((zY0 ? Boolean.valueOf(zY0) : null) != null) {
                            tVar.i(Boolean.TRUE);
                        }
                    }
                }
                break;
            default:
                ze0.b bVar = (ze0.b) obj;
                if (str != null && str.equals("FEEDBACK_SNACKBAR_MESSAGE")) {
                    String strA4 = bVar.f204261a.A4("FEEDBACK_SNACKBAR_MESSAGE", null);
                    a2 a2Var4 = a2.DASHBOARD;
                    String strN = fb1.c.n("feedback snackbar message changed: ", strA4);
                    i2.f36769a.getClass();
                    i2.a.b(a2Var4, "GetFeedbackSnackbarMessageUseCase", strN);
                    tVar.i(strA4);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ k(t tVar, Object obj, int i14) {
        this.f114118a = i14;
        this.f114119b = tVar;
        this.f114120c = obj;
    }
}
