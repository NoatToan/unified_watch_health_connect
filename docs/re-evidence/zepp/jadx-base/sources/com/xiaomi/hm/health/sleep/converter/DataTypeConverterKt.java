package com.xiaomi.hm.health.sleep.converter;

import android.content.Context;
import com.huami.sleep.sleephome.vo.ShareSleepVo;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.share.ShareSleep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"Lcom/huami/sleep/sleephome/vo/ShareSleepVo;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/share/ShareSleep;", "toShareSleep", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class DataTypeConverterKt {
    @NotNull
    public static final ShareSleep toShareSleep(@NotNull ShareSleepVo shareSleepVo, @NotNull Context context) {
        ShareSleep shareSleep = new ShareSleep();
        shareSleep.date = shareSleepVo.getDate();
        shareSleep.valueTitle = shareSleepVo.getTitle();
        shareSleep.sleepDeepHour = String.valueOf(shareSleepVo.getDeepDur() / 60);
        shareSleep.sleepDeepMin = String.valueOf(shareSleepVo.getDeepDur() % 60);
        shareSleep.sleepScore = shareSleepVo.getScore();
        shareSleep.start = TimeUtils.formatTime(context, shareSleepVo.getStartMin());
        shareSleep.stop = TimeUtils.formatTime(context, shareSleepVo.getEndMin());
        return shareSleep;
    }
}
