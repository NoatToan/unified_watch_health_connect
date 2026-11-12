package com.xiaomi.fitness.sport.utils;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.SystemSetting;
import defpackage.av6;
import defpackage.c1j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"locationDialog", "", "permissions", "", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "sport_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SportPermissionsUtilKt {
    public static final void locationDialog(@Nullable List<Integer> list, @NotNull final FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if ((list != null ? list.get(0) : null) != null) {
            CommonDialog commonDialogCreate = new CommonDialog.c("location").setDialogTitle(list.get(0).intValue()).setDialogDescription(list.get(1).intValue()).setPositiveText(c1j.Z).setNegativeText(c1j.w3).create();
            commonDialogCreate.setCancelable(false);
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport.utils.SportPermissionsUtilKt.locationDialog.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    if (which == -1) {
                        SystemSetting.INSTANCE.goToSetting(activity);
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            });
            commonDialogCreate.showIfNeed(activity.getSupportFragmentManager());
        }
    }
}
