package com.xiaomi.hm.health.nfc.service;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0005\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/nfc/service/SeInfoEntity;", "", "", "component1", "component2", "seId", "cplc", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getSeId", "()Ljava/lang/String;", "b", "getCplc", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SeInfoEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("seId")
    @NotNull
    private final String seId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("cplc")
    @NotNull
    private final String cplc;

    public SeInfoEntity(@NotNull String str, @NotNull String str2) {
        this.seId = str;
        this.cplc = str2;
    }

    public static /* synthetic */ SeInfoEntity copy$default(SeInfoEntity seInfoEntity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = seInfoEntity.seId;
        }
        if ((i & 2) != 0) {
            str2 = seInfoEntity.cplc;
        }
        return seInfoEntity.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSeId() {
        return this.seId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCplc() {
        return this.cplc;
    }

    @NotNull
    public final SeInfoEntity copy(@NotNull String seId, @NotNull String cplc) {
        return new SeInfoEntity(seId, cplc);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeInfoEntity)) {
            return false;
        }
        SeInfoEntity seInfoEntity = (SeInfoEntity) other;
        return Intrinsics.areEqual(this.seId, seInfoEntity.seId) && Intrinsics.areEqual(this.cplc, seInfoEntity.cplc);
    }

    @NotNull
    public final String getCplc() {
        return this.cplc;
    }

    @NotNull
    public final String getSeId() {
        return this.seId;
    }

    public int hashCode() {
        return (this.seId.hashCode() * 31) + this.cplc.hashCode();
    }

    @NotNull
    public String toString() {
        return "SeInfoEntity(seId=" + this.seId + ", cplc=" + this.cplc + ")";
    }
}
