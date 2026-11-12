package com.miui.tsmclient.util;

import android.app.Activity;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.p004activity.ComponentActivity;
import defpackage.ni4;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class PermissionLauncher {
    private static final int REQUEST_CODE_PERMISSION = 95;
    private WeakReference<ComponentActivity> mActivityRef;
    private IPermissionCallback mCallback;
    private WeakReference<Fragment> mFragmentRef;
    private IMultiplePermissionsCallback mMultiplePermissionsCallback;
    private final Map<String, Boolean> mPreviousPermissionsRationaleMap = new HashMap();

    public interface IMultiplePermissionsCallback {
        void onRequestPermissionsResult(Map<String, PermissionResult> map);
    }

    public interface IPermissionCallback {
        void onPermissionDenied(String str);

        void onPermissionGranted(String str);
    }

    public static class PermissionResult {
        public static final String PERMISSION_STATUS_DENIED_ASK_NO_MORE = "denied_ask_no_more";
        public static final String PERMISSION_STATUS_GRANTED = "granted";
        public static final String PERMISSION_STATUS_PERMANENT_DENIED = "permanent_denied";
        public static final String PERMISSION_STATUS_PROVISIONAL_DENIED = "provisional_denied";
        private String mPermissionResult;

        public boolean isDeniedAndAskNoMore() {
            return TextUtils.equals(this.mPermissionResult, PERMISSION_STATUS_DENIED_ASK_NO_MORE);
        }

        public boolean isGranted() {
            return TextUtils.equals(this.mPermissionResult, "granted");
        }

        public boolean isProvisionalDenied() {
            return TextUtils.equals(this.mPermissionResult, PERMISSION_STATUS_PROVISIONAL_DENIED);
        }

        public void setPermissionResult(String str) {
            this.mPermissionResult = str;
        }
    }

    private PermissionLauncher(ComponentActivity componentActivity) {
        this.mActivityRef = new WeakReference<>(componentActivity);
    }

    private void checkPermissionResult(Activity activity, String str, Map<String, PermissionResult> map, boolean z) {
        PermissionResult permissionResult = new PermissionResult();
        if (z) {
            permissionResult.setPermissionResult("granted");
        } else {
            Boolean bool = this.mPreviousPermissionsRationaleMap.get(str);
            if (activity.shouldShowRequestPermissionRationale(str)) {
                permissionResult.setPermissionResult(PermissionResult.PERMISSION_STATUS_PROVISIONAL_DENIED);
            } else if (bool == null || !bool.booleanValue()) {
                permissionResult.setPermissionResult(PermissionResult.PERMISSION_STATUS_PERMANENT_DENIED);
            } else {
                permissionResult.setPermissionResult(PermissionResult.PERMISSION_STATUS_DENIED_ASK_NO_MORE);
            }
        }
        map.put(str, permissionResult);
    }

    private void doMultiplePermissionResult(String[] strArr, int[] iArr) {
        ComponentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        IMultiplePermissionsCallback iMultiplePermissionsCallback = this.mMultiplePermissionsCallback;
        this.mMultiplePermissionsCallback = null;
        if (iMultiplePermissionsCallback != null) {
            ArrayMap arrayMap = new ArrayMap();
            for (int i = 0; i < strArr.length; i++) {
                checkPermissionResult(activity, strArr[i], arrayMap, iArr[i] == 0);
            }
            iMultiplePermissionsCallback.onRequestPermissionsResult(arrayMap);
        }
    }

    private void doPermissionResult(String[] strArr, int[] iArr) {
        IPermissionCallback iPermissionCallback = this.mCallback;
        this.mCallback = null;
        if (iPermissionCallback == null || strArr.length <= 0) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            iPermissionCallback.onPermissionDenied(strArr[0]);
        } else {
            iPermissionCallback.onPermissionGranted(strArr[0]);
        }
    }

    private ComponentActivity getActivity() {
        Fragment fragment;
        WeakReference<ComponentActivity> weakReference = this.mActivityRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        WeakReference<Fragment> weakReference2 = this.mFragmentRef;
        if (weakReference2 == null || (fragment = weakReference2.get()) == null) {
            return null;
        }
        return fragment.getActivity();
    }

    private void requestPermissions(String[] strArr) {
        WeakReference<ComponentActivity> weakReference = this.mActivityRef;
        if (weakReference != null && weakReference.get() != null) {
            this.mActivityRef.get().requestPermissions(strArr, 95);
            return;
        }
        WeakReference<Fragment> weakReference2 = this.mFragmentRef;
        if (weakReference2 == null || weakReference2.get() == null) {
            return;
        }
        this.mFragmentRef.get().requestPermissions(strArr, 95);
    }

    private void savePermissionsRationale(Activity activity, String[] strArr) {
        for (String str : strArr) {
            this.mPreviousPermissionsRationaleMap.put(str, Boolean.valueOf(activity.shouldShowRequestPermissionRationale(str)));
        }
    }

    public static PermissionLauncher with(ComponentActivity componentActivity) {
        return new PermissionLauncher(componentActivity);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (95 == i) {
            doPermissionResult(strArr, iArr);
            doMultiplePermissionResult(strArr, iArr);
        }
    }

    public void request(String str, IPermissionCallback iPermissionCallback) {
        ComponentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        if (ni4.a(activity, str) == 0) {
            iPermissionCallback.onPermissionGranted(str);
        } else if (this.mCallback != null || this.mMultiplePermissionsCallback != null) {
            iPermissionCallback.onPermissionDenied(str);
        } else {
            this.mCallback = iPermissionCallback;
            requestPermissions(new String[]{str});
        }
    }

    public static PermissionLauncher with(Fragment fragment) {
        return new PermissionLauncher(fragment);
    }

    private PermissionLauncher(Fragment fragment) {
        this.mFragmentRef = new WeakReference<>(fragment);
    }

    public void request(String[] strArr, IMultiplePermissionsCallback iMultiplePermissionsCallback) {
        ComponentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        if (this.mMultiplePermissionsCallback == null && this.mCallback == null) {
            savePermissionsRationale(activity, strArr);
            this.mMultiplePermissionsCallback = iMultiplePermissionsCallback;
            requestPermissions(strArr);
            return;
        }
        iMultiplePermissionsCallback.onRequestPermissionsResult(new ArrayMap());
    }

    public void request(String[] strArr, String[] strArr2, IMultiplePermissionsCallback iMultiplePermissionsCallback) {
        ComponentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        if (this.mMultiplePermissionsCallback == null && this.mCallback == null) {
            savePermissionsRationale(activity, strArr);
            HashMap map = new HashMap();
            for (String str : strArr) {
                if (ni4.a(activity, str) == 0) {
                    checkPermissionResult(activity, str, map, true);
                } else {
                    String[] strArr3 = new String[strArr.length * 2];
                    for (int i = 0; i < strArr.length; i++) {
                        int i2 = i * 2;
                        strArr3[i2] = strArr[i];
                        strArr3[i2 + 1] = strArr2[i];
                    }
                    this.mMultiplePermissionsCallback = iMultiplePermissionsCallback;
                    requestPermissions(strArr3);
                    return;
                }
            }
            iMultiplePermissionsCallback.onRequestPermissionsResult(map);
            return;
        }
        iMultiplePermissionsCallback.onRequestPermissionsResult(new ArrayMap());
    }
}
