package com.xiaomi.fitness.devicesettings.base.about;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.fragment.app.FragmentActivity;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.about.DeviceInfoFragment;
import com.xiaomi.fitness.devicesettings.base.about.DeviceInfoModel;
import com.xiaomi.fitness.devicesettings.base.cta.DeviceInstallAPPDebugFragment;
import com.xiaomi.fitness.devicesettings.di.DeviceSettingsPageExtKt;
import com.xiaomi.fitness.devicesettings.utils.Constants;
import com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.privacy.export.PrivacyHelper;
import com.xiaomi.fitness.privacy.export.PrivacyHelperPointKt;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import defpackage.av6;
import defpackage.bw1;
import defpackage.eui;
import defpackage.fli;
import defpackage.kj6;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b,\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0016\u0010\u0006J\u0013\u0010\u0017\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/about/DeviceInfoFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/base/about/DeviceInfoViewModel;", "Lkj6;", "", "initContentView", "()V", "deauthorize", "onTitleBarClicked", "clearCacheAndGoHome", "", "msg", "showUnbindTipsDialog", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "bindView", "(Lkj6;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "deleteSuccessDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "", "dumpDebug", "Z", "", "debugClickCount", "I", "", "debugClickTime", "J", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDeviceInfoFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInfoFragment.kt\ncom/xiaomi/fitness/devicesettings/base/about/DeviceInfoFragment\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,212:1\n54#2,3:213\n24#2:216\n57#2,6:217\n63#2,2:224\n57#3:223\n*S KotlinDebug\n*F\n+ 1 DeviceInfoFragment.kt\ncom/xiaomi/fitness/devicesettings/base/about/DeviceInfoFragment\n*L\n84#1:213,3\n84#1:216\n84#1:217,6\n84#1:224,2\n84#1:223\n*E\n"})
public final class DeviceInfoFragment extends BaseBindingFragment<DeviceInfoViewModel, kj6> {
    private int debugClickCount;
    private long debugClickTime;

    @Nullable
    private CommonDialog<?> deleteSuccessDialog;

    @Nullable
    private WearableDeviceModel deviceModel;
    private boolean dumpDebug;

