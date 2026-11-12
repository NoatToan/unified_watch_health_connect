package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.impl.constraints.NetworkState;
import defpackage.m1p;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BS\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\fR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\f¨\u0006\u001b"}, d2 = {"Landroidx/work/impl/constraints/trackers/Trackers;", "", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "", "batteryChargingTracker", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "getBatteryChargingTracker", "()Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "Landroidx/work/impl/constraints/trackers/BatteryNotLowTracker;", "batteryNotLowTracker", "Landroidx/work/impl/constraints/trackers/BatteryNotLowTracker;", "getBatteryNotLowTracker", "()Landroidx/work/impl/constraints/trackers/BatteryNotLowTracker;", "Landroidx/work/impl/constraints/NetworkState;", "networkStateTracker", "getNetworkStateTracker", "storageNotLowTracker", "getStorageNotLowTracker", "Lm1p;", "taskExecutor", "<init>", "(Landroid/content/Context;Lm1p;Landroidx/work/impl/constraints/trackers/ConstraintTracker;Landroidx/work/impl/constraints/trackers/BatteryNotLowTracker;Landroidx/work/impl/constraints/trackers/ConstraintTracker;Landroidx/work/impl/constraints/trackers/ConstraintTracker;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Trackers {

    @NotNull
    private final ConstraintTracker<Boolean> batteryChargingTracker;

    @NotNull
    private final BatteryNotLowTracker batteryNotLowTracker;

    @NotNull
    private final Context context;

    @NotNull
    private final ConstraintTracker<NetworkState> networkStateTracker;

    @NotNull
    private final ConstraintTracker<Boolean> storageNotLowTracker;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Trackers(@NotNull Context context, @NotNull m1p taskExecutor) {
        this(context, taskExecutor, null, null, null, null, 60, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
    }

    @NotNull
    public final ConstraintTracker<Boolean> getBatteryChargingTracker() {
        return this.batteryChargingTracker;
    }

    @NotNull
    public final BatteryNotLowTracker getBatteryNotLowTracker() {
        return this.batteryNotLowTracker;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final ConstraintTracker<NetworkState> getNetworkStateTracker() {
        return this.networkStateTracker;
    }

    @NotNull
    public final ConstraintTracker<Boolean> getStorageNotLowTracker() {
        return this.storageNotLowTracker;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Trackers(@NotNull Context context, @NotNull m1p taskExecutor, @NotNull ConstraintTracker<Boolean> batteryChargingTracker) {
        this(context, taskExecutor, batteryChargingTracker, null, null, null, 56, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Intrinsics.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Trackers(@NotNull Context context, @NotNull m1p taskExecutor, @NotNull ConstraintTracker<Boolean> batteryChargingTracker, @NotNull BatteryNotLowTracker batteryNotLowTracker) {
        this(context, taskExecutor, batteryChargingTracker, batteryNotLowTracker, null, null, 48, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Intrinsics.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
        Intrinsics.checkNotNullParameter(batteryNotLowTracker, "batteryNotLowTracker");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Trackers(@NotNull Context context, @NotNull m1p taskExecutor, @NotNull ConstraintTracker<Boolean> batteryChargingTracker, @NotNull BatteryNotLowTracker batteryNotLowTracker, @NotNull ConstraintTracker<NetworkState> networkStateTracker) {
        this(context, taskExecutor, batteryChargingTracker, batteryNotLowTracker, networkStateTracker, null, 32, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Intrinsics.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
        Intrinsics.checkNotNullParameter(batteryNotLowTracker, "batteryNotLowTracker");
        Intrinsics.checkNotNullParameter(networkStateTracker, "networkStateTracker");
    }

    @JvmOverloads
    public Trackers(@NotNull Context context, @NotNull m1p taskExecutor, @NotNull ConstraintTracker<Boolean> batteryChargingTracker, @NotNull BatteryNotLowTracker batteryNotLowTracker, @NotNull ConstraintTracker<NetworkState> networkStateTracker, @NotNull ConstraintTracker<Boolean> storageNotLowTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Intrinsics.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
        Intrinsics.checkNotNullParameter(batteryNotLowTracker, "batteryNotLowTracker");
        Intrinsics.checkNotNullParameter(networkStateTracker, "networkStateTracker");
        Intrinsics.checkNotNullParameter(storageNotLowTracker, "storageNotLowTracker");
        this.context = context;
        this.batteryChargingTracker = batteryChargingTracker;
        this.batteryNotLowTracker = batteryNotLowTracker;
        this.networkStateTracker = networkStateTracker;
        this.storageNotLowTracker = storageNotLowTracker;
    }

    public /* synthetic */ Trackers(Context context, m1p m1pVar, ConstraintTracker constraintTracker, BatteryNotLowTracker batteryNotLowTracker, ConstraintTracker constraintTracker2, ConstraintTracker constraintTracker3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        ConstraintTracker batteryChargingTracker;
        BatteryNotLowTracker batteryNotLowTracker2;
        ConstraintTracker constraintTrackerNetworkStateTracker;
        ConstraintTracker storageNotLowTracker;
        if ((i & 4) != 0) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            batteryChargingTracker = new BatteryChargingTracker(applicationContext, m1pVar);
        } else {
            batteryChargingTracker = constraintTracker;
        }
        if ((i & 8) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "context.applicationContext");
            batteryNotLowTracker2 = new BatteryNotLowTracker(applicationContext2, m1pVar);
        } else {
            batteryNotLowTracker2 = batteryNotLowTracker;
        }
        if ((i & 16) != 0) {
            Context applicationContext3 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext3, "context.applicationContext");
            constraintTrackerNetworkStateTracker = NetworkStateTrackerKt.NetworkStateTracker(applicationContext3, m1pVar);
        } else {
            constraintTrackerNetworkStateTracker = constraintTracker2;
        }
        if ((i & 32) != 0) {
            Context applicationContext4 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext4, "context.applicationContext");
            storageNotLowTracker = new StorageNotLowTracker(applicationContext4, m1pVar);
        } else {
            storageNotLowTracker = constraintTracker3;
        }
        this(context, m1pVar, batteryChargingTracker, batteryNotLowTracker2, constraintTrackerNetworkStateTracker, storageNotLowTracker);
    }
}
