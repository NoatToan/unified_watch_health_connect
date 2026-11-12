package com.xiaomi.hm.health.bt.debug;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.debug.BleLog;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J4\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007J\b\u0010\u000e\u001a\u00020\u0004H\u0007J\u001c\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\u00020\u0002*\u0004\u0018\u00010\t8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001c¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/bt/debug/BleLog;", "", "", "path", "", "initLog", "tag", "Lkotlin/Function0;", "msg", "", "t", "", "isDirect", "log", "flush", "", "trace", "", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/debug/BleLogThread;", "a", "Lcom/xiaomi/hm/health/bt/debug/BleLogThread;", "sLogThread", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lcom/xiaomi/hm/health/bt/debug/BleLogAction;", "b", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "sCacheLogQueue", "(Ljava/lang/Throwable;)Ljava/lang/String;", "stackTraceString", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class BleLog {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static BleLogThread sLogThread;

    @NotNull
    public static final BleLog INSTANCE = new BleLog();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final ConcurrentLinkedQueue<BleLogAction> sCacheLogQueue = new ConcurrentLinkedQueue<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Function0<String> a;
        public final /* synthetic */ Throwable b;
        public final /* synthetic */ Map<String, Object> c;
        public final /* synthetic */ Map<String, Object> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0<String> function0, Throwable th, Map<String, Object> map, Map<String, Object> map2) {
            super(0);
            this.a = function0;
            this.b = th;
            this.c = map;
            this.d = map2;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            String strInvoke = this.a.invoke();
            Throwable th = this.b;
            if (th != null) {
                strInvoke = strInvoke + '\n' + BleLog.INSTANCE.b(th);
            }
            this.c.put("m", strInvoke);
            this.d.put("c", new JSONObject(this.c).toString());
            return Intrinsics.stringPlus(new JSONObject(this.d).toString(), "\n");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Map<String, String> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Map<String, String> map) {
            super(0);
            this.a = map;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.put("l", "Unknown");
            this.a.put("fc", "Unknown-0");
        }
    }

    private BleLog() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String b(Throwable th) {
        if (th == null) {
            return "";
        }
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Thread thread, Throwable th) {
        Debug.fi("BleLog", Intrinsics.stringPlus("Uncaught exception:", th));
    }

    private final Map<String, String> d(int trace) {
        StackTraceElement stackTraceElement;
        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        Unit unit = null;
        if (stackTrace == null) {
            stackTraceElement = null;
        } else {
            stackTraceElement = stackTrace.length <= trace ? (StackTraceElement) ArraysKt.lastOrNull(stackTrace) : stackTrace[trace];
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (stackTraceElement != null) {
            String className = stackTraceElement.getClassName();
            linkedHashMap.put("l", className.substring(StringsKt__StringsKt.lastIndexOf$default((CharSequence) className, ".", 0, false, 6, (Object) null) + 1));
            StringBuilder sb = new StringBuilder();
            sb.append((Object) stackTraceElement.getMethodName());
            sb.append('-');
            sb.append(stackTraceElement.getLineNumber());
            linkedHashMap.put("fc", sb.toString());
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            new b(linkedHashMap).invoke();
        }
        return linkedHashMap;
    }

    @JvmStatic
    public static final void flush() {
        sCacheLogQueue.add(new BleLogFlushAction());
        BleLogThread bleLogThread = sLogThread;
        Objects.requireNonNull(bleLogThread);
        bleLogThread.notifyRun();
    }

    @JvmStatic
    public static final void initLog(@NotNull String path) {
        String parent;
        File file = new File(path);
        if (!(!file.isDirectory())) {
            file = null;
        }
        if (file != null && (parent = file.getParent()) != null) {
            path = parent;
        }
        BleLogThread bleLogThread = new BleLogThread(path, sCacheLogQueue);
        sLogThread = bleLogThread;
        Objects.requireNonNull(bleLogThread);
        bleLogThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: oy
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                BleLog.c(thread, th);
            }
        });
        BleLogThread bleLogThread2 = sLogThread;
        Objects.requireNonNull(bleLogThread2);
        bleLogThread2.start();
    }

    @JvmStatic
    public static final void log(@NotNull String tag, @NotNull Function0<String> msg, @Nullable Throwable t, boolean isDirect) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("f", 1);
        linkedHashMap.put("l", Long.valueOf(System.currentTimeMillis()));
        linkedHashMap.put("i", 1);
        linkedHashMap.put("m", Boolean.TRUE);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.putAll(INSTANCE.d(isDirect ? 4 : 5));
        linkedHashMap2.put("t", tag);
        linkedHashMap2.put("cd", 1);
        linkedHashMap2.put(GoogleApiAvailabilityLight.b, "");
        sCacheLogQueue.add(new BleLogWriteAction(new a(msg, t, linkedHashMap2, linkedHashMap)));
        BleLogThread bleLogThread = sLogThread;
        Objects.requireNonNull(bleLogThread);
        bleLogThread.notifyRun();
    }

    public static /* synthetic */ void log$default(String str, Function0 function0, Throwable th, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        log(str, function0, th, z);
    }
}
