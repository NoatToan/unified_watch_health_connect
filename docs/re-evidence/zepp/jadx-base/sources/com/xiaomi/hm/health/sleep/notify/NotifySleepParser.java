package com.xiaomi.hm.health.sleep.notify;

import com.facebook.appevents.UserDataStore;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.mediac.Command;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.StageSleep;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u000e\u001a\u00020\r¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/sleep/notify/NotifySleepParser;", "", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "sleepInfo", "Lcom/xiaomi/hm/health/sleep/notify/SleepRecord;", "parseMainSleep", "", "parseNapSleep", "", "time", "", "parseSleepTimeToIntEdit", "convertToSleepRecord", "", "summary", "initNoNeedNotifiedSleep", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class NotifySleepParser {
    private static final int MINUTE_NAP_INTERVAL = 60;

    @NotNull
    private static final String tag = "NotifySleepParser";

    private final SleepRecord parseMainSleep(SleepInfo sleepInfo) {
        if (sleepInfo.getHasSleep()) {
            return new SleepRecord(true, parseSleepTimeToIntEdit(sleepInfo.getStartDate().getTime()), parseSleepTimeToIntEdit(sleepInfo.getStopDate().getTime()));
        }
        return null;
    }

    private final List<SleepRecord> parseNapSleep(SleepInfo sleepInfo) {
        ArrayList arrayList;
        StageSleep stageSleep;
        StageSleep stageSleep2;
        int i;
        ArrayList arrayList2 = new ArrayList();
        ArrayList<StageSleep> oddStageSleep = sleepInfo.getOddStageSleep();
        int i2 = 0;
        if (oddStageSleep == null) {
            arrayList = null;
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : oddStageSleep) {
                if (!(((StageSleep) obj).mode == 7)) {
                    arrayList3.add(obj);
                }
            }
            arrayList = arrayList3;
        }
        int i3 = (arrayList == null || (stageSleep = (StageSleep) CollectionsKt.firstOrNull((List) arrayList)) == null) ? 0 : stageSleep.start;
        int i4 = (arrayList == null || (stageSleep2 = (StageSleep) CollectionsKt.firstOrNull((List) arrayList)) == null) ? 0 : stageSleep2.stop;
        int size = arrayList == null ? 0 : arrayList.size();
        if (arrayList != null) {
            int i5 = i3;
            int i6 = i4;
            for (Object obj2 : arrayList) {
                int i7 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                StageSleep stageSleep3 = (StageSleep) obj2;
                if (i2 <= 0 || stageSleep3.start - i6 <= 60) {
                    i = i5;
                } else {
                    arrayList2.add(new SleepRecord(false, i5, i6, 1, null));
                    i = stageSleep3.start;
                }
                int i8 = stageSleep3.stop;
                if (i2 == size - 1) {
                    arrayList2.add(new SleepRecord(false, i, i8, 1, null));
                }
                i6 = i8;
                i2 = i7;
                i5 = i;
            }
        }
        return arrayList2;
    }

    private final int parseSleepTimeToIntEdit(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        int i = calendar.get(11);
        int i2 = calendar.get(12);
        return calendar.get(9) == 0 ? (i * 60) + i2 + 1440 : (i * 60) + i2;
    }

    @NotNull
    public final List<SleepRecord> convertToSleepRecord(@NotNull SleepInfo sleepInfo) {
        ArrayList arrayList = new ArrayList();
        SleepRecord mainSleep = parseMainSleep(sleepInfo);
        if (mainSleep != null) {
            arrayList.add(mainSleep);
        }
        arrayList.addAll(parseNapSleep(sleepInfo));
        return arrayList;
    }

    @NotNull
    public final List<SleepRecord> initNoNeedNotifiedSleep(@NotNull String summary) throws JSONException {
        JSONObject jSONObjectOptJSONObject = new JSONObject(summary).optJSONObject("slp");
        final List<SleepRecord> listConvertToSleepRecord = null;
        ArrayList<StageSleep> arrayList = null;
        if (jSONObjectOptJSONObject != null) {
            int iOptInt = jSONObjectOptJSONObject.optInt(UserDataStore.STATE);
            int iOptInt2 = jSONObjectOptJSONObject.optInt("ed");
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("odd_stage");
            SleepInfo sleepInfo = new SleepInfo();
            sleepInfo.setStartDate(new Date(((long) iOptInt) * 1000));
            sleepInfo.setStopDate(new Date(((long) iOptInt2) * 1000));
            sleepInfo.setHasSleep(iOptInt2 - iOptInt > 0);
            if (jSONArrayOptJSONArray != null) {
                arrayList = new ArrayList<>();
                Iterator<Integer> it2 = e.until(0, jSONArrayOptJSONArray.length()).iterator();
                while (it2.hasNext()) {
                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(((IntIterator) it2).nextInt());
                    StageSleep stageSleep = new StageSleep();
                    stageSleep.start = jSONObject.optInt("start");
                    stageSleep.stop = jSONObject.optInt(Command.STOP);
                    stageSleep.mode = jSONObject.optInt("mode");
                    Unit unit = Unit.INSTANCE;
                    arrayList.add(stageSleep);
                }
            }
            sleepInfo.setOddStageSleep(arrayList);
            listConvertToSleepRecord = convertToSleepRecord(sleepInfo);
            Iterator<T> it3 = listConvertToSleepRecord.iterator();
            while (it3.hasNext()) {
                ((SleepRecord) it3.next()).setNotified(true);
            }
            HMLog.info(tag, new Function0<String>() { // from class: com.xiaomi.hm.health.sleep.notify.NotifySleepParser$initNoNeedNotifiedSleep$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "Init no eed notified sleep : " + listConvertToSleepRecord;
                }
            });
        }
        return listConvertToSleepRecord == null ? CollectionsKt__CollectionsKt.emptyList() : listConvertToSleepRecord;
    }
}
