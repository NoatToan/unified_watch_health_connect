package com.xiaomi.hm.health.common;

import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleObserver;
import androidx.p008lifecycle.OnLifecycleEvent;
import androidx.p008lifecycle.ProcessLifecycleOwner;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CalculationEventBuilder;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.event.StatEvent;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0003J\b\u0010\u0005\u001a\u00020\u0002H\u0003J\b\u0010\u0007\u001a\u00020\u0006H\u0002R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/common/ProcessLifecycleObserver;", "Landroidx/lifecycle/LifecycleObserver;", "", "observeProcessLifecycle", "onForeground", "onBackground", "", "a", "", "Ljava/lang/String;", "TAG", "b", "Ljava/lang/Long;", "onForegroundTime", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ProcessLifecycleObserver implements LifecycleObserver {

    @NotNull
    public static final ProcessLifecycleObserver INSTANCE = new ProcessLifecycleObserver();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "ProcessLifecycleObserver";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private static Long onForegroundTime;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onBackground: " + ProcessLifecycleObserver.INSTANCE.hashCode();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onForeground: " + ProcessLifecycleObserver.INSTANCE.hashCode();
        }
    }

    private ProcessLifecycleObserver() {
    }

    private final long a() {
        return System.currentTimeMillis();
    }

    @JvmStatic
    public static final void observeProcessLifecycle() {
        Lifecycle lifecycle = ProcessLifecycleOwner.get().getLifecycle();
        ProcessLifecycleObserver processLifecycleObserver = INSTANCE;
        lifecycle.removeObserver(processLifecycleObserver);
        ProcessLifecycleOwner.get().getLifecycle().addObserver(processLifecycleObserver);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    private final void onBackground() {
        HMLog.verbose(TAG, a.a);
        Long l = onForegroundTime;
        if (l == null) {
            return;
        }
        long jA = INSTANCE.a() - l.longValue();
        Analytics.recordEvent(new CalculationEventBuilder(StatEvent.BASE_USAGE_T, jA).addExtra("time", String.valueOf(jA)).setAnonymous(!StatEvent.isUserIdentified().booleanValue()).setIdentified(StatEvent.isUserIdentified().booleanValue()));
        onForegroundTime = null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    private final void onForeground() {
        HMLog.verbose(TAG, b.a);
        if (onForegroundTime == null) {
            onForegroundTime = Long.valueOf(a());
        }
    }
}
