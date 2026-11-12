package com.huawei.hms.network.embedded;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.httpclient.excutor.PolicyExecutor;
import org.chromium.net.CronetEngine;

/* JADX INFO: loaded from: classes34.dex */
public class k2 implements d1.a {
    public static final String d = "CronetRequestTaskFactory";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CronetEngine f14992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PolicyExecutor f14994c;

    @Override // com.huawei.hms.network.embedded.d1.a
    public d1 newTask() {
        return new j2(this.f14992a, this);
    }

    public boolean isEnableConnectionMigrated() {
        return this.f14993b;
    }

    @Override // com.huawei.hms.network.embedded.d1.a
    public boolean isAvailable() {
        return this.f14992a != null;
    }

    public PolicyExecutor getPolicyExecutor() {
        return this.f14994c;
    }

    @Override // com.huawei.hms.network.embedded.d1.a
    public String getChannel() {
        return "type_cronet";
    }

    public k2(Context context, PolicyExecutor policyExecutor) {
        this.f14993b = false;
        if (context == null) {
            Logger.w(d, "the context is null,and the CronetRequestTaskFactory cann't been Initialized!");
            return;
        }
        this.f14994c = policyExecutor;
        c2 cronetEngineFeature = d2.getInstance().getCronetEngineFeature(context, policyExecutor);
        if (cronetEngineFeature != null) {
            this.f14992a = cronetEngineFeature.getCronetEngine();
            this.f14993b = cronetEngineFeature.isEnableConnectionMigrated();
        }
    }
}
