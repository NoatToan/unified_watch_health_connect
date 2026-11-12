package zb0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.c3;
import com.garmin.android.apps.connectmobile.device.companion.presentation.CompanionDeviceCardView;
import com.garmin.android.apps.connectmobile.device.companion.presentation.CompanionDeviceLinkActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s2;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.device.datatypes.DeviceProfile;
import java.util.Map;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public class o extends com.garmin.android.apps.connectmobile.m0 {
    public GCMComplexTwoLineButton A;
    public s2 C;
    public c3 D;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public androidx.lifecycle.y0<sd2.f> f203587i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public GCMComplexOneLineButton f203592n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public GCMComplexOneLineButton f203593o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public GCMComplexOneLineButton f203594p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public GCMComplexOneLineButton f203595q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public GCMComplexOneLineButton f203596r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public GCMComplexOneLineButton f203597t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public GCMComplexOneLineButton f203598v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public GCMComplexOneLineButton f203599w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public GCMComplexOneLineButton f203600x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public GCMComplexOneLineButton f203601y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CompanionDeviceCardView f203602z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f203586h = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public sd2.f f203588j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public u0 f203589k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Handler f203590l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f203591m = null;
    public final m B = new m(this, 0);
    public final m80.a E = (m80.a) KoinJavaComponent.get(m80.a.class);
    public final f.c<Intent> F = registerForActivityResult(new g.h(), new tr2.y(this, 18));

    public class a implements androidx.lifecycle.z0<sd2.f> {
        public a() {
        }

        @Override // androidx.lifecycle.z0
        public final void onChanged(sd2.f fVar) {
            sd2.f fVar2 = fVar;
            o oVar = o.this;
            try {
                oVar.f203588j = fVar2;
                if (fVar2 != null) {
                    u0 u0Var = (u0) u0.f203782n6.get(fVar2.getProductNumber());
                    oVar.f203589k = u0Var;
                    if (u0Var != null) {
                        o.I6(oVar);
                    }
                } else {
                    i2.f(a2.DEVICES, "DeviceFullViewFragment", "prepareViewsAsync: no database record for unit ID [" + oVar.f203586h + "]");
                }
            } catch (Exception e4) {
                i2.f(a2.DEVICES, "DeviceFullViewFragment", "prepareViewsAsync: " + e4.getMessage());
            }
            oVar.w6();
            s2 s2Var = oVar.C;
            if (s2Var != null) {
                s2Var.hideProgressOverlay();
            }
        }
    }

    public class b implements e23.l<n80.a, Unit> {
        public b() {
        }

        @Override // e23.l
        public final Unit invoke(n80.a aVar) {
            n80.a aVar2 = aVar;
            CompanionDeviceLinkActivity.a aVar3 = CompanionDeviceLinkActivity.f33743a;
            o oVar = o.this;
            Context contextRequireContext = oVar.requireContext();
            f.c<Intent> cVar = oVar.F;
            aVar3.getClass();
            contextRequireContext.getClass();
            aVar2.getClass();
            cVar.getClass();
            Intent intent = new Intent(contextRequireContext, (Class<?>) CompanionDeviceLinkActivity.class);
            intent.putExtra("companion_device", aVar2);
            cVar.a(intent, null);
            return null;
        }
    }

    public static class c extends g22.c<Long, sd2.f> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final androidx.lifecycle.y0<sd2.f> f203605c;

        public c(androidx.lifecycle.y0<sd2.f> y0Var) {
            this.f203605c = y0Var;
        }

        @Override // g22.c
        public final sd2.f b(Long[] lArr) {
            long jLongValue = lArr[0].longValue();
            rd2.f.a().f152045a.getClass();
            return rd2.j.i(jLongValue, null);
        }

        @Override // g22.c
        public final void d(sd2.f fVar) {
            this.f203605c.m(fVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:158:0x0242 A[FALL_THROUGH] */
    public static void I6(o oVar) {
        int iOrdinal;
        u0 u0Var;
        int i14;
        m mVar = oVar.B;
        androidx.fragment.app.v childFragmentManager = oVar.getChildFragmentManager();
        if (!(childFragmentManager.G("DeviceTopHeaderFragment") instanceof g0)) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
            long j8 = oVar.f203586h;
            Bundle bundle = new Bundle();
            g0 g0Var = new g0();
            bundle.putLong("GCM_deviceUnitID", j8);
            bundle.putBoolean("aggregated_settings", false);
            g0Var.setArguments(bundle);
            aVar.l(R.id.frag_card_guts, g0Var, "DeviceTopHeaderFragment");
            aVar.d(null);
            aVar.e();
        }
        c3 c3Var = oVar.D;
        if (c3Var != null) {
            c3Var.checkConsentBannerStatus(z10.l0.DEVICE_SETTINGS, R.string.msg_more_feature_available_upload);
        }
        oVar.J6();
        ng1.b0 b0Var = new ng1.b0();
        String strA = ng1.b0.a(oVar.f203589k.f203854a);
        u0 u0Var2 = oVar.f203589k;
        if (u0Var2 != null) {
            if (strA == null) {
                if (u0Var2 == u0.L5) {
                    oVar.f203592n.setVisibility(0);
                    oVar.f203592n.setOnClickListener(new m(oVar, b0Var));
                    return;
                } else {
                    if (u0Var2 == u0.O1) {
                        oVar.f203593o.setVisibility(0);
                        oVar.f203593o.setOnClickListener(mVar);
                        return;
                    }
                    return;
                }
            }
            if (km2.a.i(oVar.f203588j.getUnitID(), null, SupportedCapability.ANTI_THEFT_ALARM.ordinal())) {
                oVar.f203601y.setVisibility(0);
                oVar.f203601y.setOnClickListener(new m(oVar, 4));
            }
            boolean zT = oVar.f203588j.T();
            if (zT) {
                oVar.f203592n.setVisibility(0);
                oVar.f203592n.setOnClickListener(new wv2.h(20, oVar, strA));
            }
            u0 u0Var3 = oVar.f203589k;
            Map<u0, vg1.t> map = n0.f203577a;
            if (u0Var3 != u0.f203747j && u0Var3 != u0.f203762l && u0Var3 != u0.X4 && u0Var3 != u0.f203702b5 && u0Var3 != u0.L5 && u0Var3 != u0.F4 && u0Var3 != u0.G4 && u0Var3 != u0.I4 && u0Var3 != u0.H4 && u0Var3 != u0.L4 && u0Var3 != u0.M4 && u0Var3 != u0.N4 && u0Var3 != u0.T4 && u0Var3 != u0.P4 && u0Var3 != u0.Q4 && u0Var3 != u0.R4 && u0Var3 != u0.S4 && u0Var3 != u0.J4 && u0Var3 != u0.O4 && u0Var3 != u0.Z4 && u0Var3 != u0.f203708c5 && u0Var3 != u0.f203696a5 && u0Var3 != u0.U4 && u0Var3 != u0.W4 && u0Var3 != u0.Y4 && u0Var3 != u0.K4) {
                oVar.f203593o.setVisibility(0);
                oVar.f203593o.setOnClickListener(mVar);
            }
            if (zT && km2.a.d(oVar.f203586h, km2.a.c())) {
                oVar.A.setVisibility(0);
                oVar.A.setOnClickListener(new m(oVar, 5));
            }
            if (zT && ((u0Var = oVar.f203589k) == u0.f203837x1 || u0Var == u0.f203843y1 || u0Var == u0.Q1 || u0Var == u0.R1 || u0Var == u0.S1 || u0Var == u0.T1 || u0Var == u0.A5 || u0Var == u0.V1 || u0Var == u0.J1 || u0Var == u0.f203849z1)) {
                GCMComplexOneLineButton gCMComplexOneLineButton = oVar.f203594p;
                long unitID = oVar.f203588j.getUnitID();
                p1.z<String> zVar = td2.a.f163901a;
                String string = td2.a.EnumC3084a.GOLF.toString();
                String strB = td2.a.f163901a.b(unitID);
                if ((strB != null && strB.toLowerCase().contains(string.toLowerCase())) || u0Var == u0.R1 || u0Var == u0.Q1 || u0Var == u0.S1 || u0Var == u0.T1 || u0Var == u0.V1 || u0Var == u0.J1) {
                    i14 = R.string.activity_options_title;
                } else {
                    i14 = u0Var == u0.f203843y1 ? R.string.activity_profiles_title : R.string.run_options_title;
                }
                gCMComplexOneLineButton.setButtonLeftLabel(oVar.getString(i14));
                oVar.f203594p.setVisibility(0);
                oVar.f203594p.setOnClickListener(new m(oVar, 6));
            }
            int i15 = 8;
            oVar.f203597t.setVisibility(8);
            kj0.c cVar = kj0.c.f104941a;
            sd2.f fVar = oVar.f203588j;
            cVar.getClass();
            fVar.getClass();
            if (fVar.i1()) {
                oVar.f203597t.setVisibility(0);
                oVar.f203597t.setOnClickListener(new m(oVar, 7));
            }
            if (zT) {
                u0 u0Var4 = oVar.f203589k;
                if (u0Var4 != u0.W0 && u0Var4 != u0.N2 && u0Var4 != u0.P2 && u0Var4 != u0.O2 && u0Var4 != u0.Q2 && u0Var4 != u0.S2 && u0Var4 != u0.R2 && u0Var4 != u0.F5 && u0Var4 != u0.f203852z4 && u0Var4 != u0.A4 && u0Var4 != u0.B4 && u0Var4 != u0.M2 && u0Var4 != u0.Y2) {
                    switch (n0.a.f203583a[u0Var4.ordinal()]) {
                        default:
                            u0 u0Var5 = oVar.f203589k;
                            if (u0Var5 != u0.L2 && (iOrdinal = u0Var5.ordinal()) != 228) {
                                switch (iOrdinal) {
                                    default:
                                        if (oVar.f203589k == u0.M5) {
                                        }
                                    case 217:
                                    case 218:
                                    case 219:
                                    case 220:
                                    case 221:
                                    case 222:
                                    case 223:
                                    case 224:
                                        oVar.f203596r.setVisibility(0);
                                        oVar.f203596r.setOnClickListener(new m(oVar, i15));
                                        break;
                                }
                            }
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            oVar.f203596r.setVisibility(0);
                            oVar.f203596r.setOnClickListener(new m(oVar, i15));
                            break;
                    }
                } else {
                    oVar.f203596r.setVisibility(0);
                    oVar.f203596r.setOnClickListener(new m(oVar, i15));
                }
            }
            if (zT && km2.a.i(oVar.f203588j.getUnitID(), null, SupportedCapability.FIND_MY_WATCH.ordinal())) {
                if (u0.v(oVar.f203588j.getProductNumber())) {
                    oVar.f203595q.setButtonLeftLabel(R.string.find_my_edge_label);
                    oVar.f203595q.setButtonBottomHint((String) null);
                    oVar.f203595q.e();
                }
                oVar.f203595q.setVisibility(0);
                oVar.f203595q.setOnClickListener(new m(oVar, 9));
            }
            int i16 = 1;
            boolean z14 = !TextUtils.isEmpty(oVar.f203588j.getProductNumber()) && oVar.f203588j.getProductNumber().contains("2733");
            com.garmin.android.apps.connectmobile.l.g().getClass();
            com.garmin.android.apps.connectmobile.devices.model.t tVar = (com.garmin.android.apps.connectmobile.devices.model.t) GsonUtil.f47253b.fromJson(gh2.i.f77458c.a().f77477b.h("expresspay_feature_config"), com.garmin.android.apps.connectmobile.devices.model.t.class);
            if (zT && z14 && tVar != null && tVar.c()) {
                oVar.f203599w.setVisibility(0);
                oVar.f203599w.setOnClickListener(new p(oVar, tVar));
            }
            if (zT && km2.a.i(oVar.f203588j.getUnitID(), null, SupportedCapability.FIND_MY_WATCH.ordinal()) && oVar.getContext() != null) {
                g1 g1VarA = g1.a(oVar.getContext().getApplicationContext());
                long j14 = oVar.f203586h;
                g1VarA.getClass();
                g1.c(j14);
                g1 g1VarA2 = g1.a(oVar.getContext().getApplicationContext());
                long j15 = oVar.f203586h;
                g1VarA2.getClass();
                b0 b0VarC = g1.c(j15);
                if (b0VarC.f203431b.equals("0") || b0VarC.f203432c.equals("0")) {
                    return;
                }
                oVar.f203600x.setVisibility(0);
                oVar.f203600x.setOnClickListener(new m(oVar, i16));
            }
        }
    }

    public static xt2.a K6(sd2.f fVar) {
        da2.b bVarF = hk0.p.f();
        DeviceProfile deviceProfileD = bVarF.d(fVar.d0());
        if (deviceProfileD == null) {
            deviceProfileD = bVarF.d(fVar.Q());
        }
        if (deviceProfileD == null) {
            return null;
        }
        return (xt2.a) bVarF.getCapability(deviceProfileD.getMacAddress(), xt2.a.class);
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        M6();
    }

    public final void J6() {
        if (this.f203588j != null) {
            j22.b bVar = j22.b.f96736a;
            Context contextRequireContext = requireContext();
            bVar.getClass();
            if (j22.b.b(contextRequireContext)) {
                String strC = k.c(this.f203588j);
                if (TextUtils.isEmpty(strC) || this.E.e(this.f203588j)) {
                    this.f203602z.setVisibility(8);
                    return;
                } else {
                    this.f203602z.setVisibility(0);
                    this.f203602z.c(new n80.a(strC, null, this.f203588j.getProductNumber()), new b());
                    return;
                }
            }
        }
        this.f203602z.setVisibility(8);
    }

    public final void M6() {
        i2.a(a2.DEVICES, "DeviceFullViewFragment", "prepareViewsAsync");
        this.f203591m = new c(this.f203587i);
        s2 s2Var = this.C;
        if (s2Var != null) {
            s2Var.showProgressOverlay();
        }
        this.f203591m.c(Long.valueOf(this.f203586h));
    }

    public final void S6() {
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(requireContext());
        aVar.setMessage(R.string.find_my_watch_device_not_connected_msg);
        aVar.setPositiveButton(R.string.lbl_close, new xk1.v(23));
        aVar.create().show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.C = (s2) context;
            this.D = (c3) context;
        } catch (ClassCastException unused) {
            i2.f(a2.DEVICES, "DeviceFullViewFragment", "Activity must implement ProgressOverlayListener and StatusBannerListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f203586h = arguments.getLong("GCM_deviceUnitID", -1L);
        }
        this.f203587i = new androidx.lifecycle.y0<>();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return A6(viewGroup, layoutInflater, R.layout.gcm_device_full_view);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        i2.a(a2.DEVICES, "DeviceFullViewFragment", "onPause");
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        i2.a(a2.DEVICES, "DeviceFullViewFragment", "onResume");
        super.onResume();
        if (this.f203589k == u0.L5) {
            ed0.a.k("Vector Scan");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        i2.a(a2.DEVICES, "DeviceFullViewFragment", "onStart");
        super.onStart();
        if (this.f203590l == null) {
            this.f203590l = new Handler();
        }
        M6();
    }

    @Override // com.garmin.android.apps.connectmobile.m0, androidx.fragment.app.Fragment
    public final void onStop() {
        i2.a(a2.DEVICES, "DeviceFullViewFragment", "onStop");
        super.onStop();
        c cVar = this.f203591m;
        if (cVar != null) {
            cVar.a();
        }
        s2 s2Var = this.C;
        if (s2Var != null) {
            s2Var.hideProgressOverlay();
        }
        Handler handler = this.f203590l;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f203590l = null;
        }
        if (v22.e.d(this.f203595q.f47770j)) {
            xt2.a aVarK6 = K6(this.f203588j);
            if (aVarK6 != null) {
                aVarK6.c(new s(this));
            }
            this.f203595q.g(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        super.onViewCreated(view2, bundle);
        this.A = (GCMComplexTwoLineButton) view2.findViewById(R.id.custom_bttn_connect_iq_apps);
        this.f203592n = (GCMComplexOneLineButton) view2.findViewById(R.id.custom_bttn_device_settings);
        this.f203593o = (GCMComplexOneLineButton) view2.findViewById(R.id.custom_bttn_user_settings);
        this.f203594p = (GCMComplexOneLineButton) view2.findViewById(R.id.custom_bttn_run_options);
        this.f203595q = (GCMComplexOneLineButton) view2.findViewById(R.id.custom_bttn_find_my_watch);
        this.f203596r = (GCMComplexOneLineButton) view2.findViewById(R.id.custom_bttn_alarms);
        this.f203598v = (GCMComplexOneLineButton) view2.findViewById(R.id.custom_bttn_device_support_center);
        this.f203597t = (GCMComplexOneLineButton) view2.findViewById(R.id.custom_bttn_wallet);
        this.f203599w = (GCMComplexOneLineButton) view2.findViewById(R.id.custom_bttn_expresspay);
        this.f203598v.setOnClickListener(new m(this, 3));
        this.f203600x = (GCMComplexOneLineButton) view2.findViewById(R.id.custom_bttn_map_last_location);
        this.f203601y = (GCMComplexOneLineButton) view2.findViewById(R.id.custom_bttn_bike_alarm);
        this.f203602z = (CompanionDeviceCardView) view2.findViewById(R.id.frag_device_link_banner);
        this.f203587i.f(getViewLifecycleOwner(), new a());
    }
}
