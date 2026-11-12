package com.huami.mifit.sportlib.core.model;

import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.mifit.sportlib.common.SyncedState;
import com.huami.mifit.sportlib.model.SportRecord;

/* JADX INFO: loaded from: classes11.dex */
public class GPSActiveStatistic {
    private float A;
    private int B;
    private int C;
    private int a;
    private int b;
    private long c;
    private float d;
    private int e;
    private float f;
    private float g;
    private int h;
    private int i;
    private int j;
    private int k;
    private long l;
    private float m;
    private float n;
    private int o;
    private int p;
    private int q;
    private int r;
    private String s;
    private String t;
    private String u;
    private String v;
    private int w;
    private String x;
    private int y;
    private float z;

    public class a {
        public String a;
        public String b;
        public String c;
        public String d;

        public a() {
        }
    }

    public GPSActiveStatistic(long j) {
        this.a = DataTypeSource.RunSource.RUN_SOURCE_PHONE.getValue();
        this.b = 1;
        this.c = -1L;
        this.d = 0.0f;
        this.e = 0;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0;
        this.i = -1;
        this.j = 0;
        this.k = 0;
        this.l = 0L;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = SyncedState.SYNC_STATE_DEFAULT.getValue();
        this.s = "";
        this.t = "";
        this.u = "";
        this.v = "";
        this.w = 0;
        this.x = "";
        this.y = 0;
        this.z = 0.0f;
        this.A = 0.0f;
        this.B = 0;
        this.C = 0;
        this.c = j;
    }

    public void copy(GPSActiveStatistic gPSActiveStatistic) {
        this.c = gPSActiveStatistic.getTrackId();
        this.s = gPSActiveStatistic.getDate();
        this.b = gPSActiveStatistic.getType();
        this.l = gPSActiveStatistic.getEndTime();
        this.v = gPSActiveStatistic.getStatistic();
        this.e = gPSActiveStatistic.getCostTime();
        this.f = gPSActiveStatistic.getCostCal();
        this.g = gPSActiveStatistic.getAvePace();
        this.d = gPSActiveStatistic.getDistance();
        this.j = gPSActiveStatistic.getAveHr();
        this.h = gPSActiveStatistic.getAveStepFreq();
        this.i = gPSActiveStatistic.getAveStepLength();
        this.x = gPSActiveStatistic.getContourUri();
        this.t = gPSActiveStatistic.getDevice();
        this.m = gPSActiveStatistic.getMaxRtPace();
        this.n = gPSActiveStatistic.getMinRtPace();
        this.w = gPSActiveStatistic.getSize();
        this.k = gPSActiveStatistic.getPercentOffrontStep();
        this.y = gPSActiveStatistic.getStatisticed();
        this.u = gPSActiveStatistic.getSummary();
        this.a = gPSActiveStatistic.getSource();
        this.r = gPSActiveStatistic.getState();
        this.A = gPSActiveStatistic.getClimbDisAscend();
        this.z = gPSActiveStatistic.getClimbDisDescend();
        this.B = gPSActiveStatistic.getClimbDisAscendTime();
        this.C = gPSActiveStatistic.getClimbDisDescendTime();
        this.o = gPSActiveStatistic.getStepCount();
        this.p = gPSActiveStatistic.getAltitudeAscend();
        this.q = gPSActiveStatistic.getAltitudeDescend();
    }

    public int getAltitudeAscend() {
        return this.p;
    }

    public int getAltitudeDescend() {
        return this.q;
    }

    public int getAveHr() {
        return this.j;
    }

    public float getAvePace() {
        return this.g;
    }

    public int getAveStepFreq() {
        return this.h;
    }

    public int getAveStepLength() {
        return this.i;
    }

    public float getClimbDisAscend() {
        return this.A;
    }

    public int getClimbDisAscendTime() {
        return this.B;
    }

    public float getClimbDisDescend() {
        return this.z;
    }

    public int getClimbDisDescendTime() {
        return this.C;
    }

    public String getContourUri() {
        return this.x;
    }

    public float getCostCal() {
        return this.f;
    }

    public int getCostTime() {
        return this.e;
    }

    public String getDate() {
        return this.s;
    }

    public String getDevice() {
        return this.t;
    }

    public float getDistance() {
        return this.d;
    }

    public long getEndTime() {
        return this.l;
    }

    public float getMaxRtPace() {
        return this.m;
    }

    public float getMinRtPace() {
        return this.n;
    }

    public int getPercentOffrontStep() {
        return this.k;
    }

    public int getSize() {
        return this.w;
    }

    public int getSource() {
        return this.a;
    }

    public int getState() {
        return this.r;
    }

    public String getStatistic() {
        return this.v;
    }

    public int getStatisticed() {
        return this.y;
    }

    public int getStepCount() {
        return this.o;
    }

    public String getSummary() {
        return this.u;
    }

    public long getTrackId() {
        return this.c;
    }

    public int getType() {
        return this.b;
    }

    public int getVersion() {
        return 12;
    }

