package com.xiaomi.fitness.active.pk.util;

import android.widget.TextView;
import com.xiaomi.fitness.active.pk.net.model.PkRecordDetail;
import com.xiaomi.fitness.active.pk.net.model.PkScoreItem;
import com.xiaomi.fitness.active.pk.net.model.UserPkDetail;
import com.xiaomi.fitness.active.pk.widget.PkChartDataItem;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.ozi;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\"\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005J\u0013\u0010\u000e\u001a\u00070\u000f¢\u0006\u0002\b\u00102\u0006\u0010\u0011\u001a\u00020\bJ#\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u000b\u0010\u0016\u001a\u00070\u000f¢\u0006\u0002\b\u00102\u0006\u0010\u0011\u001a\u00020\b¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/active/pk/util/PkBarChartUtil;", "", "<init>", "()V", "convertPkRecordDetailToChartItem", "", "Lcom/xiaomi/fitness/active/pk/widget/PkChartDataItem;", "recordDetail", "Lcom/xiaomi/fitness/active/pk/net/model/PkRecordDetail;", "convertPkScoreListToMap", "", "", "Lcom/xiaomi/fitness/active/pk/net/model/PkScoreItem;", "list", "getPkStatus", "", "Lcom/xiaomi/fitness/active/pk/util/PkStatus;", "pkRecordDetail", "updatePkStatusTextView", "", "textView", "Landroid/widget/TextView;", "status", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPkBarChartUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PkBarChartUtil.kt\ncom/xiaomi/fitness/active/pk/util/PkBarChartUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,147:1\n1863#2,2:148\n*S KotlinDebug\n*F\n+ 1 PkBarChartUtil.kt\ncom/xiaomi/fitness/active/pk/util/PkBarChartUtil\n*L\n69#1:148,2\n*E\n"})
public final class PkBarChartUtil {

    @NotNull
    public static final PkBarChartUtil INSTANCE = new PkBarChartUtil();

    private PkBarChartUtil() {
    }

    @NotNull
    public final List<PkChartDataItem> convertPkRecordDetailToChartItem(@Nullable PkRecordDetail recordDetail) {
        int i;
        int i2;
        if (recordDetail == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        long pkStartTime = recordDetail.getPkStartTime();
        UserPkDetail ownPkDetail = recordDetail.getOwnPkDetail();
        List<PkScoreItem> pkScoreList = ownPkDetail != null ? ownPkDetail.getPkScoreList() : null;
        UserPkDetail oppPkDetail = recordDetail.getOppPkDetail();
        List<PkScoreItem> pkScoreList2 = oppPkDetail != null ? oppPkDetail.getPkScoreList() : null;
        Map<Long, PkScoreItem> mapConvertPkScoreListToMap = convertPkScoreListToMap(pkScoreList);
        Map<Long, PkScoreItem> mapConvertPkScoreListToMap2 = convertPkScoreListToMap(pkScoreList2);
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateNow);
        if (jChangZeroOfTheDay < pkStartTime || (mapConvertPkScoreListToMap.isEmpty() && mapConvertPkScoreListToMap2.isEmpty())) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        long seconds = TimeUnit.HOURS.toSeconds(20L) + jChangZeroOfTheDay;
        int i3 = 0;
        while (i3 < 7) {
            long seconds2 = pkStartTime + TimeUnit.DAYS.toSeconds(i3);
            if (mapConvertPkScoreListToMap.get(Long.valueOf(seconds2)) == null && mapConvertPkScoreListToMap2.get(Long.valueOf(seconds2)) == null) {
                if (seconds2 < jChangZeroOfTheDay) {
                    i = i3;
                } else {
                    i = i3;
                    if (System.currentTimeMillis() / ((long) 1000) < seconds) {
                        i2 = -1;
                    }
                    arrayList.add(new PkChartDataItem(seconds2, i2, i2, i2, i2));
                }
                i2 = 0;
                arrayList.add(new PkChartDataItem(seconds2, i2, i2, i2, i2));
            } else {
                i = i3;
                PkScoreItem pkScoreItem = mapConvertPkScoreListToMap.get(Long.valueOf(seconds2));
                int score = pkScoreItem != null ? pkScoreItem.getScore() : 0;
                PkScoreItem pkScoreItem2 = mapConvertPkScoreListToMap2.get(Long.valueOf(seconds2));
                int score2 = pkScoreItem2 != null ? pkScoreItem2.getScore() : 0;
                PkScoreItem pkScoreItem3 = mapConvertPkScoreListToMap.get(Long.valueOf(seconds2));
                int bonusScore = pkScoreItem3 != null ? pkScoreItem3.getBonusScore() : 0;
                PkScoreItem pkScoreItem4 = mapConvertPkScoreListToMap2.get(Long.valueOf(seconds2));
                arrayList.add(new PkChartDataItem(seconds2, score, score2, bonusScore, pkScoreItem4 != null ? pkScoreItem4.getBonusScore() : 0));
            }
            i3 = i + 1;
        }
        return arrayList;
    }

