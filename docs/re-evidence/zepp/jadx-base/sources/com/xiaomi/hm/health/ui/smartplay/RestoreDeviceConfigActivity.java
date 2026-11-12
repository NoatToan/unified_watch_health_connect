package com.xiaomi.hm.health.ui.smartplay;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.baseui.BaseTitleBarExtKt;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeManager;
import com.xiaomi.hm.health.device.introduce.RestoreItem;
import com.xiaomi.hm.health.device.introduce.recocver.RestoreParserKt;
import com.xiaomi.hm.health.device.introduce.recocver.RestoreTask;
import com.xiaomi.hm.health.device.view.HMLoadingView;
import com.xiaomi.hm.health.ui.smartplay.RestoreDeviceConfigActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.koin.core.parameter.ParametersHolder;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes22.dex */
public class RestoreDeviceConfigActivity extends BaseTitleActivity {
    private static final String A = "restoreItem";
    private static final String y = "RestoreDeviceConfigActivity";
    private static final String z = "deviceSource";
    private HMDeviceSource x = HMDeviceSource.VDEVICE;

    private void initViews() {
        TextView textView = (TextView) findViewById(R.id.restore_title_tv);
        HMDeviceUtils.updateDeviceImg((ImageView) findViewById(R.id.device_img), this.x);
        textView.setText(getString(R.string.restore_device_title, new Object[]{getString(HMDeviceConfig.isWatch(this.x) ? R.string.device_watch : R.string.device_band)}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String n(HMDeviceType hMDeviceType) {
        return "hmDeviceType:" + hMDeviceType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ParametersHolder o(List list) {
        return new ParametersHolder(Arrays.asList(this.x, list, this));
    }

    private void p() {
        final ArrayList<RestoreItem> arrayListFromConfigStr = RestoreParserKt.fromConfigStr(getIntent().getStringExtra(A), this.x, this);
        ((RestoreTask) KoinJavaComponent.get(RestoreTask.class, null, new Function0() { // from class: ke6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.o(arrayListFromConfigStr);
            }
        })).work();
    }

    public static void start(Context context, HMDeviceSource deviceSource) {
        start(context, deviceSource, RestoreParserKt.DEVICE_RESTORE_CONFIG);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        setTheme(2132017904);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restore_device_config);
        BaseTitleBarExtKt.setTitleBar(this, "", null, R.color.s10, BaseTitleActivity.STYLE.NONE);
        HMFwUpgradeManager.addIgnoreActivity(getClass());
        HMLoadingView hMLoadingView = (HMLoadingView) findViewById(R.id.restore_loading_view);
        hMLoadingView.setStyle(1);
        hMLoadingView.startLoading();
        if (GlobalConfig.get().isBuildMidong()) {
            hMLoadingView.setProgressColor(ContextCompat.getColor(this, R.color.p4));
        }
        HMDeviceSource hMDeviceSource = (HMDeviceSource) getIntent().getSerializableExtra("deviceSource");
        this.x = hMDeviceSource;
        final HMDeviceType type = hMDeviceSource.getType();
        initViews();
        HMLog.debug(y, new Function0() { // from class: je6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RestoreDeviceConfigActivity.n(type);
            }
        });
        p();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == 4) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    public static void start(Context context, HMDeviceSource deviceSource, String restoreItems) {
        Intent intent = new Intent(context, (Class<?>) RestoreDeviceConfigActivity.class);
        intent.putExtra("deviceSource", deviceSource);
        intent.putExtra(A, restoreItems);
        context.startActivity(intent);
    }
}
