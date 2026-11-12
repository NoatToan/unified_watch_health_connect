package com.xiaomi.hm.health.sleep.repository;

import androidx.p008lifecycle.FlowLiveDataConversions;
import androidx.p008lifecycle.LiveData;
import com.huami.sleep.datasource.IManualDataSource;
import com.huami.sleep.model.DataConstant;
import com.huami.sleep.model.SleepManualData;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.LiveDataSupportKt;
import com.xiaomi.hm.health.databases.model.ManualData;
import com.xiaomi.hm.health.databases.model.ManualDataDao;
import com.xiaomi.hm.health.device.webapi.sport.HMSportWebAPI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J.\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016J+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J;\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0012j\b\u0012\u0004\u0012\u00020\u0006`\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/sleep/repository/SleepManualDataSource;", "Lcom/huami/sleep/datasource/IManualDataSource;", "Lcom/xiaomi/hm/health/databases/model/ManualData;", "data", "Lcom/huami/sleep/model/SleepManualData;", "convert2SleepManualData", "", "userId", "startDate", "endDate", "Landroidx/lifecycle/LiveData;", "", "getManualData", "date", "feeling", "", "saveSelectFeeling", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "states", "saveSelectState", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mTag", "Ljava/lang/String;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SleepManualDataSource implements IManualDataSource {

    @NotNull
    private final String mTag = "SleepManualDataSource";

    /* JADX INFO: Access modifiers changed from: private */
    public final SleepManualData convert2SleepManualData(ManualData data) {
        return new SleepManualData(data.getDate(), data.getSummary());
    }

    @Override // com.huami.sleep.datasource.IManualDataSource
    @NotNull
    public LiveData<List<SleepManualData>> getManualData(@NotNull String userId, @NotNull final String startDate, @NotNull final String endDate) {
        return FlowLiveDataConversions.asLiveData$default(FlowKt.flowOn(FlowKt.debounce(FlowLiveDataConversions.asFlow(LiveDataSupportKt.queryByLiveData(new String[]{"MANUAL_DATA"}, new Function0<List<? extends SleepManualData>>() { // from class: com.xiaomi.hm.health.sleep.repository.SleepManualDataSource.getManualData.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final List<? extends SleepManualData> getA() {
                List<ManualData> list = HMDaoManager.getInstance().getManualDataDao().queryBuilder().where(ManualDataDao.Properties.Date.between(startDate, endDate), ManualDataDao.Properties.Type.eq("sleep")).list();
                SleepManualDataSource sleepManualDataSource = this;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(sleepManualDataSource.convert2SleepManualData((ManualData) it2.next()));
                }
                return arrayList;
            }
        })), 300L), Dispatchers.getIO()), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @Override // com.huami.sleep.datasource.IManualDataSource
    @Nullable
    public Object saveSelectFeeling(@NotNull String str, @NotNull String str2, @NotNull final String str3, @NotNull Continuation<? super Unit> continuation) {
        List<ManualData> list = HMDaoManager.getInstance().getManualDataDao().queryBuilder().where(ManualDataDao.Properties.Date.between(str2, str2), ManualDataDao.Properties.Type.eq("sleep")).list();
        ManualData manualData = list == null ? null : (ManualData) CollectionsKt.getOrNull(list, 0);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        if (manualData == null) {
            manualData = new ManualData();
            booleanRef.element = false;
        }
        HMLog.debug(this.mTag, new Function0<String>() { // from class: com.xiaomi.hm.health.sleep.repository.SleepManualDataSource.saveSelectFeeling.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "before user summary : " + str3;
            }
        });
        try {
            String summary = manualData.getSummary();
            if (summary == null) {
                summary = MessageFormatter.c;
            }
            final JSONObject jSONObject = new JSONObject(summary);
            jSONObject.put("sf", str3);
            manualData.setType("sleep");
            manualData.setSummary(jSONObject.toString());
            manualData.setSynced(Boxing.boxInt(0));
            manualData.setDate(str2);
            HMLog.debug(this.mTag, new Function0<String>() { // from class: com.xiaomi.hm.health.sleep.repository.SleepManualDataSource.saveSelectFeeling.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "user summary : " + jSONObject + ";" + booleanRef.element;
                }
            });
            if (booleanRef.element) {
                HMDaoManager.getInstance().getManualDataDao().update(manualData);
            } else {
                HMDaoManager.getInstance().getManualDataDao().insert(manualData);
            }
            HMSportWebAPI.uploadManualData(false);
            return Unit.INSTANCE;
        } catch (JSONException e) {
            HMLog.debug(this.mTag, new Function0<String>() { // from class: com.xiaomi.hm.health.sleep.repository.SleepManualDataSource.saveSelectFeeling.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "error :  " + e;
                }
            });
            e.printStackTrace();
            return Unit.INSTANCE;
        }
    }

    @Override // com.huami.sleep.datasource.IManualDataSource
    @Nullable
    public Object saveSelectState(@NotNull String str, @NotNull String str2, @NotNull final ArrayList<String> arrayList, @NotNull Continuation<? super Unit> continuation) {
        List<ManualData> list = HMDaoManager.getInstance().getManualDataDao().queryBuilder().where(ManualDataDao.Properties.Date.between(str2, str2), ManualDataDao.Properties.Type.eq("sleep")).list();
        ManualData manualData = list == null ? null : (ManualData) CollectionsKt.getOrNull(list, 0);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        if (manualData == null) {
            manualData = new ManualData();
            booleanRef.element = false;
        }
        HMLog.debug(this.mTag, new Function0<String>() { // from class: com.xiaomi.hm.health.sleep.repository.SleepManualDataSource.saveSelectState.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "before user summary : " + arrayList;
            }
        });
        try {
            String summary = manualData.getSummary();
            if (summary == null) {
                summary = MessageFormatter.c;
            }
            final JSONObject jSONObject = new JSONObject(summary);
            jSONObject.put(DataConstant.KEY_SLEEP_STATE, new JSONArray((Collection) arrayList));
            manualData.setType("sleep");
            manualData.setSummary(jSONObject.toString());
            manualData.setSynced(Boxing.boxInt(0));
            manualData.setDate(str2);
            HMLog.debug(this.mTag, new Function0<String>() { // from class: com.xiaomi.hm.health.sleep.repository.SleepManualDataSource.saveSelectState.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "user summary : " + jSONObject + ";" + booleanRef.element;
                }
            });
            if (booleanRef.element) {
                HMDaoManager.getInstance().getManualDataDao().update(manualData);
            } else {
                HMDaoManager.getInstance().getManualDataDao().insert(manualData);
            }
            HMSportWebAPI.uploadManualData(false);
            return Unit.INSTANCE;
        } catch (JSONException e) {
            HMLog.debug(this.mTag, new Function0<String>() { // from class: com.xiaomi.hm.health.sleep.repository.SleepManualDataSource.saveSelectState.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "error :  " + e;
                }
            });
            e.printStackTrace();
            return Unit.INSTANCE;
        }
    }
}
