package com.huami.pai_service;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u001c\u0010\b\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u00020\u00048\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/huami/pai_service/PaiStatusProgress;", "Lcom/huami/pai_service/PaiStatuInfo;", "", "component1", "", "component2", "component3", "component4", "desc", "currentTotalPai", "nextGoalDist", "currentGetDesc", "copy", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getDesc", "()Ljava/lang/String;", LogUtil.I, "getCurrentTotalPai", "()I", "getNextGoalDist", "getCurrentGetDesc", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "pai-service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PaiStatusProgress extends PaiStatuInfo {

    @NotNull
    private final String currentGetDesc;
    private final int currentTotalPai;

    @NotNull
    private final String desc;
    private final int nextGoalDist;

    public PaiStatusProgress(@NotNull String str, int i, int i2, @NotNull String str2) {
        super(str, i, null);
        this.desc = str;
        this.currentTotalPai = i;
        this.nextGoalDist = i2;
        this.currentGetDesc = str2;
    }

    public static /* synthetic */ PaiStatusProgress copy$default(PaiStatusProgress paiStatusProgress, String str, int i, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = paiStatusProgress.getDesc();
        }
        if ((i3 & 2) != 0) {
            i = paiStatusProgress.getCurrentTotalPai();
        }
        if ((i3 & 4) != 0) {
            i2 = paiStatusProgress.nextGoalDist;
        }
        if ((i3 & 8) != 0) {
            str2 = paiStatusProgress.currentGetDesc;
        }
        return paiStatusProgress.copy(str, i, i2, str2);
    }

    @NotNull
    public final String component1() {
        return getDesc();
    }

    public final int component2() {
        return getCurrentTotalPai();
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getNextGoalDist() {
        return this.nextGoalDist;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrentGetDesc() {
        return this.currentGetDesc;
    }

    @NotNull
    public final PaiStatusProgress copy(@NotNull String desc, int currentTotalPai, int nextGoalDist, @NotNull String currentGetDesc) {
        return new PaiStatusProgress(desc, currentTotalPai, nextGoalDist, currentGetDesc);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaiStatusProgress)) {
            return false;
        }
        PaiStatusProgress paiStatusProgress = (PaiStatusProgress) other;
        return Intrinsics.areEqual(getDesc(), paiStatusProgress.getDesc()) && getCurrentTotalPai() == paiStatusProgress.getCurrentTotalPai() && this.nextGoalDist == paiStatusProgress.nextGoalDist && Intrinsics.areEqual(this.currentGetDesc, paiStatusProgress.currentGetDesc);
    }

    @NotNull
    public final String getCurrentGetDesc() {
        return this.currentGetDesc;
    }

    @Override // com.huami.pai_service.PaiStatuInfo
    public int getCurrentTotalPai() {
        return this.currentTotalPai;
    }

    @Override // com.huami.pai_service.PaiStatuInfo
    @NotNull
    public String getDesc() {
        return this.desc;
    }

    public final int getNextGoalDist() {
        return this.nextGoalDist;
    }

    public int hashCode() {
        return (((((getDesc().hashCode() * 31) + getCurrentTotalPai()) * 31) + this.nextGoalDist) * 31) + this.currentGetDesc.hashCode();
    }

    @NotNull
    public String toString() {
        return "PaiStatusProgress(desc=" + getDesc() + ", currentTotalPai=" + getCurrentTotalPai() + ", nextGoalDist=" + this.nextGoalDist + ", currentGetDesc=" + this.currentGetDesc + ")";
    }
}
