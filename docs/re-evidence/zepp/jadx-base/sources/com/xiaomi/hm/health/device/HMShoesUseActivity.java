package com.xiaomi.hm.health.device;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMShoesUseActivity extends BaseTitleActivity {
    private boolean x = false;
    private final Lazy<DeviceManagerApi> y = KoinJavaComponent.inject(DeviceManagerApi.class);
    private final Lazy<DeviceXNavigator> z = KoinJavaComponent.inject(DeviceXNavigator.class);

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HMShoesUseActivity.this.finish();
            ((DeviceXNavigator) HMShoesUseActivity.this.z.getValue()).startHMShoesCalibrateActivity(HMShoesUseActivity.this, 1, null);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(HMShoesUseActivity.this, (Class<?>) InstallNormandyActivity.class);
            intent.putExtra(InstallNormandyActivity.EXTRA, !HMShoesUseActivity.this.x);
            HMShoesUseActivity.this.startActivity(intent);
            HMShoesUseActivity.this.finish();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_shoes_use);
        this.x = getIntent().getBooleanExtra(InstallNormandyActivity.EXTRA, false);
        setStyle(BaseTitleActivity.STYLE.NONE, ContextCompat.getColor(this, R.color.pale_grey_two), true);
        int i = R.id.shoes_use_ok_btn;
        findViewById(i).setOnClickListener(new a());
        HMDeviceSource boundDeviceSource = this.y.getValue().getBoundDeviceSource(HMDeviceType.SHOES);
        if (boundDeviceSource == HMDeviceSource.SHOES_CHILD) {
            ((TextView) findViewById(R.id.shoes_use_tips)).setText(R.string.shoes_use_tips_child);
        } else if (boundDeviceSource != HMDeviceSource.SHOES && boundDeviceSource == HMDeviceSource.SHOES_MARS) {
            TextView textView = (TextView) findViewById(R.id.shoes_use_tips);
            if (textView != null) {
                textView.setTextSize(12.7f);
                textView.setText(R.string.put_normandy_in_shoes_tips);
            }
            TextView textView2 = (TextView) findViewById(i);
            if (textView2 != null) {
                textView2.setText(R.string.put_done);
                textView2.setOnClickListener(new b());
            }
        } else {
            ((TextView) findViewById(R.id.shoes_use_tips)).setText(R.string.shoes_use_tips);
        }
        ((TextView) findViewById(R.id.shoes_use_title)).setText(String.format(getString(R.string.shoes_use_title, new Object[]{getString(R.string.chip_device_name)}), new Object[0]));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        return this.x || super.onKeyDown(i, keyEvent);
    }
}
