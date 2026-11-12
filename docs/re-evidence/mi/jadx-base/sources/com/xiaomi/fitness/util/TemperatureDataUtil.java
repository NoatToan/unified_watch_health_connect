package com.xiaomi.fitness.util;

import android.content.Context;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyTempReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordFloat;
import com.xiaomi.fit.fitness.export.data.item.TemperatureItem;
import com.xiaomi.fit.fitness.export.data.item.TemperatureTrendItem;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.TemperatureEntry;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.repo.RepositoryManager;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.a52;
import defpackage.c0j;
import defpackage.hrl;
import defpackage.iji;
import defpackage.ogj;
import defpackage.qpo;
import defpackage.r02;
import defpackage.rtr;
import defpackage.x44;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bP\u0010QJ)\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J?\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\f0\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u001e\u0010\u001d\u001a\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\f0\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u00032\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0002H\u0002¢\u0006\u0004\b#\u0010$J\u001b\u0010%\u001a\b\u0012\u0004\u0012\u00020!0\u00022\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b%\u0010&J#\u0010)\u001a\b\u0012\u0004\u0012\u00020!0\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J+\u0010,\u001a\b\u0012\u0004\u0012\u00020!0\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010(\u001a\u00020'2\u0006\u0010+\u001a\u00020\u000f¢\u0006\u0004\b,\u0010-J%\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00022\u0006\u0010/\u001a\u00020.2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u0002042\u0006\u00103\u001a\u00020\u0003¢\u0006\u0004\b5\u00106JE\u0010=\u001a\u00020\u001e2\u0006\u00108\u001a\u0002072\u000e\u0010:\u001a\n\u0012\u0004\u0012\u000209\u0018\u00010\u00022\u000e\u0010;\u001a\n\u0012\u0004\u0012\u000209\u0018\u00010\u00022\u000e\u0010<\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0002¢\u0006\u0004\b=\u0010>JI\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030?2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u000209\u0018\u00010\u00022\u000e\u0010;\u001a\n\u0012\u0004\u0012\u000209\u0018\u00010\u00022\u000e\u0010<\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0002¢\u0006\u0004\b@\u0010AJ\r\u0010B\u001a\u00020\u0011¢\u0006\u0004\bB\u0010CJG\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\f2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020E0D2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020G¢\u0006\u0004\bI\u0010JJ/\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u00022\u0006\u0010K\u001a\u00020\u00172\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020E0D¢\u0006\u0004\bI\u0010LJ\u001d\u0010N\u001a\u00020\u00032\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010\u0002¢\u0006\u0004\bN\u0010$J\u001d\u0010O\u001a\u00020\u00032\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010\u0002¢\u0006\u0004\bO\u0010$¨\u0006R"}, d2 = {"Lcom/xiaomi/fitness/util/TemperatureDataUtil;", "", "", "", "lists", "Lhrl;", "getSegmentRectModelList", "(Ljava/util/List;)Ljava/util/List;", Constants.KEY_RECHARGE_VALUES, "", "rectColor", "boardColor", "", "getRectModels", "(Ljava/util/List;II)Ljava/util/List;", "", "isHalfHour", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyTempReport;", "report", "", "", "getDayTemperatureSegmentListMap", "(ZLcom/xiaomi/fit/fitness/export/data/aggregation/DailyTempReport;)Ljava/util/Map;", "Lorg/joda/time/LocalDate;", "startLocalDate", "endLocalDate", "getWmTemperatureSegmentListMap", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyTempReport;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)Ljava/util/Map;", "", "map", "", "fillTemperatureMap", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyTempReport;Ljava/util/Map;)V", "Lcom/xiaomi/fitness/chart/entrys/TemperatureEntry;", "entries", "getTempEntryMinNumber", "(Ljava/util/List;)F", "fillHomeSegmentBarEntries", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyTempReport;)Ljava/util/List;", "Lr02;", "attrs", "fillDaySegmentBarEntries", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyTempReport;Lr02;)Ljava/util/List;", "isWeek", "fillWeekMonthBarEntries", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyTempReport;Lr02;Z)Ljava/util/List;", "Landroid/content/Context;", "context", "Lqpo;", "createSummaryViewModelList", "(Landroid/content/Context;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyTempReport;)Ljava/util/List;", "value", "", "formatTemperature", "(F)Ljava/lang/String;", "Lrtr;", "yAxis", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimesDataRecordFloat;", "bodyTempRecords", "skipTempRecords", "entryList", "updateTempYAxis", "(Lrtr;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "Lkotlin/Pair;", "getAxisMaxMin", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lkotlin/Pair;", "getTestTempReport", "()Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyTempReport;", "Ljava/util/TreeMap;", "Lcom/xiaomi/fit/fitness/export/data/item/TemperatureTrendItem;", "recordMap", "La52;", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "createTempTrendData", "(Ljava/util/TreeMap;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;ZLa52;)Ljava/util/List;", DialWidgetType.DATE, "(Lorg/joda/time/LocalDate;Ljava/util/TreeMap;)Ljava/util/List;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "getTempTrendMaxValue", "getTempTrendMinValue", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nTemperatureDataUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TemperatureDataUtil.kt\ncom/xiaomi/fitness/util/TemperatureDataUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,594:1\n1863#2,2:595\n1863#2,2:597\n*S KotlinDebug\n*F\n+ 1 TemperatureDataUtil.kt\ncom/xiaomi/fitness/util/TemperatureDataUtil\n*L\n280#1:595,2\n289#1:597,2\n*E\n"})
public final class TemperatureDataUtil {

