package com.huami.pai_service;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001c\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u00020\u00048\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/huami/pai_service/PaiStatusSuccess;", "Lcom/huami/pai_service/PaiStatuInfo;", "", "component1", "", "component2", "component3", "desc", "currentTotalPai", "currentGetDesc", "copy", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getDesc", "()Ljava/lang/String;", LogUtil.I, "getCurrentTotalPai", "()I", "getCurrentGetDesc", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "pai-service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PaiStatusSuccess extends PaiStatuInfo {

    @NotNull
    private final String currentGetDesc;
    private final int currentTotalPai;

    @NotNull
    private final String desc;

    public PaiStatusSuccess(@NotNull String str, int i, @NotNull String str2) {
        super(str, i, null);
        this.desc = str;
        this.currentTotalPai = i;
        this.currentGetDesc = str2;
    }

    public static /* synthetic */ PaiStatusSuccess copy$default(PaiStatusSuccess paiStatusSuccess, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = paiStatusSuccess.getDesc();
        }
        if ((i2 & 2) != 0) {
            i = paiStatusSuccess.getCurrentTotalPai();
        }
        if ((i2 & 4) != 0) {
            str2 = paiStatusSuccess.currentGetDesc;
        }
        return paiStatusSuccess.copy(str, i, str2);
    }

    @NotNull
    public final String component1() {
        return getDesc();
    }

    public final int component2() {
        return getCurrentTotalPai();
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrentGetDesc() {
        return this.currentGetDesc;
    }

    @NotNull
    public final PaiStatusSuccess copy(@NotNull String desc, int currentTotalPai, @NotNull String currentGetDesc) {
        return new PaiStatusSuccess(desc, currentTotalPai, currentGetDesc);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaiStatusSuccess)) {
            return false;
        }
        PaiStatusSuccess paiStatusSuccess = (PaiStatusSuccess) other;
        return Intrinsics.areEqual(getDesc(), paiStatusSuccess.getDesc()) && getCurrentTotalPai() == paiStatusSuccess.getCurrentTotalPai() && Intrinsics.areEqual(this.currentGetDesc, paiStatusSuccess.currentGetDesc);
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

    public int hashCode() {
        return (((getDesc().hashCode() * 31) + getCurrentTotalPai()) * 31) + this.currentGetDesc.hashCode();
    }

    @NotNull
    public String toString() {
        return "PaiStatusSuccess(desc=" + getDesc() + ", currentTotalPai=" + getCurrentTotalPai() + ", currentGetDesc=" + this.currentGetDesc + ")";
    }
}
