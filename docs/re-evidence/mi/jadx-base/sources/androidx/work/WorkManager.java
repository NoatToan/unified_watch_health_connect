package androidx.work;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import androidx.lifecycle.LiveData;
import defpackage.enr;
import defpackage.lhe;
import defpackage.nmr;
import java.util.List;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000 U2\u00020\u0001:\u0002UVB\t\b\u0000¢\u0006\u0004\bS\u0010TJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H&¢\u0006\u0004\b\u0005\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H&¢\u0006\u0004\b\f\u0010\u000eJ%\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H&¢\u0006\u0004\b\u0013\u0010\u0015J'\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H&¢\u0006\u0004\b\u0016\u0010\u0018J'\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000fH&¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\u0004H&¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0004H&¢\u0006\u0004\b+\u0010'J\u0015\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,H&¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\b\u0012\u0004\u0012\u00020-00H&¢\u0006\u0004\b1\u00102J\u001f\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030,2\u0006\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b4\u00105J\u001f\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u000103062\u0006\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u000103002\u0006\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b9\u0010:J#\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u00070,2\u0006\u0010\"\u001a\u00020\u000fH&¢\u0006\u0004\b;\u0010<J#\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u0007062\u0006\u0010\"\u001a\u00020\u000fH&¢\u0006\u0004\b=\u0010>J#\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u0007002\u0006\u0010\"\u001a\u00020\u000fH&¢\u0006\u0004\b?\u0010@J#\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u00070,2\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\bA\u0010<J#\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u0007062\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\bB\u0010>J#\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u0007002\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\bC\u0010@J#\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u00070,2\u0006\u0010E\u001a\u00020DH&¢\u0006\u0004\bF\u0010GJ#\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u0007062\u0006\u0010E\u001a\u00020DH&¢\u0006\u0004\bH\u0010IJ#\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u0007002\u0006\u0010E\u001a\u00020DH&¢\u0006\u0004\bJ\u0010KJ\u001d\u0010M\u001a\b\u0012\u0004\u0012\u00020L002\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\bM\u0010NR\u0014\u0010R\u001a\u00020O8&X¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006W"}, d2 = {"Landroidx/work/WorkManager;", "", "Landroidx/work/WorkRequest;", "request", "Landroidx/work/b;", "enqueue", "(Landroidx/work/WorkRequest;)Landroidx/work/b;", "", "requests", "(Ljava/util/List;)Landroidx/work/b;", "Landroidx/work/OneTimeWorkRequest;", "Lnmr;", "beginWith", "(Landroidx/work/OneTimeWorkRequest;)Lnmr;", "(Ljava/util/List;)Lnmr;", "", "uniqueWorkName", "Landroidx/work/ExistingWorkPolicy;", "existingWorkPolicy", "beginUniqueWork", "(Ljava/lang/String;Landroidx/work/ExistingWorkPolicy;Landroidx/work/OneTimeWorkRequest;)Lnmr;", "(Ljava/lang/String;Landroidx/work/ExistingWorkPolicy;Ljava/util/List;)Lnmr;", "enqueueUniqueWork", "(Ljava/lang/String;Landroidx/work/ExistingWorkPolicy;Landroidx/work/OneTimeWorkRequest;)Landroidx/work/b;", "(Ljava/lang/String;Landroidx/work/ExistingWorkPolicy;Ljava/util/List;)Landroidx/work/b;", "Landroidx/work/ExistingPeriodicWorkPolicy;", "existingPeriodicWorkPolicy", "Landroidx/work/PeriodicWorkRequest;", "enqueueUniquePeriodicWork", "(Ljava/lang/String;Landroidx/work/ExistingPeriodicWorkPolicy;Landroidx/work/PeriodicWorkRequest;)Landroidx/work/b;", "Ljava/util/UUID;", "id", "cancelWorkById", "(Ljava/util/UUID;)Landroidx/work/b;", "tag", "cancelAllWorkByTag", "(Ljava/lang/String;)Landroidx/work/b;", "cancelUniqueWork", "cancelAllWork", "()Landroidx/work/b;", "Landroid/app/PendingIntent;", "createCancelPendingIntent", "(Ljava/util/UUID;)Landroid/app/PendingIntent;", "pruneWork", "Landroidx/lifecycle/LiveData;", "", "getLastCancelAllTimeMillisLiveData", "()Landroidx/lifecycle/LiveData;", "Llhe;", "getLastCancelAllTimeMillis", "()Llhe;", "Landroidx/work/WorkInfo;", "getWorkInfoByIdLiveData", "(Ljava/util/UUID;)Landroidx/lifecycle/LiveData;", "Lkotlinx/coroutines/flow/Flow;", "getWorkInfoByIdFlow", "(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", "getWorkInfoById", "(Ljava/util/UUID;)Llhe;", "getWorkInfosByTagLiveData", "(Ljava/lang/String;)Landroidx/lifecycle/LiveData;", "getWorkInfosByTagFlow", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "getWorkInfosByTag", "(Ljava/lang/String;)Llhe;", "getWorkInfosForUniqueWorkLiveData", "getWorkInfosForUniqueWorkFlow", "getWorkInfosForUniqueWork", "Landroidx/work/WorkQuery;", "workQuery", "getWorkInfosLiveData", "(Landroidx/work/WorkQuery;)Landroidx/lifecycle/LiveData;", "getWorkInfosFlow", "(Landroidx/work/WorkQuery;)Lkotlinx/coroutines/flow/Flow;", "getWorkInfos", "(Landroidx/work/WorkQuery;)Llhe;", "Landroidx/work/WorkManager$UpdateResult;", "updateWork", "(Landroidx/work/WorkRequest;)Llhe;", "Landroidx/work/Configuration;", "getConfiguration", "()Landroidx/work/Configuration;", "configuration", "<init>", "()V", "Companion", "UpdateResult", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"AddedAbstractMethod"})
public abstract class WorkManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/work/WorkManager$UpdateResult;", "", "(Ljava/lang/String;I)V", "NOT_APPLIED", "APPLIED_IMMEDIATELY", "APPLIED_FOR_NEXT_RUN", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum UpdateResult {
        NOT_APPLIED,
        APPLIED_IMMEDIATELY,
        APPLIED_FOR_NEXT_RUN
    }

    @Deprecated(message = "Use the overload receiving Context", replaceWith = @ReplaceWith(expression = "WorkManager.getContext(context)", imports = {}))
    @JvmStatic
    @NotNull
    public static WorkManager getInstance() {
        return INSTANCE.getInstance();
    }

    @JvmStatic
    public static void initialize(@NotNull Context context, @NotNull Configuration configuration) {
        INSTANCE.initialize(context, configuration);
    }

    @JvmStatic
    public static boolean isInitialized() {
        return INSTANCE.isInitialized();
    }

    @NotNull
    public final nmr beginUniqueWork(@NotNull String uniqueWorkName, @NotNull ExistingWorkPolicy existingWorkPolicy, @NotNull OneTimeWorkRequest request) {
        Intrinsics.checkNotNullParameter(uniqueWorkName, "uniqueWorkName");
        Intrinsics.checkNotNullParameter(existingWorkPolicy, "existingWorkPolicy");
        Intrinsics.checkNotNullParameter(request, "request");
        return beginUniqueWork(uniqueWorkName, existingWorkPolicy, CollectionsKt__CollectionsJVMKt.listOf(request));
    }

    @NotNull
    public abstract nmr beginUniqueWork(@NotNull String uniqueWorkName, @NotNull ExistingWorkPolicy existingWorkPolicy, @NotNull List<OneTimeWorkRequest> requests);

    @NotNull
    public final nmr beginWith(@NotNull OneTimeWorkRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return beginWith(CollectionsKt__CollectionsJVMKt.listOf(request));
    }

    @NotNull
    public abstract nmr beginWith(@NotNull List<OneTimeWorkRequest> requests);

    @NotNull
    public abstract b cancelAllWork();

    @NotNull
    public abstract b cancelAllWorkByTag(@NotNull String tag);

    @NotNull
    public abstract b cancelUniqueWork(@NotNull String uniqueWorkName);

    @NotNull
    public abstract b cancelWorkById(@NotNull UUID id);

    @NotNull
    public abstract PendingIntent createCancelPendingIntent(@NotNull UUID id);

    @NotNull
    public final b enqueue(@NotNull WorkRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return enqueue(CollectionsKt__CollectionsJVMKt.listOf(request));
    }

    @NotNull
    public abstract b enqueue(@NotNull List<? extends WorkRequest> requests);

    @NotNull
    public abstract b enqueueUniquePeriodicWork(@NotNull String uniqueWorkName, @NotNull ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, @NotNull PeriodicWorkRequest request);

    @NotNull
    public b enqueueUniqueWork(@NotNull String uniqueWorkName, @NotNull ExistingWorkPolicy existingWorkPolicy, @NotNull OneTimeWorkRequest request) {
        Intrinsics.checkNotNullParameter(uniqueWorkName, "uniqueWorkName");
        Intrinsics.checkNotNullParameter(existingWorkPolicy, "existingWorkPolicy");
        Intrinsics.checkNotNullParameter(request, "request");
        return enqueueUniqueWork(uniqueWorkName, existingWorkPolicy, CollectionsKt__CollectionsJVMKt.listOf(request));
    }

    @NotNull
    public abstract b enqueueUniqueWork(@NotNull String uniqueWorkName, @NotNull ExistingWorkPolicy existingWorkPolicy, @NotNull List<OneTimeWorkRequest> requests);

    @NotNull
    public abstract Configuration getConfiguration();

    @NotNull
    public abstract lhe<Long> getLastCancelAllTimeMillis();

    @NotNull
    public abstract LiveData<Long> getLastCancelAllTimeMillisLiveData();

    @NotNull
    public abstract lhe<WorkInfo> getWorkInfoById(@NotNull UUID id);

    @NotNull
    public abstract Flow<WorkInfo> getWorkInfoByIdFlow(@NotNull UUID id);

    @NotNull
    public abstract LiveData<WorkInfo> getWorkInfoByIdLiveData(@NotNull UUID id);

    @NotNull
    public abstract lhe<List<WorkInfo>> getWorkInfos(@NotNull WorkQuery workQuery);

    @NotNull
    public abstract lhe<List<WorkInfo>> getWorkInfosByTag(@NotNull String tag);

    @NotNull
    public abstract Flow<List<WorkInfo>> getWorkInfosByTagFlow(@NotNull String tag);

    @NotNull
    public abstract LiveData<List<WorkInfo>> getWorkInfosByTagLiveData(@NotNull String tag);

    @NotNull
    public abstract Flow<List<WorkInfo>> getWorkInfosFlow(@NotNull WorkQuery workQuery);

    @NotNull
    public abstract lhe<List<WorkInfo>> getWorkInfosForUniqueWork(@NotNull String uniqueWorkName);

    @NotNull
    public abstract Flow<List<WorkInfo>> getWorkInfosForUniqueWorkFlow(@NotNull String uniqueWorkName);

    @NotNull
    public abstract LiveData<List<WorkInfo>> getWorkInfosForUniqueWorkLiveData(@NotNull String uniqueWorkName);

    @NotNull
    public abstract LiveData<List<WorkInfo>> getWorkInfosLiveData(@NotNull WorkQuery workQuery);

    @NotNull
    public abstract b pruneWork();

    @NotNull
    public abstract lhe<UpdateResult> updateWork(@NotNull WorkRequest request);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0017J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0017J\b\u0010\u000b\u001a\u00020\fH\u0017¨\u0006\r"}, d2 = {"Landroidx/work/WorkManager$Companion;", "", "()V", "getInstance", "Landroidx/work/WorkManager;", "context", "Landroid/content/Context;", "initialize", "", "configuration", "Landroidx/work/Configuration;", "isInitialized", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated(message = "Use the overload receiving Context", replaceWith = @ReplaceWith(expression = "WorkManager.getContext(context)", imports = {}))
        @JvmStatic
        @NotNull
        public WorkManager getInstance() {
            enr enrVarD = enr.d();
            if (enrVarD != null) {
                return enrVarD;
            }
            throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.".toString());
        }

        @JvmStatic
        public void initialize(@NotNull Context context, @NotNull Configuration configuration) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            enr.initialize(context, configuration);
        }

        @JvmStatic
        public boolean isInitialized() {
            return enr.isInitialized();
        }

        @JvmStatic
        @NotNull
        public WorkManager getInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            enr enrVarE = enr.e(context);
            Intrinsics.checkNotNullExpressionValue(enrVarE, "getInstance(context)");
            return enrVarE;
        }
    }

    @JvmStatic
    @NotNull
    public static WorkManager getInstance(@NotNull Context context) {
        return INSTANCE.getInstance(context);
    }
}
