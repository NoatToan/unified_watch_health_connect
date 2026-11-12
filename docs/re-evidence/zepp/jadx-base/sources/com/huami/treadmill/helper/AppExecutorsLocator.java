package com.huami.treadmill.helper;

import androidx.annotation.VisibleForTesting;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/huami/treadmill/helper/AppExecutorsLocator;", "", "Ljava/util/concurrent/Executor;", "getNetworkExecutor", "getDiskIOExecutor", "getMainExecutor", "Companion", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public interface AppExecutorsLocator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0007R\u0016\u0010\t\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/huami/treadmill/helper/AppExecutorsLocator$Companion;", "", "Lcom/huami/treadmill/helper/AppExecutorsLocator;", DefaultSettingsSpiCall.n, "locator", "", "swap", "b", "Ljava/lang/Object;", "LOCK", "c", "Lcom/huami/treadmill/helper/AppExecutorsLocator;", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private static final Object LOCK = new Object();

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private static AppExecutorsLocator instance;

        private Companion() {
        }

        @NotNull
        public final AppExecutorsLocator instance() {
            AppExecutorsLocator appExecutorsLocator;
            synchronized (LOCK) {
                if (instance == null) {
                    instance = new AppExecutors();
                }
                appExecutorsLocator = instance;
            }
            return appExecutorsLocator;
        }

        @VisibleForTesting
        public final void swap(@NotNull AppExecutorsLocator locator) {
            instance = locator;
        }
    }

    @NotNull
    Executor getDiskIOExecutor();

    @NotNull
    Executor getMainExecutor();

    @NotNull
    Executor getNetworkExecutor();
}
