package com.service.mi.common.util;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.annotation.RequiresApi;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class PermissionUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<String> f10602a = c();

    @RequiresApi(api = 23)
    public static class PermissionActivity extends Activity {
        @Override // android.app.Activity, android.view.Window.Callback
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            finish();
            return true;
        }

        @Override // android.app.Activity
        public void onCreate(Bundle bundle) {
            getWindow().addFlags(262160);
            PermissionUtils.a();
            super.onCreate(bundle);
            finish();
        }

        @Override // android.app.Activity
        public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            PermissionUtils.a();
            PermissionUtils.b(null, this);
            finish();
        }
    }

    public static /* synthetic */ PermissionUtils a() {
        return null;
    }

    public static /* synthetic */ void b(PermissionUtils permissionUtils, Activity activity) {
        throw null;
    }

    public static List<String> c() {
        return d(a.a().getPackageName());
    }

    public static List<String> d(String str) {
        try {
            return Arrays.asList(a.a().getPackageManager().getPackageInfo(str, 4096).requestedPermissions);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}