    @NotNull
    public static final TemperatureDataUtil INSTANCE = new TemperatureDataUtil();

    private TemperatureDataUtil() {
    }

    private final void fillTemperatureMap(DailyTempReport report, Map<Long, List<List<Float>>> map) {
        List<TimesDataRecordFloat> bodyTempRecords = report.getBodyTempRecords();
        if (bodyTempRecords != null) {
            for (TimesDataRecordFloat timesDataRecordFloat : bodyTempRecords) {
                float[] valueArray = timesDataRecordFloat.getValueArray();
                List list = valueArray != null ? ArraysKt___ArraysKt.toList(valueArray) : null;
                List<List<Float>> list2 = map.get(Long.valueOf(timesDataRecordFloat.getTime()));
                if (list2 != null && list2.size() == 2 && !ArrayUtils.isEmpty(list)) {
                    List<Float> list3 = list2.get(0);
                    Intrinsics.checkNotNull(list);
                    ListExtKt.addAll(list3, list);
                }
            }
        }
        List<TimesDataRecordFloat> skinTempRecords = report.getSkinTempRecords();
        if (skinTempRecords != null) {
            for (TimesDataRecordFloat timesDataRecordFloat2 : skinTempRecords) {
                float[] valueArray2 = timesDataRecordFloat2.getValueArray();
                List list4 = valueArray2 != null ? ArraysKt___ArraysKt.toList(valueArray2) : null;
                List<List<Float>> list5 = map.get(Long.valueOf(timesDataRecordFloat2.getTime()));
                if (list5 != null && list5.size() == 2 && !ArrayUtils.isEmpty(list4)) {
                    List<Float> list6 = list5.get(1);
                    Intrinsics.checkNotNull(list4);
                    ListExtKt.addAll(list6, list4);
                }
            }
        }
    }

