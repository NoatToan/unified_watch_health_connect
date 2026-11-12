package com.xiaomi.fitness.repo.healthconnect.utils;

import android.content.Context;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.a;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.repo.healthconnect.biz.HealthConnectPreference;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/repo/healthconnect/utils/RetryTaskScheduler;", "", "<init>", "()V", "KEY_DATA_TYPE", "", "KEY_DAILY_DATA_TYPES", "retrySync", "", "dataType", "", "types", "", "ScheduleWorker", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRetryTaskScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RetryTaskScheduler.kt\ncom/xiaomi/fitness/repo/healthconnect/utils/RetryTaskScheduler\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,74:1\n37#2:75\n36#2,3:76\n*S KotlinDebug\n*F\n+ 1 RetryTaskScheduler.kt\ncom/xiaomi/fitness/repo/healthconnect/utils/RetryTaskScheduler\n*L\n47#1:75\n47#1:76,3\n*E\n"})
public final class RetryTaskScheduler {

    @NotNull
    public static final RetryTaskScheduler INSTANCE = new RetryTaskScheduler();

    @NotNull
    private static final String KEY_DAILY_DATA_TYPES = "key.daily_data_types";

    @NotNull
    private static final String KEY_DATA_TYPE = "key.data_type";

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/repo/healthconnect/utils/RetryTaskScheduler$ScheduleWorker;", "Landroidx/work/Worker;", "Landroidx/work/a$a;", "doWork", "()Landroidx/work/a$a;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class ScheduleWorker extends Worker {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScheduleWorker(@NotNull Context context, @NotNull WorkerParameters workerParams) {
            super(context, workerParams);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        }

        @Override // androidx.work.Worker
        @NotNull
        public a.AbstractC0080a doWork() {
            int i = getInputData().getInt(RetryTaskScheduler.KEY_DATA_TYPE, -1);
            if (i == 0) {
                String[] stringArray = getInputData().getStringArray(RetryTaskScheduler.KEY_DAILY_DATA_TYPES);
                HealthConnectSyncUtils.INSTANCE.syncDailyRecords(stringArray != null ? ArraysKt___ArraysJvmKt.asList(stringArray) : null);
            } else if (i == 1) {
                HealthConnectSyncUtils.INSTANCE.syncReport();
            }
            a.AbstractC0080a abstractC0080aC = a.AbstractC0080a.c();
            Intrinsics.checkNotNullExpressionValue(abstractC0080aC, "success(...)");
            return abstractC0080aC;
        }
    }

    private RetryTaskScheduler() {
    }

    public final void retrySync(int dataType, @NotNull List<String> types) {
        int key_sync_records_failure_times;
        Intrinsics.checkNotNullParameter(types, "types");
        int i = 15;
        if (dataType == 0) {
            HealthConnectPreference healthConnectPreference = HealthConnectPreference.INSTANCE;
            if (healthConnectPreference.getKEY_SYNC_RECORDS_FAILURE_TIMES() > 3) {
                key_sync_records_failure_times = healthConnectPreference.getKEY_SYNC_RECORDS_FAILURE_TIMES();
                i = 15 * (key_sync_records_failure_times - 2);
            }
        } else if (dataType != 1) {
            i = 0;
        } else {
            HealthConnectPreference healthConnectPreference2 = HealthConnectPreference.INSTANCE;
            if (healthConnectPreference2.getKEY_SYNC_REPORT_FAILURE_TIMES() > 3) {
                key_sync_records_failure_times = healthConnectPreference2.getKEY_SYNC_REPORT_FAILURE_TIMES();
                i = 15 * (key_sync_records_failure_times - 2);
            }
        }
        WorkManager.INSTANCE.getInstance(ApplicationExtKt.getApplication()).enqueueUniqueWork("sync_daily_records_to_health_connect", ExistingWorkPolicy.REPLACE, new OneTimeWorkRequest.Builder((Class<? extends a>) ScheduleWorker.class).setInitialDelay(i, TimeUnit.MINUTES).setInputData(new Data.Builder().putInt(KEY_DATA_TYPE, dataType).putStringArray(KEY_DAILY_DATA_TYPES, (String[]) types.toArray(new String[0])).build()).build());
    }
}
