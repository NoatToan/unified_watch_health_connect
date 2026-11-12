package com.xiaomi.fitness.userinfo.utils;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\b\u0010)\u001a\u00020\nH\u0002J\u0006\u0010*\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u0014\u0010\u0015\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u0014\u0010\u0017\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\fR\u0014\u0010\u0019\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\fR\u0014\u0010\u001b\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\fR\u0014\u0010\u001d\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\fR\u0014\u0010\u001f\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b \u0010\fR\u0014\u0010!\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\fR\u000e\u0010'\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/userinfo/utils/GuidePageUtil;", "", "<init>", "()V", "KEY_PAGE_INDEX", "", "KEY_PAGE_SKIP_ENABLE", "KEY_SUPPORT_TARGET", "KEY_FIRST_GUIDE_FROM_SPORT_TARGET", "TYPE_WEIGHT", "", "getTYPE_WEIGHT", "()I", "TYPE_HEIGHT", "getTYPE_HEIGHT", "TYPE_RECORD_MAX_HEART", "getTYPE_RECORD_MAX_HEART", "TYPE_GOAL_CALORIE", "getTYPE_GOAL_CALORIE", "TYPE_GOAL_STEPS", "getTYPE_GOAL_STEPS", "TYPE_MAX_VO2", "getTYPE_MAX_VO2", "TYPE_MAXIMAL_MET", "getTYPE_MAXIMAL_MET", "TYPE_SEX", "getTYPE_SEX", "TYPE_BIRTHDAY", "getTYPE_BIRTHDAY", "TYPE_SLEEP_GOAL", "getTYPE_SLEEP_GOAL", "TYPE_STAND_COUNT", "getTYPE_STAND_COUNT", "TYPE_GOAL_MHS", "getTYPE_GOAL_MHS", "checkIsBiggerThanLimitAge", "", DialWidgetType.DATE, "", "DEFAULT_LIMIT_AGE_CN", "DEFAULT_LIMIT_AGE_OUT", "getDefaultLimitAge", "getLimitAge", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GuidePageUtil {
    public static final int DEFAULT_LIMIT_AGE_CN = 14;
    private static final int DEFAULT_LIMIT_AGE_OUT = 16;

    @NotNull
    public static final String KEY_FIRST_GUIDE_FROM_SPORT_TARGET = "key_first_guide_from_sport_target";

    @NotNull
    public static final String KEY_PAGE_INDEX = "key_page_index";

    @NotNull
    public static final String KEY_PAGE_SKIP_ENABLE = "key_page_skip_enable";

    @NotNull
    public static final String KEY_SUPPORT_TARGET = "key_support_target";
    private static final int TYPE_WEIGHT = 0;

    @NotNull
    public static final GuidePageUtil INSTANCE = new GuidePageUtil();
    private static final int TYPE_HEIGHT = 1;
    private static final int TYPE_RECORD_MAX_HEART = 2;
    private static final int TYPE_GOAL_CALORIE = 3;
    private static final int TYPE_GOAL_STEPS = 4;
    private static final int TYPE_MAX_VO2 = 5;
    private static final int TYPE_MAXIMAL_MET = 6;
    private static final int TYPE_SEX = 7;
    private static final int TYPE_BIRTHDAY = 8;
    private static final int TYPE_SLEEP_GOAL = 9;
    private static final int TYPE_STAND_COUNT = 16;
    private static final int TYPE_GOAL_MHS = 17;

    private GuidePageUtil() {
    }

    private final int getDefaultLimitAge() {
        return StringsKt__StringsJVMKt.equals(RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion(), "cn", true) ? 14 : 16;
    }

    public final boolean checkIsBiggerThanLimitAge(long date) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(date);
        int i = calendar.get(1) - calendar2.get(1);
        int limitAge = getLimitAge();
        Logger.d("GuidePageUtil", "year is  " + i + " , limitAge is " + limitAge);
        if (i > limitAge) {
            return true;
        }
        if (i < limitAge) {
            return false;
        }
        int i2 = calendar.get(2) - calendar2.get(2);
        if (i2 > 0) {
            return true;
        }
        return i2 >= 0 && calendar.get(5) - calendar2.get(5) >= 0;
    }

    public final int getLimitAge() {
        return getDefaultLimitAge();
    }

    public final int getTYPE_BIRTHDAY() {
        return TYPE_BIRTHDAY;
    }

    public final int getTYPE_GOAL_CALORIE() {
        return TYPE_GOAL_CALORIE;
    }

    public final int getTYPE_GOAL_MHS() {
        return TYPE_GOAL_MHS;
    }

    public final int getTYPE_GOAL_STEPS() {
        return TYPE_GOAL_STEPS;
    }

    public final int getTYPE_HEIGHT() {
        return TYPE_HEIGHT;
    }

    public final int getTYPE_MAXIMAL_MET() {
        return TYPE_MAXIMAL_MET;
    }

    public final int getTYPE_MAX_VO2() {
        return TYPE_MAX_VO2;
    }

    public final int getTYPE_RECORD_MAX_HEART() {
        return TYPE_RECORD_MAX_HEART;
    }

    public final int getTYPE_SEX() {
        return TYPE_SEX;
    }

    public final int getTYPE_SLEEP_GOAL() {
        return TYPE_SLEEP_GOAL;
    }

    public final int getTYPE_STAND_COUNT() {
        return TYPE_STAND_COUNT;
    }

    public final int getTYPE_WEIGHT() {
        return TYPE_WEIGHT;
    }
}
