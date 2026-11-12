package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.store.AbstrctSharedPreferences;
import com.huawei.haf.store.SharedPreferencesAdapter;
import com.tencent.mmkv.MMKV;
import health.compact.a.KeyValDbManager;
import health.compact.a.LogUtil;
import health.compact.a.MmkvUtil;
import health.compact.a.StorageParams;
import health.compact.a.WhiteBoxManager;

/* JADX INFO: loaded from: classes.dex */
final class dcu extends SharedPreferencesAdapter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f31611c;
    private final MMKV d;

    dcu(boolean z) {
        super(null, false);
        this.f31611c = z;
        this.d = MmkvUtil.b(b(z), a(z));
    }

    @Override // com.huawei.haf.store.SharedPreferencesAdapter, android.content.SharedPreferences
    public String getString(String str, String str2) {
        String strB;
        Context contextB = BaseApplication.b();
        if (!this.f31611c) {
            strB = KeyValDbManager.d(contextB).c(str);
        } else {
            String string = this.d.getString(str, null);
            strB = string == null ? KeyValDbManager.d(contextB).b(str, d(str)) : string;
        }
        return strB == null ? str2 : strB;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    private StorageParams d(String str) {
        byte b2;
        str.hashCode();
        int i = 0;
        switch (str) {
            case "server_token":
                b2 = 0;
                break;
            case "cached_wear_place_info":
                b2 = 1;
                break;
            case "device_id":
                b2 = 2;
                break;
            case "service_country_code":
                b2 = 3;
                break;
            case "country_code":
                b2 = 4;
                break;
            case "healthAccessToken":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            i = 14;
        } else if (b2 == 1 || b2 == 2 || b2 == 3 || b2 == 4 || b2 == 5) {
            i = 1;
        } else {
            LogUtil.e("KeyValDbAdapter", "Migration adaptation may be required here. key=", str);
        }
        return new StorageParams(i);
    }

    @Override // com.huawei.haf.store.SharedPreferencesAdapter, android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new e(this.d);
    }

    private static String b(boolean z) {
        return z ? "keyvaldb_encrypt" : "keyvaldb_unencrypt";
    }

    static String a(boolean z) {
        if (z) {
            return a();
        }
        return null;
    }

    private static String a() {
        WhiteBoxManager whiteBoxManagerB = WhiteBoxManager.b();
        return whiteBoxManagerB.a(1, 34) + whiteBoxManagerB.a(1, 1034) + whiteBoxManagerB.a(1, 2034);
    }

    /* JADX INFO: loaded from: classes3.dex */
    static class e extends AbstrctSharedPreferences.AbstractEditor {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SharedPreferences.Editor f31612b;

        e(SharedPreferences.Editor editor) {
            this.f31612b = editor;
        }

        @Override // com.huawei.haf.store.AbstrctSharedPreferences.AbstractEditor
        public boolean update(boolean z, boolean z2, Bundle bundle) {
            if (z2) {
                this.f31612b.clear();
            }
            if (bundle.isEmpty()) {
                return true;
            }
            e(BaseApplication.b(), bundle);
            return true;
        }

        private void e(Context context, Bundle bundle) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj == null) {
                    KeyValDbManager.d(context).d(str);
                } else if (obj instanceof String) {
                    this.f31612b.putString(str, (String) obj);
                } else {
                    LogUtil.e("KeyValDbAdapter", "Non string is not supported, key=", str);
                }
            }
        }
    }
}
