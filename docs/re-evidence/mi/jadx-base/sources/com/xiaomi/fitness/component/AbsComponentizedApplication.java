package com.xiaomi.fitness.component;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Trace;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0017J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0015J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0017J\b\u0010\u0010\u001a\u00020\u000bH\u0017J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0017J\b\u0010\u0014\u001a\u00020\u000bH\u0017J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0017¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/component/AbsComponentizedApplication;", "Landroid/app/Application;", "<init>", "()V", "registerReceiver", "Landroid/content/Intent;", "receiver", "Landroid/content/BroadcastReceiver;", "filter", "Landroid/content/IntentFilter;", "attachBaseContext", "", "base", "Landroid/content/Context;", "initWhenAttachBaseContext", "onCreate", "onTerminate", "onConfigurationChanged", StandardComponentEvent.KEY_NEW_CONFIG, "Landroid/content/res/Configuration;", "onLowMemory", "onTrimMemory", "level", "", "component-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AbsComponentizedApplication extends Application {
    public AbsComponentizedApplication() {
        try {
            Trace.beginSection("CA installAppComponentManager");
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(@NotNull Context base) {
        Intrinsics.checkNotNullParameter(base, "base");
        try {
            Trace.beginSection("CA attachBaseContext");
            super.attachBaseContext(base);
            initWhenAttachBaseContext(base);
            AppCallbackMediator.INSTANCE.attachBaseContext(this);
        } finally {
            Trace.endSection();
        }
    }

    public void initWhenAttachBaseContext(@NotNull Context base) {
        Intrinsics.checkNotNullParameter(base, "base");
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        AppCallbackMediator.INSTANCE.onConfigurationChanged(newConfig);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        try {
            Trace.beginSection("CA onCreate");
            AppCallbackMediator.INSTANCE.onCreate();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        AppCallbackMediator.INSTANCE.onLowMemory();
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        AppCallbackMediator.INSTANCE.onRemove();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        AppCallbackMediator.INSTANCE.onTrimMemory(level);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @RequiresApi(33)
    @Nullable
    public Intent registerReceiver(@Nullable BroadcastReceiver receiver, @Nullable IntentFilter filter) {
        return (Build.VERSION.SDK_INT < 34 || getApplicationInfo().targetSdkVersion < 34) ? super.registerReceiver(receiver, filter, 4) : super.registerReceiver(receiver, filter, 2);
    }
}
