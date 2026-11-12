package androidx.work;

import android.content.Context;
import defpackage.ppe;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/work/DelegatingWorkerFactory;", "Landroidx/work/WorkerFactory;", "workerFactory", "", "addFactory", "(Landroidx/work/WorkerFactory;)V", "Landroid/content/Context;", "appContext", "", "workerClassName", "Landroidx/work/WorkerParameters;", "workerParameters", "Landroidx/work/a;", "createWorker", "(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Landroidx/work/a;", "", "factories", "Ljava/util/List;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
public class DelegatingWorkerFactory extends WorkerFactory {

    @NotNull
    private final List<WorkerFactory> factories = new CopyOnWriteArrayList();

    public final void addFactory(@NotNull WorkerFactory workerFactory) {
        Intrinsics.checkNotNullParameter(workerFactory, "workerFactory");
        this.factories.add(workerFactory);
    }

    @Override // androidx.work.WorkerFactory
    @Nullable
    public final a createWorker(@NotNull Context appContext, @NotNull String workerClassName, @NotNull WorkerParameters workerParameters) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        Iterator<T> it = this.factories.iterator();
        while (it.hasNext()) {
            try {
                a aVarCreateWorker = ((WorkerFactory) it.next()).createWorker(appContext, workerClassName, workerParameters);
                if (aVarCreateWorker != null) {
                    return aVarCreateWorker;
                }
            } catch (Throwable th) {
                ppe.e().d(DelegatingWorkerFactoryKt.TAG, "Unable to instantiate a ListenableWorker (" + workerClassName + ')', th);
                throw th;
            }
        }
        return null;
    }
}
