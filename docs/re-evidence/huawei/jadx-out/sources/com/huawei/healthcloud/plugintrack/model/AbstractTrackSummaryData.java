package com.huawei.healthcloud.plugintrack.model;

import android.content.Context;
import android.text.format.DateFormat;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hihealth.data.model.RelativeSportData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import defpackage.izn;
import health.compact.a.UnitUtil;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractTrackSummaryData {
    protected static final double DISTANCE_DIGITAL = 0.005d;
    protected static final String EMPTY_STRING = "";
    protected static final double MAX_PACE = 360000.0d;
    protected static final double MIN_PACE = 3.6d;
    protected int mAbnormalTrack;
    protected float mAlterData;
    protected float mCalories;
    protected int mChiefDataValue;
    protected int mChiefSportDataType;
    protected int mDuplicated;
    protected long mDuration;
    protected long mEndTime;
    protected int mSportType;
    protected long mStartTime;

    public AbstractTrackSummaryData() {
        this.mChiefSportDataType = 0;
        this.mAlterData = 0.0f;
        this.mAbnormalTrack = 0;
        this.mDuplicated = 0;
    }

    public AbstractTrackSummaryData(MotionPathSimplify motionPathSimplify) {
        this.mChiefSportDataType = 0;
        this.mAlterData = 0.0f;
        this.mAbnormalTrack = 0;
        this.mDuplicated = 0;
        if (motionPathSimplify != null) {
            this.mChiefDataValue = motionPathSimplify.requestTotalDistance();
            this.mChiefSportDataType = motionPathSimplify.requestChiefSportDataType();
            this.mAlterData = motionPathSimplify.requestAvgPace();
            this.mDuration = motionPathSimplify.requestTotalTime();
            this.mEndTime = motionPathSimplify.requestEndTime();
            this.mStartTime = motionPathSimplify.requestStartTime();
            this.mSportType = motionPathSimplify.requestSportType();
            this.mCalories = motionPathSimplify.requestTotalCalories();
            this.mAbnormalTrack = motionPathSimplify.requestAbnormalTrack();
            this.mDuplicated = motionPathSimplify.requestDuplicated();
        }
    }

    public AbstractTrackSummaryData(RelativeSportData relativeSportData) {
        this.mChiefSportDataType = 0;
        this.mAlterData = 0.0f;
        this.mAbnormalTrack = 0;
        this.mDuplicated = 0;
        if (relativeSportData != null) {
            this.mChiefDataValue = relativeSportData.getDistance();
            if (relativeSportData.getDistance() != 0) {
                this.mAlterData = (float) ((relativeSportData.getDuration() * 1.0d) / ((double) relativeSportData.getDistance()));
            }
            this.mDuration = relativeSportData.getDuration();
            this.mEndTime = relativeSportData.getEndTime();
            this.mStartTime = relativeSportData.getStartTime();
            this.mSportType = relativeSportData.getSportType();
            this.mCalories = relativeSportData.getCalories();
        }
    }

    public int getChiefDataValue() {
        return this.mChiefDataValue;
    }

    public int getChiefSportDataType() {
        return this.mChiefSportDataType;
    }

    public long getDuration() {
        return this.mDuration;
    }

    public float getAlterData() {
        return this.mAlterData;
    }

    public int getSportType() {
        return this.mSportType;
    }

    public long getStartTime() {
        return this.mStartTime;
    }

    public long getEndTime() {
        return this.mEndTime;
    }

    public int getDuplicated() {
        return this.mDuplicated;
    }

    public int getAbnormalType() {
        return this.mAbnormalTrack;
    }

    public float getCalorie() {
        return this.mCalories;
    }

    public void setChiefDataValueAndType(int i, int i2) {
        this.mChiefDataValue = i;
        this.mChiefSportDataType = i2;
    }

    public void setDuration(long j) {
        this.mDuration = j;
    }

    public void saveAlterData(float f) {
        this.mAlterData = f;
    }

    public void setSportType(int i) {
        this.mSportType = i;
    }

    public void setStartTime(long j) {
        this.mStartTime = j;
    }

    public void setEndTime(long j) {
        this.mEndTime = j;
    }

    public void setAbnormalType(int i) {
        this.mAbnormalTrack = i;
    }

    public void setCalories(float f) {
        this.mCalories = f;
    }

    public void setDuplicated(int i) {
        this.mDuplicated = i;
    }

    public String getChiefDataString() {
        return getDistanceString();
    }

    public String getChiefDataUnitString() {
        return getDistanceUnitString();
    }

    public String getAlterDataString() {
        return getPaceString();
    }

    public String getAlterUnitString() {
        return getPaceUnitString();
    }

    public int getSportTypeDrawableSource(boolean z) {
        if (z) {
            return R.drawable.ic_health_list_colours_run;
        }
        return R.drawable.ic_health_list_run;
    }

    public int getSportDurationDrawableSource() {
        return R.drawable.ic_health_sport_history_list_time;
    }

    public String getDistanceString() {
        String strE = izn.e(BaseApplication.getContext());
        if (UnitUtil.f()) {
            double dE = UnitUtil.e((((double) this.mChiefDataValue) * 1.0d) / 1000.0d, 3);
            return dE >= DISTANCE_DIGITAL ? getNumberFormat(dE, 2) : strE;
        }
        double d = (((double) this.mChiefDataValue) * 1.0d) / 1000.0d;
        return d >= DISTANCE_DIGITAL ? getNumberFormat(d, 2) : strE;
    }

    public String getDistanceUnitString() {
        Context context = BaseApplication.getContext();
        if (context == null) {
            return "";
        }
        if (UnitUtil.f()) {
            return context.getString(R.string.IDS_band_data_sport_distance_unit_en);
        }
        return context.getString(R.string.IDS_band_data_sport_distance_unit);
    }

    public String getPaceString() {
        double d = this.mAlterData;
        if (d > MAX_PACE || d <= MIN_PACE) {
            return izn.e(BaseApplication.getContext());
        }
        return izn.a(UnitUtil.f() ? (float) UnitUtil.c(this.mAlterData, 3) : this.mAlterData);
    }

    public String getPaceUnitString() {
        Context context = BaseApplication.getContext();
        if (context == null) {
            return "";
        }
        if (UnitUtil.f()) {
            return "/" + context.getResources().getString(R.string.IDS_band_data_sport_distance_unit_en);
        }
        return "/" + context.getResources().getString(R.string.IDS_band_data_sport_distance_unit);
    }

    public String getSpeedString() {
        double seconds;
        if (Math.abs(this.mAlterData) < 1.0E-4f) {
            return izn.e(BaseApplication.getContext());
        }
        if (UnitUtil.f()) {
            seconds = UnitUtil.e(TimeUnit.HOURS.toSeconds(1L) / this.mAlterData, 3);
        } else {
            seconds = TimeUnit.HOURS.toSeconds(1L) / this.mAlterData;
        }
        return UnitUtil.e(seconds, 1, 2);
    }

    public String getSpeedUnitString() {
        Context context = BaseApplication.getContext();
        if (context == null) {
            return "";
        }
        if (UnitUtil.f()) {
            return context.getString(R.string.IDS_motiontrack_show_detail_average_speed_imp);
        }
        return context.getString(R.string.IDS_motiontrack_show_detail_average_speed);
    }

    public String getItemDataString() {
        return new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "Md")).format(Long.valueOf(this.mStartTime));
    }

    public String getItemDurationString() {
        return UnitUtil.e((int) TimeUnit.MILLISECONDS.toSeconds(this.mDuration));
    }

    protected String getNumberFormat(double d, int i) {
        return UnitUtil.e(d, 1, i);
    }
}
