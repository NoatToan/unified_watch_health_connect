package defpackage;

import com.huawei.devicesdk.entity.SendMode;
import health.compact.a.LogUtil;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes20.dex */
public class xhu {
    public static int d(int i, xhr xhrVar, String str) {
        if (i != 127) {
            switch (i) {
                case 7:
                    if (xhrVar != null) {
                        String strA = cph.a(str);
                        xhrVar.g(strA);
                        LogUtil.b("CommonFile_CommandUtils", "handleRequestPackageNameTlv source:", strA);
                        return 0;
                    }
                    return 0;
                case 8:
                    if (xhrVar != null) {
                        String strA2 = cph.a(str);
                        xhrVar.a(strA2);
                        LogUtil.b("CommonFile_CommandUtils", "handleRequestPackageNameTlv destination:", strA2);
                        return 0;
                    }
                    return 0;
                case 9:
                    if (xhrVar != null) {
                        String strA3 = cph.a(str);
                        xhrVar.b(strA3);
                        LogUtil.b("CommonFile_CommandUtils", "handleRequestPackageNameTlv description:", strA3);
                        return 0;
                    }
                    return 0;
                case 10:
                    if (xhrVar != null) {
                        String strA4 = cph.a(str);
                        xhrVar.j(strA4);
                        LogUtil.b("CommonFile_CommandUtils", "handleRequestPackageNameTlv sourceCertificate:", strA4);
                        return 0;
                    }
                    return 0;
                case 11:
                    if (xhrVar != null) {
                        String strA5 = cph.a(str);
                        xhrVar.e(strA5);
                        LogUtil.b("CommonFile_CommandUtils", "handleRequestPackageNameTlv destinationCertificate:", strA5);
                        return 0;
                    }
                    return 0;
                default:
                    LogUtil.e("CommonFile_CommandUtils", "handleRequestPackageNameTlv default");
                    return 0;
            }
        }
        int iA = cpb.a(str);
        LogUtil.b("CommonFile_CommandUtils", "handleRequestPackageNameTlv error code:", Integer.valueOf(iA));
        return iA;
    }

    public static void c(int i, xhr xhrVar, String str) {
        if (xhrVar == null) {
            return;
        }
        if (i == 1) {
            String strA = cph.a(str);
            xhrVar.c(strA);
            LogUtil.b("CommonFile_CommandUtils", "handleRequestFileMessageTlv file_name:", strA);
            return;
        }
        if (i == 2) {
            int iA = cpb.a(str);
            xhrVar.g(iA);
            LogUtil.b("CommonFile_CommandUtils", "handleRequestFileMessageTlv file_type:", Integer.valueOf(iA));
        } else if (i == 3) {
            int iA2 = cpb.a(str);
            xhrVar.a(iA2);
            LogUtil.b("CommonFile_CommandUtils", "handleRequestFileMessageTlv file_id:", Integer.valueOf(iA2));
        } else {
            if (i != 4) {
                LogUtil.e("CommonFile_CommandUtils", "handleRequestFileMessageTlv default");
                return;
            }
            long jD = cpb.d(str);
            xhrVar.a(jD);
            LogUtil.b("CommonFile_CommandUtils", "handleRequestFileMessageTlv file_size:", Long.valueOf(jD));
        }
    }

    public static cmg e(xhr xhrVar) {
        if (xhrVar == null) {
            return new cmg();
        }
        StringBuilder sb = new StringBuilder(16);
        String strB = cph.b(xhrVar.n());
        sb.append(cph.b(1) + cph.b(strB.length() / 2) + strB);
        sb.append(cph.b(2) + cph.b(1) + cph.b(xhrVar.y()));
        String strB2 = cph.b(xhrVar.ag());
        String str = cph.b(7) + cph.b(strB2.length() / 2) + strB2;
        String strB3 = cph.b(xhrVar.i());
        String str2 = cph.b(8) + cph.b(strB3.length() / 2) + strB3;
        String strB4 = cph.b(xhrVar.ai());
        String str3 = cph.b(10) + cph.b(strB4.length() / 2) + strB4;
        String strB5 = cph.b(xhrVar.g());
        String str4 = cph.b(11) + cph.b(strB5.length() / 2) + strB5;
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        if (xhrVar.f() > 0 && xhrVar.y() == 22) {
            LogUtil.b("CommonFile_CommandUtils", "5.44.1 dictTypeId : ", Integer.valueOf(xhrVar.f()));
            String strB6 = cph.b(xhrVar.f());
            sb.append(cph.b(12) + cph.c(strB6.length() / 2) + strB6);
        }
        return b(cph.d(sb.toString()), 44, 1);
    }

    public static cmg b(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return new cmg();
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 2);
        byteBufferAllocate.put((byte) i);
        byteBufferAllocate.put((byte) i2);
        byteBufferAllocate.put(bArr);
        cmg cmgVar = new cmg();
        cmgVar.a(byteBufferAllocate.array());
        cmgVar.d(SendMode.PROTOCOL_TYPE_5A);
        return new cmg.b().a(cmgVar);
    }
}
