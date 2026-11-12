package com.huawei.hwarkuix.oHBrigdePlugin.device;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.huawei.hwarkuix.oHBrigdePlugin.device.utils.PermissionConverUtil;
import com.huawei.hwarkuix.oHProEngine.OHProBridgePlugin;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import ohos.ace.adapter.capability.bridge.BridgeManager;

/* JADX INFO: loaded from: classes37.dex */
public class PermissionUtilsBridge extends OHProBridgePlugin {
    private static final String TAG = "PermissionUtilsBridge";

    public PermissionUtilsBridge(Context context, String str, int i) {
        super(context, str, i);
    }

    public PermissionUtilsBridge(Context context, String str, BridgeManager bridgeManager) {
        super(context, str, bridgeManager);
    }

    public void hasPermission(int i, String str) {
        LogUtil.a(TAG, "permission from ArkUI is ", str);
        if (TextUtils.isEmpty(str)) {
            ohProOnFailure(i, "permission from ArkUI is null");
            return;
        }
        PermissionUtil.PermissionType permissionType = PermissionConverUtil.getPermissionType(str);
        if (permissionType == null) {
            ohProOnFailure(i, "getPermissionType is null");
            return;
        }
        Activity activity = BaseApplication.getActivity();
        if (activity == null) {
            ohProOnFailure(i, "getActivity is null");
        } else if (getPermissionResult(permissionType, activity) == PermissionUtil.PermissionResult.GRANTED) {
            ohProOnSuccess(i, true);
        } else {
            ohProOnSuccess(i, false);
        }
    }

    public void requestPermissionsGrantStatus(int i, Object obj) {
        LogUtil.a(TAG, "requestPermissionsGrantStatus param is ", String.valueOf(obj));
        if (!(obj instanceof String[])) {
            LogUtil.a(TAG, "requestPermissionsGrantStatus param is not array");
            ohProOnFailure(i, "requestPermissionsGrantStatus param is not array");
            return;
        }
        String[] strArr = (String[]) obj;
        if (strArr.length == 0) {
            LogUtil.a(TAG, "requestPermissionsGrantStatus param array is null");
            ohProOnFailure(i, "requestPermissionsGrantStatus param array is null");
            return;
        }
        PermissionUtil.PermissionType permissionType = PermissionConverUtil.getPermissionType(strArr[0]);
        if (permissionType == null) {
            ohProOnFailure(i, "getPermissionType is null");
            return;
        }
        Activity activity = BaseApplication.getActivity();
        if (activity == null) {
            ohProOnFailure(i, "getActivity is null");
        } else {
            handlePermission(activity, i, permissionType);
        }
    }

    private static PermissionUtil.PermissionResult getPermissionResult(PermissionUtil.PermissionType permissionType, Context context) {
        PermissionUtil.PermissionResult permissionResultE = PermissionUtil.e(context, permissionType);
        LogUtil.a(TAG, "PermissionResult is ", permissionResultE);
        return permissionResultE;
    }

    private void handlePermission(Context context, final int i, PermissionUtil.PermissionType permissionType) {
        PermissionUtil.d(context, permissionType, new CustomPermissionAction(context) { // from class: com.huawei.hwarkuix.oHBrigdePlugin.device.PermissionUtilsBridge.1
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                JsonArray jsonArray = new JsonArray();
                jsonArray.add((Number) 0);
                PermissionUtilsBridge.this.ohProOnSuccess(i, jsonArray);
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                JsonArray jsonArray = new JsonArray();
                jsonArray.add((Number) 2);
                PermissionUtilsBridge.this.ohProOnSuccess(i, jsonArray);
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onForeverDenied(PermissionUtil.PermissionType permissionType2) {
                super.onForeverDenied(permissionType2);
                JsonArray jsonArray = new JsonArray();
                jsonArray.add((Number) (-2));
                PermissionUtilsBridge.this.ohProOnSuccess(i, jsonArray);
            }
        });
    }
}
