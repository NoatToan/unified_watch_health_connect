package com.garmin.android.apps.connectmobile.connectiq;

import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.deeplink.AppPromoPopupActivity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ConnectIQDeviceListActivity extends com.garmin.android.apps.connectmobile.r0 implements o.a, a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RecyclerView f31764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r0 f31765f;

    @Override // com.garmin.android.apps.connectmobile.r0
    public final String fa() {
        return "CIQ_STORE";
    }

    public final void ma() {
        com.garmin.android.apps.connectmobile.l.g().getClass();
        if (hb2.j.b(this, com.garmin.android.apps.connectmobile.l.f())) {
            com.garmin.android.apps.connectmobile.l.g().getClass();
            Intent intentA = hb2.j.a(this, com.garmin.android.apps.connectmobile.l.f());
            if (intentA != null) {
                startActivity(intentA);
                return;
            }
            return;
        }
        AppPromoPopupActivity.a aVar = AppPromoPopupActivity.f29002e;
        en.n nVar = en.n.CONNECT_IQ;
        aVar.getClass();
        nVar.getClass();
        AppPromoPopupActivity.a.c(aVar, this, nVar, 48);
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_recycler_view_layout);
        initActionBar(true, R.string.lbl_select_device);
        ca("CIQ_STORE");
        r0 r0Var = new r0(this);
        this.f31765f = r0Var;
        r0Var.c(new Void[0]);
        showProgressOverlay();
        this.f31764e = (RecyclerView) findViewById(R.id.recycler_view);
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.f31765f.a();
    }

    @Override // com.garmin.android.apps.connectmobile.connectiq.a
    public final void w5(List<sd2.f> list) {
        hideProgressOverlay();
        ArrayList arrayList = new ArrayList();
        for (sd2.f fVar : list) {
            if (fVar.isMultiLinkSupported()) {
                arrayList.add(fVar);
            }
        }
        if (arrayList.isEmpty()) {
            Bundle extras = getIntent().getExtras();
            Intent intent = new Intent(this, (Class<?>) ConnectIQAppStoreActivity.class);
            if (extras != null) {
                intent.putExtras(extras);
            }
            intent.putExtra("GCM_deviceUnitID", -1L);
            startActivity(intent);
            finish();
            return;
        }
        if (list.size() == arrayList.size()) {
            ma();
            finish();
            return;
        }
        o oVar = new o(list, this);
        this.f31764e.setBackgroundColor(a7.b.getColor(this, R.color.palette_interface_12));
        this.f31764e.setHasFixedSize(true);
        this.f31764e.setAdapter(oVar);
        this.f31764e.setLayoutManager(new LinearLayoutManager(this));
        this.f31764e.addItemDecoration(new androidx.recyclerview.widget.p(this, 1));
    }
}
