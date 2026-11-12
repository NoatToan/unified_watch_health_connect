package com.huami.bodymeasurements.detailframe;

import com.huami.bodymeasurements.detailframe.dto.DateMode;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u000e"}, d2 = {"Lcom/huami/bodymeasurements/detailframe/TimeUtils;", "", "Ljava/util/Date;", "startDate", "endDate", "Lcom/huami/bodymeasurements/detailframe/dto/DateMode;", "dateMode", "", "getDifferByDateMode", "offset", "", "getTimeFromStartByOffset", "<init>", "()V", "detailframe_release"}, k = 1, mv = {1, 5, 1})
public final class TimeUtils {

    @NotNull
    public static final TimeUtils INSTANCE = new TimeUtils();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DateMode.values().length];
            iArr[DateMode.DAY.ordinal()] = 1;
            iArr[DateMode.WEEK.ordinal()] = 2;
            iArr[DateMode.MONTH.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TimeUtils() {
    }

    public final int getDifferByDateMode(@NotNull Date startDate, @NotNull Date endDate, @NotNull DateMode dateMode) {
        String str;
        int i = WhenMappings.$EnumSwitchMapping$0[dateMode.ordinal()];
        if (i == 1) {
            str = "day";
        } else if (i != 2) {
            str = i != 3 ? "year" : "month";
        } else {
            str = "week";
        }
        return com.huami.bodymeasurements.common.utils.TimeUtils.INSTANCE.getDifferByDateMode(startDate, endDate, str);
    }

    public final long getTimeFromStartByOffset(@NotNull Date startDate, int offset, @NotNull DateMode dateMode) {
        String str;
        int i = WhenMappings.$EnumSwitchMapping$0[dateMode.ordinal()];
        if (i == 1) {
            str = "day";
        } else if (i != 2) {
            str = i != 3 ? "year" : "month";
        } else {
            str = "week";
        }
        return com.huami.bodymeasurements.common.utils.TimeUtils.INSTANCE.getTimeFromStartByOffset(startDate, offset, str);
    }
}
