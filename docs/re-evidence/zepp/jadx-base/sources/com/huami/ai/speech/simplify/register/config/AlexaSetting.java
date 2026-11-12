package com.huami.ai.speech.simplify.register.config;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0005\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/ai/speech/simplify/register/config/AlexaSetting;", "", "", "component1", "component2", "prodId", "betaId", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getProdId", "()Ljava/lang/String;", "b", "getBetaId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "speech-simplify_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AlexaSetting {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("prodId")
    @NotNull
    private final String prodId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("betaId")
    @Nullable
    private final String betaId;

    public AlexaSetting(@NotNull String str, @Nullable String str2) {
        this.prodId = str;
        this.betaId = str2;
    }

    public static /* synthetic */ AlexaSetting copy$default(AlexaSetting alexaSetting, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alexaSetting.prodId;
        }
        if ((i & 2) != 0) {
            str2 = alexaSetting.betaId;
        }
        return alexaSetting.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProdId() {
        return this.prodId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBetaId() {
        return this.betaId;
    }

    @NotNull
    public final AlexaSetting copy(@NotNull String prodId, @Nullable String betaId) {
        return new AlexaSetting(prodId, betaId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlexaSetting)) {
            return false;
        }
        AlexaSetting alexaSetting = (AlexaSetting) other;
        return Intrinsics.areEqual(this.prodId, alexaSetting.prodId) && Intrinsics.areEqual(this.betaId, alexaSetting.betaId);
    }

    @Nullable
    public final String getBetaId() {
        return this.betaId;
    }

    @NotNull
    public final String getProdId() {
        return this.prodId;
    }

    public int hashCode() {
        int iHashCode = this.prodId.hashCode() * 31;
        String str = this.betaId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "AlexaSetting(prodId=" + this.prodId + ", betaId=" + ((Object) this.betaId) + ')';
    }
}
