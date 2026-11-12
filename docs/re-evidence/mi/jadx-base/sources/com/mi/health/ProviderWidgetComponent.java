package com.mi.health;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.content.res.Configuration;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.StandardComponentEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/mi/health/ProviderWidgetComponent;", "Landroid/content/ComponentCallbacks2;", "<init>", "()V", "prevIsNight", "", "onConfigurationChanged", "", StandardComponentEvent.KEY_NEW_CONFIG, "Landroid/content/res/Configuration;", "onLowMemory", "onTrimMemory", "level", "", "Companion", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "provider-widget")
public final class ProviderWidgetComponent implements ComponentCallbacks2 {

    @NotNull
    public static final String RECENT_DATA_CHANGED = "recent_data_changed_broadcast";

    @NotNull
    public static final String TAG = "ProviderWidgetComponent";
    private boolean prevIsNight;

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        Logger.i(TAG, "onConfigurationChanged newConfig: " + newConfig);
        Application application = ApplicationExtKt.getApplication();
        boolean zIsNightMode = UIUtils.isNightMode(application);
        if (zIsNightMode != this.prevIsNight) {
            this.prevIsNight = zIsNightMode;
            Intent intent = new Intent(WidgetConstants.ACTION_UI_MODE_CHANGED);
            intent.setPackage(application.getPackageName());
            application.sendBroadcast(intent);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        Logger.i(TAG, "onLowMemory");
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        Logger.i(TAG, "onTrimMemory level " + level);
    }
}
