package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.manager.util.Consts;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.datatypes.HealthSupportModel;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.MagicBuild;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class lvi {
    private static volatile HashMap<Integer, Integer> af;
    private static final HashMap<Integer, String> d;
    private static final HashMap<Integer, String> e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f40894c = {60, 35, 18, 64, 65};
    private static edn w = new edn();
    private static edn u = new edn();
    private static edn v = new edn();
    private static edn ab = new edn();
    private static edn t = new edn();
    private static edn q = new edn();
    private static edn n = new edn();
    private static edn x = new edn();
    private static edn j = new edn();
    private static edn l = new edn();
    private static edn s = new edn();
    private static edn r = new edn();
    private static edn g = new edn();
    private static edn k = new edn();
    private static edn p = new edn();
    private static edn ad = new edn();
    private static edn z = new edn();
    private static edn h = new edn();
    private static edn ac = new edn();
    private static edn o = new edn();
    private static edn m = new edn();
    private static edn aa = new edn();
    private static edn i = new edn();
    private static edn f = new edn();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ArrayList<edn> f40892a = new ArrayList<>(0);
    private static Map<Integer, ArrayList<String>> y = new ConcurrentHashMap(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f40893b = new Object();
    private static boolean ah = true;

    static {
        int i2 = 16;
        e = new HashMap(i2) { // from class: lvi.5
            private static final long serialVersionUID = -7637626950322857040L;

            {
                put(32, "CASSINI");
            }
        };
        d = new HashMap(i2) { // from class: lvi.3
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
        af = new HashMap(i2) { // from class: lvi.4
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
        i();
    }

    public static void l() {
        ah = true;
        i();
    }

    public static void i() {
        o();
        if (!ah) {
            LogUtil.a("DeviceInfoManager", "sResetInit is false");
            return;
        }
        ah = false;
        LogUtil.a("DeviceInfoManager", "enter init start");
        String language = BaseApplication.getContext().getResources().getConfiguration().locale.getLanguage();
        LogUtil.a("DeviceInfoManager", "enter init language : ", language);
        y.clear();
        synchronized (f40893b) {
            f40892a.clear();
        }
        try {
            ac();
            ad();
            h(language);
            y();
            v();
            d(language);
            i(language);
            r();
            t();
            w();
            u();
            k();
            p();
            ab();
            aa();
            x();
            ai();
            z();
            s();
            q();
        } catch (MissingFormatArgumentException unused) {
            LogUtil.e("DeviceInfoManager", "init MissingFormatArgumentException");
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: lvi.1
            @Override // java.lang.Runnable
            public void run() {
                ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).clearPluginInfoList();
                lvi.m();
            }
        });
    }

    public static HashMap<String, Integer> f() {
        o();
        return edg.b();
    }

    public static String d(int i2) {
        o();
        for (Map.Entry<String, Integer> entry : edg.b().entrySet()) {
            if (entry != null && entry.getKey() != null) {
                String key = entry.getKey();
                if ((edg.b().get(key) != null ? edg.b().get(key).intValue() : 0) == i2) {
                    return key;
                }
            }
        }
        return "";
    }

    public static int b(int i2) {
        o();
        Integer num = af.get(Integer.valueOf(i2));
        if (num == null) {
            LogUtil.j("DeviceInfoManager", "getHiDeviceType hiDeviceType is null.");
            return 0;
        }
        return num.intValue();
    }

    public static boolean l(int i2) {
        o();
        for (int i3 : f40894c) {
            if (i3 == i2) {
                return true;
            }
        }
        if (i2 >= 74) {
            edn ednVarA = a(i2);
            if (ednVarA.p() == 2) {
                return true;
            }
            LogUtil.j("DeviceInfoManager", "manuType", Integer.valueOf(ednVarA.p()));
        }
        return false;
    }

    private static void s() {
        i.a(44);
        i.g(92);
        i.c(2);
        i.b((Boolean) true);
        synchronized (f40893b) {
            f40892a.add(i);
        }
    }

    private static void q() {
        f.a(45);
        f.g(93);
        f.c(2);
        f.b((Boolean) true);
        synchronized (f40893b) {
            f40892a.add(f);
        }
    }

    private static void ai() {
        ac.a(BaseApplication.getContext().getString(R.string.IDS_app_display_name_talos));
        ac.a(20);
        ac.c(BaseApplication.getContext().getString(R.string.IDS_talos_device_description));
        ac.g(79);
        ac.c(2);
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add("talos-".toUpperCase(Locale.ENGLISH));
        arrayList.add("honor Watch-".toUpperCase(Locale.ENGLISH));
        y.put(20, arrayList);
        ArrayList<String> arrayList2 = new ArrayList<>(0);
        arrayList2.add(BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_talos_product_introduction));
        arrayList2.add(BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_talos_product_introduction));
        ac.e(arrayList2);
        ac.b((Boolean) false);
        ac.j(2);
        Object obj = f40893b;
        synchronized (obj) {
            f40892a.add(ac);
        }
        o.a(BaseApplication.getContext().getString(R.string.IDS_app_display_name_fortuna));
        o.a(21);
        o.c(BaseApplication.getContext().getString(R.string.IDS_fortuna_device_description));
        o.g(80);
        o.c(2);
        ArrayList<String> arrayList3 = new ArrayList<>(0);
        arrayList3.add("fortuna-".toUpperCase(Locale.ENGLISH));
        arrayList3.add("HUAWEI WATCH GT-".toUpperCase(Locale.ENGLISH));
        y.put(21, arrayList3);
        ArrayList<String> arrayList4 = new ArrayList<>(0);
        arrayList4.add(BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_fortuna_product_introduction));
        arrayList4.add(BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_fortuna_product_introduction));
        o.e(arrayList4);
        o.b((Boolean) false);
        o.j(1);
        synchronized (obj) {
            f40892a.add(o);
        }
    }

    private static void x() {
        m.a(BaseApplication.getContext().getString(R.string.IDS_app_display_name_crius));
        m.a(18);
        m.c(BaseApplication.getContext().getString(R.string.IDS_crius_device_description));
        m.g(77);
        m.c(2);
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add("crius-".toUpperCase(Locale.ENGLISH));
        arrayList.add("Honor Band 4-".toUpperCase(Locale.ENGLISH));
        y.put(18, arrayList);
        ArrayList<String> arrayList2 = new ArrayList<>(0);
        arrayList2.add(String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_hw_wear_crius_intro), 50));
        arrayList2.add(String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_hw_wear_crius_intro), 50));
        m.e(arrayList2);
        m.b((Boolean) true);
        m.j(2);
        Object obj = f40893b;
        synchronized (obj) {
            f40892a.add(m);
        }
        aa.a(BaseApplication.getContext().getString(R.string.IDS_app_display_name_terra));
        aa.a(19);
        aa.c(BaseApplication.getContext().getString(R.string.IDS_terra_device_description));
        aa.g(78);
        aa.c(2);
        ArrayList<String> arrayList3 = new ArrayList<>(0);
        arrayList3.add("terra-".toUpperCase(Locale.ENGLISH));
        arrayList3.add("HUAWEI Band 3 Pro-".toUpperCase(Locale.ENGLISH));
        y.put(19, arrayList3);
        ArrayList<String> arrayList4 = new ArrayList<>(0);
        arrayList4.add(String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_hw_wear_terra_intro), 50));
        arrayList4.add(String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_hw_wear_terra_intro), 50));
        aa.e(arrayList4);
        aa.b((Boolean) true);
        aa.j(1);
        synchronized (obj) {
            f40892a.add(aa);
        }
    }

    private static void aa() {
        ad.a(BaseApplication.getContext().getString(R.string.IDS_huawei_r1_pro_content));
        ad.a(11);
        ad.c(BaseApplication.getContext().getString(R.string.IDS_device_r1_pro_name_title));
        ad.i(R.mipmap.id_devicemanager_r1_pro);
        ad.f(R.mipmap.id_devicemanager_r1_pro_disconnected);
        ad.g(43);
        ad.d(R.mipmap.img_home_r1_pro_banner);
        ad.c(1);
        z.k(R.mipmap.id_devicemanager_r1_pro);
        ad.j(1);
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add("HUAWEI CM-R1P".toUpperCase(Locale.ENGLISH));
        arrayList.add("HUAWEI AM-R1".toUpperCase(Locale.ENGLISH));
        y.put(11, arrayList);
        if (!Utils.m()) {
            synchronized (f40893b) {
                f40892a.add(ad);
            }
        }
        ArrayList<String> arrayList2 = new ArrayList<>(0);
        arrayList2.add(BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_r1pro_product_introduction));
        arrayList2.add(BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_r1pro_product_introduction));
        ad.e(arrayList2);
        ArrayList<Integer> arrayList3 = new ArrayList<>(0);
        arrayList3.add(Integer.valueOf(R.mipmap.id_devicemanager_r1_pro));
        arrayList3.add(Integer.valueOf(R.mipmap.img_device_r1p_pic2));
        ad.d(arrayList3);
        h.a(BaseApplication.getContext().getString(R.string.IDS_DEVICE_HONOUR_WIRED_830_41));
        h.a(75);
        h.c(BaseApplication.getContext().getString(R.string.IDS_DEVICE_HEART_RATE_C_943_467));
        h.i(R.mipmap.pic_headset_honor_entance);
        h.f(R.mipmap.device_icon_honorband_r1_disconnect);
        h.g(75);
        h.d(R.mipmap.img_home_honorbandr1);
        h.c(1);
        h.k(R.mipmap.img_device_r1_pic1);
        h.j(2);
    }

    private static void z() {
        p.a(BaseApplication.getContext().getString(R.string.IDS_device_latona_name));
        p.a(34);
        p.c(String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_device_latona_description_add2e), 46, 42));
        p.i(R.mipmap.device_icon_watch_default);
        p.f(R.mipmap.device_icon_gemini_disconnect);
        p.g(88);
        p.k(R.mipmap.device_icon_watch_default);
        p.d(R.mipmap.device_icon_watch_default_new);
        p.c(1);
        p.b((Boolean) false);
        p.j(1);
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add("HUAWEI LTN-".toUpperCase(Locale.ENGLISH));
        arrayList.add("HUAWEI DAN-".toUpperCase(Locale.ENGLISH));
        arrayList.add("HUAWEI WATCH GT 2-".toUpperCase(Locale.ENGLISH));
        y.put(34, arrayList);
        ArrayList<String> arrayList2 = new ArrayList<>(0);
        arrayList2.add(BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_b3_product_introduction_new));
        arrayList2.add(BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_b3_product_introduction_new));
        p.e(arrayList2);
        ArrayList<Integer> arrayList3 = new ArrayList<>(0);
        arrayList3.add(Integer.valueOf(R.mipmap.device_icon_watch_default));
        arrayList3.add(Integer.valueOf(R.mipmap.device_icon_watch_default));
        p.d(arrayList3);
        synchronized (f40893b) {
            f40892a.add(p);
        }
    }

    private static void p() {
        k.a(BaseApplication.getContext().getString(R.string.IDS_app_display_name_gemini));
        k.a(7);
        k.c(BaseApplication.getContext().getString(R.string.IDS_startup_tablband_intro));
        k.i(R.mipmap.img_huawei_b3_pic1);
        k.f(R.mipmap.device_icon_gemini_disconnect);
        k.g(39);
        k.k(R.mipmap.img_huawei_b3_pic1);
        k.d(R.mipmap.pic_band_huawei_b3);
        k.c(1);
        k.j(1);
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add("HUAWEI GE".toUpperCase(Locale.ENGLISH));
        arrayList.add("HUAWEI B3-".toUpperCase(Locale.ENGLISH));
        y.put(7, arrayList);
        ArrayList<String> arrayList2 = new ArrayList<>(0);
        arrayList2.add(BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_b3_product_introduction_new));
        arrayList2.add(BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_b3_product_introduction_new));
        k.e(arrayList2);
        ArrayList<Integer> arrayList3 = new ArrayList<>(0);
        arrayList3.add(Integer.valueOf(R.mipmap.img_huawei_b3_pic1));
        arrayList3.add(Integer.valueOf(R.mipmap.img_huawei_b3_pic2));
        k.d(arrayList3);
        synchronized (f40893b) {
            f40892a.add(k);
        }
    }

    private static void ab() {
        z.a(BaseApplication.getContext().getString(R.string.IDS_huawei_r1_content));
        z.a(11);
        z.c(BaseApplication.getContext().getString(R.string.IDS_device_r1_name_title));
        z.i(R.mipmap.img_device_r1_pic1);
        z.f(R.mipmap.device_icon_honorband_r1_disconnect);
        z.g(43);
        z.d(R.mipmap.img_home_honorbandr1);
        z.c(1);
        z.k(R.mipmap.img_device_r1_pic1);
        z.j(1);
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add("HUAWEI AM-R1".toUpperCase(Locale.ENGLISH));
        y.put(11, arrayList);
        ArrayList<String> arrayList2 = new ArrayList<>(0);
        arrayList2.add(BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_r1_product_introduction));
        arrayList2.add(BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_r1_product_introduction));
        z.e(arrayList2);
        ArrayList<Integer> arrayList3 = new ArrayList<>(0);
        arrayList3.add(Integer.valueOf(R.mipmap.img_device_r1_pic1));
        arrayList3.add(Integer.valueOf(R.mipmap.img_device_r1_pic2));
        z.d(arrayList3);
        if (Utils.m()) {
            return;
        }
        synchronized (f40893b) {
            f40892a.add(z);
        }
    }

    private static void w() {
        s.a(BaseApplication.getContext().getString(R.string.IDS_app_display_name_honor_aw));
        s.a(24);
        s.c(BaseApplication.getContext().getString(R.string.IDS_aw_content));
        s.g(83);
        s.c(2);
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add("HONOR AW70");
        arrayList.add("honor Band 4R-");
        y.put(24, arrayList);
        ArrayList<String> arrayList2 = new ArrayList<>(0);
        arrayList2.add(String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_aw_product_introduction), 50));
        arrayList2.add(String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_aw_product_introduction), 50));
        s.e(arrayList2);
        s.b((Boolean) true);
        s.j(2);
        synchronized (f40893b) {
            f40892a.add(s);
        }
    }

    private static void u() {
        r.a(BaseApplication.getContext().getString(R.string.IDS_app_display_name_honor_aw_pro));
        r.a(37);
        r.c(BaseApplication.getContext().getString(R.string.IDS_aw_pro_support_basketball_run_bracelet));
        r.g(91);
        r.c(2);
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add("AW70B39HN");
        y.put(37, arrayList);
        ArrayList<String> arrayList2 = new ArrayList<>(0);
        arrayList2.add(String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_aw_pro_support_run_data_fashion_bracelet), 50));
        arrayList2.add(String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_aw_pro_support_run_data_fashion_bracelet), 50));
        r.e(arrayList2);
        r.b((Boolean) true);
        r.j(2);
        synchronized (f40893b) {
            f40892a.add(r);
        }
    }

    private static void k() {
        g.a(qrs.c(BaseApplication.getContext()));
        g.a(12);
        g.c(BaseApplication.getContext().getString(R.string.IDS_huawei_a1p_content));
        g.i(R.mipmap.img_device_honor_a1_pic1);
        g.f(R.mipmap.device_icon_a1_disconnect);
        g.g(44);
        g.k(R.mipmap.img_device_honor_a1_pic1);
        g.d(R.mipmap.pic_band_honor_a2);
        g.c(2);
        g.j(qrs.d(BaseApplication.getContext()));
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add("HUAWEI band A2".toUpperCase(Locale.ENGLISH));
        arrayList.add("honor band A2".toUpperCase(Locale.ENGLISH));
        arrayList.add("AW61".toUpperCase(Locale.ENGLISH));
        arrayList.add("HUAWEI Color Band A2".toUpperCase(Locale.ENGLISH));
        y.put(12, arrayList);
        ArrayList<String> arrayList2 = new ArrayList<>(0);
        arrayList2.add(BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_a1_product_introduction_new_fixed));
        arrayList2.add(BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_a1_product_introduction_new_fixed));
        g.e(arrayList2);
        ArrayList<Integer> arrayList3 = new ArrayList<>(0);
        arrayList3.add(Integer.valueOf(R.mipmap.img_device_honor_a1_pic1));
        arrayList3.add(Integer.valueOf(R.mipmap.img_device_honor_a1_pic2));
        g.d(arrayList3);
        synchronized (f40893b) {
            f40892a.add(g);
        }
    }

    private static void i(String str) {
        x.a(BaseApplication.getContext().getString(R.string.IDS_app_display_name_nys));
        x.a(13);
        x.c(String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_nyx_content), 50));
        x.i(R.mipmap.img_honor_nyx_pic1);
        x.f(R.mipmap.device_icon_nyx_disconnect);
        x.g(42);
        x.k(R.mipmap.img_honor_nyx_pic1);
        x.d(R.mipmap.pic_band_honor_3);
        x.c(2);
        x.b((Boolean) true);
        x.j(2);
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add("HUAWEI NYX".toUpperCase(Locale.ENGLISH));
        arrayList.add("HONOR NYX".toUpperCase(Locale.ENGLISH));
        arrayList.add("Honor Band 3-".toUpperCase(Locale.ENGLISH));
        y.put(13, arrayList);
        ArrayList<String> arrayList2 = new ArrayList<>(0);
        if ("en".equals(str)) {
            arrayList2.add(BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_nyx_product_introduction_new_5atm));
            arrayList2.add(BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_nyx_product_introduction_new_5atm));
        } else {
            arrayList2.add(String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_nyx_product_introduction_new), 50));
            arrayList2.add(String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_nyx_product_introduction_new), 50));
        }
        x.e(arrayList2);
        ArrayList<Integer> arrayList3 = new ArrayList<>(0);
        arrayList3.add(Integer.valueOf(R.mipmap.img_honor_nyx_pic1));
        arrayList3.add(Integer.valueOf(R.mipmap.img_honor_nyx_pic2));
        x.d(arrayList3);
        synchronized (f40893b) {
            f40892a.add(x);
        }
    }

    private static void r() {
        j.a(BaseApplication.getContext().getString(R.string.IDS_app_display_name_aw));
        j.a(23);
        j.c(BaseApplication.getContext().getString(R.string.IDS_aw_content));
        j.g(81);
        j.c(2);
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add("HUAWEI Band 3e-");
        y.put(23, arrayList);
        ArrayList<String> arrayList2 = new ArrayList<>(0);
        arrayList2.add(String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_aw_product_introduction), 50));
        arrayList2.add(String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_aw_product_introduction), 50));
        j.e(arrayList2);
        j.b((Boolean) true);
        j.j(1);
        synchronized (f40893b) {
            f40892a.add(j);
        }
    }

    private static void t() {
        l.a(BaseApplication.getContext().getString(R.string.IDS_app_display_name_aw_pro));
        l.a(36);
        l.c(BaseApplication.getContext().getString(R.string.IDS_aw_pro_support_basketball_run_bracelet));
        l.g(90);
        l.c(2);
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add("AW70B39HW");
        arrayList.add("HUAWEI Band 4e-");
        y.put(36, arrayList);
        ArrayList<String> arrayList2 = new ArrayList<>(0);
        arrayList2.add(String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_aw_pro_support_run_data_fashion_bracelet), 50));
        arrayList2.add(String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_aw_pro_support_run_data_fashion_bracelet), 50));
        l.e(arrayList2);
        l.b((Boolean) true);
        l.j(1);
        synchronized (f40893b) {
            f40892a.add(l);
        }
    }

    private static void v() {
        q.a(BaseApplication.getContext().getString(R.string.IDS_app_display_name_grus));
        q.a(14);
        q.c(BaseApplication.getContext().getString(R.string.IDS_startup_tablband_intro));
        q.i(R.mipmap.img_huawei_grus_pic1);
        q.f(R.mipmap.device_icon_grus_disconnect);
        q.g(45);
        q.k(R.mipmap.img_huawei_grus_pic1);
        q.d(R.mipmap.pic_band_huawei_b3_young);
        q.c(1);
        q.j(1);
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add("HUAWEI GRUS".toUpperCase(Locale.ENGLISH));
        arrayList.add("HUAWEI B3 Lite-".toUpperCase(Locale.ENGLISH));
        y.put(14, arrayList);
        ArrayList<String> arrayList2 = new ArrayList<>(0);
        arrayList2.add(BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_grus_product_introduction_new));
        arrayList2.add(BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_grus_product_introduction_new));
        q.e(arrayList2);
        ArrayList<Integer> arrayList3 = new ArrayList<>(0);
        arrayList3.add(Integer.valueOf(R.mipmap.img_huawei_grus_pic1));
        arrayList3.add(Integer.valueOf(R.mipmap.img_huawei_grus_pic2));
        q.d(arrayList3);
        synchronized (f40893b) {
            f40892a.add(q);
        }
    }

    private static void d(String str) {
        if (!Utils.o() || LanguageUtil.o(BaseApplication.getContext())) {
            n.a(BaseApplication.getContext().getString(R.string.IDS_app_display_name_eris));
        } else {
            n.a(BaseApplication.getContext().getString(R.string.IDS_app_display_name_eris_new));
        }
        n.a(15);
        try {
            n.c(String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_nyx_content), 50));
        } catch (MissingFormatArgumentException unused) {
            LogUtil.e("DeviceInfoManager", "initEris MissingFormatArgumentException");
        }
        n.i(R.mipmap.img_huawei_eris_pic1);
        n.f(R.mipmap.device_icon_eris_disconnect);
        n.g(47);
        n.k(R.mipmap.img_huawei_eris_pic1);
        n.d(R.mipmap.pic_band_huawei_sport);
        n.c(2);
        n.j(1);
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add("Huawei Band 2-".toUpperCase(Locale.ENGLISH));
        y.put(15, arrayList);
        n.e(e(str));
        ArrayList<Integer> arrayList2 = new ArrayList<>(0);
        arrayList2.add(Integer.valueOf(R.mipmap.img_huawei_eris_pic1));
        arrayList2.add(Integer.valueOf(R.mipmap.img_huawei_eris_pic2));
        n.d(arrayList2);
        synchronized (f40893b) {
            f40892a.add(n);
        }
    }

    private static ArrayList<String> e(String str) {
        ArrayList<String> arrayList = new ArrayList<>(0);
        if ("en".equals(str)) {
            arrayList.add(BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_eris_product_introduction_new_5atm));
            arrayList.add(BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_eris_product_introduction_new_5atm));
            return arrayList;
        }
        try {
            arrayList.add(String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_eris_product_introduction_new), 50));
            arrayList.add(String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_eris_product_introduction_new), 50));
            return arrayList;
        } catch (MissingFormatArgumentException unused) {
            LogUtil.e("DeviceInfoManager", "string format exception");
            return arrayList;
        }
    }

    private static void y() {
        t.a(BaseApplication.getContext().getString(R.string.IDS_app_display_name_janus));
        t.a(16);
        t.c(BaseApplication.getContext().getString(R.string.HomeDeviceCloud_IDS_Janus_Device_Description));
        t.g(74);
        t.c(1);
        t.b((Boolean) true);
        t.j(1);
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add("HUAWEI JNS-".toUpperCase(Locale.ENGLISH));
        arrayList.add("HUAWEI B5-".toUpperCase(Locale.ENGLISH));
        y.put(16, arrayList);
        ArrayList<String> arrayList2 = new ArrayList<>(0);
        arrayList2.add(BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_janus_product_introduction));
        arrayList2.add(BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_janus_product_introduction));
        t.e(arrayList2);
        synchronized (f40893b) {
            f40892a.add(t);
        }
    }

    private static void h(String str) {
        ab.a(qrs.p(BaseApplication.getContext()));
        ab.a(8);
        try {
            ab.c(String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_S1_description_content), 50));
        } catch (MissingFormatArgumentException unused) {
            LogUtil.e("DeviceInfoManager", "initS1 MissingFormatArgumentException");
        }
        ab.i(R.mipmap.img_honor_s1_pic1);
        ab.f(R.mipmap.device_icon_metis_disconnect);
        ab.g(41);
        ab.k(R.mipmap.img_honor_s1_pic1);
        ab.d(R.mipmap.pic_watch_honor_s1);
        ab.c(2);
        ab.j(qrs.r(BaseApplication.getContext()));
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add("metis".toUpperCase(Locale.ENGLISH));
        arrayList.add("honor watch S1".toUpperCase(Locale.ENGLISH));
        arrayList.add("HUAWEI FIT".toUpperCase(Locale.ENGLISH));
        y.put(8, arrayList);
        ArrayList<String> arrayList2 = new ArrayList<>(0);
        if ("en".equals(str)) {
            arrayList2.add(BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_s1_product_introduction_new_5atm));
            arrayList2.add(BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_s1_product_introduction_new_5atm));
        } else {
            arrayList2.add(String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_s1_product_introduction_new), 50));
            arrayList2.add(String.format(Locale.ENGLISH, BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_s1_product_introduction_new), 50));
        }
        ab.e(arrayList2);
        ArrayList<Integer> arrayList3 = new ArrayList<>(0);
        arrayList3.add(Integer.valueOf(R.mipmap.img_honor_s1_pic1));
        arrayList3.add(Integer.valueOf(R.mipmap.img_honor_s1_pic2));
        ab.d(arrayList3);
        synchronized (f40893b) {
            f40892a.add(ab);
        }
    }

    private static void ac() {
        w.a(BaseApplication.getContext().getString(R.string.IDS_app_display_name_leo));
        w.a(10);
        w.c(BaseApplication.getContext().getString(R.string.IDS_add_device_smart_watch_content));
        w.i(R.mipmap.img_huawei_watch_w2_pic1);
        w.f(R.mipmap.device_icon_leo_disconnected);
        w.g(46);
        w.d(R.mipmap.pic_watch_huawei_leo);
        w.c(0);
        w.k(R.mipmap.img_huawei_watch_w2_pic1);
        w.b((Boolean) false);
        w.j(1);
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_huawei_watch2_introduction));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_huawei_watch2_introduction));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_huawei_watch2_introduction));
        w.e(arrayList);
        ArrayList<Integer> arrayList2 = new ArrayList<>(0);
        arrayList2.add(Integer.valueOf(R.mipmap.img_huawei_watch_w2_pic1));
        arrayList2.add(Integer.valueOf(R.mipmap.img_huawei_watch_w2_pic2));
        arrayList2.add(Integer.valueOf(R.mipmap.img_huawei_watch_w2_pic3));
        w.d(arrayList2);
        synchronized (f40893b) {
            f40892a.add(w);
        }
        u.a(BaseApplication.getContext().getString(R.string.IDS_app_display_name_porc));
        u.a(10);
        u.c(BaseApplication.getContext().getString(R.string.IDS_add_device_smart_watch_content));
        u.i(R.mipmap.img_porsche_design_pic1);
        u.f(R.mipmap.device_icon_leo2_disconnect);
        u.g(46);
        u.b((Boolean) false);
        u.j(1);
        ArrayList<String> arrayList3 = new ArrayList<>(0);
        arrayList3.add(BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_huawei_watch2_proc_introduction));
        arrayList3.add(BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_huawei_watch2_proc_introduction));
        u.e(arrayList3);
        ArrayList<Integer> arrayList4 = new ArrayList<>(0);
        arrayList4.add(Integer.valueOf(R.mipmap.img_porsche_design_pic1));
        arrayList4.add(Integer.valueOf(R.mipmap.img_porsche_design_pic2));
        u.d(arrayList4);
    }

    private static void ad() {
        v.a(BaseApplication.getContext().getString(R.string.IDS_app_display_name_porc));
        v.a(10);
        v.c(BaseApplication.getContext().getString(R.string.IDS_huawei_watch_series));
        v.i(R.mipmap.device_icon_watch_default);
        v.f(R.mipmap.device_icon_leo2_disconnect);
        v.g(46);
        v.b((Boolean) false);
        v.j(1);
        ArrayList<String> arrayList = new ArrayList<>(0);
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_huawei_watch2_proc_introduction));
        arrayList.add(BaseApplication.getContext().getString(R.string.IDS_hw_health_wear_huawei_watch2_proc_introduction));
        v.e(arrayList);
        ArrayList<Integer> arrayList2 = new ArrayList<>(0);
        arrayList2.add(Integer.valueOf(R.mipmap.img_porsche_design_pic1));
        arrayList2.add(Integer.valueOf(R.mipmap.img_porsche_design_pic2));
        v.d(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m() {
        List<edx> indexList = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getIndexList();
        if (indexList == null || indexList.size() <= 0) {
            return;
        }
        LogUtil.a("DeviceInfoManager", "getDownloadedEzPluginInfo.size > 0");
        for (edx edxVar : indexList) {
            if (((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(edxVar.b())) {
                b(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(edxVar.b()));
            }
        }
    }

    public static void b(edl edlVar) {
        o();
        LogUtil.a("DeviceInfoManager", " enter loadDeviceInfoFromJson.");
        if (edlVar == null) {
            LogUtil.a("DeviceInfoManager", "null is info");
            return;
        }
        LogUtil.a("DeviceInfoManager", "null is not info");
        if (edlVar.c() == null) {
            LogUtil.a("DeviceInfoManager", " null is info.fetchPluginUuid()");
            return;
        }
        synchronized (f40893b) {
            if (f40892a == null) {
                LogUtil.j("DeviceInfoManager", "allDevices is null");
                return;
            }
            if (edg.b() != null && !edg.b().containsKey(edlVar.c())) {
                LogUtil.a("DeviceInfoManager", " uuidTypes is not containsKey");
            }
            a(edlVar);
        }
    }

    public static edn c(String str, boolean z2) {
        o();
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeviceInfoManager", "getDeviceInfo uuid is null");
            return null;
        }
        if (!edg.a().containsKey(str)) {
            return null;
        }
        int iIntValue = edg.a().get(str).intValue();
        if (iIntValue == 10) {
            if (z2) {
                return u;
            }
            return w;
        }
        if (iIntValue == 11) {
            if (edg.d(str)) {
                return z;
            }
            return ad;
        }
        return a(edg.a().get(str).intValue());
    }

    public static String c(int i2) {
        o();
        for (Map.Entry<String, Integer> entry : edg.a().entrySet()) {
            if (entry != null && entry.getKey() != null) {
                String key = entry.getKey();
                if ((edg.a().get(key) != null ? edg.a().get(key).intValue() : 0) == i2) {
                    return key;
                }
            }
        }
        return "";
    }

    private static void a(edl edlVar) {
        edn ednVarA;
        if (edg.b().containsKey(edlVar.c())) {
            LogUtil.a("DeviceInfoManager", "setLoadDeviceInfo local");
            ednVarA = a(edg.b().get(edlVar.c()).intValue());
            LogUtil.a("DeviceInfoManager", "setLoadDeviceInfo fetchPluginUuid: ", edlVar.c());
            if (ednVarA != null && ednVarA.l() != edg.b().get(edlVar.c()).intValue()) {
                LogUtil.a("DeviceInfoManager", "setLoadDeviceInfo getDeviceType(): ", Integer.valueOf(ednVarA.l()));
                synchronized (f40893b) {
                    LogUtil.a("DeviceInfoManager", "setLoadDeviceInfo local add");
                    f40892a.add(ednVarA);
                }
            }
        } else {
            LogUtil.a("DeviceInfoManager", "setLoadDeviceInfo cloud");
            ednVarA = a(edlVar.c());
            if (ednVarA == null && edlVar.i() != null) {
                int iAg = edlVar.i().ag();
                LogUtil.a("DeviceInfoManager", "setLoadDeviceInfo cloud deviceType:", Integer.valueOf(iAg));
                if (iAg != -1) {
                    ednVarA = a(iAg);
                }
                LogUtil.a("DeviceInfoManager", "setLoadDeviceInfo cloud getDeviceType:", ednVarA == null ? Constants.NULL : Integer.valueOf(ednVarA.l()));
                if (ednVarA != null && ednVarA.l() != iAg) {
                    ednVarA = null;
                }
            }
            if (ednVarA == null) {
                ednVarA = new edn();
                synchronized (f40893b) {
                    LogUtil.a("DeviceInfoManager", "setLoadDeviceInfo cloud add:");
                    f40892a.add(ednVarA);
                }
            }
        }
        lvm.c(edlVar, ednVarA, edg.b(), y);
    }

    public static ArrayList<edn> b(boolean z2) {
        o();
        ArrayList<edn> arrayList = new ArrayList<>(0);
        LogUtil.a("DeviceInfoManager", " BETA_VERSION_DISABLE : ", false);
        arrayList.add(p);
        if (h(10) && !z2) {
            arrayList.add(w);
            arrayList.add(u);
        }
        if (lrp.i) {
            arrayList.add(ab);
        }
        return arrayList;
    }

    public static edn e() {
        o();
        LogUtil.a("DeviceInfoManager", "enter getInfoForPorscheFirst");
        return v;
    }

    public static ArrayList<edn> n() {
        o();
        LogUtil.a("DeviceInfoManager", "enter listInfoForPorscheSecond");
        ArrayList<edn> arrayList = new ArrayList<>(0);
        arrayList.add(u);
        return arrayList;
    }

    public static ArrayList<edn> a(boolean z2) {
        o();
        ArrayList<edn> arrayList = new ArrayList<>(0);
        if (lrp.d && !z2) {
            arrayList.add(q);
        }
        if (lrp.f40728a) {
            arrayList.add(n);
        }
        if (lrp.h) {
            arrayList.add(x);
        }
        if (lrp.e && !z2) {
            arrayList.add(g);
        }
        if (!z2) {
            arrayList.add(k);
        }
        return arrayList;
    }

    public static ArrayList<edn> g() {
        o();
        ArrayList<edn> arrayList = new ArrayList<>(0);
        if (lrp.f && !Utils.m()) {
            arrayList.add(z);
            arrayList.add(ad);
        }
        return arrayList;
    }

    public static edn a(int i2) {
        o();
        edn ednVar = new edn();
        synchronized (f40893b) {
            for (edn ednVar2 : f40892a) {
                if (ednVar2.l() == i2) {
                    LogUtil.a("DeviceInfoManager", "result.getDeviceType():", Integer.valueOf(ednVar2.l()));
                    return ednVar2;
                }
            }
            return ednVar;
        }
    }

    public static edn a(String str) {
        ReleaseLogUtil.d("R_DeviceInfoManager", "plugin id: ", str, ", allDevices size: ", Integer.valueOf(f40892a.size()));
        o();
        if (str == null || "".equals(str)) {
            return null;
        }
        synchronized (f40893b) {
            for (edn ednVar : f40892a) {
                ReleaseLogUtil.d("R_DeviceInfoManager", "plugin id is: ", ednVar.aa());
                if (str.equals(ednVar.aa())) {
                    return ednVar;
                }
            }
            return null;
        }
    }

    public static edn j() {
        o();
        return u;
    }

    public static edn h() {
        o();
        return ad;
    }

    public static edn d() {
        o();
        return h;
    }

    public static int c(String str) {
        o();
        LogUtil.a("DeviceInfoManager", "enter getTypeByName name:", str);
        Set<Map.Entry<Integer, ArrayList<String>>> setEntrySet = y.entrySet();
        if (setEntrySet == null || setEntrySet.isEmpty()) {
            LogUtil.a("DeviceInfoManager", "enter getTypeByName entries is null");
            return -1;
        }
        for (Map.Entry<Integer, ArrayList<String>> entry : setEntrySet) {
            for (String str2 : entry.getValue()) {
                if (str != null && str2 != null && str.toUpperCase(Locale.ENGLISH).contains(str2.toUpperCase(Locale.ENGLISH))) {
                    return entry.getKey().intValue();
                }
            }
        }
        return -1;
    }

    public static ArrayList<String> e(int i2) {
        o();
        return y.containsKey(Integer.valueOf(i2)) ? y.get(Integer.valueOf(i2)) : new ArrayList<>(0);
    }

    public static boolean h(int i2) {
        boolean zIsSupportB3;
        o();
        HealthSupportModel healthSupportModelC = eem.c();
        switch (i2) {
            case 7:
                zIsSupportB3 = healthSupportModelC.isSupportB3();
                break;
            case 8:
                zIsSupportB3 = healthSupportModelC.isSupportMetis();
                break;
            case 9:
            default:
                zIsSupportB3 = false;
                break;
            case 10:
                zIsSupportB3 = healthSupportModelC.isSupportLeo();
                break;
            case 11:
                zIsSupportB3 = healthSupportModelC.isSupportR1();
                break;
            case 12:
                zIsSupportB3 = healthSupportModelC.isSupportA2();
                break;
            case 13:
                zIsSupportB3 = healthSupportModelC.isSupportNyx();
                break;
            case 14:
                zIsSupportB3 = healthSupportModelC.isSupportB3Lite();
                break;
            case 15:
                zIsSupportB3 = healthSupportModelC.isSupportEris();
                break;
        }
        LogUtil.a("DeviceInfoManager", "isHealthSupport deviceType:", i2 + "  isSupport:", Boolean.valueOf(zIsSupportB3));
        return zIsSupportB3;
    }

    public static List<String> b() {
        o();
        ArrayList arrayList = new ArrayList(0);
        arrayList.add("metis");
        arrayList.add("honor watch S1");
        arrayList.add("HUAWEI FIT");
        arrayList.add("HUAWEI band A2");
        arrayList.add("honor band A2");
        arrayList.add("AW61");
        arrayList.add("HUAWEI Color Band A2");
        if (lrp.h) {
            arrayList.add("HUAWEI NYX");
            arrayList.add("HONOR NYX");
            arrayList.add("Honor Band 3-");
        }
        arrayList.add("Huawei Band 2-");
        arrayList.add("HUAWEI GE");
        arrayList.add("HUAWEI B3-");
        arrayList.add("HUAWEI AM-R1");
        arrayList.add("HUAWEI CM-R1P");
        arrayList.add("HUAWEI GRUS");
        arrayList.add("HUAWEI B3 Lite-");
        arrayList.add("HUAWEI Band 3e-");
        arrayList.add("AW70B39HW");
        arrayList.add("HUAWEI Band 4e-");
        arrayList.add("HONOR AW70");
        arrayList.add("honor Band 4R-");
        arrayList.add("AW70B39HN");
        arrayList.add("crius-");
        arrayList.add("Honor Band 4-");
        arrayList.add("HONOR Band 5-");
        arrayList.add("terra-");
        arrayList.add("HUAWEI Band 3 Pro-");
        arrayList.add("HUAWEI Band 3-");
        arrayList.add("talos-");
        arrayList.add("honor Watch-");
        arrayList.add("fortuna-");
        arrayList.add("HUAWEI WATCH GT-");
        arrayList.add("HUAWEI LTN-");
        arrayList.add("HUAWEI WATCH GT 2-");
        arrayList.add("HUAWEI DAN-");
        arrayList.add("HONOR Band 4X-");
        arrayList.add("HONOR Band 5i-");
        arrayList.add("HUAWEI Band 3i-");
        arrayList.add("HONOR MagicWatch 2-");
        return arrayList;
    }

    public static String e(int i2, String str, boolean z2) {
        String strO;
        o();
        LogUtil.a("DeviceInfoManager", "getDeviceNameFromDeviceTypeForBI originalType:", Integer.valueOf(i2), " name:", str, " isPro:" + z2);
        switch (i2) {
            case 8:
                strO = "IDS_device_metis_name_honor_watch_s1";
                break;
            case 9:
            default:
                strO = o(i2);
                break;
            case 10:
                if (z2) {
                    strO = "IDS_app_display_name_porc";
                } else {
                    strO = "IDS_app_display_name_leo";
                }
                break;
            case 11:
                if ("HUAWEI CM-R1P".equals(str) || BaseApplication.getContext().getString(R.string.IDS_huawei_r1_pro_content).equals(str) || BaseApplication.getContext().getString(R.string.IDS_device_r1_pro_name_title).equals(str)) {
                    strO = "IDS_huawei_r1_pro_content";
                } else {
                    strO = "IDS_huawei_r1_content";
                }
                break;
            case 12:
                strO = "IDS_select_device_talkband_a1";
                break;
            case 13:
                strO = "IDS_app_display_name_nys";
                break;
            case 14:
                strO = "IDS_app_display_name_grus";
                break;
            case 15:
                strO = "IDS_app_display_name_eris";
                break;
            case 16:
                strO = "JANUS";
                break;
        }
        LogUtil.a("DeviceInfoManager", "getDeviceNameFromDeviceTypeForBI:", strO);
        return strO;
    }

    private static String o(int i2) {
        String strQ;
        if (i2 == 7) {
            strQ = "IDS_app_display_name_gemini";
        } else if (i2 == 32) {
            strQ = "CASSINI";
        } else if (i2 == 34) {
            strQ = "LATONA";
        } else if (i2 == 23) {
            strQ = "AW70B29";
        } else if (i2 == 24) {
            strQ = "AW70B19";
        } else if (i2 == 36) {
            strQ = "AW70B39HW";
        } else if (i2 == 37) {
            strQ = "AW70B39HN";
        } else if (i2 == 44) {
            strQ = "ANDES_B19";
        } else if (i2 != 45) {
            switch (i2) {
                case 18:
                    strQ = "CRIUS";
                    break;
                case 19:
                    strQ = "TERRA";
                    break;
                case 20:
                    strQ = "TALOS";
                    break;
                case 21:
                    strQ = "FORTUNA";
                    break;
                default:
                    strQ = q(i2);
                    break;
            }
        } else {
            strQ = "ANDES_B29";
        }
        LogUtil.a("DeviceInfoManager", "getPartDeviceName is:", strQ);
        return strQ;
    }

    private static String q(int i2) {
        edn ednVarA = a(i2);
        if (ednVarA != null && !"".equals(ednVarA.d())) {
            return ednVarA.d();
        }
        return "unknown";
    }

    public static HashMap<Integer, String> c() {
        o();
        return d;
    }

    public static boolean m(int i2) {
        o();
        boolean zV = CommonUtil.v(BaseApplication.getContext());
        LogUtil.a("DeviceInfoManager", "isSupportMidWare isGooglePlay:", false, ", isNewHonor:", Boolean.valueOf(MagicBuild.f36615a), ", isChinaRom:", Boolean.valueOf(zV));
        if (MagicBuild.f36615a && !zV) {
            LogUtil.j("DeviceInfoManager", "isSupportMidWare isNewHonor oversea phone return");
            return false;
        }
        if (i2 == 13 || i2 == 14 || i2 == 34 || i2 == 44 || i2 == 45) {
            return true;
        }
        switch (i2) {
            case 18:
            case 19:
            case 20:
            case 21:
                return true;
            default:
                return y(i2);
        }
    }

    private static boolean y(int i2) {
        edn ednVarA = a(i2);
        if (ednVarA.l() != 0) {
            return ednVarA.ag();
        }
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(d(i2));
        if (pluginInfoByUuid == null || pluginInfoByUuid.i() == null) {
            LogUtil.j("DeviceInfoManager", "isSupportMidWareDefault info or WearDeviceInfo is null");
            return false;
        }
        return pluginInfoByUuid.i().cg();
    }

    public static int b(String str) {
        o();
        synchronized (f40893b) {
            LogUtil.a("DeviceInfoManager", "allDevices size is ", Integer.valueOf(f40892a.size()));
            for (edn ednVar : f40892a) {
                if (ednVar.aa() != null && str != null) {
                    if (str.equals(ednVar.aa())) {
                        return ednVar.l();
                    }
                }
                LogUtil.j("DeviceInfoManager", "getTypeForPlugin() ", ednVar.aa());
                return -1;
            }
            return -1;
        }
    }

    public static String j(int i2) {
        o();
        synchronized (f40893b) {
            for (edn ednVar : f40892a) {
                if (i2 == ednVar.l()) {
                    return ednVar.aa();
                }
            }
            return d(i2);
        }
    }

    private static void o() {
        if (CompileParameterUtil.d("IS_RELEASE_VERSION")) {
            return;
        }
        String strB = CommonUtil.b(Process.myPid());
        if (TextUtils.isEmpty(strB) || !strB.endsWith(":PhoneService")) {
            return;
        }
        throw new RuntimeException("DeviceInfoManager not init in process." + strB);
    }

    public static boolean n(int i2) {
        o();
        LogUtil.a("DeviceInfoManager", "enter isPluginDownloadByType");
        synchronized (f40893b) {
            for (edn ednVar : f40892a) {
                if (i2 == ednVar.l()) {
                    LogUtil.a("DeviceInfoManager", "device type is existence");
                    if (!"".equals(ednVar.aa())) {
                        LogUtil.a("DeviceInfoManager", "uuid is not null");
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static boolean f(int i2) {
        o();
        return a(i2).r();
    }

    public static boolean k(int i2) {
        o();
        edn ednVarA = a(i2);
        if (ednVarA.l() != 0) {
            return ednVarA.ab();
        }
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(d(i2));
        if (pluginInfoByUuid == null || pluginInfoByUuid.i() == null) {
            LogUtil.j("DeviceInfoManager", "isSupportMidWareDefault info or WearDeviceInfo is null");
            return false;
        }
        return pluginInfoByUuid.i().bx();
    }

    public static boolean g(int i2) {
        o();
        return i2 == 7 || i2 == 8 || u(i2) || i2 >= 32;
    }

    private static boolean u(int i2) {
        return i2 == 13 || i2 == 14 || r(i2);
    }

    private static boolean r(int i2) {
        return i2 == 15 || i2 == 16 || p(i2);
    }

    private static boolean p(int i2) {
        return i2 == 18 || i2 == 19 || s(i2);
    }

    private static boolean s(int i2) {
        return i2 == 20 || i2 == 21 || i2 == 10 || eel.d(i2);
    }

    public static boolean d(int i2, String str) {
        o();
        return !"unknown".equals(e(i2, str, false)) && t(i2);
    }

    private static boolean t(int i2) {
        if (!CommonUtil.af(BaseApplication.getContext())) {
            return true;
        }
        LogUtil.a("DeviceInfoManager", "getInfoByType(deviceType).isSupportRelease() : ", Boolean.valueOf(a(i2).ai()));
        return a(i2).ai();
    }

    public static boolean i(int i2) {
        o();
        return e.get(Integer.valueOf(i2)) != null;
    }

    public static void d(Context context) {
        o();
        Map<String, DeviceCapability> mapD = lvb.e().d(3, "", "DeviceInfoManager");
        if (mapD != null && !mapD.isEmpty()) {
            eej.e(mapD);
        }
        DeviceInfo deviceInfoD = mgg.d("DeviceInfoManager");
        if (deviceInfoD != null) {
            Map<String, DeviceCapability> mapD2 = lvb.e().d(1, deviceInfoD.getDeviceIdentify(), "DeviceInfoManager");
            DeviceCapability deviceCapability = (mapD2 == null || mapD2.isEmpty()) ? null : mapD2.get(deviceInfoD.getDeviceIdentify());
            if (deviceCapability != null) {
                eej.b(deviceCapability);
                a(deviceCapability, context);
                String json = new Gson().toJson(deviceCapability, DeviceCapability.class);
                LogUtil.d("DeviceInfoManager", "initDeviceInfo setSharedPreference");
                SharedPreferenceManager.e(context, String.valueOf(1), "kStorage_DeviceCfgMgr_Capability", json, null);
            }
            eej.b(deviceInfoD);
            return;
        }
        Gson gson = new Gson();
        String strE = SharedPreferenceManager.e(context, String.valueOf(1), "kStorage_DeviceCfgMgr_Capability");
        if (strE == null || "".equalsIgnoreCase(strE)) {
            return;
        }
        LogUtil.d("DeviceInfoManager", "initDeviceInfo getSharedPreference");
        DeviceCapability deviceCapability2 = (DeviceCapability) gson.fromJson(strE, DeviceCapability.class);
        eej.b(deviceCapability2);
        a(deviceCapability2, context);
    }

    private static void a(DeviceCapability deviceCapability, Context context) {
        if (deviceCapability != null) {
            Intent intent = new Intent();
            intent.setPackage(context.getPackageName());
            intent.setAction("com.huawei.health.action.ACTION_WEAR_DEVICE_CAPABILITY");
            intent.putExtra("WEAR_DEVICE_CAPBILITY", deviceCapability.isSupportGetHighAndMiddleSport());
            context.sendBroadcast(intent, Consts.d);
        }
    }
}
