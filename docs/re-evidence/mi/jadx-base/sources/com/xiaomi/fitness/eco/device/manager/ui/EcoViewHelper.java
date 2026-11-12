package com.xiaomi.fitness.eco.device.manager.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.fragment.app.FragmentManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.MarketUtil;
import com.xiaomi.fitness.eco.device.manager.extensions.EcoOhterExtKt;
import com.xiaomi.fitness.eco.device.manager.ui.EcoViewHelper;
import com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzerAlpha;
import defpackage.av6;
import defpackage.kz7;
import defpackage.yzi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0011J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J$\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0011J$\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0011J\u0016\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017J\u001c\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00172\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ui/EcoViewHelper;", "", "<init>", "()V", "earPhoneAppPackage", "", "getEarPhoneAppPackage", "()Ljava/lang/String;", "showUnbindWindow", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "itemView", "Landroid/view/View;", "deviceDetail", "Lcom/xiaomi/fitness/eco/device/manager/ui/EcoDeviceDetail;", "callBack", "Lkotlin/Function0;", "setWindowAlpha", SleepAnalyzerAlpha.NAME_ALPHA, "", "confirmUnbound", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "confirmUnboundEarPhone", "openEarPhone", "openEarPhoneOnMarket", "showDelDeviceSharedDialog", "childFragmentManager", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcoViewHelper {

    @NotNull
    public static final EcoViewHelper INSTANCE = new EcoViewHelper();

    @NotNull
    private static final String earPhoneAppPackage = "com.mi.earphone";

    private EcoViewHelper() {
    }

    private final void setWindowAlpha(Activity activity, float alpha) {
        Window window = activity.getWindow();
        if (window == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = alpha;
        window.addFlags(2);
        window.setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showUnbindWindow$lambda$2$lambda$0(kz7 this_apply, Function0 callBack, View view) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        this_apply.dismiss();
        callBack.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showUnbindWindow$lambda$2$lambda$1(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        INSTANCE.setWindowAlpha(activity, 1.0f);
    }

    public final void confirmUnbound(@NotNull FragmentManager fragmentManager, @NotNull EcoDeviceDetail deviceDetail, @NotNull final Function0<Unit> callBack) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(deviceDetail, "deviceDetail");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        CommonDialog commonDialogCreate = new CommonDialog.c("unbind").setDialogTitle(new DialogParams.DialogDescriptionString(yzi.N, deviceDetail.getName())).setDialogDescriptionString(new DialogParams.DialogDescriptionString(yzi.M, deviceDetail.getName())).setPositiveText(yzi.j).setNegativeText(yzi.i).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.eco.device.manager.ui.EcoViewHelper.confirmUnbound.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    callBack.invoke();
                }
            }
        });
        commonDialogCreate.showIfNeed(fragmentManager);
    }

    public final void confirmUnboundEarPhone(@NotNull FragmentManager fragmentManager, @NotNull EcoDeviceDetail deviceDetail, @NotNull final Function0<Unit> callBack) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(deviceDetail, "deviceDetail");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        CommonDialog commonDialogCreate = new CommonDialog.c("unbindEarphone").setDialogTitle(new DialogParams.DialogDescriptionString(yzi.I, new Object[0])).setDialogDescriptionString(new DialogParams.DialogDescriptionString(yzi.J, new Object[0])).setPositiveText(yzi.j).setNegativeText(yzi.i).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.eco.device.manager.ui.EcoViewHelper.confirmUnboundEarPhone.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    callBack.invoke();
                }
            }
        });
        commonDialogCreate.showIfNeed(fragmentManager);
    }

    @NotNull
    public final String getEarPhoneAppPackage() {
        return earPhoneAppPackage;
    }

    public final void openEarPhone(@NotNull FragmentManager fragmentManager, @NotNull final EcoDeviceDetail deviceDetail) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(deviceDetail, "deviceDetail");
        CommonDialog commonDialogCreate = new CommonDialog.c("openEarPhone").setDialogTitle(new DialogParams.DialogDescriptionString(yzi.w0, new Object[0])).setDialogDescriptionString(new DialogParams.DialogDescriptionString(yzi.x0, new Object[0])).setPositiveText(yzi.v0).setNegativeText(yzi.i).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.eco.device.manager.ui.EcoViewHelper.openEarPhone.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    AppUtil.INSTANCE.goToUriPage(ApplicationExtKt.getApplication(), Uri.parse("miear://intent?pageType=main&src=mihealth&address=" + deviceDetail.getMac() + "&vidpid=" + deviceDetail.getProductId()));
                }
            }
        });
        commonDialogCreate.showIfNeed(fragmentManager);
    }

    public final void openEarPhoneOnMarket(@NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        CommonDialog commonDialogCreate = new CommonDialog.c("openEarPhone").setDialogTitle(new DialogParams.DialogDescriptionString(yzi.t0, new Object[0])).setDialogDescriptionString(new DialogParams.DialogDescriptionString(yzi.u0, new Object[0])).setPositiveText(yzi.j).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.eco.device.manager.ui.EcoViewHelper.openEarPhoneOnMarket.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    MarketUtil.INSTANCE.openAppInMarket(ApplicationExtKt.getApplication(), EcoViewHelper.INSTANCE.getEarPhoneAppPackage());
                }
            }
        });
        commonDialogCreate.showIfNeed(fragmentManager);
    }

    public final void showDelDeviceSharedDialog(@NotNull FragmentManager childFragmentManager, @NotNull final Function0<Unit> callBack) {
        Intrinsics.checkNotNullParameter(childFragmentManager, "childFragmentManager");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        CommonDialog commonDialogCreate = new CommonDialog.c("show_device_shared").setDialogDescription(yzi.E).setPositiveText(yzi.j).setNegativeText(yzi.E0).setCanceledOnBackPressed(false).setCancelable(false).setCanceledOnTouchOutside(false).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.eco.device.manager.ui.EcoViewHelper.showDelDeviceSharedDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which != -3) {
                    if (which == -2) {
                        if (dialog != null) {
                            dialog.dismiss();
                            return;
                        }
                        return;
                    } else if (which != -1) {
                        return;
                    }
                }
                callBack.invoke();
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        commonDialogCreate.showIfNeed(childFragmentManager);
    }

    public final void showUnbindWindow(@NotNull final Activity activity, @NotNull View itemView, @NotNull EcoDeviceDetail deviceDetail, @NotNull final Function0<Unit> callBack) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(deviceDetail, "deviceDetail");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        try {
            final kz7 kz7Var = new kz7(itemView.getContext(), deviceDetail.getIsPendingPairing() ? yzi.f40722k : yzi.C0);
            kz7Var.setOnBtnClickListener(new View.OnClickListener() { // from class: qz7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EcoViewHelper.showUnbindWindow$lambda$2$lambda$0(kz7Var, callBack, view);
                }
            });
            kz7Var.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: rz7
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    EcoViewHelper.showUnbindWindow$lambda$2$lambda$1(activity);
                }
            });
            setWindowAlpha(activity, 0.3f);
            int[] iArr = new int[2];
            itemView.getLocationOnScreen(iArr);
            String simpleName = EcoViewHelper.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            Logger.d(simpleName, "showUnbindWindow() " + iArr[0] + iArr[1]);
            kz7Var.showAtLocation(itemView, (AppUtil.isRTLDirection() ? 8388611 : 8388613) | 48, EcoOhterExtKt.dp2Px(15), iArr[1] + EcoOhterExtKt.dp2Px(10));
        } catch (Exception e) {
            String simpleName2 = EcoViewHelper.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
            Logger.e(simpleName2, "showUnbindWindow() error ", e);
        }
    }
}
