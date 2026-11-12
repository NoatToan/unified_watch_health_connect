package com.huawei.ui.device.activity.screenshot;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.device.R;
import defpackage.miw;
import defpackage.qrs;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes16.dex */
public class ScreenshotPermissionDialogActivity extends BaseActivity {
    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setGravity(80);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
        if (getIntent() != null) {
            PermissionUtil.PermissionResult permissionResultA = miw.a(this);
            if (permissionResultA == PermissionUtil.PermissionResult.FOREVER_DENIED) {
                b(true);
                return;
            } else if (permissionResultA == PermissionUtil.PermissionResult.DENIED) {
                d();
                return;
            } else {
                finish();
                return;
            }
        }
        finish();
    }

    private void b(final boolean z) {
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this);
        builder.a(z ? R.string.IDS_screen_shot_setting_title : R.string.IDS_screen_shot_first_title).b(z ? R.string.IDS_permission_description_storage : R.string.IDS_screen_shot_first_content).e(R.string.IDS_screen_shot_cancel, new View.OnClickListener() { // from class: qzp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.a(view);
            }
        }).a(R.string.IDS_screen_shot_sure, new View.OnClickListener() { // from class: qzs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f47036c.a(z, view);
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    public /* synthetic */ void a(View view) {
        miw.a();
        finish();
    }

    public /* synthetic */ void a(boolean z, View view) {
        if (z) {
            qrs.al(this);
            e();
        } else {
            PermissionUtil.d(this, PermissionUtil.PermissionType.STORAGE, a());
        }
    }

    private void d() {
        if (CommonUtil.e(this, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            b(false);
        } else {
            PermissionUtil.d(this, PermissionUtil.PermissionType.STORAGE, a());
        }
    }

    private CustomPermissionAction a() {
        return new CustomPermissionAction(this) { // from class: com.huawei.ui.device.activity.screenshot.ScreenshotPermissionDialogActivity.1
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                ScreenshotPermissionDialogActivity.this.e();
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                super.onDenied(str);
                ScreenshotPermissionDialogActivity.this.e();
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                super.onForeverDenied(permissionType);
                ScreenshotPermissionDialogActivity.this.e();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        miw.a();
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
