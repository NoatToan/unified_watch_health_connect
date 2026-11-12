package com.xiaomi.hm.health.sleep.usercase;

import com.facebook.appevents.UserDataStore;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.DateData;
import com.xiaomi.hm.health.databases.model.ManualData;
import com.xiaomi.hm.health.databases.model.ManualDataDao;
import com.xiaomi.hm.health.dataprocess.DaySportData;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.datautil.HMBraceletDateDataUtil;
import com.xiaomi.hm.health.utils.Utils;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/sleep/usercase/GetSleepTimeUseCase;", "", "Lorg/json/JSONObject;", "sleepJsonObject", "Lkotlin/Pair;", "", "getTimePair", "", "date", Constant.METHOD_EXECUTE, "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class GetSleepTimeUseCase {
    private final Pair<Long, Long> getTimePair(JSONObject sleepJsonObject) {
        if (sleepJsonObject == null) {
            return null;
        }
        long j = 1000;
        return new Pair<>(Long.valueOf(sleepJsonObject.optLong(UserDataStore.STATE) * j), Long.valueOf(sleepJsonObject.optLong("ed") * j));
    }

    @Nullable
    public final Pair<Long, Long> execute(@NotNull String date) {
        boolean z = true;
        ManualData manualDataUnique = HMDaoManager.getInstance().getManualDataDao().queryBuilder().where(ManualDataDao.Properties.Date.eq(new DaySportData(SportDay.fromString(date)).getKey()), ManualDataDao.Properties.Type.eq("sleep")).unique();
        DateData specifyDayData = HMBraceletDateDataUtil.getSpecifyDayData(date);
        String summary = specifyDayData == null ? null : specifyDayData.getSummary();
        if (manualDataUnique != null) {
            String summary2 = manualDataUnique.getSummary();
            if (summary2 != null && summary2.length() != 0) {
                z = false;
            }
            if (!z && Utils.isManualDataSlpValid(summary2, summary)) {
                return getTimePair(new JSONObject(summary2));
            }
        }
        if (summary != null) {
            return getTimePair(new JSONObject(summary).optJSONObject("slp"));
        }
        return null;
    }
}
