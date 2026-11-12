package zb0;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.v1;
import androidx.lifecycle.x1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.navigation.more.MoreActivity;
import com.garmin.android.apps.connectmobile.s2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes8.dex */
public class g0 extends Fragment implements gc0.i.c, yr1.r {
    public yr1.q A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i0 f203490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f203491b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f203495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f203496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f203497h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f203498i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f203499j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f203500k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f203501l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f203503n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f203504o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public s2 f203506q;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final j22.e f203513z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public gc0.i f203492c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y0 f203493d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f203494e = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f203502m = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f203505p = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Handler f203507r = new Handler();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z0.g0 f203508t = new z0.g0(this, 5);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a f203509v = new a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f203510w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b f203511x = new b();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f.c<Intent> f203512y = registerForActivityResult(new g.h(), new tr2.y(this, 19));

    public class a extends xf0.b {
        public a() {
        }

        @Override // xf0.b
        public final void deviceConnected(pi2.g gVar) {
            g0 g0Var = g0.this;
            g0Var.getClass();
            ed0.a.k("DeviceFullViewCardGutsFragment");
            gc0.c.a(g0Var.f203496g, g0Var.f203492c.f76871d);
        }

        @Override // xf0.b
        public final void deviceDisconnected(pi2.h hVar) {
            g0 g0Var = g0.this;
            g0Var.getClass();
            ed0.a.k("DeviceFullViewCardGutsFragment");
            gc0.c.a(g0Var.f203496g, g0Var.f203492c.f76871d);
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
            if (12 == intExtra || 10 == intExtra) {
                g0.this.f203507r.post(new z0.g0(this, 6));
            }
        }
    }

