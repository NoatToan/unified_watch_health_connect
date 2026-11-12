package com.huami.moving.model;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b \u0010!J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\nHÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J;\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0014\u001a\u00020\bHÖ\u0001R\u0019\u0010\u000e\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u000f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0010\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0011\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\u0012\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017¨\u0006\""}, d2 = {"Lcom/huami/moving/model/StrengthTrainingAction;", "", "other", "", "equals", "", "hashCode", "component1", "", "component2", "", "component3", "component4", "component5", "actionType", "actionName", "mainPositions", "subPositions", "selfWeightType", "copy", "toString", LogUtil.I, "getActionType", "()I", "Ljava/lang/String;", "getActionName", "()Ljava/lang/String;", "[I", "getMainPositions", "()[I", "getSubPositions", "getSelfWeightType", "<init>", "(ILjava/lang/String;[I[II)V", "moving_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StrengthTrainingAction {

    @NotNull
    private final String actionName;
    private final int actionType;

    @NotNull
    private final int[] mainPositions;
    private final int selfWeightType;

    @NotNull
    private final int[] subPositions;

    public StrengthTrainingAction(int i, @NotNull String str, @NotNull int[] iArr, @NotNull int[] iArr2, int i2) {
        this.actionType = i;
        this.actionName = str;
        this.mainPositions = iArr;
        this.subPositions = iArr2;
        this.selfWeightType = i2;
    }

    public static /* synthetic */ StrengthTrainingAction copy$default(StrengthTrainingAction strengthTrainingAction, int i, String str, int[] iArr, int[] iArr2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = strengthTrainingAction.actionType;
        }
        if ((i3 & 2) != 0) {
            str = strengthTrainingAction.actionName;
        }
        String str2 = str;
        if ((i3 & 4) != 0) {
            iArr = strengthTrainingAction.mainPositions;
        }
        int[] iArr3 = iArr;
        if ((i3 & 8) != 0) {
            iArr2 = strengthTrainingAction.subPositions;
        }
        int[] iArr4 = iArr2;
        if ((i3 & 16) != 0) {
            i2 = strengthTrainingAction.selfWeightType;
        }
        return strengthTrainingAction.copy(i, str2, iArr3, iArr4, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getActionType() {
        return this.actionType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getActionName() {
        return this.actionName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int[] getMainPositions() {
        return this.mainPositions;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int[] getSubPositions() {
        return this.subPositions;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSelfWeightType() {
        return this.selfWeightType;
    }

    @NotNull
    public final StrengthTrainingAction copy(int actionType, @NotNull String actionName, @NotNull int[] mainPositions, @NotNull int[] subPositions, int selfWeightType) {
        return new StrengthTrainingAction(actionType, actionName, mainPositions, subPositions, selfWeightType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(StrengthTrainingAction.class, other == null ? null : other.getClass())) {
            return false;
        }
        Objects.requireNonNull(other, "null cannot be cast to non-null type com.huami.moving.model.StrengthTrainingAction");
        StrengthTrainingAction strengthTrainingAction = (StrengthTrainingAction) other;
        return this.actionType == strengthTrainingAction.actionType && this.selfWeightType == strengthTrainingAction.selfWeightType;
    }

    @NotNull
    public final String getActionName() {
        return this.actionName;
    }

    public final int getActionType() {
        return this.actionType;
    }

    @NotNull
    public final int[] getMainPositions() {
        return this.mainPositions;
    }

    public final int getSelfWeightType() {
        return this.selfWeightType;
    }

    @NotNull
    public final int[] getSubPositions() {
        return this.subPositions;
    }

    public int hashCode() {
        return (this.actionType * 31) + this.selfWeightType;
    }

    @NotNull
    public String toString() {
        return "StrengthTrainingAction(actionType=" + this.actionType + ", actionName=" + this.actionName + ", mainPositions=" + Arrays.toString(this.mainPositions) + ", subPositions=" + Arrays.toString(this.subPositions) + ", selfWeightType=" + this.selfWeightType + ")";
    }
}
