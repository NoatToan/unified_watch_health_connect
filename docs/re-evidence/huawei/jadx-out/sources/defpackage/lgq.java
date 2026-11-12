package defpackage;

import android.content.Context;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwcloudmodel.healthdatacloud.model.SampleSequence;
import com.huawei.hwcloudmodel.model.unite.Location;
import com.huawei.hwcloudmodel.model.unite.MotionPathDetail;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class lgq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f40105a;

    static class d {
        private static final lgq d = new lgq();
    }

    private lgq() {
    }

    public static lgq c(Context context) {
        f40105a = context.getApplicationContext();
        return d.d;
    }

    public List<SampleSequence> b(List<HiHealthData> list) {
        if (HiCommonUtil.b(list)) {
            return null;
        }
        kym kymVarJ = kwt.b().j(list.get(0).getClientId());
        if (kymVarJ == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                if (HiCommonUtil.a(hiHealthData.getSequenceData())) {
                    ReleaseLogUtil.a("HiH_MotionPathDtSHlp", "localTrackToCloudByUnite localTrack sequenceData error");
                } else {
                    arrayList.add(new SampleSequence.Builder().dataId(hiHealthData.getDataId()).deviceCode(kymVarJ.e()).startTime(hiHealthData.getStartTime()).endTime(hiHealthData.getEndTime()).type(hiHealthData.getType()).subType(lke.a(hiHealthData.getSubType())).mergeFlag(hiHealthData.getMergedStatus()).timeZone(hiHealthData.getTimeZone()).modifiedTime(hiHealthData.getModifiedTime()).mSummaryData(hiHealthData.getMetaData()).detailData(hiHealthData.getSequenceData()).extendData(hiHealthData.getSimpleData()).build());
                }
            }
        }
        return arrayList;
    }

    public List<MotionPathDetail> e(List<HiHealthData> list) {
        ArrayList arrayList = null;
        if (list != null && !list.isEmpty()) {
            kym kymVarJ = kwt.b().j(list.get(0).getClientId());
            if (kymVarJ == null) {
                return null;
            }
            arrayList = new ArrayList(list.size());
            for (HiHealthData hiHealthData : list) {
                String metaData = hiHealthData.getMetaData();
                if (HiCommonUtil.a(metaData)) {
                    ReleaseLogUtil.a("HiH_MotionPathDtSHlp", "localTrackToCloudByUnite localTrack metaData error ,it is ", hiHealthData);
                } else {
                    HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(metaData, HiTrackMetaData.class);
                    if (hiTrackMetaData == null) {
                        ReleaseLogUtil.a("HiH_MotionPathDtSHlp", "localTrackToCloudByUnite trackMetaData is null!");
                    } else if (b(hiTrackMetaData)) {
                        MotionPathDetail motionPathDetailD = d(kymVarJ, hiHealthData, metaData, hiTrackMetaData);
                        if (motionPathDetailD != null) {
                            ReleaseLogUtil.d("HiH_MotionPathDtSHlp", motionPathDetailD.getMotionPathKeyInfo());
                            arrayList.add(motionPathDetailD);
                        }
                    } else {
                        ReleaseLogUtil.d("HiH_MotionPathDtSHlp", "isValidTrackMetaDataPaceValue isUpdata =", Boolean.valueOf(a(hiHealthData)), Long.valueOf(hiHealthData.getStartTime()));
                    }
                }
            }
        }
        return arrayList;
    }

    private MotionPathDetail d(kym kymVar, HiHealthData hiHealthData, String str, HiTrackMetaData hiTrackMetaData) {
        MotionPathDetail motionPathDetail = new MotionPathDetail();
        motionPathDetail.setDataId(hiHealthData.getDataId());
        motionPathDetail.setDeviceCode(Long.valueOf(kymVar.e()));
        motionPathDetail.setStartTime(Long.valueOf(hiHealthData.getStartTime()));
        motionPathDetail.setEndTime(Long.valueOf(hiHealthData.getEndTime()));
        motionPathDetail.setModifiedTime(Long.valueOf(hiHealthData.getModifiedTime()));
        motionPathDetail.setTimeZone(hiHealthData.getTimeZone());
        motionPathDetail.setAbnormalTrack(Integer.valueOf(hiTrackMetaData.getAbnormalTrack()));
        motionPathDetail.setDuplicateTrack(Integer.valueOf(hiTrackMetaData.getDuplicated()));
        motionPathDetail.setSportType(Integer.valueOf(lke.a(hiTrackMetaData.getSportType())));
        motionPathDetail.setTotalCalories(Integer.valueOf(hiTrackMetaData.getTotalCalories()));
        motionPathDetail.setTotalDistance(Integer.valueOf(hiTrackMetaData.getTotalDistance()));
        motionPathDetail.setTotalSteps(Integer.valueOf(hiTrackMetaData.getTotalSteps()));
        motionPathDetail.setTotalTime(Long.valueOf(hiTrackMetaData.getTotalTime()));
        motionPathDetail.setPartTimeMap(hiTrackMetaData.getPartTimeMap());
        motionPathDetail.setVendor(hiTrackMetaData.getVendor());
        motionPathDetail.setCoordinate(hiTrackMetaData.getCoordinate());
        motionPathDetail.setPaceMap(d(hiTrackMetaData.getPaceMap()));
        motionPathDetail.setSportDataSource(hiTrackMetaData.getSportDataSource());
        ArrayList arrayList = new ArrayList(1);
        Location location = new Location();
        location.setName("gps point is in attribute HW_EXT_TRACK_DETAIL,not here");
        arrayList.add(location);
        motionPathDetail.setLocation(arrayList);
        if (HiCommonUtil.a(hiHealthData.getSequenceData())) {
            LogUtil.e("HiH_MotionPathDtSHlp", "localTrackToCloudByUnite localTrack sequenceData error ,it is ", hiHealthData);
            return null;
        }
        motionPathDetail.setAttribute("HW_EXT_TRACK_DETAIL@is" + hiHealthData.getSequenceData() + "&&HW_EXT_TRACK_SIMPLIFY@is" + str);
        return motionPathDetail;
    }

    private boolean a(HiHealthData hiHealthData) {
        return kws.e(f40105a).c(hiHealthData.getDataId(), 3) > 0;
    }

    private boolean b(HiTrackMetaData hiTrackMetaData) {
        if (hiTrackMetaData.getPaceMap() != null) {
            Iterator<Map.Entry<Integer, Float>> it = hiTrackMetaData.getPaceMap().entrySet().iterator();
            while (it.hasNext()) {
                if (!liq.e(it.next().getValue().floatValue(), 1000000.0d, 0.0d)) {
                    return false;
                }
            }
        }
        if (hiTrackMetaData.getPartTimeMap() == null) {
            return true;
        }
        Iterator<Map.Entry<Double, Double>> it2 = hiTrackMetaData.getPartTimeMap().entrySet().iterator();
        while (it2.hasNext()) {
            if (!liq.e(it2.next().getValue().doubleValue(), 1000000.0d, 0.0d)) {
                return false;
            }
        }
        return true;
    }

    private static Map<String, Float> d(Map<Integer, Float> map) {
        if (map == null || map.isEmpty()) {
            return new HashMap();
        }
        HashMap map2 = new HashMap(map.size());
        for (Map.Entry<Integer, Float> entry : map.entrySet()) {
            map2.put(Integer.toString(entry.getKey().intValue()), entry.getValue());
        }
        return map2;
    }

    public List<MotionPathDetail> a(List<HiHealthData> list) {
        kym kymVarJ;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (HiHealthData hiHealthData : list) {
            MotionPathDetail motionPathDetail = new MotionPathDetail();
            long startTime = hiHealthData.getStartTime();
            long endTime = hiHealthData.getEndTime();
            String timeZone = hiHealthData.getTimeZone();
            motionPathDetail.setDataId(hiHealthData.getDataId());
            motionPathDetail.setStartTime(Long.valueOf(startTime));
            motionPathDetail.setEndTime(Long.valueOf(endTime));
            motionPathDetail.setModifiedTime(Long.valueOf(hiHealthData.getModifiedTime()));
            motionPathDetail.setTimeZone(timeZone);
            String metaData = hiHealthData.getMetaData();
            String sequenceData = hiHealthData.getSequenceData();
            HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(metaData, HiTrackMetaData.class);
            if (hiTrackMetaData != null && sequenceData != null && (kymVarJ = kwt.b().j(hiHealthData.getClientId())) != null) {
                motionPathDetail.setAbnormalTrack(Integer.valueOf(hiTrackMetaData.getAbnormalTrack()));
                motionPathDetail.setDuplicateTrack(Integer.valueOf(hiTrackMetaData.getDuplicated()));
                motionPathDetail.setDeviceCode(Long.valueOf(kymVarJ.e()));
                motionPathDetail.setTotalSteps(Integer.valueOf(hiTrackMetaData.getTotalSteps()));
                motionPathDetail.setTotalCalories(Integer.valueOf(hiTrackMetaData.getTotalCalories()));
                motionPathDetail.setTotalDistance(Integer.valueOf(hiTrackMetaData.getTotalDistance()));
                motionPathDetail.setTotalTime(Long.valueOf(hiTrackMetaData.getTotalTime()));
                ArrayList arrayList2 = new ArrayList(2);
                arrayList2.add(lik.d("TRACK_METADATA", metaData, startTime, endTime, null));
                arrayList2.add(lik.d("TRACK_SEQUENCE_DATA", sequenceData, startTime, endTime, null));
                motionPathDetail.setSamplePoints(arrayList2);
                arrayList.add(motionPathDetail);
            }
        }
        return arrayList;
    }

    public OldToNewMotionPath c(HiTrackMetaData hiTrackMetaData, MotionPathDetail motionPathDetail) {
        long jLongValue = motionPathDetail.getTotalTime().longValue();
        int iIntValue = motionPathDetail.getTotalDistance().intValue();
        hiTrackMetaData.setTotalTime(jLongValue);
        hiTrackMetaData.setTotalDistance(iIntValue);
        hiTrackMetaData.setAvgPace(iIntValue == 0 ? 0.0f : jLongValue / iIntValue);
        hiTrackMetaData.setTotalSteps(motionPathDetail.getTotalSteps().intValue());
        hiTrackMetaData.setTotalCalories(motionPathDetail.getTotalCalories().intValue());
        hiTrackMetaData.setSportId(motionPathDetail.getRecordId());
        LogUtil.d("HiH_MotionPathDtSHlp", "sportType is ", motionPathDetail.getSportType());
        hiTrackMetaData.setSportType(lke.b(motionPathDetail.getSportType().intValue()));
        Map<String, Float> paceMap = motionPathDetail.getPaceMap();
        OldToNewMotionPath oldToNewMotionPath = new OldToNewMotionPath();
        if (paceMap != null && !paceMap.isEmpty()) {
            Set<Map.Entry<String, Float>> setEntrySet = paceMap.entrySet();
            HashMap map = new HashMap(setEntrySet.size());
            for (Map.Entry<String, Float> entry : setEntrySet) {
                try {
                    map.put(Integer.valueOf(Integer.parseInt(entry.getKey())), entry.getValue());
                } catch (NumberFormatException unused) {
                    ReleaseLogUtil.d("HiH_MotionPathDtSHlp", "setData NumberFormatException");
                }
            }
            hiTrackMetaData.setPaceMap(map);
            oldToNewMotionPath.setPaceMap(map);
        }
        hiTrackMetaData.setAbnormalTrack(motionPathDetail.getAbnormalTrack().intValue());
        hiTrackMetaData.setDuplicated(motionPathDetail.getDuplicateTrack());
        hiTrackMetaData.setPartTimeMap(motionPathDetail.getPartTimeMap());
        return oldToNewMotionPath;
    }

    public HiHealthData a(kym kymVar, MotionPathDetail motionPathDetail, String str, String str2) {
        HiHealthData hiHealthDataC = c(kymVar, motionPathDetail);
        hiHealthDataC.setMetaData(str);
        hiHealthDataC.setSequenceData(str2);
        return hiHealthDataC;
    }

    public HiHealthData c(kym kymVar, MotionPathDetail motionPathDetail) {
        HiHealthData hiHealthData = new HiHealthData();
        kymVar.h(1);
        kym.e(hiHealthData, kymVar);
        hiHealthData.setType(30001);
        hiHealthData.setTimeZone(motionPathDetail.getTimeZone());
        hiHealthData.setStartTime(motionPathDetail.getStartTime().longValue());
        hiHealthData.setEndTime(motionPathDetail.getEndTime().longValue());
        hiHealthData.setModifiedTime(motionPathDetail.getModifiedTime() == null ? 0L : motionPathDetail.getModifiedTime().longValue());
        return hiHealthData;
    }
}
