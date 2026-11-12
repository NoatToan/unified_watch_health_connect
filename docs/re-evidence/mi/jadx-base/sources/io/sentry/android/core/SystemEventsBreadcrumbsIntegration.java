package io.sentry.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.mi.health.WidgetConstants;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.ui.AppearanceModule;
import defpackage.c8c;
import defpackage.ftc;
import defpackage.ucd;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes2.dex */
public final class SystemEventsBreadcrumbsIntegration implements ucd, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f21413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @TestOnly
    @Nullable
    public a f21414b;

    @Nullable
    public SentryAndroidOptions c;

    @NotNull
    public final List<String> d;
    public boolean e;

    @NotNull
    public final Object f;

    public static final class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ftc f21415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final SentryAndroidOptions f21416b;

        @NotNull
        public final io.sentry.android.core.internal.util.g c = new io.sentry.android.core.internal.util.g(io.sentry.android.core.internal.util.b.b(), 60000, 0);

        public a(@NotNull ftc ftcVar, @NotNull SentryAndroidOptions sentryAndroidOptions) {
            this.f21415a = ftcVar;
            this.f21416b = sentryAndroidOptions;
        }

        @NotNull
        public final io.sentry.a b(long j, @NotNull Intent intent, @Nullable String str, boolean z) {
            io.sentry.a aVar = new io.sentry.a(j);
            aVar.q("system");
            aVar.m("device.event");
            String strD = io.sentry.util.u.d(str);
            if (strD != null) {
                aVar.n("action", strD);
            }
            if (z) {
                Float fC = y0.c(intent, this.f21416b);
                if (fC != null) {
                    aVar.n("level", fC);
                }
                Boolean boolR = y0.r(intent, this.f21416b);
                if (boolR != null) {
                    aVar.n("charging", boolR);
                }
            } else {
                Bundle extras = intent.getExtras();
                HashMap map = new HashMap();
                if (extras != null && !extras.isEmpty()) {
                    for (String str2 : extras.keySet()) {
                        try {
                            Object obj = extras.get(str2);
                            if (obj != null) {
                                map.put(str2, obj.toString());
                            }
                        } catch (Throwable th) {
                            this.f21416b.getLogger().b(SentryLevel.ERROR, th, "%s key of the %s action threw an error.", str2, str);
                        }
                    }
                    aVar.n("extras", map);
                }
            }
            aVar.o(SentryLevel.INFO);
            return aVar;
        }

        public final /* synthetic */ void c(long j, Intent intent, String str, boolean z) {
            io.sentry.a aVarB = b(j, intent, str, z);
            c8c c8cVar = new c8c();
            c8cVar.l("android:intent", intent);
            this.f21415a.o(aVarB, c8cVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, @NotNull final Intent intent) {
            final String action = intent.getAction();
            final boolean zEquals = "android.intent.action.BATTERY_CHANGED".equals(action);
            if (zEquals && this.c.a()) {
                return;
            }
            final long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                this.f21416b.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.y1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f21617a.c(jCurrentTimeMillis, intent, action, zEquals);
                    }
                });
            } catch (Throwable th) {
                this.f21416b.getLogger().b(SentryLevel.ERROR, th, "Failed to submit system event breadcrumb action.", new Object[0]);
            }
        }
    }

    public SystemEventsBreadcrumbsIntegration(@NotNull Context context) {
        this(context, b());
    }

    @NotNull
    public static List<String> b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.appwidget.action.APPWIDGET_DELETED");
        arrayList.add("android.appwidget.action.APPWIDGET_DISABLED");
        arrayList.add("android.appwidget.action.APPWIDGET_ENABLED");
        arrayList.add("android.appwidget.action.APPWIDGET_HOST_RESTORED");
        arrayList.add("android.appwidget.action.APPWIDGET_RESTORED");
        arrayList.add(WidgetConstants.APP_WIDGET_UPDATE_ACTION);
        arrayList.add("android.appwidget.action.APPWIDGET_UPDATE_OPTIONS");
        arrayList.add("android.intent.action.ACTION_POWER_CONNECTED");
        arrayList.add("android.intent.action.ACTION_POWER_DISCONNECTED");
        arrayList.add("android.intent.action.ACTION_SHUTDOWN");
        arrayList.add("android.intent.action.AIRPLANE_MODE");
        arrayList.add("android.intent.action.BATTERY_LOW");
        arrayList.add("android.intent.action.BATTERY_OKAY");
        arrayList.add("android.intent.action.BATTERY_CHANGED");
        arrayList.add("android.intent.action.BOOT_COMPLETED");
        arrayList.add("android.intent.action.CAMERA_BUTTON");
        arrayList.add(AppearanceModule.APPEARANCE_CHANGED_ACTION);
        arrayList.add("android.intent.action.CONTENT_CHANGED");
        arrayList.add("android.intent.action.DATE_CHANGED");
        arrayList.add("android.intent.action.DEVICE_STORAGE_LOW");
        arrayList.add("android.intent.action.DEVICE_STORAGE_OK");
        arrayList.add("android.intent.action.DOCK_EVENT");
        arrayList.add("android.intent.action.DREAMING_STARTED");
        arrayList.add("android.intent.action.DREAMING_STOPPED");
        arrayList.add("android.intent.action.INPUT_METHOD_CHANGED");
        arrayList.add("android.intent.action.LOCALE_CHANGED");
        arrayList.add("android.intent.action.REBOOT");
        arrayList.add("android.intent.action.SCREEN_OFF");
        arrayList.add("android.intent.action.SCREEN_ON");
        arrayList.add("android.intent.action.TIMEZONE_CHANGED");
        arrayList.add("android.intent.action.TIME_SET");
        arrayList.add("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        arrayList.add("android.os.action.POWER_SAVE_MODE_CHANGED");
        arrayList.add("android.intent.action.APP_ERROR");
        arrayList.add("android.intent.action.BUG_REPORT");
        arrayList.add("android.intent.action.MEDIA_BAD_REMOVAL");
        arrayList.add("android.intent.action.MEDIA_MOUNTED");
        arrayList.add("android.intent.action.MEDIA_UNMOUNTABLE");
        arrayList.add("android.intent.action.MEDIA_UNMOUNTED");
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(ftc ftcVar, SentryOptions sentryOptions) {
        synchronized (this.f) {
            try {
                if (!this.e) {
                    d(ftcVar, (SentryAndroidOptions) sentryOptions);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f) {
            this.e = true;
        }
        a aVar = this.f21414b;
        if (aVar != null) {
            this.f21413a.unregisterReceiver(aVar);
            this.f21414b = null;
            SentryAndroidOptions sentryAndroidOptions = this.c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(SentryLevel.DEBUG, "SystemEventsBreadcrumbsIntegration remove.", new Object[0]);
            }
        }
    }

    public final void d(@NotNull ftc ftcVar, @NotNull SentryAndroidOptions sentryAndroidOptions) {
        this.f21414b = new a(ftcVar, sentryAndroidOptions);
        IntentFilter intentFilter = new IntentFilter();
        Iterator<String> it = this.d.iterator();
        while (it.hasNext()) {
            intentFilter.addAction(it.next());
        }
        try {
            u0.o(this.f21413a, sentryAndroidOptions, this.f21414b, intentFilter);
            sentryAndroidOptions.getLogger().c(SentryLevel.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
            io.sentry.util.k.a("SystemEventsBreadcrumbs");
        } catch (Throwable th) {
            sentryAndroidOptions.setEnableSystemEventBreadcrumbs(false);
            sentryAndroidOptions.getLogger().a(SentryLevel.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th);
        }
    }

    @Override // defpackage.ucd
    public void register(@NotNull final ftc ftcVar, @NotNull final SentryOptions sentryOptions) {
        io.sentry.util.p.c(ftcVar, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.p.c(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.c = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().c(SentryLevel.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.c.isEnableSystemEventBreadcrumbs()));
        if (this.c.isEnableSystemEventBreadcrumbs()) {
            try {
                sentryOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.x1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f21611a.c(ftcVar, sentryOptions);
                    }
                });
            } catch (Throwable th) {
                sentryOptions.getLogger().a(SentryLevel.DEBUG, "Failed to start SystemEventsBreadcrumbsIntegration on executor thread.", th);
            }
        }
    }

    public SystemEventsBreadcrumbsIntegration(@NotNull Context context, @NotNull List<String> list) {
        this.e = false;
        this.f = new Object();
        this.f21413a = (Context) io.sentry.util.p.c(u0.a(context), "Context is required");
        this.d = (List) io.sentry.util.p.c(list, "Actions list is required");
    }
}
