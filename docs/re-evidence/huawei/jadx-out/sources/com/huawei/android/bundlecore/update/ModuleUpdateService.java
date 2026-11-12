package com.huawei.android.bundlecore.update;

import android.app.IntentService;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.haf.bundle.AppBundleBuildConfig;
import com.huawei.haf.common.utils.CollectionUtils;
import defpackage.bak;
import defpackage.baq;
import health.compact.a.LogUtil;
import java.io.File;

/* JADX INFO: loaded from: classes22.dex */
public class ModuleUpdateService extends IntentService {
    public ModuleUpdateService() {
        super("bundle_module_update");
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        if (intent == null || TextUtils.isEmpty(intent.getAction())) {
            LogUtil.e("Bundle_UpdateService", "intent == null || intent.getAction() is empty");
            return;
        }
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("ModuleUpdateService")) {
            c(intent);
        }
    }

    private void c(Intent intent) {
        baq baqVarA = baq.a();
        if (baqVarA.c(this).isEmpty()) {
            LogUtil.e("Bundle_UpdateService", "Failed to get modules info of current module-info version!");
            return;
        }
        String stringExtra = intent.getStringExtra("new_module_info_version");
        if (TextUtils.isEmpty(stringExtra)) {
            LogUtil.e("Bundle_UpdateService", "New module-info version null");
            return;
        }
        String stringExtra2 = intent.getStringExtra("new_module_info_path");
        if (TextUtils.isEmpty(stringExtra2)) {
            LogUtil.e("Bundle_UpdateService", "New module-info path null");
        } else {
            d(baqVarA, stringExtra, stringExtra2);
        }
    }

    private void d(baq baqVar, String str, String str2) {
        File file = new File(str2);
        if (!file.exists() || !file.canWrite()) {
            LogUtil.e("Bundle_UpdateService", "New module-info file ", str2, " is invalid");
            return;
        }
        if (str.equals(baqVar.b())) {
            LogUtil.e("Bundle_UpdateService", "New module-info version ", str, " is equals to current mVersion!");
            return;
        }
        bak bakVarD = baqVar.d(str2);
        if (bakVarD == null || !bakVarD.b()) {
            LogUtil.e("Bundle_UpdateService", "Failed to parse ModuleDetails for new module info file!");
            return;
        }
        String strE = bakVarD.e();
        if (TextUtils.isEmpty(strE) || !strE.equals(AppBundleBuildConfig.d())) {
            LogUtil.e("Bundle_UpdateService", "New bundle-id is not equal to current app, so we could't update modules!");
            return;
        }
        if (CollectionUtils.a(bakVarD.c())) {
            LogUtil.e("Bundle_UpdateService", "There are no modules need to be updated!");
            return;
        }
        LogUtil.b("Bundle_UpdateService", "Success to check update request, updatedModuleInfoPath:", str2, ", updatedModuleInfoVersion:", str);
        if (baqVar.b(str, file)) {
            LogUtil.e("Bundle_UpdateService", "updateModuleInfoVersion update ok");
        } else {
            LogUtil.e("Bundle_UpdateService", "updateModuleInfoVersion update error");
        }
    }
}
