package com.xiaomi.fitness.health.curse.data;

import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.data.aggregation.Record;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.curse.CurseManager;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.CurseSetting;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationRecord;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationState;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationTotalRecord;
import defpackage.c0j;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000l\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\u001a\u001e\u0010\r\u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012\u001a\n\u0010\u0013\u001a\u00020\u0014*\u00020\u0015\u001a\u0016\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006\u001a\u0018\u0010\u0019\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u0004\u001a$\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0001\u001a\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a*\u00020!2\u0006\u0010\"\u001a\u00020\u0001\u001a(\u0010#\u001a\u00020\u0014*\u00020\u00152\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001b0%2\u0006\u0010&\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\u0001\u001a0\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001b0%2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001b0%2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020!0%2\u0006\u0010\u001f\u001a\u00020\u0001\u001a\u000e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0001\u001a\u000e\u00100\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\u0001\u001a\n\u00101\u001a\u00020\u0015*\u00020\u0015\u001a\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020\u00010%2\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u00103\u001a\u00020\u0001\u001a\n\u00104\u001a\u00020\u0001*\u00020\u0015\u001a\n\u00105\u001a\u000206*\u00020\u001b\u001a\n\u00107\u001a\u000206*\u00020\u001b\u001a\n\u00108\u001a\u000206*\u00020\u001b\u001a\u001e\u00109\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a*\b\u0012\u0004\u0012\u00020!0%2\u0006\u0010\"\u001a\u00020\u0001\u001a \u0010:\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001b0%\u001a\u0006\u0010;\u001a\u00020\u0004\u001a\u0012\u0010<\u001a\b\u0012\u0004\u0012\u00020!0%*\u0004\u0018\u00010\u0014\u001a\n\u0010=\u001a\u00020\u0015*\u00020\u0015\u001a\u0016\u0010>\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u00103\u001a\u00020\u0001\u001a\n\u0010?\u001a\u00020\u0001*\u00020\u0012\u001a\n\u0010@\u001a\u00020\u0012*\u00020\u0012\u001a\u0006\u0010A\u001a\u000206\u001a\f\u0010B\u001a\u000206*\u0004\u0018\u00010\u0015\u001a\n\u0010C\u001a\u000206*\u00020\u0015\u001a\n\u0010D\u001a\u000206*\u00020\u0015\u001a\f\u0010E\u001a\u00020\u000e*\u00020.H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u0011\u0010\u0007\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u0011\u0010\n\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u000e\u0010(\u001a\u00020)X\u0082T¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"MAX_DEVICE_MILLS", "", "MAX_APP_DEVICE_MERGE_MILLS", "IN_MAX_DAYS", "", "version", "", "todayZeroMills", "getTodayZeroMills", "()J", "ZONE_OFFSET", "getZONE_OFFSET", "()I", "initMonthData", "", "Ljava/util/HashMap;", "Lcom/xiaomi/fitness/health/curse/data/DayData;", "localDate", "Lorg/joda/time/LocalDate;", "getFirstDeviceSet", "Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationTotalRecord;", "Lcom/xiaomi/fitness/settingitem/settingitem/CurseSetting;", "getDeviceSet", "inDays", "interval", "removeAhead", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationRecord;", "num", "genNoRecord", "startMills", "modifyMills", "genIn", "Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;", "modifySec", "getDeviceData", "list", "", "menstrualPeriod", "menstrualEndTime", "TAG_L", "", "genDeviceList", "deviceList", "record", "genCalendar", "Ljava/util/Calendar;", "mills", "getZeroMills", "default", "genSymptomKeys", "endMills", "lastMenstrualEnd", "isIn", "", "isNoRecord", "isInEnd", "toMenstruationRecords", "genClearTotalRecord", "zoneOffsetSec", "toPeriod", "correct", "getDateRangeStr", "getFirstDayOfMonthMillis", "getFirstDayOfMonthLocalDate", "curseReady", "isSettingMiss", "isCalendarPrediction", "isAlgoPrediction", "setZero", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CurseExtKt {
    public static final int IN_MAX_DAYS = 15;
    public static final long MAX_APP_DEVICE_MERGE_MILLS = 5356800000L;
    public static final long MAX_DEVICE_MILLS = 10368000000L;

    @NotNull
    private static final String TAG_L = "CurseExt";
    public static final byte version = 1;

    @NotNull
    public static final CurseSetting correct(@NotNull CurseSetting curseSetting) {
        Intrinsics.checkNotNullParameter(curseSetting, "<this>");
        if (curseSetting.getLastMenstrualTime() <= 0) {
            curseSetting.setLastMenstrualTime(getTodayZeroMills());
        }
        if (curseSetting.getAppBeforeMenstruationPush() <= 0) {
            curseSetting.setAppBeforeMenstruationPush(3);
        }
        if (curseSetting.getAppBeforeOvulationPush() <= 0) {
            curseSetting.setAppBeforeOvulationPush(1);
        }
        if (curseSetting.getEstimatedMenstrualDays() <= 0) {
            curseSetting.setEstimatedMenstrualDays(5);
        }
        if (curseSetting.getHardwareBeforeMenstruationPush() <= 0) {
            curseSetting.setHardwareBeforeMenstruationPush(3);
        }
        if (curseSetting.getHardwareBeforeOvulationPush() <= 0) {
            curseSetting.setHardwareBeforeOvulationPush(1);
        }
        if (curseSetting.getMenstrualCycle() < 11) {
            curseSetting.setMenstrualCycle(28);
        }
        return curseSetting;
    }

    public static final boolean curseReady() {
        return (DeviceSettingManager.INSTANCE.getInstance().getUserLastUpdateTime() > 0 || new CurseManager().readSetting() != null) && AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin();
    }

    @NotNull
    /* JADX INFO: renamed from: default, reason: not valid java name */
    public static final CurseSetting m362default(@NotNull CurseSetting curseSetting) {
        Intrinsics.checkNotNullParameter(curseSetting, "<this>");
        curseSetting.setLastMenstrualTime(getTodayZeroMills());
        curseSetting.setUserId(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId());
        return curseSetting;
    }

    @NotNull
    public static final Calendar genCalendar(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(getZeroMills(j) + ((long) getZONE_OFFSET()));
        Intrinsics.checkNotNull(calendar);
        return calendar;
    }

    @NotNull
    public static final MenstruationTotalRecord genClearTotalRecord(@NotNull CurseSetting curseSetting, long j, @NotNull List<MenstruationRecord> deviceList) {
        Intrinsics.checkNotNullParameter(curseSetting, "<this>");
        Intrinsics.checkNotNullParameter(deviceList, "deviceList");
        long timeInMillis = ((MenstruationRecord) CollectionsKt___CollectionsKt.first((List) deviceList)).getCalendar().getTimeInMillis();
        ArrayList<MenstruationRecord> arrayListGenNoRecord = genNoRecord(timeInMillis, deviceList.size(), j);
        return new MenstruationTotalRecord((byte) 1, (byte) curseSetting.getMenstrualCycle(), (byte) curseSetting.getEstimatedMenstrualDays(), 0L, 0L, timeInMillis / ((long) 1000), arrayListGenNoRecord.size(), arrayListGenNoRecord);
    }

    @NotNull
    public static final List<MenstruationRecord> genDeviceList(@NotNull List<MenstruationRecord> deviceList, @NotNull List<Record> record, long j) {
        Intrinsics.checkNotNullParameter(deviceList, "deviceList");
        Intrinsics.checkNotNullParameter(record, "record");
        Iterator<MenstruationRecord> it = deviceList.iterator();
        while (it.hasNext()) {
            Logger.i(TAG_L, "genDeviceList: device 1111111111111 = " + it.next());
        }
        long zeroMills = getZeroMills(((MenstruationRecord) CollectionsKt___CollectionsKt.first((List) deviceList)).getCalendar().getTimeInMillis());
        long zeroMills2 = getZeroMills(((MenstruationRecord) CollectionsKt___CollectionsKt.last((List) deviceList)).getCalendar().getTimeInMillis());
        ArrayList arrayList = new ArrayList();
        ArrayList<MenstruationRecord> menstruationRecords = toMenstruationRecords(record, j / ((long) 1000));
        Iterator<MenstruationRecord> it2 = menstruationRecords.iterator();
        Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
        while (it2.hasNext()) {
            MenstruationRecord next = it2.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            Logger.i(TAG_L, "genDeviceList: transfterd db record i = " + next);
        }
        if (menstruationRecords.isEmpty()) {
            return deviceList;
        }
        arrayList.addAll(menstruationRecords);
        long zeroMills3 = getZeroMills(((MenstruationRecord) CollectionsKt___CollectionsKt.first((List) arrayList)).getCalendar().getTimeInMillis());
        long zeroMills4 = getZeroMills(((MenstruationRecord) CollectionsKt___CollectionsKt.last((List) arrayList)).getCalendar().getTimeInMillis());
        Logger.i(TAG_L, "genDeviceList: db start =  " + zeroMills3 + ":" + new LocalDate(zeroMills3) + ", end = " + zeroMills4 + ":" + new LocalDate(zeroMills4) + ";  device start = " + new LocalDate(zeroMills) + "  " + zeroMills2 + ":end = " + new LocalDate(zeroMills2));
        if (zeroMills3 <= zeroMills) {
            if (zeroMills4 >= zeroMills2) {
                return arrayList;
            }
            arrayList.addAll(genNoRecord(zeroMills4 + 86400000, (int) ((zeroMills2 - zeroMills4) / 86400000), j));
            return arrayList;
        }
        if (zeroMills + 1 > zeroMills3 || zeroMills3 >= zeroMills2) {
            arrayList.addAll(0, genNoRecord(zeroMills, (int) ((zeroMills3 - zeroMills) / 86400000), j));
            return arrayList;
        }
        arrayList.addAll(0, genNoRecord(zeroMills, (int) ((zeroMills3 - zeroMills) / 86400000), j));
        if (zeroMills4 >= zeroMills2) {
            return arrayList;
        }
        arrayList.addAll(genNoRecord(zeroMills4 + 86400000, (int) ((zeroMills2 - zeroMills4) / 86400000), j));
        return arrayList;
    }

    @NotNull
    public static final ArrayList<MenstruationRecord> genIn(@NotNull Record record, long j) {
        Intrinsics.checkNotNullParameter(record, "<this>");
        ArrayList<MenstruationRecord> arrayList = new ArrayList<>();
        int intervalDay = TimeDateUtil.getIntervalDay(record.getStartMills(), record.getEndMills());
        int i = intervalDay + 2;
        int i2 = 0;
        while (i2 < i) {
            arrayList.add(new MenstruationRecord(genCalendar(record.getStartMills() + (((long) i2) * 86400000)), i2 == intervalDay + 1 ? MenstruationState.NOT_IN_PERIOD : MenstruationState.IN_PERIOD, j));
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public static final ArrayList<MenstruationRecord> genNoRecord(long j, int i, long j2) {
        ArrayList<MenstruationRecord> arrayList = new ArrayList<>();
        long zeroMills = getZeroMills(j);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new MenstruationRecord(genCalendar((((long) i2) * 86400000) + zeroMills), MenstruationState.NO_RECORD, j2 / ((long) 1000)));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Long> genSymptomKeys(long j, long j2) {
        ArrayList arrayList = new ArrayList();
        int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        long progressionLastElement = ProgressionUtilKt.getProgressionLastElement(j, j2, 86400000L);
        if (j <= progressionLastElement) {
            while (true) {
                arrayList.add(Long.valueOf(FitnessDateUtils.changeToDestZeroTimeOneDay(j / ((long) 1000), currentTZOffsetInSec, 0)));
                if (j == progressionLastElement) {
                    break;
                }
                j += 86400000;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final String getDateRangeStr(long j, long j2) {
        return ResourceExtKt.getString(c0j.A7, TimeDateUtil.getDateMdFormat(j), TimeDateUtil.getDateMdFormat(j2));
    }

    @NotNull
    public static final MenstruationTotalRecord getDeviceData(@NotNull CurseSetting curseSetting, @NotNull List<MenstruationRecord> list, long j, long j2) {
        Intrinsics.checkNotNullParameter(curseSetting, "<this>");
        Intrinsics.checkNotNullParameter(list, "list");
        long j3 = 1000;
        return new MenstruationTotalRecord((byte) 1, (byte) curseSetting.getMenstrualCycle(), (byte) curseSetting.getEstimatedMenstrualDays(), j / j3, j2 / j3, ((MenstruationRecord) CollectionsKt___CollectionsKt.first((List) list)).getCalendar().getTimeInMillis() / j3, list.size(), list);
    }

    @NotNull
    public static final MenstruationTotalRecord getDeviceSet(byte b2, byte b3) {
        return new MenstruationTotalRecord((byte) 1, b3, b2, 0L, 0L, 0L, 0, CollectionsKt__CollectionsKt.emptyList());
    }

    @NotNull
    public static final LocalDate getFirstDayOfMonthLocalDate(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return TimeDateUtil.getFirstDayOfMonth(localDate);
    }

    public static final long getFirstDayOfMonthMillis(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return TimeDateUtil.getFirstDayOfMonthTime(localDate) * ((long) 1000);
    }

    @NotNull
    public static final MenstruationTotalRecord getFirstDeviceSet(@NotNull CurseSetting curseSetting) {
        Intrinsics.checkNotNullParameter(curseSetting, "<this>");
        Calendar calendar = Calendar.getInstance();
        int estimatedMenstrualDays = curseSetting.getEstimatedMenstrualDays();
        ArrayList arrayList = new ArrayList();
        if (estimatedMenstrualDays >= 0) {
            int i = 0;
            while (true) {
                Intrinsics.checkNotNull(calendar);
                arrayList.add(new MenstruationRecord(calendar, i == estimatedMenstrualDays ? MenstruationState.NOT_IN_PERIOD : MenstruationState.IN_PERIOD, 0L));
                if (i == estimatedMenstrualDays) {
                    break;
                }
                i++;
            }
        }
        long j = 1000;
        return new MenstruationTotalRecord((byte) 1, (byte) curseSetting.getMenstrualCycle(), (byte) estimatedMenstrualDays, curseSetting.getLastMenstrualTime() / j, (curseSetting.getLastMenstrualTime() + (((long) (curseSetting.getEstimatedMenstrualDays() - 1)) * 86400000)) / j, curseSetting.getLastMenstrualTime() / j, arrayList.size(), arrayList);
    }

    public static final long getTodayZeroMills() {
        return getZeroMills(System.currentTimeMillis());
    }

    public static final int getZONE_OFFSET() {
        return TimeZone.getDefault().getOffset(System.currentTimeMillis());
    }

    public static final long getZeroMills(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static final void initMonthData(@NotNull HashMap<Long, DayData> map, @NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        map.clear();
        long firstDayOfMonthMillis = getFirstDayOfMonthMillis(localDate);
        LocalDate firstDayOfMonthLocalDate = getFirstDayOfMonthLocalDate(localDate);
        int daysOfMonth = TimeDateUtil.INSTANCE.getDaysOfMonth(firstDayOfMonthMillis) + 20;
        for (int i = -20; i < daysOfMonth; i++) {
            LocalDate localDatePlusDays = firstDayOfMonthLocalDate.plusDays(i);
            Intrinsics.checkNotNull(localDatePlusDays);
            long mills = ExtUtilKt.getMills(localDatePlusDays);
            map.put(Long.valueOf(mills), new DayData(mills, 0, 0, 0, 0, 30, null));
        }
    }

    public static final boolean isAlgoPrediction(@NotNull CurseSetting curseSetting) {
        Intrinsics.checkNotNullParameter(curseSetting, "<this>");
        return curseSetting.isPredictEnable() && curseSetting.getAlgoIntelligentPrediction() > 0;
    }

    public static final boolean isCalendarPrediction(@NotNull CurseSetting curseSetting) {
        Intrinsics.checkNotNullParameter(curseSetting, "<this>");
        return curseSetting.getIntelligentPrediction() > 0 && (curseSetting.getAlgoIntelligentPrediction() == 0 || !CurseManager.INSTANCE.getInstance().supportMenstrualPredict());
    }

    public static final boolean isIn(@NotNull MenstruationRecord menstruationRecord) {
        Intrinsics.checkNotNullParameter(menstruationRecord, "<this>");
        return menstruationRecord.getMenstruationState() == MenstruationState.IN_PERIOD;
    }

    public static final boolean isInEnd(@NotNull MenstruationRecord menstruationRecord) {
        Intrinsics.checkNotNullParameter(menstruationRecord, "<this>");
        return menstruationRecord.getMenstruationState() == MenstruationState.NOT_IN_PERIOD;
    }

    public static final boolean isNoRecord(@NotNull MenstruationRecord menstruationRecord) {
        Intrinsics.checkNotNullParameter(menstruationRecord, "<this>");
        return menstruationRecord.getMenstruationState() == MenstruationState.NO_RECORD;
    }

    public static final boolean isSettingMiss(@Nullable CurseSetting curseSetting) {
        return curseSetting == null || curseSetting.isFirst();
    }

    public static final long lastMenstrualEnd(@NotNull CurseSetting curseSetting) {
        Intrinsics.checkNotNullParameter(curseSetting, "<this>");
        return curseSetting.getLastMenstrualTime() + (((long) (curseSetting.getEstimatedMenstrualDays() - 1)) * 86400000);
    }

    public static final void removeAhead(@NotNull ArrayList<MenstruationRecord> arrayList, int i) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Iterator<MenstruationRecord> it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        int i2 = 0;
        while (it.hasNext() && i2 < i) {
            MenstruationRecord next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            Logger.d("removeAhead", "removeAhead: " + next);
            i2++;
            it.remove();
        }
    }

    private static final void setZero(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }

    @NotNull
    public static final ArrayList<MenstruationRecord> toMenstruationRecords(@NotNull List<Record> list, long j) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList<MenstruationRecord> arrayList = new ArrayList<>();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Record record = list.get(i);
            arrayList.addAll(genIn(record, j));
            if (i < list.size() - 1) {
                long startMills = ((list.get(i + 1).getStartMills() - record.getEndMills()) / 86400000) - ((long) 2);
                if (startMills > 0) {
                    arrayList.addAll(genNoRecord(record.getEndMills() + 172800000, (int) startMills, ((long) 1000) * j));
                }
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Record> toPeriod(@Nullable MenstruationTotalRecord menstruationTotalRecord) {
        MenstruationState menstruationState;
        ArrayList arrayList = new ArrayList();
        if (menstruationTotalRecord == null) {
            return arrayList;
        }
        Record record = new Record(0L, 0L, 0L, 0, 0, 16, null);
        MenstruationState menstruationState2 = MenstruationState.NO_RECORD;
        for (MenstruationRecord menstruationRecord : menstruationTotalRecord.getRecords()) {
            if (isIn(menstruationRecord) && menstruationState2 != (menstruationState = MenstruationState.IN_PERIOD)) {
                record.setStartMills(menstruationRecord.getCalendar().getTimeInMillis());
                record.setInterval(menstruationTotalRecord.getCyclePeriodDays());
                record.setModifySec(menstruationRecord.getModifyTimeStamp());
                menstruationState2 = menstruationState;
            } else if (isInEnd(menstruationRecord) || isNoRecord(menstruationRecord)) {
                if (menstruationState2 == MenstruationState.IN_PERIOD) {
                    record.setEndMills(getZeroMills(menstruationRecord.getCalendar().getTimeInMillis()) - 86400000);
                    arrayList.add(record);
                    record = new Record(0L, 0L, 0L, 0, 0, 16, null);
                    menstruationState2 = MenstruationState.NO_RECORD;
                }
            }
        }
        return arrayList;
    }

    public static final int zoneOffsetSec() {
        return TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000;
    }
}
