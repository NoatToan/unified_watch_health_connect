package com.huami.relatives;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003JE\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u0019\u0010\u000f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/huami/relatives/ConstantExternal;", "", "", "component1", "component2", "component3", "component4", "component5", "", "component6", "statEventKeyNumber", "statEventKeyTime", "statEventBaseTabT", "statEventMineKeyTp", "statEventBaseTabV", "friendMessageId", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getStatEventKeyNumber", "()Ljava/lang/String;", "b", "getStatEventKeyTime", "c", "getStatEventBaseTabT", GoogleApiAvailabilityLight.a, "getStatEventMineKeyTp", "e", "getStatEventBaseTabV", "f", LogUtil.I, "getFriendMessageId", "()I", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "relatives-service_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class ConstantExternal {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String statEventKeyNumber;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String statEventKeyTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String statEventBaseTabT;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String statEventMineKeyTp;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final String statEventBaseTabV;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int friendMessageId;

    public ConstantExternal(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i) {
        this.statEventKeyNumber = str;
        this.statEventKeyTime = str2;
        this.statEventBaseTabT = str3;
        this.statEventMineKeyTp = str4;
        this.statEventBaseTabV = str5;
        this.friendMessageId = i;
    }

    public static /* synthetic */ ConstantExternal copy$default(ConstantExternal constantExternal, String str, String str2, String str3, String str4, String str5, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = constantExternal.statEventKeyNumber;
        }
        if ((i2 & 2) != 0) {
            str2 = constantExternal.statEventKeyTime;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            str3 = constantExternal.statEventBaseTabT;
        }
        String str7 = str3;
        if ((i2 & 8) != 0) {
            str4 = constantExternal.statEventMineKeyTp;
        }
        String str8 = str4;
        if ((i2 & 16) != 0) {
            str5 = constantExternal.statEventBaseTabV;
        }
        String str9 = str5;
        if ((i2 & 32) != 0) {
            i = constantExternal.friendMessageId;
        }
        return constantExternal.copy(str, str6, str7, str8, str9, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatEventKeyNumber() {
        return this.statEventKeyNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatEventKeyTime() {
        return this.statEventKeyTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatEventBaseTabT() {
        return this.statEventBaseTabT;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatEventMineKeyTp() {
        return this.statEventMineKeyTp;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatEventBaseTabV() {
        return this.statEventBaseTabV;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getFriendMessageId() {
        return this.friendMessageId;
    }

    @NotNull
    public final ConstantExternal copy(@NotNull String statEventKeyNumber, @NotNull String statEventKeyTime, @NotNull String statEventBaseTabT, @NotNull String statEventMineKeyTp, @NotNull String statEventBaseTabV, int friendMessageId) {
        return new ConstantExternal(statEventKeyNumber, statEventKeyTime, statEventBaseTabT, statEventMineKeyTp, statEventBaseTabV, friendMessageId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConstantExternal)) {
            return false;
        }
        ConstantExternal constantExternal = (ConstantExternal) other;
        return Intrinsics.areEqual(this.statEventKeyNumber, constantExternal.statEventKeyNumber) && Intrinsics.areEqual(this.statEventKeyTime, constantExternal.statEventKeyTime) && Intrinsics.areEqual(this.statEventBaseTabT, constantExternal.statEventBaseTabT) && Intrinsics.areEqual(this.statEventMineKeyTp, constantExternal.statEventMineKeyTp) && Intrinsics.areEqual(this.statEventBaseTabV, constantExternal.statEventBaseTabV) && this.friendMessageId == constantExternal.friendMessageId;
    }

    public final int getFriendMessageId() {
        return this.friendMessageId;
    }

    @NotNull
    public final String getStatEventBaseTabT() {
        return this.statEventBaseTabT;
    }

    @NotNull
    public final String getStatEventBaseTabV() {
        return this.statEventBaseTabV;
    }

    @NotNull
    public final String getStatEventKeyNumber() {
        return this.statEventKeyNumber;
    }

    @NotNull
    public final String getStatEventKeyTime() {
        return this.statEventKeyTime;
    }

    @NotNull
    public final String getStatEventMineKeyTp() {
        return this.statEventMineKeyTp;
    }

    public int hashCode() {
        String str = this.statEventKeyNumber;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.statEventKeyTime;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.statEventBaseTabT;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.statEventMineKeyTp;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.statEventBaseTabV;
        return ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.friendMessageId;
    }

    @NotNull
    public String toString() {
        return "ConstantExternal(statEventKeyNumber=" + this.statEventKeyNumber + ", statEventKeyTime=" + this.statEventKeyTime + ", statEventBaseTabT=" + this.statEventBaseTabT + ", statEventMineKeyTp=" + this.statEventMineKeyTp + ", statEventBaseTabV=" + this.statEventBaseTabV + ", friendMessageId=" + this.friendMessageId + ")";
    }
}
