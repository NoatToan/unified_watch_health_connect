package timber.log;

import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u00042\u00020\u0001:\u0003\u0005\u0004\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Ltimber/log/Timber;", "", "<init>", "()V", "Forest", "DebugTree", "Tree", "timber_release"}, k = 1, mv = {1, 5, 1})
public final class Timber {

    /* JADX INFO: renamed from: Forest, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ArrayList<Tree> a = new ArrayList<>();

    @NotNull
    private static volatile Tree[] b = new Tree[0];

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J,\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014R$\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00040\u00040\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048P@\u0010X\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Ltimber/log/Timber$DebugTree;", "Ltimber/log/Timber$Tree;", "Ljava/lang/StackTraceElement;", "element", "", "createStackElementTag", "", "priority", "tag", "message", "", "t", "", "log", "", "kotlin.jvm.PlatformType", "b", "Ljava/util/List;", "fqcnIgnore", "getTag$timber_release", "()Ljava/lang/String;", "<init>", "()V", "Companion", "timber_release"}, k = 1, mv = {1, 5, 1})
    public static class DebugTree extends Tree {
        private static final int c = 4000;
        private static final int d = 23;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final List<String> fqcnIgnore = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{Timber.class.getName(), Companion.class.getName(), Tree.class.getName(), DebugTree.class.getName()});
        private static final Pattern e = Pattern.compile("(\\$\\d+)+$");

        @Nullable
        public String createStackElementTag(@NotNull StackTraceElement element) {
            String strSubstringAfterLast$default = StringsKt__StringsKt.substringAfterLast$default(element.getClassName(), '.', (String) null, 2, (Object) null);
            Matcher matcher = e.matcher(strSubstringAfterLast$default);
            if (matcher.find()) {
                strSubstringAfterLast$default = matcher.replaceAll("");
            }
            return (strSubstringAfterLast$default.length() <= 23 || Build.VERSION.SDK_INT >= 26) ? strSubstringAfterLast$default : strSubstringAfterLast$default.substring(0, 23);
        }

        @Override // timber.log.Timber.Tree
        @Nullable
        public String getTag$timber_release() {
            String tag$timber_release = super.getTag$timber_release();
            if (tag$timber_release != null) {
                return tag$timber_release;
            }
            for (StackTraceElement stackTraceElement : new Throwable().getStackTrace()) {
                if (!this.fqcnIgnore.contains(stackTraceElement.getClassName())) {
                    return createStackElementTag(stackTraceElement);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        @Override // timber.log.Timber.Tree
        public void log(int priority, @Nullable String tag, @NotNull String message, @Nullable Throwable t) {
            int iMin;
            if (message.length() < 4000) {
                if (priority == 7) {
                    Log.wtf(tag, message);
                    return;
                } else {
                    Log.println(priority, tag, message);
                    return;
                }
            }
            int i = 0;
            int length = message.length();
            while (i < length) {
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) message, '\n', i, false, 4, (Object) null);
                if (iIndexOf$default == -1) {
                    iIndexOf$default = length;
                }
                while (true) {
                    iMin = Math.min(iIndexOf$default, i + 4000);
                    String strSubstring = message.substring(i, iMin);
                    if (priority == 7) {
                        Log.wtf(tag, strSubstring);
                    } else {
                        Log.println(priority, tag, strSubstring);
                    }
                    if (iMin >= iIndexOf$default) {
                        break;
                    } else {
                        i = iMin;
                    }
                }
                i = iMin + 1;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%JC\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J1\u0010\u000e\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u000e\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u0010J\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J1\u0010\u0011\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ;\u0010\u0011\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0011\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J1\u0010\u0012\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ;\u0010\u0012\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J1\u0010\u0013\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ;\u0010\u0013\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0012\u0010\u0013\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J1\u0010\u0014\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u000fJ;\u0010\u0014\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\u0012\u0010\u0014\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J1\u0010\u0015\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ;\u0010\u0015\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0010J\u0012\u0010\u0015\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J9\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0017JC\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\fJ\u001a\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0002H\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J)\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0010\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\bH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ,\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H$R\"\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d8@@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00068P@\u0010X\u0090\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Ltimber/log/Timber$Tree;", "", "", "priority", "", "t", "", "message", "", "args", "", "b", "(ILjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "a", "v", "(Ljava/lang/String;[Ljava/lang/Object;)V", "(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", GoogleApiAvailabilityLight.a, "i", "w", "e", "wtf", "log", "(ILjava/lang/String;[Ljava/lang/Object;)V", "", "isLoggable", "tag", "formatMessage", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Ljava/lang/ThreadLocal;", "Ljava/lang/ThreadLocal;", "getExplicitTag$timber_release", "()Ljava/lang/ThreadLocal;", "explicitTag", "getTag$timber_release", "()Ljava/lang/String;", "<init>", "()V", "timber_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class Tree {

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

        private final void b(int priority, Throwable t, String message, Object... args) {
            String tag$timber_release = getTag$timber_release();
            if (isLoggable(tag$timber_release, priority)) {
                if (!(message == null || message.length() == 0)) {
                    if (!(args.length == 0)) {
                        message = formatMessage(message, args);
                    }
                    if (t != null) {
                        message = ((Object) message) + '\n' + a(t);
                    }
                } else if (t == null) {
                    return;
                } else {
                    message = a(t);
                }
                log(priority, tag$timber_release, message, t);
            }
        }

        public void d(@Nullable String message, @NotNull Object... args) {
            b(3, null, message, Arrays.copyOf(args, args.length));
        }

        public void e(@Nullable String message, @NotNull Object... args) {
            b(6, null, message, Arrays.copyOf(args, args.length));
        }

        @NotNull
        public String formatMessage(@NotNull String message, @NotNull Object[] args) {
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            return String.format(message, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        }

        /* JADX INFO: renamed from: getExplicitTag$timber_release, reason: from getter */
        public final /* synthetic */ ThreadLocal getExplicitTag() {
            return this.explicitTag;
        }

