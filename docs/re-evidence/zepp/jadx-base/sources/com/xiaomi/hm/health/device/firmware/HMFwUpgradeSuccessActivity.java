package com.xiaomi.hm.health.device.firmware;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.huami.devicex.R;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.ui.UnifyTitleBarStyle;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMFwUpgradeSuccessActivity extends BaseTitleActivity {
    private static final int A = 3000;
    private HMDeviceSource x = HMDeviceSource.VDEVICE;
    private Handler y = new Handler();
    private final Lazy<DeviceUtilsApi> z = KoinJavaComponent.inject(DeviceUtilsApi.class);

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HMDeviceType.values().length];
            a = iArr;
            try {
                iArr[HMDeviceType.MILI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[HMDeviceType.TREADMILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[HMDeviceType.SHOES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[HMDeviceType.WATCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[HMDeviceType.WEIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[HMDeviceType.EARBUD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[HMDeviceType.OTHER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[HMDeviceType.HEADSET.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private void initView() {
        ((TextView) findViewById(R.id.activity_fw_upgrade_success_info_2)).setText(getString(R.string.activity_fw_upgrade_success_info_2, new Object[]{m(this.x)}));
        o();
    }

    private String m(HMDeviceSource hMDeviceSource) {
        switch (a.a[hMDeviceSource.getType().ordinal()]) {
            case 1:
                return HMDeviceConfig.hasBoundWatch() ? getString(R.string.device_watch) : getString(R.string.device_band);
            case 2:
                return getString(R.string.device_treadmill);
            case 3:
                return getString(R.string.chip_device_name);
            case 4:
                return getString(R.string.device_watch);
            case 5:
                return HMDeviceConfig.isBfs(hMDeviceSource) ? getString(R.string.weight_bfs) : getString(R.string.device_weight);
            case 6:
                return getString(R.string.device_earbud);
            case 7:
                return getString(R.string.smart_module);
            case 8:
                return getString(R.string.device_headset);
            default:
                return getString(R.string.device_band);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        if (isFinishing()) {
            return;
        }
        finish();
    }

    private void o() {
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R.id.activity_fw_upgrade_success_img);
        if (ConfigHelperKt.hasFeature(Feature.HEADSET_MOZART_SOURCE_S, this.x)) {
            appCompatImageView.setImageResource(R.drawable.img_dfu);
            return;
        }
        int imageForDevice = this.z.getValue().getImageForDevice(this.x);
        if (imageForDevice > 0) {
            appCompatImageView.setImageResource(imageForDevice);
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.activity_fw_upgrade_success);
        UnifyTitleBarStyle.setUnifyTitleStyle(this, BaseTitleActivity.STYLE.NONE, "");
        this.x = HMDeviceSource.fromValue(getIntent().getIntExtra("device_source", HMDeviceSource.MILI.getValue()));
        initView();
        this.y.postDelayed(new Runnable() { // from class: fw2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.n();
            }
        }, 3000L);
    }
}
