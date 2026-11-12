package com.huami.respiratoryrate.core.data.remote.entity;

import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.huami.respiratoryrate.core.data.remote.entity.EventValueOffset, reason: from toString */
/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\t\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/huami/respiratoryrate/core/data/remote/entity/EventValueOffset;", "", "", "toString", "", "component1", "", "component2", TypedValues.CycleType.S_WAVE_PERIOD, "offset", "copy", "hashCode", "other", "", "equals", "[I", "getPeriod", "()[I", LogUtil.I, "getOffset", "()I", "<init>", "([II)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Offset {
    private final int offset;

    @NotNull
    private final int[] period;

    public Offset(@NotNull int[] iArr, int i) {
        this.period = iArr;
        this.offset = i;
    }

    public static /* synthetic */ Offset copy$default(Offset offset, int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            iArr = offset.period;
        }
        if ((i2 & 2) != 0) {
            i = offset.offset;
        }
        return offset.copy(iArr, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int[] getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    @NotNull
    public final Offset copy(@NotNull int[] period, int offset) {
        return new Offset(period, offset);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Offset)) {
            return false;
        }
        Offset offset = (Offset) other;
        return Intrinsics.areEqual(this.period, offset.period) && this.offset == offset.offset;
    }

    public final int getOffset() {
        return this.offset;
    }

    @NotNull
    public final int[] getPeriod() {
        return this.period;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.period) * 31) + this.offset;
    }

    @NotNull
    public String toString() {
        return "Offset(period=" + Arrays.toString(this.period) + ", offset=" + this.offset + ')';
    }
}
