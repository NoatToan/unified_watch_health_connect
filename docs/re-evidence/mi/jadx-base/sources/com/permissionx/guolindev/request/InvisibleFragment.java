package com.permissionx.guolindev.request;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.Intent;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import androidx.fragment.app.Fragment;
import defpackage.bt3;
import defpackage.psh;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class InvisibleFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PermissionBuilder f10431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bt3 f10432b;

    public void A(PermissionBuilder permissionBuilder, Set<String> set, bt3 bt3Var) {
        this.f10431a = permissionBuilder;
        this.f10432b = bt3Var;
        requestPermissions((String[]) set.toArray(new String[0]), 1);
    }

    @TargetApi(23)
    public void B(PermissionBuilder permissionBuilder, bt3 bt3Var) {
        this.f10431a = permissionBuilder;
        this.f10432b = bt3Var;
        if (Settings.canDrawOverlays(getContext())) {
            w();
        } else {
            startActivityForResult(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION"), 2);
        }
    }

    @TargetApi(23)
    public void C(PermissionBuilder permissionBuilder, bt3 bt3Var) {
        this.f10431a = permissionBuilder;
        this.f10432b = bt3Var;
        if (Settings.System.canWrite(getContext())) {
            x();
        } else {
            startActivityForResult(new Intent("android.settings.action.MANAGE_WRITE_SETTINGS"), 3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (s()) {
            if (i == 1) {
                this.f10432b.requestAgain(new ArrayList(this.f10431a.forwardPermissions));
                return;
            }
            if (i == 2) {
                w();
            } else if (i == 3) {
                x();
            } else {
                if (i != 4) {
                    return;
                }
                u();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        Dialog dialog;
        super.onDestroy();
        if (s() && (dialog = this.f10431a.currentDialog) != null && dialog.isShowing()) {
            this.f10431a.currentDialog.dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 1) {
            v(strArr, iArr);
        } else if (i == 2) {
            t();
        }
    }

    public final boolean s() {
        return (this.f10431a == null || this.f10432b == null) ? false : true;
    }

    public final void t() {
        if (s()) {
            if (psh.c(getContext(), "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                this.f10431a.grantedPermissions.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                this.f10431a.deniedPermissions.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
                this.f10431a.permanentDeniedPermissions.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
                this.f10432b.finish();
                return;
            }
            shouldShowRequestPermissionRationale("android.permission.ACCESS_BACKGROUND_LOCATION");
            this.f10431a.getClass();
            this.f10431a.getClass();
            this.f10431a.getClass();
            this.f10432b.finish();
        }
    }

    public final void u() {
        if (Build.VERSION.SDK_INT < 30) {
            this.f10432b.finish();
        } else if (Environment.isExternalStorageManager()) {
            this.f10432b.finish();
        } else {
            this.f10431a.getClass();
            this.f10431a.getClass();
        }
    }

    public final void v(String[] strArr, int[] iArr) {
        if (!s() || strArr == null || iArr == null || strArr.length != iArr.length) {
            return;
        }
        this.f10431a.grantedPermissions.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (iArr[i] == 0) {
                this.f10431a.grantedPermissions.add(str);
                this.f10431a.deniedPermissions.remove(str);
                this.f10431a.permanentDeniedPermissions.remove(str);
            } else if (shouldShowRequestPermissionRationale(str)) {
                arrayList.add(strArr[i]);
                this.f10431a.deniedPermissions.add(str);
            } else {
                arrayList2.add(strArr[i]);
                this.f10431a.permanentDeniedPermissions.add(str);
                this.f10431a.deniedPermissions.remove(str);
            }
        }
        ArrayList<String> arrayList3 = new ArrayList();
        arrayList3.addAll(this.f10431a.deniedPermissions);
        arrayList3.addAll(this.f10431a.permanentDeniedPermissions);
        for (String str2 : arrayList3) {
            if (psh.c(getContext(), str2)) {
                this.f10431a.deniedPermissions.remove(str2);
                this.f10431a.grantedPermissions.add(str2);
            }
        }
        if (this.f10431a.grantedPermissions.size() == this.f10431a.normalPermissions.size()) {
            this.f10432b.finish();
            return;
        }
        this.f10431a.getClass();
        this.f10431a.getClass();
        this.f10431a.getClass();
        this.f10432b.finish();
        this.f10431a.showDialogCalled = false;
    }

    public final void w() {
        if (Settings.canDrawOverlays(getContext())) {
            this.f10432b.finish();
        } else {
            this.f10431a.getClass();
            this.f10431a.getClass();
        }
    }

    public final void x() {
        if (Settings.System.canWrite(getContext())) {
            this.f10432b.finish();
        } else {
            this.f10431a.getClass();
            this.f10431a.getClass();
        }
    }

    public void y(PermissionBuilder permissionBuilder, bt3 bt3Var) {
        this.f10431a = permissionBuilder;
        this.f10432b = bt3Var;
        requestPermissions(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, 2);
    }

    public void z(PermissionBuilder permissionBuilder, bt3 bt3Var) {
        this.f10431a = permissionBuilder;
        this.f10432b = bt3Var;
        if (Build.VERSION.SDK_INT < 30 || Environment.isExternalStorageManager()) {
            u();
        } else {
            startActivityForResult(new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION"), 4);
        }
    }
}
