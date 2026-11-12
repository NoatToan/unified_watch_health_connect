package com.xiaomi.hm.health;

import android.util.AndroidRuntimeException;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.utils.BraceletForegroundCallBack;
import com.xiaomi.hm.health.utils.HMActivityManager;
import com.xiaomi.hm.health.utils.ex.CrashReportExtKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u0018\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0004¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/CustomCrashHandler;", "", "Ljava/lang/Thread;", "thread", "", "a", "", "t", "", "handleUncaughtException", "methodRefPath", "", "methodIsInStackTrace", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class CustomCrashHandler {

    @NotNull
    public static final CustomCrashHandler INSTANCE = new CustomCrashHandler();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Thread a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Thread thread) {
            super(0);
            this.a = thread;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return CustomCrashHandler.INSTANCE.a(this.a);
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
            return "methodIsInStackTrace 方法异常";
        }
    }

    private CustomCrashHandler() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String a(Thread thread) {
        StringBuilder sb = new StringBuilder();
        sb.append(thread.toString());
        sb.append("\n");
        sb.append("activities: ");
        sb.append(HMActivityManager.INSTANCE.getActivityStack().toString());
        sb.append(";appIsForeground: ");
        sb.append(BraceletForegroundCallBack.getTopActivity() != null);
        return sb.toString();
    }

    public final void handleUncaughtException(@NotNull Thread thread, @NotNull Throwable t) {
        if (m.equals("RemoteServiceException", t.getClass().getSimpleName(), true)) {
            HMLog.error$default("test", null, t, new a(thread), 2, null);
            CrashReportExtKt.reportManual(new AndroidRuntimeException(a(thread), t));
        }
    }

    public final boolean methodIsInStackTrace(@Nullable Throwable t, @NotNull String methodRefPath) {
        if (t == null) {
            return false;
        }
        try {
            StackTraceElement[] stackTrace = t.getStackTrace();
            int length = stackTrace.length;
            int i = 0;
            while (i < length) {
                StackTraceElement stackTraceElement = stackTrace[i];
                i++;
                if (Intrinsics.areEqual(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName(), methodRefPath)) {
                    return true;
                }
            }
            return methodIsInStackTrace(t.getCause(), methodRefPath);
        } catch (Exception e) {
            HMLog.error$default("crash", null, e, b.a, 2, null);
            return false;
        }
    }
}
