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
public class xax extends BaseSport {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f52671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f52672b;

    public xax(int i, int i2) {
        this.f52671a = i;
        this.f52672b = i2;
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.fit.Sport.BaseSport
    public xas createDataMessageWithType(HiHealthData hiHealthData) {
        LogUtil.a("FitBasicSport", "createDataMessageWithType type is : ", Integer.valueOf(this.f52671a), "subType is : ", Integer.valueOf(this.f52672b));
        xas xasVar = new xas();
        xasVar.b((short) SessionMsgEnum.SPORT.getNum(), this.f52671a, SessionMsgEnum.SPORT.getType());
        xasVar.b((short) SessionMsgEnum.SUB_SPORT.getNum(), this.f52672b, SessionMsgEnum.SUB_SPORT.getType());
        return xasVar;
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.fit.Sport.BaseSport
    public void setRecordMessage(HiHealthData hiHealthData, long j) {
        String sequencePath = getSequencePath(hiHealthData);
        if (TextUtils.isEmpty(sequencePath)) {
            LogUtil.e("FitBasicSport", "sequencePath is empty");
            return;
        }
        Map<String, ContentValues> mapConstructLbsInfo = constructLbsInfo(sequencePath, j);
        if (mapConstructLbsInfo == null || mapConstructLbsInfo.isEmpty()) {
            LogUtil.e("FitBasicSport", "RecordMessage is empty");
            return;
        }
        LogUtil.a("FitBasicSport", "setRecordMessage ");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ContentValues> entry : mapConstructLbsInfo.entrySet()) {
            xas xasVar = new xas();
            xasVar.b((short) RecordMsgEnum.TIMESTAMP.getNum(), xat.c(Long.parseLong(entry.getKey())), RecordMsgEnum.TIMESTAMP.getType());
            xasVar.b((short) RecordMsgEnum.HEART_RATE.getNum(), entry.getValue().getAsInteger(String.valueOf(RecordMsgEnum.HEART_RATE.getNum())).intValue(), RecordMsgEnum.HEART_RATE.getType());
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
