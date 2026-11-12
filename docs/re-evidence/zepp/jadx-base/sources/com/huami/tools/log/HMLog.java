package com.huami.tools.log;

import com.dianping.logan.Logan;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.parser.ParserManager;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010(J;\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0005\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\b\u0010\tJ;\u0010\n\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0005\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\n\u0010\tJ;\u0010\u000b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0005\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000b\u0010\tJ;\u0010\f\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0005\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\f\u0010\tJE\u0010\f\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0005\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\f\u0010\u000fJ\u001c\u0010\f\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007J;\u0010\u0010\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0005\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0010\u0010\tJE\u0010\u0010\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0005\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ\u001c\u0010\u0010\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007J;\u0010\u0011\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0005\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0011\u0010\tJE\u0010\u0011\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0005\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0011\u0010\u000fJ\u001c\u0010\u0011\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007JM\u0010\u0015\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0005\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0017H\u0007J\"\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0017H\u0007J\"\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0017H\u0007J.\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0017H\u0007J8\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0017H\u0007J@\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0017H\u0003J\u0010\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 H\u0007J\u0010\u0010#\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 H\u0007J\b\u0010$\u001a\u00020\u0007H\u0007J\b\u0010%\u001a\u00020\u0007H\u0007J\u000e\u0010&\u001a\u00020\u0002*\u0004\u0018\u00010\u0002H\u0002¨\u0006)"}, d2 = {"Lcom/huami/tools/log/HMLog;", "", "", "tag", "object", "", "args", "", "v", "(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V", GoogleApiAvailabilityLight.a, "i", "w", "", "throwable", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)V", "e", "wtf", "", "priority", "t", "log", "(Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)V", "Lkotlin/Function0;", "messageCollector", "verbose", "debug", "info", "warn", "code", "error", "a", "Lcom/huami/tools/log/Tree;", "tree", "plant", "uproot", "uprootAll", "flush", "c", "<init>", "()V", "log_release"}, k = 1, mv = {1, 4, 0})
public final class HMLog {
    public static final HMLog INSTANCE = new HMLog();

    private HMLog() {
    }

    @JvmStatic
    private static final void a(int priority, String tag, String code, Throwable throwable, Function0<String> messageCollector) {
        Timber.Companion forest = Timber.INSTANCE;
        HMLog hMLog = INSTANCE;
        if (forest.isLoggable(hMLog.c(tag), priority)) {
            forest.tag(hMLog.c(tag)).log(priority, code, throwable, messageCollector.invoke(), new Object[0]);
        }
    }

