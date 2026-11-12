package com.garmin.android.apps.connectmobile.settings.devices.wifi;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.proto.generated.WifiSetup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import p005kotlin.Metadata;
import wn1.i0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/b;", "Landroidx/fragment/app/Fragment;", "Landroid/widget/AdapterView$OnItemClickListener;", "<init>", "()V", "a", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0803b f43259w = new C0803b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f43260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ListView f43261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f43262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m f43263d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f43265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f43266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f43267h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f43268i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.settings.devices.wifi.d f43271l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f43272m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public di1.f f43273n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.settings.devices.wifi.c f43274o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f43275p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f43276q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f43277r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f43278t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f43279v;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f43264e = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Timer f43269j = new Timer();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f43270k = new AtomicBoolean(false);

    public interface a {
        void K1();

        void g7();
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/settings/devices/wifi/b$c", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m.b f43281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f43282c;

        public c(m.b bVar, k kVar) {
            this.f43281b = bVar;
            this.f43282c = kVar;
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            b bVar = b.this;
            if (b.u6(bVar)) {
                bVar.requireActivity().runOnUiThread(new di1.d(bVar, this.f43281b, cVar, this.f43282c, 1));
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
            eVar.getClass();
            obj.getClass();
            e eVar2 = (e) obj;
            i2.a aVar = i2.f36769a;
            aVar.getClass();
            i2.a.b(a2.SETTINGS, "DisplayWiFiNetworksFragment", "handleSecuredNetworkSelection.onResults: status=" + eVar2);
            boolean zB = eVar2.b();
            b bVar = b.this;
            if (zB) {
                GCMSettingManager.T(bVar.f43264e, true);
            }
            if (b.u6(bVar)) {
                bVar.requireActivity().runOnUiThread(new di1.e(bVar, this.f43281b, eVar2, this.f43282c, 1));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/devices/wifi/b$d", "Ljava/util/TimerTask;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends TimerTask {
        public d() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            bVar.f43270k.set(true);
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.SETTINGS;
            String str = "retrieveWiFiNetworks @ " + System.currentTimeMillis();
            aVar.getClass();
            i2.a.b(a2Var, "DisplayWiFiNetworksFragment", str);
            bVar.f43273n = new di1.f(bVar);
            i0 i0VarM = i0.M();
            long j8 = bVar.f43264e;
            di1.f fVar = bVar.f43273n;
            i0VarM.getClass();
            com.garmin.android.library.backgroundtaskmanagement.c.d(new di1.h(j8, i0VarM), fVar);
        }
    }

    public static final boolean u6(b bVar) {
        return (bVar.getActivity() == null || bVar.requireActivity().isFinishing()) ? false : true;
    }

    public static final String v6(b bVar, e eVar) {
        bVar.getClass();
        if (eVar == null) {
            return null;
        }
        int i14 = eVar.f43297c;
        if (i14 == e.f43293f) {
            return bVar.requireActivity().getString(R.string.wifi_error_invalid_credentials);
        }
        return i14 == e.f43294g ? bVar.requireActivity().getString(R.string.wifi_error_network_not_found, eVar.f43295a) : bVar.requireActivity().getString(R.string.txt_something_went_wrong_try_again);
    }

    public static final void w6(b bVar, String str) {
        bVar.getClass();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        new androidx.appcompat.app.e.a(bVar.requireContext()).setMessage(str).setPositiveButton(android.R.string.yes, new ai1.a(bVar, 23)).show();
    }

    public final void A6(m.b bVar) {
        if (bVar != null) {
            ListView listView = this.f43261b;
            listView.getClass();
            listView.setEnabled(false);
            ImageView imageView = bVar.f43370b;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            ProgressBar progressBar = bVar.f43371c;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
        }
    }

    public final void C6(boolean z14) {
        if (this.f43275p) {
            d dVar = new d();
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.SETTINGS;
            aVar.getClass();
            i2.a.b(a2Var, "DisplayWiFiNetworksFragment", "startRefreshTimer");
            if (this.f43269j == null) {
                this.f43269j = new Timer();
            }
            long j8 = z14 ? 0L : 1500L;
            Timer timer = this.f43269j;
            timer.getClass();
            timer.schedule(dVar, j8, 3000L);
        }
    }

    public final void E6() {
        if (this.f43269j != null) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.SETTINGS;
            aVar.getClass();
            i2.a.b(a2Var, "DisplayWiFiNetworksFragment", "stopRefreshTimer");
            this.f43270k.set(false);
            Timer timer = this.f43269j;
            timer.getClass();
            timer.cancel();
            Timer timer2 = this.f43269j;
            timer2.getClass();
            timer2.purge();
            this.f43269j = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.SETTINGS;
        aVar.getClass();
        i2.a.b(a2Var, "DisplayWiFiNetworksFragment", ".onAttach()");
        try {
            this.f43262c = (a) context;
        } catch (ClassCastException unused) {
            wr.g.u(context, " must implement FragmentListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            arguments.getClass();
            this.f43264e = arguments.getLong("GCM_deviceUnitID");
            this.f43265f = arguments.getString("GCM_deviceProductNbr");
            this.f43266g = arguments.getParcelableArrayList("KEY_INITIAL_NETWORKS");
            this.f43267h = arguments.getParcelableArrayList("KEY_INITIAL_VERIFIED_NETWORKS");
            this.f43275p = arguments.getBoolean("VERIFY_WIFI_NETWORK_AFTER_MODIFICATION");
            this.f43279v = arguments.getString("KEY_MAX_WIFI_NETWORKS");
            this.f43276q = arguments.getInt("KEY_START_UP_MODE", 102);
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            m mVar = new m(contextRequireContext, android.R.layout.simple_list_item_2, this.f43276q);
            this.f43263d = mVar;
            ArrayList arrayList = this.f43266g;
            ArrayList arrayList2 = this.f43267h;
            if (arrayList2 == null || arrayList2.size() <= 0) {
                mVar.f43368d.clear();
            } else {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    mVar.d((e) it.next());
                }
            }
            mVar.a(arrayList);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TextView textView;
        layoutInflater.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.SETTINGS;
        aVar.getClass();
        i2.a.b(a2Var, "DisplayWiFiNetworksFragment", ".onCreateView()");
        this.f43260a = layoutInflater.inflate(R.layout.gcm3_wifi_list_with_empty_text_layout, (ViewGroup) null);
        String string = getString(R.string.index_smart_scale_help_url);
        string.getClass();
        String string2 = getString(R.string.wifi_network_discovery_explanation_a, string);
        string2.getClass();
        View view2 = this.f43260a;
        TextView textView2 = view2 != null ? (TextView) view2.findViewById(R.id.wifi_network_discovery_explanation) : null;
        this.f43268i = textView2;
        if (textView2 != null) {
            textView2.setText(string2);
        }
        View view3 = this.f43260a;
        ListView listView = view3 != null ? (ListView) view3.findViewById(R.id.network_list) : null;
        this.f43261b = listView;
        if (listView != null) {
            listView.setAdapter((ListAdapter) this.f43263d);
        }
        ListView listView2 = this.f43261b;
        if (listView2 != null) {
            listView2.setOnItemClickListener(this);
        }
        View view4 = this.f43260a;
        TextView textView3 = view4 != null ? (TextView) view4.findViewById(R.id.list_view_empty_text) : null;
        if (textView3 != null) {
            textView3.setText(getString(R.string.wifi_no_network_available));
        }
        View view5 = this.f43260a;
        this.f43278t = view5 != null ? (TextView) view5.findViewById(R.id.no_scanned_wifi_networks_label) : null;
        m mVar = this.f43263d;
        mVar.getClass();
        if (mVar.getCount() > 2 || this.f43276q != 102 || this.f43275p) {
            TextView textView4 = this.f43278t;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
        } else {
            TextView textView5 = this.f43278t;
            if (textView5 != null) {
                textView5.setVisibility(0);
            }
        }
        if (!this.f43275p && (textView = this.f43268i) != null) {
            textView.setVisibility(8);
        }
        androidx.fragment.app.m activity = getActivity();
        int iE = fb2.g.e(14, activity);
        TextView textView6 = new TextView(activity);
        textView6.setLayoutParams(new AbsListView.LayoutParams(-2, -2));
        textView6.setPadding(iE, iE, iE, iE);
        textView6.setText("");
        textView6.setTextColor(a7.b.getColor(activity, R.color.gcm_text_secondary));
        textView6.setTextSize(2, 14.0f);
        this.f43277r = textView6;
        String str = this.f43279v;
        if (!TextUtils.isEmpty(str)) {
            TextView textView7 = this.f43277r;
            textView7.getClass();
            textView7.setTextColor(a7.b.getColor(requireContext(), R.color.gcm_text_secondary));
            TextView textView8 = this.f43277r;
            textView8.getClass();
            textView8.setText(str);
            TextView textView9 = this.f43277r;
            textView9.getClass();
            textView9.setClickable(false);
            ListView listView3 = this.f43261b;
            listView3.getClass();
            listView3.addFooterView(this.f43277r);
        }
        return this.f43260a;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f43262c = null;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view2, int i14, long j8) {
        adapterView.getClass();
        view2.getClass();
        m mVar = this.f43263d;
        mVar.getClass();
        if (i14 <= mVar.getCount()) {
            Object tag = view2.getTag();
            tag.getClass();
            m.b bVar = (m.b) tag;
            i2.a aVar = i2.f36769a;
            aVar.getClass();
            i2.a.b(a2.SETTINGS, "DisplayWiFiNetworksFragment", ".onItemClick(): parent=" + adapterView + ", view=" + view2 + ", position=" + i14 + ", id=" + j8 + ", holder=" + bVar);
            E6();
            m mVar2 = this.f43263d;
            mVar2.getClass();
            k item = mVar2.getItem(i14);
            item.getClass();
            int i15 = item.f43327h;
            if (i15 == 3) {
                return;
            }
            if (i15 == 2) {
                l.a aVar2 = l.f43349p;
                String str = this.f43265f;
                ag0.d dVar = new ag0.d(16, this, bVar);
                aVar2.getClass();
                l.a.a(null, null, null, str, true, null, dVar).show(requireActivity().getSupportFragmentManager(), (String) null);
                return;
            }
            if (this.f43276q == 100) {
                this.f43262c.getClass();
                return;
            }
            if (item.f43321b != k.c.OPEN) {
                y6(item, null, bVar);
                return;
            }
            GCMSettingManager.T(this.f43264e, false);
            A6(bVar);
            if (!this.f43275p) {
                z6(bVar);
                this.f43262c.getClass();
                return;
            }
            this.f43271l = new com.garmin.android.apps.connectmobile.settings.devices.wifi.d(this, bVar, item);
            i0 i0VarM = i0.M();
            long j14 = this.f43264e;
            String str2 = item.f43320a;
            str2.getClass();
            com.garmin.android.apps.connectmobile.settings.devices.wifi.d dVar2 = this.f43271l;
            i0VarM.getClass();
            if (TextUtils.isEmpty(str2)) {
                vb.h.s("Empty SSID");
            } else {
                com.garmin.android.library.backgroundtaskmanagement.c.d(new j(j14, str2, i0VarM), dVar2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C6(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        E6();
    }

    public final void y6(k kVar, String str, m.b bVar) {
        l.a aVar = l.f43349p;
        kVar.getClass();
        String str2 = kVar.f43320a;
        k.b bVar2 = k.f43319i;
        k.c cVar = kVar.f43321b;
        bVar2.getClass();
        WifiSetup.SecurityType securityTypeB = k.b.b(cVar);
        String str3 = this.f43265f;
        bi2.k kVar2 = new bi2.k(this, 8, bVar, kVar);
        aVar.getClass();
        l.a.a(str2, securityTypeB, str, str3, false, null, kVar2).show(requireActivity().getSupportFragmentManager(), (String) null);
    }

    public final void z6(m.b bVar) {
        if (bVar != null) {
            ProgressBar progressBar = bVar.f43371c;
            if (progressBar != null) {
                progressBar.setVisibility(4);
            }
            ImageView imageView = bVar.f43370b;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            ListView listView = this.f43261b;
            listView.getClass();
            listView.setEnabled(true);
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.devices.wifi.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/b$b;", "", "<init>", "()V", "", "STARTUP_MODE_STORED_NETWORKS", "I", "STARTUP_MODE_SCANNED_NETWORKS", "", "TAG", "Ljava/lang/String;", "FRAGMENT_NAME", "KEY_INITIAL_NETWORKS", "KEY_INITIAL_VERIFIED_NETWORKS", "", "REFRESH_PERIOD_MILLISECONDS", "J", "VERIFY_WIFI_NETWORK_AFTER_MODIFICATION", "KEY_START_UP_MODE", "KEY_MAX_WIFI_NETWORKS", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0803b {
        public /* synthetic */ C0803b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0803b() {
        }
    }
}
