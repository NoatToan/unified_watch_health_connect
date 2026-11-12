package com.huami.ednetwork;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J!\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/ednetwork/WhiteBoxKeyEntity;", "", "", "component1", "component2", "hm_ekv", "wb_key", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getHm_ekv", "()Ljava/lang/String;", "getWb_key", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "ednetwork_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class WhiteBoxKeyEntity {

    @Nullable
    private final String hm_ekv;

    @Nullable
    private final String wb_key;

    public WhiteBoxKeyEntity(@Nullable String str, @Nullable String str2) {
        this.hm_ekv = str;
        this.wb_key = str2;
    }

    public static /* synthetic */ WhiteBoxKeyEntity copy$default(WhiteBoxKeyEntity whiteBoxKeyEntity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = whiteBoxKeyEntity.hm_ekv;
        }
        if ((i & 2) != 0) {
            str2 = whiteBoxKeyEntity.wb_key;
        }
        return whiteBoxKeyEntity.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHm_ekv() {
        return this.hm_ekv;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWb_key() {
        return this.wb_key;
    }

    @NotNull
    public final WhiteBoxKeyEntity copy(@Nullable String hm_ekv, @Nullable String wb_key) {
        return new WhiteBoxKeyEntity(hm_ekv, wb_key);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhiteBoxKeyEntity)) {
            return false;
        }
        WhiteBoxKeyEntity whiteBoxKeyEntity = (WhiteBoxKeyEntity) other;
        return Intrinsics.areEqual(this.hm_ekv, whiteBoxKeyEntity.hm_ekv) && Intrinsics.areEqual(this.wb_key, whiteBoxKeyEntity.wb_key);
    }

    @Nullable
    public final String getHm_ekv() {
        return this.hm_ekv;
    }

    @Nullable
    public final String getWb_key() {
        return this.wb_key;
    }

    public int hashCode() {
        String str = this.hm_ekv;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.wb_key;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WhiteBoxKeyEntity(hm_ekv=" + this.hm_ekv + ", wb_key=" + this.wb_key + ")";
    }
}
