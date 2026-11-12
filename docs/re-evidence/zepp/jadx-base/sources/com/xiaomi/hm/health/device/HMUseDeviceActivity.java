package com.xiaomi.hm.health.device;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.huami.devicex.R;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.lib.view.ViewUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.companion.bind.BindUtil;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseui.BaseTitleBarExtKt;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.bind.BindServiceApi;
import com.xiaomi.hm.health.device.bind.HMBindBaseLogic;
import com.xiaomi.hm.health.device.event.BindNotUseEvent;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import de.greenrobot.event.EventBus;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMUseDeviceActivity extends BaseTitleActivity {
    private static final String A = "db_device";
    private Device x;
    private final Lazy<BindServiceApi> y = KoinJavaComponent.inject(BindServiceApi.class);
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
                a[HMDeviceType.WATCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[HMDeviceType.SHOES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[HMDeviceType.WEIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(HMBaseDevice hMBaseDevice, View view) {
        if (hMBaseDevice != null) {
            hMBaseDevice.destroy();
        }
        if (this.x.getDevice_type().intValue() == HMDeviceType.WATCH.getValue()) {
            BindUtil.disconnectDevice(this.x.getDevice_address());
            BindUtil.connectCurrentDevice(this);
        }
        finish();
        ((DeviceXNavigator) KoinJavaComponent.get(DeviceXNavigator.class)).navigateToUnused(this, this.x);
        EventBus.getDefault().post(new BindNotUseEvent(HMDeviceSource.fromValue(this.x.getDevice_source().intValue())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(HMBaseDevice hMBaseDevice, View view) {
        if (NetUtil.isNetworkConnected(this)) {
            this.y.getValue().startUseDevice(this, this.x, hMBaseDevice, true);
        } else {
            IconToast.showError(this, getString(R.string.no_network_connection));
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0037  */
    private void p() {
        ImageView imageView = (ImageView) findViewById(R.id.new_device_img);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        int i = a.a[HMDeviceType.fromValue(this.x.getDevice_type().intValue()).ordinal()];
        int i2 = 0;
        if (i != 1) {
            if (i == 2 || i == 3) {
                i2 = 10;
            } else if (i == 4) {
                i2 = 20;
            }
        } else if (HMDeviceConfig.isWatch(HMDeviceSource.fromValue(this.x.getDevice_source().intValue()))) {
            i2 = 10;
        }
        layoutParams.setMarginStart((int) ViewUtils.dp2px(this, i2));
        imageView.setLayoutParams(layoutParams);
    }

    public static void start(Context context, Device device) {
        Intent intent = new Intent(context, (Class<?>) HMUseDeviceActivity.class);
        intent.putExtra("db_device", device);
        context.startActivity(intent);
    }

    public static void startNewTask(Context context, Device device) {
        Intent intent = new Intent(context, (Class<?>) HMUseDeviceActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("db_device", device);
        context.startActivity(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1024) {
            finish();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView(R.layout.activity_use_device);
        BaseTitleBarExtKt.setTitleBar(this, "", null, R.color.s10, BaseTitleActivity.STYLE.NONE);
        this.x = (Device) getIntent().getSerializableExtra("db_device");
        TextView textView = (TextView) findViewById(R.id.left_btn);
        TextView textView2 = (TextView) findViewById(R.id.right_btn);
        textView.setText(R.string.not_use);
        textView2.setText(R.string.use);
        final HMBaseDevice bleDevice = HMBindBaseLogic.getBleDevice();
        textView.setOnClickListener(new View.OnClickListener() { // from class: ho3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.n(bleDevice, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: io3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.o(bleDevice, view);
            }
        });
        TextView textView3 = (TextView) findViewById(R.id.sub_title_tv);
        int i2 = a.a[HMDeviceType.fromValue(this.x.getDevice_type().intValue()).ordinal()];
        if (i2 == 1 || i2 == 2) {
            i = R.string.use_now_tips_band_watch;
        } else if (i2 != 3) {
            i = i2 != 4 ? -1 : R.string.use_now_tips_weight;
        } else {
            i = R.string.use_now_tips_shoes;
        }
        if (i != -1) {
            textView3.setText(i);
        }
        this.z.getValue().updateDeviceImg((ImageView) findViewById(R.id.device_img), HMDeviceSource.fromValue(this.x.getDevice_source().intValue()));
        p();
    }
}
