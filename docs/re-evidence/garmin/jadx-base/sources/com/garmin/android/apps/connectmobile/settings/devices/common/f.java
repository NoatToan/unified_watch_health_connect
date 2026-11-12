package com.garmin.android.apps.connectmobile.settings.devices.common;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.v;
import androidx.lifecycle.m;
import androidx.lifecycle.v1;
import androidx.lifecycle.x1;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.c3;
import com.garmin.android.apps.connectmobile.device.companion.presentation.CompanionDeviceCardView;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.m0;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import d53.w;
import g.h;
import hk0.p;
import java.util.List;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p13.h0;
import tr2.y;
import uv.j;
import vg1.c0;
import vg1.q;
import vg1.s;
import vg1.x;
import vg1.z;
import zb0.g;
import zb0.g0;
import zb0.k;
import zb0.t;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
public class f extends m0 {
    public c0 A;
    public x B;
    public x C;
    public x D;
    public x E;
    public x F;
    public x I;
    public c3 J0;
    public TextView P;
    public TextView T;
    public TextView X;
    public x Y;
    public CompanionDeviceCardView Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public x f42835k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f42839o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c0 f42840p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f42841q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public x f42842r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public x f42843t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public x f42844v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public x f42845w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public x f42846x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public x f42847y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public x f42848z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g f42831h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f42832i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e f42833j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f42834k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public sd2.f f42836l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public u0 f42837m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public z f42838n = null;
    public boolean H0 = false;
    public boolean I0 = false;
    public final m80.a K0 = (m80.a) KoinJavaComponent.get(m80.a.class);
    public final f.c<Intent> L0 = registerForActivityResult(new h(), new y(this, 5));

    public static boolean I6(f fVar, sd2.f fVar2) {
        fVar.getClass();
        if (fVar2 == null) {
            return false;
        }
        return !u0.n(fVar2.getProductNumber(), u0.H0, u0.P5, u0.S5) || fVar2.T();
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        e eVar = this.f42833j;
        if (eVar != null) {
            eVar.a();
        }
        e eVar2 = new e(this);
        this.f42833j = eVar2;
        eVar2.c(new Void[0]);
    }

    public final void J6() {
        if (this.f42836l != null) {
            j22.b bVar = j22.b.f96736a;
            Context contextRequireContext = requireContext();
            bVar.getClass();
            if (j22.b.b(contextRequireContext)) {
                String strC = k.c(this.f42836l);
                if (TextUtils.isEmpty(strC) || this.K0.e(this.f42836l)) {
                    this.Z.setVisibility(8);
                    return;
                } else {
                    this.Z.setVisibility(0);
                    this.Z.c(new n80.a(strC, null, this.f42836l.getProductNumber()), new s(this));
                    return;
                }
            }
        }
        this.Z.setVisibility(8);
    }

