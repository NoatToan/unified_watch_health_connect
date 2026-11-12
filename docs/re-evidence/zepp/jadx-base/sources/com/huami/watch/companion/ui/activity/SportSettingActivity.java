package com.huami.watch.companion.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.huami.watch.companion.R;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.intervalrun.ui.IntervalTrainingActivity;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.companion.ui.view.SettingItemView;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes16.dex */
public class SportSettingActivity extends Activity {
    private static final String d = "SportSettingActivity";
    private SettingItemView a;
    private SettingItemView b;
    private Device c;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SportSettingActivity sportSettingActivity = SportSettingActivity.this;
            SportSortV2Activity.to(sportSettingActivity, sportSettingActivity.c.info().getHuamiModel(), DeviceUtil.isRomSupportHideSportItem(SportSettingActivity.this.c));
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(SportSettingActivity.this, (Class<?>) IntervalTrainingActivity.class);
            intent.addFlags(536870912);
            SportSettingActivity.this.startActivity(intent);
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SportSettingActivity.this.onBackPressed();
        }
    }

    private void b() {
        this.a = (SettingItemView) findViewById(R.id.sport_sort);
        this.b = (SettingItemView) findViewById(R.id.interval_training);
        this.a.showIcon(false);
        this.b.showIcon(false);
        if (!DeviceUtil.isRomSupportIntervalRun(this.c)) {
            this.b.setVisibility(8);
        }
        this.a.setOnClickListener(new a());
        this.b.setOnClickListener(new b());
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.actionbar);
        actionbarLayout.setTitleText(getString(R.string.sport));
        actionbarLayout.setBackArrowClickListener(new c());
    }

    public static void start(Context context) {
        Intent intent = new Intent(context, (Class<?>) SportSettingActivity.class);
        intent.addFlags(536870912);
        context.startActivity(intent);
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_sport_setting);
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        String stringExtra = getIntent().getStringExtra(BaseDeviceStatusActivity.KEY_DEVICE);
        DeviceManager manager = DeviceManager.getManager(this);
        if (TextUtils.isEmpty(stringExtra)) {
            Device currentDevice = manager.getCurrentDevice();
            this.c = currentDevice;
            if (currentDevice == null && manager.getAllCount() > 0) {
                this.c = manager.getAll().get(0);
            }
        } else {
            this.c = manager.find(stringExtra);
        }
        if (this.c != null) {
            b();
            return;
        }
        Log.w(d, "No Device for : " + stringExtra + ", Abort!!", new Object[0]);
    }
}
