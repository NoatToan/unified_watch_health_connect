package com.mi.health;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00009\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006*\u0001\u0005\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u0014\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/mi/health/HealthBaseAppWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "<init>", "()V", "recentDataChangeReceiver", "com/mi/health/HealthBaseAppWidgetProvider$recentDataChangeReceiver$1", "Lcom/mi/health/HealthBaseAppWidgetProvider$recentDataChangeReceiver$1;", "recentDataChangeIntentFilter", "Landroid/content/IntentFilter;", "hasRegisterRecentDataChangeReceiver", "", "onUpdate", "", "context", "Landroid/content/Context;", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetIds", "", "onEnabled", "onDisabled", "onRecentDataChanged", "ctx", "Companion", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class HealthBaseAppWidgetProvider extends AppWidgetProvider {

    @NotNull
    private static final String TAG = "HealthBaseAppWidgetProvider";
    private boolean hasRegisterRecentDataChangeReceiver;

    @NotNull
    private final HealthBaseAppWidgetProvider$recentDataChangeReceiver$1 recentDataChangeReceiver = new BroadcastReceiver() { // from class: com.mi.health.HealthBaseAppWidgetProvider$recentDataChangeReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context ctx, Intent intent) {
            Logger.i("HealthBaseAppWidgetProvider", "receive recent data changed!!");
            if (ctx != null) {
                this.this$0.onRecentDataChanged(ctx);
            }
        }
    };

    @NotNull
    private final IntentFilter recentDataChangeIntentFilter = new IntentFilter("recent_data_changed_broadcast");

    @Override // android.appwidget.AppWidgetProvider
    public void onDisabled(@Nullable Context context) {
        super.onDisabled(context);
        Logger.d(TAG, "onDisabled, unregister recent data changed:" + this.hasRegisterRecentDataChangeReceiver);
        if (this.hasRegisterRecentDataChangeReceiver) {
            ApplicationExtKt.getApplication().unregisterReceiver(this.recentDataChangeReceiver);
            this.hasRegisterRecentDataChangeReceiver = false;
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onEnabled(@Nullable Context context) {
        super.onEnabled(context);
    }

    public void onRecentDataChanged(@NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(@NotNull Context context, @Nullable AppWidgetManager appWidgetManager, @Nullable int[] appWidgetIds) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onUpdate(context, appWidgetManager, appWidgetIds);
        if (this.hasRegisterRecentDataChangeReceiver) {
            return;
        }
        Logger.d(TAG, "onUpdate, register recent data changed");
        if (Build.VERSION.SDK_INT >= 34) {
            ApplicationExtKt.getApplication().registerReceiver(this.recentDataChangeReceiver, this.recentDataChangeIntentFilter, 2);
        } else {
            ApplicationExtKt.getApplication().registerReceiver(this.recentDataChangeReceiver, this.recentDataChangeIntentFilter);
        }
        this.hasRegisterRecentDataChangeReceiver = true;
    }
}
