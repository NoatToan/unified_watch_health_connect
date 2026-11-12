package com.xiaomi.hm.health.ui.smartplay;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.lib.rainbow.ListTile;
import com.huami.network.hmnetwork.properties.Property;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.smartplay.AvoidSpiteBindingActivity;
import com.xiaomi.hm.health.utils.HMPropertyUtil;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/AvoidSpiteBindingActivity;", "Lcom/xiaomi/hm/health/ui/smartplay/BaseSmartPlayActivity;", "", "msg", "", "t", "stringId", SOAP.XMLNS, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "F", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "device", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "G", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDialog", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AvoidSpiteBindingActivity extends BaseSmartPlayActivity {

    @NotNull
    private static final String H = "AvoidSpiteBindingActivity";

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    private final HMMiLiProDevice device;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog loadingDialog;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ CompoundButton a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CompoundButton compoundButton) {
            super(0);
            this.a = compoundButton;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "isPressed: " + this.a.isPressed();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "activity destroyed";
        }
    }

    public AvoidSpiteBindingActivity() {
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        Objects.requireNonNull(device, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMMiLiProDevice");
        this.device = (HMMiLiProDevice) device;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(final AvoidSpiteBindingActivity avoidSpiteBindingActivity, final CompoundButton compoundButton, final boolean z) {
        HMLog.info(H, new a(compoundButton));
        if (compoundButton.isPressed()) {
            avoidSpiteBindingActivity.t(z ? R.string.dialog_starting : R.string.dialog_closing);
            avoidSpiteBindingActivity.device.disableBind(z, new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.ui.smartplay.AvoidSpiteBindingActivity$onCreate$1$2
                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public /* bridge */ /* synthetic */ void onFinish(Boolean bool) {
                    onFinish(bool.booleanValue());
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public void onFinish(boolean result) {
                    if (!result) {
                        this.a.s(z ? R.string.mili_setting_sleep_assist_open_failed : R.string.mili_setting_sleep_assist_close_failed);
                        compoundButton.setChecked(true ^ z);
                        return;
                    }
                    LoadingDialog loadingDialog = this.a.loadingDialog;
                    if (loadingDialog != null) {
                        loadingDialog.dismiss();
                    }
                    HMPropertyUtil.setProperty(Property.PROPERTY_AVOID_SPITE_BINDING, HMDeviceUtils.toAvoidSpiteBindingStr(z));
                    HMPropertyUtil.postPropertisToServer(true);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(int stringId) {
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.setFailed(getString(stringId), 1000, null);
    }

    private final void t(int msg) {
        if (isFinishing() || isDestroyed()) {
            HMLog.error$default(H, null, null, b.a, 6, null);
            return;
        }
        if (this.loadingDialog == null) {
            this.loadingDialog = LoadingDialog.showDialog(this, getString(msg));
        }
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog != null) {
            loadingDialog.setCancelable(false);
        }
        LoadingDialog loadingDialog2 = this.loadingDialog;
        if (loadingDialog2 != null) {
            loadingDialog2.setMessage(getString(msg));
        }
        LoadingDialog loadingDialog3 = this.loadingDialog;
        if (loadingDialog3 == null) {
            return;
        }
        loadingDialog3.show();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.BaseSmartPlayActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        int i;
        super.onCreate(savedInstanceState);
        setRainbowTitleText(R.string.avoid_spite_binding_title);
        setSmartContent(R.layout.activity_avoid_spite_binding);
        if (HMDeviceManager.getInstance().hasBound(HMDeviceSource.MILI_TOKYO)) {
            i = R.drawable.img_remind_phone_and_watch_tokyo;
        } else if (ConfigHelperKt.hasMiliFeature(Feature.ROUND_WATCH_S)) {
            i = R.drawable.img_remind_phone_and_watch_pyh;
        } else {
            i = HMDeviceConfig.isWatch() ? R.drawable.img_remind_phone_and_watch : R.drawable.img_remind_phone_and_band;
        }
        setSmartImageView(i, R.drawable.img_avoid_spite_binding);
        setSmartTip(getString(R.string.avoid_spite_binding_tips_1));
        final ListTile listTile = (ListTile) findViewById(R.id.enable_item);
        listTile.setChecked(HMDeviceUtils.fromAvoidSpiteBindingStr());
        listTile.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: zk
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                AvoidSpiteBindingActivity.r(this.a, compoundButton, z);
            }
        });
        setStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.ui.smartplay.AvoidSpiteBindingActivity.onCreate.2
            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public void onEnableChange(boolean enable) {
                listTile.setEnabled(enable);
            }
        });
        TextView textView = (TextView) findViewById(R.id.tips_tv);
        if (MiuiAPI.isMiui(BraceletApp.getContext())) {
            textView.setText(R.string.avoid_spite_binding_tips_2_miui);
        }
    }
}
