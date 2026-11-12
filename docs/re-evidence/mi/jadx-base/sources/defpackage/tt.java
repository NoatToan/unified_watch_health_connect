package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0013\u0010\t\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Ltt;", "", "Ljava/lang/StackTraceElement;", PluginDeviceInfo.FDESC, "()Ljava/lang/StackTraceElement;", "invokeTraceElement", "", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;", "invokeClassName", "<init>", "()V", "log_release"}, k = 1, mv = {1, 4, 0})
public final class tt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static String f35008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final tt f35009b = new tt();

    static {
        String name;
        Package r0 = le.f24956a.getClass().getPackage();
        if (r0 == null || (name = r0.getName()) == null) {
            name = le.class.getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "HMLog.javaClass.name");
        }
        f35008a = name;
    }

    @Nullable
    public final String a() {
        StackTraceElement stackTraceElementB = b();
        if (stackTraceElementB != null) {
            return stackTraceElementB.getClassName();
        }
        return null;
    }

    @Nullable
    public final StackTraceElement b() {
        StackTraceElement[] trace = new Throwable().getStackTrace();
        String str = f35008a;
        Intrinsics.checkExpressionValueIsNotNull(trace, "trace");
        int i = -1;
        for (int length = trace.length - 1; length >= 0; length--) {
            StackTraceElement e = trace[length];
            Intrinsics.checkExpressionValueIsNotNull(e, "e");
            String className = e.getClassName();
            Intrinsics.checkExpressionValueIsNotNull(className, "e.className");
            if (StringsKt__StringsJVMKt.startsWith$default(className, str, false, 2, null)) {
                i = length;
                break;
            }
        }
        return (StackTraceElement) ArraysKt___ArraysKt.getOrNull(trace, i + 1);
    }
}
