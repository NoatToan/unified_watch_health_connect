package androidx.work;

import android.content.Context;
import androidx.annotation.RestrictTo;
import defpackage.ppe;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ)\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/work/WorkerFactory;", "", "Landroid/content/Context;", "appContext", "", "workerClassName", "Landroidx/work/WorkerParameters;", "workerParameters", "Landroidx/work/a;", "createWorker", "(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Landroidx/work/a;", "createWorkerWithDefaultFallback", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
public abstract class WorkerFactory {
    private static final a createWorkerWithDefaultFallback$fallbackToReflection(Context context, String str, WorkerParameters workerParameters) {
        try {
            a aVarNewInstance = createWorkerWithDefaultFallback$getWorkerClass(str).getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            Intrinsics.checkNotNullExpressionValue(aVarNewInstance, "{\n                val co…Parameters)\n            }");
            return aVarNewInstance;
        } catch (Throwable th) {
            ppe.e().d(WorkerFactoryKt.TAG, "Could not instantiate " + str, th);
            throw th;
        }
    }

    private static final Class<? extends a> createWorkerWithDefaultFallback$getWorkerClass(String str) {
        try {
            Class clsAsSubclass = Class.forName(str).asSubclass(a.class);
            Intrinsics.checkNotNullExpressionValue(clsAsSubclass, "{\n                Class.…class.java)\n            }");
            return clsAsSubclass;
        } catch (Throwable th) {
            ppe.e().d(WorkerFactoryKt.TAG, "Invalid class: " + str, th);
            throw th;
        }
    }

    @Nullable
    public abstract a createWorker(@NotNull Context appContext, @NotNull String workerClassName, @NotNull WorkerParameters workerParameters);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final a createWorkerWithDefaultFallback(@NotNull Context appContext, @NotNull String workerClassName, @NotNull WorkerParameters workerParameters) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        a aVarCreateWorker = createWorker(appContext, workerClassName, workerParameters);
        if (aVarCreateWorker == null) {
            aVarCreateWorker = createWorkerWithDefaultFallback$fallbackToReflection(appContext, workerClassName, workerParameters);
        }
        if (!aVarCreateWorker.isUsed()) {
            return aVarCreateWorker;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + workerClassName + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
