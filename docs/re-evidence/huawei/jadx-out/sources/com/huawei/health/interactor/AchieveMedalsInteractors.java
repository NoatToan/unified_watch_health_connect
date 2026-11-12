package com.huawei.health.interactor;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.gson.JsonSyntaxException;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginachievement.manager.model.TrackData;
import defpackage.jac;
import defpackage.osa;
import defpackage.oun;
import health.compact.a.CommonUtil;
import health.compact.a.HiDateUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AchieveMedalsInteractors {
    private static final int DURATION_TIME_PARAM = -7;
    private static final String TAG = "AchieveMedalsInteractors";
    protected Context mContext;
    private long mRecentStamp;

    public abstract void behave();

    public abstract void unRegister();

    protected ArrayList<TrackData> searchSingleRunLongest(List<HiHealthData> list) {
        ArrayList<TrackData> arrayList = new ArrayList<>(10);
        String strE = osa.e(this.mContext, "_syncWearTimtstamp");
        LogUtil.a(TAG, "search recentstamp is ", strE);
        this.mRecentStamp = TextUtils.isEmpty(strE) ? getTimeSevenDaysBefore() : CommonUtil.i(strE);
        if (list.size() != 0) {
            LogUtil.a(TAG, "single records size is ", Integer.valueOf(list.size()));
            boolean z = false;
            for (HiHealthData hiHealthData : list) {
                long startTime = hiHealthData.getStartTime();
                if (startTime > this.mRecentStamp) {
                    this.mRecentStamp = startTime;
                    z = true;
                }
                try {
                    HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiTrackMetaData.class);
                    int abnormalTrack = hiTrackMetaData.getAbnormalTrack();
                    int duplicated = hiTrackMetaData.getDuplicated();
                    LogUtil.a(TAG, "getAbnormalTrack=", Integer.valueOf(abnormalTrack), "duplicateResult=", Integer.valueOf(duplicated));
                    if (abnormalTrack == 0 && duplicated == 0) {
                        int sportDataSource = hiTrackMetaData.getSportDataSource();
                        if (sportDataSource == 2 || sportDataSource == 3) {
                            LogUtil.j(TAG, "sportDataSource=", Integer.valueOf(sportDataSource));
                        } else {
                            TrackData trackData = getTrackData(hiHealthData, hiTrackMetaData);
                            if (trackData != null) {
                                arrayList.add(trackData);
                            }
                        }
                    }
                } catch (JsonSyntaxException unused) {
                    LogUtil.j(TAG, "trackMetaData is error");
                }
            }
            if (z) {
                HashMap map = new HashMap();
                map.put("_syncWearTimtstamp", String.valueOf(this.mRecentStamp));
                osa.b(this.mContext, map);
                LogUtil.a(TAG, "timestamp saved is ", Long.valueOf(this.mRecentStamp));
            }
        }
        return arrayList;
    }

    private TrackData getTrackData(HiHealthData hiHealthData, HiTrackMetaData hiTrackMetaData) {
        String str;
        String str2;
        String str3;
        Map<String, String> extendTrackMap = hiTrackMetaData.getExtendTrackMap();
        if (extendTrackMap != null && extendTrackMap.size() != 0) {
            str = extendTrackMap.get("skipNum");
            str3 = extendTrackMap.get("maxSkippingTimes");
            str2 = extendTrackMap.get("skipSpeed");
        } else {
            str = "";
            str2 = "";
            str3 = str2;
        }
        long startTime = hiHealthData.getStartTime();
        long endTime = hiHealthData.getEndTime();
        int sportType = hiTrackMetaData.getSportType();
        int totalDistance = hiTrackMetaData.getTotalDistance();
        TrackData trackData = new TrackData();
        trackData.saveDistance(totalDistance);
        trackData.saveTrackTime(startTime);
        trackData.saveType(sportType);
        trackData.saveEndTime(endTime);
        trackData.savePaceMap(hiTrackMetaData.getPaceMap());
        trackData.savePartTimeMap(hiTrackMetaData.getPartTimeMap());
        float bestPace = hiTrackMetaData.getBestPace();
        if (hiTrackMetaData.getTrackType() != 0 || hiTrackMetaData.getTrackType() != 1) {
            if (bestPace == 0.0f) {
                bestPace = dealDataSourceIsDevice(hiHealthData);
            }
            trackData.saveBestPace(bestPace);
        } else {
            trackData.saveBestPace(hiTrackMetaData.getBestPace());
        }
        trackData.saveSportDataSource(hiTrackMetaData.getSportDataSource());
        if (sportType == 283) {
            totalDistance = oun.d(str);
            trackData.saveTrackNum(totalDistance);
            trackData.setMaxSkippingTimes(oun.d(str3));
            trackData.setSkipSpeed(oun.d(str2));
            trackData.setTotalTime(hiTrackMetaData.getTotalTime());
        } else if (!isValidType(sportType) || totalDistance <= 0) {
            return null;
        }
        LogUtil.a(TAG, "whole data from hihealth studio is*", Integer.valueOf(totalDistance), Constants.PARAM_SERVER_SPLIT, Integer.valueOf(sportType), " time ", Long.valueOf(startTime));
        return trackData;
    }

    private float dealDataSourceIsDevice(HiHealthData hiHealthData) {
        Map<Integer, Float> mapRequestPaceMap;
        String sequenceFileUrl = hiHealthData.getSequenceFileUrl();
        if (TextUtils.isEmpty(sequenceFileUrl)) {
            LogUtil.j(TAG, "fileUrl is null");
            return 0.0f;
        }
        MotionPath motionPathB = jac.b(this.mContext, sequenceFileUrl);
        if (motionPathB == null || (mapRequestPaceMap = motionPathB.requestPaceMap()) == null || mapRequestPaceMap.size() == 0) {
            return 0.0f;
        }
        Iterator<Map.Entry<Integer, Float>> it = mapRequestPaceMap.entrySet().iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            float fFloatValue = it.next().getValue().floatValue();
            if (f == 0.0f) {
                f = fFloatValue;
            }
            if (f < fFloatValue) {
                f = fFloatValue;
            }
        }
        return f;
    }

    private boolean isValidType(int i) {
        LogUtil.a(TAG, "isValidType: sportType -> " + i);
        return (i == 257 || i == 258 || i == 264 || i == 280 || i == 227) || (i == 259) || (i == 262 || i == 266);
    }

    protected long getTimeSevenDaysBefore() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(6, -7);
        return calendar.getTimeInMillis();
    }

    protected void readSingleTrackData(final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a(TAG, "called when wear data changed !");
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setType(new int[]{30002});
        hiDataReadOption.setSortOrder(1);
        String strE = osa.e(this.mContext, "_syncWearTimtstamp");
        long timeSevenDaysBefore = getTimeSevenDaysBefore();
        LogUtil.a(TAG, "sevendaybefore timestamp get is ", Long.valueOf(timeSevenDaysBefore));
        long jI = CommonUtil.i(strE);
        if (!TextUtils.isEmpty(strE)) {
            timeSevenDaysBefore = jI;
        }
        this.mRecentStamp = timeSevenDaysBefore;
        LogUtil.a(TAG, "timestamp get is ", Long.valueOf(timeSevenDaysBefore));
        if (System.currentTimeMillis() < this.mRecentStamp) {
            this.mRecentStamp = oun.a(System.currentTimeMillis(), true);
            HashMap map = new HashMap();
            map.put("_syncWearTimtstamp", String.valueOf(this.mRecentStamp));
            osa.b(this.mContext, map);
        }
        hiDataReadOption.setTimeInterval(HiDateUtil.p(this.mRecentStamp), HiDateUtil.g(System.currentTimeMillis()));
        HiHealthManager.d(this.mContext).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: com.huawei.health.interactor.AchieveMedalsInteractors.5
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.a(AchieveMedalsInteractors.TAG, "achieve moudle get single run to read wear data onResult enter");
                if (i != 0 || obj == null) {
                    LogUtil.j(AchieveMedalsInteractors.TAG, "achieve moudle get single run data fail! errorcode = ", Integer.valueOf(i), "&& anchor is ", Integer.valueOf(i2));
                    return;
                }
                LogUtil.a(AchieveMedalsInteractors.TAG, "achieve moudle get single run to read wear data onResult data is not null");
                SparseArray sparseArray = (SparseArray) obj;
                Object obj2 = sparseArray.get(30002);
                if (sparseArray.size() <= 0) {
                    LogUtil.j(AchieveMedalsInteractors.TAG, "trackdata from DataStudio is none");
                    return;
                }
                List list = (List) obj2;
                LogUtil.a(AchieveMedalsInteractors.TAG, "obtainFrom DataStudio Achieve size is ", Integer.valueOf(list.size()));
                iBaseResponseCallback.a(i, list);
            }
        });
    }
}
