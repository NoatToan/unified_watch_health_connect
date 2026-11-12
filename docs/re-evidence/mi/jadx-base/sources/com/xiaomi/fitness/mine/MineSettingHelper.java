package com.xiaomi.fitness.mine;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.mine.export.IWebSync;
import defpackage.av6;
import defpackage.m0j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0006\u0010\u000e\u001a\u00020\rR\u0014\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/mine/MineSettingHelper;", "", "<init>", "()V", "mDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "showSyncWebDialogIfNeed", "", "context", "Landroidx/fragment/app/FragmentActivity;", "action", "Lcom/xiaomi/fitness/mine/export/IWebSync;", "showSyncWebDialog", "", "triggerSyncWithServer", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MineSettingHelper {

    @NotNull
    public static final MineSettingHelper INSTANCE = new MineSettingHelper();

    @Nullable
    private static CommonDialog<?> mDialog;

    private MineSettingHelper() {
    }

    private final void showSyncWebDialog(FragmentActivity context, final IWebSync action) {
        CommonDialog<?> commonDialog = mDialog;
        if (commonDialog == null || !commonDialog.isShowing()) {
            if (mDialog == null) {
                mDialog = new CommonDialog.c("repeat").setDialogTitle(m0j.S).setDialogDescription(m0j.T).setNegativeText(m0j.f25622a).setPositiveText(m0j.u).create();
            }
            CommonDialog<?> commonDialog2 = mDialog;
            Intrinsics.checkNotNull(commonDialog2 != null ? commonDialog2.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.mine.MineSettingHelper.showSyncWebDialog.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                    Intrinsics.checkNotNullParameter(dialog, "dialog");
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -2) {
                        RegionPreference regionPreference = RegionPreference.INSTANCE;
                        regionPreference.setSyncWeb(which == -1);
                        regionPreference.setSettingSyncWeb(true);
                        action.onWebSyncDenied();
                        dialog.dismiss();
                        MineSettingHelper.mDialog = null;
                        return;
                    }
                    if (which != -1) {
                        return;
                    }
                    RegionPreference regionPreference2 = RegionPreference.INSTANCE;
                    regionPreference2.setSyncWeb(which == -1);
                    regionPreference2.setSettingSyncWeb(true);
                    action.onWebSyncAccepted();
                    MineSettingHelper.INSTANCE.triggerSyncWithServer();
                    dialog.dismiss();
                    MineSettingHelper.mDialog = null;
                }

                @Override // defpackage.av6
                public void onDialogMultiClick(String dialogName, int which, boolean isChecked) {
                    Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                    super.onDialogMultiClick(dialogName, which, isChecked);
                }
            }) : null, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
            CommonDialog<?> commonDialog3 = mDialog;
            if (commonDialog3 != null) {
                commonDialog3.showIfNeed(context.getSupportFragmentManager());
            }
        }
    }

    public final boolean showSyncWebDialogIfNeed(@NotNull FragmentActivity context, @NotNull IWebSync action) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        if (RegionPreference.INSTANCE.getSyncWeb()) {
            action.onWebSyncAccepted();
            return false;
        }
        showSyncWebDialog(context, action);
        return true;
    }

    public final void triggerSyncWithServer() {
        FitnessServerSyncer.DefaultImpls.syncWithServer$default(FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE), true, "cloud_sync_switch", null, 4, null);
    }
}