    @NotNull
    public final Map<Long, PkScoreItem> convertPkScoreListToMap(@Nullable List<PkScoreItem> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            for (PkScoreItem pkScoreItem : list) {
                linkedHashMap.put(Long.valueOf(pkScoreItem.getTimeStamp()), pkScoreItem);
            }
        }
        return linkedHashMap;
    }

    public final int getPkStatus(@NotNull PkRecordDetail pkRecordDetail) {
        Intrinsics.checkNotNullParameter(pkRecordDetail, "pkRecordDetail");
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateNow);
        int pkStatus = pkRecordDetail.getPkStatus();
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        long pkSettleTime = pkRecordDetail.getPkSettleTime();
        PkLogger pkLogger = PkLogger.INSTANCE;
        pkLogger.i("PkBarChartUtil", "getPkStatus todayZero:" + jChangZeroOfTheDay + ";currentTimeSecond:" + jCurrentTimeMillis + ";pkSettleTime:" + pkSettleTime + ";record " + pkRecordDetail + ";", new Object[0]);
        int i = 2;
        if (pkStatus == 2) {
            i = 4;
        } else if (pkStatus == 1 && jCurrentTimeMillis > pkSettleTime) {
            i = 3;
        } else if (pkStatus != 1 || pkRecordDetail.getPkEndTime() > jChangZeroOfTheDay || jCurrentTimeMillis > pkSettleTime) {
            i = (pkStatus != 1 || pkRecordDetail.getPkStartTime() <= jCurrentTimeMillis) ? 1 : 0;
        }
        pkLogger.i("PkBarChartUtil", "getPkStatus result " + i, new Object[0]);
        return i;
    }

    public final void updatePkStatusTextView(@NotNull TextView textView, int status, @NotNull PkRecordDetail pkRecordDetail) {
        String string;
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(pkRecordDetail, "pkRecordDetail");
        long pkSettleTime = pkRecordDetail.getPkSettleTime();
        if (status == 0 || status == 4 || pkSettleTime <= 0) {
            ViewExtKt.setVisible(textView, false);
            return;
        }
        ViewExtKt.setVisible(textView, true);
        if (status == 1) {
            long pkEndTime = pkRecordDetail.getPkEndTime() - 1;
            string = ResourceExtKt.getString(ozi.o, TimeDateUtil.getDateStr(pkEndTime, ResourceExtKt.getString(ozi.d)), TimeDateUtil.getDateHHmm24Format(pkEndTime));
        } else if (status != 2) {
            string = status != 3 ? "" : ResourceExtKt.getString(ozi.R);
        } else {
            string = ResourceExtKt.getString(ozi.p, TimeDateUtil.getDateStr(pkSettleTime, ResourceExtKt.getString(ozi.d)), TimeDateUtil.getDateHHmm24Format(pkSettleTime));
        }
        textView.setText(string);
    }
}