    public final Intent K6(DeviceSettingsActivityTrackerSetupDefault.a aVar, String str) {
        g gVar;
        gj1.f fVar;
        List<gj1.a> listF;
        gj1.a aVarT;
        String currentFirmwareVersion;
        Intent intent = new Intent();
        sd2.f fVar2 = this.f42836l;
        if (fVar2 != null) {
            intent.putExtra("GCM_deviceUnitID", fVar2.getUnitID());
            intent.putExtra("GCM_deviceProductNbr", this.f42836l.getProductNumber());
            intent.putExtra("GCM_deviceName", this.f42836l.getDisplayName());
            intent.putExtra("GCM_deviceDisplayName", this.f42836l.getProductDisplayName());
            String softwareVersion = this.f42836l.getSoftwareVersion();
            if ((softwareVersion == null || softwareVersion.isEmpty() || softwareVersion.equals("0")) && (gVar = this.f42831h) != null && (fVar = gVar.f104965b) != null && (listF = fVar.f()) != null && (aVarT = gl.b.t(Long.valueOf(this.f42832i), listF)) != null && (currentFirmwareVersion = aVarT.getCurrentFirmwareVersion()) != null) {
                String str2 = j.f172903a;
                softwareVersion = h0.k0(w.W(currentFirmwareVersion, new String[]{"."}), "", null, null, null, 62);
            }
            intent.putExtra("GCM_currentFirmwareVersion", softwareVersion);
            intent.putExtra("GCM_low_hr_alert_capable", this.f42836l.s2());
            intent.putExtra("GCM_extra_device_image_url", t.d(this.f42836l));
            if (this.f42836l.z1()) {
                intent.putExtra("GCM_macAddress", this.f42836l.d0());
            }
        }
        u0 u0Var = this.f42837m;
        if (u0Var != null) {
            intent.putExtra("GCM_deviceEnumValue", u0Var);
        }
        z zVar = this.f42838n;
        if (zVar != null && (zVar instanceof vg1.t)) {
            intent.putExtra("GCM_deviceSettingsEnumValue", (vg1.t) zVar);
        }
        if (aVar != null) {
            intent.putExtra("setting_name", aVar);
        }
        intent.setClassName(requireActivity(), str);
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.J0 = (c3) context;
        } catch (ClassCastException unused) {
            i2.f(a2.DEVICES, "DeviceSettingFragment", "Activity must implement StatusBannerListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f42832i = arguments.getLong("GCM_deviceUnitID", -1L);
        }
        this.f42831h = (g) new x1(getActivity()).a(g.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return A6(viewGroup, layoutInflater, R.layout.gcm_device_settings);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f42837m == u0.L5) {
            ed0.a.k("Vector Scan");
        }
    }

