package com.xiaomi.hm.health.thirdbind;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.StringRes;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.milipro.model.BlePairMode;
import com.xiaomi.hm.health.bt.profile.milipro.model.BlePairStatus;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.speech.speech.ui.DialogUtilsKt;
import com.xiaomi.hm.health.thirdbind.AlexaPairTipsActivity;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\u000b\u001a\u00020\u0002H\u0014R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/thirdbind/AlexaPairTipsActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "initView", "", "tips", GoogleApiAvailabilityLight.b, "hideLoadingDialog", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "", "x", "Z", "fromBluetoothSetting", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "y", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AlexaPairTipsActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private boolean fromBluetoothSetting;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mLoadingDialog;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "go to bluetooth setting: " + this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideLoadingDialog() {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog != null) {
            if (loadingDialog != null) {
                loadingDialog.dismiss();
            }
            this.mLoadingDialog = null;
        }
    }

    private final void initView() {
        String deviceDescription = HMDeviceUtils.getDeviceDescription(HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI));
        TextView textView = (TextView) findViewById(R.id.alexa_text_3);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        textView.setText(String.format(getString(R.string.alexa_pair_content_3), Arrays.copyOf(new Object[]{deviceDescription}, 1)));
        ((TextView) findViewById(R.id.device_name_tv)).setText(deviceDescription);
        ((TextView) findViewById(R.id.alexa_text_5)).setText(String.format(getString(R.string.alexa_pair_content_8), Arrays.copyOf(new Object[]{deviceDescription}, 1)));
        ((TextView) findViewById(R.id.go_to_bluetooth_setting_btn)).setOnClickListener(new View.OnClickListener() { // from class: cc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AlexaPairTipsActivity.m(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(AlexaPairTipsActivity alexaPairTipsActivity, View view) {
        Object objM3845constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            alexaPairTipsActivity.startActivity(new Intent("android.settings.BLUETOOTH_SETTINGS"));
            alexaPairTipsActivity.fromBluetoothSetting = true;
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = kotlin.Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl == null) {
            return;
        }
        HMLog.info$default(null, new a(thM3848exceptionOrNullimpl), 1, null);
    }

    private final void n(@StringRes int tips) {
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(tips));
        this.mLoadingDialog = loadingDialogShowDialog;
        if (loadingDialogShowDialog != null) {
            loadingDialogShowDialog.setCancelable(false);
        }
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.show();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alexa_pair_tips);
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, -1, getString(R.string.alexa_pair_title), true);
        initView();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.fromBluetoothSetting) {
            this.fromBluetoothSetting = false;
            HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
            HMMiLiProDevice hMMiLiProDevice = device instanceof HMMiLiProDevice ? (HMMiLiProDevice) device : null;
            if (hMMiLiProDevice == null) {
                return;
            }
            n(R.string.wait);
            hMMiLiProDevice.getBlePairStatus(new HMCallback<BlePairStatus>() { // from class: com.xiaomi.hm.health.thirdbind.AlexaPairTipsActivity.onResume.1
                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public void onFinish(@Nullable BlePairStatus blePairStatus) {
                    AlexaPairTipsActivity.this.hideLoadingDialog();
                    if (blePairStatus != null && blePairStatus.getPaired() && blePairStatus.getPairMode() == BlePairMode.SECURE_CONNECT) {
                        DialogUtilsKt.gotoAlexaAuthPage(AlexaPairTipsActivity.this);
                        AlexaPairTipsActivity.this.finish();
                    }
                }
            });
        }
    }
}
