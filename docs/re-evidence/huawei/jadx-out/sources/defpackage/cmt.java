package defpackage;

import android.text.TextUtils;
import com.huawei.devicesdk.entity.ReceiveDataInterface;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class cmt implements ReceiveDataInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, ReceiveDataInterface> f1799a;

    private cmt() {
        this.f1799a = new ConcurrentHashMap();
    }

    public void b(String str, ReceiveDataInterface receiveDataInterface) {
        if (str == null || receiveDataInterface == null) {
            return;
        }
        this.f1799a.put(str, receiveDataInterface);
    }

    @Override // com.huawei.devicesdk.entity.ReceiveDataInterface
    public void clearDevice(String str) {
        if (!TextUtils.isEmpty(str) && this.f1799a.containsKey(str)) {
            this.f1799a.remove(str).clearDevice(str);
        }
    }

    @Override // com.huawei.devicesdk.entity.ReceiveDataInterface
    public void clearReceiveDataByUuid(String str, String str2) {
        ReceiveDataInterface receiveDataInterface;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (receiveDataInterface = this.f1799a.get(str)) == null) {
            return;
        }
        receiveDataInterface.clearReceiveDataByUuid(str, str2);
    }

    public static cmt b() {
        return d.d;
    }

    static class d {
        private static cmt d = new cmt();
    }
}
