package com.xiaomi.fitness.eco.device.manager.ui.bind;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.view.View;
import com.miot.rn.plugin.activity.PluginRNActivity;
import com.xiaomi.eco.api.EcoScalePreference;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import com.xiaomi.fitness.common.extensions.StringExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoBindDeviceInfo;
import com.xiaomi.fitness.eco.device.manager.extensions.EcoBluetoothExtKt;
import com.xiaomi.fitness.eco.device.manager.extensions.EcoDeviceWebUrlsKt;
import com.xiaomi.fitness.eco.device.manager.ui.EcoDeviceNormalGuideView;
import com.xiaomi.fitness.eco.device.manager.ui.bind.BindMiHomeDeviceActivity;
import com.xiaomi.fitness.eco.device.manager.utils.PermissionDialogUtil;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.RNDeviceModel;
import com.xiaomi.fitness.rn.export.RnSettingsExportApi;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
import com.xiaomi.fitness.rn.export.extensions.RnSettingsExportApiExtKt;
import com.xiaomi.fitness.sport_eco.view.launch.gym.GymLaunchEcoSportActivity;
import com.xiaomi.fitness.sport_eco_manager_export.SportConstants;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.av6;
import defpackage.cw1;
import defpackage.dji;
import defpackage.fui;
import defpackage.uq7;
import defpackage.yzi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b,\u0010\u000bJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u000bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u000bJ\u0019\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u0006*\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u000bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082D¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010\"R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ui/bind/BindMiHomeDeviceActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/eco/device/manager/ui/bind/BindMiHomeDeviceViewModel;", "Luq7;", "", "bindStatus", "", "updateDeviceGuideViewMsg", "(I)V", "updateBindErrorStatusTip", "releaseDevice", "()V", "saveCurrentBindRopeSkipping", "finishRopeSkipping2Page", "Landroid/view/View;", "bindingView", "scrollToCurrentView", "(Landroid/view/View;)V", "startBind", "showCancelBindConfirmDialog", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "bindView", "(Luq7;)V", "onBackPressed", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "", "TAG", "Ljava/lang/String;", "SCAN_ACTIVITY_CLASS", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoBindDeviceInfo;", "mDeviceInfo", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoBindDeviceInfo;", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BindMiHomeDeviceActivity extends BaseBindingActivity<BindMiHomeDeviceViewModel, uq7> {
    private EcoBindDeviceInfo mDeviceInfo;

    @NotNull
    private final String TAG = "Bind4ElectrodeActivity";

    @NotNull
    private final String SCAN_ACTIVITY_CLASS = "com.xiaomi.fitness.device.manager.ui.scan.ScanDeviceActivity";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$3(uq7 this_bindView, Integer num) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        EcoDeviceBindStatusView ecoDeviceBindStatusView = this_bindView.G;
        Intrinsics.checkNotNull(num);
        ecoDeviceBindStatusView.setStatus(num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$4(uq7 this_bindView, BindMiHomeDeviceActivity this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EcoDeviceBindStatusView ecoDeviceBindStatusView = this_bindView.E;
        Intrinsics.checkNotNull(num);
        ecoDeviceBindStatusView.setStatus(num.intValue());
        if (num.intValue() == 100) {
            EcoDeviceBindStatusView deviceViewBindToAuth = this_bindView.E;
            Intrinsics.checkNotNullExpressionValue(deviceViewBindToAuth, "deviceViewBindToAuth");
            this$0.scrollToCurrentView(deviceViewBindToAuth);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$6(uq7 this_bindView, final BindMiHomeDeviceActivity this$0, Integer num) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EcoDeviceBindStatusView ecoDeviceBindStatusView = this_bindView.F;
        Intrinsics.checkNotNull(num);
        ecoDeviceBindStatusView.setStatus(num.intValue());
        if (num.intValue() == 100) {
            EcoDeviceBindStatusView deviceViewBindToBindAccount = this_bindView.F;
            Intrinsics.checkNotNullExpressionValue(deviceViewBindToBindAccount, "deviceViewBindToBindAccount");
            this$0.scrollToCurrentView(deviceViewBindToBindAccount);
        } else if (num.intValue() == 101) {
            this$0.getMBinding().H.setVisibility(0);
            this$0.getMBinding().H.setText(yzi.common_complete);
            this$0.getMBinding().H.setOnClickListener(new View.OnClickListener() { // from class: qm2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BindMiHomeDeviceActivity.bindView$lambda$6$lambda$5(this.f31647a, view);
                }
            });
            AppManager companion = AppManager.INSTANCE.getInstance();
            Class<?> cls = Class.forName(this$0.SCAN_ACTIVITY_CLASS);
            Intrinsics.checkNotNullExpressionValue(cls, "forName(...)");
            companion.killActivity(cls);
            this$0.finishRopeSkipping2Page();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$6$lambda$5(BindMiHomeDeviceActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RnSettingsExportApi rnSettingsExportApiExtKt = RnSettingsExportApiExtKt.getInstance(RnSettingsExportApi.INSTANCE);
        EcoBindDeviceInfo ecoBindDeviceInfo = this$0.mDeviceInfo;
        EcoBindDeviceInfo ecoBindDeviceInfo2 = null;
        if (ecoBindDeviceInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceInfo");
            ecoBindDeviceInfo = null;
        }
        String bleMac = ecoBindDeviceInfo.getBleMac();
        EcoBindDeviceInfo ecoBindDeviceInfo3 = this$0.mDeviceInfo;
        if (ecoBindDeviceInfo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceInfo");
        } else {
            ecoBindDeviceInfo2 = ecoBindDeviceInfo3;
        }
        rnSettingsExportApiExtKt.openSetDeviceNamePage(this$0, bleMac, ecoBindDeviceInfo2.getBleName());
        this$0.finish();
        this$0.saveCurrentBindRopeSkipping();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishRopeSkipping2Page() {
        EcoBindDeviceInfo ecoBindDeviceInfo = this.mDeviceInfo;
        if (ecoBindDeviceInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceInfo");
            ecoBindDeviceInfo = null;
        }
        if (StringsKt__StringsJVMKt.startsWith$default(ecoBindDeviceInfo.getModel(), SportConstants.GYM_MODEL_YUN_MAI_JUMP2_PREFIX, false, 2, null)) {
            AppManager.Companion companion = AppManager.INSTANCE;
            AppManager companion2 = companion.getInstance();
            GymLaunchEcoSportActivity.Companion companion3 = GymLaunchEcoSportActivity.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(GymLaunchEcoSportActivity.class, "forName(...)");
            companion2.killActivity(GymLaunchEcoSportActivity.class);
            AppManager companion4 = companion.getInstance();
            Intrinsics.checkNotNullExpressionValue(PluginRNActivity.class, "forName(...)");
            companion4.killActivity(PluginRNActivity.class);
            AppManager companion5 = companion.getInstance();
            BindRopeSkippingListActivity.Companion companion6 = BindRopeSkippingListActivity.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(BindRopeSkippingListActivity.class, "forName(...)");
            companion5.killActivity(BindRopeSkippingListActivity.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(BindMiHomeDeviceActivity this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(num);
        this$0.updateDeviceGuideViewMsg(num.intValue());
        this$0.updateBindErrorStatusTip(num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void releaseDevice() {
        BindMiHomeDeviceViewModel bindMiHomeDeviceViewModel = (BindMiHomeDeviceViewModel) getMViewModel();
        EcoBindDeviceInfo ecoBindDeviceInfo = this.mDeviceInfo;
        if (ecoBindDeviceInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceInfo");
            ecoBindDeviceInfo = null;
        }
        bindMiHomeDeviceViewModel.releaseDevice(ecoBindDeviceInfo);
    }

    private final void saveCurrentBindRopeSkipping() {
        EcoBindDeviceInfo ecoBindDeviceInfo = this.mDeviceInfo;
        if (ecoBindDeviceInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceInfo");
            ecoBindDeviceInfo = null;
        }
        if (StringsKt__StringsJVMKt.startsWith$default(ecoBindDeviceInfo.getModel(), SportConstants.GYM_MODEL_YUN_MAI_JUMP2_PREFIX, false, 2, null)) {
            RNDeviceManager rNDeviceManagerExtKt = RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE);
            EcoBindDeviceInfo ecoBindDeviceInfo2 = this.mDeviceInfo;
            if (ecoBindDeviceInfo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDeviceInfo");
                ecoBindDeviceInfo2 = null;
            }
            RNDeviceModel rNDeviceModel = (RNDeviceModel) rNDeviceManagerExtKt.getDeviceModelByMac(ecoBindDeviceInfo2.getBleMac());
            Logger.i(this.TAG, "mRNDeviceModel.did:" + (rNDeviceModel != null ? rNDeviceModel.getDid() : null));
            EcoScalePreference.putString(SportConstants.KEY_CURRENT_BIND_ROPE_SKIPPING + AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId(), String.valueOf(rNDeviceModel != null ? rNDeviceModel.getDid() : null));
        }
    }

    private final void scrollToCurrentView(final View bindingView) {
        getMBinding().A.postDelayed(new Runnable() { // from class: an2
            @Override // java.lang.Runnable
            public final void run() {
                BindMiHomeDeviceActivity.scrollToCurrentView$lambda$7(this.f1227a, bindingView);
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollToCurrentView$lambda$7(BindMiHomeDeviceActivity this$0, View bindingView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bindingView, "$bindingView");
        if (Build.VERSION.SDK_INT >= 29) {
            this$0.getMBinding().A.scrollToDescendant(bindingView);
        } else {
            this$0.getMBinding().A.scrollTo(0, bindingView.getBottom());
        }
    }

    private final void showCancelBindConfirmDialog() {
        int i = yzi.C;
        Object[] objArr = new Object[1];
        EcoBindDeviceInfo ecoBindDeviceInfo = this.mDeviceInfo;
        if (ecoBindDeviceInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceInfo");
            ecoBindDeviceInfo = null;
        }
        objArr[0] = ecoBindDeviceInfo.getDeviceInfo().getName();
        String string = getString(i, objArr);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        CommonDialog commonDialogCreate = new CommonDialog.c("cancel_bind_dialog").setDialogDescriptionString(new DialogParams.DialogDescriptionString(string)).setPositiveText(yzi.j).setNegativeText(yzi.i).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.eco.device.manager.ui.bind.BindMiHomeDeviceActivity.showCancelBindConfirmDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) throws ClassNotFoundException {
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which != -1) {
                    return;
                }
                BindMiHomeDeviceActivity.this.finish();
                AppManager companion = AppManager.INSTANCE.getInstance();
                Class<?> cls = Class.forName(BindMiHomeDeviceActivity.this.SCAN_ACTIVITY_CLASS);
                Intrinsics.checkNotNullExpressionValue(cls, "forName(...)");
                companion.killActivity(cls);
                BindMiHomeDeviceActivity.this.finishRopeSkipping2Page();
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    private final void startBind() {
        EcoBluetoothExtKt.openBluetooth(this, new Function0() { // from class: wm2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BindMiHomeDeviceActivity.startBind$lambda$11(this.f38117a);
            }
        }, new Function1() { // from class: xm2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BindMiHomeDeviceActivity.startBind$lambda$12(this.f39255a, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startBind$lambda$11(final BindMiHomeDeviceActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PermissionDialogUtil.INSTANCE.requestLocationIfNeed(this$0, new Function1() { // from class: ym2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BindMiHomeDeviceActivity.startBind$lambda$11$lambda$10(this.f40315a, (PermissionBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startBind$lambda$11$lambda$10(final BindMiHomeDeviceActivity this$0, PermissionBuilder requestLocationIfNeed) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(requestLocationIfNeed, "$this$requestLocationIfNeed");
        requestLocationIfNeed.granted(new Function1() { // from class: bn2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BindMiHomeDeviceActivity.startBind$lambda$11$lambda$10$lambda$8(this.f4383a, (String) obj);
            }
        });
        requestLocationIfNeed.denied(new Function1() { // from class: cn2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BindMiHomeDeviceActivity.startBind$lambda$11$lambda$10$lambda$9(this.f5565a, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit startBind$lambda$11$lambda$10$lambda$8(BindMiHomeDeviceActivity this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        BindMiHomeDeviceViewModel bindMiHomeDeviceViewModel = (BindMiHomeDeviceViewModel) this$0.getMViewModel();
        EcoBindDeviceInfo ecoBindDeviceInfo = this$0.mDeviceInfo;
        if (ecoBindDeviceInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceInfo");
            ecoBindDeviceInfo = null;
        }
        bindMiHomeDeviceViewModel.startBind(ecoBindDeviceInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit startBind$lambda$11$lambda$10$lambda$9(BindMiHomeDeviceActivity this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ((BindMiHomeDeviceViewModel) this$0.getMViewModel()).getConnectDeviceStatus$eco_device_manager_chinaProductRelease().postValue(102);
        ((BindMiHomeDeviceViewModel) this$0.getMViewModel()).getBindStatus$eco_device_manager_chinaProductRelease().postValue(1);
        ((BindMiHomeDeviceViewModel) this$0.getMViewModel()).getIsFail().set(0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit startBind$lambda$12(BindMiHomeDeviceActivity this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ToastExtKt.toastShort(this$0, yzi.F);
        ((BindMiHomeDeviceViewModel) this$0.getMViewModel()).getConnectDeviceStatus$eco_device_manager_chinaProductRelease().setValue(102);
        ((BindMiHomeDeviceViewModel) this$0.getMViewModel()).getIsFail().set(0);
        return Unit.INSTANCE;
    }

    private final void updateBindErrorStatusTip(int bindStatus) {
        Integer numValueOf;
        EcoBindDeviceInfo ecoBindDeviceInfo = null;
        if (bindStatus == 1) {
            numValueOf = Integer.valueOf(yzi.j0);
        } else if (bindStatus != 3) {
            numValueOf = bindStatus != 5 ? null : Integer.valueOf(yzi.g0);
        } else {
            numValueOf = Integer.valueOf(yzi.h0);
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            Object[] objArr = new Object[1];
            EcoBindDeviceInfo ecoBindDeviceInfo2 = this.mDeviceInfo;
            if (ecoBindDeviceInfo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDeviceInfo");
            } else {
                ecoBindDeviceInfo = ecoBindDeviceInfo2;
            }
            objArr[0] = EcoDeviceWebUrlsKt.getBindFailCommonHelpUrl(ecoBindDeviceInfo.getModel());
            String string = getString(iIntValue, objArr);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            getMBinding().B.setText(StringExtKt.clickSpannable$default(string, null, dji.f15594b, 0, new Function2() { // from class: um2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BindMiHomeDeviceActivity.updateBindErrorStatusTip$lambda$1((String) obj, (String) obj2);
                }
            }, 5, null));
            getMBinding().H.setText(yzi.e0);
            getMBinding().H.setOnClickListener(new View.OnClickListener() { // from class: vm2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BindMiHomeDeviceActivity.updateBindErrorStatusTip$lambda$2(this.f37016a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateBindErrorStatusTip$lambda$1(String str, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        WebViewUtilKt.startWebView$default(url, null, false, false, null, false, null, false, 254, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void updateBindErrorStatusTip$lambda$2(BindMiHomeDeviceActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((BindMiHomeDeviceViewModel) this$0.getMViewModel()).getConnectDeviceStatus$eco_device_manager_chinaProductRelease().setValue(0);
        ((BindMiHomeDeviceViewModel) this$0.getMViewModel()).getPairDeviceStatus$eco_device_manager_chinaProductRelease().setValue(0);
        ((BindMiHomeDeviceViewModel) this$0.getMViewModel()).getBindAccountStatus$eco_device_manager_chinaProductRelease().setValue(0);
        ((BindMiHomeDeviceViewModel) this$0.getMViewModel()).getIsFail().set(8);
        this$0.releaseDevice();
        this$0.startBind();
    }

    private final void updateDeviceGuideViewMsg(int bindStatus) {
        Integer numValueOf;
        if (bindStatus == 0) {
            numValueOf = Integer.valueOf(yzi.i0);
        } else if (bindStatus == 2 || bindStatus == 4) {
            numValueOf = Integer.valueOf(yzi.k0);
        } else {
            numValueOf = bindStatus != 6 ? null : Integer.valueOf(yzi.f0);
        }
        if (numValueOf != null) {
            EcoDeviceNormalGuideView.Companion companion = EcoDeviceNormalGuideView.INSTANCE;
            EcoDeviceNormalGuideView deviceViewBindDeviceInfo = getMBinding().C;
            Intrinsics.checkNotNullExpressionValue(deviceViewBindDeviceInfo, "deviceViewBindDeviceInfo");
            companion.setDes(deviceViewBindDeviceInfo, getString(numValueOf.intValue()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull final uq7 uq7Var) {
        Intrinsics.checkNotNullParameter(uq7Var, "<this>");
        ((BindMiHomeDeviceViewModel) getMViewModel()).getConnectDeviceStatus$eco_device_manager_chinaProductRelease().observe(this, new BindMiHomeDeviceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: rm2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BindMiHomeDeviceActivity.bindView$lambda$3(uq7Var, (Integer) obj);
            }
        }));
        ((BindMiHomeDeviceViewModel) getMViewModel()).getPairDeviceStatus$eco_device_manager_chinaProductRelease().observe(this, new BindMiHomeDeviceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: sm2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BindMiHomeDeviceActivity.bindView$lambda$4(uq7Var, this, (Integer) obj);
            }
        }));
        ((BindMiHomeDeviceViewModel) getMViewModel()).getBindAccountStatus$eco_device_manager_chinaProductRelease().observe(this, new BindMiHomeDeviceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: tm2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BindMiHomeDeviceActivity.bindView$lambda$6(uq7Var, this, (Integer) obj);
            }
        }));
        uq7Var.B.setMovementMethod(LinkMovementMethod.getInstance());
        uq7Var.B.setAutoLinkMask(1);
        uq7Var.B.setHighlightColor(0);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return fui.g;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return cw1.f14792b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        Integer value = ((BindMiHomeDeviceViewModel) getMViewModel()).getBindStatus$eco_device_manager_chinaProductRelease().getValue();
        if ((value != null && value.intValue() == 0) || ((value != null && value.intValue() == 2) || (value != null && value.intValue() == 4))) {
            showCancelBindConfirmDialog();
        } else {
            super.lambda$onCreate$0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        EcoBindDeviceInfo ecoBindDeviceInfo = null;
        EcoBindDeviceInfo ecoBindDeviceInfo2 = intent != null ? (EcoBindDeviceInfo) intent.getParcelableExtra("key_device_info") : null;
        if (ecoBindDeviceInfo2 == null) {
            Logger.w(this.TAG, "device info is null");
            finish();
            return;
        }
        this.mDeviceInfo = ecoBindDeviceInfo2;
        uq7 mBinding = getMBinding();
        int i = cw1.f14791a;
        EcoBindDeviceInfo ecoBindDeviceInfo3 = this.mDeviceInfo;
        if (ecoBindDeviceInfo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceInfo");
            ecoBindDeviceInfo3 = null;
        }
        mBinding.q0(i, ecoBindDeviceInfo3.getDeviceInfo());
        BindMiHomeDeviceViewModel bindMiHomeDeviceViewModel = (BindMiHomeDeviceViewModel) getMViewModel();
        EcoBindDeviceInfo ecoBindDeviceInfo4 = this.mDeviceInfo;
        if (ecoBindDeviceInfo4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceInfo");
        } else {
            ecoBindDeviceInfo = ecoBindDeviceInfo4;
        }
        bindMiHomeDeviceViewModel.start(ecoBindDeviceInfo);
        setTitle(yzi.f40720a);
        ((BindMiHomeDeviceViewModel) getMViewModel()).getBindStatus$eco_device_manager_chinaProductRelease().observe(this, new BindMiHomeDeviceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: zm2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BindMiHomeDeviceActivity.onCreate$lambda$0(this.f41448a, (Integer) obj);
            }
        }));
        startBind();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        lambda$onCreate$0();
        return true;
    }
}
