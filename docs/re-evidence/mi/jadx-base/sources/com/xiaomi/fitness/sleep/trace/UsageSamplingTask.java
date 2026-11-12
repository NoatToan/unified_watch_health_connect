package com.xiaomi.fitness.sleep.trace;

import android.app.usage.UsageEvents;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.sleep.trace.db.SleepTraceDao;
import com.xiaomi.fitness.sleep.trace.db.SleepTraceDatabase;
import com.xiaomi.fitness.sleep.trace.db.SleepTraceLog;
import com.xiaomi.fitness.sleep.trace.sampling.SamplingTask;
import com.xiaomi.fitness.sleep.trace.util.SleepTraceUtil;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00102\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002\u000f\u0010B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0017J\b\u0010\n\u001a\u00020\tH\u0017R\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/UsageSamplingTask;", "Lcom/xiaomi/fitness/sleep/trace/sampling/SamplingTask;", "", "Lcom/xiaomi/fitness/sleep/trace/db/SleepTraceLog;", "ctx", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", LifecycleConstantKt.ON_START, "", LifecycleConstantKt.ON_STOP, "type", "", "getType", "()Ljava/lang/String;", "UsageQueryTask", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UsageSamplingTask extends SamplingTask<List<? extends SleepTraceLog>> {

    @NotNull
    private static final String DEVICE_EVENT_PACKAGE_NAME = "android";
    private static final int KEY_GUARD_LOCK = 102;
    private static final int KEY_GUARD_UNLOCK = 103;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/UsageSamplingTask$UsageQueryTask;", "Ljava/lang/Runnable;", "<init>", "(Lcom/xiaomi/fitness/sleep/trace/UsageSamplingTask;)V", "run", "", "performQuery", "ctx", "Landroid/content/Context;", "usm", "Landroid/app/usage/UsageStatsManager;", "createInteractiveLog", "Lcom/xiaomi/fitness/sleep/trace/db/SleepTraceLog;", "interactive", "", "timestamp", "", TSMAuthContants.PARAM_SERVICE_NAME, "", "getServiceName", "()Ljava/lang/String;", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nUsageSamplingTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UsageSamplingTask.kt\ncom/xiaomi/fitness/sleep/trace/UsageSamplingTask$UsageQueryTask\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,122:1\n37#2:123\n36#2,3:124\n*S KotlinDebug\n*F\n+ 1 UsageSamplingTask.kt\ncom/xiaomi/fitness/sleep/trace/UsageSamplingTask$UsageQueryTask\n*L\n95#1:123\n95#1:124,3\n*E\n"})
    public final class UsageQueryTask implements Runnable {
        public UsageQueryTask() {
        }

        private final SleepTraceLog createInteractiveLog(boolean interactive, long timestamp) {
            return new SleepTraceLog(1, 1, 2, Boolean.valueOf(interactive), timestamp);
        }

        private final String getServiceName() {
            return "usagestats";
        }

        private final void performQuery(Context ctx, UsageStatsManager usm) {
            long timestamp;
            SleepTraceDatabase sleepTraceDatabase = SleepTraceDatabase.INSTANCE.get(ctx);
            SleepTraceLog last = sleepTraceDatabase.sleepTraceDao().getLast(1, 1);
            long jCurrentTimeMillis = System.currentTimeMillis();
            long millis = TimeUnit.HOURS.toMillis(9L);
            if (last == null || jCurrentTimeMillis <= last.getTimestamp() || jCurrentTimeMillis - last.getTimestamp() >= millis) {
                timestamp = jCurrentTimeMillis - millis;
                SleepTraceUtil.INSTANCE.sleepTrace("last usage time（" + (last != null ? last.getTimestamp() : 0L) + "） with gap " + timestamp, new Object[0]);
            } else {
                timestamp = last.getTimestamp();
                SleepTraceUtil.INSTANCE.sleepTrace("last usage time " + timestamp, new Object[0]);
            }
            UsageEvents usageEventsQueryEvents = usm.queryEvents(timestamp + 1, System.currentTimeMillis() + 1);
            UsageEvents.Event event = new UsageEvents.Event();
            LinkedList linkedList = new LinkedList();
            while (usageEventsQueryEvents.getNextEvent(event)) {
                int eventType = event.getEventType();
                if (eventType == 7) {
                    String packageName = event.getPackageName();
                    if (Intrinsics.areEqual("android", packageName)) {
                        break;
                    }
                    linkedList.add(createInteractiveLog(true, event.getTimeStamp()));
                    SleepTraceUtil.INSTANCE.sleepTrace("interaction event " + packageName + " @ " + event.getTimeStamp(), new Object[0]);
                } else if (eventType == 16 || eventType == 102) {
                    linkedList.add(createInteractiveLog(false, event.getTimeStamp()));
                    SleepTraceUtil.INSTANCE.sleepTrace("non_interaction event " + eventType + " @ " + event.getTimeStamp(), new Object[0]);
                } else if (eventType == 103) {
                    linkedList.add(createInteractiveLog(true, event.getTimeStamp()));
                    SleepTraceUtil.INSTANCE.sleepTrace("interaction event %s(%d) @ %tT", "Keyguard UNLOCK", Integer.valueOf(eventType), Long.valueOf(event.getTimeStamp()));
                }
            }
            if (linkedList.isEmpty()) {
                UsageSamplingTask.this.inputSamplingData(null);
                return;
            }
            SleepTraceDao sleepTraceDao = sleepTraceDatabase.sleepTraceDao();
            SleepTraceLog[] sleepTraceLogArr = (SleepTraceLog[]) linkedList.toArray(new SleepTraceLog[0]);
            sleepTraceDao.insert((SleepTraceLog[]) Arrays.copyOf(sleepTraceLogArr, sleepTraceLogArr.length));
            UsageSamplingTask.this.inputSamplingData(Collections.unmodifiableList(linkedList));
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SleepTraceConfiguration.INSTANCE.isTestMode()) {
                UsageSamplingTask.this.inputSamplingData(null);
                return;
            }
            Context applicationContext = UsageSamplingTask.this.getApplicationContext();
            UsageStatsManager usageStatsManager = (UsageStatsManager) applicationContext.getSystemService(getServiceName());
            if (usageStatsManager != null) {
                performQuery(applicationContext, usageStatsManager);
            } else {
                UsageSamplingTask.this.inputSamplingData(null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsageSamplingTask(@NotNull Context ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
    }

    @Override // com.xiaomi.fitness.sleep.trace.sampling.SamplingTask
    @NotNull
    public String getType() {
        return "Usage";
    }

    @Override // com.xiaomi.fitness.sleep.trace.sampling.SamplingTask
    public void onStart() {
        new UsageQueryTask().run();
    }

    @Override // com.xiaomi.fitness.sleep.trace.sampling.SamplingTask
    public void onStop() {
    }
}
