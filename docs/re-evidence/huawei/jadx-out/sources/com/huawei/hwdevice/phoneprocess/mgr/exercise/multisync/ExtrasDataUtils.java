package com.huawei.hwdevice.phoneprocess.mgr.exercise.multisync;

import android.text.TextUtils;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.DataHeader;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.WorkoutDataInfo;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.gzt;
import health.compact.a.CommonUtil;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class ExtrasDataUtils {
    private static final int ALTITUDE = 32;
    private static final int ALTITUDE_LENGTH = 8;
    private static final int BITMAP_LENGTH = 4;
    private static final String BIT_MAP = "bit_map";
    private static final int BYTE_BIT_LENGTH = 8;
    private static final int CADENCE_INDEX = 0;
    private static final int CALORIE = 128;
    private static final int CALORIE_LENGTH = 4;
    private static final char CHAR_SUPPORT = "1".toCharArray()[0];
    private static final String DATA_LENGTH = "dataLength";
    private static final int DATA_LENGTH_LENGTH = 2;
    private static final String DATA_NUMBER = "dataNumber";
    private static final int DATA_NUMBER_LENGTH = 4;
    private static final int EVERSION_EXCURSION_INDEX = 8;
    private static final int EXTRA_AVERAGE_HANG_TIME_LENGTH = 4;
    private static final int EXTRA_CADENCE_LENGTH = 4;
    private static final int EXTRA_DATA = 64;
    public static final String EXTRA_DATA_BITMAP = "";
    public static final int EXTRA_DATA_LENGTH = 0;
    private static final int EXTRA_EVERSION_EXCURSION_LENGTH = 2;
    private static final int EXTRA_FORE_FOOT_STRIKE_PATTERN_LENGTH = 4;
    private static final int EXTRA_GROUND_CONTACT_TIME_LENGTH = 4;
    private static final int EXTRA_GROUND_IMPACT_ACCELERATION_LENGTH = 2;
    private static final int EXTRA_HANG_TIME_RATE_LENGTH = 4;
    private static final int EXTRA_HIND_PAW_STRIKE_PATTERN_LENGTH = 2;
    private static final int EXTRA_STEP_LENGTH = 4;
    private static final int EXTRA_SWING_ANGLE_LENGTH = 2;
    private static final int EXTRA_VERTICAL_STRIDE_RATIO_LENGTH = 4;
    private static final int EXTRA_WHOLE_FOOT_STRIKE_PATTERN_LENGTH = 2;
    private static final int FIX_HEADER_LENGTH = 28;
    private static final int FORE_FOOT_STRIKE_PATTERN_INDEX = 5;
    private static final String FRAME_ID = "frameId";
    private static final int FRAME_ID_LENGTH = 4;
    private static final int GROUND_CONTACT_TIME_INDEX = 2;
    private static final int GROUND_IMPACT_ACCELERATION_INDEX = 3;
    private static final int HANG_TIME_INDEX = 9;
    private static final int HEART_RATE = 1;
    private static final int HEART_RATE_LENGTH = 2;
    private static final int HIND_PAW_STRIKE_PATTERN_INDEX = 7;
    private static final int IMPACT_HANGRATE_INDEX = 10;
    private static final int ONE_HEX_LENGTH = 2;
    private static final int POWER = 512;
    private static final int PULL_FREQUENCY = 16;
    private static final int PULL_FREQUENCY_LENGTH = 4;
    private static final long REVERSE_MASK_CODE = -1;
    private static final int RIDE_CADENCE_INDEX = 11;
    private static final int SKIP_COUNT = 256;
    private static final int SPEED = 2;
    private static final int SPEED_LENGTH = 4;
    private static final String SPORT_ID = "sportId";
    private static final int SPORT_ID_LENGTH = 4;
    private static final int STEP_LENGTH_INDEX = 1;
    private static final int STEP_RATE = 4;
    private static final int STEP_RATE_LENGTH = 2;
    private static final int SWING_ANGLE_INDEX = 4;
    private static final int SWOLF = 8;
    private static final int SWOLF_LENGTH = 4;
    private static final String TAG = "ParseCompressesData";
    private static final String TIME = "time";
    private static final String TIME_INTERVAL = "timeInterval";
    private static final int TIME_INTERVAL_LENGTH = 2;
    private static final int TIME_LENGTH = 8;
    private static final int WHOLE_FOOT_STRIKE_PATTERN_INDEX = 6;
    private List<PostureExtraData> mExtraBitmapAndLength = initExtraDataMap();

    private boolean isSupportBitmap(int i, int i2) {
        return (i2 & i) == i;
    }

    public void parseHeader(String str, DataHeader dataHeader) {
        if (!checkHeader(str)) {
            LogUtil.j(TAG, "parseHeader header is wrong.");
            return;
        }
        if (dataHeader == null) {
            LogUtil.j(TAG, "header is null.");
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(SPORT_ID, 4);
        linkedHashMap.put(FRAME_ID, 4);
        linkedHashMap.put("time", 8);
        linkedHashMap.put("timeInterval", 2);
        linkedHashMap.put(DATA_NUMBER, 4);
        linkedHashMap.put(DATA_LENGTH, 2);
        linkedHashMap.put(BIT_MAP, 4);
        int i = 0;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int iIntValue = ((Integer) entry.getValue()).intValue() + i;
            setDataToDataHeader(dataHeader, (String) entry.getKey(), str.substring(i, iIntValue));
            i = iIntValue;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    private void setDataToDataHeader(DataHeader dataHeader, String str, String str2) {
        LogUtil.d(TAG, "dataKey : ", str, " value : ", str2);
        str.hashCode();
        switch (str) {
            case "sportId":
                dataHeader.setSportId(CommonUtil.v(str2));
                break;
            case "frameId":
                dataHeader.setFrameId(CommonUtil.v(str2));
                break;
            case "bit_map":
                dataHeader.setBitmap(CommonUtil.v(str2));
                break;
            case "time":
                dataHeader.setTime(CommonUtil.v(str2));
                break;
            case "timeInterval":
                dataHeader.setTimeInterval(CommonUtil.v(str2));
                break;
            case "dataLength":
                dataHeader.setDataLength(CommonUtil.v(str2));
                break;
            case "dataNumber":
                dataHeader.setDataNumber(CommonUtil.v(str2));
                break;
            default:
                LogUtil.j(TAG, "wrong parse.");
                break;
        }
    }

    private boolean checkHeader(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.length() == 28;
        }
        LogUtil.j(TAG, "parseHeader header is empty.");
        return false;
    }

    public void parseFrameData(String str, int i, String str2, DataHeader dataHeader, List<WorkoutDataInfo> list) {
        if (dataHeader == null) {
            LogUtil.j(TAG, "parseFrameData dataHeader is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "parseFrameData data is null.");
            return;
        }
        if (i < 0) {
            LogUtil.j(TAG, "extraLength is wrong : ", Integer.valueOf(i));
            return;
        }
        int dataLength = dataHeader.getDataLength() * 2;
        int dataNumber = dataHeader.getDataNumber();
        int length = str.length();
        if (length % dataLength != 0 || length / dataLength != dataNumber) {
            LogUtil.j(TAG, "wrong frame data.");
            return;
        }
        LinkedHashMap<Integer, Integer> linkedHashMapInitDataMap = initDataMap(i);
        int bitmap = dataHeader.getBitmap();
        if (!checkDataLength(linkedHashMapInitDataMap, bitmap, dataLength)) {
            LogUtil.j(TAG, "bitmap calculate data length is not equal device dataLength");
            return;
        }
        if (!checkExtraData(str2, i)) {
            LogUtil.j(TAG, "extra bitmap calculate data length less than device extraLength");
            return;
        }
        int i2 = 0;
        int i3 = 0;
        while (i3 < dataNumber) {
            int i4 = i2 + dataLength;
            String strSubstring = str.substring(i2, i4);
            WorkoutDataInfo workoutDataInfo = new WorkoutDataInfo();
            parseData(bitmap, strSubstring, linkedHashMapInitDataMap, str2, workoutDataInfo);
            list.add(workoutDataInfo);
            i3++;
            i2 = i4;
        }
    }

    private LinkedHashMap<Integer, Integer> initDataMap(int i) {
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>(16);
        linkedHashMap.put(1, 2);
        linkedHashMap.put(2, 4);
        linkedHashMap.put(4, 2);
        linkedHashMap.put(8, 4);
        linkedHashMap.put(16, 4);
        linkedHashMap.put(32, 8);
        linkedHashMap.put(64, Integer.valueOf(i));
        linkedHashMap.put(128, 4);
        linkedHashMap.put(256, 4);
        linkedHashMap.put(512, 4);
        return linkedHashMap;
    }

    private List<PostureExtraData> initExtraDataMap() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new PostureExtraData(4, null));
        linkedList.add(new PostureExtraData(4, "sl"));
        linkedList.add(new PostureExtraData(4, null));
        linkedList.add(new PostureExtraData(2, null));
        linkedList.add(new PostureExtraData(4, null));
        linkedList.add(new PostureExtraData(2, null));
        linkedList.add(new PostureExtraData(2, null));
        linkedList.add(new PostureExtraData(2, null));
        linkedList.add(new PostureExtraData(2, null));
        linkedList.add(new PostureExtraData(4, null));
        linkedList.add(new PostureExtraData(4, null));
        linkedList.add(new PostureExtraData(2, null));
        linkedList.add(new PostureExtraData(4, "ap", 10.0f));
        linkedList.add(new PostureExtraData(4, "vo", 10.0f));
        linkedList.add(new PostureExtraData(4, "gtb", 100.0f));
        linkedList.add(new PostureExtraData(4, "vr", 10.0f));
        linkedList.add(new PostureExtraData(2, HwExerciseConstants.EXTRA_CEILING));
        linkedList.add(new PostureExtraData(2, HwExerciseConstants.EXTRA_TEMPERATURE));
        linkedList.add(new PostureExtraData(2, HwExerciseConstants.EXTRA_PRESSURE_OXYGEN));
        linkedList.add(new PostureExtraData(4, HwExerciseConstants.EXTRA_CNS));
        linkedList.add(new PostureExtraData(4, HwExerciseConstants.EXTEND_CYCLE_ANALOG_POWER));
        linkedList.add(new PostureExtraData(2, null));
        linkedList.add(new PostureExtraData(4, HwExerciseConstants.EXTEND_CYCLE_ANALOG_CADENCE));
        return linkedList;
    }

    private boolean checkDataLength(LinkedHashMap<Integer, Integer> linkedHashMap, int i, int i2) {
        int iIntValue = 0;
        for (Map.Entry<Integer, Integer> entry : linkedHashMap.entrySet()) {
            if (isSupportBitmap(entry.getKey().intValue(), i)) {
                iIntValue += entry.getValue().intValue();
            }
        }
        boolean z = iIntValue == i2;
        if (!z) {
            LogUtil.j(TAG, "checkDataLength false. data bitmap is ", Integer.valueOf(i), ", dataLength is : ", Integer.valueOf(i2));
        }
        return z;
    }

    private boolean checkExtraData(String str, int i) {
        if (TextUtils.isEmpty(str) || i == 0) {
            LogUtil.a(TAG, "no extension data.");
            return true;
        }
        List<PostureExtraData> list = this.mExtraBitmapAndLength;
        int extraDataSize = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            LogUtil.d(TAG, "bitmap position : ", Integer.valueOf(i2));
            PostureExtraData postureExtraData = list.get(i2);
            if (isSupportBitmap(str, i2) && postureExtraData != null) {
                extraDataSize += postureExtraData.getExtraDataSize();
            }
        }
        boolean z = extraDataSize <= i;
        if (!z) {
            LogUtil.a(TAG, "extraDataBitmap : ", str, "extraLength : ", Integer.valueOf(i));
        }
        return z;
    }

    private void parseData(int i, String str, LinkedHashMap<Integer, Integer> linkedHashMap, String str2, WorkoutDataInfo workoutDataInfo) {
        int i2 = 0;
        for (Map.Entry<Integer, Integer> entry : linkedHashMap.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if (isSupportBitmap(iIntValue, i)) {
                int iIntValue2 = entry.getValue().intValue() + i2;
                setWorkoutDataInfo(str.substring(i2, iIntValue2), workoutDataInfo, iIntValue, str2);
                i2 = iIntValue2;
            }
        }
    }

    private void setWorkoutDataInfo(String str, WorkoutDataInfo workoutDataInfo, int i, String str2) {
        if (i == 1) {
            workoutDataInfo.setDataHeartRate(CommonUtil.v(str));
            return;
        }
        if (i == 2) {
            int iV = CommonUtil.v(str);
            if (iV > 32767) {
                iV -= 65536;
            }
            workoutDataInfo.setDataSpeed(iV);
            return;
        }
        if (i == 4) {
            workoutDataInfo.setDataStepRate(CommonUtil.v(str));
            return;
        }
        if (i == 8) {
            workoutDataInfo.setDataSwolf(CommonUtil.v(str));
            return;
        }
        if (i == 16) {
            workoutDataInfo.setDataSwimRate(CommonUtil.v(str));
            return;
        }
        if (i == 32) {
            workoutDataInfo.setDataAttitude((int) CommonUtil.x(str));
            return;
        }
        if (i == 64) {
            parseExtraData(str, str2, workoutDataInfo);
            return;
        }
        if (i == 128) {
            workoutDataInfo.setDataCalories(CommonUtil.v(str));
            return;
        }
        if (i == 256) {
            workoutDataInfo.setDataFrequency(CommonUtil.v(str));
        } else if (i == 512) {
            workoutDataInfo.setRidePower(CommonUtil.v(str));
        } else {
            LogUtil.j(TAG, "no support.");
        }
    }

    private void parseExtraData(String str, String str2, WorkoutDataInfo workoutDataInfo) {
        List<PostureExtraData> list = this.mExtraBitmapAndLength;
        LinkedHashMap<String, String> extraDataMap = workoutDataInfo.getExtraDataMap();
        gzt gztVar = null;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            PostureExtraData postureExtraData = list.get(i2);
            if (isSupportBitmap(str2, i2) && postureExtraData != null) {
                int extraDataSize = i + postureExtraData.getExtraDataSize();
                String strSubstring = str.substring(i, extraDataSize);
                if (i2 < 16 && gztVar == null) {
                    gztVar = new gzt();
                }
                gzt gztVar2 = gztVar;
                parsePostureDataInfo(gztVar2, strSubstring, i2, postureExtraData, extraDataMap);
                i = extraDataSize;
                gztVar = gztVar2;
            }
        }
        LogUtil.a(TAG, "extraDataMap: ", extraDataMap);
        workoutDataInfo.setRunPostureDataInfo(gztVar);
    }

    private void parsePostureDataInfo(gzt gztVar, String str, int i, PostureExtraData postureExtraData, LinkedHashMap<String, String> linkedHashMap) {
        switch (i) {
            case 0:
                gztVar.b(CommonUtil.v(str));
                break;
            case 1:
                gztVar.j(CommonUtil.v(str));
                break;
            case 2:
                gztVar.a(CommonUtil.v(str));
                break;
            case 3:
                gztVar.c(CommonUtil.v(str));
                break;
            case 4:
                gztVar.k(CommonUtil.v(str));
                break;
            case 5:
                gztVar.e(CommonUtil.v(str));
                break;
            case 6:
                gztVar.o(CommonUtil.v(str));
                break;
            case 7:
                gztVar.f(CommonUtil.v(str));
                break;
            case 8:
                gztVar.d(CommonUtil.v(str));
                break;
            case 9:
                gztVar.h(CommonUtil.v(str));
                break;
            case 10:
                gztVar.g(CommonUtil.v(str));
                break;
            case 11:
                gztVar.i(CommonUtil.v(str));
                break;
            default:
                postureExtraDataDeal(gztVar, postureExtraData, str, i, linkedHashMap);
                break;
        }
    }

    private void postureExtraDataDeal(gzt gztVar, PostureExtraData postureExtraData, String str, int i, LinkedHashMap<String, String> linkedHashMap) {
        String strValueOf;
        if (postureExtraData.getExtraDataName() == null) {
            LogUtil.d(TAG, "postureExtraDataDeal no support bitmap position.");
            return;
        }
        if (postureExtraData.getExtraDataRatio() > 1.0f) {
            strValueOf = String.valueOf(CommonUtil.v(str) / postureExtraData.getExtraDataRatio());
        } else {
            strValueOf = String.valueOf(CommonUtil.v(str));
        }
        if (i < 16) {
            gztVar.c().put(postureExtraData.getExtraDataName(), strValueOf);
        } else {
            linkedHashMap.put(postureExtraData.getExtraDataName(), strValueOf);
        }
    }

    private boolean isSupportBitmap(String str, int i) {
        return str.length() - 1 >= i && str.charAt((str.length() - i) - 1) == CHAR_SUPPORT;
    }

    public String parseExtraBitmap(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < length) {
            int i2 = i + 2;
            sb.append(getBinaryString(str.substring(i, i2)));
            i = i2;
        }
        return sb.toString();
    }

    private String getBinaryString(String str) {
        if (str.length() != 2) {
            return "";
        }
        String binaryString = Integer.toBinaryString(CommonUtil.v(str));
        if (binaryString.length() == 8) {
            return binaryString;
        }
        StringBuilder sb = new StringBuilder();
        int length = binaryString.length();
        for (int i = 0; i < 8 - length; i++) {
            sb.append(0);
        }
        return sb.toString() + binaryString;
    }
}
