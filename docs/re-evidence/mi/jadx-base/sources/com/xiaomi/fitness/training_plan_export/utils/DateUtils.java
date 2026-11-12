package com.xiaomi.fitness.training_plan_export.utils;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/utils/DateUtils;", "", "<init>", "()V", "TAG", "", "isSameDate", "", "time1", "", "time2", DialWidgetType.DATE, "Ljava/util/Date;", "date1", "date2", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDateUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateUtils.kt\ncom/xiaomi/fitness/training_plan_export/utils/DateUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n1#2:48\n*E\n"})
public final class DateUtils {

    @NotNull
    public static final DateUtils INSTANCE = new DateUtils();

    @NotNull
    private static final String TAG = "DateUtils";

    private DateUtils() {
    }

    public final boolean isSameDate(long time1, long time2) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date(time1));
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(new Date(time2));
            return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
        } catch (Exception e) {
            Logger.e(TAG, "isSameDate " + e.getMessage());
            return false;
        }
    }

    public final boolean isSameDate(long time1, @NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date(time1));
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(date);
            return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
        } catch (Exception e) {
            Logger.e(TAG, "isSameDate " + e.getMessage());
            return false;
        }
    }

    public final boolean isSameDate(@NotNull Date date1, @NotNull Date date2) {
        Intrinsics.checkNotNullParameter(date1, "date1");
        Intrinsics.checkNotNullParameter(date2, "date2");
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date1);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(date2);
            return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
        } catch (Exception e) {
            Logger.e(TAG, "isSameDate " + e.getMessage());
            return false;
        }
    }
}