    public void set(SportRecord sportRecord) {
        if (sportRecord == null) {
            return;
        }
        this.c = sportRecord.getTrackid().longValue();
        this.a = sportRecord.getSource().intValue();
        this.b = sportRecord.getType().intValue();
        this.g = sportRecord.getPace().floatValue();
        this.f = sportRecord.getCal().intValue();
        this.d = sportRecord.getDistance().intValue();
        this.e = sportRecord.getCosttime().intValue();
        this.j = sportRecord.getAvghr().intValue();
        this.h = sportRecord.getSfreq().intValue();
        this.k = sportRecord.getFfpercent().intValue();
        this.y = sportRecord.getStatisticed().intValue();
        this.m = sportRecord.getMaxrtp().floatValue();
        this.n = sportRecord.getMinrtp().floatValue();
        this.v = sportRecord.getStatistics();
        this.l = sportRecord.getEndtime().longValue();
        this.s = sportRecord.getDate();
        this.r = sportRecord.getState().intValue();
        this.t = sportRecord.getDevice();
        this.w = sportRecord.getSize().intValue();
        this.i = sportRecord.getAvgStrideLength() == null ? 0 : sportRecord.getAvgStrideLength().intValue();
        this.A = sportRecord.getClimbDisascend() == null ? 0.0f : sportRecord.getClimbDisascend().intValue();
        this.z = sportRecord.getClimbDisDescend() != null ? sportRecord.getClimbDisDescend().intValue() : 0.0f;
        this.B = sportRecord.getClimbDisAscendTime() == null ? 0 : sportRecord.getClimbDisAscendTime().intValue();
        this.C = sportRecord.getClimbDisDescendTime() == null ? 0 : sportRecord.getClimbDisDescendTime().intValue();
        this.o = sportRecord.getTotalStep() == null ? 0 : sportRecord.getTotalStep().intValue();
        this.p = sportRecord.getAltitudeAscend() == null ? 0 : sportRecord.getAltitudeAscend().intValue();
        this.q = sportRecord.getAltitudeDescend() != null ? sportRecord.getAltitudeDescend().intValue() : 0;
    }

    public void setAltitudeAscend(int i) {
        this.p = i;
    }

    public void setAltitudeDescend(int i) {
        this.q = i;
    }

    public void setAveHr(int i) {
        this.j = i;
    }

    public void setAvePace(float f) {
        this.g = f;
    }

    public void setAveStepFreq(int i) {
        this.h = i;
    }

    public void setAveStepLength(int i) {
        this.i = i;
    }

    public void setClimbDisAscend(float f) {
        this.A = f;
    }

    public void setClimbDisAscendTime(int i) {
        this.B = i;
    }

    public void setClimbDisDescend(float f) {
        this.z = f;
    }

    public void setClimbDisDescendTime(int i) {
        this.C = i;
    }

    public void setContourUri(String str) {
        this.x = str;
    }

    public void setCostCal(float f) {
        this.f = f;
    }

    public void setCostTime(int i) {
        this.e = i;
    }

    public void setDate(String str) {
        this.s = str;
    }

    public void setDevice(String str) {
        this.t = str;
    }

    public void setDistance(float f) {
        this.d = f;
    }

    public void setEndTime(long j) {
        this.l = j;
    }

    public void setMaxRtPace(float f) {
        this.m = f;
    }

    public void setMinRtPace(float f) {
        this.n = f;
    }

    public void setPercentOffrontStep(int i) {
        this.k = i;
    }

    public void setSize(int i) {
        this.w = i;
    }

    public void setSource(int i) {
        this.a = i;
    }

    public void setState(int i) {
        this.r = i;
    }

    public void setStatistic(String str) {
        this.v = str;
    }

    public void setStatisticed(int i) {
        this.y = i;
    }

    public void setStepCount(int i) {
        this.o = i;
    }

    public void setSummary(String str) {
        this.u = str;
    }

    public void setType(int i) {
        this.b = i;
    }

    public String toString() {
        return "GPSActiveStatistic{source=" + this.a + ", type=" + this.b + ", trackId=" + this.c + ", distance=" + this.d + ", costTime=" + this.e + ", costCal=" + this.f + ", avePace=" + this.g + ", aveStepFreq=" + this.h + ", aveStepLength=" + this.i + ", aveHr=" + this.j + ", percentOffrontStep=" + this.k + ", endTime=" + this.l + ", maxRtPace=" + this.m + ", minRtPace=" + this.n + ", stepCount=" + this.o + ", state=" + this.r + ", date='" + this.s + "', device='" + this.t + "', summary='" + this.u + "', statistic='" + this.v + "', size=" + this.w + ", contourUri='" + this.x + "', statisticed=" + this.y + ", climbDisDescend=" + this.z + ", climbDisAscend=" + this.A + ", climbDisAscendTime=" + this.B + ", climbDisDescendTime=" + this.C + '}';
    }

    public GPSActiveStatistic(long j, String str, int i) {
        this.a = DataTypeSource.RunSource.RUN_SOURCE_PHONE.getValue();
        this.b = 1;
        this.c = -1L;
        this.d = 0.0f;
        this.e = 0;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0;
        this.i = -1;
        this.j = 0;
        this.k = 0;
        this.l = 0L;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = SyncedState.SYNC_STATE_DEFAULT.getValue();
        this.s = "";
        this.t = "";
        this.u = "";
        this.v = "";
        this.w = 0;
        this.x = "";
        this.y = 0;
        this.z = 0.0f;
        this.A = 0.0f;
        this.B = 0;
        this.C = 0;
        this.c = j;
        this.s = str;
        this.b = i;
    }
}
