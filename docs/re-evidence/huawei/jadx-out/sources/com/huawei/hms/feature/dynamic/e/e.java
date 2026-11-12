package com.huawei.hms.feature.dynamic.e;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.common.util.Logger;
import com.huawei.hms.feature.dynamic.DynamicModule;

/* JADX INFO: loaded from: classes3.dex */
public class e implements DynamicModule.VersionPolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13178a = "e";

    @Override // com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy
    public Bundle getModuleInfo(Context context, String str) throws DynamicModule.LoadingException {
        Bundle remoteModuleInfo = DynamicModule.getRemoteModuleInfo(context, str);
        if (remoteModuleInfo.getInt("module_version") > 0) {
            Logger.i(f13178a, "Prefer remote: The version of remote module " + str + ":" + remoteModuleInfo.getInt("module_version"));
            return remoteModuleInfo;
        }
        Bundle localModuleInfo = DynamicModule.getLocalModuleInfo(context, str);
        if (localModuleInfo.getInt("local_module_version") <= 0) {
            Logger.i(f13178a, "Cannot get module info in remote or local.");
            return new Bundle();
        }
        Logger.i(f13178a, "Choose local: The version of local module " + str + ":" + localModuleInfo.getInt("local_module_version"));
        return localModuleInfo;
    }
}