        public /* synthetic */ String getTag$timber_release() {
            String str = this.explicitTag.get();
            if (str != null) {
                this.explicitTag.remove();
            }
            return str;
        }

        public void i(@Nullable String message, @NotNull Object... args) {
            b(4, null, message, Arrays.copyOf(args, args.length));
        }

        @Deprecated(message = "Use isLoggable(String, int)", replaceWith = @ReplaceWith(expression = "this.isLoggable(null, priority)", imports = {}))
        public boolean isLoggable(int priority) {
            return true;
        }

        public boolean isLoggable(@Nullable String tag, int priority) {
            return isLoggable(priority);
        }

        public abstract void log(int priority, @Nullable String tag, @NotNull String message, @Nullable Throwable t);

        public void log(int priority, @Nullable String message, @NotNull Object... args) {
            b(priority, null, message, Arrays.copyOf(args, args.length));
        }

        public void v(@Nullable String message, @NotNull Object... args) {
            b(2, null, message, Arrays.copyOf(args, args.length));
        }

        public void w(@Nullable String message, @NotNull Object... args) {
            b(5, null, message, Arrays.copyOf(args, args.length));
        }

        public void wtf(@Nullable String message, @NotNull Object... args) {
            b(7, null, message, Arrays.copyOf(args, args.length));
        }

        public void d(@Nullable Throwable t, @Nullable String message, @NotNull Object... args) {
            b(3, t, message, Arrays.copyOf(args, args.length));
        }

        public void e(@Nullable Throwable t, @Nullable String message, @NotNull Object... args) {
            b(6, t, message, Arrays.copyOf(args, args.length));
        }

        public void i(@Nullable Throwable t, @Nullable String message, @NotNull Object... args) {
            b(4, t, message, Arrays.copyOf(args, args.length));
        }

        public void log(int priority, @Nullable Throwable t, @Nullable String message, @NotNull Object... args) {
            b(priority, t, message, Arrays.copyOf(args, args.length));
        }

        public void v(@Nullable Throwable t, @Nullable String message, @NotNull Object... args) {
            b(2, t, message, Arrays.copyOf(args, args.length));
        }

        public void w(@Nullable Throwable t, @Nullable String message, @NotNull Object... args) {
            b(5, t, message, Arrays.copyOf(args, args.length));
        }

        public void wtf(@Nullable Throwable t, @Nullable String message, @NotNull Object... args) {
            b(7, t, message, Arrays.copyOf(args, args.length));
        }

        public void d(@Nullable Throwable t) {
            b(3, t, null, new Object[0]);
        }

        public void e(@Nullable Throwable t) {
            b(6, t, null, new Object[0]);
        }

