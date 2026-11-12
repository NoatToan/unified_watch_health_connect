package com.huawei.ui.thirdpartservice.syncdata.fit.Sport;

import android.content.ContentValues;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.thirdpartservice.syncdata.fit.FitEncoder.FitDesign;
import com.huawei.ui.thirdpartservice.syncdata.fit.Sport.Enum.ActivityMsgEnum;
import com.huawei.ui.thirdpartservice.syncdata.fit.Sport.Enum.DeviceInfoMsgEnum;
import com.huawei.ui.thirdpartservice.syncdata.fit.Sport.Enum.FileIdMsgEnum;
import com.huawei.ui.thirdpartservice.syncdata.fit.Sport.Enum.RecordMsgEnum;
import com.huawei.ui.thirdpartservice.syncdata.fit.Sport.Enum.SessionMsgEnum;
import defpackage.qqt;
import defpackage.xas;
import defpackage.xat;
import defpackage.xau;
import defpackage.xaw;
import defpackage.xaz;
import defpackage.xcl;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes20.dex */
public abstract class BaseSport {
    protected static final int LBS_SB_DEFAULT_SIZE = 512;
    protected static final long MAX_SECONDS = 9999999999L;
    protected static final double PAUSE_LOCATION_LATITUDE = 90.0d;
    protected static final double PAUSE_LOCATION_LONGITUDE = -80.0d;
    protected static final int REAL_VALUE_INDEX = 1;
    protected static final long SECONDS_TO_MILLISECONDS = 1000;
    protected static final String SPLIT_EQUAL = "=";
    protected static final int SPLIT_LAT_INDEX = 2;
    protected static final int SPLIT_LON_INDEX = 3;
    protected static final int SPLIT_TIME_INDEX = 5;
    private static final String TAG = "BaseSport";
    protected xaz mFile;

    public abstract Map<String, ContentValues> constructLbsInfo(String str, long j);

    protected abstract xas createDataMessageWithType(HiHealthData hiHealthData);

    protected abstract void setRecordMessage(HiHealthData hiHealthData, long j);

    public File translateToFit(HiHealthData hiHealthData, String str) {
        this.mFile = new xaz();
        translateDetailInfo(hiHealthData);
        return this.mFile.b(str);
    }

