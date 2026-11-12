package com.huami.module.homepage.utils;

import android.content.Context;
import com.huami.hmdateformat.date.HMDataFormatKt;
import com.huami.hmdateformat.date.HMPattern;
import com.huami.module.homepage.R;
import com.huami.module.ktx.ContextExtKt;
import com.huami.module.ktx.TimeExtKt;
import com.huami.tools.analytics.DbUtils;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0005"}, d2 = {"", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "toDateString", "homePage_release"}, k = 2, mv = {1, 5, 1})
public final class TimeKt {
    @NotNull
    public static final String toDateString(long j, @NotNull Context context) {
        if (j <= 0) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        if (jCurrentTimeMillis < timeUnit.toMillis(1L)) {
            return context.getString(R.string.homepage_item_card_just_updated);
        }
        if (jCurrentTimeMillis < TimeUnit.HOURS.toMillis(1L)) {
            return ContextExtKt.getQuantityString(context, R.plurals.homepage_item_card_x_minutes_ago, (int) (jCurrentTimeMillis / timeUnit.toMillis(1L)));
        }
        if (TimeExtKt.isToday(j)) {
            return HMDataFormatKt.getFormatTime$default(j, HMPattern.HOUR24_MINUTE, (Locale) null, 2, (Object) null);
        }
        if (TimeExtKt.isInThisYear(j)) {
            return HMDataFormatKt.getFormatTime$default(j, HMPattern.ABBR_MONTH_DAY, (Locale) null, 2, (Object) null);
        }
        return HomeUtils.isChineseLanguage() ? HMDataFormatKt.getFormatTime$default(j, HMPattern.YEAR_ABBR_MONTH, (Locale) null, 2, (Object) null) : HMDataFormatKt.getFormatTime$default(j, HMPattern.YEAR_ABBR_MONTH_DAY, (Locale) null, 2, (Object) null);
    }
}
