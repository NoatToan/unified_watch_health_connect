package com.huami.sleep.daysleep.sleepstagechart.util;

import com.huami.sleep.daysleep.sleepstagechart.vo.SleepTagChartData;
import com.huami.sleep.daysleep.sleepstagechart.vo.SleepTagType;
import com.huami.sleep.daysleep.sleepstagechart.vo.SleepUserTagInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ&\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¨\u0006\u000b"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/util/SleepTagToChartDataUtil;", "", "", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepUserTagInfo;", "list", "Ljava/util/ArrayList;", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepTagChartData;", "Lkotlin/collections/ArrayList;", "getSleepTagChartData", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepTagToChartDataUtil {

    @NotNull
    public static final SleepTagToChartDataUtil INSTANCE = new SleepTagToChartDataUtil();

    private SleepTagToChartDataUtil() {
    }

    @NotNull
    public final ArrayList<SleepTagChartData> getSleepTagChartData(@Nullable List<SleepUserTagInfo> list) {
        ArrayList<SleepTagChartData> arrayList;
        if (list == null) {
            arrayList = null;
        } else {
            ArrayList<SleepTagChartData> arrayList2 = new ArrayList<>(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (SleepUserTagInfo sleepUserTagInfo : list) {
                arrayList2.add(new SleepTagChartData(sleepUserTagInfo.getStartTime(), sleepUserTagInfo.getEndTime(), sleepUserTagInfo.getTagType() == SleepTagType.MANUAL.getValue() ? sleepUserTagInfo.getTag() : SleepTagType.INSTANCE.getTitle(sleepUserTagInfo.getTagType())));
            }
            arrayList = arrayList2;
        }
        Objects.requireNonNull(arrayList, "null cannot be cast to non-null type java.util.ArrayList<com.huami.sleep.daysleep.sleepstagechart.vo.SleepTagChartData>{ kotlin.collections.TypeAliasesKt.ArrayList<com.huami.sleep.daysleep.sleepstagechart.vo.SleepTagChartData> }");
        return arrayList;
    }
}
