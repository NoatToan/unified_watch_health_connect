package com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui;

import am.b1;
import am.x0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.view.s;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.b0;
import androidx.lifecycle.v1;
import androidx.lifecycle.x1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.z1;
import java.util.List;
import o13.m;
import o13.t;
import o53.s0;
import p005kotlin.Metadata;
import yo.p;
import yr.o0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/multisport/advancededit/ui/g;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class g extends Fragment {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f29350h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f29351i = g.class.getCanonicalName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f29353b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b1 f29356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ap.d f29357f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f29352a = m.b(new o0(this, 21));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29354c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29355d = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f29358g = R.string.lbl_choose_activity_type;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/activities/multisport/advancededit/ui/g$b", "Landroidx/core/view/s;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements s {
        public b() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            zl.a.f(menu, menuInflater, R.menu.menu_done, menu);
        }

        @Override // androidx.core.view.s
        public final void Z4(Menu menu) {
            MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_done);
            if (menuItemFindItem != null) {
                menuItemFindItem.setEnabled(g.this.f29353b);
            }
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0045  */
        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            p pVarValueOf;
            x0 x0Var;
            String string;
            menuItem.getClass();
            if (menuItem.getItemId() != R.id.menu_item_done) {
                return false;
            }
            a aVar = g.f29350h;
            g gVar = g.this;
            gVar.getClass();
            try {
                Bundle arguments = gVar.getArguments();
                String str = "";
                if (arguments != null && (string = arguments.getString("legUpdateType", "")) != null) {
                    str = string;
                }
                pVarValueOf = p.valueOf(str);
            } catch (IllegalArgumentException unused) {
                pVarValueOf = null;
            }
            b1 b1VarU6 = gVar.u6();
            if (b1VarU6.f3872g >= 0) {
                int count = b1VarU6.getCount();
                int i14 = b1VarU6.f3872g;
                if (count > i14) {
                    x0Var = (x0) b1VarU6.getItem(i14);
                } else {
                    x0Var = null;
                }
            } else {
                x0Var = null;
            }
            int i15 = gVar.f29355d;
            if (i15 != -1 && pVarValueOf != null && x0Var != null) {
                ap.d dVar = gVar.f29357f;
                if (dVar == null) {
                    p005kotlin.jvm.internal.s.m("viewModel");
                    throw null;
                }
                int i16 = gVar.f29354c;
                i2.a aVar2 = i2.f36769a;
                aVar2.getClass();
                i2.a.a(a2.ACTIVITIES, "Divide leg " + i16 + " by " + pVarValueOf + ": division point " + i15 + ", type " + x0Var);
                w9.a aVarA = v1.a(dVar);
                x53.c cVar = s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new ap.f(pVarValueOf, dVar, i16, i15, x0Var, null), 2);
            }
            androidx.fragment.app.m activity = gVar.getActivity();
            MultisportEditLegsActivity multisportEditLegsActivity = activity instanceof MultisportEditLegsActivity ? (MultisportEditLegsActivity) activity : null;
            if (multisportEditLegsActivity != null) {
                multisportEditLegsActivity.ca(true);
            }
            return true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.multisport_leg_divide_activity_type_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new b(), b0.b.RESUMED);
        y6(view2);
    }

    public final b1 u6() {
        b1 b1Var = this.f29356e;
        if (b1Var != null) {
            return b1Var;
        }
        p005kotlin.jvm.internal.s.m("activityTypesAdapter");
        throw null;
    }

    public String v6() {
        String string = getString(R.string.leg_has_been_divided, String.valueOf(this.f29354c + 2));
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: w6, reason: from getter */
    public int getF29331k() {
        return this.f29358g;
    }

    public void y6(View view2) {
        androidx.fragment.app.m activity = getActivity();
        z1 z1Var = activity instanceof z1 ? (z1) activity : null;
        if (z1Var != null) {
            z1Var.setTitle(getF29331k());
        }
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        this.f29357f = (ap.d) new x1(mVarRequireActivity).b(p005kotlin.jvm.internal.s0.f105811a.b(ap.d.class));
        Bundle arguments = getArguments();
        this.f29354c = arguments != null ? arguments.getInt("legIndex") : -1;
        Bundle arguments2 = getArguments();
        this.f29355d = arguments2 != null ? arguments2.getInt("divisionPoint", -1) : -1;
        this.f29356e = new b1(requireActivity(), false, false);
        ((ListView) view2.findViewById(R.id.activity_types_list)).setAdapter((ListAdapter) u6());
        b1 b1VarU6 = u6();
        List<x0> list = (List) this.f29352a.getValue();
        b1VarU6.clear();
        if (list != null) {
            for (x0 x0Var : list) {
                if (x0Var == null) {
                    b1VarU6.f3872g = list.indexOf(x0Var);
                }
                b1VarU6.add(x0Var);
            }
        }
        u6().f3871f = new xw.b(this, 19);
        ((TextView) view2.findViewById(R.id.leg_divided_label)).setText(v6());
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/multisport/advancededit/ui/g$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
