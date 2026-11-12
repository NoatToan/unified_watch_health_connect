package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lu2;", "", "", "toString", "", "hashCode", "other", "", "equals", "opResult", "Z", PluginDeviceInfo.FDESC, "()Z", "", "data", "[B", PluginDeviceInfo.FMODEL, "()[B", "<init>", "(Z[B)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final byte[] f35300b;

    public u2(boolean z, @Nullable byte[] bArr) {
        this.f35299a = z;
        this.f35300b = bArr;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final byte[] getF35300b() {
        return this.f35300b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF35299a() {
        return this.f35299a;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof u2)) {
            return false;
        }
        u2 u2Var = (u2) other;
        return this.f35299a == u2Var.f35299a && Intrinsics.areEqual(this.f35300b, u2Var.f35300b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.f35299a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        byte[] bArr = this.f35300b;
        return i + (bArr == null ? 0 : Arrays.hashCode(bArr));
    }

    @NotNull
    public String toString() {
        return "[opResult: " + this.f35299a + ", data: " + tet.x(this.f35300b) + AbstractJsonLexerKt.END_LIST;
    }

    public /* synthetic */ u2(boolean z, byte[] bArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : bArr);
    }
}
