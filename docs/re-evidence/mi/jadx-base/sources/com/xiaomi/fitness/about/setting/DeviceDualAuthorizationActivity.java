package com.xiaomi.fitness.about.setting;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.xiaomi.fitness.about.DeviceDualAuthorizationViewModel;
import com.xiaomi.fitness.about.setting.DeviceDualAuthorizationActivity;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.li0;
import defpackage.lzi;
import defpackage.vv1;
import defpackage.yti;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/about/setting/DeviceDualAuthorizationActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/about/DeviceDualAuthorizationViewModel;", "Lli0;", "", "showDualAuthorizationSwitchDialog", "()V", "showSportHealthCloudSyncSwitchDialog", "startSportHealthServiceActivity", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "dualAuthorizationSwitchDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "sportHealthCloudSyncSwitchDialog", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "about_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceDualAuthorizationActivity extends Hilt_DeviceDualAuthorizationActivity<DeviceDualAuthorizationViewModel, li0> {

    @NotNull
    public static final String SWITCH_CLOSE = "1";

    @NotNull
    public static final String SWITCH_OPEN = "0";

    @NotNull
    public static final String TAG = "DeviceDualAuthorizationActivity";

    @Nullable
    private CommonDialog<?> dualAuthorizationSwitchDialog;

    @Nullable
    private CommonDialog<?> sportHealthCloudSyncSwitchDialog;

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ DeviceDualAuthorizationViewModel access$getMViewModel(DeviceDualAuthorizationActivity deviceDualAuthorizationActivity) {
        return (DeviceDualAuthorizationViewModel) deviceDualAuthorizationActivity.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$0(DeviceDualAuthorizationActivity this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((li0) this$0.getMBinding()).B.setSwitch(!z);
        if (!NetworkExtKt.isNetworkAvailable()) {
            ToastUtil.INSTANCE.showToast(lzi.f25587r);
            return;
        }
        if (!z) {
            this$0.showDualAuthorizationSwitchDialog();
            return;
        }
        Logger.d(TAG, "CHECK is " + z);
        if (RegionPreference.INSTANCE.getSyncWeb()) {
            ((DeviceDualAuthorizationViewModel) this$0.getMViewModel()).setCommonConfig("0");
        } else {
            this$0.showSportHealthCloudSyncSwitchDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$1(DeviceDualAuthorizationActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "dualAuthorizationSwitch is " + bool);
        RegionPreference.INSTANCE.setHEALTH_DEVICE_ACCESS_SWITCH(bool.booleanValue());
        SwitchButtonBindingTwoLineTextView switchButtonBindingTwoLineTextView = ((li0) this$0.getMBinding()).B;
        Intrinsics.checkNotNull(bool);
        switchButtonBindingTwoLineTextView.setSwitch(bool.booleanValue());
        ((DeviceDualAuthorizationViewModel) this$0.getMViewModel()).updateDeviceList(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$2(DeviceDualAuthorizationActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (RegionPreference.INSTANCE.getHEALTH_DEVICE_ACCESS_SWITCH()) {
            ((li0) this$0.getMBinding()).F.setVisibility(0);
            ImageView ivEmpty = ((li0) this$0.getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(ivEmpty, "ivEmpty");
            Intrinsics.checkNotNull(bool);
            ViewExtKt.setVisible(ivEmpty, bool.booleanValue());
            TextView tvEmpty = ((li0) this$0.getMBinding()).G;
            Intrinsics.checkNotNullExpressionValue(tvEmpty, "tvEmpty");
            ViewExtKt.setVisible(tvEmpty, bool.booleanValue());
        } else {
            TextView tvDeviceList = ((li0) this$0.getMBinding()).F;
            Intrinsics.checkNotNullExpressionValue(tvDeviceList, "tvDeviceList");
            ViewExtKt.setVisible(tvDeviceList, false);
            ImageView ivEmpty2 = ((li0) this$0.getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(ivEmpty2, "ivEmpty");
            ViewExtKt.setVisible(ivEmpty2, false);
            TextView tvEmpty2 = ((li0) this$0.getMBinding()).G;
            Intrinsics.checkNotNullExpressionValue(tvEmpty2, "tvEmpty");
            ViewExtKt.setVisible(tvEmpty2, false);
        }
        return Unit.INSTANCE;
    }

    private final void showDualAuthorizationSwitchDialog() {
        if (this.dualAuthorizationSwitchDialog == null) {
            CommonDialog<?> commonDialogCreate = new CommonDialog.c("dualAuthorizationSwitchDialog").setDialogTitle(lzi.Z).setDialogDescription(lzi.Y).setPositiveText(lzi.i).setNegativeText(lzi.d).setCancelable(false).create();
            this.dualAuthorizationSwitchDialog = commonDialogCreate;
            if (commonDialogCreate != null) {
                commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.about.setting.DeviceDualAuthorizationActivity.showDualAuthorizationSwitchDialog.1
                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        if (which == -2) {
                            if (dialog != null) {
                                dialog.dismiss();
                            }
                        } else {
                            if (which != -1) {
                                return;
                            }
                            DeviceDualAuthorizationActivity.access$getMViewModel(DeviceDualAuthorizationActivity.this).setCommonConfig("1");
                            if (dialog != null) {
                                dialog.dismiss();
                            }
                        }
                    }
                });
            }
        }
        CommonDialog<?> commonDialog = this.dualAuthorizationSwitchDialog;
        if (commonDialog != null) {
            commonDialog.showIfNeed(getSupportFragmentManager());
        }
    }

    private final void showSportHealthCloudSyncSwitchDialog() {
        if (this.sportHealthCloudSyncSwitchDialog == null) {
            CommonDialog<?> commonDialogCreate = new CommonDialog.c("sportHealthCloudSyncSwitchDialog").setDialogTitle(lzi.g0).setDialogDescription(lzi.f0).setPositiveText(lzi.h0).setNegativeText(lzi.d).setCancelable(false).create();
            this.sportHealthCloudSyncSwitchDialog = commonDialogCreate;
            if (commonDialogCreate != null) {
                commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.about.setting.DeviceDualAuthorizationActivity.showSportHealthCloudSyncSwitchDialog.1
                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        if (which == -2) {
                            DeviceDualAuthorizationActivity.access$getMViewModel(DeviceDualAuthorizationActivity.this).setCommonConfig("0");
                            if (dialog != null) {
                                dialog.dismiss();
                                return;
                            }
                            return;
                        }
                        if (which != -1) {
                            return;
                        }
                        DeviceDualAuthorizationActivity.this.startSportHealthServiceActivity();
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                    }
                });
            }
        }
        CommonDialog<?> commonDialog = this.sportHealthCloudSyncSwitchDialog;
        if (commonDialog != null) {
            commonDialog.showIfNeed(getSupportFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startSportHealthServiceActivity() {
        startForActivityResult(new Intent(this, (Class<?>) SportHealthServiceActivity.class), new Function2() { // from class: u36
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DeviceDualAuthorizationActivity.startSportHealthServiceActivity$lambda$3(this.f35331a, ((Integer) obj).intValue(), (Intent) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit startSportHealthServiceActivity$lambda$3(DeviceDualAuthorizationActivity this$0, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((DeviceDualAuthorizationViewModel) this$0.getMViewModel()).setCommonConfig("0");
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return yti.g;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return vv1.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.about.setting.Hilt_DeviceDualAuthorizationActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getString(lzi.c0));
        ((li0) getMBinding()).B.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: r36
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                DeviceDualAuthorizationActivity.onCreate$lambda$0(this.f32132a, z, iSwitchButton);
            }
        });
        ((DeviceDualAuthorizationViewModel) getMViewModel()).getDualAuthorizationSwitch().observe(this, new DeviceDualAuthorizationActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: s36
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceDualAuthorizationActivity.onCreate$lambda$1(this.f33229a, (Boolean) obj);
            }
        }));
        ((DeviceDualAuthorizationViewModel) getMViewModel()).getDeviceIsEmpty().observe(this, new DeviceDualAuthorizationActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: t36
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceDualAuthorizationActivity.onCreate$lambda$2(this.f34257a, (Boolean) obj);
            }
        }));
        ((DeviceDualAuthorizationViewModel) getMViewModel()).updateDeviceList(true);
        ((DeviceDualAuthorizationViewModel) getMViewModel()).getCommonConfig();
    }
}
