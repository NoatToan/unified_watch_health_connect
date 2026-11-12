package com.xiaomi.fitness.util;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.p004activity.result.ActivityResultLauncher;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fitness.baseui.common.CommonBaseActivity;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import defpackage.av6;
import defpackage.c0j;
import defpackage.dih;
import defpackage.ili;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a4\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n\u001aB\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\f2\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\t\u001a\u00020\n\u001aj\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00132\u0018\b\u0002\u0010\u0019\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a2\u0018\b\u0002\u0010\u001c\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a\u001an\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00112\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00132\u0018\b\u0002\u0010\u0019\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a2\u0018\b\u0002\u0010\u001c\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a\u001a\u0094\u0001\u0010!\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010%\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010&\u001a\u00020\n2%\u0010\u0019\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u001b¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a2%\u0010\u001c\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u001b¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a2\b\b\u0002\u0010*\u001a\u00020\n\u001a\u0010\u0010+\u001a\u00020\u00012\b\u0010,\u001a\u0004\u0018\u00010#\u001a\u0006\u0010-\u001a\u00020\n¨\u0006."}, d2 = {"gotoPage", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/content/Context;", "clazz", "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "isParcelable", "", "gotoPageForResult", "Landroid/app/Activity;", "resultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "showMsgDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "titleResId", "", "msgResId", "positiveResId", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "negativeResId", "positiveCallback", "Lkotlin/Function1;", "Landroid/content/DialogInterface;", "negativeCallback", "title", "", "msg", "", "showCustomerDialog", "customerView", "Landroid/view/View;", "positiveString", "negativeString", "isCancelable", "Lkotlin/ParameterName;", "name", "dialog", "isShowGotIt", "resetL18BtnView", "view", "isDeviceConnection", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UtilsKt {
    public static final void gotoPage(@NotNull Context activity, @NotNull Class<? extends Fragment> clazz, @Nullable Bundle bundle, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        dih.a().f(activity, new FragmentParams.b().e(clazz).c(bundle).a(true).b(), z);
    }

    public static /* synthetic */ void gotoPage$default(Context context, Class cls, Bundle bundle, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            bundle = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        gotoPage(context, cls, bundle, z);
    }

    public static final void gotoPageForResult(@NotNull Activity activity, @NotNull Class<? extends Fragment> clazz, @Nullable Bundle bundle, @NotNull ActivityResultLauncher<Intent> resultLauncher, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(resultLauncher, "resultLauncher");
        FragmentParams fragmentParamsB = new FragmentParams.b().e(clazz).c(bundle).a(true).b();
        Intent intent = new Intent(activity, (Class<?>) CommonBaseActivity.class);
        if (z) {
            Intrinsics.checkNotNull(fragmentParamsB, "null cannot be cast to non-null type android.os.Parcelable");
            intent.putExtra("fragment_param", (Parcelable) fragmentParamsB);
        } else {
            Intrinsics.checkNotNull(fragmentParamsB, "null cannot be cast to non-null type java.io.Serializable");
            intent.putExtra("fragment_param", (Serializable) fragmentParamsB);
        }
        resultLauncher.launch(intent);
    }

    public static /* synthetic */ void gotoPageForResult$default(Activity activity, Class cls, Bundle bundle, ActivityResultLauncher activityResultLauncher, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            bundle = null;
        }
        if ((i & 16) != 0) {
            z = true;
        }
        gotoPageForResult(activity, cls, bundle, activityResultLauncher, z);
    }

    public static final boolean isDeviceConnection() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        return wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected();
    }

    public static final void resetL18BtnView(@Nullable View view) {
        ViewGroup.LayoutParams layoutParams;
        if (SettingsPropertiesUtil.INSTANCE.isFolded(AppUtil.getApp())) {
            layoutParams = view != null ? view.getLayoutParams() : null;
            if (layoutParams != null) {
                layoutParams.width = -1;
            }
            if (view != null) {
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        layoutParams = view != null ? view.getLayoutParams() : null;
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.width = AppUtil.getApp().getResources().getDimensionPixelOffset(ili.common_btn_single_line_width);
            layoutParams2.addRule(14);
        } else if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams3.width = AppUtil.getApp().getResources().getDimensionPixelOffset(ili.common_btn_single_line_width);
            layoutParams3.gravity = 1;
        } else if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams4.width = AppUtil.getApp().getResources().getDimensionPixelOffset(ili.common_btn_single_line_width);
            layoutParams4.gravity = 1;
        }
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
    }

    public static final void showCustomerDialog(@NotNull String title, @NotNull View customerView, @Nullable String str, @NotNull FragmentManager fragmentManager, @Nullable String str2, boolean z, @Nullable final Function1<? super DialogInterface, Unit> function1, @Nullable final Function1<? super DialogInterface, Unit> function2, boolean z2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(customerView, "customerView");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        CommonDialog.c cancelable = new CommonDialog.c("TransitionCardDetailFragment.bullet").setDialogTitle(new DialogParams.DialogDescriptionString(title)).setCancelable(z);
        if (str != null && !StringsKt__StringsKt.isBlank(str)) {
            cancelable.setPositiveText(str);
        }
        if (str2 != null && !StringsKt__StringsKt.isBlank(str2)) {
            cancelable.setNegativeText(str2);
        }
        if ((str == null || StringsKt__StringsKt.isBlank(str)) && ((str2 == null || StringsKt__StringsKt.isBlank(str2)) && z2)) {
            cancelable.setPositiveText(c0j.common_known);
        }
        cancelable.setCustomView(customerView);
        CommonDialog commonDialogCreate = cancelable.create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.util.UtilsKt.showCustomerDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Function1<DialogInterface, Unit> function3;
                if (which == -2) {
                    Function1<DialogInterface, Unit> function4 = function2;
                    if (function4 != null) {
                        function4.invoke2(dialog);
                    }
                } else if (which == -1 && (function3 = function1) != null) {
                    function3.invoke2(dialog);
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        commonDialogCreate.showIfNeed(fragmentManager);
    }

    @Nullable
    public static final CommonDialog<?> showMsgDialog(int i, int i2, int i3, @NotNull FragmentManager fragmentManager, int i4, @Nullable Function1<? super DialogInterface, Unit> function1, @Nullable Function1<? super DialogInterface, Unit> function2) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        String string = AppUtil.getApp().getString(i);
        String string2 = AppUtil.getApp().getString(i2);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return showMsgDialog(string, string2, i3, fragmentManager, i4, function1, function2);
    }

    public static /* synthetic */ CommonDialog showMsgDialog$default(int i, int i2, int i3, FragmentManager fragmentManager, int i4, Function1 function1, Function1 function2, int i5, Object obj) {
        if ((i5 & 16) != 0) {
            i4 = -1;
        }
        return showMsgDialog(i, i2, i3, fragmentManager, i4, (Function1<? super DialogInterface, Unit>) ((i5 & 32) != 0 ? null : function1), (Function1<? super DialogInterface, Unit>) ((i5 & 64) != 0 ? null : function2));
    }

    @Nullable
    public static final CommonDialog<?> showMsgDialog(@Nullable String str, @NotNull CharSequence msg, int i, @NotNull FragmentManager fragmentManager, int i2, @Nullable final Function1<? super DialogInterface, Unit> function1, @Nullable final Function1<? super DialogInterface, Unit> function2) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        CommonDialog.c dialogDescriptionString = new CommonDialog.c("CardManagerFragment.delete.mi").setDialogDescriptionString(new DialogParams.DialogDescriptionString(msg));
        if (str != null) {
            dialogDescriptionString.setDialogTitle(new DialogParams.DialogDescriptionString(str));
        }
        dialogDescriptionString.setPositiveText(i);
        if (i2 != -1) {
            dialogDescriptionString.setNegativeText(i2);
        }
        CommonDialog<?> commonDialogCreate = dialogDescriptionString.create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.util.UtilsKt.showMsgDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Function1<DialogInterface, Unit> function3;
                if (which == -2) {
                    Function1<DialogInterface, Unit> function4 = function2;
                    if (function4 != null) {
                        function4.invoke2(dialog);
                    }
                } else if (which == -1 && (function3 = function1) != null) {
                    function3.invoke2(dialog);
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        commonDialogCreate.showIfNeed(fragmentManager);
        return commonDialogCreate;
    }
}
