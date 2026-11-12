package com.huawei.android.defaultbundle;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import com.huawei.android.bundlecore.UserConfirmationDialog;
import com.huawei.haf.bundle.guide.BundleInstallGuideHolder;
import com.huawei.haf.language.LanguageInstallHelper;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes22.dex */
public final class DefaultUserConfirmationDialog extends UserConfirmationDialog {
    @Override // com.huawei.android.bundlecore.UserConfirmationDialog, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (c()) {
            onUserConfirm();
            return;
        }
        if (a()) {
            onUserCancel();
            return;
        }
        if (checkInternParametersIllegal()) {
            setIntent(null);
            finish();
        } else {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            setFinishOnTouchOutside(false);
            b();
        }
    }

    private boolean c() {
        Intent intent = getIntent();
        if (intent == null || !intent.getBooleanExtra("isSkipConfirm", false)) {
            return false;
        }
        LogUtil.b("Bundle_UserConfirmationDialog", "checkSkipConfirm taskId=", Integer.valueOf(getSessionId()));
        return true;
    }

    private boolean a() {
        Intent intent = getIntent();
        if (intent == null || !intent.getBooleanExtra("isSkipCancel", false)) {
            return false;
        }
        LogUtil.b("Bundle_UserConfirmationDialog", "checkSkipCancel taskId=", Integer.valueOf(getSessionId()));
        return true;
    }

    private void b() {
        BundleInstallGuideHolder.d().showDownloadAskDialog(this, getDownloadModuleNames(), getRealDownloadTotalBytes(), new View.OnClickListener() { // from class: com.huawei.android.defaultbundle.DefaultUserConfirmationDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DefaultUserConfirmationDialog.this.onUserCancel();
            }
        }, new View.OnClickListener() { // from class: com.huawei.android.defaultbundle.DefaultUserConfirmationDialog.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DefaultUserConfirmationDialog.this.onUserConfirm();
            }
        });
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
