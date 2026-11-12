package com.xiaomi.hm.health.databases.model.trainning;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.gson.annotations.SerializedName;
import com.huami.moving.sport.ui.webapi.impl.DeviceSettingApiImpl;
import com.huami.watch.companion.dataflow.Constant;
import com.huami.watch.notification.data.NotificationData;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class TrainingRecord implements Serializable {
    public static final int STATUS_DEFAULT = -1;
    public static final int STATUS_SYNCED = 1;
    public static final int STATUS_UNSYNC = 0;
    private static final long serialVersionUID = 1;

    @SerializedName("actionId")
    public String actionId;

    @SerializedName("actionName")
    public String actionName;

    @SerializedName("actionNumber")
    public Integer actionNumber;

    @SerializedName(NotificationData.WearableExtrasData.KEY_ACTIONS)
    public List<HaveDoneAction> actions;

    @SerializedName("averageHeartRate")
    public Integer averageHeartRate;

    @SerializedName("consumption")
    public Integer consumption;

    @SerializedName(ParamKey.createTime)
    public Long createTime;
    public String detailsPageIllustrated;

    @SerializedName("duration")
    public Long duration;

    @SerializedName("endTime")
    public Long endTime;

    @SerializedName("finishNumber")
    public Integer finishNumber;

    @SerializedName("finishedVideos")
    public String finishedVideos;

    @SerializedName("isBindingHeartRateBracelet")
    public Boolean hasBoundHrDevice;

    @SerializedName(Constant.KEY_HR_VALUE)
    public String heartRate;
    public transient List<TrainingHeartRate> heartRateList;
    public boolean isExercise;

    @SerializedName("maxHeartRate")
    public Integer maxHeartRate;

    @SerializedName("name")
    public String name;

    @SerializedName("pause")
    public String pause;

    @SerializedName("startTime")
    public Long startTime;

    @SerializedName("status")
    public Integer status;

    @SerializedName(DeviceSettingApiImpl.META_KEY_THUMBNAIL)
    public String thumbnail;

    @SerializedName("time")
    public String time;

    @SerializedName("trainingEndTime")
    public Long trainingEndTime;

    @SerializedName("trainingId")
    public Long trainingId;

    @SerializedName("trainingPlanDayIndex")
    public Integer trainingPlanDayIndex;

    @SerializedName("trainingPlanId")
    public Long trainingPlanId;

    @SerializedName("trainingRecordId")
    public String trainingRecordId;

    @SerializedName("trainingStartTime")
    public Long trainingStartTime;

    @SerializedName("trainingType")
    public String trainingType;

    public static class PauseRange implements Comparable<PauseRange> {
        public long pauseDurationInSecond;
        public long pauseStartTimeInSecond;

        public PauseRange() {
        }

        public String toString() {
            return "PauseRange{pauseStartTimeInSecond=" + this.pauseStartTimeInSecond + ", pauseDurationInSecond=" + this.pauseDurationInSecond + '}';
        }

        public PauseRange(long j, long j2) {
            this.pauseStartTimeInSecond = j;
            this.pauseDurationInSecond = j2;
        }

        @Override // java.lang.Comparable
        public int compareTo(@NonNull PauseRange pauseRange) {
            return this.pauseStartTimeInSecond - pauseRange.pauseStartTimeInSecond > 0 ? 1 : -1;
        }
    }

    public TrainingRecord(String str, Long l, Long l2, Integer num, String str2, Long l3, Long l4, Integer num2, Integer num3, String str3, Integer num4, Integer num5, Long l5, String str4, Long l6, Integer num6, String str5, String str6, Integer num7, Boolean bool, String str7, String str8, String str9, String str10, String str11, Long l7, Long l8) {
        this.finishNumber = 0;
        this.startTime = 0L;
        this.endTime = 0L;
        this.averageHeartRate = 0;
        this.maxHeartRate = 0;
        this.actionNumber = 0;
        this.consumption = 0;
        this.duration = 0L;
        this.createTime = -1L;
        this.status = 0;
        this.isExercise = false;
        this.hasBoundHrDevice = Boolean.FALSE;
        this.trainingStartTime = 0L;
        this.trainingEndTime = 0L;
        this.trainingRecordId = str;
        this.trainingId = l;
        this.trainingPlanId = l2;
        this.finishNumber = num;
        this.name = str2;
        this.startTime = l3;
        this.endTime = l4;
        this.averageHeartRate = num2;
        this.maxHeartRate = num3;
        this.heartRate = str3;
        this.actionNumber = num4;
        this.consumption = num5;
        this.duration = l5;
        this.time = str4;
        this.createTime = l6;
        this.status = num6;
        this.detailsPageIllustrated = str5;
        this.pause = str6;
        this.trainingPlanDayIndex = num7;
        this.hasBoundHrDevice = bool;
        this.trainingType = str7;
        this.finishedVideos = str8;
        this.actionId = str9;
        this.actionName = str10;
        this.thumbnail = str11;
        this.trainingStartTime = l7;
        this.trainingEndTime = l8;
    }

    private static int a(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    private static long b(String str, long j) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    @NonNull
    @VisibleForTesting
    public static List<PauseRange> c(@NonNull String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(";")) {
            try {
                String[] strArrSplit = str2.split(",");
                if (strArrSplit.length == 5) {
                    long jB = b(strArrSplit[0], 0L);
                    long jB2 = b(strArrSplit[1], 0L);
                    if (jB > 0 && jB2 > 0) {
                        arrayList.add(new PauseRange(jB, jB2));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    public static boolean compareNumber(Number number, Number number2) {
        if (number == null && number2 == null) {
            return true;
        }
        return (number == null || number2 == null || !number.equals(number2)) ? false : true;
    }

    @NonNull
    private static List<PauseRange> e(@NonNull String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(";")) {
            String[] strArrSplit = str2.split(",");
            if (strArrSplit.length == 2) {
                long jB = b(strArrSplit[0], 0L);
                long jB2 = b(strArrSplit[1], 0L);
                if (jB > 0 && jB2 > 0) {
                    arrayList.add(new PauseRange(jB, jB2));
                }
            }
        }
        return arrayList;
    }

    public static boolean isEmpty(@Nullable CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TrainingRecord)) {
            return false;
        }
        TrainingRecord trainingRecord = (TrainingRecord) obj;
        return compareNumber(this.trainingId, trainingRecord.trainingId) && compareNumber(this.startTime, trainingRecord.startTime);
    }

    public void filterHeartRateInPauseRange() {
        List<TrainingHeartRate> list = this.heartRateList;
        if (list == null || list.isEmpty()) {
            return;
        }
        List<PauseRange> pauseRangeList = parsePauseRangeList();
        if (pauseRangeList.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (TrainingHeartRate trainingHeartRate : this.heartRateList) {
            boolean z = false;
            for (PauseRange pauseRange : pauseRangeList) {
                long j = pauseRange.pauseStartTimeInSecond;
                long j2 = pauseRange.pauseDurationInSecond + j;
                if (trainingHeartRate.getRecordTime().longValue() > j && trainingHeartRate.getRecordTime().longValue() < j2) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                arrayList.add(trainingHeartRate);
            }
        }
        this.heartRateList = arrayList;
    }

    public String generateHeartRateCsvString() {
        List<TrainingHeartRate> list = this.heartRateList;
        if (list == null || list.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        long jLongValue = this.startTime.longValue() / 1000;
        int iIntValue = 0;
        for (TrainingHeartRate trainingHeartRate : this.heartRateList) {
            long jLongValue2 = trainingHeartRate.getRecordTime().longValue() - jLongValue;
            int iIntValue2 = trainingHeartRate.getHeartRate().intValue() - iIntValue;
            sb.append(jLongValue2);
            sb.append(",");
            sb.append(iIntValue2);
            sb.append(";");
            jLongValue = trainingHeartRate.getRecordTime().longValue();
            iIntValue = trainingHeartRate.getHeartRate().intValue();
        }
        String string = sb.toString();
        this.heartRate = string;
        return string;
    }

    public String generateTrainingRecordId() {
        if (isInCourse()) {
            this.trainingRecordId = String.valueOf(this.startTime) + String.valueOf(this.trainingPlanId);
        } else {
            this.trainingRecordId = String.valueOf(this.startTime);
        }
        return this.trainingRecordId;
    }

    public String getActionId() {
        return this.actionId;
    }

    public String getActionName() {
        return this.actionName;
    }

    public Integer getActionNumber() {
        return this.actionNumber;
    }

    public List<HaveDoneAction> getActions() {
        return this.actions;
    }

    public Integer getAverageHeartRate() {
        return this.averageHeartRate;
    }

    public Integer getConsumption() {
        return this.consumption;
    }

    public Long getCreateTime() {
        return this.createTime;
    }

    public String getDetailsPageIllustrated() {
        return this.detailsPageIllustrated;
    }

    public Long getDuration() {
        return this.duration;
    }

    public Long getEndTime() {
        return this.endTime;
    }

    public Integer getFinishNumber() {
        return this.finishNumber;
    }

    public String getFinishedVideos() {
        return this.finishedVideos;
    }

    public Boolean getHasBoundHrDevice() {
        return this.hasBoundHrDevice;
    }

    public String getHeartRate() {
        return this.heartRate;
    }

    public Integer getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public String getName() {
        return this.name;
    }

    public String getPause() {
        return this.pause;
    }

    public Long getStartTime() {
        return this.startTime;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getThumbnail() {
        return this.thumbnail;
    }

    public String getTime() {
        return this.time;
    }

    public Long getTrainingEndTime() {
        return this.trainingEndTime;
    }

    public Long getTrainingId() {
        return this.trainingId;
    }

    public Integer getTrainingPlanDayIndex() {
        return this.trainingPlanDayIndex;
    }

    public Long getTrainingPlanId() {
        return this.trainingPlanId;
    }

    public String getTrainingRecordId() {
        return this.trainingRecordId;
    }

    public Long getTrainingStartTime() {
        return this.trainingStartTime;
    }

    public String getTrainingType() {
        return this.trainingType;
    }

    public boolean isInCourse() {
        Long l = this.trainingPlanId;
        return l != null && l.longValue() > 0;
    }

    public void merge(TrainingRecord trainingRecord) {
        this.trainingRecordId = !isEmpty(this.trainingRecordId) ? this.trainingRecordId : trainingRecord.trainingRecordId;
        this.name = !isEmpty(this.name) ? this.name : trainingRecord.name;
        this.heartRate = !isEmpty(this.heartRate) ? this.heartRate : trainingRecord.heartRate;
        this.time = !isEmpty(this.time) ? this.time : trainingRecord.time;
        this.pause = !isEmpty(this.pause) ? this.pause : trainingRecord.pause;
        this.detailsPageIllustrated = !isEmpty(this.detailsPageIllustrated) ? this.detailsPageIllustrated : trainingRecord.detailsPageIllustrated;
        Long l = this.trainingId;
        this.trainingId = (l == null || l.longValue() <= 0) ? trainingRecord.trainingId : this.trainingId;
        Long l2 = this.trainingPlanId;
        this.trainingPlanId = (l2 == null || l2.longValue() <= 0) ? trainingRecord.trainingPlanId : this.trainingPlanId;
        Integer num = this.finishNumber;
        this.finishNumber = (num == null || num.intValue() <= 0) ? trainingRecord.finishNumber : this.finishNumber;
        Long l3 = this.startTime;
        this.startTime = (l3 == null || l3.longValue() <= 0) ? trainingRecord.startTime : this.startTime;
        Long l4 = this.endTime;
        this.endTime = (l4 == null || l4.longValue() <= 0) ? trainingRecord.endTime : this.endTime;
        Integer num2 = this.averageHeartRate;
        this.averageHeartRate = (num2 == null || num2.intValue() <= 0) ? trainingRecord.averageHeartRate : this.averageHeartRate;
        Integer num3 = this.maxHeartRate;
        this.maxHeartRate = (num3 == null || num3.intValue() <= 0) ? trainingRecord.maxHeartRate : this.maxHeartRate;
        Integer num4 = this.actionNumber;
        this.actionNumber = (num4 == null || num4.intValue() <= 0) ? trainingRecord.actionNumber : this.actionNumber;
        Integer num5 = this.consumption;
        this.consumption = (num5 == null || num5.intValue() <= 0) ? trainingRecord.consumption : this.consumption;
        Long l5 = this.duration;
        this.duration = (l5 == null || l5.longValue() <= 0) ? trainingRecord.duration : this.duration;
        Long l6 = this.createTime;
        this.createTime = (l6 == null || l6.longValue() <= 0) ? trainingRecord.createTime : this.createTime;
        List<TrainingHeartRate> list = this.heartRateList;
        this.heartRateList = (list == null || list.isEmpty()) ? trainingRecord.heartRateList : this.heartRateList;
        List<HaveDoneAction> list2 = this.actions;
        this.actions = (list2 == null || list2.isEmpty()) ? trainingRecord.actions : this.actions;
        this.status = this.status.intValue() >= trainingRecord.status.intValue() ? this.status : trainingRecord.status;
        this.hasBoundHrDevice = Boolean.valueOf(this.hasBoundHrDevice.booleanValue() || trainingRecord.hasBoundHrDevice.booleanValue());
    }

    public int parseAverageHeartRate() {
        Integer num = this.averageHeartRate;
        if (num != null && num.intValue() > 0) {
            return this.averageHeartRate.intValue();
        }
        List<TrainingHeartRate> heartRateListFromCsv = this.heartRateList;
        if (heartRateListFromCsv == null || heartRateListFromCsv.isEmpty()) {
            heartRateListFromCsv = parseHeartRateListFromCsv();
        }
        int iIntValue = 0;
        if (heartRateListFromCsv == null || heartRateListFromCsv.isEmpty()) {
            this.averageHeartRate = 0;
        } else {
            Iterator<TrainingHeartRate> it2 = heartRateListFromCsv.iterator();
            while (it2.hasNext()) {
                iIntValue += it2.next().heartRate.intValue();
            }
            this.averageHeartRate = Integer.valueOf(iIntValue / heartRateListFromCsv.size());
        }
        return this.averageHeartRate.intValue();
    }

    public List<TrainingHeartRate> parseHeartRateListFromCsv() {
        if (isEmpty(this.heartRate)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long jLongValue = this.startTime.longValue() / 1000;
        String[] strArrSplit = this.heartRate.split(";");
        int iIntValue = 0;
        for (int i = 0; i < strArrSplit.length; i++) {
            String[] strArrSplit2 = strArrSplit[i].split(",");
            long jB = b(strArrSplit2[0], 1L);
            if (jB > 60) {
                jB = 1;
            }
            int iA = a(strArrSplit2[1], 0);
            TrainingHeartRate trainingHeartRate = new TrainingHeartRate();
            trainingHeartRate.setRecordTime(Long.valueOf(jLongValue + jB));
            trainingHeartRate.setHeartRate(Integer.valueOf(iIntValue + iA));
            trainingHeartRate.setIndex(Long.valueOf(((long) i) + 1));
            trainingHeartRate.setTrainingId(this.trainingId);
            trainingHeartRate.setTrainingStartTime(this.startTime);
            arrayList.add(trainingHeartRate);
            jLongValue = trainingHeartRate.getRecordTime().longValue();
            iIntValue = trainingHeartRate.getHeartRate().intValue();
        }
        this.heartRateList = arrayList;
        return arrayList;
    }

    @NonNull
    public List<PauseRange> parsePauseRangeList() {
        if (isEmpty(this.pause)) {
            return Collections.emptyList();
        }
        return this.isExercise ? c(this.pause) : e(this.pause);
    }

    public void setActionId(String str) {
        this.actionId = str;
    }

    public void setActionName(String str) {
        this.actionName = str;
    }

    public void setActionNumber(Integer num) {
        this.actionNumber = num;
    }

    public void setActions(List<HaveDoneAction> list) {
        this.actions = list;
    }

    public void setAverageHeartRate(Integer num) {
        this.averageHeartRate = num;
    }

    public void setConsumption(Integer num) {
        this.consumption = num;
    }

    public void setCreateTime(Long l) {
        this.createTime = l;
    }

    public void setDetailsPageIllustrated(String str) {
        this.detailsPageIllustrated = str;
    }

    public void setDuration(Long l) {
        this.duration = l;
    }

    public void setEndTime(Long l) {
        this.endTime = l;
    }

    public void setFinishNumber(Integer num) {
        this.finishNumber = num;
    }

    public void setFinishedVideos(String str) {
        this.finishedVideos = str;
    }

    public void setHasBoundHrDevice(Boolean bool) {
        this.hasBoundHrDevice = bool;
    }

    public void setHeartRate(String str) {
        this.heartRate = str;
    }

    public void setMaxHeartRate(Integer num) {
        this.maxHeartRate = num;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPause(String str) {
        this.pause = str;
    }

    public void setStartTime(Long l) {
        this.startTime = l;
    }

    public void setStatus(Integer num) {
        this.status = num;
    }

    public void setThumbnail(String str) {
        this.thumbnail = str;
    }

    public void setTime(String str) {
        this.time = str;
    }

    public void setTrainingEndTime(Long l) {
        this.trainingEndTime = l;
    }

    public void setTrainingId(Long l) {
        this.trainingId = l;
    }

    public void setTrainingPlanDayIndex(Integer num) {
        this.trainingPlanDayIndex = num;
    }

    public void setTrainingPlanId(Long l) {
        this.trainingPlanId = l;
    }

    public void setTrainingRecordId(String str) {
        this.trainingRecordId = str;
    }

    public void setTrainingStartTime(Long l) {
        this.trainingStartTime = l;
    }

    public void setTrainingType(String str) {
        this.trainingType = str;
    }

    public String toString() {
        return "TrainingRecord{trainingId=" + this.trainingId + ", trainingPlanId=" + this.trainingPlanId + ", finishNumber=" + this.finishNumber + ", name='" + this.name + "', startTime='" + this.startTime + "'}";
    }

    public TrainingRecord() {
        this.finishNumber = 0;
        this.startTime = 0L;
        this.endTime = 0L;
        this.averageHeartRate = 0;
        this.maxHeartRate = 0;
        this.actionNumber = 0;
        this.consumption = 0;
        this.duration = 0L;
        this.createTime = -1L;
        this.status = 0;
        this.isExercise = false;
        this.hasBoundHrDevice = Boolean.FALSE;
        this.trainingStartTime = 0L;
        this.trainingEndTime = 0L;
    }
}
