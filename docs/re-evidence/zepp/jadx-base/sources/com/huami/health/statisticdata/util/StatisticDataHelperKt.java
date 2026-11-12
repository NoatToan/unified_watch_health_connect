package com.huami.health.statisticdata.util;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.huami.health.statisticdata.constants.DistributionTypeEnum;
import com.huami.health.statisticdata.model.StatisticDataModel;
import com.huami.sleep.daysleep.quotient.SleepQuotientProviderKt;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002\u001a\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a\u0016\u0010\b\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002\u001a\u0016\u0010\t\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002\u001a\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0002\u001a$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000\u001a\u001e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000\u001a\u001e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000\u001a\u001e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000\u001a\u001e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000\u001a\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0004H\u0000\"\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015\"\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0015\"\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0015\"\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015¨\u0006\u001a"}, d2 = {"", "Lcom/huami/health/statisticdata/model/StatisticDataModel;", "mCompareList", "a", "", "minDayTime", "", GoogleApiAvailabilityLight.a, "c", "b", "totalMin", "e", "Lcom/huami/health/statisticdata/constants/DistributionTypeEnum;", "distributionTypeEnum", "getStatisticDataList", "getStartIndex", "getEndIndex", "getStartCategory", "getEndCategory", "category", "getLabel", LogUtil.I, "START_SLEEP_TIME", "GET_UP_TIME", "X_AXIS_START_SLEEP_TIME", "X_AXIS_GET_UP_TIME", "statisticdata_release"}, k = 2, mv = {1, 4, 0})
public final class StatisticDataHelperKt {
    private static final int a = 1210;
    private static final int b = 1790;
    private static final int c = 1260;
    private static final int d = 1740;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 0})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[DistributionTypeEnum.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;

        static {
            int[] iArr = new int[DistributionTypeEnum.values().length];
            $EnumSwitchMapping$1 = iArr;
            DistributionTypeEnum distributionTypeEnum = DistributionTypeEnum.SLEEP_START;
            iArr[distributionTypeEnum.ordinal()] = 1;
            int[] iArr2 = new int[DistributionTypeEnum.values().length];
            $EnumSwitchMapping$2 = iArr2;
            iArr2[distributionTypeEnum.ordinal()] = 1;
            int[] iArr3 = new int[DistributionTypeEnum.values().length];
            $EnumSwitchMapping$3 = iArr3;
            iArr3[distributionTypeEnum.ordinal()] = 1;
            DistributionTypeEnum distributionTypeEnum2 = DistributionTypeEnum.SLEEP_DEEP_DURATION;
            iArr3[distributionTypeEnum2.ordinal()] = 2;
            int[] iArr4 = new int[DistributionTypeEnum.values().length];
            $EnumSwitchMapping$4 = iArr4;
            iArr4[distributionTypeEnum.ordinal()] = 1;
            iArr4[distributionTypeEnum2.ordinal()] = 2;
            int[] iArr5 = new int[DistributionTypeEnum.values().length];
            $EnumSwitchMapping$5 = iArr5;
            iArr5[distributionTypeEnum.ordinal()] = 1;
            iArr5[distributionTypeEnum2.ordinal()] = 2;
        }
    }

    private static final List<StatisticDataModel> a(List<StatisticDataModel> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (StatisticDataModel statisticDataModel : list) {
            int category = (int) statisticDataModel.getCategory();
            if (a <= category && b >= category) {
                arrayList.add(statisticDataModel);
            }
            arrayList2.add(Unit.INSTANCE);
        }
        return CollectionsKt___CollectionsKt.toList(arrayList);
    }

    private static final int b(List<StatisticDataModel> list) {
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (((int) ((StatisticDataModel) obj).getCategory()) == 1740) {
                return i;
            }
            i = i2;
        }
        return list.size() - 1;
    }

    private static final int c(List<StatisticDataModel> list) {
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (((int) ((StatisticDataModel) obj).getCategory()) == 1260) {
                return i;
            }
            i = i2;
        }
        return 0;
    }

    private static final String d(int i) {
        if (i > 1440) {
            i += SleepQuotientProviderKt.SLEEP_FALL_ASLEEP_MIN;
        }
        DecimalFormat decimalFormat = new DecimalFormat("00");
        return decimalFormat.format(Integer.valueOf(i / 60)) + JsonLexerKt.COLON + decimalFormat.format(Integer.valueOf(i % 60));
    }

    private static final String e(int i) {
        return new DecimalFormat(IdManager.DEFAULT_VERSION_NAME).format(Float.valueOf(i / 60));
    }

    @NotNull
    public static final String getEndCategory(@NotNull DistributionTypeEnum distributionTypeEnum, @NotNull List<StatisticDataModel> list) {
        int category = (int) list.get(list.size() - 1).getCategory();
        int i = WhenMappings.$EnumSwitchMapping$4[distributionTypeEnum.ordinal()];
        if (i != 1) {
            return i != 2 ? String.valueOf(category) : e(category);
        }
        return getLabel(distributionTypeEnum, (int) list.get(b(list)).getCategory());
    }

    public static final int getEndIndex(@NotNull DistributionTypeEnum distributionTypeEnum, @NotNull List<StatisticDataModel> list) {
        return WhenMappings.$EnumSwitchMapping$2[distributionTypeEnum.ordinal()] != 1 ? list.size() - 1 : b(list);
    }

    @NotNull
    public static final String getLabel(@NotNull DistributionTypeEnum distributionTypeEnum, int i) {
        int i2 = WhenMappings.$EnumSwitchMapping$5[distributionTypeEnum.ordinal()];
        if (i2 != 1) {
            return i2 != 2 ? String.valueOf(i) : e(i);
        }
        return d(i);
    }

    @NotNull
    public static final String getStartCategory(@NotNull DistributionTypeEnum distributionTypeEnum, @NotNull List<StatisticDataModel> list) {
        int category = (int) list.get(0).getCategory();
        int i = WhenMappings.$EnumSwitchMapping$3[distributionTypeEnum.ordinal()];
        if (i != 1) {
            return i != 2 ? String.valueOf(category) : e(category);
        }
        return getLabel(distributionTypeEnum, (int) list.get(c(list)).getCategory());
    }

    public static final int getStartIndex(@NotNull DistributionTypeEnum distributionTypeEnum, @NotNull List<StatisticDataModel> list) {
        if (WhenMappings.$EnumSwitchMapping$1[distributionTypeEnum.ordinal()] != 1) {
            return 0;
        }
        return c(list);
    }

    @NotNull
    public static final List<StatisticDataModel> getStatisticDataList(@NotNull DistributionTypeEnum distributionTypeEnum, @NotNull List<StatisticDataModel> list) {
        return list;
    }
}
