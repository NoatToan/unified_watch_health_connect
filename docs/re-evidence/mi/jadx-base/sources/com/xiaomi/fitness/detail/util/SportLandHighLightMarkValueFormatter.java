package com.xiaomi.fitness.detail.util;

import android.app.Application;
import android.content.Context;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SportRecordLandEntry;
import com.xiaomi.fitness.chart.entrys.model.SportItemModel;
import com.xiaomi.fitness.chart.entrys.model.SportRecordItemList;
import com.xiaomi.fitness.chart.util.SportRecordChatUtil;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.util.SportRecordDataUtil;
import defpackage.byi;
import defpackage.gv5;
import defpackage.j1j;
import defpackage.xr5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0015¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/detail/util/SportLandHighLightMarkValueFormatter;", "Lgv5;", "Landroid/content/Context;", "context", "Lcom/xiaomi/fitness/chart/entrys/SportRecordLandEntry;", "barEntry", "", "index", "", "createStr", "(Landroid/content/Context;Lcom/xiaomi/fitness/chart/entrys/SportRecordLandEntry;I)Ljava/lang/String;", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "key", "", "value", "getUnitStrByType", "(Landroid/content/Context;Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;F)Ljava/lang/String;", "getValueStrByType", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "getBarLabel", "(Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;)Ljava/lang/String;", "", "keyList", "", "setShowRecordKeyList", "(Ljava/util/List;)V", "showRecordKeyList", "Ljava/util/List;", DailyRecordKey.sportType, "Ljava/lang/Integer;", "getSportType", "()Ljava/lang/Integer;", "setSportType", "(Ljava/lang/Integer;)V", "digits", "<init>", "(I)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportLandHighLightMarkValueFormatter extends gv5 {

    @NotNull
    private List<? extends SportRecordKey> showRecordKeyList;

    @Nullable
    private Integer sportType;

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
                iArr[SportRecordKey.Power.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SportRecordKey.Speed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SportRecordKey.DivingTemperature.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SportRecordKey.DivingDepth.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SportRecordKey.Height.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SportRecordKey.VerticalAmplitude.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SportRecordKey.VerticalStrideRatio.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SportRecordKey.FreePitchAngle.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SportRecordKey.FreeBreathAngle.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SportRecordKey.FrogBreathAngle.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SportRecordKey.FrogSkiDuration.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SportRecordKey.Stress.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[SportRecordKey.StepsLength.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[SportRecordKey.StepsFrequency.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[SportRecordKey.Frequency.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[SportRecordKey.SwimPace.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[SportRecordKey.Pace.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[SportRecordKey.LandingImpact.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[SportRecordKey.TouchdownTime.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[SportRecordKey.InTheAirTime.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[SportRecordKey.TouchAirRatio.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[SportRecordKey.SwimSwolf.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SportLandHighLightMarkValueFormatter(int i) {
        super(i);
        this.showRecordKeyList = new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0090  */
    /* JADX WARN: Code duplicated, block: B:32:0x0158  */
    private final String createStr(Context context, SportRecordLandEntry barEntry, int index) {
        String string;
        String string2;
        StringBuilder sb;
        StringBuilder sb2;
        Map<SportRecordKey, SportRecordItemList> otherPointDataList = barEntry.getOtherPointDataList();
        Map<SportRecordKey, SportRecordItemList> otherLineDataList = barEntry.getOtherLineDataList();
        String str = "";
        for (SportRecordKey sportRecordKey : this.showRecordKeyList) {
            if (otherPointDataList.containsKey(sportRecordKey)) {
                SportRecordItemList sportRecordItemList = otherPointDataList.get(sportRecordKey);
                Intrinsics.checkNotNull(sportRecordItemList);
                List<SportItemModel> listValue = sportRecordItemList.getListValue();
                if (index < listValue.size()) {
                    String valueStrByType = getValueStrByType(context, sportRecordKey, listValue.get(index).getItemValue());
                    String unitStrByType = getUnitStrByType(context, sportRecordKey, listValue.get(index).getItemValue());
                    String titleStrByType = SportRecordDataUtil.INSTANCE.getTitleStrByType(context, sportRecordKey, this.sportType);
                    if (AppUtil.isRTLDirection()) {
                        sb2 = new StringBuilder();
                        sb2.append(unitStrByType);
                        sb2.append(gv5.CONNECT_VALUE_STR);
                        sb2.append(valueStrByType);
                        sb2.append(gv5.CONNECT_VALUE_STR);
                        sb2.append(titleStrByType);
                    } else {
                        sb2 = new StringBuilder();
                        sb2.append(titleStrByType);
                        sb2.append(gv5.CONNECT_VALUE_STR);
                        sb2.append(valueStrByType);
                        sb2.append(gv5.CONNECT_VALUE_STR);
                        sb2.append(unitStrByType);
                    }
                    string = sb2.toString();
                } else {
                    string = "";
                }
            } else {
                string = "";
            }
            if (Intrinsics.areEqual(str, "") && !Intrinsics.areEqual(string, "")) {
                str = (str + string) + "@@";
            } else if (!Intrinsics.areEqual(string, "")) {
                str = (str + "，" + string) + "@@";
            }
            if (otherLineDataList.containsKey(sportRecordKey)) {
                SportRecordItemList sportRecordItemList2 = otherLineDataList.get(sportRecordKey);
                Intrinsics.checkNotNull(sportRecordItemList2);
                List<SportItemModel> listValue2 = sportRecordItemList2.getListValue();
                if (index < listValue2.size()) {
                    String valueStrByType2 = getValueStrByType(context, sportRecordKey, listValue2.get(index).getItemValue());
                    String unitStrByType2 = getUnitStrByType(context, sportRecordKey, listValue2.get(index).getItemValue());
                    String titleStrByType2 = SportRecordDataUtil.INSTANCE.getTitleStrByType(context, sportRecordKey, this.sportType);
                    if (AppUtil.isRTLDirection()) {
                        sb = new StringBuilder();
                        sb.append(unitStrByType2);
                        sb.append(gv5.CONNECT_VALUE_STR);
                        sb.append(valueStrByType2);
                        sb.append(gv5.CONNECT_VALUE_STR);
                        sb.append(titleStrByType2);
                    } else {
                        sb = new StringBuilder();
                        sb.append(titleStrByType2);
                        sb.append(gv5.CONNECT_VALUE_STR);
                        sb.append(valueStrByType2);
                        sb.append(gv5.CONNECT_VALUE_STR);
                        sb.append(unitStrByType2);
                    }
                    string2 = sb.toString();
                } else {
                    string2 = "";
                }
            } else {
                string2 = "";
            }
            if (Intrinsics.areEqual(str, "") && !Intrinsics.areEqual(string2, "")) {
                str = (str + string2) + "@@";
            } else if (!Intrinsics.areEqual(string2, "")) {
                str = (str + "，" + string2) + "@@";
            }
        }
        return str;
    }

    private final String getUnitStrByType(Context context, SportRecordKey key, float value) {
        switch (WhenMappings.$EnumSwitchMapping$0[key.ordinal()]) {
            case 1:
                String quantityString = context.getResources().getQuantityString(byi.common_unit_heart_rate, (int) value);
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                return quantityString;
            case 2:
                String quantityString2 = context.getResources().getQuantityString(byi.y, (int) value);
                Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
                return quantityString2;
            case 3:
                String quantityString3 = context.getResources().getQuantityString(byi.X, (int) value, "");
                Intrinsics.checkNotNullExpressionValue(quantityString3, "getQuantityString(...)");
                return quantityString3;
            case 4:
                String string = context.getString(j1j.n4);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return string;
            case 5:
            case 6:
                String quantityString4 = context.getResources().getQuantityString(byi.a0, (int) value);
                Intrinsics.checkNotNullExpressionValue(quantityString4, "getQuantityString(...)");
                return quantityString4;
            case 7:
                String quantityString5 = context.getResources().getQuantityString(byi.l, (int) value);
                Intrinsics.checkNotNullExpressionValue(quantityString5, "getQuantityString(...)");
                return quantityString5;
            case 8:
                return "%";
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            default:
                return "";
            case 12:
                String quantityString6 = context.getResources().getQuantityString(byi.V, (int) value);
                Intrinsics.checkNotNullExpressionValue(quantityString6, "getQuantityString(...)");
                return quantityString6;
        }
    }

    private final String getValueStrByType(Context context, SportRecordKey key, float value) {
        SportRecordChatUtil sportRecordChatUtil = SportRecordChatUtil.INSTANCE;
        if (sportRecordChatUtil.checkZeroNotValidByKey(key, value)) {
            return "--";
        }
        if (sportRecordChatUtil.chartSportPaceKey(key)) {
            return value < 1800.0f ? TimeDateUtil.getSportPaceStrWithSecDef((int) value) : "--";
        }
        return sportRecordChatUtil.checkFloatValidByKey(key) ? String.valueOf(xr5.e(1, value)) : String.valueOf((int) value);
    }

    @Override // defpackage.gv5, defpackage.onq
    @NotNull
    public String getBarLabel(@NotNull RecyclerBarEntry barEntry) {
        String string;
        StringBuilder sb;
        Intrinsics.checkNotNullParameter(barEntry, "barEntry");
        Application application = ApplicationExtKt.getApplication();
        SportRecordLandEntry sportRecordLandEntry = (SportRecordLandEntry) barEntry;
        int iFindRangeIndex = sportRecordLandEntry.findRangeIndex(sportRecordLandEntry.getSelectX());
        if (iFindRangeIndex == -1) {
            return "";
        }
        long itemTime = sportRecordLandEntry.getItemTime(iFindRangeIndex);
        if (this.showRecordKeyList.contains(sportRecordLandEntry.getDataItem().getSportRecordKey())) {
            float itemValues = sportRecordLandEntry.getItemValues(iFindRangeIndex);
            String valueStrByType = getValueStrByType(application, sportRecordLandEntry.getDataItem().getSportRecordKey(), itemValues);
            String titleStrByType = SportRecordDataUtil.INSTANCE.getTitleStrByType(application, sportRecordLandEntry.getDataItem().getSportRecordKey(), this.sportType);
            String unitStrByType = getUnitStrByType(application, sportRecordLandEntry.getDataItem().getSportRecordKey(), itemValues);
            if (AppUtil.isRTLDirection()) {
                sb = new StringBuilder();
                sb.append(unitStrByType);
                sb.append(gv5.CONNECT_VALUE_STR);
                sb.append(valueStrByType);
                sb.append(gv5.CONNECT_VALUE_STR);
                sb.append(titleStrByType);
            } else {
                sb = new StringBuilder();
                sb.append(titleStrByType);
                sb.append(gv5.CONNECT_VALUE_STR);
                sb.append(valueStrByType);
                sb.append(gv5.CONNECT_VALUE_STR);
                sb.append(unitStrByType);
            }
            string = sb.toString();
        } else {
            string = "";
        }
        String strCreateStr = createStr(application, sportRecordLandEntry, iFindRangeIndex);
        if (!Intrinsics.areEqual(strCreateStr, "")) {
            if (Intrinsics.areEqual(string, "")) {
                string = strCreateStr;
            } else {
                string = string + "，@@" + strCreateStr;
            }
        }
        long j = 60;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf((itemTime / ((long) 3600)) % ((long) 24)), Long.valueOf((itemTime / j) % j), Long.valueOf(itemTime % j)}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return string + gv5.CONNECT_STR + str;
    }

    @Nullable
    public final Integer getSportType() {
        return this.sportType;
    }

    public final void setShowRecordKeyList(@NotNull List<? extends SportRecordKey> keyList) {
        Intrinsics.checkNotNullParameter(keyList, "keyList");
        this.showRecordKeyList = keyList;
    }

    public final void setSportType(@Nullable Integer num) {
        this.sportType = num;
    }
}
