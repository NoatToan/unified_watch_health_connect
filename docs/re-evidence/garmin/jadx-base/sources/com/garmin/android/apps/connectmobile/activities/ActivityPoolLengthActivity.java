package com.garmin.android.apps.connectmobile.activities;

import am.g2;
import am.i;
import am.j;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.view.GCMComplexOneLineButton;
import f12.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lo.l3;
import qs.y;
import r22.e;

/* JADX INFO: loaded from: classes7.dex */
public class ActivityPoolLengthActivity extends c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f28765n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.activities.a f28766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinearLayout f28767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMComplexOneLineButton f28768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f28769d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f28772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f28773h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f28774i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l3 f28775j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f28776k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f28777l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f28770e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList<l3> f28771f = new ArrayList<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i f28778m = new i(this);

    public interface a {
    }

    public final void ca() {
        Intent intent = new Intent();
        com.garmin.android.apps.connectmobile.activities.a aVar = this.f28766a;
        if (((g2) aVar.getItem(aVar.f28801c)).equals(g2.f3980i)) {
            int i14 = this.f28772g;
            int i15 = this.f28773h;
            c22.l3.f23124b.getClass();
            this.f28774i = ((double) ((i14 * 10) + i15)) / 10.0d;
            this.f28776k = this.f28777l.equals(this.f28770e.get(1)) ? y.UNIT_DISTANCE_METER.f147239a : y.UNIT_DISTANCE_YARD.f147239a;
        } else {
            com.garmin.android.apps.connectmobile.activities.a aVar2 = this.f28766a;
            this.f28774i = ((g2) aVar2.getItem(aVar2.f28801c)).f3984c;
            com.garmin.android.apps.connectmobile.activities.a aVar3 = this.f28766a;
            this.f28776k = ((g2) aVar3.getItem(aVar3.f28801c)).f3985d;
        }
        intent.putExtra("GCM_extra_activity_pool_length_value", this.f28774i);
        intent.putExtra("GCM_extra_activity_pool_length_unit", this.f28776k);
        setResult(-1, intent);
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        ca();
    }

    public void onClickComplexOneLineButton(View view2) {
        if (((View) view2.getParent()).getId() == R.id.gcm_activity_custom_pool_length_btn) {
            e eVar = this.f28769d;
            int i14 = this.f28772g;
            int i15 = this.f28773h;
            eVar.f149833g = i14;
            eVar.f149834h = i15;
            l3 l3Var = this.f28775j;
            if (l3Var != null) {
                eVar.E = l3Var;
            }
            eVar.show(getSupportFragmentManager(), "ActivityPoolLengthActivity");
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_list_view_generic);
        initActionBar(true, R.string.workout_pool_size);
        String string = getString(R.string.common_yards_string);
        ArrayList arrayList = this.f28770e;
        arrayList.add(string);
        arrayList.add(getString(R.string.common_meters_string));
        l3 l3Var = l3.YARD;
        ArrayList<l3> arrayList2 = this.f28771f;
        arrayList2.add(l3Var);
        l3 l3Var2 = l3.METER;
        arrayList2.add(l3Var2);
        this.f28774i = getIntent().getDoubleExtra("GCM_extra_activity_pool_length_value", 0.0d);
        String stringExtra = getIntent().getStringExtra("GCM_extra_activity_pool_length_unit");
        this.f28776k = stringExtra;
        if (stringExtra == null) {
            this.f28776k = (j.z(l.f68084a) ? m3.METER : m3.YARD).name();
        }
        if (this.f28776k.equals(m3.METER.name())) {
            l3Var = l3Var2;
        }
        this.f28775j = l3Var;
        double d14 = this.f28774i;
        String str = this.f28776k;
        g2 g2Var = g2.f3980i;
        g2 g2VarB = g2.b(d14, str, g2Var);
        double d15 = this.f28774i;
        int i14 = (int) d15;
        this.f28772g = i14;
        this.f28773h = (int) Math.round((d15 - ((double) i14)) * 10.0d);
        String str2 = this.f28776k;
        this.f28777l = (str2 == null || !str2.equalsIgnoreCase(y.UNIT_DISTANCE_METER.f147239a)) ? (String) arrayList.get(0) : (String) arrayList.get(1);
        ListView listView = (ListView) findViewById(R.id.gcm_list);
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService("layout_inflater");
        if (layoutInflater != null) {
            View viewInflate = layoutInflater.inflate(R.layout.gcm_activity_custom_pool_length, (ViewGroup) null, false);
            listView.addFooterView(viewInflate, null, true);
            listView.setFooterDividersEnabled(false);
            this.f28767b = (LinearLayout) viewInflate.findViewById(R.id.gcm_activity_custom_pool_length_linear_layout);
            this.f28768c = (GCMComplexOneLineButton) viewInflate.findViewById(R.id.gcm_activity_custom_pool_length_btn);
            boolean zEquals = g2VarB.equals(g2Var);
            LinearLayout linearLayout = this.f28767b;
            if (zEquals) {
                linearLayout.setVisibility(0);
                int i15 = this.f28772g;
                int i16 = this.f28773h;
                c22.l3.f23124b.getClass();
                this.f28768c.setButtonRightLabel(c22.l3.d(true, this.f28777l, ((double) ((i15 * 10) + i16)) / 10.0d));
            } else {
                linearLayout.setVisibility(8);
            }
        }
        com.garmin.android.apps.connectmobile.activities.a aVar = new com.garmin.android.apps.connectmobile.activities.a(this, this.f28778m);
        this.f28766a = aVar;
        List<g2> listAsList = Arrays.asList(g2.values());
        aVar.clear();
        if (listAsList != null) {
            for (g2 g2Var2 : listAsList) {
                if (g2Var2 == g2VarB) {
                    aVar.f28801c = listAsList.indexOf(g2Var2);
                }
                aVar.add(g2Var2);
            }
        }
        listView.setAdapter((ListAdapter) this.f28766a);
        e eVarY6 = e.y6(true);
        this.f28769d = eVarY6;
        eVarY6.v6(this.f28772g);
        e eVar = this.f28769d;
        eVar.f149836j = true;
        eVar.f149839m = 10;
        eVar.f149836j = true;
        eVar.f149840n = 150;
        eVar.f149836j = true;
        eVar.f149843q = true;
        l3 l3Var3 = this.f28775j;
        if (l3Var3 != null) {
            eVar.E = l3Var3;
        } else {
            eVar.getClass();
        }
        e eVar2 = this.f28769d;
        eVar2.getClass();
        eVar2.w6(arrayList2);
        this.f28769d.f149845t = getString(R.string.lbl_cancel);
        this.f28769d.f149846v = getString(R.string.lbl_done);
        e eVar3 = this.f28769d;
        i iVar = new i(this);
        eVar3.getClass();
        eVar3.X = iVar;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        ca();
        return true;
    }
}
