package com.xiaomi.fitness.data.bean;

import com.google.gson.annotations.SerializedName;
import defpackage.ecf;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/data/bean/ThreeTargetMedalInfo;", "", "Lecf;", "component1", "()Lecf;", "medalData", "copy", "(Lecf;)Lcom/xiaomi/fitness/data/bean/ThreeTargetMedalInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lecf;", "getMedalData", "setMedalData", "(Lecf;)V", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final /* data */ class ThreeTargetMedalInfo {

    @SerializedName("medal_data")
    @Nullable
    private ecf medalData;

    /* JADX WARN: Multi-variable type inference failed */
    public ThreeTargetMedalInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ThreeTargetMedalInfo copy$default(ThreeTargetMedalInfo threeTargetMedalInfo, ecf ecfVar, int i, Object obj) {
        if ((i & 1) != 0) {
            ecfVar = threeTargetMedalInfo.medalData;
        }
        return threeTargetMedalInfo.copy(ecfVar);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ecf getMedalData() {
        return this.medalData;
    }

    @NotNull
    public final ThreeTargetMedalInfo copy(@Nullable ecf medalData) {
        return new ThreeTargetMedalInfo(medalData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ThreeTargetMedalInfo) && Intrinsics.areEqual(this.medalData, ((ThreeTargetMedalInfo) other).medalData);
    }

    @Nullable
    public final ecf getMedalData() {
        return this.medalData;
    }

    public int hashCode() {
        ecf ecfVar = this.medalData;
        if (ecfVar == null) {
            return 0;
        }
        return ecfVar.hashCode();
    }

    public final void setMedalData(@Nullable ecf ecfVar) {
        this.medalData = ecfVar;
    }

    @NotNull
    public String toString() {
        return "ThreeTargetMedalInfo(medalData=" + this.medalData + ")";
    }

    public /* synthetic */ ThreeTargetMedalInfo(ecf ecfVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : ecfVar);
    }

    public ThreeTargetMedalInfo(@Nullable ecf ecfVar) {
        this.medalData = ecfVar;
    }
}
