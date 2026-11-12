package androidx.work;

import androidx.annotation.RequiresApi;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a,\u0010\u0007\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a$\u0010\u0007\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\tH\u0087\b¢\u0006\u0004\b\u0007\u0010\n\u001a<\u0010\u0007\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0007\u0010\r\u001a,\u0010\u0007\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0087\b¢\u0006\u0004\b\u0007\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/work/a;", "W", "", "repeatInterval", "Ljava/util/concurrent/TimeUnit;", "repeatIntervalTimeUnit", "Landroidx/work/PeriodicWorkRequest$Builder;", "PeriodicWorkRequestBuilder", "(JLjava/util/concurrent/TimeUnit;)Landroidx/work/PeriodicWorkRequest$Builder;", "Ljava/time/Duration;", "(Ljava/time/Duration;)Landroidx/work/PeriodicWorkRequest$Builder;", "flexTimeInterval", "flexTimeIntervalUnit", "(JLjava/util/concurrent/TimeUnit;JLjava/util/concurrent/TimeUnit;)Landroidx/work/PeriodicWorkRequest$Builder;", "(Ljava/time/Duration;Ljava/time/Duration;)Landroidx/work/PeriodicWorkRequest$Builder;", "work-runtime_release"}, k = 2, mv = {1, 8, 0})
public final class PeriodicWorkRequestKt {
    public static final /* synthetic */ <W extends a> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(long j, TimeUnit repeatIntervalTimeUnit) {
        Intrinsics.checkNotNullParameter(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
        Intrinsics.reifiedOperationMarker(4, "W");
        return new PeriodicWorkRequest.Builder((Class<? extends a>) a.class, j, repeatIntervalTimeUnit);
    }

    @RequiresApi(26)
    public static final /* synthetic */ <W extends a> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(Duration repeatInterval) {
        Intrinsics.checkNotNullParameter(repeatInterval, "repeatInterval");
        Intrinsics.reifiedOperationMarker(4, "W");
        return new PeriodicWorkRequest.Builder((Class<? extends a>) a.class, repeatInterval);
    }

    public static final /* synthetic */ <W extends a> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(long j, TimeUnit repeatIntervalTimeUnit, long j2, TimeUnit flexTimeIntervalUnit) {
        Intrinsics.checkNotNullParameter(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
        Intrinsics.checkNotNullParameter(flexTimeIntervalUnit, "flexTimeIntervalUnit");
        Intrinsics.reifiedOperationMarker(4, "W");
        return new PeriodicWorkRequest.Builder((Class<? extends a>) a.class, j, repeatIntervalTimeUnit, j2, flexTimeIntervalUnit);
    }

    @RequiresApi(26)
    public static final /* synthetic */ <W extends a> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(Duration repeatInterval, Duration flexTimeInterval) {
        Intrinsics.checkNotNullParameter(repeatInterval, "repeatInterval");
        Intrinsics.checkNotNullParameter(flexTimeInterval, "flexTimeInterval");
        Intrinsics.reifiedOperationMarker(4, "W");
        return new PeriodicWorkRequest.Builder((Class<? extends a>) a.class, repeatInterval, flexTimeInterval);
    }
}
