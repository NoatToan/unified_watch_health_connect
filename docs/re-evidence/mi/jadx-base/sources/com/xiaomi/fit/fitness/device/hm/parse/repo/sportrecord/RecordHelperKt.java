package com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord;

import android.util.ArrayMap;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.device.hm.data.HmSportMode;
import com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.data.AltitudeItem;
import com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord.data.PauseItem;
import com.xiaomi.fit.fitness.device.hm.parse.utils.HMParseUtilKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u001a#\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000fj\b\u0012\u0004\u0012\u00020\f`\u000e2\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u0010\u001a\"\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005\u001a\"\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005\u001a\"\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005\u001a\"\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00170\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005\u001a#\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u000fj\b\u0012\u0004\u0012\u00020\u0019`\u000e2\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u0010\u001a+\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000fj\b\u0012\u0004\u0012\u00020\u0005`\u000e2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\u001c\u001a\"\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001e0\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005\u001a*\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0001\u001a+\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\"0\u000fj\b\u0012\u0004\u0012\u00020\"`\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\u001c\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"HM_SPORT_BYTES_CAPABILITY", "", "ACTIVITY_INTENSITY_TIME", "parseWholeKilo", "", "", "", "json", "", "startTime", "pauseList", "", "Lcom/xiaomi/fit/fitness/device/hm/parse/repo/sportrecord/data/PauseItem;", "parsePauseTime", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "(Ljava/lang/String;)Ljava/util/ArrayList;", "parseHr", "Landroid/util/ArrayMap;", "parseStress", "parseSwimmingPace", "", "parseStrokeFreq", "", "parseAltitude", "Lcom/xiaomi/fit/fitness/device/hm/parse/repo/sportrecord/data/AltitudeItem;", "parseTime", "timeJson", "(Ljava/lang/String;J)Ljava/util/ArrayList;", "parseStepInfo", "Lcom/xiaomi/fit/fitness/device/hm/parse/repo/sportrecord/HMStepInfo;", "parseSpeedDistance", "recordAcc", "parseIntervalInfo", "Lcom/xiaomi/fit/fitness/device/hm/parse/repo/sportrecord/HMIntervalInfo;", "fitness-sync_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RecordHelperKt {
    public static final int ACTIVITY_INTENSITY_TIME = 60;
    public static final int HM_SPORT_BYTES_CAPABILITY = 1024;

    @NotNull
    public static final ArrayList<AltitudeItem> parseAltitude(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        int i = 0;
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) json, new String[]{";"}, false, 0, 6, (Object) null);
        ArrayList<AltitudeItem> arrayList = new ArrayList<>();
        int size = listSplit$default.size();
        float f = 0.0f;
        while (i < size) {
            float f2 = Float.parseFloat((String) listSplit$default.get(i));
            arrayList.add(new AltitudeItem(f2, f2 - f));
            i++;
            f = f2;
        }
        return arrayList;
    }

    @NotNull
    public static final ArrayMap<Long, Integer> parseHr(@NotNull String json, long j) {
        Integer num;
        Intrinsics.checkNotNullParameter(json, "json");
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) json, new String[]{";"}, false, 0, 6, (Object) null);
        ArrayMap<Long, Integer> arrayMap = new ArrayMap<>();
        int size = listSplit$default.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(i2), new String[]{","}, false, 0, 6, (Object) null);
            if (listSplit$default2.size() > 1) {
                String str = (String) listSplit$default2.get(0);
                j += (long) (str.length() > 0 ? Integer.parseInt(str) : 1);
                i += ((CharSequence) listSplit$default2.get(1)).length() > 0 ? Integer.parseInt((String) listSplit$default2.get(1)) : 0;
                if (!arrayMap.containsKey(Long.valueOf(j)) || (num = arrayMap.get(Long.valueOf(j))) == null || num.intValue() != i) {
                    arrayMap.put(Long.valueOf(j), Integer.valueOf(i));
                }
            }
        }
        return arrayMap;
    }

    @NotNull
    public static final ArrayList<HMIntervalInfo> parseIntervalInfo(@NotNull String json, long j) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(json, "json");
        ArrayList<HMIntervalInfo> arrayList = new ArrayList<>();
        Iterator it = StringsKt__StringsKt.split$default((CharSequence) json, new String[]{";"}, false, 0, 6, (Object) null).iterator();
        long j2 = j;
        while (it.hasNext()) {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) it.next(), new String[]{","}, false, 0, 6, (Object) null);
            FitnessLogUtils.i(HMParseUtilKt.TAG, "parseIntervalInfo: " + listSplit$default);
            if (listSplit$default.size() >= 29) {
                if (Integer.parseInt((String) listSplit$default.get(20)) != HmSportMode.IntervalTraining.getValue()) {
                    return arrayList;
                }
                switch (Integer.parseInt((String) listSplit$default.get(27))) {
                    case 1:
                        i = 0;
                        i2 = i;
                        break;
                    case 2:
                        i2 = 1;
                        break;
                    case 3:
                        i2 = 2;
                        break;
                    case 4:
                        i = 3;
                        i2 = i;
                        break;
                    case 5:
                    case 7:
                    case 12:
                    default:
                        i = 8;
                        i2 = i;
                        break;
                    case 6:
                    case 10:
                        i = 4;
                        i2 = i;
                        break;
                    case 8:
                    case 13:
                    case 14:
                        i2 = 5;
                        break;
                    case 9:
                    case 11:
                        i = 7;
                        i2 = i;
                        break;
                }
                int i3 = Integer.parseInt((String) listSplit$default.get(1));
                long j3 = j + Long.parseLong((String) listSplit$default.get(5));
                HMIntervalInfo hMIntervalInfo = new HMIntervalInfo(j2, j3, i3, i2);
                hMIntervalInfo.setTotalDistance(Integer.parseInt((String) listSplit$default.get(2)));
                hMIntervalInfo.setTotalSkipCount(Integer.parseInt((String) listSplit$default.get(19)));
                hMIntervalInfo.setTotalRowCount(Integer.parseInt((String) listSplit$default.get(13)));
                arrayList.add(hMIntervalInfo);
                j2 = j3;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final ArrayList<PauseItem> parsePauseTime(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) json, new String[]{";"}, false, 0, 6, (Object) null);
        ArrayList<PauseItem> arrayList = new ArrayList<>();
        int size = listSplit$default.size();
        for (int i = 0; i < size; i++) {
            List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(i), new String[]{","}, false, 0, 6, (Object) null);
            int size2 = listSplit$default2.size();
            if (size2 > 2) {
                long j = Long.parseLong((String) listSplit$default2.get(0));
                PauseItem pauseItem = new PauseItem(j, j + ((long) Integer.parseInt((String) listSplit$default2.get(1))), Integer.parseInt((String) listSplit$default2.get(size2 - 1)));
                arrayList.add(pauseItem);
                FitnessLogUtils.i(HMParseUtilKt.TAG, "parsePauseTime data=" + pauseItem);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final ArrayMap<Long, Integer> parseSpeedDistance(@NotNull String json, long j, int i) {
        Intrinsics.checkNotNullParameter(json, "json");
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) json, new String[]{";"}, false, 0, 6, (Object) null);
        ArrayMap<Long, Integer> arrayMap = new ArrayMap<>();
        int size = listSplit$default.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(i3), new String[]{","}, false, 0, 6, (Object) null);
            if (listSplit$default2.size() >= 2 && ((CharSequence) listSplit$default2.get(1)).length() > 0) {
                int i4 = listSplit$default2.isEmpty() ^ true ? Integer.parseInt((String) listSplit$default2.get(0)) : 1;
                if (i4 != 0) {
                    j += (long) i4;
                    int i5 = ((int) (i4 * Float.parseFloat((String) listSplit$default2.get(1)) * 100)) + i2;
                    int i6 = (i5 / i4) / i;
                    int i7 = i5 - ((i6 * i4) * i);
                    int i8 = i7 / i;
                    int i9 = i7 - (i8 * i);
                    int i10 = 0;
                    while (i10 < i4) {
                        arrayMap.put(Long.valueOf(j - ((long) i10)), Integer.valueOf(i8 + i6));
                        i10++;
                        i8 = 0;
                    }
                    i2 = i9;
                }
            }
        }
        return arrayMap;
    }

    @NotNull
    public static final ArrayMap<Long, HMStepInfo> parseStepInfo(@NotNull String json, long j) {
        Intrinsics.checkNotNullParameter(json, "json");
        int i = 0;
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) json, new String[]{";"}, false, 0, 6, (Object) null);
        ArrayMap<Long, HMStepInfo> arrayMap = new ArrayMap<>();
        int size = listSplit$default.size();
        long j2 = j;
        int i2 = 0;
        while (i2 < size) {
            List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(i2), new String[]{","}, false, 0, 6, (Object) null);
            if (listSplit$default2.size() >= 4) {
                int i3 = Integer.parseInt((String) listSplit$default2.get(i));
                int i4 = Integer.parseInt((String) listSplit$default2.get(1));
                int i5 = Integer.parseInt((String) listSplit$default2.get(2));
                int i6 = Integer.parseInt((String) listSplit$default2.get(3));
                if (i3 > 0) {
                    j2 += (long) i3;
                    int i7 = i4 / i3;
                    int i8 = i4 % i3;
                    int i9 = i;
                    while (i9 < i3) {
                        arrayMap.put(Long.valueOf(j2 - ((long) i9)), new HMStepInfo(i7 + (i8 > 0 ? 1 : i), i5, i6));
                        i8--;
                        i9++;
                        i = 0;
                    }
                }
            }
            i2++;
            i = 0;
        }
        return arrayMap;
    }

    @NotNull
    public static final ArrayMap<Long, Integer> parseStress(@NotNull String json, long j) {
        Integer num;
        Intrinsics.checkNotNullParameter(json, "json");
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) json, new String[]{";"}, false, 0, 6, (Object) null);
        ArrayMap<Long, Integer> arrayMap = new ArrayMap<>();
        int size = listSplit$default.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(i2), new String[]{","}, false, 0, 6, (Object) null);
            if (listSplit$default2.size() > 1) {
                String str = (String) listSplit$default2.get(0);
                j += (long) (str.length() > 0 ? Integer.parseInt(str) : 1);
                i += ((CharSequence) listSplit$default2.get(1)).length() > 0 ? Integer.parseInt((String) listSplit$default2.get(1)) : 0;
                if (!arrayMap.containsKey(Long.valueOf(j)) || (num = arrayMap.get(Long.valueOf(j))) == null || num.intValue() != i) {
                    arrayMap.put(Long.valueOf(j), Integer.valueOf(i));
                }
            }
        }
        return arrayMap;
    }

    @NotNull
    public static final ArrayMap<Long, Byte> parseStrokeFreq(@NotNull String json, long j) {
        Intrinsics.checkNotNullParameter(json, "json");
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) json, new String[]{";"}, false, 0, 6, (Object) null);
        ArrayMap<Long, Byte> arrayMap = new ArrayMap<>();
        int size = listSplit$default.size();
        for (int i = 0; i < size; i++) {
            List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(i), new String[]{","}, false, 0, 6, (Object) null);
            if (listSplit$default2.size() > 1 && ((CharSequence) listSplit$default2.get(0)).length() > 0 && ((CharSequence) listSplit$default2.get(1)).length() > 0) {
                j += (long) Integer.parseInt((String) listSplit$default2.get(0));
                arrayMap.put(Long.valueOf(j), Byte.valueOf((byte) (Float.parseFloat((String) listSplit$default2.get(1)) * 60)));
            }
        }
        return arrayMap;
    }

    @NotNull
    public static final ArrayMap<Long, Short> parseSwimmingPace(@NotNull String json, long j) {
        Intrinsics.checkNotNullParameter(json, "json");
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) json, new String[]{";"}, false, 0, 6, (Object) null);
        ArrayMap<Long, Short> arrayMap = new ArrayMap<>();
        int size = listSplit$default.size();
        for (int i = 0; i < size; i++) {
            List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(i), new String[]{","}, false, 0, 6, (Object) null);
            if (listSplit$default2.size() > 1 && ((CharSequence) listSplit$default2.get(0)).length() > 0 && ((CharSequence) listSplit$default2.get(1)).length() > 0) {
                j += (long) Integer.parseInt((String) listSplit$default2.get(0));
                float f = Float.parseFloat((String) listSplit$default2.get(1));
                arrayMap.put(Long.valueOf(j), Short.valueOf((short) (f > 0.0f ? Float.valueOf((1 / f) * 100) : 0).intValue()));
            }
        }
        return arrayMap;
    }

    @NotNull
    public static final ArrayList<Long> parseTime(@NotNull String timeJson, long j) {
        Intrinsics.checkNotNullParameter(timeJson, "timeJson");
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) timeJson, new String[]{";"}, false, 0, 6, (Object) null);
        ArrayList<Long> arrayList = new ArrayList<>();
        int size = listSplit$default.size();
        for (int i = 0; i < size; i++) {
            j += (long) Integer.parseInt((String) listSplit$default.get(i));
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    @NotNull
    public static final Map<Long, Boolean> parseWholeKilo(@NotNull String json, long j, @NotNull List<PauseItem> pauseList) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(pauseList, "pauseList");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = StringsKt__StringsKt.split$default((CharSequence) json, new String[]{";"}, false, 0, 6, (Object) null).iterator();
        int i = 0;
        long j2 = j;
        while (it.hasNext()) {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) it.next(), new String[]{","}, false, 0, 6, (Object) null);
            if (listSplit$default.size() >= 2) {
                long endTime = (((long) Integer.parseInt((String) listSplit$default.get(1))) + j2) - 1;
                while (i < pauseList.size()) {
                    PauseItem pauseItem = pauseList.get(i);
                    long j3 = j2 + 1;
                    long j4 = endTime + 1;
                    long startTime = pauseItem.getStartTime();
                    if (j3 > startTime || startTime >= j4) {
                        break;
                    }
                    endTime += pauseItem.getEndTime() - pauseItem.getStartTime();
                    i++;
                }
                FitnessLogUtils.i(HMParseUtilKt.TAG, "parseWholeKilo time=" + endTime);
                linkedHashMap.put(Long.valueOf(endTime), Boolean.TRUE);
                j2 = endTime;
            }
        }
        return linkedHashMap;
    }
}
