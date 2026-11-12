package com.mi.health.message.center.util;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainHelper;
import com.xiaomi.fitness.mine.export.IWebSyncImpl;
import defpackage.av6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/mi/health/message/center/util/SynDialogHelper;", "", "<init>", "()V", "showSyncDialogIfNeed", "", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "iWebSyncImpl", "Lcom/xiaomi/fitness/mine/export/IWebSyncImpl;", "message-center_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SynDialogHelper {

    @NotNull
    public static final SynDialogHelper INSTANCE = new SynDialogHelper();

    private SynDialogHelper() {
    }

    public final void showSyncDialogIfNeed(@NotNull FragmentActivity fragmentActivity, @NotNull final IWebSyncImpl iWebSyncImpl) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(iWebSyncImpl, "iWebSyncImpl");
        if (RegionPreference.INSTANCE.getSyncWeb()) {
            iWebSyncImpl.onWebSyncAccepted();
        } else {
            MainExtKt.getInstance(MainHelper.INSTANCE).showSyncWebDialog(fragmentActivity, new av6() { // from class: com.mi.health.message.center.util.SynDialogHelper.showSyncDialogIfNeed.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which != -1) {
                        iWebSyncImpl.onWebSyncDenied();
                        return;
                    }
                    RegionPreference regionPreference = RegionPreference.INSTANCE;
                    regionPreference.setSyncWeb(which == -1);
                    regionPreference.setSettingSyncWeb(true);
                    FitnessServerSyncer.DefaultImpls.syncWithServer$default(FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE), true, "cloud_sync_switch", null, 4, null);
                    iWebSyncImpl.onWebSyncAccepted();
                }
            });
        }
    }
}
