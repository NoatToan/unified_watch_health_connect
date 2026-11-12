package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ts, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u000e"}, d2 = {"Lts;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lgg;", "role", "sn", "<init>", "(Lgg;Ljava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class SnInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @NotNull
    public final gg role;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @NotNull
    public final String sn;

    public SnInfo(@NotNull gg role, @NotNull String sn) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(sn, "sn");
        this.role = role;
        this.sn = sn;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SnInfo)) {
            return false;
        }
        SnInfo snInfo = (SnInfo) other;
        return Intrinsics.areEqual(this.role, snInfo.role) && Intrinsics.areEqual(this.sn, snInfo.sn);
    }

    public int hashCode() {
        return (this.role.hashCode() * 31) + this.sn.hashCode();
    }

    @NotNull
    public String toString() {
        return "SnInfo(role=" + this.role + ", sn=" + this.sn + ')';
    }
}
