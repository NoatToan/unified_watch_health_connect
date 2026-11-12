package com.xiaomi.fitness.sport_eco.view.environmental.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/environmental/model/EcoEnvironmentalResp;", "", "uid", "", "createTime", "value", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getUid", "()Ljava/lang/String;", "setUid", "(Ljava/lang/String;)V", "getCreateTime", "setCreateTime", "getValue", "()I", "setValue", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EcoEnvironmentalResp {

    @NotNull
    private String createTime;

    @NotNull
    private String uid;
    private int value;

    public EcoEnvironmentalResp(@NotNull String uid, @NotNull String createTime, int i) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(createTime, "createTime");
        this.uid = uid;
        this.createTime = createTime;
        this.value = i;
    }

    public static /* synthetic */ EcoEnvironmentalResp copy$default(EcoEnvironmentalResp ecoEnvironmentalResp, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = ecoEnvironmentalResp.uid;
        }
        if ((i2 & 2) != 0) {
            str2 = ecoEnvironmentalResp.createTime;
        }
        if ((i2 & 4) != 0) {
            i = ecoEnvironmentalResp.value;
        }
        return ecoEnvironmentalResp.copy(str, str2, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCreateTime() {
        return this.createTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @NotNull
    public final EcoEnvironmentalResp copy(@NotNull String uid, @NotNull String createTime, int value) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(createTime, "createTime");
        return new EcoEnvironmentalResp(uid, createTime, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcoEnvironmentalResp)) {
            return false;
        }
        EcoEnvironmentalResp ecoEnvironmentalResp = (EcoEnvironmentalResp) other;
        return Intrinsics.areEqual(this.uid, ecoEnvironmentalResp.uid) && Intrinsics.areEqual(this.createTime, ecoEnvironmentalResp.createTime) && this.value == ecoEnvironmentalResp.value;
    }

    @NotNull
    public final String getCreateTime() {
        return this.createTime;
    }

    @NotNull
    public final String getUid() {
        return this.uid;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((this.uid.hashCode() * 31) + this.createTime.hashCode()) * 31) + Integer.hashCode(this.value);
    }

    public final void setCreateTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.createTime = str;
    }

    public final void setUid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uid = str;
    }

    public final void setValue(int i) {
        this.value = i;
    }

    @NotNull
    public String toString() {
        return "EcoEnvironmentalResp(uid=" + this.uid + ", createTime=" + this.createTime + ", value=" + this.value + ")";
    }
}
