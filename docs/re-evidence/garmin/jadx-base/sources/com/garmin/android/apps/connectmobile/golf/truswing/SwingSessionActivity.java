package com.garmin.android.apps.connectmobile.golf.truswing;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes8.dex */
public class SwingSessionActivity extends com.garmin.android.apps.connectmobile.c implements com.garmin.android.apps.connectmobile.golf.truswing.a.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f35791d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.golf.truswing.a f35792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f35793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f35794c;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            SwingDetailsActivity.ca(SwingSessionActivity.this);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        com.garmin.android.apps.connectmobile.golf.truswing.a aVar = this.f35792a;
        if (aVar != null) {
            aVar.onActivityResult(i14, i15, intent);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_golf_swing_session_layout);
        initActionBar(true, R.string.golf_swing_analysis_component_title);
        TextView textView = (TextView) findViewById(R.id.recordNewSwingButton);
        this.f35793b = textView;
        textView.setVisibility(0);
        this.f35793b.setOnClickListener(new a());
        String stringExtra = getIntent().getStringExtra("GCM_swing_session_date");
        long longExtra = getIntent().getLongExtra("GCM_swing_session_id", -1L);
        if (longExtra <= 0 || DateTime.now().withTimeAtStartOfDay().equals(new DateTime(stringExtra).withTimeAtStartOfDay())) {
            i iVar = new i();
            Bundle bundle2 = new Bundle();
            bundle2.putLong("GCM_swing_session_id", longExtra);
            iVar.setArguments(bundle2);
            this.f35792a = iVar;
            this.f35794c = true;
        } else {
            g gVar = new g();
            Bundle bundle3 = new Bundle();
            bundle3.putLong("GCM_swing_session_id", longExtra);
            gVar.setArguments(bundle3);
            this.f35792a = gVar;
            this.f35794c = false;
        }
        String strB = stringExtra != null ? k.b(this, stringExtra) : null;
        if (TextUtils.isEmpty(strB)) {
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = getString(R.string.golf_swing_analysis_component_title);
            }
            strB = stringExtra;
        }
        initActionBar(true, strB);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.l(R.id.content, this.f35792a, null);
        aVar.e();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.golf_swing_session_detail, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menu_item_cancel) {
            cl0.a.e().getClass();
            if (((cl0.b) KoinJavaComponent.get(cl0.b.class)).G() && this.f35794c) {
                this.f35793b.setVisibility(0);
                return false;
            }
        } else if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return false;
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        cl0.a.e().getClass();
        this.f35793b.setVisibility((cl0.a.h() || !this.f35794c) ? 8 : 0);
    }
}