    protected void translateDetailInfo(HiHealthData hiHealthData) {
        createFileIdMesg();
        createActivityMesg(hiHealthData);
        HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) qqt.e(hiHealthData.getMetaData(), HiTrackMetaData.class);
        if (hiTrackMetaData != null) {
            setSessionMessage(hiHealthData, hiTrackMetaData);
        }
        try {
            setRecordMessage(hiHealthData, hiHealthData.getStartTime());
        } catch (NumberFormatException unused) {
            LogUtil.j(TAG, "NumberFormatException");
        }
    }

    protected boolean isPausePoint(double d, double d2) {
        return Math.abs(PAUSE_LOCATION_LATITUDE - d) < 1.0E-6d && Math.abs(PAUSE_LOCATION_LONGITUDE - d2) < 1.0E-6d;
    }

    protected void createFileIdMesg() {
        xas xasVar = new xas();
        xasVar.b((short) FileIdMsgEnum.TYPE.getNum(), 4, FileIdMsgEnum.TYPE.getType());
        xasVar.b((short) FileIdMsgEnum.MANUFACTURE.getNum(), 255, FileIdMsgEnum.MANUFACTURE.getType());
        xasVar.b((short) FileIdMsgEnum.PRODUCT.getNum(), 1, FileIdMsgEnum.PRODUCT.getType());
        xasVar.b((short) FileIdMsgEnum.TIME_CREATED.getNum(), xat.c(), FileIdMsgEnum.TIME_CREATED.getType());
        this.mFile.c(new xau(FitDesign.MessageNum.FILE_ID, xasVar));
        this.mFile.c(xasVar);
    }

    protected void createActivityMesg(HiHealthData hiHealthData) {
        xas xasVar = new xas();
        xasVar.b((short) ActivityMsgEnum.TIMESTAMP.getNum(), xat.c(), ActivityMsgEnum.TIMESTAMP.getType(), 1.0d, 0.0d);
        xasVar.b((short) ActivityMsgEnum.LOCAL_TIMESTAMP.getNum(), xat.b(), ActivityMsgEnum.TIMESTAMP.getType(), 1.0d, 0.0d);
        this.mFile.c(new xau(FitDesign.MessageNum.ACTIVITY, xasVar));
        this.mFile.c(xasVar);
    }

    protected void setSessionMessage(HiHealthData hiHealthData, HiTrackMetaData hiTrackMetaData) {
        xas xasVarCreateDataMessageWithType = createDataMessageWithType(hiHealthData);
        xasVarCreateDataMessageWithType.e((short) SessionMsgEnum.TOTAL_ELAPSED_TIME.getNum(), TimeUnit.MILLISECONDS.toSeconds(hiTrackMetaData.getTotalTime()), SessionMsgEnum.TOTAL_ELAPSED_TIME.getType(), 1000.0d, 0.0d);
        xasVarCreateDataMessageWithType.e((short) SessionMsgEnum.TOTAL_DISTANCE.getNum(), hiTrackMetaData.getTotalDistance(), SessionMsgEnum.TOTAL_DISTANCE.getType(), 100.0d, 0.0d);
        xasVarCreateDataMessageWithType.b((short) SessionMsgEnum.TOTAL_CALORIES.getNum(), hiTrackMetaData.getTotalCalories() / 1000, SessionMsgEnum.TOTAL_CALORIES.getType());
        xasVarCreateDataMessageWithType.b((short) SessionMsgEnum.START_TIME.getNum(), xat.c(hiHealthData.getStartTime()), SessionMsgEnum.START_TIME.getType());
        float avgPace = hiTrackMetaData.getAvgPace();
        if (avgPace != 0.0f) {
            xasVarCreateDataMessageWithType.e((short) SessionMsgEnum.AVG_SPEED.getNum(), 1000.0f / avgPace, SessionMsgEnum.AVG_SPEED.getType(), 1000.0d, 0.0d);
        }
        float bestPace = hiTrackMetaData.getBestPace();
        if (bestPace != 0.0f) {
            xasVarCreateDataMessageWithType.e((short) SessionMsgEnum.MAX_SPEED.getNum(), 1000.0f / bestPace, SessionMsgEnum.MAX_SPEED.getType(), 1000.0d, 0.0d);
        }
        xasVarCreateDataMessageWithType.b((short) SessionMsgEnum.AVG_HEART_RATE.getNum(), hiTrackMetaData.getAvgHeartRate(), SessionMsgEnum.AVG_HEART_RATE.getType());
        this.mFile.c(new xau(FitDesign.MessageNum.SESSION, xasVarCreateDataMessageWithType));
        this.mFile.c(xasVarCreateDataMessageWithType);
    }

    protected void createDeviceInfoMesg(HiHealthData hiHealthData) {
        xas xasVar = new xas();
        xasVar.b((short) DeviceInfoMsgEnum.TIMESTAMP.getNum(), xat.c(), DeviceInfoMsgEnum.TIMESTAMP.getType(), 1.0d, 0.0d);
        xasVar.a((short) DeviceInfoMsgEnum.DEVICE_INDEX.getNum(), hiHealthData.getDeviceId(), DeviceInfoMsgEnum.DEVICE_INDEX.getType(), 1.0d, 0.0d);
        xasVar.a((short) DeviceInfoMsgEnum.MANUFACTURE.getNum(), 255, DeviceInfoMsgEnum.MANUFACTURE.getType(), 1.0d, 0.0d);
        xasVar.a((short) DeviceInfoMsgEnum.PRODUCT.getNum(), 0, DeviceInfoMsgEnum.PRODUCT.getType(), 1.0d, 0.0d);
        xasVar.d((short) DeviceInfoMsgEnum.PRODUCT_NAME.getNum(), "huawei watch gt5", DeviceInfoMsgEnum.PRODUCT_NAME.getType(), 1.0d, 0.0d);
        this.mFile.c(new xau(FitDesign.MessageNum.DEVICE_INFO, xasVar));
        this.mFile.c(xasVar);
    }

    protected String getSequencePath(HiHealthData hiHealthData) {
        try {
            String strC = CommonUtil.c(BaseApplication.b().getFilesDir().getCanonicalPath());
            if (TextUtils.isEmpty(strC)) {
                LogUtil.j(TAG, "readTemporaryMotionPath savePath is empty");
                return null;
            }
            return xcl.d(strC, hiHealthData.getSequenceFileUrl());
        } catch (IOException e) {
            LogUtil.e(TAG, LogAnonymous.b(e));
            return null;
        }
    }

    protected void parsePosition(Map<String, ContentValues> map, ArrayList<String> arrayList) {
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String[] strArrSplit = it.next().split(";");
            double d = Double.parseDouble(strArrSplit[2].split("=")[1]);
            double d2 = Double.parseDouble(strArrSplit[3].split("=")[1]);
            if (!isPausePoint(d, d2)) {
                long j = (long) Double.parseDouble(strArrSplit[5].split("=")[1]);
                if (j < MAX_SECONDS) {
                    j *= 1000;
                }
                LogUtil.a(TAG, "parse in POSITION_LAT:", Double.valueOf(d), " POSITION_LONG:", Double.valueOf(d2), " time:", Long.valueOf(j));
                ContentValues contentValuesObtainContentValues = obtainContentValues(map, j);
                contentValuesObtainContentValues.put(String.valueOf(RecordMsgEnum.POSITION_LAT.getNum()), Double.valueOf(d));
                contentValuesObtainContentValues.put(String.valueOf(RecordMsgEnum.POSITION_LONG.getNum()), Double.valueOf(d2));
                map.put(String.valueOf(j), contentValuesObtainContentValues);
            }
        }
    }

    protected void parseHeart(Map<String, ContentValues> map, ArrayList<String> arrayList) {
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String[] strArrSplit = it.next().split(";");
            long j = Long.parseLong(strArrSplit[1].split("=")[1]);
            if (j < MAX_SECONDS) {
                j *= 1000;
            }
            int i = Integer.parseInt(strArrSplit[2].split("=")[1]);
            ContentValues contentValuesObtainContentValues = obtainContentValues(map, j);
            contentValuesObtainContentValues.put(String.valueOf(RecordMsgEnum.HEART_RATE.getNum()), Integer.valueOf(i));
            map.put(String.valueOf(j), contentValuesObtainContentValues);
        }
    }

    protected void parseAlt(Map<String, ContentValues> map, ArrayList<String> arrayList) {
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String[] strArrSplit = it.next().split(";");
            long j = Long.parseLong(strArrSplit[1].split("=")[1]);
            if (j < MAX_SECONDS) {
                j *= 1000;
            }
            double d = Double.parseDouble(strArrSplit[2].split("=")[1]);
            ContentValues contentValuesObtainContentValues = obtainContentValues(map, j);
            contentValuesObtainContentValues.put(String.valueOf(RecordMsgEnum.ALTITUDE.getNum()), Double.valueOf(d));
            map.put(String.valueOf(j), contentValuesObtainContentValues);
        }
    }

    protected void parseCadence(Map<String, ContentValues> map, ArrayList<String> arrayList) {
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String[] strArrSplit = it.next().split(";");
            long j = Long.parseLong(strArrSplit[1].split("=")[1]);
            if (j < MAX_SECONDS) {
                j *= 1000;
            }
            int i = Integer.parseInt(strArrSplit[2].split("=")[1]);
            ContentValues contentValuesObtainContentValues = obtainContentValues(map, j);
            contentValuesObtainContentValues.put(String.valueOf(RecordMsgEnum.CADENCE.getNum()), Integer.valueOf(i / 2));
            map.put(String.valueOf(j), contentValuesObtainContentValues);
        }
    }

    protected void parseSpeed(long j, Map<String, ContentValues> map, ArrayList<String> arrayList) {
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String[] strArrSplit = it.next().split(";");
            long j2 = Long.parseLong(strArrSplit[1].split("=")[1]) + j;
            double d = Double.parseDouble(strArrSplit[2].split("=")[1]);
            ContentValues contentValuesObtainContentValues = obtainContentValues(map, j2);
            contentValuesObtainContentValues.put(String.valueOf(RecordMsgEnum.SPEED.getNum()), Double.valueOf(d / 10.0d));
            map.put(String.valueOf(j2), contentValuesObtainContentValues);
        }
    }

    protected ContentValues obtainContentValues(Map<String, ContentValues> map, long j) {
        ContentValues contentValues = map.get(String.valueOf(j));
        if (contentValues != null) {
            return contentValues;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put(String.valueOf(RecordMsgEnum.POSITION_LAT.getNum()), xaw.f);
        contentValues2.put(String.valueOf(RecordMsgEnum.POSITION_LONG.getNum()), xaw.f);
        contentValues2.put(String.valueOf(RecordMsgEnum.ALTITUDE.getNum()), xaw.i);
        contentValues2.put(String.valueOf(RecordMsgEnum.SPEED.getNum()), xaw.i);
        contentValues2.put(String.valueOf(RecordMsgEnum.HEART_RATE.getNum()), xaw.o);
        contentValues2.put(String.valueOf(RecordMsgEnum.CADENCE.getNum()), xaw.o);
        return contentValues2;
    }

    protected boolean readSequencePathFiles(String str, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, ArrayList<String> arrayList4, ArrayList<String> arrayList5) {
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
                try {
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line != null) {
                                if (line.startsWith(MotionPath.LBS_DATA_MAP_TAG)) {
                                    arrayList.add(line);
                                    LogUtil.a(TAG, "lbsList line: ", line);
                                } else if (line.startsWith(MotionPath.HEART_RATE_LIST_TAG)) {
                                    arrayList2.add(line);
                                    LogUtil.a(TAG, "heartList line: ", line);
                                } else if (line.startsWith(MotionPath.ALTITUDE_TAG)) {
                                    arrayList3.add(line);
                                    LogUtil.a(TAG, "altList line: ", line);
                                } else if (line.startsWith(MotionPath.REAL_TIME_SPEED_TAG)) {
                                    arrayList4.add(line);
                                    LogUtil.a(TAG, "paceList line: ", line);
                                } else if (line.startsWith(MotionPath.STEP_RATE_LIST_TAG)) {
                                    if (arrayList5 != null) {
                                        arrayList5.add(line);
                                    }
                                    LogUtil.a(TAG, "cadenceList line: ", line);
                                }
                            } else {
                                bufferedReader.close();
                                inputStreamReader.close();
                                fileInputStream.close();
                                return true;
                            }
                        } catch (Throwable th) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                try {
                    fileInputStream.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
                throw th5;
            }
        } catch (IOException | NumberFormatException e) {
            LogUtil.j(TAG, "Generate LbsInfo  error: ", e.getMessage());
            return false;
        }
    }
}
