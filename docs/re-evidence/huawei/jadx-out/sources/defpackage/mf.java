package defpackage;

import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class mf {
    public static DataReportRequest b(ml mlVar) {
        DataReportRequest dataReportRequest = new DataReportRequest();
        if (mlVar == null) {
            return null;
        }
        dataReportRequest.os = mlVar.f41853b;
        dataReportRequest.rpcVersion = mlVar.j;
        dataReportRequest.bizType = "1";
        HashMap map = new HashMap();
        dataReportRequest.bizData = map;
        map.put("apdid", mlVar.f41854c);
        dataReportRequest.bizData.put("apdidToken", mlVar.d);
        dataReportRequest.bizData.put("umidToken", mlVar.f41852a);
        dataReportRequest.bizData.put("dynamicKey", mlVar.e);
        dataReportRequest.deviceData = mlVar.g;
        return dataReportRequest;
    }

    public static md e(DataReportResult dataReportResult) {
        md mdVar = new md();
        if (dataReportResult == null) {
            return null;
        }
        mdVar.d = dataReportResult.success;
        mdVar.f41641c = dataReportResult.resultCode;
        Map<String, String> map = dataReportResult.resultData;
        if (map != null) {
            mdVar.f41449a = map.get("apdid");
            mdVar.e = map.get("apdidToken");
            mdVar.j = map.get("dynamicKey");
            mdVar.g = map.get(HwExerciseConstants.JSON_NAME_TIME_INTERVAL);
            mdVar.i = map.get("webrtcUrl");
            mdVar.h = "";
            String str = map.get("drmSwitch");
            if (kj.e(str)) {
                if (str.length() >= 1) {
                    mdVar.f41450b = "" + str.charAt(0);
                }
                if (str.length() >= 3) {
                    mdVar.f = "" + str.charAt(2);
                }
            }
            if (map.containsKey("apse_degrade")) {
                mdVar.m = map.get("apse_degrade");
            }
        }
        return mdVar;
    }
}
