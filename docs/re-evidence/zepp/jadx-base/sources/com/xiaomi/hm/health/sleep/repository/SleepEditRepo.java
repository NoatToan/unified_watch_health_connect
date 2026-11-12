package com.xiaomi.hm.health.sleep.repository;

import android.text.TextUtils;
import com.facebook.appevents.UserDataStore;
import com.huami.sleep.model.DataConstant;
import com.huami.sleep.sleepedit.repo.ISleepEditRepo;
import com.huami.sleep.sleepedit.ui.SleepEditedActivity;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.ManualData;
import com.xiaomi.hm.health.databases.model.ManualDataDao;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.datautil.HMDataCacheCenter;
import com.xiaomi.hm.health.device.webapi.sport.HMSportWebAPI;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/sleep/repository/SleepEditRepo;", "Lcom/huami/sleep/sleepedit/repo/ISleepEditRepo;", "", "userId", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "slpInfo", "", UserDataStore.STATE, "sp", "Lcom/xiaomi/hm/health/dataprocess/SportDay;", "theDay", "", "saveEditSleep", "(Ljava/lang/String;Lcom/xiaomi/hm/health/dataprocess/SleepInfo;JJLcom/xiaomi/hm/health/dataprocess/SportDay;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SleepEditRepo implements ISleepEditRepo {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, java.lang.String] */
    @Override // com.huami.sleep.sleepedit.repo.ISleepEditRepo
    @Nullable
    public Object saveEditSleep(@NotNull String str, @NotNull SleepInfo sleepInfo, long j, long j2, @NotNull SportDay sportDay, @NotNull Continuation<? super Unit> continuation) {
        sleepInfo.setUserEditIdx(j, j2, sportDay);
        ManualData manualDataUnique = HMDaoManager.getInstance().getManualDataDao().queryBuilder().where(ManualDataDao.Properties.Date.eq(sportDay.getKey()), ManualDataDao.Properties.Type.eq("sleep")).unique();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        if (manualDataUnique == null) {
            manualDataUnique = new ManualData();
            booleanRef.element = false;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = sleepInfo.getUsrSummaryJson().toString();
        try {
            JSONObject jSONObject = new JSONObject((String) objectRef.element);
            long j3 = 1000;
            jSONObject.put(UserDataStore.STATE, j / j3);
            jSONObject.put("ed", j2 / j3);
            String summary = manualDataUnique.getSummary();
            if (!TextUtils.isEmpty(summary)) {
                JSONObject jSONObject2 = new JSONObject(summary);
                if (jSONObject2.has("sf")) {
                    jSONObject.put("sf", jSONObject2.optString("sf", "0"));
                }
                if (jSONObject2.has(DataConstant.KEY_SLEEP_STATE)) {
                    jSONObject.put(DataConstant.KEY_SLEEP_STATE, jSONObject2.optJSONArray(DataConstant.KEY_SLEEP_STATE));
                }
            }
            objectRef.element = jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        manualDataUnique.setType("sleep");
        manualDataUnique.setSummary((String) objectRef.element);
        manualDataUnique.setSynced(Boxing.boxInt(0));
        manualDataUnique.setDate(sportDay.getKey());
        HMLog.info(SleepEditedActivity.TAG, new Function0<String>() { // from class: com.xiaomi.hm.health.sleep.repository.SleepEditRepo.saveEditSleep.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                String str2 = objectRef.element;
                return "user summary : " + ((Object) str2) + ";" + booleanRef.element;
            }
        });
        if (booleanRef.element) {
            HMDaoManager.getInstance().getManualDataDao().update(manualDataUnique);
        } else {
            HMDaoManager.getInstance().getManualDataDao().insert(manualDataUnique);
        }
        HMDataCacheCenter.getInstance().getmBandUint().updateSummaryByUsrEditSlp(sportDay.getKey(), (String) objectRef.element);
        HMSportWebAPI.uploadManualData(false);
        return Unit.INSTANCE;
    }
}
