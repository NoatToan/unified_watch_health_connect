package com.xiaomi.fitness.util;

import android.app.Application;
import android.content.Context;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.data.common.data.sport.GroupSportDetailInfo;
import com.xiaomi.fit.data.common.data.sport.GroupSportRecord;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.chart.entrys.SportRecordEntry;
import com.xiaomi.fitness.chart.entrys.SportRecordLandEntry;
import com.xiaomi.fitness.chart.entrys.model.SportItemModel;
import com.xiaomi.fitness.chart.entrys.model.SportRecordItemList;
import com.xiaomi.fitness.chart.util.SportRecordChatUtil;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.detail.model.GroupInfoViewModel;
import com.xiaomi.fitness.detail.model.SportRecordListModel;
import defpackage.dki;
import defpackage.j1j;
import defpackage.vfe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b?\u0010@J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000e\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00022\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JC\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00022\u0006\u0010\u001a\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\"J+\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&JQ\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00022\u0006\u0010(\u001a\u00020'2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u0016¢\u0006\u0004\b.\u0010/JI\u00107\u001a\u00020\r2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u00102\u001a\b\u0012\u0004\u0012\u00020-012\u0006\u00103\u001a\u00020#2\u0006\u00104\u001a\u00020#2\u0006\u00105\u001a\u00020#2\u0006\u00106\u001a\u00020\u0016¢\u0006\u0004\b7\u00108J\u0015\u00109\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b9\u0010\u0019J)\u0010=\u001a\u00020<2\u0006\u0010;\u001a\u00020:2\u0006\u00106\u001a\u00020\u00162\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lcom/xiaomi/fitness/util/SportRecordDataUtil;", "", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "sportItemValueList", "Lcom/xiaomi/fitness/detail/model/SportRecordListModel;", "createEntryListInner", "(Ljava/util/List;)Lcom/xiaomi/fitness/detail/model/SportRecordListModel;", "Lcom/xiaomi/fitness/chart/entrys/SportRecordEntry;", "entries", "", "minValueIndex", "maxValueIndex", "", "setEntriesMinMaxFlag", "(Ljava/util/List;II)V", "Lcom/xiaomi/fit/data/common/data/sport/GroupSportDetailInfo;", "trainingInfoList", DailyRecordKey.sportType, "Lcom/xiaomi/fitness/detail/model/GroupInfoViewModel;", "createGroupInfoViewModel", "(Ljava/util/List;I)Ljava/util/List;", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "sportRecordKey", "getLinerFillEndColorsByKey", "(Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;)I", "index", "originalValue", "distance", "", "dataTime", "mSportRecordKey", "Lcom/xiaomi/fitness/chart/entrys/model/SportItemModel;", "modeListValue", "(ILjava/util/List;IJLcom/xiaomi/fit/data/common/data/sport/SportRecordKey;)Ljava/util/List;", "", "maxLevel", "createPaceEntryList", "(Ljava/util/List;F)Ljava/util/List;", "Lvfe;", "lineChartAttrs", "recordList", "timestamp", "originEntrySize", "length", "Lcom/xiaomi/fitness/chart/entrys/SportRecordLandEntry;", "createDataLineEntries", "(Lvfe;Ljava/util/List;JIIILcom/xiaomi/fit/data/common/data/sport/SportRecordKey;)Ljava/util/List;", "itemList", "", "mEntries", "mPercent", Constants.KEY_RECHARGE_MINVALUE, "itemMinValue", "key", "createOtherDataList", "(Ljava/util/List;Ljava/util/List;FFFLcom/xiaomi/fit/data/common/data/sport/SportRecordKey;)V", "getLinerColorsByKey", "Landroid/content/Context;", "context", "", "getTitleStrByType", "(Landroid/content/Context;Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;Ljava/lang/Integer;)Ljava/lang/String;", "<init>", "()V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportRecordDataUtil {

    @NotNull
    public static final SportRecordDataUtil INSTANCE = new SportRecordDataUtil();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SportRecordKey.values().length];
            try {
                iArr[SportRecordKey.Hr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SportRecordKey.SwimPace.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SportRecordKey.Speed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SportRecordKey.Pace.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SportRecordKey.Stress.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SportRecordKey.Power.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SportRecordKey.Height.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SportRecordKey.StepsLength.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SportRecordKey.SwimStrokeFreq.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SportRecordKey.StepsFrequency.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SportRecordKey.Frequency.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SportRecordKey.Resistance.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SportRecordKey.SkippingHeight.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[SportRecordKey.SwimSwolf.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[SportRecordKey.LandingImpact.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[SportRecordKey.TouchdownTime.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[SportRecordKey.InTheAirTime.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[SportRecordKey.TouchAirRatio.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[SportRecordKey.VerticalAmplitude.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[SportRecordKey.VerticalStrideRatio.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[SportRecordKey.RunningPower.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[SportRecordKey.DivingDepth.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[SportRecordKey.DivingTemperature.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[SportRecordKey.EqualIntensityPace.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[SportRecordKey.FrogBreathAngle.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[SportRecordKey.FrogSkiDuration.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[SportRecordKey.FreePitchAngle.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[SportRecordKey.FreeBreathAngle.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SportRecordDataUtil() {
    }

    @JvmStatic
    @NotNull
    public static final SportRecordListModel createEntryListInner(@Nullable List<SportRecordItem> sportItemValueList) {
        List<SportRecordItem> list = sportItemValueList;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (list == null || sportItemValueList.isEmpty()) {
            return new SportRecordListModel(arrayList, 0, 0);
        }
        int size = sportItemValueList.size();
        float fMin = 2.14748365E9f;
        float fMax = -2.14748365E9f;
        int i2 = 0;
        int i3 = 0;
        while (i < size) {
            SportRecordItem sportRecordItem = list.get(i);
            long endTime = sportRecordItem.getEndTime();
            Number value = sportRecordItem.getValue();
            int index = sportRecordItem.getIndex();
            float fFloatValue = value.floatValue();
            fMin = Math.min(fMin, fFloatValue);
            if (fMin == fFloatValue) {
                i2 = i;
            }
            fMax = Math.max(fMax, fFloatValue);
            if (fMax == fFloatValue) {
                i3 = i;
            }
            SportRecordEntry sportRecordEntry = new SportRecordEntry(index, fFloatValue, endTime, 3);
            sportRecordEntry.localDate = TimeDateUtil.timestampToLocalDate(endTime);
            arrayList.add(sportRecordEntry);
            i++;
            list = sportItemValueList;
        }
        INSTANCE.setEntriesMinMaxFlag(arrayList, i2, i3);
        return new SportRecordListModel(arrayList, i2, i3);
    }

    @JvmStatic
    @NotNull
    public static final List<GroupInfoViewModel> createGroupInfoViewModel(@Nullable List<GroupSportDetailInfo> trainingInfoList, int sportType) {
        ArrayList arrayList = new ArrayList();
        if (trainingInfoList != null) {
            int size = trainingInfoList.size();
            Application app = AppUtil.getApp();
            for (int i = 0; i < size; i++) {
                GroupSportDetailInfo groupSportDetailInfo = trainingInfoList.get(i);
                GroupSportRecord sportRecordInfo = groupSportDetailInfo.getSportRecordInfo();
                if (sportRecordInfo != null) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String string = app.getString(j1j.V5);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    String str = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(i + 1)}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    arrayList.add(GroupInfoViewModel.INSTANCE.createGroupInfoSportModel(str, sportType, sportRecordInfo));
                }
                GroupSportRecord restRecordInfo = groupSportDetailInfo.getRestRecordInfo();
                if (restRecordInfo != null) {
                    GroupInfoViewModel.Companion companion = GroupInfoViewModel.INSTANCE;
                    String string2 = app.getString(j1j.W4);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    arrayList.add(companion.createGroupInfoRestModel(string2, sportType, restRecordInfo));
                }
            }
        }
        return arrayList;
    }

    private final int getLinerFillEndColorsByKey(SportRecordKey sportRecordKey) {
        int i = WhenMappings.$EnumSwitchMapping$0[sportRecordKey.ordinal()];
        if (i != 2) {
            if (i == 3) {
                return ExtUtilsKt.getColor(dki.x0);
            }
            if (i != 4 && i != 6) {
                if (i == 7) {
                    return ExtUtilsKt.getColor(dki.o0);
                }
                if (i == 12) {
                    return ExtUtilsKt.getColor(dki.f15627r);
                }
                if (i == 14) {
                    return ExtUtilsKt.getColor(dki.B0);
                }
                if (i != 21) {
                    switch (i) {
                        case 24:
                            break;
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                            return ExtUtilsKt.getColor(dki.x0);
                        default:
                            return ExtUtilsKt.getColor(dki.e2);
                    }
                }
            }
        }
        return ExtUtilsKt.getColor(dki.x0);
    }

    public static /* synthetic */ String getTitleStrByType$default(SportRecordDataUtil sportRecordDataUtil, Context context, SportRecordKey sportRecordKey, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        return sportRecordDataUtil.getTitleStrByType(context, sportRecordKey, num);
    }

    private final List<SportItemModel> modeListValue(int index, List<SportRecordItem> originalValue, int distance, long dataTime, SportRecordKey mSportRecordKey) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = distance + index;
        while (index < i) {
            float fFloatValue = originalValue.get(index % originalValue.size()).getValue().floatValue();
            SportItemModel sportItemModel = new SportItemModel(fFloatValue, fFloatValue, index);
            ListExtKt.add(arrayList, Float.valueOf(fFloatValue));
            ListExtKt.add(arrayList2, sportItemModel);
            index++;
        }
        return arrayList2;
    }

    private final void setEntriesMinMaxFlag(List<? extends SportRecordEntry> entries, int minValueIndex, int maxValueIndex) {
        if (minValueIndex < entries.size() && minValueIndex >= 0) {
            entries.get(minValueIndex).isMinMax = -1;
            int i = minValueIndex - 1;
            if (i >= 0) {
                entries.get(i).isMinMax = -2;
            }
            int i2 = minValueIndex + 1;
            if (i2 < entries.size()) {
                entries.get(i2).isMinMax = -2;
            }
            int i3 = minValueIndex - 2;
            if (i3 >= 0) {
                entries.get(i3).isMinMax = -2;
            }
            int i4 = minValueIndex + 2;
            if (i4 < entries.size()) {
                entries.get(i4).isMinMax = -2;
            }
        }
        if (maxValueIndex >= entries.size() || maxValueIndex < 0) {
            return;
        }
        entries.get(maxValueIndex).isMinMax = 1;
        int i5 = maxValueIndex - 1;
        if (i5 >= 0) {
            entries.get(i5).isMinMax = 2;
        }
        int i6 = maxValueIndex + 1;
        if (i6 < entries.size()) {
            entries.get(i6).isMinMax = 2;
        }
        int i7 = maxValueIndex - 2;
        if (i7 >= 0) {
            entries.get(i7).isMinMax = 2;
        }
        int i8 = maxValueIndex + 2;
        if (i8 < entries.size()) {
            entries.get(i8).isMinMax = 2;
        }
    }

    @NotNull
    public final List<SportRecordLandEntry> createDataLineEntries(@NotNull vfe lineChartAttrs, @NotNull List<SportRecordItem> recordList, long timestamp, int originEntrySize, int length, int distance, @NotNull SportRecordKey mSportRecordKey) {
        float f;
        int i;
        int i2;
        int size;
        List<SportRecordItem> recordList2 = recordList;
        int i3 = length;
        Intrinsics.checkNotNullParameter(lineChartAttrs, "lineChartAttrs");
        Intrinsics.checkNotNullParameter(recordList2, "recordList");
        Intrinsics.checkNotNullParameter(mSportRecordKey, "mSportRecordKey");
        ArrayList arrayList = new ArrayList();
        int i4 = i3 + originEntrySize;
        float f2 = 0.0f;
        int i5 = originEntrySize;
        int i6 = 0;
        while (i5 < i4) {
            float size2 = f2 + ((recordList.size() / i3) - distance);
            int i7 = 1;
            if (size2 > 1.0f) {
                f = size2 - 1;
                i = distance + 1;
            } else {
                f = size2;
                i = distance;
            }
            float fFloatValue = recordList2.get(i5).getValue().floatValue();
            if (i5 == i3 / 3) {
                size = recordList.size() / 3;
                i7 = 4;
            } else if (i5 == (i3 * 2) / 3) {
                size = (recordList.size() * 2) / 3;
            } else {
                if (i5 == i4 - 1) {
                    size = recordList.size() - 1;
                } else {
                    i2 = i5 == 0 ? 1 : 3;
                    size = 0;
                }
                LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(timestamp);
                SportRecordLandEntry sportRecordLandEntry = new SportRecordLandEntry(i5, fFloatValue, size, i2);
                sportRecordLandEntry.localDate = localDateTimestampToLocalDate;
                if (i5 != i4 - 1 && i6 + i < recordList.size()) {
                    i++;
                }
                int i8 = i;
                sportRecordLandEntry.getDataItem().setListValue(modeListValue(i6, recordList, i8, timestamp, mSportRecordKey));
                sportRecordLandEntry.getDataItem().setSportRecordKey(mSportRecordKey);
                sportRecordLandEntry.getDataItem().setSportLineColor(getLinerColorsByKey(mSportRecordKey));
                sportRecordLandEntry.getDataItem().setEndFillColor(getLinerFillEndColorsByKey(mSportRecordKey));
                i6 += i8;
                arrayList.add(sportRecordLandEntry);
                i5++;
                recordList2 = recordList;
                i3 = length;
                f2 = f;
            }
            i2 = i7;
            LocalDate localDateTimestampToLocalDate2 = TimeDateUtil.timestampToLocalDate(timestamp);
            SportRecordLandEntry sportRecordLandEntry2 = new SportRecordLandEntry(i5, fFloatValue, size, i2);
            sportRecordLandEntry2.localDate = localDateTimestampToLocalDate2;
            if (i5 != i4 - 1) {
            }
            int i9 = i;
            sportRecordLandEntry2.getDataItem().setListValue(modeListValue(i6, recordList, i9, timestamp, mSportRecordKey));
            sportRecordLandEntry2.getDataItem().setSportRecordKey(mSportRecordKey);
            sportRecordLandEntry2.getDataItem().setSportLineColor(getLinerColorsByKey(mSportRecordKey));
            sportRecordLandEntry2.getDataItem().setEndFillColor(getLinerFillEndColorsByKey(mSportRecordKey));
            i6 += i9;
            arrayList.add(sportRecordLandEntry2);
            i5++;
            recordList2 = recordList;
            i3 = length;
            f2 = f;
        }
        return arrayList;
    }

    public final void createOtherDataList(@NotNull List<SportRecordItem> itemList, @NotNull List<SportRecordLandEntry> mEntries, float mPercent, float minValue, float itemMinValue, @NotNull SportRecordKey key) {
        Intrinsics.checkNotNullParameter(itemList, "itemList");
        Intrinsics.checkNotNullParameter(mEntries, "mEntries");
        Intrinsics.checkNotNullParameter(key, "key");
        int i = 0;
        for (SportRecordLandEntry sportRecordLandEntry : mEntries) {
            SportRecordItemList sportRecordItemList = new SportRecordItemList(key, getLinerColorsByKey(key));
            sportRecordItemList.setEndFillColor(getLinerFillEndColorsByKey(key));
            int size = sportRecordLandEntry.getDataItem().getListValue().size();
            int i2 = i;
            for (int i3 = 0; i3 < size; i3++) {
                if (i2 < itemList.size()) {
                    float fFloatValue = itemList.get(i2).getValue().floatValue();
                    int i4 = i2 + 1;
                    float fFloatValue2 = ((itemList.get(i2).getValue().floatValue() - itemMinValue) * mPercent) + minValue;
                    if (fFloatValue < itemMinValue) {
                        fFloatValue2 = minValue;
                    }
                    ListExtKt.add(sportRecordItemList.getListValue(), new SportItemModel(fFloatValue2, fFloatValue, sportRecordLandEntry.getDataItem().getListValue().get(i3).getItemTime()));
                    i2 = i4;
                } else if (i2 == itemList.size()) {
                    int i5 = i2 - 1;
                    float fFloatValue3 = itemList.get(i5).getValue().floatValue();
                    float fFloatValue4 = ((itemList.get(i5).getValue().floatValue() - itemMinValue) * mPercent) + minValue;
                    if (fFloatValue3 < itemMinValue) {
                        fFloatValue4 = minValue;
                    }
                    ListExtKt.add(sportRecordItemList.getListValue(), new SportItemModel(fFloatValue4, fFloatValue3, sportRecordLandEntry.getDataItem().getListValue().get(i3).getItemTime()));
                }
            }
            SportRecordChatUtil sportRecordChatUtil = SportRecordChatUtil.INSTANCE;
            if (SportRecordChatUtil.chartSportLineKey$default(sportRecordChatUtil, key, null, null, 6, null)) {
                sportRecordLandEntry.getOtherLineDataList().put(key, sportRecordItemList);
            } else if (sportRecordChatUtil.chartSportPointKey(key)) {
                sportRecordLandEntry.getOtherPointDataList().put(key, sportRecordItemList);
            }
            i = i2;
        }
    }

    @NotNull
    public final List<SportRecordEntry> createPaceEntryList(@Nullable List<SportRecordItem> sportItemValueList, float maxLevel) {
        float f;
        ArrayList arrayList = new ArrayList();
        if (sportItemValueList != null && !sportItemValueList.isEmpty()) {
            int size = sportItemValueList.size();
            float fMin = 2.14748365E9f;
            float fMax = -2.14748365E9f;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                SportRecordItem sportRecordItem = sportItemValueList.get(i3);
                if (maxLevel != -1.0f && sportRecordItem.getValue().floatValue() > maxLevel) {
                    f = 0.0f;
                } else {
                    float fFloatValue = sportRecordItem.getValue().floatValue();
                    f = fFloatValue;
                }
                if (f > 0.0f) {
                    fMin = Math.min(fMin, f);
                    if (fMin == f) {
                        i = i3;
                    }
                }
                fMax = Math.max(fMax, f);
                if (fMax == f) {
                    i2 = i3;
                }
                int index = sportRecordItem.getIndex();
                long endTime = sportRecordItem.getEndTime();
                SportRecordEntry sportRecordEntry = new SportRecordEntry(index, f, endTime, 3);
                sportRecordEntry.localDate = TimeDateUtil.timestampToLocalDate(endTime);
                arrayList.add(sportRecordEntry);
            }
            setEntriesMinMaxFlag(arrayList, i, i2);
        }
        return arrayList;
    }

    public final int getLinerColorsByKey(@NotNull SportRecordKey sportRecordKey) {
        Intrinsics.checkNotNullParameter(sportRecordKey, "sportRecordKey");
        switch (WhenMappings.$EnumSwitchMapping$0[sportRecordKey.ordinal()]) {
            case 1:
                return ExtUtilsKt.getColor(dki.t0);
            case 2:
            case 3:
            case 4:
                return ExtUtilsKt.getColor(dki.w0);
            case 5:
                return ExtUtilsKt.getColor(dki.z0);
            case 6:
                return ExtUtilsKt.getColor(dki.v0);
            case 7:
                return ExtUtilsKt.getColor(dki.s0);
            case 8:
                return ExtUtilsKt.getColor(dki.y0);
            case 9:
            case 10:
            case 11:
                return ExtUtilsKt.getColor(dki.r0);
            case 12:
                return ExtUtilsKt.getColor(dki.q);
            case 13:
            case 14:
                return ExtUtilsKt.getColor(dki.A0);
            case 15:
                return ExtUtilsKt.getColor(dki.u0);
            case 16:
                return ExtUtilsKt.getColor(dki.C0);
            case 17:
                return ExtUtilsKt.getColor(dki.D0);
            case 18:
                return ExtUtilsKt.getColor(dki.p0);
            case 19:
                return ExtUtilsKt.getColor(dki.p0);
            case 20:
                return ExtUtilsKt.getColor(dki.D0);
            case 21:
                return ExtUtilsKt.getColor(dki.v0);
            case 22:
                return ExtUtilsKt.getColor(dki.s0);
            case 23:
                return ExtUtilsKt.getColor(dki.s0);
            case 24:
                return ExtUtilsKt.getColor(dki.q0);
            case 25:
                return ExtUtilsKt.getColor(dki.u0);
            case 26:
                return ExtUtilsKt.getColor(dki.C0);
            case 27:
                return ExtUtilsKt.getColor(dki.q);
            case 28:
                return ExtUtilsKt.getColor(dki.y0);
            default:
                return ExtUtilsKt.getColor(dki.G);
        }
    }

    @NotNull
    public final String getTitleStrByType(@NotNull Context context, @NotNull SportRecordKey key, @Nullable Integer sportType) {
        int i;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        switch (WhenMappings.$EnumSwitchMapping$0[key.ordinal()]) {
            case 1:
                i = j1j.O7;
                break;
            case 2:
            case 4:
                i = j1j.K3;
                break;
            case 3:
                i = j1j.N3;
                break;
            case 5:
                i = j1j.K9;
                break;
            case 6:
                i = j1j.Z5;
                break;
            case 7:
                i = j1j.b5;
                break;
            case 8:
                i = j1j.w7;
                break;
            case 9:
                i = j1j.U9;
                break;
            case 10:
                i = j1j.v7;
                break;
            case 11:
                if ((sportType == null || sportType.intValue() != 6) && (sportType == null || sportType.intValue() != 7)) {
                    i = ((sportType == null || sportType.intValue() != 13) && (sportType == null || sportType.intValue() != 9) && (sportType == null || sportType.intValue() != 10)) ? j1j.A0 : j1j.V9;
                } else {
                    i = j1j.a3;
                }
                break;
            case 12:
                i = j1j.V1;
                break;
            case 13:
                i = j1j.p7;
                break;
            case 14:
                i = j1j.L8;
                break;
            case 15:
                i = j1j.j8;
                break;
            case 16:
                i = j1j.e8;
                break;
            case 17:
                i = j1j.r8;
                break;
            case 18:
                i = j1j.f8;
                break;
            case 19:
                i = j1j.D8;
                break;
            case 20:
                i = j1j.F8;
                break;
            case 21:
                i = j1j.Z6;
                break;
            case 22:
                i = j1j.S3;
                break;
            case 23:
                i = j1j.V3;
                break;
            case 24:
                i = j1j.u4;
                break;
            case 25:
                i = j1j.K7;
                break;
            case 26:
                i = j1j.M7;
                break;
            case 27:
                i = j1j.H7;
                break;
            case 28:
                i = j1j.F7;
                break;
            default:
                i = j1j.I0;
                break;
        }
        String string = context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }
}
