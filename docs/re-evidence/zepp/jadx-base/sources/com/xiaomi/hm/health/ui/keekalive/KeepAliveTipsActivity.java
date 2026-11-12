package com.xiaomi.hm.health.ui.keekalive;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMDeviceUtils;

/* JADX INFO: loaded from: classes22.dex */
public class KeepAliveTipsActivity extends BaseTitleActivity {
    private void init() {
        findViewById(R.id.keep_alive_tips_cancel).setOnClickListener(new View.OnClickListener() { // from class: zk4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.n(view);
            }
        });
        findViewById(R.id.keep_alive_tips_setting).setOnClickListener(new View.OnClickListener() { // from class: yk4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.o(view);
            }
        });
        TextView textView = (TextView) findViewById(R.id.keep_alive_tips_describe);
        ImageView imageView = (ImageView) findViewById(R.id.keep_alive_tips_dev);
        HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        if (hMDeviceManager.hasBound(hMDeviceType)) {
            if (HMDeviceConfig.hasBoundWatch()) {
                textView.setText(getString(R.string.keep_alive_tips_describe, new Object[]{getString(R.string.device_watch)}));
            } else {
                textView.setText(getString(R.string.keep_alive_tips_describe, new Object[]{getString(R.string.device_band)}));
            }
            HMDeviceUtils.updateDeviceImg(imageView, HMDeviceManager.getInstance().getBoundDeviceSource(hMDeviceType));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(View view) {
        startActivity(new Intent(this, (Class<?>) KeepAliveActivity.class));
        finish();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(2132017904);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keep_alive_tips);
        setStyle(BaseTitleActivity.STYLE.NONE, ContextCompat.getColor(this, R.color.pale_grey_two), !RainbowUtils.isDarkMode(this));
        init();
    }
}
