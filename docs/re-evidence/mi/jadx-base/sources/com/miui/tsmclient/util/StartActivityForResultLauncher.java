package com.miui.tsmclient.util;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.p004activity.result.ActivityResult;
import androidx.p004activity.result.ActivityResultLauncher;
import androidx.p004activity.result.contract.ActivityResultContracts;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class StartActivityForResultLauncher {
    private static final String EXTRA_LAUNCHED_REQUEST_ARRAY = "launcher_request_array";
    private static final int INVALID_REQUEST_CODE = Integer.MIN_VALUE;
    public static final int START_ACTIVITY_FOR_RESULT_LAUNCHER_COUNT = 2;
    private WeakReference<Fragment> mFragmentRef;
    private int[] mLauncherRequestArray;
    private int mStartActivityForResultLauncherCount;
    private List<ActivityResultLauncher> mStartActivityForResultLauncherList = new ArrayList();

    public interface ActivityResultCallback {
        void onActivityResult(int i, int i2, Intent intent);
    }

    private StartActivityForResultLauncher(Fragment fragment) {
        this.mFragmentRef = new WeakReference<>(fragment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$registerForActivityResult$0(int i, ActivityResultCallback activityResultCallback, ActivityResult activityResult) {
        int[] iArr = this.mLauncherRequestArray;
        int i2 = iArr[i];
        iArr[i] = Integer.MIN_VALUE;
        if (activityResult == null) {
            LogUtils.d("registerForActivityResult result is null");
        } else {
            activityResultCallback.onActivityResult(i2, activityResult.c(), activityResult.a());
        }
    }

    private void registerForActivityResult(int i, final ActivityResultCallback activityResultCallback, Bundle bundle) {
        this.mStartActivityForResultLauncherCount = i;
        Fragment fragment = this.mFragmentRef.get();
        if (fragment == null) {
            LogUtils.d("registerForActivityResult fragment is null");
            return;
        }
        for (final int i2 = 0; i2 < this.mStartActivityForResultLauncherCount; i2++) {
            this.mStartActivityForResultLauncherList.add(fragment.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new androidx.p004activity.result.ActivityResultCallback() { // from class: qbo
                @Override // androidx.p004activity.result.ActivityResultCallback
                public final void a(Object obj) {
                    this.f31345a.lambda$registerForActivityResult$0(i2, activityResultCallback, (ActivityResult) obj);
                }
            }));
        }
        restore(bundle);
    }

    public static StartActivityForResultLauncher with(Fragment fragment, int i, ActivityResultCallback activityResultCallback, Bundle bundle) {
        StartActivityForResultLauncher startActivityForResultLauncher = new StartActivityForResultLauncher(fragment);
        startActivityForResultLauncher.registerForActivityResult(i, activityResultCallback, bundle);
        return startActivityForResultLauncher;
    }

    public void launchStartActivityForResult(Intent intent, int i) {
        if (i == Integer.MIN_VALUE) {
            throw new IllegalArgumentException(String.format("request code can not equals to %s!", Integer.MIN_VALUE));
        }
        for (int i2 = 0; i2 < this.mStartActivityForResultLauncherCount; i2++) {
            int i3 = this.mLauncherRequestArray[i2];
            if (i3 == Integer.MIN_VALUE) {
                try {
                    this.mStartActivityForResultLauncherList.get(i2).launch(intent);
                    this.mLauncherRequestArray[i2] = i;
                    return;
                } catch (ActivityNotFoundException e) {
                    LogUtils.e("launchStartActivityForResult ActivityNotFoundException", e);
                }
            } else if (i == i3) {
                LogUtils.d(String.format("there is a request with request code %s is executing, ignore any new request with same request code before it is finished", Integer.valueOf(i)));
                return;
            }
        }
        throw new IllegalStateException("Use up to " + this.mStartActivityForResultLauncherCount + " StartActivityForResultLauncher. If you want to exceed " + this.mStartActivityForResultLauncherCount + " , please modify it through the getStartActivityForResultLauncherCount method.");
    }

    public void restore(Bundle bundle) {
        if (bundle != null) {
            this.mLauncherRequestArray = bundle.getIntArray(EXTRA_LAUNCHED_REQUEST_ARRAY);
            return;
        }
        this.mLauncherRequestArray = new int[this.mStartActivityForResultLauncherCount];
        for (int i = 0; i < this.mStartActivityForResultLauncherCount; i++) {
            this.mLauncherRequestArray[i] = Integer.MIN_VALUE;
        }
    }

    public void save(Bundle bundle) {
        if (bundle != null) {
            bundle.putIntArray(EXTRA_LAUNCHED_REQUEST_ARRAY, this.mLauncherRequestArray);
        }
    }
}
