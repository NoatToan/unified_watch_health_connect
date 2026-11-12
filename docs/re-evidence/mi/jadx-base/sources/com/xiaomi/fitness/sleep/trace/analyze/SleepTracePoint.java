package com.xiaomi.fitness.sleep.trace.analyze;

import com.xiaomi.hm.health.dataprocess.StepsInfo;
import java.util.LinkedList;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0002\u0010\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0005J\b\u0010\f\u001a\u00020\rH\u0002J\u0006\u0010\u000e\u001a\u00020\u0007J\b\u0010\u000f\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/analyze/SleepTracePoint;", "", "<init>", "()V", StepsInfo.KEY_STAGE, "", "timestamp", "", "validate", "", "inflate", "getStage", "checkValidate", "", "getTimestamp", "invalidate", "RecyclerFactory", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepTracePoint {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private int stage;
    private long timestamp;
    private boolean validate;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/analyze/SleepTracePoint$Companion;", "", "<init>", "()V", "newRecyclerFactory", "Lcom/xiaomi/fitness/sleep/trace/analyze/SleepTracePoint$RecyclerFactory;", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RecyclerFactory newRecyclerFactory() {
            return new RecyclerFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/analyze/SleepTracePoint$RecyclerFactory;", "", "<init>", "()V", "mRecycleBin", "Ljava/util/LinkedList;", "Lcom/xiaomi/fitness/sleep/trace/analyze/SleepTracePoint;", "recycle", "", "point", "obtain", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RecyclerFactory {
        private static final int MAX_SIZE = 10;

        @NotNull
        private final LinkedList<SleepTracePoint> mRecycleBin = new LinkedList<>();

        @NotNull
        public final SleepTracePoint obtain() {
            DefaultConstructorMarker defaultConstructorMarker;
            SleepTracePoint sleepTracePointRemoveFirst;
            synchronized (this.mRecycleBin) {
                try {
                    defaultConstructorMarker = null;
                    sleepTracePointRemoveFirst = this.mRecycleBin.size() > 0 ? this.mRecycleBin.removeFirst() : null;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return sleepTracePointRemoveFirst == null ? new SleepTracePoint(defaultConstructorMarker) : sleepTracePointRemoveFirst;
        }

        public final void recycle(@NotNull SleepTracePoint point) {
            Intrinsics.checkNotNullParameter(point, "point");
            synchronized (this.mRecycleBin) {
                try {
                    if (this.mRecycleBin.size() < 10) {
                        Objects.requireNonNull(point);
                        point.invalidate();
                        this.mRecycleBin.addLast(point);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private SleepTracePoint() {
    }

    public /* synthetic */ SleepTracePoint(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final void checkValidate() {
        if (!this.validate) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidate() {
        this.validate = false;
    }

    public final int getStage() {
        checkValidate();
        return this.stage;
    }

    public final long getTimestamp() {
        checkValidate();
        return this.timestamp;
    }

    @NotNull
    public final SleepTracePoint inflate(int stage, long timestamp) {
        this.stage = stage;
        this.timestamp = timestamp;
        this.validate = true;
        return this;
    }
}
