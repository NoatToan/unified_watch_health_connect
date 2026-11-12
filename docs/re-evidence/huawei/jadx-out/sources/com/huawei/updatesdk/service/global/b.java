package com.huawei.updatesdk.service.global;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.updatesdk.service.otaupdate.f;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class b extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f29961c = "";

    @Override // com.huawei.updatesdk.service.global.a
    public int a(Context context, String str) {
        return 34;
    }

    @Override // com.huawei.updatesdk.service.global.a
    public void a(List<String> list) {
    }

    @Override // com.huawei.updatesdk.service.global.a
    public boolean e(Context context) {
        return com.huawei.updatesdk.service.util.b.g(context, b());
    }

    @Override // com.huawei.updatesdk.service.global.a
    public String b() {
        return f.c().d();
    }

    @Override // com.huawei.updatesdk.service.global.a
    String a(Context context) {
        if (!TextUtils.isEmpty(this.f29961c)) {
            return this.f29961c;
        }
        String strA = TextUtils.equals("SECURITY", com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.b.a()) ? d.a(context, "grs_sdk_global_route_config_apptouchupdatesdk.json", "SECURITY") : d.a(context, "grs_sdk_global_route_config_apptouchupdatesdk.json", "DR3");
        this.f29961c = strA;
        return strA;
    }

    @Override // com.huawei.updatesdk.service.global.a
    String a() {
        return "com.huawei.apptouch.updatesdk";
    }
}
