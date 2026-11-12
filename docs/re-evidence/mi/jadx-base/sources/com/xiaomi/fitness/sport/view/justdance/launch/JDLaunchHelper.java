package com.xiaomi.fitness.sport.view.justdance.launch;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.devicesettings.export.wearmode.WearModeHelper;
import com.xiaomi.fitness.devicesettings.export.wearmode.WearModeHelperExtKt;
import com.xiaomi.fitness.sport.utils.WebViewUtilKt;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.av6;
import defpackage.c1j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J2\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nJ&\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/sport/view/justdance/launch/JDLaunchHelper;", "", "<init>", "()V", "showUnSupportDialog", "", "fm", "Landroidx/fragment/app/FragmentManager;", "showDeviceDisconnectDialog", StatConstants.PARAM_START, "Lkotlin/Function0;", "confirm", "showWearModeConflictDialog", "did", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "mode", "", "fromLaunch", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JDLaunchHelper {

    @NotNull
    public static final JDLaunchHelper INSTANCE = new JDLaunchHelper();

    private JDLaunchHelper() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showDeviceDisconnectDialog$default(JDLaunchHelper jDLaunchHelper, FragmentManager fragmentManager, Function0 function0, Function0 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        jDLaunchHelper.showDeviceDisconnectDialog(fragmentManager, function0, function1);
    }

    public final void showDeviceDisconnectDialog(@NotNull FragmentManager fm, @Nullable Function0<Unit> start, @Nullable final Function0<Unit> confirm) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        if (start != null) {
            start.invoke();
        }
        new CommonDialog.c("").setDialogTitle(c1j.W1).setDialogDescription(c1j.V1).setPositiveText(c1j.h).setCancelable(false).setCanceledOnTouchOutside(false).setCanceledOnBackPressed(false).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport.view.justdance.launch.JDLaunchHelper.showDeviceDisconnectDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    Function0<Unit> function0 = confirm;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            }
        }).showIfNeed(fm);
    }

    public final void showUnSupportDialog(@NotNull FragmentManager fm) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        new CommonDialog.c("").setDialogTitle(c1j.i2).setDialogDescription(c1j.h2).setPositiveText(c1j.j2).setNegativeText(c1j.f).setCancelable(false).setCanceledOnTouchOutside(false).setCanceledOnBackPressed(false).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport.view.justdance.launch.JDLaunchHelper.showUnSupportDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    WebViewUtilKt.startWebView$default("https://watch.xiaomiwear.com/html/dance-force/index.html", null, false, false, 14, null);
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }).showIfNeed(fm);
    }

    public final void showWearModeConflictDialog(@NotNull final String did, @NotNull FragmentActivity activity, int mode, final boolean fromLaunch) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(activity, "activity");
        String string = mode == 1 ? activity.getString(c1j.Z1) : activity.getString(c1j.b2);
        Intrinsics.checkNotNull(string);
        new CommonDialog.c("").setDialogTitle(c1j.a2).setDialogDescriptionString(new DialogParams.DialogDescriptionString(string)).setPositiveText(c1j.c2).setNegativeText(c1j.f).setCancelable(false).setCanceledOnTouchOutside(false).setCanceledOnBackPressed(false).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport.view.justdance.launch.JDLaunchHelper.showWearModeConflictDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else {
                    if (which != -1) {
                        return;
                    }
                    WearModeHelperExtKt.getInstance(WearModeHelper.INSTANCE).setWearMode(did, 0, fromLaunch);
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            }
        }).showIfNeed(activity.getSupportFragmentManager());
    }
}
