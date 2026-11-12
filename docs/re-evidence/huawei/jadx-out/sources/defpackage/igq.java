package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ParamsFactory;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import health.compact.a.CommonUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class igq implements ParamsFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LoginInit f37598b;
    private final Context e;

    public igq() {
        Context context = BaseApplication.getContext();
        this.e = context;
        this.f37598b = LoginInit.getInstance(context);
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, String> getHeaders() {
        HashMap map = new HashMap();
        String huidOrDefault = this.f37598b.getHuidOrDefault();
        if (!this.f37598b.isBrowseMode()) {
            if (huidOrDefault != null) {
                map.put("x-huid", huidOrDefault);
            }
            String accountInfo = this.f37598b.getAccountInfo(1008);
            if (!TextUtils.isEmpty(accountInfo)) {
                map.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + accountInfo);
                map.put(CloudParamKeys.X_TOKEN, accountInfo);
                map.put(CloudParamKeys.X_TOKEN_TYPE, String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
            }
        }
        map.put("x-version", CommonUtil.c(this.e));
        map.put("Content-Type", HealthEngineRequestManager.CONTENT_TYPE);
        return map;
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, Object> getBody(Object obj) {
        return ofe.a(obj);
    }
}
