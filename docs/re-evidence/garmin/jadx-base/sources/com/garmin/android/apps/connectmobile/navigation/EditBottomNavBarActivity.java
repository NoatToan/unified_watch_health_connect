package com.garmin.android.apps.connectmobile.navigation;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.s;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import qh1.j;
import tn.k;
import ty0.i;

/* JADX INFO: loaded from: classes9.dex */
public class EditBottomNavBarActivity extends com.garmin.android.apps.connectmobile.c implements sq0.e, a.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f39331c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f39332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f39333b;

    @Override // sq0.e
    public final void H6(RecyclerView.f0 f0Var) {
        this.f39333b.o(f0Var);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        Bundle bundleD = k.d("Screen", "MainMenu", "Action", "EditTabBarCancelled");
        ht.a.f85464a.getClass();
        ht.a.a(bundleD, "UserAction");
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_generic_list_layout);
        initActionBar(getString(R.string.lbl_edit_tabs), 3);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        this.f39332a = new a(this, this, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(this.f39332a);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(new p(recyclerView.getContext(), linearLayoutManager.getOrientation()));
        s sVar = new s(new i(this.f39332a));
        this.f39333b = sVar;
        sVar.e(recyclerView);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.save_menu, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.save_menu_item) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (this.f39332a.f39336c.size() != 5) {
            new androidx.appcompat.app.e.a(this).setMessage(R.string.msg_min_tabbar_items).setPositiveButton(R.string.lbl_ok, new j(25)).create().show();
            return true;
        }
        l.f68084a.getClass();
        l.a.a().t2(this.f39332a.t());
        b.a aVar = b.f39357a;
        List listAsList = Arrays.asList(this.f39332a.t());
        aVar.getClass();
        listAsList.getClass();
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            Bundle bundleD = k.d("Type", "EditTabBarTapped", "FeatureType", (String) it.next());
            ht.a.f85464a.getClass();
            ht.a.a(bundleD, "UserAction");
        }
        setResult(-1, getIntent());
        finish();
        return true;
    }
}
