package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.thirdpartservice.syncdata.fit.FitEncoder.BaseMessage;
import com.huawei.ui.thirdpartservice.syncdata.fit.FitEncoder.FitDesign;
import com.huawei.ui.thirdpartservice.syncdata.fit.Sport.BaseSport;
import com.huawei.ui.thirdpartservice.syncdata.fit.Sport.Enum.RecordMsgEnum;
import com.huawei.ui.thirdpartservice.syncdata.fit.Sport.Enum.SessionMsgEnum;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes20.dex */
public class xbd extends BaseSport {
    @Override // com.huawei.ui.thirdpartservice.syncdata.fit.Sport.BaseSport
    public xas createDataMessageWithType(HiHealthData hiHealthData) {
        xas xasVar = new xas();
        int typeId = FitDesign.ActivityType.ROWING.getTypeId();
        int subType = hiHealthData.getSubType();
        int typeId2 = FitDesign.SubActivityType.INVALID.getTypeId();
        if (subType == 274) {
            typeId2 = FitDesign.SubActivityType.GENERIC.getTypeId();
        }
        xasVar.b((short) SessionMsgEnum.SPORT.getNum(), typeId, SessionMsgEnum.SPORT.getType());
        xasVar.b((short) SessionMsgEnum.SUB_SPORT.getNum(), typeId2, SessionMsgEnum.SUB_SPORT.getType());
        return xasVar;
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.fit.Sport.BaseSport
    public void setRecordMessage(HiHealthData hiHealthData, long j) {
        String sequencePath = getSequencePath(hiHealthData);
        if (TextUtils.isEmpty(sequencePath)) {
            LogUtil.e("FitRowing", "sequencePath is empty");
            return;
        }
        Map<String, ContentValues> mapConstructLbsInfo = constructLbsInfo(sequencePath, j);
        if (mapConstructLbsInfo == null || mapConstructLbsInfo.isEmpty()) {
            LogUtil.e("FitRowing", "RecordMessage is empty");
            return;
        }
        LogUtil.a("FitRowing", "setRecordMessage ");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ContentValues> entry : mapConstructLbsInfo.entrySet()) {
            xas xasVar = new xas();
            xasVar.b((short) RecordMsgEnum.TIMESTAMP.getNum(), xat.c(Long.parseLong(entry.getKey())), RecordMsgEnum.TIMESTAMP.getType());
            ContentValues value = entry.getValue();
            xasVar.b((short) RecordMsgEnum.HEART_RATE.getNum(), value.getAsInteger(String.valueOf(RecordMsgEnum.HEART_RATE.getNum())).intValue(), RecordMsgEnum.HEART_RATE.getType());
            xasVar.b((short) RecordMsgEnum.CADENCE.getNum(), value.getAsInteger(String.valueOf(RecordMsgEnum.CADENCE.getNum())).intValue(), RecordMsgEnum.CADENCE.getType());
            arrayList.add(xasVar);
        }
        this.mFile.c(new xau(FitDesign.MessageNum.RECORD, (BaseMessage) arrayList.get(0)));
        this.mFile.b(arrayList);
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.fit.Sport.BaseSport
    public Map<String, ContentValues> constructLbsInfo(String str, long j) {
        TreeMap treeMap = new TreeMap(Comparator.comparingLong(new xba()));
        ArrayList<String> arrayList = new ArrayList<>(512);
        ArrayList<String> arrayList2 = new ArrayList<>(512);
        ArrayList<String> arrayList3 = new ArrayList<>(512);
        ArrayList<String> arrayList4 = new ArrayList<>(512);
        ArrayList<String> arrayList5 = new ArrayList<>(512);
        ArrayList<String> arrayList6 = new ArrayList<>(512);
        if (!a(str, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6)) {
            return null;
        }
        parsePosition(treeMap, arrayList);
        parseHeart(treeMap, arrayList2);
        parseAlt(treeMap, arrayList3);
        parseSpeed(j, treeMap, arrayList4);
        parseCadence(treeMap, arrayList5);
        e(treeMap, arrayList6);
        return treeMap;
    }

    protected boolean a(String str, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, ArrayList<String> arrayList4, ArrayList<String> arrayList5, ArrayList<String> arrayList6) {
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
                                    LogUtil.a("FitRowing", "lbsList line: ", line);
                                } else if (line.startsWith(MotionPath.HEART_RATE_LIST_TAG)) {
                                    arrayList2.add(line);
                                    LogUtil.a("FitRowing", "heartList line: ", line);
                                } else if (line.startsWith(MotionPath.ALTITUDE_TAG)) {
                                    arrayList3.add(line);
                                    LogUtil.a("FitRowing", "altList line: ", line);
                                } else if (line.startsWith(MotionPath.REAL_TIME_SPEED_TAG)) {
                                    arrayList4.add(line);
                                    LogUtil.a("FitRowing", "paceList line: ", line);
                                } else if (line.startsWith(MotionPath.STEP_RATE_LIST_TAG)) {
                                    if (arrayList5 != null) {
                                        arrayList5.add(line);
                                    }
                                    LogUtil.a("FitRowing", "cadenceList line: ", line);
                                } else if (line.startsWith(MotionPath.PADDLE_TAG)) {
                                    if (arrayList6 != null) {
                                        arrayList6.add(line);
                                    }
                                    LogUtil.a("FitRowing", "pad cadenceList line: ", line);
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
            LogUtil.j("FitRowing", "Generate LbsInfo  error: ", e.getMessage());
            return false;
        }
    }

    protected void e(Map<String, ContentValues> map, ArrayList<String> arrayList) {
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String[] strArrSplit = it.next().split(";");
            long j = Long.parseLong(strArrSplit[1].split("=")[1]);
            if (j < 9999999999L) {
                j *= 1000;
            }
            int i = Integer.parseInt(strArrSplit[2].split("=")[1]);
            ContentValues contentValuesObtainContentValues = obtainContentValues(map, j);
            contentValuesObtainContentValues.put(String.valueOf(RecordMsgEnum.CADENCE.getNum()), Integer.valueOf(i));
            map.put(String.valueOf(j), contentValuesObtainContentValues);
        }
    }
}
