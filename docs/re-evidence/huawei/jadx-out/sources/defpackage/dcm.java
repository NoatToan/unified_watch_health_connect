package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.store.SharedPreferencesAdapter;
import com.huawei.utils.FoundationCommonUtil;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes.dex */
final class dcm extends SharedPreferencesAdapter {
    dcm() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    @Override // com.huawei.haf.store.SharedPreferencesAdapter, android.content.SharedPreferences
    public String getString(String str, String str2) {
        byte b2;
        String androidId;
        str.hashCode();
        switch (str) {
            case "AndroidId":
                b2 = 0;
                break;
            case "PhoneUdid":
                b2 = 1;
                break;
            case "DeviceId":
                b2 = 2;
                break;
            case "DeviceSn":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            androidId = FoundationCommonUtil.getAndroidId(BaseApplication.b());
        } else if (b2 == 1 || b2 == 2) {
            androidId = CommonUtil.d(BaseApplication.b(), false);
        } else if (b2 == 3) {
            androidId = CommonUtil.g();
        } else {
            androidId = super.getString(str, str2);
        }
        return androidId != null ? androidId : str2;
    }

    @Override // com.huawei.haf.store.SharedPreferencesAdapter, android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        str.hashCode();
        if (str.equals("SystemInfoAuthorized")) {
            return FoundationCommonUtil.isSystemInfoAuthorized(BaseApplication.b());
        }
        return super.getBoolean(str, z);
    }
}
