package defpackage;

import com.huawei.devicesdk.entity.ReceiveDataInterface;
import health.compact.a.LogUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class cmx implements ReceiveDataInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Map<String, cmp>> f1808c;

    private cmx() {
        this.f1808c = new ConcurrentHashMap();
    }

    public void d(String str, String str2, byte[] bArr, boolean z) {
        if (str == null || str2 == null || bArr == null) {
            LogUtil.d("SimpleReceiveDataCache", "put param is invalid");
            return;
        }
        if (!this.f1808c.containsKey(str)) {
            this.f1808c.put(str, new HashMap(16));
        }
        Map<String, cmp> map = this.f1808c.get(str);
        if (!map.containsKey(str2)) {
            map.put(str2, new cmp(z));
        }
        cmp cmpVar = map.get(str2);
        cmpVar.b(e(cmpVar.b(), bArr));
    }

    public cmp c(String str, String str2, boolean z) {
        if (str == null || str2 == null) {
            return new cmp(false);
        }
        if (!this.f1808c.containsKey(str)) {
            this.f1808c.put(str, new HashMap(16));
        }
        Map<String, cmp> map = this.f1808c.get(str);
        if (!map.containsKey(str2)) {
            map.put(str2, new cmp(false));
        }
        cmp cmpVar = map.get(str2);
        if (z) {
            clearReceiveDataByUuid(str, str2);
            if (map.isEmpty()) {
                this.f1808c.remove(str);
            }
        }
        return cmpVar;
    }

    @Override // com.huawei.devicesdk.entity.ReceiveDataInterface
    public void clearDevice(String str) {
        if (str != null) {
            LogUtil.c("SimpleReceiveDataCache", "clear device receive data.");
            this.f1808c.remove(str);
        }
    }

    @Override // com.huawei.devicesdk.entity.ReceiveDataInterface
    public void clearReceiveDataByUuid(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        LogUtil.c("SimpleReceiveDataCache", "clear device character receive data. device: ", cpl.a(str), " character: ", str2);
        Map<String, cmp> map = this.f1808c.get(str);
        if (map != null) {
            map.remove(str2);
        }
    }

    private byte[] e(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length + length2];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        System.arraycopy(bArr2, 0, bArr3, length, length2);
        return bArr3;
    }

    public static cmx a() {
        return e.f1809b;
    }

    static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static cmx f1809b = new cmx();
    }
}
