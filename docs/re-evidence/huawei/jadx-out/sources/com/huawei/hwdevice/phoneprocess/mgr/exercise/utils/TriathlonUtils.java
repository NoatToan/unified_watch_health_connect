package com.huawei.hwdevice.phoneprocess.mgr.exercise.utils;

import com.huawei.hihealth.data.model.RelativeSportData;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.MotionPath;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class TriathlonUtils {
    private static final int DEFAULT_LIST_SIZE = 4;
    private static final int DEFAULT_MAP_SIZE = 0;
    private static final int LAST_ID = -1;
    private static final Object LOCK = new Object();
    private static final String SPLIT_FIX = "_";
    private static final String TAG = "TriathlonUtils";
    private static TriathlonUtils sInstance;
    private final Object mCacheLock = new Object();
    private int mLastRecordId = -1;
    private int mRunPlayLastRecordId = -1;
    private HashMap<String, List<Integer>> mRemovedRecordIdMap = new HashMap<>(0);
    private HashMap<String, List<TriathlonCache>> mFatherCaches = new HashMap<>(0);
    private HashMap<String, List<TriathlonCache>> mChildCaches = new HashMap<>(4);

    private boolean isSuitTime(long j, long j2, long j3, long j4) {
        return j == j2 && j3 == j4;
    }

    private TriathlonUtils() {
    }

    public static TriathlonUtils getInstance() {
        TriathlonUtils triathlonUtils;
        synchronized (LOCK) {
            if (sInstance == null) {
                sInstance = new TriathlonUtils();
            }
            triathlonUtils = sInstance;
        }
        return triathlonUtils;
    }

    public void clearCache(String str) {
        synchronized (this.mCacheLock) {
            LogUtil.a(TAG, "enter clearCache");
            this.mFatherCaches.remove(str);
            this.mChildCaches.remove(str);
            this.mRemovedRecordIdMap.remove(str);
        }
    }

    public void saveLastRecordId(int i) {
        this.mLastRecordId = i;
        LogUtil.a(TAG, "save mLastRecordId: ", Integer.valueOf(i));
    }

    public void saveRunPlayLastRecordId(int i) {
        this.mRunPlayLastRecordId = i;
        LogUtil.a(TAG, "save mRunPlayLastRecordId is ", Integer.valueOf(i));
    }

    public boolean isLastData(int i) {
        LogUtil.a(TAG, "mLastRecordId: ", Integer.valueOf(this.mLastRecordId), " recordId: ", Integer.valueOf(i));
        return i == this.mLastRecordId;
    }

    public boolean isRunPlayLastData(int i) {
        LogUtil.a(TAG, "mRunPlayLastRecordId is ", Integer.valueOf(this.mRunPlayLastRecordId), "runPlayRecordId is ", Integer.valueOf(i));
        return i == this.mRunPlayLastRecordId;
    }

    public void setNowRecordId(int i, String str) {
        synchronized (this.mCacheLock) {
            List<Integer> arrayList = this.mRemovedRecordIdMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>(4);
            }
            if (!arrayList.contains(Integer.valueOf(i))) {
                arrayList.add(Integer.valueOf(i));
            }
            this.mRemovedRecordIdMap.put(str, arrayList);
        }
    }

    public HashMap<String, List<TriathlonCache>> getCache(String str) {
        HashMap<String, List<TriathlonCache>> map;
        synchronized (this.mCacheLock) {
            map = new HashMap<>(0);
            List<TriathlonCache> list = this.mFatherCaches.get(str);
            if (list != null && !list.isEmpty()) {
                for (TriathlonCache triathlonCache : list) {
                    List<TriathlonCache> listFindCacheAndSave = findCacheAndSave(triathlonCache, str);
                    if (listFindCacheAndSave != null && !listFindCacheAndSave.isEmpty()) {
                        listFindCacheAndSave.add(0, triathlonCache);
                        map.put(triathlonCache.mIdentity, listFindCacheAndSave);
                    }
                }
            }
        }
        return map;
    }

    private List<TriathlonCache> findCacheAndSave(TriathlonCache triathlonCache, String str) {
        List<RelativeSportData> listRequestChildSportItems;
        MotionPathSimplify simplifyData = triathlonCache.getSimplifyData();
        ArrayList arrayList = new ArrayList(4);
        if (simplifyData != null && (listRequestChildSportItems = simplifyData.requestChildSportItems()) != null && !listRequestChildSportItems.isEmpty()) {
            for (RelativeSportData relativeSportData : listRequestChildSportItems) {
                if (!relativeSportData.isHasDetailInfo()) {
                    LogUtil.j(TAG, "findCacheAndSave no sportData data");
                } else {
                    TriathlonCache detailData = getDetailData(relativeSportData, str);
                    if (detailData == null) {
                        LogUtil.j(TAG, "detailData data is null");
                        return arrayList;
                    }
                    arrayList.add(detailData);
                }
            }
        }
        return arrayList;
    }

    private TriathlonCache getDetailData(RelativeSportData relativeSportData, String str) {
        if (relativeSportData == null) {
            LogUtil.j(TAG, "getDetailData sportData is null");
            return null;
        }
        synchronized (this.mCacheLock) {
            List<TriathlonCache> list = this.mChildCaches.get(str);
            if (list != null && !list.isEmpty()) {
                for (TriathlonCache triathlonCache : list) {
                    MotionPathSimplify simplifyData = triathlonCache.getSimplifyData();
                    if (simplifyData != null && isSuitTime(simplifyData.getStartTime(), relativeSportData.getStartTime(), simplifyData.getEndTime(), relativeSportData.getEndTime()) && simplifyData.getTotalTime() == relativeSportData.getDuration() && simplifyData.getTotalDistance() == relativeSportData.getDistance() && simplifyData.getTotalCalories() == relativeSportData.getCalories()) {
                        LogUtil.a(TAG, "childItem ok");
                        return triathlonCache;
                    }
                }
                LogUtil.j(TAG, "no find nice child item");
                return null;
            }
            LogUtil.j(TAG, "getDetailData childListCaches is null or childListCaches size is empty");
            return null;
        }
    }

    public void putCache(MotionPathSimplify motionPathSimplify, MotionPath motionPath, String str, int i) {
        TriathlonCache triathlonCache = new TriathlonCache(motionPathSimplify, motionPath, str, i);
        LogUtil.a(TAG, "enter putCache");
        synchronized (this.mCacheLock) {
            if (isTriathlonFatherData(motionPathSimplify)) {
                List<TriathlonCache> arrayList = this.mFatherCaches.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(4);
                }
                if (!arrayList.contains(triathlonCache)) {
                    arrayList.add(triathlonCache);
                }
                this.mFatherCaches.put(str, arrayList);
                LogUtil.a(TAG, "putCache mFatherCaches");
            } else {
                List<TriathlonCache> arrayList2 = this.mChildCaches.get(str);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(4);
                }
                if (!arrayList2.contains(triathlonCache)) {
                    arrayList2.add(triathlonCache);
                }
                this.mChildCaches.put(str, arrayList2);
                LogUtil.a(TAG, "putCache mChildCaches");
            }
        }
    }

    public boolean isTriathlonData(MotionPathSimplify motionPathSimplify) {
        LogUtil.a(TAG, "enter isTriathlonData");
        if (motionPathSimplify == null) {
            return false;
        }
        if (motionPathSimplify.requestChildSportItems() == null) {
            return motionPathSimplify.requestFatherSportItem() != null;
        }
        LogUtil.a(TAG, "isTriathlonData father data return true");
        return true;
    }

    private boolean isTriathlonFatherData(MotionPathSimplify motionPathSimplify) {
        return motionPathSimplify.requestChildSportItems() != null;
    }

    public static class TriathlonCache {
        private String mHashIndex;
        private String mIdentity;
        private MotionPath mMotionPath;
        private MotionPathSimplify mSimplifyData;
        private int mWorkId;

        TriathlonCache(MotionPathSimplify motionPathSimplify, MotionPath motionPath, String str, int i) {
            this.mSimplifyData = motionPathSimplify;
            this.mMotionPath = motionPath;
            String strCreateHashIndex = createHashIndex(motionPathSimplify, str, i);
            this.mIdentity = strCreateHashIndex;
            this.mWorkId = i;
            if (strCreateHashIndex != null) {
                this.mHashIndex = strCreateHashIndex.split("_")[0];
            }
        }

        public MotionPathSimplify getSimplifyData() {
            return this.mSimplifyData;
        }

        public MotionPath getMotionPath() {
            return this.mMotionPath;
        }

        public int getWorkId() {
            return this.mWorkId;
        }

        private String createHashIndex(MotionPathSimplify motionPathSimplify, String str, int i) {
            if (motionPathSimplify == null) {
                LogUtil.j(TriathlonUtils.TAG, "createHashIndex simplifyData is null");
                return null;
            }
            int sportType = motionPathSimplify.getSportType();
            if (motionPathSimplify.requestChildSportItems() != null) {
                return TriathlonUtils.createHashIndexByTimeSportType(motionPathSimplify.getStartTime(), motionPathSimplify.getEndTime(), sportType, str, i);
            }
            if (motionPathSimplify.requestFatherSportItem() == null) {
                LogUtil.j(TriathlonUtils.TAG, "wrong Triathlon data.");
                return "";
            }
            RelativeSportData relativeSportDataRequestFatherSportItem = motionPathSimplify.requestFatherSportItem();
            return TriathlonUtils.createHashIndexByTimeSportType(relativeSportDataRequestFatherSportItem.getStartTime(), relativeSportDataRequestFatherSportItem.getEndTime(), sportType, str, i);
        }

        public boolean equals(Object obj) {
            TriathlonCache triathlonCache;
            MotionPathSimplify motionPathSimplify;
            if (super.equals(obj)) {
                return true;
            }
            return (obj instanceof TriathlonCache) && (motionPathSimplify = (triathlonCache = (TriathlonCache) obj).mSimplifyData) != null && this.mSimplifyData != null && triathlonCache.mIdentity.equalsIgnoreCase(this.mIdentity) && triathlonCache.getWorkId() == getWorkId() && this.mSimplifyData.toString().equalsIgnoreCase(motionPathSimplify.toString());
        }

        public int hashCode() {
            return super.hashCode();
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer(16);
            stringBuffer.append("TriathlonCache{simplifyData=").append(this.mSimplifyData).append(", mMotionPath=").append(this.mMotionPath).append(", mIdentity='").append(this.mIdentity).append("', mHashIndex='").append(this.mHashIndex).append("'}");
            return stringBuffer.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String createHashIndexByTimeSportType(long j, long j2, int i, String str, int i2) {
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(j).append(j2).append(str).append("_").append(i).append(i2);
        return stringBuffer.toString();
    }
}
