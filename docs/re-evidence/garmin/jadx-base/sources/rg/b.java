package rg;

import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.HashMap;
import java.util.Map;
import pg.c;

/* JADX INFO: loaded from: classes7.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f152501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static mg.b f152502b;

    public final pg.b a(c cVar) throws InterruptedException {
        DataReportRequest dataReportRequest = new DataReportRequest();
        dataReportRequest.f28435os = cVar.f137587a;
        dataReportRequest.rpcVersion = cVar.f137593g;
        dataReportRequest.bizType = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        HashMap map = new HashMap();
        dataReportRequest.bizData = map;
        map.put("apdid", cVar.f137588b);
        dataReportRequest.bizData.put("apdidToken", cVar.f137589c);
        dataReportRequest.bizData.put("umidToken", cVar.f137590d);
        dataReportRequest.bizData.put("dynamicKey", cVar.f137591e);
        dataReportRequest.deviceData = cVar.f137592f;
        mg.b bVar = f152502b;
        if (bVar.f118362b != null) {
            mg.b.f118360d = null;
            new Thread(new mg.a(bVar, dataReportRequest)).start();
            for (int i14 = 300000; mg.b.f118360d == null && i14 >= 0; i14 -= 50) {
                Thread.sleep(50L);
            }
        }
        DataReportResult dataReportResult = mg.b.f118360d;
        pg.b bVar2 = new pg.b();
        if (dataReportResult == null) {
            return null;
        }
        bVar2.f137576a = dataReportResult.success;
        bVar2.f137577b = dataReportResult.resultCode;
        Map<String, String> map2 = dataReportResult.resultData;
        if (map2 != null) {
            bVar2.f137578c = map2.get("apdid");
            bVar2.f137579d = map2.get("apdidToken");
            bVar2.f137582g = map2.get("dynamicKey");
            bVar2.f137583h = map2.get("timeInterval");
            bVar2.f137584i = map2.get("webrtcUrl");
            bVar2.f137585j = "";
            String str = map2.get("drmSwitch");
            if (oi0.c.k(str)) {
                if (str.length() > 0) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str.charAt(0));
                    bVar2.f137580e = sb3.toString();
                }
                if (str.length() >= 3) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str.charAt(2));
                    bVar2.f137581f = sb4.toString();
                }
            }
            if (map2.containsKey("apse_degrade")) {
                bVar2.f137586k = map2.get("apse_degrade");
            }
        }
        return bVar2;
    }
}