    public class c implements androidx.core.view.s {
        public c() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            g0 g0Var = g0.this;
            if (g0Var.f203493d != null) {
                menuInflater.inflate(R.menu.device_details, menu);
                MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_manage_device_priority);
                gj1.c cVar = g0Var.f203491b.f203486f;
                if (cVar != null) {
                    menuItemFindItem.setVisible(cVar.f77655d);
                }
            }
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            sd2.f fVar;
            int itemId = menuItem.getItemId();
            g0 g0Var = g0.this;
            if (itemId == R.id.menu_item_remove_device && (fVar = g0Var.f203492c.f76871d) != null) {
                g0.u6(g0Var, fVar);
                return false;
            }
            if (menuItem.getItemId() != R.id.menu_item_manage_device_priority) {
                return false;
            }
            g0Var.getClass();
            Bundle bundle = new Bundle();
            bundle.putSerializable("MORE_START_DESTINATION_EXTRA", ty0.b.J2);
            Intent intent = new Intent(g0Var.requireContext(), (Class<?>) MoreActivity.class);
            intent.putExtras(bundle);
            g0Var.startActivity(intent);
            return false;
        }
    }

    public class d {
        public d() {
        }
    }

    public g0() {
        final int i14 = 0;
        e23.a aVar = new e23.a(this) { // from class: zb0.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f203481b;

            {
                this.f203481b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return this.f203481b;
                    default:
                        this.f203481b.y6();
                        ed0.a.m("DeviceFullViewCardGutsFragment", null);
                        return null;
                }
            }
        };
        final int i15 = 1;
        e23.a aVar2 = new e23.a(this) { // from class: zb0.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f203481b;

            {
                this.f203481b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return this.f203481b;
                    default:
                        this.f203481b.y6();
                        ed0.a.m("DeviceFullViewCardGutsFragment", null);
                        return null;
                }
            }
        };
        j22.e.a aVar3 = j22.e.f96744g;
        aVar3.getClass();
        this.f203513z = j22.e.a.b(aVar3, "DeviceFullViewCardGutsFragment", aVar, aVar2);
    }

    public static void u6(g0 g0Var, sd2.f fVar) {
        g0Var.getClass();
        if (fVar == null) {
            return;
        }
        String string = g0Var.getString(R.string.lbl_gear_remove_item_title, fVar.getDisplayName());
        boolean zX = ((d0) KoinJavaComponent.get(d0.class)).x(fVar.getUnitID());
        androidx.fragment.app.m activity = g0Var.getActivity();
        hj1.b.f83993a.getClass();
        String strB = hj1.b.a.b(activity, zX);
        if (!c22.e1.a()) {
            Toast.makeText(g0Var.getActivity(), R.string.txt_bluetooth_must_be_turned_on_for_action, 0).show();
            return;
        }
        if (!fVar.S()) {
            g0Var.w6(string, strB, fVar, null);
            return;
        }
        gj1.c cVar = g0Var.f203491b.f203486f;
        if (!fVar.T() || cVar == null) {
            g0Var.w6(string, strB, fVar, null);
        } else {
            g0Var.w6(string, cVar.f77656e, fVar, cVar);
        }
    }

    @Override // yr1.r
    public final void B1(al2.c cVar) {
    }

    @Override // yr1.r
    public final void F1(al2.a aVar, boolean z14) {
        if (this.f203503n) {
            this.f203501l.setVisibility(0);
            this.f203500k.setVisibility(8);
        }
    }

    @Override // yr1.r
    public final void g5(al2.c cVar, boolean z14) {
        if (this.f203503n) {
            gc0.c.b(this.f203500k, this.f203492c.f76871d);
            this.f203501l.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        gc0.i iVar = new gc0.i(getActivity(), this);
        this.f203492c = iVar;
        y0 y0Var = this.f203493d;
        if (y0Var != null) {
            iVar.f76871d = y0Var.r2();
        }
        View viewFindViewById = requireView().findViewById(R.id.device_card);
        if (viewFindViewById != null) {
            viewFindViewById.setOnLongClickListener(new gc0.a(this, 6));
        }
        this.f203490a.f203535c.f(getViewLifecycleOwner(), new wd2.h0(this, 17));
        v6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.f203493d = (y0) context;
            this.f203506q = (s2) context;
        } catch (ClassCastException unused) {
            i2.f(a2.DEVICES, "DeviceFullViewCardGutsFragment", "Activity must implement IDeviceFullViewActivityCallback");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f203505p = arguments.getLong("GCM_deviceUnitID", -1L);
            this.f203504o = arguments.getBoolean("aggregated_settings", false);
            this.f203503n = arguments.getBoolean("SYNC_SETTINGS", true);
        }
        this.A = new yr1.q("DeviceFullViewCardGutsFragment", this);
        x1 x1Var = new x1(this, new j0());
        p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
        this.f203490a = (i0) x1Var.b(t0Var.b(i0.class));
        this.f203491b = (g) new x1(getActivity()).b(t0Var.b(g.class));
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"InflateParams"})
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(this.f203504o ? R.layout.gcm_setting_device_card : R.layout.gcm_device_card, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        gc0.i iVar = this.f203492c;
        if (iVar != null) {
            i2.a(a2.DEVICES, "DeviceUICommon", ".onStopHelper()");
            s2 s2Var = iVar.f76872e;
            if (s2Var != null) {
                s2Var.hideProgressOverlay();
            }
            oi2.a.b(iVar.f76873f);
        }
        this.f203507r.removeCallbacks(this.f203508t);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f203490a.f203535c.f(getViewLifecycleOwner(), new wd2.h0(this, 17));
        v6();
        gc0.i iVar = this.f203492c;
        if (iVar != null) {
            i2.a(a2.DEVICES, "DeviceUICommon", ".onStartHelper()");
            oi2.a.a(iVar.f76873f);
            j22.b bVar = j22.b.f96736a;
            androidx.fragment.app.m mVar = iVar.f76870c;
            bVar.getClass();
            if (j22.b.b(mVar) && !c22.e1.a()) {
                f12.l.f68084a.getClass();
                if (f12.l.a.a().v2()) {
                    f12.l.a.a().Z2();
                    new gc0.r(mVar, new gc0.j(iVar));
                } else {
                    Toast.makeText(mVar, mVar.getString(R.string.devices_dashboard_msg_bluetooth_turned_off, mVar.getString(R.string.os_name_android)), 1).show();
                }
            }
            im2.l lVar = iVar.f76869b;
            if (lVar != null && lVar.f94334c.f105804a) {
                String string = mVar.getString(R.string.device_action_msg_removing_device);
                s2 s2Var = iVar.f76872e;
                if (s2Var != null) {
                    s2Var.showProgressOverlay(string);
                }
            }
        }
        this.f203507r.post(this.f203508t);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (!this.f203510w) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            requireActivity().registerReceiver(this.f203511x, intentFilter);
            this.f203510w = true;
        }
        oi2.a.a(this.f203509v);
        this.A.b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        oi2.a.b(this.f203509v);
        if (this.f203510w) {
            requireActivity().unregisterReceiver(this.f203511x);
            this.f203510w = false;
        }
        this.A.e();
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new c(), androidx.lifecycle.b0.b.RESUMED);
        this.f203494e = (ImageView) view2.findViewById(R.id.device_image);
        this.f203495f = (TextView) view2.findViewById(R.id.device_friendly_name);
        this.f203496g = (TextView) view2.findViewById(R.id.device_connection_status);
        View viewFindViewById = view2.findViewById(R.id.device_sync_now);
        this.f203500k = viewFindViewById;
        final int i14 = 0;
        viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: zb0.e0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f203475b;

            {
                this.f203475b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                String string;
                com.garmin.android.apps.connectmobile.q1 q1VarA;
                switch (i14) {
                    case 0:
                        g0 g0Var = this.f203475b;
                        if (g0Var.f203492c != null) {
                            g0Var.f203500k.setVisibility(8);
                            g0Var.f203501l.setVisibility(0);
                            sd2.f fVar = g0Var.f203492c.f76871d;
                            if (fVar != null) {
                                yr1.e.e(null, fVar.getUnitID(), "DeviceFullViewCardGutsFragment");
                            }
                        }
                        break;
                    default:
                        g0 g0Var2 = this.f203475b;
                        sd2.f fVar2 = g0Var2.f203492c.f76871d;
                        if (fVar2 != null && !hk0.p.m(fVar2)) {
                            String productNumber = g0Var2.f203492c.f76871d.getProductNumber();
                            boolean zN = u0.n(productNumber, u0.I1);
                            int i15 = R.string.devices_help_how_to_sync_title;
                            if (zN) {
                                string = c22.e1.a() ? g0Var2.getString(R.string.msg_vivomove_setup_how_to_pair) : g0Var2.getString(R.string.devices_vivomove_help_connect_device, g0Var2.getString(R.string.os_name_android));
                            } else if (u0.n(productNumber, u0.H1)) {
                                string = c22.e1.a() ? g0Var2.getString(R.string.device_settings_vivofit4_help_how_to_sync) : g0Var2.getString(R.string.device_settings_vivofit4_help_how_to_sync_bt_off, g0Var2.getString(R.string.os_name_android));
                            } else if (n0.j(productNumber)) {
                                string = g0Var2.getString(c22.e1.a() ? R.string.devices_vivofit_help_how_to_sync_vivofit : R.string.devices_vivofit_help_connect_device);
                            } else {
                                boolean zN2 = u0.n(productNumber, u0.P5, u0.H0);
                                i15 = R.string.devices_smart_scale_wifi_setup_incomplete;
                                if (zN2) {
                                    if (GCMSettingManager.z(g0Var2.f203492c.f76871d.getUnitID())) {
                                        string = g0Var2.getString(R.string.msg_setup_success_wifi_sync_auto);
                                        i15 = R.string.devices_smart_scale_wifi_setup_complete;
                                    } else {
                                        string = g0Var2.getString(R.string.devices_smart_scale_help_wifi_setup_incomplete_message);
                                    }
                                } else if (!u0.n(productNumber, u0.S5)) {
                                    string = (u0.q(productNumber) || u0.s(productNumber)) ? g0Var2.getString(R.string.msg_wear_device_chest_enable_bluetooth, g0Var2.f203492c.f76871d.getProductDisplayName(), g0Var2.getString(R.string.os_name_android)) : (u0.n(productNumber, u0.L5) || u0.n(productNumber, u0.R5) || u0.n(productNumber, u0.U5)) ? g0Var2.getString(R.string.devices_pedals_info_help, g0Var2.f203492c.f76871d.getProductDisplayName()) : g0Var2.getString(R.string.devices_generic_help_connect_device, g0Var2.f203492c.f76871d.getProductDisplayName(), g0Var2.getString(R.string.os_name_android));
                                    i15 = R.string.devices_help_how_to_connect_title;
                                } else if (GCMSettingManager.z(g0Var2.f203492c.f76871d.getUnitID())) {
                                    string = g0Var2.getString(R.string.msg_setup_success_wifi_sync_auto);
                                    i15 = R.string.devices_smart_scale_wifi_setup_complete;
                                } else {
                                    string = g0Var2.getString(R.string.msg_mercury_wifi_connection_needed);
                                }
                            }
                            boolean zN3 = u0.n(g0Var2.f203492c.f76871d.getProductNumber(), u0.H0, u0.P5, u0.S5);
                            boolean z14 = GCMSettingManager.z(g0Var2.f203492c.f76871d.getUnitID());
                            if (!zN3 || z14) {
                                com.garmin.android.apps.connectmobile.q1.f41066b.getClass();
                                q1VarA = com.garmin.android.apps.connectmobile.q1.b.a(i15, string, R.string.lbl_close, 0, null);
                            } else {
                                xw.b bVar = new xw.b(g0Var2, 7);
                                com.garmin.android.apps.connectmobile.q1.f41066b.getClass();
                                q1VarA = com.garmin.android.apps.connectmobile.q1.b.a(i15, string, R.string.lbl_settings, R.string.lbl_close, bVar);
                            }
                            q1VarA.v6(g0Var2.getChildFragmentManager(), "device.status.icon.dialog.msg");
                            break;
                        }
                        break;
                }
            }
        });
        this.f203501l = view2.findViewById(R.id.device_sync_now_progress);
        if (!this.f203503n) {
            this.f203500k.setVisibility(8);
            this.f203501l.setVisibility(8);
        }
        ImageView imageView = (ImageView) view2.findViewById(R.id.device_status_icon);
        this.f203499j = imageView;
        c22.c.a(imageView, requireContext(), R.dimen.icon_small, 1.0f, 1.8f);
        c22.c.a(this.f203501l, requireContext(), R.dimen.icon_small, 1.0f, 1.8f);
        final int i15 = 1;
        this.f203499j.setOnClickListener(new View.OnClickListener(this) { // from class: zb0.e0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f203475b;

            {
                this.f203475b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                String string;
                com.garmin.android.apps.connectmobile.q1 q1VarA;
                switch (i15) {
                    case 0:
                        g0 g0Var = this.f203475b;
                        if (g0Var.f203492c != null) {
                            g0Var.f203500k.setVisibility(8);
                            g0Var.f203501l.setVisibility(0);
                            sd2.f fVar = g0Var.f203492c.f76871d;
                            if (fVar != null) {
                                yr1.e.e(null, fVar.getUnitID(), "DeviceFullViewCardGutsFragment");
                            }
                        }
                        break;
                    default:
                        g0 g0Var2 = this.f203475b;
                        sd2.f fVar2 = g0Var2.f203492c.f76871d;
                        if (fVar2 != null && !hk0.p.m(fVar2)) {
                            String productNumber = g0Var2.f203492c.f76871d.getProductNumber();
                            boolean zN = u0.n(productNumber, u0.I1);
                            int i16 = R.string.devices_help_how_to_sync_title;
                            if (zN) {
                                string = c22.e1.a() ? g0Var2.getString(R.string.msg_vivomove_setup_how_to_pair) : g0Var2.getString(R.string.devices_vivomove_help_connect_device, g0Var2.getString(R.string.os_name_android));
                            } else if (u0.n(productNumber, u0.H1)) {
                                string = c22.e1.a() ? g0Var2.getString(R.string.device_settings_vivofit4_help_how_to_sync) : g0Var2.getString(R.string.device_settings_vivofit4_help_how_to_sync_bt_off, g0Var2.getString(R.string.os_name_android));
                            } else if (n0.j(productNumber)) {
                                string = g0Var2.getString(c22.e1.a() ? R.string.devices_vivofit_help_how_to_sync_vivofit : R.string.devices_vivofit_help_connect_device);
                            } else {
                                boolean zN2 = u0.n(productNumber, u0.P5, u0.H0);
                                i16 = R.string.devices_smart_scale_wifi_setup_incomplete;
                                if (zN2) {
                                    if (GCMSettingManager.z(g0Var2.f203492c.f76871d.getUnitID())) {
                                        string = g0Var2.getString(R.string.msg_setup_success_wifi_sync_auto);
                                        i16 = R.string.devices_smart_scale_wifi_setup_complete;
                                    } else {
                                        string = g0Var2.getString(R.string.devices_smart_scale_help_wifi_setup_incomplete_message);
                                    }
                                } else if (!u0.n(productNumber, u0.S5)) {
                                    string = (u0.q(productNumber) || u0.s(productNumber)) ? g0Var2.getString(R.string.msg_wear_device_chest_enable_bluetooth, g0Var2.f203492c.f76871d.getProductDisplayName(), g0Var2.getString(R.string.os_name_android)) : (u0.n(productNumber, u0.L5) || u0.n(productNumber, u0.R5) || u0.n(productNumber, u0.U5)) ? g0Var2.getString(R.string.devices_pedals_info_help, g0Var2.f203492c.f76871d.getProductDisplayName()) : g0Var2.getString(R.string.devices_generic_help_connect_device, g0Var2.f203492c.f76871d.getProductDisplayName(), g0Var2.getString(R.string.os_name_android));
                                    i16 = R.string.devices_help_how_to_connect_title;
                                } else if (GCMSettingManager.z(g0Var2.f203492c.f76871d.getUnitID())) {
                                    string = g0Var2.getString(R.string.msg_setup_success_wifi_sync_auto);
                                    i16 = R.string.devices_smart_scale_wifi_setup_complete;
                                } else {
                                    string = g0Var2.getString(R.string.msg_mercury_wifi_connection_needed);
                                }
                            }
                            boolean zN3 = u0.n(g0Var2.f203492c.f76871d.getProductNumber(), u0.H0, u0.P5, u0.S5);
                            boolean z14 = GCMSettingManager.z(g0Var2.f203492c.f76871d.getUnitID());
                            if (!zN3 || z14) {
                                com.garmin.android.apps.connectmobile.q1.f41066b.getClass();
                                q1VarA = com.garmin.android.apps.connectmobile.q1.b.a(i16, string, R.string.lbl_close, 0, null);
                            } else {
                                xw.b bVar = new xw.b(g0Var2, 7);
                                com.garmin.android.apps.connectmobile.q1.f41066b.getClass();
                                q1VarA = com.garmin.android.apps.connectmobile.q1.b.a(i16, string, R.string.lbl_settings, R.string.lbl_close, bVar);
                            }
                            q1VarA.v6(g0Var2.getChildFragmentManager(), "device.status.icon.dialog.msg");
                            break;
                        }
                        break;
                }
            }
        });
        this.f203502m = hb2.f.a(15, getActivity());
        this.f203497h = (TextView) view2.findViewById(R.id.header_bluetooth);
        this.f203498i = (TextView) view2.findViewById(R.id.header_bluetooth_action);
    }

    public final void v6() {
        y0 y0Var = this.f203493d;
        if (y0Var != null && y0Var.r2() != null && this.f203492c != null) {
            i0 i0Var = this.f203490a;
            long unitID = this.f203493d.r2().getUnitID();
            i0Var.getClass();
            ge1.b.T(v1.a(i0Var), null, null, new h0(i0Var, unitID, null), 3);
            return;
        }
        long j8 = this.f203505p;
        if (j8 != -1) {
            i0 i0Var2 = this.f203490a;
            i0Var2.getClass();
            ge1.b.T(v1.a(i0Var2), null, null, new h0(i0Var2, j8, null), 3);
        }
    }

    public final void w6(String str, String str2, sd2.f fVar, gj1.c cVar) {
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(getActivity());
        if (!TextUtils.isEmpty(str)) {
            aVar.setTitle(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            aVar.setMessage(str2);
        }
        aVar.setCancelable(false);
        aVar.setPositiveButton(R.string.lbl_remove, new yn2.a(this, 1, fVar, cVar)).setNegativeButton(R.string.lbl_cancel, new xk1.v(25));
        androidx.appcompat.app.e eVarCreate = aVar.create();
        eVarCreate.show();
        oe2.f.e(eVarCreate, 1.3f);
    }

    public final void y6() {
        if (this.f203497h == null) {
            return;
        }
        j22.b bVar = j22.b.f96736a;
        Context contextRequireContext = requireContext();
        bVar.getClass();
        boolean zB = j22.b.b(contextRequireContext);
        this.f203497h.setText(zB ? R.string.bluetooth_turned_off : R.string.permission_nearby_devices_disabled_message);
        this.f203498i.setText(zB ? R.string.lbl_turn_on_bluetooth : R.string.lbl_manage_permission);
        this.f203498i.setOnClickListener(new hc0.i(this, zB, 2));
        boolean z14 = (c22.e1.a() && zB) ? false : true;
        this.f203497h.setVisibility(z14 ? 0 : 8);
        this.f203498i.setVisibility(z14 ? 0 : 8);
    }
}
