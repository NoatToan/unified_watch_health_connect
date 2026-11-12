package com.garmin.android.apps.connectmobile.golf.truswing;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.s;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import org.koin.java.KoinJavaComponent;
import v.b0;
import vg1.z0;
import wl0.u;
import wl0.v;

/* JADX INFO: loaded from: classes8.dex */
public class ClubSelectionDrawerFragment extends Fragment implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f35753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wl0.d f35754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DrawerLayout f35755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ListView f35756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinearLayout f35757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f35758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f35759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f35760h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RelativeLayout f35761i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RelativeLayout f35762j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f35765m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public wl0.f f35766n;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f35763k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f35764l = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Handler f35767o = new Handler();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b0 f35768p = new b0(this, 17);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final cl0.b f35769q = (cl0.b) KoinJavaComponent.get(cl0.b.class);

    public class a implements s {
        public a() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            menuInflater.inflate(R.menu.golf_club_selection, menu);
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            ClubSelectionDrawerFragment clubSelectionDrawerFragment = ClubSelectionDrawerFragment.this.f35754b.f185908i;
            if (menuItem == null || menuItem.getItemId() != R.id.menu_item_settings) {
                return false;
            }
            View viewE = clubSelectionDrawerFragment.f35755c.e(8388613);
            boolean zL = viewE != null ? DrawerLayout.l(viewE) : false;
            DrawerLayout drawerLayout = clubSelectionDrawerFragment.f35755c;
            if (zL) {
                drawerLayout.b(8388613);
                return true;
            }
            drawerLayout.o(8388613);
            return true;
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35771a;

        static {
            int[] iArr = new int[hc2.c.a.EnumC1639a.values().length];
            f35771a = iArr;
            try {
                iArr[hc2.c.a.EnumC1639a.NEW_SWING_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35771a[hc2.c.a.EnumC1639a.NEW_BATTERY_STATUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35771a[hc2.c.a.EnumC1639a.NEW_CLUB_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35771a[hc2.c.a.EnumC1639a.NEW_ACTIVE_CLUB.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface c {
        void S8(com.garmin.android.apps.connectmobile.golf.truswing.model.a aVar);

        void i4();

        void u3();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        int i14;
        super.onActivityCreated(bundle);
        cl0.a.e().getClass();
        ArrayList arrayListH = wl0.h.i().h(true);
        if (arrayListH == null) {
            arrayListH = new ArrayList();
        }
        this.f35765m = arrayListH;
        wl0.f fVar = new wl0.f(getActivity(), this.f35765m);
        this.f35766n = fVar;
        this.f35756d.setAdapter((ListAdapter) fVar);
        if (this.f35763k >= 0) {
            i14 = 0;
            while (i14 < this.f35766n.getCount()) {
                if (((com.garmin.android.apps.connectmobile.golf.truswing.model.a) this.f35766n.getItem(i14)).f35890b != this.f35763k) {
                    i14++;
                }
            }
            i14 = this.f35764l;
        } else {
            i14 = this.f35764l;
        }
        this.f35764l = i14;
        this.f35756d.setItemChecked(i14 + 1, true);
        this.f35756d.setOnItemClickListener(new ey.a(this, 7));
        this.f35760h.setVisibility(8);
        this.f35760h.setOnClickListener(new z0(this, 13));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.f35753a = (c) context;
            wl0.h.i().addObserver(this);
        } catch (ClassCastException unused) {
            throw new ClassCastException("Activity must implement: ".concat(c.class.getSimpleName()));
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        wl0.d dVar = this.f35754b;
        dVar.f86546a.e();
        DrawerLayout drawerLayout = dVar.f86547b;
        View viewE = drawerLayout.e(8388611);
        if (viewE != null ? DrawerLayout.l(viewE) : false) {
            dVar.a(1.0f);
        } else {
            dVar.a(0.0f);
        }
        if (dVar.f86550e) {
            k.b bVar = dVar.f86548c;
            View viewE2 = drawerLayout.e(8388611);
            int i14 = viewE2 != null ? DrawerLayout.l(viewE2) : false ? dVar.f86552g : dVar.f86551f;
            i.b.InterfaceC1717b interfaceC1717b = dVar.f86546a;
            if (!dVar.f86553h && !interfaceC1717b.d()) {
                dVar.f86553h = true;
            }
            interfaceC1717b.a(bVar, i14);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f35756d = (ListView) layoutInflater.inflate(R.layout.gcm_golf_club_selection_drawer_fragment, viewGroup, false);
        View viewInflate = layoutInflater.inflate(R.layout.gcm_golf_truswing_club_selection_list_header, (ViewGroup) null, false);
        this.f35759g = viewInflate;
        this.f35760h = (TextView) viewInflate.findViewById(R.id.golf_club_edit_label);
        this.f35756d.addHeaderView(this.f35759g);
        this.f35757e = (LinearLayout) this.f35759g.findViewById(R.id.golf_connected_devices_container);
        this.f35761i = (RelativeLayout) layoutInflater.inflate(R.layout.gcm_golf_truswing_device, (ViewGroup) null);
        this.f35762j = (RelativeLayout) layoutInflater.inflate(R.layout.gcm_golf_truswing_device, (ViewGroup) null);
        RelativeLayout relativeLayout = this.f35761i;
        relativeLayout.setTag(new v(relativeLayout));
        RelativeLayout relativeLayout2 = this.f35762j;
        relativeLayout2.setTag(new v(relativeLayout2));
        this.f35761i.setVisibility(8);
        this.f35762j.setVisibility(8);
        this.f35757e.addView(this.f35761i);
        this.f35757e.addView(this.f35762j);
        this.f35759g.setOnClickListener(null);
        return this.f35756d;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f35753a = null;
        wl0.h.i().deleteObserver(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        super.onViewCreated(view2, bundle);
        g22.e.j(this, new a());
    }

    public final boolean u6() {
        return this.f35755c != null && DrawerLayout.l(this.f35758f);
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        try {
            this.f35767o.post(new vg1.d(11, this, (hc2.c.a) obj));
        } catch (Exception unused) {
        }
    }

    public final void v6(View view2, sd2.f fVar, Double d14) {
        view2.setVisibility(0);
        view2.setVisibility(0);
        String productDisplayName = fVar.getProductDisplayName();
        cl0.b bVar = this.f35769q;
        String string = getString(bVar.e(fVar) ? R.string.txt_garmin_device_connected : R.string.devices_not_connected);
        String strF = bVar.f(fVar);
        v vVar = (v) view2.getTag();
        TextView textView = vVar.f186005c;
        ImageView imageView = vVar.f186004b;
        textView.setText(productDisplayName);
        vVar.f186006d.setText(string);
        zp0.c cVar = new zp0.c(view2.getContext());
        cVar.f206565e = strF;
        cVar.f206570j = 2131231969;
        cVar.h(vVar.f186003a);
        imageView.setVisibility((d14 == null || Double.isNaN(d14.doubleValue()) || d14.doubleValue() <= 0.0d) ? 8 : 0);
        imageView.setBackgroundResource(u.a(d14));
    }
}
