package com.huawei.health.ecologydevice.ui.measure.fragment;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.view.View;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import defpackage.elh;
import defpackage.esk;
import defpackage.qrs;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ProductFragment extends BaseFragment {
    protected static final int REQUEST_ENABLE_BT = 101;
    protected static final int REQUEST_ENABLE_BT_ON_START = 100;
    private static final String TAG = "ProductFragment";
    protected boolean mIsBtEnableShowing = false;
    protected boolean mIsPermissionGranted = false;
    protected boolean mNeedOpenBlueTooth = false;
    protected String mProductId;
    protected elh mProductInfo;
    protected String mUniqueId;

    protected abstract void autoConnectDevice();

    protected abstract void updateUIDisconnect();

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (!PermissionDialogHelper.c(this.mainActivity)) {
            LogUtil.a(TAG, "onStart isHavaScanPermission");
            checkPermissionsAndBlueTooth();
            return;
        }
        if (!this.mNeedOpenBlueTooth) {
            LogUtil.a(TAG, "onStart mNeedOpenBlueTooth = false");
            return;
        }
        int iB = esk.b().b(this.mainActivity);
        if (iB == 0) {
            LogUtil.a(TAG, "onStart BT_NO_SUPPORT");
            return;
        }
        if (iB == 2 && !this.mIsBtEnableShowing) {
            LogUtil.a(TAG, "onStart bluetoothEnabledStatus");
            openBlueTooth(100);
        } else {
            this.mIsPermissionGranted = true;
            LogUtil.a(TAG, "onStart mIsPermissionGranted is", true);
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.mIsPermissionGranted) {
            this.mIsPermissionGranted = false;
            LogUtil.a(TAG, "onResume mIsPermissionGranted is", false);
            autoConnectDevice();
        }
    }

    private void checkPermissionsAndBlueTooth() {
        this.mIsBtEnableShowing = true;
        LogUtil.a(TAG, " checkPermissionsAndBlueTooth mIsBtEnableShowing =", true);
        PermissionDialogHelper.d(this.mainActivity, new PermissionDialogHelper.OpenBlueToothAction() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.ProductFragment.1
            @Override // com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper.OpenBlueToothAction
            public void onPermissionGranted() {
                LogUtil.a(ProductFragment.TAG, "checkPermissionsAndBlueTooth onOpen");
                if (ProductFragment.this.mNeedOpenBlueTooth) {
                    int iB = esk.b().b(ProductFragment.this.mainActivity);
                    if (iB == 2) {
                        LogUtil.a(ProductFragment.TAG, "onStart bluetoothEnabledStatus BT_NO_ENABLE");
                        ProductFragment.this.openBlueTooth(100);
                        return;
                    } else {
                        if (iB == 1) {
                            ProductFragment.this.mIsBtEnableShowing = false;
                            LogUtil.a(ProductFragment.TAG, "onStart bluetoothEnabledStatus BT_ENABLED");
                            ProductFragment.this.autoConnectDevice();
                            return;
                        }
                        LogUtil.a(ProductFragment.TAG, "onStart bluetoothEnabledStatus other", Integer.valueOf(iB));
                        return;
                    }
                }
                LogUtil.a(ProductFragment.TAG, "onPermissionGranted mNeedOpenBlueTooth = false");
            }

            @Override // com.huawei.health.ecologydevice.ui.util.PermissionDialogHelper.OpenBlueToothAction
            public void onPermissionDenied() {
                LogUtil.j(ProductFragment.TAG, "checkPermissionsAndBlueTooth onPermissionDenied");
                ProductFragment.this.mIsBtEnableShowing = false;
                ProductFragment.this.updateUIDisconnect();
            }
        });
    }

    protected void showSettingDialog(PermissionUtil.PermissionType permissionType) {
        this.mIsBtEnableShowing = true;
        LogUtil.a(TAG, " showSettingDialog mIsBtEnableShowing =", true);
        qrs.c(this.mainActivity, permissionType, (CustomTextAlertDialog) null, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.ProductFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1005xc18edee8(view);
            }
        }, new View.OnClickListener() { // from class: com.huawei.health.ecologydevice.ui.measure.fragment.ProductFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1006xb2e06e69(view);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$showSettingDialog$0$com-huawei-health-ecologydevice-ui-measure-fragment-ProductFragment, reason: not valid java name */
    /* synthetic */ void m1005xc18edee8(View view) {
        this.mIsBtEnableShowing = false;
    }

    /* JADX INFO: renamed from: lambda$showSettingDialog$1$com-huawei-health-ecologydevice-ui-measure-fragment-ProductFragment, reason: not valid java name */
    /* synthetic */ void m1006xb2e06e69(View view) {
        this.mIsBtEnableShowing = false;
    }

    protected void openBlueTooth(int i) {
        this.mIsBtEnableShowing = true;
        LogUtil.a(TAG, "judgeBlueTooth");
        try {
            if (!isAdded()) {
                LogUtil.j(TAG, "fragment is not attach");
            } else {
                startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), i);
            }
        } catch (ActivityNotFoundException | IllegalStateException unused) {
            LogUtil.e(TAG, "judgeBlueTooth exception");
        }
    }

    protected boolean checkPermission() {
        if (PermissionDialogHelper.c(this.mainActivity)) {
            return true;
        }
        LogUtil.a(TAG, "checkPermission permission is not GRANTED");
        updateUIDisconnect();
        showSettingDialog(PermissionUtil.PermissionType.SCAN);
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a(TAG, "onActivityResult requestCode", Integer.valueOf(i), " resultCode", Integer.valueOf(i2));
        if (i == 100) {
            this.mIsBtEnableShowing = false;
            if (i2 == 0) {
                LogUtil.a(TAG, "user dened the bluetooth");
                updateUIDisconnect();
            } else if (i2 == -1) {
                LogUtil.a(TAG, "user access the bluetooth");
                autoConnectDevice();
            } else {
                LogUtil.a(TAG, "onActivityResult resultCode", Integer.valueOf(i2));
            }
        }
    }
}
