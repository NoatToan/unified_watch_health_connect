package com.huawei.openalliance.ad.utils;

import com.huawei.openalliance.ad.beans.metadata.Ad30;
import com.huawei.openalliance.ad.beans.metadata.Precontent;
import com.huawei.openalliance.ad.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.constant.AdConfigMapKey;
import com.huawei.openalliance.ad.constant.SplashPreloadMode;
import com.huawei.openalliance.ad.hw;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class cm {
    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    public static Map<String, String> b(AdContentRsp adContentRsp) {
        String strA;
        HashMap map = new HashMap();
        if (adContentRsp != null) {
            List<Precontent> listF = adContentRsp.f();
            if (!bm.a(listF)) {
                for (Precontent precontent : listF) {
                    if (precontent != null) {
                        String strA2 = precontent.a();
                        if (dg.b(strA2)) {
                            hw.a("PreloadUtil", "empty preload slot id");
                        } else {
                            Integer numN = precontent.n();
                            if (numN != null) {
                                strA = dg.a(numN);
                                if (!SplashPreloadMode.OPTIONAL_VALUE.contains(strA)) {
                                    strA = "1";
                                }
                            } else {
                                strA = "1";
                            }
                            map.put(strA2, strA);
                        }
                    }
                }
            }
        }
        return map;
    }

    public static Map<String, String> a(AdContentRsp adContentRsp) {
        String str;
        HashMap map = new HashMap();
        if (adContentRsp != null) {
            List<Ad30> listC = adContentRsp.c();
            if (!bm.a(listC)) {
                for (Ad30 ad30 : listC) {
                    if (ad30 != null) {
                        String strA = ad30.a();
                        if (dg.b(strA)) {
                            str = "empty slot id";
                        } else {
                            String strG = ad30.g();
                            if (dg.b(strG)) {
                                str = "empty config map";
                            } else {
                                Map map2 = (Map) bk.b(strG, Map.class, new Class[0]);
                                if (!br.a(map2)) {
                                    String str2 = (String) map2.get(AdConfigMapKey.SPLASH_PRELOAD_MODE);
                                    if (dg.b(str2) || !SplashPreloadMode.OPTIONAL_VALUE.contains(str2)) {
                                        str2 = "1";
                                    }
                                    map.put(strA, str2);
                                }
                            }
                        }
                        hw.a("PreloadUtil", str);
                    }
                }
            }
        }
        return map;
    }
}
