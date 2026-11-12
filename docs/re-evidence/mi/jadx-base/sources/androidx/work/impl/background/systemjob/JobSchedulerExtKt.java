package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.work.Configuration;
import androidx.work.impl.WorkDatabase;
import defpackage.ewo;
import defpackage.ppe;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u001d\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004*\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0018\u0010\t\u001a\u00020\u0006*\u00020\n8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"TAG", "", "WORKMANAGER_NAMESPACE", "safePendingJobs", "", "Landroid/app/job/JobInfo;", "Landroid/app/job/JobScheduler;", "getSafePendingJobs", "(Landroid/app/job/JobScheduler;)Ljava/util/List;", "wmJobScheduler", "Landroid/content/Context;", "getWmJobScheduler", "(Landroid/content/Context;)Landroid/app/job/JobScheduler;", "createErrorMessage", "context", "workDatabase", "Landroidx/work/impl/WorkDatabase;", "configuration", "Landroidx/work/Configuration;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nJobSchedulerExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSchedulerExt.kt\nandroidx/work/impl/background/systemjob/JobSchedulerExtKt\n+ 2 LoggerExt.kt\nandroidx/work/LoggerExtKt\n*L\n1#1,127:1\n32#2:128\n*S KotlinDebug\n*F\n+ 1 JobSchedulerExt.kt\nandroidx/work/impl/background/systemjob/JobSchedulerExtKt\n*L\n70#1:128\n*E\n"})
public final class JobSchedulerExtKt {

    @NotNull
    private static final String TAG;

    @NotNull
    public static final String WORKMANAGER_NAMESPACE = "androidx.work.systemjobscheduler";

    static {
        String strI = ppe.i("SystemJobScheduler");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(\"SystemJobScheduler\")");
        TAG = strI;
    }

    @RequiresApi(23)
    @NotNull
    public static final String createErrorMessage(@NotNull Context context, @NotNull WorkDatabase workDatabase, @NotNull Configuration configuration) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        int i = Build.VERSION.SDK_INT;
        int i2 = i >= 31 ? 150 : 100;
        int size = workDatabase.workSpecDao().getScheduledWork().size();
        String strJoinToString$default = "<faulty JobScheduler failed to getPendingJobs>";
        if (i >= 34) {
            JobScheduler wmJobScheduler = getWmJobScheduler(context);
            List<JobInfo> safePendingJobs = getSafePendingJobs(wmJobScheduler);
            if (safePendingJobs != null) {
                List<JobInfo> listF = ewo.f(context, wmJobScheduler);
                int size2 = listF != null ? safePendingJobs.size() - listF.size() : 0;
                String str2 = null;
                if (size2 == 0) {
                    str = null;
                } else {
                    str = size2 + " of which are not owned by WorkManager";
                }
                Object systemService = context.getSystemService("jobscheduler");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
                List<JobInfo> listF2 = ewo.f(context, (JobScheduler) systemService);
                int size3 = listF2 != null ? listF2.size() : 0;
                if (size3 != 0) {
                    str2 = size3 + " from WorkManager in the default namespace";
                }
                strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new String[]{safePendingJobs.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str, str2}), ",\n", null, null, 0, null, null, 62, null);
            }
        } else {
            List<JobInfo> listF3 = ewo.f(context, getWmJobScheduler(context));
            if (listF3 != null) {
                strJoinToString$default = listF3.size() + " jobs from WorkManager";
            }
        }
        return "JobScheduler " + i2 + " job limit exceeded.\nIn JobScheduler there are " + strJoinToString$default + ".\nThere are " + size + " jobs tracked by WorkManager's database;\nthe Configuration limit is " + configuration.getMaxSchedulerLimit() + '.';
    }

    @RequiresApi(21)
    @Nullable
    public static final List<JobInfo> getSafePendingJobs(@NotNull JobScheduler jobScheduler) {
        Intrinsics.checkNotNullParameter(jobScheduler, "<this>");
        try {
            return JobScheduler21.INSTANCE.getAllPendingJobs(jobScheduler);
        } catch (Throwable th) {
            ppe.e().d(TAG, "getAllPendingJobs() is not reliable on this device.", th);
            return null;
        }
    }

    @RequiresApi(21)
    @NotNull
    public static final JobScheduler getWmJobScheduler(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("jobscheduler");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        return Build.VERSION.SDK_INT >= 34 ? JobScheduler34.INSTANCE.forNamespace(jobScheduler) : jobScheduler;
    }
}
