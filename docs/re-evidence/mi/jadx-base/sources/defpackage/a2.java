package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.b.e;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J4\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002R\u001a\u0010\u0011\u001a\u00020\u0002*\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0010¨\u0006\u0014"}, d2 = {"La2;", "", "", "path", "", PluginDeviceInfo.FMODEL, "tag", "Lkotlin/Function0;", "msg", "", DeviceTagInterface.CUSTOM_TAG_TYPE, "", "isDirect", "", "trace", "", "(Ljava/lang/Throwable;)Ljava/lang/String;", "stackTraceString", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class a2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static d2 f540b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a2 f539a = new a2();

    @NotNull
    public static final ConcurrentLinkedQueue<b2> c = new ConcurrentLinkedQueue<>();

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Function0<String> t;
        public final /* synthetic */ Throwable u;
        public final /* synthetic */ Map<String, Object> v;
        public final /* synthetic */ Map<String, Object> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0<String> function0, Throwable th, Map<String, Object> map, Map<String, Object> map2) {
            super(0);
            this.t = function0;
            this.u = th;
            this.v = map;
            this.w = map2;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String strInvoke = this.t.invoke();
            Throwable th = this.u;
            if (th != null) {
                strInvoke = strInvoke + '\n' + a2.f539a.a(th);
            }
            this.v.put("m", strInvoke);
            Map<String, Object> map = this.w;
            String string = new JSONObject(this.v).toString();
            Intrinsics.checkNotNullExpressionValue(string, "JSONObject(msgMap as Map<*, *>?).toString()");
            map.put(PluginDeviceInfo.FICONON, string);
            return new JSONObject(this.w).toString() + '\n';
        }
    }

    @JvmStatic
    public static final void a(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        File file = new File(path);
        d2 d2Var = null;
        if (!(!file.isDirectory())) {
            file = null;
        }
        String parent = file != null ? file.getParent() : null;
        if (parent != null) {
            path = parent;
        }
        d2 d2Var2 = new d2(path, c);
        f540b = d2Var2;
        d2Var2.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: s2s
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                a2.a(thread, th);
            }
        });
        d2 d2Var3 = f540b;
        if (d2Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sLogThread");
        } else {
            d2Var = d2Var3;
        }
        d2Var.start();
    }

    public static final void a(Thread thread, Throwable th) {
        t5t.d("BleLog", "Uncaught exception:" + th);
    }

    @JvmStatic
    public static final void a(@NotNull String tag, @NotNull Function0<String> msg, @Nullable Throwable t, boolean isDirect) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(PluginDeviceInfo.FBLUETOOTHPAIR, 1);
        linkedHashMap.put(e.f13808a, Long.valueOf(System.currentTimeMillis()));
        linkedHashMap.put("i", 1);
        linkedHashMap.put("m", Boolean.TRUE);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.putAll(f539a.a(isDirect ? 4 : 5));
        linkedHashMap2.put(DeviceTagInterface.CUSTOM_TAG_TYPE, tag);
        linkedHashMap2.put("cd", 1);
        linkedHashMap2.put("n", "");
        c.add(new e2(new a(msg, t, linkedHashMap2, linkedHashMap)));
        d2 d2Var = f540b;
        if (d2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sLogThread");
            d2Var = null;
        }
        d2Var.c();
    }

    public final Map<String, String> a(int trace) {
        StackTraceElement stackTraceElement;
        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        Unit unit = null;
        if (stackTrace == null) {
            stackTraceElement = null;
        } else if (stackTrace.length <= trace) {
            stackTraceElement = (StackTraceElement) ArraysKt___ArraysKt.lastOrNull(stackTrace);
        } else {
            stackTraceElement = stackTrace[trace];
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (stackTraceElement != null) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "className");
            String className2 = className.substring(StringsKt__StringsKt.lastIndexOf$default((CharSequence) className, ".", 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(className2, "this as java.lang.String).substring(startIndex)");
            Intrinsics.checkNotNullExpressionValue(className2, "className");
            linkedHashMap.put(e.f13808a, className2);
            linkedHashMap.put("fc", stackTraceElement.getMethodName() + '-' + stackTraceElement.getLineNumber());
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            a(linkedHashMap);
        }
        return linkedHashMap;
    }

    public static final void a(Map map) {
        map.put(e.f13808a, "Unknown");
        map.put("fc", "Unknown-0");
    }

    public final String a(Throwable th) {
        if (th == null) {
            return "";
        }
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sw.toString()");
        return string;
    }
}
