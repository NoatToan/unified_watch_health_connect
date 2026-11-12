package com.xiaomi.fitness.common.recycer;

import android.content.Context;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.brr;
import defpackage.irr;
import defpackage.onq;
import defpackage.xqr;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/common/recycer/BarChartRecyclerHelper;", "", "Landroid/content/Context;", "context", "", "position", "Lonq;", "createXAxisFormatter", "(Landroid/content/Context;I)Lonq;", "Lorg/joda/time/LocalDate;", StatConstants.PARAM_START, "getWeekOrMonthEndDate", "(ILorg/joda/time/LocalDate;)Lorg/joda/time/LocalDate;", "fragmentPosition", "", "getViewTag", "(I)Ljava/lang/String;", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BarChartRecyclerHelper {

    @NotNull
    public static final BarChartRecyclerHelper INSTANCE = new BarChartRecyclerHelper();

    private BarChartRecyclerHelper() {
    }

    @Nullable
    public final onq createXAxisFormatter(@NotNull Context context, int position) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (position == 0) {
            return new xqr();
        }
        if (position == 1) {
            return new irr();
        }
        if (position != 2) {
            return null;
        }
        return new brr(context);
    }

    @NotNull
    public final String getViewTag(int fragmentPosition) {
        if (fragmentPosition != 0) {
            return fragmentPosition != 1 ? "months" : "weeks";
        }
        return "days";
    }

    @NotNull
    public final LocalDate getWeekOrMonthEndDate(int position, @NotNull LocalDate start) {
        Intrinsics.checkNotNullParameter(start, "start");
        if (position != 2) {
            LocalDate localDatePlusDays = start.plusDays(6);
            Intrinsics.checkNotNull(localDatePlusDays);
            return localDatePlusDays;
        }
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(start);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jChangZeroOfTheDay * ((long) 1000));
        LocalDate localDatePlusDays2 = start.plusDays(calendar.getActualMaximum(5) - 1);
        Intrinsics.checkNotNull(localDatePlusDays2);
        return localDatePlusDays2;
    }
}
