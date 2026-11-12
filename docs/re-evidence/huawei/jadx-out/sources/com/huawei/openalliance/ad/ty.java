package com.huawei.openalliance.ad;

import android.view.View;
import android.view.ViewParent;
import com.huawei.openalliance.ad.views.PPSInterstitialView;
import com.huawei.openalliance.ad.views.PPSRewardView;
import com.huawei.openalliance.ad.views.PPSSplashView;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ty {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Set<Class<?>> f20293a;

    protected static boolean a(ViewParent viewParent) {
        for (Class<?> cls : f20293a) {
            if (cls != null && cls.isInstance(viewParent)) {
                hw.a("BaseTrackerUtil", "parent instanceof %s", cls.getSimpleName());
                return true;
            }
        }
        return false;
    }

    protected static boolean a(View view) {
        if (view == null) {
            return false;
        }
        ViewParent parent = view.getParent();
        for (int i = 0; i < 5 && parent != null; i++) {
            if (a(parent)) {
                return true;
            }
            parent = parent.getParent();
        }
        return false;
    }

    static {
        HashSet hashSet = new HashSet();
        f20293a = hashSet;
        hashSet.add(PPSInterstitialView.class);
        f20293a.add(PPSRewardView.class);
        f20293a.add(com.huawei.openalliance.ad.views.aj.class);
        f20293a.add(PPSSplashView.class);
    }
}
