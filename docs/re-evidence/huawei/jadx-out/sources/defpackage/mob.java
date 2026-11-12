package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public class mob {
    public static void d(byte[] bArr, DeviceInfo deviceInfo) {
        if (bArr == null || bArr.length < 2) {
            LogUtil.j("FileServiceResultUtil", "Invalid message.");
            return;
        }
        cql cqlVar = new cql();
        switch (bArr[1]) {
            case 1:
                mod modVarA = a(deviceInfo);
                if (modVarA != null && modVarA.l()) {
                    if (!TextUtils.isEmpty(deviceInfo.getDeviceName())) {
                        if (modVarA.j() < 3) {
                            modVarA.e(modVarA.j() + 1);
                            mnk.e().b(deviceInfo);
                        }
                    } else {
                        mnk.e().b(deviceInfo);
                    }
                } else {
                    moa.e(deviceInfo);
                    mod modVar = new mod();
                    modVar.e(true);
                    if (deviceInfo != null) {
                        mnk.b().put(deviceInfo.getDeviceIdentify(), modVar);
                    }
                    e(cqlVar, bArr, deviceInfo);
                }
                break;
            case 2:
                a(cqlVar, bArr, deviceInfo);
                break;
            case 3:
                d(cqlVar, bArr, deviceInfo);
                break;
            case 4:
                moa.b(deviceInfo, true);
                c(cqlVar, bArr, deviceInfo);
                break;
            case 5:
                c(bArr, deviceInfo);
                break;
            case 6:
                moa.d(deviceInfo, true);
                b(cqlVar, bArr, deviceInfo);
                break;
            default:
                LogUtil.j("FileServiceResultUtil", "Invalid file management service command id.");
                break;
        }
    }

    public static void b(String str, boolean z) {
        if (str == null) {
            LogUtil.j("FileServiceResultUtil", "resetRunning deviceId is null.");
            return;
        }
        LogUtil.a("FileServiceResultUtil", "resetRunning deviceInfo.");
        mnk.b().remove(str);
        mne mneVar = mnc.e().b().get(str);
        if (mneVar == null) {
            LogUtil.j("FileServiceResultUtil", "resetRunning ephemerisDownloadInfo is null.");
            return;
        }
        if (z) {
            mneVar.h(mneVar.f() + 1);
            if (mneVar.f() == mneVar.a().size()) {
                LogUtil.a("FileServiceResultUtil", "resetRunning remove DownloadInfo.");
                mnc.e().b().remove(str);
                return;
            }
            return;
        }
        mnc.e().b().remove(str);
    }

    public static mod a(DeviceInfo deviceInfo) {
        if (deviceInfo != null) {
            return mnk.b().get(deviceInfo.getDeviceIdentify());
        }
        return null;
    }

    private static void e(cql cqlVar, byte[] bArr, DeviceInfo deviceInfo) {
        int length = bArr.length - 2;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 2, bArr2, 0, length);
        try {
            String str = "";
            int iA = -1;
            for (cqi cqiVar : cqlVar.b(bArr2).d()) {
                byte bC = cqiVar.c();
                if (bC == 1) {
                    LogUtil.a("FileServiceResultUtil", "INFO_FILE_NAME filenames : ", new String(cqiVar.d(), StandardCharsets.UTF_8));
                } else if (bC == 2) {
                    iA = eeq.a(cqiVar.d(), -1);
                    LogUtil.a("FileServiceResultUtil", "INFO_FILE_TYPE file_type : ", Integer.valueOf(iA));
                } else if (bC == 3) {
                    str = new String(cqiVar.d(), StandardCharsets.UTF_8);
                    LogUtil.a("FileServiceResultUtil", "INFO_PRODUCT_ID productId.", str);
                } else if (bC == 4) {
                    LogUtil.a("FileServiceResultUtil", "INFO_ISSUER_ID issuerId.");
                } else if (bC != 5) {
                    LogUtil.j("FileServiceResultUtil", "Invalid request file information type.");
                } else {
                    LogUtil.a("FileServiceResultUtil", "INFO_CARD_GROUP_TYPE cardType : ", Integer.valueOf(eeq.a(cqiVar.d(), -1)));
                }
            }
            mnz.d(iA, str, deviceInfo);
        } catch (cpy unused) {
            LogUtil.e("FileServiceResultUtil", "processFileManagerGetInfo TlvException");
            moa.d(deviceInfo, false);
        }
    }

    private static void a(cql cqlVar, byte[] bArr, DeviceInfo deviceInfo) {
        if (d(bArr)) {
            LogUtil.j("FileServiceResultUtil", "processFileManagerConsult error 7F04");
            moa.d(deviceInfo, false);
            return;
        }
        int length = bArr.length - 2;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 2, bArr2, 0, length);
        try {
            cqk cqkVarB = cqlVar.b(bArr2);
            mod modVarA = a(deviceInfo);
            if (modVarA == null) {
                LogUtil.j("FileServiceResultUtil", "processFileManagerConsult getEphemerisUtilMap is null.");
                moa.d(deviceInfo, false);
            } else {
                d(cqkVarB, modVarA);
                mnx.d(deviceInfo);
            }
        } catch (cpy unused) {
            LogUtil.e("FileServiceResultUtil", "processFileManagerConsult() COMMAND_ID_FILE_MANAGER_CONSULT error");
            moa.d(deviceInfo, false);
        }
    }

    private static void d(cqk cqkVar, mod modVar) {
        for (cqi cqiVar : cqkVar.d()) {
            switch (cqiVar.c()) {
                case 1:
                    String str = new String(cqiVar.d(), StandardCharsets.UTF_8);
                    modVar.a(str);
                    LogUtil.a("FileServiceResultUtil", "CONSULT_FILE_PROTOCOL_VERSION version : ", str);
                    break;
                case 2:
                    LogUtil.a("FileServiceResultUtil", "CONSULT_TRANSFER_BITMAP_ENABLE bitmapEnable : ", Integer.valueOf(eeq.a(cqiVar.d(), -1)));
                    break;
                case 3:
                    int iA = eeq.a(cqiVar.d(), -1);
                    modVar.j(iA);
                    LogUtil.a("FileServiceResultUtil", "CONSULT_TRANSFER_UNIT_SIZE transferSize : ", Integer.valueOf(iA));
                    break;
                case 4:
                    long jA = eeq.a(cqiVar.d(), -1);
                    modVar.a(jA);
                    LogUtil.a("FileServiceResultUtil", "CONSULT_MAX_APPLY_DATA_SIZE maxDataSize : ", Long.valueOf(jA));
                    break;
                case 5:
                    int iA2 = eeq.a(cqiVar.d(), -1);
                    modVar.h(iA2);
                    LogUtil.a("FileServiceResultUtil", "CONSULT_TIMEOUT timeOut : ", Integer.valueOf(iA2));
                    break;
                case 6:
                    int iA3 = eeq.a(cqiVar.d(), -1);
                    modVar.d(iA3);
                    LogUtil.a("FileServiceResultUtil", "CONSULT_FILE_TYPE fileType : ", Integer.valueOf(iA3));
                    break;
                default:
                    LogUtil.j("FileServiceResultUtil", "Invalid file transfer negotiation type.");
                    break;
            }
        }
    }

    private static void d(cql cqlVar, byte[] bArr, DeviceInfo deviceInfo) {
        if (d(bArr)) {
            LogUtil.j("FileServiceResultUtil", "processQuerySingleFileInfo error 7F04");
            moa.d(deviceInfo, false);
            return;
        }
        int length = bArr.length - 2;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 2, bArr2, 0, length);
        try {
            String str = "";
            for (cqi cqiVar : cqlVar.b(bArr2).d()) {
                if (cqiVar.c() == 1) {
                    str = new String(cqiVar.d(), StandardCharsets.UTF_8);
                    LogUtil.a("FileServiceResultUtil", "SINGLE_FILE_NAME fileName : ", str);
                } else {
                    LogUtil.j("FileServiceResultUtil", "Other file information fields.");
                }
            }
            mod modVarA = a(deviceInfo);
            int iB = modVarA != null ? modVarA.b() : -1;
            LogUtil.a("FileServiceResultUtil", "SINGLE_FILE fileType : ", Integer.valueOf(iB));
            if (iB == 0) {
                mnx.e(str, deviceInfo);
            } else if (iB == 1) {
                mnx.a(str, deviceInfo);
            } else {
                LogUtil.j("FileServiceResultUtil", "SINGLE_FILE fileType Unknown");
                moa.d(deviceInfo, false);
            }
        } catch (cpy unused) {
            LogUtil.e("FileServiceResultUtil", "processQuerySingleFileInfo TlvException");
            moa.d(deviceInfo, false);
        }
    }

    private static void c(cql cqlVar, byte[] bArr, DeviceInfo deviceInfo) {
        int length = bArr.length - 2;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 2, bArr2, 0, length);
        try {
            String str = "";
            String strE = str;
            int iA = -1;
            for (cqi cqiVar : cqlVar.b(bArr2).d()) {
                byte bC = cqiVar.c();
                if (bC == 1) {
                    str = new String(cqiVar.d(), StandardCharsets.UTF_8);
                    LogUtil.a("FileServiceResultUtil", "APPLICATION_APPLY_FILENAME fileName : ", str);
                } else if (bC == 2) {
                    iA = eeq.a(cqiVar.d(), -1);
                    LogUtil.a("FileServiceResultUtil", "APPLICATION_APPLY_OFFSET offset : ", Integer.valueOf(iA));
                } else if (bC == 3) {
                    LogUtil.a("FileServiceResultUtil", "APPLICATION_APPLY_FILE_LENGTH fileLength : ", Long.valueOf(eeq.a(cqiVar.d(), -1)));
                } else if (bC == 4) {
                    strE = eeq.e(cqiVar.d());
                    LogUtil.a("FileServiceResultUtil", "APPLICATION_APPLY_FILE_BITMAP fileBitmap : ", strE);
                } else if (bC != 127) {
                    LogUtil.j("FileServiceResultUtil", "Invalid request file data type.");
                } else {
                    LogUtil.a("FileServiceResultUtil", "APPLICATION_APPLY_FILE_BITMAP error : ", cqiVar.d());
                }
            }
            if (iA != -1 && !"".equals(str)) {
                moa.b(str, strE, iA, deviceInfo);
            } else {
                moa.d(deviceInfo, false);
            }
        } catch (cpy unused) {
            LogUtil.e("FileServiceResultUtil", "processApplicationDataToPhone() COMMAND_ID_FILE_MANAGER_APPLICATION_DATA_TO_PHONE error");
            moa.d(deviceInfo, false);
        }
    }

    private static void c(byte[] bArr, DeviceInfo deviceInfo) {
        if (!d(bArr) || c(bArr)) {
            return;
        }
        LogUtil.j("FileServiceResultUtil", "processFileContentTransfer error 7F04 and not 100000");
        moa.d(deviceInfo, false);
    }

    private static void b(cql cqlVar, byte[] bArr, DeviceInfo deviceInfo) {
        int length = bArr.length - 2;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 2, bArr2, 0, length);
        try {
            int iA = -1;
            for (cqi cqiVar : cqlVar.b(bArr2).d()) {
                if (cqiVar.c() != 1) {
                    LogUtil.j("FileServiceResultUtil", "Other file result notification types.");
                } else {
                    iA = eeq.a(cqiVar.d(), -1);
                    LogUtil.a("FileServiceResultUtil", "NOTIFICATION_VALIDITY_RESULT validity : ", Integer.valueOf(iA));
                }
            }
            mnx.d(iA, deviceInfo);
        } catch (cpy unused) {
            LogUtil.e("FileServiceResultUtil", "processResultNotification TlvException");
        }
    }

    private static boolean d(byte[] bArr) {
        return bArr.length >= 4 && bArr[2] == 127 && bArr[3] == 4;
    }

    private static boolean c(byte[] bArr) {
        if (bArr.length < 8) {
            return false;
        }
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 4, bArr2, 0, 4);
        return Arrays.equals(new byte[]{0, 1, -122, -96}, bArr2);
    }
}
