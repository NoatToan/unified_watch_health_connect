package com.mipay.sdk.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.mipay.sdk.util.PermissionUtil;
import com.mipay.sdk.web.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class RequestPermissionActivity extends Activity {
    private static final String KEY_PERMS = "perms";
    private static final String KEY_TOKEN = "callbackToken";
    private static final int REQUEST_CODE_PERMISSION = 100;
    private static final int REQUEST_CODE_SETTINGS = 1001;
    private static final String TAG = "RequestPermissionAct";
    private static Map<Integer, IPermCallback> sCallbacks = new HashMap();
    private int mCallbackToken;

    public interface IPermCallback {
        String[] getPermissions();

        void onDenied(String[] strArr);

        void onGranted();
    }

    private void finishWithCallback() {
        IPermCallback iPermCallback = sCallbacks.get(Integer.valueOf(this.mCallbackToken));
        if (iPermCallback != null) {
            if (PermissionUtil.isPermissionsGranted(this, iPermCallback.getPermissions())) {
                iPermCallback.onGranted();
            } else {
                iPermCallback.onDenied(PermissionUtil.getUngrantedPermissions(this, iPermCallback.getPermissions()));
            }
        }
        finish();
    }

    private static void registerCallback(IPermCallback iPermCallback) {
        sCallbacks.put(Integer.valueOf(iPermCallback.hashCode()), iPermCallback);
    }

    public static void release() {
        sCallbacks.clear();
    }

    public static void request(Activity activity, IPermCallback iPermCallback) {
        String[] permissions = iPermCallback.getPermissions();
        if (permissions == null || permissions.length == 0 || PermissionUtil.isPermissionsGranted(activity, permissions)) {
            iPermCallback.onGranted();
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) RequestPermissionActivity.class);
        intent.putExtra(KEY_PERMS, PermissionUtil.getUngrantedPermissions(activity, permissions));
        intent.putExtra(KEY_TOKEN, iPermCallback.hashCode());
        registerCallback(iPermCallback);
        activity.startActivity(intent);
        activity.overridePendingTransition(0, 0);
    }

    private void showSettingDialog(final List<String> list) {
        new AlertDialog.Builder(this).setTitle(R.string.permission_setting_title).setMessage(PermissionUtil.getPermissionDialogMessage(this, list)).setCancelable(false).setPositiveButton(R.string.permission_setting_confirm, new DialogInterface.OnClickListener() { // from class: com.mipay.sdk.app.RequestPermissionActivity.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (PermissionUtil.openPermissionSetting(RequestPermissionActivity.this, 1001)) {
                    return;
                }
                IPermCallback iPermCallback = (IPermCallback) RequestPermissionActivity.sCallbacks.get(Integer.valueOf(RequestPermissionActivity.this.mCallbackToken));
                if (iPermCallback != null) {
                    iPermCallback.onDenied((String[]) list.toArray(new String[0]));
                }
                RequestPermissionActivity.this.finish();
            }
        }).setNegativeButton(R.string.permission_cancel, new DialogInterface.OnClickListener() { // from class: com.mipay.sdk.app.RequestPermissionActivity.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                IPermCallback iPermCallback = (IPermCallback) RequestPermissionActivity.sCallbacks.get(Integer.valueOf(RequestPermissionActivity.this.mCallbackToken));
                if (iPermCallback != null) {
                    iPermCallback.onDenied((String[]) list.toArray(new String[0]));
                }
                RequestPermissionActivity.this.finish();
            }
        }).create().show();
    }

    private static void unRegister(int i) {
        sCallbacks.remove(Integer.valueOf(i));
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        unRegister(this.mCallbackToken);
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001) {
            finishWithCallback();
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    @SuppressLint({"NewApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mCallbackToken = getIntent().getIntExtra(KEY_TOKEN, 0);
        String[] stringArrayExtra = getIntent().getStringArrayExtra(KEY_PERMS);
        if (bundle == null) {
            requestPermissions(stringArrayExtra, 100);
        } else {
            finishWithCallback();
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        StringBuilder sb = new StringBuilder();
        sb.append("onRequestPermissionResult permissions : ");
        sb.append(Arrays.toString(strArr));
        sb.append(" ; grantResults : ");
        sb.append(Arrays.toString(iArr));
        if (i == 100) {
            IPermCallback iPermCallback = sCallbacks.get(Integer.valueOf(this.mCallbackToken));
            if (strArr == null || iArr == null || PermissionUtil.isAllGranted(iArr)) {
                if (iPermCallback != null) {
                    iPermCallback.onGranted();
                }
                finish();
            } else {
                List<String> permanentlyDeniedPermissions = PermissionUtil.getPermanentlyDeniedPermissions(this, strArr);
                if (!permanentlyDeniedPermissions.isEmpty()) {
                    showSettingDialog(permanentlyDeniedPermissions);
                } else {
                    iPermCallback.onDenied(PermissionUtil.getUngrantedPermissions(this, strArr));
                    finish();
                }
            }
        }
    }
}
