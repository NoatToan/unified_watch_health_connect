package com.garmin.android.apps.connectmobile.devices;

import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.UserDevicesActivity;
import com.garmin.android.apps.connectmobile.c;
import i3.e5;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes8.dex */
public class AddGarminDeviceGuide extends c implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public void onClick(View view2) {
        if (view2.getId() == R.id.add_device) {
            UserDevicesActivity.ca(this);
            finish();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_add_device_guide);
        super.initActionBar(true, R.string.add_device_guide_me_title);
        TextView textView = (TextView) findViewById(R.id.text_one);
        String str = getString(R.string.go_to_bluetooth_Settings_part_one_message) + StringUtils.SPACE;
        String string = getString(R.string.go_to_bluetooth_Settings_part_two_message);
        String strG = e5.g(str, string, StringUtils.SPACE + getString(R.string.go_to_bluetooth_Settings_part_three_message));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(strG, TextView.BufferType.SPANNABLE);
        ((Spannable) textView.getText()).setSpan(new a(this, 0), str.length(), string.length() + str.length(), 33);
        ((AppCompatButton) findViewById(R.id.add_device)).setOnClickListener(this);
    }

    public class a extends ClickableSpan {
        private a() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view2) {
            Intent intent = new Intent();
            intent.setAction("android.settings.BLUETOOTH_SETTINGS");
            AddGarminDeviceGuide.this.startActivity(intent);
        }

        public /* synthetic */ a(AddGarminDeviceGuide addGarminDeviceGuide, int i14) {
            this();
        }
    }
}
