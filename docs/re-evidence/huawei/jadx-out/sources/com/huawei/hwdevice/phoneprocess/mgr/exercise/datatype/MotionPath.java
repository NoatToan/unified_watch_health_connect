package com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwsportmodel.CommonSegment;
import com.huawei.route.SlopeInfo;
import defpackage.gzv;
import defpackage.lmb;
import defpackage.njj;
import defpackage.nju;
import defpackage.njv;
import defpackage.njy;
import health.compact.a.LogUtil;
import health.compact.a.UnitUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class MotionPath implements Serializable {
    private static final String BRITISH_PACE_MAP_TAG = "tp=b-p-m";
    public static final String BRITISH_PACE_V2_TAG = "tp=bpm2";
    private static final String CADENCE_RATE_LIST_TAG = "tp=cad";
    private static final String CADENCE_SLOPE_INFO_TAG = "tp=slop";
    public static final String CONTENT_DIS = "d=";
    private static final String CONTENT_KEY = ";k=";
    public static final String CONTENT_NUM = "n=";
    public static final String CONTENT_PACE = "p=";
    private static final String CONTENT_VALUE = "v=";
    private static final String EQUAL_SIGN = "=";
    private static final String EXTRAS_DATA_TAG = "tp=ext";
    private static final String FIELD_SEPARATOR = ";";
    private static final String HEART_RATE_LIST_TAG = "tp=h-r";
    private static final String HEART_RATE_RECOVERY_LIST_TAG = "tp=r-r-h";
    private static final String INTERVAL_BRITISH_PACE_MAP_TAG = "tp=pm-b";
    private static final String INTERVAL_NORMAL_PACE_MAP_TAG = "tp=pm-n";
    private static final String INVALID_HEART_RATE_LIST_TAG = "tp=i-h-r";
    private static final String ITR_DATA_MAP_TAG = "tp=itr";
    private static final String JUMP_TAG = "tp=jump";
    private static final String LBS_DATA_MAP_TAG = "tp=lbs";
    private static final String PACE_MAP_TAG = "tp=p-m";
    public static final String PACE_V2_TAG = "tp=pm2";
    private static final String PADDLE_RATE_LIST_TAG = "tp=pad";
    private static final String RIDE_ANALOG_CADENCE_TAG = "tp=acad";
    private static final String RIDE_ANALOG_POWER_TAG = "tp=apw";
    private static final String RIDE_POWER_TAG = "tp=pow";
    private static final String RUNNING_POSTURE_TAG = "tp=rp";
    private static final String SKIPPING_SPEED_DATA_TAG = "tp=scp";
    private static final String SPO2_TAG = "tp=spo2";
    private static final String STEP_RATE_LIST_TAG = "tp=s-r";
    private static final String STRING_CARRIAGE_CHARACTER = System.lineSeparator();
    private static final String TAG = "Device_MotionPath";
    private static final String TRACK_ALTITUDE_TAG = "tp=alti";
    private static final String TRACK_PULL_FREQ_DATA_TAG = "tp=p-f";
    private static final String TRACK_SPEED_DATA_TAG = "tp=rs";
    private static final String TRACK_SWOLF_DATA_TAG = "tp=swf";
    private static final String VERSION = "version=1001";
    private static final long serialVersionUID = -1773594779542639469L;
    private ArrayList<TrackAltitudeData> altitudeList;
    private Map<Integer, Float> britishIntervalPaceMap;
    private Map<Integer, Float> britishPaceMap;
    private ArrayList<StepRateData> cadenceRateList;
    private ArrayList<HeartRateData> heartRateList;
    private ArrayList<HeartRateData> invalidHeartRateList;
    private Map<Long, double[]> lbsDataMap;
    private List<njj> mBriPaceV2;
    private List<CommonSegment> mCommonSegments;
    private List<LinkedHashMap<String, String>> mExtraDataList;
    private List<lmb> mJumpDataList;
    private List<njj> mPaceV2;
    private ArrayList<TrackPullFreqData> mPullFreqList;
    private List<RideAnalogCadence> mRideAnalogCadenceList;
    private List<RideAnalogPower> mRideAnalogPowerList;
    private List<RidePower> mRidePowerList;
    private List<SkippingSpeed> mSkippingSpeedList;
    private List<SlopeInfo> mSlopeInfoList;
    private ArrayList<TrackSpeedData> mSpeedList;
    private List<nju> mSpo2List;
    private ArrayList<TrackSwolfData> mSwolfList;
    private Map<Integer, Float> normalIntervalPaceMap;
    private Map<Integer, Float> paceMap;
    private ArrayList<StepRateData> paddleRateList;
    private ArrayList<HeartRateData> recoveryHeartRateList;
    private ArrayList<gzv> runningPostureList;
    private ArrayList<StepRateData> stepRateList;

    @SerializedName("actionSummary")
    private String mActionSummary = "";
    private String mDivingIncidentData = "";
    private StringBuffer mSequenceDetailData = new StringBuffer();
    private boolean isIndoorTrajectory = false;

    public StringBuffer getSequenceDetailData() {
        return this.mSequenceDetailData;
    }

    public void setIndoorTrajectory(boolean z) {
        this.isIndoorTrajectory = z;
    }

    public void setExtraDataList(List<LinkedHashMap<String, String>> list) {
        this.mExtraDataList = list;
    }

    public String getDivingIncidentData() {
        return this.mDivingIncidentData;
    }

    public void setDivingIncidentData(String str) {
        this.mDivingIncidentData = str;
    }

    public List<RidePower> getRidePowerList() {
        return this.mRidePowerList;
    }

    public void setRidePowerList(List<RidePower> list) {
        this.mRidePowerList = list;
    }

    public List<RideAnalogPower> getRideAnalogPowerList() {
        return this.mRideAnalogPowerList;
    }

    public void setAnalogRideAnalogPowerList(List<RideAnalogPower> list) {
        this.mRideAnalogPowerList = list;
    }

    public List<RideAnalogCadence> getRideAnalogCadenceList() {
        return this.mRideAnalogCadenceList;
    }

    public void setRideAnalogCadenceList(List<RideAnalogCadence> list) {
        this.mRideAnalogCadenceList = list;
    }

    public List<SlopeInfo> getSlopeInfoList() {
        return this.mSlopeInfoList;
    }

    public void setSlopeInfoList(List<SlopeInfo> list) {
        this.mSlopeInfoList = list;
    }

    public List<CommonSegment> getCommonSegments() {
        return this.mCommonSegments;
    }

    public void setCommonSegments(List<CommonSegment> list) {
        this.mCommonSegments = list;
    }

    public void setActionSummary(String str) {
        this.mActionSummary = str;
    }

    public Map<Long, double[]> getLbsDataMap() {
        return this.lbsDataMap;
    }

    public void setLbsDataMap(Map<Long, double[]> map) {
        this.lbsDataMap = map;
    }

    public Map<Integer, Float> getPaceMap() {
        return this.paceMap;
    }

    public void setPaceMap(Map<Integer, Float> map) {
        this.paceMap = map;
    }

    public List<njj> requestPaceList() {
        if (njy.b(this.mPaceV2)) {
            return this.mPaceV2;
        }
        return njv.c(this.paceMap);
    }

    public Map<Integer, Float> getBritishPaceMap() {
        return this.britishPaceMap;
    }

    public void setBritishPaceMap(Map<Integer, Float> map) {
        this.britishPaceMap = map;
    }

    public List<njj> requestBritishPaceList() {
        if (njy.b(this.mBriPaceV2)) {
            return this.mBriPaceV2;
        }
        return njv.c(this.britishPaceMap);
    }

    public void savePaceV2(List<njj> list) {
        this.mPaceV2 = list;
    }

    public List<njj> getPaceV2() {
        return this.mPaceV2;
    }

    public void saveBriPaceV2(List<njj> list) {
        this.mBriPaceV2 = list;
    }

    public List<njj> getBriPaceV2() {
        return this.mBriPaceV2;
    }

    public ArrayList<HeartRateData> getHeartRateList() {
        return this.heartRateList;
    }

    public void setHeartRateList(ArrayList<HeartRateData> arrayList) {
        this.heartRateList = arrayList;
    }

    public void setRecoveryHeartRateList(ArrayList<HeartRateData> arrayList) {
        this.recoveryHeartRateList = arrayList;
    }

    public ArrayList<HeartRateData> getRecoveryHeartRateList() {
        return this.recoveryHeartRateList;
    }

    public ArrayList<HeartRateData> getInvalidHeartRateList() {
        return this.invalidHeartRateList;
    }

    public void setInvalidHeartRateList(ArrayList<HeartRateData> arrayList) {
        this.invalidHeartRateList = arrayList;
    }

    public ArrayList<StepRateData> getStepRateList() {
        return this.stepRateList;
    }

    public void setStepRateList(ArrayList<StepRateData> arrayList) {
        this.stepRateList = arrayList;
    }

    public ArrayList<StepRateData> getPaddleRateList() {
        return this.paddleRateList;
    }

    public void setPaddleRateList(ArrayList<StepRateData> arrayList) {
        this.paddleRateList = arrayList;
    }

    public ArrayList<StepRateData> getCadenceRateList() {
        return this.cadenceRateList;
    }

    public void setCadenceRateList(ArrayList<StepRateData> arrayList) {
        this.cadenceRateList = arrayList;
    }

    public Map<Integer, Float> getNormalIntervalPaceMap() {
        return this.normalIntervalPaceMap;
    }

    public void setNormalIntervalPaceMap(Map<Integer, Float> map) {
        this.normalIntervalPaceMap = map;
    }

    public Map<Integer, Float> getBritishIntervalPaceMap() {
        return this.britishIntervalPaceMap;
    }

    public void setBritishIntervalPaceMap(Map<Integer, Float> map) {
        this.britishIntervalPaceMap = map;
    }

    public ArrayList<TrackSpeedData> getSpeedList() {
        return this.mSpeedList;
    }

    public void setSpeedList(ArrayList<TrackSpeedData> arrayList) {
        this.mSpeedList = arrayList;
    }

    public ArrayList<TrackAltitudeData> getAltitudeList() {
        return this.altitudeList;
    }

    public void setAltitudeList(ArrayList<TrackAltitudeData> arrayList) {
        this.altitudeList = arrayList;
    }

    public ArrayList<TrackSwolfData> getSwolfList() {
        return this.mSwolfList;
    }

    public void saveJumpDataList(List<lmb> list) {
        this.mJumpDataList = list;
    }

    public void setSwolfList(ArrayList<TrackSwolfData> arrayList) {
        this.mSwolfList = arrayList;
    }

    public ArrayList<gzv> requestRunningPostureList() {
        return this.runningPostureList;
    }

    public void saveRunningPostureList(ArrayList<gzv> arrayList) {
        this.runningPostureList = arrayList;
    }

    public ArrayList<TrackPullFreqData> getPullFreqList() {
        return this.mPullFreqList;
    }

    public void setPullFreqList(ArrayList<TrackPullFreqData> arrayList) {
        this.mPullFreqList = arrayList;
    }

    public List<nju> requestSpo2List() {
        return this.mSpo2List;
    }

    public void saveSpo2List(List<nju> list) {
        this.mSpo2List = list;
    }

    public List<SkippingSpeed> getSkippingSpeedList() {
        return this.mSkippingSpeedList;
    }

    public void setSkippingSpeedList(List<SkippingSpeed> list) {
        this.mSkippingSpeedList = list;
    }

    public String toString() {
        String strAppendLbsString = appendLbsString();
        String strAppendPaceString = appendPaceString();
        String strAppendBritishPaceString = appendBritishPaceString();
        String strAppendHeartRateString = appendHeartRateString();
        String strAppendRecoveryHeartRateString = appendRecoveryHeartRateString();
        String strAppendInvalidHeartRateString = appendInvalidHeartRateString();
        String strAppendStepRateString = appendStepRateString();
        String strAppendNormalIntervalPaceString = appendNormalIntervalPaceString();
        String strAppendBritishIntervalPaceString = appendBritishIntervalPaceString();
        String strAppendAltitudeString = appendAltitudeString();
        String strAppendSwolfString = appendSwolfString();
        String strSpo2ListToStr = spo2ListToStr();
        String strAppendPullFreqString = appendPullFreqString();
        String strAppendSpeedListString = appendSpeedListString();
        String strAppendSkippingSpeedListString = appendSkippingSpeedListString();
        String strAppendRidePowerListString = appendRidePowerListString();
        String strAppendRideAnalogPowerListString = appendRideAnalogPowerListString();
        String strAppendRideAnalogCadenceListString = appendRideAnalogCadenceListString();
        String strRunningPostureListToStr = runningPostureListToStr();
        String strJumpDataListToString = jumpDataListToString();
        String strAppendPaddleRateString = appendPaddleRateString();
        String strAppendCadenceRateString = appendCadenceRateString();
        String strAppendSlopeInfoString = appendSlopeInfoString();
        String strCommonSectionToString = commonSectionToString();
        String strAddNewExtraDataToString = addNewExtraDataToString();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(strAppendLbsString);
        stringBuffer.append(strAppendPaceString);
        stringBuffer.append(strAppendBritishPaceString);
        paceDataListToString(stringBuffer, this.mPaceV2, "tp=pm2");
        paceDataListToString(stringBuffer, this.mBriPaceV2, "tp=bpm2");
        stringBuffer.append(strAppendHeartRateString);
        stringBuffer.append(strAppendRecoveryHeartRateString);
        stringBuffer.append(strAppendInvalidHeartRateString);
        stringBuffer.append(strAppendStepRateString);
        stringBuffer.append(strAppendNormalIntervalPaceString);
        stringBuffer.append(strAppendBritishIntervalPaceString);
        stringBuffer.append(strAppendAltitudeString);
        stringBuffer.append(strAppendSwolfString);
        stringBuffer.append(strSpo2ListToStr);
        stringBuffer.append(strAppendPullFreqString);
        stringBuffer.append(strAppendSpeedListString);
        stringBuffer.append(strAppendSkippingSpeedListString);
        stringBuffer.append(strAppendRidePowerListString);
        stringBuffer.append(strAppendRideAnalogPowerListString);
        stringBuffer.append(strAppendRideAnalogCadenceListString);
        stringBuffer.append(strRunningPostureListToStr);
        stringBuffer.append(strJumpDataListToString);
        stringBuffer.append(strAppendPaddleRateString);
        stringBuffer.append(strAppendCadenceRateString);
        stringBuffer.append(strAppendSlopeInfoString);
        stringBuffer.append(strCommonSectionToString);
        stringBuffer.append(strAddNewExtraDataToString);
        if (!TextUtils.isEmpty(this.mDivingIncidentData)) {
            stringBuffer.append(this.mDivingIncidentData);
            stringBuffer.append(STRING_CARRIAGE_CHARACTER);
        }
        if (!TextUtils.isEmpty(this.mSequenceDetailData.toString())) {
            stringBuffer.append(this.mSequenceDetailData);
            stringBuffer.append(STRING_CARRIAGE_CHARACTER);
        }
        if (!TextUtils.isEmpty(this.mActionSummary)) {
            stringBuffer.append("actionSummary=");
            stringBuffer.append(this.mActionSummary);
            stringBuffer.append(STRING_CARRIAGE_CHARACTER);
        }
        return stringBuffer.toString();
    }

    private void paceDataListToString(StringBuffer stringBuffer, List<njj> list, String str) {
        if (njy.b(list)) {
            LogUtil.b(TAG, "paceDataList size ", Integer.valueOf(list.size()));
            for (njj njjVar : list) {
                if (njjVar != null) {
                    stringBuffer.append(str).append(";").append("d=").append(njjVar.c()).append(";").append("n=").append(njjVar.e()).append(";").append("p=").append(njjVar.d()).append(";").append(System.lineSeparator());
                }
            }
        }
    }

    private String appendRidePowerListString() {
        if (this.mRidePowerList == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        for (RidePower ridePower : this.mRidePowerList) {
            stringBuffer.append("tp=pow;k=").append(ridePower.acquireTime()).append(";v=").append(ridePower.getPower()).append(";").append(STRING_CARRIAGE_CHARACTER);
        }
        return stringBuffer.toString();
    }

    private String appendRideAnalogPowerListString() {
        if (this.mRideAnalogPowerList == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        for (RideAnalogPower rideAnalogPower : this.mRideAnalogPowerList) {
            stringBuffer.append("tp=apw;k=").append(rideAnalogPower.acquireTime()).append(";v=").append(rideAnalogPower.getAnalogPower()).append(";").append(STRING_CARRIAGE_CHARACTER);
        }
        return stringBuffer.toString();
    }

    private String appendRideAnalogCadenceListString() {
        if (this.mRideAnalogCadenceList == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        for (RideAnalogCadence rideAnalogCadence : this.mRideAnalogCadenceList) {
            stringBuffer.append("tp=acad;k=").append(rideAnalogCadence.acquireTime()).append(";v=").append(rideAnalogCadence.getAnalogCadence()).append(";").append(STRING_CARRIAGE_CHARACTER);
        }
        return stringBuffer.toString();
    }

    private String appendLbsString() {
        if (this.lbsDataMap == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        for (Map.Entry<Long, double[]> entry : this.lbsDataMap.entrySet()) {
            stringBuffer.append(this.isIndoorTrajectory ? ITR_DATA_MAP_TAG : "tp=lbs").append(";k=").append(entry.getKey()).append(";lat=").append(entry.getValue()[0]).append(";lon=").append(entry.getValue()[1]).append(";alt=").append(entry.getValue()[2]).append(";t=").append(entry.getValue()[3]).append(";").append(STRING_CARRIAGE_CHARACTER);
        }
        return stringBuffer.toString();
    }

    private String appendPaceString() {
        if (this.paceMap == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        for (Map.Entry<Integer, Float> entry : this.paceMap.entrySet()) {
            stringBuffer.append("tp=p-m;k=").append(entry.getKey()).append(";v=").append(entry.getValue()).append(";").append(STRING_CARRIAGE_CHARACTER);
        }
        return stringBuffer.toString();
    }

    private String appendBritishPaceString() {
        if (this.britishPaceMap == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        for (Map.Entry<Integer, Float> entry : this.britishPaceMap.entrySet()) {
            stringBuffer.append("tp=b-p-m;k=").append(entry.getKey()).append(";v=").append(entry.getValue()).append(";").append(STRING_CARRIAGE_CHARACTER);
        }
        return stringBuffer.toString();
    }

    private String appendHeartRateString() {
        if (this.heartRateList == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        for (HeartRateData heartRateData : this.heartRateList) {
            stringBuffer.append("tp=h-r;k=").append(heartRateData.acquireTime()).append(";v=").append(heartRateData.acquireHeartRate()).append(";").append(STRING_CARRIAGE_CHARACTER);
        }
        return stringBuffer.toString();
    }

    private String appendRecoveryHeartRateString() {
        if (this.recoveryHeartRateList == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        for (HeartRateData heartRateData : this.recoveryHeartRateList) {
            stringBuffer.append("tp=r-r-h;k=").append(heartRateData.acquireTime()).append(";v=").append(heartRateData.acquireHeartRate()).append(";").append(STRING_CARRIAGE_CHARACTER);
        }
        return stringBuffer.toString();
    }

    private String appendInvalidHeartRateString() {
        if (this.invalidHeartRateList == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        for (HeartRateData heartRateData : this.invalidHeartRateList) {
            stringBuffer.append("tp=i-h-r;k=").append(heartRateData.acquireTime()).append(";v=").append(heartRateData.acquireHeartRate()).append(";").append(STRING_CARRIAGE_CHARACTER);
        }
        return stringBuffer.toString();
    }

    private String appendStepRateString() {
        if (this.stepRateList == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        for (StepRateData stepRateData : this.stepRateList) {
            stringBuffer.append("tp=s-r;k=").append(stepRateData.getTime()).append(";v=").append(stepRateData.getStepRate()).append(";").append(STRING_CARRIAGE_CHARACTER);
        }
        return stringBuffer.toString();
    }

    private String appendPaddleRateString() {
        if (this.paddleRateList == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(16);
        for (StepRateData stepRateData : this.paddleRateList) {
            sb.append("tp=pad;k=");
            sb.append(stepRateData.getTime());
            sb.append(";v=");
            sb.append(stepRateData.getStepRate());
            sb.append(";");
            sb.append(STRING_CARRIAGE_CHARACTER);
        }
        return sb.toString();
    }

    private String appendCadenceRateString() {
        if (this.cadenceRateList == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(16);
        for (StepRateData stepRateData : this.cadenceRateList) {
            sb.append("tp=cad;k=");
            sb.append(stepRateData.getTime());
            sb.append(";v=");
            sb.append(stepRateData.getStepRate());
            sb.append(";");
            sb.append(STRING_CARRIAGE_CHARACTER);
        }
        return sb.toString();
    }

    private String appendSlopeInfoString() {
        if (this.mSlopeInfoList == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(16);
        for (SlopeInfo slopeInfo : this.mSlopeInfoList) {
            if (slopeInfo != null) {
                sb.append("tp=slop;no=");
                sb.append(slopeInfo.getNumber());
                sb.append(";lv=");
                sb.append(slopeInfo.getLevel());
                sb.append(";dist=");
                sb.append(slopeInfo.getDistance());
                sb.append(";asc=");
                sb.append(slopeInfo.getAscent());
                sb.append(";gd=");
                sb.append(slopeInfo.getGradient());
                sb.append(";ct=");
                sb.append(slopeInfo.getClimbTime());
                sb.append(";sd=");
                sb.append(slopeInfo.getStartDistance());
                sb.append(";sti=");
                sb.append(slopeInfo.getStartTrackIndex());
                sb.append(";eti=");
                sb.append(slopeInfo.getEndTrackIndex());
                sb.append(";sai=");
                sb.append(slopeInfo.getStartAltIndex());
                sb.append(";eai=");
                sb.append(slopeInfo.getEndAltIndex());
                sb.append(";");
                sb.append(STRING_CARRIAGE_CHARACTER);
            }
        }
        return sb.toString();
    }

    private String appendNormalIntervalPaceString() {
        if (this.normalIntervalPaceMap == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        for (Map.Entry<Integer, Float> entry : this.normalIntervalPaceMap.entrySet()) {
            stringBuffer.append("tp=pm-n;k=").append(entry.getKey()).append(";v=").append(entry.getValue()).append(";").append(STRING_CARRIAGE_CHARACTER);
        }
        return stringBuffer.toString();
    }

    private String appendBritishIntervalPaceString() {
        if (this.britishIntervalPaceMap == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        for (Map.Entry<Integer, Float> entry : this.britishIntervalPaceMap.entrySet()) {
            stringBuffer.append("tp=pm-b;k=").append(entry.getKey()).append(";v=").append(entry.getValue()).append(";").append(STRING_CARRIAGE_CHARACTER);
        }
        return stringBuffer.toString();
    }

    private String appendAltitudeString() {
        if (this.altitudeList == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        for (TrackAltitudeData trackAltitudeData : this.altitudeList) {
            stringBuffer.append("tp=alti;k=").append(trackAltitudeData.getTime()).append(";v=").append(trackAltitudeData.getAltitude()).append(";").append(STRING_CARRIAGE_CHARACTER);
        }
        return stringBuffer.toString();
    }

    private String appendSwolfString() {
        if (this.mSwolfList == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        for (TrackSwolfData trackSwolfData : this.mSwolfList) {
            stringBuffer.append("tp=swf;k=").append(trackSwolfData.getTime()).append(";v=").append(trackSwolfData.getSwolf()).append(";").append(STRING_CARRIAGE_CHARACTER);
        }
        return stringBuffer.toString();
    }

    private String appendPullFreqString() {
        if (this.mPullFreqList == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        for (TrackPullFreqData trackPullFreqData : this.mPullFreqList) {
            stringBuffer.append("tp=p-f;k=").append(trackPullFreqData.getTime()).append(";v=").append(trackPullFreqData.getPullFreq()).append(";").append(STRING_CARRIAGE_CHARACTER);
        }
        return stringBuffer.toString();
    }

    private String appendSpeedListString() {
        if (this.mSpeedList == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        for (TrackSpeedData trackSpeedData : this.mSpeedList) {
            stringBuffer.append("tp=rs;k=").append(trackSpeedData.getTime()).append(";v=").append(trackSpeedData.getRealTimeSpeed()).append(";").append(STRING_CARRIAGE_CHARACTER);
        }
        return stringBuffer.toString();
    }

    private String appendSkippingSpeedListString() {
        if (this.mSkippingSpeedList == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        for (SkippingSpeed skippingSpeed : this.mSkippingSpeedList) {
            stringBuffer.append("tp=scp;k=").append(skippingSpeed.acquireTime()).append(";v=").append(skippingSpeed.getSpeed()).append(";").append(STRING_CARRIAGE_CHARACTER);
        }
        return stringBuffer.toString();
    }

    private String spo2ListToStr() {
        if (this.mSpo2List == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        for (nju njuVar : this.mSpo2List) {
            stringBuffer.append("tp=spo2;k=").append(njuVar.acquireTime()).append(";v=").append(njuVar.b()).append(";").append(System.lineSeparator());
        }
        return stringBuffer.toString();
    }

    private String runningPostureListToStr() {
        StringBuffer stringBuffer = new StringBuffer(0);
        ArrayList<gzv> arrayList = this.runningPostureList;
        if (arrayList != null) {
            for (gzv gzvVar : arrayList) {
                stringBuffer.append("tp=rp").append(";k=").append(gzvVar.h()).append(";").append("gct=").append(gzvVar.a()).append(";").append("gia=").append(gzvVar.d()).append(";").append("sa=").append(gzvVar.j()).append(";").append("ee=").append(gzvVar.b()).append(";").append("fsp=").append(gzvVar.e()).append(";").append("wsp=").append(gzvVar.i()).append(";").append("hsp=").append(gzvVar.c()).append(";").append("aht=").append(gzvVar.l()).append(";").append("htr=").append(gzvVar.k()).append(";");
                addNewRunningPostureData(gzvVar, stringBuffer);
                stringBuffer.append("sl").append("=").append(gzvVar.m()).append(";");
                stringBuffer.append(STRING_CARRIAGE_CHARACTER);
            }
        }
        return stringBuffer.toString();
    }

    private void addNewRunningPostureData(gzv gzvVar, StringBuffer stringBuffer) {
        LinkedHashMap<String, String> linkedHashMapG = gzvVar.g();
        if (linkedHashMapG.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : linkedHashMapG.entrySet()) {
            stringBuffer.append(entry.getKey()).append("=").append(entry.getValue()).append(";");
        }
    }

    private String jumpDataListToString() {
        if (this.mJumpDataList == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        for (lmb lmbVar : this.mJumpDataList) {
            stringBuffer.append("tp=jump;k=").append(lmbVar.b()).append(";h=").append(lmbVar.a()).append(";t=").append(lmbVar.d()).append(";").append(System.lineSeparator());
        }
        return stringBuffer.toString();
    }

    private String commonSectionToString() {
        if (this.mCommonSegments == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        Iterator<CommonSegment> it = this.mCommonSegments.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next().toTrackString());
        }
        return stringBuffer.toString();
    }

    private String addNewExtraDataToString() {
        StringBuffer stringBuffer = new StringBuffer(16);
        List<LinkedHashMap<String, String>> list = this.mExtraDataList;
        if (list != null && !list.isEmpty()) {
            Iterator<LinkedHashMap<String, String>> it = this.mExtraDataList.iterator();
            while (it.hasNext()) {
                getNewExtraData(stringBuffer, it.next());
            }
        }
        return stringBuffer.toString();
    }

    private void getNewExtraData(StringBuffer stringBuffer, LinkedHashMap<String, String> linkedHashMap) {
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            return;
        }
        stringBuffer.append("tp=ext").append(";k=").append(linkedHashMap.get("time")).append(";");
        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
            if (!"time".equals(entry.getKey())) {
                stringBuffer.append(entry.getKey()).append("=").append(entry.getValue()).append(";");
            }
        }
        stringBuffer.append(STRING_CARRIAGE_CHARACTER);
    }

    public List<njj> localePaceList() {
        if (UnitUtil.f()) {
            return requestBritishPaceList();
        }
        return requestPaceList();
    }

    public boolean validHeartRateList() {
        ArrayList<HeartRateData> arrayList = this.heartRateList;
        return arrayList != null && arrayList.size() > 0;
    }

    public boolean validPaceMap() {
        Map<Integer, Float> map = this.paceMap;
        return map != null && map.size() > 0;
    }

    public boolean validBritishPaceMap() {
        Map<Integer, Float> map = this.britishPaceMap;
        return map != null && map.size() > 0;
    }

    public boolean validLbsDataMap() {
        Map<Long, double[]> map = this.lbsDataMap;
        return map != null && map.size() > 0;
    }

    public boolean validStepRateList() {
        ArrayList<StepRateData> arrayList = this.stepRateList;
        return arrayList != null && arrayList.size() > 0;
    }

    public Map<Integer, Float> localePaceMap() {
        if (UnitUtil.f()) {
            return this.britishPaceMap;
        }
        return this.paceMap;
    }

    public boolean validRunningPostureList() {
        ArrayList<gzv> arrayList = this.runningPostureList;
        return arrayList != null && arrayList.size() > 0;
    }
}
