package com.huawei.hwcommonmodel.utils.permission;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LogUtil;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class PermissionsResultAction {
    private static final String TAG = "PermissionsResultAction";
    private Looper mMyLooper;
    private PermissionUtil.PermissionType mPermissionType;
    private final Set<String> mPermissionsSet;
    private long mTimeVariance;

    public abstract void onDenied(String str);

    public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
    }

    public abstract void onGranted();

    public PermissionsResultAction() {
        this.mPermissionsSet = new HashSet();
        this.mMyLooper = Looper.getMainLooper();
    }

    public PermissionsResultAction(Looper looper) {
        this.mPermissionsSet = new HashSet();
        Looper.getMainLooper();
        this.mMyLooper = looper;
    }

    public boolean shouldIgnorePermissionNotFound(String str) {
        synchronized (this) {
            Log.d(TAG, "Permission not found: " + str);
        }
        return true;
    }

    public final boolean onResult(String str, int i) {
        synchronized (this) {
            this.mTimeVariance = requestTimeVariance();
            LogUtil.b(TAG, "onResult permissionString=", str, "  resultInt=", Integer.valueOf(i));
            if (i == 0) {
                return onResult(str, Permissions.GRANTED);
            }
            return onResult(str, Permissions.DENIED);
        }
    }

    private long requestTimeVariance() {
        long jCurrentTimeMillis = System.currentTimeMillis() - PermissionUtil.f17225b;
        LogUtil.b(TAG, "requestTimeVariance currentTimeMillis=", Long.valueOf(System.currentTimeMillis()), "  sRequestStartTime=", Long.valueOf(PermissionUtil.f17225b), "  timeVariance=", Long.valueOf(jCurrentTimeMillis));
        PermissionUtil.f17225b = 0L;
        return jCurrentTimeMillis;
    }

    private boolean isShowRequestDialog() {
        return this.mTimeVariance > 500;
    }

    public final boolean onResult(final String str, Permissions permissions) {
        synchronized (this) {
            this.mPermissionsSet.remove(str);
            if (permissions == Permissions.GRANTED) {
                if (PermissionUtil.d(str)) {
                    CommonUtil.o(BaseApplication.b(), str);
                }
                if (this.mPermissionsSet.isEmpty()) {
                    new Handler(this.mMyLooper).post(new Runnable() { // from class: com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction.4
                        @Override // java.lang.Runnable
                        public void run() {
                            PermissionsResultAction.this.onGranted();
                        }
                    });
                    return true;
                }
            } else {
                if (permissions == Permissions.DENIED) {
                    new Handler(this.mMyLooper).post(new Runnable() { // from class: com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction.1
                        @Override // java.lang.Runnable
                        public void run() {
                            PermissionsResultAction.this.handlePermissionResult(str);
                        }
                    });
                    return true;
                }
                if (permissions != Permissions.NOT_FOUND) {
                    return false;
                }
                if (shouldIgnorePermissionNotFound(str)) {
                    if (this.mPermissionsSet.isEmpty()) {
                        new Handler(this.mMyLooper).post(new Runnable() { // from class: com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction.5
                            @Override // java.lang.Runnable
                            public void run() {
                                PermissionsResultAction.this.onGranted();
                            }
                        });
                        return true;
                    }
                } else {
                    new Handler(this.mMyLooper).post(new Runnable() { // from class: com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction.3
                        @Override // java.lang.Runnable
                        public void run() {
                            PermissionsResultAction.this.onDenied(str);
                        }
                    });
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePermissionResult(String str) {
        Activity activityJ = BaseApplication.j();
        boolean zAv = CommonUtil.av();
        boolean zD = PermissionUtil.d(str);
        boolean z = (activityJ == null || activityJ.shouldShowRequestPermissionRationale(str)) ? false : true;
        boolean zIsShowRequestDialog = isShowRequestDialog();
        LogUtil.b(TAG, "handlePermissionResult permissionString=", str, " isEmui110=", Boolean.valueOf(zAv), " isAndroidOncePermission=", Boolean.valueOf(zD), " shouldUnShowRequest=", Boolean.valueOf(z), " isShowRequestDialog=", Boolean.valueOf(zIsShowRequestDialog));
        if (zAv && zD && z && !zIsShowRequestDialog) {
            onForeverDenied(this.mPermissionType);
        } else {
            onDenied(str);
        }
    }

    public final void registerPermissions(String[] strArr) {
        synchronized (this) {
            Collections.addAll(this.mPermissionsSet, strArr);
        }
    }

    public void setPermissionType(PermissionUtil.PermissionType permissionType) {
        this.mPermissionType = permissionType;
    }
}
