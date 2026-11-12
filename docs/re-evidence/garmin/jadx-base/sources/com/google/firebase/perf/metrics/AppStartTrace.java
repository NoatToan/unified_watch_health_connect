package com.google.firebase.perf.metrics;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Keep;
import androidx.lifecycle.a1;
import androidx.lifecycle.b0;
import androidx.lifecycle.e1;
import androidx.lifecycle.m0;
import cd0.f;
import com.google.firebase.FirebaseApp;
import com.google.firebase.StartupTime;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.util.FirstDrawDoneListener;
import com.google.firebase.perf.util.PreDrawListener;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.TraceMetric;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.BooleanUtils;
import tn.k;

/* JADX INFO: loaded from: classes2.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, m0 {
    private static final int CORE_POOL_SIZE = 0;
    private static final int MAX_POOL_SIZE = 1;
    private static ExecutorService executorService;
    private static volatile AppStartTrace instance;
    private Context appContext;
    private WeakReference<Activity> appStartActivity;
    private final Clock clock;
    private final ConfigResolver configResolver;
    private final TraceMetric.Builder experimentTtid;
    private final Timer firebaseClassLoadTime;
    private WeakReference<Activity> launchActivity;
    private final Timer processStartTime;
    private PerfSession startSession;
    private final TransportManager transportManager;
    private static final Timer PERF_CLASS_LOAD_TIME = new Clock().getTime();
    private static final long MAX_LATENCY_BEFORE_UI_INIT = 60000000;
    private static final long MAX_BACKGROUND_RUNNABLE_DELAY = 50000;
    private boolean isRegisteredForLifecycleCallbacks = false;
    private boolean isTooLateToInitUI = false;
    private Timer onCreateTime = null;
    private Timer mainThreadRunnableTime = null;
    private Timer onStartTime = null;
    private Timer onResumeTime = null;
    private Timer firstForegroundTime = null;
    private Timer firstBackgroundTime = null;
    private Timer preDrawPostTime = null;
    private Timer preDrawPostAtFrontOfQueueTime = null;
    private Timer onDrawPostAtFrontOfQueueTime = null;
    private boolean isStartedFromBackground = false;
    private int onDrawCount = 0;
    private final DrawCounter onDrawCounterListener = new DrawCounter();
    private boolean systemForegroundCheck = false;

    public final class DrawCounter implements ViewTreeObserver.OnDrawListener {
        private DrawCounter() {
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            AppStartTrace.access$308(AppStartTrace.this);
        }
    }

    public static class StartFromBackgroundRunnable implements Runnable {
        private final AppStartTrace trace;

        public StartFromBackgroundRunnable(AppStartTrace appStartTrace) {
            this.trace = appStartTrace;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.trace.onCreateTime == null) {
                this.trace.mainThreadRunnableTime = new Timer();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppStartTrace(TransportManager transportManager, Clock clock, ConfigResolver configResolver, ExecutorService executorService2) {
        this.transportManager = transportManager;
        this.clock = clock;
        this.configResolver = configResolver;
        executorService = executorService2;
        this.experimentTtid = TraceMetric.newBuilder().setName("_experiment_app_start_ttid");
        this.processStartTime = Timer.ofElapsedRealtime(Process.getStartElapsedRealtime());
        StartupTime startupTime = (StartupTime) FirebaseApp.getInstance().get(StartupTime.class);
        this.firebaseClassLoadTime = startupTime != null ? Timer.ofElapsedRealtime(startupTime.getElapsedRealtime()) : null;
    }

    public static /* synthetic */ int access$308(AppStartTrace appStartTrace) {
        int i14 = appStartTrace.onDrawCount;
        appStartTrace.onDrawCount = i14 + 1;
        return i14;
    }

    private Timer getClassLoadTimeCompat() {
        Timer timer = this.firebaseClassLoadTime;
        return timer != null ? timer : PERF_CLASS_LOAD_TIME;
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static AppStartTrace getInstance(TransportManager transportManager, Clock clock) {
        if (instance == null) {
            synchronized (AppStartTrace.class) {
                try {
                    if (instance == null) {
                        instance = new AppStartTrace(transportManager, clock, ConfigResolver.getInstance(), new ThreadPoolExecutor(0, 1, 10 + MAX_LATENCY_BEFORE_UI_INIT, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return instance;
    }

    private Timer getStartTimerCompat() {
        Timer timer = this.processStartTime;
        return timer != null ? timer : getClassLoadTimeCompat();
    }

    public static boolean isAnyAppProcessInForeground(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = context.getPackageName();
        String strG = k.g(packageName, ":");
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(strG))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$logExperimentTrace$0(TraceMetric.Builder builder) {
        this.transportManager.log(builder.build(), ApplicationProcessState.FOREGROUND_BACKGROUND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logAppStartTrace() {
        TraceMetric.Builder durationUs = TraceMetric.newBuilder().setName(Constants.TraceNames.APP_START_TRACE_NAME.toString()).setClientStartTimeUs(getClassLoadTimeCompat().getMicros()).setDurationUs(getClassLoadTimeCompat().getDurationMicros(this.onResumeTime));
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(TraceMetric.newBuilder().setName(Constants.TraceNames.ON_CREATE_TRACE_NAME.toString()).setClientStartTimeUs(getClassLoadTimeCompat().getMicros()).setDurationUs(getClassLoadTimeCompat().getDurationMicros(this.onCreateTime)).build());
        if (this.onStartTime != null) {
            TraceMetric.Builder builderNewBuilder = TraceMetric.newBuilder();
            builderNewBuilder.setName(Constants.TraceNames.ON_START_TRACE_NAME.toString()).setClientStartTimeUs(this.onCreateTime.getMicros()).setDurationUs(this.onCreateTime.getDurationMicros(this.onStartTime));
            arrayList.add(builderNewBuilder.build());
            TraceMetric.Builder builderNewBuilder2 = TraceMetric.newBuilder();
            builderNewBuilder2.setName(Constants.TraceNames.ON_RESUME_TRACE_NAME.toString()).setClientStartTimeUs(this.onStartTime.getMicros()).setDurationUs(this.onStartTime.getDurationMicros(this.onResumeTime));
            arrayList.add(builderNewBuilder2.build());
        }
        durationUs.addAllSubtraces(arrayList).addPerfSessions(this.startSession.build());
        this.transportManager.log((TraceMetric) durationUs.build(), ApplicationProcessState.FOREGROUND_BACKGROUND);
    }

    private void logExperimentTrace(TraceMetric.Builder builder) {
        if (this.preDrawPostTime == null || this.preDrawPostAtFrontOfQueueTime == null || this.onDrawPostAtFrontOfQueueTime == null) {
            return;
        }
        executorService.execute(new f(20, this, builder));
        unregisterActivityLifecycleCallbacks();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recordOnDrawFrontOfQueue() {
        if (this.onDrawPostAtFrontOfQueueTime != null) {
            return;
        }
        this.onDrawPostAtFrontOfQueueTime = this.clock.getTime();
        this.experimentTtid.addSubtraces(TraceMetric.newBuilder().setName("_experiment_onDrawFoQ").setClientStartTimeUs(getStartTimerCompat().getMicros()).setDurationUs(getStartTimerCompat().getDurationMicros(this.onDrawPostAtFrontOfQueueTime)).build());
        if (this.processStartTime != null) {
            this.experimentTtid.addSubtraces(TraceMetric.newBuilder().setName("_experiment_procStart_to_classLoad").setClientStartTimeUs(getStartTimerCompat().getMicros()).setDurationUs(getStartTimerCompat().getDurationMicros(getClassLoadTimeCompat())).build());
        }
        this.experimentTtid.putCustomAttributes("systemDeterminedForeground", this.systemForegroundCheck ? BooleanUtils.TRUE : BooleanUtils.FALSE);
        this.experimentTtid.putCounters("onDrawCount", this.onDrawCount);
        this.experimentTtid.addPerfSessions(this.startSession.build());
        logExperimentTrace(this.experimentTtid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recordPreDraw() {
        if (this.preDrawPostTime != null) {
            return;
        }
        this.preDrawPostTime = this.clock.getTime();
        this.experimentTtid.setClientStartTimeUs(getStartTimerCompat().getMicros()).setDurationUs(getStartTimerCompat().getDurationMicros(this.preDrawPostTime));
        logExperimentTrace(this.experimentTtid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recordPreDrawFrontOfQueue() {
        if (this.preDrawPostAtFrontOfQueueTime != null) {
            return;
        }
        this.preDrawPostAtFrontOfQueueTime = this.clock.getTime();
        this.experimentTtid.addSubtraces(TraceMetric.newBuilder().setName("_experiment_preDrawFoQ").setClientStartTimeUs(getStartTimerCompat().getMicros()).setDurationUs(getStartTimerCompat().getDurationMicros(this.preDrawPostAtFrontOfQueueTime)).build());
        logExperimentTrace(this.experimentTtid);
    }

    private void resolveIsStartedFromBackground() {
        Timer timer = this.mainThreadRunnableTime;
        if (timer == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || timer.getDurationMicros() > MAX_BACKGROUND_RUNNABLE_DELAY) {
            this.isStartedFromBackground = true;
        }
        this.mainThreadRunnableTime = null;
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    public Activity getAppStartActivity() {
        return this.appStartActivity.get();
    }

    public Activity getLaunchActivity() {
        return this.launchActivity.get();
    }

    public Timer getOnCreateTime() {
        return this.onCreateTime;
    }

    public Timer getOnResumeTime() {
        return this.onResumeTime;
    }

    public Timer getOnStartTime() {
        return this.onStartTime;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            resolveIsStartedFromBackground();
            if (!this.isStartedFromBackground && this.onCreateTime == null) {
                this.systemForegroundCheck = this.systemForegroundCheck || isAnyAppProcessInForeground(this.appContext);
                this.launchActivity = new WeakReference<>(activity);
                this.onCreateTime = this.clock.getTime();
                if (getStartTimerCompat().getDurationMicros(this.onCreateTime) > MAX_LATENCY_BEFORE_UI_INIT) {
                    this.isTooLateToInitUI = true;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        View viewFindViewById;
        if (this.isStartedFromBackground || this.isTooLateToInitUI || !this.configResolver.getIsExperimentTTIDEnabled() || (viewFindViewById = activity.findViewById(R.id.content)) == null) {
            return;
        }
        viewFindViewById.getViewTreeObserver().removeOnDrawListener(this.onDrawCounterListener);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        View viewFindViewById;
        try {
            if (!this.isStartedFromBackground && !this.isTooLateToInitUI) {
                boolean isExperimentTTIDEnabled = this.configResolver.getIsExperimentTTIDEnabled();
                if (isExperimentTTIDEnabled && (viewFindViewById = activity.findViewById(R.id.content)) != null) {
                    viewFindViewById.getViewTreeObserver().addOnDrawListener(this.onDrawCounterListener);
                    final int i14 = 0;
                    FirstDrawDoneListener.registerForNextDraw(viewFindViewById, new Runnable(this) { // from class: com.google.firebase.perf.metrics.a

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ AppStartTrace f53792b;

                        {
                            this.f53792b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i14) {
                                case 0:
                                    this.f53792b.recordOnDrawFrontOfQueue();
                                    break;
                                case 1:
                                    this.f53792b.recordPreDraw();
                                    break;
                                case 2:
                                    this.f53792b.recordPreDrawFrontOfQueue();
                                    break;
                                default:
                                    this.f53792b.logAppStartTrace();
                                    break;
                            }
                        }
                    });
                    final int i15 = 1;
                    final int i16 = 2;
                    PreDrawListener.registerForNextDraw(viewFindViewById, new Runnable(this) { // from class: com.google.firebase.perf.metrics.a

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ AppStartTrace f53792b;

                        {
                            this.f53792b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    this.f53792b.recordOnDrawFrontOfQueue();
                                    break;
                                case 1:
                                    this.f53792b.recordPreDraw();
                                    break;
                                case 2:
                                    this.f53792b.recordPreDrawFrontOfQueue();
                                    break;
                                default:
                                    this.f53792b.logAppStartTrace();
                                    break;
                            }
                        }
                    }, new Runnable(this) { // from class: com.google.firebase.perf.metrics.a

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ AppStartTrace f53792b;

                        {
                            this.f53792b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i16) {
                                case 0:
                                    this.f53792b.recordOnDrawFrontOfQueue();
                                    break;
                                case 1:
                                    this.f53792b.recordPreDraw();
                                    break;
                                case 2:
                                    this.f53792b.recordPreDrawFrontOfQueue();
                                    break;
                                default:
                                    this.f53792b.logAppStartTrace();
                                    break;
                            }
                        }
                    });
                }
                if (this.onResumeTime != null) {
                    return;
                }
                this.appStartActivity = new WeakReference<>(activity);
                this.onResumeTime = this.clock.getTime();
                this.startSession = SessionManager.getInstance().perfSession();
                AndroidLogger.getInstance().debug("onResume(): " + activity.getClass().getName() + ": " + getClassLoadTimeCompat().getDurationMicros(this.onResumeTime) + " microseconds");
                final int i17 = 3;
                executorService.execute(new Runnable(this) { // from class: com.google.firebase.perf.metrics.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AppStartTrace f53792b;

                    {
                        this.f53792b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i17) {
                            case 0:
                                this.f53792b.recordOnDrawFrontOfQueue();
                                break;
                            case 1:
                                this.f53792b.recordPreDraw();
                                break;
                            case 2:
                                this.f53792b.recordPreDrawFrontOfQueue();
                                break;
                            default:
                                this.f53792b.logAppStartTrace();
                                break;
                        }
                    }
                });
                if (!isExperimentTTIDEnabled) {
                    unregisterActivityLifecycleCallbacks();
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (!this.isStartedFromBackground && this.onStartTime == null && !this.isTooLateToInitUI) {
            this.onStartTime = this.clock.getTime();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Keep
    @a1(b0.a.ON_STOP)
    public void onAppEnteredBackground() {
        if (this.isStartedFromBackground || this.isTooLateToInitUI || this.firstBackgroundTime != null) {
            return;
        }
        this.firstBackgroundTime = this.clock.getTime();
        this.experimentTtid.addSubtraces(TraceMetric.newBuilder().setName("_experiment_firstBackgrounding").setClientStartTimeUs(getStartTimerCompat().getMicros()).setDurationUs(getStartTimerCompat().getDurationMicros(this.firstBackgroundTime)).build());
    }

    @Keep
    @a1(b0.a.ON_START)
    public void onAppEnteredForeground() {
        if (this.isStartedFromBackground || this.isTooLateToInitUI || this.firstForegroundTime != null) {
            return;
        }
        this.firstForegroundTime = this.clock.getTime();
        this.experimentTtid.addSubtraces(TraceMetric.newBuilder().setName("_experiment_firstForegrounding").setClientStartTimeUs(getStartTimerCompat().getMicros()).setDurationUs(getStartTimerCompat().getDurationMicros(this.firstForegroundTime)).build());
    }

    public synchronized void registerActivityLifecycleCallbacks(Context context) {
        try {
            if (this.isRegisteredForLifecycleCallbacks) {
                return;
            }
            e1.f7874i.getClass();
            e1.f7875j.f7881f.a(this);
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
                this.systemForegroundCheck = this.systemForegroundCheck || isAnyAppProcessInForeground(applicationContext);
                this.isRegisteredForLifecycleCallbacks = true;
                this.appContext = applicationContext;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public void setMainThreadRunnableTime(Timer timer) {
        this.mainThreadRunnableTime = timer;
    }

    public synchronized void unregisterActivityLifecycleCallbacks() {
        if (this.isRegisteredForLifecycleCallbacks) {
            e1.f7874i.getClass();
            e1.f7875j.f7881f.d(this);
            ((Application) this.appContext).unregisterActivityLifecycleCallbacks(this);
            this.isRegisteredForLifecycleCallbacks = false;
        }
    }

    public static AppStartTrace getInstance() {
        return instance != null ? instance : getInstance(TransportManager.getInstance(), new Clock());
    }
}
