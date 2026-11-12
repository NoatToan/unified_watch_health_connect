package com.huami.jac.ui.amazfit.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.fragment.app.FragmentManager;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.jac.ui.amazfit.R;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0016\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "isXpInstalled", "Landroidx/fragment/app/FragmentManager;", "manager", "", "showNotInstallJacDialog", "showGoToJacDialog", "jac-ui-amazfit_release"}, k = 2, mv = {1, 5, 1})
public final class JacTipsKt {
    public static final boolean isXpInstalled(@NotNull Context context) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo("com.xiaopeng.mycarinfo", 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            packageInfo = null;
        }
        return packageInfo != null;
    }

    public static final void showGoToJacDialog(@NotNull Context context, @NotNull FragmentManager fragmentManager) {
        new AlertDialogFragment.Builder(context).setCancelable(true).setMessage(R.string.jac_car_s_to_jac_tips).setNeutralButton(R.string.jac_car_s_i_know, (DialogInterface.OnClickListener) null).show(fragmentManager);
    }

    public static final void showNotInstallJacDialog(@NotNull Context context, @NotNull FragmentManager fragmentManager) {
        new AlertDialogFragment.Builder(context).setCancelable(true).setMessage(R.string.jac_car_s_not_installed).setNeutralButton(R.string.jac_car_s_i_know, (DialogInterface.OnClickListener) null).show(fragmentManager);
    }
}
