package com.garmin.android.apps.connectmobile.connectiq;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.v1;
import androidx.lifecycle.x1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.proto.generated.GDIConnectIQInstalledApps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes7.dex */
public class n0 extends androidx.fragment.app.n0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ListView f31907j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f31908k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f31909l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f31910m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public l0 f31911n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ActionMode f31912o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f31913p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f31914q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public y10.k0 f31915r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a f31916t = new a();

    public class a implements ActionMode.Callback {
        public a() {
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            if (menuItem.getItemId() != R.id.menu_item_uninstall_app) {
                return false;
            }
            n0 n0Var = n0.this;
            n0Var.A6();
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            SparseBooleanArray checkedItemPositions = n0Var.f31907j.getCheckedItemPositions();
            for (int i14 = 0; i14 < checkedItemPositions.size(); i14++) {
                int iKeyAt = checkedItemPositions.keyAt(i14);
                if (checkedItemPositions.get(iKeyAt)) {
                    linkedBlockingQueue.add((o10.b) n0Var.f31911n.getItem(iKeyAt));
                }
            }
            if (linkedBlockingQueue.isEmpty()) {
                n0Var.z6();
            } else {
                n0Var.C6(linkedBlockingQueue);
            }
            actionMode.finish();
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            actionMode.getMenuInflater().inflate(R.menu.connectiq_manage_storage, menu);
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
            n0 n0Var = n0.this;
            SparseBooleanArray checkedItemPositions = n0Var.f31907j.getCheckedItemPositions();
            for (int i14 = 0; i14 < checkedItemPositions.size(); i14++) {
                int iKeyAt = checkedItemPositions.keyAt(i14);
                if (checkedItemPositions.get(iKeyAt)) {
                    n0Var.f31907j.setItemChecked(iKeyAt, false);
                }
            }
            n0Var.f31907j.post(new cd0.h0(this, 9));
            n0Var.f31912o = null;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    public class b implements b0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o10.b f31918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ BlockingQueue f31919b;

        public b(o10.b bVar, BlockingQueue blockingQueue) {
            this.f31918a = bVar;
            this.f31919b = blockingQueue;
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.b0.e
        public final void a() {
            i2.d("ConnectIQSM", "App deleted successfully [" + this.f31918a.toString() + "]");
            BlockingQueue<o10.b> blockingQueue = this.f31919b;
            boolean zIsEmpty = blockingQueue.isEmpty();
            n0 n0Var = n0.this;
            if (!zIsEmpty) {
                n0Var.C6(blockingQueue);
                return;
            }
            n0Var.f31911n.clear();
            n0Var.A6();
            d dVar = n0Var.new d(new HashMap());
            b0 b0VarE = b0.e();
            b0VarE.getClass();
            b0VarE.d(GDIConnectIQInstalledApps.AppType.ALL, dVar);
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.b0.e
        public final void b() {
            i2.d("ConnectIQSM", "App delete failed [" + this.f31918a.toString() + "]");
            BlockingQueue<o10.b> blockingQueue = this.f31919b;
            boolean zIsEmpty = blockingQueue.isEmpty();
            n0 n0Var = n0.this;
            if (!zIsEmpty) {
                n0Var.C6(blockingQueue);
                return;
            }
            n0Var.f31911n.clear();
            n0Var.A6();
            d dVar = n0Var.new d(new HashMap());
            b0 b0VarE = b0.e();
            b0VarE.getClass();
            b0VarE.d(GDIConnectIQInstalledApps.AppType.ALL, dVar);
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f31922b;

        static {
            int[] iArr = new int[y10.g0.values().length];
            f31922b = iArr;
            try {
                iArr[y10.g0.APP_UPDATES_DOWNLOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31922b[y10.g0.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[l.values().length];
            f31921a = iArr2;
            try {
                iArr2[l.APPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31921a[l.DATA_FIELDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31921a[l.WIDGETS.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31921a[l.WATCH_FACES.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31921a[l.MUSIC_PROVIDER.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public class d implements b0.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, o10.b> f31923a;

        public d(Map<String, o10.b> map) {
            this.f31923a = map;
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.b0.g
        public final void a(long j8, long j14, ArrayList arrayList) {
            Map<String, o10.b> map;
            DeviceProfile deviceProfileB;
            n0 n0Var = n0.this;
            n0Var.getClass();
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = this.f31923a;
                if (!zHasNext) {
                    break;
                }
                e eVar = (e) it.next();
                int i14 = eVar.f31858b;
                int i15 = eVar.f31859c;
                Parcelable.Creator<e> creator = e.CREATOR;
                if (i14 == -1 || i14 == 0) {
                    o10.b bVar = new o10.b();
                    bVar.D(eVar.f31857a.toString());
                    bVar.a0(i15);
                    bVar.i0(String.valueOf(i15));
                    bVar.c0(eVar.f31861e);
                    bVar.f0(eVar.f31862f);
                    bVar.e0(i14);
                    bVar.G(eVar.f31860d);
                    bVar.H(eVar.f31863g);
                    if (i14 != -1) {
                        bVar.M(GCMSettingManager.k().h() + "/com.garmin.apps/content/images/garminapps/GCIQ_" + String.valueOf(i14) + ".png");
                    }
                    map.put(bVar.f(), bVar);
                }
            }
            androidx.fragment.app.m activity = n0Var.getActivity();
            if (activity == null || activity.isFinishing() || n0Var.f31913p != 0) {
                return;
            }
            String str = String.format(Locale.getDefault(), "%d K", Long.valueOf(j8 / 1024));
            n0Var.f31908k.setText(str);
            n0Var.f31908k.setContentDescription(oi0.d.a(n0Var.requireContext(), str, new cg1.e(15)));
            n0Var.f31909l.setText(String.valueOf(j14));
            if (map.isEmpty()) {
                n0Var.f31910m.setText(n0Var.getString(R.string.connect_iq_no_apps_installed, n0Var.getString(R.string.connect_iq_applications)));
                n0Var.f31910m.setVisibility(0);
                n0Var.z6();
            } else {
                if (n0Var.getActivity() == null || !hk0.p.k(n0Var.f31914q) || (deviceProfileB = hk0.p.b(n0Var.f31914q)) == null) {
                    return;
                }
                y10.k0 k0Var = n0Var.f31915r;
                String str2 = "006-B" + deviceProfileB.getF92744h() + "-00";
                k0Var.getClass();
                ge1.b.T(v1.a(k0Var), null, null, new y10.h0(k0Var, map, str2, null), 3);
            }
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.b0.g
        public final void b() {
            n0 n0Var = n0.this;
            n0Var.z6();
            androidx.fragment.app.m activity = n0Var.getActivity();
            if (activity != null && !activity.isFinishing()) {
                Toast.makeText(activity, R.string.txt_error_occurred, 0).show();
                androidx.fragment.app.m activity2 = n0Var.getActivity();
                if (activity2 != null) {
                    activity2.finish();
                }
            }
            i2.d("ConnectIQSM", ".onInstalledAppsRequestFailed()");
        }
    }

    public final void A6() {
        androidx.lifecycle.y0<y10.m0> y0Var = this.f31915r.f193933a;
        if (y0Var != null) {
            y0Var.m(new y10.m0(y10.g0.LOADING, null, null, null, null, 30, null));
        } else {
            p005kotlin.jvm.internal.s.m("connectIQLiveData");
            throw null;
        }
    }

    public final void C6(BlockingQueue<o10.b> blockingQueue) {
        l lVar;
        GDIConnectIQInstalledApps.AppType appType;
        o10.b bVarPoll = blockingQueue.poll();
        if (bVarPoll == null) {
            return;
        }
        UUID uuidFromString = UUID.fromString(bVarPoll.f());
        String str = bVarPoll.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String();
        l[] lVarArrValues = l.values();
        int length = lVarArrValues.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                lVar = l.UNKNOWN;
                break;
            }
            lVar = lVarArrValues[i14];
            if (lVar.f31894a.equals(str)) {
                break;
            } else {
                i14++;
            }
        }
        int i15 = c.f31921a[lVar.ordinal()];
        if (i15 == 1) {
            appType = GDIConnectIQInstalledApps.AppType.WATCH_APP;
        } else if (i15 == 2) {
            appType = GDIConnectIQInstalledApps.AppType.DATA_FIELD;
        } else if (i15 == 3) {
            appType = GDIConnectIQInstalledApps.AppType.WIDGET;
        } else if (i15 != 4) {
            appType = i15 != 5 ? GDIConnectIQInstalledApps.AppType.UNKNOWN_APP_TYPE : GDIConnectIQInstalledApps.AppType.AUDIO_CONTENT_PROVIDER;
        } else {
            appType = GDIConnectIQInstalledApps.AppType.WATCH_FACE;
        }
        b0.e().a(uuidFromString, appType, new b(bVarPoll, blockingQueue));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.fragment.app.m activity = getActivity();
        if (activity != null) {
            y10.k0 k0Var = (y10.k0) new x1(activity).b(p005kotlin.jvm.internal.s0.f105811a.b(y10.k0.class));
            this.f31915r = k0Var;
            if (k0Var.f193933a == null) {
                k0Var.f193933a = new androidx.lifecycle.y0<>();
            }
            androidx.lifecycle.y0<y10.m0> y0Var = k0Var.f193933a;
            if (y0Var == null) {
                p005kotlin.jvm.internal.s.m("connectIQLiveData");
                throw null;
            }
            y0Var.f(this, new a4.b(this, 13));
        }
        this.f31914q = getArguments() != null ? getArguments().getLong("CONNECT_IQ_DEVICE_UNIT_ID", -1L) : -1L;
        b0.e().f31823a = this.f31914q;
        if (bundle == null || !bundle.containsKey("BUNDLE_KEY_REQUEST_COUNTER")) {
            return;
        }
        this.f31913p = bundle.getInt("BUNDLE_KEY_REQUEST_COUNTER");
    }

    @Override // androidx.fragment.app.n0, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.gcm_device_connect_iq_manage_storage_list_view, viewGroup, false);
        this.f31908k = (TextView) viewInflate.findViewById(R.id.availableStorageValue);
        this.f31909l = (TextView) viewInflate.findViewById(R.id.availableSlotsValue);
        this.f31910m = (TextView) viewInflate.findViewById(R.id.emptyList);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("BUNDLE_KEY_REQUEST_COUNTER", this.f31913p);
    }

    @Override // androidx.fragment.app.n0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        l0 l0Var = new l0(getActivity());
        this.f31911n = l0Var;
        w6(l0Var);
        u6();
        ListView listView = this.f7311e;
        this.f31907j = listView;
        listView.setOnItemLongClickListener(new m0(this, 0));
        this.f31907j.setDivider(null);
        A6();
        d dVar = new d(new HashMap());
        b0 b0VarE = b0.e();
        b0VarE.getClass();
        b0VarE.d(GDIConnectIQInstalledApps.AppType.ALL, dVar);
    }

    public final void z6() {
        androidx.lifecycle.y0<y10.m0> y0Var = this.f31915r.f193933a;
        if (y0Var != null) {
            y0Var.m(new y10.m0(y10.g0.LOADING_DONE, null, null, null, null, 30, null));
        } else {
            p005kotlin.jvm.internal.s.m("connectIQLiveData");
            throw null;
        }
    }
}
