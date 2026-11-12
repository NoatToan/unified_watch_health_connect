package com.huami.pai.ui.sporthint;

import com.alipay.sdk.m.x.c;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/huami/pai/ui/sporthint/PaiSportGoalResult;", "", "", "toString", "<init>", "()V", "PaiProgressGoal", "PaiReachGoal", "PaiRestGoal", "Lcom/huami/pai/ui/sporthint/PaiSportGoalResult$PaiReachGoal;", "Lcom/huami/pai/ui/sporthint/PaiSportGoalResult$PaiProgressGoal;", "Lcom/huami/pai/ui/sporthint/PaiSportGoalResult$PaiRestGoal;", "lib_release"}, k = 1, mv = {1, 5, 1})
public abstract class PaiSportGoalResult {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/huami/pai/ui/sporthint/PaiSportGoalResult$PaiProgressGoal;", "Lcom/huami/pai/ui/sporthint/PaiSportGoalResult;", "", "component1", "component2", c.c, "target", "copy", "", "toString", "hashCode", "", "other", "", "equals", "a", LogUtil.I, "getV1", "()I", "b", "getTarget", "<init>", "(II)V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class PaiProgressGoal extends PaiSportGoalResult {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final int v1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final int target;

        public PaiProgressGoal(int i, int i2) {
            super(null);
            this.v1 = i;
            this.target = i2;
        }

        public static /* synthetic */ PaiProgressGoal copy$default(PaiProgressGoal paiProgressGoal, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = paiProgressGoal.v1;
            }
            if ((i3 & 2) != 0) {
                i2 = paiProgressGoal.target;
            }
            return paiProgressGoal.copy(i, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getV1() {
            return this.v1;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getTarget() {
            return this.target;
        }

        @NotNull
        public final PaiProgressGoal copy(int v1, int target) {
            return new PaiProgressGoal(v1, target);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaiProgressGoal)) {
                return false;
            }
            PaiProgressGoal paiProgressGoal = (PaiProgressGoal) other;
            return this.v1 == paiProgressGoal.v1 && this.target == paiProgressGoal.target;
        }

        public final int getTarget() {
            return this.target;
        }

        public final int getV1() {
            return this.v1;
        }

        public int hashCode() {
            return (this.v1 * 31) + this.target;
        }

        @Override // com.huami.pai.ui.sporthint.PaiSportGoalResult
        @NotNull
        public String toString() {
            return "PaiProgressGoal(v1=" + this.v1 + ", target=" + this.target + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/huami/pai/ui/sporthint/PaiSportGoalResult$PaiReachGoal;", "Lcom/huami/pai/ui/sporthint/PaiSportGoalResult;", "", "component1", "strResId", "copy", "", "toString", "hashCode", "", "other", "", "equals", "a", LogUtil.I, "getStrResId", "()I", "<init>", "(I)V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class PaiReachGoal extends PaiSportGoalResult {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final int strResId;

        public PaiReachGoal(int i) {
            super(null);
            this.strResId = i;
        }

        public static /* synthetic */ PaiReachGoal copy$default(PaiReachGoal paiReachGoal, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = paiReachGoal.strResId;
            }
            return paiReachGoal.copy(i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getStrResId() {
            return this.strResId;
        }

        @NotNull
        public final PaiReachGoal copy(int strResId) {
            return new PaiReachGoal(strResId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PaiReachGoal) && this.strResId == ((PaiReachGoal) other).strResId;
        }

        public final int getStrResId() {
            return this.strResId;
        }

        public int hashCode() {
            return this.strResId;
        }

        @Override // com.huami.pai.ui.sporthint.PaiSportGoalResult
        @NotNull
        public String toString() {
            return "PaiReachGoal(strResId=" + this.strResId + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/huami/pai/ui/sporthint/PaiSportGoalResult$PaiRestGoal;", "Lcom/huami/pai/ui/sporthint/PaiSportGoalResult;", "", "component1", "component2", c.c, "target", "copy", "", "toString", "hashCode", "", "other", "", "equals", "a", LogUtil.I, "getV1", "()I", "b", "getTarget", "<init>", "(II)V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class PaiRestGoal extends PaiSportGoalResult {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final int v1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final int target;

        public PaiRestGoal(int i, int i2) {
            super(null);
            this.v1 = i;
            this.target = i2;
        }

        public static /* synthetic */ PaiRestGoal copy$default(PaiRestGoal paiRestGoal, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = paiRestGoal.v1;
            }
            if ((i3 & 2) != 0) {
                i2 = paiRestGoal.target;
            }
            return paiRestGoal.copy(i, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getV1() {
            return this.v1;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getTarget() {
            return this.target;
        }

        @NotNull
        public final PaiRestGoal copy(int v1, int target) {
            return new PaiRestGoal(v1, target);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaiRestGoal)) {
                return false;
            }
            PaiRestGoal paiRestGoal = (PaiRestGoal) other;
            return this.v1 == paiRestGoal.v1 && this.target == paiRestGoal.target;
        }

        public final int getTarget() {
            return this.target;
        }

        public final int getV1() {
            return this.v1;
        }

        public int hashCode() {
            return (this.v1 * 31) + this.target;
        }

        @Override // com.huami.pai.ui.sporthint.PaiSportGoalResult
        @NotNull
        public String toString() {
            return "PaiRestGoal(v1=" + this.v1 + ", target=" + this.target + ")";
        }
    }

    private PaiSportGoalResult() {
    }

    public /* synthetic */ PaiSportGoalResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public String toString() {
        if (this instanceof PaiReachGoal) {
            return String.valueOf(((PaiReachGoal) this).getStrResId());
        }
        if (!(this instanceof PaiProgressGoal)) {
            if (!(this instanceof PaiRestGoal)) {
                throw new NoWhenBranchMatchedException();
            }
            return "你今天还能获得" + ((PaiRestGoal) this).getV1() + " PAI";
        }
        PaiProgressGoal paiProgressGoal = (PaiProgressGoal) this;
        return "距离目标" + paiProgressGoal.getTarget() + "还差 " + paiProgressGoal.getV1() + " ";
    }
}