    @Override // com.garmin.android.apps.connectmobile.m0, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        e eVar = this.f42833j;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        super.onViewCreated(view2, bundle);
        final SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view2.findViewById(R.id.root_view);
        final NestedScrollView nestedScrollView = (NestedScrollView) view2.findViewById(R.id.device_settings_scroll_view_container);
        nestedScrollView.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: vg1.p
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                swipeRefreshLayout.setEnabled(nestedScrollView.getScrollY() == 0);
            }
        });
        View viewFindViewById = view2.findViewById(R.id.featured_categories_group);
        this.f42839o = viewFindViewById;
        viewFindViewById.setVisibility(8);
        c0 c0Var = new c0(view2.findViewById(R.id.finish_device_setup));
        this.f42840p = c0Var;
        ImageView imageView = c0Var.f178082c;
        if (imageView != null) {
            imageView.setImageResource(2131231750);
        }
        TextView textView = c0Var.f178081b;
        if (textView != null) {
            textView.setText(R.string.onboarding_device_setup_title);
        }
        this.f42841q = view2.findViewById(R.id.finish_device_setup_divider);
        x xVar = new x(view2.findViewById(R.id.setting_solar_intensity));
        this.B = xVar;
        xVar.a(R.drawable.launch_dialog_modal_solar_small, R.string.solar_intensity);
        this.Y = new x(this.f42839o.findViewById(R.id.setting_garminpay));
        this.Y.b(2131231858, getString(R.string.common_conjunct_ampersand_2, getString(R.string.wallet_concept), getString(R.string.wallet_garmin_pay)));
        x xVar2 = new x(this.f42839o.findViewById(R.id.setting_ecg));
        this.f42835k0 = xVar2;
        xVar2.a(2131232747, R.string.lbl_ecg);
        x xVar3 = new x(view2.findViewById(R.id.setting_music));
        this.C = xVar3;
        xVar3.a(2131231857, R.string.device_screen_music);
        x xVar4 = new x(view2.findViewById(R.id.setting_lte));
        this.D = xVar4;
        xVar4.b(2131232743, getString(R.string.lte_connect_with, getString(R.string.lbl_verizon)));
        long j8 = this.f42832i;
        SupportedCapability supportedCapability = SupportedCapability.CUSTOM_CANNED_TEXT_LIST_SUPPORT;
        this.I0 = p.i(j8, supportedCapability);
        if (p.i(this.f42832i, supportedCapability)) {
            x xVar5 = new x(view2.findViewById(R.id.setting_text_response));
            this.E = xVar5;
            xVar5.a(2131232744, R.string.device_settings_canned_text_responses);
        }
        x xVar6 = new x(view2.findViewById(R.id.setting_hands_calibration));
        this.F = xVar6;
        xVar6.b(2131232665, getString(R.string.device_settings_hands_calibration));
        x xVar7 = new x(view2.findViewById(R.id.setting_bike_alarm));
        this.f42842r = xVar7;
        xVar7.a(2131232749, R.string.lbl_bike_alarm);
        x xVar8 = new x(view2.findViewById(R.id.setting_activities_and_apps));
        this.f42843t = xVar8;
        xVar8.a(2131232737, R.string.device_settings_activities_apps_more);
        x xVar9 = new x(view2.findViewById(R.id.setting_appearance));
        this.f42844v = xVar9;
        xVar9.a(2131231850, R.string.appearance_title);
        x xVar10 = new x(view2.findViewById(R.id.setting_sound_and_alert));
        this.f42845w = xVar10;
        xVar10.a(2131232753, R.string.sounds_and_alerts_title);
        x xVar11 = new x(view2.findViewById(R.id.setting_activity_options));
        this.f42846x = xVar11;
        xVar11.a(2131232738, R.string.activity_options_title);
        x xVar12 = new x(view2.findViewById(R.id.setting_activity_tracking));
        this.f42847y = xVar12;
        xVar12.a(2131232739, R.string.activity_tracking_title);
        x xVar13 = new x(view2.findViewById(R.id.setting_user_setting));
        this.f42848z = xVar13;
        xVar13.a(R.drawable.user_profile, R.string.devices_settings_user_settings);
        c0 c0Var2 = new c0(view2.findViewById(R.id.setting_general));
        this.A = c0Var2;
        ImageView imageView2 = c0Var2.f178082c;
        if (imageView2 != null) {
            imageView2.setImageResource(2131232749);
        }
        TextView textView2 = c0Var2.f178081b;
        if (textView2 != null) {
            textView2.setText(R.string.lbl_general);
        }
        View view3 = this.A.f178085f;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        x xVar14 = new x(view2.findViewById(R.id.setting_manage_people));
        this.I = xVar14;
        xVar14.a(R.drawable.icon_onboarding_connections, R.string.lbl_manage_users);
        View view4 = this.I.f178211d;
        if (view4 != null) {
            view4.setVisibility(8);
        }
        TextView textView3 = (TextView) view2.findViewById(R.id.setting_help_and_info);
        this.P = textView3;
        textView3.setOnClickListener(new q(this, 0));
        TextView textView4 = (TextView) view2.findViewById(R.id.setting_find_my_watch_label);
        this.T = textView4;
        textView4.setOnClickListener(new q(this, 1));
        this.X = (TextView) view2.findViewById(R.id.setting_map_last_location_label);
        this.Z = (CompanionDeviceCardView) view2.findViewById(R.id.frag_device_link_banner);
        g gVar = this.f42831h;
        if (gVar != null) {
            long j14 = this.f42832i;
            boolean z14 = !this.f42834k;
            t13.g gVar2 = v1.a(gVar).f183565a;
            x53.c cVar = s0.f129406a;
            m.a(gVar2.plus(x53.b.f189152a), new zb0.j(z14, gVar, j14, null), 2).f(getViewLifecycleOwner(), new iz1.g(this, 24));
        }
        v childFragmentManager = getChildFragmentManager();
        androidx.fragment.app.a aVarB = androidx.core.view.j.b(childFragmentManager, childFragmentManager);
        long j15 = this.f42832i;
        Bundle bundle2 = new Bundle();
        g0 g0Var = new g0();
        bundle2.putLong("GCM_deviceUnitID", j15);
        bundle2.putBoolean("aggregated_settings", true);
        bundle2.putBoolean("SYNC_SETTINGS", false);
        g0Var.setArguments(bundle2);
        aVarB.l(R.id.frag_card_guts, g0Var, null);
        aVarB.e();
    }
}
