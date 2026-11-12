package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.RequiresApi;
import androidx.work.impl.utils.DurationApi26Impl;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0002\u0005\u0006B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/work/PeriodicWorkRequest;", "Landroidx/work/WorkRequest;", "builder", "Landroidx/work/PeriodicWorkRequest$Builder;", "(Landroidx/work/PeriodicWorkRequest$Builder;)V", "Builder", "Companion", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PeriodicWorkRequest extends WorkRequest {

    @SuppressLint({"MinMaxConstant"})
    public static final long MIN_PERIODIC_FLEX_MILLIS = 300000;

    @SuppressLint({"MinMaxConstant"})
    public static final long MIN_PERIODIC_INTERVAL_MILLIS = 900000;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B+\b\u0016\u0012\u0010\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000f0\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B)\b\u0016\u0012\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0017B!\b\u0017\u0012\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0018¢\u0006\u0004\b\u0014\u0010\u0019B!\b\u0017\u0012\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0018¢\u0006\u0004\b\u0014\u0010\u001aB;\b\u0016\u0012\u0010\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000f0\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u001dB9\b\u0016\u0012\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u001eB+\b\u0017\u0012\u0010\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000f0\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u0014\u0010\u001fB)\b\u0017\u0012\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u0014\u0010 J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00008PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\b¨\u0006!"}, d2 = {"Landroidx/work/PeriodicWorkRequest$Builder;", "Landroidx/work/WorkRequest$Builder;", "Landroidx/work/PeriodicWorkRequest;", "", "nextScheduleTimeOverrideMillis", "setNextScheduleTimeOverride", "(J)Landroidx/work/PeriodicWorkRequest$Builder;", "clearNextScheduleTimeOverride", "()Landroidx/work/PeriodicWorkRequest$Builder;", "buildInternal$work_runtime_release", "()Landroidx/work/PeriodicWorkRequest;", "buildInternal", "getThisObject$work_runtime_release", "thisObject", "Ljava/lang/Class;", "Landroidx/work/a;", "workerClass", "repeatInterval", "Ljava/util/concurrent/TimeUnit;", "repeatIntervalTimeUnit", "<init>", "(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;)V", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;JLjava/util/concurrent/TimeUnit;)V", "Ljava/time/Duration;", "(Ljava/lang/Class;Ljava/time/Duration;)V", "(Lkotlin/reflect/KClass;Ljava/time/Duration;)V", "flexInterval", "flexIntervalTimeUnit", "(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;JLjava/util/concurrent/TimeUnit;)V", "(Lkotlin/reflect/KClass;JLjava/util/concurrent/TimeUnit;JLjava/util/concurrent/TimeUnit;)V", "(Ljava/lang/Class;Ljava/time/Duration;Ljava/time/Duration;)V", "(Lkotlin/reflect/KClass;Ljava/time/Duration;Ljava/time/Duration;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPeriodicWorkRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeriodicWorkRequest.kt\nandroidx/work/PeriodicWorkRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,420:1\n1#2:421\n*E\n"})
    public static final class Builder extends WorkRequest.Builder<Builder, PeriodicWorkRequest> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull Class<? extends a> workerClass, long j, @NotNull TimeUnit repeatIntervalTimeUnit) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            Intrinsics.checkNotNullParameter(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
            getWorkSpec().setPeriodic(repeatIntervalTimeUnit.toMillis(j));
        }

        @NotNull
        public final Builder clearNextScheduleTimeOverride() {
            getWorkSpec().setNextScheduleTimeOverride(Long.MAX_VALUE);
            getWorkSpec().setNextScheduleTimeOverrideGeneration(1);
            return this;
        }

        @Override // androidx.work.WorkRequest.Builder
        @NotNull
        public Builder getThisObject$work_runtime_release() {
            return this;
        }

        @NotNull
        public final Builder setNextScheduleTimeOverride(long nextScheduleTimeOverrideMillis) {
            if (nextScheduleTimeOverrideMillis == Long.MAX_VALUE) {
                throw new IllegalArgumentException("Cannot set Long.MAX_VALUE as the schedule override time".toString());
            }
            getWorkSpec().setNextScheduleTimeOverride(nextScheduleTimeOverrideMillis);
            getWorkSpec().setNextScheduleTimeOverrideGeneration(1);
            return this;
        }

        @Override // androidx.work.WorkRequest.Builder
        @NotNull
        public PeriodicWorkRequest buildInternal$work_runtime_release() {
            if (getBackoffCriteriaSet() && getWorkSpec().constraints.getRequiresDeviceIdle()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
            }
            if (!getWorkSpec().expedited) {
                return new PeriodicWorkRequest(this);
            }
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited".toString());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull KClass<? extends a> workerClass, long j, @NotNull TimeUnit repeatIntervalTimeUnit) {
            super(JvmClassMappingKt.getJavaClass((KClass) workerClass));
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            Intrinsics.checkNotNullParameter(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
            getWorkSpec().setPeriodic(repeatIntervalTimeUnit.toMillis(j));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @RequiresApi(26)
        public Builder(@NotNull Class<? extends a> workerClass, @NotNull Duration repeatInterval) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            Intrinsics.checkNotNullParameter(repeatInterval, "repeatInterval");
            getWorkSpec().setPeriodic(DurationApi26Impl.toMillisCompat(repeatInterval));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @RequiresApi(26)
        public Builder(@NotNull KClass<? extends a> workerClass, @NotNull Duration repeatInterval) {
            super(JvmClassMappingKt.getJavaClass((KClass) workerClass));
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            Intrinsics.checkNotNullParameter(repeatInterval, "repeatInterval");
            getWorkSpec().setPeriodic(DurationApi26Impl.toMillisCompat(repeatInterval));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull Class<? extends a> workerClass, long j, @NotNull TimeUnit repeatIntervalTimeUnit, long j2, @NotNull TimeUnit flexIntervalTimeUnit) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            Intrinsics.checkNotNullParameter(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
            Intrinsics.checkNotNullParameter(flexIntervalTimeUnit, "flexIntervalTimeUnit");
            getWorkSpec().setPeriodic(repeatIntervalTimeUnit.toMillis(j), flexIntervalTimeUnit.toMillis(j2));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull KClass<? extends a> workerClass, long j, @NotNull TimeUnit repeatIntervalTimeUnit, long j2, @NotNull TimeUnit flexIntervalTimeUnit) {
            super(JvmClassMappingKt.getJavaClass((KClass) workerClass));
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            Intrinsics.checkNotNullParameter(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
            Intrinsics.checkNotNullParameter(flexIntervalTimeUnit, "flexIntervalTimeUnit");
            getWorkSpec().setPeriodic(repeatIntervalTimeUnit.toMillis(j), flexIntervalTimeUnit.toMillis(j2));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @RequiresApi(26)
        public Builder(@NotNull Class<? extends a> workerClass, @NotNull Duration repeatInterval, @NotNull Duration flexInterval) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            Intrinsics.checkNotNullParameter(repeatInterval, "repeatInterval");
            Intrinsics.checkNotNullParameter(flexInterval, "flexInterval");
            getWorkSpec().setPeriodic(DurationApi26Impl.toMillisCompat(repeatInterval), DurationApi26Impl.toMillisCompat(flexInterval));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @RequiresApi(26)
        public Builder(@NotNull KClass<? extends a> workerClass, @NotNull Duration repeatInterval, @NotNull Duration flexInterval) {
            super(JvmClassMappingKt.getJavaClass((KClass) workerClass));
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            Intrinsics.checkNotNullParameter(repeatInterval, "repeatInterval");
            Intrinsics.checkNotNullParameter(flexInterval, "flexInterval");
            getWorkSpec().setPeriodic(DurationApi26Impl.toMillisCompat(repeatInterval), DurationApi26Impl.toMillisCompat(flexInterval));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeriodicWorkRequest(@NotNull Builder builder) {
        super(builder.getId(), builder.getWorkSpec(), builder.getTags$work_runtime_release());
        Intrinsics.checkNotNullParameter(builder, "builder");
    }
}
