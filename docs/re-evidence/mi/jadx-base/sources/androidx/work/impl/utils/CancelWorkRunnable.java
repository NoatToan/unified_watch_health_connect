package androidx.work.impl.utils;

import androidx.work.OperationKt;
import androidx.work.Tracer;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.CancelWorkRunnable;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.enr;
import defpackage.f7i;
import defpackage.jfl;
import defpackage.mwl;
import defpackage.qfl;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0014\u001a\u001d\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0015\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lenr;", "workManagerImpl", "", "workSpecId", "", BroadcastsKt.SILENT_PUSHING_CANCEL, "(Lenr;Ljava/lang/String;)V", "reschedulePendingWorkers", "(Lenr;)V", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "iterativelyCancelWorkAndDependents", "(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;)V", "Ljava/util/UUID;", "id", "Landroidx/work/b;", "forId", "(Ljava/util/UUID;Lenr;)Landroidx/work/b;", "tag", "forTag", "(Ljava/lang/String;Lenr;)Landroidx/work/b;", "name", "forName", "forNameInline", "(Ljava/lang/String;Lenr;)V", "forAll", "(Lenr;)Landroidx/work/b;", "work-runtime_release"}, k = 2, mv = {1, 8, 0})
@JvmName(name = "CancelWorkRunnable")
public final class CancelWorkRunnable {

