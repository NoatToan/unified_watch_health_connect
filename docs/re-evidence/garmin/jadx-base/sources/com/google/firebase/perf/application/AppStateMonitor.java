package com.google.firebase.perf.application;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.m;
import androidx.fragment.app.t;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.FrameMetricsCalculator;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.util.Optional;
import com.google.firebase.perf.util.ScreenTraceUtil;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.TraceMetric;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class AppStateMonitor implements Application.ActivityLifecycleCallbacks {
    private static volatile AppStateMonitor instance;
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final WeakHashMap<Activity, FragmentStateMonitor> activityToFragmentStateMonitorMap;
    private final WeakHashMap<Activity, FrameMetricsRecorder> activityToRecorderMap;
    private final WeakHashMap<Activity, Boolean> activityToResumedMap;
    private final WeakHashMap<Activity, Trace> activityToScreenTraceMap;
    private Set<AppColdStartCallback> appColdStartSubscribers;
    private final Set<WeakReference<AppStateCallback>> appStateSubscribers;
    private final Clock clock;
    private final ConfigResolver configResolver;
    private ApplicationProcessState currentAppState;
    private boolean isColdStart;
    private boolean isRegisteredForLifecycleCallbacks;
    private final Map<String, Long> metricToCountMap;
    private Timer resumeTime;
    private final boolean screenPerformanceRecordingSupported;
    private Timer stopTime;
    private final TransportManager transportManager;
    private final AtomicInteger tsnsCount;

    public interface AppColdStartCallback {
        void onAppColdStart();
    }

    public interface AppStateCallback {
        void onUpdateAppState(ApplicationProcessState applicationProcessState);
    }

    public AppStateMonitor(TransportManager transportManager, Clock clock, ConfigResolver configResolver, boolean z14) {
        this.activityToResumedMap = new WeakHashMap<>();
        this.activityToRecorderMap = new WeakHashMap<>();
        this.activityToFragmentStateMonitorMap = new WeakHashMap<>();
        this.activityToScreenTraceMap = new WeakHashMap<>();
        this.metricToCountMap = new HashMap();
        this.appStateSubscribers = new HashSet();
        this.appColdStartSubscribers = new HashSet();
        this.tsnsCount = new AtomicInteger(0);
        this.currentAppState = ApplicationProcessState.BACKGROUND;
        this.isRegisteredForLifecycleCallbacks = false;
        this.isColdStart = true;
        this.transportManager = transportManager;
        this.clock = clock;
        this.configResolver = configResolver;
        this.screenPerformanceRecordingSupported = z14;
    }

    public static AppStateMonitor getInstance() {
        if (instance == null) {
            synchronized (AppStateMonitor.class) {
                try {
                    if (instance == null) {
                        instance = new AppStateMonitor(TransportManager.getInstance(), new Clock());
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return instance;
    }

    public static String getScreenTraceName(Activity activity) {
        return Constants.SCREEN_TRACE_PREFIX.concat(activity.getClass().getSimpleName());
    }

    private static boolean isScreenPerformanceRecordingSupported() {
        return FrameMetricsRecorder.isFrameMetricsRecordingSupported();
    }

    private void sendAppColdStartUpdate() {
        synchronized (this.appColdStartSubscribers) {
            try {
                for (AppColdStartCallback appColdStartCallback : this.appColdStartSubscribers) {
                    if (appColdStartCallback != null) {
                        appColdStartCallback.onAppColdStart();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private void sendScreenTrace(Activity activity) {
        Trace trace = this.activityToScreenTraceMap.get(activity);
        if (trace == null) {
            return;
        }
        this.activityToScreenTraceMap.remove(activity);
        Optional<FrameMetricsCalculator.PerfFrameMetrics> optionalStop = this.activityToRecorderMap.get(activity).stop();
        if (!optionalStop.isAvailable()) {
            logger.warn("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        } else {
            ScreenTraceUtil.addFrameCounters(trace, optionalStop.get());
            trace.stop();
        }
    }

    private void sendSessionLog(String str, Timer timer, Timer timer2) {
        if (this.configResolver.isPerformanceMonitoringEnabled()) {
            TraceMetric.Builder builderAddPerfSessions = TraceMetric.newBuilder().setName(str).setClientStartTimeUs(timer.getMicros()).setDurationUs(timer.getDurationMicros(timer2)).addPerfSessions(SessionManager.getInstance().perfSession().build());
            int andSet = this.tsnsCount.getAndSet(0);
            synchronized (this.metricToCountMap) {
                try {
                    builderAddPerfSessions.putAllCounters(this.metricToCountMap);
                    if (andSet != 0) {
                        builderAddPerfSessions.putCounters(Constants.CounterNames.TRACE_STARTED_NOT_STOPPED.toString(), andSet);
                    }
                    this.metricToCountMap.clear();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            this.transportManager.log(builderAddPerfSessions.build(), ApplicationProcessState.FOREGROUND_BACKGROUND);
        }
    }

    private void startFrameMonitoring(Activity activity) {
        if (isScreenTraceSupported() && this.configResolver.isPerformanceMonitoringEnabled()) {
            FrameMetricsRecorder frameMetricsRecorder = new FrameMetricsRecorder(activity);
            this.activityToRecorderMap.put(activity, frameMetricsRecorder);
            if (activity instanceof m) {
                FragmentStateMonitor fragmentStateMonitor = new FragmentStateMonitor(this.clock, this.transportManager, this, frameMetricsRecorder);
                this.activityToFragmentStateMonitorMap.put(activity, fragmentStateMonitor);
                t tVar = ((m) activity).getSupportFragmentManager().f7385p;
                tVar.getClass();
                tVar.f7365b.add(new t.a(fragmentStateMonitor, true));
            }
        }
    }

    private void updateAppState(ApplicationProcessState applicationProcessState) {
        this.currentAppState = applicationProcessState;
        synchronized (this.appStateSubscribers) {
            try {
                Iterator<WeakReference<AppStateCallback>> it = this.appStateSubscribers.iterator();
                while (it.hasNext()) {
                    AppStateCallback appStateCallback = it.next().get();
                    if (appStateCallback != null) {
                        appStateCallback.onUpdateAppState(this.currentAppState);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public WeakHashMap<Activity, Trace> getActivity2ScreenTrace() {
        return this.activityToScreenTraceMap;
    }

    public ApplicationProcessState getAppState() {
        return this.currentAppState;
    }

    public Timer getPauseTime() {
        return this.stopTime;
    }

    public Timer getResumeTime() {
        return this.resumeTime;
    }

    public WeakHashMap<Activity, Boolean> getResumed() {
        return this.activityToResumedMap;
    }

    public void incrementCount(String str, long j8) {
        synchronized (this.metricToCountMap) {
            try {
                Long l14 = this.metricToCountMap.get(str);
                Map<String, Long> map = this.metricToCountMap;
                if (l14 == null) {
                    map.put(str, Long.valueOf(j8));
                } else {
                    map.put(str, Long.valueOf(l14.longValue() + j8));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void incrementTsnsCount(int i14) {
        this.tsnsCount.addAndGet(i14);
    }

    public boolean isColdStart() {
        return this.isColdStart;
    }

    public boolean isForeground() {
        return this.currentAppState == ApplicationProcessState.FOREGROUND;
    }

    public boolean isScreenTraceSupported() {
        return this.screenPerformanceRecordingSupported;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        startFrameMonitoring(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.activityToRecorderMap.remove(activity);
        if (this.activityToFragmentStateMonitorMap.containsKey(activity)) {
            ((m) activity).getSupportFragmentManager().s0(this.activityToFragmentStateMonitorMap.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.activityToResumedMap.isEmpty()) {
                this.resumeTime = this.clock.getTime();
                this.activityToResumedMap.put(activity, Boolean.TRUE);
                if (this.isColdStart) {
                    updateAppState(ApplicationProcessState.FOREGROUND);
                    sendAppColdStartUpdate();
                    this.isColdStart = false;
                } else {
                    sendSessionLog(Constants.TraceNames.BACKGROUND_TRACE_NAME.toString(), this.stopTime, this.resumeTime);
                    updateAppState(ApplicationProcessState.FOREGROUND);
                }
            } else {
                this.activityToResumedMap.put(activity, Boolean.TRUE);
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
        try {
            if (isScreenTraceSupported() && this.configResolver.isPerformanceMonitoringEnabled()) {
                if (!this.activityToRecorderMap.containsKey(activity)) {
                    startFrameMonitoring(activity);
                }
                this.activityToRecorderMap.get(activity).start();
                Trace trace = new Trace(getScreenTraceName(activity), this.transportManager, this.clock, this);
                trace.start();
                this.activityToScreenTraceMap.put(activity, trace);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
        try {
            if (isScreenTraceSupported()) {
                sendScreenTrace(activity);
            }
            if (this.activityToResumedMap.containsKey(activity)) {
                this.activityToResumedMap.remove(activity);
                if (this.activityToResumedMap.isEmpty()) {
                    this.stopTime = this.clock.getTime();
                    sendSessionLog(Constants.TraceNames.FOREGROUND_TRACE_NAME.toString(), this.resumeTime, this.stopTime);
                    updateAppState(ApplicationProcessState.BACKGROUND);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public synchronized void registerActivityLifecycleCallbacks(Context context) {
        if (this.isRegisteredForLifecycleCallbacks) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            this.isRegisteredForLifecycleCallbacks = true;
        }
    }

    public void registerForAppColdStart(AppColdStartCallback appColdStartCallback) {
        synchronized (this.appColdStartSubscribers) {
            this.appColdStartSubscribers.add(appColdStartCallback);
        }
    }

    public void registerForAppState(WeakReference<AppStateCallback> weakReference) {
        synchronized (this.appStateSubscribers) {
            this.appStateSubscribers.add(weakReference);
        }
    }

    public void setIsColdStart(boolean z14) {
        this.isColdStart = z14;
    }

    public void setStopTime(Timer timer) {
        this.stopTime = timer;
    }

    public synchronized void unregisterActivityLifecycleCallbacks(Context context) {
        if (this.isRegisteredForLifecycleCallbacks) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
                this.isRegisteredForLifecycleCallbacks = false;
            }
        }
    }

    public void unregisterForAppState(WeakReference<AppStateCallback> weakReference) {
        synchronized (this.appStateSubscribers) {
            this.appStateSubscribers.remove(weakReference);
        }
    }

    public AppStateMonitor(TransportManager transportManager, Clock clock) {
        this(transportManager, clock, ConfigResolver.getInstance(), isScreenPerformanceRecordingSupported());
    }
}
