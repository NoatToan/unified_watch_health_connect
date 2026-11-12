package com.huami.dev;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tekartik.sqflite.Constant;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007J\b\u0010\b\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\u0002H\u0007J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0007J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0007J\u001a\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0007J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0007J\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0007J\u0012\u0010\u0010\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0007J\u001a\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0007J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0007J\u001a\u0010\u0012\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0007J\u0012\u0010\u0012\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0007J\u001a\u0010\u0013\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0007J\u0012\u0010\u0013\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0007J$\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0002J\"\u0010\u0018\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0002R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001d\u0010)\u001a\u00020&8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010'\u001a\u0004\b\u001a\u0010(¨\u0006,"}, d2 = {"Lcom/huami/dev/Logcat;", "", "", "setup", "Ltimber/log/Timber$Tree;", "tree", "plant", "plantTerminalTree", "uprootTerminalTree", "uproot", "uprootAll", "", "tag", "message", "v", GoogleApiAvailabilityLight.a, "i", "w", "e", "wft", "", Constant.e, "c", FirebaseAnalytics.Param.LEVEL, "b", "", "a", "Z", "getEnable", "()Z", "setEnable", "(Z)V", "enable", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "setTag", "(Ljava/lang/String;)V", "Lcom/huami/dev/LogcatTree;", "Lkotlin/Lazy;", "()Lcom/huami/dev/LogcatTree;", "terminalTree", "<init>", "()V", "logcat_release"}, k = 1, mv = {1, 5, 1})
public final class Logcat {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static boolean enable;

    @NotNull
    public static final Logcat INSTANCE = new Logcat();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static String tag = "Logcat";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final Lazy terminalTree = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/dev/LogcatTree;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<LogcatTree> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LogcatTree invoke() {
            return new LogcatTree();
        }
    }

    private Logcat() {
    }

    private final LogcatTree a() {
        return (LogcatTree) terminalTree.getValue();
    }

    private final void b(String tag2, int level, Object message) {
        if (enable) {
            Timber.tag(tag2).log(level, LogcatKt.e(message), null);
        }
    }

    private final void c(String tag2, int logLevel, Object message) {
        if (enable) {
            b(tag2, logLevel, LogcatKt.e(message));
        }
    }

    @JvmStatic
    public static final void d(@NotNull String tag2, @Nullable Object message) {
        INSTANCE.c(tag2, 3, message);
    }

    @JvmStatic
    public static final void e(@NotNull String tag2, @Nullable Object message) {
        INSTANCE.c(tag2, 6, message);
    }

    public static /* synthetic */ void f(Logcat logcat, String str, int i, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            str = tag;
        }
        logcat.c(str, i, obj);
    }

    @JvmStatic
    public static final void i(@NotNull String tag2, @Nullable Object message) {
        INSTANCE.c(tag2, 4, message);
    }

    @JvmStatic
    public static final void plant(@NotNull Timber.Tree tree) {
        Timber.plant(tree);
    }

    @JvmStatic
    public static final void plantTerminalTree() {
        List<Timber.Tree> listForest = Timber.forest();
        Logcat logcat = INSTANCE;
        if (listForest.contains(logcat.a())) {
            return;
        }
        plant(logcat.a());
    }

    @JvmStatic
    public static final void setup() {
        enable = true;
        plantTerminalTree();
    }

    @JvmStatic
    public static final void uproot(@NotNull Timber.Tree tree) {
        Timber.uproot(tree);
    }

    @JvmStatic
    public static final void uprootAll() {
        Timber.uprootAll();
    }

    @JvmStatic
    public static final void uprootTerminalTree() {
        List<Timber.Tree> listForest = Timber.forest();
        Logcat logcat = INSTANCE;
        if (listForest.contains(logcat.a())) {
            uproot(logcat.a());
        }
    }

    @JvmStatic
    public static final void v(@NotNull String tag2, @Nullable Object message) {
        INSTANCE.c(tag2, 2, message);
    }

    @JvmStatic
    public static final void w(@NotNull String tag2, @Nullable Object message) {
        INSTANCE.c(tag2, 5, message);
    }

    @JvmStatic
    public static final void wft(@NotNull String tag2, @Nullable Object message) {
        INSTANCE.c(tag2, -1, message);
    }

    public final boolean getEnable() {
        return enable;
    }

    @NotNull
    public final String getTag() {
        return tag;
    }

    public final void setEnable(boolean z) {
        enable = z;
    }

    public final void setTag(@NotNull String str) {
        tag = str;
    }

    @JvmStatic
    public static final void d(@Nullable Object message) {
        f(INSTANCE, null, 3, message, 1, null);
    }

    @JvmStatic
    public static final void e(@Nullable Object message) {
        f(INSTANCE, null, 6, message, 1, null);
    }

    @JvmStatic
    public static final void i(@Nullable Object message) {
        f(INSTANCE, null, 4, message, 1, null);
    }

    @JvmStatic
    public static final void v(@Nullable Object message) {
        f(INSTANCE, null, 2, message, 1, null);
    }

    @JvmStatic
    public static final void w(@Nullable Object message) {
        INSTANCE.c(tag, 5, message);
    }

    @JvmStatic
    public static final void wft(@Nullable Object message) {
        INSTANCE.c(tag, -1, message);
    }
}
