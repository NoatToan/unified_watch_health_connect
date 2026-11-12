package com.mi.health.course.export;

import com.google.gson.Gson;
import com.mi.health.course.export.data.CourseListItem;
import com.mi.health.course.export.data.CourseNewEquipmentBenefits;
import com.mi.health.course.export.data.CourseVipInfo;
import com.mi.health.course.export.perference.CourseVipSharePreference;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\n\u0010\b\u001a\u00020\t*\u00020\u0002\u001a\n\u0010\n\u001a\u00020\t*\u00020\u000b¨\u0006\f"}, d2 = {"getDifficult", "Lkotlin/Pair;", "", "Lcom/mi/health/course/export/data/CourseListItem;", "saveCourseVipInfo", "", "courseVipInfo", "Lcom/mi/health/course/export/data/CourseVipInfo;", "hasExpired", "", "checkBenefitsEnable", "Lcom/mi/health/course/export/data/CourseNewEquipmentBenefits;", "course-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CourseVipExtKt {
    public static final boolean checkBenefitsEnable(@NotNull CourseNewEquipmentBenefits courseNewEquipmentBenefits) {
        String did;
        String activityId;
        Integer status;
        Intrinsics.checkNotNullParameter(courseNewEquipmentBenefits, "<this>");
        String code = courseNewEquipmentBenefits.getCode();
        return code != null && code.length() > 0 && (did = courseNewEquipmentBenefits.getDid()) != null && did.length() > 0 && (activityId = courseNewEquipmentBenefits.getActivityId()) != null && activityId.length() > 0 && ((status = courseNewEquipmentBenefits.getStatus()) == null || status.intValue() == 0);
    }

    @NotNull
    public static final Pair<String, String> getDifficult(@NotNull CourseListItem courseListItem) {
        String str;
        Intrinsics.checkNotNullParameter(courseListItem, "<this>");
        String courseLevelStr = CourseApiKt.getCourseApi().getCourseLevelStr(courseListItem.getLevel());
        int level = courseListItem.getLevel();
        if (1 > level || level >= 5) {
            str = "D5";
        } else {
            str = "D" + courseListItem.getLevel();
        }
        return TuplesKt.to(courseLevelStr, str);
    }

    public static final boolean hasExpired(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(str);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(6, 1);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(System.currentTimeMillis());
            return calendar2.after(calendar);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static final void saveCourseVipInfo(@NotNull CourseVipInfo courseVipInfo) {
        Intrinsics.checkNotNullParameter(courseVipInfo, "courseVipInfo");
        CourseVipSharePreference.INSTANCE.setKEY_COURSE_VIP_DATE(new Gson().toJson(courseVipInfo));
    }
}
