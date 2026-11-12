package com.huawei.hmf.services.ui;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes33.dex */
public class ActivityResultFragment extends Fragment {
    private static final String REPORT_FRAGMENT_TAG = "com.huawei.hmf.report_fragment_tag";
    private static final String TAG = "ActivityResultFragment";
    Set<Integer> mTobeReleaseRequestCode = new HashSet();

    public static Fragment injectIfNeededIn(Activity activity, int i) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag(REPORT_FRAGMENT_TAG);
        if (fragmentFindFragmentByTag == null) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                fragmentFindFragmentByTag = awaitCreateAndAddFragment(fragmentManager);
            } else {
                fragmentFindFragmentByTag = createAndAddFragment(fragmentManager);
            }
        }
        if (fragmentFindFragmentByTag instanceof ActivityResultFragment) {
            ((ActivityResultFragment) fragmentFindFragmentByTag).mTobeReleaseRequestCode.add(Integer.valueOf(i));
        }
        return fragmentFindFragmentByTag;
    }

    private static Fragment awaitCreateAndAddFragment(final FragmentManager fragmentManager) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicReference atomicReference = new AtomicReference();
        try {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huawei.hmf.services.ui.ActivityResultFragment.1
                @Override // java.lang.Runnable
                public void run() {
                    Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag(ActivityResultFragment.REPORT_FRAGMENT_TAG);
                    if (fragmentFindFragmentByTag == null) {
                        fragmentFindFragmentByTag = ActivityResultFragment.createAndAddFragment(fragmentManager);
                    }
                    atomicReference.set(fragmentFindFragmentByTag);
                    countDownLatch.countDown();
                }
            });
            countDownLatch.await();
        } catch (InterruptedException unused) {
        }
        return (Fragment) atomicReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Fragment createAndAddFragment(FragmentManager fragmentManager) {
        ActivityResultFragment activityResultFragment;
        try {
            activityResultFragment = new ActivityResultFragment();
            try {
                fragmentManager.beginTransaction().add(activityResultFragment, REPORT_FRAGMENT_TAG).commitAllowingStateLoss();
                fragmentManager.executePendingTransactions();
                return activityResultFragment;
            } catch (Exception e) {
                e = e;
                Log.e(TAG, "create fragment failed." + e.getMessage());
                return activityResultFragment;
            }
        } catch (Exception e2) {
            e = e2;
            activityResultFragment = null;
        }
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.mTobeReleaseRequestCode.remove(Integer.valueOf(i));
        Launcher.getLauncher().onActivityResult(getActivity(), i, i2, intent);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (getActivity() == null || !getActivity().isFinishing()) {
            return;
        }
        Iterator<Integer> it = this.mTobeReleaseRequestCode.iterator();
        while (it.hasNext()) {
            Launcher.getLauncher().removeActivityCallback(it.next().intValue());
        }
        this.mTobeReleaseRequestCode.clear();
    }
}
