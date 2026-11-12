package com.garmin.android.apps.connectmobile.smartscale;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.devices.model.l;
import com.garmin.android.apps.connectmobile.i2;
import og2.k;
import org.koin.java.KoinJavaComponent;
import wn1.j0;

/* JADX INFO: loaded from: classes10.dex */
public class InviteSmartScaleConnectionsActivity extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f44370f = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Button f44372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Button f44373c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f44371a = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f44374d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f44375e = new b();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            j0 j0Var = (j0) KoinJavaComponent.get(j0.class);
            InviteSmartScaleConnectionsActivity inviteSmartScaleConnectionsActivity = InviteSmartScaleConnectionsActivity.this;
            j0Var.e(inviteSmartScaleConnectionsActivity, inviteSmartScaleConnectionsActivity.f44371a.getF143511a(), inviteSmartScaleConnectionsActivity.f44371a.getDeviceName());
            inviteSmartScaleConnectionsActivity.finish();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            int i14 = InviteSmartScaleConnectionsActivity.f44370f;
            InviteSmartScaleConnectionsActivity inviteSmartScaleConnectionsActivity = InviteSmartScaleConnectionsActivity.this;
            inviteSmartScaleConnectionsActivity.setResult(-1);
            inviteSmartScaleConnectionsActivity.finish();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i2.d("InviteSmartScaleConnectionsActivity", ".onCreate()");
        setContentView(R.layout.gcm3_smartscale_welcome);
        initActionBar(true, R.string.social_invite_people);
        if (getIntent().getExtras() != null) {
            this.f44371a = (l) getIntent().getParcelableExtra("GCM_deviceDTO");
            getIntent().getBooleanExtra("GCM_extra_in_pairing_mode", false);
        }
        ImageView imageView = (ImageView) findViewById(R.id.device_image);
        Drawable drawable = a7.b.getDrawable(this, R.drawable.user_groups);
        k.F(R.color.gcm_connection_color, this, drawable);
        imageView.setImageDrawable(drawable);
        Button button = (Button) findViewById(R.id.button_invite_connections);
        this.f44372b = button;
        button.setOnClickListener(this.f44374d);
        this.f44372b.setEnabled(true);
        this.f44372b.setBackgroundColor(getColor(R.color.gcm_button_primary));
        this.f44372b.setText(R.string.social_invite_people);
        Button button2 = (Button) findViewById(R.id.button_may_be_later);
        this.f44373c = button2;
        button2.setOnClickListener(this.f44375e);
        this.f44373c.setEnabled(true);
        this.f44373c.setBackgroundColor(getColor(R.color.gcm_button_primary));
    }
}
