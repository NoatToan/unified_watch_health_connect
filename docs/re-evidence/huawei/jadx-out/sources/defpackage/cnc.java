package defpackage;

import android.text.TextUtils;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.hichain.HiChainAuthManager;
import health.compact.a.EmuiBuild;
import health.compact.a.LogUtil;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class cnc {
    private static ConcurrentHashMap<String, String> e = new ConcurrentHashMap<>();

    public static boolean b(int i) {
        return 3 == i || 1 == i;
    }

    public static String d(String str) {
        for (Map.Entry<String, String> entry : e.entrySet()) {
            if (entry.getValue().equals(str)) {
                return entry.getKey();
            }
        }
        return "";
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.d("HiChainCommandUtil", "getPin: deviceIdentify is empty");
            return "";
        }
        return e.get(str);
    }

    public static void b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.d("HiChainCommandUtil", "setPeerConnDeviceId: params is incorrect");
        } else {
            e.put(str, str2);
            LogUtil.b("HiChainCommandUtil", "setPeerConnDeviceId: ", cpl.a(str), " ,peerConnDeviceId = ", str2);
        }
    }

    public static boolean d() {
        return EmuiBuild.e >= 25 && !cop.g();
    }

    public static int c(String str, byte[] bArr, DeviceInfo deviceInfo) {
        List<cqa> listC = c(bArr);
        if (listC == null) {
            LogUtil.e("HiChainCommandUtil", "resolveAuthenticateTypeData with pinCode is not correct");
            return -1;
        }
        int iC = -1;
        int i = -1;
        int iC2 = 1;
        for (cqa cqaVar : listC) {
            int iA = cpb.a(cqaVar.b());
            if (iA == 1) {
                int iA2 = cpb.a(cqaVar.c());
                if (iA2 == 1) {
                    iC = 100000;
                }
                if (iA2 == 4) {
                    i = 4;
                }
            } else {
                if (iA != 2) {
                    if (iA == 5) {
                        b(str, cph.a(cqaVar.c()));
                        deviceInfo.setHwUdid(cph.a(cqaVar.c()));
                    } else if (iA == 14) {
                        iC2 = cpb.c(cqaVar.c(), 16);
                        LogUtil.b("HiChainCommandUtil", "pin code parse " + iC2);
                    } else if (iA != 127) {
                        LogUtil.b("HiChainCommandUtil", "handleUserOperationReport default");
                    }
                }
                iC = cpb.c(cqaVar.c(), 16);
                if (i != -1) {
                    iC ^= i;
                }
            }
        }
        if (iC2 != 1) {
            return -1;
        }
        return iC;
    }

    private static List<cqa> c(byte[] bArr) {
        cqb cqbVarE = cku.e(bArr);
        if (cqbVarE == null) {
            LogUtil.d("HiChainCommandUtil", "tlvFather is null");
            return null;
        }
        return cqbVarE.b();
    }

    public static boolean c(String str) {
        if (!a(str)) {
            return false;
        }
        LogUtil.b("HiChainCommandUtil", "start isHiChainDeviceOn");
        return HiChainAuthManager.e().j(str);
    }

    public static void c(DeviceInfo deviceInfo, boolean z) {
        if (deviceInfo == null || !a(deviceInfo.getDeviceMac())) {
            return;
        }
        LogUtil.b("HiChainCommandUtil", "start setIsHiChainDeviceOn");
        HiChainAuthManager.e().e(deviceInfo.getDeviceMac(), z);
    }

    public static boolean a(String str) {
        if (d() && !TextUtils.isEmpty(str)) {
            return HiChainAuthManager.e().a(str);
        }
        return false;
    }

    public static cnb d(byte[] bArr) {
        cnb cnbVar = new cnb();
        cqb cqbVarE = cku.e(bArr);
        if (cqbVarE == null) {
            LogUtil.e("HiChainCommandUtil", "tlvFather is null");
            return cnbVar;
        }
        List<cqa> listB = cqbVarE.b();
        if (listB != null) {
            byte[] bArrD = null;
            for (cqa cqaVar : listB) {
                int iA = cpb.a(cqaVar.b());
                if (iA == 1) {
                    try {
                        bArrD = cph.d(cqaVar.c());
                    } catch (NumberFormatException unused) {
                        LogUtil.d("HiChainCommandUtil", "tlv.getValue() NumberFormatException");
                    }
                    cnbVar.a(bArrD);
                } else if (iA == 2) {
                    cnbVar.e(cpb.a(cqaVar.c()));
                } else if (iA == 3) {
                    cnbVar.c(cpb.d(cqaVar.c()));
                } else if (iA != 4) {
                    LogUtil.e("HiChainCommandUtil", "resolveHiChainData default");
                } else {
                    cnbVar.b(cpb.a(cqaVar.c()));
                }
            }
        }
        return cnbVar;
    }

    public static String c(byte[] bArr, String str, String str2) {
        byte[] bArrA;
        String strValueOf = String.valueOf(-1);
        List<cqa> listC = c(bArr);
        if (listC == null) {
            LogUtil.b("HiChainCommandUtil", "resolvePinCodeData with pincode is not correct");
            return strValueOf;
        }
        String strC = null;
        for (cqa cqaVar : listC) {
            int iA = cpb.a(cqaVar.b());
            if (iA == 1) {
                strC = cqaVar.c();
                strValueOf = cph.a(strC);
            } else if (iA != 2) {
                LogUtil.e("HiChainCommandUtil", "resolvePinCodeData default");
            } else {
                String strC2 = cqaVar.c();
                cml cmlVarC = cnk.c().c(str2);
                if (cmlVarC != null && cmlVarC.e() == 1) {
                    LogUtil.b("HiChainCommandUtil", "decrypt by AES_GCM_NO_PADDING_TYPE");
                    bArrA = ckg.a("AES/GCM/NoPadding", cph.d(strC), cph.d(str), cph.d(strC2));
                } else {
                    bArrA = ckg.a("AES/CBC/PKCS5Padding", cph.d(strC), cph.d(str), cph.d(strC2));
                }
                strValueOf = cph.d(bArrA);
            }
        }
        LogUtil.b("HiChainCommandUtil", "resolvePinCodeData pinCode: ", strValueOf);
        return strValueOf;
    }

    public static int e(byte[] bArr) {
        List<cqa> listC = c(bArr);
        if (listC == null) {
            LogUtil.e("HiChainCommandUtil", "resolveLostKey is not correct");
            return -1;
        }
        for (cqa cqaVar : listC) {
            if (cpb.a(cqaVar.b()) == 1) {
                return cpb.a(cqaVar.c());
            }
        }
        return -1;
    }
}
