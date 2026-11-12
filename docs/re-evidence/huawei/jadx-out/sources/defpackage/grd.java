package defpackage;

import com.huawei.health.baseapi.pluginlocation.EphemerisExtApi;
import com.huawei.health.pluginlocation.eph.pgnss.PgnssManager;
import com.huawei.health.pluginlocation.logger.Logger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes30.dex */
public class grd implements EphemerisExtApi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35952b = 0;

    public grd(Logger logger) {
        grn.a(logger);
    }

    @Override // com.huawei.health.baseapi.pluginlocation.EphemerisExtApi
    public grh getEphRequest(List<String> list) {
        grn.d("EphemerisExtApiImpl", "getEphRequest start");
        grh grhVar = new grh();
        if (list == null || list.size() == 0) {
            grn.c("EphemerisExtApiImpl", "getEphResponse urls is invalid");
            grhVar.b(false);
            return grhVar;
        }
        int iC = c(list);
        this.f35952b = b(list);
        switch (iC) {
            case 1:
                grhVar = gri.b().e(list);
                break;
            case 2:
                grhVar = PgnssManager.c().e(list);
                break;
            case 3:
            default:
                grhVar.b(false);
                break;
            case 4:
                grhVar = PgnssManager.c().d(list);
                break;
            case 5:
            case 6:
            case 7:
                grhVar = PgnssManager.c().e(list, iC);
                break;
            case 8:
                grhVar = PgnssManager.c().c(list, iC);
                break;
        }
        grn.d("EphemerisExtApiImpl", "getEphRequest end");
        return grhVar;
    }

    @Override // com.huawei.health.baseapi.pluginlocation.EphemerisExtApi
    public Map<String, String> getEphResponse(grg grgVar) throws Throwable {
        grn.d("EphemerisExtApiImpl", "getEphResponse start");
        Map<String, String> map = new HashMap<>();
        if (grgVar == null) {
            grn.c("EphemerisExtApiImpl", "getEphResponse response is invalid");
            return map;
        }
        gra.d(180000);
        switch (grgVar.c()) {
            case 1:
                map = gri.b().b(grgVar);
                break;
            case 2:
                map = PgnssManager.c().d(grgVar, this.f35952b);
                break;
            case 4:
                map = PgnssManager.c().e(grgVar);
                break;
            case 5:
            case 6:
            case 7:
                map = PgnssManager.c().c(grgVar);
                break;
            case 8:
                map = PgnssManager.c().d(grgVar);
                break;
        }
        gra.d();
        grn.d("EphemerisExtApiImpl", "getEphResponse end");
        return map;
    }

    private int c(List<String> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = list.get(i2);
            if (str.contains("HW_AGNSS")) {
                i = 1;
                break;
            }
            if (str.contains("HW_PGNSS_PRED")) {
                i = 2;
                break;
            }
            if (str.contains("HW_PGNSS_TRANS")) {
                i = 4;
                break;
            }
            if (str.contains("HW_RSMC_PGNSS_BDS")) {
                i = 5;
            } else if (str.contains("HW_RSMC_SYSTEM_CONFIG")) {
                i = 6;
            } else if (str.contains("HW_RSMC_ORBITS_CONFIG")) {
                i = 7;
            } else {
                if (str.contains("HW_PRECSION_ION")) {
                    i = 8;
                    break;
                }
                grn.d("EphemerisExtApiImpl", "not supported EPH type");
            }
        }
        grn.d("EphemerisExtApiImpl", "getEphType, ephType: " + i);
        return i;
    }

    private int b(List<String> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2).contains("SEVEN")) {
                i = 1;
                break;
            }
            grn.d("EphemerisExtApiImpl", "not supported EPH mode");
        }
        grn.d("EphemerisExtApiImpl", "getEphMode, ephMode: " + i);
        return i;
    }
}
