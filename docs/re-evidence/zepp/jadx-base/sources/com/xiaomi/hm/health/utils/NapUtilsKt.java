package com.xiaomi.hm.health.utils;

import android.content.Context;
import android.content.Intent;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.databases.model.DateData;
import com.xiaomi.hm.health.dataprocess.StageSleep;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.g;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u001a\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u001a\u0010\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u001a\u0012\u0010\n\u001a\u00020\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002\u001a.\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r\u001a\u0012\u0010\u0012\u001a\u00020\u00102\n\u0010\u0011\u001a\u00020\u0010\"\u00020\b\u001a\u0016\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0005\u001a\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\"\u0016\u0010\u001a\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0016\u0010\u001c\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"", "isTodayData", "Lcom/xiaomi/hm/health/databases/model/DateData;", "dateData", "needNapAlgo", "", "summary", "summarySupportNap", "", "getSupportNapSummaryVersion", "a", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/dataprocess/StageSleep;", "Lkotlin/collections/ArrayList;", "stageSleep", "fillNapBLankInterval", "", "dataSet", "calculatePercentages", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "date", "", "launchNapMockPage", "Lcom/xiaomi/hm/health/utils/RawNapMockDataFetcher;", "getNapMockDataManager", "ODD_SLEEP_ALGO_V", LogUtil.I, "DEFAULT_ALGO_V", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class NapUtilsKt {
    public static final int DEFAULT_ALGO_V = 5;
    public static final int ODD_SLEEP_ALGO_V = 6;

    private static final int a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return new JSONObject(str).optInt("v");
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00d0  */
    @NotNull
    public static final int[] calculatePercentages(@NotNull int... iArr) {
        int[] iArr2 = new int[iArr.length];
        int iSum = ArraysKt___ArraysKt.sum(iArr);
        if (iSum <= 0) {
            return iArr2;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i = 0;
        while (i < length) {
            int i2 = iArr[i];
            i++;
            float f = i2 / iSum;
            arrayList.add(Float.isNaN(f) ? new b(Float.valueOf(0.0f)) : new b(Float.valueOf(f * 100)));
        }
        float f2 = 100;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Float.valueOf((float) Math.floor(((b) it2.next()).a().floatValue())));
        }
        float fSumOfFloat = f2 - CollectionsKt___CollectionsKt.sumOfFloat(arrayList2);
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.xiaomi.hm.health.utils.NapUtilsKt$calculatePercentages$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                b bVar = (b) t;
                b bVar2 = (b) t2;
                return ComparisonsKt__ComparisonsKt.compareValues(Float.valueOf(((float) Math.floor(bVar.a().floatValue())) - bVar.a().floatValue()), Float.valueOf(((float) Math.floor(bVar2.a().floatValue())) - bVar2.a().floatValue()));
            }
        });
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortedWith, 10));
        int i3 = 0;
        for (Object obj : listSortedWith) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            b bVar = (b) obj;
            if (i3 >= fSumOfFloat) {
                iArr2[arrayList.indexOf(bVar)] = (int) Math.floor(bVar.a().floatValue());
            } else if (bVar.a().floatValue() == 0.0f) {
                iArr2[arrayList.indexOf(bVar)] = (int) Math.floor(bVar.a().floatValue());
            } else {
                iArr2[arrayList.indexOf(bVar)] = (int) (((float) Math.floor(bVar.a().floatValue())) + 1);
            }
            arrayList3.add(Unit.INSTANCE);
            i3 = i4;
        }
        return iArr2;
    }

    @NotNull
    public static final ArrayList<StageSleep> fillNapBLankInterval(@NotNull ArrayList<StageSleep> arrayList) {
        ArrayList<StageSleep> arrayList2 = new ArrayList<>();
        if (arrayList.isEmpty()) {
            return arrayList2;
        }
        if (arrayList.size() > 1) {
            g.sortWith(arrayList, new Comparator() { // from class: com.xiaomi.hm.health.utils.NapUtilsKt$fillNapBLankInterval$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((StageSleep) t).start), Integer.valueOf(((StageSleep) t2).start));
                }
            });
        }
        int i = 0;
        int i2 = arrayList.get(0).stop;
        for (Object obj : arrayList) {
            int i3 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            StageSleep stageSleep = (StageSleep) obj;
            if (i > 0) {
                if (stageSleep.start - i2 > 1) {
                    StageSleep stageSleep2 = new StageSleep();
                    stageSleep2.start = i2 + 1;
                    stageSleep2.stop = stageSleep.start - 1;
                    stageSleep2.mode = 128;
                    Unit unit = Unit.INSTANCE;
                    arrayList2.add(stageSleep2);
                }
                i2 = stageSleep.stop;
            }
            arrayList2.add(stageSleep);
            i = i3;
        }
        return arrayList2;
    }

    @Nullable
    public static final RawNapMockDataFetcher getNapMockDataManager() {
        try {
            Object objNewInstance = Class.forName("com.xiaomi.hm.health.ui.infomation.FakeRawNapMockDataFetcher").newInstance();
            if (objNewInstance != null) {
                return (RawNapMockDataFetcher) objNewInstance;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.xiaomi.hm.health.utils.RawNapMockDataFetcher");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final int getSupportNapSummaryVersion(@Nullable DateData dateData) {
        String summary;
        int iA;
        if (dateData == null || (summary = dateData.getSummary()) == null || (iA = a(summary)) < 6) {
            return 6;
        }
        return iA;
    }

    public static final void launchNapMockPage(@NotNull Context context, @NotNull String str) {
        try {
            Intent intent = new Intent(context, Class.forName("com.xiaomi.hm.health.ui.infomation.NapDataMockActivity"));
            intent.putExtra("date", str);
            Unit unit = Unit.INSTANCE;
            context.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final boolean needNapAlgo(boolean z, @Nullable DateData dateData) {
        return (z && HMDeviceConfig.supportNap()) || (!z && dateData != null && summarySupportNap(dateData.getSummary()));
    }

    public static final boolean summarySupportNap(@Nullable String str) {
        return a(str) >= 6;
    }
}
