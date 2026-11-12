package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.util.HiScopeUtil;
import com.huawei.hihealthservice.hihealthkit.util.AppStatusHelper;
import com.huawei.hihealthservice.hmsauth.HmsAuthApi;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;

/* JADX INFO: loaded from: classes33.dex */
@ApiDefine(uri = HmsAuthApi.class)
@Singleton
public class lda implements HmsAuthApi {
    @Override // com.huawei.hihealthservice.hmsauth.HmsAuthApi
    public int hmsAuth(String str, int i, boolean z) {
        int iE = ldd.b(BaseApplication.b()).e(str, i, z);
        if (iE == 8) {
            return new AppStatusHelper(BaseApplication.b()).a(HiScopeUtil.b(BaseApplication.b(), str), z ? 1 : 2, i);
        }
        return iE;
    }

    @Override // com.huawei.hihealthservice.hmsauth.HmsAuthApi
    public boolean isValidRedirectUrl(String str, String str2, String str3) {
        return new lfl().e(str, str2, str3);
    }

    @Override // com.huawei.hihealthservice.hmsauth.HmsAuthApi
    public boolean isValidSignature(String str, String str2, String str3) {
        return new lfl().c(str, str2, str3);
    }
}
