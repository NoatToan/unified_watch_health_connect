package com.huawei.ui.main.stories.me.util;

import android.content.Context;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StepCounterSupport;

/* JADX INFO: loaded from: classes19.dex */
public class StepCounterSupportUtil {

    public interface StepCounterClassCallback {
        void getDeviceClass(int i);
    }

    public interface StepCounterSupportCallback {
        void onIsSupportStepCounter(boolean z);
    }

    public static boolean d(final Context context, final StepCounterSupportCallback stepCounterSupportCallback) {
        final String strE = SharedPreferenceManager.e(context, Integer.toString(10000), "step_counter_support_class_key");
        LogUtil.a("Main_StepCounterSupportUtil", "getIsSupportStepCounter sharedPreference = ", strE);
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.me.util.StepCounterSupportUtil.3
            @Override // java.lang.Runnable
            public void run() {
                int iB = StepCounterSupport.b(context);
                if (Integer.toString(iB).equals(strE)) {
                    return;
                }
                stepCounterSupportCallback.onIsSupportStepCounter(iB != 3);
                SharedPreferenceManager.e(context, Integer.toString(10000), "step_counter_support_class_key", Integer.toString(iB), null);
                LogUtil.a("Main_StepCounterSupportUtil", "getIsSupportStepCounter supportClass = ", Integer.valueOf(iB));
            }
        });
        return Integer.toString(1).equals(strE) || Integer.toString(2).equals(strE);
    }

    public static void a(final StepCounterClassCallback stepCounterClassCallback) {
        final String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "step_counter_support_class_key");
        LogUtil.a("Main_StepCounterSupportUtil", "getDeviceSupportClass sharedPreference = ", strE);
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.me.util.StepCounterSupportUtil.1
            @Override // java.lang.Runnable
            public void run() {
                int iB = StepCounterSupport.b(BaseApplication.getContext());
                if (Integer.toString(iB).equals(strE)) {
                    return;
                }
                stepCounterClassCallback.getDeviceClass(iB);
                SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "step_counter_support_class_key", Integer.toString(iB), null);
                LogUtil.a("Main_StepCounterSupportUtil", "getDeviceSupportClass supportClass = ", Integer.valueOf(iB));
            }
        });
    }

    public static int b(Context context) {
        return CommonUtil.j(SharedPreferenceManager.e(context, Integer.toString(10000), "step_counter_support_class_key"));
    }
}
