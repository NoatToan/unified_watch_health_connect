package com.google.firebase.perf.application;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.core.app.FrameMetricsAggregator;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.Utils;
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

/* JADX INFO: loaded from: classes3.dex */
public class AppStateMonitor implements Application.ActivityLifecycleCallbacks {
    private static final String FRAME_METRICS_AGGREGATOR_CLASSNAME = "androidx.core.app.FrameMetricsAggregator";
    private static volatile AppStateMonitor instance;
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final Clock clock;
    private FrameMetricsAggregator frameMetricsAggregator;
    private boolean hasFrameMetricsAggregator;
    private Timer resumeTime;
    private Timer stopTime;
    private final TransportManager transportManager;
    private final WeakHashMap<Activity, Boolean> activityToResumedMap = new WeakHashMap<>();
    private final WeakHashMap<Activity, Trace> activityToScreenTraceMap = new WeakHashMap<>();
    private final Map<String, Long> metricToCountMap = new HashMap();
    private final Set<WeakReference<AppStateCallback>> appStateSubscribers = new HashSet();
    private Set<AppColdStartCallback> appColdStartSubscribers = new HashSet();
    private final AtomicInteger tsnsCount = new AtomicInteger(0);
    private ApplicationProcessState currentAppState = ApplicationProcessState.BACKGROUND;
    private boolean isRegisteredForLifecycleCallbacks = false;
    private boolean isColdStart = true;
    private final ConfigResolver configResolver = ConfigResolver.getInstance();

    public interface AppColdStartCallback {
        void onAppColdStart();
    }

    public interface AppStateCallback {
        void onUpdateAppState(ApplicationProcessState applicationProcessState);
    }

    public AppStateMonitor(TransportManager transportManager, Clock clock) {
        this.hasFrameMetricsAggregator = false;
        this.transportManager = transportManager;
        this.clock = clock;
        boolean zHasFrameMetricsAggregatorClass = hasFrameMetricsAggregatorClass();
        this.hasFrameMetricsAggregator = zHasFrameMetricsAggregatorClass;
        if (zHasFrameMetricsAggregatorClass) {
            this.frameMetricsAggregator = new FrameMetricsAggregator();
        }
    }

    public static AppStateMonitor getInstance() {
        if (instance == null) {
            synchronized (AppStateMonitor.class) {
                if (instance == null) {
                    instance = new AppStateMonitor(TransportManager.getInstance(), new Clock());
                }
            }
        }
        return instance;
    }

    public static String getScreenTraceName(Activity activity) {
        return Constants.SCREEN_TRACE_PREFIX + activity.getClass().getSimpleName();
    }

    private boolean hasFrameMetricsAggregatorClass() {
        return true;
    }

    private boolean isScreenTraceSupported(Activity activity) {
        return this.hasFrameMetricsAggregator;
    }

    private void sendAppColdStartUpdate() {
        synchronized (this.appStateSubscribers) {
            for (AppColdStartCallback appColdStartCallback : this.appColdStartSubscribers) {
                if (appColdStartCallback != null) {
                    appColdStartCallback.onAppColdStart();
                }
            }
        }
    }

    private void sendScreenTrace(Activity activity) {
        Trace trace;
        int i;
        int i2;
        SparseIntArray sparseIntArray;
        if (this.activityToScreenTraceMap.containsKey(activity) && (trace = this.activityToScreenTraceMap.get(activity)) != null) {
            this.activityToScreenTraceMap.remove(activity);
            SparseIntArray[] sparseIntArrayArrReset = this.frameMetricsAggregator.reset();
            int i3 = 0;
            if (sparseIntArrayArrReset == null || (sparseIntArray = sparseIntArrayArrReset[0]) == null) {
                i = 0;
                i2 = 0;
            } else {
                int i4 = 0;
                i = 0;
                i2 = 0;
                while (i3 < sparseIntArray.size()) {
                    int iKeyAt = sparseIntArray.keyAt(i3);
                    int iValueAt = sparseIntArray.valueAt(i3);
                    i4 += iValueAt;
                    if (iKeyAt > 700) {
                        i2 += iValueAt;
                    }
                    if (iKeyAt > 16) {
                        i += iValueAt;
                    }
                    i3++;
                }
                i3 = i4;
            }
            if (i3 > 0) {
                trace.putMetric(Constants.CounterNames.FRAMES_TOTAL.toString(), i3);
            }
            if (i > 0) {
                trace.putMetric(Constants.CounterNames.FRAMES_SLOW.toString(), i);
            }
            if (i2 > 0) {
                trace.putMetric(Constants.CounterNames.FRAMES_FROZEN.toString(), i2);
            }
            if (Utils.isDebugLoggingEnabled(activity.getApplicationContext())) {
                logger.debug("sendScreenTrace name:" + getScreenTraceName(activity) + " _fr_tot:" + i3 + " _fr_slo:" + i + " _fr_fzn:" + i2);
            }
            trace.stop();
        }
    }

