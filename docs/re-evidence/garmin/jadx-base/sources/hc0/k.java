package hc0;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.view.s;
import androidx.lifecycle.b0;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import c22.e1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.c3;
import com.garmin.android.apps.connectmobile.connectiq.m0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.o0;
import com.garmin.android.apps.connectmobile.s2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import g2.m1;
import gc0.t;
import java.util.ArrayList;
import java.util.List;
import o13.p;
import o53.c2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.jvm.internal.s0;
import yr1.q;
import yr1.r;
import z10.l0;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
public class k extends o0 implements hc0.b.c, AbsListView.OnScrollListener, r {
    public TextView A;
    public c3 C;
    public ListView D;
    public SwipeRefreshLayout E;
    public View F;
    public s2 I;
    public final j22.e I0;
    public gc0.l J0;
    public boolean K0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public q f83254w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f83256y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TextView f83257z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public hc0.b f83255x = null;
    public TextView B = null;
    public boolean P = false;
    public final a T = new a();
    public final b X = new b();
    public final m0 Y = new m0(this, 2);
    public final ey.a Z = new ey.a(this, 1);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final g f83253k0 = new g(this, 0);
    public final f.c<Intent> H0 = registerForActivityResult(new g.h(), new a61.i(this, 24));

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
            if (12 == intExtra || 10 == intExtra) {
                k.this.d7();
            }
        }
    }

    public class b extends xf0.b {
        public b() {
        }

        @Override // xf0.b
        public final void deviceConnected(pi2.g gVar) {
            i2.a(a2.DEVICES, "DevicesDashboardFragment", "DeviceConnectedEvent received");
            k kVar = k.this;
            gc0.l lVar = kVar.J0;
            if (lVar == null || lVar.B4()) {
                return;
            }
            kVar.J0.C4();
        }

        @Override // xf0.b
        public final void deviceDisconnected(pi2.h hVar) {
            i2.a(a2.DEVICES, "DevicesDashboardFragment", "DeviceDisconnectedEvent received");
            k kVar = k.this;
            gc0.l lVar = kVar.J0;
            if (lVar == null || lVar.B4()) {
                return;
            }
            kVar.J0.C4();
        }
    }

    public class c implements gc0.r.a {
        public c() {
        }

        @Override // gc0.r.a
        public final void a() {
            k kVar = k.this;
            kVar.getClass();
            kVar.H0.a(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), null);
        }
    }

    public class d implements s {
        public d() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            menuInflater.inflate(R.menu.dashboard_devices, menu);
        }

        @Override // androidx.core.view.s
        public final void Z4(Menu menu) {
            MenuItem menuItemFindItem;
            k kVar = k.this;
            if (kVar.getActivity() == null || kVar.getActivity().isFinishing() || (menuItemFindItem = menu.findItem(R.id.menu_item_sync)) == null) {
                return;
            }
            kg1.a.f104701a.getClass();
            menuItemFindItem.setVisible(kg1.a.C2003a.a().T());
            menuItemFindItem.getIcon().mutate().setColorFilter(a7.b.getColor(kVar.requireContext(), R.color.gds_data_viz_green_primary), PorterDuff.Mode.SRC_ATOP);
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            if (menuItem.getItemId() != R.id.menu_item_sync) {
                return false;
            }
            yr1.e.b("DevicesDashboardFragment");
            return true;
        }
    }

    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f83262a;

        static {
            int[] iArr = new int[gc0.b.c.values().length];
            f83262a = iArr;
            try {
                iArr[gc0.b.c.CANCEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83262a[gc0.b.c.REMOVE_DEVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f83262a[gc0.b.c.SYNC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f83262a[gc0.b.c.UPDATE_CONNECTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public k() {
        final int i14 = 0;
        e23.a aVar = new e23.a(this) { // from class: hc0.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f83247b;

            {
                this.f83247b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return this.f83247b;
                    default:
                        k kVar = this.f83247b;
                        kVar.d7();
                        b bVar = kVar.f83255x;
                        if (bVar != null) {
                            bVar.notifyDataSetChanged();
                        }
                        ed0.a.m("DevicesDashboardFragment", null);
                        return null;
                }
            }
        };
        final int i15 = 1;
        e23.a aVar2 = new e23.a(this) { // from class: hc0.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f83247b;

            {
                this.f83247b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return this.f83247b;
                    default:
                        k kVar = this.f83247b;
                        kVar.d7();
                        b bVar = kVar.f83255x;
                        if (bVar != null) {
                            bVar.notifyDataSetChanged();
                        }
                        ed0.a.m("DevicesDashboardFragment", null);
                        return null;
                }
            }
        };
        j22.e.a aVar3 = j22.e.f96744g;
        aVar3.getClass();
        this.I0 = j22.e.a.b(aVar3, "DevicesDashboardFragment", aVar, aVar2);
    }

    public static boolean V6(sd2.f fVar) {
        if (fVar == null) {
            return false;
        }
        kg1.a.f104701a.getClass();
        kg1.a.C2003a.a().getClass();
        return fVar.isPaired();
    }

    public static void X6(String str) {
        i2.a(a2.DEVICES, "DevicesDashboardFragment", str);
    }

    public static k Y6(boolean z14) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("GCM_is_from_day", z14);
        k kVar = new k();
        kVar.setArguments(bundle);
        return kVar;
    }

    @Override // yr1.r
    public final void B1(al2.c cVar) {
        sd2.f fVar;
        if (this.J0.B4()) {
            X6("onSyncStarted() but user devices task is running, so throwing action away -> [" + cVar + "]");
            return;
        }
        hc0.b bVar = this.f83255x;
        if (bVar != null) {
            long f92746j = cVar.f3775a.getF92746j();
            ArrayList<gc0.e> arrayList = bVar.f83208a;
            if (arrayList != null && !arrayList.isEmpty()) {
                for (gc0.e eVar : arrayList) {
                    if (eVar != null && (fVar = eVar.f76845a) != null && fVar.getUnitID() == f92746j) {
                        eVar.f76849e = 0;
                        eVar.a(gc0.f.STARTED);
                        bVar.notifyDataSetChanged();
                        break;
                    }
                }
            }
            X6("onSyncStarted() sent to UI handler for processing");
        }
    }

    @Override // yr1.r
    public final void F1(al2.a aVar, boolean z14) {
        sd2.f fVar;
        if (this.J0.B4()) {
            X6("onSyncProgress() but user devices task is running, so throwing action away -> [" + aVar + "]");
            return;
        }
        hc0.b bVar = this.f83255x;
        if (bVar != null) {
            long f92746j = aVar.f3759a.getF92746j();
            float fA = aVar.a();
            ArrayList<gc0.e> arrayList = bVar.f83208a;
            if (arrayList != null && !arrayList.isEmpty()) {
                for (gc0.e eVar : arrayList) {
                    if (eVar != null && (fVar = eVar.f76845a) != null && fVar.getUnitID() == f92746j) {
                        eVar.f76849e = (int) fA;
                        eVar.a(z14 ? gc0.f.IN_PROGRESS_SUB_STATUS_SENDING_SOFTWARE_UPDATE_TO_DEVICE : gc0.f.IN_PROGRESS_NO_SUB_STATUS);
                        bVar.notifyDataSetChanged();
                        break;
                    }
                }
            }
            X6("onSyncProgress() sent to UI handler for processing");
        }
    }

    @Override // com.garmin.android.apps.connectmobile.o0
    public final void I6() {
        X6("refreshUserActiveDevicesFromGC");
        gc0.l lVar = this.J0;
        c2 c2Var = lVar.f76880d;
        if (c2Var != null) {
            c2Var.c(null);
        }
        lVar.f76880d = ed0.a.m("DevicesDashboardViewModel", new gc0.n(lVar));
        S6();
        hc0.b bVar = this.f83255x;
        if (bVar != null) {
            bVar.f83208a.clear();
            bVar.f83209b.clear();
            bVar.f83210c.clear();
            bVar.notifyDataSetChanged();
        }
    }

    public final void T6(sd2.f fVar, gj1.c cVar) {
        String displayName = !TextUtils.isEmpty(fVar.getDisplayName()) ? fVar.getDisplayName() : fVar.getProductDisplayName();
        gc0.l lVar = this.J0;
        lVar.getClass();
        y0 y0Var = new y0();
        long unitID = fVar.getUnitID();
        lc0.k kVar = (lc0.k) KoinJavaComponent.get$default(lc0.k.class, null, null, 6, null);
        m1 m1Var = new m1(5, lVar, y0Var);
        gc0.k kVar2 = new gc0.k(y0Var);
        int i14 = lc0.k.f111948d;
        kVar.a(unitID, true, m1Var, kVar2);
        y0Var.f(this, new hc0.e(this, displayName, cVar, fVar, 0));
    }

    public final boolean U6() {
        return (getActivity() == null || getActivity().isFinishing()) ? false : true;
    }

    public final void c7(String str, String str2, sd2.f fVar, gj1.c cVar) {
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(requireActivity());
        if (!TextUtils.isEmpty(str)) {
            aVar.setTitle(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            aVar.setMessage(str2);
        }
        aVar.setCancelable(false);
        aVar.setPositiveButton(R.string.lbl_remove, new bi2.k(this, 14, cVar, fVar)).setNegativeButton(R.string.lbl_cancel, new f20.i(16));
        androidx.appcompat.app.e eVarCreate = aVar.create();
        eVarCreate.show();
        oe2.f.e(eVarCreate, 1.3f);
    }

    public final void d7() {
        if (this.f83257z == null) {
            return;
        }
        j22.b bVar = j22.b.f96736a;
        Context contextRequireContext = requireContext();
        bVar.getClass();
        boolean zB = j22.b.b(contextRequireContext);
        this.f83257z.setText(zB ? R.string.bluetooth_turned_off : R.string.permission_nearby_devices_disabled_message);
        this.A.setText(zB ? R.string.lbl_turn_on_bluetooth : R.string.lbl_manage_permission);
        this.A.setOnClickListener(new i(this, zB, 0));
        boolean z14 = (e1.a() && zB) ? false : true;
        this.f83257z.setVisibility(z14 ? 0 : 8);
        this.A.setVisibility(z14 ? 0 : 8);
    }

    @Override // yr1.r
    public final void g5(al2.c cVar, boolean z14) {
        if (this.J0.B4()) {
            X6("onSyncFinished() but user devices task is running, so throwing action away -> [" + cVar + "]");
            return;
        }
        this.J0.C4();
        X6("onSyncFinished from device [" + cVar.f3775a + "], called refreshAllRegisteredDevices() -> [" + cVar + "]");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i14, int i15, Intent intent) {
        sd2.f fVar;
        if (i14 == 1) {
            d7();
        }
        getActivity();
        if (i15 != -1 || intent == null || (fVar = (sd2.f) intent.getParcelableExtra("device_removed")) == null) {
            return;
        }
        if (TextUtils.isEmpty(fVar.getDisplayName())) {
            fVar.getProductNumber();
        } else {
            fVar.getDisplayName();
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(fVar.d0())) {
            arrayList.add(fVar.d0());
        }
        if (!TextUtils.isEmpty(fVar.Q())) {
            arrayList.add(fVar.Q());
        }
        this.J0.A4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"LongLogTag"})
    public final void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.C = (c3) context;
            this.I = (s2) context;
        } catch (ClassCastException unused) {
            i2.f(a2.DEVICES, "DevicesDashboardFragment", "Activity must implement ProgressOverlayListener and StatusBannerListener");
        }
    }

    @Override // com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.K0 = arguments.getBoolean("GCM_is_from_day", false);
        }
        this.f83254w = new q("DevicesDashboardFragment", this);
    }

    @Override // com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.n0, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.devices_dashboard_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        X6("onPause");
        if (this.P && getActivity() != null) {
            getActivity().unregisterReceiver(this.T);
            this.P = false;
        }
        oi2.a.b(this.X);
        this.f83254w.e();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        X6("onResume");
        if (!this.P && getActivity() != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            getActivity().registerReceiver(this.T, intentFilter);
            this.P = true;
        }
        oi2.a.a(this.X);
        this.f83254w.b();
        this.J0.A4();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i14, int i15, int i16) {
        ListView listView = this.D;
        boolean z14 = false;
        int top = (listView == null || listView.getChildCount() == 0) ? 0 : this.D.getChildAt(0).getTop();
        SwipeRefreshLayout swipeRefreshLayout = this.E;
        if (i14 == 0 && top >= 0) {
            z14 = true;
        }
        swipeRefreshLayout.setEnabled(z14);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i14) {
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        X6("refreshUserActiveDevicesFromGC");
        gc0.l lVar = this.J0;
        c2 c2Var = lVar.f76880d;
        if (c2Var != null) {
            c2Var.c(null);
        }
        lVar.f76880d = ed0.a.m("DevicesDashboardViewModel", new gc0.n(lVar));
        S6();
        hc0.b bVar = this.f83255x;
        if (bVar != null) {
            bVar.f83208a.clear();
            bVar.f83209b.clear();
            bVar.f83210c.clear();
            bVar.notifyDataSetChanged();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.n0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        c3 c3Var;
        ListView listView;
        super.onViewCreated(view2, bundle);
        X6("onViewCreated");
        this.J0 = (gc0.l) new x1(this).b(s0.f105811a.b(gc0.l.class));
        g22.e.k(this, new d(), b0.b.RESUMED);
        this.E = (SwipeRefreshLayout) view2.findViewById(R.id.root_view);
        this.B = (TextView) view2.findViewById(android.R.id.empty);
        View viewFindViewById = view2.findViewById(R.id.device_trouble_connecting);
        this.F = viewFindViewById;
        g gVar = this.f83253k0;
        viewFindViewById.setOnClickListener(gVar);
        view2.findViewById(R.id.device_list_add_btn).setOnClickListener(new g(this, 1));
        this.f83256y = (TextView) view2.findViewById(R.id.header_no_devices_paired);
        this.f83257z = (TextView) view2.findViewById(R.id.header_bluetooth);
        this.A = (TextView) view2.findViewById(R.id.header_bluetooth_action);
        if (this.f83255x == null) {
            this.f83255x = new hc0.b(getActivity(), this);
            X6("onViewCreated: created 'mListAdapter'");
        } else {
            X6("onViewCreated: using existing 'mListAdapter'");
        }
        w6(this.f83255x);
        u6();
        ListView listView2 = this.f7311e;
        this.D = listView2;
        listView2.setOnScrollListener(this);
        this.D.setOnItemClickListener(this.Z);
        this.D.setOnItemLongClickListener(this.Y);
        this.D.setDivider(null);
        this.D.setSelector(R.drawable.gcm_transparent);
        if (U6() && (listView = this.D) != null && listView.getFooterViewsCount() == 0) {
            GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) LayoutInflater.from(getActivity()).inflate(R.layout.gcm3_trouble_connection_row, (ViewGroup) this.D, false);
            gCMComplexOneLineButton.e();
            gCMComplexOneLineButton.setPadding(0, getResources().getDimensionPixelSize(R.dimen.spacing_xlarge), 0, 0);
            gCMComplexOneLineButton.setOnClickListener(gVar);
            this.D.addFooterView(gCMComplexOneLineButton);
        }
        if (this.K0 && (c3Var = this.C) != null) {
            c3Var.checkConsentBannerStatus(l0.DEVICE_SETTINGS, R.string.msg_more_feature_available_upload);
        }
        gc0.l lVar = this.J0;
        final int i14 = 0;
        z0<? super t> z0Var = new z0(this) { // from class: hc0.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f83252b;

            {
                this.f83252b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                boolean z14;
                gc0.f fVar;
                switch (i14) {
                    case 0:
                        t tVar = (t) obj;
                        k kVar = this.f83252b;
                        if (kVar.f83255x != null) {
                            k.X6("+++ onLoadFinished() called! +++");
                            List<? extends gc0.e> list = tVar.f76923a;
                            boolean z15 = tVar.f76924b;
                            if (list != null) {
                                int size = kVar.f83255x.f83208a.size();
                                for (gc0.e eVar : list) {
                                    for (int i15 = 0; i15 < size; i15++) {
                                        gc0.e eVar2 = (gc0.e) kVar.f83255x.f83208a.get(i15);
                                        if (eVar2 != null && eVar2.f76845a.getUnitID() == eVar.f76845a.getUnitID()) {
                                            if (eVar2.f76847c != gc0.f.IN_PROGRESS_SUB_STATUS_SENDING_SOFTWARE_UPDATE_TO_DEVICE || ((fVar = eVar.f76847c) != gc0.f.FINISHED_FAILURE && fVar != gc0.f.FINISHED_SUCCESS)) {
                                            }
                                            eVar.a(gc0.f.NONE);
                                        }
                                    }
                                }
                            }
                            b bVar = kVar.f83255x;
                            bVar.f83208a.clear();
                            bVar.f83209b.clear();
                            bVar.f83210c.clear();
                            bVar.notifyDataSetChanged();
                            kVar.d7();
                            if (list != null) {
                                boolean z16 = false;
                                z14 = false;
                                boolean z17 = false;
                                for (gc0.e eVar3 : list) {
                                    sd2.f fVar2 = eVar3.f76845a;
                                    if (k.V6(fVar2)) {
                                        z14 = true;
                                    }
                                    if (fVar2.O()) {
                                        b bVar2 = kVar.f83255x;
                                        bVar2.f83208a.add(eVar3);
                                        bVar2.notifyDataSetChanged();
                                    } else if (k.V6(fVar2)) {
                                        b bVar3 = kVar.f83255x;
                                        bVar3.f83208a.add(eVar3);
                                        bVar3.notifyDataSetChanged();
                                    } else if (!u0.n(fVar2.getProductNumber(), u0.H0, u0.P5, u0.S5) || eVar3.f76852h) {
                                        if (!z17) {
                                            if (z15) {
                                                b bVar4 = kVar.f83255x;
                                                ArrayList arrayList = bVar4.f83208a;
                                                arrayList.add(null);
                                                bVar4.f83210c.add(Integer.valueOf(arrayList.size() - 1));
                                                bVar4.notifyDataSetChanged();
                                                z16 = true;
                                            }
                                            b bVar5 = kVar.f83255x;
                                            ArrayList arrayList2 = bVar5.f83208a;
                                            arrayList2.add(null);
                                            bVar5.f83209b.add(Integer.valueOf(arrayList2.size() - 1));
                                            bVar5.notifyDataSetChanged();
                                            z17 = true;
                                        }
                                        b bVar6 = kVar.f83255x;
                                        bVar6.f83208a.add(eVar3);
                                        bVar6.notifyDataSetChanged();
                                    } else {
                                        b bVar7 = kVar.f83255x;
                                        bVar7.f83208a.add(eVar3);
                                        bVar7.notifyDataSetChanged();
                                    }
                                }
                                if (z15 && !z16) {
                                    b bVar8 = kVar.f83255x;
                                    ArrayList arrayList3 = bVar8.f83208a;
                                    arrayList3.add(null);
                                    bVar8.f83210c.add(Integer.valueOf(arrayList3.size() - 1));
                                    bVar8.notifyDataSetChanged();
                                }
                            } else {
                                z14 = false;
                            }
                            TextView textView = kVar.f83256y;
                            if (textView != null) {
                                textView.setVisibility(z14 ? 8 : 0);
                            }
                            kVar.F6();
                            kVar.B.setText("");
                            kVar.F.setVisibility(kVar.f83255x.f83208a.size() != 0 ? 8 : 0);
                            break;
                        }
                        break;
                    default:
                        p pVar = (p) obj;
                        if (pVar != null) {
                            String str = (String) pVar.f128594a;
                            String[] strArr = (String[]) ((List) pVar.f128595b).toArray(new String[0]);
                            k kVar2 = this.f83252b;
                            androidx.fragment.app.m activity = kVar2.getActivity();
                            strArr.getClass();
                            zb0.k.d(activity, str, strArr, new z41.j(26));
                            kVar2.J0.f76886j.m(null);
                        }
                        break;
                }
            }
        };
        lVar.getClass();
        lVar.f76885i.f(this, z0Var);
        final int i15 = 1;
        ((androidx.lifecycle.s0) this.J0.f76887k.getValue()).f(getViewLifecycleOwner(), new z0(this) { // from class: hc0.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f83252b;

            {
                this.f83252b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                boolean z14;
                gc0.f fVar;
                switch (i15) {
                    case 0:
                        t tVar = (t) obj;
                        k kVar = this.f83252b;
                        if (kVar.f83255x != null) {
                            k.X6("+++ onLoadFinished() called! +++");
                            List<? extends gc0.e> list = tVar.f76923a;
                            boolean z15 = tVar.f76924b;
                            if (list != null) {
                                int size = kVar.f83255x.f83208a.size();
                                for (gc0.e eVar : list) {
                                    for (int i16 = 0; i16 < size; i16++) {
                                        gc0.e eVar2 = (gc0.e) kVar.f83255x.f83208a.get(i16);
                                        if (eVar2 != null && eVar2.f76845a.getUnitID() == eVar.f76845a.getUnitID()) {
                                            if (eVar2.f76847c != gc0.f.IN_PROGRESS_SUB_STATUS_SENDING_SOFTWARE_UPDATE_TO_DEVICE || ((fVar = eVar.f76847c) != gc0.f.FINISHED_FAILURE && fVar != gc0.f.FINISHED_SUCCESS)) {
                                            }
                                            eVar.a(gc0.f.NONE);
                                        }
                                    }
                                }
                            }
                            b bVar = kVar.f83255x;
                            bVar.f83208a.clear();
                            bVar.f83209b.clear();
                            bVar.f83210c.clear();
                            bVar.notifyDataSetChanged();
                            kVar.d7();
                            if (list != null) {
                                boolean z16 = false;
                                z14 = false;
                                boolean z17 = false;
                                for (gc0.e eVar3 : list) {
                                    sd2.f fVar2 = eVar3.f76845a;
                                    if (k.V6(fVar2)) {
                                        z14 = true;
                                    }
                                    if (fVar2.O()) {
                                        b bVar2 = kVar.f83255x;
                                        bVar2.f83208a.add(eVar3);
                                        bVar2.notifyDataSetChanged();
                                    } else if (k.V6(fVar2)) {
                                        b bVar3 = kVar.f83255x;
                                        bVar3.f83208a.add(eVar3);
                                        bVar3.notifyDataSetChanged();
                                    } else if (!u0.n(fVar2.getProductNumber(), u0.H0, u0.P5, u0.S5) || eVar3.f76852h) {
                                        if (!z17) {
                                            if (z15) {
                                                b bVar4 = kVar.f83255x;
                                                ArrayList arrayList = bVar4.f83208a;
                                                arrayList.add(null);
                                                bVar4.f83210c.add(Integer.valueOf(arrayList.size() - 1));
                                                bVar4.notifyDataSetChanged();
                                                z16 = true;
                                            }
                                            b bVar5 = kVar.f83255x;
                                            ArrayList arrayList2 = bVar5.f83208a;
                                            arrayList2.add(null);
                                            bVar5.f83209b.add(Integer.valueOf(arrayList2.size() - 1));
                                            bVar5.notifyDataSetChanged();
                                            z17 = true;
                                        }
                                        b bVar6 = kVar.f83255x;
                                        bVar6.f83208a.add(eVar3);
                                        bVar6.notifyDataSetChanged();
                                    } else {
                                        b bVar7 = kVar.f83255x;
                                        bVar7.f83208a.add(eVar3);
                                        bVar7.notifyDataSetChanged();
                                    }
                                }
                                if (z15 && !z16) {
                                    b bVar8 = kVar.f83255x;
                                    ArrayList arrayList3 = bVar8.f83208a;
                                    arrayList3.add(null);
                                    bVar8.f83210c.add(Integer.valueOf(arrayList3.size() - 1));
                                    bVar8.notifyDataSetChanged();
                                }
                            } else {
                                z14 = false;
                            }
                            TextView textView = kVar.f83256y;
                            if (textView != null) {
                                textView.setVisibility(z14 ? 8 : 0);
                            }
                            kVar.F6();
                            kVar.B.setText("");
                            kVar.F.setVisibility(kVar.f83255x.f83208a.size() != 0 ? 8 : 0);
                            break;
                        }
                        break;
                    default:
                        p pVar = (p) obj;
                        if (pVar != null) {
                            String str = (String) pVar.f128594a;
                            String[] strArr = (String[]) ((List) pVar.f128595b).toArray(new String[0]);
                            k kVar2 = this.f83252b;
                            androidx.fragment.app.m activity = kVar2.getActivity();
                            strArr.getClass();
                            zb0.k.d(activity, str, strArr, new z41.j(26));
                            kVar2.J0.f76886j.m(null);
                        }
                        break;
                }
            }
        });
    }
}
