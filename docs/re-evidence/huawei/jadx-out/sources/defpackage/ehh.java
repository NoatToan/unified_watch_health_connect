package defpackage;

import com.huawei.health.ecologydevice.fitness.datastruct.HistoryData;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class ehh extends ehd {
    public HistoryData a() {
        c();
        byte[] bArrB = b();
        if (bArrB != null && bArrB.length > 0) {
            if (!d(bArrB, 0, bArrB.length - 1)) {
                LogUtil.a("PDROPE_HistoryDataPackets", "Invalid historical data.");
                return null;
            }
            LogUtil.a("PDROPE_HistoryDataPackets", "history protocolData = ", erh.a(bArrB, ""));
            HistoryData historyDataE = e(bArrB, 1);
            if (historyDataE == null || historyDataE.getHistoryDataItem() == null) {
                LogUtil.a("PDROPE_HistoryDataPackets", "parse oldParseHistoryDataPacket is error");
            } else {
                d(ehn.d(bArrB, 17, 18));
                ehg historyDataItem = historyDataE.getHistoryDataItem();
                if (historyDataItem == null) {
                    LogUtil.d("PDROPE_HistoryDataPackets", "historyDataItem is null");
                    return historyDataE;
                }
                int iD = d(bArrB, historyDataItem, 19);
                if (historyDataItem.h() == 4 || historyDataItem.h() == 5) {
                    int iD2 = ehn.d(bArrB, 17, iD);
                    historyDataItem.i(iD2);
                    LogUtil.a("PDROPE_HistoryDataPackets", "groupNum = ", Integer.valueOf(iD2));
                    historyDataItem.h(ehn.d(bArrB, 18, iD + 1));
                    int i = iD + 3;
                    ArrayList<dsl> arrayList = new ArrayList<>(iD2);
                    for (int i2 = 0; i2 < iD2; i2++) {
                        dsl dslVarC = c(bArrB, i);
                        i += 12;
                        arrayList.add(dslVarC);
                    }
                    historyDataItem.a(arrayList);
                    return historyDataE;
                }
                if (historyDataItem.h() == 3) {
                    historyDataItem.c(b(bArrB, iD));
                    return historyDataE;
                }
                LogUtil.c("PDROPE_HistoryDataPackets", "parseHistoryDataPacket, Unrecognized Rope Data!");
                return historyDataE;
            }
        }
        return null;
    }

    private int d(byte[] bArr, ehg ehgVar, int i) {
        LogUtil.a("PDROPE_HistoryDataPackets", "parsePubParam");
        ehgVar.g(ehn.d(bArr, 17, i));
        ehgVar.b(ehn.d(bArr, 17, i + 1) == 1);
        ehgVar.b(ehn.d(bArr, 18, i + 2));
        ehgVar.a(ehn.d(bArr, 18, i + 4));
        return i + 6;
    }

    private dsl c(byte[] bArr, int i) {
        if (bArr == null && bArr.length == 0) {
            return null;
        }
        dsl dslVar = new dsl();
        int iD = ehn.d(bArr, 17, i);
        dslVar.c(iD);
        dslVar.i(ehn.d(bArr, 18, i + 1));
        dslVar.f(ehn.d(bArr, 18, i + 3));
        int iD2 = ehn.d(bArr, 18, i + 5);
        dslVar.d(iD2);
        dslVar.e(ehn.d(bArr, 18, i + 7));
        int iD3 = ehn.d(bArr, 18, i + 9);
        dslVar.b(iD3);
        dslVar.a(ehn.d(bArr, 17, i + 11));
        LogUtil.a("PDROPE_HistoryDataPackets", "mRopeIntermissionNo = ", Integer.valueOf(iD), " ropeIntermissionNum =", Integer.valueOf(iD2), " avgSpeed = ", Integer.valueOf(iD3));
        return dslVar;
    }

    public HistoryData e(byte[] bArr, int i) {
        if (bArr == null || bArr.length == 0 || bArr.length < 16) {
            LogUtil.a("PDROPE_HistoryDataPackets", "RopeRealData is error");
            return null;
        }
        HistoryData historyData = new HistoryData();
        int iD = ehn.d(bArr, 17, i);
        if ((iD & 15) == 0) {
            return null;
        }
        boolean z = (iD & 32) != 0;
        LogUtil.a("PDROPE_HistoryDataPackets", "isHasMoreData = ", Boolean.valueOf(z));
        historyData.setHasMoreData(z);
        int iD2 = ehn.d(bArr, 20, i + 1);
        ehg ehgVar = new ehg();
        ehgVar.j(iD2);
        ehgVar.c(ehn.d(bArr, 18, i + 5));
        int iD3 = ehn.d(bArr, 18, i + 7);
        ehgVar.k(iD3);
        LogUtil.a("PDROPE_HistoryDataPackets", "totalSkip = ", Integer.valueOf(iD3));
        ehgVar.e(ehn.d(bArr, 18, i + 9));
        ehgVar.d(ehn.d(bArr, 18, i + 11));
        ehgVar.f(ehn.d(bArr, 18, i + 13));
        historyData.setHistoryDataItem(ehgVar);
        return historyData;
    }
}
