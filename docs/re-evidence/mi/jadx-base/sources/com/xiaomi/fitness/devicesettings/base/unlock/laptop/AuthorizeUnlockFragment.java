package com.xiaomi.fitness.devicesettings.base.unlock.laptop;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.unlock.laptop.AuthorizeUnlockFragment;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.eui;
import defpackage.qf6;
import defpackage.wzi;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/unlock/laptop/AuthorizeUnlockFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/base/unlock/laptop/AuthorizeUnlockViewModel;", "Lqf6;", "", "showEnduranceDialog", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "getRegion", "()Ljava/lang/String;", "setListener", "Lcom/xiaomi/fitness/widget/button/ISwitchButton$a;", "onCheckedChangeCallback", "Lcom/xiaomi/fitness/widget/button/ISwitchButton$a;", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AuthorizeUnlockFragment extends BaseBindingFragment<AuthorizeUnlockViewModel, qf6> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ISwitchButton.a onCheckedChangeCallback;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/unlock/laptop/AuthorizeUnlockFragment$Companion;", "", "<init>", "()V", "getUnlockLaptopHelpUrl", "", "locale", "model", "region", "getOperationHost", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String getOperationHost(String region) {
            return "https://" + region + "watch.iot.mi.com";
        }

        @NotNull
        public final String getUnlockLaptopHelpUrl(@NotNull String locale, @NotNull String model, @NotNull String region) {
            Intrinsics.checkNotNullParameter(locale, "locale");
            Intrinsics.checkNotNullParameter(model, "model");
            Intrinsics.checkNotNullParameter(region, "region");
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%s/html/key_use_description/index.html?locale=%s&model=%s", Arrays.copyOf(new Object[]{getOperationHost(region), locale, model}, 3));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
    }

    public AuthorizeUnlockFragment() {
        super(eui.P);
        this.onCheckedChangeCallback = new ISwitchButton.a() { // from class: cr1
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                AuthorizeUnlockFragment.onCheckedChangeCallback$lambda$0(this.f14633a, z, iSwitchButton);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AuthorizeUnlockViewModel access$getMViewModel(AuthorizeUnlockFragment authorizeUnlockFragment) {
        return (AuthorizeUnlockViewModel) authorizeUnlockFragment.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCheckedChangeCallback$lambda$0(AuthorizeUnlockFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        iSwitchButton.setChecked(!z);
        if (z) {
            this$0.showEnduranceDialog();
        } else {
            ((AuthorizeUnlockViewModel) this$0.getMViewModel()).setAuthorizeUnlock(1, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$2(AuthorizeUnlockFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            WebViewUtilKt.startWebView$default(INSTANCE.getUnlockLaptopHelpUrl(LocaleUtil.getCurrentLocale(), DeviceModelExtKt.getModel(wearableDeviceModel), this$0.getRegion()), null, false, false, null, false, null, false, 254, null);
        } else {
            ToastUtil.showShortToast(wzi.u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$5(AuthorizeUnlockFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            this$0.getMBinding().B.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: zq1
                @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
                public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                    AuthorizeUnlockFragment.setListener$lambda$5$lambda$4$lambda$3(z, iSwitchButton);
                }
            });
            this$0.getMBinding().B.setSwitch(zBooleanValue);
            this$0.getMBinding().B.setOnCheckedChangeCallback(this$0.onCheckedChangeCallback);
        } else {
            this$0.onBackPressed();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$5$lambda$4$lambda$3(boolean z, ISwitchButton iSwitchButton) {
    }

    private final void showEnduranceDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c("endurance").setCancelable(true).setCanceledOnTouchOutside(true).setDialogTitle(wzi.I8).setDialogDescription(wzi.H8).setPositiveText(wzi.g).setNegativeText(wzi.e).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.base.unlock.laptop.AuthorizeUnlockFragment.showEnduranceDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    AuthorizeUnlockFragment.access$getMViewModel(AuthorizeUnlockFragment.this).getUnlockSwitch().postValue(Boolean.FALSE);
                } else if (which == -1) {
                    AuthorizeUnlockFragment.access$getMViewModel(AuthorizeUnlockFragment.this).setAuthorizeUnlock(1, true);
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    @NotNull
    public final String getRegion() {
        String currentRegion = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = currentRegion.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (Intrinsics.areEqual(lowerCase, "cn")) {
            return "";
        }
        return lowerCase + ".";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.G8);
        getMBinding().A.getPaint().setFlags(8);
        getMBinding().A.getPaint().setAntiAlias(true);
        showLoading();
        ((AuthorizeUnlockViewModel) getMViewModel()).getAuthorizeUnlock();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        getMBinding().A.setOnClickListener(new View.OnClickListener() { // from class: ar1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AuthorizeUnlockFragment.setListener$lambda$2(this.f3372a, view);
            }
        });
        ((AuthorizeUnlockViewModel) getMViewModel()).getUnlockSwitch().observe(getViewLifecycleOwner(), new AuthorizeUnlockFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: br1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AuthorizeUnlockFragment.setListener$lambda$5(this.f4504a, (Boolean) obj);
            }
        }));
    }
}
