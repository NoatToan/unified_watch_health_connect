package com.huami.applet.jslog;

import com.huami.tools.log.HMLog;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006H\u0007J4\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006H\u0003J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0007J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0007J\b\u0010\u0011\u001a\u00020\bH\u0007J\b\u0010\u0012\u001a\u00020\bH\u0007J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0007J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0003¨\u0006\u0018"}, d2 = {"Lcom/huami/applet/jslog/JsLog;", "", "", "tag", "", "throwable", "Lkotlin/Function0;", "messageCollector", "", "info", "", "priority", "a", "Ltimber/log/Timber$Tree;", "tree", "plant", "uproot", "uprootAll", "cleanJsLog", "getLogFileDir", "Lcom/huami/applet/jslog/JsLogTree;", "c", "<init>", "()V", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class JsLog {

    @NotNull
    public static final JsLog INSTANCE = new JsLog();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("Js app write log error : ", this.a);
        }
    }

    private JsLog() {
    }

    @JvmStatic
    private static final void a(int priority, String tag, Throwable throwable, Function0<String> messageCollector) {
        try {
            Timber.tag(tag).log(priority, throwable, messageCollector.invoke(), null);
        } catch (Exception e) {
            HMLog.error$default("JsLog", null, null, new a(e), 6, null);
        }
    }

    public static /* synthetic */ void b(int i, String str, Throwable th, Function0 function0, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            th = null;
        }
        a(i, str, th, function0);
    }

    @JvmStatic
    private static final JsLogTree c() {
        for (Timber.Tree tree : Timber.forest()) {
            if (tree instanceof JsLogTree) {
                return (JsLogTree) tree;
            }
        }
        return null;
    }

    @JvmStatic
    public static final void cleanJsLog() {
        JsLogTree jsLogTreeC;
        List<Timber.Tree> listForest = Timber.forest();
        boolean z = false;
        if (!(listForest instanceof Collection) || !listForest.isEmpty()) {
            Iterator<T> it2 = listForest.iterator();
            while (it2.hasNext()) {
                if (((Timber.Tree) it2.next()) instanceof JsLogTree) {
                    z = true;
                    break;
                }
            }
        }
        if (!z || (jsLogTreeC = c()) == null) {
            return;
        }
        jsLogTreeC.clearLogFile();
    }

    @JvmStatic
    @Nullable
    public static final String getLogFileDir() {
        JsLogTree jsLogTreeC;
        List<Timber.Tree> listForest = Timber.forest();
        boolean z = false;
        if (!(listForest instanceof Collection) || !listForest.isEmpty()) {
            Iterator<T> it2 = listForest.iterator();
            while (it2.hasNext()) {
                if (((Timber.Tree) it2.next()) instanceof JsLogTree) {
                    z = true;
                    break;
                }
            }
        }
        if (!z || (jsLogTreeC = c()) == null) {
            return null;
        }
        return jsLogTreeC.getLogFileDir();
    }

    @JvmStatic
    @JvmOverloads
    public static final void info(@NotNull String tag, @Nullable Throwable throwable, @NotNull Function0<String> messageCollector) {
        a(4, tag, throwable, messageCollector);
    }

    @JvmStatic
    @JvmOverloads
    public static final void info(@NotNull String str, @NotNull Function0<String> function0) {
        info$default(str, null, function0, 2, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void info(@NotNull Function0<String> function0) {
        info$default(null, null, function0, 3, null);
    }

    public static /* synthetic */ void info$default(String str, Throwable th, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            th = null;
        }
        info(str, th, function0);
    }

    @JvmStatic
    public static final void plant(@NotNull Timber.Tree tree) {
        Timber.plant(tree);
    }

    @JvmStatic
    public static final void uproot(@NotNull Timber.Tree tree) {
        Timber.uproot(tree);
    }

    @JvmStatic
    public static final void uprootAll() {
        Timber.uprootAll();
    }
}
