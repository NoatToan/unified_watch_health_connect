package com.huami.account.userinfo.goal;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0016\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0016\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R)\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001bj\b\u0012\u0004\u0012\u00020\u0002`\u001c8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/huami/account/userinfo/goal/GoalConstants;", "", "", "DEFAULT_SLEEP_VALUE", LogUtil.I, "DEFAULT_CALORIE_VALUE", "DEFAULT_STEP_VALUE", "SLEEP_HOUR_STEP", "SLEEP_MINUTE_STEP", "SLEEP_MIN_HOUR", "SLEEP_MAX_HOUR", "SLEEP_MIN_MINUTE", "SLEEP_MAX_MINUTE", "SLEEP_DEFAULT_HOUR", "SLEEP_DEFAULT_MINUTE", "", "a", "Ljava/util/List;", "getHoursRange", "()Ljava/util/List;", "hoursRange", "b", "getMinuteRange", "minuteRange", "CALORIE_STEP", "CALORIE_MIN", "CALORIE_MAX", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "getCalorieRange", "()Ljava/util/ArrayList;", "calorieRange", "<init>", "()V", "userinfo_release"}, k = 1, mv = {1, 5, 1})
public final class GoalConstants {
    public static final int CALORIE_MAX = 3000;
    public static final int CALORIE_MIN = 200;
    public static final int CALORIE_STEP = 100;
    public static final int DEFAULT_CALORIE_VALUE = 300;
    public static final int DEFAULT_SLEEP_VALUE = 480;
    public static final int DEFAULT_STEP_VALUE = 8000;
    public static final int SLEEP_DEFAULT_HOUR = 8;
    public static final int SLEEP_DEFAULT_MINUTE = 0;
    public static final int SLEEP_HOUR_STEP = 1;
    public static final int SLEEP_MAX_HOUR = 16;
    public static final int SLEEP_MAX_MINUTE = 30;
    public static final int SLEEP_MINUTE_STEP = 30;
    public static final int SLEEP_MIN_HOUR = 4;
    public static final int SLEEP_MIN_MINUTE = 0;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final ArrayList<Integer> calorieRange;

    @NotNull
    public static final GoalConstants INSTANCE = new GoalConstants();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final List<Integer> hoursRange = CollectionsKt___CollectionsKt.toList(new IntRange(4, 16));

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final List<Integer> minuteRange = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, 30});

    static {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 200; i <= 3000; i += 100) {
            arrayList.add(Integer.valueOf(i));
        }
        calorieRange = arrayList;
    }

    private GoalConstants() {
    }

    @NotNull
    public final ArrayList<Integer> getCalorieRange() {
        return calorieRange;
    }

    @NotNull
    public final List<Integer> getHoursRange() {
        return hoursRange;
    }

    @NotNull
    public final List<Integer> getMinuteRange() {
        return minuteRange;
    }
}
