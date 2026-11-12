package com.huawei.health.sportservice.manager;

import android.content.Context;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.jsoperation.JsUtil;
import defpackage.gzr;
import defpackage.hbv;
import defpackage.njg;
import defpackage.njh;
import defpackage.nji;
import defpackage.njy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 1, name = ComponentName.INTENSITY_MANAGER)
public class IntensityManager extends BaseIntensityManager {
    private static final int CADENCE_THRESHOLD_110 = 110;
    private static final int CADENCE_THRESHOLD_30 = 30;
    private static final int CADENCE_THRESHOLD_60 = 60;
    private static final int CADENCE_THRESHOLD_80 = 80;
    private static final long MILLIS_PER_MINUTE = 60000;
    private static final int MINUTE_OF_FIVE_SEC = 12;
    private static final int PADDLE_FREQUENCY_THRESHOLD = 25;
    private static final int POWER_THRESHOLD = 50;
    private static final int RESISTANCE_THRESHOLD_1 = 1;
    private static final int RESISTANCE_THRESHOLD_2 = 2;
    private static final int RESISTANCE_THRESHOLD_3 = 3;
    private static final int RESISTANCE_THRESHOLD_5 = 5;
    private static final int RESISTANCE_THRESHOLD_6 = 6;
    private static final int SPEED_THRESHOLD = 20;
    private static final String TAG = "SportService_IntensityManager";
    private static final byte TYPE_UNKNOWN = 0;
    private Context mContext;
    private Map<Integer, Byte> mIntensityDataMap = new HashMap(10);
    private int mSportType = 0;
    private long mStartTimeBySecond = 0;

