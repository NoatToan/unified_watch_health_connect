package com.xiaomi.fitness.common.utils;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bJ\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0005J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/common/utils/ComponentState;", "", "<init>", "()V", "TAG", "", "enableComponent", "", "enable", "", "clazz", "Ljava/lang/Class;", "className", "isStateEquals", "state", "", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ComponentState {

    @NotNull
    public static final ComponentState INSTANCE = new ComponentState();

    @NotNull
    private static final String TAG = "ComponentState";

    private ComponentState() {
    }

    private final boolean isStateEquals(boolean enable, int state) {
        if (enable && state == 1) {
            return true;
        }
        return !enable && state == 2;
    }

    public final void enableComponent(boolean enable, @NotNull Class<?> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Logger.i(TAG, "enableComponent() called with: enable = " + enable + ", clazz = " + clazz);
        try {
            PackageManager packageManager = ApplicationExtKt.getApplication().getPackageManager();
            ComponentName componentName = new ComponentName(ApplicationExtKt.getApplication(), clazz);
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
            Logger.i(TAG, clazz.getName() + " called with: enable = " + enable + ",state = " + componentEnabledSetting);
            if (isStateEquals(enable, componentEnabledSetting)) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, enable ? 1 : 2, 1);
        } catch (Exception e) {
            Logger.e(TAG, clazz.getName() + " called with: enable = " + enable, e);
        }
    }

    public final void enableComponent(boolean enable, @NotNull String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        try {
            Class<?> cls = Class.forName(className);
            Intrinsics.checkNotNullExpressionValue(cls, "forName(...)");
            enableComponent(enable, cls);
        } catch (Error e) {
            e.printStackTrace();
            Logger.i("enableComponent", "enableComponent:" + enable + " fail, " + e);
        } catch (Exception e2) {
            e2.printStackTrace();
            Logger.i("enableComponent", "enableComponent:" + enable + " fail, " + e2);
        } catch (Throwable th) {
            th.printStackTrace();
            Logger.i("enableComponent", "enableComponent:" + enable + " fail, " + th);
        }
    }
}
