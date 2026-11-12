package com.huami.bluetooth.profile.channel.module.openapp.entities;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.device.event.StatEvent;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001#B7\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0004j\b\u0012\u0004\u0012\u00020\u0002`\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0019\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0004j\b\u0012\u0004\u0012\u00020\u0002`\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003JA\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0004j\b\u0012\u0004\u0012\u00020\u0002`\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0004j\b\u0012\u0004\u0012\u00020\u0002`\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018¨\u0006$"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/openapp/entities/FatBurningData;", "Ljava/io/Serializable;", "", "component1", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "component2", "component3", "component4", "total", "burningPerHalfHour", StatEvent.EventParams.TYPE_CARD_GOAL, "lastTotal", "copy", "", "toString", "hashCode", "", "other", "", "equals", "a", LogUtil.I, "getTotal", "()I", "b", "Ljava/util/ArrayList;", "getBurningPerHalfHour", "()Ljava/util/ArrayList;", "c", "getGoal", GoogleApiAvailabilityLight.a, "getLastTotal", "<init>", "(ILjava/util/ArrayList;II)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class FatBurningData implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int total;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final ArrayList<Integer> burningPerHalfHour;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int goal;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int lastTotal;

    public FatBurningData(int i, @NotNull ArrayList<Integer> arrayList, int i2, int i3) {
        this.total = i;
        this.burningPerHalfHour = arrayList;
        this.goal = i2;
        this.lastTotal = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FatBurningData copy$default(FatBurningData fatBurningData, int i, ArrayList arrayList, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = fatBurningData.total;
        }
        if ((i4 & 2) != 0) {
            arrayList = fatBurningData.burningPerHalfHour;
        }
        if ((i4 & 4) != 0) {
            i2 = fatBurningData.goal;
        }
        if ((i4 & 8) != 0) {
            i3 = fatBurningData.lastTotal;
        }
        return fatBurningData.copy(i, arrayList, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    @NotNull
    public final ArrayList<Integer> component2() {
        return this.burningPerHalfHour;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getGoal() {
        return this.goal;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getLastTotal() {
        return this.lastTotal;
    }

    @NotNull
    public final FatBurningData copy(int total, @NotNull ArrayList<Integer> burningPerHalfHour, int goal, int lastTotal) {
        return new FatBurningData(total, burningPerHalfHour, goal, lastTotal);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FatBurningData)) {
            return false;
        }
        FatBurningData fatBurningData = (FatBurningData) other;
        return this.total == fatBurningData.total && Intrinsics.areEqual(this.burningPerHalfHour, fatBurningData.burningPerHalfHour) && this.goal == fatBurningData.goal && this.lastTotal == fatBurningData.lastTotal;
    }

    @NotNull
    public final ArrayList<Integer> getBurningPerHalfHour() {
        return this.burningPerHalfHour;
    }

    public final int getGoal() {
        return this.goal;
    }

    public final int getLastTotal() {
        return this.lastTotal;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return (((((this.total * 31) + this.burningPerHalfHour.hashCode()) * 31) + this.goal) * 31) + this.lastTotal;
    }

    @NotNull
    public String toString() {
        return "FatBurningData(total=" + this.total + ", burningPerHalfHour=" + this.burningPerHalfHour + ", goal=" + this.goal + ", lastTotal=" + this.lastTotal + ')';
    }
}
