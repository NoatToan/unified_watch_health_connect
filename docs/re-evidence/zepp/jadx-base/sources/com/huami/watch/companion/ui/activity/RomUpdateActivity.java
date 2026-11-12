package com.huami.watch.companion.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import com.huami.watch.companion.R;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.otaphone.service.OtaModel;
import com.huami.watch.companion.transport.CompanionModule;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes16.dex */
public class RomUpdateActivity extends Activity {
    public static final String KEY_INFO = "info";
    public static final String KEY_VER = "ver";
    private static final String c = "RomUpdateActivity";
    private TextView a;
    private TextView b;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RomUpdateActivity.this.onBackPressed();
        }
    }

    private void a() {
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.actionbar);
        actionbarLayout.setTitleText(getString(R.string.watch_rom_upgrade));
        actionbarLayout.setBackArrowClickListener(new a());
        this.a = (TextView) findViewById(R.id.tv_rom_update_ver);
        this.b = (TextView) findViewById(R.id.tv_rom_update_info);
        this.a.setText(getIntent().getStringExtra("ver"));
        this.b.setText(getIntent().getStringExtra("info"));
    }

    public static void to(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) RomUpdateActivity.class);
        intent.putExtra("ver", str);
        intent.putExtra("info", str2);
        context.startActivity(intent);
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_rom_update);
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        a();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
    }

    public void onRomUpdateClick(View view) {
        Device currentDevice = DeviceManager.getManager(this).getCurrentDevice();
        if (currentDevice == null || !currentDevice.isConnected()) {
            Toast.makeText(this, R.string.device_disconnected, 0).show();
            return;
        }
        if (DeviceSource.isSeriesEverest2(currentDevice)) {
            Transporter.get(this, "com.huami.watch.companion").send(CompanionModule.ACTION_OTA);
            return;
        }
        OtaModel otaModel = OtaModel.getInstance(getApplicationContext());
        if (!otaModel.IsOtaLinkConnect()) {
            Log.d(c, "ota channel disconnected", new Object[0]);
        } else {
            Log.d(c, "send rom upgrade auto cmd", new Object[0]);
            otaModel.sendCmd2watch("rom_upgrade_auto");
        }
    }
}
