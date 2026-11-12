package com.huawei.healthcloud.plugintrack.model;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwfoundationmodel.trackmodel.MarkPoint;
import com.huawei.hwfoundationmodel.trackmodel.StepRateData;
import com.huawei.hwfoundationmodel.trackmodel.TrackDistanceData;
import com.huawei.hwfoundationmodel.trackmodel.TrackPauseData;
import com.huawei.hwsportmodel.CommonSegment;
import com.huawei.route.SlopeInfo;
import defpackage.gzr;
import defpackage.gzv;
import defpackage.njb;
import defpackage.njc;
import defpackage.njh;
import defpackage.njj;
import defpackage.njl;
import defpackage.njm;
import defpackage.njn;
import defpackage.njo;
import defpackage.njp;
import defpackage.njq;
import defpackage.njt;
import defpackage.nju;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class MotionData implements Serializable, Cloneable {
    private static final long serialVersionUID = -2092683298890594281L;

    @SerializedName("mAltitudeList")
    private ArrayList<njm> mAltitudeList;

    @SerializedName("mAnalogCadenceList")
    private List<njc> mAnalogCadenceList;

    @SerializedName("mAnalogPowerList")
    private List<njb> mAnalogPowerList;

    @SerializedName("mBritishPaceList")
    private List<njj> mBritishPaceList;
    private ArrayList<TrackDistanceData> mDistanceList;

    @SerializedName("mExtendDetailList")
    private List<njn> mExtendDetailList;

    @SerializedName("mHeartRateList")
    private ArrayList<HeartRateData> mHeartRateList;

    @SerializedName("mInvalidHeartRateList")
    private ArrayList<HeartRateData> mInvalidHeartRateList;

    @SerializedName("mLbsDataMap")
    private Map<Long, double[]> mLbsDataMap;

    @SerializedName("mMarkPointList")
    private ArrayList<MarkPoint> mMarkPointList;

    @SerializedName("mMessageList")
    private List<njo> mMessageList;

    @SerializedName("mPaceList")
    private List<njj> mPaceList;
    private ArrayList<TrackPauseData> mPauseList;

    @SerializedName("mPowerList")
    private List<njh> mPowerList;
    private List<njp> mPullFrequencyList;
    private List<njl> mRealTimePaceList;

    @SerializedName("mRealTimeSpeedList")
    private List<njt> mRealTimeSpeedList;
    private int mRealTimeSteps;
    private List<gzr> mRidePostureDataList;
    private ArrayList<gzv> mRunningPostureList;

    @SerializedName("mSegmentList")
    private List<CommonSegment> mSegmentList;
    private ArrayList<SlopeInfo> mSlopeInfoList;

    @SerializedName("mSpo2List")
    private List<nju> mSpo2List;

    @SerializedName("mSportType")
    private int mSportType;
    private int mStartSteps;
    private ArrayList<StepRateData> mStepRateList;
    private List<njq> mSwolfList;

    @SerializedName("mTotalCalories")
    private int mTotalCalories;

    @SerializedName("mTotalDistance")
    private int mTotalDistance;

    @SerializedName("mTotalTime")
    private long mTotalTime;

    public Map<Long, double[]> getLbsDataMap() {
        return this.mLbsDataMap;
    }

    public void setLbsDataMap(Map<Long, double[]> map) {
        this.mLbsDataMap = map;
    }

    public List<njj> getPaceList() {
        return this.mPaceList;
    }

    public void setPaceList(List<njj> list) {
        this.mPaceList = list;
    }

    public List<njj> getBritishPaceList() {
        return this.mBritishPaceList;
    }

    public void setBritishPaceList(List<njj> list) {
        this.mBritishPaceList = list;
    }

    public int getTotalDistance() {
        return this.mTotalDistance;
    }

    public void setTotalDistance(int i) {
        this.mTotalDistance = i;
    }

    public long getTotalTime() {
        return this.mTotalTime;
    }

    public void setTotalTime(long j) {
        this.mTotalTime = j;
    }

    public int getTotalCalories() {
        return this.mTotalCalories;
    }

    public void setTotalCalories(int i) {
        this.mTotalCalories = i;
    }

    public ArrayList<HeartRateData> getHeartRateList() {
        return this.mHeartRateList;
    }

    public void setHeartRateList(ArrayList<HeartRateData> arrayList) {
        this.mHeartRateList = arrayList;
    }

    public ArrayList<HeartRateData> getInvalidHeartRateList() {
        return this.mInvalidHeartRateList;
    }

    public List<njo> getMessageList() {
        return this.mMessageList;
    }

    public void setMessageList(List<njo> list) {
        this.mMessageList = list;
    }

    public List<njn> getExtendDetailList() {
        return this.mExtendDetailList;
    }

    public void setExtendDetailList(List<njn> list) {
        this.mExtendDetailList = list;
    }

    public List<nju> getSpo2List() {
        return this.mSpo2List;
    }

    public void saveSpo2List(List<nju> list) {
        this.mSpo2List = list;
    }

    public List<njh> getPowerList() {
        return this.mPowerList;
    }

    public void savePowerList(List<njh> list) {
        this.mPowerList = list;
    }

    public List<njb> getAnalogPowerList() {
        return this.mAnalogPowerList;
    }

    public void saveAnalogPowerList(List<njb> list) {
        this.mAnalogPowerList = list;
    }

    public List<njc> getAnalogCadenceList() {
        return this.mAnalogCadenceList;
    }

    public void saveAnalogCadenceList(List<njc> list) {
        this.mAnalogCadenceList = list;
    }

    public void saveInvalidHeartRateList(ArrayList<HeartRateData> arrayList) {
        this.mInvalidHeartRateList = arrayList;
    }

    public ArrayList<gzv> getRunningPostureList() {
        return this.mRunningPostureList;
    }

    public void saveRunningPostureList(ArrayList<gzv> arrayList) {
        this.mRunningPostureList = arrayList;
    }

    public ArrayList<StepRateData> getStepRateList() {
        return this.mStepRateList;
    }

    public void setStepRateList(ArrayList<StepRateData> arrayList) {
        this.mStepRateList = arrayList;
    }

    public ArrayList<njm> requestAltitudeList() {
        return this.mAltitudeList;
    }

    public void saveAltitudeList(ArrayList<njm> arrayList) {
        this.mAltitudeList = arrayList;
    }

    public ArrayList<TrackPauseData> requestPauseList() {
        return this.mPauseList;
    }

    public void savePauseList(ArrayList<TrackPauseData> arrayList) {
        this.mPauseList = arrayList;
    }

    public ArrayList<TrackDistanceData> requestDistanceList() {
        return this.mDistanceList;
    }

    public void saveDistanceList(ArrayList<TrackDistanceData> arrayList) {
        this.mDistanceList = arrayList;
    }

    public ArrayList<SlopeInfo> requestSlopeInfoList() {
        return this.mSlopeInfoList;
    }

    public void saveSlopeInfoList(List<SlopeInfo> list) {
        this.mSlopeInfoList = (ArrayList) list;
    }

    public ArrayList<MarkPoint> requestMarkPointList() {
        return this.mMarkPointList;
    }

    public void saveMarkPointList(ArrayList<MarkPoint> arrayList) {
        this.mMarkPointList = arrayList;
    }

    public List<njq> requestSwolfList() {
        return this.mSwolfList;
    }

    public void saveSwolfList(List<njq> list) {
        this.mSwolfList = list;
    }

    public List<njp> requestPullFreqList() {
        return this.mPullFrequencyList;
    }

    public void savePullFreqList(List<njp> list) {
        this.mPullFrequencyList = list;
    }

    public List<njl> requestRealTimePaceList() {
        return this.mRealTimePaceList;
    }

    public void saveRealTimePaceList(List<njl> list) {
        this.mRealTimePaceList = list;
    }

    public void saveSegmentList(List<CommonSegment> list) {
        this.mSegmentList = list;
    }

    public List<CommonSegment> requestSegmentList() {
        return this.mSegmentList;
    }

    public List<njt> requestRealTimeSpeedList() {
        return this.mRealTimeSpeedList;
    }

    public void saveRealTimeSpeedList(List<njt> list) {
        this.mRealTimeSpeedList = list;
    }

    public int getStartSteps() {
        return this.mStartSteps;
    }

    public void saveStartSteps(int i) {
        this.mStartSteps = i;
    }

    public int getRealTimeSteps() {
        return this.mRealTimeSteps;
    }

    public void saveRealTimeSteps(int i) {
        this.mRealTimeSteps = i;
    }

    public void saveCadenceDataList(List<gzr> list) {
        this.mRidePostureDataList = list;
    }

    public List<gzr> getRidePostureDataList() {
        return this.mRidePostureDataList;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("MotionPath [, sportType=");
        sb.append(this.mSportType);
        sb.append(", paceList=");
        sb.append(this.mPaceList);
        sb.append(", britishPaceList=");
        sb.append(this.mBritishPaceList);
        sb.append(", heartrateList=");
        sb.append(this.mHeartRateList);
        sb.append(", altitude=");
        sb.append(this.mAltitudeList);
        sb.append(", totalDistance=");
        sb.append(this.mTotalDistance);
        sb.append(", totalTime=");
        sb.append(this.mTotalTime);
        sb.append(", getTotalCalories()=");
        sb.append(getTotalCalories());
        sb.append(", getClass()=");
        sb.append(getClass());
        sb.append(", hashCode()=");
        sb.append(hashCode());
        sb.append(",invalidHeartRateList");
        sb.append(this.mInvalidHeartRateList);
        sb.append(",runningPostureList");
        sb.append(this.mRunningPostureList);
        sb.append(",ridePostureDataList");
        sb.append(this.mRidePostureDataList);
        sb.append(",mSegmentList");
        sb.append(this.mSegmentList);
        sb.append(",mSpo2List");
        sb.append(this.mSpo2List);
        sb.append(",mPowerList");
        sb.append(this.mPowerList);
        sb.append(",mAnalogPowerList");
        sb.append(this.mAnalogPowerList);
        sb.append(",mAnalogCadenceList");
        sb.append(this.mAnalogCadenceList);
        sb.append("]");
        return sb.toString();
    }

    public int getSportType() {
        return this.mSportType;
    }

    public void setSportType(int i) {
        this.mSportType = i;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public MotionData m1299clone() throws CloneNotSupportedException {
        return (MotionData) super.clone();
    }
}