    public static boolean isNeedCadence(int i) {
        return i == 265 || i == 273;
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        LogUtil.a(TAG, "onPreSport()");
        this.mContext = BaseApplication.b();
        this.mSportType = BaseSportManager.getInstance().getSportType();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    private boolean handleSportIntensity(List<njh> list, List<gzr> list2, List<nji> list3, List<Integer> list4, List<njg> list5) {
        LogUtil.a(TAG, "handleSportIntensity() mSportType = ", Integer.valueOf(this.mSportType));
        int i = this.mSportType;
        boolean z = false;
        if (i != 265) {
            if (i != 283) {
                if (i != 273) {
                    if (i == 274) {
                        if (isHandleRowIntensity(i, list, list3) && isCalculateTotalData()) {
                            z = true;
                        }
                    } else {
                        LogUtil.j(TAG, " sportType unknown");
                    }
                } else if (isHandleEllipticalIntensity(i, list, list2) && isCalculateTotalData()) {
                    z = true;
                }
            } else if (isHandleRopeSkippingIntensity(i, list5) && isCalculateTotalData()) {
                z = true;
            }
        } else if (isHandleBikeIntensity(i, list, list2, list4) && isCalculateTotalData()) {
            z = true;
        }
        LogUtil.a(TAG, "handleSportIntensity() result is: ", Boolean.valueOf(z));
        return z;
    }

    private boolean isHandleEllipticalIntensity(int i, List<njh> list, List<gzr> list2) {
        int i2;
        LogUtil.a(TAG, "Start to handle Elliptical Intensity");
        if (isHandlePowerIntensity(i, list)) {
            return true;
        }
        if (!njy.e(list2)) {
            LogUtil.a(TAG, "cadenceDataList.size() = ", Integer.valueOf(list2.size()));
            int i3 = 0;
            while (i3 < list2.size()) {
                int i4 = i3;
                int iC = 0;
                while (true) {
                    i2 = i3 + 12;
                    if (i4 >= i2 || i4 >= list2.size()) {
                        break;
                    }
                    iC += list2.get(i4).c();
                    i4++;
                }
                if (iC / 12 > CADENCE_THRESHOLD_110) {
                    this.mIntensityDataMap.put(Integer.valueOf(i3 / 12), Byte.valueOf((byte) i));
                }
                i3 = i2;
            }
            return true;
        }
        LogUtil.j(TAG, "handle Elliptical Intensity failed");
        return false;
    }

    private boolean isHandlePowerIntensity(int i, List<njh> list) {
        int i2;
        if (njy.e(list)) {
            return false;
        }
        LogUtil.a(TAG, "start to isHandlePowerIntensity, powerDataList.size() = ", Integer.valueOf(list.size()));
        int i3 = 0;
        while (i3 < list.size()) {
            int i4 = i3;
            int iE = 0;
            while (true) {
                i2 = i3 + 12;
                if (i4 >= i2 || i4 >= list.size()) {
                    break;
                }
                iE += list.get(i4).e();
                i4++;
            }
            if (iE / 12 > 50) {
                this.mIntensityDataMap.put(Integer.valueOf(i3 / 12), Byte.valueOf((byte) i));
            }
            i3 = i2;
        }
        return true;
    }

    private boolean isCalculateTotalData() {
        LogUtil.a(TAG, " isCalculateTotalData");
        List<HiHealthData> uploadMinuteToList = setUploadMinuteToList();
        if (uploadMinuteToList.size() <= 0) {
            LogUtil.j(TAG, "sport intensity data null ");
            return true;
        }
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.setDatas(uploadMinuteToList);
        int size = uploadMinuteToList.size();
        LogUtil.a(TAG, "before insertHiHealthData size is ", Integer.valueOf(size), "dataList = ", uploadMinuteToList.toString());
        HiHealthManager.d(this.mContext).insertHiHealthData(hiDataInsertOption, new InsertCallback());
        LogUtil.a(TAG, "after insertHiHealthData ");
        return true;
    }

    private List<HiHealthData> setUploadMinuteToList() {
        byte bByteValue;
        ArrayList arrayList = new ArrayList(16);
        for (Map.Entry<Integer, Byte> entry : this.mIntensityDataMap.entrySet()) {
            if (entry != null && (bByteValue = entry.getValue().byteValue()) != 0) {
                if (bByteValue != 9 && bByteValue != 27 && bByteValue != 17 && bByteValue != 18) {
                    LogUtil.e(TAG, " sportType unkown should not happen");
                    return arrayList;
                }
                HiHealthData hiHealthData = new HiHealthData();
                long jIntValue = (((long) entry.getKey().intValue()) * 60000) + this.mStartTimeBySecond;
                hiHealthData.setTimeInterval(jIntValue, 60000 + jIntValue);
                hiHealthData.setValue(8);
                hiHealthData.setType(7);
                hiHealthData.setDeviceUuid(hbv.a(this.mContext));
                arrayList.add(hiHealthData);
            }
        }
        return arrayList;
    }

    static class InsertCallback implements HiDataOperateListener {
        private InsertCallback() {
        }

        @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
        public void onResult(int i, Object obj) {
            if (obj != null) {
                LogUtil.a(IntensityManager.TAG, "InsertCallBack errorCode = ", Integer.valueOf(i));
            } else {
                LogUtil.j(IntensityManager.TAG, "InsertCallBack errorCode = ", Integer.valueOf(i), " obj == null ");
            }
        }
    }

    private boolean isHandleRowIntensity(int i, List<njh> list, List<nji> list2) {
        int i2;
        LogUtil.a(TAG, "Start to handle Row Intensity ");
        if (isHandlePowerIntensity(i, list)) {
            return true;
        }
        if (!njy.e(list2)) {
            LogUtil.a(TAG, "paddleFrequencyList.size() = ", Integer.valueOf(list2.size()));
            int i3 = 0;
            while (i3 < list2.size()) {
                int i4 = i3;
                int iC = 0;
                while (true) {
                    i2 = i3 + 12;
                    if (i4 >= i2 || i4 >= list2.size()) {
                        break;
                    }
                    iC += (int) list2.get(i4).c();
                    i4++;
                }
                if (iC / 12 > 25) {
                    this.mIntensityDataMap.put(Integer.valueOf(i3 / 12), Byte.valueOf((byte) i));
                }
                i3 = i2;
            }
            return true;
        }
        LogUtil.j(TAG, "handle Row Intensity failed");
        return false;
    }

    private boolean isHandleBikeIntensity(int i, List<njh> list, List<gzr> list2, List<Integer> list3) {
        int i2;
        LogUtil.a(TAG, "Start to handle Bike Intensity");
        if (isHandlePowerIntensity(i, list)) {
            return true;
        }
        if (!njy.e(list2) && !njy.e(list3)) {
            LogUtil.a(TAG, "cadenceDataList.size() = ", Integer.valueOf(list2.size()), "resistanceList.size() = ", Integer.valueOf(list3.size()));
            if (list3.size() * 12 > list2.size() + 11 || list3.size() * 12 < list2.size()) {
                LogUtil.j(TAG, "ParamInvalidException, resistanceList.size() does not match cadenceDataList.size() ");
                return false;
            }
            int i3 = 0;
            while (i3 < list2.size()) {
                int i4 = i3;
                int iC = 0;
                while (true) {
                    i2 = i3 + 12;
                    if (i4 >= i2 || i4 >= list2.size()) {
                        break;
                    }
                    iC += list2.get(i4).c();
                    i4++;
                }
                int i5 = iC / 12;
                int i6 = i3 / 12;
                int iIntValue = list3.get(i6).intValue();
                if (((iIntValue == 1 || iIntValue == 2) && i5 > 80) || ((iIntValue >= 3 && iIntValue <= 5 && i5 > 60) || (iIntValue >= 6 && i5 > 30))) {
                    this.mIntensityDataMap.put(Integer.valueOf(i6), Byte.valueOf((byte) i));
                }
                i3 = i2;
            }
            return true;
        }
        LogUtil.j(TAG, "handle Bike Intensity failed");
        return false;
    }

    private boolean isHandleRopeSkippingIntensity(int i, List<njg> list) {
        int i2;
        LogUtil.a(TAG, "Start to handle RopeSkipping Intensity");
        if (!njy.e(list)) {
            int i3 = 0;
            while (i3 < list.size()) {
                int i4 = i3;
                int iC = 0;
                while (true) {
                    i2 = i3 + 12;
                    if (i4 >= i2 || i4 >= list.size()) {
                        break;
                    }
                    iC += list.get(i4).c();
                    i4++;
                }
                if (iC / 12 > 20) {
                    this.mIntensityDataMap.put(Integer.valueOf(i3 / 12), Byte.valueOf((byte) i));
                }
                i3 = i2;
            }
            return true;
        }
        LogUtil.j(TAG, "handle RopeSkipping Intensity failed");
        return false;
    }

    @Override // com.huawei.health.sportservice.manager.BaseIntensityManager, com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        super.onStartSport();
        long jCurrentTimeMillis = System.currentTimeMillis() - (System.currentTimeMillis() % 60000);
        this.mStartTimeBySecond = jCurrentTimeMillis;
        LogUtil.a(TAG, "onStartSport() ", Long.valueOf(jCurrentTimeMillis));
    }

    @Override // com.huawei.health.sportservice.manager.BaseIntensityManager, com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        LogUtil.a(TAG, "onStopSport()");
        super.m825x32b3e3a1();
        Object data = BaseSportManager.getInstance().getData(JsUtil.DataFunc.MOTION_PATH_DATA);
        if (data instanceof MotionPath) {
            if (hbv.e(this.mSportType)) {
                MotionPath motionPath = (MotionPath) data;
                handleSportIntensity(motionPath.requestPowerList(), motionPath.requestRidePostureDataList(), motionPath.requestPaddleFrequencyList(), motionPath.requestResistanceList(), null);
            } else if (isSkip()) {
                handleSportIntensity(null, null, null, null, ((MotionPath) data).requestSkippingSpeedList());
            } else {
                LogUtil.j(TAG, "error mSportType: ", Integer.valueOf(this.mSportType));
            }
        }
    }

    private boolean isSkip() {
        return this.mSportType == 283;
    }
}
