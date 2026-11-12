package com.sogou.map.loc;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.CellLocation;
import android.telephony.NeighboringCellInfo;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes18.dex */
final class q0 {
    private static final Method A;
    private static final Method B;
    private static final Method C;
    private static final Method D;
    private static final Method E;
    private static final Method F;
    private static final Method G;
    private static final Method H;
    private static final Pattern a = Pattern.compile("^()$|\\[(?:[^,]*=)?([+-]?\\d+)[ ]*,[ ]*(?:[^,]*=)?([+-]?\\d+)(?:[ ]*,[ ]*(?:[^,]*=)?([+-]?\\d+))?(?:[ ]*,[ ]*(?:[^,]*=)?([+-]?\\d+))?(?:[ ]*,[ ]*(?:[^,]*=)?([+-]?\\d+))?\\]");
    private static final Class b;
    private static final Class c;
    private static final Class d;
    private static final Class e;
    private static final Class f;
    private static final Class g;
    private static final Class h;
    private static final Class i;
    private static final Class j;
    private static final Method k;
    private static final Method l;
    private static final Method m;
    private static final Method n;
    private static final Method o;
    private static final Method p;
    private static final Method q;
    private static final Method r;
    private static final Method s;
    private static final Method t;
    private static final Method u;
    private static final Method v;
    private static final Method w;
    private static final Method x;
    private static final Method y;
    private static final Method z;

    static {
        Class clsF = f("android.telephony.CellInfo");
        b = clsF;
        Class clsF2 = f("android.telephony.CellInfoGsm");
        c = clsF2;
        Class clsF3 = f("android.telephony.CellInfoCdma");
        d = clsF3;
        Class clsF4 = f("android.telephony.CellInfoWcdma");
        e = clsF4;
        Class clsF5 = f("android.telephony.CellInfoLte");
        f = clsF5;
        Class clsF6 = f("android.telephony.CellIdentityGsm");
        g = clsF6;
        Class clsF7 = f("android.telephony.CellIdentityCdma");
        h = clsF7;
        Class clsF8 = f("android.telephony.CellIdentityWcdma");
        i = clsF8;
        Class clsF9 = f("android.telephony.CellIdentityLte");
        j = clsF9;
        k = h(TelephonyManager.class, "getAllCellInfo");
        l = h(clsF2, "getCellIdentity");
        m = h(clsF3, "getCellIdentity");
        n = h(clsF4, "getCellIdentity");
        o = h(clsF5, "getCellIdentity");
        p = h(clsF6, "getMcc");
        q = h(clsF6, "getMnc");
        r = h(clsF6, "getLac");
        s = h(clsF6, "getCid");
        t = h(clsF6, "getPsc");
        u = h(clsF7, "getSystemId");
        v = h(clsF7, "getBasestationId");
        w = h(clsF7, "getNetworkId");
        x = h(clsF8, "getMcc");
        y = h(clsF8, "getMnc");
        z = h(clsF8, "getLac");
        A = h(clsF8, "getCid");
        B = h(clsF8, "getPsc");
        C = h(clsF9, "getMcc");
        D = h(clsF9, "getMnc");
        E = h(clsF9, "getTac");
        F = h(clsF9, "getCi");
        G = h(clsF9, "getPci");
        H = h(clsF, "isRegistered");
    }

