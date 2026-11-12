package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: u, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u000e"}, d2 = {"Lu;", "", "", "toString", "", "hashCode", "other", "", "equals", "alertType", "id", "enabled", "<init>", "(ILjava/lang/String;Z)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class AlertItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int alertType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final boolean enabled;

    public AlertItem(int i, @NotNull String id, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.alertType = i;
        this.id = id;
        this.enabled = z;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlertItem)) {
            return false;
        }
        AlertItem alertItem = (AlertItem) other;
        return this.alertType == alertItem.alertType && Intrinsics.areEqual(this.id, alertItem.id) && this.enabled == alertItem.enabled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.alertType) * 31) + this.id.hashCode()) * 31;
        boolean z = this.enabled;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public String toString() {
        return "AlertItem(alertType=" + this.alertType + ", id=" + this.id + ", enabled=" + this.enabled + ')';
    }
}
