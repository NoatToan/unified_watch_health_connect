package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J;\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0005\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\b\u0010\tJ;\u0010\n\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0005\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\n\u0010\tJ;\u0010\u000b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0005\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000b\u0010\tJ\u001c\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J;\u0010\u000e\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0005\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\tJ\"\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000fH\u0007J\"\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000fH\u0007J\"\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000fH\u0007J.\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000fH\u0007J8\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000fH\u0007J@\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000fH\u0003J\u000e\u0010\b\u001a\u00020\u0002*\u0004\u0018\u00010\u0002H\u0002¨\u0006\u0016"}, d2 = {"Lle;", "", "", "tag", "object", "", "args", "", PluginDeviceInfo.FMODEL, "(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V", PluginDeviceInfo.FICONON, PluginDeviceInfo.FDESC, "", "throwable", PluginDeviceInfo.FICONOFF, "Lkotlin/Function0;", "messageCollector", "code", "", "priority", "<init>", "()V", "log_release"}, k = 1, mv = {1, 4, 0})
public final class le {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final le f24956a = new le();

    @Deprecated(message = "请使用延迟求值的日志输出方法 debug()", replaceWith = @ReplaceWith(expression = "debug(tag) { `object` }", imports = {}))
    @JvmStatic
    public static final void a(@Nullable String tag, @Nullable Object object, @NotNull Object... args) {
        gv.a(nu.c.a(f24956a.a(tag)), null, tct.a(object), Arrays.copyOf(args, args.length), 1, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void b(@NotNull String str, @NotNull Function0<String> function0) {
        a(str, null, null, function0, 6, null);
    }

    @Deprecated(message = "请使用延迟求值的日志输出方法 info()", replaceWith = @ReplaceWith(expression = "info(tag) { `object` }", imports = {}))
    @JvmStatic
    public static final void c(@Nullable String tag, @Nullable Object object, @NotNull Object... args) {
        gv.b(nu.c.a(f24956a.a(tag)), null, tct.a(object), Arrays.copyOf(args, args.length), 1, null);
    }

    @Deprecated(message = "wtf级别已废弃，请调用其他日志打印方法，继续调用会默认记为error级别", replaceWith = @ReplaceWith(expression = "HMLog.error(tag) {`object`}", imports = {}))
    @JvmStatic
    public static final void d(@Nullable String tag, @Nullable Object object, @NotNull Object... args) {
        b(f24956a.a(tag), object, args);
    }

    @JvmStatic
    @JvmOverloads
    public static final void e(@NotNull String str, @NotNull Function0<String> function0) {
        a(str, (Throwable) null, function0, 2, (Object) null);
    }

    @Deprecated(message = "错误级别日志输出需要提供错误码，请调用 error()方法", replaceWith = @ReplaceWith(expression = "HMLog.error(tag, throwable) {`object`}", imports = {}))
    @JvmStatic
    public static final void a(@Nullable String tag, @Nullable Throwable throwable) {
        gv.a(nu.c.a(f24956a.a(tag)), "", throwable, null, new Object[0], 4, null);
    }

    @Deprecated(message = "错误级别日志输出需要提供错误码，请调用 error()方法", replaceWith = @ReplaceWith(expression = "HMLog.error(tag) {`object`}", imports = {}))
    @JvmStatic
    public static final void b(@Nullable String tag, @Nullable Object object, @NotNull Object... args) {
        gv.a(nu.c.a(f24956a.a(tag)), "", null, tct.a(object), Arrays.copyOf(args, args.length), 2, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void c(@NotNull String tag, @NotNull Function0<String> messageCollector) {
        a(4, f24956a.a(tag), null, null, messageCollector, 12, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void d(@NotNull String tag, @NotNull Function0<String> messageCollector) {
        a(2, f24956a.a(tag), null, null, messageCollector, 12, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void a(@NotNull String tag, @NotNull Function0<String> messageCollector) {
        a(3, f24956a.a(tag), null, null, messageCollector, 12, null);
    }

    public static /* synthetic */ void a(String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        c(str, function0);
    }

    public static /* synthetic */ void a(String str, Throwable th, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            th = null;
        }
        a(str, th, (Function0<String>) function0);
    }

    @JvmStatic
    @JvmOverloads
    public static final void a(@NotNull String tag, @Nullable Throwable throwable, @NotNull Function0<String> messageCollector) {
        a(5, f24956a.a(tag), null, throwable, messageCollector, 4, null);
    }

    public static /* synthetic */ void a(String str, String str2, Throwable th, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            th = null;
        }
        a(str, str2, th, (Function0<String>) function0);
    }

    @JvmStatic
    @JvmOverloads
    public static final void a(@NotNull String tag, @NotNull String code, @Nullable Throwable throwable, @NotNull Function0<String> messageCollector) {
        a(6, f24956a.a(tag), code, throwable, messageCollector);
    }

    public static /* synthetic */ void a(int i, String str, String str2, Throwable th, Function0 function0, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            th = null;
        }
        a(i, str, str2, th, (Function0<String>) function0);
    }

    @JvmStatic
    public static final void a(int priority, String tag, String code, Throwable throwable, Function0<String> messageCollector) {
        nu.a aVar = nu.c;
        le leVar = f24956a;
        if (aVar.a(leVar.a(tag), priority)) {
            aVar.a(leVar.a(tag)).a(priority, code, throwable, messageCollector.invoke(), new Object[0]);
        }
    }

    public final String a(@Nullable String str) {
        if (str == null) {
            str = tt.f35009b.a();
        }
        return str != null ? str : "";
    }
}
