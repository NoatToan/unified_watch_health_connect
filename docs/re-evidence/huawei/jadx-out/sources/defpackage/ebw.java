package defpackage;

import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class ebw extends zwi {
    private static final String d = "CustomUdpDataParser";

    public zvc e(int i, byte[] bArr) {
        LogUtil.a(d, "CustomUdpDataParser createOption");
        zvc zvcVar = new zvc(i);
        zvcVar.a(bArr);
        return zvcVar;
    }

    @Override // org.eclipse.californium.core.network.serialization.DataParser
    public zvc createOption(int i, int i2, byte[] bArr) {
        return e(i2, bArr);
    }
}