    public static v0 a(TelephonyManager telephonyManager) {
        if (telephonyManager == null) {
            return null;
        }
        v0 v0Var = new v0();
        try {
            List list = (List) g(k, telephonyManager);
            int i2 = 4;
            if (list != null) {
                for (Object obj : list) {
                    if (obj != null) {
                        Class<?> cls = obj.getClass();
                        if (cls == c) {
                            Object objG = g(l, obj);
                            Boolean bool = (Boolean) g(H, obj);
                            Integer num = (Integer) g(p, objG);
                            Integer num2 = (Integer) g(q, objG);
                            Integer num3 = (Integer) g(r, objG);
                            Integer num4 = (Integer) g(s, objG);
                            Integer num5 = (Integer) g(t, objG);
                            if (bool != null && num != null && num2 != null && num3 != null && num4 != null && num5 != null) {
                                if (j0.v(num3.intValue(), num4.intValue())) {
                                    int[] iArr = new int[7];
                                    iArr[0] = 1;
                                    iArr[1] = (bool.booleanValue() ? 1 : 0) | 16;
                                    iArr[3] = num.intValue();
                                    iArr[4] = num2.intValue();
                                    iArr[5] = num3.intValue();
                                    iArr[6] = num4.intValue();
                                    v0Var.b(iArr);
                                } else if (j0.k(num5.intValue())) {
                                    int[] iArr2 = new int[6];
                                    iArr2[0] = 2;
                                    iArr2[1] = (bool.booleanValue() ? 1 : 0) | 16;
                                    iArr2[3] = num.intValue();
                                    iArr2[4] = num2.intValue();
                                    iArr2[5] = num5.intValue();
                                    v0Var.b(iArr2);
                                }
                            }
                        } else if (cls == e) {
                            Object objG2 = g(n, obj);
                            Boolean bool2 = (Boolean) g(H, obj);
                            Integer num6 = (Integer) g(x, objG2);
                            Integer num7 = (Integer) g(y, objG2);
                            Integer num8 = (Integer) g(z, objG2);
                            Integer num9 = (Integer) g(A, objG2);
                            Integer num10 = (Integer) g(B, objG2);
                            if (bool2 != null && num6 != null && num7 != null && num8 != null && num9 != null && num10 != null) {
                                if (j0.v(num8.intValue(), num9.intValue())) {
                                    int[] iArr3 = new int[7];
                                    iArr3[0] = 1;
                                    iArr3[1] = (bool2.booleanValue() ? 1 : 0) | 16;
                                    iArr3[3] = num6.intValue();
                                    iArr3[4] = num7.intValue();
                                    iArr3[5] = num8.intValue();
                                    iArr3[6] = num9.intValue();
                                    v0Var.b(iArr3);
                                } else if (j0.k(num10.intValue())) {
                                    int[] iArr4 = new int[6];
                                    iArr4[0] = 2;
                                    iArr4[1] = (bool2.booleanValue() ? 1 : 0) | 16;
                                    iArr4[3] = num6.intValue();
                                    iArr4[4] = num7.intValue();
                                    iArr4[5] = num10.intValue();
                                    v0Var.b(iArr4);
                                }
                            }
                        } else if (cls == d) {
                            Object objG3 = g(m, obj);
                            Boolean bool3 = (Boolean) g(H, obj);
                            Integer num11 = (Integer) g(u, objG3);
                            Integer num12 = (Integer) g(v, objG3);
                            Integer num13 = (Integer) g(w, objG3);
                            if (bool3 != null && num11 != null && num12 != null && num13 != null && j0.m(num11.intValue(), num12.intValue(), num13.intValue())) {
                                int[] iArr5 = new int[6];
                                iArr5[0] = 3;
                                iArr5[1] = (bool3.booleanValue() ? 1 : 0) | 16;
                                iArr5[3] = num11.intValue();
                                iArr5[4] = num12.intValue();
                                iArr5[5] = num13.intValue();
                                v0Var.b(iArr5);
                            }
                        } else if (cls == f) {
                            Object objG4 = g(o, obj);
                            Boolean bool4 = (Boolean) g(H, obj);
                            Integer num14 = (Integer) g(C, objG4);
                            Integer num15 = (Integer) g(D, objG4);
                            Integer num16 = (Integer) g(E, objG4);
                            Integer num17 = (Integer) g(F, objG4);
                            Integer num18 = (Integer) g(G, objG4);
                            if (bool4 != null && num14 != null && num15 != null && num16 != null && num17 != null && num18 != null) {
                                if (j0.v(num16.intValue(), num17.intValue())) {
                                    int[] iArr6 = new int[7];
                                    iArr6[0] = 4;
                                    iArr6[1] = (bool4.booleanValue() ? 1 : 0) | 16;
                                    iArr6[3] = num14.intValue();
                                    iArr6[4] = num15.intValue();
                                    iArr6[5] = num16.intValue();
                                    iArr6[6] = num17.intValue();
                                    v0Var.b(iArr6);
                                } else if (j0.k(num18.intValue())) {
                                    int[] iArr7 = new int[6];
                                    iArr7[0] = 5;
                                    iArr7[1] = (bool4.booleanValue() ? 1 : 0) | 16;
                                    iArr7[3] = num14.intValue();
                                    iArr7[4] = num15.intValue();
                                    iArr7[5] = num18.intValue();
                                    v0Var.b(iArr7);
                                }
                            }
                        }
                    }
                }
            }
            CellLocation cellLocationD = j0.d(telephonyManager);
            if (cellLocationD != null) {
                if (cellLocationD instanceof GsmCellLocation) {
                    GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocationD;
                    int lac = gsmCellLocation.getLac();
                    int cid = gsmCellLocation.getCid();
                    if (j0.v(lac, cid)) {
                        v0Var.b(new int[]{1, 33, 0, 0, 0, lac, cid});
                    }
                    try {
                        Matcher matcher = a.matcher(gsmCellLocation.toString());
                        if (matcher.matches() && matcher.group(1) == null && String.valueOf(lac).equals(matcher.group(2)) && String.valueOf(cid).equals(matcher.group(3)) && matcher.group(5) != null && matcher.group(6) != null) {
                            int i3 = Integer.parseInt(matcher.group(5));
                            int i4 = Integer.parseInt(matcher.group(6));
                            if (j0.v(i3, i4) && (i3 != lac || i4 != cid)) {
                                if (telephonyManager.getNetworkType() != 13) {
                                    i2 = 1;
                                }
                                v0Var.b(new int[]{i2, 33, 0, 0, 0, i3, i4});
                            }
                        }
                    } catch (Exception unused) {
                    }
                } else if (cellLocationD instanceof CdmaCellLocation) {
                    CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocationD;
                    int systemId = cdmaCellLocation.getSystemId();
                    int baseStationId = cdmaCellLocation.getBaseStationId();
                    int networkId = cdmaCellLocation.getNetworkId();
                    if (j0.m(systemId, baseStationId, networkId)) {
                        v0Var.b(new int[]{3, 33, 0, systemId, baseStationId, networkId});
                    }
                }
            }
            List<NeighboringCellInfo> listU = j0.u(telephonyManager);
            if (listU != null && listU.size() != 0) {
                for (NeighboringCellInfo neighboringCellInfo : listU) {
                    if (neighboringCellInfo != null) {
                        int lac2 = neighboringCellInfo.getLac();
                        int cid2 = neighboringCellInfo.getCid();
                        int psc = neighboringCellInfo.getPsc();
                        if (j0.v(lac2, cid2)) {
                            v0Var.b(new int[]{1, 48, 0, 0, 0, lac2, cid2});
                        } else if (j0.k(psc)) {
                            v0Var.b(new int[]{2, 48, 0, 0, 0, psc});
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return v0Var;
    }

    public static w0 b(CdmaCellLocation cdmaCellLocation) {
        if (cdmaCellLocation == null) {
            return null;
        }
        return new w0(cdmaCellLocation.getNetworkId(), cdmaCellLocation.getSystemId(), cdmaCellLocation.getBaseStationId(), cdmaCellLocation.getBaseStationLongitude(), cdmaCellLocation.getBaseStationLatitude(), j0.b());
    }

    public static z0 c(GsmCellLocation gsmCellLocation) {
        if (gsmCellLocation == null) {
            return null;
        }
        return new z0(gsmCellLocation.getLac(), gsmCellLocation.getCid(), j0.b());
    }

    public static a1 d(WifiManager wifiManager, long j2) {
        WifiInfo connectionInfo;
        if (wifiManager == null) {
            return null;
        }
        try {
            if (!wifiManager.isWifiEnabled() || (connectionInfo = wifiManager.getConnectionInfo()) == null) {
                return null;
            }
            a1 a1Var = new a1(connectionInfo.getBSSID(), connectionInfo.getSSID(), connectionInfo.getRssi());
            a1Var.h = connectionInfo.getIpAddress();
            a1Var.i = connectionInfo.getLinkSpeed();
            a1Var.j = connectionInfo.getNetworkId();
            a1Var.g = connectionInfo.getMacAddress();
            a1Var.k = wifiManager.getWifiState();
            a1Var.l = j2;
            return a1Var;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static c1 e(List list, long j2) {
        e1 e1Var;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ScanResult scanResult = (ScanResult) it2.next();
            if (scanResult == null) {
                e1Var = null;
            } else {
                e1Var = new e1(scanResult.BSSID, scanResult.SSID, scanResult.level);
                e1Var.d = scanResult.frequency;
                e1Var.e = scanResult.capabilities;
            }
            if (e1Var != null) {
                arrayList.add(e1Var);
            }
        }
        return new c1(arrayList, j2);
    }

    private static Class f(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private static Object g(Method method, Object obj) {
        if (method == null || obj == null) {
            return null;
        }
        try {
            return method.invoke(obj, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Method h(Class cls, String str) {
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod(str, new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