    private void sendSessionLog(String str, Timer timer, Timer timer2) {
        if (this.configResolver.isPerformanceMonitoringEnabled()) {
            TraceMetric.Builder builderAddPerfSessions = TraceMetric.newBuilder().setName(str).setClientStartTimeUs(timer.getMicros()).setDurationUs(timer.getDurationMicros(timer2)).addPerfSessions(SessionManager.getInstance().perfSession().build());
            int andSet = this.tsnsCount.getAndSet(0);
            synchronized (this.metricToCountMap) {
                builderAddPerfSessions.putAllCounters(this.metricToCountMap);
                if (andSet != 0) {
                    builderAddPerfSessions.putCounters(Constants.CounterNames.TRACE_STARTED_NOT_STOPPED.toString(), andSet);
                }
                this.metricToCountMap.clear();
            }
            this.transportManager.log(builderAddPerfSessions.build(), ApplicationProcessState.FOREGROUND_BACKGROUND);
        }
    }

    private void updateAppState(ApplicationProcessState applicationProcessState) {
        this.currentAppState = applicationProcessState;
        synchronized (this.appStateSubscribers) {
            Iterator<WeakReference<AppStateCallback>> it2 = this.appStateSubscribers.iterator();
            while (it2.hasNext()) {
                AppStateCallback appStateCallback = it2.next().get();
                if (appStateCallback != null) {
                    appStateCallback.onUpdateAppState(this.currentAppState);
                } else {
                    it2.remove();
                }
            }
        }
    }

    @VisibleForTesting
    public WeakHashMap<Activity, Trace> getActivity2ScreenTrace() {
        return this.activityToScreenTraceMap;
    }

    public ApplicationProcessState getAppState() {
        return this.currentAppState;
    }

    @VisibleForTesting
    public Timer getPauseTime() {
        return this.stopTime;
    }

    @VisibleForTesting
    public Timer getResumeTime() {
        return this.resumeTime;
    }

    @VisibleForTesting
    public WeakHashMap<Activity, Boolean> getResumed() {
        return this.activityToResumedMap;
    }

    public void incrementCount(@NonNull String str, long j) {
        synchronized (this.metricToCountMap) {
            Long l = this.metricToCountMap.get(str);
            if (l == null) {
                this.metricToCountMap.put(str, Long.valueOf(j));
            } else {
                this.metricToCountMap.put(str, Long.valueOf(l.longValue() + j));
            }
        }
    }

    public void incrementTsnsCount(int i) {
        this.tsnsCount.addAndGet(i);
    }

    public boolean isColdStart() {
        return this.isColdStart;
    }

    public boolean isForeground() {
        return this.currentAppState == ApplicationProcessState.FOREGROUND;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        if (this.activityToResumedMap.isEmpty()) {
            this.resumeTime = this.clock.getTime();
            this.activityToResumedMap.put(activity, Boolean.TRUE);
            updateAppState(ApplicationProcessState.FOREGROUND);
            if (this.isColdStart) {
                sendAppColdStartUpdate();
                this.isColdStart = false;
            } else {
                sendSessionLog(Constants.TraceNames.BACKGROUND_TRACE_NAME.toString(), this.stopTime, this.resumeTime);
            }
        } else {
            this.activityToResumedMap.put(activity, Boolean.TRUE);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (isScreenTraceSupported(activity) && this.configResolver.isPerformanceMonitoringEnabled()) {
            this.frameMetricsAggregator.add(activity);
            Trace trace = new Trace(getScreenTraceName(activity), this.transportManager, this.clock, this);
            trace.start();
            this.activityToScreenTraceMap.put(activity, trace);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
        if (isScreenTraceSupported(activity)) {
            sendScreenTrace(activity);
        }
        if (this.activityToResumedMap.containsKey(activity)) {
            this.activityToResumedMap.remove(activity);
            if (this.activityToResumedMap.isEmpty()) {
                this.stopTime = this.clock.getTime();
                updateAppState(ApplicationProcessState.BACKGROUND);
                sendSessionLog(Constants.TraceNames.FOREGROUND_TRACE_NAME.toString(), this.resumeTime, this.stopTime);
            }
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
        synchronized (this.appStateSubscribers) {
            this.appColdStartSubscribers.add(appColdStartCallback);
        }
    }

    public void registerForAppState(WeakReference<AppStateCallback> weakReference) {
        synchronized (this.appStateSubscribers) {
            this.appStateSubscribers.add(weakReference);
        }
    }

    @VisibleForTesting
    public void setIsColdStart(boolean z) {
        this.isColdStart = z;
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
}
