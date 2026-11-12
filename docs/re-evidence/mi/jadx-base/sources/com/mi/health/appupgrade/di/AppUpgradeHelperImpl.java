package com.mi.health.appupgrade.di;

import androidx.fragment.app.FragmentManager;
import com.example.appupgrade.export.AppUpgradeHelper;
import com.mi.health.appupgrade.AppUpgradeUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/mi/health/appupgrade/di/AppUpgradeHelperImpl;", "Lcom/example/appupgrade/export/AppUpgradeHelper;", "<init>", "()V", "doCheckAppUpgrade", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "doCheckAppUpgradeInMine", "doCheckAppUpgradeInSyncError", "hasNewVersion", "", "appupgrade_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppUpgradeHelperImpl implements AppUpgradeHelper {
    @Override // com.example.appupgrade.export.AppUpgradeHelper
    public void doCheckAppUpgrade(@NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        AppUpgradeUtil.doCheckAppUpgrade$default(AppUpgradeUtil.INSTANCE, fragmentManager, false, false, 6, null);
    }

    @Override // com.example.appupgrade.export.AppUpgradeHelper
    public void doCheckAppUpgradeInMine(@NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        AppUpgradeUtil.doCheckAppUpgrade$default(AppUpgradeUtil.INSTANCE, fragmentManager, true, false, 4, null);
    }

    @Override // com.example.appupgrade.export.AppUpgradeHelper
    public void doCheckAppUpgradeInSyncError(@NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        AppUpgradeUtil.INSTANCE.doCheckAppUpgrade(fragmentManager, true, true);
    }

    @Override // com.example.appupgrade.export.AppUpgradeHelper
    public boolean hasNewVersion() {
        return AppUpgradeUtil.INSTANCE.hasNewVersion();
    }
}
