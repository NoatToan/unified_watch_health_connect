package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class dnp {
    public byte[] a(String str, String str2) {
        String strA = eeq.a(str);
        String str3 = eeq.d(1) + eeq.d(strA.length() / 2) + strA;
        String strA2 = eeq.a(str2);
        String str4 = str3 + (eeq.d(2) + eeq.d(strA2.length() / 2) + strA2);
        dnq dnqVar = new dnq();
        dnqVar.d(44);
        dnqVar.b(8);
        dnqVar.d(eeq.c(str4));
        dnqVar.e(eeq.c(str4).length);
        return d(dnqVar);
    }

    public byte[] c(int i, int i2) {
        String str = (eeq.d(1) + eeq.d(1) + eeq.d(i)) + (eeq.d(2) + eeq.d(1) + eeq.d(i2));
        dnq dnqVar = new dnq();
        dnqVar.d(44);
        dnqVar.b(2);
        dnqVar.d(eeq.c(str));
        dnqVar.e(eeq.c(str).length);
        return d(dnqVar);
    }

    public byte[] a(int i) {
        String str = (eeq.d(1) + eeq.d(1) + eeq.d(i)) + (eeq.d(2) + eeq.d(0)) + (eeq.d(3) + eeq.d(0)) + (eeq.d(4) + eeq.d(0)) + (eeq.d(5) + eeq.d(0));
        dnq dnqVar = new dnq();
        dnqVar.d(44);
        dnqVar.b(3);
        dnqVar.d(eeq.c(str));
        dnqVar.e(eeq.c(str).length);
        return d(dnqVar);
    }

    public byte[] b(int i, int i2, int i3) {
        String str = (eeq.d(1) + eeq.d(1) + eeq.d(i)) + (eeq.d(2) + eeq.d(4) + eeq.c(i2)) + (eeq.d(3) + eeq.d(4) + eeq.c(i3));
        dnq dnqVar = new dnq();
        dnqVar.d(44);
        dnqVar.b(4);
        dnqVar.d(eeq.c(str));
        dnqVar.e(eeq.c(str).length);
        return d(dnqVar);
    }

    public byte[] d(int i, int i2) {
        String str = (eeq.d(1) + eeq.d(1) + eeq.d(i)) + (eeq.d(2) + eeq.d(1) + eeq.d(i2));
        dnq dnqVar = new dnq();
        dnqVar.d(44);
        dnqVar.b(6);
        dnqVar.d(eeq.c(str));
        dnqVar.e(eeq.c(str).length);
        return d(dnqVar);
    }

    private static byte[] d(dnq dnqVar) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(dnqVar.a() + 2);
        byteBufferAllocate.put(eeq.c(eeq.d(dnqVar.c())));
        byteBufferAllocate.put(eeq.c(eeq.d(dnqVar.b())));
        LogUtil.a("WspFileDataParser", "getCommandBytes, deviceCommand:", dnqVar.toString());
        if (dnqVar.d() != null) {
            byteBufferAllocate.put(dnqVar.d());
            LogUtil.a("WspFileDataParser", "command data", eeq.e(dnqVar.d()));
        } else {
            LogUtil.j("WspFileDataParser", "command data is null");
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate.array();
    }
}
