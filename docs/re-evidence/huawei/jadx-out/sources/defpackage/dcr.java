package defpackage;

import android.content.SharedPreferences;
import com.huawei.haf.store.KeyValueStoreFactory;
import com.tencent.mmkv.MMKV;
import health.compact.a.LogUtil;
import health.compact.a.MmkvUtil;

/* JADX INFO: loaded from: classes.dex */
public final class dcr implements KeyValueStoreFactory {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    @Override // com.huawei.haf.store.KeyValueStoreFactory
    public SharedPreferences create(String str) {
        byte b2;
        LogUtil.b("HealthKeyValueFactory", "create name=", str);
        str.hashCode();
        switch (str) {
            case "keyvaldb_encrypt":
                b2 = 0;
                break;
            case "CommonInfo":
                b2 = 1;
                break;
            case "keyvaldb_encrypt_udsdevice":
                b2 = 2;
                break;
            case "keyvaldb_unencrypt":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return new dcu(true);
        }
        if (b2 == 1) {
            return new dcm();
        }
        if (b2 == 2) {
            return new dct(str, true);
        }
        if (b2 == 3) {
            return new dcu(false);
        }
        return MmkvUtil.b(str, null);
    }

    @Override // com.huawei.haf.store.KeyValueStoreFactory
    public boolean close(String str, SharedPreferences sharedPreferences) {
        LogUtil.b("HealthKeyValueFactory", "close name=", str);
        if (!(sharedPreferences instanceof MMKV)) {
            return false;
        }
        ((MMKV) sharedPreferences).close();
        return true;
    }
}