    private final Map<Long, List<List<Float>>> getDayTemperatureSegmentListMap(boolean isHalfHour, DailyTempReport report) {
        HashMap map = new HashMap();
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(TimeDateUtil.timestampToLocalDate(report.getTime()));
        int i = isHalfHour ? 48 : 24;
        long j = isHalfHour ? RepositoryManager.GAP_X_MINUTE : TimeDateUtil.TIME_HOUR;
        int i2 = 0;
        while (i2 < i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new ArrayList());
            arrayList.add(new ArrayList());
            map.put(Long.valueOf(jChangZeroOfTheDay), arrayList);
            i2++;
            jChangZeroOfTheDay += j;
        }
        fillTemperatureMap(report, map);
        return MapsKt__MapsKt.toMap(map);
    }

    private final List<hrl> getRectModels(List<Float> values, int rectColor, int boardColor) {
        ArrayList arrayList = new ArrayList();
        if (ArrayUtils.isEmpty(values)) {
            return arrayList;
        }
        if (values.size() > 1) {
            Collections.sort(values);
        }
        float fFloatValue = values.get(0).floatValue();
        hrl hrlVar = new hrl(fFloatValue, fFloatValue);
        hrlVar.c = rectColor;
        hrlVar.d = boardColor;
        if (boardColor != rectColor) {
            hrlVar.e = 1;
        }
        arrayList.add(hrlVar);
        int size = values.size();
        int i = 1;
        while (i < size) {
            float fFloatValue2 = values.get(i).floatValue();
            if (fFloatValue2 - fFloatValue > 1) {
                hrl hrlVar2 = new hrl(fFloatValue2, fFloatValue2);
                hrlVar2.c = rectColor;
                if (boardColor != rectColor) {
                    hrlVar2.e = 1;
                }
                hrlVar2.d = boardColor;
                arrayList.add(hrlVar2);
                hrlVar = hrlVar2;
            } else {
                hrlVar.f20377a = fFloatValue2;
            }
            i++;
            fFloatValue = fFloatValue2;
        }
        return arrayList;
    }

    private final List<hrl> getSegmentRectModelList(List<? extends List<Float>> lists) {
        if (lists.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int iA = x44.a(iji.o2);
        int iA2 = x44.a(iji.p2);
        List<Float> list = lists.get(0);
        List<Float> list2 = lists.get(1);
        ArrayList arrayList = new ArrayList();
        if (!ArrayUtils.isEmpty(list)) {
            arrayList.addAll(getRectModels(list, iA, iA));
        }
        if (!ArrayUtils.isEmpty(list2)) {
            arrayList.addAll(getRectModels(list2, iA2, iA));
        }
        return arrayList;
    }

    private final float getTempEntryMinNumber(List<? extends TemperatureEntry> entries) {
        if (entries == null || entries.isEmpty()) {
            return -1.0f;
        }
        float fA = entries.get(0).a();
        int size = entries.size();
        for (int i = 0; i < size; i++) {
            TemperatureEntry temperatureEntry = entries.get(i);
            if (fA == 0.0f) {
                fA = temperatureEntry.a();
            }
            if (temperatureEntry.a() != 0.0f) {
                fA = Math.min(fA, temperatureEntry.a());
            }
        }
        return fA;
    }

    private final Map<Long, List<List<Float>>> getWmTemperatureSegmentListMap(DailyTempReport report, LocalDate startLocalDate, LocalDate endLocalDate) {
        HashMap map = new HashMap();
        TimeDateUtil.changZeroOfTheDay(TimeDateUtil.timestampToLocalDate(report.getTime()));
        while (!endLocalDate.isBefore(startLocalDate)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new ArrayList());
            arrayList.add(new ArrayList());
            map.put(Long.valueOf(TimeDateUtil.changZeroOfTheDay(endLocalDate)), arrayList);
            endLocalDate = endLocalDate.minusDays(1);
        }
        fillTemperatureMap(report, map);
        return MapsKt__MapsKt.toMap(map);
    }

    @NotNull
    public final List<qpo> createSummaryViewModelList(@NotNull Context context, @Nullable DailyTempReport report) {
        Intrinsics.checkNotNullParameter(context, "context");
        LinkedList linkedList = new LinkedList();
        if (report == null) {
            return linkedList;
        }
        String string = context.getString(c0j.hn);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        float avgBodyTemp = report.getAvgBodyTemp();
        float avgSkinTemp = report.getAvgSkinTemp();
        float maxBodyTemp = report.getMaxBodyTemp();
        float maxSkinTemp = report.getMaxSkinTemp();
        float minBodyTemp = report.getMinBodyTemp();
        float minSkinTemp = report.getMinSkinTemp();
        if (maxBodyTemp > 0.0f) {
            linkedList.add(new qpo(context.getString(c0j.fn), formatTemperature(maxBodyTemp), string));
        }
        if (maxSkinTemp > 0.0f) {
            linkedList.add(new qpo(context.getString(c0j.pn), formatTemperature(maxSkinTemp), string));
        }
        if (minBodyTemp > 0.0f) {
            linkedList.add(new qpo(context.getString(c0j.gn), formatTemperature(minBodyTemp), string));
        }
        if (minSkinTemp > 0.0f) {
            linkedList.add(new qpo(context.getString(c0j.qn), formatTemperature(minSkinTemp), string));
        }
        if (avgBodyTemp > 0.0f) {
            linkedList.add(new qpo(context.getString(c0j.en), formatTemperature(avgBodyTemp), string));
        }
        if (avgSkinTemp > 0.0f) {
            linkedList.add(new qpo(context.getString(c0j.on), formatTemperature(avgSkinTemp), string));
        }
        return linkedList;
    }

    @NotNull
    public final List<MaxMinEntry> createTempTrendData(@NotNull TreeMap<Long, TemperatureTrendItem> recordMap, @NotNull LocalDate startLocalDate, @NotNull LocalDate endLocalDate, boolean isWeek, @NotNull a52 attrs) {
        int monthBarEntryType2;
        LocalDate localDate;
        float fAbs;
        float f;
        int i;
        ogj startLocalDate2 = startLocalDate;
        a52 attrs2 = attrs;
        Intrinsics.checkNotNullParameter(recordMap, "recordMap");
        Intrinsics.checkNotNullParameter(startLocalDate2, "startLocalDate");
        Intrinsics.checkNotNullParameter(endLocalDate, "endLocalDate");
        Intrinsics.checkNotNullParameter(attrs2, "attrs");
        ArrayList arrayList = new ArrayList();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        LocalDate localDateMinusDays = endLocalDate.minusDays(1);
        while (!localDateMinusDays.isBefore(startLocalDate2)) {
            if (isWeek) {
                monthBarEntryType2 = 2;
            } else {
                RecyclerBarEntry.Companion companion = RecyclerBarEntry.INSTANCE;
                Intrinsics.checkNotNull(localDateMinusDays);
                monthBarEntryType2 = companion.getMonthBarEntryType2(attrs2, localDateMinusDays);
            }
            Intrinsics.checkNotNull(localDateMinusDays);
            long jLocalDateToTimestamp = TimeDateUtil.localDateToTimestamp(localDateMinusDays);
            Iterator<Map.Entry<Long, TemperatureTrendItem>> it = recordMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    localDate = localDateMinusDays;
                    fAbs = 0.0f;
                    f = 0.0f;
                    i = 1;
                    break;
                }
                Map.Entry<Long, TemperatureTrendItem> next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                Map.Entry<Long, TemperatureTrendItem> entry = next;
                Long key = entry.getKey();
                Intrinsics.checkNotNullExpressionValue(key, "component1(...)");
                TemperatureTrendItem value = entry.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "component2(...)");
                TemperatureTrendItem temperatureTrendItem = value;
                long j = 1000;
                localDate = localDateMinusDays;
                if (TimeUtils.INSTANCE.isSameDay(jLocalDateToTimestamp * j, j * key.longValue())) {
                    String str = decimalFormat.format(Float.valueOf(temperatureTrendItem.getDiffTemp()));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    fAbs = Float.parseFloat(str);
                    f = 0.0f;
                    i = 0;
                    break;
                }
                localDateMinusDays = localDate;
            }
            if (fAbs == f) {
                fAbs = Math.abs(fAbs);
            }
            MaxMinEntry maxMinEntry = new MaxMinEntry(0, fAbs, jLocalDateToTimestamp, monthBarEntryType2);
            maxMinEntry.localDate = TimeDateUtil.timestampToLocalDate(jLocalDateToTimestamp);
            maxMinEntry.setEntryMinY(fAbs - 1.0f);
            maxMinEntry.validType = i;
            maxMinEntry.type = monthBarEntryType2;
            arrayList.add(maxMinEntry);
            localDateMinusDays = localDate.minusDays(1);
            attrs2 = attrs;
            startLocalDate2 = startLocalDate;
        }
        return arrayList;
    }

    @NotNull
    public final List<TemperatureEntry> fillDaySegmentBarEntries(@NotNull DailyTempReport report, @NotNull r02 attrs) {
        Intrinsics.checkNotNullParameter(report, "report");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        ArrayList arrayList = new ArrayList();
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(report.getTime());
        int i = 1;
        LocalDate localDatePlusDays = localDateTimestampToLocalDate.plusDays(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDatePlusDays);
        Map<Long, List<List<Float>>> dayTemperatureSegmentListMap = getDayTemperatureSegmentListMap(true, report);
        long j = jChangZeroOfTheDay;
        int i2 = 0;
        while (i2 < 48) {
            long j2 = j - RepositoryManager.GAP_X_MINUTE;
            List<List<Float>> list = dayTemperatureSegmentListMap.get(Long.valueOf(j2));
            if (list != null && list.size() == 2) {
                List<Float> list2 = list.get(0);
                List<Float> list3 = list.get(i);
                TemperatureEntry temperatureEntry = new TemperatureEntry(getSegmentRectModelList(list), i);
                temperatureEntry.timestamp = j2;
                temperatureEntry.localDate = localDateTimestampToLocalDate;
                temperatureEntry.type = RecyclerBarEntry.INSTANCE.getDayBarEntryType(attrs, j2, j);
                temperatureEntry.f11766a = ArrayUtils.getMaxValueInFloatArray(list2);
                temperatureEntry.f11767b = ArrayUtils.getMinValueInFloatArray(list2);
                temperatureEntry.c = ArrayUtils.getMaxValueInFloatArray(list3);
                temperatureEntry.d = ArrayUtils.getMinValueInFloatArray(list3);
                temperatureEntry.setY((list2.isEmpty() && list3.isEmpty()) ? 0.0f : Math.max(temperatureEntry.f11766a, temperatureEntry.c));
                arrayList.add(temperatureEntry);
                j = j2;
            }
            i2++;
            i = 1;
        }
        return arrayList;
    }

    @NotNull
    public final List<TemperatureEntry> fillHomeSegmentBarEntries(@NotNull DailyTempReport report) {
        Intrinsics.checkNotNullParameter(report, "report");
        ArrayList arrayList = new ArrayList();
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(report.getTime());
        Map<Long, List<List<Float>>> dayTemperatureSegmentListMap = getDayTemperatureSegmentListMap(false, report);
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateTimestampToLocalDate);
        for (int i = 0; i < 24; i++) {
            List<List<Float>> list = dayTemperatureSegmentListMap.get(Long.valueOf(jChangZeroOfTheDay));
            if (list != null && list.size() == 2) {
                List<Float> list2 = list.get(0);
                List<Float> list3 = list.get(1);
                TemperatureEntry temperatureEntry = new TemperatureEntry(getSegmentRectModelList(list), 1);
                temperatureEntry.timestamp = jChangZeroOfTheDay;
                temperatureEntry.localDate = localDateTimestampToLocalDate;
                temperatureEntry.type = 3;
                temperatureEntry.f11766a = ArrayUtils.getMaxValueInFloatArray(list2);
                temperatureEntry.f11767b = ArrayUtils.getMinValueInFloatArray(list2);
                temperatureEntry.c = ArrayUtils.getMaxValueInFloatArray(list3);
                temperatureEntry.d = ArrayUtils.getMinValueInFloatArray(list3);
                temperatureEntry.setY((list2.isEmpty() && list3.isEmpty()) ? 0.0f : Math.max(temperatureEntry.f11766a, temperatureEntry.c));
                temperatureEntry.setX(i);
                arrayList.add(temperatureEntry);
                jChangZeroOfTheDay += TimeDateUtil.TIME_HOUR;
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<TemperatureEntry> fillWeekMonthBarEntries(@NotNull DailyTempReport report, @NotNull r02 attrs, boolean isWeek) {
        LocalDate firstDayOfMonth;
        LocalDate localDatePlusMonths;
        Intrinsics.checkNotNullParameter(report, "report");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(report.getTime());
        if (isWeek) {
            firstDayOfMonth = TimeDateUtil.getWeekMonday(localDateTimestampToLocalDate);
            localDatePlusMonths = firstDayOfMonth.plusWeeks(1);
        } else {
            firstDayOfMonth = TimeDateUtil.getFirstDayOfMonth(localDateTimestampToLocalDate);
            localDatePlusMonths = firstDayOfMonth.plusMonths(1);
        }
        LocalDate localDateMinusDays = localDatePlusMonths.minusDays(1);
        ArrayList arrayList = new ArrayList();
        Map<Long, List<List<Float>>> wmTemperatureSegmentListMap = getWmTemperatureSegmentListMap(report, firstDayOfMonth, localDateMinusDays);
        while (!localDateMinusDays.isBefore(firstDayOfMonth)) {
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateMinusDays);
            List<List<Float>> listEmptyList = wmTemperatureSegmentListMap.get(Long.valueOf(jChangZeroOfTheDay));
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            boolean z = listEmptyList.size() == 2;
            List<Float> listEmptyList2 = z ? listEmptyList.get(0) : CollectionsKt__CollectionsKt.emptyList();
            List<Float> listEmptyList3 = z ? listEmptyList.get(1) : CollectionsKt__CollectionsKt.emptyList();
            TemperatureEntry temperatureEntry = new TemperatureEntry(getSegmentRectModelList(listEmptyList), 1);
            RecyclerBarEntry.Companion companion = RecyclerBarEntry.INSTANCE;
            int weekBarEntryType = isWeek ? companion.getWeekBarEntryType(localDateMinusDays) : companion.getMonthBarEntryType2(attrs, localDateMinusDays);
            temperatureEntry.timestamp = jChangZeroOfTheDay;
            temperatureEntry.localDate = localDateMinusDays;
            temperatureEntry.type = weekBarEntryType;
            temperatureEntry.f11766a = ArrayUtils.getMaxValueInFloatArray(listEmptyList2);
            temperatureEntry.f11767b = ArrayUtils.getMinValueInFloatArray(listEmptyList2);
            temperatureEntry.c = ArrayUtils.getMaxValueInFloatArray(listEmptyList3);
            temperatureEntry.d = ArrayUtils.getMinValueInFloatArray(listEmptyList3);
            temperatureEntry.setY((listEmptyList2.isEmpty() && listEmptyList3.isEmpty()) ? 0.0f : Math.max(temperatureEntry.f11766a, temperatureEntry.c));
            arrayList.add(temperatureEntry);
            localDateMinusDays = localDateMinusDays.minusDays(1);
        }
        return arrayList;
    }

    @NotNull
    public final String formatTemperature(float value) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(Double.parseDouble(String.valueOf(value)))}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public final Pair<Float, Float> getAxisMaxMin(@Nullable List<TimesDataRecordFloat> bodyTempRecords, @Nullable List<TimesDataRecordFloat> skipTempRecords, @Nullable List<? extends TemperatureEntry> entryList) {
        float fMin;
        float fMax;
        boolean zIsEmpty = bodyTempRecords != null ? bodyTempRecords.isEmpty() : true;
        boolean zIsEmpty2 = skipTempRecords != null ? skipTempRecords.isEmpty() : true;
        float[] fArr = {36.0f, 38.5f};
        float[] fArr2 = {32.0f, 34.5f};
        float theMaxNumber = HealthUtil.getTheMaxNumber(entryList);
        float tempEntryMinNumber = getTempEntryMinNumber(entryList);
        if (zIsEmpty && zIsEmpty2) {
            fMin = fArr[0];
            fMax = fArr[1];
        } else if (!zIsEmpty && !zIsEmpty2) {
            fMin = fArr2[0];
            fMax = Math.max(theMaxNumber, fArr[1]);
            if (tempEntryMinNumber > 0.0f) {
                fMin = Math.min(fMin, tempEntryMinNumber);
            }
        } else if (zIsEmpty) {
            fMin = fArr2[0];
            fMax = Math.max(theMaxNumber, fArr2[1]);
            if (tempEntryMinNumber > 0.0f) {
                fMin = Math.min(tempEntryMinNumber, fMin);
            }
        } else {
            fMin = fArr[0];
            fMax = Math.max(theMaxNumber, fArr[1]);
            if (tempEntryMinNumber > 0.0f) {
                fMin = Math.min(tempEntryMinNumber, fMin);
            }
        }
        float f = (float) (((double) ((int) (((double) fMin) / 0.5d))) * 0.5d);
        double d = fMax;
        if (((int) (d % 0.5d)) != 0) {
            fMax = (float) ((((double) ((int) (d / 0.5d))) * 0.5d) + ((double) 0.5f));
        }
        float f2 = fMax - f;
        double d2 = f2;
        if (((int) (d2 % 2.5d)) != 0) {
            f = (float) (((double) f) - (2.5d - ((double) (f2 - (((int) (d2 / 2.5d)) * 2.5f)))));
        }
        return new Pair<>(Float.valueOf(fMax), Float.valueOf(f));
    }

    public final float getTempTrendMaxValue(@Nullable List<? extends RecyclerBarEntry> entries) {
        if (entries == null || entries.isEmpty()) {
            return 0.0f;
        }
        float y = entries.get(0).getY();
        int size = entries.size();
        for (int i = 0; i < size; i++) {
            y = Math.max(y, entries.get(i).getY());
        }
        return y;
    }

    public final float getTempTrendMinValue(@Nullable List<? extends RecyclerBarEntry> entries) {
        if (entries == null || entries.isEmpty()) {
            return 0.0f;
        }
        float y = entries.get(0).getY();
        int size = entries.size();
        for (int i = 0; i < size; i++) {
            y = Math.min(y, entries.get(i).getY());
        }
        return y;
    }

    @NotNull
    public final DailyTempReport getTestTempReport() {
        DailyTempReport dailyTempReport = new DailyTempReport(1653408000L, "home");
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateNow);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ListExtKt.add(arrayList2, new TimesDataRecordFloat(1653472800L, new float[]{33.27f, 33.26f, 33.25f, 33.24f, 33.23f}));
        ListExtKt.add(arrayList2, new TimesDataRecordFloat(1653469200L, new float[]{27.57f, 27.56f}));
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < 10; i++) {
            ListExtKt.add(arrayList3, new TemperatureItem(TimeUnit.HOURS.toSeconds(i) + jChangZeroOfTheDay, Float.valueOf(new Random(5L).nextFloat() + 34.0f), Float.valueOf(new Random(3L).nextFloat() + 32.0f)));
        }
        dailyTempReport.setDailyAllTempDatas(arrayList3);
        dailyTempReport.setBodyTempRecords(arrayList);
        dailyTempReport.setSkinTempRecords(arrayList2);
        dailyTempReport.setAvgBodyTemp(36.5f);
        dailyTempReport.setAvgSkinTemp(32.0f);
        dailyTempReport.setMaxBodyTemp(38.0f);
        dailyTempReport.setMaxSkinTemp(36.0f);
        dailyTempReport.setMinBodyTemp(34.0f);
        dailyTempReport.setMinSkinTemp(32.0f);
        return dailyTempReport;
    }

    public final void updateTempYAxis(@NotNull rtr yAxis, @Nullable List<TimesDataRecordFloat> bodyTempRecords, @Nullable List<TimesDataRecordFloat> skipTempRecords, @Nullable List<? extends TemperatureEntry> entryList) {
        Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        Pair<Float, Float> axisMaxMin = getAxisMaxMin(bodyTempRecords, skipTempRecords, entryList);
        float fFloatValue = axisMaxMin.getFirst().floatValue();
        float fFloatValue2 = axisMaxMin.getSecond().floatValue();
        Logger.i("TemperatureDataUtil", "update yAxis min " + fFloatValue2 + " max " + fFloatValue);
        yAxis.mAxisMinimum = fFloatValue2;
        yAxis.mAxisMaximum = fFloatValue;
        yAxis.d(5, 1);
        yAxis.f = 5;
    }

    @NotNull
    public final List<MaxMinEntry> createTempTrendData(@NotNull LocalDate date, @NotNull TreeMap<Long, TemperatureTrendItem> recordMap) {
        float diffTemp;
        int i;
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(recordMap, "recordMap");
        LocalDate firstDayOfMonth = TimeDateUtil.getFirstDayOfMonth(date);
        int intervalDay = TimeDateUtil.getIntervalDay(firstDayOfMonth, firstDayOfMonth.plusMonths(1));
        ArrayList arrayList = new ArrayList();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        for (int i2 = intervalDay - 1; -1 < i2; i2--) {
            LocalDate localDatePlusDays = firstDayOfMonth.plusDays(i2);
            Intrinsics.checkNotNull(localDatePlusDays);
            long jLocalDateToTimestamp = TimeDateUtil.localDateToTimestamp(localDatePlusDays);
            Iterator<Map.Entry<Long, TemperatureTrendItem>> it = recordMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    diffTemp = 0.0f;
                    i = 1;
                    break;
                }
                Map.Entry<Long, TemperatureTrendItem> next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                Map.Entry<Long, TemperatureTrendItem> entry = next;
                Long key = entry.getKey();
                Intrinsics.checkNotNullExpressionValue(key, "component1(...)");
                TemperatureTrendItem value = entry.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "component2(...)");
                TemperatureTrendItem temperatureTrendItem = value;
                long j = 1000;
                if (TimeUtils.INSTANCE.isSameDay(jLocalDateToTimestamp * j, j * key.longValue())) {
                    diffTemp = temperatureTrendItem.getDiffTemp();
                    i = 0;
                    break;
                }
            }
            String str = decimalFormat.format(Float.valueOf(diffTemp));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            float fAbs = Float.parseFloat(str);
            if (fAbs == 0.0f) {
                fAbs = Math.abs(fAbs);
            }
            Logger.d("createTempTrendData", "diffTemp:" + diffTemp + ",value:" + fAbs);
            MaxMinEntry maxMinEntry = new MaxMinEntry((float) i2, fAbs, jLocalDateToTimestamp, 4);
            maxMinEntry.localDate = TimeDateUtil.timestampToLocalDate(jLocalDateToTimestamp);
            maxMinEntry.setEntryMinY(fAbs - 1.0f);
            maxMinEntry.validType = i;
            arrayList.add(maxMinEntry);
        }
        return arrayList;
    }
}
