package com.twitter.sdk.android.core.internal;

import android.app.Activity;
import com.google.android.material.datepicker.UtcDates;
import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.SessionManager;
import java.util.Calendar;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes18.dex */
public class SessionMonitor<T extends Session> {
    private final SystemCurrentTimeProvider a;
    private final SessionManager<T> b;
    private final ExecutorService c;
    private final SessionVerifier d;
    public final MonitorState monitorState;

    public static class MonitorState {
        private static final long b = 21600000;
        private final Calendar a = Calendar.getInstance(TimeZone.getTimeZone(UtcDates.UTC));
        public long lastVerification;
        public boolean verifying;

        private boolean a(long j, long j2) {
            this.a.setTimeInMillis(j);
            int i = this.a.get(6);
            int i2 = this.a.get(1);
            this.a.setTimeInMillis(j2);
            return i == this.a.get(6) && i2 == this.a.get(1);
        }

        public synchronized boolean beginVerification(long j) {
            long j2 = this.lastVerification;
            boolean z = j - j2 > 21600000;
            boolean z2 = !a(j, j2);
            if (this.verifying || !(z || z2)) {
                return false;
            }
            this.verifying = true;
            return true;
        }

        public synchronized void endVerification(long j) {
            this.verifying = false;
            this.lastVerification = j;
        }
    }

    public class a extends ActivityLifecycleManager.Callbacks {
        public a() {
        }

        @Override // com.twitter.sdk.android.core.internal.ActivityLifecycleManager.Callbacks
        public void onActivityStarted(Activity activity) {
            SessionMonitor.this.triggerVerificationIfNecessary();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SessionMonitor.this.verifyAll();
        }
    }

    public SessionMonitor(SessionManager<T> sessionManager, ExecutorService executorService, SessionVerifier<T> sessionVerifier) {
        this(sessionManager, new SystemCurrentTimeProvider(), executorService, new MonitorState(), sessionVerifier);
    }

    public void monitorActivityLifecycle(ActivityLifecycleManager activityLifecycleManager) {
        activityLifecycleManager.registerCallbacks(new a());
    }

    public void triggerVerificationIfNecessary() {
        if (this.b.getActiveSession() != null && this.monitorState.beginVerification(this.a.getCurrentTimeMillis())) {
            this.c.submit(new b());
        }
    }

    public void verifyAll() {
        Iterator<T> it2 = this.b.getSessionMap().values().iterator();
        while (it2.hasNext()) {
            this.d.verifySession(it2.next());
        }
        this.monitorState.endVerification(this.a.getCurrentTimeMillis());
    }

    public SessionMonitor(SessionManager<T> sessionManager, SystemCurrentTimeProvider systemCurrentTimeProvider, ExecutorService executorService, MonitorState monitorState, SessionVerifier sessionVerifier) {
        this.a = systemCurrentTimeProvider;
        this.b = sessionManager;
        this.c = executorService;
        this.monitorState = monitorState;
        this.d = sessionVerifier;
    }
}
