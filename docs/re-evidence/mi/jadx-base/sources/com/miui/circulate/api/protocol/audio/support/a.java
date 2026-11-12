package com.miui.circulate.api.protocol.audio.support;

import android.text.TextUtils;
import com.miui.circulate.api.bean.ExtraBundle;
import com.miui.circulate.api.service.CirculateDeviceInfo;
import com.miui.circulate.api.service.CirculateServiceInfo;
import com.miui.circulate.device.api.Constant;
import com.xiaomi.miplay.audioclient.MiPlayDeviceControlCenter;
import defpackage.da8;
import defpackage.e96;
import defpackage.gx3;
import defpackage.km1;
import defpackage.qx3;
import defpackage.tpe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static CirculateDeviceInfo a(MiPlayDeviceControlCenter miPlayDeviceControlCenter) {
        CirculateDeviceInfo circulateDeviceInfo = new CirculateDeviceInfo();
        circulateDeviceInfo.f10301a = g(miPlayDeviceControlCenter);
        circulateDeviceInfo.f10302b = h(miPlayDeviceControlCenter);
        if (miPlayDeviceControlCenter.h() != 5) {
            circulateDeviceInfo.a("default", miPlayDeviceControlCenter.l());
        } else if (TextUtils.equals("wlan", miPlayDeviceControlCenter.u())) {
            circulateDeviceInfo.a("wlan", miPlayDeviceControlCenter.l());
        } else if (TextUtils.equals("p2p", miPlayDeviceControlCenter.u())) {
            circulateDeviceInfo.a("P2P", miPlayDeviceControlCenter.l());
        } else {
            circulateDeviceInfo.a("default", miPlayDeviceControlCenter.l());
        }
        circulateDeviceInfo.c = miPlayDeviceControlCenter.t();
        circulateDeviceInfo.j = miPlayDeviceControlCenter.e();
        circulateDeviceInfo.n = miPlayDeviceControlCenter.c();
        int iH = miPlayDeviceControlCenter.h();
        if (iH == 1) {
            circulateDeviceInfo.d = Constant.DeviceType.ANDROID_PHONE;
        } else if (iH == 2) {
            circulateDeviceInfo.d = "TV";
        } else if (iH == 3) {
            circulateDeviceInfo.d = Constant.DeviceType.WINDOWS_PC;
        } else if (iH == 4) {
            circulateDeviceInfo.d = "Sound";
        } else if (iH == 5) {
            circulateDeviceInfo.d = "AndroidCar";
        } else if (iH == 16) {
            circulateDeviceInfo.d = Constant.DeviceType.SCREEN_SOUND;
        } else if (iH != 18) {
            circulateDeviceInfo.d = "unknown";
        } else {
            circulateDeviceInfo.d = Constant.DeviceType.ANDROID_PAD;
        }
        String lowerCase = TextUtils.isEmpty(miPlayDeviceControlCenter.q()) ? "" : miPlayDeviceControlCenter.q().toLowerCase();
        ExtraBundle.b bVarF = new ExtraBundle.b().f(CirculateDeviceInfo.ROOM_NAME, miPlayDeviceControlCenter.w()).d(CirculateDeviceInfo.IS_GROUP, miPlayDeviceControlCenter.m()).f(CirculateDeviceInfo.BLUETOOTH_MAC, miPlayDeviceControlCenter.d()).f("account_id", miPlayDeviceControlCenter.a()).f(CirculateDeviceInfo.DEVICE_SN, miPlayDeviceControlCenter.x()).f(CirculateDeviceInfo.ROM_VERSION, miPlayDeviceControlCenter.v()).f("device_model", miPlayDeviceControlCenter.r()).f(CirculateDeviceInfo.SOUND_DEVICE_ID, miPlayDeviceControlCenter.g()).f(CirculateDeviceInfo.STATISTICS_ID, TextUtils.equals(circulateDeviceInfo.d, Constant.DeviceType.WINDOWS_PC) ? da8.b(miPlayDeviceControlCenter.x()) : da8.b(lowerCase));
        if (!TextUtils.equals(lowerCase, "")) {
            bVarF.f("mac", lowerCase);
        }
        circulateDeviceInfo.h = bVarF.a();
        tpe.f("AudioUtil", "convert MPA device device name: " + miPlayDeviceControlCenter.t() + ", device type=" + miPlayDeviceControlCenter.h() + ", model=" + miPlayDeviceControlCenter.r() + ", connectState=" + miPlayDeviceControlCenter.f() + ", room name: " + miPlayDeviceControlCenter.w() + ", is group=" + miPlayDeviceControlCenter.m() + ", group id=" + miPlayDeviceControlCenter.i() + ", m=" + tpe.e(lowerCase) + ", bm=" + tpe.e(miPlayDeviceControlCenter.d()));
        return circulateDeviceInfo;
    }

    public static List<MediaMetaData> b(List<km1> list) {
        ArrayList arrayList = new ArrayList();
        for (km1 km1Var : list) {
            arrayList.add(new MediaMetaData.b().i(km1Var.a()).l(km1Var.c()).k(km1Var.b()).m(km1Var.d()).p(km1Var.e()).h());
        }
        return arrayList;
    }

    public static int c() {
        return 1;
    }

    public static String d(List<CirculateDeviceInfo> list) {
        if (list == null) {
            return AbstractJsonLexerKt.NULL;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<CirculateDeviceInfo> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next().f10301a);
        }
        return tpe.e(sb.toString());
    }

    public static String e(Map map) {
        String str = null;
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                str = (String) obj;
            }
        }
        return str;
    }

    public static String[] f(CirculateDeviceInfo... circulateDeviceInfoArr) {
        if (circulateDeviceInfoArr == null || circulateDeviceInfoArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (CirculateDeviceInfo circulateDeviceInfo : circulateDeviceInfoArr) {
            if (circulateDeviceInfo != null) {
                if (k(circulateDeviceInfo)) {
                    tpe.f("AudioUtil", "add local device");
                    arrayList.add(circulateDeviceInfo.f10301a);
                } else if (j(circulateDeviceInfo)) {
                    CirculateServiceInfo circulateServiceInfoC = circulateDeviceInfo.c(65536);
                    if (circulateServiceInfoC != null && !circulateServiceInfoC.e.isEmpty()) {
                        Iterator<String> it = circulateServiceInfoC.e.keySet().iterator();
                        if (it.hasNext()) {
                            arrayList.add(it.next());
                        }
                    }
                } else {
                    CirculateServiceInfo circulateServiceInfoC2 = circulateDeviceInfo.c(65536);
                    if (circulateServiceInfoC2 != null) {
                        arrayList.add(circulateServiceInfoC2.f10304a);
                    }
                }
            }
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    public static String g(MiPlayDeviceControlCenter miPlayDeviceControlCenter) {
        Map<String, String> map;
        if (miPlayDeviceControlCenter.h() != 2) {
            return h(miPlayDeviceControlCenter);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(65536);
        arrayList.add(262145);
        arrayList.add(327682);
        List<CirculateDeviceInfo> listL = qx3.g().l(arrayList);
        if (miPlayDeviceControlCenter.h() == 2) {
            for (CirculateDeviceInfo circulateDeviceInfo : listL) {
                if (TextUtils.equals(circulateDeviceInfo.d, "TV") && (TextUtils.equals(miPlayDeviceControlCenter.o(), circulateDeviceInfo.f10301a) || circulateDeviceInfo.h.f("mac", CirculateDeviceInfo.DEFAULT_MAC).equalsIgnoreCase(miPlayDeviceControlCenter.q()) || ((map = circulateDeviceInfo.f) != null && map.get("default").equalsIgnoreCase(miPlayDeviceControlCenter.l())))) {
                    tpe.f("AudioUtil", "audio match tv same device:" + miPlayDeviceControlCenter.t() + ", " + miPlayDeviceControlCenter.h() + ", " + tpe.e(miPlayDeviceControlCenter.q()) + ", " + tpe.e(miPlayDeviceControlCenter.l()));
                    StringBuilder sb = new StringBuilder();
                    sb.append("audio match tv same device:");
                    sb.append(circulateDeviceInfo);
                    tpe.f("AudioUtil", sb.toString());
                    return circulateDeviceInfo.f10301a;
                }
            }
        } else {
            for (CirculateDeviceInfo circulateDeviceInfo2 : listL) {
                if (circulateDeviceInfo2.h.f("mac", CirculateDeviceInfo.DEFAULT_MAC).equalsIgnoreCase(miPlayDeviceControlCenter.q())) {
                    tpe.f("AudioUtil", "audio match tv same device:" + miPlayDeviceControlCenter.t() + ", " + miPlayDeviceControlCenter.h() + ", " + tpe.e(miPlayDeviceControlCenter.q()) + ", " + tpe.e(miPlayDeviceControlCenter.l()));
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("audio match same device:");
                    sb2.append(circulateDeviceInfo2);
                    tpe.f("AudioUtil", sb2.toString());
                    return circulateDeviceInfo2.f10301a;
                }
            }
        }
        return h(miPlayDeviceControlCenter);
    }

    public static String h(MiPlayDeviceControlCenter miPlayDeviceControlCenter) {
        return miPlayDeviceControlCenter.o() == null ? miPlayDeviceControlCenter.k() : miPlayDeviceControlCenter.o();
    }

    public static CirculateDeviceInfo i(String str) {
        tpe.f("AudioUtil", "getNotifyDevice deviceId=" + tpe.e(str));
        if ("local_device_id".equalsIgnoreCase(str)) {
            return ((e96) gx3.e().a("DeviceManager")).d();
        }
        List<CirculateDeviceInfo> listJ = qx3.g().j(str);
        if (listJ != null) {
            return listJ.get(0);
        }
        return null;
    }

    public static boolean j(CirculateDeviceInfo circulateDeviceInfo) {
        return TextUtils.equals("AndroidCar", circulateDeviceInfo.d);
    }

    public static boolean k(CirculateDeviceInfo circulateDeviceInfo) {
        e96 e96Var = (e96) gx3.e().a("DeviceManager");
        if (e96Var != null) {
            return e96Var.a(circulateDeviceInfo);
        }
        return false;
    }

    public static Boolean l(MiPlayDeviceControlCenter miPlayDeviceControlCenter) {
        return Boolean.valueOf(miPlayDeviceControlCenter.h() == 5 && TextUtils.equals("p2p", miPlayDeviceControlCenter.u()));
    }

    public static Boolean m(MiPlayDeviceControlCenter miPlayDeviceControlCenter) {
        return Boolean.valueOf(miPlayDeviceControlCenter.h() == 5 && TextUtils.equals("wlan", miPlayDeviceControlCenter.u()));
    }
}
