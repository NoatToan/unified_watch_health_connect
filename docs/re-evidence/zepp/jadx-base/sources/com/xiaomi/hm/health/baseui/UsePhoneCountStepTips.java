package com.xiaomi.hm.health.baseui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.keeper.HMKeeper;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes19.dex */
public class UsePhoneCountStepTips extends BaseTitleActivity {
    private static final Lazy<DeviceManagerApi> y = KoinJavaComponent.inject(DeviceManagerApi.class);
    private TextView x = null;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            UsePhoneCountStepTips.this.finish();
        }
    }

    private void initView() {
        TextView textView = (TextView) findViewById(R.id.gotIt);
        this.x = textView;
        textView.setOnClickListener(new a());
    }

    public static void show(Context context) {
        if (!y.getValue().hasBound(HMDeviceType.SENSORHUB) || HMKeeper.hasShowSensorhubTips()) {
            return;
        }
        HMKeeper.setHasShowSensorhubTips(true);
        context.startActivity(new Intent(context, (Class<?>) UsePhoneCountStepTips.class));
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.use_phone_layout);
        setStyle(BaseTitleActivity.STYLE.NONE, getResources().getColor(R.color.pale_grey_two), true);
        initView();
    }
}
