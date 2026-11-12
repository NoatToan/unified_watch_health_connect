package com.huawei.hms.iapfull;

import android.content.Context;
import com.huawei.hms.iapfull.network.model.QueryOrderRequest;
import com.huawei.pluginachievement.manager.model.ResultCode;
import com.tencent.open.utils.HttpUtils;

/* JADX INFO: loaded from: classes10.dex */
public class w0 {
    public void a(Context context, int i, QueryOrderRequest queryOrderRequest, u0 u0Var) {
        if (context == null) {
            u0Var.a(ResultCode.CODE_NO_NEW_DATA, "param error");
            return;
        }
        if (!a1.b(context)) {
            u0Var.a("-1", HttpUtils.NetworkUnavailableException.ERROR_INFO);
            return;
        }
        h hVar = new h(u0Var);
        if (5 != i) {
            com.huawei.hms.iapfull.network.d.c(context.getApplicationContext(), g0.a().f13669a).queryOrder(queryOrderRequest).enqueue(new com.huawei.hms.iapfull.network.a(hVar));
        } else {
            y0.b("QueryRepository", "Query order poll start");
            com.huawei.hms.iapfull.network.d.a(context.getApplicationContext(), g0.a().f13669a).pollQueryOrder(queryOrderRequest).enqueue(new com.huawei.hms.iapfull.network.a(hVar));
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static w0 f13778a = new w0();
    }

    public static w0 a() {
        return b.f13778a;
    }

    private w0() {
    }
}
