package defpackage;

import android.text.TextUtils;
import com.huawei.health.device.kit.hwwsp.TlvDeviceCommand;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import health.compact.a.CommonUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class dzv {
    private eet d = new eet();

    public long e(String str) throws Throwable {
        byte[] bArrD = d(str);
        if (bArrD != null) {
            return f(bArrD);
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.FileInputStream] */
    private byte[] d(String str) throws Throwable {
        ?? fileInputStream;
        byte[] bArr;
        ?? r3 = 0;
        ?? r4 = 0;
        ?? r5 = 0;
        if (((int) new File(str).length()) == 0) {
            return null;
        }
        byte[] bArr2 = new byte[8];
        try {
            try {
                fileInputStream = new FileInputStream(str);
                try {
                    byte[] bArr3 = fileInputStream.read(bArr2) >= 8 ? bArr2 : null;
                    try {
                        fileInputStream.close();
                    } catch (IOException unused) {
                        LogUtil.e("TlvOtaUtil", "filePraseByte finally IOException");
                    }
                    bArr = bArr3;
                    r3 = bArr3;
                } catch (FileNotFoundException unused2) {
                    r4 = fileInputStream;
                    LogUtil.e("TlvOtaUtil", "filePraseByte FileNotFoundException");
                    r3 = r4;
                    bArr = bArr2;
                    if (r4 != 0) {
                        try {
                            r4.close();
                            r3 = r4;
                            bArr = bArr2;
                        } catch (IOException unused3) {
                            LogUtil.e("TlvOtaUtil", "filePraseByte finally IOException");
                            r3 = r4;
                            bArr = bArr2;
                        }
                    }
                } catch (IOException unused4) {
                    r5 = fileInputStream;
                    LogUtil.e("TlvOtaUtil", "filePraseByte IOException");
                    r3 = r5;
                    bArr = bArr2;
                    if (r5 != 0) {
                        try {
                            r5.close();
                            r3 = r5;
                            bArr = bArr2;
                        } catch (IOException unused5) {
                            LogUtil.e("TlvOtaUtil", "filePraseByte finally IOException");
                            r3 = r5;
                            bArr = bArr2;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (fileInputStream != 0) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused6) {
                            LogUtil.e("TlvOtaUtil", "filePraseByte finally IOException");
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = r3;
            }
        } catch (FileNotFoundException unused7) {
        } catch (IOException unused8) {
        }
        return bArr;
    }

    public byte[] b(TlvDeviceCommand tlvDeviceCommand) {
        int serviceId = tlvDeviceCommand.getServiceId();
        int commandId = tlvDeviceCommand.getCommandId();
        byte[] dataContent = tlvDeviceCommand.getDataContent();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(dataContent.length + 2);
        byteBufferAllocate.put(eeq.c(eeq.d(serviceId)));
        byteBufferAllocate.put(eeq.c(eeq.d(commandId)));
        byteBufferAllocate.put(dataContent);
        LogUtil.a("TlvOtaUtil", "command data:", eeq.e(dataContent));
        byteBufferAllocate.flip();
        return byteBufferAllocate.array();
    }

    private long f(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 7; i >= 4; i--) {
            stringBuffer.append(eeq.d((int) bArr[i]));
        }
        return CommonUtil.x(stringBuffer.toString()) + 256;
    }

    public dpb b(byte[] bArr) throws eeu {
        dpb dpbVar = new dpb();
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("TlvOtaUtil", "parserQueryAllow resultDataHex is empty");
            return dpbVar;
        }
        return d(dpbVar, this.d.b(strE.substring(4, strE.length())));
    }

    private dpb d(dpb dpbVar, ees eesVar) {
        if (eesVar == null) {
            LogUtil.j("TlvOtaUtil", "parserQueryAllow tlvFather is null");
            return dpbVar;
        }
        List<eew> listE = eesVar.e();
        if (listE != null && listE.size() > 0) {
            for (eew eewVar : listE) {
                if (eewVar != null) {
                    int iB = CommonUtil.b(eewVar.e(), 16);
                    String strB = eewVar.b();
                    if (iB == 4) {
                        dpbVar.c(CommonUtil.b(strB, 16));
                    } else if (iB != 127) {
                        LogUtil.j("TlvOtaUtil", "queryAllow default");
                    } else {
                        dpbVar.e(CommonUtil.b(strB, 16));
                    }
                }
            }
        }
        return dpbVar;
    }

    public dov e(byte[] bArr) throws eeu {
        dov dovVar = new dov();
        String strE = eeq.e(bArr);
        if (strE == null) {
            LogUtil.j("TlvOtaUtil", "parserParameters resultDataHex is null");
            return dovVar;
        }
        return d(dovVar, this.d.b(strE.substring(4, strE.length())));
    }

    private dov d(dov dovVar, ees eesVar) {
        if (eesVar == null) {
            LogUtil.j("TlvOtaUtil", "parserParameters tlvFather is null");
            return dovVar;
        }
        List<eew> listE = eesVar.e();
        if (listE != null && !listE.isEmpty()) {
            for (eew eewVar : listE) {
                int iV = CommonUtil.v(eewVar.e());
                String strB = eewVar.b();
                switch (iV) {
                    case 1:
                        dovVar.a(CommonUtil.v(strB));
                        break;
                    case 2:
                        dovVar.e(CommonUtil.v(strB));
                        break;
                    case 3:
                        dovVar.c(CommonUtil.v(strB));
                        break;
                    case 4:
                        dovVar.b(CommonUtil.x(strB));
                        break;
                    case 5:
                        dovVar.c(CommonUtil.x(strB) == 1);
                        break;
                    case 6:
                        dovVar.e(CommonUtil.v(strB) == 1);
                        break;
                    default:
                        LogUtil.j("TlvOtaUtil", "parameters default");
                        break;
                }
            }
        }
        return dovVar;
    }

    public dou a(byte[] bArr) throws eeu {
        dou douVar = new dou();
        String strE = eeq.e(bArr);
        if (strE == null) {
            LogUtil.j("TlvOtaUtil", "parserApplyReport resultDataHex is null");
            return douVar;
        }
        return a(douVar, this.d.b(strE.substring(4, strE.length())));
    }

    private dou a(dou douVar, ees eesVar) {
        if (eesVar == null) {
            LogUtil.j("TlvOtaUtil", "parserApplyReport tlvFather is null");
            return douVar;
        }
        List<eew> listE = eesVar.e();
        if (listE != null && !listE.isEmpty()) {
            for (eew eewVar : listE) {
                int iV = CommonUtil.v(eewVar.e());
                String strB = eewVar.b();
                if (iV == 1) {
                    douVar.e(CommonUtil.x(strB));
                } else if (iV == 2) {
                    douVar.d(CommonUtil.x(strB));
                } else if (iV != 3) {
                    LogUtil.j("TlvOtaUtil", "applyReport default");
                } else {
                    douVar.e(b(strB));
                }
            }
        }
        return douVar;
    }

    public dot c(byte[] bArr) throws eeu {
        dot dotVar = new dot();
        String strE = eeq.e(bArr);
        if (strE == null) {
            LogUtil.j("TlvOtaUtil", "parserPackageSizeReport resultDataHex is null");
            return dotVar;
        }
        return e(dotVar, this.d.b(strE.substring(4, strE.length())));
    }

    private dot e(dot dotVar, ees eesVar) {
        if (eesVar == null) {
            LogUtil.j("TlvOtaUtil", "parserPackageSizeReport tlvFather is null");
            return dotVar;
        }
        List<eew> listE = eesVar.e();
        if (listE != null && listE.size() > 0) {
            for (eew eewVar : listE) {
                if (eewVar != null) {
                    int iB = CommonUtil.b(eewVar.e(), 16);
                    String strB = eewVar.b();
                    if (iB == 1) {
                        dotVar.c(CommonUtil.x(strB));
                    } else if (iB != 2) {
                        LogUtil.d("TlvOtaUtil", "pkgSizeReport default");
                    } else {
                        dotVar.b(CommonUtil.x(strB));
                    }
                }
            }
        }
        return dotVar;
    }

    public int d(byte[] bArr) throws eeu {
        String strE = eeq.e(bArr);
        if (strE == null) {
            LogUtil.j("TlvOtaUtil", "parserPackageVerifyReport resultDataHex is null");
            return 0;
        }
        return c(this.d.b(strE.substring(4, strE.length())));
    }

    public int c(ees eesVar) {
        if (eesVar == null) {
            LogUtil.j("TlvOtaUtil", "parserPackageVerifyReport tlvFather is null");
            return 0;
        }
        try {
            List<eew> listE = eesVar.e();
            if (listE != null && listE.size() != 0) {
                eew eewVar = listE.get(0);
                if (eewVar == null) {
                    LogUtil.j("TlvOtaUtil", "parserPackageVerifyReport first tlvItem is null");
                    return 0;
                }
                return Integer.parseInt(eewVar.b(), 16);
            }
            LogUtil.j("TlvOtaUtil", "parserPackageVerifyReport tlvs is null or tlvs.size==0");
            return 0;
        } catch (NumberFormatException unused) {
            LogUtil.e("TlvOtaUtil", "NumberFormatException: parserPackageVerifyReport");
            return 0;
        }
    }

    private List<Integer> b(String str) {
        ArrayList arrayList = new ArrayList(16);
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("TlvOtaUtil", "parseAck , bitmapHex is empty");
            return arrayList;
        }
        byte[] bArrC = eeq.c(str);
        StringBuilder sb = new StringBuilder(16);
        for (byte b2 : bArrC) {
            sb.append(new StringBuffer(d(b2)).reverse().toString());
        }
        String string = sb.toString();
        LogUtil.a("TlvOtaUtil", "parseAck, bufferStr = ", string);
        for (int i = 0; i < string.length(); i++) {
            if ("0".equalsIgnoreCase(string.charAt(i) + "")) {
                arrayList.add(0);
                LogUtil.a("TlvOtaUtil", "errorPackages, error package index = ", Integer.valueOf(i));
            } else {
                arrayList.add(1);
            }
        }
        return arrayList;
    }

    private String d(byte b2) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 7; i >= 0; i--) {
            stringBuffer.append((int) ((byte) ((b2 >> i) & 1)));
        }
        return stringBuffer.toString();
    }

    public int c(String str) {
        if (a(str) && str != null) {
            try {
                File file = new File(CommonUtil.c(str));
                if (!file.exists() && !file.createNewFile()) {
                    LogUtil.a("TlvOtaUtil", "getOTAFileByPath, The file already exists continue");
                }
                return (int) file.length();
            } catch (IOException unused) {
                LogUtil.e("TlvOtaUtil", "IOException getOTAFileByPath() exception");
            }
        }
        return 1;
    }

    private boolean a(String str) {
        return str == null || str.indexOf(FeedbackWebConstants.INVALID_FILE_NAME_PRE) < 0;
    }
}
