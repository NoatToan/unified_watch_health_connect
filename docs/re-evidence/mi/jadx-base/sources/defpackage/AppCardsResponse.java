package defpackage;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: z, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated(message = "不再向后兼容")
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u000e"}, d2 = {"Lz;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lp3;", "type", "isEnable", "<init>", "(Lp3;Z)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class AppCardsResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @NotNull
    public final p3 type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final boolean isEnable;

    public AppCardsResponse(@NotNull p3 type, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.isEnable = z;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppCardsResponse)) {
            return false;
        }
        AppCardsResponse appCardsResponse = (AppCardsResponse) other;
        return this.type == appCardsResponse.type && this.isEnable == appCardsResponse.isEnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        boolean z = this.isEnable;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public String toString() {
        return "AppCardsResponse(type=" + this.type + ", isEnable=" + this.isEnable + ") \n";
    }
}
