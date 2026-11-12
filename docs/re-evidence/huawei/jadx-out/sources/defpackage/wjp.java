package defpackage;

import android.content.Context;
import com.huawei.health.main.api.CloudAuthApi;
import com.huawei.health.main.model.AppLangItem;
import com.huawei.hmf.annotation.ApiDefine;
import health.compact.a.Utils;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
@ApiDefine(uri = CloudAuthApi.class)
public class wjp implements CloudAuthApi {
    private wjo e;

    @Override // com.huawei.health.main.api.CloudAuthApi
    public void constructInstance(Context context, String str) {
        this.e = new wjo(context, str);
    }

    @Override // com.huawei.health.main.api.CloudAuthApi
    public String getLang() {
        wjo wjoVar = this.e;
        if (wjoVar != null) {
            return wjoVar.a();
        }
        return "";
    }

    @Override // com.huawei.health.main.api.CloudAuthApi
    public String getAppLangItemUrl(String str, String str2) {
        wjo wjoVar = this.e;
        if (wjoVar != null) {
            return wjoVar.e(str, str2);
        }
        return "";
    }

    @Override // com.huawei.health.main.api.CloudAuthApi
    public List<AppLangItem> getAppLangItem(String str, String str2, String str3) {
        if (!Utils.h()) {
            return Collections.EMPTY_LIST;
        }
        wjo wjoVar = this.e;
        if (wjoVar != null) {
            return wjoVar.e(str, str2, str3);
        }
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.health.main.api.CloudAuthApi
    public String getScopeLangItemUrl(String str, String str2) {
        wjo wjoVar = this.e;
        if (wjoVar != null) {
            return wjoVar.d(str, str2);
        }
        return "";
    }

    @Override // com.huawei.health.main.api.CloudAuthApi
    public fwp getScopeLangItem(String str, String str2, String str3) {
        wjo wjoVar = this.e;
        if (wjoVar != null) {
            return wjoVar.c(str, str2, str3);
        }
        return null;
    }
}
