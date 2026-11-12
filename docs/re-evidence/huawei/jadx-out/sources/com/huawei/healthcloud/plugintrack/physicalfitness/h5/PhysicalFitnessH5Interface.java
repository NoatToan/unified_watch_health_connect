package com.huawei.healthcloud.plugintrack.physicalfitness.h5;

import android.util.SparseArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.h5pro.service.anotation.H5ProMethod;
import com.huawei.health.h5pro.service.anotation.H5ProService;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ive;
import defpackage.jco;
import defpackage.jcq;
import defpackage.njy;
import defpackage.qqt;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@H5ProService(name = "physicalFitnessApi")
public class PhysicalFitnessH5Interface {
    private static final int RECORD_NUM = 30;
    private static final int RUN_REFERENCE_DISTANCE = 1000;
    private static final String TAG = "Track_PhysicalFitnessH5Interface";
    private static final int WALK_REFERENCE_DISTANCE = 3000;

    @H5ProMethod(name = "startPhysicalFitness")
    public static void startPhysicalFitness(int i, int i2, float f, PhysicalFitnessH5Callback<jco> physicalFitnessH5Callback) {
        if (physicalFitnessH5Callback == null) {
            ReleaseLogUtil.e(TAG, "startPhysicalFitness failed, physicalFitnessCallBack is null");
            return;
        }
        ReleaseLogUtil.d(TAG, "startPhysicalFitness, sportType = ", Integer.valueOf(i), ", targetType = ", Integer.valueOf(i2), ", targetValue = ", Float.valueOf(f));
        if (!SportSupportUtil.d(i)) {
            physicalFitnessH5Callback.onFailure(-1, "this sportType is invalid");
            return;
        }
        ive.c().a(physicalFitnessH5Callback);
        ive.c().c(0, ive.c().b(i, i2, f, 1), (ISportDataCallback) null, BaseApplication.b(), (String) null);
    }

    @H5ProMethod(name = "isSupportAiSport")
    public static void isSupportAiSport(int i, PhysicalFitnessH5Callback<Boolean> physicalFitnessH5Callback) {
        if (physicalFitnessH5Callback == null) {
            ReleaseLogUtil.e(TAG, "isSupportAiSport failed, physicalFitnessCallBack is null");
            return;
        }
        ReleaseLogUtil.d(TAG, "isSupportAiSport in, sportType = ", Integer.valueOf(i));
        boolean zI = i == 283 ? SportSupportUtil.i() : false;
        if (SportSupportUtil.e(i)) {
            zI = SportSupportUtil.j();
        }
        ReleaseLogUtil.d(TAG, "isSupportAiSport = ", Boolean.valueOf(zI));
        physicalFitnessH5Callback.onSuccess(Boolean.valueOf(zI));
    }

