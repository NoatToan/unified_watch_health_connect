package com.xiaomi.fitness.notify.util;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.utils.RomUtils;
import defpackage.av6;
import defpackage.q0j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006J\f\u0010\u0007\u001a\u00020\u0005*\u00020\u0006H\u0002J\n\u0010\b\u001a\u00020\u0005*\u00020\u0006¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/notify/util/NotificationSettingDialogHelp;", "", "<init>", "()V", "showPowerSettingRemind", "", "Landroidx/fragment/app/Fragment;", "showPowerSettingRemindForVIVO", "showLockScreenRemind", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NotificationSettingDialogHelp {

    @NotNull
    public static final NotificationSettingDialogHelp INSTANCE = new NotificationSettingDialogHelp();

    private NotificationSettingDialogHelp() {
    }

    private final void showPowerSettingRemindForVIVO(Fragment fragment) {
        if (RomUtils.INSTANCE.isVivo()) {
            new CommonDialog.c("commonDialog").setDialogDescriptionString(new DialogParams.DialogDescriptionString(q0j.O, new Object[0])).setPositiveText(q0j.P).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.notify.util.NotificationSettingDialogHelp.showPowerSettingRemindForVIVO.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -2) {
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                    } else if (which == -1 && dialog != null) {
                        dialog.dismiss();
                    }
                }
            }).show(fragment.getParentFragmentManager(), "");
        }
    }

    public final void showLockScreenRemind(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        new CommonDialog.c("commonDialog").setDialogDescriptionString(new DialogParams.DialogDescriptionString(q0j.Q, new Object[0])).setPositiveText(q0j.P).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.notify.util.NotificationSettingDialogHelp.showLockScreenRemind.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else if (which == -1 && dialog != null) {
                    dialog.dismiss();
                }
            }
        }).show(fragment.getParentFragmentManager(), "");
    }

    public final void showPowerSettingRemind(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        showPowerSettingRemindForVIVO(fragment);
    }
}
