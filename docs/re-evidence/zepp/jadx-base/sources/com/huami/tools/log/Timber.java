package com.huami.tools.log;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/tools/log/Timber;", "", "<init>", "()V", "Forest", "log_release"}, k = 1, mv = {1, 4, 0})
public final class Timber {

    /* JADX INFO: renamed from: Forest, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ArrayList<Tree> a = new ArrayList<>();
    private static volatile Tree[] b = new Tree[0];

    /* JADX INFO: renamed from: com.huami.tools.log.Timber$Forest, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J=\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\f\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\f\u0010\u000bJ=\u0010\r\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\r\u0010\u000bJ=\u0010\u000e\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\u000e\u0010\u000bJE\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\u0010\u0010\u0011JO\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J6\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\t\u0010\u0019\u001a\u00020\u0001H\u0097\bJ\u0010\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0004H\u0007J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0001H\u0007J#\u0010\u001b\u001a\u00020\t2\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001H\u0007¢\u0006\u0004\b\u001b\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0001H\u0007J\b\u0010\u001f\u001a\u00020\tH\u0007J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010 H\u0007R\u0013\u0010\"\u001a\u00020\u00128G@\u0006¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010'¨\u0006*"}, d2 = {"Lcom/huami/tools/log/Timber$Forest;", "Lcom/huami/tools/log/Tree;", "", "t", "", "message", "", "", "args", "", "v", "(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", GoogleApiAvailabilityLight.a, "i", "w", "code", "e", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "", "priority", "log", "(ILjava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "tag", "", "isLoggable", "asTree", "tree", "plant", "trees", "([Lcom/huami/tools/log/Tree;)V", "uproot", "uprootAll", "", "forest", "treeCount", "()I", "treeArray", "[Lcom/huami/tools/log/Tree;", "Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "<init>", "()V", "log_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion extends Tree {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        public Tree asTree() {
            return this;
        }

        @Override // com.huami.tools.log.Tree
        @JvmStatic
        public void d(@Nullable Throwable t, @NonNls @Nullable String message, @NotNull Object... args) {
            for (Tree tree : Timber.b) {
                tree.d(t, message, Arrays.copyOf(args, args.length));
            }
        }

        @Override // com.huami.tools.log.Tree
        @JvmStatic
        public void e(@NotNull String code, @Nullable Throwable t, @NonNls @Nullable String message, @NotNull Object... args) {
            for (Tree tree : Timber.b) {
                tree.e(code, t, message, Arrays.copyOf(args, args.length));
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

        @Override // com.huami.tools.log.Tree
        @JvmStatic
        public void i(@Nullable Throwable t, @NonNls @Nullable String message, @NotNull Object... args) {
            for (Tree tree : Timber.b) {
                tree.i(t, message, Arrays.copyOf(args, args.length));
            }
        }

        @Override // com.huami.tools.log.Tree
        public boolean isLoggable(@Nullable String tag, int priority) {
            for (Tree tree : Timber.b) {
                if (tree.isLoggable(tag, priority)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.huami.tools.log.Tree
        @JvmStatic
        public void log(int priority, @Nullable String code, @Nullable Throwable t, @NonNls @Nullable String message, @NotNull Object... args) {
            for (Tree tree : Timber.b) {
                tree.log(priority, code, t, message, Arrays.copyOf(args, args.length));
            }
        }

        @JvmStatic
        public final void plant(@NotNull Tree tree) {
            if (!(tree != this)) {
                throw new IllegalArgumentException("Cannot plant Timber into itself.".toString());
            }
            synchronized (Timber.a) {
                Timber.a.add(tree);
                Object[] array = Timber.a.toArray(new Tree[0]);
                if (array == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                Timber.b = (Tree[]) array;
                Unit unit = Unit.INSTANCE;
            }
        }

        @JvmStatic
        @NotNull
        public final Tree tag(@NotNull String tag) {
            for (Tree tree : Timber.b) {
                tree.getExplicitTag$log_release().set(tag);
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
                    throw new IllegalArgumentException(("Cannot uproot tree which is not planted: " + tree).toString());
                }
                Object[] array = Timber.a.toArray(new Tree[0]);
                if (array == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                Timber.b = (Tree[]) array;
                Unit unit = Unit.INSTANCE;
            }
        }

        @JvmStatic
        public final void uprootAll() {
            synchronized (Timber.a) {
                Timber.a.clear();
                Timber.b = new Tree[0];
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // com.huami.tools.log.Tree
        @JvmStatic
        public void v(@Nullable Throwable t, @NonNls @Nullable String message, @NotNull Object... args) {
            for (Tree tree : Timber.b) {
                tree.v(t, message, Arrays.copyOf(args, args.length));
            }
        }

        @Override // com.huami.tools.log.Tree
        @JvmStatic
        public void w(@Nullable Throwable t, @NonNls @Nullable String message, @NotNull Object... args) {
            for (Tree tree : Timber.b) {
                tree.w(t, message, Arrays.copyOf(args, args.length));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.huami.tools.log.Tree
        public void log(int priority, @Nullable String tag, @NotNull String message, @Nullable String code, @Nullable Throwable t) {
            throw new AssertionError();
        }

        @JvmStatic
        public final void plant(@NotNull Tree... trees) {
            int length = trees.length;
            for (int i = 0; i < length; i++) {
                Tree tree = trees[i];
                if (tree == null) {
                    throw new IllegalArgumentException("trees contained null".toString());
                }
                if (!(tree != this)) {
                    throw new IllegalArgumentException("Cannot plant Timber into itself.".toString());
                }
            }
            synchronized (Timber.a) {
                Collections.addAll(Timber.a, (Tree[]) Arrays.copyOf(trees, trees.length));
                Object[] array = Timber.a.toArray(new Tree[0]);
                if (array != null) {
                    Timber.b = (Tree[]) array;
                    Unit unit = Unit.INSTANCE;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
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
    public static void d(@Nullable Throwable th, @NonNls @Nullable String str, @NotNull Object... objArr) {
        INSTANCE.d(th, str, objArr);
    }

    @JvmStatic
    public static void e(@NotNull String str, @Nullable Throwable th, @NonNls @Nullable String str2, @NotNull Object... objArr) {
        INSTANCE.e(str, th, str2, objArr);
    }

    @JvmStatic
    @NotNull
    public static final List<Tree> forest() {
        return INSTANCE.forest();
    }

    @JvmStatic
    public static void i(@Nullable Throwable th, @NonNls @Nullable String str, @NotNull Object... objArr) {
        INSTANCE.i(th, str, objArr);
    }

    @JvmStatic
    public static void log(int i, @Nullable String str, @Nullable Throwable th, @NonNls @Nullable String str2, @NotNull Object... objArr) {
        INSTANCE.log(i, str, th, str2, objArr);
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
    public static void v(@Nullable Throwable th, @NonNls @Nullable String str, @NotNull Object... objArr) {
        INSTANCE.v(th, str, objArr);
    }

    @JvmStatic
    public static void w(@Nullable Throwable th, @NonNls @Nullable String str, @NotNull Object... objArr) {
        INSTANCE.w(th, str, objArr);
    }
}
