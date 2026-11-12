package com.garmin.android.apps.connectmobile.connections.groups.details;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import j10.r;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class GroupSortByActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f31460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f31461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GroupDTO f31462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f31463d;

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        Intent intent = new Intent();
        r rVar = this.f31461b;
        intent.putExtra("GCM_extra_connection_group_leaderboard_type", rVar.f96400d.get(rVar.f96401e));
        setResult(-1, intent);
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_simple_recycler_view_layout);
        super.initActionBar(true, getString(R.string.title_sort_by));
        if (getIntent().hasExtra("GCM_extra_connection_group")) {
            this.f31462c = (GroupDTO) getIntent().getParcelableExtra("GCM_extra_connection_group");
        }
        if (getIntent().hasExtra("GCM_extra_connection_group_leaderboard_type")) {
            this.f31463d = getIntent().getStringExtra("GCM_extra_connection_group_leaderboard_type");
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.simple_recycler_view);
        this.f31460a = recyclerView;
        recyclerView.setHasFixedSize(true);
        this.f31460a.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f31462c.f31575r.iterator();
        while (it.hasNext()) {
            arrayList.add(((j10.d) it.next()).name());
        }
        if (this.f31462c != null) {
            r rVar = new r(this, arrayList, this.f31463d);
            this.f31461b = rVar;
            this.f31460a.setAdapter(rVar);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        Intent intent = new Intent();
        r rVar = this.f31461b;
        intent.putExtra("GCM_extra_connection_group_leaderboard_type", rVar.f96400d.get(rVar.f96401e));
        setResult(-1, intent);
        finish();
        return true;
    }
}