    public DeviceInfoFragment() {
        super(eui.L0, bw1.f);
        this.debugClickTime = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$10(DeviceInfoFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragmentExKt.gotoPage(this$0, DeviceInstallAPPDebugFragment.class, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearCacheAndGoHome() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        MainExtKt.showMainActivity$default(contextRequireContext, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deauthorize() {
        if (this.deviceModel != null) {
            WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
            WearableDeviceModel wearableDeviceModel = this.deviceModel;
            Intrinsics.checkNotNull(wearableDeviceModel);
            deviceManagerExtKt.deauthorize(wearableDeviceModel.getDid(), new Function0() { // from class: g66
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceInfoFragment.deauthorize$lambda$13$lambda$11(this.f18645a);
                }
            }, new Function1() { // from class: h66
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeviceInfoFragment.deauthorize$lambda$13$lambda$12(this.f19735a, ((Integer) obj).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deauthorize$lambda$13$lambda$11(DeviceInfoFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.clearCacheAndGoHome();
        PrivacyHelper privacyHelperPointKt = PrivacyHelperPointKt.getInstance(PrivacyHelper.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        privacyHelperPointKt.startPassportWebActivity(fragmentActivityRequireActivity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deauthorize$lambda$13$lambda$12(DeviceInfoFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(BaseFragment.TAG, "deauthorize failure " + i);
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            ToastExtKt.toastShort(mActivity, wzi.S6);
        }
        String string = this$0.getString(wzi.A9);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this$0.showUnbindTipsDialog(string);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initContentView() {
        getMBinding().K.setVisibility(this.dumpDebug ? 0 : 8);
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        boolean zIsSupportFeature = wearableDeviceModel != null ? DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "privacy_policy") : false;
        Logger.i(BaseFragment.TAG, "privacyShow = " + zIsSupportFeature);
        getMBinding().G.setVisibility(zIsSupportFeature ? 0 : 8);
        getMBinding().M.setVisibility(zIsSupportFeature ? 0 : 8);
        WearableDeviceModel wearableDeviceModel2 = this.deviceModel;
        Intrinsics.checkNotNull(wearableDeviceModel2);
        if (DeviceModelExtKt.isWearOS(wearableDeviceModel2)) {
            getMBinding().I.setVisibility(0);
        }
        ImageView deviceImageview = getMBinding().B;
        Intrinsics.checkNotNullExpressionValue(deviceImageview, "deviceImageview");
        WearableDeviceModel wearableDeviceModel3 = this.deviceModel;
        Intrinsics.checkNotNull(wearableDeviceModel3);
        Coil.imageLoader(deviceImageview.getContext()).enqueue(new ImageRequest.Builder(deviceImageview.getContext()).data(DeviceModelExtKt.getPreviewIcon(wearableDeviceModel3)).target(deviceImageview).build());
        PageState.DefaultImpls.showLoading$default(this, null, 0, true, 3, null);
        ((DeviceInfoViewModel) getMViewModel()).loadDeviceInfo();
    }

    private final synchronized void onTitleBarClicked() {
        try {
            if (this.dumpDebug) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.debugClickTime > 500) {
                this.debugClickCount = 0;
            }
            this.debugClickTime = jCurrentTimeMillis;
            int i = this.debugClickCount + 1;
            this.debugClickCount = i;
            if (i >= 5) {
                this.dumpDebug = true;
                DeviceSettingsPreference.INSTANCE.setDUMP_DEVICE_LOG(true);
                getMBinding().K.setVisibility(0);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(DeviceInfoFragment this$0, DeviceInfoModel deviceInfoModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$3(DeviceInfoFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Constants constants = Constants.INSTANCE;
        WearableDeviceModel wearableDeviceModel = this$0.deviceModel;
        Intrinsics.checkNotNull(wearableDeviceModel);
        WebViewUtilKt.startWebView$default(constants.getWatchAgreementUrl(DeviceModelExtKt.getModel(wearableDeviceModel)), null, false, false, null, false, null, false, 254, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$4(final DeviceInfoFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CommonDialog commonDialogCreate = new CommonDialog.c("revoke").setCancelable(false).setDialogTitle(wzi.Q6).setDialogDescription(wzi.P6).setPositiveText(wzi.R6).setNegativeText(wzi.n6).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.base.about.DeviceInfoFragment$setListener$2$1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    this.this$0.deauthorize();
                }
            }
        });
        commonDialogCreate.showIfNeed(this$0.getParentFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$5(DeviceInfoFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Constants constants = Constants.INSTANCE;
        WearableDeviceModel wearableDeviceModel = this$0.deviceModel;
        Intrinsics.checkNotNull(wearableDeviceModel);
        WebViewUtilKt.startWebView$default(constants.getWatchUserLicenceUrl(DeviceModelExtKt.getModel(wearableDeviceModel)), null, false, false, null, false, null, false, 254, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$6(DeviceInfoFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((DeviceInfoViewModel) this$0.getMViewModel()).dumpDeviceLog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$7(DeviceInfoFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onTitleBarClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$8(DeviceInfoFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DeviceSettingsPageExtKt.getDeviceSettingsPage().toWearOsLicensePage(this$0);
    }

    private final void showUnbindTipsDialog(String msg) {
        if (this.deleteSuccessDialog != null) {
            return;
        }
        CommonDialog<?> commonDialogCreate = new CommonDialog.c("").setDialogTitle(wzi.F8).setDialogDescriptionString(new DialogParams.DialogDescriptionString(msg)).setPositiveText(wzi.K1).create();
        this.deleteSuccessDialog = commonDialogCreate;
        Intrinsics.checkNotNull(commonDialogCreate);
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.base.about.DeviceInfoFragment.showUnbindTipsDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    DeviceInfoFragment.this.clearCacheAndGoHome();
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        CommonDialog<?> commonDialog = this.deleteSuccessDialog;
        Intrinsics.checkNotNull(commonDialog);
        commonDialog.showIfNeed(getParentFragmentManager());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull kj6 kj6Var) {
        String did;
        Intrinsics.checkNotNullParameter(kj6Var, "<this>");
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        if (wearableDeviceModel != null && (did = wearableDeviceModel.getDid()) != null) {
            if ((DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapabilityV2(did) & 1) == 1) {
                AppCompatImageButton deviceDebugInfoBtn = kj6Var.A;
                Intrinsics.checkNotNullExpressionValue(deviceDebugInfoBtn, "deviceDebugInfoBtn");
                ViewExtKt.visible(deviceDebugInfoBtn);
            } else {
                AppCompatImageButton deviceDebugInfoBtn2 = kj6Var.A;
                Intrinsics.checkNotNullExpressionValue(deviceDebugInfoBtn2, "deviceDebugInfoBtn");
                ViewExtKt.gone(deviceDebugInfoBtn2);
            }
        }
        kj6Var.A.setOnClickListener(new View.OnClickListener() { // from class: i66
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceInfoFragment.bindView$lambda$10(this.f20827a, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int dimensionPixelSize = AppUtil.getApp().getResources().getDimensionPixelSize(fli.e);
        getMBinding().L.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.dumpDebug = DeviceSettingsPreference.INSTANCE.getDUMP_DEVICE_LOG();
        this.deviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.w);
        if (this.deviceModel != null) {
            initContentView();
        } else {
            FragmentActivity mActivity = getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.u);
            }
            onBackPressed();
        }
        ((DeviceInfoViewModel) getMViewModel()).getDeviceInfo().observe(getViewLifecycleOwner(), new DeviceInfoFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: j66
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceInfoFragment.onViewCreated$lambda$2(this.f22458a, (DeviceInfoModel) obj);
            }
        }));
        RightArrowBindingSingleLineTextView deviceLawInfoView = getMBinding().C;
        Intrinsics.checkNotNullExpressionValue(deviceLawInfoView, "deviceLawInfoView");
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        boolean z = false;
        if (wearableDeviceModel != null && DeviceModelExtKt.isWearOS(wearableDeviceModel)) {
            z = true;
        }
        ExtUtilsKt.setVisible(deviceLawInfoView, z);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        getMBinding().G.setOnClickListener(new View.OnClickListener() { // from class: a66
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceInfoFragment.setListener$lambda$3(this.f678a, view);
            }
        });
        getMBinding().M.setOnClickListener(new View.OnClickListener() { // from class: b66
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceInfoFragment.setListener$lambda$4(this.f3848a, view);
            }
        });
        getMBinding().I.setOnClickListener(new View.OnClickListener() { // from class: c66
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceInfoFragment.setListener$lambda$5(this.f4977a, view);
            }
        });
        getMBinding().K.setOnClickListener(new View.OnClickListener() { // from class: d66
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceInfoFragment.setListener$lambda$6(this.f15128a, view);
            }
        });
        getMBinding().B.setOnClickListener(new View.OnClickListener() { // from class: e66
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceInfoFragment.setListener$lambda$7(this.f16304a, view);
            }
        });
        getMBinding().C.setOnClickListener(new View.OnClickListener() { // from class: f66
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceInfoFragment.setListener$lambda$8(this.f17454a, view);
            }
        });
    }
}
