package com.xiaomi.hm.health.activity;

import androidx.fragment.app.FragmentManager;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes19.dex */
public class NavigationController {
    private final int a = R.id.fragment_container;
    private final FragmentManager b;

    public NavigationController(StartUpActivity activity) {
        this.b = activity.getSupportFragmentManager();
    }

    public void navigateToAd(boolean showAd) {
        this.b.beginTransaction().replace(this.a, LaunchAdFragment.newInstance(showAd)).commitAllowingStateLoss();
    }
}
