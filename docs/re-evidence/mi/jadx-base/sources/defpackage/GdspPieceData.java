package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ec, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lec;", "", "", "toString", "", "hashCode", "other", "", "equals", "isFinish", "Z", PluginDeviceInfo.FICONON, "()Z", "", "data", "[B", PluginDeviceInfo.FDESC, "()[B", "Lmb;", "code", "Lmb;", PluginDeviceInfo.FMODEL, "()Lmb;", "<init>", "(Z[BLmb;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class GdspPieceData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final boolean isFinish;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @Nullable
    public final byte[] data;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final mb code;

    public GdspPieceData(boolean z, @Nullable byte[] bArr, @NotNull mb code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.isFinish = z;
        this.data = bArr;
        this.code = code;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final mb getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsFinish() {
        return this.isFinish;
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

    @NotNull
    public String toString() {
        return "GdspPieceData(isFinish=" + this.isFinish + ", data=" + Arrays.toString(this.data) + ", code=" + this.code + ')';
    }
}
