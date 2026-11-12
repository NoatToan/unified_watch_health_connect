package com.xiaomi.hm.health.sleep.koin.impl;

import android.content.Context;
import com.huami.sleepassistant.lib.ui.base.Navigator;
import com.huami.snore.core.ext.IPageJumpManager;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/sleep/koin/impl/SnorePageJumpManagerImpl;", "Lcom/huami/snore/core/ext/IPageJumpManager;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "toHelpSleepTonality", "toHelpSleepRegulation", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SnorePageJumpManagerImpl implements IPageJumpManager {
    @Override // com.huami.snore.core.ext.IPageJumpManager
    public void toHelpSleepRegulation(@NotNull Context context) {
        Navigator.INSTANCE.startBreatheTraining(context);
    }

    @Override // com.huami.snore.core.ext.IPageJumpManager
    public void toHelpSleepTonality(@NotNull Context context) {
        Navigator.INSTANCE.startMusicPlayer(context);
    }
}
