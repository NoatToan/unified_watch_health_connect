package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.work.Configuration;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableFutureKt;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.TracerKt;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import androidx.work.WorkQuery;
import androidx.work.WorkRequest;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.UnfinishedWorkListenerKt;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImplExtKt;
import androidx.work.impl.WorkerUpdater;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.RawWorkInfoDaoKt;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDaoKt;
import androidx.work.impl.utils.CancelWorkRunnable;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.PruneWorkRunnableKt;
import androidx.work.impl.utils.RawQueries;
import androidx.work.impl.utils.StatusRunnable;
import androidx.work.impl.utils.StopWorkRunnable;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class enr extends WorkManager {
    public static final String l = ppe.i("WorkManagerImpl");
    public static enr m = null;
    public static enr n = null;
    public static final Object o = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f16855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Configuration f16856b;
    public WorkDatabase c;
    public m1p d;
    public List<jfl> e;
    public androidx.work.impl.a f;
    public f7i g;
    public boolean h = false;
    public BroadcastReceiver.PendingResult i;
    public final Trackers j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CoroutineScope f16857k;

    public class a implements Function<List<WorkSpec.WorkInfoPojo>, WorkInfo> {
        public a() {
        }

        @Override // androidx.arch.core.util.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WorkInfo apply(List<WorkSpec.WorkInfoPojo> list) {
            if (list == null || list.size() <= 0) {
                return null;
            }
            return list.get(0).toWorkInfo();
        }
    }

    @RequiresApi(24)
    public static class b {
        public static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public enr(Context context, Configuration configuration, m1p m1pVar, WorkDatabase workDatabase, List<jfl> list, androidx.work.impl.a aVar, Trackers trackers) {
        Context applicationContext = context.getApplicationContext();
        if (b.a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        ppe.h(new ppe.a(configuration.getMinimumLoggingLevel()));
        this.f16855a = applicationContext;
        this.d = m1pVar;
        this.c = workDatabase;
        this.f = aVar;
        this.j = trackers;
        this.f16856b = configuration;
        this.e = list;
        CoroutineScope coroutineScopeCreateWorkManagerScope = WorkManagerImplExtKt.createWorkManagerScope(m1pVar);
        this.f16857k = coroutineScopeCreateWorkManagerScope;
        this.g = new f7i(this.c);
        qfl.g(list, this.f, m1pVar.d(), this.c, configuration);
        this.d.b(new ForceStopRunnable(applicationContext, this));
        UnfinishedWorkListenerKt.maybeLaunchUnfinishedWorkListener(coroutineScopeCreateWorkManagerScope, this.f16855a, configuration, workDatabase);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Deprecated
    public static enr d() {
        synchronized (o) {
            try {
                enr enrVar = m;
                if (enrVar != null) {
                    return enrVar;
                }
                return n;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static enr e(Context context) {
        enr enrVarD;
        synchronized (o) {
            try {
                enrVarD = d();
                if (enrVarD == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (!(applicationContext instanceof Configuration.Provider)) {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                    initialize(applicationContext, ((Configuration.Provider) applicationContext).getWorkManagerConfiguration());
                    enrVarD = e(applicationContext);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return enrVarD;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void initialize(Context context, Configuration configuration) {
        synchronized (o) {
            try {
                enr enrVar = m;
                if (enrVar != null && n != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (enrVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (n == null) {
                        n = WorkManagerImplExtKt.createWorkManager(applicationContext, configuration);
                    }
                    m = n;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static boolean isInitialized() {
        return d() != null;
    }

    public pmr b(String str, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, PeriodicWorkRequest periodicWorkRequest) {
        return new pmr(this, str, existingPeriodicWorkPolicy == ExistingPeriodicWorkPolicy.KEEP ? ExistingWorkPolicy.KEEP : ExistingWorkPolicy.REPLACE, Collections.singletonList(periodicWorkRequest));
    }

    @Override // androidx.work.WorkManager
    public nmr beginUniqueWork(String str, ExistingWorkPolicy existingWorkPolicy, List<OneTimeWorkRequest> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        return new pmr(this, str, existingWorkPolicy, list);
    }

    @Override // androidx.work.WorkManager
    public nmr beginWith(List<OneTimeWorkRequest> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("beginWith needs at least one OneTimeWorkRequest.");
        }
        return new pmr(this, list);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Context c() {
        return this.f16855a;
    }

    @Override // androidx.work.WorkManager
    public androidx.work.b cancelAllWork() {
        return CancelWorkRunnable.forAll(this);
    }

    @Override // androidx.work.WorkManager
    public androidx.work.b cancelAllWorkByTag(String str) {
        return CancelWorkRunnable.forTag(str, this);
    }

    @Override // androidx.work.WorkManager
    public androidx.work.b cancelUniqueWork(String str) {
        return CancelWorkRunnable.forName(str, this);
    }

    @Override // androidx.work.WorkManager
    public androidx.work.b cancelWorkById(UUID uuid) {
        return CancelWorkRunnable.forId(uuid, this);
    }

    @Override // androidx.work.WorkManager
    public PendingIntent createCancelPendingIntent(UUID uuid) {
        return PendingIntent.getService(this.f16855a, 0, androidx.work.impl.foreground.a.d(this.f16855a, uuid.toString()), Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
    }

    @Override // androidx.work.WorkManager
    public androidx.work.b enqueue(List<? extends WorkRequest> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new pmr(this, list).b();
    }

    @Override // androidx.work.WorkManager
    public androidx.work.b enqueueUniquePeriodicWork(String str, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, PeriodicWorkRequest periodicWorkRequest) {
        return existingPeriodicWorkPolicy == ExistingPeriodicWorkPolicy.UPDATE ? WorkerUpdater.enqueueUniquelyNamedPeriodic(this, str, periodicWorkRequest) : b(str, existingPeriodicWorkPolicy, periodicWorkRequest).b();
    }

    @Override // androidx.work.WorkManager
    public androidx.work.b enqueueUniqueWork(String str, ExistingWorkPolicy existingWorkPolicy, List<OneTimeWorkRequest> list) {
        return new pmr(this, str, existingWorkPolicy, list).b();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public f7i f() {
        return this.g;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.work.impl.a g() {
        return this.f;
    }

    @Override // androidx.work.WorkManager
    public Configuration getConfiguration() {
        return this.f16856b;
    }

    @Override // androidx.work.WorkManager
    public lhe<Long> getLastCancelAllTimeMillis() {
        final f7i f7iVar = this.g;
        mwl mwlVarD = this.d.d();
        Objects.requireNonNull(f7iVar);
        return ListenableFutureKt.executeAsync(mwlVarD, "getLastCancelAllTimeMillis", new Function0() { // from class: cnr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(f7iVar.b());
            }
        });
    }

    @Override // androidx.work.WorkManager
    public LiveData<Long> getLastCancelAllTimeMillisLiveData() {
        return this.g.c();
    }

    @Override // androidx.work.WorkManager
    public lhe<WorkInfo> getWorkInfoById(UUID uuid) {
        return StatusRunnable.forUUID(this.c, this.d, uuid);
    }

    @Override // androidx.work.WorkManager
    public Flow<WorkInfo> getWorkInfoByIdFlow(UUID uuid) {
        return WorkSpecDaoKt.getWorkStatusPojoFlowDataForIds(j().workSpecDao(), uuid);
    }

    @Override // androidx.work.WorkManager
    public LiveData<WorkInfo> getWorkInfoByIdLiveData(UUID uuid) {
        return kie.a(this.c.workSpecDao().getWorkStatusPojoLiveDataForIds(Collections.singletonList(uuid.toString())), new a(), this.d);
    }

    @Override // androidx.work.WorkManager
    public lhe<List<WorkInfo>> getWorkInfos(WorkQuery workQuery) {
        return StatusRunnable.forWorkQuerySpec(this.c, this.d, workQuery);
    }

    @Override // androidx.work.WorkManager
    public lhe<List<WorkInfo>> getWorkInfosByTag(String str) {
        return StatusRunnable.forTag(this.c, this.d, str);
    }

    @Override // androidx.work.WorkManager
    public Flow<List<WorkInfo>> getWorkInfosByTagFlow(String str) {
        return WorkSpecDaoKt.getWorkStatusPojoFlowForTag(this.c.workSpecDao(), this.d.a(), str);
    }

    @Override // androidx.work.WorkManager
    public LiveData<List<WorkInfo>> getWorkInfosByTagLiveData(String str) {
        return kie.a(this.c.workSpecDao().getWorkStatusPojoLiveDataForTag(str), WorkSpec.WORK_INFO_MAPPER, this.d);
    }

    @Override // androidx.work.WorkManager
    public Flow<List<WorkInfo>> getWorkInfosFlow(WorkQuery workQuery) {
        return RawWorkInfoDaoKt.getWorkInfoPojosFlow(this.c.rawWorkInfoDao(), this.d.a(), RawQueries.toRawQuery(workQuery));
    }

    @Override // androidx.work.WorkManager
    public lhe<List<WorkInfo>> getWorkInfosForUniqueWork(String str) {
        return StatusRunnable.forUniqueWork(this.c, this.d, str);
    }

    @Override // androidx.work.WorkManager
    public Flow<List<WorkInfo>> getWorkInfosForUniqueWorkFlow(String str) {
        return WorkSpecDaoKt.getWorkStatusPojoFlowForName(this.c.workSpecDao(), this.d.a(), str);
    }

    @Override // androidx.work.WorkManager
    public LiveData<List<WorkInfo>> getWorkInfosForUniqueWorkLiveData(String str) {
        return kie.a(this.c.workSpecDao().getWorkStatusPojoLiveDataForName(str), WorkSpec.WORK_INFO_MAPPER, this.d);
    }

    @Override // androidx.work.WorkManager
    public LiveData<List<WorkInfo>> getWorkInfosLiveData(WorkQuery workQuery) {
        return kie.a(this.c.rawWorkInfoDao().getWorkInfoPojosLiveData(RawQueries.toRawQuery(workQuery)), WorkSpec.WORK_INFO_MAPPER, this.d);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public List<jfl> h() {
        return this.e;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Trackers i() {
        return this.j;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkDatabase j() {
        return this.c;
    }

    public CoroutineScope k() {
        return this.f16857k;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public m1p l() {
        return this.d;
    }

    public final /* synthetic */ Unit m() {
        ewo.c(c());
        j().workSpecDao().resetScheduledState();
        qfl.h(getConfiguration(), j(), h());
        return Unit.INSTANCE;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void n() {
        synchronized (o) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o() {
        TracerKt.traced(getConfiguration().getTracer(), "ReschedulingWork", new Function0() { // from class: dnr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f15730a.m();
            }
        });
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void p(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (o) {
            try {
                BroadcastReceiver.PendingResult pendingResult2 = this.i;
                if (pendingResult2 != null) {
                    pendingResult2.finish();
                }
                this.i = pendingResult;
                if (this.h) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.work.WorkManager
    public androidx.work.b pruneWork() {
        return PruneWorkRunnableKt.pruneWork(this.c, this.f16856b, this.d);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void q(WorkGenerationalId workGenerationalId, int i) {
        this.d.b(new StopWorkRunnable(this.f, new StartStopToken(workGenerationalId), true, i));
    }

    @Override // androidx.work.WorkManager
    public lhe<WorkManager.UpdateResult> updateWork(WorkRequest workRequest) {
        return WorkerUpdater.updateWorkImpl(this, workRequest);
    }
}
