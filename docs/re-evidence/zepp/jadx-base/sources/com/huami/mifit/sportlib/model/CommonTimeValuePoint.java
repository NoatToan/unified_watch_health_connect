package com.huami.mifit.sportlib.model;

import androidx.annotation.Keep;
import defpackage.b;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\t\u001a\u00020\u0004H\u0016J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/mifit/sportlib/model/CommonTimeValuePoint;", "", "", "baseTime", "", "getRelativeTime", "other", "", "equals", "hashCode", "component1", "", "component2", "absoluteTime", "value", "copy", "", "toString", "J", "getAbsoluteTime", "()J", "F", "getValue", "()F", "<init>", "(JF)V", "sportlib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CommonTimeValuePoint {
    private final long absoluteTime;
    private final float value;

    public CommonTimeValuePoint(long j, float f) {
        this.absoluteTime = j;
        this.value = f;
    }

    public static /* synthetic */ CommonTimeValuePoint copy$default(CommonTimeValuePoint commonTimeValuePoint, long j, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = commonTimeValuePoint.absoluteTime;
        }
        if ((i & 2) != 0) {
            f = commonTimeValuePoint.value;
        }
        return commonTimeValuePoint.copy(j, f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getAbsoluteTime() {
        return this.absoluteTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    @NotNull
    public final CommonTimeValuePoint copy(long absoluteTime, float value) {
        return new CommonTimeValuePoint(absoluteTime, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(CommonTimeValuePoint.class, other == null ? null : other.getClass())) {
            return false;
        }
        Objects.requireNonNull(other, "null cannot be cast to non-null type com.huami.mifit.sportlib.model.CommonTimeValuePoint");
        return this.absoluteTime == ((CommonTimeValuePoint) other).absoluteTime;
    }

    public final long getAbsoluteTime() {
        return this.absoluteTime;
    }

    public final int getRelativeTime(long baseTime) {
        return (int) (this.absoluteTime - baseTime);
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return b.a(this.absoluteTime);
    }

    @NotNull
    public String toString() {
        return "CommonTimeValuePoint(absoluteTime=" + this.absoluteTime + ", value=" + this.value + ")";
    }
}
