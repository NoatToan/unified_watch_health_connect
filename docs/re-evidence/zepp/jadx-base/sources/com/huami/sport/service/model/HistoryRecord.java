package com.huami.sport.service.model;

import android.util.Pair;
import androidx.annotation.NonNull;
import com.huami.sport.service.util.TrainingRecordUtils;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.xiaomi.hm.health.databases.model.trainning.TrainingRecord;
import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class HistoryRecord implements Comparable<HistoryRecord> {
    private int A;
    private int B;
    private int C;
    private String D;
    private int E;
    private String F;
    private int G;
    private String H;
    private int I;
    private String J;
    private long K;
    private long L;
    private String M;
    private long N;
    private long O;
    private long P;
    private long Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private String W;
    private boolean X;
    private String Y;
    private boolean a;
    private int b;
    private int c;
    private boolean d;
    private Integer e;
    private Integer f;
    private String g;
    private Long h;
    private Integer i;
    private Integer j;
    private Integer k;
    private Float l;
    private Integer m;
    private Integer n;
    private Integer o;
    private Integer p;
    private Long q;
    private String r;
    private Integer s;
    private String t;
    private int u;
    private int v;
    private Boolean w;
    private int x;
    private String y;
    private Integer z;

    private String a(Long l) {
        return new SimpleDateFormat("yyyy/MM/dd-HH:mm:ss", Locale.getDefault()).format(new Date(l.longValue()));
    }

    public static HistoryRecord convertTrackRecord(Trackrecord trackrecord) {
        HistoryRecord historyRecord = new HistoryRecord();
        historyRecord.setTraining(false);
        historyRecord.setPace(Float.valueOf(trackrecord.getPace() != null ? trackrecord.getPace().floatValue() : 0.0f));
        historyRecord.setAvghr(Integer.valueOf(trackrecord.getAvghr() != null ? trackrecord.getAvghr().intValue() : -1));
        historyRecord.setCal(Integer.valueOf(trackrecord.getCal() != null ? trackrecord.getCal().intValue() : 0));
        historyRecord.setCosttime(Integer.valueOf(trackrecord.getCosttime() != null ? trackrecord.getCosttime().intValue() : 0));
        historyRecord.setDate(trackrecord.getDate() != null ? trackrecord.getDate() : "");
        historyRecord.setDevice(trackrecord.getDevice() != null ? trackrecord.getDevice() : "");
        int iIntValue = trackrecord.getDistance() != null ? trackrecord.getDistance().intValue() : 0;
        if (trackrecord.getType().intValue() == 14) {
            int iIntValue2 = (trackrecord.getSwimPoolLength() != null ? trackrecord.getSwimPoolLength().intValue() : 0) * (trackrecord.getSwimTurns() != null ? trackrecord.getSwimTurns().intValue() : 0);
            if (iIntValue2 > 0) {
                historyRecord.setDistance(Integer.valueOf(iIntValue2));
            } else {
                historyRecord.setDistance(Integer.valueOf(iIntValue));
            }
            int iIntValue3 = trackrecord.getUnit() != null ? trackrecord.getUnit().intValue() : 0;
            if (iIntValue3 != 0) {
                historyRecord.setUnit(iIntValue3);
            } else if (iIntValue2 > iIntValue) {
                historyRecord.setUnit(1);
            } else {
                historyRecord.setUnit(0);
            }
        } else {
            historyRecord.setDistance(Integer.valueOf(iIntValue));
        }
        historyRecord.setEndtime(Long.valueOf(trackrecord.getEndtime() != null ? trackrecord.getEndtime().longValue() : 0L));
        historyRecord.setFfpercent(Integer.valueOf(trackrecord.getFfpercent() != null ? trackrecord.getFfpercent().intValue() : 0));
        historyRecord.setSfreq(Integer.valueOf(trackrecord.getSfreq() != null ? trackrecord.getSfreq().intValue() : 0));
        historyRecord.setSource(Integer.valueOf(trackrecord.getSource() != null ? trackrecord.getSource().intValue() : 0));
        historyRecord.setTrackid(Long.valueOf(trackrecord.getTrackid() != null ? trackrecord.getTrackid().longValue() : -1L));
        historyRecord.setType(Integer.valueOf(trackrecord.getType() != null ? trackrecord.getType().intValue() : 0));
        historyRecord.setV(Integer.valueOf(trackrecord.getV() != null ? trackrecord.getV().intValue() : 0));
        historyRecord.setClimbDisAscend(Integer.valueOf(trackrecord.getClimbDisascend() != null ? trackrecord.getClimbDisascend().intValue() : -1));
        historyRecord.setChildListJson(trackrecord.getChildListData());
        historyRecord.setRopeSkippingCount(trackrecord.getTouchStrokes());
        historyRecord.setFloor(trackrecord.getFloorNumber());
        historyRecord.setSportMode(trackrecord.getSportMode());
        historyRecord.setAutoRecognition(Boolean.valueOf(trackrecord.getAutoRecognition() != null ? trackrecord.getAutoRecognition().booleanValue() : false));
        historyRecord.setAccumulatedGap(trackrecord.getAccumulatedGap());
        historyRecord.setCourseTitle(trackrecord.getCourseTitle() != null ? trackrecord.getCourseTitle() : "");
        historyRecord.setClimbDisDescend(Integer.valueOf(trackrecord.getClimbDisDescend() != null ? trackrecord.getClimbDisDescend().intValue() : -1));
        return historyRecord;
    }

    public static HistoryRecord convertTrainingRecord(TrainingRecord trainingRecord) {
        HistoryRecord historyRecord = new HistoryRecord();
        historyRecord.setTraining(true);
        historyRecord.setTrainingRecordId(trainingRecord.getTrainingRecordId() != null ? trainingRecord.getTrainingRecordId() : "");
        historyRecord.setTrainingCreateTime(trainingRecord.getCreateTime() != null ? trainingRecord.getCreateTime().longValue() : 0L);
        historyRecord.setTrainingStartTime(trainingRecord.getStartTime() != null ? trainingRecord.getStartTime().longValue() : 0L);
        historyRecord.setTrainingCostTime(trainingRecord.getDuration() != null ? trainingRecord.getDuration().longValue() / 1000 : 0L);
        historyRecord.setTrainingCal(trainingRecord.getConsumption() != null ? trainingRecord.getConsumption().intValue() : 0L);
        historyRecord.setTrainingId(trainingRecord.getTrainingId() != null ? trainingRecord.getTrainingId().longValue() : -1L);
        historyRecord.setTrainingPlanId(trainingRecord.getTrainingPlanId() != null ? trainingRecord.getTrainingPlanId().longValue() : 0L);
        historyRecord.setTrainingNo(trainingRecord.getFinishNumber() != null ? trainingRecord.getFinishNumber().intValue() : 0);
        historyRecord.setTrainingName(trainingRecord.getName() != null ? trainingRecord.getName() : "");
        historyRecord.setTrainingSubSize(trainingRecord.getActions() != null ? trainingRecord.getActions().size() : 0);
        historyRecord.setTrainingAvgHr(TrainingRecordUtils.parseAverageHeartRate(trainingRecord));
        historyRecord.setTrainingStatus(trainingRecord.getStatus() != null ? trainingRecord.getStatus().intValue() : -1);
        historyRecord.setTrainingActionNo(trainingRecord.getActionNumber() != null ? trainingRecord.getActionNumber().intValue() : 0);
        historyRecord.setTrainingType(trainingRecord.getTrainingType());
        historyRecord.setTrainingHasBoundHrDevice(trainingRecord.getHasBoundHrDevice().booleanValue());
        return historyRecord;
    }

    public boolean equals(Object obj) {
        Long l;
        if (!(obj instanceof HistoryRecord)) {
            return false;
        }
        HistoryRecord historyRecord = (HistoryRecord) obj;
        boolean z = this.d;
        if (z != historyRecord.d) {
            return false;
        }
        if (z) {
            return this.K == historyRecord.K && this.O == historyRecord.O && this.R == historyRecord.R;
        }
        Long l2 = this.h;
        return l2 != null && (l = historyRecord.h) != null && l2.equals(l) && this.e.equals(historyRecord.e);
    }

    public int getAccumulatedGap() {
        return this.x;
    }

    public Boolean getAutoRecognition() {
        return this.w;
    }

    public Integer getAvghr() {
        return this.n;
    }

    public long getBeginTimeInMilli() {
        return this.d ? this.O : this.h.longValue() * 1000;
    }

    public Integer getCal() {
        return this.k;
    }

    public String getCf() {
        return this.Y;
    }

    public String getChildListJson() {
        return this.t;
    }

    public Integer getClimbDisAscend() {
        return this.s;
    }

    public Integer getClimbDisDescend() {
        return this.z;
    }

    public int getConsumeAvgHeart() {
        return this.d ? this.S : this.n.intValue();
    }

    public long getConsumeCal() {
        return this.d ? this.Q : this.k.intValue();
    }

    public long getConsumeTime() {
        return this.d ? this.N : this.j.intValue();
    }

    public Integer getCosttime() {
        return this.j;
    }

    public String getCourseTitle() {
        return this.y;
    }

    public String getDate() {
        return this.g;
    }

    public String getDevice() {
        return this.r;
    }

    public Integer getDistance() {
        return this.i;
    }

    public String getDistinctKey() {
        if (isTraining()) {
            return String.valueOf(getTrainingStartTime());
        }
        return getTrackid() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + getSource();
    }

    public Long getEndtime() {
        return this.q;
    }

    public Integer getFfpercent() {
        return this.o;
    }

    public int getFloor() {
        return this.v;
    }

    public int getIconColorId() {
        return this.E;
    }

    public int getIconResId() {
        return this.B;
    }

    public int getMode() {
        return this.b;
    }

    public int getNameResId() {
        return this.C;
    }

    public String getNameResString() {
        return this.D;
    }

    public Float getPace() {
        return this.l;
    }

    public int getRopeSkippingCount() {
        return this.u;
    }

    public Integer getSfreq() {
        return this.m;
    }

    public Integer getSource() {
        return this.e;
    }

    public int getSportMode() {
        return this.c;
    }

    public int getSubDataIconResId() {
        return this.I;
    }

    public String getSubDataValue() {
        return this.H;
    }

    public Pair<Long, Long> getTimeRangeInMinutes() {
        return Pair.create(Long.valueOf((getBeginTimeInMilli() / 1000) / 60), Long.valueOf(((getBeginTimeInMilli() / 1000) + getConsumeTime()) / 60));
    }

    public int getTitleDataUnitResId() {
        return this.G;
    }

    public String getTitleDataValue() {
        return this.F;
    }

    public Long getTrackid() {
        return this.h;
    }

    public int getTrainingActionNo() {
        return this.V;
    }

    public int getTrainingAvgHr() {
        return this.S;
    }

    public long getTrainingCal() {
        return this.Q;
    }

    public long getTrainingCostTime() {
        return this.N;
    }

    public long getTrainingCreateTime() {
        return this.P;
    }

    public long getTrainingId() {
        return this.K;
    }

    public String getTrainingName() {
        return this.M;
    }

    public int getTrainingNo() {
        return this.R;
    }

    public long getTrainingPlanId() {
        return this.L;
    }

    public String getTrainingRecordId() {
        return this.J;
    }

    public long getTrainingStartTime() {
        return this.O;
    }

    public int getTrainingStatus() {
        return this.U;
    }

    public int getTrainingSubSize() {
        return this.T;
    }

    public String getTrainingType() {
        return this.W;
    }

    public Integer getType() {
        return this.f;
    }

    public int getUnit() {
        return this.A;
    }

    public Integer getV() {
        return this.p;
    }

    public boolean hasValidCal() {
        if (isTraining()) {
            return this.Q > 0;
        }
        Integer num = this.k;
        return num != null && num.intValue() > 0;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean isCourseTraining() {
        return this.d && this.L > 0;
    }

    public boolean isStep() {
        return this.a;
    }

    public boolean isTraining() {
        return this.d;
    }

    public boolean isTrainingHasBoundHrDevice() {
        return this.X;
    }

    public void setAccumulatedGap(int i) {
        this.x = i;
    }

    public void setAutoRecognition(Boolean bool) {
        this.w = bool;
    }

    public void setAvghr(Integer num) {
        this.n = num;
    }

    public void setCal(Integer num) {
        this.k = num;
    }

    public void setCf(String str) {
        this.Y = str;
    }

    public void setChildListJson(String str) {
        this.t = str;
    }

    public void setClimbDisAscend(Integer num) {
        this.s = num;
    }

    public void setClimbDisDescend(Integer num) {
        this.z = num;
    }

    public void setCosttime(Integer num) {
        this.j = num;
    }

    public void setCourseTitle(String str) {
        this.y = str;
    }

    public void setDate(String str) {
        this.g = str;
    }

    public void setDevice(String str) {
        this.r = str;
    }

    public void setDistance(Integer num) {
        this.i = num;
    }

    public void setEndtime(Long l) {
        this.q = l;
    }

    public void setFfpercent(Integer num) {
        this.o = num;
    }

    public void setFloor(int i) {
        this.v = i;
    }

    public void setIconColorId(int i) {
        this.E = i;
    }

    public void setIconResId(int i) {
        this.B = i;
    }

    public void setMode(int i) {
        this.b = i;
    }

    public void setNameResId(int i) {
        this.C = i;
    }

    public void setNameResString(String str) {
        this.D = str;
    }

    public void setPace(Float f) {
        this.l = f;
    }

    public void setRopeSkippingCount(int i) {
        this.u = i;
    }

    public void setSfreq(Integer num) {
        this.m = num;
    }

    public void setSource(Integer num) {
        this.e = num;
    }

    public void setSportMode(int i) {
        this.c = i;
    }

    public void setStep(boolean z) {
        this.a = z;
    }

    public void setSubDataIconResId(int i) {
        this.I = i;
    }

    public void setSubDataValue(String str) {
        this.H = str;
    }

    public void setTitleDataUnitResId(int i) {
        this.G = i;
    }

    public void setTitleDataValue(String str) {
        this.F = str;
    }

    public void setTrackid(Long l) {
        this.h = l;
    }

    public void setTraining(boolean z) {
        this.d = z;
    }

    public void setTrainingActionNo(int i) {
        this.V = i;
    }

    public void setTrainingAvgHr(int i) {
        this.S = i;
    }

    public void setTrainingCal(long j) {
        this.Q = j;
    }

    public void setTrainingCostTime(long j) {
        this.N = j;
    }

    public void setTrainingCreateTime(long j) {
        this.P = j;
    }

    public void setTrainingHasBoundHrDevice(boolean z) {
        this.X = z;
    }

    public void setTrainingId(long j) {
        this.K = j;
    }

    public void setTrainingName(String str) {
        this.M = str;
    }

    public void setTrainingNo(int i) {
        this.R = i;
    }

    public void setTrainingPlanId(long j) {
        this.L = j;
    }

    public void setTrainingRecordId(String str) {
        this.J = str;
    }

    public void setTrainingStartTime(long j) {
        this.O = j;
    }

    public void setTrainingStatus(int i) {
        this.U = i;
    }

    public void setTrainingSubSize(int i) {
        this.T = i;
    }

    public void setTrainingType(String str) {
        this.W = str;
    }

    public void setType(Integer num) {
        this.f = num;
    }

    public void setUnit(int i) {
        this.A = i;
    }

    public void setV(Integer num) {
        this.p = num;
    }

    public String toString() {
        if (this.d) {
            return "TrainingHistoryRecord{trainingId=" + this.K + ", trainingPlanId=" + this.L + ", finishNumber=" + this.R + ", name='" + this.M + "', startTime=" + this.O + " " + a(Long.valueOf(this.O)) + '}';
        }
        return "RunningHistoryRecord{trackId=" + this.h + " " + a(Long.valueOf(this.h.longValue() * 1000)) + ", source=" + this.e + ", type=" + this.f + ", ConsumeCal = " + getConsumeCal() + ", cal = " + getCal() + ", isStep=" + isStep() + ", startTime=" + a(Long.valueOf(getBeginTimeInMilli())) + ", endTime=" + a(Long.valueOf(getBeginTimeInMilli() + ((long) (getCosttime().intValue() * 1000)))) + ", unit=" + this.A + '}';
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull HistoryRecord historyRecord) {
        if (getBeginTimeInMilli() != historyRecord.getBeginTimeInMilli()) {
            return getBeginTimeInMilli() > historyRecord.getBeginTimeInMilli() ? -1 : 1;
        }
        if (isTraining() && historyRecord.isTraining()) {
            return getTrainingNo() > historyRecord.getTrainingNo() ? -1 : 1;
        }
        return 0;
    }
}
