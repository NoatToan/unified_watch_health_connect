package com.huawei.hmf.services.ui.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.huawei.hmf.repository.ComponentRepository;
import com.huawei.hmf.services.Module;
import com.huawei.hmf.services.interception.ActionInvocation;
import com.huawei.hmf.services.interception.Signature;

/* JADX INFO: loaded from: classes33.dex */
public class ActivityLifecycleInterceptor {
    private static ActivityLifecycleCallbacks mActivityLifecycleCallbacks;

    public static void register(Context context) {
        synchronized (ActivityLifecycleInterceptor.class) {
            if (mActivityLifecycleCallbacks == null) {
                mActivityLifecycleCallbacks = new ActivityLifecycleCallbacks();
                ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(mActivityLifecycleCallbacks);
            }
        }
    }

    static class ActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        private ActivityLifecycleCallbacks() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            CallingInfo callingInfo;
            String str;
            if (bundle != null || (callingInfo = new ActivityData(activity.getIntent()).getCallingInfo()) == null) {
                return;
            }
            if (activity.getCallingActivity() == null) {
                str = "startActivity";
            } else {
                str = "sendActivityResult";
            }
            Module moduleLookup = ComponentRepository.getRepository().lookup(callingInfo.getModule());
            if (moduleLookup == null || moduleLookup.getInterceptor() == null) {
                return;
            }
            Signature signature = new Signature(activity.getClass());
            signature.setName(str);
            moduleLookup.getInterceptor().after(ActionInvocation.builder().moduleName(callingInfo.getModule()).callingPackageName(callingInfo.getPackageName()).signature(signature).build());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity.isFinishing()) {
                new ActivityData(activity.getIntent()).free();
            }
        }
    }
}
