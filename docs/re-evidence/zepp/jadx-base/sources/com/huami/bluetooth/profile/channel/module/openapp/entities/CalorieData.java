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
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u0000 '2\u00020\u0001:\u0001'B?\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0004j\b\u0012\u0004\u0012\u00020\u0002`\u0005\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0019\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0004j\b\u0012\u0004\u0012\u00020\u0002`\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003JK\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0004j\b\u0012\u0004\u0012\u00020\u0002`\u00052\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR)\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0004j\b\u0012\u0004\u0012\u00020\u0002`\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u001a¨\u0006("}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/openapp/entities/CalorieData;", "Ljava/io/Serializable;", "", "component1", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "component2", "component3", "component4", "component5", "total", "caloriesPerHalfHour", StatEvent.EventParams.TYPE_CARD_GOAL, "lastTotal", "basicCalorie", "copy", "", "toString", "hashCode", "", "other", "", "equals", "a", LogUtil.I, "getTotal", "()I", "b", "Ljava/util/ArrayList;", "getCaloriesPerHalfHour", "()Ljava/util/ArrayList;", "c", "getGoal", GoogleApiAvailabilityLight.a, "getLastTotal", "e", "getBasicCalorie", "<init>", "(ILjava/util/ArrayList;III)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CalorieData implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int total;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final ArrayList<Integer> caloriesPerHalfHour;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int goal;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int lastTotal;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int basicCalorie;

    public CalorieData(int i, @NotNull ArrayList<Integer> arrayList, int i2, int i3, int i4) {
        this.total = i;
        this.caloriesPerHalfHour = arrayList;
        this.goal = i2;
        this.lastTotal = i3;
        this.basicCalorie = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CalorieData copy$default(CalorieData calorieData, int i, ArrayList arrayList, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = calorieData.total;
        }
        if ((i5 & 2) != 0) {
            arrayList = calorieData.caloriesPerHalfHour;
        }
        ArrayList arrayList2 = arrayList;
        if ((i5 & 4) != 0) {
            i2 = calorieData.goal;
        }
        int i6 = i2;
        if ((i5 & 8) != 0) {
            i3 = calorieData.lastTotal;
        }
        int i7 = i3;
        if ((i5 & 16) != 0) {
            i4 = calorieData.basicCalorie;
        }
        return calorieData.copy(i, arrayList2, i6, i7, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    @NotNull
    public final ArrayList<Integer> component2() {
        return this.caloriesPerHalfHour;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getGoal() {
        return this.goal;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getLastTotal() {
        return this.lastTotal;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getBasicCalorie() {
        return this.basicCalorie;
    }

    @NotNull
    public final CalorieData copy(int total, @NotNull ArrayList<Integer> caloriesPerHalfHour, int goal, int lastTotal, int basicCalorie) {
        return new CalorieData(total, caloriesPerHalfHour, goal, lastTotal, basicCalorie);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalorieData)) {
            return false;
        }
        CalorieData calorieData = (CalorieData) other;
        return this.total == calorieData.total && Intrinsics.areEqual(this.caloriesPerHalfHour, calorieData.caloriesPerHalfHour) && this.goal == calorieData.goal && this.lastTotal == calorieData.lastTotal && this.basicCalorie == calorieData.basicCalorie;
    }

    public final int getBasicCalorie() {
        return this.basicCalorie;
    }

    @NotNull
    public final ArrayList<Integer> getCaloriesPerHalfHour() {
        return this.caloriesPerHalfHour;
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
        return (((((((this.total * 31) + this.caloriesPerHalfHour.hashCode()) * 31) + this.goal) * 31) + this.lastTotal) * 31) + this.basicCalorie;
    }

    @NotNull
    public String toString() {
        return "CalorieData(total=" + this.total + ", caloriesPerHalfHour=" + this.caloriesPerHalfHour + ", goal=" + this.goal + ", lastTotal=" + this.lastTotal + ", basicCalorie=" + this.basicCalorie + ')';
    }
}