    /* JADX INFO: renamed from: androidx.work.impl.utils.CancelWorkRunnable$forAll$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        final /* synthetic */ enr $workManagerImpl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(enr enrVar) {
            super(0);
            this.$workManagerImpl = enrVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(WorkDatabase workDatabase, enr enrVar) {
            Iterator<String> it = workDatabase.workSpecDao().getAllUnfinishedWork().iterator();
            while (it.hasNext()) {
                CancelWorkRunnable.cancel(enrVar, it.next());
            }
            new f7i(workDatabase).h(enrVar.getConfiguration().getClock().currentTimeMillis());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            final WorkDatabase workDatabaseJ = this.$workManagerImpl.j();
            Intrinsics.checkNotNullExpressionValue(workDatabaseJ, "workManagerImpl.workDatabase");
            final enr enrVar = this.$workManagerImpl;
            workDatabaseJ.runInTransaction(new Runnable() { // from class: androidx.work.impl.utils.a
                @Override // java.lang.Runnable
                public final void run() {
                    CancelWorkRunnable.AnonymousClass1.invoke$lambda$0(workDatabaseJ, enrVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.CancelWorkRunnable$forId$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C13131 extends Lambda implements Function0<Unit> {
        final /* synthetic */ UUID $id;
        final /* synthetic */ enr $workManagerImpl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13131(enr enrVar, UUID uuid) {
            super(0);
            this.$workManagerImpl = enrVar;
            this.$id = uuid;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(enr enrVar, UUID uuid) {
            String string = uuid.toString();
            Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
            CancelWorkRunnable.cancel(enrVar, string);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            WorkDatabase workDatabaseJ = this.$workManagerImpl.j();
            Intrinsics.checkNotNullExpressionValue(workDatabaseJ, "workManagerImpl.workDatabase");
            final enr enrVar = this.$workManagerImpl;
            final UUID uuid = this.$id;
            workDatabaseJ.runInTransaction(new Runnable() { // from class: androidx.work.impl.utils.b
                @Override // java.lang.Runnable
                public final void run() {
                    CancelWorkRunnable.C13131.invoke$lambda$0(enrVar, uuid);
                }
            });
            CancelWorkRunnable.reschedulePendingWorkers(this.$workManagerImpl);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.CancelWorkRunnable$forTag$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C13151 extends Lambda implements Function0<Unit> {
        final /* synthetic */ String $tag;
        final /* synthetic */ enr $workManagerImpl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13151(enr enrVar, String str) {
            super(0);
            this.$workManagerImpl = enrVar;
            this.$tag = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(WorkDatabase workDatabase, String str, enr enrVar) {
            Iterator<String> it = workDatabase.workSpecDao().getUnfinishedWorkWithTag(str).iterator();
            while (it.hasNext()) {
                CancelWorkRunnable.cancel(enrVar, it.next());
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            final WorkDatabase workDatabaseJ = this.$workManagerImpl.j();
            Intrinsics.checkNotNullExpressionValue(workDatabaseJ, "workManagerImpl.workDatabase");
            final String str = this.$tag;
            final enr enrVar = this.$workManagerImpl;
            workDatabaseJ.runInTransaction(new Runnable() { // from class: androidx.work.impl.utils.c
                @Override // java.lang.Runnable
                public final void run() {
                    CancelWorkRunnable.C13151.invoke$lambda$0(workDatabaseJ, str, enrVar);
                }
            });
            CancelWorkRunnable.reschedulePendingWorkers(this.$workManagerImpl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cancel(enr enrVar, String str) {
        WorkDatabase workDatabaseJ = enrVar.j();
        Intrinsics.checkNotNullExpressionValue(workDatabaseJ, "workManagerImpl.workDatabase");
        iterativelyCancelWorkAndDependents(workDatabaseJ, str);
        androidx.work.impl.a aVarG = enrVar.g();
        Intrinsics.checkNotNullExpressionValue(aVarG, "workManagerImpl.processor");
        aVarG.t(str, 1);
        Iterator<jfl> it = enrVar.h().iterator();
        while (it.hasNext()) {
            it.next().cancel(str);
        }
    }

    @NotNull
    public static final androidx.work.b forAll(@NotNull enr workManagerImpl) {
        Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        mwl mwlVarD = workManagerImpl.l().d();
        Intrinsics.checkNotNullExpressionValue(mwlVarD, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return OperationKt.launchOperation(tracer, "CancelAllWork", mwlVarD, new AnonymousClass1(workManagerImpl));
    }

    @NotNull
    public static final androidx.work.b forId(@NotNull UUID id, @NotNull enr workManagerImpl) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        mwl mwlVarD = workManagerImpl.l().d();
        Intrinsics.checkNotNullExpressionValue(mwlVarD, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return OperationKt.launchOperation(tracer, "CancelWorkById", mwlVarD, new C13131(workManagerImpl, id));
    }

    @NotNull
    public static final androidx.work.b forName(@NotNull final String name, @NotNull final enr workManagerImpl) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        String str = "CancelWorkByName_" + name;
        mwl mwlVarD = workManagerImpl.l().d();
        Intrinsics.checkNotNullExpressionValue(mwlVarD, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return OperationKt.launchOperation(tracer, str, mwlVarD, new Function0<Unit>() { // from class: androidx.work.impl.utils.CancelWorkRunnable.forName.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                CancelWorkRunnable.forNameInline(name, workManagerImpl);
                CancelWorkRunnable.reschedulePendingWorkers(workManagerImpl);
            }
        });
    }

    public static final void forNameInline(@NotNull final String name, @NotNull final enr workManagerImpl) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        final WorkDatabase workDatabaseJ = workManagerImpl.j();
        Intrinsics.checkNotNullExpressionValue(workDatabaseJ, "workManagerImpl.workDatabase");
        workDatabaseJ.runInTransaction(new Runnable() { // from class: mi3
            @Override // java.lang.Runnable
            public final void run() {
                CancelWorkRunnable.forNameInline$lambda$0(workDatabaseJ, name, workManagerImpl);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void forNameInline$lambda$0(WorkDatabase workDatabase, String str, enr enrVar) {
        Iterator<String> it = workDatabase.workSpecDao().getUnfinishedWorkWithName(str).iterator();
        while (it.hasNext()) {
            cancel(enrVar, it.next());
        }
    }

    @NotNull
    public static final androidx.work.b forTag(@NotNull String tag, @NotNull enr workManagerImpl) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        String str = "CancelWorkByTag_" + tag;
        mwl mwlVarD = workManagerImpl.l().d();
        Intrinsics.checkNotNullExpressionValue(mwlVarD, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return OperationKt.launchOperation(tracer, str, mwlVarD, new C13151(workManagerImpl, tag));
    }

    private static final void iterativelyCancelWorkAndDependents(WorkDatabase workDatabase, String str) {
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        DependencyDao dependencyDao = workDatabase.dependencyDao();
        List listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(str);
        while (!listMutableListOf.isEmpty()) {
            String str2 = (String) CollectionsKt__MutableCollectionsKt.removeLast(listMutableListOf);
            WorkInfo.State state = workSpecDao.getState(str2);
            if (state != WorkInfo.State.SUCCEEDED && state != WorkInfo.State.FAILED) {
                workSpecDao.setCancelledState(str2);
            }
            listMutableListOf.addAll(dependencyDao.getDependentWorkIds(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reschedulePendingWorkers(enr enrVar) {
        qfl.h(enrVar.getConfiguration(), enrVar.j(), enrVar.h());
    }
}
