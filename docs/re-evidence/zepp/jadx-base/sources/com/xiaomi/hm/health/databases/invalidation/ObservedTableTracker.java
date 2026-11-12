package com.xiaomi.hm.health.databases.invalidation;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\b\u0017\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010!\u001a\u00020\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00020\u0002\"\u00020\u0003J\u0012\u0010\u0007\u001a\u00020\u00052\n\u0010\u0004\u001a\u00020\u0002\"\u00020\u0003J\u0006\u0010\t\u001a\u00020\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u001d\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0015\u0010 \u001a\u0004\u0018\u00010\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006%"}, d2 = {"Lcom/xiaomi/hm/health/databases/invalidation/ObservedTableTracker;", "", "", "", "tableIds", "", "onAdded", "onRemoved", "", "onSyncCompleted", "", "a", "[J", "mTableObservers", "", "b", "[Z", "mTriggerStates", "c", "[I", "mTriggerStateChanges", GoogleApiAvailabilityLight.a, "Z", "mNeedsSync", "e", "getMPendingSync", "()Z", "setMPendingSync", "(Z)V", "mPendingSync", "getTablesToSync", "()[I", "tablesToSync", "tableCount", "<init>", "(I)V", "Companion", "database_release"}, k = 1, mv = {1, 5, 1})
public final class ObservedTableTracker {
    public static final int ADD = 1;
    public static final int NO_OP = 0;
    public static final int REMOVE = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final long[] mTableObservers;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final boolean[] mTriggerStates;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final int[] mTriggerStateChanges;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean mNeedsSync;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean mPendingSync;

    public ObservedTableTracker(int i) {
        long[] jArr = new long[i];
        this.mTableObservers = jArr;
        boolean[] zArr = new boolean[i];
        this.mTriggerStates = zArr;
        this.mTriggerStateChanges = new int[i];
        Arrays.fill(jArr, 0L);
        Arrays.fill(zArr, false);
    }

    public final boolean getMPendingSync() {
        return this.mPendingSync;
    }

    @Nullable
    public final int[] getTablesToSync() {
        synchronized (this) {
            if (this.mNeedsSync && !getMPendingSync()) {
                int length = this.mTableObservers.length;
                if (length > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        boolean z = this.mTableObservers[i] > 0;
                        boolean[] zArr = this.mTriggerStates;
                        if (z != zArr[i]) {
                            this.mTriggerStateChanges[i] = z ? 1 : 2;
                        } else {
                            this.mTriggerStateChanges[i] = 0;
                        }
                        zArr[i] = z;
                        if (i2 >= length) {
                            break;
                        }
                        i = i2;
                    }
                }
                setMPendingSync(true);
                this.mNeedsSync = false;
                return this.mTriggerStateChanges;
            }
            return null;
        }
    }

    public final boolean onAdded(@NotNull int... tableIds) {
        boolean z;
        synchronized (this) {
            int length = tableIds.length;
            int i = 0;
            z = false;
            while (i < length) {
                int i2 = tableIds[i];
                i++;
                long[] jArr = this.mTableObservers;
                long j = jArr[i2];
                jArr[i2] = 1 + j;
                if (j == 0) {
                    this.mNeedsSync = true;
                    z = true;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        return z;
    }

    public final boolean onRemoved(@NotNull int... tableIds) {
        boolean z;
        synchronized (this) {
            int length = tableIds.length;
            int i = 0;
            z = false;
            while (i < length) {
                int i2 = tableIds[i];
                i++;
                long[] jArr = this.mTableObservers;
                long j = jArr[i2];
                jArr[i2] = j - 1;
                if (j == 1) {
                    this.mNeedsSync = true;
                    z = true;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        return z;
    }

    public final void onSyncCompleted() {
        synchronized (this) {
            setMPendingSync(false);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void setMPendingSync(boolean z) {
        this.mPendingSync = z;
    }
}
