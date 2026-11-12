package com.garmin.android.apps.connectmobile.devices;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.GCMComplexOneLineButton;
import hb2.i;
import rd2.j;
import sd2.f;
import zb0.k0;
import zb0.o0;
import zb0.y0;

/* JADX INFO: loaded from: classes8.dex */
public class DeviceVideosActivity extends c implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f33820a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f33821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f33822c;

    public void onClickComplexOneLineButton(View view2) {
        if (i.a(this)) {
            String str = (String) ((GCMComplexOneLineButton) view2.getParent()).getTag();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            g22.a.c(this, Uri.parse(str));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String name;
        super.onCreate(bundle);
        setContentView(R.layout.gcm_videos_page);
        super.initActionBar(true, "");
        if (getIntent().hasExtra("GCM_deviceUnitID")) {
            this.f33821b = getIntent().getLongExtra("GCM_deviceUnitID", -1L);
        }
        if (this.f33821b == -1) {
            i2.i("DeviceVideosActivity", "Unit ID of the device was found to be null.");
            Toast.makeText(this, getString(R.string.txt_error_occurred), 0).show();
            finish();
            return;
        }
        if (getIntent().hasExtra("training.video.url")) {
            this.f33822c = getIntent().getBooleanExtra("training.video.url", false);
        }
        j jVar = rd2.f.a().f152045a;
        long j8 = this.f33821b;
        jVar.getClass();
        f fVarI = j.i(j8, null);
        this.f33820a = fVarI;
        if (fVarI != null) {
            if (this.f33822c) {
                name = k0.class.getName();
                setTitle(getString(R.string.devices_page_links));
            } else {
                name = o0.class.getName();
                setTitle(getString(R.string.devices_video));
            }
            Fragment fragmentInstantiate = Fragment.instantiate(this, name);
            v supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a aVarC = n23.j.c(supportFragmentManager, supportFragmentManager, R.id.frag_device_videos, fragmentInstantiate, null);
            aVarC.d(null);
            aVarC.e();
        }
    }

    @Override // zb0.y0
    public final f r2() {
        return this.f33820a;
    }
}
