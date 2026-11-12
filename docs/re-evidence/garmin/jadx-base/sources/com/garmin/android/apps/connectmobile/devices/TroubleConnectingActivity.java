package com.garmin.android.apps.connectmobile.devices;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.view.GCMComplexTutorialInstructionView;

/* JADX INFO: loaded from: classes8.dex */
public class TroubleConnectingActivity extends c {
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_how_to_connect_tutorial);
        initActionBar(true, R.string.trouble_connecting_title);
        ((GCMComplexTutorialInstructionView) findViewById(R.id.tv_instruction_2_a)).getLabelRight().setTutorial(getString(R.string.how_to_connect_instructions_2_a, getString(R.string.os_name_android)));
        ((GCMComplexTutorialInstructionView) findViewById(R.id.tv_instruction_3_b)).getLabelRight().setTutorial(getString(R.string.how_to_connect_instructions_3_b, getString(R.string.os_name_android)));
        ((GCMComplexTutorialInstructionView) findViewById(R.id.tv_instruction_4_b)).getLabelRight().setTutorial(getString(R.string.how_to_connect_instructions_4_b, getString(R.string.os_name_android)));
    }
}
