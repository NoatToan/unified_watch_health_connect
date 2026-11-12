package io.sentry.android.core;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import defpackage.c8c;
import defpackage.ftc;
import defpackage.ucd;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes2.dex */
public final class TempSensorBreadcrumbsIntegration implements ucd, Closeable, SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f21417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ftc f21418b;

    @Nullable
    public SentryAndroidOptions c;

    @TestOnly
    @Nullable
    public SensorManager d;
    public boolean e = false;

    @NotNull
    public final Object f = new Object();

    public TempSensorBreadcrumbsIntegration(@NotNull Context context) {
        this.f21417a = (Context) io.sentry.util.p.c(u0.a(context), "Context is required");
    }

    public final /* synthetic */ void b(SentryOptions sentryOptions) {
        synchronized (this.f) {
            try {
                if (!this.e) {
                    c(sentryOptions);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(@NotNull SentryOptions sentryOptions) {
        try {
            SensorManager sensorManager = (SensorManager) this.f21417a.getSystemService("sensor");
            this.d = sensorManager;
            if (sensorManager != null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(13);
                if (defaultSensor != null) {
                    this.d.registerListener(this, defaultSensor, 3);
                    sentryOptions.getLogger().c(SentryLevel.DEBUG, "TempSensorBreadcrumbsIntegration installed.", new Object[0]);
                    io.sentry.util.k.a("TempSensorBreadcrumbs");
                } else {
                    sentryOptions.getLogger().c(SentryLevel.INFO, "TYPE_AMBIENT_TEMPERATURE is not available.", new Object[0]);
                }
            } else {
                sentryOptions.getLogger().c(SentryLevel.INFO, "SENSOR_SERVICE is not available.", new Object[0]);
            }
        } catch (Throwable th) {
            sentryOptions.getLogger().b(SentryLevel.ERROR, th, "Failed to init. the SENSOR_SERVICE.", new Object[0]);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f) {
            this.e = true;
        }
        SensorManager sensorManager = this.d;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
            this.d = null;
            SentryAndroidOptions sentryAndroidOptions = this.c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(SentryLevel.DEBUG, "TempSensorBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(@NotNull SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr == null || fArr.length == 0 || fArr[0] == 0.0f || this.f21418b == null) {
            return;
        }
        io.sentry.a aVar = new io.sentry.a();
        aVar.q("system");
        aVar.m("device.event");
        aVar.n("action", "TYPE_AMBIENT_TEMPERATURE");
        aVar.n("accuracy", Integer.valueOf(sensorEvent.accuracy));
        aVar.n("timestamp", Long.valueOf(sensorEvent.timestamp));
        aVar.o(SentryLevel.INFO);
        aVar.n("degree", Float.valueOf(sensorEvent.values[0]));
        c8c c8cVar = new c8c();
        c8cVar.l("android:sensorEvent", sensorEvent);
        this.f21418b.o(aVar, c8cVar);
    }

    @Override // defpackage.ucd
    public void register(@NotNull ftc ftcVar, @NotNull final SentryOptions sentryOptions) {
        this.f21418b = (ftc) io.sentry.util.p.c(ftcVar, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.p.c(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.c = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().c(SentryLevel.DEBUG, "enableSystemEventsBreadcrumbs enabled: %s", Boolean.valueOf(this.c.isEnableSystemEventBreadcrumbs()));
        if (this.c.isEnableSystemEventBreadcrumbs()) {
            try {
                sentryOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.z1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f21620a.b(sentryOptions);
                    }
                });
            } catch (Throwable th) {
                sentryOptions.getLogger().a(SentryLevel.DEBUG, "Failed to start TempSensorBreadcrumbsIntegration on executor thread.", th);
            }
        }
    }
}
