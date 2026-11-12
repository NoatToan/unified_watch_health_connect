package com.huawei.ui.homehealth.h5pro;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import androidx.activity.ComponentActivity;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.h5pro.service.anotation.H5ProMethod;
import com.huawei.health.h5pro.service.anotation.H5ProService;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.homehealth.h5pro.UtilJsApi;
import com.huawei.ui.homehealth.qrcode.activity.QrCodeScanningActivity;
import defpackage.rdp;

/* JADX INFO: loaded from: classes.dex */
@H5ProService(name = UtilJsApi.TAG, users = {"9ea3f06fe2dea3e2c7c21ea1ba1e07c370a786c68417a4a96cb986576883e10f"})
public class UtilJsApi {
    private static final String TAG = "util";

    @H5ProMethod(name = "scan")
    public static void scan() {
        LogUtil.i(TAG, "scan");
        requestCameraPermission(new CustomPermissionAction(BaseApplication.getActivity()) { // from class: com.huawei.ui.homehealth.h5pro.UtilJsApi.3
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                LogUtil.i(UtilJsApi.TAG, "permission Granted");
                UtilJsApi.startScanActivity();
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                LogUtil.w(UtilJsApi.TAG, "permission Denied");
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                LogUtil.w(UtilJsApi.TAG, "permission ForeverDenied");
            }
        });
    }

    private static void requestCameraPermission(final PermissionsResultAction permissionsResultAction) {
        LoginInit.getInstance(BaseApplication.getActivity()).browsingToLogin(new IBaseResponseCallback() { // from class: skx
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            public final void onResponse(int i, Object obj) {
                UtilJsApi.lambda$requestCameraPermission$0(permissionsResultAction, i, obj);
            }
        }, "");
    }

    public static /* synthetic */ void lambda$requestCameraPermission$0(PermissionsResultAction permissionsResultAction, int i, Object obj) {
        if (i == 0) {
            PermissionUtil.d(BaseApplication.getActivity(), PermissionUtil.PermissionType.CAMERA, permissionsResultAction);
        } else {
            LogUtil.e(TAG, "no login cant get camera permission");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void startScanActivity() {
        if (BaseApplication.getActivity() == null) {
            LogUtil.w(TAG, "startScanActivity: Activity 为空");
            return;
        }
        try {
            BaseApplication.getActivity().startActivity(new Intent(BaseApplication.getActivity(), (Class<?>) QrCodeScanningActivity.class));
        } catch (ActivityNotFoundException e) {
            LogUtil.e(TAG, "startScanActivity fail :", ExceptionUtils.c(e));
        }
    }

    @H5ProMethod(name = "addDevice")
    public static void addDevice() {
        LogUtil.i(TAG, "addDevice");
        if (BaseApplication.getActivity() == null) {
            LogUtil.e(TAG, "addDevice error: context is null");
        } else if (BaseApplication.getActivity() instanceof ComponentActivity) {
            rdp.a((ComponentActivity) BaseApplication.getActivity());
        } else {
            LogUtil.e(TAG, "addDevice error:  Activity not ComponentActivity");
        }
    }
}
