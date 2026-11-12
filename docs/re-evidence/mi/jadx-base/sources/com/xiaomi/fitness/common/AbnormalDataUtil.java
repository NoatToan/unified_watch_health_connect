package com.xiaomi.fitness.common;

import com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem;
import com.xiaomi.fit.fitness.export.data.item.AbnormalItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import defpackage.cx;
import defpackage.qpo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/common/AbnormalDataUtil;", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "abnormalRecords", "", "unit", "", "showArrow", "Lcx;", "createAbnormalSummaryViewModel", "(Ljava/util/List;Ljava/lang/String;Z)Ljava/util/List;", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalFibItem;", "abnormalFibItems", "Lqpo;", "createAbnormalFibModel", "(Ljava/util/List;)Ljava/util/List;", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAbnormalDataUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbnormalDataUtil.kt\ncom/xiaomi/fitness/common/AbnormalDataUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,77:1\n1863#2:78\n1863#2,2:79\n1864#2:81\n1863#2,2:82\n*S KotlinDebug\n*F\n+ 1 AbnormalDataUtil.kt\ncom/xiaomi/fitness/common/AbnormalDataUtil\n*L\n20#1:78\n24#1:79,2\n20#1:81\n61#1:82,2\n*E\n"})
public final class AbnormalDataUtil {

    @NotNull
    public static final AbnormalDataUtil INSTANCE = new AbnormalDataUtil();

    private AbnormalDataUtil() {
    }

    @NotNull
    public final List<qpo> createAbnormalFibModel(@NotNull List<AbnormalFibItem> abnormalFibItems) {
        Intrinsics.checkNotNullParameter(abnormalFibItems, "abnormalFibItems");
        ArrayList arrayList = new ArrayList();
        for (AbnormalFibItem abnormalFibItem : abnormalFibItems) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.US, "%s-%s", Arrays.copyOf(new Object[]{TimeDateUtil.getDateStr(abnormalFibItem.getStartTime(), TimeUtils.FORMAT_H_M), TimeDateUtil.getDateStr(abnormalFibItem.getEndTime(), TimeUtils.FORMAT_H_M)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            qpo qpoVar = new qpo(str, true, ((long) (abnormalFibItem.getDuration() * 60)) * 1000);
            qpoVar.g = false;
            arrayList.add(qpoVar);
        }
        return arrayList;
    }

    @NotNull
    public final List<cx> createAbnormalSummaryViewModel(@NotNull List<SegmentItem> abnormalRecords, @NotNull String unit, boolean showArrow) {
        String strValueOf;
        Intrinsics.checkNotNullParameter(abnormalRecords, "abnormalRecords");
        Intrinsics.checkNotNullParameter(unit, "unit");
        ArrayList arrayList = new ArrayList();
        for (SegmentItem segmentItem : abnormalRecords) {
            if (!ArrayUtils.isEmpty(segmentItem.getItems())) {
                ArrayList arrayList2 = new ArrayList();
                List<AbnormalItem> items = segmentItem.getItems();
                Intrinsics.checkNotNull(items);
                for (AbnormalItem abnormalItem : items) {
                    if (abnormalItem.getValue() > 0) {
                        arrayList2.add(Integer.valueOf(abnormalItem.getValue()));
                    }
                }
                if (!ArrayUtils.isEmpty(arrayList2)) {
                    int maxValueInArray = ArrayUtils.getMaxValueInArray(arrayList2);
                    int minValueInArray = ArrayUtils.getMinValueInArray(arrayList2);
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    Locale locale = Locale.US;
                    String str = String.format(locale, "%s-%s", Arrays.copyOf(new Object[]{TimeDateUtil.getDateStr(segmentItem.getStartTime(), TimeUtils.FORMAT_H_M), TimeDateUtil.getDateStr(segmentItem.getEndTime(), TimeUtils.FORMAT_H_M)}, 2));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    if (maxValueInArray == minValueInArray) {
                        strValueOf = String.valueOf(maxValueInArray);
                    } else {
                        strValueOf = String.format(locale, "%s-%s", Arrays.copyOf(new Object[]{String.valueOf(minValueInArray), String.valueOf(maxValueInArray)}, 2));
                        Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                    }
                    cx cxVar = new cx(str, strValueOf, unit);
                    cxVar.g = showArrow;
                    cxVar.c(segmentItem);
                    arrayList.add(cxVar);
                }
            }
        }
        return arrayList;
    }
}
