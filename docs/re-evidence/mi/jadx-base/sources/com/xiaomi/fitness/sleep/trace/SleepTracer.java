package com.xiaomi.fitness.sleep.trace;

import android.os.Bundle;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.sleep.trace.db.SleepReport;
import com.xiaomi.fitness.statistics.StatConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\bf\u0018\u0000 :2\u00020\u0001:\u0001:J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0003H&J\u001c\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H&J\u001c\u0010\u001a\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H&J@\u0010\u001b\u001a\u00020\u001326\u0010\u001c\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00130\u001dH&J-\u0010\"\u001a\u00020\u00132#\u0010\u001c\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010$¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00130#H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0018\u0010\u0005\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0004\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0004\"\u0004\b\f\u0010\u0007R\u0018\u0010\r\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0'X¦\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+RN\u0010,\u001a8\u0012\u0013\u0012\u00110-¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110-¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(/\u0012\n\u0012\b\u0012\u0004\u0012\u00020-000\u001dX¦\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0018\u00105\u001a\u00020-X¦\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006;"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/SleepTracer;", "", "isSupport", "", "()Z", "isEnable", "setEnable", "(Z)V", "getEnable", "", "isSleepTracing", "isDeepLightSleepDetectionEnable", "setDeepLightSleepDetectionEnable", "snoreDetectionStatus", "getSnoreDetectionStatus", "()I", "setSnoreDetectionStatus", "(I)V", "initSleepTrace", "", "isMaybeSleeping", "scheduleBegin", "arg", "", "extras", "Landroid/os/Bundle;", "scheduleEnd", "addSleepTraceObserver", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "matchCondition", "state", "addSleepReportObserver", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/sleep/trace/db/SleepReport;", "report", "userAge", "Lkotlin/Function0;", "getUserAge", "()Lkotlin/jvm/functions/Function0;", "setUserAge", "(Lkotlin/jvm/functions/Function0;)V", "stepTimes", "", "begin", StatConstants.PARAM_END, "", "getStepTimes", "()Lkotlin/jvm/functions/Function2;", "setStepTimes", "(Lkotlin/jvm/functions/Function2;)V", "snoreRequestTime", "getSnoreRequestTime", "()J", "setSnoreRequestTime", "(J)V", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SleepTracer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int SLEEP_STATE_AWAKE = 1;
    public static final int SLEEP_STATE_FINISHED = 5;
    public static final int SLEEP_STATE_PREPARE_SLEEP = 2;
    public static final int SLEEP_STATE_SLEEPING = 3;
    public static final int SLEEP_STATE_WAKE_UP = 4;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/SleepTracer$Companion;", "", "<init>", "()V", "SLEEP_STATE_AWAKE", "", "SLEEP_STATE_PREPARE_SLEEP", "SLEEP_STATE_SLEEPING", "SLEEP_STATE_WAKE_UP", "SLEEP_STATE_FINISHED", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int SLEEP_STATE_AWAKE = 1;
        public static final int SLEEP_STATE_FINISHED = 5;
        public static final int SLEEP_STATE_PREPARE_SLEEP = 2;
        public static final int SLEEP_STATE_SLEEPING = 3;
        public static final int SLEEP_STATE_WAKE_UP = 4;

        private Companion() {
        }
    }

    void addSleepReportObserver(@NotNull Function1<? super SleepReport, Unit> listener);

    void addSleepTraceObserver(@NotNull Function2<? super Boolean, ? super Integer, Unit> listener);

    int getEnable();

    int getSnoreDetectionStatus();

    long getSnoreRequestTime();

    @NotNull
    Function2<Long, Long, List<Long>> getStepTimes();

    @NotNull
    Function0<Integer> getUserAge();

    void initSleepTrace();

    boolean isDeepLightSleepDetectionEnable();

    boolean isEnable();

    boolean isMaybeSleeping();

    boolean isSleepTracing();

    boolean isSupport();

    void scheduleBegin(@Nullable String arg, @Nullable Bundle extras);

    void scheduleEnd(@Nullable String arg, @Nullable Bundle extras);

    void setDeepLightSleepDetectionEnable(boolean z);

    void setEnable(boolean z);

    void setSnoreDetectionStatus(int i);

    void setSnoreRequestTime(long j);

    void setStepTimes(@NotNull Function2<? super Long, ? super Long, ? extends List<Long>> function2);

    void setUserAge(@NotNull Function0<Integer> function0);
}
