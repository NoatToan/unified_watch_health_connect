package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class dyd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f32517a = 0;
    private Map<String, a> d = new HashMap(1);

    public dyd() {
        c();
    }

    public void a(String str, String str2, String str3) {
        if (dxm.ag(str)) {
            LogUtil.j("HealthDeviceIntellLifeUtils", "uploadDeviceToCloud do not add huawei or honour scale");
            return;
        }
        enf enfVarB = b(str, str2, str3);
        if (enfVarB != null) {
            enm.c(enfVarB);
        }
    }

    public String a(String str, String str2) {
        if (dxm.ag(str)) {
            LogUtil.j("HealthDeviceIntellLifeUtils", "uploadDeviceToCloud do not add huawei or honour scale");
            return "";
        }
        return enm.d(str2);
    }

    public Map<String, String> b(List<String> list, List<String> list2) {
        ArrayList arrayList = new ArrayList();
        if (list.size() != list2.size()) {
            return Collections.EMPTY_MAP;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!dxm.ag(list.get(i))) {
                LogUtil.j("HealthDeviceIntellLifeUtils", "uploadDeviceToCloud do not add huawei or honour scale");
                arrayList.add(list2.get(i));
            }
        }
        return enm.a(arrayList);
    }

    public void b() {
        if (System.currentTimeMillis() - this.f32517a < 30000) {
            LogUtil.j("HealthDeviceIntellLifeUtils", "uploadDevicesToCloud too fast");
            return;
        }
        this.f32517a = System.currentTimeMillis();
        LogUtil.a("HealthDeviceIntellLifeUtils", " uploadDevicesToCloud start");
        HashMap map = new HashMap(1);
        for (ContentValues contentValues : dmp.d().f()) {
            enf enfVarB = b(contentValues.getAsString("productId"), contentValues.getAsString("uniqueId"), contentValues.getAsString("sn"));
            if (enfVarB != null) {
                map.put(enfVarB.a().getId(), enfVarB);
            }
        }
        ArrayList arrayList = new ArrayList(10);
        Iterator<a> it = this.d.values().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().d);
        }
        arrayList.addAll(e());
        enm.a(map, arrayList);
    }

    private List<String> e() {
        return Arrays.asList("007B", "N001");
    }

    public void c(String str) {
        HealthDevice healthDeviceA = drw.e().a(str);
        if (healthDeviceA == null) {
            LogUtil.j("HealthDeviceIntellLifeUtils", " uploadDeviceToCloud device not exist");
        } else {
            enm.d(healthDeviceA.getAddress(), "local");
        }
    }

    private void c() {
        for (ProductMapInfo productMapInfo : ProductMap.e()) {
            String strF = productMapInfo.f();
            if (!TextUtils.isEmpty(strF)) {
                this.d.put(strF, new a(productMapInfo.g(), productMapInfo.d(), productMapInfo.e(), productMapInfo.a()));
            }
        }
        d();
    }

    private void d() {
        this.d.put("8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4", new a("007B", "HAG-B19", "025", "001"));
        this.d.put("b29df4e3-b1f7-4e40-960d-4cfb63ccca05", new a("M00F", "HAG-B19", "025", "001"));
        this.d.put("25c6df38-ca23-11e9-a32f-2a2ae2dbcce4", new a("N001", "AH111", "025", "002"));
        this.d.put("e835d102-af95-48a6-ae13-2983bc06f5c0", new a("M00D", "HEM-B19", "025", "001"));
        this.d.put("c943c933-442e-4c34-bcd0-66597f24aaed", new a("M0CJ", "DOBBY-B19", "A2B", "001"));
    }

    private static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HealthDeviceIntellLifeUtils", "can not substring an empty source");
            return "";
        }
        String strReplaceAll = str.replaceAll(":", "");
        int length = strReplaceAll.length();
        if (length > 3) {
            strReplaceAll = strReplaceAll.substring(length - 3, length);
        }
        return Constants.LINK + strReplaceAll.toUpperCase();
    }

    private enf b(String str, String str2, String str3) {
        String address;
        enf.d dVar = new enf.d();
        a aVar = this.d.get(str);
        LogUtil.d("HealthDeviceIntellLifeUtils", " getCloudValidInformation deviceModeInfo productId:", str, " code:", dyg.b(str2), " number:", dyg.b(str3));
        if (aVar != null) {
            LogUtil.a("HealthDeviceIntellLifeUtils", " getCloudValidInformation deviceModeInfo exist");
            dVar.c(aVar.d());
            dVar.d(aVar.a());
            dVar.h(aVar.e());
            dVar.i(aVar.b());
            if (dxm.ad(str)) {
                LogUtil.a("HealthDeviceIntellLifeUtils", "getCloudValidInformation from huawei or honour weight devcie");
                d(str, str2, dVar);
                return dVar.b();
            }
            HealthDevice healthDeviceA = drw.e().a(str2);
            if (healthDeviceA != null) {
                LogUtil.a("HealthDeviceIntellLifeUtils", " getCloudValidInformation device exist");
                address = TextUtils.isEmpty(healthDeviceA.getAddress()) ? str2 : healthDeviceA.getAddress();
                dVar.e(address);
                dVar.a(address);
                dVar.j(str3);
                if (healthDeviceA.getUniqueId() != null) {
                    str2 = healthDeviceA.getUniqueId();
                }
                dVar.f(str2);
            } else {
                address = "";
            }
            elh elhVarD = ResourceManager.c().d(str);
            if (elhVarD != null) {
                LogUtil.a("HealthDeviceIntellLifeUtils", " getCloudValidInformation productInfo exist");
                String strA = elo.a(str, elhVarD.l().d());
                if (strA != null && !"".equals(strA) && healthDeviceA != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(strA);
                    if (TextUtils.isEmpty(str3)) {
                        str3 = address;
                    }
                    sb.append(d(str3));
                    String string = sb.toString();
                    dVar.g(string);
                    LogUtil.a("HealthDeviceIntellLifeUtils", " getCloudValidInformation device productId id: ", str, " name: ", string);
                }
            }
            dVar.b("1.0");
            dVar.e(4);
            dVar.n("local");
            dVar.a(0);
            dVar.a(System.currentTimeMillis());
            return dVar.b();
        }
        return dVar.b();
    }

    private void d(String str, String str2, enf.d dVar) {
        if (dVar == null) {
            return;
        }
        HealthDevice healthDeviceA = drw.e().a(str2);
        if (healthDeviceA == null || TextUtils.isEmpty(healthDeviceA.getAddress()) || TextUtils.isEmpty(healthDeviceA.getUniqueId())) {
            LogUtil.j("HealthDeviceIntellLifeUtils", "buildHuaweiAndHonourWeightDevice device or device identify is null");
            return;
        }
        String strL = dxm.l(str2);
        if (TextUtils.isEmpty(strL)) {
            LogUtil.j("HealthDeviceIntellLifeUtils", "can not get serialNumber from sp");
            strL = healthDeviceA.getAddress();
        }
        if (TextUtils.isEmpty(strL)) {
            LogUtil.j("HealthDeviceIntellLifeUtils", "buildHuaweiAndHonourWeightDevice deviceid is null");
            return;
        }
        dVar.e(strL);
        dVar.a(healthDeviceA.getAddress());
        dVar.f(strL);
        elh elhVarD = ResourceManager.c().d(str);
        if (elhVarD != null) {
            LogUtil.a("HealthDeviceIntellLifeUtils", " buildHuaweiAndHonourWeightDevice productInfo exist");
            String strA = elo.a(str, elhVarD.l().d());
            if (strA != null && !"".equals(strA)) {
                String str3 = strA + d(strL);
                dVar.g(str3);
                LogUtil.a("HealthDeviceIntellLifeUtils", " buildHuaweiAndHonourWeightDevice device productId id: ", str, " name: ", str3);
            }
        }
        dVar.b("1.0");
        if (healthDeviceA instanceof eby) {
            dVar.e(1);
            dVar.n("cloud");
        } else {
            dVar.e(4);
            dVar.n("local");
        }
        dVar.a(0);
        dVar.a(System.currentTimeMillis());
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f32518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f32519b;
        private String d;
        private String e;

        public a(String str, String str2, String str3, String str4) {
            this.e = str2;
            this.d = str;
            this.f32519b = str3;
            this.f32518a = str4;
        }

        public String b() {
            return this.f32519b;
        }

        public String a() {
            return this.e;
        }

        public String d() {
            return this.f32518a;
        }

        public String e() {
            return this.d;
        }

        public String toString() {
            return "DeviceModeInfo{mDeviceModel='" + this.e + ", mProdId='" + this.d + ", mDeviceType='" + this.f32519b + ", mDeviceManu='" + this.f32518a + '}';
        }
    }
}
