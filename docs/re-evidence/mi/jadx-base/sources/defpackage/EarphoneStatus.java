package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: y8, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\r"}, d2 = {"Ly8;", "", "", "toString", "", "hashCode", "other", "", "equals", "leftInCase", "rightInCase", "<init>", "(ZZ)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class EarphoneStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public boolean leftInCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public boolean rightInCase;

    /* JADX WARN: Illegal instructions before constructor call */
    public EarphoneStatus() {
        boolean z = false;
        this(z, z, 3, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EarphoneStatus)) {
            return false;
        }
        EarphoneStatus earphoneStatus = (EarphoneStatus) other;
        return this.leftInCase == earphoneStatus.leftInCase && this.rightInCase == earphoneStatus.rightInCase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public int hashCode() {
        boolean z = this.leftInCase;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.rightInCase;
        return i + (z2 ? 1 : z2);
    }

    @NotNull
    public String toString() {
        return "EarphoneStatus(leftInCase=" + this.leftInCase + ", rightInCase=" + this.rightInCase + ')';
    }

    public EarphoneStatus(boolean z, boolean z2) {
        this.leftInCase = z;
        this.rightInCase = z2;
    }

    public /* synthetic */ EarphoneStatus(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
