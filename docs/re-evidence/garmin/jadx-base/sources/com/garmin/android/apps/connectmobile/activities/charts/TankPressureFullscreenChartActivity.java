package com.garmin.android.apps.connectmobile.activities.charts;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.g1;
import androidx.core.view.s0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.j0;
import com.garmin.android.apps.connectmobile.activities.newmodel.l0;
import com.garmin.android.apps.connectmobile.l2;
import i3.e5;
import im.d;
import im.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.x0;
import p13.u;
import p13.w;
import qm.g0;
import zm.p;
import zm.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/charts/TankPressureFullscreenChartActivity;", "Lcom/garmin/android/apps/connectmobile/activities/charts/FullscreenChartActivity;", "Lcom/garmin/android/apps/connectmobile/activities/charts/c$b;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TankPressureFullscreenChartActivity extends FullscreenChartActivity implements c.b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f28951t = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l0 f28952p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f28953q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c f28954r;

    @Override // com.garmin.android.apps.connectmobile.activities.charts.c.b
    public final void A6(Object obj, boolean z14) {
        ArrayList arrayList = this.f28953q;
        if (z14) {
            arrayList.add(obj);
        } else {
            arrayList.remove(obj);
        }
        q qVar = this.f28946j;
        if (qVar instanceof g0) {
            ((g0) qVar).A6(obj, z14);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.activities.charts.FullscreenChartActivity, lz.b
    public final void J7() {
        super.J7();
        c cVar = this.f28954r;
        if (cVar != null) {
            cVar.f28978g = false;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.activities.charts.FullscreenChartActivity, com.garmin.android.apps.connectmobile.activities.charts.a.InterfaceC0444a
    public final void c6(p pVar) throws Throwable {
        String strIa;
        pVar.getClass();
        this.f28940d = pVar;
        p pVarGa = ga();
        if (pVarGa != null) {
            boolean z14 = this.f28947k;
            p pVar2 = this.f28940d;
            if (z14) {
                pVar2.getClass();
                strIa = ia(pVar2, pVarGa);
            } else {
                strIa = ia(pVarGa, pVar2);
            }
            c cVar = this.f28954r;
            int[] iArrA = cVar != null ? cVar.a() : null;
            LinearLayout linearLayout = this.f28942f;
            LinearLayout linearLayout2 = this.f28943g;
            LinearLayout linearLayout3 = this.f28944h;
            p pVar3 = this.f28940d;
            e eVar = this.f28937a;
            q qVarF = ar.e.f(this, linearLayout, linearLayout2, linearLayout3, pVarGa, -1, pVar3, eVar != null ? eVar.f94143c : null, true, this.f28954r, iArrA, fz.c.TIME);
            this.f28946j = qVarF;
            g0 g0Var = qVarF instanceof g0 ? (g0) qVarF : null;
            if (g0Var != null) {
                g0Var.f145374y = this.f28947k;
                g0Var.u();
                g0Var.C();
            }
            setTitle(strIa);
            oa(this.f28946j, this);
        }
        invalidateOptionsMenu();
        qa();
    }

    @Override // com.garmin.android.apps.connectmobile.activities.charts.FullscreenChartActivity
    public final void ca() {
        super.ca();
        View viewFindViewById = findViewById(R.id.chart_tag_options_scroll_view);
        if (viewFindViewById != null) {
            e5 e5Var = new e5(18);
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            s0.d.c(viewFindViewById, e5Var);
        }
        View viewFindViewById2 = findViewById(R.id.overlay_selection_label);
        if (viewFindViewById2 != null) {
            e5 e5Var2 = new e5(19);
            WeakHashMap<View, g1> weakHashMap2 = s0.f6563a;
            s0.d.c(viewFindViewById2, e5Var2);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.activities.charts.FullscreenChartActivity
    public final String ia(p pVar, p pVar2) {
        pVar.getClass();
        String f113511u1 = pVar.getF113511u1();
        if ((pVar2 != null ? pVar2.U3() : null) == null) {
            if ((pVar2 != null ? pVar2.P(0) : null) == null || pVar2.P(0).isEmpty()) {
                return f113511u1;
            }
        }
        String f113511u2 = pVar2.getF113511u1();
        x0 x0Var = x0.f105818a;
        return String.format("%s & %s", Arrays.copyOf(new Object[]{f113511u1, f113511u2}, 2));
    }

    @Override // com.garmin.android.apps.connectmobile.activities.charts.FullscreenChartActivity
    public final int ja() {
        return R.layout.tank_pressure_fullscreen_chart;
    }

    @Override // com.garmin.android.apps.connectmobile.activities.charts.FullscreenChartActivity
    public final void ka(p pVar) {
        LinearLayout linearLayout = this.f28942f;
        LinearLayout linearLayout2 = this.f28943g;
        LinearLayout linearLayout3 = this.f28944h;
        p pVar2 = this.f28940d;
        e eVar = this.f28937a;
        this.f28946j = ar.e.f(this, linearLayout, linearLayout2, linearLayout3, pVar, -1, pVar2, eVar != null ? eVar.f94143c : null, true, this.f28954r, eVar != null ? eVar.f94144d : null, fz.c.TIME);
    }

    @Override // com.garmin.android.apps.connectmobile.activities.charts.FullscreenChartActivity, lz.b
    public final void n1() {
        super.n1();
        c cVar = this.f28954r;
        if (cVar != null) {
            cVar.f28978g = true;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.activities.charts.FullscreenChartActivity
    public final void na() throws Throwable {
        p pVarGa;
        String strIa;
        if (this.f28940d != null && (pVarGa = ga()) != null && this.f28937a != null) {
            boolean z14 = this.f28947k;
            p pVar = this.f28940d;
            if (z14) {
                strIa = ia(pVarGa, pVar);
                this.f28947k = false;
            } else {
                pVar.getClass();
                strIa = ia(pVar, pVarGa);
                this.f28947k = true;
            }
            q qVar = this.f28946j;
            g0 g0Var = qVar instanceof g0 ? (g0) qVar : null;
            if (g0Var != null) {
                c cVar = this.f28954r;
                g0Var.f145367p = cVar != null ? cVar.a() : null;
            }
            if (g0Var != null) {
                g0Var.f145374y = this.f28947k;
                g0Var.u();
                g0Var.C();
            }
            setTitle(strIa);
        }
        invalidateOptionsMenu();
    }

    @Override // com.garmin.android.apps.connectmobile.activities.charts.FullscreenChartActivity
    public final void oa(q qVar, FullscreenChartActivity fullscreenChartActivity) {
        if (qVar instanceof g0) {
            ((g0) qVar).f145375z = fullscreenChartActivity;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("chartTypeForSelections", 45);
        c cVar = this.f28954r;
        intent.putExtra("fullscreenDataSetSelections", cVar != null ? cVar.a() : null);
        setResult(-1, intent);
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.activities.charts.FullscreenChartActivity, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Set<String> setKeySet;
        l0 l0Var;
        List<j0> listB;
        List<j0> listB2;
        j0 j0Var;
        int[] iArr;
        Set<String> setKeySet2;
        Parcelable parcelable;
        super.onCreate(bundle);
        l2.a aVar = l2.f37135b;
        Intent intent = getIntent();
        aVar.getClass();
        Bundle bundleA = l2.a.a(intent);
        String name = null;
        if (bundleA != null && (setKeySet2 = bundleA.keySet()) != null && setKeySet2.contains("extra_tank_pressures")) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundleA.getParcelable("extra_tank_pressures", l0.class);
            } else {
                Parcelable parcelable2 = bundleA.getParcelable("extra_tank_pressures");
                if (!(parcelable2 instanceof l0)) {
                    parcelable2 = null;
                }
                parcelable = (l0) parcelable2;
            }
            this.f28952p = (l0) parcelable;
        }
        if (bundleA == null || (setKeySet = bundleA.keySet()) == null || !setKeySet.contains("extra_chart_data_list")) {
            finish();
            return;
        }
        this.f28941e = Build.VERSION.SDK_INT >= 33 ? bundleA.getParcelableArrayList("extra_chart_data_list", p.class) : bundleA.getParcelableArrayList("extra_chart_data_list");
        p pVarGa = ga();
        if (pVarGa == null || (l0Var = this.f28952p) == null || l0Var.b() == null) {
            return;
        }
        View viewFindViewById = findViewById(R.id.chart_tags_container);
        viewFindViewById.getClass();
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        viewGroup.setVisibility(0);
        c cVar = new c(viewGroup, this, null, 4, null);
        this.f28954r = cVar;
        cVar.f28974c = 4;
        cVar.f28975d = 1;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        l0 l0Var2 = this.f28952p;
        if (l0Var2 == null || (listB = l0Var2.b()) == null) {
            listB = p13.j0.f134944a;
        }
        Iterator<j0> it = listB.iterator();
        while (it.hasNext()) {
            j0 next = it.next();
            String name2 = next != null ? next.getName() : null;
            if (name2 != null) {
                linkedHashMap.put(name2, name2);
            }
        }
        c cVar2 = this.f28954r;
        if (cVar2 != null) {
            cVar2.c(getString(R.string.max_tanks_selection), linkedHashMap);
        }
        c cVar3 = this.f28954r;
        if (cVar3 != null) {
            e eVar = this.f28937a;
            cVar3.b((eVar == null || (iArr = eVar.f94144d) == null) ? w.c(0) : u.k0(iArr));
        }
        l0 l0Var3 = this.f28952p;
        if (l0Var3 != null && (listB2 = l0Var3.b()) != null && (j0Var = listB2.get(0)) != null) {
            name = j0Var.getName();
        }
        this.f28953q.add(name);
        viewGroup.invalidate();
        ka(pVarGa);
        initActionBar(true, pVarGa.getF113511u1());
        ArrayList arrayListE = d.e(pVarGa, this.f28941e);
        this.f28939c = arrayListE;
        this.f28938b.a(arrayListE);
        invalidateOptionsMenu();
        if (da()) {
            fa();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.activities.charts.FullscreenChartActivity, android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        boolean zOnCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_overlay);
        if (menuItemFindItem != null) {
            menuItemFindItem.setEnabled(false);
            menuItemFindItem.setVisible(false);
        }
        return zOnCreateOptionsMenu;
    }

    @Override // com.garmin.android.apps.connectmobile.activities.charts.FullscreenChartActivity, com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public final void qa() {
        q qVar = this.f28946j;
        g0 g0Var = qVar instanceof g0 ? (g0) qVar : null;
        for (Object obj : this.f28953q) {
            if (g0Var != null) {
                g0Var.A6(obj, true);
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.activities.charts.FullscreenChartActivity, com.garmin.android.apps.connectmobile.activities.charts.a.InterfaceC0444a
    public final void v6() {
        this.f28940d = null;
        p pVarGa = ga();
        if (pVarGa != null) {
            String strIa = ia(pVarGa, null);
            c cVar = this.f28954r;
            int[] iArrA = cVar != null ? cVar.a() : null;
            LinearLayout linearLayout = this.f28942f;
            LinearLayout linearLayout2 = this.f28943g;
            LinearLayout linearLayout3 = this.f28944h;
            e eVar = this.f28937a;
            this.f28946j = ar.e.f(this, linearLayout, linearLayout2, linearLayout3, pVarGa, -1, null, eVar != null ? eVar.f94143c : null, true, this.f28954r, iArrA, fz.c.TIME);
            setTitle(strIa);
            oa(this.f28946j, this);
        }
        invalidateOptionsMenu();
        qa();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/charts/TankPressureFullscreenChartActivity$a;", "", "<init>", "()V", "", "EXTRA_TANK_PRESSURES", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
