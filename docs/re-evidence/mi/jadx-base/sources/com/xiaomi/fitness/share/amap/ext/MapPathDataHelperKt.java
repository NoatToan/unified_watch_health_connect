package com.xiaomi.fitness.share.amap.ext;

import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.o5o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u001a\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a\u0017\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"getMaxRate", "Lcom/xiaomi/fitness/share/amap/ext/MaxRateData;", DailyRecordKey.sportType, "", "getMaxHeight", "Lcom/xiaomi/fitness/share/amap/ext/MaxHeightData;", "getMaxPace", "Lcom/xiaomi/fitness/share/amap/ext/MaxPaceData;", "getMaxSpeed", "Lcom/xiaomi/fitness/share/amap/ext/MaxSpeedData;", "reportMaxSpeed", "", "(Ljava/lang/Float;)Lcom/xiaomi/fitness/share/amap/ext/MaxSpeedData;", "sport-record_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMapPathDataHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapPathDataHelper.kt\ncom/xiaomi/fitness/share/amap/ext/MapPathDataHelperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,90:1\n1567#2:91\n1598#2,4:92\n1567#2:96\n1598#2,4:97\n1557#2:101\n1628#2,3:102\n*S KotlinDebug\n*F\n+ 1 MapPathDataHelper.kt\ncom/xiaomi/fitness/share/amap/ext/MapPathDataHelperKt\n*L\n48#1:91\n48#1:92,4\n59#1:96\n59#1:97,4\n78#1:101\n78#1:102,3\n*E\n"})
public final class MapPathDataHelperKt {
    @Nullable
    public static final MaxHeightData getMaxHeight() {
        MaxHeightData maxHeightData = new MaxHeightData(Integer.MIN_VALUE, 0L);
        List<SportRecordItem> listD = o5o.e().d();
        if (listD == null) {
            return null;
        }
        for (SportRecordItem sportRecordItem : listD) {
            if (sportRecordItem.getValue().intValue() > maxHeightData.getMaxHeight()) {
                maxHeightData.setMaxHeight(sportRecordItem.getValue().intValue());
                maxHeightData.setStartTime(sportRecordItem.getStartTime());
            }
        }
        return maxHeightData;
    }

    @Nullable
    public static final MaxPaceData getMaxPace() {
        int iIntValue;
        List<SportRecordItem> listF = o5o.e().f();
        int i = 0;
        long startTime = 0;
        if (listF == null || !(!listF.isEmpty())) {
            List<SportRecordItem> listI = o5o.e().i();
            if (listI == null || !(!listI.isEmpty())) {
                iIntValue = Integer.MAX_VALUE;
            } else {
                List<SportRecordItem> listI2 = o5o.e().i();
                Intrinsics.checkNotNullExpressionValue(listI2, "getSwingPaceValues(...)");
                List<SportRecordItem> list = listI2;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                iIntValue = Integer.MAX_VALUE;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    SportRecordItem sportRecordItem = (SportRecordItem) obj;
                    if (sportRecordItem.getValue().intValue() > 0 && sportRecordItem.getValue().intValue() < iIntValue) {
                        iIntValue = sportRecordItem.getValue().intValue();
                        startTime = sportRecordItem.getStartTime();
                        Logger.i(SharePathViewAmapActivityExtKt.TAG, "maxSwingPace:" + iIntValue + ",index:" + i);
                    }
                    arrayList.add(Unit.INSTANCE);
                    i = i2;
                }
            }
        } else {
            List<SportRecordItem> listF2 = o5o.e().f();
            Intrinsics.checkNotNullExpressionValue(listF2, "getPaceValues(...)");
            List<SportRecordItem> list2 = listF2;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            iIntValue = Integer.MAX_VALUE;
            for (Object obj2 : list2) {
                int i3 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                SportRecordItem sportRecordItem2 = (SportRecordItem) obj2;
                if (sportRecordItem2.getValue().intValue() > 0 && sportRecordItem2.getValue().intValue() < iIntValue) {
                    iIntValue = sportRecordItem2.getValue().intValue();
                    startTime = sportRecordItem2.getStartTime();
                    Logger.i(SharePathViewAmapActivityExtKt.TAG, "maxPace:" + iIntValue + ",index:" + i);
                }
                arrayList2.add(Unit.INSTANCE);
                i = i3;
            }
        }
        if (iIntValue == Integer.MAX_VALUE) {
            return null;
        }
        return new MaxPaceData(iIntValue, startTime);
    }

    @NotNull
    public static final MaxRateData getMaxRate(int i) {
        MaxRateData maxRateData = new MaxRateData(0, 0L);
        List<SportRecordItem> listG = i == 36 ? o5o.e().m : o5o.e().g();
        if (listG != null) {
            for (SportRecordItem sportRecordItem : listG) {
                if (sportRecordItem.getValue().intValue() > maxRateData.getMaxRate()) {
                    maxRateData.setMaxRate(sportRecordItem.getValue().intValue());
                    maxRateData.setStartTime(sportRecordItem.getStartTime());
                }
            }
        }
        return maxRateData;
    }

    @Nullable
    public static final MaxSpeedData getMaxSpeed(@Nullable Float f) {
        List<SportRecordItem> listH = o5o.e().h();
        float fFloatValue = 0.0f;
        long startTime = 0;
        if (listH != null) {
            List<SportRecordItem> list = listH;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            float fFloatValue2 = 0.0f;
            for (SportRecordItem sportRecordItem : list) {
                if (sportRecordItem.getValue().floatValue() > 0.0f && sportRecordItem.getValue().floatValue() > fFloatValue2) {
                    fFloatValue2 = sportRecordItem.getValue().floatValue();
                    startTime = sportRecordItem.getStartTime();
                }
                arrayList.add(Unit.INSTANCE);
            }
            fFloatValue = fFloatValue2;
        }
        if (f != null) {
            fFloatValue = f.floatValue();
        }
        return new MaxSpeedData(fFloatValue, startTime);
    }
}
