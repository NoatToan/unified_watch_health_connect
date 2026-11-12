package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.thirdpartservice.syncdata.fit.FitEncoder.BaseMessage;
import com.huawei.ui.thirdpartservice.syncdata.fit.FitEncoder.FitDesign;
import com.huawei.ui.thirdpartservice.syncdata.fit.Sport.BaseSport;
import com.huawei.ui.thirdpartservice.syncdata.fit.Sport.Enum.RecordMsgEnum;
import com.huawei.ui.thirdpartservice.syncdata.fit.Sport.Enum.SessionMsgEnum;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes20.dex */
public class xbb extends BaseSport {
    @Override // com.huawei.ui.thirdpartservice.syncdata.fit.Sport.BaseSport
    public xas createDataMessageWithType(HiHealthData hiHealthData) {
        xas xasVar = new xas();
        int typeId = FitDesign.ActivityType.KAYAKING.getTypeId();
        int subType = hiHealthData.getSubType();
        int typeId2 = FitDesign.SubActivityType.INVALID.getTypeId();
        if (subType == 199) {
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
            LogUtil.e("FitKayaking", "sequencePath is empty");
            return;
        }
        Map<String, ContentValues> mapConstructLbsInfo = constructLbsInfo(sequencePath, j);
        if (mapConstructLbsInfo == null || mapConstructLbsInfo.isEmpty()) {
            LogUtil.e("FitKayaking", "RecordMessage is empty");
            return;
        }
        LogUtil.a("FitKayaking", "setRecordMessage ");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ContentValues> entry : mapConstructLbsInfo.entrySet()) {
            xas xasVar = new xas();
            xasVar.b((short) RecordMsgEnum.TIMESTAMP.getNum(), xat.c(Long.parseLong(entry.getKey())), RecordMsgEnum.TIMESTAMP.getType());
            ContentValues value = entry.getValue();
            xasVar.b((short) RecordMsgEnum.POSITION_LAT.getNum(), (int) ((value.getAsDouble(String.valueOf(RecordMsgEnum.POSITION_LAT.getNum())).doubleValue() * Math.pow(2.0d, 31.0d)) / 180.0d), RecordMsgEnum.POSITION_LAT.getType());
            xasVar.b((short) RecordMsgEnum.POSITION_LONG.getNum(), (int) ((value.getAsDouble(String.valueOf(RecordMsgEnum.POSITION_LONG.getNum())).doubleValue() * Math.pow(2.0d, 31.0d)) / 180.0d), RecordMsgEnum.POSITION_LONG.getType());
            xasVar.b((short) RecordMsgEnum.HEART_RATE.getNum(), value.getAsInteger(String.valueOf(RecordMsgEnum.HEART_RATE.getNum())).intValue(), RecordMsgEnum.HEART_RATE.getType());
            xasVar.e((short) RecordMsgEnum.SPEED.getNum(), (float) value.getAsDouble(String.valueOf(RecordMsgEnum.SPEED.getNum())).doubleValue(), RecordMsgEnum.SPEED.getType(), 1000.0d, 0.0d);
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
        if (!readSequencePathFiles(str, arrayList, arrayList2, arrayList3, arrayList4, arrayList5)) {
            return null;
        }
        parsePosition(treeMap, arrayList);
        parseHeart(treeMap, arrayList2);
        parseAlt(treeMap, arrayList3);
        parseSpeed(j, treeMap, arrayList4);
        parseCadence(treeMap, arrayList5);
        return treeMap;
    }
}
