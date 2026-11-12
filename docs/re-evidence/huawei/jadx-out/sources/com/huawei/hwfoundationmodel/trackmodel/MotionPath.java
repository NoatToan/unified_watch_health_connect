package com.huawei.hwfoundationmodel.trackmodel;

import com.huawei.health.device.model.RecordAction;
import com.huawei.hwsportmodel.CommonSegment;
import com.huawei.route.SlopeInfo;
import defpackage.gzr;
import defpackage.gzv;
import defpackage.lmb;
import defpackage.njb;
import defpackage.njc;
import defpackage.nje;
import defpackage.njg;
import defpackage.njh;
import defpackage.nji;
import defpackage.njj;
import defpackage.njl;
import defpackage.njm;
import defpackage.njn;
import defpackage.njo;
import defpackage.njp;
import defpackage.njq;
import defpackage.njr;
import defpackage.njs;
import defpackage.njt;
import defpackage.nju;
import defpackage.njv;
import defpackage.njy;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import health.compact.a.util.LogUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MotionPath implements Serializable {
    public static final String ACT_TAG = "tp=act";
    public static final String ALTITUDE_TAG = "tp=alt";
    public static final String ANALOG_CADENCE_TAG = "tp=acad";
    public static final String ANALOG_POWER_TAG = "tp=apw";
    public static final String BRITISH_PACE_MAP_TAG = "tp=b-p-m";
    public static final String BRITISH_PACE_V2_TAG = "tp=bpm2";
    public static final String CADENCE_TAG = "tp=cad";
    public static final String CAL_TAG = "tp=cal";
    public static final String CONTENT_DIS = "d=";
    public static final String CONTENT_KEY = ";k=";
    public static final String CONTENT_NUM = "n=";
    public static final String CONTENT_PACE = "p=";
    public static final String CONTENT_VALUE = "v=";
    public static final String COURSE_ACTION_LIST_TAG = "tp=r-c-a";
    private static final String DETAIL_NULL = "DETAIL_NULL";
    public static final String DISTANCE_TAG = "tp=dis";
    public static final String EXTEND_TAG = "tp=ext";
    public static final String FIELD_SEPARATOR = ";";
    public static final String HEART_RATE_LIST_TAG = "tp=h-r";
    public static final String HEART_RATE_RECOVERY_LIST_TAG = "tp=r-r-h";
    public static final String HRA_TAG = "tp=h_r_a";
    public static final String INTERVAL_BRITISH_PACE_MAP_TAG = "tp=pm-b";
    public static final String INTERVAL_NORMAL_PACE_MAP_TAG = "tp=pm-n";
    public static final String INVALID_HEART_RATE_LIST_TAG = "tp=i-h-r";
    public static final String JUMP_TAG = "tp=jump";
    public static final String LBS_DATA_MAP_TAG = "tp=lbs";
    public static final String MARK_POINT_TAG = "tp=mk";
    public static final String MSG_TAG = "tp=msg";
    public static final String PACE_MAP_TAG = "tp=p-m";
    public static final String PACE_V2_TAG = "tp=pm2";
    public static final String PADDLE_TAG = "tp=pad";
    public static final String PAUSE_TAG = "tp=evt";
    public static final String POWER_TAG = "tp=pow";
    public static final String PULL_FREQ_TAG = "tp=p-f";
    public static final String REAL_TIME_SPEED_TAG = "tp=rs";
    public static final String RESISTANCE_TAG = "tp=res";
    public static final String RUNNING_POSTURE_TAG = "tp=rp";
    public static final String SKIP_SPEED_TAG = "tp=scp";
    public static final String SLOPE_TAG = "tp=slop";
    public static final String SPO2_TAG = "tp=spo2";
    public static final String STEP_RATE_LIST_TAG = "tp=s-r";
    public static final String SWOLF_TAG = "tp=swf";
    private static final String TAG = "Track_MotionPath";
    public static final String WEIGHT_TAG = "tp=wei";
    private static final long serialVersionUID = -1773594779542639469L;
    private ArrayList<njm> mAltitudeList;
    private List<njc> mAnalogCadenceList;
    private List<njb> mAnalogPowerList;
    private List<njj> mBriPaceV2;
    private Map<Integer, Float> mBritishIntervalPaceMap;
    private Map<Integer, Float> mBritishPaceMap;
    private ArrayList<TrackDistanceData> mDistanceList;
    private List<njn> mExtendDetailList;
    private List<nje> mHeartRateAreaList;
    private ArrayList<HeartRateData> mHeartRateList;
    private List<HeartRateData> mHeartRecoveryRateList;
    private ArrayList<HeartRateData> mInvalidHeartRateList;
    private List<lmb> mJumpDataList;
    private Map<Long, double[]> mLbsDataMap;
    private ArrayList<MarkPoint> mMarkPointList;
    private List<njo> mMessageList;
    private Map<Integer, Float> mNormalIntervalPaceMap;
    private Map<Integer, Float> mPaceMap;
    private List<njj> mPaceV2;
    private List<nji> mPaddleFrequencyList;
    private ArrayList<TrackPauseData> mPauseList;
    private List<njh> mPowerList;
    private List<njp> mPullFreqList;
    private List<njl> mRealTimePaceList;
    private List<njr> mRealTimeSpeedList;
    private List<Integer> mResistanceList;
    private List<gzr> mRidePostureDataList;
    private ArrayList<gzv> mRunningPostureList;
    private List<CommonSegment> mSegmentDataList;
    private List<njg> mSkippingSpeedList;
    private ArrayList<SlopeInfo> mSlopeInfoList;
    private List<njt> mSpeedList;
    private List<nju> mSpo2List;
    private ArrayList<StepRateData> mStepRateList;
    private List<njq> mSwolfList;
    private List<njs> mWeightList;

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

    public List<Integer> requestResistanceList() {
        return this.mResistanceList;
    }

    public void saveResistanceList(List<Integer> list) {
        this.mResistanceList = list;
    }

    public List<nji> requestPaddleFrequencyList() {
        return this.mPaddleFrequencyList;
    }

    public List<njg> requestSkippingSpeedList() {
        return this.mSkippingSpeedList;
    }

    public void saveSkippingSpeed(List<njg> list) {
        this.mSkippingSpeedList = list;
    }

    public void savePaddleFrequencyList(List<nji> list) {
        this.mPaddleFrequencyList = list;
    }

    public List<gzr> requestRidePostureDataList() {
        return this.mRidePostureDataList;
    }

    public void saveRidePostureDataList(List<gzr> list) {
        this.mRidePostureDataList = list;
    }

    public List<njh> requestPowerList() {
        return this.mPowerList;
    }

    public void savePowerList(List<njh> list) {
        this.mPowerList = list;
    }

    public List<njb> requestAnalogPowerList() {
        return this.mAnalogPowerList;
    }

    public void saveAnalogPowerList(List<njb> list) {
        this.mAnalogPowerList = list;
    }

    public List<njc> requestAnalogCadenceList() {
        return this.mAnalogCadenceList;
    }

    public void saveAnalogCadenceList(List<njc> list) {
        this.mAnalogCadenceList = list;
    }

    public List<njs> requestWeightList() {
        return this.mWeightList;
    }

    public void saveWeightList(List<njs> list) {
        this.mWeightList = list;
    }

    public Map<Long, double[]> requestLbsDataMap() {
        return this.mLbsDataMap;
    }

    public void saveLbsDataMap(Map<Long, double[]> map) {
        this.mLbsDataMap = map;
    }

    public Map<Integer, Float> requestPaceMap() {
        return this.mPaceMap;
    }

    public List<njj> requestPaceList() {
        if (njy.b(this.mPaceV2)) {
            return this.mPaceV2;
        }
        return njv.c(this.mPaceMap);
    }

    public void savePaceMap(Map<Integer, Float> map) {
        this.mPaceMap = map;
    }

    public Map<Integer, Float> requestBritishPaceMap() {
        return this.mBritishPaceMap;
    }

    public List<njj> requestBritishPaceList() {
        if (njy.b(this.mBriPaceV2)) {
            return this.mBriPaceV2;
        }
        return njv.c(this.mBritishPaceMap);
    }

    public void saveBritishPaceMap(Map<Integer, Float> map) {
        this.mBritishPaceMap = map;
    }

    public List<njj> getPacesV2() {
        return this.mPaceV2;
    }

    public void savePaceV2(List<njj> list) {
        this.mPaceV2 = list;
    }

    public List<njj> getBriPaceV2() {
        return this.mBriPaceV2;
    }

    public void saveBriPacesV2(List<njj> list) {
        this.mBriPaceV2 = list;
    }

    public ArrayList<HeartRateData> requestHeartRateList() {
        return this.mHeartRateList;
    }

    public ArrayList<HeartRateData> requestInvalidHeartRateList() {
        return this.mInvalidHeartRateList;
    }

    public void saveHeartRateList(ArrayList<HeartRateData> arrayList) {
        this.mHeartRateList = arrayList;
    }

    public void saveInvalidHeartRateList(ArrayList<HeartRateData> arrayList) {
        this.mInvalidHeartRateList = arrayList;
    }

    public ArrayList<StepRateData> requestStepRateList() {
        return this.mStepRateList;
    }

    public void saveStepRateList(ArrayList<StepRateData> arrayList) {
        this.mStepRateList = arrayList;
    }

    public void saveNormalIntervalPaceMap(Map<Integer, Float> map) {
        this.mNormalIntervalPaceMap = map;
    }

    public Map<Integer, Float> requestBritishIntervalPaceMap() {
        return this.mBritishIntervalPaceMap;
    }

    public void saveBritishIntervalPaceMap(Map<Integer, Float> map) {
        this.mBritishIntervalPaceMap = map;
    }

    public ArrayList<gzv> requestRunningPostureList() {
        return this.mRunningPostureList;
    }

    public void saveRunningPostureList(ArrayList<gzv> arrayList) {
        this.mRunningPostureList = arrayList;
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

    public List<lmb> requestJumpDataList() {
        return this.mJumpDataList;
    }

    public void saveJumpDataList(List<lmb> list) {
        this.mJumpDataList = list;
    }

    public List<nju> requestSpo2List() {
        return this.mSpo2List;
    }

    public void saveSpo2List(List<nju> list) {
        this.mSpo2List = list;
    }

    public List<CommonSegment> requestSegmentList() {
        return this.mSegmentDataList;
    }

    public void saveSegmentList(List<CommonSegment> list) {
        this.mSegmentDataList = list;
    }

    public <E> void saveCommonSegmentList(List<? extends CommonSegment> list) {
        if (list == null) {
            return;
        }
        List<CommonSegment> list2 = this.mSegmentDataList;
        if (list2 == null) {
            this.mSegmentDataList = new ArrayList();
        } else {
            list2.clear();
        }
        this.mSegmentDataList.addAll(list);
    }

    public List<HeartRateData> requestHeartRecoveryRateList() {
        return this.mHeartRecoveryRateList;
    }

    public void saveHeartRecoveryRateList(List<HeartRateData> list) {
        this.mHeartRecoveryRateList = list;
    }

    public List<nje> getHeartRateAreaList() {
        return this.mHeartRateAreaList;
    }

    public void setHeartRateAreaList(List<nje> list) {
        this.mHeartRateAreaList = list;
    }

    public String toString() {
        ArrayList<String> arrayList = new ArrayList<>();
        StringBuffer stringBuffer = new StringBuffer();
        lbsDataToString(arrayList, stringBuffer);
        paceDataToString(arrayList, stringBuffer, this.mPaceMap, PACE_MAP_TAG);
        paceDataToString(arrayList, stringBuffer, this.mBritishPaceMap, BRITISH_PACE_MAP_TAG);
        paceDataListToString(arrayList, stringBuffer, this.mPaceV2, "tp=pm2");
        paceDataListToString(arrayList, stringBuffer, this.mBriPaceV2, "tp=bpm2");
        heartRateToString(arrayList);
        invalidHeartRateToString(arrayList);
        stepRateToString(arrayList, stringBuffer);
        altitudeListToString(arrayList);
        markPointListToString(arrayList);
        pauseListToString(arrayList);
        distanceListToString(arrayList);
        slopeInfoListToString(arrayList);
        spo2ListToString(arrayList);
        swolfListToString(arrayList);
        pullFreqListToString(arrayList);
        speedPaceListListToString(arrayList);
        runningPostureListToString(arrayList);
        jumpDataListToString(arrayList);
        powerListToString(arrayList);
        analogPowerListToString(arrayList);
        analogCadenceListToString(arrayList);
        weightListToString(arrayList);
        cadenceListToString(arrayList);
        resistanceListToString(arrayList);
        paddleListToString(arrayList);
        skippingSpeedToString(arrayList);
        segmentDataListToString(arrayList);
        heartRecoveryRateToString(arrayList);
        listToString(arrayList, this.mExtendDetailList);
        listToString(arrayList, this.mMessageList);
        listToString(arrayList, this.mHeartRateAreaList);
        if (arrayList.size() == 0) {
            return DETAIL_NULL;
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            stringBuffer2.append(it.next());
        }
        return stringBuffer2.toString();
    }

    private void listToString(ArrayList<String> arrayList, List<? extends Serializable> list) {
        if (njy.e(list)) {
            return;
        }
        for (Serializable serializable : list) {
            if (serializable != null) {
                arrayList.add(serializable.toString());
            }
        }
    }

    private void heartRecoveryRateToString(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.mHeartRecoveryRateList != null) {
            stringBuffer.setLength(0);
            for (HeartRateData heartRateData : this.mHeartRecoveryRateList) {
                stringBuffer.append(STEP_RATE_LIST_TAG).append(CONTENT_KEY).append(heartRateData.acquireTime()).append(";").append(CONTENT_VALUE).append(heartRateData.acquireHeartRate()).append(";").append(System.lineSeparator());
                arrayList.add(stringBuffer.toString());
                stringBuffer.setLength(0);
            }
        }
    }

    private void segmentDataListToString(ArrayList<String> arrayList) {
        if (njy.e(this.mSegmentDataList)) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer(120);
        for (CommonSegment commonSegment : this.mSegmentDataList) {
            if (commonSegment != null) {
                commonSegment.toTrackString(stringBuffer);
                arrayList.add(stringBuffer.toString());
                stringBuffer.setLength(0);
            }
        }
    }

    private void stepRateToString(ArrayList<String> arrayList, StringBuffer stringBuffer) {
        if (this.mStepRateList != null) {
            stringBuffer.setLength(0);
            for (StepRateData stepRateData : this.mStepRateList) {
                stringBuffer.append(STEP_RATE_LIST_TAG).append(CONTENT_KEY).append(stepRateData.acquireTime()).append(";").append(CONTENT_VALUE).append(stepRateData.acquireStepRate()).append(";").append(System.lineSeparator());
                arrayList.add(stringBuffer.toString());
                stringBuffer.setLength(0);
            }
        }
    }

    private void paceDataToString(ArrayList<String> arrayList, StringBuffer stringBuffer, Map<Integer, Float> map, String str) {
        if (map != null) {
            for (Map.Entry<Integer, Float> entry : map.entrySet()) {
                stringBuffer.append(str).append(CONTENT_KEY).append(entry.getKey()).append(";").append(CONTENT_VALUE).append(entry.getValue()).append(";").append(System.lineSeparator());
                arrayList.add(stringBuffer.toString());
                stringBuffer.setLength(0);
            }
        }
    }

    private void paceDataListToString(ArrayList<String> arrayList, StringBuffer stringBuffer, List<njj> list, String str) {
        if (njy.b(list)) {
            LogUtil.a(TAG, "paceDataList size ", Integer.valueOf(list.size()));
            for (njj njjVar : list) {
                if (njjVar != null) {
                    stringBuffer.append(str).append(";").append("d=").append(njjVar.c()).append(";").append("n=").append(njjVar.e()).append(";").append("p=").append(njjVar.d()).append(";").append(System.lineSeparator());
                    arrayList.add(stringBuffer.toString());
                    stringBuffer.setLength(0);
                }
            }
        }
    }

    private void lbsDataToString(ArrayList<String> arrayList, StringBuffer stringBuffer) {
        Map<Long, double[]> map = this.mLbsDataMap;
        if (map != null) {
            for (Map.Entry<Long, double[]> entry : map.entrySet()) {
                try {
                    stringBuffer.append(LBS_DATA_MAP_TAG).append(CONTENT_KEY).append(entry.getKey()).append(";").append("lat=").append(entry.getValue()[0]).append(";").append("lon=").append(entry.getValue()[1]).append(";").append("alt=").append(entry.getValue()[2]).append(";").append(RecordAction.ACT_COST_TIME_TAG).append(entry.getValue()[3]).append(";").append(System.lineSeparator());
                    arrayList.add(stringBuffer.toString());
                    stringBuffer.setLength(0);
                } catch (IndexOutOfBoundsException unused) {
                    LogUtil.a(TAG, "IndexOutOfBoundsException toString has error");
                } catch (NumberFormatException unused2) {
                    LogUtil.a(TAG, "NumberFormatException toString has error");
                }
            }
        }
    }

    private void heartRateToString(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList<HeartRateData> arrayList2 = this.mHeartRateList;
        if (arrayList2 == null) {
            LogUtil.d(TAG, "heartRateToString() mHeartRateList is null");
            return;
        }
        for (HeartRateData heartRateData : arrayList2) {
            if (heartRateData == null) {
                LogUtil.d(TAG, "heartRateToString() heartRateData is null");
            } else {
                stringBuffer.append(HEART_RATE_LIST_TAG).append(CONTENT_KEY).append(heartRateData.acquireTime()).append(";").append(CONTENT_VALUE).append(heartRateData.acquireHeartRate()).append(";").append(System.lineSeparator());
                arrayList.add(stringBuffer.toString());
                stringBuffer.setLength(0);
            }
        }
    }

    private void invalidHeartRateToString(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList<HeartRateData> arrayList2 = this.mInvalidHeartRateList;
        if (arrayList2 == null) {
            LogUtil.d(TAG, "invalidHeartRateToString() mInvalidHeartRateList is null");
            return;
        }
        for (HeartRateData heartRateData : arrayList2) {
            if (heartRateData == null) {
                LogUtil.d(TAG, "invalidHeartRateToString() invalidHeartRateData is null");
            } else {
                stringBuffer.append(INVALID_HEART_RATE_LIST_TAG).append(CONTENT_KEY).append(heartRateData.acquireTime()).append(";").append(CONTENT_VALUE).append(heartRateData.acquireHeartRate()).append(";").append(System.lineSeparator());
                arrayList.add(stringBuffer.toString());
                stringBuffer.setLength(0);
            }
        }
    }

    private void altitudeListToString(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList<njm> arrayList2 = this.mAltitudeList;
        if (arrayList2 == null) {
            ReleaseLogUtil.b(TAG, "mAltitudeList is null");
            return;
        }
        for (njm njmVar : arrayList2) {
            if (njmVar == null) {
                ReleaseLogUtil.b(TAG, "altitudeData is null");
            } else {
                stringBuffer.append(ALTITUDE_TAG).append(CONTENT_KEY).append(njmVar.acquireTime()).append(";").append(CONTENT_VALUE).append(njmVar.a()).append(";").append(System.lineSeparator());
                arrayList.add(stringBuffer.toString());
                stringBuffer.setLength(0);
            }
        }
    }

    private void pauseListToString(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList<TrackPauseData> arrayList2 = this.mPauseList;
        if (arrayList2 == null) {
            ReleaseLogUtil.b(TAG, "mPauseList is null");
            return;
        }
        for (TrackPauseData trackPauseData : arrayList2) {
            if (trackPauseData == null) {
                ReleaseLogUtil.b(TAG, "pauseData is null");
            } else {
                stringBuffer.append(PAUSE_TAG).append(";").append("st=").append(trackPauseData.acquireTime()).append(";").append("e=").append(trackPauseData.getTimer()).append(";").append("ty=").append(trackPauseData.getType()).append(";").append(System.lineSeparator());
                arrayList.add(stringBuffer.toString());
                stringBuffer.setLength(0);
            }
        }
    }

    private void distanceListToString(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList<TrackDistanceData> arrayList2 = this.mDistanceList;
        if (arrayList2 == null) {
            ReleaseLogUtil.b(TAG, "mDistanceList is null");
            return;
        }
        for (TrackDistanceData trackDistanceData : arrayList2) {
            if (trackDistanceData == null) {
                ReleaseLogUtil.b(TAG, "distanceData is null");
            } else {
                stringBuffer.append(DISTANCE_TAG).append(CONTENT_KEY).append(trackDistanceData.getTime()).append(";").append(CONTENT_VALUE).append(trackDistanceData.getDistance()).append(";").append(System.lineSeparator());
                arrayList.add(stringBuffer.toString());
                stringBuffer.setLength(0);
            }
        }
    }

    private void slopeInfoListToString(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList<SlopeInfo> arrayList2 = this.mSlopeInfoList;
        if (arrayList2 == null) {
            ReleaseLogUtil.b(TAG, "mSlopeInfoList is null");
            return;
        }
        for (SlopeInfo slopeInfo : arrayList2) {
            if (slopeInfo == null) {
                ReleaseLogUtil.b(TAG, "slopeInfo is null");
            } else {
                stringBuffer.append(SLOPE_TAG).append(";").append("no=").append(slopeInfo.getNumber()).append(";").append("lv=").append(slopeInfo.getLevel()).append(";").append("dist=").append(slopeInfo.getDistance()).append(";").append("asc=").append(slopeInfo.getAscent()).append(";").append("gd=").append(slopeInfo.getGradient()).append(";").append("ct=").append(slopeInfo.getClimbTime()).append(";").append("sd=").append(slopeInfo.getStartDistance()).append(";").append("sti=").append(slopeInfo.getStartTrackIndex()).append(";").append("eti=").append(slopeInfo.getEndTrackIndex()).append(";").append("sai=").append(slopeInfo.getStartAltIndex()).append(";").append("eai=").append(slopeInfo.getEndAltIndex()).append(";").append(System.lineSeparator());
                arrayList.add(stringBuffer.toString());
                stringBuffer.setLength(0);
            }
        }
    }

    private void markPointListToString(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        ArrayList<MarkPoint> arrayList2 = this.mMarkPointList;
        if (arrayList2 == null) {
            ReleaseLogUtil.b(TAG, "mMarkPointList is null");
            return;
        }
        for (MarkPoint markPoint : arrayList2) {
            if (markPoint == null) {
                ReleaseLogUtil.b(TAG, "markPoint is null");
            } else {
                sb.append(MARK_POINT_TAG);
                sb.append("no");
                sb.append(markPoint.d());
                sb.append(";");
                sb.append(RecordAction.ACT_TARGET_TYPE_TAG);
                sb.append(markPoint.f());
                sb.append(";");
                sb.append("c=");
                sb.append(markPoint.a());
                sb.append(";");
                sb.append(RecordAction.ACT_COST_TIME_TAG);
                sb.append(markPoint.acquireTime());
                sb.append(";");
                sb.append("lng=");
                sb.append(markPoint.b());
                sb.append(";");
                sb.append("lat=");
                sb.append(markPoint.e());
                sb.append(";");
                sb.append("m=");
                sb.append(markPoint.c());
                sb.append(";");
                sb.append(System.lineSeparator());
                arrayList.add(sb.toString());
                sb.setLength(0);
            }
        }
    }

    private void spo2ListToString(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        List<nju> list = this.mSpo2List;
        if (list == null) {
            return;
        }
        for (nju njuVar : list) {
            stringBuffer.append(SPO2_TAG).append(CONTENT_KEY).append(njuVar.acquireTime()).append(";").append(CONTENT_VALUE).append(njuVar.b()).append(";").append(System.lineSeparator());
            arrayList.add(stringBuffer.toString());
            stringBuffer.setLength(0);
        }
    }

    private void jumpDataListToString(ArrayList<String> arrayList) {
        if (this.mJumpDataList == null) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (lmb lmbVar : this.mJumpDataList) {
            stringBuffer.append(JUMP_TAG).append(CONTENT_KEY).append(lmbVar.b()).append(";").append("h=").append(lmbVar.a()).append(";").append(RecordAction.ACT_COST_TIME_TAG).append(lmbVar.d()).append(";").append(System.lineSeparator());
            arrayList.add(stringBuffer.toString());
            stringBuffer.setLength(0);
        }
    }

    private void runningPostureListToString(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList<gzv> arrayList2 = this.mRunningPostureList;
        if (arrayList2 != null) {
            for (gzv gzvVar : arrayList2) {
                if (gzvVar == null) {
                    ReleaseLogUtil.b(TAG, "runningPosture is null");
                } else {
                    buildPostureStr(gzvVar, stringBuffer);
                    arrayList.add(stringBuffer.toString());
                    stringBuffer.setLength(0);
                }
            }
        }
    }

    private void buildPostureStr(gzv gzvVar, StringBuffer stringBuffer) {
        stringBuffer.append(RUNNING_POSTURE_TAG).append(CONTENT_KEY).append(gzvVar.h()).append(";").append("gct=").append(gzvVar.a()).append(";").append("gia=").append(gzvVar.d()).append(";").append("sa=").append(gzvVar.j()).append(";").append("ee=").append(gzvVar.b()).append(";").append("fsp=").append(gzvVar.e()).append(";").append("wsp=").append(gzvVar.i()).append(";").append("hsp=").append(gzvVar.c()).append(";").append("aht=").append(gzvVar.l()).append(";").append("htr=").append(gzvVar.k()).append(";").append("ap=").append(gzvVar.o()).append(";").append("vo=").append(gzvVar.t()).append(";").append("gtb=").append(gzvVar.n()).append(";").append("vr=").append(gzvVar.q()).append(";").append(System.lineSeparator());
    }

    private void powerListToString(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        List<njh> list = this.mPowerList;
        if (list == null) {
            return;
        }
        for (njh njhVar : list) {
            stringBuffer.append(POWER_TAG).append(CONTENT_KEY).append(njhVar.acquireTime()).append(";").append(CONTENT_VALUE).append(njhVar.e()).append(";").append(System.lineSeparator());
            arrayList.add(stringBuffer.toString());
            stringBuffer.setLength(0);
        }
    }

    private void analogPowerListToString(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        List<njb> list = this.mAnalogPowerList;
        if (list == null) {
            return;
        }
        for (njb njbVar : list) {
            if (njbVar != null) {
                sb.append(ANALOG_POWER_TAG);
                sb.append(CONTENT_KEY);
                sb.append(njbVar.acquireTime());
                sb.append(";");
                sb.append(CONTENT_VALUE);
                sb.append(njbVar.a());
                sb.append(";");
                sb.append(System.lineSeparator());
                arrayList.add(sb.toString());
                sb.setLength(0);
            }
        }
    }

    private void analogCadenceListToString(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        List<njc> list = this.mAnalogCadenceList;
        if (list == null) {
            return;
        }
        for (njc njcVar : list) {
            if (njcVar != null) {
                sb.append(ANALOG_CADENCE_TAG);
                sb.append(CONTENT_KEY);
                sb.append(njcVar.acquireTime());
                sb.append(";");
                sb.append(CONTENT_VALUE);
                sb.append(njcVar.a());
                sb.append(";");
                sb.append(System.lineSeparator());
                arrayList.add(sb.toString());
                sb.setLength(0);
            }
        }
    }

    private void weightListToString(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        List<njs> list = this.mWeightList;
        if (list == null) {
            return;
        }
        for (njs njsVar : list) {
            sb.append(WEIGHT_TAG);
            sb.append(CONTENT_KEY);
            sb.append(njsVar.acquireTime());
            sb.append(";");
            sb.append(CONTENT_VALUE);
            sb.append(njsVar.e());
            sb.append(";");
            sb.append(System.lineSeparator());
            arrayList.add(sb.toString());
            sb.setLength(0);
        }
    }

    private void cadenceListToString(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        List<gzr> list = this.mRidePostureDataList;
        if (list == null) {
            return;
        }
        for (gzr gzrVar : list) {
            stringBuffer.append(CADENCE_TAG).append(CONTENT_KEY).append(gzrVar.acquireTime()).append(";").append(CONTENT_VALUE).append(gzrVar.c()).append(";").append(System.lineSeparator());
            arrayList.add(stringBuffer.toString());
            stringBuffer.setLength(0);
        }
    }

    private void resistanceListToString(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        List<Integer> list = this.mResistanceList;
        if (list == null) {
            return;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(RESISTANCE_TAG).append(CONTENT_KEY).append(it.next()).append(";").append(System.lineSeparator());
            arrayList.add(stringBuffer.toString());
            stringBuffer.setLength(0);
        }
    }

    private void paddleListToString(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        List<nji> list = this.mPaddleFrequencyList;
        if (list == null) {
            return;
        }
        for (nji njiVar : list) {
            stringBuffer.append(PADDLE_TAG).append(CONTENT_KEY).append(njiVar.acquireTime()).append(";").append(CONTENT_VALUE).append(njiVar.c()).append(";").append(System.lineSeparator());
            arrayList.add(stringBuffer.toString());
            stringBuffer.setLength(0);
        }
    }

    private void skippingSpeedToString(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        List<njg> list = this.mSkippingSpeedList;
        if (list == null) {
            return;
        }
        for (njg njgVar : list) {
            stringBuffer.append(SKIP_SPEED_TAG).append(CONTENT_KEY).append(njgVar.acquireTime()).append(";").append(CONTENT_VALUE).append(njgVar.c()).append(";").append(System.lineSeparator());
            arrayList.add(stringBuffer.toString());
            stringBuffer.setLength(0);
        }
    }

    public boolean isValidHeartRateList() {
        ArrayList<HeartRateData> arrayList = this.mHeartRateList;
        return arrayList != null && arrayList.size() > 0;
    }

    public boolean isValidInvalidHeartRateList() {
        ArrayList<HeartRateData> arrayList = this.mInvalidHeartRateList;
        return arrayList != null && arrayList.size() > 0;
    }

    public boolean isValidPaceMap() {
        Map<Integer, Float> map = this.mPaceMap;
        return map != null && map.size() > 0;
    }

    public boolean isValidCadenceData() {
        if (this.mRidePostureDataList == null) {
            return false;
        }
        int iC = 0;
        for (int i = 0; i < this.mRidePostureDataList.size(); i++) {
            if (this.mRidePostureDataList.get(i) != null) {
                iC += this.mRidePostureDataList.get(i).c();
            }
        }
        return iC != 0 && this.mRidePostureDataList.size() > 0;
    }

    public boolean isValidPaddleData() {
        List<nji> list = this.mPaddleFrequencyList;
        return list != null && list.size() > 0;
    }

    public boolean isValidPowerData() {
        if (!njy.b(this.mPowerList)) {
            return false;
        }
        int iE = 0;
        for (int i = 0; i < this.mPowerList.size(); i++) {
            if (this.mPowerList.get(i) != null) {
                iE += this.mPowerList.get(i).e();
            }
        }
        if (iE == 0) {
            return false;
        }
        return njy.b(this.mPowerList);
    }

    public boolean isValidAnalogPowerData() {
        if (njy.e(this.mAnalogPowerList)) {
            return false;
        }
        int iA = 0;
        for (njb njbVar : this.mAnalogPowerList) {
            if (njbVar != null) {
                iA += njbVar.a();
            }
        }
        return iA > 0;
    }

    public boolean isValidAnalogCadenceData() {
        if (njy.e(this.mAnalogCadenceList)) {
            return false;
        }
        int iA = 0;
        for (njc njcVar : this.mAnalogCadenceList) {
            if (njcVar != null) {
                iA += njcVar.a();
            }
        }
        return iA > 0;
    }

    public boolean isValidWeightData() {
        if (!njy.b(this.mWeightList)) {
            return false;
        }
        int iE = 0;
        for (int i = 0; i < this.mWeightList.size(); i++) {
            if (this.mWeightList.get(i) != null) {
                iE += this.mWeightList.get(i).e();
            }
        }
        if (iE == 0) {
            return false;
        }
        return njy.b(this.mWeightList);
    }

    public boolean isValidSkippingData() {
        return njy.b(this.mSkippingSpeedList);
    }

    public boolean isValidLbsDataMap() {
        Map<Long, double[]> map = this.mLbsDataMap;
        return map != null && map.size() > 0;
    }

    public boolean isValidStepRateList() {
        if (this.mStepRateList == null) {
            LogUtil.a(TAG, "MotionPath,isValidStepRateList");
            return false;
        }
        int iAcquireStepRate = 0;
        for (int i = 0; i < this.mStepRateList.size(); i++) {
            if (this.mStepRateList.get(i) != null) {
                iAcquireStepRate += this.mStepRateList.get(i).acquireStepRate();
            }
        }
        return iAcquireStepRate != 0 && this.mStepRateList.size() > 0;
    }

    public boolean isValidRunningPostureList() {
        ArrayList<gzv> arrayList = this.mRunningPostureList;
        return arrayList != null && arrayList.size() > 0;
    }

    public Map<Integer, Float> localePaceMap() {
        if (UnitUtil.f()) {
            return this.mBritishPaceMap;
        }
        return this.mPaceMap;
    }

    public List<njj> localePaceList() {
        if (UnitUtil.f()) {
            return requestBritishPaceList();
        }
        return requestPaceList();
    }

    public boolean isValidAltitudeList() {
        ArrayList<njm> arrayList = this.mAltitudeList;
        return arrayList != null && arrayList.size() > 0;
    }

    public boolean isValidPauseList() {
        return njy.b(this.mPauseList);
    }

    public boolean isValidDistanceList() {
        return njy.b(this.mDistanceList);
    }

    public boolean isValidSlopeInfoList() {
        return njy.b(this.mSlopeInfoList);
    }

    public boolean isValidSpo2List() {
        return njy.b(this.mSpo2List);
    }

    public List<njq> requestSwolfList() {
        return this.mSwolfList;
    }

    public void saveSwolfList(List<njq> list) {
        this.mSwolfList = list;
    }

    public List<njp> requestPullFreqList() {
        return this.mPullFreqList;
    }

    public void savePullFreqList(List<njp> list) {
        this.mPullFreqList = list;
    }

    public List<njl> requestRealTimePaceList() {
        return this.mRealTimePaceList;
    }

    public List<njr> requestRealTimeSpeedList() {
        return this.mRealTimeSpeedList;
    }

    public List<njt> requestSpeedList() {
        return this.mSpeedList;
    }

    public void saveSpeedList(List<njt> list) {
        this.mSpeedList = list;
        if (isValidSpeedList()) {
            int size = this.mSpeedList.size();
            ArrayList arrayList = new ArrayList(size);
            ArrayList arrayList2 = new ArrayList(size);
            for (njt njtVar : this.mSpeedList) {
                if (njtVar != null) {
                    arrayList.add(njtVar.a());
                    arrayList2.add(njtVar.d());
                }
            }
            this.mRealTimePaceList = new CopyOnWriteArrayList(arrayList);
            this.mRealTimeSpeedList = new CopyOnWriteArrayList(arrayList2);
        }
    }

    private void swolfListToString(List<String> list) {
        StringBuffer stringBuffer = new StringBuffer();
        List<njq> list2 = this.mSwolfList;
        if (list2 != null) {
            for (njq njqVar : list2) {
                stringBuffer.append(SWOLF_TAG).append(CONTENT_KEY).append(njqVar.acquireTime()).append(";").append(CONTENT_VALUE).append(njqVar.c()).append(";").append(System.lineSeparator());
                list.add(stringBuffer.toString());
                stringBuffer.setLength(0);
            }
        }
    }

    private void pullFreqListToString(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        List<njp> list = this.mPullFreqList;
        if (list != null) {
            for (njp njpVar : list) {
                stringBuffer.append(PULL_FREQ_TAG).append(CONTENT_KEY).append(njpVar.acquireTime()).append(";").append(CONTENT_VALUE).append(njpVar.e()).append(";").append(System.lineSeparator());
                arrayList.add(stringBuffer.toString());
                stringBuffer.setLength(0);
            }
        }
    }

    private void speedPaceListListToString(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        List<njt> list = this.mSpeedList;
        if (list == null) {
            LogUtil.c(TAG, "speedPaceListListToString mSpeedList == null");
            return;
        }
        for (njt njtVar : list) {
            if (njtVar == null) {
                LogUtil.c(TAG, "speedPaceListListToString speed data is null");
            } else {
                stringBuffer.append(REAL_TIME_SPEED_TAG).append(CONTENT_KEY).append(njtVar.acquireTime()).append(";").append(CONTENT_VALUE).append(njtVar.b()).append(";").append(System.lineSeparator());
                arrayList.add(stringBuffer.toString());
                stringBuffer.setLength(0);
            }
        }
    }

    public boolean isValidSwolfList() {
        boolean z = false;
        if (njy.e(this.mSwolfList)) {
            return false;
        }
        for (njq njqVar : this.mSwolfList) {
            if (njqVar != null && njqVar.c() > 0) {
                LogUtil.a(TAG, "mSwolfList size = ", Integer.valueOf(this.mSwolfList.size()), " isAll zero or minus", Boolean.valueOf(z));
                return !z;
            }
        }
        z = true;
        LogUtil.a(TAG, "mSwolfList size = ", Integer.valueOf(this.mSwolfList.size()), " isAll zero or minus", Boolean.valueOf(z));
        return !z;
    }

    public boolean isValidPullFreqList() {
        boolean z = false;
        if (njy.e(this.mPullFreqList)) {
            return false;
        }
        for (njp njpVar : this.mPullFreqList) {
            if (njpVar != null && njpVar.e() > 0) {
                LogUtil.a(TAG, "mPullFreqList size = ", Integer.valueOf(this.mPullFreqList.size()), " isAll zero or minus", Boolean.valueOf(z));
                return !z;
            }
        }
        z = true;
        LogUtil.a(TAG, "mPullFreqList size = ", Integer.valueOf(this.mPullFreqList.size()), " isAll zero or minus", Boolean.valueOf(z));
        return !z;
    }

    public boolean isValidRealtimePaceList() {
        List<njl> list = this.mRealTimePaceList;
        return list != null && list.size() > 0;
    }

    public boolean isValidSpeedList() {
        boolean z = false;
        if (njy.e(this.mSpeedList)) {
            return false;
        }
        for (njt njtVar : this.mSpeedList) {
            if (njtVar != null && njtVar.b() > 0.0f) {
                LogUtil.a(TAG, "speedList size = ", Integer.valueOf(this.mSpeedList.size()), " isAll zero ", Boolean.valueOf(z));
                return !z;
            }
        }
        z = true;
        LogUtil.a(TAG, "speedList size = ", Integer.valueOf(this.mSpeedList.size()), " isAll zero ", Boolean.valueOf(z));
        return !z;
    }
}
