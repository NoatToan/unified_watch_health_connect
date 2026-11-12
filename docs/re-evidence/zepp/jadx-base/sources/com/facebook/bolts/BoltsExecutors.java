package com.facebook.bolts;

import com.tekartik.sqflite.Constant;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/facebook/bolts/BoltsExecutors;", "", "Ljava/util/concurrent/ExecutorService;", "a", "Ljava/util/concurrent/ExecutorService;", "background", "Ljava/util/concurrent/ScheduledExecutorService;", "b", "Ljava/util/concurrent/ScheduledExecutorService;", "scheduled", "Ljava/util/concurrent/Executor;", "c", "Ljava/util/concurrent/Executor;", "immediate", "<init>", "()V", "Companion", "ImmediateExecutor", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class BoltsExecutors {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final BoltsExecutors d = new BoltsExecutors();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ExecutorService background;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ScheduledExecutorService scheduled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Executor immediate;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u000f\u0010\u0007\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\bH\u0001¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/facebook/bolts/BoltsExecutors$Companion;", "", "Ljava/util/concurrent/ExecutorService;", "background", "Ljava/util/concurrent/ScheduledExecutorService;", "scheduled$facebook_core_release", "()Ljava/util/concurrent/ScheduledExecutorService;", "scheduled", "Ljava/util/concurrent/Executor;", "immediate$facebook_core_release", "()Ljava/util/concurrent/Executor;", "immediate", "", "a", "()Z", "isAndroidRuntime", "Lcom/facebook/bolts/BoltsExecutors;", "INSTANCE", "Lcom/facebook/bolts/BoltsExecutors;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean a() {
            String property = System.getProperty("java.runtime.name");
            if (property != null) {
                return StringsKt__StringsKt.contains$default((CharSequence) property.toLowerCase(Locale.US), (CharSequence) "android", false, 2, (Object) null);
            }
            return false;
        }

        @JvmStatic
        @NotNull
        public final ExecutorService background() {
            return BoltsExecutors.d.background;
        }

        @JvmStatic
        @NotNull
        public final Executor immediate$facebook_core_release() {
            return BoltsExecutors.d.immediate;
        }

        @JvmStatic
        @NotNull
        public final ScheduledExecutorService scheduled$facebook_core_release() {
            return BoltsExecutors.d.scheduled;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/facebook/bolts/BoltsExecutors$ImmediateExecutor;", "Ljava/util/concurrent/Executor;", "", "b", "a", "Ljava/lang/Runnable;", "command", "", Constant.METHOD_EXECUTE, "Ljava/lang/ThreadLocal;", "Ljava/lang/ThreadLocal;", "executionDepth", "<init>", "()V", "c", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class ImmediateExecutor implements Executor {
        private static final int b = 15;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ThreadLocal<Integer> executionDepth = new ThreadLocal<>();

        private final int a() {
            Integer num = this.executionDepth.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() - 1;
            if (iIntValue == 0) {
                this.executionDepth.remove();
            } else {
                this.executionDepth.set(Integer.valueOf(iIntValue));
            }
            return iIntValue;
        }

        private final int b() {
            Integer num = this.executionDepth.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() + 1;
            this.executionDepth.set(Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NotNull Runnable command) {
            try {
                if (b() <= 15) {
                    command.run();
                } else {
                    BoltsExecutors.INSTANCE.background().execute(command);
                }
                a();
            } catch (Throwable th) {
                a();
                throw th;
            }
        }
    }

    private BoltsExecutors() {
        this.background = !INSTANCE.a() ? Executors.newCachedThreadPool() : AndroidExecutors.INSTANCE.newCachedThreadPool();
        this.scheduled = Executors.newSingleThreadScheduledExecutor();
        this.immediate = new ImmediateExecutor();
    }

    @JvmStatic
    @NotNull
    public static final ExecutorService background() {
        return INSTANCE.background();
    }
}
