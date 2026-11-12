package com.huawei.hihealthservice.sync.dataswitch;

import android.content.Context;
import com.amap.api.location.AMapLocation;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.util.HiInChinaUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwcloudmodel.healthdatacloud.model.SampleSequence;
import com.huawei.hwcloudmodel.model.samplepoint.SamplePoint;
import com.huawei.hwcloudmodel.model.unite.Location;
import com.huawei.hwcloudmodel.model.unite.MotionPathDetail;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import defpackage.kyk;
import defpackage.kym;
import defpackage.lgq;
import defpackage.lif;
import defpackage.liq;
import defpackage.lke;
import defpackage.njy;
import health.compact.a.HiCommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class MotionPathDataSwitch {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kyk f12599b;
    private Context e;

    public MotionPathDataSwitch(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.e = applicationContext;
        this.f12599b = kyk.e(applicationContext);
    }

    public List<HiHealthData> c(List<MotionPathDetail> list, int i, int i2) throws lif {
        HiHealthData hiHealthDataD;
        if (njy.e(list)) {
            LogUtil.j("HiH_MotionPathDataSwitch", "cloudTrackToLocal motionPathDetails is null or empty");
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (MotionPathDetail motionPathDetail : list) {
            if (motionPathDetail != null && (hiHealthDataD = d(motionPathDetail, i, i2)) != null) {
                try {
                    HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(hiHealthDataD.getMetaData(), HiTrackMetaData.class);
                    if (200 == hiTrackMetaData.getTrackType() && AMapLocation.COORD_TYPE_WGS84.equals(hiTrackMetaData.getCoordinate())) {
                        try {
                            if (b(hiHealthDataD)) {
                                LogUtil.d("HiH_MotionPathDataSwitch", "need transfer point");
                                hiTrackMetaData.setCoordinate(AMapLocation.COORD_TYPE_GCJ02);
                            }
                        } catch (Exception unused) {
                            ReleaseLogUtil.a("HiH_MotionPathDataSwitch", "transferGPSLocation Exception");
                        }
                    }
                    arrayList.add(hiHealthDataD);
                } catch (Exception e) {
                    ReleaseLogUtil.e("HiH_MotionPathDataSwitch", e.getClass().getSimpleName(), ", Exception track is (", motionPathDetail.getStartTime(), ", ", motionPathDetail.getRecordId(), Constants.RIGHT_BRACKET_ONLY);
                    LogUtil.d("HiH_MotionPathDataSwitch", "Exception track info (", motionPathDetail.getStartTime(), ", ", motionPathDetail.getEndTime(), ", ", motionPathDetail.getSportType(), ", ", motionPathDetail.getRunState(), ", ", motionPathDetail.getTotalDistance(), Constants.RIGHT_BRACKET_ONLY);
                }
            }
        }
        return arrayList;
    }

    private boolean b(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            return false;
        }
        String sequenceData = hiHealthData.getSequenceData();
        if (sequenceData == null || sequenceData.isEmpty()) {
            return false;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer(16);
            boolean z = false;
            for (String string : sequenceData.split("\n")) {
                String[] strArrSplit = string.split(";");
                int length = strArrSplit.length;
                if (string.contains(MotionPath.LBS_DATA_MAP_TAG)) {
                    double[] dArr = new double[length - 2];
                    long j = Long.parseLong(strArrSplit[1].split("=")[1]);
                    for (int i = 2; i < length; i++) {
                        dArr[i - 2] = Double.parseDouble(strArrSplit[i].split("=")[1]);
                    }
                    if (!z) {
                        int iD = HiInChinaUtil.d(dArr[0], dArr[1]);
                        if (3 != iD && 1 != iD) {
                            return false;
                        }
                        z = true;
                    }
                    string = b(liq.c(this.e, dArr), j).toString();
                }
                stringBuffer.append(string).append(System.lineSeparator());
            }
            hiHealthData.setSequenceData(stringBuffer.toString());
            return true;
        } catch (NumberFormatException unused) {
            ReleaseLogUtil.a("HiH_MotionPathDataSwitch", "transferGpsLocation NumberFormatException");
            return false;
        }
    }

    private StringBuffer b(double[] dArr, long j) {
        StringBuffer stringBuffer = new StringBuffer(48);
        stringBuffer.append("tp=lbs;k=").append(j).append(";lat=").append(dArr[0]).append(";lon=").append(dArr[1]).append(";alt=").append(dArr[2]).append(";t=").append(dArr[3]).append(";");
        return stringBuffer;
    }

    private HiHealthData d(MotionPathDetail motionPathDetail, int i, int i2) throws lif {
        try {
            if (i2 == 2) {
                return c(motionPathDetail, i);
            }
            if (i2 != 3) {
                LogUtil.j("HiH_MotionPathDataSwitch", "oneCloudTrackToLocal no such hiSyncModel");
                return null;
            }
            return e(motionPathDetail, i);
        } catch (lif e) {
            throw e;
        } catch (Exception unused) {
            ReleaseLogUtil.a("HiH_MotionPathDataSwitch", "oneCloudTrackToLocal Exception track is ", motionPathDetail);
            return null;
        }
    }

    public List<MotionPathDetail> d(List<HiHealthData> list, int i) {
        if (i == 2) {
            return lgq.c(this.e).e(list);
        }
        if (i == 3) {
            return lgq.c(this.e).a(list);
        }
        LogUtil.j("HiH_MotionPathDataSwitch", "localTrackToCloud no such hiSyncModel");
        return null;
    }

    public HiHealthData c(MotionPathDetail motionPathDetail, int i) throws lif {
        HashMap map;
        if (motionPathDetail == null) {
            return null;
        }
        kym kymVarB = this.f12599b.b(liq.e(this.e), i, motionPathDetail.getDeviceCode().longValue());
        if (kymVarB == null) {
            ReleaseLogUtil.a("HiH_MotionPathDataSwitch", "oneCloudTrackToLocalByUnite hiHealthContext is null");
            return null;
        }
        HiHealthData hiHealthDataC = lgq.c(this.e).c(kymVarB, motionPathDetail);
        String attribute = motionPathDetail.getAttribute();
        if (attribute == null || attribute.isEmpty() || attribute.equals("(null)")) {
            HiTrackMetaData hiTrackMetaData = new HiTrackMetaData();
            OldToNewMotionPath oldToNewMotionPathC = lgq.c(this.e).c(hiTrackMetaData, motionPathDetail);
            hiHealthDataC.setMetaData(HiJsonUtil.e(hiTrackMetaData, HiTrackMetaData.class));
            List<Location> location = motionPathDetail.getLocation();
            if (location != null && !location.isEmpty()) {
                map = new HashMap(location.size());
                for (Location location2 : location) {
                    map.put(location2.getTimestamp(), new double[]{location2.getLatitude(), location2.getLongitude(), location2.getAltitude(), 0.0d});
                }
            } else {
                map = new HashMap(1);
            }
            oldToNewMotionPathC.setLbsDataMap(map);
            oldToNewMotionPathC.setHeartRateList(motionPathDetail.getHeartRateList());
            hiHealthDataC.setSequenceData(oldToNewMotionPathC.toString());
            return hiHealthDataC;
        }
        int iIndexOf = attribute.indexOf(com.huawei.openalliance.ad.constant.Constants.PARAM_SERVER_SPLIT);
        int iIndexOf2 = attribute.indexOf("@is");
        int iIndexOf3 = attribute.indexOf("@is", iIndexOf);
        if (iIndexOf == -1 || iIndexOf2 == -1 || iIndexOf3 == -1) {
            ReleaseLogUtil.a("HiH_MotionPathDataSwitch", "oneCloudTrackToLocalByUnite sequenceData or metaData is null , cloudTrack is ", motionPathDetail.getRecordId());
            return null;
        }
        String strSubstring = attribute.substring(iIndexOf2 + 3, iIndexOf);
        String strSubstring2 = attribute.substring(iIndexOf3 + 3);
        hiHealthDataC.setSequenceData(strSubstring);
        hiHealthDataC.setMetaData(c(motionPathDetail, strSubstring2));
        return hiHealthDataC;
    }

    private String c(MotionPathDetail motionPathDetail, String str) {
        HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(str, HiTrackMetaData.class);
        int i = 0;
        if (hiTrackMetaData.getTotalSteps() == 0) {
            Integer totalSteps = motionPathDetail.getTotalSteps();
            hiTrackMetaData.setTotalSteps(totalSteps == null ? 0 : totalSteps.intValue());
        }
        if (hiTrackMetaData.getTotalCalories() == 0) {
            Integer totalCalories = motionPathDetail.getTotalCalories();
            hiTrackMetaData.setTotalCalories(totalCalories == null ? 0 : totalCalories.intValue());
        }
        if (hiTrackMetaData.getTotalDistance() == 0) {
            Integer totalDistance = motionPathDetail.getTotalDistance();
            hiTrackMetaData.setTotalDistance(totalDistance == null ? 0 : totalDistance.intValue());
        }
        if (hiTrackMetaData.getTotalTime() == 0) {
            Long totalTime = motionPathDetail.getTotalTime();
            hiTrackMetaData.setTotalTime(totalTime != null ? totalTime.longValue() : 0L);
        }
        if (hiTrackMetaData.getSportType() == 0) {
            Integer sportType = motionPathDetail.getSportType();
            hiTrackMetaData.setSportType(sportType == null ? 0 : lke.b(sportType.intValue()));
        }
        if (hiTrackMetaData.getVendor() == null) {
            hiTrackMetaData.setVendor(motionPathDetail.getVendor());
        }
        if (hiTrackMetaData.getCoordinate() == null) {
            hiTrackMetaData.setCoordinate(motionPathDetail.getCoordinate());
        }
        if (hiTrackMetaData.getSportDataSource() == 0) {
            Integer sportDataSource = motionPathDetail.getSportDataSource();
            hiTrackMetaData.setSportDataSource(sportDataSource == null ? 0 : sportDataSource.intValue());
        }
        if (hiTrackMetaData.getAbnormalTrack() == 0) {
            Integer abnormalTrack = motionPathDetail.getAbnormalTrack();
            hiTrackMetaData.setAbnormalTrack(abnormalTrack == null ? 0 : abnormalTrack.intValue());
        }
        if (hiTrackMetaData.getDuplicated() == 0) {
            int duplicateTrack = motionPathDetail.getDuplicateTrack();
            Integer numValueOf = Integer.valueOf(duplicateTrack);
            if (numValueOf != null) {
                numValueOf.getClass();
                i = duplicateTrack;
            }
            hiTrackMetaData.setDuplicated(i);
        }
        return HiJsonUtil.d(hiTrackMetaData);
    }

    public HiHealthData e(MotionPathDetail motionPathDetail, int i) throws lif {
        List<SamplePoint> samplePoints;
        kym kymVarB = this.f12599b.b(liq.e(this.e), i, motionPathDetail.getDeviceCode().longValue());
        if (kymVarB != null && (samplePoints = motionPathDetail.getSamplePoints()) != null && samplePoints.size() == 2) {
            String value = null;
            String value2 = null;
            for (int i2 = 0; i2 < 2; i2++) {
                String key = samplePoints.get(i2).getKey();
                if (key == null) {
                    return null;
                }
                if (key.equals("TRACK_METADATA")) {
                    value = samplePoints.get(i2).getValue();
                } else if (key.equals("TRACK_SEQUENCE_DATA")) {
                    value2 = samplePoints.get(i2).getValue();
                } else {
                    LogUtil.d("HiH_MotionPathDataSwitch", "oneCloudTrackToLocalBySamplePoint else");
                }
            }
            if (value != null && value2 != null) {
                return lgq.c(this.e).a(kymVarB, motionPathDetail, value, value2);
            }
        }
        return null;
    }

    public List<HiHealthData> e(List<SampleSequence> list, int i, boolean z) throws lif {
        if (HiCommonUtil.b(list)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<SampleSequence> it = list.iterator();
        while (it.hasNext()) {
            HiHealthData hiHealthDataD = d(it.next(), i, z);
            if (hiHealthDataD == null) {
                ReleaseLogUtil.a("HiH_MotionPathDataSwitch", "hiHealthData is null");
            } else {
                arrayList.add(hiHealthDataD);
            }
        }
        return arrayList;
    }

    private HiHealthData d(SampleSequence sampleSequence, int i, boolean z) throws lif {
        if (sampleSequence == null) {
            return null;
        }
        String detailData = sampleSequence.getDetailData();
        if (HiCommonUtil.a(detailData)) {
            ReleaseLogUtil.a("HiH_MotionPathDataSwitch", "oneCloudForDictionarySequenceData sequenceData is null");
            return null;
        }
        kym kymVarB = this.f12599b.b(liq.e(this.e), i, sampleSequence.getDeviceCode());
        if (kymVarB == null) {
            return null;
        }
        HiHealthData hiHealthData = new HiHealthData();
        kymVarB.h(1);
        kym.e(hiHealthData, kymVarB);
        if (liq.h()) {
            hiHealthData.setMergedStatus(999);
        } else {
            hiHealthData.setMergedStatus(sampleSequence.getMergedFlag() != null ? sampleSequence.getMergedFlag().intValue() : 999);
        }
        hiHealthData.setTimeZone(sampleSequence.getTimeZone());
        hiHealthData.setStartTime(sampleSequence.getStartTime());
        hiHealthData.setEndTime(sampleSequence.getEndTime());
        hiHealthData.setModifiedTime(sampleSequence.getModifiedTime());
        hiHealthData.setSequenceData(detailData);
        hiHealthData.setMetaData(sampleSequence.getSummaryData());
        hiHealthData.setSimpleData(sampleSequence.getExtendData());
        int subType = sampleSequence.getSubType();
        int type = sampleSequence.getType() + subType;
        if (HiHealthDictManager.a(this.e).a(type) == null) {
            if (!z) {
                return null;
            }
            subType = lke.b(subType);
            type = sampleSequence.getType();
        }
        hiHealthData.setType(type);
        hiHealthData.setSubType(subType);
        return hiHealthData;
    }
}
