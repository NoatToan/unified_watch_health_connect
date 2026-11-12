package androidx.work.impl.utils;

import androidx.annotation.VisibleForTesting;
import androidx.work.Configuration;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.WorkRequest;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.impl.workers.ConstraintTrackingWorkerKt;
import defpackage.jfl;
import defpackage.pmr;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\f\u001a%\u0010\u0011\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a%\u0010\u0016\u001a\u00020\u00152\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0018\u001a\u00020\u00138\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001a\u001a\u00020\u00138\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019\"\u0014\u0010\u001b\u001a\u00020\u00138\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019\"\u0014\u0010\u001c\u001a\u00020\u00138\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/Configuration;", "configuration", "Lpmr;", "continuation", "", "checkContentUriTriggerWorkerLimits", "(Landroidx/work/impl/WorkDatabase;Landroidx/work/Configuration;Lpmr;)V", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "tryDelegateRemoteListenableWorker", "(Landroidx/work/impl/model/WorkSpec;)Landroidx/work/impl/model/WorkSpec;", "tryDelegateConstrainedWorkSpec", "", "Ljfl;", "schedulers", "wrapWorkSpecIfNeeded", "(Ljava/util/List;Landroidx/work/impl/model/WorkSpec;)Landroidx/work/impl/model/WorkSpec;", "", "className", "", "usesScheduler", "(Ljava/util/List;Ljava/lang/String;)Z", "ARGUMENT_SERVICE_PACKAGE_NAME", "Ljava/lang/String;", "ARGUMENT_SERVICE_CLASS_NAME", "REMOTE_DELEGATING_LISTENABLE_WORKER_CLASS_NAME", "ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", "work-runtime_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEnqueueUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnqueueUtils.kt\nandroidx/work/impl/utils/EnqueueUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Data_.kt\nandroidx/work/Data\n*L\n1#1,168:1\n1774#2,4:169\n1747#2,3:177\n1#3:173\n229#4:174\n229#4:175\n229#4:176\n*S KotlinDebug\n*F\n+ 1 EnqueueUtils.kt\nandroidx/work/impl/utils/EnqueueUtilsKt\n*L\n45#1:169,4\n140#1:177,3\n71#1:174\n72#1:175\n73#1:176\n*E\n"})
public final class EnqueueUtilsKt {

    @NotNull
    public static final String ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME = "androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME";

    @NotNull
    public static final String ARGUMENT_SERVICE_CLASS_NAME = "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME";

    @NotNull
    public static final String ARGUMENT_SERVICE_PACKAGE_NAME = "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME";

    @NotNull
    public static final String REMOTE_DELEGATING_LISTENABLE_WORKER_CLASS_NAME = "androidx.work.multiprocess.RemoteListenableDelegatingWorker";

    public static final void checkContentUriTriggerWorkerLimits(@NotNull WorkDatabase workDatabase, @NotNull Configuration configuration, @NotNull pmr continuation) {
        int i;
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        List listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(continuation);
        int i2 = 0;
        while (!listMutableListOf.isEmpty()) {
            pmr pmrVar = (pmr) CollectionsKt__MutableCollectionsKt.removeLast(listMutableListOf);
            List<? extends WorkRequest> listG = pmrVar.g();
            Intrinsics.checkNotNullExpressionValue(listG, "current.work");
            List<? extends WorkRequest> list = listG;
            if ((list instanceof Collection) && list.isEmpty()) {
                i = 0;
            } else {
                Iterator<T> it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (((WorkRequest) it.next()).getWorkSpec().constraints.hasContentUriTriggers() && (i = i + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
            }
            i2 += i;
            List<pmr> listF = pmrVar.f();
            if (listF != null) {
                listMutableListOf.addAll(listF);
            }
        }
        if (i2 == 0) {
            return;
        }
        int iCountNonFinishedContentUriTriggerWorkers = workDatabase.workSpecDao().countNonFinishedContentUriTriggerWorkers();
        int contentUriTriggerWorkersLimit = configuration.getContentUriTriggerWorkersLimit();
        if (iCountNonFinishedContentUriTriggerWorkers + i2 <= contentUriTriggerWorkersLimit) {
            return;
        }
        throw new IllegalArgumentException("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: " + contentUriTriggerWorkersLimit + ";\nalready enqueued count: " + iCountNonFinishedContentUriTriggerWorkers + ";\ncurrent enqueue operation count: " + i2 + ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
    }

    @NotNull
    public static final WorkSpec tryDelegateConstrainedWorkSpec(@NotNull WorkSpec workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Constraints constraints = workSpec.constraints;
        String str = workSpec.workerClassName;
        if (Intrinsics.areEqual(str, ConstraintTrackingWorker.class.getName())) {
            return workSpec;
        }
        if (!constraints.getRequiresBatteryNotLow() && !constraints.getRequiresStorageNotLow()) {
            return workSpec;
        }
        Data dataBuild = new Data.Builder().putAll(workSpec.input).putString(ConstraintTrackingWorkerKt.ARGUMENT_CLASS_NAME, str).build();
        String name = ConstraintTrackingWorker.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "name");
        return WorkSpec.copy$default(workSpec, null, null, name, null, dataBuild, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 16777195, null);
    }

    @VisibleForTesting
    @NotNull
    public static final WorkSpec tryDelegateRemoteListenableWorker(@NotNull WorkSpec workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        boolean zHasKeyWithValueOfType = workSpec.input.hasKeyWithValueOfType(ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME, String.class);
        boolean zHasKeyWithValueOfType2 = workSpec.input.hasKeyWithValueOfType(ARGUMENT_SERVICE_PACKAGE_NAME, String.class);
        boolean zHasKeyWithValueOfType3 = workSpec.input.hasKeyWithValueOfType(ARGUMENT_SERVICE_CLASS_NAME, String.class);
        if (zHasKeyWithValueOfType || !zHasKeyWithValueOfType2 || !zHasKeyWithValueOfType3) {
            return workSpec;
        }
        return WorkSpec.copy$default(workSpec, null, null, REMOTE_DELEGATING_LISTENABLE_WORKER_CLASS_NAME, null, new Data.Builder().putAll(workSpec.input).putString(ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME, workSpec.workerClassName).build(), null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 16777195, null);
    }

    private static final boolean usesScheduler(List<? extends jfl> list, String str) {
        try {
            Class<?> cls = Class.forName(str);
            List<? extends jfl> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (cls.isAssignableFrom(((jfl) it.next()).getClass())) {
                    return true;
                }
            }
            return false;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @NotNull
    public static final WorkSpec wrapWorkSpecIfNeeded(@NotNull List<? extends jfl> schedulers, @NotNull WorkSpec workSpec) {
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return tryDelegateRemoteListenableWorker(workSpec);
    }
}