        public void i(@Nullable Throwable t) {
            b(4, t, null, new Object[0]);
        }

        public void log(int priority, @Nullable Throwable t) {
            b(priority, t, null, new Object[0]);
        }

        public void v(@Nullable Throwable t) {
            b(2, t, null, new Object[0]);
        }

        public void w(@Nullable Throwable t) {
            b(5, t, null, new Object[0]);
        }

        public void wtf(@Nullable Throwable t) {
            b(7, t, null, new Object[0]);
        }
    }

    private Timber() {
        throw new AssertionError();
    }

    @JvmStatic
    @NotNull
    public static Tree asTree() {
        return INSTANCE.asTree();
    }

    @JvmStatic
    public static void d(@NonNls @Nullable String str, @NotNull Object... objArr) {
        INSTANCE.d(str, objArr);
    }

    @JvmStatic
    public static void d(@Nullable Throwable th) {
        INSTANCE.d(th);
    }

    @JvmStatic
    public static void d(@Nullable Throwable th, @NonNls @Nullable String str, @NotNull Object... objArr) {
        INSTANCE.d(th, str, objArr);
    }

    @JvmStatic
    public static void e(@NonNls @Nullable String str, @NotNull Object... objArr) {
        INSTANCE.e(str, objArr);
    }

    @JvmStatic
    public static void e(@Nullable Throwable th) {
        INSTANCE.e(th);
    }

    @JvmStatic
    public static void e(@Nullable Throwable th, @NonNls @Nullable String str, @NotNull Object... objArr) {
        INSTANCE.e(th, str, objArr);
    }

    @JvmStatic
    @NotNull
    public static final List<Tree> forest() {
        return INSTANCE.forest();
    }

    @JvmStatic
    public static void i(@NonNls @Nullable String str, @NotNull Object... objArr) {
        INSTANCE.i(str, objArr);
    }

    @JvmStatic
    public static void i(@Nullable Throwable th) {
        INSTANCE.i(th);
    }

    @JvmStatic
    public static void i(@Nullable Throwable th, @NonNls @Nullable String str, @NotNull Object... objArr) {
        INSTANCE.i(th, str, objArr);
    }

    @JvmStatic
    public static void log(int i, @NonNls @Nullable String str, @NotNull Object... objArr) {
        INSTANCE.log(i, str, objArr);
    }

    @JvmStatic
    public static void log(int i, @Nullable Throwable th) {
        INSTANCE.log(i, th);
    }

    @JvmStatic
    public static void log(int i, @Nullable Throwable th, @NonNls @Nullable String str, @NotNull Object... objArr) {
        INSTANCE.log(i, th, str, objArr);
    }

    @JvmStatic
    public static final void plant(@NotNull Tree tree) {
        INSTANCE.plant(tree);
    }

    @JvmStatic
    public static final void plant(@NotNull Tree... treeArr) {
        INSTANCE.plant(treeArr);
    }

    @JvmStatic
    @NotNull
    public static final Tree tag(@NotNull String str) {
        return INSTANCE.tag(str);
    }

    @JvmStatic
    @JvmName(name = "treeCount")
    public static final int treeCount() {
        return INSTANCE.treeCount();
    }

    @JvmStatic
    public static final void uproot(@NotNull Tree tree) {
        INSTANCE.uproot(tree);
    }

    @JvmStatic
    public static final void uprootAll() {
        INSTANCE.uprootAll();
    }

    @JvmStatic
    public static void v(@NonNls @Nullable String str, @NotNull Object... objArr) {
        INSTANCE.v(str, objArr);
    }

    @JvmStatic
    public static void v(@Nullable Throwable th) {
        INSTANCE.v(th);
    }

    @JvmStatic
    public static void v(@Nullable Throwable th, @NonNls @Nullable String str, @NotNull Object... objArr) {
        INSTANCE.v(th, str, objArr);
    }

    @JvmStatic
    public static void w(@NonNls @Nullable String str, @NotNull Object... objArr) {
        INSTANCE.w(str, objArr);
    }

    @JvmStatic
    public static void w(@Nullable Throwable th) {
        INSTANCE.w(th);
    }

    @JvmStatic
    public static void w(@Nullable Throwable th, @NonNls @Nullable String str, @NotNull Object... objArr) {
        INSTANCE.w(th, str, objArr);
    }

    @JvmStatic
    public static void wtf(@NonNls @Nullable String str, @NotNull Object... objArr) {
        INSTANCE.wtf(str, objArr);
    }

    @JvmStatic
    public static void wtf(@Nullable Throwable th) {
        INSTANCE.wtf(th);
    }

    @JvmStatic
    public static void wtf(@Nullable Throwable th, @NonNls @Nullable String str, @NotNull Object... objArr) {
        INSTANCE.wtf(th, str, objArr);
    }

    /* JADX INFO: renamed from: timber.log.Timber$Forest, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010(J3\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ=\u0010\b\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\b\u0010\fJ\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017J3\u0010\r\u001a\u00020\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\r\u0010\tJ=\u0010\r\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\r\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017J3\u0010\u000e\u001a\u00020\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u000e\u0010\tJ=\u0010\u000e\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000e\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017J3\u0010\u000f\u001a\u00020\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u000f\u0010\tJ=\u0010\u000f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u000f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017J3\u0010\u0010\u001a\u00020\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u0010\u0010\tJ=\u0010\u0010\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0010\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017J3\u0010\u0011\u001a\u00020\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u0011\u0010\tJ=\u0010\u0011\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u0011\u0010\fJ\u0012\u0010\u0011\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017J;\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u0014\u0010\u0015JE\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u0014\u0010\u0016J\u001a\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017J,\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\t\u0010\u0018\u001a\u00020\u0001H\u0097\bJ\u0010\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0002H\u0007J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0001H\u0007J#\u0010\u001a\u001a\u00020\u00072\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0004\"\u00020\u0001H\u0007¢\u0006\u0004\b\u001a\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0001H\u0007J\b\u0010\u001e\u001a\u00020\u0007H\u0007J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u001fH\u0007R\u0013\u0010!\u001a\u00020\u00128G@\u0006¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010&¨\u0006)"}, d2 = {"Ltimber/log/Timber$Forest;", "Ltimber/log/Timber$Tree;", "", "message", "", "", "args", "", "v", "(Ljava/lang/String;[Ljava/lang/Object;)V", "", "t", "(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", GoogleApiAvailabilityLight.a, "i", "w", "e", "wtf", "", "priority", "log", "(ILjava/lang/String;[Ljava/lang/Object;)V", "(ILjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "tag", "asTree", "tree", "plant", "trees", "([Ltimber/log/Timber$Tree;)V", "uproot", "uprootAll", "", "forest", "treeCount", "()I", "treeArray", "[Ltimber/log/Timber$Tree;", "Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "<init>", "()V", "timber_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion extends Tree {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public Tree asTree() {
            return this;
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void d(@NonNls @Nullable String message, @NotNull Object... args) {
            for (Tree tree : Timber.b) {
                tree.d(message, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void e(@NonNls @Nullable String message, @NotNull Object... args) {
            for (Tree tree : Timber.b) {
                tree.e(message, Arrays.copyOf(args, args.length));
            }
        }

        @JvmStatic
        @NotNull
        public final List<Tree> forest() {
            List<Tree> listUnmodifiableList;
            synchronized (Timber.a) {
                listUnmodifiableList = Collections.unmodifiableList(CollectionsKt___CollectionsKt.toList(Timber.a));
            }
            return listUnmodifiableList;
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void i(@NonNls @Nullable String message, @NotNull Object... args) {
            for (Tree tree : Timber.b) {
                tree.i(message, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void log(int priority, @NonNls @Nullable String message, @NotNull Object... args) {
            for (Tree tree : Timber.b) {
                tree.log(priority, message, Arrays.copyOf(args, args.length));
            }
        }

        @JvmStatic
        public final void plant(@NotNull Tree tree) {
            if (!(tree != this)) {
                throw new IllegalArgumentException("Cannot plant Timber into itself.".toString());
            }
            synchronized (Timber.a) {
                Timber.a.add(tree);
                Companion companion = Timber.INSTANCE;
                Object[] array = Timber.a.toArray(new Tree[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                Timber.b = (Tree[]) array;
                Unit unit = Unit.INSTANCE;
            }
        }

        @JvmStatic
        @NotNull
        public final Tree tag(@NotNull String tag) {
            Tree[] treeArr = Timber.b;
            int length = treeArr.length;
            int i = 0;
            while (i < length) {
                Tree tree = treeArr[i];
                i++;
                tree.getExplicitTag().set(tag);
            }
            return this;
        }

        @JvmStatic
        @JvmName(name = "treeCount")
        public final int treeCount() {
            return Timber.b.length;
        }

        @JvmStatic
        public final void uproot(@NotNull Tree tree) {
            synchronized (Timber.a) {
                if (!Timber.a.remove(tree)) {
                    throw new IllegalArgumentException(Intrinsics.stringPlus("Cannot uproot tree which is not planted: ", tree).toString());
                }
                Companion companion = Timber.INSTANCE;
                Object[] array = Timber.a.toArray(new Tree[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                Timber.b = (Tree[]) array;
                Unit unit = Unit.INSTANCE;
            }
        }

        @JvmStatic
        public final void uprootAll() {
            synchronized (Timber.a) {
                Timber.a.clear();
                Companion companion = Timber.INSTANCE;
                Timber.b = new Tree[0];
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void v(@NonNls @Nullable String message, @NotNull Object... args) {
            for (Tree tree : Timber.b) {
                tree.v(message, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void w(@NonNls @Nullable String message, @NotNull Object... args) {
            for (Tree tree : Timber.b) {
                tree.w(message, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void wtf(@NonNls @Nullable String message, @NotNull Object... args) {
            for (Tree tree : Timber.b) {
                tree.wtf(message, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void d(@Nullable Throwable t, @NonNls @Nullable String message, @NotNull Object... args) {
            for (Tree tree : Timber.b) {
                tree.d(t, message, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void e(@Nullable Throwable t, @NonNls @Nullable String message, @NotNull Object... args) {
            for (Tree tree : Timber.b) {
                tree.e(t, message, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void i(@Nullable Throwable t, @NonNls @Nullable String message, @NotNull Object... args) {
            for (Tree tree : Timber.b) {
                tree.i(t, message, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void log(int priority, @Nullable Throwable t, @NonNls @Nullable String message, @NotNull Object... args) {
            for (Tree tree : Timber.b) {
                tree.log(priority, t, message, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void v(@Nullable Throwable t, @NonNls @Nullable String message, @NotNull Object... args) {
            for (Tree tree : Timber.b) {
                tree.v(t, message, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void w(@Nullable Throwable t, @NonNls @Nullable String message, @NotNull Object... args) {
            for (Tree tree : Timber.b) {
                tree.w(t, message, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void wtf(@Nullable Throwable t, @NonNls @Nullable String message, @NotNull Object... args) {
            for (Tree tree : Timber.b) {
                tree.wtf(t, message, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void d(@Nullable Throwable t) {
            for (Tree tree : Timber.b) {
                tree.d(t);
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void e(@Nullable Throwable t) {
            for (Tree tree : Timber.b) {
                tree.e(t);
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void i(@Nullable Throwable t) {
            for (Tree tree : Timber.b) {
                tree.i(t);
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void log(int priority, @Nullable Throwable t) {
            for (Tree tree : Timber.b) {
                tree.log(priority, t);
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void v(@Nullable Throwable t) {
            for (Tree tree : Timber.b) {
                tree.v(t);
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void w(@Nullable Throwable t) {
            for (Tree tree : Timber.b) {
                tree.w(t);
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void wtf(@Nullable Throwable t) {
            for (Tree tree : Timber.b) {
                tree.wtf(t);
            }
        }

        @Override // timber.log.Timber.Tree
        public void log(int priority, @Nullable String tag, @NotNull String message, @Nullable Throwable t) {
            throw new AssertionError();
        }

        @JvmStatic
        public final void plant(@NotNull Tree... trees) {
            int length = trees.length;
            int i = 0;
            while (i < length) {
                Tree tree = trees[i];
                i++;
                if (tree == null) {
                    throw new IllegalArgumentException("trees contained null".toString());
                }
                if (!(tree != this)) {
                    throw new IllegalArgumentException("Cannot plant Timber into itself.".toString());
                }
            }
            synchronized (Timber.a) {
                Collections.addAll(Timber.a, Arrays.copyOf(trees, trees.length));
                Companion companion = Timber.INSTANCE;
                Object[] array = Timber.a.toArray(new Tree[0]);
                if (array != null) {
                    Timber.b = (Tree[]) array;
                    Unit unit = Unit.INSTANCE;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
        }
    }
}
