package com.xiaomi.hm.health.running;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.sport.service.model.HistoryRecord;
import com.huami.step.utils.StepTimeUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.mediac.Command;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.DateData;
import com.xiaomi.hm.health.databases.model.DateDataDao;
import com.xiaomi.hm.health.dataprocess.StageSteps;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.xiaomi.hm.health.manager.SportDataManager;
import com.xiaomi.hm.health.watermarkcamera.web.GetWatermarkAPI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.greendao.query.WhereCondition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/running/StepDataManager;", "", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class StepDataManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String a = "yyyy-MM-dd";
    private static final int b = 60;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001$B\t\b\u0002¢\u0006\u0004\b\"\u0010#J \u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\rJ\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018J\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018R\u0016\u0010\u001d\u001a\u00020\u00188\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/xiaomi/hm/health/running/StepDataManager$Companion;", "", "Lorg/json/JSONArray;", "array", "", "day", "", "Lcom/huami/sport/service/model/HistoryRecord;", "b", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/dataprocess/StageSteps;", GetWatermarkAPI.KEY_NAME_STEPS, "a", "Lcom/xiaomi/hm/health/databases/model/DateData;", "entity", "parseEntity", "startMillis", "endMillis", "Lcom/xiaomi/hm/health/running/StepDataManager$Companion$PeriodRecord;", "getPeriodData", "parseToPeriod", "getTodayStageStepsData", "getStageStepInfo", "loadDateData", "", "summaryJsonStr", "parseSummaryToSteps", "jsonStr", "parseStageStep", "DEFAULT_DATE_PATTERN", "Ljava/lang/String;", "", "DEFAULT_MIN_TO_SECOND", LogUtil.I, "<init>", "()V", "PeriodRecord", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b!\u0010\"J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J/\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0002\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\f\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR!\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/running/StepDataManager$Companion$PeriodRecord;", "", "other", "", "compareTo", "", "component1", "component2", "", "Lcom/huami/sport/service/model/HistoryRecord;", "component3", "startTime", "totalCal", "records", "copy", "", "toString", "hashCode", "", "", "equals", "a", "J", "getStartTime", "()J", "b", LogUtil.I, "getTotalCal", "()I", "c", "Ljava/util/List;", "getRecords", "()Ljava/util/List;", "<init>", "(JILjava/util/List;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
        public static final /* data */ class PeriodRecord implements Comparable<PeriodRecord> {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
            private final long startTime;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
            private final int totalCal;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
            @Nullable
            private final List<HistoryRecord> records;

            /* JADX WARN: Multi-variable type inference failed */
            public PeriodRecord(long j, int i, @Nullable List<? extends HistoryRecord> list) {
                this.startTime = j;
                this.totalCal = i;
                this.records = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ PeriodRecord copy$default(PeriodRecord periodRecord, long j, int i, List list, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    j = periodRecord.startTime;
                }
                if ((i2 & 2) != 0) {
                    i = periodRecord.totalCal;
                }
                if ((i2 & 4) != 0) {
                    list = periodRecord.records;
                }
                return periodRecord.copy(j, i, list);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final long getStartTime() {
                return this.startTime;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final int getTotalCal() {
                return this.totalCal;
            }

            @Nullable
            public final List<HistoryRecord> component3() {
                return this.records;
            }

            @NotNull
            public final PeriodRecord copy(long startTime, int totalCal, @Nullable List<? extends HistoryRecord> records) {
                return new PeriodRecord(startTime, totalCal, records);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PeriodRecord)) {
                    return false;
                }
                PeriodRecord periodRecord = (PeriodRecord) other;
                return this.startTime == periodRecord.startTime && this.totalCal == periodRecord.totalCal && Intrinsics.areEqual(this.records, periodRecord.records);
            }

            @Nullable
            public final List<HistoryRecord> getRecords() {
                return this.records;
            }

            public final long getStartTime() {
                return this.startTime;
            }

            public final int getTotalCal() {
                return this.totalCal;
            }

            public int hashCode() {
                int iA = ((defpackage.b.a(this.startTime) * 31) + this.totalCal) * 31;
                List<HistoryRecord> list = this.records;
                return iA + (list == null ? 0 : list.hashCode());
            }

            @NotNull
            public String toString() {
                return "PeriodRecord(startTime=" + this.startTime + ", totalCal=" + this.totalCal + ", records=" + this.records + ")";
            }

            @Override // java.lang.Comparable
            public int compareTo(@NotNull PeriodRecord other) {
                return this.startTime > other.startTime ? -1 : 1;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "";
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final ArrayList<StageSteps> a(ArrayList<StageSteps> steps) {
            ArrayList<StageSteps> arrayList = new ArrayList<>();
            for (StageSteps stageSteps : steps) {
                if (stageSteps.time != 0 && stageSteps.count != 0) {
                    arrayList.add(stageSteps);
                }
            }
            return arrayList;
        }

        private final List<HistoryRecord> b(JSONArray array, long day) {
            try {
                ArrayList arrayList = new ArrayList();
                int length = array.length();
                if (length <= 0) {
                    return arrayList;
                }
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    JSONObject jSONObject = array.getJSONObject(i);
                    int iOptInt = jSONObject.optInt("mode");
                    int i3 = jSONObject.getInt("start") * 60;
                    int i4 = jSONObject.getInt(Command.STOP) * 60;
                    int iOptInt2 = jSONObject.optInt("dis");
                    int iOptInt3 = jSONObject.optInt("cal");
                    if (ArraysKt___ArraysKt.contains(new int[]{1, 2, 3, 4, 7}, iOptInt)) {
                        HistoryRecord historyRecord = new HistoryRecord();
                        historyRecord.setStep(true);
                        historyRecord.setMode(iOptInt);
                        historyRecord.setType(6);
                        historyRecord.setTrackid(Long.valueOf((day / ((long) 1000)) + ((long) i3)));
                        historyRecord.setCosttime(Integer.valueOf(i4 - i3));
                        historyRecord.setDistance(Integer.valueOf(iOptInt2));
                        historyRecord.setCal(Integer.valueOf(iOptInt3));
                        arrayList.add(historyRecord);
                    }
                    if (i2 >= length) {
                        return arrayList;
                    }
                    i = i2;
                }
            } catch (Exception e) {
                HMLog.warn("lack some field", e, a.a);
                return null;
            }
        }

        @Nullable
        public final List<PeriodRecord> getPeriodData(long startMillis, long endMillis) {
            List<DateData> list = HMDaoManager.getInstance().getDaoSession().getDateDataDao().queryBuilder().where(DateDataDao.Properties.Date.between(TimeUtils.formatDate("yyyy-MM-dd", startMillis), TimeUtils.formatDate("yyyy-MM-dd", endMillis)), new WhereCondition[0]).list();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                PeriodRecord toPeriod = StepDataManager.INSTANCE.parseToPeriod((DateData) it2.next());
                if (toPeriod != null) {
                    arrayList.add(toPeriod);
                }
            }
            return arrayList;
        }

        @Nullable
        public final List<StageSteps> getStageStepInfo(long startMillis, long endMillis) {
            List<DateData> list = HMDaoManager.getInstance().getDaoSession().getDateDataDao().queryBuilder().where(DateDataDao.Properties.Date.between(TimeUtils.formatDate("yyyy-MM-dd", startMillis), TimeUtils.formatDate("yyyy-MM-dd", endMillis)), new WhereCondition[0]).list();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                List<StageSteps> stageStep = StepDataManager.INSTANCE.parseStageStep(((DateData) it2.next()).getStageStepsSummary());
                if (stageStep != null) {
                    arrayList.addAll(stageStep);
                }
            }
            return arrayList;
        }

        @Nullable
        public final List<HistoryRecord> getTodayStageStepsData() {
            ArrayList<StageSteps> arrayListA = a(SportDataManager.getInstance().getTodayStepInfo().getStageSteps());
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            ArrayList arrayList = new ArrayList();
            for (StageSteps stageSteps : arrayListA) {
                System.out.println((Object) ("json-steps justs: " + stageSteps.steps + " , times: " + stageSteps.time + ", cal : " + stageSteps.cal));
                HistoryRecord historyRecord = new HistoryRecord();
                historyRecord.setStep(true);
                historyRecord.setType(6);
                historyRecord.setTrackid(Long.valueOf((calendar.getTimeInMillis() / ((long) 1000)) + ((long) (stageSteps.time * 600))));
                historyRecord.setCosttime(600);
                historyRecord.setDistance(Integer.valueOf(stageSteps.distance));
                historyRecord.setCal(Integer.valueOf(stageSteps.cal));
                arrayList.add(historyRecord);
            }
            return arrayList;
        }

        @NotNull
        public final List<DateData> loadDateData(long startMillis, long endMillis) {
            StepTimeUtils stepTimeUtils = StepTimeUtils.INSTANCE;
            List<DateData> list = HMDaoManager.getInstance().getDaoSession().getDateDataDao().queryBuilder().where(DateDataDao.Properties.Date.between(stepTimeUtils.formatDate(startMillis), stepTimeUtils.formatDate(endMillis)), new WhereCondition[0]).list();
            return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
        }

        @Nullable
        public final List<HistoryRecord> parseEntity(@NotNull DateData entity) {
            JSONArray jSONArrayOptJSONArray;
            JSONObject jSONObjectOptJSONObject = new JSONObject(entity.getSummary()).optJSONObject(StepsInfo.KEY_STEP_INFO);
            if (jSONObjectOptJSONObject == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(StepsInfo.KEY_STAGE)) == null) {
                return null;
            }
            return StepDataManager.INSTANCE.b(jSONArrayOptJSONArray, TimeUtils.parseStringToLong("yyyy-MM-dd", entity.getDate()));
        }

        @Nullable
        public final List<StageSteps> parseStageStep(@Nullable String jsonStr) {
            if (jsonStr == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray(jsonStr);
            ArrayList arrayList = new ArrayList();
            int i = 0;
            int length = jSONArray.length();
            if (length <= 0) {
                return arrayList;
            }
            while (true) {
                int i2 = i + 1;
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                int iOptInt = jSONObject.optInt("time");
                int iOptInt2 = jSONObject.optInt("count");
                int iOptInt3 = jSONObject.optInt("dis");
                int iOptInt4 = jSONObject.optInt("cal");
                int iOptInt5 = jSONObject.optInt("step");
                StageSteps stageSteps = new StageSteps();
                stageSteps.setInfos(iOptInt, iOptInt5, iOptInt2, iOptInt3, iOptInt4);
                arrayList.add(stageSteps);
                if (i2 >= length) {
                    return arrayList;
                }
                i = i2;
            }
        }

        @Nullable
        public final List<StageSteps> parseSummaryToSteps(@Nullable String summaryJsonStr) {
            if (summaryJsonStr == null) {
                return null;
            }
            JSONObject jSONObjectOptJSONObject = new JSONObject(summaryJsonStr).optJSONObject(StepsInfo.KEY_STEP_INFO);
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray(StepsInfo.KEY_STAGE) : null;
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                int i = 0;
                int length = jSONArrayOptJSONArray.length();
                if (length > 0) {
                    while (true) {
                        int i2 = i + 1;
                        JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                        if (jSONObject.has("start")) {
                            int iOptInt = jSONObject.optInt("start");
                            int iOptInt2 = jSONObject.optInt(Command.STOP);
                            int iOptInt3 = jSONObject.optInt("dis");
                            int iOptInt4 = jSONObject.optInt("cal");
                            int iOptInt5 = jSONObject.optInt("step");
                            StageSteps stageSteps = new StageSteps();
                            stageSteps.setInfos(iOptInt, iOptInt5, iOptInt2 - iOptInt, iOptInt3, iOptInt4);
                            arrayList.add(stageSteps);
                        } else {
                            int iOptInt6 = jSONObject.optInt("time");
                            int iOptInt7 = jSONObject.optInt("dis");
                            int iOptInt8 = jSONObject.optInt("cal");
                            int iOptInt9 = jSONObject.optInt("step");
                            StageSteps stageSteps2 = new StageSteps();
                            stageSteps2.setInfos((iOptInt6 + 1) * 60, iOptInt9, 60, iOptInt7, iOptInt8);
                            arrayList.add(stageSteps2);
                        }
                        if (i2 >= length) {
                            break;
                        }
                        i = i2;
                    }
                }
            }
            return arrayList;
        }

        @Nullable
        public final PeriodRecord parseToPeriod(@NotNull DateData entity) {
            JSONObject jSONObjectOptJSONObject = new JSONObject(entity.getSummary()).optJSONObject(StepsInfo.KEY_STEP_INFO);
            if (jSONObjectOptJSONObject == null) {
                return null;
            }
            int iOptInt = jSONObjectOptJSONObject.optInt("cal");
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(StepsInfo.KEY_STAGE);
            long stringToLong = TimeUtils.parseStringToLong("yyyy-MM-dd", entity.getDate());
            return new PeriodRecord(stringToLong, iOptInt, jSONArrayOptJSONArray != null ? StepDataManager.INSTANCE.b(jSONArrayOptJSONArray, stringToLong) : null);
        }
    }
}
