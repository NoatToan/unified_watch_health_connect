package com.huami.sky.lib.repo.weekplan;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u001a,\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00018\u00008\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0082\b¢\u0006\u0004\b\u0005\u0010\u0006\"\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/google/gson/Gson;", "", "json", "kotlin.jvm.PlatformType", "a", "(Lcom/google/gson/Gson;Ljava/lang/String;)Ljava/lang/Object;", IWeekPlanRepoKt.WEEK_PLAN_START_DATE, "Ljava/lang/String;", IWeekPlanRepoKt.WEEK_PLAN_DATE_LIST, "sky-lib_release"}, k = 2, mv = {1, 5, 1})
public final class IWeekPlanRepoKt {

    @NotNull
    public static final String WEEK_PLAN_DATE_LIST = "WEEK_PLAN_DATE_LIST";

    @NotNull
    public static final String WEEK_PLAN_START_DATE = "WEEK_PLAN_START_DATE";

    private static final /* synthetic */ <T> T a(Gson gson, String str) {
        Intrinsics.needClassReification();
        return (T) gson.fromJson(str, new TypeToken<T>() { // from class: com.huami.sky.lib.repo.weekplan.IWeekPlanRepoKt$fromJson$1
        }.getType());
    }
}
