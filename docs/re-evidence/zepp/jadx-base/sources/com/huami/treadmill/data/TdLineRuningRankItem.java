package com.huami.treadmill.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b0\u00101J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\t\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003JT\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR$\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\"\u001a\u0004\b#\u0010\b\"\u0004\b$\u0010%R\"\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/huami/treadmill/data/TdLineRuningRankItem;", "", "", "component1", "component2", "component3", "", "component4", "()Ljava/lang/Float;", "component5", "", "component6", "rankUserId", "rankName", "rankAvatar", "rankSpeed", "rankDistance", "rankIsMe", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;FZ)Lcom/huami/treadmill/data/TdLineRuningRankItem;", "toString", "", "hashCode", "other", "equals", "Ljava/lang/String;", "getRankUserId", "()Ljava/lang/String;", "setRankUserId", "(Ljava/lang/String;)V", "getRankName", "setRankName", "getRankAvatar", "setRankAvatar", "Ljava/lang/Float;", "getRankSpeed", "setRankSpeed", "(Ljava/lang/Float;)V", "F", "getRankDistance", "()F", "setRankDistance", "(F)V", "Z", "getRankIsMe", "()Z", "setRankIsMe", "(Z)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;FZ)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TdLineRuningRankItem {

    @Nullable
    private String rankAvatar;
    private float rankDistance;
    private boolean rankIsMe;

    @Nullable
    private String rankName;

    @Nullable
    private Float rankSpeed;

    @Nullable
    private String rankUserId;

    public TdLineRuningRankItem() {
        this(null, null, null, null, 0.0f, false, 63, null);
    }

    public TdLineRuningRankItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Float f, float f2, boolean z) {
        this.rankUserId = str;
        this.rankName = str2;
        this.rankAvatar = str3;
        this.rankSpeed = f;
        this.rankDistance = f2;
        this.rankIsMe = z;
    }

    public static /* synthetic */ TdLineRuningRankItem copy$default(TdLineRuningRankItem tdLineRuningRankItem, String str, String str2, String str3, Float f, float f2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tdLineRuningRankItem.rankUserId;
        }
        if ((i & 2) != 0) {
            str2 = tdLineRuningRankItem.rankName;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = tdLineRuningRankItem.rankAvatar;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            f = tdLineRuningRankItem.rankSpeed;
        }
        Float f3 = f;
        if ((i & 16) != 0) {
            f2 = tdLineRuningRankItem.rankDistance;
        }
        float f4 = f2;
        if ((i & 32) != 0) {
            z = tdLineRuningRankItem.rankIsMe;
        }
        return tdLineRuningRankItem.copy(str, str4, str5, f3, f4, z);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRankUserId() {
        return this.rankUserId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRankName() {
        return this.rankName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRankAvatar() {
        return this.rankAvatar;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Float getRankSpeed() {
        return this.rankSpeed;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getRankDistance() {
        return this.rankDistance;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getRankIsMe() {
        return this.rankIsMe;
    }

    @NotNull
    public final TdLineRuningRankItem copy(@Nullable String rankUserId, @Nullable String rankName, @Nullable String rankAvatar, @Nullable Float rankSpeed, float rankDistance, boolean rankIsMe) {
        return new TdLineRuningRankItem(rankUserId, rankName, rankAvatar, rankSpeed, rankDistance, rankIsMe);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TdLineRuningRankItem)) {
            return false;
        }
        TdLineRuningRankItem tdLineRuningRankItem = (TdLineRuningRankItem) other;
        return Intrinsics.areEqual(this.rankUserId, tdLineRuningRankItem.rankUserId) && Intrinsics.areEqual(this.rankName, tdLineRuningRankItem.rankName) && Intrinsics.areEqual(this.rankAvatar, tdLineRuningRankItem.rankAvatar) && Intrinsics.areEqual((Object) this.rankSpeed, (Object) tdLineRuningRankItem.rankSpeed) && Intrinsics.areEqual((Object) Float.valueOf(this.rankDistance), (Object) Float.valueOf(tdLineRuningRankItem.rankDistance)) && this.rankIsMe == tdLineRuningRankItem.rankIsMe;
    }

    @Nullable
    public final String getRankAvatar() {
        return this.rankAvatar;
    }

    public final float getRankDistance() {
        return this.rankDistance;
    }

    public final boolean getRankIsMe() {
        return this.rankIsMe;
    }

    @Nullable
    public final String getRankName() {
        return this.rankName;
    }

    @Nullable
    public final Float getRankSpeed() {
        return this.rankSpeed;
    }

    @Nullable
    public final String getRankUserId() {
        return this.rankUserId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public int hashCode() {
        String str = this.rankUserId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rankName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rankAvatar;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f = this.rankSpeed;
        int iHashCode4 = (((iHashCode3 + (f != null ? f.hashCode() : 0)) * 31) + Float.floatToIntBits(this.rankDistance)) * 31;
        boolean z = this.rankIsMe;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode4 + r1;
    }

    public final void setRankAvatar(@Nullable String str) {
        this.rankAvatar = str;
    }

    public final void setRankDistance(float f) {
        this.rankDistance = f;
    }

    public final void setRankIsMe(boolean z) {
        this.rankIsMe = z;
    }

    public final void setRankName(@Nullable String str) {
        this.rankName = str;
    }

    public final void setRankSpeed(@Nullable Float f) {
        this.rankSpeed = f;
    }

    public final void setRankUserId(@Nullable String str) {
        this.rankUserId = str;
    }

    @NotNull
    public String toString() {
        return "TdLineRuningRankItem(rankUserId=" + ((Object) this.rankUserId) + ", rankName=" + ((Object) this.rankName) + ", rankAvatar=" + ((Object) this.rankAvatar) + ", rankSpeed=" + this.rankSpeed + ", rankDistance=" + this.rankDistance + ", rankIsMe=" + this.rankIsMe + ')';
    }

    public /* synthetic */ TdLineRuningRankItem(String str, String str2, String str3, Float f, float f2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) == 0 ? str3 : null, (i & 8) != 0 ? Float.valueOf(0.0f) : f, (i & 16) != 0 ? 0.0f : f2, (i & 32) != 0 ? false : z);
    }
}
