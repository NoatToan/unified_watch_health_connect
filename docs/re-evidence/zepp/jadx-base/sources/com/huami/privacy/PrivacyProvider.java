package com.huami.privacy;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import com.huami.privacy.plugin.ActivityLifecyclePlugin;
import com.huami.privacy.plugin.AndroidId;
import com.huami.privacy.plugin.CreatedActivityClassNames;
import com.huami.privacy.plugin.CurrentProcessName;
import com.huami.privacy.plugin.IsAppForeground;
import com.huami.privacy.plugin.IsMainProcess;
import com.huami.privacy.plugin.PrivacyPlugin;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0014\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002J3\u0010\u000b\u001a\u00028\u0000\"\f\b\u0000\u0010\u0006*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0007J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002J(\u0010\u000b\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0006\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0086\b¢\u0006\u0004\b\u000b\u0010\u0014R1\u0010\u001a\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0015j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002`\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/huami/privacy/PrivacyProvider;", "", "Lcom/huami/privacy/plugin/PrivacyPlugin;", "plugin", "", "a", ExifInterface.GPS_DIRECTION_TRUE, "", "purpose", "Ljava/lang/Class;", "pluginClass", "get", "(Ljava/lang/String;Ljava/lang/Class;)Lcom/huami/privacy/plugin/PrivacyPlugin;", "Landroid/app/Application;", "app", "Lkotlin/Function0;", "", "isPrivacyAgreed", PointCategory.INIT, "b", "(Ljava/lang/String;)Lcom/huami/privacy/plugin/PrivacyPlugin;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "Ljava/util/HashSet;", "getPlugins", "()Ljava/util/HashSet;", "plugins", "<init>", "()V", "hmutil_release"}, k = 1, mv = {1, 5, 1})
public final class PrivacyProvider {

    @NotNull
    public static final PrivacyProvider INSTANCE = new PrivacyProvider();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final HashSet<PrivacyPlugin<?>> plugins = new HashSet<>();

    private PrivacyProvider() {
    }

    private final void a(PrivacyPlugin<?> plugin) {
        plugins.add(plugin);
    }

    private final void b(Application app) {
        app.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.huami.privacy.PrivacyProvider$observeActivityLifecycle$1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(@NotNull Activity p0, @Nullable Bundle p1) {
                HashSet<PrivacyPlugin<?>> plugins2 = PrivacyProvider.INSTANCE.getPlugins();
                ArrayList arrayList = new ArrayList();
                for (Object obj : plugins2) {
                    if (((PrivacyPlugin) obj) instanceof ActivityLifecyclePlugin) {
                        arrayList.add(obj);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ActivityLifecyclePlugin) ((PrivacyPlugin) it2.next())).onActivityCreated$hmutil_release(p0);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(@NotNull Activity p0) {
                HashSet<PrivacyPlugin<?>> plugins2 = PrivacyProvider.INSTANCE.getPlugins();
                ArrayList arrayList = new ArrayList();
                for (Object obj : plugins2) {
                    if (((PrivacyPlugin) obj) instanceof ActivityLifecyclePlugin) {
                        arrayList.add(obj);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ActivityLifecyclePlugin) ((PrivacyPlugin) it2.next())).onActivityDestroyed$hmutil_release(p0);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(@NotNull Activity p0) {
                HashSet<PrivacyPlugin<?>> plugins2 = PrivacyProvider.INSTANCE.getPlugins();
                ArrayList arrayList = new ArrayList();
                for (Object obj : plugins2) {
                    if (((PrivacyPlugin) obj) instanceof ActivityLifecyclePlugin) {
                        arrayList.add(obj);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ActivityLifecyclePlugin) ((PrivacyPlugin) it2.next())).onActivityPaused$hmutil_release(p0);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(@NotNull Activity p0) {
                HashSet<PrivacyPlugin<?>> plugins2 = PrivacyProvider.INSTANCE.getPlugins();
                ArrayList arrayList = new ArrayList();
                for (Object obj : plugins2) {
                    if (((PrivacyPlugin) obj) instanceof ActivityLifecyclePlugin) {
                        arrayList.add(obj);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ActivityLifecyclePlugin) ((PrivacyPlugin) it2.next())).onActivityResumed$hmutil_release(p0);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(@NotNull Activity p0, @NotNull Bundle p1) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(@NotNull Activity p0) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(@NotNull Activity p0) {
            }
        });
    }

    @JvmStatic
    public static final void init(@NotNull Application app, @NotNull Function0<Boolean> isPrivacyAgreed) {
        PrivacyProvider privacyProvider = INSTANCE;
        if (!plugins.isEmpty()) {
            return;
        }
        privacyProvider.a(new AndroidId(app, isPrivacyAgreed));
        privacyProvider.a(new CreatedActivityClassNames());
        privacyProvider.a(new IsAppForeground());
        CurrentProcessName currentProcessName = new CurrentProcessName(app, isPrivacyAgreed);
        privacyProvider.a(currentProcessName);
        privacyProvider.a(new IsMainProcess(app, currentProcessName));
        privacyProvider.b(app);
    }

    public final /* synthetic */ <T extends PrivacyPlugin<?>> T get(String purpose) throws Exception {
        if (purpose.length() == 0) {
            throw new Exception("请填写此隐私信息的使用目的");
        }
        Iterator<T> it2 = getPlugins().iterator();
        while (it2.hasNext()) {
            T t = (T) it2.next();
            Class<?> cls = t.getClass();
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            if (Intrinsics.areEqual(cls, PrivacyPlugin.class)) {
                Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
                return t;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @NotNull
    public final HashSet<PrivacyPlugin<?>> getPlugins() {
        return plugins;
    }

    @JvmStatic
    @NotNull
    public static final <T extends PrivacyPlugin<?>> T get(@NotNull String purpose, @NotNull Class<T> pluginClass) throws Exception {
        if (!(purpose.length() == 0)) {
            Iterator<T> it2 = plugins.iterator();
            while (it2.hasNext()) {
                T t = (T) it2.next();
                if (Intrinsics.areEqual(t.getClass(), pluginClass)) {
                    return t;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        throw new Exception("请填写此隐私信息的使用目的");
    }
}
