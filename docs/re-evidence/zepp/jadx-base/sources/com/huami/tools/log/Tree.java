package com.huami.tools.log;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$JO\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\t\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J?\u0010\u000f\u001a\u00020\u000b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\t\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J?\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\t\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J?\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\t\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0010J?\u0010\u0013\u001a\u00020\u000b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\t\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0010JG\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\t\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015JS\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\t\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\rJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J)\u0010\u001a\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0010\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\tH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ6\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H$R\"\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u001c8@@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00048P@\u0010X\u0090\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/huami/tools/log/Tree;", "", "", "priority", "", "code", "", "t", "message", "", "args", "", "b", "(ILjava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "a", "v", "(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", GoogleApiAvailabilityLight.a, "i", "w", "e", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "log", "tag", "", "isLoggable", "formatMessage", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Ljava/lang/ThreadLocal;", "Ljava/lang/ThreadLocal;", "getExplicitTag$log_release", "()Ljava/lang/ThreadLocal;", "explicitTag", "getTag$log_release", "()Ljava/lang/String;", "<init>", "()V", "log_release"}, k = 1, mv = {1, 4, 0})
public abstract class Tree {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ThreadLocal<String> explicitTag = new ThreadLocal<>();

    private final String a(Throwable t) {
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        t.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    private final void b(int priority, String code, Throwable t, String message, Object... args) {
        String tag$log_release = getTag$log_release();
        if (isLoggable(tag$log_release, priority)) {
            if (!(message == null || message.length() == 0)) {
                if (!(args.length == 0)) {
                    message = formatMessage(message, args);
                }
                if (t != null) {
                    message = message + "\n" + a(t);
                }
            } else if (t == null) {
                return;
            } else {
                message = a(t);
            }
            log(priority, tag$log_release, message, code, t);
        }
    }

    public static /* synthetic */ void c(Tree tree, int i, String str, Throwable th, String str2, Object[] objArr, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepareLog");
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        tree.b(i, str, th, str2, objArr);
    }

    public static /* synthetic */ void d$default(Tree tree, Throwable th, String str, Object[] objArr, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: d");
        }
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        tree.d(th, str, objArr);
    }

    public static /* synthetic */ void e$default(Tree tree, String str, Throwable th, String str2, Object[] objArr, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: e");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        tree.e(str, th, str2, objArr);
    }

    public static /* synthetic */ void i$default(Tree tree, Throwable th, String str, Object[] objArr, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: i");
        }
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        tree.i(th, str, objArr);
    }

    public static /* synthetic */ void log$default(Tree tree, int i, String str, Throwable th, String str2, Object[] objArr, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        tree.log(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : th, (i2 & 8) != 0 ? null : str2, objArr);
    }

    public static /* synthetic */ void v$default(Tree tree, Throwable th, String str, Object[] objArr, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: v");
        }
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        tree.v(th, str, objArr);
    }

    public static /* synthetic */ void w$default(Tree tree, Throwable th, String str, Object[] objArr, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: w");
        }
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        tree.w(th, str, objArr);
    }

    public void d(@Nullable Throwable t, @Nullable String message, @NotNull Object... args) {
        c(this, 3, null, t, message, Arrays.copyOf(args, args.length), 2, null);
    }

    public void e(@NotNull String code, @Nullable Throwable t, @Nullable String message, @NotNull Object... args) {
        b(6, code, t, message, Arrays.copyOf(args, args.length));
    }

    @NotNull
    public String formatMessage(@NotNull String message, @NotNull Object[] args) {
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        return String.format(message, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @NotNull
    public final /* synthetic */ ThreadLocal<String> getExplicitTag$log_release() {
        return this.explicitTag;
    }

    @Nullable
    public /* synthetic */ String getTag$log_release() {
        String str = this.explicitTag.get();
        if (str != null) {
            this.explicitTag.remove();
        }
        return str;
    }

    public void i(@Nullable Throwable t, @Nullable String message, @NotNull Object... args) {
        c(this, 4, null, t, message, Arrays.copyOf(args, args.length), 2, null);
    }

    public boolean isLoggable(@Nullable String tag, int priority) {
        return true;
    }

    public abstract void log(int priority, @Nullable String tag, @NotNull String message, @Nullable String code, @Nullable Throwable t);

    public void log(int priority, @Nullable String code, @Nullable Throwable t, @Nullable String message, @NotNull Object... args) {
        b(priority, code, t, message, Arrays.copyOf(args, args.length));
    }

    public void v(@Nullable Throwable t, @Nullable String message, @NotNull Object... args) {
        c(this, 2, null, t, message, Arrays.copyOf(args, args.length), 2, null);
    }

    public void w(@Nullable Throwable t, @Nullable String message, @NotNull Object... args) {
        c(this, 5, null, t, message, Arrays.copyOf(args, args.length), 2, null);
    }
}
