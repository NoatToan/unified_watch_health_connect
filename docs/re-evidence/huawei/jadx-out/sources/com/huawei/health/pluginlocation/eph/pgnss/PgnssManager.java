package com.huawei.health.pluginlocation.eph.pgnss;

import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hms.network.embedded.b6;
import com.huawei.hms.network.embedded.j2;
import com.huawei.hms.network.embedded.y;
import com.huawei.openalliance.ad.constant.Constants;
import defpackage.gqv;
import defpackage.gqx;
import defpackage.gre;
import defpackage.grf;
import defpackage.grg;
import defpackage.grh;
import defpackage.grj;
import defpackage.grn;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes30.dex */
public class PgnssManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static double f8624a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static double f8626c;
    private static boolean e;
    private static volatile PgnssManager j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f8625b = {"HW_PGNSS_GPS", "HW_PGNSS_GLONASS", "HW_PGNSS_GALILEO", "HW_PGNSS_BDS", "HW_PGNSS_QZS", "HW_PGNSS_EXTRA"};
    private static final Object d = new Object();

    private native boolean decodeEphSeeds(int i);

    private native boolean decodeIonSeeds(double d2, double d3);

    private native boolean decodeRsmcEphSeeds();

    private native boolean initEnv(long j2, String str, String str2);

    static {
        e = false;
        try {
            grn.d("PgnssManager", "start load PgnssJni library");
            System.loadLibrary("PgnssJni");
            e = true;
        } catch (UnsatisfiedLinkError unused) {
            grn.c("PgnssManager", "PgnssJni load fail");
            e = false;
        }
    }

    public static PgnssManager c() {
        if (j == null) {
            synchronized (d) {
                if (j == null) {
                    j = new PgnssManager();
                }
            }
        }
        return j;
    }

    public grh e(List<String> list) {
        grh grhVar;
        synchronized (d) {
            grn.d("PgnssManager", "getPredictRequest start");
            grhVar = new grh();
            grhVar.b(true);
            grhVar.a(true);
            grhVar.a(2);
            grhVar.c(1);
            grhVar.d("getBatchPluginUrl");
            List<String> listA = gre.a(list);
            HashMap map = new HashMap();
            Iterator<String> it = listA.iterator();
            while (it.hasNext()) {
                map.put(it.next(), "HW_PGNSS");
            }
            grhVar.c(map);
            HashMap map2 = new HashMap();
            map2.put(b6.a.f14602b, "HealthApp");
            map2.put("traceId", UUID.randomUUID().toString());
            grhVar.e(map2);
            grn.d("PgnssManager", "getPredictRequest end");
        }
        return grhVar;
    }

    public Map<String, String> d(grg grgVar, int i) {
        HashMap map;
        synchronized (d) {
            grn.d("PgnssManager", "getPredictResponse start");
            grn.d("PgnssManager", "originPath: " + grgVar.d());
            String str = grgVar.a() + File.separator;
            grn.d("PgnssManager", "storageDir: " + str);
            String strB = grgVar.b();
            grn.d("PgnssManager", "deviceIdentify: " + strB);
            int i2 = 0;
            while (true) {
                String[] strArr = f8625b;
                if (i2 >= strArr.length) {
                    break;
                }
                c(strArr[i2], str, strB);
                i2++;
            }
            a(str, strB, 2, i);
            map = new HashMap();
            int i3 = 0;
            while (true) {
                String[] strArr2 = f8625b;
                if (i3 < strArr2.length) {
                    String strD = d(strArr2[i3], str, strB);
                    if (strD != null && !"".equals(strD)) {
                        grn.d("PgnssManager", strArr2[i3] + " find");
                        map.put(strD, strArr2[i3]);
                    } else {
                        grn.d("PgnssManager", strArr2[i3] + " is not exists");
                    }
                    i3++;
                } else {
                    grn.d("PgnssManager", "getPredictResponse end");
                }
            }
        }
        return map;
    }

    private void c(String str, String str2, String str3) {
        grn.d("PgnssManager", "clearOldFiles start");
        File file = new File(str2, grf.b(str3 + str));
        if (file.exists()) {
            grn.d("PgnssManager", "clearOldFiles delete file: " + str + ", isDeleted: " + file.delete());
        }
    }

    private String d(String str, String str2, String str3) {
        grn.d("PgnssManager", "checkDecodeResult start");
        File file = new File(str2, grf.b(str3 + str));
        if (file.exists()) {
            return file.getPath();
        }
        return "";
    }

    private void a(String str, String str2, int i, int i2) {
        boolean zDecodeIonSeeds;
        grn.d("PgnssManager", "decodePgnssSeed start");
        if (e) {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            long j2 = jCurrentTimeMillis - 315964782;
            grn.d("PgnssManager", "utcTime: " + jCurrentTimeMillis + ", currentGpsTime: " + j2);
            boolean zInitEnv = initEnv(j2, str, str2);
            StringBuilder sb = new StringBuilder("initEnv, isInitSucceed: ");
            sb.append(zInitEnv);
            grn.d("PgnssManager", sb.toString());
            if (i == 2) {
                zDecodeIonSeeds = decodeEphSeeds(i2);
            } else if (i == 5) {
                zDecodeIonSeeds = decodeRsmcEphSeeds();
            } else if (i == 8) {
                zDecodeIonSeeds = decodeIonSeeds(f8626c, f8624a);
            } else {
                grn.e("PgnssManager", "decodePgnssSeed not supported: " + i);
                zDecodeIonSeeds = false;
            }
            grn.d("PgnssManager", "decodePgnssSeed, isDecodeSucceed: " + zDecodeIonSeeds + ", ephType: " + i);
            return;
        }
        grn.d("PgnssManager", "decodePgnssSeed PgnssJni load fail");
    }

    public grh d(List<String> list) {
        grn.d("PgnssManager", "getTransRequest start");
        return new grh();
    }

    public Map<String, String> e(grg grgVar) {
        grn.d("PgnssManager", "getTransResponse start");
        return new HashMap();
    }

    public grh e(List<String> list, int i) {
        grh grhVar;
        synchronized (d) {
            grn.d("PgnssManager", "getRsmcRequest start, type: " + i);
            grhVar = new grh();
            grhVar.b(true);
            if (i == 7) {
                grhVar.a(false);
            } else {
                grhVar.a(true);
            }
            grhVar.a(i);
            grhVar.c(2);
            grhVar.d("getAgnssPluginUrl");
            grhVar.b("POST");
            HashMap map = new HashMap();
            map.put("Content-Type", HealthEngineRequestManager.CONTENT_TYPE);
            map.put(j2.v, Constants.GZIP);
            grhVar.e(map);
            grhVar.c(b(list, i));
            String string = "";
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("version", "v1");
                jSONObject.put("type", "BDS");
                string = jSONObject.toString();
            } catch (JSONException unused) {
                grhVar.b(false);
                grn.c("PgnssManager", "getRsmcBody JSON Exception");
            }
            grhVar.a(string);
            grn.d("PgnssManager", "getRsmcRequest end");
        }
        return grhVar;
    }

    private Map<String, String> b(List<String> list, int i) {
        String str;
        if (i == 5) {
            str = "HiBdsEE.dat";
        } else if (i == 6) {
            str = "rsmc_bds.json";
        } else if (i == 7) {
            str = "RSMC_ORBITS_CONFIG";
        } else {
            grn.d("PgnssManager", "getRsmcConfigMap type not supported");
            str = "";
        }
        if (str.isEmpty()) {
            return new HashMap();
        }
        List<String> listA = gre.a(list);
        HashMap map = new HashMap();
        Iterator<String> it = listA.iterator();
        while (it.hasNext()) {
            map.put(it.next(), str);
        }
        return map;
    }

    public Map<String, String> c(grg grgVar) {
        synchronized (d) {
            grn.d("PgnssManager", "getRsmcResponse start");
            String str = grgVar.a() + File.separator;
            String strB = grgVar.b();
            String strA = a(grgVar.c());
            c(strA, str, strB);
            int iC = grgVar.c();
            if (iC == 5) {
                if (!b(grgVar)) {
                    return new HashMap();
                }
                a(str, strB, 5, 0);
            } else if (iC == 6) {
                String str2 = str + grgVar.b() + strA;
                grf.a(grgVar.d());
                BdsSysCfgConverter.c(grgVar.d(), str2);
            } else {
                grn.e("PgnssManager", "getRsmcResponse not supported, type: " + iC);
            }
            HashMap map = new HashMap();
            String strD = d(strA, str, strB);
            if (!strD.isEmpty()) {
                grn.d("PgnssManager", strA + " is find");
                map.put(strD, strA);
            } else {
                grn.e("PgnssManager", strA + " is not exists");
            }
            return map;
        }
    }

    private String a(int i) {
        String str;
        if (i == 5) {
            str = "RSMC_PGNSS_BDS";
        } else if (i == 6) {
            str = "RSMC_SYSTEM_COINFIG";
        } else {
            grn.e("PgnssManager", "getFileIdByType not supported, fileType: " + i);
            str = "";
        }
        grn.d("PgnssManager", "getFileIdByType, fileType: " + i);
        return str;
    }

    private boolean b(grg grgVar) throws Throwable {
        String string = "";
        try {
            string = new JSONObject(new String(grf.a(grgVar.d()), StandardCharsets.UTF_8)).getString("ephmerisData");
            grn.d("PgnssManager", "getBdsEphmerisSeed, ephDataStr length: " + string.length());
        } catch (JSONException unused) {
            grn.c("PgnssManager", "getBdsEphmerisSeed JSONException");
        }
        if (string.isEmpty()) {
            grn.e("PgnssManager", "getBdsEphmerisSeed ephDataStr is empty");
            return false;
        }
        String str = grgVar.a() + File.separator;
        String str2 = grgVar.b() + "RSMC_SEED_EPHEMERIS";
        c("RSMC_SEED_EPHEMERIS", str, grgVar.b());
        byte[] bytes = string.getBytes(StandardCharsets.UTF_8);
        boolean zA = grf.a(str + str2, bytes, bytes.length);
        StringBuilder sb = new StringBuilder("getBdsEphmerisSeed end, isWriteSuccess: ");
        sb.append(zA);
        grn.d("PgnssManager", sb.toString());
        return zA;
    }

    public grh c(List<String> list, int i) {
        grn.d("PgnssManager", "getIonRequest start");
        grh grhVar = new grh();
        grhVar.b(true);
        grhVar.a(true);
        grhVar.a(i);
        grhVar.c(1);
        grhVar.d("getAgnssPluginUrl");
        List<String> listC = gre.c(list);
        String str = listC.size() == 2 ? listC.get(0) : "";
        String[] strArrSplit = (listC.size() == 2 ? listC.get(1) : "").split(",");
        try {
            if (strArrSplit.length == 2) {
                f8626c = Double.valueOf(strArrSplit[0]).doubleValue();
                f8624a = Double.valueOf(strArrSplit[1]).doubleValue();
            } else {
                grn.c("PgnssManager", " getIonRequest lat and lon OutOfBounds");
                grhVar.b(false);
            }
        } catch (NumberFormatException unused) {
            grn.c("PgnssManager", " getIonRequest lat and lon numberFormat");
            grhVar.b(false);
        }
        if (str == null || str.length() <= 0) {
            grn.e("PgnssManager", "getIonRequest standardUrl is null");
            grhVar.b(false);
        }
        HashMap map = new HashMap();
        map.put(str, "ION.dat");
        grhVar.c(map);
        String strB = b();
        if (strB == null || strB.length() <= 0) {
            grhVar.b(false);
        }
        HashMap map2 = new HashMap();
        map2.put("X-Request-ID", UUID.randomUUID().toString());
        map2.put("X-Device-Type", "SportsHealth");
        map2.put("Authorization", strB);
        grhVar.e(map2);
        grn.d("PgnssManager", "getIonRequest end");
        return grhVar;
    }

    private String b() {
        String strA;
        grn.d("PgnssManager", "getIonAuth start");
        try {
            strA = gqx.a(d()).a();
        } catch (Exception unused) {
            grn.c("PgnssManager", "getIonAuth Exception");
            strA = "";
        }
        if (strA == null || strA.length() <= 0) {
            grn.e("PgnssManager", "getIonAuth authorization is null");
        }
        return strA;
    }

    private grj d() {
        grn.d("PgnssManager", "getIonSdkAuth start");
        grj grjVar = new grj();
        grjVar.d("/higeo/v1/gnssIonInfo");
        grjVar.a("GET");
        grjVar.e("CLOUDSOA-HMAC-SHA256");
        grjVar.i("com.huawei.hms.location");
        grjVar.j(gqv.e());
        grjVar.c("precisionIonKey");
        grjVar.f("");
        grjVar.b("");
        grjVar.a(1);
        grjVar.e(y.f15619c);
        grjVar.c(86400000L);
        return grjVar;
    }

    public Map<String, String> d(grg grgVar) {
        HashMap map;
        synchronized (d) {
            grn.d("PgnssManager", "getIonResponse start");
            grn.d("PgnssManager", "originPath: " + grgVar.d());
            String str = grgVar.a() + File.separator;
            grn.d("PgnssManager", "storageDir: " + str);
            String strB = grgVar.b();
            grn.d("PgnssManager", "deviceIdentify: " + strB);
            c("SubION.dat", str, strB);
            a(str, strB, 8, 0);
            map = new HashMap();
            String strD = d("SubION.dat", str, strB);
            if (strD != null && !"".equals(strD)) {
                grn.d("PgnssManager", "SubION.dat find");
                map.put(strD, "SubION.dat");
            } else {
                grn.d("PgnssManager", "SubION.dat is not exists");
            }
            grn.d("PgnssManager", "getIonResponse end");
        }
        return map;
    }
}
