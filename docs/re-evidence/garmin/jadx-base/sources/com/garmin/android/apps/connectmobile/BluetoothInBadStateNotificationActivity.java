package com.garmin.android.apps.connectmobile;

import android.os.Bundle;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.view.GCMComplexTutorialInstructionView;

/* JADX INFO: loaded from: classes7.dex */
public class BluetoothInBadStateNotificationActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f28650a = 0;

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_bluetooth_in_bad_state);
        initActionBar(true, R.string.lbl_bluetooth_troubleshooting);
        ((TextView) findViewById(R.id.instruction_bad_bluetooth_content)).setText(getString(R.string.android_notification_bad_bluetooth_state_content_text_long, getString(R.string.os_name_android)));
        ((GCMComplexTutorialInstructionView) findViewById(R.id.instruction_bad_bluetooth_step1)).getLabelRight().setTutorial(getString(R.string.android_notification_bad_bluetooth_state_resolution_step1, getString(R.string.os_name_android)));
        ((GCMComplexTutorialInstructionView) findViewById(R.id.instruction_bad_bluetooth_step2)).getLabelRight().setTutorial(getString(R.string.android_notification_bad_bluetooth_state_resolution_step2, getString(R.string.os_name_android)));
        new Thread(new cd0.h0(this, 3)).start();
    }
}