    @H5ProMethod(name = "acquireBestResult")
    public static void acquireBestResult(int i, float f, PhysicalFitnessH5Callback<jcq> physicalFitnessH5Callback) {
        if (physicalFitnessH5Callback == null) {
            ReleaseLogUtil.e(TAG, "acquireBestResult failed, physicalFitnessCallBack is null");
            return;
        }
        ReleaseLogUtil.d(TAG, "acquireBestResult start, sportType = ", Integer.valueOf(i), ", targetValue = ", Float.valueOf(f));
        if (!SportSupportUtil.b(i)) {
            physicalFitnessH5Callback.onFailure(-1, "this sportType is invalid");
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(1, -1);
        long timeInMillis = calendar.getTimeInMillis();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ReleaseLogUtil.d(TAG, "acquireBestResult startTime = ", Long.valueOf(timeInMillis), ", endTime = ", Long.valueOf(jCurrentTimeMillis));
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        int iA = DateFormatUtil.a(timeInMillis);
        int iA2 = DateFormatUtil.a(jCurrentTimeMillis);
        hiDataReadOption.setTimeInterval(String.valueOf(iA), String.valueOf(iA2), HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
        int[] iArr = {i};
        if (i == 258 || i == 264) {
            iArr = new int[]{258, 264};
        }
        hiDataReadOption.setType(iArr);
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setCount(30);
        acquireLastYearSportData(i, f * 1000.0f, hiDataReadOption, physicalFitnessH5Callback);
    }

    private static void acquireLastYearSportData(final int i, final float f, HiDataReadOption hiDataReadOption, final PhysicalFitnessH5Callback<jcq> physicalFitnessH5Callback) {
        HiHealthManager.d(BaseApplication.b()).fetchSequenceDataBySportType(hiDataReadOption, new HiDataReadResultListener() { // from class: com.huawei.healthcloud.plugintrack.physicalfitness.h5.PhysicalFitnessH5Interface.1
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i2, Object obj, int i3, int i4) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i2, int i3) {
                List hiHealthData = PhysicalFitnessH5Interface.getHiHealthData(obj, i2);
                if (njy.e(hiHealthData)) {
                    ReleaseLogUtil.e(PhysicalFitnessH5Interface.TAG, "getHiHealthData healthDataList is empty");
                    physicalFitnessH5Callback.onFailure(-1, "data is empty");
                } else {
                    jcq historyBestResult = PhysicalFitnessH5Interface.getHistoryBestResult(i, f, hiHealthData);
                    ReleaseLogUtil.d(PhysicalFitnessH5Interface.TAG, "acquireBestResult historyBestResult = ", historyBestResult);
                    physicalFitnessH5Callback.onSuccess(historyBestResult);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<HiHealthData> getHiHealthData(Object obj, int i) {
        if (!(obj instanceof SparseArray)) {
            LogUtil.j(TAG, "getHiHealthData data is error");
            return Collections.EMPTY_LIST;
        }
        SparseArray sparseArray = (SparseArray) obj;
        if (!njy.b(sparseArray.get(i), HiHealthData.class)) {
            LogUtil.j(TAG, "getHiHealthData dataArray not instanceof List");
            return Collections.EMPTY_LIST;
        }
        return (List) sparseArray.get(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static jcq getHistoryBestResult(int i, float f, List<HiHealthData> list) {
        jcq jcqVar = new jcq();
        float fAcquirePace = 0.0f;
        int i2 = 0;
        float fAcquirePace2 = 0.0f;
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) qqt.e(hiHealthData.getMetaData(), HiTrackMetaData.class);
                if (!isInvalidTrack(hiTrackMetaData)) {
                    int totalDistance = hiTrackMetaData.getTotalDistance();
                    if (i == 257) {
                        if (totalDistance >= 3000) {
                            i2++;
                            fAcquirePace2 = acquirePace(hiTrackMetaData.getAvgPace(), fAcquirePace2);
                        }
                    } else if (totalDistance >= f) {
                        i2++;
                        if (totalDistance >= 1000) {
                            fAcquirePace = acquirePace(hiTrackMetaData.getBestPace(), fAcquirePace);
                        } else {
                            fAcquirePace = acquirePace(hiTrackMetaData.getAvgPace(), fAcquirePace);
                        }
                    }
                }
            }
        }
        if (i == 257) {
            jcqVar.b(fAcquirePace2);
        } else {
            jcqVar.b(fAcquirePace);
        }
        jcqVar.d(i2);
        return jcqVar;
    }

    private static boolean isInvalidTrack(HiTrackMetaData hiTrackMetaData) {
        return hiTrackMetaData == null || hiTrackMetaData.getSportDataSource() == 2 || hiTrackMetaData.getAbnormalTrack() != 0 || hiTrackMetaData.getDuplicated() == 1;
    }

    private static float acquirePace(float f, float f2) {
        if (f == 0.0f || f2 == 0.0f) {
            return Math.max(f, f2);
        }
        return Math.min(f, f2);
    }
}
