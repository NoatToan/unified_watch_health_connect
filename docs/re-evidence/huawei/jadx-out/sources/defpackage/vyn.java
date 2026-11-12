package defpackage;

import android.content.Context;
import com.huawei.health.main.api.MainNavigationApi;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
@ApiDefine(uri = MainNavigationApi.class)
@Singleton
public class vyn implements MainNavigationApi {
    @Override // com.huawei.health.main.api.MainNavigationApi
    public void goToAchieveKaka(Context context) {
        wsg.b(context);
        wsg.a(context, 3);
        HashMap map = new HashMap();
        map.put("click", "1");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_DISCOVER_PAGE_CLICKED.value(), map, 0);
    }
}
