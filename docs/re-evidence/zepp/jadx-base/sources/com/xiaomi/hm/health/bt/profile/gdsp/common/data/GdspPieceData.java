package com.xiaomi.hm.health.bt.profile.gdsp.common.data;

import com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPErrorCode;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J)\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\b\u0010\u0014R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/data/GdspPieceData;", "", "", "component1", "", "component2", "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPErrorCode;", "component3", "isFinish", "data", "code", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Z", "()Z", "b", "[B", "getData", "()[B", "c", "Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPErrorCode;", "getCode", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPErrorCode;", "<init>", "(Z[BLcom/xiaomi/hm/health/bt/profile/gdsp/base/GDSPErrorCode;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class GdspPieceData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean isFinish;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final byte[] data;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final GDSPErrorCode code;

    public GdspPieceData(boolean z, @Nullable byte[] bArr, @NotNull GDSPErrorCode gDSPErrorCode) {
        this.isFinish = z;
        this.data = bArr;
        this.code = gDSPErrorCode;
    }

    public static /* synthetic */ GdspPieceData copy$default(GdspPieceData gdspPieceData, boolean z, byte[] bArr, GDSPErrorCode gDSPErrorCode, int i, Object obj) {
        if ((i & 1) != 0) {
            z = gdspPieceData.isFinish;
        }
        if ((i & 2) != 0) {
            bArr = gdspPieceData.data;
        }
        if ((i & 4) != 0) {
            gDSPErrorCode = gdspPieceData.code;
        }
        return gdspPieceData.copy(z, bArr, gDSPErrorCode);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsFinish() {
        return this.isFinish;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final GDSPErrorCode getCode() {
        return this.code;
    }

    @NotNull
    public final GdspPieceData copy(boolean isFinish, @Nullable byte[] data, @NotNull GDSPErrorCode code) {
        return new GdspPieceData(isFinish, data, code);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GdspPieceData)) {
            return false;
        }
        GdspPieceData gdspPieceData = (GdspPieceData) other;
        return this.isFinish == gdspPieceData.isFinish && Intrinsics.areEqual(this.data, gdspPieceData.data) && this.code == gdspPieceData.code;
    }

    @NotNull
    public final GDSPErrorCode getCode() {
        return this.code;
    }

    @Nullable
    public final byte[] getData() {
        return this.data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.isFinish;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        byte[] bArr = this.data;
        return ((i + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31) + this.code.hashCode();
    }

    public final boolean isFinish() {
        return this.isFinish;
    }

    @NotNull
    public String toString() {
        return "GdspPieceData(isFinish=" + this.isFinish + ", data=" + Arrays.toString(this.data) + ", code=" + this.code + ')';
    }

    public /* synthetic */ GdspPieceData(boolean z, byte[] bArr, GDSPErrorCode gDSPErrorCode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, bArr, gDSPErrorCode);
    }
}
