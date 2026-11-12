package defpackage;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u000e"}, d2 = {"Lv2;", "", "", "toString", "", "hashCode", "other", "", "equals", "opResult", "", "data", "<init>", "(Z[B)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final byte[] f36399b;

    public v2(boolean z, @Nullable byte[] bArr) {
        this.f36398a = z;
        this.f36399b = bArr;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) other;
        return this.f36398a == v2Var.f36398a && Intrinsics.areEqual(this.f36399b, v2Var.f36399b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.f36398a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        byte[] bArr = this.f36399b;
        return i + (bArr == null ? 0 : Arrays.hashCode(bArr));
    }

    @NotNull
    public String toString() {
        return "[opResult: " + this.f36398a + ", data: " + tet.x(this.f36399b) + AbstractJsonLexerKt.END_LIST;
    }

    public /* synthetic */ v2(boolean z, byte[] bArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : bArr);
    }
}
