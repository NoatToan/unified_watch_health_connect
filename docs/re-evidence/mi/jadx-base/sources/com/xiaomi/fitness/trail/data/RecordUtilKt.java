package com.xiaomi.fitness.trail.data;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.widget.TextView;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fit.data.common.data.sport.SportSummary;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.byi;
import defpackage.j1j;
import defpackage.xr5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a2\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t\u001a(\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a@\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015\u001a\u000e\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0018\u001a\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a*\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u0007\u001a\u0016\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t\u001a\u0018\u0010!\u001a\u0004\u0018\u00010\u001b*\u0004\u0018\u00010\u001b2\u0006\u0010\u0004\u001a\u00020\tH\u0002¨\u0006\""}, d2 = {"setDataStr", "", "valueView", "Landroid/widget/TextView;", "type", "Lcom/xiaomi/fitness/trail/data/ValueType;", "valueStr", "", "txtSize", "", "quantity", "setDataFormat", "unitStr", "setSportsPluginsFormat", "count", "countUnit", "calories", "caloriesUnit", "duration", "formatSpeed", "value", "", "formatDuration", "sec", "", "getMaxList", "", "Lcom/xiaomi/fit/data/common/data/sport/SportSummary$MaxData;", "Lcom/xiaomi/fit/data/common/data/sport/SportSummary$SummaryData;", "category", "getDistanceStrWithoutUnit", "distance", "decimal", TSMAuthContants.PARAM_VALID, "sport-record_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRecordUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordUtil.kt\ncom/xiaomi/fitness/trail/data/RecordUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n774#2:131\n865#2,2:132\n*S KotlinDebug\n*F\n+ 1 RecordUtil.kt\ncom/xiaomi/fitness/trail/data/RecordUtilKt\n*L\n107#1:131\n107#1:132,2\n*E\n"})
public final class RecordUtilKt {
    @NotNull
    public static final String formatDuration(long j) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        long j2 = 3600;
        long j3 = 60;
        String str = String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j / j2), Long.valueOf((j % j2) / j3), Long.valueOf(j % j3)}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public static final String formatSpeed(float f) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return StringsKt__StringsKt.removeSuffix(StringsKt__StringsKt.removeSuffix(StringsKt__StringsKt.removeSuffix(str, (CharSequence) "0"), (CharSequence) "0"), (CharSequence) ".");
    }

    @NotNull
    public static final String getDistanceStrWithoutUnit(int i, int i2) {
        if (i >= 1000) {
            return String.valueOf(xr5.e(i2, i / 1000.0f));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e7  */
    @NotNull
    public static final List<SportSummary.MaxData> getMaxList(@Nullable SportSummary.SummaryData summaryData, @NotNull String category) {
        List listListOfNotNull;
        Intrinsics.checkNotNullParameter(category, "category");
        if (summaryData == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        switch (category) {
            case "cross_hiking":
                listListOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new SportSummary.MaxData[]{valid(summaryData.max_distance, SportSummary.MaxData.TYPE_DISTANCE), valid(summaryData.max_duration, SportSummary.MaxData.TYPE_DURATION), valid(summaryData.max_avg_speed, SportSummary.MaxData.TYPE_SPEED)});
                break;
            case "dumbbell_training":
                listListOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new SportSummary.MaxData[]{valid(summaryData.max_duration, SportSummary.MaxData.TYPE_DURATION), valid(summaryData.max_calorie, SportSummary.MaxData.TYPE_CALORIE), valid(summaryData.max_accessory_count, SportSummary.MaxData.TYPE_ACTION_COUNT)});
                break;
            case "swimming":
                listListOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new SportSummary.MaxData[]{valid(summaryData.max_distance, SportSummary.MaxData.TYPE_DISTANCE), valid(summaryData.max_duration, SportSummary.MaxData.TYPE_DURATION), valid(summaryData.max_calorie, SportSummary.MaxData.TYPE_CALORIE)});
                break;
            case "abdwheel_training":
                listListOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new SportSummary.MaxData[]{valid(summaryData.max_duration, SportSummary.MaxData.TYPE_DURATION), valid(summaryData.max_calorie, SportSummary.MaxData.TYPE_CALORIE), valid(summaryData.max_accessory_count, SportSummary.MaxData.TYPE_ACTION_COUNT)});
                break;
            case "climbing":
                listListOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new SportSummary.MaxData[]{valid(summaryData.max_distance, SportSummary.MaxData.TYPE_DISTANCE), valid(summaryData.max_duration, SportSummary.MaxData.TYPE_DURATION), valid(summaryData.max_avg_speed, SportSummary.MaxData.TYPE_SPEED)});
                break;
            case "walking":
                listListOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new SportSummary.MaxData[]{valid(summaryData.max_distance, SportSummary.MaxData.TYPE_DISTANCE), valid(summaryData.max_duration, SportSummary.MaxData.TYPE_DURATION), valid(summaryData.max_calorie, SportSummary.MaxData.TYPE_CALORIE)});
                break;
            case "running":
                listListOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new SportSummary.MaxData[]{valid(summaryData.max_distance, SportSummary.MaxData.TYPE_DISTANCE), valid(summaryData.max_duration, SportSummary.MaxData.TYPE_DURATION), valid(summaryData.max_avg_pace, SportSummary.MaxData.TYPE_PACE)});
                break;
            case "outdoor_hiking":
            case "outdoor_riding":
                listListOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new SportSummary.MaxData[]{valid(summaryData.max_distance, SportSummary.MaxData.TYPE_DISTANCE), valid(summaryData.max_duration, SportSummary.MaxData.TYPE_DURATION), valid(summaryData.max_avg_speed, SportSummary.MaxData.TYPE_SPEED)});
                break;
            default:
                listListOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new SportSummary.MaxData[]{valid(summaryData.max_duration, SportSummary.MaxData.TYPE_DURATION), valid(summaryData.max_calorie, SportSummary.MaxData.TYPE_CALORIE)});
                break;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOfNotNull) {
            SportSummary.MaxData maxData = (SportSummary.MaxData) obj;
            if (maxData.value != null && maxData.key != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final void setDataFormat(@NotNull TextView valueView, @NotNull String valueStr, @NotNull String unitStr, int i) {
        Intrinsics.checkNotNullParameter(valueView, "valueView");
        Intrinsics.checkNotNullParameter(valueStr, "valueStr");
        Intrinsics.checkNotNullParameter(unitStr, "unitStr");
        ViewExtKt.visible(valueView);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(valueStr);
        if (unitStr.length() > 0) {
            LocaleUtil localeUtil = LocaleUtil.INSTANCE;
            localeUtil.isChinese();
            if (!localeUtil.isChinese()) {
                unitStr = " " + StringsKt__StringsKt.trim((CharSequence) unitStr).toString();
            }
            spannableStringBuilder.append((CharSequence) unitStr);
            int length = valueStr.length();
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(i, true), length, unitStr.length() + length, 17);
        }
        valueView.setText(spannableStringBuilder);
    }

    public static /* synthetic */ void setDataFormat$default(TextView textView, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 10;
        }
        setDataFormat(textView, str, str2, i);
    }

    public static final void setDataStr(@NotNull TextView valueView, @NotNull ValueType type, @NotNull String valueStr, int i, int i2) {
        String string;
        Intrinsics.checkNotNullParameter(valueView, "valueView");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(valueStr, "valueStr");
        ViewExtKt.visible(valueView);
        if (Intrinsics.areEqual(type, ValueType.CALORIE.INSTANCE)) {
            string = ResourceExtKt.getString(j1j.n1);
        } else if (Intrinsics.areEqual(type, ValueType.TIMES.INSTANCE)) {
            string = AppUtil.getApp().getResources().getQuantityString(byi.x, i2);
            Intrinsics.checkNotNullExpressionValue(string, "getQuantityString(...)");
        } else if (Intrinsics.areEqual(type, ValueType.Step.INSTANCE)) {
            string = AppUtil.getApp().getResources().getQuantityString(byi.w, i2);
            Intrinsics.checkNotNullExpressionValue(string, "getQuantityString(...)");
        } else if (Intrinsics.areEqual(type, ValueType.SpeedKMHour.INSTANCE)) {
            string = ResourceExtKt.getString(j1j.A9);
        } else if (Intrinsics.areEqual(type, ValueType.SpeedSecHM.INSTANCE)) {
            string = ResourceExtKt.getString(j1j.q1);
        } else if (Intrinsics.areEqual(type, ValueType.SpeedSecKM.INSTANCE)) {
            string = ResourceExtKt.getString(j1j.r1);
        } else if (Intrinsics.areEqual(type, ValueType.Count.INSTANCE)) {
            String quantityString = AppUtil.getApp().getResources().getQuantityString(byi.v, i2, "");
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            string = StringsKt__StringsKt.trim((CharSequence) quantityString).toString();
        } else {
            string = "";
        }
        setDataFormat(valueView, valueStr, string, i);
    }

    public static /* synthetic */ void setDataStr$default(TextView textView, ValueType valueType, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i = 10;
        }
        if ((i3 & 16) != 0) {
            i2 = 1;
        }
        setDataStr(textView, valueType, str, i, i2);
    }

    public static final void setSportsPluginsFormat(@NotNull TextView valueView, @NotNull String count, @NotNull String countUnit, int i, @NotNull String caloriesUnit, int i2, int i3) {
        Intrinsics.checkNotNullParameter(valueView, "valueView");
        Intrinsics.checkNotNullParameter(count, "count");
        Intrinsics.checkNotNullParameter(countUnit, "countUnit");
        Intrinsics.checkNotNullParameter(caloriesUnit, "caloriesUnit");
        ViewExtKt.visible(valueView);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) count);
        if (countUnit.length() > 0) {
            spannableStringBuilder.append((CharSequence) (" " + StringsKt__StringsKt.trim((CharSequence) countUnit).toString()));
        }
        spannableStringBuilder.append((CharSequence) "，");
        spannableStringBuilder.append((CharSequence) String.valueOf(i));
        if (caloriesUnit.length() > 0) {
            spannableStringBuilder.append((CharSequence) (" " + StringsKt__StringsKt.trim((CharSequence) caloriesUnit).toString()));
        }
        spannableStringBuilder.append((CharSequence) "，");
        spannableStringBuilder.append((CharSequence) TimeDateUtil.getZNTimeWithSec(i2));
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(i3, true), 0, spannableStringBuilder.length(), 17);
        valueView.setText(spannableStringBuilder);
    }

    public static /* synthetic */ void setSportsPluginsFormat$default(TextView textView, String str, String str2, int i, String str3, int i2, int i3, int i4, Object obj) {
        if ((i4 & 64) != 0) {
            i3 = 10;
        }
        setSportsPluginsFormat(textView, str, str2, i, str3, i2, i3);
    }

    private static final SportSummary.MaxData valid(SportSummary.MaxData maxData, int i) {
        if ((maxData != null ? maxData.report : null) == null) {
            return null;
        }
        maxData.dataType = i;
        return maxData;
    }
}
