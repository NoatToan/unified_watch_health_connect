package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.Topic;
import com.huawei.framework.servicemgr.Consumer;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class sxx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f48789b = new Handler(Looper.getMainLooper()) { // from class: sxx.5
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message != null) {
                super.handleMessage(message);
                if (message.what == 1080983 && message.arg1 < 5) {
                    sxx.this.c(message.arg1);
                }
            }
        }
    };
    private BroadcastReceiver e = new BroadcastReceiver() { // from class: sxx.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action;
            if (intent == null || (action = intent.getAction()) == null) {
                return;
            }
            if ("com.huawei.plugin.account.login".equals(action)) {
                int iD = sxx.d();
                LogUtil.a("Track_InitRunCourseUtils", "ACTION_LOGIN_SUCCESSFUL getRunCourseState:", Integer.valueOf(iD));
                if (iD == -2 || iD == -1) {
                    return;
                }
                if (iD >= 0 && iD <= 5) {
                    sxx.this.d(iD + 1);
                    sxx.this.c(0, 0L);
                }
                if (iD > 5) {
                    sxx.this.d(-2);
                    LogUtil.a("Track_InitRunCourseUtils", "Over max try times");
                    return;
                }
                return;
            }
            if ("com.huawei.plugin.account.logout".equals(action)) {
                LogUtil.a("Track_InitRunCourseUtils", "ACTION_LOGOUT_SUCCESSFUL");
                sxx.this.d(0);
            } else {
                LogUtil.a("Track_InitRunCourseUtils", "Unexpected action");
            }
        }
    };

    public void c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.plugin.account.login");
        intentFilter.addAction("com.huawei.plugin.account.logout");
        LocalBroadcastManager.getInstance().registerReceiver(this.e, intentFilter);
    }

    public void e() {
        LocalBroadcastManager.getInstance().unregisterReceiver(this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final int i) {
        if (((PluginSuggestion) Services.d("PluginFitnessAdvice", PluginSuggestion.class)) == null) {
            Services.c("PluginFitnessAdvice", PluginSuggestion.class, BaseApplication.b(), new Consumer<PluginSuggestion>() { // from class: sxx.4
                @Override // com.huawei.framework.servicemgr.Consumer
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void accept(PluginSuggestion pluginSuggestion) {
                    if (pluginSuggestion != null) {
                        pluginSuggestion.init(com.huawei.hwcommonmodel.application.BaseApplication.getContext());
                        sxx.this.c(i);
                    }
                }
            }, true);
        } else {
            e(i);
        }
    }

    private void e(final int i) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: sxx.3
            @Override // java.lang.Runnable
            public void run() {
                CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
                if (courseApi == null) {
                    LogUtil.j("Track_InitRunCourseUtils", "tryToGetList : courseApi is null.");
                } else {
                    courseApi.getCourseTopicList(0, new UiCallback<List<Topic>>() { // from class: sxx.3.4
                        @Override // com.huawei.basefitnessadvice.callback.UiCallback
                        public void onFailure(int i2, String str) {
                            LogUtil.a("Track_InitRunCourseUtils", "getCourseTopicList() onfalure ", "errorCode:", Integer.valueOf(i2), "errorinfo", str);
                            sxx.this.c(i, 200L);
                        }

                        @Override // com.huawei.basefitnessadvice.callback.UiCallback
                        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                        public void onSuccess(List<Topic> list) {
                            if (njy.e(list)) {
                                LogUtil.j("Track_InitRunCourseUtils", "initRunCourseTopic data null");
                                sxx.this.c(i, 200L);
                                return;
                            }
                            for (Topic topic : list) {
                                if (topic == null) {
                                    LogUtil.e("Track_InitRunCourseUtils", "onSuccess: topic is null");
                                } else if ("SF006".equals(topic.acquireSerialNum())) {
                                    if (njy.b(topic.acquireWorkoutList())) {
                                        LogUtil.j("Track_InitRunCourseUtils", "initRunCourseTopic exist runcourse");
                                        sxx.this.d(-1);
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, long j) {
        Handler handler = this.f48789b;
        if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage(1080983);
            messageObtainMessage.arg1 = i + 1;
            this.f48789b.sendMessageDelayed(messageObtainMessage, j);
        }
    }

    public static int d() {
        String strE = SharedPreferenceManager.e(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), Integer.toString(20002), "RUN_COURSE_REQUEST_KEY");
        if (TextUtils.isEmpty(strE)) {
            return 0;
        }
        try {
            return Integer.parseInt(strE);
        } catch (NumberFormatException e) {
            LogUtil.j("Track_InitRunCourseUtils", "getRunCourseState", e.getMessage());
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        SharedPreferenceManager.e(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), Integer.toString(20002), "RUN_COURSE_REQUEST_KEY", Integer.toString(i), null);
    }
}