    public static /* synthetic */ void b(int i, String str, String str2, Throwable th, Function0 function0, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            th = null;
        }
        a(i, str, str2, th, function0);
    }

    private final String c(@Nullable String str) {
        if (str == null) {
            str = StackTraceHelper.INSTANCE.getInvokeClassName();
        }
        return str != null ? str : "";
    }

    @Deprecated(message = "请使用延迟求值的日志输出方法 debug()", replaceWith = @ReplaceWith(expression = "debug(tag) { `object` }", imports = {}))
    @JvmStatic
    public static final void d(@Nullable String tag, @Nullable Object object, @NotNull Object... args) {
        Tree.d$default(Timber.INSTANCE.tag(INSTANCE.c(tag)), null, ParserManager.parseMessageFromObject(object), Arrays.copyOf(args, args.length), 1, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void debug(@NotNull String tag, @NotNull Function0<String> messageCollector) {
        b(3, INSTANCE.c(tag), null, null, messageCollector, 12, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void debug(@NotNull Function0<String> function0) {
        debug$default(null, function0, 1, null);
    }

    public static /* synthetic */ void debug$default(String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        debug(str, function0);
    }

    @Deprecated(message = "错误级别日志输出需要提供错误码，请调用 error()方法", replaceWith = @ReplaceWith(expression = "HMLog.error(tag) {`object`}", imports = {}))
    @JvmStatic
    public static final void e(@Nullable String tag, @Nullable Object object, @NotNull Object... args) {
        Tree.e$default(Timber.INSTANCE.tag(INSTANCE.c(tag)), "", null, ParserManager.parseMessageFromObject(object), Arrays.copyOf(args, args.length), 2, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void error(@NotNull String tag, @NotNull String code, @Nullable Throwable throwable, @NotNull Function0<String> messageCollector) {
        a(6, INSTANCE.c(tag), code, throwable, messageCollector);
    }

    @JvmStatic
    @JvmOverloads
    public static final void error(@NotNull String str, @NotNull String str2, @NotNull Function0<String> function0) {
        error$default(str, str2, null, function0, 4, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void error(@NotNull String str, @NotNull Function0<String> function0) {
        error$default(str, null, null, function0, 6, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void error(@NotNull Function0<String> function0) {
        error$default(null, null, null, function0, 7, null);
    }

    public static /* synthetic */ void error$default(String str, String str2, Throwable th, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            th = null;
        }
        error(str, str2, th, function0);
    }

    @JvmStatic
    public static final void flush() {
        List<Tree> listForest = Timber.INSTANCE.forest();
        boolean z = false;
        if (!(listForest instanceof Collection) || !listForest.isEmpty()) {
            Iterator<T> it2 = listForest.iterator();
            while (it2.hasNext()) {
                if (((Tree) it2.next()) instanceof LoganTree) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            try {
                Logan.f();
            } catch (Exception unused) {
            }
        }
    }

    @Deprecated(message = "请使用延迟求值的日志输出方法 info()", replaceWith = @ReplaceWith(expression = "info(tag) { `object` }", imports = {}))
    @JvmStatic
    public static final void i(@Nullable String tag, @Nullable Object object, @NotNull Object... args) {
        Tree.i$default(Timber.INSTANCE.tag(INSTANCE.c(tag)), null, ParserManager.parseMessageFromObject(object), Arrays.copyOf(args, args.length), 1, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void info(@NotNull String tag, @NotNull Function0<String> messageCollector) {
        b(4, INSTANCE.c(tag), null, null, messageCollector, 12, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void info(@NotNull Function0<String> function0) {
        info$default(null, function0, 1, null);
    }

    public static /* synthetic */ void info$default(String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        info(str, function0);
    }

    @Deprecated(message = "请使用延迟求值的日志输出方法")
    @JvmStatic
    public static final void log(@Nullable String tag, int priority, @Nullable Throwable t, @Nullable Object object, @NotNull Object... args) {
        Tree.log$default(Timber.INSTANCE.tag(INSTANCE.c(tag)), priority, null, t, ParserManager.parseMessageFromObject(object), Arrays.copyOf(args, args.length), 2, null);
    }

    @JvmStatic
    public static final void plant(@NotNull Tree tree) {
        Timber.INSTANCE.plant(tree);
    }

    @JvmStatic
    public static final void uproot(@NotNull Tree tree) {
        Timber.INSTANCE.uproot(tree);
    }

    @JvmStatic
    public static final void uprootAll() {
        Timber.INSTANCE.uprootAll();
    }

    @Deprecated(message = "请使用延迟求值的日志输出方法 verbose()", replaceWith = @ReplaceWith(expression = "verbose(tag) { `object` }", imports = {}))
    @JvmStatic
    public static final void v(@Nullable String tag, @Nullable Object object, @NotNull Object... args) {
        Tree.v$default(Timber.INSTANCE.tag(INSTANCE.c(tag)), null, ParserManager.parseMessageFromObject(object), Arrays.copyOf(args, args.length), 1, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void verbose(@NotNull String tag, @NotNull Function0<String> messageCollector) {
        b(2, INSTANCE.c(tag), null, null, messageCollector, 12, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void verbose(@NotNull Function0<String> function0) {
        verbose$default(null, function0, 1, null);
    }

    public static /* synthetic */ void verbose$default(String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        verbose(str, function0);
    }

    @Deprecated(message = "请使用延迟求值的日志输出方法 warn()", replaceWith = @ReplaceWith(expression = "warn(tag) { `object` }", imports = {}))
    @JvmStatic
    public static final void w(@Nullable String tag, @Nullable Object object, @NotNull Object... args) {
        Tree.w$default(Timber.INSTANCE.tag(INSTANCE.c(tag)), null, ParserManager.parseMessageFromObject(object), Arrays.copyOf(args, args.length), 1, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void warn(@NotNull String tag, @Nullable Throwable throwable, @NotNull Function0<String> messageCollector) {
        b(5, INSTANCE.c(tag), null, throwable, messageCollector, 4, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void warn(@NotNull String str, @NotNull Function0<String> function0) {
        warn$default(str, null, function0, 2, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void warn(@NotNull Function0<String> function0) {
        warn$default(null, null, function0, 3, null);
    }

    public static /* synthetic */ void warn$default(String str, Throwable th, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            th = null;
        }
        warn(str, th, function0);
    }

    @Deprecated(message = "wtf级别已废弃，请调用其他日志打印方法，继续调用会默认记为error级别", replaceWith = @ReplaceWith(expression = "HMLog.error(tag) {`object`}", imports = {}))
    @JvmStatic
    public static final void wtf(@Nullable String tag, @Nullable Object object, @NotNull Object... args) {
        e(INSTANCE.c(tag), object, args);
    }

    @Deprecated(message = "错误级别日志输出需要提供错误码，请调用 error()方法", replaceWith = @ReplaceWith(expression = "HMLog.error(tag, throwable) {`object`}", imports = {}))
    @JvmStatic
    public static final void e(@Nullable String tag, @Nullable Throwable throwable, @Nullable Object object, @NotNull Object... args) {
        Timber.INSTANCE.tag(INSTANCE.c(tag)).e("", throwable, ParserManager.parseMessageFromObject(object), Arrays.copyOf(args, args.length));
    }

    @Deprecated(message = "请使用延迟求值的日志输出方法 warn()", replaceWith = @ReplaceWith(expression = "warn(tag, throwable) { `object` }", imports = {}))
    @JvmStatic
    public static final void w(@Nullable String tag, @Nullable Throwable throwable, @Nullable Object object, @NotNull Object... args) {
        Timber.INSTANCE.tag(INSTANCE.c(tag)).w(throwable, ParserManager.parseMessageFromObject(object), Arrays.copyOf(args, args.length));
    }

    @Deprecated(message = "wtf级别已废弃，请调用其他日志打印方法，继续调用会默认记为error级别", replaceWith = @ReplaceWith(expression = "HMLog.error(tag, throwable) {`object`}", imports = {}))
    @JvmStatic
    public static final void wtf(@Nullable String tag, @Nullable Throwable throwable, @Nullable Object object, @NotNull Object... args) {
        e(INSTANCE.c(tag), object, throwable, args);
    }

    @Deprecated(message = "错误级别日志输出需要提供错误码，请调用 error()方法", replaceWith = @ReplaceWith(expression = "HMLog.error(tag, throwable) {`object`}", imports = {}))
    @JvmStatic
    public static final void e(@Nullable String tag, @Nullable Throwable throwable) {
        Tree.e$default(Timber.INSTANCE.tag(INSTANCE.c(tag)), "", throwable, null, new Object[0], 4, null);
    }

    @Deprecated(message = "请使用延迟求值的日志输出方法 warn()", replaceWith = @ReplaceWith(expression = "warn(tag, throwable) {}", imports = {}))
    @JvmStatic
    public static final void w(@Nullable String tag, @Nullable Throwable throwable) {
        Tree.w$default(Timber.INSTANCE.tag(INSTANCE.c(tag)), throwable, null, new Object[0], 2, null);
    }

    @Deprecated(message = "wtf级别已废弃，请调用其他日志打印方法，继续调用会默认记为error级别", replaceWith = @ReplaceWith(expression = "HMLog.error(tag, throwable) {`object`}", imports = {}))
    @JvmStatic
    public static final void wtf(@Nullable String tag, @Nullable Throwable throwable) {
        e(INSTANCE.c(tag), throwable);
    }
}
