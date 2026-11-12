package com.huami.nfc.door.entity;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ:\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\t\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\u000b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001e\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\b¨\u0006\""}, d2 = {"Lcom/huami/nfc/door/entity/VerifyEntity;", "", "", "component1", "component2", "component3", "", "component4", "()Ljava/lang/Long;", "type", "cardNo", "realName", "time", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/huami/nfc/door/entity/VerifyEntity;", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "b", "getCardNo", "c", "getRealName", GoogleApiAvailabilityLight.a, "Ljava/lang/Long;", "getTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "nfc-door_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class VerifyEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("cardNo")
    @NotNull
    private final String cardNo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("realName")
    @NotNull
    private final String realName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("time")
    @Nullable
    private final Long time;

    public VerifyEntity(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Long l) {
        this.type = str;
        this.cardNo = str2;
        this.realName = str3;
        this.time = l;
    }

    public static /* synthetic */ VerifyEntity copy$default(VerifyEntity verifyEntity, String str, String str2, String str3, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verifyEntity.type;
        }
        if ((i & 2) != 0) {
            str2 = verifyEntity.cardNo;
        }
        if ((i & 4) != 0) {
            str3 = verifyEntity.realName;
        }
        if ((i & 8) != 0) {
            l = verifyEntity.time;
        }
        return verifyEntity.copy(str, str2, str3, l);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCardNo() {
        return this.cardNo;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRealName() {
        return this.realName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getTime() {
        return this.time;
    }

    @NotNull
    public final VerifyEntity copy(@NotNull String type, @NotNull String cardNo, @NotNull String realName, @Nullable Long time) {
        return new VerifyEntity(type, cardNo, realName, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyEntity)) {
            return false;
        }
        VerifyEntity verifyEntity = (VerifyEntity) other;
        return Intrinsics.areEqual(this.type, verifyEntity.type) && Intrinsics.areEqual(this.cardNo, verifyEntity.cardNo) && Intrinsics.areEqual(this.realName, verifyEntity.realName) && Intrinsics.areEqual(this.time, verifyEntity.time);
    }

    @NotNull
    public final String getCardNo() {
        return this.cardNo;
    }

    @NotNull
    public final String getRealName() {
        return this.realName;
    }

    @Nullable
    public final Long getTime() {
        return this.time;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((this.type.hashCode() * 31) + this.cardNo.hashCode()) * 31) + this.realName.hashCode()) * 31;
        Long l = this.time;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    @NotNull
    public String toString() {
        return "VerifyEntity(type=" + this.type + ", cardNo=" + this.cardNo + ", realName=" + this.realName + ", time=" + this.time + ')';
    }
}
