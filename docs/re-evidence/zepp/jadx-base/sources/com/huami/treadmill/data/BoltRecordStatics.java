package com.huami.treadmill.data;

import com.google.android.gms.fitness.data.Field;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001b¨\u0006 "}, d2 = {"Lcom/huami/treadmill/data/BoltRecordStatics;", "", "", "component1", "", "component2", "component3", "count", "distance", Field.NUTRIENT_CALORIES, "copy", "", "toString", "", "hashCode", "other", "", "equals", "J", "getCount", "()J", "setCount", "(J)V", "F", "getDistance", "()F", "setDistance", "(F)V", "getCalories", "setCalories", "<init>", "(JFF)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BoltRecordStatics {
    private float calories;
    private long count;
    private float distance;

    public BoltRecordStatics() {
        this(0L, 0.0f, 0.0f, 7, null);
    }

    public BoltRecordStatics(long j, float f, float f2) {
        this.count = j;
        this.distance = f;
        this.calories = f2;
    }

    public static /* synthetic */ BoltRecordStatics copy$default(BoltRecordStatics boltRecordStatics, long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = boltRecordStatics.count;
        }
        if ((i & 2) != 0) {
            f = boltRecordStatics.distance;
        }
        if ((i & 4) != 0) {
            f2 = boltRecordStatics.calories;
        }
        return boltRecordStatics.copy(j, f, f2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getCalories() {
        return this.calories;
    }

    @NotNull
    public final BoltRecordStatics copy(long count, float distance, float calories) {
        return new BoltRecordStatics(count, distance, calories);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoltRecordStatics)) {
            return false;
        }
        BoltRecordStatics boltRecordStatics = (BoltRecordStatics) other;
        return this.count == boltRecordStatics.count && Intrinsics.areEqual((Object) Float.valueOf(this.distance), (Object) Float.valueOf(boltRecordStatics.distance)) && Intrinsics.areEqual((Object) Float.valueOf(this.calories), (Object) Float.valueOf(boltRecordStatics.calories));
    }

    public final float getCalories() {
        return this.calories;
    }

    public final long getCount() {
        return this.count;
    }

    public final float getDistance() {
        return this.distance;
    }

    public int hashCode() {
        return (((b.a(this.count) * 31) + Float.floatToIntBits(this.distance)) * 31) + Float.floatToIntBits(this.calories);
    }

    public final void setCalories(float f) {
        this.calories = f;
    }

    public final void setCount(long j) {
        this.count = j;
    }

    public final void setDistance(float f) {
        this.distance = f;
    }

    @NotNull
    public String toString() {
        return "BoltRecordStatics(count=" + this.count + ", distance=" + this.distance + ", calories=" + this.calories + ')';
    }

    public /* synthetic */ BoltRecordStatics(long j, float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2);
    }
}
