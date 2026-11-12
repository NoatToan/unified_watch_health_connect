package defpackage;

import android.os.Process;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class mmx {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HashMap<Integer, String> f41956c;
    private static final HashMap<Integer, Integer> d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ArrayList<mmt> f41955b = new ArrayList<>(0);
    private static HashMap<Integer, ArrayList<String>> e = new HashMap<>(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f41954a = new Object();
    private static boolean i = true;

    private static boolean h(int i2) {
        return i2 == 23 || i2 == 24 || i2 == 36 || i2 == 37 || i2 == 63;
    }

    static {
        int i2 = 16;
        f41956c = new HashMap(i2) { // from class: mmx.2
            private static final long serialVersionUID = -8551301047341727270L;

            {
                put(0, "B1");
                put(1, "B2");
                put(4, "N1");
                put(7, "B3");
                put(14, "GRUS");
                put(11, "R1");
                put(5, "B0");
                put(8, "S1");
                put(12, "A2");
                put(13, "NYX");
                put(15, "ERIS");
                put(2, "K1");
                put(-2, "AF500");
                put(3, "W1");
                put(10, "W2");
                put(16, "JANUS");
                put(18, "CRIUS");
                put(19, "TERRA");
                put(20, "TALOS");
                put(21, "FORTUNA");
                put(23, "AW70B29");
                put(24, "AW70B19");
                put(32, "CASSINI");
                put(34, "LATONA");
                put(36, "AW70B39HW");
                put(37, "AW70B39HN");
                put(44, "ANDES_B19");
                put(45, "ANDES_B29");
                put(54, "Hagrid-B19");
                put(599, "Hagrid2021-B19");
                put(263, "Lupin-B19HN");
                put(70, "Herm-B19");
            }
        };
        d = new HashMap(i2) { // from class: mmx.4
            private static final long serialVersionUID = 1982860079700417868L;

            {
                put(35, 89);
                put(64, 131);
                put(65, 137);
                put(61, 124);
                put(60, 122);
                put(58, 115);
            }
        };
        b();
    }

    public static void b() {
        c();
        LogUtil.a("DeviceInfoMgr", "enter init start");
        if (!i) {
            LogUtil.a("DeviceInfoMgr", "isResetInit is false");
            return;
        }
        i = false;
        e.clear();
        synchronized (f41954a) {
            f41955b.clear();
        }
        q();
        w();
        m();
        s();
        n();
        t();
        j();
        h();
        l();
        r();
        f();
        o();
        u();
        v();
        k();
        x();
        p();
        g();
        i();
        ThreadPoolManager.c().a("DeviceInfoMgr", new Runnable() { // from class: mmx.5
            @Override // java.lang.Runnable
            public void run() {
                ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).clearPluginInfoList();
                mmx.a();
            }
        });
    }

    public static void f(int i2) {
        boolean z;
        c();
        final String strA = a(i2);
        synchronized (f41954a) {
            Iterator<mmt> it = f41955b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                } else if (it.next().g().equals(strA)) {
                    z = false;
                    break;
                }
            }
        }
        LogUtil.a("DeviceInfoMgr", "updateCurrentDevice isNeedUpdate:", Boolean.valueOf(z));
        if (z) {
            ThreadPoolManager.c().a("DeviceInfoMgr", new Runnable() { // from class: mmx.1
                @Override // java.lang.Runnable
                public void run() {
                    mmx.c(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(strA));
                }
            });
        }
    }

    public static String a(int i2) {
        c();
        String strC = "";
        for (Map.Entry<String, Integer> entry : edg.b().entrySet()) {
            if (entry != null && entry.getKey() != null) {
                strC = c(entry, i2);
            }
            if (!TextUtils.isEmpty(strC)) {
                break;
            }
        }
        return strC;
    }

    public static HashMap<Integer, String> e() {
        c();
        return f41956c;
    }

    private static String c(Map.Entry<String, Integer> entry, int i2) {
        String key = entry.getKey();
        return (edg.b().get(key) != null ? edg.b().get(key).intValue() : 0) == i2 ? key : "";
    }

    private static void g() {
        mmt mmtVar = new mmt();
        mmtVar.b(44);
        mmtVar.e(true);
        mmtVar.a(92);
        synchronized (f41954a) {
            f41955b.add(mmtVar);
        }
    }

    private static void i() {
        mmt mmtVar = new mmt();
        mmtVar.b(45);
        mmtVar.a(93);
        mmtVar.e(true);
        synchronized (f41954a) {
            f41955b.add(mmtVar);
        }
    }

    private static void x() {
        mmt mmtVar = new mmt();
        mmtVar.e(BaseApplication.getContext().getString(R.string.IDS_app_display_name_talos));
        mmtVar.b(20);
        mmtVar.a(79);
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add("talos-".toUpperCase(Locale.ENGLISH));
        arrayList.add("honor Watch-".toUpperCase(Locale.ENGLISH));
        e.put(20, arrayList);
        mmtVar.e(false);
        Object obj = f41954a;
        synchronized (obj) {
            f41955b.add(mmtVar);
        }
        mmt mmtVar2 = new mmt();
        mmtVar2.e(BaseApplication.getContext().getString(R.string.IDS_app_display_name_fortuna));
        mmtVar2.b(21);
        mmtVar2.a(80);
        ArrayList<String> arrayList2 = new ArrayList<>(0);
        arrayList2.add("fortuna-".toUpperCase(Locale.ENGLISH));
        arrayList2.add("HUAWEI WATCH GT-".toUpperCase(Locale.ENGLISH));
        e.put(21, arrayList2);
        mmtVar2.e(false);
        synchronized (obj) {
            f41955b.add(mmtVar2);
        }
    }

    private static void k() {
        mmt mmtVar = new mmt();
        mmtVar.e(BaseApplication.getContext().getString(R.string.IDS_app_display_name_crius));
        mmtVar.b(18);
        mmtVar.a(77);
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add("crius-".toUpperCase(Locale.ENGLISH));
        arrayList.add("Honor Band 4-".toUpperCase(Locale.ENGLISH));
        e.put(18, arrayList);
        mmtVar.e(true);
        Object obj = f41954a;
        synchronized (obj) {
            f41955b.add(mmtVar);
        }
        mmt mmtVar2 = new mmt();
        mmtVar2.e(BaseApplication.getContext().getString(R.string.IDS_app_display_name_terra));
        mmtVar2.b(19);
        mmtVar2.a(78);
        ArrayList<String> arrayList2 = new ArrayList<>(0);
        arrayList2.add("terra-".toUpperCase(Locale.ENGLISH));
        arrayList2.add("HUAWEI Band 3 Pro-".toUpperCase(Locale.ENGLISH));
        e.put(19, arrayList2);
        mmtVar2.e(true);
        synchronized (obj) {
            f41955b.add(mmtVar2);
        }
    }

    private static void v() {
        mmt mmtVar = new mmt();
        mmtVar.e(BaseApplication.getContext().getString(R.string.IDS_huawei_r1_pro_content));
        mmtVar.b(11);
        mmtVar.c(R.mipmap.img_home_r1_pro_banner);
        mmtVar.a(43);
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add("HUAWEI CM-R1P".toUpperCase(Locale.ENGLISH));
        arrayList.add("HUAWEI AM-R1".toUpperCase(Locale.ENGLISH));
        e.put(11, arrayList);
        if (Utils.m()) {
            return;
        }
        synchronized (f41954a) {
            f41955b.add(mmtVar);
        }
    }

    private static void p() {
        mmt mmtVar = new mmt();
        mmtVar.e(BaseApplication.getContext().getString(R.string.IDS_device_latona_name));
        mmtVar.b(34);
        mmtVar.c(R.mipmap.device_icon_watch_default_new);
        mmtVar.e(false);
        mmtVar.a(88);
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add("HUAWEI LTN-".toUpperCase(Locale.ENGLISH));
        arrayList.add("HUAWEI DAN-".toUpperCase(Locale.ENGLISH));
        arrayList.add("HUAWEI WATCH GT 2-".toUpperCase(Locale.ENGLISH));
        e.put(34, arrayList);
        synchronized (f41954a) {
            f41955b.add(mmtVar);
        }
    }

    private static void o() {
        mmt mmtVar = new mmt();
        mmtVar.e(BaseApplication.getContext().getString(R.string.IDS_app_display_name_gemini));
        mmtVar.b(7);
        mmtVar.c(R.mipmap.pic_band_huawei_b3);
        mmtVar.a(39);
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add("HUAWEI GE".toUpperCase(Locale.ENGLISH));
        arrayList.add("HUAWEI B3-".toUpperCase(Locale.ENGLISH));
        e.put(7, arrayList);
        synchronized (f41954a) {
            f41955b.add(mmtVar);
        }
    }

    private static void u() {
        mmt mmtVar = new mmt();
        mmtVar.e(BaseApplication.getContext().getString(R.string.IDS_huawei_r1_content));
        mmtVar.b(11);
        mmtVar.c(R.mipmap.img_home_honorbandr1);
        mmtVar.a(43);
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add("HUAWEI AM-R1".toUpperCase(Locale.ENGLISH));
        e.put(11, arrayList);
        if (Utils.m()) {
            return;
        }
        synchronized (f41954a) {
            f41955b.add(mmtVar);
        }
    }

    private static void l() {
        mmt mmtVar = new mmt();
        mmtVar.e(BaseApplication.getContext().getString(R.string.IDS_app_display_name_honor_aw));
        mmtVar.b(24);
        mmtVar.a(83);
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add("HONOR AW70");
        arrayList.add("honor Band 4R-");
        e.put(24, arrayList);
        mmtVar.e(true);
        synchronized (f41954a) {
            f41955b.add(mmtVar);
        }
    }

    private static void r() {
        mmt mmtVar = new mmt();
        mmtVar.e(BaseApplication.getContext().getString(R.string.IDS_app_display_name_honor_aw_pro));
        mmtVar.b(37);
        mmtVar.a(91);
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add("AW70B39HN");
        e.put(37, arrayList);
        mmtVar.e(true);
        synchronized (f41954a) {
            f41955b.add(mmtVar);
        }
    }

    private static void f() {
        mmt mmtVar = new mmt();
        mmtVar.e(qrs.c(BaseApplication.getContext()));
        mmtVar.b(12);
        mmtVar.c(R.mipmap.pic_band_honor_a2);
        mmtVar.a(44);
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add("HUAWEI band A2".toUpperCase(Locale.ENGLISH));
        arrayList.add("honor band A2".toUpperCase(Locale.ENGLISH));
        arrayList.add("AW61".toUpperCase(Locale.ENGLISH));
        arrayList.add("HUAWEI Color Band A2".toUpperCase(Locale.ENGLISH));
        e.put(12, arrayList);
        synchronized (f41954a) {
            f41955b.add(mmtVar);
        }
    }

    private static void t() {
        mmt mmtVar = new mmt();
        mmtVar.e(BaseApplication.getContext().getString(R.string.IDS_app_display_name_nys));
        mmtVar.b(13);
        mmtVar.c(R.mipmap.pic_band_honor_3);
        mmtVar.e(true);
        mmtVar.a(42);
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add("HUAWEI NYX".toUpperCase(Locale.ENGLISH));
        arrayList.add("HONOR NYX".toUpperCase(Locale.ENGLISH));
        arrayList.add("Honor Band 3-".toUpperCase(Locale.ENGLISH));
        e.put(13, arrayList);
        synchronized (f41954a) {
            f41955b.add(mmtVar);
        }
    }

    private static void j() {
        mmt mmtVar = new mmt();
        mmtVar.e(BaseApplication.getContext().getString(R.string.IDS_app_display_name_aw));
        mmtVar.b(23);
        mmtVar.a(81);
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add("HUAWEI Band 3e-");
        e.put(23, arrayList);
        mmtVar.e(true);
        synchronized (f41954a) {
            f41955b.add(mmtVar);
        }
    }

    private static void h() {
        mmt mmtVar = new mmt();
        mmtVar.e(BaseApplication.getContext().getString(R.string.IDS_app_display_name_aw_pro));
        mmtVar.b(36);
        mmtVar.a(90);
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add("AW70B39HW");
        arrayList.add("HUAWEI Band 4e-");
        e.put(36, arrayList);
        mmtVar.e(true);
        synchronized (f41954a) {
            f41955b.add(mmtVar);
        }
    }

    private static void m() {
        mmt mmtVar = new mmt();
        mmtVar.e(BaseApplication.getContext().getString(R.string.IDS_app_display_name_grus));
        mmtVar.b(14);
        mmtVar.c(R.mipmap.pic_band_huawei_b3_young);
        mmtVar.a(45);
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add("HUAWEI GRUS".toUpperCase(Locale.ENGLISH));
        arrayList.add("HUAWEI B3 Lite-".toUpperCase(Locale.ENGLISH));
        e.put(14, arrayList);
        synchronized (f41954a) {
            f41955b.add(mmtVar);
        }
    }

    private static void n() {
        mmt mmtVar = new mmt();
        if (!Utils.o() || LanguageUtil.o(BaseApplication.getContext())) {
            mmtVar.e(BaseApplication.getContext().getString(R.string.IDS_app_display_name_eris));
        } else {
            mmtVar.e(BaseApplication.getContext().getString(R.string.IDS_app_display_name_eris_new));
        }
        mmtVar.b(15);
        mmtVar.c(R.mipmap.pic_band_huawei_sport);
        mmtVar.a(47);
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add("Huawei Band 2-".toUpperCase(Locale.ENGLISH));
        e.put(15, arrayList);
        synchronized (f41954a) {
            f41955b.add(mmtVar);
        }
    }

    private static void s() {
        mmt mmtVar = new mmt();
        mmtVar.e(BaseApplication.getContext().getString(R.string.IDS_app_display_name_janus));
        mmtVar.b(16);
        mmtVar.e(true);
        mmtVar.a(74);
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add("HUAWEI JNS-".toUpperCase(Locale.ENGLISH));
        arrayList.add("HUAWEI B5-".toUpperCase(Locale.ENGLISH));
        e.put(16, arrayList);
        synchronized (f41954a) {
            f41955b.add(mmtVar);
        }
    }

    private static void w() {
        mmt mmtVar = new mmt();
        mmtVar.e(qrs.p(BaseApplication.getContext()));
        mmtVar.b(8);
        mmtVar.c(R.mipmap.pic_watch_honor_s1);
        mmtVar.a(41);
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add("metis".toUpperCase(Locale.ENGLISH));
        arrayList.add("honor watch S1".toUpperCase(Locale.ENGLISH));
        arrayList.add("HUAWEI FIT".toUpperCase(Locale.ENGLISH));
        e.put(8, arrayList);
        synchronized (f41954a) {
            f41955b.add(mmtVar);
        }
    }

    private static void q() {
        mmt mmtVar = new mmt();
        mmtVar.e(BaseApplication.getContext().getString(R.string.IDS_app_display_name_leo));
        mmtVar.b(10);
        mmtVar.c(R.mipmap.pic_watch_huawei_leo);
        mmtVar.a(46);
        mmtVar.e(false);
        synchronized (f41954a) {
            f41955b.add(mmtVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a() {
        for (Map.Entry<String, Integer> entry : edg.b().entrySet()) {
            if (entry != null && entry.getKey() != null) {
                String key = entry.getKey();
                LogUtil.a("DeviceInfoMgr", "tempUuid is exist:", key);
                c(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(key));
            }
        }
    }

    public static void c(edl edlVar) {
        c();
        LogUtil.a("DeviceInfoMgr", " enter loadDeviceInfoFromJson.");
        if (edlVar == null) {
            LogUtil.j("DeviceInfoMgr", "null is info");
            return;
        }
        if (edlVar.c() == null) {
            LogUtil.j("DeviceInfoMgr", " null is info.fetchPluginUuid()");
            return;
        }
        synchronized (f41954a) {
            if (f41955b == null) {
                LogUtil.j("DeviceInfoMgr", "allDevices is null");
            } else {
                d(edlVar);
            }
        }
    }

    private static void d(edl edlVar) {
        mmt mmtVarB;
        HashMap<String, Integer> mapB = edg.b();
        if (mapB.containsKey(edlVar.c())) {
            int iIntValue = mapB.get(edlVar.c()).intValue();
            mmtVarB = d(iIntValue);
            LogUtil.a("DeviceInfoMgr", "setLoadDeviceInfo fetchPluginUuid: ", edlVar.c());
            if (mmtVarB != null && mmtVarB.e() != iIntValue) {
                LogUtil.a("DeviceInfoMgr", "setLoadDeviceInfo getDeviceType(): ", Integer.valueOf(mmtVarB.e()));
                synchronized (f41954a) {
                    LogUtil.a("DeviceInfoMgr", "setLoadDeviceInfo local add");
                    f41955b.add(mmtVarB);
                }
            }
        } else {
            LogUtil.a("DeviceInfoMgr", "setLoadDeviceInfo cloud");
            mmtVarB = b(edlVar);
        }
        c(edlVar, mmtVarB, edg.b());
    }

    private static mmt b(edl edlVar) {
        mmt mmtVarA = a(edlVar.c());
        if (mmtVarA == null && edlVar.i() != null) {
            int iAg = edlVar.i().ag();
            LogUtil.a("DeviceInfoMgr", "setLoadDeviceInfo cloud deviceType:", Integer.valueOf(iAg));
            if (iAg != -1) {
                mmtVarA = d(iAg);
            }
            LogUtil.a("DeviceInfoMgr", "setLoadDeviceInfo cloud getDeviceType: ", mmtVarA == null ? Constants.NULL : Integer.valueOf(mmtVarA.e()));
            if (mmtVarA != null && mmtVarA.e() != iAg) {
                mmtVarA = null;
            }
        }
        if (mmtVarA != null) {
            return mmtVarA;
        }
        mmt mmtVar = new mmt();
        synchronized (f41954a) {
            LogUtil.a("DeviceInfoMgr", "setLoadDeviceInfo cloud add:");
            f41955b.add(mmtVar);
        }
        return mmtVar;
    }

    private static void c(edl edlVar, mmt mmtVar, HashMap<String, Integer> map) {
        LogUtil.a("DeviceInfoMgr", "enter loadPluginDeviceInfo");
        if (edlVar.c() != null) {
            mmtVar.a(edlVar.c());
        }
        edz edzVarI = edlVar.i();
        if (edzVarI == null) {
            return;
        }
        String strAh = edzVarI.ah();
        if (!"".equals(strAh)) {
            mmtVar.e(strAh);
            LogUtil.a("DeviceInfoMgr", " deviceName : ", mmtVar.b());
        }
        String strBh = edzVarI.bh();
        if (!"".equals(strBh)) {
            mmtVar.d(strBh);
            LogUtil.a("DeviceInfoMgr", " npsName : ", mmtVar.i());
        }
        int iAg = edzVarI.ag();
        if (iAg != -1) {
            mmtVar.b(iAg);
            LogUtil.a("DeviceInfoMgr", " deviceType : ", Integer.valueOf(mmtVar.e()));
        }
        String strJ = edzVarI.j();
        if (!TextUtils.isEmpty(strJ)) {
            try {
                mmtVar.d(Integer.parseInt(strJ));
                LogUtil.a("DeviceInfoMgr", " manu type : ", Integer.valueOf(mmtVar.h()));
            } catch (NumberFormatException e2) {
                LogUtil.e("DeviceInfoMgr", "brand NumberFormatException:", e2.getMessage());
            }
        }
        int iAf = edzVarI.af();
        if (iAf != -1 && iAf != 1) {
            mmtVar.e(false);
        }
        int iAf2 = edzVarI.af();
        if (iAf2 != -1) {
            mmtVar.e(iAf2);
            LogUtil.a("DeviceInfoMgr", "deviceCategory : ", Integer.valueOf(mmtVar.d()));
        }
        int iAt = edzVarI.at();
        if (iAt != -1) {
            mmtVar.a(iAt);
            LogUtil.a("DeviceInfoMgr", " hiType : ", Integer.valueOf(mmtVar.c()));
        }
        e(edlVar, map, edzVarI);
    }

    private static void e(edl edlVar, HashMap<String, Integer> map, edz edzVar) {
        int iAg;
        if (map.containsKey(edlVar.c())) {
            iAg = map.get(edlVar.c()).intValue();
        } else {
            iAg = edzVar.ag();
        }
        if (iAg != -1) {
            ArrayList<String> arrayListG = edzVar.g();
            if (arrayListG == null || arrayListG.size() <= 0) {
                LogUtil.j("DeviceInfoMgr", " bluetooth Names is null or size is 0");
                return;
            }
            ArrayList<String> arrayList = new ArrayList<>(16);
            Iterator<String> it = arrayListG.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toUpperCase(Locale.ENGLISH));
            }
            HashMap<Integer, ArrayList<String>> map2 = e;
            if (map2 != null) {
                map2.put(Integer.valueOf(iAg), arrayList);
                LogUtil.a("DeviceInfoMgr", " bluetooth Names: ", e.get(Integer.valueOf(iAg)));
            }
        }
    }

    public static mmt d(int i2) {
        c();
        mmt mmtVar = new mmt();
        synchronized (f41954a) {
            for (mmt mmtVar2 : f41955b) {
                if (mmtVar2.e() == i2) {
                    LogUtil.a("DeviceInfoMgr", "result.getDeviceType(): ", Integer.valueOf(mmtVar2.e()));
                    return mmtVar2;
                }
            }
            return mmtVar;
        }
    }

    public static boolean g(int i2) {
        c();
        return d(i2).a();
    }

    public static int b(int i2) {
        c();
        return d(i2).d();
    }

    public static mmt a(String str) {
        c();
        if (str == null || "".equals(str)) {
            return null;
        }
        synchronized (f41954a) {
            for (mmt mmtVar : f41955b) {
                if (str.equals(mmtVar.g())) {
                    return mmtVar;
                }
            }
            return null;
        }
    }

    public static String j(int i2) {
        c();
        synchronized (f41954a) {
            for (mmt mmtVar : f41955b) {
                if (i2 == mmtVar.e()) {
                    return mmtVar.g();
                }
            }
            return "";
        }
    }

    public static ArrayList<String> c(int i2) {
        c();
        return e.containsKey(Integer.valueOf(i2)) ? e.get(Integer.valueOf(i2)) : new ArrayList<>(0);
    }

    private static void c() {
        if (CompileParameterUtil.d("IS_RELEASE_VERSION")) {
            return;
        }
        String strB = CommonUtil.b(Process.myPid());
        if (TextUtils.isEmpty(strB) || strB.endsWith(":PhoneService")) {
            return;
        }
        throw new RuntimeException("DeviceInfoMgr not init in process." + strB);
    }

    public static int e(int i2) {
        c();
        Integer num = d.get(Integer.valueOf(i2));
        if (num == null) {
            LogUtil.j("DeviceInfoMgr", "getHiDeviceType hiDeviceType is null.");
            return 0;
        }
        return num.intValue();
    }

    public static boolean i(int i2) {
        c();
        return i2 == 7 || i2 == 8 || k(i2) || i2 >= 32;
    }

    private static boolean k(int i2) {
        return i2 == 13 || i2 == 14 || m(i2);
    }

    private static boolean m(int i2) {
        return i2 == 15 || i2 == 16 || l(i2);
    }

    private static boolean l(int i2) {
        return i2 == 18 || i2 == 19 || o(i2);
    }

    private static boolean o(int i2) {
        return i2 == 20 || i2 == 21 || i2 == 10 || h(i2);
    }
}
