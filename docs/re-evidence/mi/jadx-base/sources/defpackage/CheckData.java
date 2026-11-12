package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: p4, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0011\u0010\u0012B\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lp4;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "data", "[B", "getData", "()[B", PluginDeviceInfo.FMODEL, "([B)V", "result", "<init>", "(Z[B)V", "(Z)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class CheckData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final boolean result;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @Nullable
    public byte[] data;

    public CheckData(boolean z, @Nullable byte[] bArr) {
        this.result = z;
        this.data = bArr;
    }

    public final void a(@Nullable byte[] bArr) {
        this.data = bArr;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckData)) {
            return false;
        }
        CheckData checkData = (CheckData) other;
        return this.result == checkData.result && Intrinsics.areEqual(this.data, checkData.data);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.result;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        byte[] bArr = this.data;
        return i + (bArr == null ? 0 : Arrays.hashCode(bArr));
    }

    @NotNull
    public String toString() {
        return "CheckData(result=" + this.result + ", data=" + Arrays.toString(this.data) + ')';
    }

    public CheckData(boolean z) {
        this(z, null);
    }
}
