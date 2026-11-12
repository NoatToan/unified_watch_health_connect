package com.xiaomi.hm.health.ui.pai.hrsetting;

import android.content.Context;
import androidx.p008lifecycle.LiveData;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/ui/pai/hrsetting/NoHeartRateSetting;", "Lcom/xiaomi/hm/health/ui/pai/hrsetting/IHrSettingWrap;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroidx/lifecycle/LiveData;", "", "setHeartRate", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class NoHeartRateSetting implements IHrSettingWrap {
    @Override // com.huami.pai.ui.hrsetting.IHeartRateSetting
    @Nullable
    public LiveData<Boolean> setHeartRate(@Nullable Context context) {
        showOpenResultDialog(context, R.string.pai_open_failed, R.string.pai_not_support_device);
        return null;
    }

    @Override // com.huami.pai.ui.hrsetting.IHeartRateSetting
    public boolean showHrSetting(@NotNull Context context) {
        return IHrSettingWrap.DefaultImpls.showHrSetting(this, context);
    }

    @Override // com.xiaomi.hm.health.ui.pai.hrsetting.IHrSettingWrap
    public void showOpenResultDialog(@Nullable Context context, int i, int i2) {
        IHrSettingWrap.DefaultImpls.showOpenResultDialog(this, context, i, i2);
    }

    @Override // com.xiaomi.hm.health.ui.pai.hrsetting.IHrSettingWrap
    public void showToastShort(@Nullable Context context, int i) {
        IHrSettingWrap.DefaultImpls.showToastShort(this, context, i);
    }

    @Override // com.xiaomi.hm.health.ui.pai.hrsetting.IHrSettingWrap
    public void showOpenResultDialog(@Nullable Context context, boolean z) {
        IHrSettingWrap.DefaultImpls.showOpenResultDialog(this, context, z);
    }
}
