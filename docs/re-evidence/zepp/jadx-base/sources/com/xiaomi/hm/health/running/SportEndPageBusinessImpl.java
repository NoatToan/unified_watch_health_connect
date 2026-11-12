package com.xiaomi.hm.health.running;

import android.app.Activity;
import android.content.Context;
import com.huami.moving.ui.offcut.SportEndPageBusiness;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.utils.BraceletForegroundCallBack;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/running/SportEndPageBusinessImpl;", "Lcom/huami/moving/ui/offcut/SportEndPageBusiness;", "", "sportType", "getSportTimesByType", "", "getTopActivtyName", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "mills", "getFullTimeFormatString", "", "shouldShowEndPage", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SportEndPageBusinessImpl implements SportEndPageBusiness {
    @Override // com.huami.moving.ui.offcut.SportEndPageBusiness
    @NotNull
    public String getFullTimeFormatString(@NotNull Context context, long mills) {
        try {
            return TimeUtils.formatDateTime(context, mills);
        } catch (Exception unused) {
            return TimeUtils.formatTime(context, mills);
        }
    }

    @Override // com.huami.moving.ui.offcut.SportEndPageBusiness
    public int getSportTimesByType(int sportType) {
        return 0;
    }

    @Override // com.huami.moving.ui.offcut.SportEndPageBusiness
    @NotNull
    public String getTopActivtyName() {
        String localClassName;
        Activity topActivity = BraceletForegroundCallBack.getTopActivity();
        return (topActivity == null || (localClassName = topActivity.getLocalClassName()) == null) ? "" : localClassName;
    }

    @Override // com.huami.moving.ui.offcut.SportEndPageBusiness
    public boolean shouldShowEndPage() {
        return false;
    }
}
