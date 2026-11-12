package com.xiaomi.fit.data.common.data.sport;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"isRealSportCourseId", "", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "fitness-common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SportBasicReportExKt {
    public static final boolean isRealSportCourseId(@NotNull SportBasicReport sportBasicReport) {
        Integer sportCourseId;
        Intrinsics.checkNotNullParameter(sportBasicReport, "<this>");
        if (sportBasicReport.getSportCourseId() != null) {
            Integer sportCourseId2 = sportBasicReport.getSportCourseId();
            Intrinsics.checkNotNull(sportCourseId2);
            if (sportCourseId2.intValue() > 0 && ((sportCourseId = sportBasicReport.getSportCourseId()) == null || sportCourseId.intValue() != 254)) {
                return true;
            }
        }
        return false;
    }
}
